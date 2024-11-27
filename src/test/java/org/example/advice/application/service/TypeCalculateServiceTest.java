package org.example.advice.application.service;

import org.example.advice.application.domain.Advice;
import org.example.common.ID;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class TypeCalculateServiceTest {


    private TypeCalculateService MakeTypeCalculateService() {
        return new TypeCalculateService();
    }

    private Advice MakeAdviceWithString(String id) {
        return new Advice(new ID<>(id), "1");
    }

    private Advice MakeAdviceWithUUID(String id) {
        return new Advice(new ID<>(UUID.fromString(id)), "1");
    }

    @Test
    public void TypeCalculate_AdviceWithFirstID_Returns1() {
        TypeCalculateService service = MakeTypeCalculateService();
        Advice advice = MakeAdviceWithString("487519c6-c19d-4ecb-bf1c-ddb708792e15");
        String result = service.typeCalculate(advice);
        assertEquals("1", result);
    }

    @Test
    public void TypeCalculate_AdviceWithSecondID_Returns2() {
        TypeCalculateService service = MakeTypeCalculateService();
        Advice advice = MakeAdviceWithString("876f99eb-ba26-4462-a93b-258932346eca");
        String result = service.typeCalculate(advice);
        assertEquals("2", result);
    }

    //---------------------------------------------------------------------------

    @Test
    public void TypeCalculate_AdviceWithFirstUUID_Returns1() {
        TypeCalculateService service = MakeTypeCalculateService();
        Advice advice = MakeAdviceWithUUID("487519c6-c19d-4ecb-bf1c-ddb708792e15");
        String result = service.typeCalculate(advice);
        assertEquals("1", result);
    }

    @Test
    public void TypeCalculate_AdviceWithSecondUUID_Returns2() {
        TypeCalculateService service = MakeTypeCalculateService();
        Advice advice = MakeAdviceWithUUID("876f99eb-ba26-4462-a93b-258932346eca");
        String result = service.typeCalculate(advice);
        assertEquals("2", result);
    }
}