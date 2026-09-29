package p194j8;

import dm.C5206f;
import dm.C5207g;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: j8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6423a {

    /* JADX INFO: renamed from: a */
    public final String f36898a;

    /* JADX INFO: renamed from: b */
    public final String f36899b;

    /* JADX INFO: renamed from: c */
    public final Long f36900c;

    public C6423a(File file) {
        C5207g.m11111f(file, "file");
        String name = file.getName();
        C5207g.m11110e(name, "file.name");
        this.f36898a = name;
        JSONObject jSONObjectM11012k1 = C5206f.m11012k1(name);
        if (jSONObjectM11012k1 != null) {
            this.f36900c = Long.valueOf(jSONObjectM11012k1.optLong("timestamp", 0L));
            this.f36899b = jSONObjectM11012k1.optString("error_message", null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6423a(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f36900c = lValueOf;
        this.f36899b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        if (lValueOf == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        C5207g.m11110e(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f36898a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f36900c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f36899b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "params.toString()");
        return string;
    }
}
