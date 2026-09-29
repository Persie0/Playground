package p000;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m24 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f50449a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static Boolean f50450b;

    /* JADX INFO: renamed from: c */
    public static Boolean f50451c;

    /* JADX INFO: renamed from: d */
    public static k24 f50452d;

    /* JADX INFO: renamed from: e */
    public static l24 f50453e;

    /* JADX INFO: renamed from: f */
    public static Intent f50454f;

    /* JADX INFO: renamed from: g */
    public static Object f50455g;

    /* JADX INFO: renamed from: h */
    public static InAppPurchaseUtils$BillingClientVersion f50456h;

    /* JADX INFO: renamed from: a */
    public static final void m16601a(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e) {
                Log.e("m24", "Error parsing in-app purchase data.", e);
            }
        }
        Object obj = f50455g;
        w24 w24Var = w24.f66276a;
        LinkedHashMap linkedHashMap = null;
        if (!lp1.f49971a.contains(w24.class)) {
            try {
                LinkedHashMap linkedHashMapM23686k = w24Var.m23686k(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList2) {
                    if (!linkedHashMapM23686k.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                linkedHashMapM23686k.putAll(w24Var.m23682g(context, arrayList3, obj, z));
                linkedHashMap = linkedHashMapM23686k;
            } catch (Throwable th) {
                lp1.m16420a(w24.class, th);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) map.get(str3);
            if (str5 != null) {
                c60.m4340d(str5, str4, z, f50456h, false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16602b(InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion) {
        inAppPurchaseUtils$BillingClientVersion.getClass();
        if (f50450b == null) {
            Boolean boolValueOf = Boolean.valueOf(b34.m3246l("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f50450b = boolValueOf;
            if (!boolValueOf.equals(Boolean.FALSE)) {
                f50451c = Boolean.valueOf(b34.m3246l("com.android.billingclient.api.ProxyBillingActivity") != null);
                w24 w24Var = w24.f66276a;
                if (!lp1.f49971a.contains(w24.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = w24.f66280e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(w24.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f50454f = intent;
                f50452d = new k24();
                f50453e = new l24();
            }
        }
        if (!fa4.m11650l(f50450b, Boolean.FALSE) && c60.m4339c()) {
            f50456h = inAppPurchaseUtils$BillingClientVersion;
            if (f50449a.compareAndSet(false, true)) {
                Context contextM21766a = sy2.m21766a();
                if (contextM21766a instanceof Application) {
                    Application application = (Application) contextM21766a;
                    l24 l24Var = f50453e;
                    if (l24Var == null) {
                        fa4.m11636J("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(l24Var);
                    Intent intent2 = f50454f;
                    if (intent2 == null) {
                        fa4.m11636J("intent");
                        throw null;
                    }
                    k24 k24Var = f50452d;
                    if (k24Var != null) {
                        contextM21766a.bindService(intent2, k24Var, 1);
                    } else {
                        fa4.m11636J("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }
}
