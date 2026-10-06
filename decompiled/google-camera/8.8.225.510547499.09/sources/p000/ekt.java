package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekt implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final SensorManager f14507a;

    /* JADX INFO: renamed from: b */
    public final Sensor f14508b;

    /* JADX INFO: renamed from: c */
    public final Sensor f14509c;

    /* JADX INFO: renamed from: d */
    private final eas f14510d;

    /* JADX INFO: renamed from: e */
    private long f14511e;

    /* JADX INFO: renamed from: f */
    private int f14512f;

    /* JADX INFO: renamed from: g */
    private final float[] f14513g;

    /* JADX INFO: renamed from: h */
    private final float[] f14514h;

    /* JADX INFO: renamed from: i */
    private final float[] f14515i;

    /* JADX INFO: renamed from: j */
    private double f14516j;

    /* JADX INFO: renamed from: k */
    private double f14517k;

    /* JADX INFO: renamed from: l */
    private double f14518l;

    public ekt(SensorManager sensorManager, int i) {
        eas easVarM7006b = eas.m7006b();
        this.f14511e = 0L;
        this.f14512f = 0;
        float[] fArr = new float[16];
        this.f14513g = fArr;
        this.f14514h = new float[16];
        this.f14515i = new float[16];
        this.f14516j = 0.0d;
        this.f14517k = 0.0d;
        this.f14518l = 0.0d;
        this.f14510d = easVarM7006b;
        this.f14507a = sensorManager;
        this.f14508b = sensorManager.getDefaultSensor(1);
        this.f14509c = sensorManager.getDefaultSensor(4);
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.setRotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        Matrix.setRotateM(fArr3, 0, i, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized double m7419a() {
        return this.f14518l;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized double m7420b() {
        return this.f14516j;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized double m7421c() {
        return this.f14517k;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7422d(int i) {
        this.f14512f = i;
        this.f14510d.m7012e();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7423e(float[] fArr) {
        float[] fArr2 = this.f14515i;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
    }

    /* JADX INFO: renamed from: f */
    final synchronized void m7424f(float[] fArr, int i, long j) {
        if (this.f14511e == 0) {
            this.f14510d.m7012e();
        }
        this.f14511e = j;
        if (i == 1) {
            this.f14510d.m7010c(fArr, j);
        } else if (i == 4) {
            this.f14510d.m7011d(fArr, j);
        }
        double[] dArrM7015h = this.f14510d.m7015h();
        for (int i2 = 0; i2 < 16; i2++) {
            this.f14514h[i2] = (float) dArrM7015h[i2];
        }
        Matrix.rotateM(this.f14514h, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(this.f14515i, 0, this.f14513g, 0, this.f14514h, 0);
        Matrix.rotateM(this.f14515i, 0, -this.f14512f, 1.0f, 0.0f, 0.0f);
        if (this.f14512f == 180) {
            Matrix.rotateM(this.f14515i, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        }
        float[] fArr2 = this.f14515i;
        double d = fArr2[2];
        double d2 = fArr2[10];
        double d3 = 0.0d;
        if (Math.hypot(d, d2) >= 0.1d) {
            double degrees = (-90.0d) - Math.toDegrees(Math.atan2(d2, d));
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            d3 = degrees;
            if (d3 >= 360.0d) {
                d3 -= 360.0d;
            }
        }
        this.f14518l = d3;
        this.f14517k = Math.toDegrees(Math.asin(this.f14515i[6]));
        this.f14516j = Math.toDegrees(Math.asin(this.f14515i[5]));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        m7424f(sensorEvent.values, sensorEvent.sensor.getType(), sensorEvent.timestamp);
    }
}
