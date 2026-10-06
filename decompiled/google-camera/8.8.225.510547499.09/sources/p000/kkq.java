package p000;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkq extends kky {

    /* JADX INFO: renamed from: a */
    public final kkw f36398a;

    /* JADX INFO: renamed from: b */
    public final kbc f36399b;

    /* JADX INFO: renamed from: c */
    public final long f36400c;

    /* JADX INFO: renamed from: d */
    public final int f36401d;

    /* JADX INFO: renamed from: e */
    public final khb f36402e;

    public kkq(kgi kgiVar, kmg kmgVar, kkw kkwVar, int i, boolean z) {
        super(kgiVar, kmgVar, z);
        this.f36398a = kkwVar;
        this.f36401d = i;
        kbc kbcVar = kkwVar.f36418c;
        this.f36399b = kbcVar;
        this.f36400c = lme.m15724j(kkwVar.f36417b, kbcVar);
        this.f36402e = new khb(i);
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: a */
    public final int mo14191a() {
        return this.f36398a.f36417b;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: b */
    public final kbc mo14192b() {
        return this.f36399b;
    }

    @Override // p000.kgg
    /* JADX INFO: renamed from: d */
    public final void mo14194d(Surface surface) {
        throw new UnsupportedOperationException("setSurface should never be called on buffered streams.");
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: f */
    public final long mo14451f() {
        return this.f36400c;
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: g */
    public final Surface mo14452g() {
        return this.f36398a.f36416a.mo14510e();
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: h */
    public final kgj mo14453h() {
        return kgj.f35913a;
    }

    @Override // p000.kky
    /* JADX INFO: renamed from: i */
    public final boolean mo14454i() {
        return this.f36447h.f35908j;
    }
}
