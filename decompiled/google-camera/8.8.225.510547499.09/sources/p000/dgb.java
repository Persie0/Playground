package p000;

import android.util.Pair;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgb implements kos, hes, hem {

    /* JADX INFO: renamed from: A */
    private final dge f10838A;

    /* JADX INFO: renamed from: B */
    private mrm f10839B;

    /* JADX INFO: renamed from: C */
    private boolean f10840C;

    /* JADX INFO: renamed from: b */
    public final mrm f10841b;

    /* JADX INFO: renamed from: c */
    public final ggm f10842c;

    /* JADX INFO: renamed from: h */
    public final dgz f10847h;

    /* JADX INFO: renamed from: j */
    public mrm f10849j;

    /* JADX INFO: renamed from: k */
    public mrm f10850k;

    /* JADX INFO: renamed from: l */
    public boolean f10851l;

    /* JADX INFO: renamed from: m */
    public boolean f10852m;

    /* JADX INFO: renamed from: n */
    public boolean f10853n;

    /* JADX INFO: renamed from: o */
    public mrm f10854o;

    /* JADX INFO: renamed from: p */
    public mrm f10855p;

    /* JADX INFO: renamed from: q */
    public dga f10856q;

    /* JADX INFO: renamed from: r */
    public final ejr f10857r;

    /* JADX INFO: renamed from: v */
    private final ScheduledExecutorService f10860v;

    /* JADX INFO: renamed from: w */
    private final jww f10861w;

    /* JADX INFO: renamed from: x */
    private final boolean f10862x;

    /* JADX INFO: renamed from: y */
    private final dgi f10863y;

    /* JADX INFO: renamed from: z */
    private final dgu f10864z;

    /* JADX INFO: renamed from: u */
    private static final nbh f10837u = nbh.m17259h("com/google/android/apps/camera/coach/CameraLockIndicator");

    /* JADX INFO: renamed from: a */
    public static final double f10836a = Math.toRadians(5.0d);

    /* JADX INFO: renamed from: d */
    public final float[] f10843d = new float[16];

    /* JADX INFO: renamed from: e */
    public final ing f10844e = new ing();

    /* JADX INFO: renamed from: s */
    public final jfs f10858s = new jfs((byte[]) null);

    /* JADX INFO: renamed from: f */
    public final float[] f10845f = new float[16];

    /* JADX INFO: renamed from: g */
    public final ing f10846g = new ing();

    /* JADX INFO: renamed from: t */
    public final jfs f10859t = new jfs((byte[]) null);

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f10848i = new AtomicBoolean(false);

    public dgb(mrm mrmVar, ejr ejrVar, ggm ggmVar, jww jwwVar, ScheduledExecutorService scheduledExecutorService, dhv dhvVar, dgi dgiVar, dge dgeVar, dgu dguVar, fcp fcpVar, byte[] bArr) {
        boolean z = false;
        mqu mquVar = mqu.f41450a;
        this.f10849j = mquVar;
        this.f10850k = mquVar;
        this.f10839B = mquVar;
        this.f10851l = false;
        this.f10852m = false;
        this.f10853n = false;
        this.f10854o = mquVar;
        this.f10855p = mquVar;
        this.f10840C = false;
        this.f10856q = dfy.f10825a;
        this.f10841b = mrmVar;
        this.f10860v = scheduledExecutorService;
        this.f10842c = ggmVar;
        this.f10857r = ejrVar;
        this.f10861w = jwwVar;
        this.f10847h = new dha(6, fcpVar);
        if (dhvVar.mo6184l(dhi.f11130q) && dhvVar.mo6184l(dhi.f11127n)) {
            z = true;
        }
        this.f10862x = z;
        this.f10863y = dgiVar;
        this.f10864z = dguVar;
        this.f10838A = dgeVar;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6088j(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m6089l() {
        return this.f10862x && this.f10838A.m6098a().mo16813g() && ((kmr) ((cvy) this.f10838A.m6098a().mo16809c()).f9847d).mo14558k() == kmq.BACK;
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
    public final void m6090c() {
        if (this.f10850k.mo16813g() && this.f10849j.mo16813g() && this.f10851l) {
            dfo dfoVar = (dfo) this.f10850k.mo16809c();
            if (dfoVar.f10798e.mo16813g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dfoVar.f10798e.mo16809c();
                if (cameraCoachHudView.f6593d.mo16813g()) {
                    cameraCoachHudView.post(new dfq(cameraCoachHudView, 5));
                }
            }
            ((elx) this.f10849j.mo16809c()).mo7489k(ely.SECOND_RUN_TOAST);
            this.f10851l = false;
            this.f10852m = false;
            this.f10856q = dfy.f10826b;
            this.f10848i.set(false);
            this.f10853n = false;
            this.f10847h.mo6139g();
        }
    }

    @Override // p000.hem
    /* JADX INFO: renamed from: d */
    public final void mo6091d() {
        if (this.f10851l) {
            if (this.f10852m) {
                this.f10847h.mo6135c(njf.HEEDED);
            } else {
                this.f10847h.mo6135c(njf.NOT_HEEDED);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6092e() {
        if (m6089l()) {
            if (m6089l()) {
                this.f10863y.m6103f(true);
                this.f10864z.m6126f(true);
            }
            this.f10857r.f14354a = false;
            this.f10854o = mqu.f41450a;
            m6090c();
            this.f10840C = false;
            this.f10856q = dfy.f10827c;
            this.f10848i.set(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6093f(dga dgaVar) {
        if (m6089l()) {
            if (m6089l()) {
                this.f10863y.m6103f(false);
                this.f10864z.m6126f(false);
            }
            this.f10857r.f14354a = true;
            if (!this.f10855p.mo16813g()) {
                ((nbe) ((nbe) f10837u.m17252c()).mo17276G((char) 863)).mo17290o("No camera pose data available.");
                return;
            }
            if (!this.f10854o.mo16813g()) {
                this.f10854o = this.f10855p;
            }
            this.f10840C = true;
            this.f10856q = dgaVar;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6094g() {
        if (this.f10839B.mo16813g()) {
            ((jvb) this.f10839B.mo16809c()).close();
        }
        jvb jvbVar = new jvb();
        if (this.f10850k.mo16813g()) {
            jvbVar.m13537d(dfo.m6076e(new Runnable() { // from class: dfz
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair;
                    boolean z;
                    dgb dgbVar = this.f10830a;
                    if (((dtk) ((mrq) dgbVar.f10841b).f41482a).mo6738e()) {
                        return;
                    }
                    fki fkiVar = new fki(((dtk) ((mrq) dgbVar.f10841b).f41482a).mo6737d().f12554a);
                    dgbVar.f10855p = mrm.m16829i(fkiVar);
                    mrm mrmVar = dgbVar.f10854o;
                    if (mrmVar.mo16813g()) {
                        inr.m11532d(((fki) mrmVar.mo16809c()).f22374a, dgbVar.f10844e);
                        dgbVar.f10844e.m11511b(dgbVar.f10843d);
                        jfs jfsVar = dgbVar.f10858s;
                        float[] fArr = dgbVar.f10843d;
                        jfsVar.m13103i(fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
                        inr.m11532d(fkiVar.f22374a, dgbVar.f10846g);
                        dgbVar.f10846g.m11511b(dgbVar.f10845f);
                        jfs jfsVar2 = dgbVar.f10859t;
                        float[] fArr2 = dgbVar.f10845f;
                        jfsVar2.m13103i(fArr2[0], fArr2[4], fArr2[8], fArr2[1], fArr2[5], fArr2[9], fArr2[2], fArr2[6], fArr2[10]);
                        jfs jfsVar3 = new jfs((byte[]) null);
                        dgbVar.f10858s.m13111u(jfsVar3);
                        jfs jfsVar4 = new jfs((byte[]) null);
                        jfs.m13068q(jfsVar3, dgbVar.f10859t, jfsVar4);
                        switch (dgbVar.f10842c.mo9215c().f35503e) {
                            case 0:
                                pair = new Pair(Float.valueOf((float) Math.asin(jfsVar4.m13101g(1, 2))), Float.valueOf(-((float) Math.asin(jfsVar4.m13101g(0, 2)))));
                                break;
                            case 90:
                                pair = new Pair(Float.valueOf((float) Math.asin(jfsVar4.m13101g(2, 0))), Float.valueOf((float) Math.asin(jfsVar4.m13101g(1, 0))));
                                break;
                            case 180:
                                pair = new Pair(Float.valueOf((float) Math.asin(jfsVar4.m13101g(1, 2))), Float.valueOf((float) Math.asin(jfsVar4.m13101g(0, 2))));
                                break;
                            case 270:
                                pair = new Pair(Float.valueOf(-((float) Math.asin(jfsVar4.m13101g(2, 0)))), Float.valueOf((float) Math.asin(jfsVar4.m13101g(1, 0))));
                                break;
                            default:
                                throw new IllegalStateException(HRLmc.CpCMePprmTIwal);
                        }
                        float fFloatValue = ((Float) pair.first).floatValue();
                        float fFloatValue2 = ((Float) pair.second).floatValue();
                        if (dgbVar.f10849j.mo16813g() && dgbVar.f10850k.mo16813g()) {
                            dgbVar.f10847h.mo6138f();
                            if (dgbVar.f10857r.f14354a) {
                                dfo dfoVar = (dfo) dgbVar.f10850k.mo16809c();
                                if (dfoVar.f10796c && dfoVar.f10798e.mo16813g()) {
                                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dfoVar.f10798e.mo16809c();
                                    cameraCoachHudView.post(new dfp(cameraCoachHudView, fFloatValue, fFloatValue2, 2));
                                }
                                if (!dgbVar.f10851l) {
                                    ((dfo) dgbVar.f10850k.mo16809c()).m6080d();
                                    ((elx) dgbVar.f10849j.mo16809c()).mo7487i(ely.SECOND_RUN_TOAST);
                                    dgbVar.f10851l = true;
                                    dgbVar.f10847h.mo6137e(mqu.f41450a);
                                }
                            } else {
                                dgbVar.m6090c();
                            }
                            if (dgbVar.f10851l) {
                                if (!dgb.m6088j(fFloatValue, fFloatValue2)) {
                                    z = false;
                                } else if (!dgbVar.f10853n) {
                                    dgbVar.f10847h.mo6136d();
                                    z = true;
                                }
                                dgbVar.f10853n = z;
                            }
                        }
                        dgbVar.f10852m = dgb.m6088j(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        float fFloatValue3 = ((Float) pair.first).floatValue();
                        float fFloatValue4 = ((Float) pair.second).floatValue();
                        if ((Math.abs(fFloatValue3) >= dgb.f10836a || Math.abs(fFloatValue4) >= dgb.f10836a) && dgbVar.f10848i.compareAndSet(false, true)) {
                            dgbVar.f10856q.mo6085a();
                        }
                    }
                }
            }, this.f10860v));
        }
        jvbVar.m13537d(this.f10861w.mo3830a(new czq(this, 14), this.f10860v));
        this.f10842c.mo9217g(this);
        jvbVar.m13537d(new dev(this, 5));
        this.f10847h.mo6133a();
        jvbVar.m13537d(new dev(this.f10847h, 6));
        this.f10839B = mrm.m16829i(jvbVar);
        this.f10857r.m7398a();
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        this.f10860v.execute(new dfq(this, 6));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m6095i() {
        m6090c();
        if (this.f10839B.mo16813g()) {
            ((jvb) this.f10839B.mo16809c()).close();
            this.f10839B = mqu.f41450a;
        }
        this.f10857r.m7398a();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6096k() {
        return this.f10848i.get();
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        if (this.f10840C) {
            return;
        }
        this.f10860v.execute(new dfq(this, 8));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f10860v.execute(new dfq(this, 7));
    }
}
