package p000;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqt implements crd {

    /* JADX INFO: renamed from: a */
    public final kfk f9026a;

    /* JADX INFO: renamed from: b */
    public final csl f9027b;

    /* JADX INFO: renamed from: c */
    public final ccs f9028c;

    /* JADX INFO: renamed from: e */
    public nqf f9030e;

    /* JADX INFO: renamed from: h */
    private final drj f9033h;

    /* JADX INFO: renamed from: i */
    private final dfn f9034i;

    /* JADX INFO: renamed from: g */
    private final jvs f9032g = new jvs(jzn.m13827o("CdrSCFocus", 1), 2, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: d */
    public final Runnable f9029d = new cqr(this, 2, null);

    /* JADX INFO: renamed from: f */
    public final Object f9031f = new Object();

    public cqt(csm csmVar, ggi ggiVar, ccs ccsVar, drj drjVar, kpa kpaVar, dhv dhvVar, jwn jwnVar, kfk kfkVar, csn csnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        csl cslVarM5464a = csmVar.m5464a();
        this.f9027b = cslVarM5464a;
        this.f9026a = kfkVar;
        this.f9028c = ccsVar;
        this.f9033h = drjVar;
        this.f9034i = new dfn(cslVarM5464a.f9290t, ggiVar, (fvu) csnVar.f9335G.f12521a, jwnVar, kpaVar, dhvVar, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    private final void m5376c() {
        try {
            this.f9032g.execute(new cqr(this, 0));
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5377b(boolean z, boolean z2) {
        if (z) {
            this.f9028c.m3466c(this.f9029d);
            this.f9027b.f9278h.mo3415bf(true);
            this.f9027b.f9275e.mo3415bf(false);
        }
        if (z2) {
            this.f9033h.m6626f();
        }
        this.f9026a.mo14126m(z, z2, false);
        kew kewVarMo14115b = this.f9026a.mo14115b();
        if (z) {
            ((kgo) kewVarMo14115b).f35937h = this.f9034i.m6072h();
        }
        if (z2) {
            ((kgo) kewVarMo14115b).f35938i = this.f9034i.m6072h();
        }
        ((kgo) kewVarMo14115b).f35939j = this.f9034i.m6072h();
        this.f9026a.mo14127n(kewVarMo14115b.mo14090a());
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        cqs cqsVar;
        this.f9032g.m13585b();
        synchronized (this.f9031f) {
            nqf nqfVar = this.f9030e;
            if (nqfVar != null) {
                nqfVar.cancel(true);
            }
            this.f9028c.m3466c(this.f9029d);
            kew kewVarMo14115b = this.f9026a.mo14115b();
            boolean z = !((Boolean) ((jwf) this.f9033h.f12398d).f34942d).booleanValue();
            ((kgo) kewVarMo14115b).f35933d = 1;
            ((kgo) kewVarMo14115b).f35937h = this.f9034i.m6073i((PointF) bkoVar.f3652a);
            if (z) {
                ((kgo) kewVarMo14115b).f35938i = this.f9034i.m6073i((PointF) bkoVar.f3652a);
            }
            this.f9026a.mo14125l(kewVarMo14115b.mo14090a(), bzq.m3271k());
            this.f9027b.f9278h.mo3415bf(false);
            nqf nqfVarM17621g = nqf.m17621g();
            this.f9030e = nqfVarM17621g;
            m5376c();
            cqsVar = new cqs(this, nqfVarM17621g, bkoVar, null, null, null);
        }
        return cqsVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9031f) {
            this.f9032g.close();
        }
    }
}
