package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* JADX INFO: renamed from: a */
    public abstract ResponseCode mo9216a();

    /* JADX INFO: renamed from: b */
    public abstract String mo9217b();

    /* JADX INFO: renamed from: c */
    public abstract long mo9218c();
}
