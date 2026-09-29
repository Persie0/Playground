package p431v7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import dm.C5207g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.C7076b;
import org.json.JSONException;
import org.json.JSONObject;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: v7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9663g {

    /* JADX INFO: renamed from: a */
    public static final C9663g f49486a = new C9663g();

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Method> f49487b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static final HashMap<String, Class<?>> f49488c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public static final String f49489d = C8004n.m15871a().getPackageName();

    /* JADX INFO: renamed from: e */
    public static final SharedPreferences f49490e = C8004n.m15871a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f */
    public static final SharedPreferences f49491f = C8004n.m15871a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* JADX INFO: renamed from: f */
    public static final ArrayList<String> m18132f(Context context, Object obj) {
        if (C6205a.m12742b(C9663g.class)) {
            return null;
        }
        try {
            C9663g c9663g = f49486a;
            return c9663g.m18133a(c9663g.m18137e(context, obj, "inapp"));
        } catch (Throwable th2) {
            C6205a.m12741a(C9663g.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> m18133a(ArrayList<String> arrayList) {
        SharedPreferences sharedPreferences = f49491f;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !C5207g.m11106a(sharedPreferences.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x000b, B:10:0x0016, B:19:0x0035, B:16:0x002e, B:13:0x0024), top: B:25:0x000b, inners: #3 }] */
    /* JADX INFO: renamed from: b */
    public final Class<?> m18134b(Context context, String str) {
        Class<?> clsLoadClass;
        if (C6205a.m12742b(this)) {
            return null;
        }
        HashMap<String, Class<?>> map = f49488c;
        try {
            Class<?> cls = map.get(str);
            if (cls != null) {
                return cls;
            }
            int i10 = C9667k.f49506a;
            if (!C6205a.m12742b(C9667k.class)) {
                try {
                    clsLoadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                } catch (Throwable th2) {
                    C6205a.m12741a(C9667k.class, th2);
                    clsLoadClass = null;
                }
                if (clsLoadClass != null) {
                    map.put(str, clsLoadClass);
                }
                return clsLoadClass;
            }
            clsLoadClass = null;
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final Method m18135c(Class<?> cls, String str) {
        Class[] clsArr;
        Method methodM18153b;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = f49487b;
            Method method = map.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class cls2 = Integer.TYPE;
                        C5207g.m11110e(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Class cls3 = Integer.TYPE;
                        C5207g.m11110e(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                    }
                    break;
                case -1123215065:
                    clsArr = !str.equals("asInterface") ? null : new Class[]{IBinder.class};
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        Class cls4 = Integer.TYPE;
                        C5207g.m11110e(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Class cls5 = Integer.TYPE;
                        C5207g.m11110e(cls5, "TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                    }
                    break;
                default:
                    break;
            }
            if (clsArr == null) {
                methodM18153b = C9667k.m18153b(cls, str, null);
            } else {
                int i10 = C9667k.f49506a;
                methodM18153b = C9667k.m18153b(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodM18153b != null) {
                map.put(str, methodM18153b);
            }
            return methodM18153b;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX INFO: renamed from: d */
    public final ArrayList m18136d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (m18140i(context, obj, "inapp")) {
                char c10 = 0;
                String string = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c10] = 6;
                    objArr[1] = f49489d;
                    objArr[2] = "inapp";
                    objArr[3] = string;
                    objArr[4] = new Bundle();
                    Object objM18139h = m18139h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (objM18139h != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objM18139h;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                        z10 = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i10++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        string = null;
                    }
                    if (i10 >= 30 || string == null || z10) {
                        break;
                    }
                    c10 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[EDGE_INSN: B:30:0x0065->B:23:0x0065 BREAK  A[LOOP:0: B:11:0x001a->B:32:?], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final ArrayList<String> m18137e(Context context, Object obj, String str) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && m18140i(context, obj, str)) {
                String string = null;
                int size = 0;
                do {
                    Object objM18139h = m18139h(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f49489d, str, string});
                    if (objM18139h == null) {
                        string = null;
                        if (size < 30) {
                            break;
                            break;
                        }
                    } else {
                        Bundle bundle = (Bundle) objM18139h;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size < 30) {
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap m18138g(Context context, ArrayList arrayList, Object obj, boolean z10) {
        int size;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f49489d;
                objArr[2] = z10 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object objM18139h = m18139h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (objM18139h != null) {
                    Bundle bundle2 = (Bundle) objM18139h;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && (size = arrayList.size() - 1) >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj2 = arrayList.get(i10);
                                C5207g.m11110e(obj2, "skuList[i]");
                                String str = stringArrayList.get(i10);
                                C5207g.m11110e(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        m18142k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m18139h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodM18135c;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            Class<?> clsM18134b = m18134b(context, str);
            if (clsM18134b != null && (methodM18135c = m18135c(clsM18134b, str2)) != null) {
                int i10 = C9667k.f49506a;
                return C9667k.m18155d(clsM18134b, obj, methodM18135c, Arrays.copyOf(objArr, objArr.length));
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18140i(Context context, Object obj, String str) {
        if (C6205a.m12742b(this) || obj == null) {
            return false;
        }
        try {
            Object objM18139h = m18139h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f49489d, str});
            return objM18139h != null && ((Integer) objM18139h).intValue() == 0;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap m18141j(ArrayList arrayList) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (true) {
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string = f49490e.getString(str, null);
                    if (string != null) {
                        List listM14299s3 = C7076b.m14299s3(string, new String[]{";"}, 2, 2);
                        if (jCurrentTimeMillis - Long.parseLong((String) listM14299s3.get(0)) < 43200) {
                            C5207g.m11110e(str, "sku");
                            linkedHashMap.put(str, listM14299s3.get(1));
                        } else {
                            continue;
                        }
                    }
                }
                return linkedHashMap;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18142k(LinkedHashMap linkedHashMap) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f49490e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
