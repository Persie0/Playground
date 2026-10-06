package p000;

import android.util.Range;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgl {

    /* JADX INFO: renamed from: a */
    public static final Range f10910a = Range.create(Double.valueOf(-20.0d), Double.valueOf(30.0d));

    /* JADX INFO: renamed from: b */
    public final dhe f10911b;

    /* JADX INFO: renamed from: c */
    public mrm f10912c;

    /* JADX INFO: renamed from: d */
    public mrm f10913d;

    /* JADX INFO: renamed from: e */
    private final dhd f10914e;

    /* JADX INFO: renamed from: f */
    private final dhd f10915f;

    /* JADX INFO: renamed from: g */
    private final dge f10916g;

    /* JADX INFO: renamed from: h */
    private final boolean f10917h;

    /* JADX INFO: renamed from: i */
    private mrm f10918i;

    /* JADX INFO: renamed from: j */
    private boolean f10919j;

    /* JADX INFO: renamed from: k */
    private final imv f10920k;

    public dgl(dge dgeVar, dhv dhvVar) {
        dgj dgjVar = new dgj(this, 1);
        this.f10914e = dgjVar;
        dgj dgjVar2 = new dgj(this, 0);
        this.f10915f = dgjVar2;
        mqu mquVar = mqu.f41450a;
        this.f10912c = mquVar;
        this.f10918i = mquVar;
        this.f10913d = mquVar;
        this.f10919j = false;
        this.f10916g = dgeVar;
        this.f10917h = dhvVar.mo6184l(dhi.f11117d);
        this.f10920k = new imv(0.015f, null);
        dhvVar.mo6177e();
        dhvVar.mo6177e();
        this.f10911b = new dhe(dgjVar, dgjVar2, 1000L);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0005  */
    /* JADX INFO: renamed from: a */
    final synchronized void m6106a(float f, float f2, long j) {
        if (this.f10917h) {
            mrm mrmVarM6098a = this.f10916g.m6098a();
            if (mrmVarM6098a.mo16813g()) {
                gsr gsrVarM6886b = ((dxx) ((cvy) mrmVarM6098a.mo16809c()).f9845b).m6886b();
                if (gsrVarM6886b != null) {
                    this.f10919j = this.f10920k.m11497a(gsrVarM6886b.f26257q, gsrVarM6886b.f26255o);
                    if (this.f10918i.mo16813g()) {
                        this.f10913d = mrm.m16829i(Float.valueOf(((fkp) ((cvy) mrmVarM6098a.mo16809c()).f9844a).m8525a((gsr) this.f10918i.mo16809c(), gsrVarM6886b)));
                    }
                    this.f10918i = mrm.m16829i(gsrVarM6886b);
                    this.f10912c = mrm.m16829i(new dgk(f, f2, this.f10919j));
                    boolean zM6149c = this.f10911b.m6149c();
                    this.f10911b.m6148b(j);
                    if (this.f10911b.m6149c() != zM6149c) {
                        this.f10911b.m6149c();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6107b() {
        this.f10912c = mqu.f41450a;
        this.f10911b.m6147a();
    }
}
