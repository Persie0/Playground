package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwr implements SensorEventListener {

    /* JADX INFO: renamed from: f */
    private static final nbh f26623f = nbh.m17259h("com/google/android/apps/camera/sensor/HeadingSensor");

    /* JADX INFO: renamed from: b */
    public final SensorManager f26625b;

    /* JADX INFO: renamed from: c */
    public final Sensor f26626c;

    /* JADX INFO: renamed from: d */
    public final Sensor f26627d;

    /* JADX INFO: renamed from: e */
    public final Executor f26628e;

    /* JADX INFO: renamed from: a */
    public int f26624a = -1;

    /* JADX INFO: renamed from: g */
    private final float[] f26629g = new float[3];

    /* JADX INFO: renamed from: h */
    private final float[] f26630h = new float[3];

    /* JADX INFO: renamed from: i */
    private final float[] f26631i = new float[16];

    public gwr(SensorManager sensorManager, Executor executor) {
        this.f26625b = sensorManager;
        this.f26628e = executor;
        this.f26626c = sensorManager.getDefaultSensor(1);
        this.f26627d = sensorManager.getDefaultSensor(2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            fArr = this.f26629g;
        } else {
            if (type != 2) {
                ((nbe) ((nbe) f26623f.m17252c()).mo17276G((char) 3309)).mo17293r("Unexpected sensor type %s", sensorEvent.sensor.getName());
                return;
            }
            fArr = this.f26630h;
        }
        System.arraycopy(sensorEvent.values, 0, fArr, 0, 3);
        float[] fArr2 = new float[3];
        SensorManager.getRotationMatrix(this.f26631i, new float[3], this.f26629g, this.f26630h);
        SensorManager.getOrientation(this.f26631i, fArr2);
        double d = fArr2[0] * 180.0f;
        Double.isNaN(d);
        int i = ((int) (d / 3.141592653589793d)) % 360;
        this.f26624a = i;
        if (i < 0) {
            this.f26624a = i + 360;
        }
    }
}
