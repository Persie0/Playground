package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    /* JADX INFO: renamed from: a */
    public abstract TokenResult mo9211a();

    /* JADX INFO: renamed from: b */
    public abstract String mo9212b();

    /* JADX INFO: renamed from: c */
    public abstract String mo9213c();

    /* JADX INFO: renamed from: d */
    public abstract ResponseCode mo9214d();

    /* JADX INFO: renamed from: e */
    public abstract String mo9215e();
}
