package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foy extends chw implements cre {

    /* JADX INFO: renamed from: b */
    public final cpj f22978b;

    /* JADX INFO: renamed from: c */
    public final BottomBarController f22979c;

    /* JADX INFO: renamed from: d */
    public final cqm f22980d;

    /* JADX INFO: renamed from: f */
    private final chk f22982f;

    /* JADX INFO: renamed from: g */
    private final Resources f22983g;

    /* JADX INFO: renamed from: h */
    private final cwt f22984h;

    /* JADX INFO: renamed from: i */
    private final oju f22985i;

    /* JADX INFO: renamed from: k */
    private final daj f22987k;

    /* JADX INFO: renamed from: m */
    private final boolean f22989m;

    /* JADX INFO: renamed from: n */
    private final fna f22990n;

    /* JADX INFO: renamed from: o */
    private jvb f22991o;

    /* JADX INFO: renamed from: p */
    private final jwf f22992p;

    /* JADX INFO: renamed from: e */
    public final Object f22981e = new Object();

    /* JADX INFO: renamed from: j */
    private final BottomBarListener f22986j = new fow(this);

    /* JADX INFO: renamed from: l */
    private final dak f22988l = new fox(this);

    public foy(chk chkVar, cpj cpjVar, Resources resources, BottomBarController bottomBarController, oju ojuVar, cwt cwtVar, oju ojuVar2, daj dajVar, jwf jwfVar, boolean z, fna fnaVar) {
        this.f22982f = chkVar;
        this.f22978b = cpjVar;
        this.f22983g = resources;
        this.f22979c = bottomBarController;
        this.f22980d = (cqm) ojuVar.get();
        this.f22984h = cwtVar;
        this.f22985i = ojuVar2;
        this.f22987k = dajVar;
        this.f22992p = jwfVar;
        this.f22989m = z;
        this.f22990n = fnaVar;
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
        this.f22980d.m5369j(true);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        synchronized (this.f22981e) {
            this.f22978b.m5234f(i);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bT */
    public final void mo3768bT(boolean z) {
        synchronized (this.f22981e) {
            this.f22978b.m5238j(z);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        synchronized (this.f22981e) {
            this.f22980d.m5362c(this.f22982f.mo3693g(), ikw.SLOW_MOTION);
            this.f22978b.m5232d();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        synchronized (this.f22981e) {
            this.f22980d.m5364e();
        }
        if (this.f22989m) {
            this.f22992p.mo3415bf(jxn.FPS_240_HFR_8X);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f22983g.getString(C0100R.string.video_accessibility_peek);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22981e) {
            this.f22978b.m5241m();
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
        this.f22978b.m5235g(z);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        if (this.f5764a) {
            this.f22978b.m5246r(true != this.f22978b.m5242n() ? 5 : 10);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this.f22981e) {
            this.f22978b.m5240l(true);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        synchronized (this.f22981e) {
            this.f22991o = new jvb();
            this.f22990n.m8602b(this, ikw.SLOW_MOTION, this.f22991o);
            this.f22979c.addListener(this.f22986j);
            this.f22980d.m5367h();
            this.f22978b.m5230b(this);
            this.f22987k.mo5810a(this.f22988l);
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        synchronized (this.f22981e) {
            this.f22980d.m5368i();
            this.f22978b.m5241m();
            this.f22991o.close();
            this.f22978b.m5239k(this);
            this.f22979c.removeListener(this.f22986j);
            this.f22987k.mo5816g(this.f22988l);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: s */
    public final void mo3784s(Runnable runnable) {
        runnable.run();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        boolean zM5243o;
        synchronized (this.f22981e) {
            zM5243o = this.f22978b.m5243o();
        }
        return zM5243o;
    }

    /* JADX INFO: renamed from: w */
    public final void m8642w(int i) {
        synchronized (this.f22981e) {
            jxn jxnVar = jxn.FPS_120_HFR_4X;
            if (i == 0) {
                jxnVar = jxn.FPS_240_HFR_8X;
            } else if (i == 1) {
                jxnVar = jxn.FPS_120_HFR_4X;
            }
            cws cwsVarM5690a = this.f22984h.m5690a(ikw.SLOW_MOTION);
            cwsVarM5690a.mo3831be();
            if (jxnVar != cwsVarM5690a.mo3831be()) {
                cwsVarM5690a.mo3415bf(jxnVar);
                ((iig) this.f22985i).get().f31068e.m4501m(ikw.SLOW_MOTION, new fnx(this, 2));
            }
        }
    }
}
