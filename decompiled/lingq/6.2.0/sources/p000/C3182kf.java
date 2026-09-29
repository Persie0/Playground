package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes.dex */
public final class C3182kf implements InterfaceC3036gf {

    /* JADX INFO: renamed from: c */
    public static volatile C3182kf f47116c;

    /* JADX INFO: renamed from: a */
    public final AppMeasurementSdk f47117a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f47118b;

    public C3182kf(AppMeasurementSdk appMeasurementSdk) {
        lda.m16130p(appMeasurementSdk);
        this.f47117a = appMeasurementSdk;
        this.f47118b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m15167a(String str, String str2, Bundle bundle) {
        if (urb.m22874a(str) && urb.m22875b(str2, bundle) && urb.m22877d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f47117a.logEvent(str, str2, bundle);
        }
    }

    /* JADX INFO: renamed from: b */
    public final jj5 m15168b(String str, b64 b64Var) {
        Object obj;
        nr9 nr9Var;
        cdb cdbVar;
        if (urb.m22874a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f47118b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f47117a;
                if (zEquals) {
                    cdbVar = new cdb(appMeasurementSdk, b64Var);
                } else if ("clx".equals(str)) {
                    nr9Var = new nr9();
                    nr9Var.f53173a = b64Var;
                    appMeasurementSdk.m5845a(new d4c(nr9Var));
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj = nr9Var;
                    obj = cdbVar;
                    concurrentHashMap.put(str, obj);
                    return new jj5(6);
                }
            }
        }
        obj = nr9Var;
        obj = cdbVar;
        return null;
    }
}
