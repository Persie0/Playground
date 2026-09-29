package p409u7;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: u7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9475a {

    /* JADX INFO: renamed from: b */
    public static boolean f48580b;

    /* JADX INFO: renamed from: a */
    public static final C9475a f48579a = new C9475a();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f48581c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final HashSet f48582d = new HashSet();

    /* JADX INFO: renamed from: u7.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f48583a;

        /* JADX INFO: renamed from: b */
        public List<String> f48584b;

        public a(ArrayList arrayList, String str) {
            this.f48583a = str;
            this.f48584b = arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17895b(ArrayList arrayList) {
        if (C6205a.m12742b(C9475a.class)) {
            return;
        }
        try {
            C5207g.m11111f(arrayList, "events");
            if (f48580b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (f48582d.contains(((AppEvent) it.next()).f11483d)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9475a.class, th2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m17896a() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
            C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(C8004n.m15872b(), false);
            if (c5074nM6673f != null) {
                String str = c5074nM6673f.f32981o;
                if (str != null) {
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        f48581c.clear();
                        Iterator<String> itKeys = jSONObject.keys();
                        loop0: while (true) {
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    break loop0;
                                }
                                String next = itKeys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        HashSet hashSet = f48582d;
                                        C5207g.m11110e(next, "key");
                                        hashSet.add(next);
                                    } else {
                                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C5207g.m11110e(next, "key");
                                        a aVar = new a(new ArrayList(), next);
                                        if (jSONArrayOptJSONArray != null) {
                                            aVar.f48584b = C5086z.m10822g(jSONArrayOptJSONArray);
                                        }
                                        f48581c.add(aVar);
                                    }
                                }
                            }
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
