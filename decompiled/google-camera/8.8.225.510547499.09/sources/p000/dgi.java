package p000;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgi implements kos, hes, hem {

    /* JADX INFO: renamed from: a */
    public static final nbh f10888a = nbh.m17259h(xPAWq.JyduPqwwcOBWs);

    /* JADX INFO: renamed from: b */
    public static final long f10889b;

    /* JADX INFO: renamed from: c */
    public final mrm f10890c;

    /* JADX INFO: renamed from: d */
    public final dgz f10891d;

    /* JADX INFO: renamed from: e */
    public final dgl f10892e;

    /* JADX INFO: renamed from: f */
    public final ggm f10893f;

    /* JADX INFO: renamed from: g */
    public mrm f10894g;

    /* JADX INFO: renamed from: h */
    public mrm f10895h;

    /* JADX INFO: renamed from: i */
    public boolean f10896i = false;

    /* JADX INFO: renamed from: j */
    public boolean f10897j = false;

    /* JADX INFO: renamed from: k */
    public boolean f10898k = false;

    /* JADX INFO: renamed from: l */
    public mrm f10899l;

    /* JADX INFO: renamed from: m */
    public long f10900m;

    /* JADX INFO: renamed from: n */
    public boolean f10901n;

    /* JADX INFO: renamed from: o */
    private final ScheduledExecutorService f10902o;

    /* JADX INFO: renamed from: p */
    private final jww f10903p;

    /* JADX INFO: renamed from: q */
    private mrm f10904q;

    static {
        double millis = TimeUnit.SECONDS.toMillis(1L);
        Double.isNaN(millis);
        f10889b = (long) (millis / 30.0d);
    }

    public dgi(mrm mrmVar, dgl dglVar, ggm ggmVar, jww jwwVar, ScheduledExecutorService scheduledExecutorService, fcp fcpVar) {
        mqu mquVar = mqu.f41450a;
        this.f10899l = mquVar;
        this.f10904q = mquVar;
        this.f10901n = false;
        this.f10902o = scheduledExecutorService;
        this.f10890c = mrmVar;
        this.f10892e = dglVar;
        this.f10903p = jwwVar;
        this.f10893f = ggmVar;
        this.f10891d = new dha(3, fcpVar);
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6101c() {
        int i = 0;
        this.f10897j = false;
        this.f10898k = false;
        if (this.f10896i) {
            dfo dfoVar = (dfo) ((mrq) this.f10894g).f41482a;
            if (dfoVar.f10798e.mo16813g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dfoVar.f10798e.mo16809c();
                if (cameraCoachHudView.f6591b.mo16813g()) {
                    cameraCoachHudView.post(new dfq(cameraCoachHudView, i));
                }
            }
            ((elx) ((mrq) this.f10895h).f41482a).mo7489k(ely.SECOND_RUN_TOAST);
            this.f10896i = false;
        }
    }

    @Override // p000.hem
    /* JADX INFO: renamed from: d */
    public final void mo6091d() {
        if (this.f10896i) {
            if (this.f10898k) {
                this.f10891d.mo6135c(njf.HEEDED);
            } else {
                this.f10891d.mo6135c(njf.NOT_HEEDED);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final synchronized void m6102e() {
        lku.m15613H(true);
        if (this.f10904q.mo16813g()) {
            ((jvb) this.f10904q.mo16809c()).close();
        }
        jvb jvbVar = new jvb();
        jvbVar.m13537d(dfo.m6076e(new dfq(this, 10), this.f10902o));
        jvbVar.m13537d(this.f10903p.mo3830a(new czq(this, 15), this.f10902o));
        this.f10893f.mo9217g(this);
        jvbVar.m13537d(new dev(this, 7));
        this.f10891d.mo6133a();
        this.f10904q = mrm.m16829i(jvbVar);
        this.f10892e.m6107b();
    }

    /* JADX INFO: renamed from: f */
    public final void m6103f(boolean z) {
        this.f10901n = z;
        if (z) {
            return;
        }
        m6101c();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6104g() {
        m6101c();
        if (this.f10904q.mo16813g()) {
            ((jvb) this.f10904q.mo16809c()).close();
            this.f10904q = mqu.f41450a;
        }
        this.f10891d.mo6134b();
        this.f10892e.m6107b();
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        this.f10902o.execute(new dfq(this, 12));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        m6103f(false);
        this.f10902o.execute(new dfq(this, 11));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        m6103f(true);
        this.f10902o.execute(new dfq(this, 9));
    }
}
