package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wfd {
    /* JADX INFO: renamed from: a */
    public static sc2 m23933a(JSONObject jSONObject) {
        return new sc2(jSONObject.optString("source_name", null), jSONObject.optString("source_version", null));
    }
}
