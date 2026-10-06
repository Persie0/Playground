package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwu {

    /* JADX INFO: renamed from: a */
    public final SensorManager f26635a;

    /* JADX INFO: renamed from: b */
    public final Executor f26636b;

    /* JADX INFO: renamed from: c */
    public final Sensor f26637c;

    /* JADX INFO: renamed from: i */
    public boolean f26643i;

    /* JADX INFO: renamed from: d */
    public final Object f26638d = new Object();

    /* JADX INFO: renamed from: e */
    public final float[] f26639e = new float[9];

    /* JADX INFO: renamed from: f */
    public final float[] f26640f = new float[9];

    /* JADX INFO: renamed from: g */
    public final float[] f26641g = new float[3];

    /* JADX INFO: renamed from: h */
    public final Set f26642h = new HashSet();

    /* JADX INFO: renamed from: j */
    public final dvd f26644j = new dvd(this, 4);

    public gwu(SensorManager sensorManager, Executor executor) {
        this.f26635a = sensorManager;
        this.f26636b = executor;
        this.f26637c = sensorManager.getDefaultSensor(11);
    }

    /* JADX INFO: renamed from: a */
    public final void m9864a(gws gwsVar) {
        boolean z;
        synchronized (this.f26638d) {
            z = false;
            if (this.f26642h.remove(gwsVar) && this.f26642h.isEmpty()) {
                this.f26643i = false;
                z = true;
            }
        }
        if (z) {
            this.f26636b.execute(new gpn(this, 17));
        }
    }
}
