package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmq implements fmy {

    /* JADX INFO: renamed from: a */
    private final fca f22619a;

    /* JADX INFO: renamed from: b */
    private final gxa f22620b;

    /* JADX INFO: renamed from: c */
    private final ggm f22621c;

    /* JADX INFO: renamed from: d */
    private final gwr f22622d;

    /* JADX INFO: renamed from: e */
    private final jwn f22623e;

    /* JADX INFO: renamed from: f */
    private final jwn f22624f;

    /* JADX INFO: renamed from: g */
    private final jww f22625g;

    /* JADX INFO: renamed from: h */
    private final jwn f22626h;

    /* JADX INFO: renamed from: i */
    private final hah f22627i;

    /* JADX INFO: renamed from: j */
    private final gxq f22628j;

    /* JADX INFO: renamed from: k */
    private final gyw f22629k;

    /* JADX INFO: renamed from: l */
    private final glu f22630l;

    /* JADX INFO: renamed from: m */
    private final mrm f22631m;

    /* JADX INFO: renamed from: n */
    private final AccessibilityManager f22632n;

    /* JADX INFO: renamed from: o */
    private final oju f22633o;

    /* JADX INFO: renamed from: p */
    private gyh f22634p;

    /* JADX INFO: renamed from: q */
    private hkz f22635q;

    /* JADX INFO: renamed from: r */
    private final kqj f22636r;

    /* JADX INFO: renamed from: s */
    private final jfs f22637s;

    /* JADX INFO: renamed from: t */
    private final djm f22638t;

    /* JADX INFO: renamed from: u */
    private final djm f22639u;

    public fmq(fca fcaVar, jfs jfsVar, gxa gxaVar, ggm ggmVar, gwr gwrVar, jww jwwVar, jww jwwVar2, jwn jwnVar, jwn jwnVar2, hah hahVar, djm djmVar, gxq gxqVar, kqj kqjVar, glu gluVar, mrm mrmVar, djm djmVar2, AccessibilityManager accessibilityManager, oju ojuVar, gyw gywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f22619a = fcaVar;
        this.f22637s = jfsVar;
        this.f22620b = gxaVar;
        this.f22621c = ggmVar;
        this.f22622d = gwrVar;
        this.f22623e = jwwVar;
        this.f22624f = jwnVar2;
        this.f22625g = jwwVar2;
        this.f22626h = jwnVar;
        this.f22627i = hahVar;
        this.f22639u = djmVar;
        this.f22628j = gxqVar;
        this.f22636r = kqjVar;
        this.f22629k = gywVar;
        this.f22630l = gluVar;
        this.f22631m = mrmVar;
        this.f22638t = djmVar2;
        this.f22632n = accessibilityManager;
        this.f22633o = ojuVar;
    }

    @Override // p000.fmy
    /* JADX INFO: renamed from: a */
    public final void mo8588a() {
        gyh gyhVar = this.f22634p;
        gyhVar.getClass();
        gyhVar.mo9890V(null);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v2, types: [gwx, java.lang.Object] */
    @Override // p000.fmy
    /* JADX INFO: renamed from: b */
    public final nps mo8589b(fmd fmdVar, fub fubVar, boolean z, hkz hkzVar) {
        gyn gynVarM14704f;
        this.f22635q = hkzVar;
        flz flzVar = fmdVar.f22542b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gyw gywVar = gyw.UNKNOWN;
        switch (this.f22629k.ordinal()) {
            case 10:
                gynVarM14704f = this.f22636r.m14704f(jCurrentTimeMillis, dzk.PORTRAIT, "PORTRAIT");
                break;
            case 16:
                gynVarM14704f = this.f22636r.m14704f(jCurrentTimeMillis, dzk.MOTION_BLUR, "MOTION");
                break;
            default:
                gynVarM14704f = this.f22636r.m14707i(jCurrentTimeMillis);
                break;
        }
        djm djmVar = this.f22639u;
        gyw gywVar2 = this.f22629k;
        String strM13083S = this.f22637s.m13083S(jCurrentTimeMillis);
        cjr cjrVarMo8116b = this.f22619a.mo8116b();
        mrm mrmVarM16829i = mrm.m16829i(this.f22635q);
        ?? r7 = djmVar.f11787a.get();
        gqq gqqVar = (gqq) djmVar.f11789c.get();
        gqqVar.getClass();
        kbz kbzVar = (kbz) djmVar.f11788b.get();
        kbzVar.getClass();
        gxt gxtVar = new gxt(r7, gqqVar, kbzVar, gywVar2, strM13083S, cjrVarMo8116b, gynVarM14704f, mrmVarM16829i);
        kbc kbcVar = flzVar.f22532d.f31019a;
        kbc kbcVarM13907d = ggi.m9210b(this.f22621c.mo9220j()) ? kbcVar.m13907d() : kbcVar.m13908e();
        this.f22620b.mo9925e(gxtVar);
        this.f22628j.m9939a(gxtVar);
        gxtVar.mo9887S(kbcVarM13907d);
        this.f22634p = gxtVar;
        int i = this.f22621c.mo9215c().f35503e;
        ftz ftzVarM8808a = fua.m8808a();
        ftzVarM8808a.m8806g(i);
        ftzVarM8808a.m8801b(fubVar);
        ftzVarM8808a.m8804e(this.f22622d.f26624a);
        ftzVarM8808a.m8802c(fmdVar.f22543c.mo14558k());
        ftzVarM8808a.f23561a = fmdVar.f22543c.mo14546O();
        ftzVarM8808a.m8807h(jwv.m13644a(false));
        ftzVarM8808a.m8803d(false);
        ftzVarM8808a.m8805f(false);
        fua fuaVarM8800a = ftzVarM8808a.m8800a();
        fvu fvuVar = fmdVar.f22543c;
        int iIntValue = ((Integer) this.f22627i.mo10031c(gzy.f27045d)).intValue();
        int i2 = hyn.OFF.f29942e;
        boolean z2 = fvuVar.mo14558k() == kmq.f36557a;
        hap hapVar = z2 ? gzy.f27060s : gzy.f27061t;
        mrm mrmVar = this.f22631m;
        mrm mrmVarM16829i2 = mrmVar.mo16813g() ? mrm.m16829i(((gmh) mrmVar.mo16809c()).mo9505c()) : mqu.f41450a;
        boolean z3 = iIntValue != i2;
        hjy hjyVarMo9905k = gxtVar.mo9905k();
        fcv fcvVarM8223a = fcw.m8223a();
        fcvVarM8223a.f21295e = jeu.m12984h(this.f22629k);
        fcvVarM8223a.f21291a = gxtVar.mo9913s() + "." + krd.JPEG.f37022j;
        fcvVarM8223a.m8214h(z2);
        fcvVarM8223a.m8222p(((Float) this.f22626h.mo3831be()).floatValue());
        fcvVarM8223a.m8212f((String) this.f22627i.mo10031c(hapVar));
        fcvVarM8223a.m8209c(((Boolean) this.f22624f.mo3831be()).booleanValue());
        fcvVarM8223a.m8215i(z3);
        fcvVarM8223a.m8219m(((Boolean) this.f22625g.mo3831be()).booleanValue());
        fcvVarM8223a.m8221o(((gzp) this.f22623e.mo3831be()).f26960g);
        fcvVarM8223a.f21292b = Boolean.valueOf(z);
        fcvVarM8223a.m8208b(fvuVar.mo14555h());
        fcvVarM8223a.m8217k((Boolean) this.f22627i.mo10031c(gzy.f27062u));
        fcvVarM8223a.m8218l(false);
        fcvVarM8223a.m8219m(((Boolean) this.f22625g.mo3831be()).booleanValue());
        fcvVarM8223a.m8216j(gxtVar.mo9904j() == gyx.MARS_STORE);
        fcvVarM8223a.m8211e(this.f22630l.m9461e());
        fcvVarM8223a.f21293c = mrmVarM16829i2;
        fcvVarM8223a.m8210d(this.f22638t.m6249y());
        fcvVarM8223a.m8220n(this.f22632n.isTouchExplorationEnabled());
        fcvVarM8223a.f21294d = mrm.m16829i(((hys) this.f22633o.get()).m10878a());
        ((hjz) hjyVarMo9905k).f28099y = fcvVarM8223a.m8207a();
        return fmdVar.mo8572f(fuaVarM8800a, gxtVar);
    }

    @Override // p000.fmy
    /* JADX INFO: renamed from: c */
    public final nps mo8590c(fuc fucVar, flz flzVar, fub fubVar, fvu fvuVar, boolean z, boolean z2, hkz hkzVar) {
        throw new UnsupportedOperationException("Method is Deprecated");
    }

    @Override // p000.fmy
    /* JADX INFO: renamed from: d */
    public final void mo8591d(mca mcaVar) {
        fmk.m8587a(this.f22634p, mcaVar);
    }
}
