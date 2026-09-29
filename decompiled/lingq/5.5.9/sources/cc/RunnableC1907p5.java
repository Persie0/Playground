package cc;

import com.google.android.gms.internal.measurement.C2734kb;

/* JADX INFO: renamed from: cc.p5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1907p5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1811f f10123a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f10124b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10125c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f10126d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f10127e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1811f f10128f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1934s5 f10129g;

    public RunnableC1907p5(C1934s5 c1934s5, C1811f c1811f, long j10, int i10, long j11, boolean z10, C1811f c1811f2) {
        this.f10129g = c1934s5;
        this.f10123a = c1811f;
        this.f10124b = j10;
        this.f10125c = i10;
        this.f10126d = j11;
        this.f10127e = z10;
        this.f10128f = c1811f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1934s5 c1934s5 = this.f10129g;
        C1811f c1811f = this.f10123a;
        c1934s5.m5878v(c1811f);
        c1934s5.m5874r(false, this.f10124b);
        C1934s5.m5865C(this.f10129g, this.f10123a, this.f10125c, this.f10126d, true, this.f10127e);
        C2734kb.m7924a();
        if (((C1897o4) c1934s5.f10430a).f10084g.m5582q(null, C1985y2.f10360k0)) {
            C1934s5.m5864B(c1934s5, c1811f, this.f10128f);
        }
    }
}
