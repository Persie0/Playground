package p431v7;

import android.content.SharedPreferences;
import dm.C5207g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.C6753d;
import kotlin.text.C7076b;
import org.json.JSONObject;
import p173i8.C6205a;
import p291o7.C8004n;
import p476x7.C10107f;

/* JADX INFO: renamed from: v7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9664h {

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f49493b;

    /* JADX INFO: renamed from: a */
    public static final C9664h f49492a = new C9664h();

    /* JADX INFO: renamed from: c */
    public static final CopyOnWriteArraySet f49494c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f49495d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final boolean m18143d() {
        if (C6205a.m12742b(C9664h.class)) {
            return false;
        }
        try {
            f49492a.m18148f();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f49493b;
            if (sharedPreferences == null) {
                C5207g.m11117l("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 != 0 && jCurrentTimeMillis - j10 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f49493b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
                return true;
            }
            C5207g.m11117l("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            C6205a.m12741a(C9664h.class, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m18144e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        if (C6205a.m12742b(C9664h.class)) {
            return;
        }
        try {
            C5207g.m11111f(concurrentHashMap, "purchaseDetailsMap");
            C5207g.m11111f(concurrentHashMap2, "skuDetailsMap");
            C9664h c9664h = f49492a;
            c9664h.m18148f();
            LinkedHashMap linkedHashMapM18147c = c9664h.m18147c(c9664h.m18145a(concurrentHashMap), concurrentHashMap2);
            if (C6205a.m12742b(c9664h)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapM18147c.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str != null && str2 != null) {
                        C10107f.m18965a(str, str2, false);
                    }
                }
            } catch (Throwable th2) {
                C6205a.m12741a(c9664h, th2);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(C9664h.class, th3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m18145a(ConcurrentHashMap concurrentHashMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(concurrentHashMap, "purchaseDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = C6753d.m13465R0(concurrentHashMap).entrySet().iterator();
            loop0: while (true) {
                while (true) {
                    boolean zHasNext = it.hasNext();
                    copyOnWriteArraySet = f49494c;
                    if (!zHasNext) {
                        break loop0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    try {
                        if (!jSONObject.has("purchaseToken")) {
                            break;
                        }
                        String string = jSONObject.getString("purchaseToken");
                        if (f49495d.containsKey(string)) {
                            concurrentHashMap.remove(str);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(jCurrentTimeMillis);
                            copyOnWriteArraySet.add(sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            SharedPreferences sharedPreferences = f49493b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(concurrentHashMap);
            }
            C5207g.m11117l("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18146b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f49493b;
            if (sharedPreferences == null) {
                C5207g.m11117l("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences2 = f49493b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                    return;
                } else {
                    C5207g.m11117l("sharedPreferences");
                    throw null;
                }
            }
            if (jCurrentTimeMillis - j10 > 604800) {
                ConcurrentHashMap concurrentHashMap = f49495d;
                Iterator it = C6753d.m13465R0(concurrentHashMap).entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    copyOnWriteArraySet = f49494c;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    if (jCurrentTimeMillis - jLongValue > 86400) {
                        copyOnWriteArraySet.remove(str + ';' + jLongValue);
                        concurrentHashMap.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f49493b;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                } else {
                    C5207g.m11117l("sharedPreferences");
                    throw null;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap m18147c(HashMap map, ConcurrentHashMap concurrentHashMap) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(map, "purchaseDetailsMap");
            C5207g.m11111f(concurrentHashMap, "skuDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) concurrentHashMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (jCurrentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String string = jSONObject.toString();
                            C5207g.m11110e(string, "purchaseDetail.toString()");
                            String string2 = jSONObject2.toString();
                            C5207g.m11110e(string2, "skuDetail.toString()");
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18148f() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C8004n.m15871a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = C8004n.m15871a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            C5207g.m11110e(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f49493b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f49494c;
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            copyOnWriteArraySet.addAll(stringSet);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                List listM14299s3 = C7076b.m14299s3((String) it.next(), new String[]{";"}, 2, 2);
                f49495d.put(listM14299s3.get(0), Long.valueOf(Long.parseLong((String) listM14299s3.get(1))));
            }
            m18146b();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
