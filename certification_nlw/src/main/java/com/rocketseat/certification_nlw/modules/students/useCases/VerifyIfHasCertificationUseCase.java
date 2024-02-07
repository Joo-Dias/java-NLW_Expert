package com.rocketseat.certification_nlw.modules.students.useCases;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired
    CertificationStudentRepository repository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.repository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if(!result.isEmpty()){
            return true;
        }
        return false;
    }
}
