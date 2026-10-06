package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cux implements kba {

    /* JADX INFO: renamed from: a */
    public final kbz f9703a;

    /* JADX INFO: renamed from: b */
    public final oju f9704b;

    /* JADX INFO: renamed from: c */
    public final mrm f9705c;

    /* JADX INFO: renamed from: d */
    public final npu f9706d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f9707e;

    /* JADX INFO: renamed from: f */
    public final oju f9708f;

    /* JADX INFO: renamed from: g */
    public final cuh f9709g;

    /* JADX INFO: renamed from: h */
    public final fca f9710h;

    /* JADX INFO: renamed from: i */
    public final jyq f9711i;

    /* JADX INFO: renamed from: j */
    public final dhv f9712j;

    /* JADX INFO: renamed from: m */
    public jyz f9715m;

    /* JADX INFO: renamed from: o */
    public ctp f9717o;

    /* JADX INFO: renamed from: p */
    public final cwd f9718p;

    /* JADX INFO: renamed from: q */
    public final iay f9719q;

    /* JADX INFO: renamed from: r */
    public final djm f9720r;

    /* JADX INFO: renamed from: s */
    public final djm f9721s;

    /* JADX INFO: renamed from: t */
    public final dsx f9722t;

    /* JADX INFO: renamed from: u */
    public final cvy f9723u;

    /* JADX INFO: renamed from: k */
    public final Object f9713k = new Object();

    /* JADX INFO: renamed from: l */
    public mrm f9714l = mqu.f41450a;

    /* JADX INFO: renamed from: n */
    public boolean f9716n = true;

    public cux(oju ojuVar, iay iayVar, mrm mrmVar, cuh cuhVar, npu npuVar, ScheduledExecutorService scheduledExecutorService, djm djmVar, kbz kbzVar, oju ojuVar2, fca fcaVar, cwd cwdVar, cvy cvyVar, jyq jyqVar, djm djmVar2, dhv dhvVar, dsx dsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f9703a = kbzVar;
        this.f9706d = npuVar;
        this.f9707e = scheduledExecutorService;
        this.f9721s = djmVar;
        this.f9708f = ojuVar2;
        this.f9709g = cuhVar;
        this.f9704b = ojuVar;
        this.f9719q = iayVar;
        this.f9705c = mrmVar;
        this.f9710h = fcaVar;
        this.f9718p = cwdVar;
        this.f9723u = cvyVar;
        this.f9711i = jyqVar;
        this.f9720r = djmVar2;
        this.f9712j = dhvVar;
        this.f9722t = dsxVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9713k) {
            this.f9716n = true;
            jyz jyzVar = this.f9715m;
            if (jyzVar != null) {
                jyzVar.close();
                this.f9715m = null;
            }
            if (this.f9714l.mo16813g()) {
                ((jzz) this.f9714l.mo16809c()).mo5592e();
                this.f9714l = mqu.f41450a;
            }
        }
    }
}
