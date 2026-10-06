package p000;

import android.graphics.PointF;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdd implements iqd, kba {

    /* JADX INFO: renamed from: a */
    public final dxh f5264a;

    /* JADX INFO: renamed from: b */
    public final kmq f5265b;

    /* JADX INFO: renamed from: c */
    public final jwn f5266c;

    /* JADX INFO: renamed from: d */
    public cdj f5267d;

    /* JADX INFO: renamed from: h */
    private final ccd f5271h;

    /* JADX INFO: renamed from: i */
    private final Set f5272i;

    /* JADX INFO: renamed from: j */
    private final mrm f5273j;

    /* JADX INFO: renamed from: k */
    private final iuj f5274k;

    /* JADX INFO: renamed from: l */
    private final hwx f5275l;

    /* JADX INFO: renamed from: m */
    private final hsk f5276m;

    /* JADX INFO: renamed from: n */
    private final dox f5277n;

    /* JADX INFO: renamed from: o */
    private final mrm f5278o;

    /* JADX INFO: renamed from: p */
    private final jwn f5279p;

    /* JADX INFO: renamed from: q */
    private final dfl f5280q;

    /* JADX INFO: renamed from: r */
    private jvb f5281r;

    /* JADX INFO: renamed from: s */
    private kba f5282s;

    /* JADX INFO: renamed from: w */
    private final jfs f5286w;

    /* JADX INFO: renamed from: t */
    private boolean f5283t = false;

    /* JADX INFO: renamed from: e */
    public ilv f5268e = null;

    /* JADX INFO: renamed from: f */
    public ilv f5269f = null;

    /* JADX INFO: renamed from: g */
    public kba f5270g = null;

    /* JADX INFO: renamed from: u */
    private kba f5284u = null;

    /* JADX INFO: renamed from: v */
    private final juw f5285v = new cct(this, 3);

    public cdd(jvb jvbVar, ccd ccdVar, dxh dxhVar, kmq kmqVar, Set set, mrm mrmVar, iuj iujVar, hwx hwxVar, hsk hskVar, dox doxVar, mrm mrmVar2, dfl dflVar, jwn jwnVar, jwn jwnVar2, jfs jfsVar, byte[] bArr) {
        this.f5264a = dxhVar;
        this.f5265b = kmqVar;
        this.f5271h = ccdVar;
        this.f5272i = set;
        this.f5273j = mrmVar;
        this.f5274k = iujVar;
        this.f5275l = hwxVar;
        this.f5276m = hskVar;
        this.f5277n = doxVar;
        this.f5278o = mrmVar2;
        this.f5279p = jwnVar;
        this.f5280q = dflVar;
        this.f5266c = jwnVar2;
        this.f5286w = jfsVar;
        jvbVar.m13537d(this);
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final boolean mo3470a(PointF pointF) {
        return true;
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: b */
    public final void mo3484b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m3485c(mrm mrmVar) {
        if (this.f5273j.mo16813g()) {
            ((hrx) this.f5273j.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
            ((hrx) this.f5273j.mo16809c()).mo10671c(hrw.TOUCH_TO_FOCUS);
        }
        m3486d(mrmVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5283t = true;
        kba kbaVar = this.f5270g;
        if (kbaVar != null) {
            kbaVar.close();
        }
        jvb jvbVar = this.f5281r;
        if (jvbVar != null) {
            jvbVar.close();
        }
        kba kbaVar2 = this.f5282s;
        if (kbaVar2 != null) {
            kbaVar2.close();
        }
        kba kbaVar3 = this.f5284u;
        if (kbaVar3 != null) {
            kbaVar3.close();
            this.f5284u = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3486d(mrm mrmVar) {
        kba kbaVar = this.f5284u;
        if (kbaVar != null) {
            kbaVar.close();
            this.f5284u = null;
        }
        if (this.f5278o.mo16813g()) {
            ((hnn) this.f5278o.mo16809c()).mo10505n(false, mrmVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3487e() {
        this.f5264a.mo4157o();
        this.f5264a.mo4160r();
        if (this.f5273j.mo16813g()) {
            ((hrx) this.f5273j.mo16809c()).mo10671c(hrw.TOUCH_TO_FOCUS);
        }
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: f */
    public final synchronized boolean mo3488f(PointF pointF) {
        int i = 0;
        if (!this.f5283t && !this.f5275l.m10792e()) {
            cdj cdjVar = this.f5267d;
            int i2 = 1;
            if (cdjVar != null && ((!cdjVar.mo3437b().isDone() || ((Boolean) this.f5266c.mo3831be()).booleanValue()) && !this.f5286w.m13076K() && this.f5264a.mo4168z(pointF))) {
                if (((Boolean) ((jwf) this.f5277n.mo6467c()).f34942d).booleanValue()) {
                    this.f5267d.mo3444i();
                } else {
                    this.f5267d.mo3443h();
                }
                if (((Boolean) this.f5266c.mo3831be()).booleanValue()) {
                    m3485c(mqu.f41450a);
                    return true;
                }
                m3486d(mqu.f41450a);
                return true;
            }
            this.f5280q.mo6049d();
            if (this.f5273j.mo16813g() && !((hrx) this.f5273j.mo16809c()).mo10674k(hrw.TOUCH_TO_FOCUS)) {
                return false;
            }
            ilv ilvVar = this.f5268e;
            if (ilvVar != null) {
                ilvVar.mo11451c();
            }
            ilv ilvVar2 = this.f5269f;
            if (ilvVar2 != null) {
                ilvVar2.mo11451c();
            }
            kba kbaVar = this.f5270g;
            if (kbaVar != null) {
                kbaVar.close();
            }
            kba kbaVar2 = this.f5284u;
            if (kbaVar2 != null) {
                kbaVar2.close();
                this.f5284u = null;
            }
            jvb jvbVar = this.f5281r;
            if (jvbVar != null) {
                jvbVar.close();
            }
            kba kbaVar3 = this.f5282s;
            if (kbaVar3 != null) {
                kbaVar3.close();
            }
            Iterator it = this.f5272i.iterator();
            while (it.hasNext()) {
                ((iqc) it.next()).mo3470a(pointF);
            }
            if (this.f5278o.mo16813g() && !((Boolean) this.f5266c.mo3831be()).booleanValue()) {
                ((hnn) this.f5278o.mo16809c()).mo10505n(true, mrm.m16829i(pointF));
            }
            if (this.f5278o.mo16813g()) {
                ((hnn) this.f5278o.mo16809c()).mo10510s();
            }
            if (this.f5278o.mo16813g() && ((Boolean) this.f5266c.mo3831be()).booleanValue() && !((hnn) this.f5278o.mo16809c()).mo10513v()) {
                if (((Boolean) this.f5279p.mo3831be()).booleanValue()) {
                    ((hnn) this.f5278o.mo16809c()).mo10501j();
                }
                ((hnn) this.f5278o.mo16809c()).mo10504m(mrm.m16829i(pointF));
            } else {
                ilv ilvVarMo4155m = this.f5264a.mo4155m(pointF);
                this.f5268e = ilvVarMo4155m;
                ilvVarMo4155m.mo11450b(new ccb(this, 11));
                if (this.f5284u == null) {
                    this.f5284u = this.f5266c.mo3830a(new cdb(this, pointF, i), not.INSTANCE);
                }
            }
            cdh cdhVarM10701f = this.f5276m.m10701f();
            jvb jvbVar2 = new jvb();
            this.f5281r = jvbVar2;
            this.f5267d = this.f5271h.mo3426a(jvbVar2, this.f5265b, pointF, cdhVarM10701f);
            iuj iujVar = this.f5274k;
            if (!((ite) iujVar).f32068S) {
                iujVar.mo11765p();
            } else if (iujVar.mo11743X()) {
                this.f5274k.mo11731L();
            }
            ilv ilvVar3 = this.f5268e;
            jvh.m13563k(ilvVar3 == null ? kxk.m14965K(true) : ((ima) ilvVar3).f31472b, this.f5267d.mo3437b(), this.f5285v, jvh.m13554b());
            jvh.m13562j(this.f5267d.mo3436a(), new cis(this, i2), jvh.m13554b());
            this.f5282s = cdhVarM10701f.f5299a.mo3830a(new cbx(this, 7), jvh.m13554b());
            jvh.m13562j(this.f5267d.mo3438c(), new cdc(this, cdhVarM10701f, i), not.INSTANCE);
            jvh.m13562j(this.f5267d.mo3438c(), new cdc(this, cdhVarM10701f, 2), jvh.m13554b());
            return true;
        }
        return false;
    }
}
