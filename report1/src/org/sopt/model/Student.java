package org.sopt.model;

public class Student extends Department {

    private Long studentNo;
    private String studentName;
    private int studentGrade;
    private String studentEmail;
    private String studentAddress;
    private int studentAge;
    private String studentStatus;

    public Student() {}

    public Student(Long studentNo, String studentName, int studentGrade, String studentEmail, String studentAddress, int studentAge, String studentStatus) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentStatus = studentStatus;
    }

    public Student(Long departmentNo, String departmentName, String departmentPhoneNo, String departmentType,
            Long studentNo, String studentName, int studentGrade, String studentEmail, String studentAddress, int studentAge, String studentStatus) {
        super(departmentNo, departmentName, departmentPhoneNo, departmentType);
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentStatus = studentStatus;
    }

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public String getUniversityName() {
        return studentName;
    }

    public void setUniversityName(String universityName) {
        this.studentName = universityName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getUniversityAddress() {
        return studentAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.studentAddress = universityAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentAge=" + studentAge +
                ", studentStatus='" + studentStatus + '\'' +
                "} " + super.toString();
    }
}
