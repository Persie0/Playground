package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbx implements LocationListener {

    /* JADX INFO: renamed from: a */
    final Location f21216a;

    /* JADX INFO: renamed from: b */
    boolean f21217b = false;

    /* JADX INFO: renamed from: c */
    final String f21218c;

    public fbx(String str) {
        this.f21218c = str;
        this.f21216a = new Location(str);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) {
            return;
        }
        this.f21216a.set(location);
        this.f21217b = true;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.f21217b = false;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case 0:
            case 1:
                this.f21217b = false;
                break;
        }
    }
}
