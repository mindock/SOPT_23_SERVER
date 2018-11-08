package org.sopt.report3.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;
import org.sopt.report3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
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
            log.info("[회원 조회] 모든 회원 정보 조회");
            return userService.findAll();
        }
        // 해당 이름 회원 데이터 반환
        if(part == null) {
            log.info("[회원 조회] 해당 이름({})의 회원 정보 조회", name);
            return userService.findByName(name);
        }
        // 해당 파트 회원 데이터 반환
        if(name == null) {
            log.info("[회원 조회] 해당 파트({})의 회원 정보 조회", part);
            return userService.findByPart(part);
        }
        // 해당 이름과 파트 회원 데이터 반환
        log.info("[회원 조회] 해당 이름({})과 파트({})의 회원 정보 조회", name, part);
        return userService.findByNameAndPart(name, part);
    }

    @GetMapping("/{user_idx}")
    public DefaultRes<User> getUserFromIdx(@PathVariable int user_idx) {
        log.info("[회원 조회] 해당 idx({})의 회원 정보 조회", user_idx);
        return userService.findByUserIdx(user_idx);
    }

    @PostMapping("")
    public DefaultRes addUser(@RequestBody User user) {
        log.info("[회원 추가] {} 회원 정보 저장", user.getUserIdx());
        return userService.save(user);
    }

    @PutMapping("/{userIdx}")
    public DefaultRes updateUser(@PathVariable int userIdx, @RequestBody User inputUser) {
        log.info("[회원 수정] {} 회원 정보 수정", userIdx);
        return userService.update(userIdx, inputUser);
    }

    @DeleteMapping("/{userIdx}")
    public DefaultRes deleteUser(@PathVariable int userIdx) {
        log.info("[회원 삭제] {} 회원 정보 삭제", userIdx);
        return userService.deleteByUserIdx(userIdx);
    }
}