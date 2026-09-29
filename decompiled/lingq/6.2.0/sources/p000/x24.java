package p000;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import androidx.compose.material3.internal.ripple.AbstractC0248b;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.AbstractC3194a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x24 implements jh0, qm5, uc0, oc3, e94, jy2, dpb, lkd {

    /* JADX INFO: renamed from: a */
    public static final x24 f67672a = new x24();

    /* JADX INFO: renamed from: b */
    public static final x24 f67673b = new x24();

    /* JADX INFO: renamed from: c */
    public static final x24 f67674c = new x24();

    /* JADX INFO: renamed from: d */
    public static final x24 f67675d = new x24();

    /* JADX INFO: renamed from: e */
    public static final x24 f67676e = new x24();

    public x24(AbstractC0248b abstractC0248b) {
    }

    /* JADX INFO: renamed from: f */
    public static final void m24239f() {
        if (lp1.f49971a.contains(x24.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = sy2.m21766a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            lp1.m16420a(x24.class, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m24240g(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z, String str, InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion, boolean z2) {
        Set set = lp1.f49971a;
        if (set.contains(x24.class)) {
            return;
        }
        try {
            concurrentHashMap.getClass();
            concurrentHashMap2.getClass();
            x24 x24Var = f67672a;
            LinkedHashMap linkedHashMapM24246e = x24Var.m24246e(x24Var.m24245d(concurrentHashMap, z), concurrentHashMap2, str);
            if (set.contains(x24Var)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapM24246e.entrySet()) {
                    c60.m4340d((String) entry.getKey(), (String) entry.getValue(), z, inAppPurchaseUtils$BillingClientVersion, z2);
                }
            } catch (Throwable th) {
                lp1.m16420a(x24Var, th);
            }
        } catch (Throwable th2) {
            lp1.m16420a(x24.class, th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m24241i() {
        if (lp1.f49971a.contains(x24.class)) {
            return false;
        }
        try {
            return !sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th) {
            lp1.m16420a(x24.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m24242k() {
        if (lp1.f49971a.contains(x24.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) vk9.m23365A0((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            m24239f();
        } catch (Throwable th) {
            lp1.m16420a(x24.class, th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m24243l() {
        if (lp1.f49971a.contains(x24.class)) {
            return;
        }
        try {
            try {
                sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lp1.m16420a(x24.class, th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m24244m() {
        if (lp1.f49971a.contains(x24.class)) {
            return;
        }
        try {
            m24243l();
            try {
                SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lp1.m16420a(x24.class, th);
        }
    }

    @Override // p000.uc0
    /* JADX INFO: renamed from: a */
    public long mo18569a(long j) {
        return j;
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: b */
    public Rect mo14254b(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            jh0.f45539n.getClass();
            Log.w(ih0.f44101b, e);
            return j13.f44890g.mo14254b(activity);
        }
    }

    @Override // p000.dpb
    /* JADX INFO: renamed from: c */
    public byte[] mo10577c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX INFO: renamed from: d */
    public HashMap m24245d(Map map, boolean z) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : AbstractC3194a.m15371X(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public LinkedHashMap m24246e(HashMap map, Map map2, String str) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            map2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        string.getClass();
                        String string2 = jSONObject2.toString();
                        string2.getClass();
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        String str = (String) ((is9) obj).f48950a;
        return str == null ? "" : str;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: j */
    public void mo2551j() {
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: n */
    public n8a mo2555n(int i, int i2) {
        return new ug2();
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: q */
    public void mo2558q(st8 st8Var) {
    }
}
