package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dtw implements dto {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Sensor f12569a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SensorEventListener f12570b;

    public dtw(Sensor sensor, SensorEventListener sensorEventListener) {
        this.f12569a = sensor;
        this.f12570b = sensorEventListener;
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: f */
    public final Set mo6741f() {
        return Collections.singleton(this.f12569a);
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: g */
    public final void mo6742g(Sensor sensor) {
    }

    @Override // p000.dto
    /* JADX INFO: renamed from: h */
    public final void mo6743h(Sensor sensor) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f12570b.onSensorChanged(sensorEvent);
    }
}
