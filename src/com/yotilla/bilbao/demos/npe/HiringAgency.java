package com.yotilla.bilbao.demos.npe;

import java.util.random.RandomGenerator;

public class HiringAgency {

    private HiringAgency() {}

    public static Developer findApplicant() {
        final boolean foundAnApplicant = RandomGenerator.getDefault().nextBoolean();
        return foundAnApplicant ? new Developer(ProgrammingLanguage.JS) : null;
    }
}
