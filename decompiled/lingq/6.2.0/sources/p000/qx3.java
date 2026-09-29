package p000;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qx3 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f58334a;

    public qx3(Context context) {
        context.getClass();
        this.f58334a = new JSONObject();
        m20192a(0, "autoplay");
        m20192a(0, "mute");
        m20192a(0, "controls");
        m20192a(1, "enablejsapi");
        m20192a(0, "fs");
        m20193b("https://" + context.getPackageName());
        m20192a(0, "rel");
        m20192a(3, "iv_load_policy");
        m20192a(0, "cc_load_policy");
    }

    /* JADX INFO: renamed from: a */
    public final void m20192a(int i, String str) {
        try {
            this.f58334a.put(str, i);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20193b(String str) {
        try {
            this.f58334a.put("origin", str);
        } catch (JSONException unused) {
            ho2.m13385e("Illegal JSON value origin: ".concat(str));
        }
    }
}
