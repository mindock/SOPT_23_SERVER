package org.sopt.report3.api;

import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;
import org.sopt.report3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public DefaultRes<List<User>> getUserList(@RequestParam(name = "name", required = false) String name,
                                              @RequestParam(name = "part", required = false) String part) {
        // 모든 회원 데이터 반환
        if(name == null && part == null) {
            return userService.findAll();
        }
        // 해당 이름 회원 데이터 반환
        if(part == null) {
            return userService.findByName(name);
        }
        // 해당 파트 회원 데이터 반환
        if(name == null) {
            return userService.findByPart(part);
        }
        // 해당 이름과 파트 회원 데이터 반환
        return userService.findByNameAndPart(name, part);
    }

    @GetMapping("/{user_idx}")
    public DefaultRes<User> getUserFromIdx(@PathVariable int user_idx) {
        return userService.findByUserIdx(user_idx);
    }

    @PostMapping("")
    public DefaultRes addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{userIdx}")
    public DefaultRes updateUser(@PathVariable int userIdx, @RequestBody User inputUser) {
        return userService.update(userIdx, inputUser);
    }

    @DeleteMapping("/{userIdx}")
    public DefaultRes deleteUser(@PathVariable int userIdx) {
        return userService.deleteByUserIdx(userIdx);
    }
}