package org.sopt.service;

import org.sopt.model.Department;

public interface DepartmentService {
    Department getDepartmentByDepartmentNo(final Long departmentNo);
}
