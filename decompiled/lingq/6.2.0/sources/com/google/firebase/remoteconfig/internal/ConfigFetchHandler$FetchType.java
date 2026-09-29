package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes.dex */
public enum ConfigFetchHandler$FetchType {
    BASE("BASE"),
    REALTIME("REALTIME");

    private final String value;

    ConfigFetchHandler$FetchType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
