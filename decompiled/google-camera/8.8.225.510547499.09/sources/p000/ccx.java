package p000;

import android.graphics.PointF;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccx extends iqc implements kba {

    /* JADX INFO: renamed from: a */
    public final dxh f5214a;

    /* JADX INFO: renamed from: d */
    private final ccd f5217d;

    /* JADX INFO: renamed from: e */
    private final kmq f5218e;

    /* JADX INFO: renamed from: f */
    private final Set f5219f;

    /* JADX INFO: renamed from: g */
    private final iuj f5220g;

    /* JADX INFO: renamed from: h */
    private final hwx f5221h;

    /* JADX INFO: renamed from: i */
    private final mrm f5222i;

    /* JADX INFO: renamed from: j */
    private final hsk f5223j;

    /* JADX INFO: renamed from: k */
    private final jwn f5224k;

    /* JADX INFO: renamed from: l */
    private final jwn f5225l;

    /* JADX INFO: renamed from: m */
    private jvb f5226m;

    /* JADX INFO: renamed from: n */
    private kba f5227n;

    /* JADX INFO: renamed from: b */
    public ilv f5215b = null;

    /* JADX INFO: renamed from: c */
    public ilv f5216c = null;

    /* JADX INFO: renamed from: o */
    private boolean f5228o = false;

    /* JADX INFO: renamed from: p */
    private final juw f5229p = new cct(this, 2);

    public ccx(jvb jvbVar, ccd ccdVar, dxh dxhVar, kmq kmqVar, Set set, iuj iujVar, hwx hwxVar, mrm mrmVar, hsk hskVar, jwn jwnVar, jwn jwnVar2) {
        this.f5217d = ccdVar;
        this.f5214a = dxhVar;
        this.f5218e = kmqVar;
        this.f5219f = set;
        this.f5220g = iujVar;
        this.f5221h = hwxVar;
        this.f5222i = mrmVar;
        this.f5223j = hskVar;
        this.f5224k = jwnVar;
        this.f5225l = jwnVar2;
        jvbVar.m13537d(this);
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo3470a(PointF pointF) {
        if (!this.f5228o && !this.f5221h.m10792e()) {
            ilv ilvVar = this.f5215b;
            if (ilvVar != null) {
                ilvVar.mo11451c();
            }
            ilv ilvVar2 = this.f5216c;
            if (ilvVar2 != null) {
                ilvVar2.mo11451c();
            }
            jvb jvbVar = this.f5226m;
            if (jvbVar != null) {
                jvbVar.close();
            }
            kba kbaVar = this.f5227n;
            if (kbaVar != null) {
                kbaVar.close();
            }
            Iterator it = this.f5219f.iterator();
            while (it.hasNext()) {
                ((iqc) it.next()).mo3470a(pointF);
            }
            cdh cdhVarM10701f = this.f5223j.m10701f();
            iuj iujVar = this.f5220g;
            if (!((ite) iujVar).f32068S) {
                iujVar.mo11765p();
            } else if (iujVar.mo11743X()) {
                this.f5220g.mo11731L();
            }
            if (this.f5222i.mo16813g()) {
                ((hnn) this.f5222i.mo16809c()).mo10510s();
            }
            if (this.f5222i.mo16813g() && ((Boolean) this.f5225l.mo3831be()).booleanValue() && !((hnn) this.f5222i.mo16809c()).mo10513v()) {
                if (((Boolean) this.f5224k.mo3831be()).booleanValue()) {
                    ((hnn) this.f5222i.mo16809c()).mo10501j();
                }
                ((hnn) this.f5222i.mo16809c()).mo10504m(mrm.m16829i(pointF));
            } else {
                ilv ilvVarMo4147e = this.f5214a.mo4147e(pointF);
                this.f5215b = ilvVarMo4147e;
                ilvVarMo4147e.mo11450b(new ccb(this, 9));
            }
            jvb jvbVar2 = new jvb();
            this.f5226m = jvbVar2;
            cdj cdjVarMo3426a = this.f5217d.mo3426a(jvbVar2, this.f5218e, pointF, cdhVarM10701f);
            ilv ilvVar3 = this.f5215b;
            jvh.m13563k(ilvVar3 == null ? kxk.m14965K(true) : ((ima) ilvVar3).f31472b, cdjVarMo3426a.mo3437b(), this.f5229p, jvh.m13554b());
            this.f5227n = cdhVarM10701f.f5299a.mo3830a(new cbx(cdjVarMo3426a, 5), not.INSTANCE);
            jvh.m13562j(cdjVarMo3426a.mo3438c(), new cdc(cdhVarM10701f, cdjVarMo3426a, 1), not.INSTANCE);
            return true;
        }
        return false;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5228o = true;
        jvb jvbVar = this.f5226m;
        if (jvbVar != null) {
            jvbVar.close();
        }
        kba kbaVar = this.f5227n;
        if (kbaVar != null) {
            kbaVar.close();
        }
    }
}
