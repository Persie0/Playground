package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class noz extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: a */
    Executor f44010a;

    /* JADX INFO: renamed from: b */
    Runnable f44011b;

    /* JADX INFO: renamed from: c */
    Thread f44012c;

    /* JADX INFO: renamed from: d */
    ote f44013d;

    public noz(Executor executor, ote oteVar, byte[] bArr) {
        super(noy.NOT_RUN);
        this.f44010a = executor;
        this.f44013d = oteVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == noy.CANCELLED) {
            this.f44010a = null;
            this.f44013d = null;
            return;
        }
        this.f44012c = Thread.currentThread();
        try {
            ote oteVar = this.f44013d;
            oteVar.getClass();
            Object obj = oteVar.f46516a;
            if (((npa) obj).f44016a == this.f44012c) {
                this.f44013d = null;
                lku.m15613H(((npa) obj).f44017b == null);
                ((npa) obj).f44017b = runnable;
                Executor executor = this.f44010a;
                executor.getClass();
                ((npa) obj).f44018c = executor;
                this.f44010a = null;
            } else {
                Executor executor2 = this.f44010a;
                executor2.getClass();
                this.f44010a = null;
                this.f44011b = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f44012c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f44012c) {
            Runnable runnable = this.f44011b;
            runnable.getClass();
            this.f44011b = null;
            runnable.run();
            return;
        }
        npa npaVar = new npa();
        npaVar.f44016a = threadCurrentThread;
        ote oteVar = this.f44013d;
        oteVar.getClass();
        oteVar.f46516a = npaVar;
        this.f44013d = null;
        try {
            Runnable runnable2 = this.f44011b;
            runnable2.getClass();
            this.f44011b = null;
            runnable2.run();
            while (true) {
                ?? r0 = npaVar.f44017b;
                if (r0 == 0 || (r3 = npaVar.f44018c) == 0) {
                    break;
                }
                npaVar.f44017b = null;
                npaVar.f44018c = null;
                r3.execute(r0);
            }
            npaVar.f44016a = null;
        } catch (Throwable th) {
            npaVar.f44016a = null;
            throw th;
        }
    }
}
