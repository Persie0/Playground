package androidx.concurrent.futures;

import p000.AbstractC3632u1;

/* JADX INFO: renamed from: androidx.concurrent.futures.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0463a {

    /* JADX INFO: renamed from: a */
    public final Throwable f5327a;

    static {
        new C0463a(new AbstractResolvableFuture$Failure$1("Failure occurred while trying to finish a future."));
    }

    public C0463a(Throwable th) {
        boolean z = AbstractC3632u1.f63225d;
        th.getClass();
        this.f5327a = th;
    }
}
