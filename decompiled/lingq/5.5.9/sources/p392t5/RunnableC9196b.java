package p392t5;

import com.bumptech.glide.load.engine.C2115a;

/* JADX INFO: renamed from: t5.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9196b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2115a f47737a;

    public RunnableC9196b(C2115a c2115a) {
        this.f47737a = c2115a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2115a c2115a = this.f47737a;
        c2115a.getClass();
        while (true) {
            try {
                c2115a.m6306b((C2115a.a) c2115a.f10683c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
