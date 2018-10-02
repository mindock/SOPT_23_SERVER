package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Student;

public class StudentBuilder {

    private Long studentNo;
    private String name;
    private int grade;
    private Department department;
    private String email;
    private String address;
    private int age;
    private String status;

    public StudentBuilder setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setDepartment(Department department) {
        this.department = department;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Student build() {
        return new Student(this.studentNo, this.name, this.grade, this.department, this.email, this.address, this.age, this.status);
    }
}
