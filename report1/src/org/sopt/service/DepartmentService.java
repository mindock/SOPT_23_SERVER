package org.sopt.service;

import org.sopt.model.Department;

public interface DepartmentService {
    Department getDepartmentByName(final String departmentName);
}
