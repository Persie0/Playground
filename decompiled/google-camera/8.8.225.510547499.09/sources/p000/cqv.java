package p000;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqv implements crd {

    /* JADX INFO: renamed from: a */
    public final kfk f9043a;

    /* JADX INFO: renamed from: b */
    public final csl f9044b;

    /* JADX INFO: renamed from: c */
    public nqf f9045c;

    /* JADX INFO: renamed from: d */
    private final jvs f9046d = new jvs(jzn.m13827o("CdrStdFocus", 1), 8, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: e */
    private boolean f9047e;

    /* JADX INFO: renamed from: f */
    private final cwd f9048f;

    /* JADX INFO: renamed from: g */
    private final drj f9049g;

    /* JADX INFO: renamed from: h */
    private final dfn f9050h;

    public cqv(csm csmVar, ggi ggiVar, cwd cwdVar, kpa kpaVar, dhv dhvVar, drj drjVar, jwn jwnVar, kfk kfkVar, csn csnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        csl cslVarM5464a = csmVar.m5464a();
        this.f9044b = cslVarM5464a;
        this.f9043a = kfkVar;
        this.f9048f = cwdVar;
        this.f9049g = drjVar;
        this.f9050h = new dfn(cslVarM5464a.f9290t, ggiVar, (fvu) csnVar.f9335G.f12521a, jwnVar, kpaVar, dhvVar, (byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public final void m5382b() {
        synchronized (this) {
            nqf nqfVar = this.f9045c;
            if (nqfVar != null) {
                nqfVar.cancel(false);
            }
            this.f9045c = nqf.m17621g();
            this.f9046d.m13585b();
        }
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        m5382b();
        if (!this.f9047e) {
            this.f9047e = true;
            this.f9048f.m5657d(cum.f9657e).m13537d(this.f9044b.f9271a.mo3830a(new ckv(this, 7), not.INSTANCE));
        }
        boolean z = !((Boolean) ((jwf) this.f9049g.f12398d).f34942d).booleanValue();
        kew kewVarMo14115b = this.f9043a.mo14115b();
        kgo kgoVar = (kgo) kewVarMo14115b;
        kgoVar.f35933d = 1;
        kgoVar.f35937h = this.f9050h.m6073i((PointF) bkoVar.f3652a);
        if (z) {
            kgoVar.f35938i = this.f9050h.m6073i((PointF) bkoVar.f3652a);
        }
        this.f9043a.mo14125l(kewVarMo14115b.mo14090a(), bzq.m3271k());
        this.f9044b.f9278h.mo3415bf(false);
        m5383c();
        return new hos(this, bkoVar, 1, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m5383c() {
        synchronized (this) {
            try {
                this.f9046d.execute(new cqr(this, 3));
            } catch (RejectedExecutionException e) {
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m5382b();
        this.f9048f.m5658e(cum.f9657e);
        this.f9046d.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m5384d(boolean z, boolean z2) {
        if (z2) {
            this.f9044b.f9274d.mo3415bf(false);
            this.f9044b.f9271a.mo3415bf(0);
        }
        if (z) {
            this.f9044b.f9275e.mo3415bf(false);
        }
        this.f9043a.mo14126m(z, z2, false);
        kew kewVarMo14115b = this.f9043a.mo14115b();
        if (z) {
            ((kgo) kewVarMo14115b).f35937h = this.f9050h.m6072h();
        }
        if (z2) {
            ((kgo) kewVarMo14115b).f35938i = this.f9050h.m6072h();
        }
        ((kgo) kewVarMo14115b).f35939j = this.f9050h.m6072h();
        this.f9043a.mo14127n(kewVarMo14115b.mo14090a());
        if (z) {
            this.f9044b.f9278h.mo3415bf(true);
        }
    }
}
