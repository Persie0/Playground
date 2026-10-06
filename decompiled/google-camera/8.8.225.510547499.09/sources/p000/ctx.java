package p000;

import android.view.Surface;
import com.pairip.VMRunner;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctx implements ctq {

    /* JADX INFO: renamed from: a */
    public static final nbh f9507a = nbh.m17259h("com/google/android/apps/camera/camcorder/frameserver/CamcorderFrameServerImpl");

    /* JADX INFO: renamed from: b */
    public static final ckh f9508b = new ckb();

    /* JADX INFO: renamed from: A */
    public final Executor f9509A;

    /* JADX INFO: renamed from: B */
    public final Set f9510B;

    /* JADX INFO: renamed from: D */
    public final khy f9512D;

    /* JADX INFO: renamed from: E */
    public kho f9513E;

    /* JADX INFO: renamed from: F */
    public kho f9514F;

    /* JADX INFO: renamed from: G */
    public final cwd f9515G;

    /* JADX INFO: renamed from: H */
    public final djm f9516H;

    /* JADX INFO: renamed from: I */
    public final djm f9517I;

    /* JADX INFO: renamed from: J */
    private final boolean f9518J;

    /* JADX INFO: renamed from: K */
    private final dsx f9519K;

    /* JADX INFO: renamed from: L */
    private final dfn f9520L;

    /* JADX INFO: renamed from: d */
    public final cqp f9522d;

    /* JADX INFO: renamed from: e */
    public final oju f9523e;

    /* JADX INFO: renamed from: f */
    public final mrm f9524f;

    /* JADX INFO: renamed from: g */
    public final crj f9525g;

    /* JADX INFO: renamed from: h */
    public final int f9526h;

    /* JADX INFO: renamed from: i */
    public csn f9527i;

    /* JADX INFO: renamed from: j */
    public kfk f9528j;

    /* JADX INFO: renamed from: k */
    public kgg f9529k;

    /* JADX INFO: renamed from: l */
    public kgg f9530l;

    /* JADX INFO: renamed from: m */
    public kgg f9531m;

    /* JADX INFO: renamed from: n */
    public kgg f9532n;

    /* JADX INFO: renamed from: o */
    public ihw f9533o;

    /* JADX INFO: renamed from: p */
    public Surface f9534p;

    /* JADX INFO: renamed from: q */
    public kfc f9535q;

    /* JADX INFO: renamed from: r */
    public kfc f9536r;

    /* JADX INFO: renamed from: s */
    public kfc f9537s;

    /* JADX INFO: renamed from: t */
    public csd f9538t;

    /* JADX INFO: renamed from: u */
    public dni f9539u;

    /* JADX INFO: renamed from: v */
    public ccz f9540v;

    /* JADX INFO: renamed from: w */
    public gaf f9541w;

    /* JADX INFO: renamed from: x */
    public final ddq f9542x;

    /* JADX INFO: renamed from: y */
    public final cte f9543y;

    /* JADX INFO: renamed from: z */
    public final jww f9544z;

    /* JADX INFO: renamed from: c */
    public final Object f9521c = new Object();

    /* JADX INFO: renamed from: C */
    public boolean f9511C = false;

    public ctx(khy khyVar, cqp cqpVar, oju ojuVar, djm djmVar, mrm mrmVar, crj crjVar, dfn dfnVar, cwd cwdVar, dhv dhvVar, ddq ddqVar, djm djmVar2, dsx dsxVar, cte cteVar, jww jwwVar, Executor executor, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9512D = khyVar;
        this.f9522d = cqpVar;
        this.f9523e = ojuVar;
        this.f9516H = djmVar;
        this.f9524f = mrmVar;
        this.f9525g = crjVar;
        this.f9520L = dfnVar;
        this.f9515G = cwdVar;
        this.f9526h = ((Integer) dhvVar.mo6173a(dib.f11362d).get()).intValue() + ((Integer) dhvVar.mo6173a(dib.f11363e).get()).intValue();
        this.f9518J = dhvVar.mo6183k(dib.f11244aD);
        this.f9542x = ddqVar;
        this.f9517I = djmVar2;
        this.f9519K = dsxVar;
        this.f9543y = cteVar;
        this.f9544z = jwwVar;
        this.f9509A = executor;
        this.f9510B = set;
    }

    /* JADX INFO: renamed from: c */
    private static long m5511c(csn csnVar) {
        return csnVar.f9334F ? 2L : 1L;
    }

    /* JADX INFO: renamed from: a */
    public void m5512a() {
        VMRunner.invoke("wACp0gxxt0oxUxd3", new Object[]{this});
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5513b(csn csnVar) {
        return this.f9516H.m6229c(csnVar) || csnVar.f9331C || csnVar.f9330B;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9521c) {
            kfk kfkVar = this.f9528j;
            if (kfkVar != null) {
                kfkVar.close();
                this.f9528j = null;
            }
            kfc kfcVar = this.f9535q;
            if (kfcVar != null) {
                kfcVar.close();
                this.f9535q = null;
            }
            kfc kfcVar2 = this.f9536r;
            if (kfcVar2 != null) {
                kfcVar2.close();
                this.f9536r = null;
            }
            kfc kfcVar3 = this.f9537s;
            if (kfcVar3 != null) {
                kfcVar3.close();
                this.f9537s = null;
            }
            cte cteVar = this.f9543y;
            if (cteVar.f9421b.mo16813g()) {
                ((ipp) cteVar.f9421b.mo16809c()).close();
                cteVar.f9421b = mqu.f41450a;
            }
            this.f9513E = null;
            this.f9514F = null;
            this.f9511C = true;
        }
    }
}
