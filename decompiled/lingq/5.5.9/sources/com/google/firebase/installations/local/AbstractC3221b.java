package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;

/* JADX INFO: renamed from: com.google.firebase.installations.local.b */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC3221b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f16283a = 0;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.b$a */
    @AutoValue.Builder
    public static abstract class a {
    }

    static {
        C3220a.a aVar = new C3220a.a();
        aVar.f16281f = 0L;
        aVar.m9210b(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        aVar.f16280e = 0L;
        aVar.m9209a();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo9201a();

    /* JADX INFO: renamed from: b */
    public abstract long mo9202b();

    /* JADX INFO: renamed from: c */
    public abstract String mo9203c();

    /* JADX INFO: renamed from: d */
    public abstract String mo9204d();

    /* JADX INFO: renamed from: e */
    public abstract String mo9205e();

    /* JADX INFO: renamed from: f */
    public abstract PersistedInstallation.RegistrationStatus mo9206f();

    /* JADX INFO: renamed from: g */
    public abstract long mo9207g();
}
