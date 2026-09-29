package p000;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r38 {

    /* JADX INFO: renamed from: b */
    public static boolean f58559b;

    /* JADX INFO: renamed from: a */
    public static final r38 f58558a = new r38();

    /* JADX INFO: renamed from: c */
    public static HashMap f58560c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m20279a() {
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
                f58560c = new HashMap();
                JSONArray jSONArray = w23VarM24862k.f66267p;
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
                        if (string != null && (hashSetM3915D = bna.m3915D(jSONArray2)) != null) {
                            f58560c.put(string, hashSetM3915D);
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
