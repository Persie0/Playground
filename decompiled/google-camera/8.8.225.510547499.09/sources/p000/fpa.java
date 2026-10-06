package p000;

import android.content.res.Configuration;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpa extends chw {

    /* JADX INFO: renamed from: p */
    private static final nbh f22999p = nbh.m17259h("com/google/android/apps/camera/modules/video/OneVideoModule");

    /* JADX INFO: renamed from: c */
    public final oju f23001c;

    /* JADX INFO: renamed from: d */
    public final oju f23002d;

    /* JADX INFO: renamed from: e */
    public final oju f23003e;

    /* JADX INFO: renamed from: f */
    public final jvd f23004f;

    /* JADX INFO: renamed from: g */
    public final huu f23005g;

    /* JADX INFO: renamed from: h */
    public final dac f23006h;

    /* JADX INFO: renamed from: i */
    public final oju f23007i;

    /* JADX INFO: renamed from: j */
    public final csm f23008j;

    /* JADX INFO: renamed from: k */
    public final iuj f23009k;

    /* JADX INFO: renamed from: l */
    public final msi f23010l;

    /* JADX INFO: renamed from: o */
    public ikw f23013o;

    /* JADX INFO: renamed from: q */
    private final jvb f23014q;

    /* JADX INFO: renamed from: r */
    private chw f23015r;

    /* JADX INFO: renamed from: b */
    public final Object f23000b = new Object();

    /* JADX INFO: renamed from: m */
    public boolean f23011m = false;

    /* JADX INFO: renamed from: n */
    public Runnable f23012n = null;

    public fpa(oju ojuVar, oju ojuVar2, oju ojuVar3, huu huuVar, jvd jvdVar, dac dacVar, oju ojuVar4, cxo cxoVar, csm csmVar, jww jwwVar, iuj iujVar, msi msiVar) {
        this.f23001c = ojuVar;
        this.f23002d = ojuVar2;
        this.f23003e = ojuVar3;
        this.f23004f = jvdVar;
        this.f23005g = huuVar;
        this.f23006h = dacVar;
        this.f23007i = ojuVar4;
        this.f23008j = csmVar;
        this.f23009k = iujVar;
        this.f23010l = msiVar;
        jvb jvbVar = new jvb();
        this.f23014q = jvbVar;
        this.f23013o = (ikw) jwwVar.mo3831be();
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (this.f23013o.ordinal()) {
            case 2:
                this.f23015r = (chw) ojuVar.get();
                break;
            case 5:
                this.f23015r = (chw) ojuVar2.get();
                break;
            case 13:
                this.f23015r = (chw) ojuVar3.get();
                break;
            default:
                ((nbe) ((nbe) f22999p.m17252c()).mo17276G((char) 2430)).mo17293r("Fall back to default mode since the initial mode is unsupported: %s", jwwVar.mo3831be());
                this.f23015r = (chw) ojuVar.get();
                this.f23013o = ikw.VIDEO;
                break;
        }
        jvbVar.m13537d(dacVar.mo5801m(new AmbientModeSupport.AmbientController(this)));
        jvbVar.m13537d(cxoVar.m5717b(new cxl(this, 2)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: x */
    private final boolean m8657x() {
        boolean z;
        synchronized (this.f23000b) {
            z = true;
            if (!this.f23013o.equals(ikw.VIDEO) || !(this.f23015r instanceof fpf)) {
                if ((!this.f23013o.equals(ikw.TIME_LAPSE) || !(this.f23015r instanceof hox)) && (!this.f23013o.equals(ikw.SLOW_MOTION) || !(this.f23015r instanceof foy))) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        synchronized (this.f23000b) {
            this.f23015r.mo3767bS(i);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bT */
    public final void mo3768bT(boolean z) {
        synchronized (this.f23000b) {
            this.f23015r.mo3768bT(z);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        synchronized (this.f23000b) {
            if (m8657x()) {
                this.f23015r.mo3769bU();
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        synchronized (this.f23000b) {
            this.f23015r.m3776j();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        String strMo3773c;
        synchronized (this.f23000b) {
            strMo3773c = this.f23015r.mo3773c();
        }
        return strMo3773c;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23000b) {
            this.f23015r.close();
        }
        this.f23014q.close();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: d */
    public final void mo3774d(bnq bnqVar) {
        synchronized (this.f23000b) {
            this.f23015r.mo3774d(bnqVar);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: e */
    public final void mo3775e(Configuration configuration) {
        synchronized (this.f23000b) {
            this.f23015r.mo3775e(configuration);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this.f23000b) {
            if (m8657x()) {
                this.f23015r.m3779m();
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        synchronized (this.f23000b) {
            if (m8657x()) {
                this.f23015r.m3771bW();
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        synchronized (this.f23000b) {
            this.f23015r.m3782q();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        boolean zMo3785t;
        synchronized (this.f23000b) {
            zMo3785t = this.f23015r.mo3785t();
        }
        return zMo3785t;
    }

    /* JADX INFO: renamed from: w */
    public final void m8658w(chw chwVar, ikw ikwVar) {
        synchronized (this.f23000b) {
            mo3770bV();
            mo3781p();
            this.f23015r = chwVar;
            this.f23013o = ikwVar;
            mo3769bU();
            mo3780n();
            mo3778l();
            this.f23011m = false;
            Runnable runnable = this.f23012n;
            if (runnable != null) {
                runnable.run();
                this.f23012n = null;
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: s */
    public final void mo3784s(Runnable runnable) {
        synchronized (this.f23000b) {
            if (this.f23011m) {
                this.f23012n = runnable;
            } else {
                this.f23015r.mo3784s(runnable);
            }
        }
    }
}
