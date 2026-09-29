package p345qk;

import dm.C5207g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: qk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8641a {

    /* JADX INFO: renamed from: b */
    public static final C8641a f46190b;

    /* JADX INFO: renamed from: a */
    public final JSONObject f46191a;

    /* JADX INFO: renamed from: qk.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final JSONObject f46192a;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            JSONObject jSONObject = new JSONObject();
            this.f46192a = jSONObject;
            m16860a("autoplay", 0);
            m16860a("mute", 0);
            m16860a("controls", 0);
            m16860a("enablejsapi", 1);
            m16860a("fs", 0);
            try {
                jSONObject.put("origin", "https://www.youtube.com");
                m16860a("rel", 0);
                m16860a("showinfo", 0);
                m16860a("iv_load_policy", 3);
                m16860a("modestbranding", 1);
                m16860a("cc_load_policy", 0);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m16860a(String str, int i10) {
            try {
                this.f46192a.put(str, i10);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i10);
            }
        }
    }

    static {
        a aVar = new a();
        aVar.m16860a("controls", 1);
        f46190b = new C8641a(aVar.f46192a);
    }

    public C8641a(JSONObject jSONObject) {
        this.f46191a = jSONObject;
    }

    public final String toString() {
        String string = this.f46191a.toString();
        C5207g.m11110e(string, "playerOptions.toString()");
        return string;
    }
}
