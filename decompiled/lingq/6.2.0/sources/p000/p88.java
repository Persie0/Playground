package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p88 {

    /* JADX INFO: renamed from: b */
    public static boolean f55758b;

    /* JADX INFO: renamed from: a */
    public static final p88 f55757a = new p88();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f55759c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final CopyOnWriteArraySet f55760d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public final String m18975a(String str, String str2) {
        if (!lp1.f49971a.contains(this)) {
            try {
                try {
                    for (o88 o88Var : new ArrayList(f55759c)) {
                        if (o88Var != null && fa4.m11650l(str, o88Var.m17851a())) {
                            for (String str3 : ((HashMap) o88Var.m17852b()).keySet()) {
                                if (fa4.m11650l(str2, str3)) {
                                    return (String) ((HashMap) o88Var.m17852b()).get(str3);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w("p88", "getMatchedRuleType failed", e);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m18976b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = f55760d;
        ArrayList arrayList = f55759c;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
            if (w23VarM24862k != null && (str = w23VarM24862k.f66263l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        next.getClass();
                        o88 o88Var = new o88(next, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            o88Var.m17853c(bna.m3918G(jSONObjectOptJSONObject));
                            arrayList.add(o88Var);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(o88Var.m17851a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
