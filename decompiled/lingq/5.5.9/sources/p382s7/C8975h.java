package p382s7;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import dm.C5207g;
import p173i8.C6205a;

/* JADX INFO: renamed from: s7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8975h implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public a f47032a;

    /* JADX INFO: renamed from: s7.h$a */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(sensor, "sensor");
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(sensorEvent, "event");
            a aVar = this.f47032a;
            if (aVar == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                ((C8969b) aVar).m17199d();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
