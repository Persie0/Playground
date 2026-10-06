package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dxj implements inp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicBoolean f12828a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AtomicBoolean f12829b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f12830c;

    public dxj(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.f12828a = atomicBoolean;
        this.f12829b = atomicBoolean2;
        this.f12830c = j;
    }

    @Override // p000.inp
    /* JADX INFO: renamed from: a */
    public final boolean mo6844a(naf nafVar) {
        if (!this.f12828a.get()) {
            return true;
        }
        myx myxVarMo16929k = nafVar.mo16929k();
        myxVarMo16929k.getClass();
        myx myxVarMo16928j = nafVar.mo16928j();
        myxVarMo16928j.getClass();
        return this.f12829b.get() && ((Long) myxVarMo16929k.mo17162b()).longValue() - ((Long) myxVarMo16928j.mo17162b()).longValue() > this.f12830c;
    }
}
