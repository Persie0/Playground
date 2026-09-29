package vg;

import android.content.Context;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.TimeUnit;
import p136gc.AbstractC5751g;
import p349qo.C8656b;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: vg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9721a {
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final String m18229a(Context context) throws Exception {
        Cursor cursor = null;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
            if (signatureArr == null || signatureArr.length != 1) {
                throw new RuntimeException("App Not Installed");
            }
            boolean z10 = false;
            for (Signature signature : signatureArr) {
                if ("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signature.toCharsString())) {
                    z10 = true;
                }
            }
            if (!z10) {
                throw new RuntimeException("Signature Mismatch");
            }
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                throw new RuntimeException("Failed to read from Content Resolver");
            }
            int columnIndex = cursorQuery.getColumnIndex("aid");
            if (columnIndex == -1) {
                throw new RuntimeException("Failed to read from Cursor");
            }
            String string = cursorQuery.getString(columnIndex);
            if (string == null) {
                throw new RuntimeException("Failed to read from Cursor, value null");
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            try {
                throw new Exception("Cannot retrieve Facebook Attribution ID. Facebook app not installed or logged in.", th2);
            } catch (Throwable th3) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Pair<String, Boolean> m18230b(Context context) throws Exception {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "advertising_id");
            if (string == null) {
                throw new Exception();
            }
            int i10 = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking", -1);
            if (i10 >= 0) {
                return Pair.create(string, Boolean.valueOf(i10 != 0));
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Amazon Kindle Fire Advertising ID. Not running on Kindle Fire Device.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final Pair<String, Boolean> m18231c(Context context) throws Exception {
        try {
            Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            if (objInvoke == null) {
                throw new Exception();
            }
            String str = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
            if (str == null) {
                throw new Exception();
            }
            Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
            if (bool != null) {
                return Pair.create(str, bool);
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Google Advertising ID, Not running on device with Google Play Services or missing required library.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final Pair<String, Integer> m18232d(Context context) throws Exception {
        String string;
        try {
            Object objInvoke = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, context);
            if (objInvoke == null) {
                throw new Exception();
            }
            Object objInvoke2 = Tasks.class.getMethod("await", AbstractC5751g.class, Long.TYPE, TimeUnit.class).invoke(null, objInvoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(objInvoke, new Object[0]), 500L, TimeUnit.MILLISECONDS);
            if (objInvoke2 == null) {
                throw new Exception();
            }
            Object objInvoke3 = objInvoke2.getClass().getMethod("getId", new Class[0]).invoke(objInvoke2, new Object[0]);
            if (objInvoke3 instanceof String) {
                string = (String) objInvoke3;
            } else {
                string = ((objInvoke3 instanceof InterfaceC10488f) || (objInvoke3 instanceof InterfaceC10484b)) ? objInvoke3.toString() : null;
            }
            if (string == null) {
                throw new Exception();
            }
            Integer numM16883J = C8656b.m16883J(objInvoke2.getClass().getMethod("getScope", new Class[0]).invoke(objInvoke2, new Object[0]));
            if (numM16883J != null) {
                return Pair.create(string, numM16883J);
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Google App Set ID, Not running on device with Google Play Services or missing required library.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final Pair<String, Boolean> m18233e(Context context) throws Exception {
        try {
            Object objInvoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            if (objInvoke == null) {
                throw new Exception();
            }
            String str = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
            if (str == null) {
                throw new Exception();
            }
            Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
            if (bool != null) {
                return Pair.create(str, bool);
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Huawei Advertising ID, Not running on device with HMS Core or missing required library.");
        }
    }
}
