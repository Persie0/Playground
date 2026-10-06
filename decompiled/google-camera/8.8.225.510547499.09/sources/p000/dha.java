package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dha implements dgz {

    /* JADX INFO: renamed from: b */
    private static final nbh f11017b = nbh.m17259h("com/google/android/apps/camera/coach/logging/FramingHintLoggingImpl");

    /* JADX INFO: renamed from: a */
    public final fcp f11018a;

    /* JADX INFO: renamed from: c */
    private final Executor f11019c;

    /* JADX INFO: renamed from: d */
    private mrm f11020d;

    /* JADX INFO: renamed from: e */
    private mrm f11021e;

    /* JADX INFO: renamed from: f */
    private mrm f11022f;

    /* JADX INFO: renamed from: g */
    private final int f11023g;

    public dha(int i, fcp fcpVar) {
        mqu mquVar = mqu.f41450a;
        this.f11020d = mquVar;
        this.f11021e = mquVar;
        this.f11022f = mquVar;
        this.f11023g = i;
        this.f11018a = fcpVar;
        this.f11019c = jzn.m13824l("FramingHintLog");
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: a */
    public final synchronized void mo6133a() {
        this.f11020d = mrm.m16829i(new dhc(this.f11023g, System.currentTimeMillis()));
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: b */
    public final synchronized void mo6134b() {
        if (this.f11020d.mo16813g()) {
            this.f11018a.mo8138M(((dhc) this.f11020d.mo16809c()).m6144a(System.currentTimeMillis()));
        }
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6135c(njf njfVar) {
        if (this.f11021e.mo16813g()) {
            ((dhb) this.f11021e.mo16809c()).m6141a(njfVar);
        }
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: d */
    public final synchronized void mo6136d() {
        if (this.f11021e.mo16813g()) {
            ((dhb) this.f11021e.mo16809c()).m6142b(System.currentTimeMillis());
        } else {
            ((nbe) ((nbe) f11017b.m17251b()).mo17276G((char) 876)).mo17290o("framing hint heed but no hint is showing.");
        }
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: e */
    public final synchronized void mo6137e(mrm mrmVar) {
        if (!this.f11020d.mo16813g()) {
            ((nbe) ((nbe) f11017b.m17251b()).mo17276G((char) 877)).mo17290o("Log framing shown hint but status info is not available.");
            return;
        }
        ((dhc) this.f11020d.mo16809c()).m6145b();
        dhb dhbVar = new dhb(this.f11023g, ((dhc) this.f11020d.mo16809c()).f11031a, System.currentTimeMillis(), mrmVar);
        if (this.f11022f.mo16813g()) {
            dhbVar.f11024a = mrm.m16829i(Long.valueOf(((Long) this.f11022f.mo16809c()).longValue()));
        }
        this.f11021e = mrm.m16829i(dhbVar);
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: f */
    public final synchronized void mo6138f() {
        if (this.f11020d.mo16813g()) {
            ((dhc) this.f11020d.mo16809c()).m6146c();
        } else {
            ((nbe) ((nbe) f11017b.m17251b()).mo17276G((char) 878)).mo17290o("Update framing hint but status info is not available.");
        }
    }

    @Override // p000.dgz
    /* JADX INFO: renamed from: g */
    public final synchronized void mo6139g() {
        if (this.f11021e.mo16813g()) {
            this.f11022f = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
            this.f11019c.execute(new dgq(this, ((dhb) this.f11021e.mo16809c()).m6143c(System.currentTimeMillis()), 2));
            this.f11021e = mqu.f41450a;
        }
    }
}
