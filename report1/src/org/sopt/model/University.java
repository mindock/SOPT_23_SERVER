package org.sopt.model;

public class University {

    private Long universityNo;
    private String universityName;
    private String universityPhoneNo;
    private String universityAddress;

    public University() {}

    public University(Long universityNo, String universityName, String universityPhoneNo, String universityAddress) {
        this.universityNo = universityNo;
        this.universityName = universityName;
        this.universityPhoneNo = universityPhoneNo;
        this.universityAddress = universityAddress;
    }

    public Long getUniversityNo() {
        return universityNo;
    }

    public void setUniversityNo(Long universityNo) {
        this.universityNo = universityNo;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityPhoneNo() {
        return universityPhoneNo;
    }

    public void setUniversityPhoneNo(String universityPhoneNo) {
        this.universityPhoneNo = universityPhoneNo;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityNo=" + universityNo +
                ", universityName='" + universityName + '\'' +
                ", universityPhoneNo='" + universityPhoneNo + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                '}';
    }
}
