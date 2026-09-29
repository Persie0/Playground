package com.kochava.tracker.payload.internal;

/* JADX INFO: loaded from: classes.dex */
public enum PayloadMethod {
    Post("post"),
    Get("get");

    public final String key;

    PayloadMethod(String str) {
        this.key = str;
    }

    public static PayloadMethod fromKey(String str) {
        for (PayloadMethod payloadMethod : values()) {
            if (payloadMethod.key.equals(str)) {
                return payloadMethod;
            }
        }
        return Post;
    }
}
