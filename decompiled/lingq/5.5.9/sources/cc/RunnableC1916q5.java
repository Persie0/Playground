package cc;

import com.google.android.gms.internal.measurement.C2734kb;

/* JADX INFO: renamed from: cc.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1916q5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1811f f10148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f10150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f10151d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1811f f10152e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1934s5 f10153f;

    public RunnableC1916q5(C1934s5 c1934s5, C1811f c1811f, int i10, long j10, boolean z10, C1811f c1811f2) {
        this.f10153f = c1934s5;
        this.f10148a = c1811f;
        this.f10149b = i10;
        this.f10150c = j10;
        this.f10151d = z10;
        this.f10152e = c1811f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1934s5 c1934s5 = this.f10153f;
        C1811f c1811f = this.f10148a;
        c1934s5.m5878v(c1811f);
        C1934s5.m5865C(this.f10153f, this.f10148a, this.f10149b, this.f10150c, false, this.f10151d);
        C2734kb.m7924a();
        if (((C1897o4) c1934s5.f10430a).f10084g.m5582q(null, C1985y2.f10360k0)) {
            C1934s5.m5864B(c1934s5, c1811f, this.f10152e);
        }
    }
}
