package org.example.advice.application.service;

import org.example.advice.application.domain.Advice;
import org.example.common.ID;

public class TypeCalculateService {

    public String typeCalculate(Advice advice) {

        if (advice.getId().equals(new ID<>("487519c6-c19d-4ecb-bf1c-ddb708792e15")))
            return "1";

        if (advice.getId().equals(new ID<>("876f99eb-ba26-4462-a93b-258932346eca")))
            return "2";

        return "NaN";
    }
}
