package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class pta implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public r41 f56787a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            sensorEvent.getClass();
            r41 r41Var = this.f56787a;
            if (r41Var != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                    r41Var.m20288c();
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
