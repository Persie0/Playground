package p000;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class md2 {

    /* JADX INFO: renamed from: a */
    public final String f51099a;

    /* JADX INFO: renamed from: b */
    public final double f51100b;

    /* JADX INFO: renamed from: c */
    public final Map f51101c;

    public md2(String str, double d, Map map) {
        this.f51099a = str;
        this.f51100b = d;
        this.f51101c = map;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16781a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", this.f51099a);
        jSONObject.put("time", this.f51100b);
        Map map = this.f51101c;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), abd.m254j(entry.getValue()));
            }
            jSONObject.put("event_properties", jSONObject2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final String m16782b() {
        String string = m16781a().toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return this.f51099a.equals(md2Var.f51099a) && Double.compare(this.f51100b, md2Var.f51100b) == 0 && fa4.m11650l(this.f51101c, md2Var.f51101c);
    }

    public final int hashCode() {
        int iM12424a = g9a.m12424a(this.f51100b, this.f51099a.hashCode() * 31, 31);
        Map map = this.f51101c;
        return iM12424a + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "DiagnosticsEvent(eventName=" + this.f51099a + ", time=" + this.f51100b + ", eventProperties=" + this.f51101c + ')';
    }
}
