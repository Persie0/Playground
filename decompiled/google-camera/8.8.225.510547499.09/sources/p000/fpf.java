package p000;

import android.content.res.Resources;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Set;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpf extends chw implements cre, hsr {

    /* JADX INFO: renamed from: b */
    public static final nbh f23025b = nbh.m17259h("com/google/android/apps/camera/modules/video/VideoModule");

    /* JADX INFO: renamed from: A */
    private final fna f23026A;

    /* JADX INFO: renamed from: C */
    private final hst f23028C;

    /* JADX INFO: renamed from: D */
    private final djm f23029D;

    /* JADX INFO: renamed from: E */
    private final C1058va f23030E;

    /* JADX INFO: renamed from: c */
    public final cwt f23031c;

    /* JADX INFO: renamed from: d */
    public final jvd f23032d;

    /* JADX INFO: renamed from: e */
    public final cxo f23033e;

    /* JADX INFO: renamed from: f */
    public final cwo f23034f;

    /* JADX INFO: renamed from: g */
    public final cwq f23035g;

    /* JADX INFO: renamed from: h */
    public final dbr f23036h;

    /* JADX INFO: renamed from: i */
    public final dhv f23037i;

    /* JADX INFO: renamed from: j */
    public final cpj f23038j;

    /* JADX INFO: renamed from: l */
    public final cqm f23040l;

    /* JADX INFO: renamed from: m */
    public final czy f23041m;

    /* JADX INFO: renamed from: n */
    public final drj f23042n;

    /* JADX INFO: renamed from: o */
    public final jfs f23043o;

    /* JADX INFO: renamed from: p */
    private final chk f23044p;

    /* JADX INFO: renamed from: q */
    private final String f23045q;

    /* JADX INFO: renamed from: r */
    private final oju f23046r;

    /* JADX INFO: renamed from: s */
    private final crj f23047s;

    /* JADX INFO: renamed from: t */
    private final mws f23048t;

    /* JADX INFO: renamed from: u */
    private final cwl f23049u;

    /* JADX INFO: renamed from: v */
    private jvb f23050v;

    /* JADX INFO: renamed from: x */
    private final BottomBarController f23052x;

    /* JADX INFO: renamed from: y */
    private final har f23053y;

    /* JADX INFO: renamed from: z */
    private final czw f23054z;

    /* JADX INFO: renamed from: k */
    public final Object f23039k = new Object();

    /* JADX INFO: renamed from: B */
    private final ieq f23027B = new iel();

    /* JADX INFO: renamed from: w */
    private final BottomBarListener f23051w = new fpd(this);

    public fpf(chk chkVar, jvd jvdVar, Resources resources, cqm cqmVar, djm djmVar, har harVar, BottomBarController bottomBarController, cwt cwtVar, cwo cwoVar, cwq cwqVar, cwl cwlVar, drj drjVar, cpj cpjVar, crj crjVar, cxo cxoVar, oju ojuVar, dbr dbrVar, dhv dhvVar, Set set, czw czwVar, hst hstVar, jfs jfsVar, czy czyVar, fna fnaVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23037i = dhvVar;
        this.f23034f = cwoVar;
        this.f23035g = cwqVar;
        this.f23049u = cwlVar;
        this.f23036h = dbrVar;
        this.f23044p = chkVar;
        this.f23032d = jvdVar;
        this.f23031c = cwtVar;
        this.f23045q = resources.getString(C0100R.string.video_accessibility_peek);
        this.f23029D = djmVar;
        this.f23038j = cpjVar;
        this.f23046r = ojuVar;
        this.f23052x = bottomBarController;
        this.f23040l = cqmVar;
        this.f23053y = harVar;
        this.f23042n = drjVar;
        this.f23047s = crjVar;
        this.f23033e = cxoVar;
        this.f23048t = (mws) Collection$EL.stream(set).filter(fjv.f22309c).collect(muc.f41626a);
        this.f23054z = czwVar;
        this.f23028C = hstVar;
        this.f23043o = jfsVar;
        this.f23041m = czyVar;
        this.f23026A = fnaVar;
        this.f23030E = c1058va;
    }

    /* JADX INFO: renamed from: z */
    private final kbg m8659z(cws cwsVar) {
        return new fpc(this, cwsVar);
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
        this.f23040l.m5369j(true);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        synchronized (this.f23039k) {
            this.f23038j.m5234f(i);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bT */
    public final void mo3768bT(boolean z) {
        synchronized (this.f23039k) {
            this.f23038j.m5238j(z);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        synchronized (this.f23039k) {
            this.f23040l.m5362c(this.f23044p.mo3693g(), ikw.VIDEO);
            this.f23038j.m5232d();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        synchronized (this.f23039k) {
            this.f23040l.m5364e();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f23045q;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23039k) {
            this.f23038j.m5241m();
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
        cxo cxoVar = this.f23033e;
        mrm mrmVar = cxoVar.f9989b;
        if (mrmVar.mo16813g()) {
            ((dax) mrmVar.mo16809c()).mo5863s(null);
        }
        cxoVar.f9991d.mo5712g();
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
        daw dawVar;
        cxk cxkVar;
        cxo cxoVar = this.f23033e;
        mrm mrmVar = cxoVar.f9989b;
        if (mrmVar.mo16813g()) {
            dax daxVar = (dax) mrmVar.mo16809c();
            if (cxoVar.f9990c.mo5895d().equals(kmq.f36557a)) {
                dawVar = daw.DISABLED_HIDDEN;
            } else if (cxoVar.f9995h.m6240o()) {
                dawVar = daw.ENABLED_VISIBLE;
            } else {
                cxoVar.m5718c(true);
                dawVar = daw.DISABLED_VISIBLE;
            }
            daxVar.mo5854i(dawVar);
            if (dawVar.f10350d) {
                daxVar.mo5863s(new AmbientModeSupport.AmbientController(cxoVar));
            }
            cxoVar.f9991d.mo5711f();
            cxoVar.f9993f.set(false);
            if (cxoVar.f9992e.mo6173a(dhh.f11096i).isPresent()) {
                int iIntValue = ((Integer) cxoVar.f9992e.mo6173a(dhh.f11096i).get()).intValue();
                if (iIntValue == 2) {
                    cxkVar = cxk.CINEMATIC;
                } else if (iIntValue == 3) {
                    cxkVar = cxk.LOCKED;
                } else {
                    cxkVar = iIntValue == 4 ? cxk.ACTIVE : cxk.DEFAULT;
                }
                cxoVar.m5719d(cxkVar, true);
            }
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
        this.f23038j.m5235g(z);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        if (this.f5764a) {
            this.f23038j.m5246r(true != this.f23038j.m5242n() ? 5 : 10);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this.f23039k) {
            this.f23038j.m5240l(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, jww] */
    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        synchronized (this.f23039k) {
            this.f23028C.m10706e(this);
            jvb jvbVar = new jvb();
            this.f23050v = jvbVar;
            jvbVar.m13537d(this.f23029D.f11787a.mo3830a(m8659z(this.f23034f), this.f23032d));
            this.f23050v.m13537d(this.f23029D.f11789c.mo3830a(m8659z(this.f23035g), this.f23032d));
            this.f23050v.m13537d(this.f23029D.f11788b.mo3830a(m8659z(this.f23049u), this.f23032d));
            this.f23050v.m13537d(this.f23053y.mo3830a(new fpe(this, 1), this.f23032d));
            this.f23026A.m8602b(this, ikw.VIDEO, this.f23050v);
            this.f23050v.m13537d(this.f23036h.mo3830a(new jzj(this, 1), this.f23032d));
            jvb jvbVar2 = this.f23050v;
            mws mwsVar = this.f23048t;
            int size = mwsVar.size();
            for (int i = 0; i < size; i++) {
                gfb gfbVar = (gfb) mwsVar.get(i);
                gev gevVarMo5771g = gfbVar.mo5771g();
                gev gevVar = gev.SWISS;
                gzm gzmVar = gzm.FPS_AUTO;
                switch (gevVarMo5771g.ordinal()) {
                    case 8:
                    case 9:
                    case 12:
                    case 18:
                    case 20:
                    case 22:
                        break;
                    case 19:
                        jvbVar2.m13537d(gfbVar.mo5773i().mo3830a(new fpe(this, 0), this.f23032d));
                        break;
                    default:
                        throw new UnsupportedOperationException("Not a valid menu item in video mode: ".concat(String.valueOf(String.valueOf(gevVarMo5771g))));
                }
            }
            this.f23050v.m13537d(this.f23033e.m5717b(new cxl(this, 3)));
            this.f23030E.m19463A(new fnx(this, 4), this.f23050v);
            this.f23052x.addListener(this.f23051w);
            this.f23040l.m5367h();
            this.f23047s.mo5415d();
            this.f23038j.m5230b(this);
            this.f23044p.mo3704r(this.f23027B, true);
        }
        czw czwVar = this.f23054z;
        int iIntValue = ((Integer) czwVar.f10175c.mo10031c(gzy.f27002N)).intValue();
        czwVar.f10176d = iIntValue;
        if (iIntValue > 0) {
            czwVar.f10174b.mo10030b(gzy.f27002N).mo3415bf(Integer.valueOf(czwVar.f10176d - 1));
        }
        czwVar.f10173a.mo9121g(czwVar);
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        synchronized (this.f23039k) {
            this.f23052x.removeListener(this.f23051w);
            this.f23040l.m5368i();
            this.f23038j.m5241m();
            this.f23050v.close();
            this.f23038j.m5239k(this);
            this.f23028C.m10710i(this);
            this.f23047s.mo5416e();
            czw czwVar = this.f23054z;
            czwVar.f10173a.mo9128n(czwVar);
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
        synchronized (this.f23039k) {
            zM5243o = this.f23038j.m5243o();
        }
        return zM5243o;
    }

    /* JADX INFO: renamed from: w */
    public final void m8660w(int i) {
        ((iig) this.f23046r).get().f31068e.m4501m(ikw.VIDEO, new bbt(this, i, 20));
    }

    @Override // p000.hsr
    /* JADX INFO: renamed from: x */
    public final void mo8661x(int i) {
        if (i == 13) {
            m8660w(9);
        }
    }

    @Override // p000.hsr
    /* JADX INFO: renamed from: y */
    public final void mo8662y(int i) {
        if (i == 13) {
            this.f23038j.m5231c();
        }
    }
}
