package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hez implements hfd {

    /* JADX INFO: renamed from: b */
    public mrm f27520b;

    /* JADX INFO: renamed from: c */
    public mrm f27521c;

    /* JADX INFO: renamed from: d */
    public final Set f27522d;

    /* JADX INFO: renamed from: e */
    private final Executor f27523e;

    /* JADX INFO: renamed from: f */
    private final jwn f27524f;

    /* JADX INFO: renamed from: g */
    private final fcp f27525g;

    /* JADX INFO: renamed from: h */
    private final jww f27526h;

    /* JADX INFO: renamed from: k */
    private ikw f27529k;

    /* JADX INFO: renamed from: l */
    private mrm f27530l;

    /* JADX INFO: renamed from: i */
    private float f27527i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f27528j = 1.0f;

    /* JADX INFO: renamed from: a */
    public boolean f27519a = false;

    public hez(mrm mrmVar, jwn jwnVar, fcp fcpVar, jww jwwVar) {
        mqu mquVar = mqu.f41450a;
        this.f27520b = mquVar;
        this.f27530l = mquVar;
        this.f27521c = mquVar;
        this.f27522d = Collections.synchronizedSet(new HashSet());
        this.f27524f = jwnVar;
        lku.m15669w(mrmVar.mo16813g());
        this.f27523e = (Executor) mrmVar.mo16809c();
        this.f27525g = fcpVar;
        this.f27526h = jwwVar;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: c */
    public final synchronized kba mo10167c(mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        synchronized (this) {
            this.f27520b = mrmVar;
            this.f27530l = mrmVar2;
            this.f27521c = mrmVar3;
        }
        return new gjm(this, mrmVar, mrmVar2, mrmVar3, 2);
        return new gjm(this, mrmVar, mrmVar2, mrmVar3, 2);
    }

    @Override // p000.kpy
    /* JADX INFO: renamed from: ca */
    public final void mo8395ca() {
        synchronized (this) {
            if (!this.f27530l.mo16813g()) {
                this.f27527i = this.f27528j;
                return;
            }
            kpw kpwVarMo8329d = ((fgy) this.f27530l.mo16809c()).mo8329d();
            if (kpwVarMo8329d != null) {
                this.f27523e.execute(new hea(this, kpwVarMo8329d, 7));
                kpwVarMo8329d.close();
            }
        }
    }

    @Override // p000.hem
    /* JADX INFO: renamed from: d */
    public final void mo6091d() {
        if (this.f27527i != this.f27528j) {
            fcp fcpVar = this.f27525g;
            double dFloatValue = ((Float) this.f27526h.mo3831be()).floatValue() - this.f27527i;
            Double.isNaN(dFloatValue);
            double dRound = Math.round(dFloatValue * 10.0d);
            float fFloatValue = ((Float) this.f27526h.mo3831be()).floatValue();
            float f = this.f27527i;
            float f2 = fFloatValue - f;
            double d = f;
            double d2 = f2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double dRound2 = Math.round((d2 / (d + 1.0E-6d)) * 100.0d);
            float fFloatValue2 = ((Float) this.f27526h.mo3831be()).floatValue();
            Double.isNaN(dRound);
            Double.isNaN(dRound2);
            fcpVar.mo8183c((float) (dRound / 10.0d), (float) (dRound2 / 100.0d), fFloatValue2);
        }
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: e */
    public final void mo10168e(hfc hfcVar) {
        this.f27522d.add(hfcVar);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m10169f(mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        if (this.f27520b.mo16813g() && this.f27520b.mo16809c() == ((mrq) mrmVar).f41482a) {
            this.f27520b = mqu.f41450a;
        }
        if (this.f27521c.mo16813g() && mrmVar3.mo16813g() && this.f27521c.mo16809c() == mrmVar3.mo16809c()) {
            this.f27523e.execute(new gxw((hfe) mrmVar3.mo16809c(), 17));
            this.f27521c = mqu.f41450a;
        }
        if (this.f27530l.mo16813g() && this.f27530l.mo16809c() == ((mrq) mrmVar2).f41482a) {
            this.f27530l = mqu.f41450a;
        }
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: g */
    public final void mo10170g() {
        if (!((hno) this.f27524f.mo3831be()).equals(hno.INACTIVE) || this.f27529k.equals(ikw.VIDEO) || this.f27529k.equals(ikw.AMBER)) {
            return;
        }
        synchronized (this) {
            this.f27519a = true;
        }
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: h */
    public final void mo10171h(hfc hfcVar) {
        this.f27522d.remove(hfcVar);
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: i */
    public final void mo10172i(ikw ikwVar) {
        this.f27529k = ikwVar;
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: j */
    public final void mo10173j(float f) {
        this.f27528j = f;
    }

    @Override // p000.hfd
    /* JADX INFO: renamed from: k */
    public final void mo10174k(float f) {
        this.f27527i = f;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
    }
}
