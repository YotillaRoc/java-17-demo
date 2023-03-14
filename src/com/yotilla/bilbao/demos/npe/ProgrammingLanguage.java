package com.yotilla.bilbao.demos.npe;

public enum ProgrammingLanguage {
    JAVA(1995),
    JS(1995),
    TINML(2007),
    SQL(1979);


    private final Integer firstRelease;

    ProgrammingLanguage(final Integer firstRelease) {
        this.firstRelease = firstRelease;
    }

    public Integer getFirstRelease() {
        return firstRelease;
    }
}
