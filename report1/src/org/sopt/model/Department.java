package org.sopt.model;

public class Department extends University {

    private Long departmentNo;
    private String departmentName;
    private String departmentPhoneNo;
    private String departmentType;

    public Department() {}

    public Department(Long departmentNo, String departmentName, String departmentPhoneNo, String departmentType) {
        this.departmentNo = departmentNo;
        this.departmentName = departmentName;
        this.departmentPhoneNo = departmentPhoneNo;
        this.departmentType = departmentType;
    }

    public Department(Long universityNo, String universityName, String universityPhoneNo, String universityAddress,
                      Long departmentNo, String departmentName, String departmentPhoneNo, String departmentType) {
        super(universityNo, universityName, universityPhoneNo, universityAddress);
        this.departmentNo = departmentNo;
        this.departmentName = departmentName;
        this.departmentPhoneNo = departmentPhoneNo;
        this.departmentType = departmentType;
    }

    public Long getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Long departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getUniversityName() {
        return departmentName;
    }

    public void setUniversityName(String universityName) {
        this.departmentName = universityName;
    }

    public String getUniversityPhoneNo() {
        return departmentPhoneNo;
    }

    public void setUniversityPhoneNo(String universityPhoneNo) {
        this.departmentPhoneNo = universityPhoneNo;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentNo=" + departmentNo +
                ", departmentName='" + departmentName + '\'' +
                ", departmentPhoneNo='" + departmentPhoneNo + '\'' +
                ", departmentType='" + departmentType + '\'' +
                "} " + super.toString();
    }
}
