package p000;

import android.location.LocationManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14727a;

    public emr(oju ojuVar) {
        this.f14727a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LocationManager get() {
        LocationManager locationManager = (LocationManager) ((emj) this.f14727a.get()).mo7509a(emj.f14715h);
        locationManager.getClass();
        return locationManager;
    }
}
