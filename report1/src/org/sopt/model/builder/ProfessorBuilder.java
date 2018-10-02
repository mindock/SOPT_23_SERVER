package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Professor;

public class ProfessorBuilder {

    private Long professorNo;
    private String name;
    private String phoneNo;
    private String subject;

    public ProfessorBuilder setProfessorNo(Long professorNo) {
        this.professorNo = professorNo;
        return this;
    }

    public ProfessorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProfessorBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public ProfessorBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Professor build() {
        return new Professor(this.professorNo, this.name, this.phoneNo, this.subject);
    }
}
