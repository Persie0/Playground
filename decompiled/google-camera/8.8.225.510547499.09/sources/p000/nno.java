package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nno {

    /* JADX INFO: renamed from: a */
    static final nno f43948a = new nno();

    /* JADX INFO: renamed from: b */
    final Runnable f43949b;

    /* JADX INFO: renamed from: c */
    final Executor f43950c;
    nno next;

    public nno() {
        this.f43949b = null;
        this.f43950c = null;
    }

    public nno(Runnable runnable, Executor executor) {
        this.f43949b = runnable;
        this.f43950c = executor;
    }
}
