package p000;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eks implements AutoCloseable, ekp {

    /* JADX INFO: renamed from: a */
    public static final nbh f14492a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/capture/CaptureModule");

    /* JADX INFO: renamed from: b */
    public final eku f14493b;

    /* JADX INFO: renamed from: c */
    public final ekq f14494c;

    /* JADX INFO: renamed from: d */
    public final ekf f14495d;

    /* JADX INFO: renamed from: e */
    public ekt f14496e;

    /* JADX INFO: renamed from: f */
    public boolean f14497f;

    /* JADX INFO: renamed from: g */
    public boolean f14498g;

    /* JADX INFO: renamed from: h */
    public eko f14499h;

    /* JADX INFO: renamed from: i */
    public Texture f14500i;

    /* JADX INFO: renamed from: j */
    public double f14501j;

    /* JADX INFO: renamed from: k */
    public int f14502k;

    /* JADX INFO: renamed from: l */
    public eig f14503l;

    /* JADX INFO: renamed from: m */
    private final float[] f14504m;

    /* JADX INFO: renamed from: n */
    private final float[] f14505n;

    /* JADX INFO: renamed from: o */
    private final TrackerStats f14506o;

    public eks() {
        ekq ekqVar = new ekq();
        eku ekuVar = new eku();
        this.f14504m = new float[]{0.0f, 0.0f, 0.0f};
        this.f14505n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.f14506o = new TrackerStats();
        this.f14495d = ((ekg) ekv.m7427a(ekg.class)).mo7409a();
        this.f14496e = null;
        this.f14497f = false;
        this.f14498g = false;
        this.f14499h = null;
        this.f14500i = null;
        this.f14503l = null;
        this.f14501j = 3.4028234663852886E38d;
        this.f14502k = 0;
        this.f14494c = ekqVar;
        this.f14493b = ekuVar;
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7345a(float[] fArr, long j) {
        if (this.f14497f && !this.f14498g) {
            this.f14496e.m7423e(this.f14505n);
            double dM7419a = this.f14496e.m7419a();
            if (Math.abs(dM7419a - this.f14501j) < 0.5d) {
                this.f14502k++;
                return;
            }
            this.f14501j = dM7419a;
            this.f14495d.trackTexture(this.f14504m, this.f14505n);
            this.f14495d.getTrackerStats(this.f14506o);
            this.f14493b.m7425a(this.f14506o);
            this.f14494c.mo7345a(fArr, j);
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: b */
    public final void mo7346b(int i, int i2) {
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: c */
    public final void mo7347c(Texture texture, eko ekoVar) {
        this.f14500i = texture;
        this.f14499h = ekoVar;
        this.f14494c.mo7347c(texture, ekoVar);
        int i = ekoVar.f14475a;
        float f = ekoVar.f14478d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14495d.release();
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7348d() {
        if (this.f14497f && !this.f14498g) {
            this.f14494c.mo7348d();
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: e */
    public final void mo7349e(eig eigVar) {
        this.f14503l = eigVar;
        this.f14494c.f14486g = eigVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m7417f() {
        this.f14494c.f14485f = 24000000;
    }

    /* JADX INFO: renamed from: g */
    public final void m7418g(String str) {
        int i;
        synchronized (this) {
            if (this.f14497f) {
                int iM7457a = 0;
                this.f14497f = false;
                this.f14498g = false;
                ekq ekqVar = this.f14494c;
                ell ellVar = ekqVar.f14481b;
                if (ellVar != null) {
                    ellVar.f14605f = false;
                    elk elkVar = ellVar.f14604e;
                    elkVar.sendMessage(elkVar.obtainMessage(2));
                    elk elkVar2 = ellVar.f14604e;
                    elkVar2.sendMessage(elkVar2.obtainMessage(3));
                    try {
                        ellVar.f14603d.getThread().join();
                    } catch (InterruptedException e) {
                        ((nbe) ((nbe) ((nbe) ell.f14600a.m17251b()).mo17283h(e)).mo17276G((char) 1593)).mo17293r("%s", e.getMessage());
                    }
                }
                ekm ekmVar = ekqVar.f14483d;
                if (ekmVar != null) {
                    ekmVar.m7415a();
                }
                ekqVar.f14486g.m7353a(new efd(ekqVar, 16));
                ell ellVar2 = ekqVar.f14481b;
                if (ellVar2 != null) {
                    iM7457a = ellVar2.m7457a();
                    i = ekqVar.f14481b.f14602c.f14562k;
                } else {
                    i = 0;
                }
                ekqVar.f14481b = null;
                ekqVar.f14483d = null;
                int iStopCapture = this.f14495d.stopCapture(str);
                this.f14503l.m7353a(new efd(this, 17));
                if (iM7457a != iStopCapture || i > 0) {
                    ((nbe) ((nbe) f14492a.m17251b().mo17282g(nch.f41987a, DNTdN.wHmr)).mo17276G(1551)).mo17271B("Recorded video stream is out-of-sync with tracking\n%d frames recorded with %d packets dropped, but %d frames tracked", Integer.valueOf(iM7457a), Integer.valueOf(i), Integer.valueOf(iStopCapture));
                } else if (this.f14502k > 0) {
                    nbz nbzVar = nch.f41987a;
                }
            }
        }
    }
}
