package cc;

/* JADX INFO: renamed from: cc.i5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1844i5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f9864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1934s5 f9865b;

    public RunnableC1844i5(C1934s5 c1934s5, long j10) {
        this.f9865b = c1934s5;
        this.f9864a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1934s5 c1934s5 = this.f9865b;
        C1986y3 c1986y3 = ((C1897o4) c1934s5.f10430a).f10085h;
        C1897o4.m5774i(c1986y3);
        C1959v3 c1959v3 = c1986y3.f10408j;
        long j10 = this.f9864a;
        c1959v3.m5898b(j10);
        C1860k3 c1860k3 = ((C1897o4) c1934s5.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5624b(Long.valueOf(j10), "Session timeout duration set");
    }
}
