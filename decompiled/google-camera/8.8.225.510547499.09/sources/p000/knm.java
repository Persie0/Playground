package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knm implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ knn f36619a;

    /* JADX INFO: renamed from: b */
    private long f36620b = 1;

    public knm(knn knnVar) {
        this.f36619a = knnVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor == null || sensorEvent.sensor.getType() != 4) {
            return;
        }
        float[] fArr = sensorEvent.values;
        synchronized (this.f36619a) {
            knn knnVar = this.f36619a;
            knj knjVar = (knj) knnVar.f36621a.get(knnVar.f36623c);
            long j = this.f36620b;
            this.f36620b = 1 + j;
            knjVar.f36606d = j;
            knjVar.f36607e = sensorEvent.timestamp;
            knjVar.f36608f = fArr[0];
            knjVar.f36609g = fArr[1];
            knjVar.f36610h = fArr[2];
            knn knnVar2 = this.f36619a;
            knnVar2.f36623c = (knnVar2.f36623c + 1) % 6000;
        }
    }
}
