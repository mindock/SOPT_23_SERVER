package org.sopt.report3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    private int userIdx;
    private String name;
    private String part;

    public User update(User updateUser) {
        this.name = updateUser.getName();
        this.part = updateUser.getPart();
        return this;
    }
}
