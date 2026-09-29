package p431v7;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5074n;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p476x7.C10107f;

/* JADX INFO: renamed from: v7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9659c {

    /* JADX INFO: renamed from: a */
    public static final C9659c f49447a = new C9659c();

    /* JADX INFO: renamed from: b */
    public static final String f49448b = C9659c.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f49449c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static Boolean f49450d;

    /* JADX INFO: renamed from: e */
    public static Boolean f49451e;

    /* JADX INFO: renamed from: f */
    public static ServiceConnectionC9657a f49452f;

    /* JADX INFO: renamed from: g */
    public static C9658b f49453g;

    /* JADX INFO: renamed from: h */
    public static Intent f49454h;

    /* JADX INFO: renamed from: i */
    public static Object f49455i;

    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m18118a(C9659c c9659c, Context context, ArrayList arrayList, boolean z10) {
        LinkedHashMap linkedHashMapM18141j;
        String str;
        String str2;
        c9659c.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            try {
                String string = new JSONObject(str3).getString("productId");
                C5207g.m11110e(string, "sku");
                C5207g.m11110e(str3, "purchase");
                map.put(string, str3);
                arrayList2.add(string);
            } catch (JSONException e10) {
                Log.e(f49448b, "Error parsing in-app purchase data.", e10);
            }
        }
        C9663g c9663g = C9663g.f49486a;
        Object obj = f49455i;
        C9663g c9663g2 = C9663g.f49486a;
        if (!C6205a.m12742b(C9663g.class)) {
            try {
                linkedHashMapM18141j = c9663g2.m18141j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (String str4 : arrayList2) {
                    if (!linkedHashMapM18141j.containsKey(str4)) {
                        arrayList3.add(str4);
                    }
                }
                linkedHashMapM18141j.putAll(c9663g2.m18138g(context, arrayList3, obj, z10));
            } catch (Throwable th2) {
                C6205a.m12741a(C9663g.class, th2);
                linkedHashMapM18141j = null;
            }
            for (Map.Entry entry : linkedHashMapM18141j.entrySet()) {
                String str5 = (String) entry.getKey();
                str = (String) entry.getValue();
                str2 = (String) map.get(str5);
                if (str2 == null) {
                    C10107f.m18965a(str2, str, z10);
                }
            }
        }
        linkedHashMapM18141j = null;
        while (r12.hasNext()) {
            String str6 = (String) entry.getKey();
            str = (String) entry.getValue();
            str2 = (String) map.get(str6);
            if (str2 == null) {
                C10107f.m18965a(str2, str, z10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public static final void m18119b() {
        f49447a.getClass();
        if (f49450d == null) {
            Boolean boolValueOf = Boolean.valueOf(C9667k.m18152a("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f49450d = boolValueOf;
            if (!C5207g.m11106a(boolValueOf, Boolean.FALSE)) {
                f49451e = Boolean.valueOf(C9667k.m18152a("com.android.billingclient.api.ProxyBillingActivity") != null);
                C9663g c9663g = C9663g.f49486a;
                if (!C6205a.m12742b(C9663g.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = C9663g.f49490e;
                        long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j10 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j10 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(C9663g.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                C5207g.m11110e(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f49454h = intent;
                f49452f = new ServiceConnectionC9657a();
                f49453g = new C9658b();
            }
        }
        if (C5207g.m11106a(f49450d, Boolean.FALSE)) {
            return;
        }
        C10107f c10107f = C10107f.f51262a;
        C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
        if (c5074nM6670b != null && C7993c0.m15849b() && c5074nM6670b.f32975i) {
            if (!f49449c.compareAndSet(false, true)) {
                return;
            }
            Context contextM15871a = C8004n.m15871a();
            if (contextM15871a instanceof Application) {
                Application application = (Application) contextM15871a;
                C9658b c9658b = f49453g;
                if (c9658b == null) {
                    C5207g.m11117l("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(c9658b);
                Intent intent2 = f49454h;
                if (intent2 == null) {
                    C5207g.m11117l("intent");
                    throw null;
                }
                ServiceConnectionC9657a serviceConnectionC9657a = f49452f;
                if (serviceConnectionC9657a != null) {
                    contextM15871a.bindService(intent2, serviceConnectionC9657a, 1);
                } else {
                    C5207g.m11117l("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
