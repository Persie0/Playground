package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzp implements fzt {

    /* JADX INFO: renamed from: a */
    private final fzt f23982a;

    /* JADX INFO: renamed from: b */
    private final nps f23983b;

    /* JADX INFO: renamed from: c */
    private final eip f23984c;

    /* JADX INFO: renamed from: d */
    private final C1058va f23985d;

    public fzp(fzt fztVar, nps npsVar, eip eipVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23982a = fztVar;
        this.f23983b = npsVar;
        this.f23984c = eipVar;
        this.f23985d = c1058va;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        eip eipVar = this.f23984c;
        long jMo7248d = kpwVar.mo7248d();
        synchronized (((C1058va) eipVar.f14167b).f47803b) {
            Set set = ((fzr) eipVar.f14166a).f23992d;
            Long lValueOf = Long.valueOf(jMo7248d);
            set.add(lValueOf);
            ((C1058va) eipVar.f14167b).f47804c.put(lValueOf, eipVar.f14166a);
        }
        if (Arrays.asList(37, 38, 32).contains(Integer.valueOf(kpwVar.mo7245a()))) {
            kmv kmvVar = new kmv(kpwVar, 2);
            this.f23985d.m19487o(new fxn(new kmw(kmvVar), npsVar));
            this.f23982a.mo3602a(new kmw(kmvVar), npsVar);
        } else if (kpwVar.mo7245a() == 35) {
            kmv kmvVar2 = new kmv(kpwVar, 2);
            this.f23985d.m19490r(new fxn(new kmw(kmvVar2), npsVar));
            this.f23982a.mo3602a(new kmw(kmvVar2), npsVar);
        } else {
            this.f23982a.mo3602a(kpwVar, npsVar);
        }
        this.f23985d.m19489q(kpwVar.mo7248d(), npsVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23983b.mo2282d(new fzz(this.f23984c, 1, null), not.INSTANCE);
        this.f23982a.close();
    }
}
