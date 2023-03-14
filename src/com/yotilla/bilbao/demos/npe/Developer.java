package com.yotilla.bilbao.demos.npe;

import java.util.random.RandomGenerator;

public class Developer {
    final ProgrammingLanguage favoriteLanguage;

    public Developer(final ProgrammingLanguage programmingLanguage) {
        this.favoriteLanguage = programmingLanguage;
    }

    public ProgrammingLanguage getFavoriteLanguage() {
        return favoriteLanguage;
    }
}
