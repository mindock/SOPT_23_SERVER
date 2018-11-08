package org.sopt.report3.service;

import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;

import java.util.List;

public interface UserService {
    //전체 User 조회
    DefaultRes<List<User>> findAll();
    //name으로 User 조회
    DefaultRes<List<User>> findByName(final String name);
    //part로 User 조회
    DefaultRes<List<User>> findByPart(final String part);
    //name과 part로 User 조회
    DefaultRes<List<User>> findByNameAndPart(final String name, final String part);
    //userIdx로 User 조회
    DefaultRes<User> findByUserIdx(final int userIdx);
    //User 저장
    DefaultRes save(final User user);
    //User 수정
    DefaultRes<User> update(final int userIdx, final User user);
    //userIdx로 User 삭제
    DefaultRes deleteByUserIdx(final int userIdx);
}
