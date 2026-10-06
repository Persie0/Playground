package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwy implements hxa {

    /* JADX INFO: renamed from: a */
    public chw f29763a;

    /* JADX INFO: renamed from: b */
    public hxa f29764b;

    /* JADX INFO: renamed from: c */
    private final hwx f29765c;

    /* JADX INFO: renamed from: d */
    private final huy f29766d;

    /* JADX INFO: renamed from: e */
    private final jww f29767e;

    /* JADX INFO: renamed from: f */
    private final hht f29768f;

    /* JADX INFO: renamed from: g */
    private final igb f29769g;

    /* JADX INFO: renamed from: h */
    private final jvd f29770h;

    /* JADX INFO: renamed from: i */
    private final hys f29771i;

    public hwy(hwx hwxVar, huy huyVar, jww jwwVar, igb igbVar, hht hhtVar, jvd jvdVar, hys hysVar) {
        this.f29765c = hwxVar;
        this.f29766d = huyVar;
        this.f29767e = jwwVar;
        this.f29768f = hhtVar;
        this.f29769g = igbVar;
        this.f29770h = jvdVar;
        this.f29771i = hysVar;
    }

    /* JADX INFO: renamed from: i */
    private final int m10793i() {
        return (this.f29771i.m10885h() && ((gzp) this.f29767e.mo3831be()).equals(gzp.OFF)) ? 2 : 1;
    }

    /* JADX INFO: renamed from: j */
    private final void m10794j(int i, int i2) {
        this.f29768f.mo10320f(i, i2);
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: a */
    public final void mo7904a() {
        chw chwVar = this.f29763a;
        if (chwVar == null || chwVar.f5764a) {
            hxa hxaVar = this.f29764b;
            if (hxaVar != null) {
                hxaVar.mo7904a();
            }
            this.f29766d.mo10780b();
            chw chwVar2 = this.f29763a;
            if (chwVar2 != null) {
                chwVar2.mo3783r();
            }
        }
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: b */
    public final void mo7905b() {
        chw chwVar = this.f29763a;
        if (chwVar == null || chwVar.f5764a) {
            hxa hxaVar = this.f29764b;
            if (hxaVar != null) {
                hxaVar.mo7905b();
            }
            this.f29766d.mo10779a();
            m10794j(C0100R.raw.timer_start, m10793i());
        }
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: bK */
    public final void mo7906bK(int i) {
        hxa hxaVar = this.f29764b;
        if (hxaVar != null) {
            hxaVar.mo7906bK(i);
        }
        int iM10793i = m10793i();
        if (i == 1) {
            m10794j(C0100R.raw.timer_final, iM10793i);
        } else if (i == 2 || i == 3) {
            m10794j(C0100R.raw.timer_increment, iM10793i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10795d(chw chwVar, hxa hxaVar, jvb jvbVar) {
        this.f29763a = chwVar;
        this.f29764b = hxaVar;
        jww jwwVar = this.f29767e;
        igb igbVar = this.f29769g;
        igbVar.getClass();
        jvbVar.m13537d(jwwVar.mo3830a(new hmv(igbVar, 15), this.f29770h));
        jvbVar.m13537d(new hcu(this, 8));
        jvbVar.m13537d(new hcu(this, 9));
    }

    /* JADX INFO: renamed from: e */
    public final void m10796e(int i) {
        hwx hwxVar = this.f29765c;
        hwxVar.f29755n = this;
        hwxVar.m10791d(i);
    }

    /* JADX INFO: renamed from: f */
    public final void m10797f() {
        if (this.f29763a == null) {
            return;
        }
        if (this.f29765c.m10792e()) {
            m10798g();
            return;
        }
        int i = ((gzp) this.f29767e.mo3831be()).f26960g;
        if (i > 0) {
            m10796e(i);
            return;
        }
        chw chwVar = this.f29763a;
        if (chwVar != null) {
            chwVar.mo3783r();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10798g() {
        if (!this.f29765c.m10792e()) {
            return false;
        }
        hxa hxaVar = this.f29764b;
        if (hxaVar != null) {
            hxaVar.mo7904a();
        }
        this.f29766d.mo10780b();
        this.f29765c.m10788a();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10799h() {
        return this.f29765c.m10792e();
    }
}
