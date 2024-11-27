package org.example.advice.application.domain;

import org.example.common.ID;

public class Advice {

    ID id;

    String text;

    public Advice(ID id, String text) {
        this.id = id;
        this.text = text;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
