package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1111a {

    /* JADX INFO: renamed from: b */
    public static final C1111a f13518b = new C1111a(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a */
    public final Throwable f13519a;

    public C1111a(Throwable th) {
        th.getClass();
        this.f13519a = th;
    }
}
