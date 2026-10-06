package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eju implements GLSurfaceView.Renderer, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f14390a = nbh.m17259h("com/google/android/apps/camera/imax/ImaxSceneRenderer");

    /* JADX INFO: renamed from: b */
    public final int f14391b;

    /* JADX INFO: renamed from: d */
    public Texture f14393d;

    /* JADX INFO: renamed from: e */
    public SurfaceTexture f14394e;

    /* JADX INFO: renamed from: f */
    public ekb f14395f;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f14397h;

    /* JADX INFO: renamed from: i */
    public final ejd f14398i;

    /* JADX INFO: renamed from: j */
    public final ejl f14399j;

    /* JADX INFO: renamed from: k */
    public final ejh f14400k;

    /* JADX INFO: renamed from: l */
    private final Context f14401l;

    /* JADX INFO: renamed from: o */
    private float f14404o;

    /* JADX INFO: renamed from: p */
    private float f14405p;

    /* JADX INFO: renamed from: q */
    private long f14406q;

    /* JADX INFO: renamed from: r */
    private final ArrayList f14407r;

    /* JADX INFO: renamed from: s */
    private final jvb f14408s;

    /* JADX INFO: renamed from: t */
    private final eib f14409t;

    /* JADX INFO: renamed from: u */
    private final ekd f14410u;

    /* JADX INFO: renamed from: v */
    private final eko f14411v;

    /* JADX INFO: renamed from: w */
    private final eiw f14412w;

    /* JADX INFO: renamed from: x */
    private final int f14413x;

    /* JADX INFO: renamed from: z */
    private final eig f14415z;

    /* JADX INFO: renamed from: c */
    public final int f14392c = eke.f14458a;

    /* JADX INFO: renamed from: m */
    private final float[] f14402m = new float[16];

    /* JADX INFO: renamed from: n */
    private final float[] f14403n = new float[16];

    /* JADX INFO: renamed from: y */
    private final SurfaceTexture.OnFrameAvailableListener f14414y = new ofd(this, 1);

    /* JADX INFO: renamed from: g */
    public final nqf f14396g = nqf.m17621g();

    public eju(eib eibVar, eig eigVar, ekd ekdVar, eiw eiwVar, ejd ejdVar, ejl ejlVar, ejh ejhVar, ejt ejtVar, ejn ejnVar, ejj ejjVar, ejf ejfVar, Context context) {
        this.f14406q = 0L;
        this.f14409t = eibVar;
        this.f14415z = eigVar;
        this.f14411v = ekdVar.f14455c;
        this.f14410u = ekdVar;
        this.f14412w = eiwVar;
        this.f14398i = ejdVar;
        this.f14399j = ejlVar;
        this.f14400k = ejhVar;
        this.f14401l = context;
        this.f14413x = ekdVar.f14454b.mo14553f();
        ArrayList arrayList = new ArrayList();
        this.f14407r = arrayList;
        this.f14408s = new jvb();
        this.f14397h = new AtomicBoolean(false);
        this.f14406q = SystemClock.elapsedRealtime();
        double d = eke.f14458a;
        double dM7408a = ekdVar.m7408a();
        Double.isNaN(d);
        this.f14391b = (int) ((d * dM7408a) / 360.0d);
        ejdVar.f14312h = eiwVar.m7376k();
        arrayList.add(ejlVar);
        arrayList.add(ejhVar);
        arrayList.add(ejtVar);
        arrayList.add(ejnVar);
        arrayList.add(ejjVar);
        arrayList.add(ejfVar);
    }

    /* JADX INFO: renamed from: a */
    private final float m7400a(float f) {
        return (this.f14398i.f14308d / this.f14404o) * f;
    }

    /* JADX INFO: renamed from: b */
    private final float m7401b(float f) {
        return (this.f14398i.f14309e / this.f14405p) * f;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f14408s.close();
        ArrayList arrayList = this.f14407r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ejc) arrayList.get(i)).mo7390a();
        }
        EGL14.eglReleaseThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float f;
        float f2;
        float f3;
        if (this.f14408s.mo8995b()) {
            return;
        }
        GLES20.glDisable(3042);
        if (this.f14397h.getAndSet(false)) {
            SurfaceTexture surfaceTexture = this.f14394e;
            lku.m15662p(surfaceTexture);
            this.f14409t.mo7348d();
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f14402m);
            long timestamp = surfaceTexture.getTimestamp();
            this.f14395f.f14439a.m7478f(this.f14403n);
            this.f14395f.f14439a.m7477e(this.f14402m);
            this.f14409t.mo7345a(this.f14402m, timestamp);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f14406q;
        this.f14406q = jElapsedRealtime;
        float fAbs = Math.abs(this.f14412w.m7372g());
        float fMin = Math.min(j * (((Math.min(fAbs, 0.15f) / 0.15f) * 2.4300002E-4f) + 7.0E-6f), fAbs - this.f14398i.f14311g);
        ejd ejdVar = this.f14398i;
        float f4 = ejdVar.f14311g + fMin;
        ejdVar.f14311g = f4;
        if (f4 > 1.0f) {
            ejdVar.f14311g = 1.0f;
        }
        eiw eiwVar = this.f14412w;
        boolean z = !eiwVar.f14194e.get() || eiwVar.f14190a.f14495d.getCaptureProgress() >= 0.0f;
        ejdVar.f14317m = z;
        Matrix.setRotateEulerM(this.f14398i.f14310f, 0, 0.0f, 0.0f, (float) (-this.f14412w.f14205p));
        ejd ejdVar2 = this.f14398i;
        if (ejdVar2.f14312h) {
            float f5 = ejdVar2.f14311g;
            float f6 = ejdVar2.f14321q;
            float fMax = Math.max(f5 + f6, f6 + f6);
            float f7 = this.f14391b;
            f = (f7 + f7) / (this.f14392c * fMax);
        } else {
            float f8 = ejdVar2.f14311g;
            float f9 = ejdVar2.f14320p;
            float fMax2 = Math.max(f8 + f9, f9 + f9);
            float f10 = this.f14398i.f14305a;
            f = ((f10 + f10) * this.f14391b) / (this.f14392c * fMax2);
        }
        ejd ejdVar3 = this.f14398i;
        ejdVar3.getClass();
        boolean z2 = ejdVar3.f14312h;
        if (z2) {
            f2 = 0.9f * f;
            ejdVar3.f14308d = f2;
            f3 = (f / this.f14404o) * this.f14405p;
            ejdVar3.f14309e = f3;
        } else {
            float f11 = 0.9f * f;
            ejdVar3.f14309e = f11;
            float f12 = (f / this.f14405p) * this.f14404o;
            ejdVar3.f14308d = f12;
            f2 = f12;
            f3 = f11;
        }
        float f13 = (float) this.f14412w.f14195f;
        if (z2) {
            ejdVar3.f14306b = (f13 / this.f14404o) * f2;
            boolean z3 = ejdVar3.f14317m;
            float fMin2 = Math.min(1.0f - (f3 * 0.5f), m7401b(ejdVar3.f14311g * (this.f14405p + 360.0f)) * 0.5f) - m7401b((float) this.f14412w.f14196g);
            if (!z3) {
                fMin2 = -fMin2;
            }
            ejdVar3.f14307c = fMin2;
        } else {
            boolean z4 = ejdVar3.f14317m;
            float fMin3 = Math.min(ejdVar3.f14305a - (f2 * 0.5f), m7400a(ejdVar3.f14311g * (this.f14404o + 360.0f)) * 0.5f) - m7400a((float) this.f14412w.f14196g);
            if (!z4) {
                fMin3 = -fMin3;
            }
            ejdVar3.f14306b = fMin3;
            ejd ejdVar4 = this.f14398i;
            ejdVar4.f14307c = ((-f13) / this.f14405p) * ejdVar4.f14309e;
        }
        ejd ejdVar5 = this.f14398i;
        ejdVar5.f14318n = ejdVar5.f14319o != null && this.f14412w.m7375j();
        this.f14395f.mo7391b();
        ejd ejdVar6 = this.f14398i;
        GLES20.glViewport(0, 0, ejdVar6.f14314j, ejdVar6.f14315k);
        ArrayList arrayList = this.f14407r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ejc) arrayList.get(i)).mo7391b();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        ejd ejdVar = this.f14398i;
        ejdVar.f14314j = i;
        ejdVar.f14315k = i2;
        ejdVar.f14305a = i / i2;
        int rotation = ((Activity) this.f14401l).getWindowManager().getDefaultDisplay().getRotation() * 90;
        Matrix.setRotateEulerM(this.f14403n, 0, 0.0f, 0.0f, -rotation);
        eiw eiwVar = this.f14412w;
        eiwVar.f14203n = ((this.f14413x - rotation) + 360) % 360;
        eiwVar.f14204o = rotation;
        this.f14398i.f14312h = eiwVar.m7376k();
        if (this.f14398i.f14312h) {
            float fM7408a = (float) this.f14410u.m7408a();
            eko ekoVar = this.f14411v;
            this.f14405p = (fM7408a * ekoVar.f14476b) / ekoVar.f14475a;
            this.f14404o = (float) this.f14410u.m7408a();
        } else {
            float fM7408a2 = (float) this.f14410u.m7408a();
            eko ekoVar2 = this.f14411v;
            this.f14404o = (fM7408a2 * ekoVar2.f14476b) / ekoVar2.f14475a;
            this.f14405p = (float) this.f14410u.m7408a();
        }
        ejd ejdVar2 = this.f14398i;
        ejdVar2.f14316l = ejdVar2.f14312h ? ejdVar2.f14315k / ejdVar2.f14314j : 1.0f;
        ejdVar2.f14320p = this.f14404o / 360.0f;
        ejdVar2.f14321q = this.f14405p / 360.0f;
        this.f14409t.mo7346b(i, i2);
        this.f14395f.mo7392c(i, i2);
        ArrayList arrayList = this.f14407r;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ejc) arrayList.get(i3)).mo7392c(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        eko ekoVar = this.f14411v;
        this.f14393d = new Texture(ekoVar.f14475a, ekoVar.f14476b, 36197);
        this.f14395f = new ekb(this.f14393d, this.f14398i);
        SurfaceTexture surfaceTexture = this.f14394e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f14394e = null;
        }
        Texture texture = this.f14393d;
        lku.m15662p(texture);
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(texture.getName());
        eko ekoVar2 = this.f14411v;
        surfaceTexture2.setDefaultBufferSize(ekoVar2.f14475a, ekoVar2.f14476b);
        surfaceTexture2.setOnFrameAvailableListener(this.f14414y);
        this.f14394e = surfaceTexture2;
        this.f14396g.mo14894e(surfaceTexture2);
        this.f14408s.m13537d(new eip(this, surfaceTexture2, 2));
        this.f14409t.mo7349e(this.f14415z);
        eib eibVar = this.f14409t;
        Texture texture2 = this.f14393d;
        lku.m15662p(texture2);
        eibVar.mo7347c(texture2, this.f14411v);
    }
}
