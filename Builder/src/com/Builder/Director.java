package com.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void Construct() {
        builder.AddTitle();
        builder.AddIntroduction();
        builder.AddMainPart();
        builder.AddConclusion();
    }
}
