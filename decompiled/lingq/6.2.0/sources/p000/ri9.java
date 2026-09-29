package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ri9 {

    /* JADX INFO: renamed from: b */
    public static boolean f59371b;

    /* JADX INFO: renamed from: a */
    public static final ri9 f59370a = new ri9();

    /* JADX INFO: renamed from: c */
    public static final HashMap f59372c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final HashMap f59373d = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final void m20668d(Bundle bundle) {
        ri9 ri9Var = f59370a;
        HashMap map = f59373d;
        if (lp1.f49971a.contains(ri9.class)) {
            return;
        }
        try {
            if (f59371b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(str));
                    HashMap map2 = f59372c;
                    boolean z = false;
                    boolean z2 = map2.get(str) != null;
                    boolean z3 = map.get(str) != null;
                    if (z2 || z3) {
                        Set set = (Set) map2.get(str);
                        if (!lp1.f49971a.contains(ri9Var) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (it.hasNext()) {
                                        if (new Regex((String) it.next()).m15427f(strValueOf)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                lp1.m16420a(ri9Var, th);
                            }
                        }
                        boolean zM20670b = ri9Var.m20670b(strValueOf, (Set) map.get(str));
                        if (!z && !zM20670b) {
                            str.getClass();
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(ri9.class, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20669a(JSONArray jSONArray) {
        HashMap map = f59372c;
        HashMap map2 = f59373d;
        if (lp1.f49971a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (f59371b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet hashSetM20671c = m20671c(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                HashSet hashSet = (HashSet) map2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetM20671c);
                                    hashSetM20671c = hashSet;
                                }
                                map2.put(string, hashSetM20671c);
                            } else {
                                HashSet hashSet2 = (HashSet) map.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetM20671c);
                                    hashSetM20671c = hashSet2;
                                }
                                map.put(string, hashSetM20671c);
                            }
                        }
                    } catch (Exception unused) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20670b(String str, Set set) {
        if (!lp1.f49971a.contains(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (lowerCase.equals(lowerCase2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final HashSet m20671c(JSONArray jSONArray) {
        try {
            if (lp1.f49971a.contains(this)) {
                return null;
            }
            try {
                HashSet hashSetM3915D = bna.m3915D(jSONArray);
                return hashSetM3915D == null ? new HashSet() : hashSetM3915D;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
