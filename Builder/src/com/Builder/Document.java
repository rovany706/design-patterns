package com.Builder;

import java.util.ArrayList;

public class Document {
    public ArrayList<DocumentElement> Elements;

    public Document() {
        Elements = new ArrayList<>();
    }

    public void Add(DocumentElement newElement) {
        Elements.add(newElement);
    }
}
