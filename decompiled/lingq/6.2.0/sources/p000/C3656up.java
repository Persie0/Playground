package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: up */
/* JADX INFO: loaded from: classes2.dex */
public final class C3656up extends AbstractC3284l3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f64154c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C3804yp f64155d;

    /* JADX INFO: renamed from: e */
    public final Object f64156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3656up(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp, Context context) {
        super(layoutInflaterFactory2C3804yp);
        this.f64155d = layoutInflaterFactory2C3804yp;
        this.f64156e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: d */
    public final IntentFilter mo15759d() {
        switch (this.f64154c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: j */
    public final void mo15765j() {
        int i = this.f64154c;
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f64155d;
        switch (i) {
            case 0:
                layoutInflaterFactory2C3804yp.m25229l(true, true);
                break;
            default:
                layoutInflaterFactory2C3804yp.m25229l(true, true);
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m22847m() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.f64154c;
        Object obj = this.f64156e;
        switch (i) {
            case 0:
                return AbstractC3506qp.m20094a((PowerManager) obj) ? 2 : 1;
            default:
                mq7 mq7Var = (mq7) obj;
                gda gdaVar = (gda) mq7Var.f51735d;
                LocationManager locationManager = (LocationManager) mq7Var.f51734c;
                if (gdaVar.f40598b <= System.currentTimeMillis()) {
                    Context context = (Context) mq7Var.f51733b;
                    Location lastKnownLocation2 = null;
                    if (q0c.m19594b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (q0c.m19594b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (vc0.f65177e == null) {
                            vc0.f65177e = new vc0();
                        }
                        vc0 vc0Var = vc0.f65177e;
                        vc0Var.m23226a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        vc0Var.m23226a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = vc0Var.f65180c == 1;
                        long j2 = vc0Var.f65179b;
                        long j3 = vc0Var.f65178a;
                        vc0Var.m23226a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = vc0Var.f65179b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        gdaVar.f40597a = z;
                        gdaVar.f40598b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = gdaVar.f40597a;
                }
                return z ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3656up(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp, mq7 mq7Var) {
        super(layoutInflaterFactory2C3804yp);
        this.f64155d = layoutInflaterFactory2C3804yp;
        this.f64156e = mq7Var;
    }
}
