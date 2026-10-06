package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class hpk implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f28873a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f28874b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f28875c;

    public hpk(hoj hojVar, dbr dbrVar, int i) {
        this.f28875c = i;
        this.f28873a = hojVar;
        this.f28874b = dbrVar;
    }

    public hpk(hpm hpmVar, hqk hqkVar, int i) {
        this.f28875c = i;
        this.f28874b = hpmVar;
        this.f28873a = hqkVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.f28875c;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        switch (this.f28875c) {
            case 0:
                if (sensorEvent.sensor.getType() == 4) {
                    float f4 = sensorEvent.values[0];
                    float f5 = sensorEvent.values[1];
                    float f6 = sensorEvent.values[2];
                    hpm hpmVar = (hpm) this.f28874b;
                    double d = 0.0d;
                    if (hpmVar.f28895N == 0.0d) {
                        hpmVar.f28895N = Math.sqrt((f4 * f4) + (f5 * f5) + (f6 * f6));
                    }
                    hpm hpmVar2 = (hpm) this.f28874b;
                    hpmVar2.f28896O = hpmVar2.f28895N;
                    hpmVar2.f28895N = Math.sqrt((f4 * f4) + (f5 * f5) + (f6 * f6));
                    hpm hpmVar3 = (hpm) this.f28874b;
                    double dAbs = Math.abs(hpmVar3.f28895N - hpmVar3.f28896O);
                    synchronized (((hpm) this.f28874b).f28917b) {
                        Object obj = this.f28874b;
                        long j = ((hpm) obj).f28919d;
                        ((hpm) obj).f28919d = 1 + j;
                        double[] dArr = ((hpm) obj).f28918c;
                        dArr[((int) j) % 3] = dAbs;
                        for (int i = 0; i < 3; i++) {
                            d += dArr[i];
                        }
                        break;
                    }
                    ((hpm) this.f28874b).f28897P = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp - ((hpm) this.f28874b).f28898Q);
                    hpm hpmVar4 = (hpm) this.f28874b;
                    if (hpmVar4.f28897P > 50) {
                        hpmVar4.f28898Q = sensorEvent.timestamp;
                    }
                    hpm hpmVar5 = (hpm) this.f28874b;
                    if (hpmVar5.f28897P <= 50 || d / 3.0d <= 0.014999999664723873d) {
                        return;
                    }
                    if (((hor) hpmVar5.f28925j.f34942d).equals(hor.STATE_RECORDING)) {
                        ((hqk) this.f28873a).m10600f();
                    }
                    ((hpm) this.f28874b).m10588f(true);
                    ((hpm) this.f28874b).m10586d();
                    return;
                }
                return;
            default:
                if (sensorEvent.sensor.getType() == 4) {
                    hqs hqsVar = ((hoj) this.f28873a).f28579C;
                    hqsVar.getClass();
                    kmq kmqVarMo5895d = ((dbr) this.f28874b).mo5895d();
                    float f7 = sensorEvent.values[0];
                    float f8 = sensorEvent.values[1];
                    float f9 = sensorEvent.values[2];
                    long j2 = sensorEvent.timestamp;
                    kmq kmqVar = kmq.f36557a;
                    switch (kmqVarMo5895d) {
                        case f36557a:
                            f = -f8;
                            f2 = -f9;
                            f3 = f7;
                            break;
                        case BACK:
                            f2 = f9;
                            f3 = f7;
                            f = f8;
                            break;
                        default:
                            f2 = f9;
                            f = f7;
                            f3 = f8;
                            break;
                    }
                    hqsVar.mo10637b(f, f3, f2, sensorEvent.timestamp);
                    return;
                }
                return;
        }
    }
}
