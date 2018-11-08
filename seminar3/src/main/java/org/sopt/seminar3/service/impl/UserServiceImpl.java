package org.sopt.seminar3.service.impl;

import org.sopt.seminar3.model.DefaultRes;
import org.sopt.seminar3.model.User;
import org.sopt.seminar3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private static final List<User> userList = new LinkedList<>();
    @Override
    public DefaultRes<List<User>> findAll() {
        if(userList.isEmpty())
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "리스트가 비었습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "리스트 조회 성공", userList);
    }

    @Override
    public DefaultRes<User> findByUserIdx(int userIdx) {
        User idxUser = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList()).get(0);
        if(idxUser == null)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 조회 성공", idxUser);
    }

    @Override
    public DefaultRes save(User user) {
        userList.add(user);
        return DefaultRes.res(HttpStatus.CREATED.value(), "회원 저장 성공");
    }

    @Override
    public DefaultRes<User> update(int userIdx, User updateUser) {
        User idxUser = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList()).get(0);
        if(idxUser == null)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        idxUser.setName(updateUser.getName());
        idxUser.setEmail(updateUser.getEmail());
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 정보 수정 성공", idxUser);
    }

    @Override
    public DefaultRes deleteByUserIdx(int userIdx) {
        User idxUser = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList()).get(0);
        if(idxUser == null)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        userList.remove(idxUser);
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 삭제 성공");
    }
}
