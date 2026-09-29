package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aw8 {

    /* JADX INFO: renamed from: b */
    public static boolean f7621b;

    /* JADX INFO: renamed from: a */
    public static final aw8 f7620a = new aw8();

    /* JADX INFO: renamed from: c */
    public static HashSet f7622c = new HashSet();

    /* JADX INFO: renamed from: d */
    public static HashMap f7623d = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final void m3098b(String str, Bundle bundle) {
        if (lp1.f49971a.contains(aw8.class)) {
            return;
        }
        try {
            str.getClass();
            if (f7621b && bundle != null) {
                if (!f7622c.isEmpty() || f7623d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f7623d.get(str);
                        for (String str2 : new ArrayList(bundle.keySet())) {
                            aw8 aw8Var = f7620a;
                            str2.getClass();
                            if (!lp1.f49971a.contains(aw8Var)) {
                                try {
                                    if (f7622c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th) {
                                    lp1.m16420a(aw8Var, th);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(aw8.class, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3099a() {
        HashSet hashSetM3915D;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
            if (w23VarM24862k == null) {
                return;
            }
            try {
                f7622c = new HashSet();
                f7623d = new HashMap();
                JSONArray jSONArray = w23VarM24862k.f66268q;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (jSONArray2 != null && (hashSetM3915D = bna.m3915D(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                f7622c = hashSetM3915D;
                            } else {
                                f7623d.put(string, hashSetM3915D);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
