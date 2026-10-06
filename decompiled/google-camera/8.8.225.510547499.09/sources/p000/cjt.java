package p000;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjt implements jve {

    /* JADX INFO: renamed from: a */
    public static final nbh f5940a = nbh.m17259h("com/google/android/apps/camera/async/mainthread/EagerMainThreadExecutor");

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f5941b;

    /* JADX INFO: renamed from: c */
    public final ThreadLocal f5942c = new cjs();

    /* JADX INFO: renamed from: d */
    public final ArrayList f5943d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final jve f5944e;

    public cjt(jve jveVar, int i) {
        this.f5941b = new ArrayBlockingQueue(i);
        this.f5944e = jveVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.f5941b.offer(runnable)) {
            this.f5944e.execute(runnable);
        } else {
            if (((Boolean) this.f5942c.get()).booleanValue()) {
                return;
            }
            this.f5944e.execute(new cei(this, 13));
        }
    }
}
