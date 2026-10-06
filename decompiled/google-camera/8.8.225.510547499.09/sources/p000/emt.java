package p000;

import android.hardware.SensorManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14729a;

    public emt(oju ojuVar) {
        this.f14729a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SensorManager get() {
        SensorManager sensorManager = (SensorManager) ((emj) this.f14729a.get()).mo7509a(emj.f14718k);
        sensorManager.getClass();
        return sensorManager;
    }
}
