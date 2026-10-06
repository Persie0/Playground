package p000;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.HandlerThread;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyi {

    /* JADX INFO: renamed from: a */
    public final chu f20964a;

    /* JADX INFO: renamed from: o */
    public HandlerThread f20978o;

    /* JADX INFO: renamed from: b */
    public SensorManager f20965b = null;

    /* JADX INFO: renamed from: c */
    public final inh f20966c = new inh();

    /* JADX INFO: renamed from: d */
    public boolean f20967d = false;

    /* JADX INFO: renamed from: e */
    public final float[] f20968e = new float[3];

    /* JADX INFO: renamed from: f */
    public long f20969f = 0;

    /* JADX INFO: renamed from: g */
    public final float[] f20970g = new float[3];

    /* JADX INFO: renamed from: h */
    public final float[] f20971h = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: i */
    public int f20972i = 0;

    /* JADX INFO: renamed from: j */
    public final eas f20973j = eas.m7006b();

    /* JADX INFO: renamed from: q */
    private final float[] f20980q = new float[16];

    /* JADX INFO: renamed from: k */
    public float f20974k = 90.0f;

    /* JADX INFO: renamed from: l */
    public eyp f20975l = null;

    /* JADX INFO: renamed from: m */
    public float f20976m = 0.0f;

    /* JADX INFO: renamed from: n */
    public boolean f20977n = false;

    /* JADX INFO: renamed from: r */
    private double[] f20981r = new double[16];

    /* JADX INFO: renamed from: p */
    public final SensorEventListener f20979p = new dvd(this, 2);

    public eyi(chu chuVar) {
        this.f20964a = chuVar;
    }

    /* JADX INFO: renamed from: a */
    public final double m8041a() {
        return this.f20973j.m7009a();
    }

    /* JADX INFO: renamed from: b */
    public final void m8042b() {
        Arrays.fill(this.f20971h, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m8043c(double d) {
        if (d < 0.0d) {
            d += 360.0d;
        }
        if (d > 360.0d) {
            d -= 360.0d;
        }
        this.f20973j.m7013f(d);
    }

    /* JADX INFO: renamed from: d */
    public final void m8044d() {
        this.f20977n = false;
        HandlerThread handlerThread = this.f20978o;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f20978o = null;
        SensorManager sensorManager = this.f20965b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f20979p);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float[] m8045e() {
        float[] fArr;
        synchronized (this) {
            fArr = (float[]) this.f20970g.clone();
            float[] fArr2 = this.f20970g;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            this.f20972i = 0;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: f */
    public final float[] m8046f() {
        eas easVar = this.f20973j;
        if (easVar.m7014g()) {
            this.f20981r = easVar.m7015h();
        }
        float[] fArr = new float[16];
        for (int i = 0; i < 16; i++) {
            fArr[i] = (float) this.f20981r[i];
        }
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.f20974k, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(this.f20980q, 0, fArr2, 0, fArr, 0);
        return this.f20980q;
    }
}
