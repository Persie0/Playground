package p000;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class st2 {

    /* JADX INFO: renamed from: b */
    public static boolean f61383b;

    /* JADX INFO: renamed from: a */
    public static final st2 f61382a = new st2();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f61384c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final HashSet f61385d = new HashSet();

    /* JADX INFO: renamed from: b */
    public static final void m21735b(ArrayList arrayList) {
        if (lp1.f49971a.contains(st2.class)) {
            return;
        }
        try {
            arrayList.getClass();
            if (f61383b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (f61385d.contains(((AppEvent) it.next()).f11384e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(st2.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21736a() {
        try {
            if (lp1.f49971a.contains(this)) {
                return;
            }
            try {
                w23 w23VarM24862k = y23.m24862k(sy2.m21767b(), false);
                if (w23VarM24862k == null) {
                    return;
                }
                String str = w23VarM24862k.f66263l;
                if (str != null && str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    f61384c.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                HashSet hashSet = f61385d;
                                next.getClass();
                                hashSet.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                next.getClass();
                                rt2 rt2Var = new rt2(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    rt2Var.m20777c(bna.m3916E(jSONArrayOptJSONArray));
                                }
                                f61384c.add(rt2Var);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
