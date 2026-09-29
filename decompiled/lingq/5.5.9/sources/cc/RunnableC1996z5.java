package cc;

/* JADX INFO: renamed from: cc.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1996z5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1988y5 f10431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1988y5 f10432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f10433c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f10434d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1782b6 f10435e;

    public RunnableC1996z5(C1782b6 c1782b6, C1988y5 c1988y5, C1988y5 c1988y6, long j10, boolean z10) {
        this.f10435e = c1782b6;
        this.f10431a = c1988y5;
        this.f10432b = c1988y6;
        this.f10433c = j10;
        this.f10434d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10435e.m5520l(this.f10431a, this.f10432b, this.f10433c, this.f10434d, null);
    }
}
