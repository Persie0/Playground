package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: xn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1125xn {

    /* JADX INFO: renamed from: a */
    static final C1125xn f48019a = new C1125xn(null, null);

    /* JADX INFO: renamed from: b */
    final Runnable f48020b;

    /* JADX INFO: renamed from: c */
    final Executor f48021c;
    C1125xn next;

    public C1125xn(Runnable runnable, Executor executor) {
        this.f48020b = runnable;
        this.f48021c = executor;
    }
}
