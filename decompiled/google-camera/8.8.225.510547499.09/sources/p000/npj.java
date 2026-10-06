package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npj implements Runnable {

    /* JADX INFO: renamed from: a */
    public Object f44024a;

    /* JADX INFO: renamed from: b */
    public Object f44025b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f44026c;

    public npj(nol nolVar, Executor executor, int i) {
        this.f44026c = i;
        nolVar.getClass();
        this.f44024a = nolVar;
        executor.getClass();
        this.f44025b = executor;
    }

    public npj(nps npsVar, Future future, int i) {
        this.f44026c = i;
        this.f44024a = npsVar;
        this.f44025b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44026c) {
            case 0:
                kxk.m14976V(this.f44024a, this.f44025b);
                break;
        }
        this.f44024a = null;
        this.f44025b = null;
    }
}
