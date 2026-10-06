package p000;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgu implements kos, hes, hem {

    /* JADX INFO: renamed from: a */
    public final mrm f10975a;

    /* JADX INFO: renamed from: b */
    public final ggm f10976b;

    /* JADX INFO: renamed from: c */
    public final dgw f10977c;

    /* JADX INFO: renamed from: d */
    public final dgz f10978d;

    /* JADX INFO: renamed from: e */
    public mrm f10979e;

    /* JADX INFO: renamed from: f */
    public mrm f10980f;

    /* JADX INFO: renamed from: g */
    public boolean f10981g;

    /* JADX INFO: renamed from: h */
    public boolean f10982h;

    /* JADX INFO: renamed from: i */
    public boolean f10983i;

    /* JADX INFO: renamed from: j */
    public boolean f10984j;

    /* JADX INFO: renamed from: k */
    private final ScheduledExecutorService f10985k;

    /* JADX INFO: renamed from: l */
    private final jww f10986l;

    /* JADX INFO: renamed from: m */
    private mrm f10987m;

    public dgu(mrm mrmVar, dgw dgwVar, ggm ggmVar, jww jwwVar, ScheduledExecutorService scheduledExecutorService, fcp fcpVar) {
        mqu mquVar = mqu.f41450a;
        this.f10979e = mquVar;
        this.f10980f = mquVar;
        this.f10987m = mquVar;
        this.f10981g = false;
        this.f10982h = false;
        this.f10983i = false;
        this.f10984j = false;
        this.f10975a = mrmVar;
        this.f10985k = scheduledExecutorService;
        this.f10976b = ggmVar;
        this.f10977c = dgwVar;
        this.f10986l = jwwVar;
        this.f10978d = new dha(4, fcpVar);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m6123i(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
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
    public final void m6124c() {
        if (this.f10981g) {
            dfo dfoVar = (dfo) this.f10980f.mo16809c();
            if (dfoVar.f10798e.mo16813g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dfoVar.f10798e.mo16809c();
                if (cameraCoachHudView.f6592c.mo16813g()) {
                    cameraCoachHudView.post(new dfq(cameraCoachHudView, 1));
                }
            }
            ((elx) this.f10979e.mo16809c()).mo7489k(ely.SECOND_RUN_TOAST);
            this.f10981g = false;
            this.f10982h = false;
            this.f10983i = false;
            this.f10978d.mo6139g();
        }
    }

    @Override // p000.hem
    /* JADX INFO: renamed from: d */
    public final void mo6091d() {
        if (this.f10981g) {
            if (this.f10982h) {
                this.f10978d.mo6135c(njf.HEEDED);
            } else {
                this.f10978d.mo6135c(njf.NOT_HEEDED);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6125e() {
        if (this.f10987m.mo16813g()) {
            ((jvb) this.f10987m.mo16809c()).close();
        }
        jvb jvbVar = new jvb();
        if (this.f10980f.mo16813g()) {
            jvbVar.m13537d(dfo.m6076e(new dfq(this, 19), this.f10985k));
        }
        jvbVar.m13537d(this.f10986l.mo3830a(new czq(this, 16), this.f10985k));
        this.f10976b.mo9217g(this);
        jvbVar.m13537d(new dev(this, 8));
        this.f10978d.mo6133a();
        jvbVar.m13537d(new dev(this.f10978d, 9));
        this.f10987m = mrm.m16829i(jvbVar);
        this.f10977c.m6129b();
    }

    /* JADX INFO: renamed from: f */
    public final void m6126f(boolean z) {
        this.f10984j = z;
        if (z) {
            return;
        }
        m6124c();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6127g() {
        m6124c();
        if (this.f10987m.mo16813g()) {
            ((jvb) this.f10987m.mo16809c()).close();
            this.f10987m = mqu.f41450a;
        }
        this.f10977c.m6129b();
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        this.f10985k.execute(new dfq(this, 20));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        m6126f(false);
        this.f10985k.execute(new dgt(this, 0));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        m6126f(true);
        this.f10985k.execute(new dgt(this, 1));
    }
}
