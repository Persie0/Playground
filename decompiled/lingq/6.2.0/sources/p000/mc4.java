package p000;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mc4 {

    /* JADX INFO: renamed from: a */
    public final int f51068a;

    /* JADX INFO: renamed from: b */
    public final int f51069b;

    /* JADX INFO: renamed from: c */
    public final String f51070c;

    /* JADX INFO: renamed from: d */
    public final boolean f51071d;

    /* JADX INFO: renamed from: e */
    public final ck6 f51072e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f51073f;

    public mc4(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f51068a = jSONObject.optInt("campaignId");
            this.f51069b = jSONObject.optInt("templateId");
            this.f51070c = jSONObject.optString("messageId");
            this.f51071d = jSONObject.optBoolean("isGhostPush");
            this.f51072e = ck6.m4789o(jSONObject.optJSONObject("defaultAction"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actionButtons");
            if (jSONArrayOptJSONArray != null) {
                this.f51073f = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.f51073f.add(new lc4(jSONArrayOptJSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            eh0.m11135p("IterableNoticationData", e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final lc4 m16761a(String str) {
        for (lc4 lc4Var : this.f51073f) {
            if (lc4Var.f49466a.equals(str)) {
                return lc4Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m16762b() {
        return this.f51068a;
    }

    /* JADX INFO: renamed from: c */
    public final ck6 m16763c() {
        return this.f51072e;
    }

    /* JADX INFO: renamed from: d */
    public final String m16764d() {
        return this.f51070c;
    }

    /* JADX INFO: renamed from: e */
    public final int m16765e() {
        return this.f51069b;
    }

    public mc4(Bundle bundle) {
        this(bundle.getString("itbl"));
    }
}
