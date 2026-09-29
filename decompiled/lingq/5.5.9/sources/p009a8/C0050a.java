package p009a8;

import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: a8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0050a {

    /* JADX INFO: renamed from: b */
    public static boolean f61b;

    /* JADX INFO: renamed from: a */
    public static final C0050a f60a = new C0050a();

    /* JADX INFO: renamed from: c */
    public static final String f62c = C0050a.class.getCanonicalName();

    /* JADX INFO: renamed from: d */
    public static final ArrayList f63d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static final CopyOnWriteArraySet f64e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a8.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f65a;

        /* JADX INFO: renamed from: b */
        public Map<String, String> f66b;

        public a(String str, HashMap map) {
            this.f65a = str;
            this.f66b = map;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m206a(String str, String str2) {
        try {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                for (a aVar : new ArrayList(f63d)) {
                    if (aVar != null && C5207g.m11106a(str, aVar.f65a)) {
                        for (String str3 : aVar.f66b.keySet()) {
                            if (C5207g.m11106a(str2, str3)) {
                                return aVar.f66b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(f62c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m207b() {
        String str;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
            C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
            if (c5074nM6673f != null && (str = c5074nM6673f.f32981o) != null) {
                if (str.length() == 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = f63d;
                arrayList.clear();
                CopyOnWriteArraySet copyOnWriteArraySet = f64e;
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        C5207g.m11110e(next, "key");
                        a aVar = new a(next, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            aVar.f66b = C5086z.m10824i(jSONObjectOptJSONObject);
                            arrayList.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
