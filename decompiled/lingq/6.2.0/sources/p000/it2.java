package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class it2 {

    /* JADX INFO: renamed from: a */
    public String f44526a;

    /* JADX INFO: renamed from: b */
    public String f44527b;

    /* JADX INFO: renamed from: c */
    public Long f44528c;

    public it2(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f44528c = lValueOf;
        this.f44527b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.f44526a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f44528c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f44527b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
