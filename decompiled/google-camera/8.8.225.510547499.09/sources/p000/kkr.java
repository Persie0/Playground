package p000;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkr extends kky {

    /* JADX INFO: renamed from: a */
    public final jwf f36403a;

    /* JADX INFO: renamed from: b */
    public final long f36404b;

    public kkr(kgi kgiVar, kmg kmgVar, kbc kbcVar, int i, boolean z) {
        super(kgiVar, kmgVar, z);
        jwf jwfVar = new jwf(mqu.f41450a);
        this.f36403a = jwfVar;
        this.f36404b = lme.m15724j(i, kbcVar);
        mrm mrmVar = kgiVar.f35901c;
        if (mrmVar.mo16813g()) {
            jwfVar.mo3415bf(mrmVar);
        }
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: a */
    public final int mo14191a() {
        return this.f36447h.f35903e;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: b */
    public final kbc mo14192b() {
        return this.f36447h.f35902d;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: d */
    public final void mo14194d(Surface surface) {
        if (surface == null) {
            this.f36403a.mo3415bf(mqu.f41450a);
            return;
        }
        mrm mrmVar = (mrm) this.f36403a.f34942d;
        if (mrmVar.mo16813g() && surface == mrmVar.mo16809c()) {
            return;
        }
        this.f36403a.mo3415bf(mrm.m16829i(surface));
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: f */
    public final long mo14451f() {
        return this.f36404b;
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: g */
    public final Surface mo14452g() {
        return (Surface) ((mrm) this.f36403a.f34942d).mo16812f();
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: h */
    public final kgj mo14453h() {
        return this.f36447h.f35899a;
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: i */
    public final boolean mo14454i() {
        return true;
    }
}
