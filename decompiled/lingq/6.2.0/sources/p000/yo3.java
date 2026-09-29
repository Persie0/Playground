package p000;

import android.os.Bundle;
import android.p001os.OutcomeReceiver;
import android.util.Log;
import com.facebook.appevents.gps.ara.C0923a;

/* JADX INFO: loaded from: classes.dex */
public final class yo3 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        String str;
        zo3 zo3Var;
        Exception exc = (Exception) th;
        exc.getClass();
        if (lp1.f49971a.contains(C0923a.class)) {
            str = null;
        } else {
            try {
                str = C0923a.f11396b;
            } catch (Throwable th2) {
                lp1.m16420a(C0923a.class, th2);
                str = null;
            }
        }
        Log.d(str, "OUTCOME_RECEIVER_TRIGGER_FAILURE");
        if (lp1.f49971a.contains(C0923a.class)) {
            zo3Var = null;
        } else {
            try {
                zo3Var = C0923a.f11398d;
            } catch (Throwable th3) {
                lp1.m16420a(C0923a.class, th3);
                zo3Var = null;
            }
        }
        if (zo3Var == null) {
            fa4.m11636J("gpsDebugLogger");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("gps_ara_failed_reason", exc.toString());
        zo3Var.m25724a("gps_ara_failed", bundle);
    }

    public final void onResult(Object obj) {
        String str;
        zo3 zo3Var;
        obj.getClass();
        if (lp1.f49971a.contains(C0923a.class)) {
            str = null;
        } else {
            try {
                str = C0923a.f11396b;
            } catch (Throwable th) {
                lp1.m16420a(C0923a.class, th);
                str = null;
            }
        }
        Log.d(str, "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
        if (lp1.f49971a.contains(C0923a.class)) {
            zo3Var = null;
        } else {
            try {
                zo3Var = C0923a.f11398d;
            } catch (Throwable th2) {
                lp1.m16420a(C0923a.class, th2);
                zo3Var = null;
            }
        }
        if (zo3Var != null) {
            zo3Var.m25724a("gps_ara_succeed", null);
        } else {
            fa4.m11636J("gpsDebugLogger");
            throw null;
        }
    }
}
