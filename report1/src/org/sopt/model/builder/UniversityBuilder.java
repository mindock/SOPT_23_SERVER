package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {

    private Long universityNo;
    private String name;
    private String phoneNo;
    private String address;

    public UniversityBuilder setUniversityNo(Long universityNo) {
        this.universityNo = universityNo;
        return this;
    }

    public UniversityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public UniversityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public University build() {
        return new University(this.universityNo, this.name, this.phoneNo, this.address);
    }
}
