package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes2.dex */
public final class C3354n {

    /* JADX INFO: renamed from: a */
    public final String f52092a;

    /* JADX INFO: renamed from: b */
    public final int f52093b;

    /* JADX INFO: renamed from: c */
    public final int f52094c;

    public /* synthetic */ C3354n(int i, String str, int i2) {
        this.f52093b = i;
        this.f52094c = i2;
        this.f52092a = str;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m17163a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaignId", this.f52093b);
            jSONObject.put("templateId", this.f52094c);
            jSONObject.put("messageId", this.f52092a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C3354n(String str, int i, int i2, int i3, long j) {
        this.f52092a = str;
        this.f52094c = i;
        this.f52093b = i2;
    }
}
