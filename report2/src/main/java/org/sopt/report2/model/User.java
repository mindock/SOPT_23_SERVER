package org.sopt.report2.model;

public class User {
    private int user_idx;
    private String name;
    private String part;

    public int getUser_idx() {
        return user_idx;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }

    public void update(User user) {
        this.name = user.name;
        this.part = user.part;
    }
}
