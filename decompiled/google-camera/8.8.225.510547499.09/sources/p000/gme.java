package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gme implements gmh {

    /* JADX INFO: renamed from: a */
    public final jww f25585a;

    /* JADX INFO: renamed from: b */
    private final jww f25586b = new jwf(false);

    /* JADX INFO: renamed from: c */
    private final jww f25587c = new jwf(false);

    /* JADX INFO: renamed from: d */
    private final jww f25588d;

    /* JADX INFO: renamed from: e */
    private final jww f25589e;

    public gme() {
        jwf jwfVar = new jwf(0);
        this.f25588d = jwfVar;
        Float fValueOf = Float.valueOf(0.0f);
        jwf jwfVar2 = new jwf(fValueOf);
        this.f25589e = jwfVar2;
        this.f25585a = new jwf(gmg.m9511a(((Integer) jwfVar.f34942d).intValue(), mws.m17098m((Float) jwfVar2.f34942d, fValueOf)));
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: a */
    public final jww mo9503a() {
        return this.f25587c;
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: b */
    public final jww mo9504b() {
        return this.f25585a;
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: c */
    public final nkk mo9505c() {
        nxl nxlVarM18137O = nkk.f43218c.m18137O();
        float fFloatValue = ((Float) ((gmg) ((jwf) this.f25585a).f34942d).f25592b.get(0)).floatValue();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkk nkkVar = (nkk) nxlVarM18137O.f44974b;
        nkkVar.f43220a |= 1;
        nkkVar.f43221b = fFloatValue;
        return (nkk) nxlVarM18137O.mo18103l();
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: d */
    public final Set mo9506d(gmg gmgVar) {
        return mxk.m17137I(kgq.m14215e(ivw.f32415a, Integer.valueOf(gmgVar.f25591a)), kgq.m14215e(ivw.f32416b, kxk.m14990ah(gmgVar.f25592b)));
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: e */
    public final void mo9507e(boolean z) {
        this.f25586b.mo3415bf(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public final void m9508f(int i) {
        this.f25588d.mo3415bf(Integer.valueOf(i));
        this.f25587c.mo3415bf(false);
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: g */
    public final void mo9509g(float f) {
        this.f25589e.mo3415bf(Float.valueOf(f));
        boolean z = false;
        if (((Boolean) ((jwf) this.f25586b).f34942d).booleanValue() || f != 0.0f) {
            m9508f(1);
        } else {
            m9508f(0);
            z = true;
        }
        if (((Boolean) ((jwf) this.f25587c).f34942d).booleanValue() != z) {
            this.f25587c.mo3415bf(Boolean.valueOf(z));
        }
    }

    @Override // p000.gmh
    /* JADX INFO: renamed from: h */
    public final void mo9510h(cdu cduVar) {
        cduVar.m3529i().m13537d(jwr.m13632b(this.f25588d, this.f25589e).mo3830a(new gmd(this, 0), not.INSTANCE));
    }
}
