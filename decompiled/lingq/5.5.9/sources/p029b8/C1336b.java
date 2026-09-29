package p029b8;

import android.content.SharedPreferences;
import android.view.View;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C6753d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;
import p394t7.C9218d;

/* JADX INFO: renamed from: b8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1336b {

    /* JADX INFO: renamed from: c */
    public static SharedPreferences f8139c;

    /* JADX INFO: renamed from: a */
    public static final C1336b f8137a = new C1336b();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f8138b = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f8140d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m4906a(String str, String str2) {
        if (C6205a.m12742b(C1336b.class)) {
            return;
        }
        try {
            C5207g.m11111f(str2, "predictedEvent");
            if (!f8140d.get()) {
                f8137a.m4908c();
            }
            LinkedHashMap linkedHashMap = f8138b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = f8139c;
            if (sharedPreferences == null) {
                C5207g.m11117l("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            C5086z c5086z = C5086z.f33015a;
            editorEdit.putString("SUGGESTED_EVENTS_HISTORY", C5086z.m10808G(C6753d.m13465R0(linkedHashMap))).apply();
        } catch (Throwable th2) {
            C6205a.m12741a(C1336b.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m4907b(View view, String str) {
        if (C6205a.m12742b(C1336b.class)) {
            return null;
        }
        try {
            C5207g.m11111f(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                for (View viewM17572h = view; viewM17572h != null; viewM17572h = C9218d.m17572h(viewM17572h)) {
                    jSONArray.put(viewM17572h.getClass().getSimpleName());
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            C5086z c5086z = C5086z.f33015a;
            return C5086z.m10814M(jSONObject.toString());
        } catch (Throwable th2) {
            C6205a.m12741a(C1336b.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4908c() {
        String str = "";
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f8140d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            C5207g.m11110e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f8139c = sharedPreferences;
            LinkedHashMap linkedHashMap = f8138b;
            C5086z c5086z = C5086z.f33015a;
            SharedPreferences sharedPreferences2 = f8139c;
            if (sharedPreferences2 == null) {
                C5207g.m11117l("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", str);
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(C5086z.m10805D(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
