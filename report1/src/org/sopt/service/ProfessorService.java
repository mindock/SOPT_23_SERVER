package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getProfessorByProfessorNo(final Long professorNo);
}
