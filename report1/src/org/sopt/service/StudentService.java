package org.sopt.service;

import org.sopt.model.Student;

public interface StudentService {
    Student getStudentByStudentNo(final Long studentNo);
}
