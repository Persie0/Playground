package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class w24 {

    /* JADX INFO: renamed from: a */
    public static final w24 f66276a = new w24();

    /* JADX INFO: renamed from: b */
    public static final HashMap f66277b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final HashMap f66278c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final String f66279d = sy2.m21766a().getPackageName();

    /* JADX INFO: renamed from: e */
    public static final SharedPreferences f66280e = sy2.m21766a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f */
    public static final SharedPreferences f66281f = sy2.m21766a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* JADX INFO: renamed from: f */
    public static final ArrayList m23676f(Context context, Object obj) {
        if (lp1.f49971a.contains(w24.class)) {
            return null;
        }
        try {
            w24 w24Var = f66276a;
            return w24Var.m23677a(w24Var.m23681e(context, obj, "inapp"));
        } catch (Throwable th) {
            lp1.m16420a(w24.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m23677a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f66281f;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= 86400 && !fa4.m11650l(sharedPreferences.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Class m23678b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap map = f66278c;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return null;
        }
        try {
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            if (set.contains(b34.class)) {
                clsLoadClass = null;
            } else {
                try {
                    clsLoadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                } catch (Throwable th) {
                    lp1.m16420a(b34.class, th);
                    clsLoadClass = null;
                }
            }
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX INFO: renamed from: c */
    public final Method m23679c(Class cls, String str) {
        Class[] clsArr;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            HashMap map = f66277b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            Class cls2 = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodM3247m = clsArr == null ? b34.m3247m(cls, str, null) : b34.m3247m(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodM3247m != null) {
                map.put(str, methodM3247m);
            }
            return methodM3247m;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX INFO: renamed from: d */
    public final ArrayList m23680d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (m23685j(context2, obj2, "inapp")) {
                int i = 0;
                boolean z = false;
                String string = null;
                while (true) {
                    Object objM23684i = m23684i(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, f66279d, "inapp", string, new Bundle()});
                    if (objM23684i != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objM23684i;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        string = null;
                    }
                    if (i >= 30 || string == null || z) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX INFO: renamed from: e */
    public final ArrayList m23681e(Context context, Object obj, String str) {
        w24 w24Var;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && m23685j(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    w24Var = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objM23684i = w24Var.m23684i(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, f66279d, str, string});
                        if (objM23684i == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objM23684i;
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
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = w24Var;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        lp1.m16420a(w24Var, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            w24Var = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: g */
    public final LinkedHashMap m23682g(Context context, ArrayList arrayList, Object obj, boolean z) {
        w24 w24Var;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                w24Var = this;
                try {
                    Object objM23684i = w24Var.m23684i(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, f66279d, z ? "subs" : "inapp", bundle});
                    if (objM23684i != null) {
                        Bundle bundle2 = (Bundle) objM23684i;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            w24Var.m23687l(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    lp1.m16420a(w24Var, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            w24Var = this;
            lp1.m16420a(w24Var, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m23683h(String str) {
        if (lp1.f49971a.contains(this)) {
            return false;
        }
        try {
            str.getClass();
            try {
                String strOptString = new JSONObject(str).optString("freeTrialPeriod");
                return strOptString != null && strOptString.length() > 0;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m23684i(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodM23679c;
        if (!lp1.f49971a.contains(this)) {
            try {
                Class clsM23678b = m23678b(context, str);
                if (clsM23678b != null && (methodM23679c = m23679c(clsM23678b, str2)) != null) {
                    return b34.m3252s(clsM23678b, obj, methodM23679c, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m23685j(Context context, Object obj, String str) {
        w24 w24Var;
        if (!lp1.f49971a.contains(this) && obj != null) {
            try {
                w24Var = this;
                try {
                    Object objM23684i = w24Var.m23684i(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f66279d, str});
                    if (objM23684i != null && ((Integer) objM23684i).intValue() == 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    lp1.m16420a(w24Var, th);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                w24Var = this;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap m23686k(ArrayList arrayList) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f66280e.getString(str, null);
                if (string != null) {
                    List listM23365A0 = vk9.m23365A0(string, new String[]{";"}, 2, 2);
                    if (jCurrentTimeMillis - Long.parseLong((String) listM23365A0.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, listM23365A0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m23687l(LinkedHashMap linkedHashMap) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f66280e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
