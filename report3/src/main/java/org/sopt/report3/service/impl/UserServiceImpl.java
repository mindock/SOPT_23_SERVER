package org.sopt.report3.service.impl;

import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;
import org.sopt.report3.service.UserService;
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
    public DefaultRes<List<User>> findByName(String name) {
        List<User> nameUsers = userList.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
        if(nameUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 name의 회원이 없습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "해당 name의 회원 조회 성공", nameUsers);
    }

    @Override
    public DefaultRes<List<User>> findByPart(String part) {
        List<User> partUsers = userList.stream().filter(user -> user.getPart().equals(part)).collect(Collectors.toList());
        if (partUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 part의 회원이 없습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "해당 part의 회원 조회 성공", partUsers);
    }

    @Override
    public DefaultRes<List<User>> findByNameAndPart(String name, String part) {
        List<User> nameAndPartUsers = userList.stream().filter(user -> user.getName().equals(name) && user.getPart().equals(part)).collect(Collectors.toList());
        if(nameAndPartUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 name과 part의 회원이 없습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "해당 name과 part의 회원 조회 성공", nameAndPartUsers);
    }

    @Override
    public DefaultRes<User> findByUserIdx(int userIdx) {
        List<User> idxUsers = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList());
        if(idxUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 조회 성공", idxUsers.get(0));
    }

    @Override
    public DefaultRes save(User user) {
        userList.add(user);
        return DefaultRes.res(HttpStatus.CREATED.value(), "회원 저장 성공");
    }

    @Override
    public DefaultRes<User> update(int userIdx, User updateUser) {
        List<User> idxUsers = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList());
        if(idxUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        User idxUser = idxUsers.get(0).update(updateUser);
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 정보 수정 성공", idxUser);
    }

    @Override
    public DefaultRes deleteByUserIdx(int userIdx) {
        List<User> idxUsers = userList.stream().filter(user -> user.getUserIdx() == userIdx).collect(Collectors.toList());
        if(idxUsers.size() <= 0)
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "해당 userIdx 회원이 없습니다.");
        userList.remove(idxUsers.get(0));
        return DefaultRes.res(HttpStatus.OK.value(), "해당 userIdx 회원 삭제 성공");
    }
}
