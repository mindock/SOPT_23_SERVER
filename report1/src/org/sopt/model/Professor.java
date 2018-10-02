package org.sopt.model;

public class Professor extends Department {

    private Long professorNo;
    private String professorName;
    private String professorPhoneNo;
    private String professorSubject;

    public Professor() {}

    public Professor(Long professorNo, String professorName, String professorPhoneNo, String professorSubject) {
        this.professorNo = professorNo;
        this.professorName = professorName;
        this.professorPhoneNo = professorPhoneNo;
        this.professorSubject = professorSubject;
    }

    public Professor(Long departmentNo, String departmentName, String departmentPhoneNo, String departmentType,
            Long professorNo, String professorName, String professorPhoneNo, String professorSubject) {
        super(departmentNo, departmentName, departmentPhoneNo, departmentType);
        this.professorNo = professorNo;
        this.professorName = professorName;
        this.professorPhoneNo = professorPhoneNo;
        this.professorSubject = professorSubject;
    }

    public Long getProfessorNo() {
        return professorNo;
    }

    public void setProfessorNo(Long professorNo) {
        this.professorNo = professorNo;
    }

    public String getUniversityName() {
        return professorName;
    }

    public void setUniversityName(String universityName) {
        this.professorName = universityName;
    }

    public String getUniversityPhoneNo() {
        return professorPhoneNo;
    }

    public void setUniversityPhoneNo(String universityPhoneNo) {
        this.professorPhoneNo = universityPhoneNo;
    }

    public String getProfessorSubject() {
        return professorSubject;
    }

    public void setProfessorSubject(String professorSubject) {
        this.professorSubject = professorSubject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorNo=" + professorNo +
                ", professorName='" + professorName + '\'' +
                ", professorPhoneNo='" + professorPhoneNo + '\'' +
                ", professorSubject='" + professorSubject + '\'' +
                "} " + super.toString();
    }
}
