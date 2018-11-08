package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private static final String NOT_EXISTED = "없습니다";
    private static final List<User> userList = new LinkedList<>();

    @GetMapping("/")
    public Date getNowDate() {
        return new Date();
    }

    @GetMapping("/users")
    public Object getUserList(@RequestParam(name = "name", required = false) String name,
                              @RequestParam(name = "part", required = false) String part) {
        if(name == null && part == null) {
            return userList;
        }
        if(part == null) {
            List<User> nameUsers = userList.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
            if(nameUsers.size() > 0)
                return nameUsers;
            return NOT_EXISTED;
        }
        if(name == null) {
            List<User> partUsers = userList.stream().filter(user -> user.getPart().equals(part)).collect(Collectors.toList());
            if (partUsers.size() > 0)
                return partUsers;
            return NOT_EXISTED;
        }
        List<User> nameAndPartUsers = userList.stream().filter(user -> user.getName().equals(name) && user.getPart().equals(part)).collect(Collectors.toList());
        if(nameAndPartUsers.size() > 0)
            return nameAndPartUsers;
        return NOT_EXISTED;
    }

    @GetMapping("/users/{user_idx}")
    public Object getUserFromIdx(@PathVariable int user_idx) {
        List<User> idxUser = userList.stream().filter(user -> user.getUser_idx() == user_idx).collect(Collectors.toList());
        if(idxUser.size() > 0)
            return idxUser.get(0);
        return NOT_EXISTED;
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userList.add(user);
    }

    @PutMapping("/users/{user_idx}")
    public void updateUser(@PathVariable int user_idx, @RequestBody User inputUser) {
        List<User> idxUser = userList.stream().filter(user -> user.getUser_idx() == user_idx).collect(Collectors.toList());
        idxUser.get(0).update(inputUser);
    }

    @DeleteMapping("/users/{user_idx}")
   public void deleteUser(@PathVariable int user_idx) {
        userList.removeIf(user -> user.getUser_idx() == user_idx);
    }
}