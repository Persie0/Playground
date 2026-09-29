package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lc4 {

    /* JADX INFO: renamed from: a */
    public final String f49466a;

    /* JADX INFO: renamed from: b */
    public final String f49467b;

    /* JADX INFO: renamed from: c */
    public final String f49468c;

    /* JADX INFO: renamed from: d */
    public final boolean f49469d;

    /* JADX INFO: renamed from: e */
    public final String f49470e;

    /* JADX INFO: renamed from: f */
    public final ck6 f49471f;

    public lc4(JSONObject jSONObject) {
        this.f49466a = jSONObject.optString("identifier");
        this.f49467b = jSONObject.optString("title");
        this.f49468c = jSONObject.optString("buttonType", "default");
        this.f49469d = jSONObject.optBoolean("openApp", true);
        jSONObject.optBoolean("requiresUnlock", true);
        jSONObject.optInt("icon", 0);
        this.f49470e = jSONObject.optString("inputPlaceholder");
        jSONObject.optString("inputTitle");
        this.f49471f = ck6.m4789o(jSONObject.optJSONObject("action"));
    }
}
