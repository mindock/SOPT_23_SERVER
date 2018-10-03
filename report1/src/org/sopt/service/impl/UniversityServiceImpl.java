package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {
    @Override
    public University getUniversityByUniversityName(String universityName) {
        return new UniversityBuilder()
                .setName(universityName)
                .build();
    }
}
