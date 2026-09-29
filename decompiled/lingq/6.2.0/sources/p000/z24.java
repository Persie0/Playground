package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.internal.FeatureManager$Feature;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class z24 {

    /* JADX INFO: renamed from: d */
    public static String f70785d;

    /* JADX INFO: renamed from: a */
    public static final z24 f70782a = new z24();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f70783b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f70784c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f70786e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX INFO: renamed from: c */
    public static final synchronized Bundle m25416c(List list, long j, boolean z, List list2) {
        Bundle bundle;
        ?? M25419b;
        ?? r6;
        ?? ValueOf;
        boolean z2;
        List list3 = list2;
        synchronized (z24.class) {
            Bundle bundle2 = null;
            if (lp1.f49971a.contains(z24.class)) {
                return null;
            }
            try {
                if (list3.isEmpty()) {
                    return null;
                }
                if (list.size() != list3.size()) {
                    return null;
                }
                ArrayList<Pair> arrayList = new ArrayList();
                int size = list.size();
                ?? bundle3 = 0;
                int i = 0;
                while (i < size) {
                    j24 j24Var = (j24) list.get(i);
                    Pair pair = (Pair) list3.get(i);
                    Bundle bundle4 = (Bundle) pair.f47623a;
                    jz6 jz6Var = (jz6) pair.f47624b;
                    bundle = bundle2;
                    try {
                        int i2 = i;
                        j24 j24Var2 = new j24(j24Var.m14274c(), new BigDecimal(String.valueOf(j24Var.m14272a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), j24Var.m14273b());
                        List<Pair> list4 = z ? (List) f70783b.get(j24Var2) : (List) f70784c.get(j24Var2);
                        List list5 = list4;
                        if (list5 == null || list5.isEmpty()) {
                            M25419b = bundle;
                            r6 = M25419b;
                            ValueOf = r6;
                            z2 = false;
                        } else {
                            M25419b = bundle;
                            r6 = M25419b;
                            ValueOf = r6;
                            z2 = false;
                            for (Pair pair2 : list4) {
                                long jLongValue = ((Number) pair2.f47623a).longValue();
                                Pair pair3 = (Pair) pair2.f47624b;
                                Bundle bundle5 = (Bundle) pair3.f47623a;
                                jz6 jz6Var2 = (jz6) pair3.f47624b;
                                if (Math.abs(j - jLongValue) <= v24.m23062d() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    z24 z24Var = f70782a;
                                    boolean z3 = !z;
                                    if (lp1.f49971a.contains(z24.class)) {
                                        M25419b = bundle;
                                    } else {
                                        try {
                                            M25419b = z24Var.m25419b(bundle4, jz6Var, bundle5, jz6Var2, z3, false);
                                        } catch (Throwable th) {
                                            lp1.m16420a(z24.class, th);
                                            M25419b = bundle;
                                        }
                                    }
                                    String strM25419b = f70782a.m25419b(bundle4, jz6Var, bundle5, jz6Var2, z3, true);
                                    r6 = r6;
                                    if (strM25419b != null) {
                                        r6 = strM25419b;
                                    }
                                    if (M25419b != 0) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new Pair(j24Var2, Long.valueOf(jLongValue)));
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        if (r6 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r6);
                        }
                        if (z2) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / 1000 : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", M25419b);
                        }
                        if (z && !z2) {
                            ConcurrentHashMap concurrentHashMap = f70784c;
                            if (concurrentHashMap.get(j24Var2) == null) {
                                concurrentHashMap.put(j24Var2, new ArrayList());
                            }
                            List list6 = (List) concurrentHashMap.get(j24Var2);
                            if (list6 != null) {
                                list6.add(new Pair(Long.valueOf(j), new Pair(bundle4, jz6Var)));
                            }
                        } else if (!z && !z2) {
                            ConcurrentHashMap concurrentHashMap2 = f70783b;
                            if (concurrentHashMap2.get(j24Var2) == null) {
                                concurrentHashMap2.put(j24Var2, new ArrayList());
                            }
                            List list7 = (List) concurrentHashMap2.get(j24Var2);
                            if (list7 != null) {
                                list7.add(new Pair(Long.valueOf(j), new Pair(bundle4, jz6Var)));
                            }
                        }
                        i = i2 + 1;
                        list3 = list2;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                for (Pair pair4 : arrayList) {
                    List list8 = z ? (List) f70783b.get(pair4.f47623a) : (List) f70784c.get(pair4.f47623a);
                    if (list8 != null) {
                        Iterator it = list8.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            int i4 = i3 + 1;
                            if (((Number) ((Pair) it.next()).f47623a).longValue() == ((Number) pair4.f47624b).longValue()) {
                                list8.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (z) {
                            if (list8.isEmpty()) {
                                f70783b.remove(pair4.f47623a);
                            } else {
                                f70783b.put(pair4.f47623a, list8);
                            }
                        } else if (list8.isEmpty()) {
                            f70784c.remove(pair4.f47623a);
                        } else {
                            f70784c.put(pair4.f47623a, list8);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            lp1.m16420a(z24.class, th);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m25417d() {
        if (lp1.f49971a.contains(z24.class)) {
            return;
        }
        try {
            if (f70786e.get()) {
                InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersionM25418a = f70782a.m25418a();
                int i = y24.f69127a[inAppPurchaseUtils$BillingClientVersionM25418a.ordinal()];
                if (i == 2) {
                    m24.m16602b(InAppPurchaseUtils$BillingClientVersion.V1);
                    return;
                }
                if (i != 3) {
                    if (i == 4 && p13.m18852b(FeatureManager$Feature.IapLoggingLib5To7)) {
                        n24.m17185b(sy2.m21766a(), inAppPurchaseUtils$BillingClientVersionM25418a);
                        return;
                    }
                    return;
                }
                if (p13.m18852b(FeatureManager$Feature.IapLoggingLib2)) {
                    n24.m17185b(sy2.m21766a(), inAppPurchaseUtils$BillingClientVersionM25418a);
                } else {
                    m24.m16602b(InAppPurchaseUtils$BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(z24.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InAppPurchaseUtils$BillingClientVersion m25418a() {
        Set set = lp1.f49971a;
        try {
            if (set.contains(this)) {
                return null;
            }
            try {
                Context contextM21766a = sy2.m21766a();
                ApplicationInfo applicationInfo = contextM21766a.getPackageManager().getApplicationInfo(contextM21766a.getPackageName(), 128);
                applicationInfo.getClass();
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return InAppPurchaseUtils$BillingClientVersion.NONE;
                }
                List listM23365A0 = vk9.m23365A0(string, new String[]{"."}, 3, 2);
                if (string.length() == 0) {
                    return InAppPurchaseUtils$BillingClientVersion.V5_V7;
                }
                String strConcat = "GPBL.".concat(string);
                if (!set.contains(z24.class)) {
                    try {
                        f70785d = strConcat;
                    } catch (Throwable th) {
                        lp1.m16420a(z24.class, th);
                    }
                }
                Integer numM4844a0 = cl9.m4844a0((String) listM23365A0.get(0));
                if (numM4844a0 == null) {
                    return InAppPurchaseUtils$BillingClientVersion.V5_V7;
                }
                int iIntValue = numM4844a0.intValue();
                if (iIntValue == 1) {
                    return InAppPurchaseUtils$BillingClientVersion.V1;
                }
                return iIntValue < 5 ? InAppPurchaseUtils$BillingClientVersion.V2_V4 : InAppPurchaseUtils$BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils$BillingClientVersion.V5_V7;
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m25419b(Bundle bundle, jz6 jz6Var, Bundle bundle2, jz6 jz6Var2, boolean z, boolean z2) {
        if (!lp1.f49971a.contains(this)) {
            try {
                List<Pair> listM23063e = z2 ? v24.m23063e(z) : v24.m23061c(z);
                if (listM23063e != null) {
                    for (Pair pair : listM23063e) {
                        Map map = jz6.f46432b;
                        Object objM11658t = fa4.m11658t(OperationalDataEnum.IAPParameters, (String) pair.f47623a, bundle, jz6Var);
                        String str = objM11658t instanceof String ? (String) objM11658t : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) pair.f47624b) {
                                Map map2 = jz6.f46432b;
                                Object objM11658t2 = fa4.m11658t(OperationalDataEnum.IAPParameters, str2, bundle2, jz6Var2);
                                String str3 = objM11658t2 instanceof String ? (String) objM11658t2 : null;
                                if (str3 != null && str3.length() != 0 && str3.equals(str)) {
                                    return z ? (String) pair.f47623a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }
}
