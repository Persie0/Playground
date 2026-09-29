package cc;

/* JADX INFO: renamed from: cc.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1773a6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f9673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1782b6 f9674b;

    public RunnableC1773a6(C1782b6 c1782b6, long j10) {
        this.f9674b = c1782b6;
        this.f9673a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1782b6 c1782b6 = this.f9674b;
        ((C1897o4) c1782b6.f10430a).m5782m().m5859k(this.f9673a);
        c1782b6.f9687e = null;
    }
}
