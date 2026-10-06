package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lar {

    /* JADX INFO: renamed from: a */
    public lar f37848a;

    /* JADX INFO: renamed from: b */
    private final Executor f37849b;

    /* JADX INFO: renamed from: c */
    private final Runnable f37850c;

    /* JADX INFO: renamed from: d */
    private final lav f37851d;

    public lar(Executor executor, Runnable runnable) {
        this.f37849b = executor;
        this.f37850c = runnable;
        this.f37851d = null;
    }

    public lar(Executor executor, Runnable runnable, lav lavVar) {
        this.f37849b = executor;
        this.f37850c = runnable;
        this.f37851d = lavVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m15119a() {
        try {
            this.f37849b.execute(this.f37850c);
        } catch (Throwable th) {
            lav lavVar = this.f37851d;
            if (lavVar == null) {
                throw th;
            }
            lavVar.m15131m(kzy.m15111a(th));
        }
    }
}
