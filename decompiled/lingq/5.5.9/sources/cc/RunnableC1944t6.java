package cc;

import p115fb.RunnableC5493i;
import p290o6.C7968m;

/* JADX INFO: renamed from: cc.t6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1944t6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f10213a;

    /* JADX INFO: renamed from: b */
    public final long f10214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7968m f10215c;

    public RunnableC1944t6(C7968m c7968m, long j10, long j11) {
        this.f10215c = c7968m;
        this.f10213a = j10;
        this.f10214b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1879m4 c1879m4 = ((C1897o4) ((C1971w6) this.f10215c.f43384b).f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC5493i(4, this));
    }
}
