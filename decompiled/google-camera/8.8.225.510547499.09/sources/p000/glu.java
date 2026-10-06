package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glu implements glz {

    /* JADX INFO: renamed from: a */
    public final kbo f25536a;

    /* JADX INFO: renamed from: b */
    public int f25537b;

    /* JADX INFO: renamed from: c */
    public CountDownLatch f25538c;

    /* JADX INFO: renamed from: f */
    private final dhv f25541f;

    /* JADX INFO: renamed from: g */
    private float f25542g;

    /* JADX INFO: renamed from: h */
    private float f25543h;

    /* JADX INFO: renamed from: i */
    private final npu f25544i;

    /* JADX INFO: renamed from: j */
    private nps f25545j;

    /* JADX INFO: renamed from: k */
    private Float f25546k;

    /* JADX INFO: renamed from: l */
    private Float f25547l;

    /* JADX INFO: renamed from: m */
    private Float f25548m;

    /* JADX INFO: renamed from: n */
    private Float f25549n;

    /* JADX INFO: renamed from: o */
    private Float f25550o;

    /* JADX INFO: renamed from: p */
    private Float f25551p;

    /* JADX INFO: renamed from: q */
    private Float f25552q;

    /* JADX INFO: renamed from: r */
    private kmd f25553r;

    /* JADX INFO: renamed from: s */
    private jwn f25554s;

    /* JADX INFO: renamed from: t */
    private boolean f25555t;

    /* JADX INFO: renamed from: v */
    private final drj f25557v;

    /* JADX INFO: renamed from: e */
    private boolean f25540e = false;

    /* JADX INFO: renamed from: d */
    public final jwf f25539d = new jwf(m9454r());

    /* JADX INFO: renamed from: u */
    private final jwf f25556u = new jwf(Float.valueOf(0.0f));

    public glu(dhv dhvVar, drj drjVar, npu npuVar, kbn kbnVar, byte[] bArr, byte[] bArr2) {
        this.f25541f = dhvVar;
        dhw dhwVar = dhu.f11199a;
        dhvVar.mo6175c();
        this.f25557v = drjVar;
        this.f25544i = npuVar;
        this.f25536a = kbnVar.mo6314a("DualEvCtrl");
        this.f25542g = 0.5f;
        this.f25543h = 0.0f;
        this.f25537b = 0;
    }

    /* JADX INFO: renamed from: n */
    private static float m9450n(float f) {
        return kxk.m14986ad(f, 0.03f, 0.97f);
    }

    /* JADX INFO: renamed from: o */
    private final synchronized float m9451o(float f) {
        float fM9452p;
        fM9452p = m9452p();
        return (float) Math.pow((kxk.m14986ad(f, 1.0f, fM9452p) - 1.0f) / (fM9452p - 1.0f), 0.75d);
    }

    /* JADX INFO: renamed from: p */
    private final float m9452p() {
        return this.f25540e ? 14.0f : 17.94f;
    }

    /* JADX INFO: renamed from: q */
    private final synchronized float m9453q(float f) {
        return ((m9452p() - 1.0f) * ((float) Math.pow(f, 1.3333333730697632d))) + 1.0f;
    }

    /* JADX INFO: renamed from: r */
    private static glt m9454r() {
        return glt.m9449a(0.0f, 0.0f, 0.0f, 0);
    }

    /* JADX INFO: renamed from: s */
    private final synchronized void m9455s(float f, float f2, float f3) {
        this.f25549n = Float.valueOf(f);
        this.f25550o = Float.valueOf(f2);
        this.f25551p = Float.valueOf(f3);
        this.f25552q = Float.valueOf((float) (Math.log(m9450n(m9451o(f2 / f))) / Math.log(m9450n(this.f25543h))));
    }

    /* JADX INFO: renamed from: t */
    private static boolean m9456t(float f) {
        return f >= 0.0f && f <= 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized glt m9457a(float f, float f2) {
        kmd kmdVar;
        if (this.f25555t && (kmdVar = this.f25553r) != null && m9456t(f) && m9456t(f2)) {
            float fMo14548a = kmdVar.mo14548a();
            float fMo14552e = this.f25553r.mo14552e() * fMo14548a;
            float fMo14551d = this.f25553r.mo14551d() * fMo14548a;
            if (this.f25549n != null && this.f25550o != null && this.f25551p != null) {
                this.f25552q.getClass();
                if (this.f25541f.mo6184l(dho.f11141a)) {
                    float f3 = fMo14552e + ((fMo14551d - fMo14552e) * f);
                    float fPow = (float) Math.pow(2.0d, f3);
                    return glt.m9449a(this.f25549n.floatValue() * fPow, this.f25550o.floatValue() * fPow, this.f25551p.floatValue() * fPow, Math.round(f3 / fMo14548a));
                }
                float f4 = fMo14552e + ((fMo14551d - fMo14552e) * f);
                float fPow2 = (float) Math.pow(2.0d, f4);
                double d = f2;
                int iRound = Math.round(f4 / fMo14548a);
                float fM9453q = m9453q((float) Math.pow(d, this.f25552q.floatValue()));
                float fFloatValue = this.f25549n.floatValue() * fPow2;
                float f5 = fM9453q * fFloatValue;
                float fFloatValue2 = this.f25548m.floatValue() * (f5 / this.f25547l.floatValue());
                if (iRound == 0) {
                    iRound = -1;
                }
                return glt.m9449a(fFloatValue, f5, fFloatValue2, iRound);
            }
            Float f6 = this.f25546k;
            if (f6 != null && this.f25547l != null && this.f25548m != null) {
                m9455s(f6.floatValue(), this.f25547l.floatValue(), this.f25548m.floatValue());
                return m9454r();
            }
            return m9454r();
        }
        return m9454r();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized glx m9458b() {
        Float f = this.f25546k;
        if (f != null && this.f25547l != null) {
            this.f25548m.getClass();
            float fFloatValue = f.floatValue();
            float fFloatValue2 = this.f25547l.floatValue();
            this.f25548m.floatValue();
            this.f25542g = 0.5f;
            float fM9451o = m9451o(fFloatValue2 / fFloatValue);
            this.f25543h = fM9451o;
            if (this.f25537b > 0) {
                fM9451o = kxk.m14986ad(fM9451o, 0.08f, 0.92f);
                this.f25543h = fM9451o;
            }
            return glx.m9482a(this.f25542g, fM9451o);
        }
        return glx.m9482a(0.5f, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized jwn m9459c() {
        return this.f25539d;
    }

    @Override // p000.glz
    /* JADX INFO: renamed from: d */
    public final jwn mo9460d() {
        return this.f25556u;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized nip m9461e() {
        Float f;
        nxl nxlVarM18137O = nip.f42751h.m18137O();
        if (this.f25555t && (f = this.f25549n) != null && this.f25550o != null) {
            this.f25551p.getClass();
            float fFloatValue = f.floatValue();
            float fFloatValue2 = this.f25550o.floatValue();
            float fFloatValue3 = this.f25551p.floatValue();
            glt gltVar = (glt) this.f25539d.f34942d;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nip nipVar = (nip) nxqVar;
            nipVar.f42753a |= 1;
            nipVar.f42754b = fFloatValue;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nip nipVar2 = (nip) nxqVar2;
            nipVar2.f42753a |= 2;
            nipVar2.f42755c = fFloatValue2;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O.f44974b;
            nip nipVar3 = (nip) nxqVar3;
            nipVar3.f42753a |= 4;
            nipVar3.f42756d = fFloatValue3;
            float f2 = gltVar.f25532a;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar4 = nxlVarM18137O.f44974b;
            nip nipVar4 = (nip) nxqVar4;
            nipVar4.f42753a |= 8;
            nipVar4.f42757e = f2;
            float f3 = gltVar.f25533b;
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O.f44974b;
            nip nipVar5 = (nip) nxqVar5;
            nipVar5.f42753a |= 16;
            nipVar5.f42758f = f3;
            float f4 = gltVar.f25534c;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nip nipVar6 = (nip) nxlVarM18137O.f44974b;
            nipVar6.f42753a |= 32;
            nipVar6.f42759g = f4;
            return (nip) nxlVarM18137O.mo18103l();
        }
        return (nip) nxlVarM18137O.mo18103l();
    }

    @Override // p000.glz
    /* JADX INFO: renamed from: f */
    public final nps mo9462f() {
        nps npsVar = this.f25545j;
        if (npsVar != null) {
            npsVar.cancel(true);
        }
        nps npsVarSubmit = this.f25544i.submit(new bdv(this, 8));
        this.f25545j = npsVarSubmit;
        return npsVarSubmit;
    }

    @Override // p000.glz
    /* JADX INFO: renamed from: g */
    public final synchronized void mo9463g() {
        this.f25537b = 0;
        if (mo9467k()) {
            this.f25536a.mo13940b("Resetting dual ev (touchCounter : " + this.f25537b + ").");
            m9464h();
            this.f25555t = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m9464h() {
        this.f25539d.mo3415bf(m9454r());
        this.f25546k = null;
        this.f25547l = null;
        this.f25548m = null;
        this.f25549n = null;
        this.f25550o = null;
        this.f25551p = null;
        this.f25552q = null;
    }

    @Override // p000.glz
    /* JADX INFO: renamed from: i */
    public final synchronized void mo9465i() {
        if (mo9467k()) {
            int i = this.f25537b + 1;
            this.f25537b = i;
            this.f25536a.mo13940b("Tapped to initiate dual ev (touchCounter : " + i + ").");
            m9464h();
            this.f25555t = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m9466j(kmd kmdVar, float f, float f2, float f3) {
        kmd kmdVar2;
        this.f25553r = kmdVar;
        this.f25540e = false;
        if (this.f25541f.mo6184l(dho.f11143c) && (kmdVar2 = this.f25553r) != null && kmdVar2.mo14558k() == kmq.BACK && this.f25553r.mo14567t().size() == 1 && ((Float) this.f25553r.mo14567t().get(0)).floatValue() < 3.5f) {
            this.f25540e = true;
        }
        this.f25546k = Float.valueOf(f);
        this.f25547l = Float.valueOf(f2);
        this.f25548m = Float.valueOf(f3);
        CountDownLatch countDownLatch = this.f25538c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f25556u.mo3415bf(Float.valueOf(m9451o(f2 / f)));
    }

    @Override // p000.glz
    /* JADX INFO: renamed from: k */
    public final synchronized boolean mo9467k() {
        jwn jwnVar = this.f25554s;
        return jwnVar != null && ((gly) jwnVar.mo3831be()).f25569a && ((gly) this.f25554s.mo3831be()).f25570b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.glz
    /* JADX INFO: renamed from: l */
    public final synchronized void mo9468l(cdu cduVar, jwn jwnVar) {
        this.f25554s = jwnVar;
        jvb jvbVarM3528h = cduVar.m3528h();
        drj drjVar = this.f25557v;
        jvbVarM3528h.m13537d(jwr.m13632b(drjVar.f12396b, drjVar.f12395a).mo3830a(new gmd(this, 1), not.INSTANCE));
    }

    /* JADX INFO: renamed from: m */
    public final void m9469m() {
    }
}
