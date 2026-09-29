package p000;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: c */
    public static SharedPreferences f52761c;

    /* JADX INFO: renamed from: a */
    public static final ni7 f52759a = new ni7();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f52760b = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f52762d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m17439a(String str, String str2) {
        if (lp1.f49971a.contains(ni7.class)) {
            return;
        }
        try {
            str2.getClass();
            if (!f52762d.get()) {
                f52759a.m17441c();
            }
            LinkedHashMap linkedHashMap = f52760b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = f52761c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", bna.m3962m0(AbstractC3194a.m15371X(linkedHashMap))).apply();
            } else {
                fa4.m11636J("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            lp1.m16420a(ni7.class, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m17440b(View view, String str) {
        if (lp1.f49971a.contains(ni7.class)) {
            return null;
        }
        try {
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = mta.m17041i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return bna.m3978u0(jSONObject.toString());
        } catch (Throwable th) {
            lp1.m16420a(ni7.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17441c() {
        String str = "";
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f52762d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            f52761c = sharedPreferences;
            LinkedHashMap linkedHashMap = f52760b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(bna.m3951g0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
