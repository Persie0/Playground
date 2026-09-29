package p000;

import android.os.Bundle;
import android.p001os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class e17 implements OutcomeReceiver {
    public final void onError(Throwable th) {
        String str;
        zo3 zo3Var;
        Exception exc = (Exception) th;
        exc.getClass();
        if (lp1.f49971a.contains(f17.class)) {
            str = null;
        } else {
            try {
                str = f17.f38244b;
            } catch (Throwable th2) {
                lp1.m16420a(f17.class, th2);
                str = null;
            }
        }
        Log.e(str, exc.toString());
        if (lp1.f49971a.contains(f17.class)) {
            zo3Var = null;
        } else {
            try {
                zo3Var = f17.f38248f;
            } catch (Throwable th3) {
                lp1.m16420a(f17.class, th3);
                zo3Var = null;
            }
        }
        if (zo3Var == null) {
            fa4.m11636J("gpsDebugLogger");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("gps_pa_failed_reason", exc.toString());
        zo3Var.m25724a("gps_pa_failed", bundle);
    }

    public final void onResult(Object obj) {
        String str;
        zo3 zo3Var;
        obj.getClass();
        if (lp1.f49971a.contains(f17.class)) {
            str = null;
        } else {
            try {
                str = f17.f38244b;
            } catch (Throwable th) {
                lp1.m16420a(f17.class, th);
                str = null;
            }
        }
        Log.i(str, "Successfully joined custom audience");
        if (lp1.f49971a.contains(f17.class)) {
            zo3Var = null;
        } else {
            try {
                zo3Var = f17.f38248f;
            } catch (Throwable th2) {
                lp1.m16420a(f17.class, th2);
                zo3Var = null;
            }
        }
        if (zo3Var != null) {
            zo3Var.m25724a("gps_pa_succeed", null);
        } else {
            fa4.m11636J("gpsDebugLogger");
            throw null;
        }
    }
}
