package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.kochava.tracker.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo3 {

    /* JADX INFO: renamed from: a */
    public static final sq5 f68429a;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f68429a = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "GoogleUtil");
    }

    /* JADX INFO: renamed from: a */
    public static Pair m24624a(Context context) throws Exception {
        try {
            Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
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
            throw new Exception("Cannot retrieve Google Advertising ID, Not running on device with Google Play Services or missing required library.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Pair m24625b(Context context) throws Exception {
        try {
            Object objInvoke = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, context);
            if (objInvoke == null) {
                throw new Exception();
            }
            Object objInvoke2 = Tasks.class.getMethod("await", Task.class, Long.TYPE, TimeUnit.class).invoke(null, objInvoke.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke, null), 500L, TimeUnit.MILLISECONDS);
            if (objInvoke2 == null) {
                throw new Exception();
            }
            String strM3217L = b34.m3217L(objInvoke2.getClass().getMethod("getId", null).invoke(objInvoke2, null));
            if (strM3217L == null) {
                throw new Exception();
            }
            Integer numM3211F = b34.m3211F(objInvoke2.getClass().getMethod("getScope", null).invoke(objInvoke2, null));
            if (numM3211F != null) {
                return Pair.create(strM3217L, numM3211F);
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Google App Set ID, Not running on device with Google Play Services or missing required library.");
        }
    }
}
