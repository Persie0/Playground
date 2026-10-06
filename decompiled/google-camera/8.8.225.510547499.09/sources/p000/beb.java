package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beb implements Executor {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f3020a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final Object f3021b = new Object();

    /* JADX INFO: renamed from: c */
    private final Executor f3022c;

    /* JADX INFO: renamed from: d */
    private Runnable f3023d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f3024e;

    public beb(Executor executor, int i, byte[] bArr) {
        this.f3024e = i;
        this.f3022c = executor;
    }

    public beb(Executor executor, int i) {
        this.f3024e = i;
        this.f3022c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m2263a() {
        switch (this.f3024e) {
            case 0:
                Runnable runnable = (Runnable) this.f3020a.poll();
                this.f3023d = runnable;
                if (runnable != null) {
                    this.f3022c.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f3021b) {
                    Object objPoll = this.f3020a.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f3023d = runnable2;
                    if (objPoll != null) {
                        this.f3022c.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3024e) {
            case 0:
                synchronized (this.f3021b) {
                    this.f3020a.add(new bek(this, runnable, 1));
                    if (this.f3023d == null) {
                        m2263a();
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.f3021b) {
                    this.f3020a.offer(new RunnableC0058bd(runnable, this, 14, (byte[]) null));
                    if (this.f3023d == null) {
                        m2263a();
                    }
                    break;
                }
                return;
        }
    }
}
