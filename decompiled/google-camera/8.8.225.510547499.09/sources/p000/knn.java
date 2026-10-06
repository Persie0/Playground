package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knn implements kni {

    /* JADX INFO: renamed from: a */
    public final List f36621a = new ArrayList(6000);

    /* JADX INFO: renamed from: b */
    public final kbf f36622b;

    /* JADX INFO: renamed from: c */
    public int f36623c;

    /* JADX INFO: renamed from: d */
    private final SensorManager f36624d;

    /* JADX INFO: renamed from: e */
    private final Set f36625e;

    /* JADX INFO: renamed from: f */
    private final SensorEventListener f36626f;

    /* JADX INFO: renamed from: g */
    private final Sensor f36627g;

    public knn(SensorManager sensorManager) {
        this.f36624d = sensorManager;
        this.f36627g = sensorManager.getDefaultSensor(4);
        int i = 0;
        for (int i2 = 6000; i < i2; i2 = 6000) {
            this.f36621a.add(new knj(104, 1, 4, 0L, -1L, 0.0f, 0.0f, 0.0f));
            i++;
        }
        this.f36623c = 0;
        this.f36626f = new knm(this);
        this.f36625e = new HashSet();
        this.f36622b = new kbf(knk.f36611a, 6000);
    }

    /* JADX INFO: renamed from: c */
    private final synchronized void m14599c() {
        this.f36624d.unregisterListener(this.f36626f);
    }

    /* JADX INFO: renamed from: d */
    private final synchronized void m14600d() {
        this.f36624d.registerListener(this.f36626f, this.f36627g, 0);
    }

    @Override // p000.kni
    /* JADX INFO: renamed from: a */
    public final synchronized knh mo7000a(String str) {
        knl knlVar;
        if (this.f36625e.isEmpty()) {
            m14600d();
        }
        knlVar = new knl(this, str, 0);
        this.f36625e.add(knlVar);
        return knlVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14601b(knh knhVar) {
        if (this.f36625e.remove(knhVar) && this.f36625e.isEmpty()) {
            m14599c();
        }
    }
}
