package com.rocketseat.certification_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswerDTO {

    private UUID questionId;
    private UUID alternativeId;
    private boolean isCorrect;
}
