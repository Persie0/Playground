package com.iterable.iterableapi;

/* JADX INFO: loaded from: classes2.dex */
public enum IterableAPIMobileFrameworkType {
    FLUTTER("flutter"),
    REACT_NATIVE("reactnative"),
    NATIVE("native");

    private final String value;

    IterableAPIMobileFrameworkType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
