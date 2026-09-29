package p000;

import android.content.Context;
import android.util.Pair;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class ix3 {

    /* JADX INFO: renamed from: a */
    public static final sq5 f44728a;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f44728a = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "HuaweiUtil");
    }

    /* JADX INFO: renamed from: a */
    public static Pair m14179a(Context context) throws Exception {
        try {
            Object objInvoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            if (objInvoke == null) {
                throw new Exception();
            }
            String str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
            if (str == null) {
                throw new Exception();
            }
            Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
            if (bool != null) {
                return Pair.create(str, bool);
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Huawei Advertising ID, Not running on device with HMS Core or missing required library.");
        }
    }
}
