package com.iterable.iterableapi;

/* JADX INFO: loaded from: classes.dex */
public enum IterableDataRegion {
    US("https://api.iterable.com/api/"),
    EU("https://api.eu.iterable.com/api/");

    private final String endpoint;

    IterableDataRegion(String str) {
        this.endpoint = str;
    }

    public String getEndpoint() {
        return this.endpoint;
    }
}
