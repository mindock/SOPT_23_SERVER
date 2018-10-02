package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.University;

public class DepartmentBuilder {

    private Long departmentNo;
    private String name;
    private String phoneNo;
    private String type;
    private University university;

    public DepartmentBuilder setDepartmentNo(Long departmentNo) {
        this.departmentNo = departmentNo;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public DepartmentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public DepartmentBuilder setUniversity(University university) {
        this.university = university;
        return this;
    }

    public Department build() {
        return new Department(this.departmentNo, this.name, this.phoneNo, this.type, this.university);
    }
}
