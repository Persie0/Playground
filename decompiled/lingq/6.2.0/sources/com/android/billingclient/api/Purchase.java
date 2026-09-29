package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a */
    public final String f11294a;

    /* JADX INFO: renamed from: b */
    public final String f11295b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f11296c;

    public Purchase(String str, String str2) {
        this.f11294a = str;
        this.f11295b = str2;
        this.f11296c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m5176a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f11296c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m5177b() {
        JSONObject jSONObject = this.f11296c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f11294a, purchase.f11294a) && TextUtils.equals(this.f11295b, purchase.f11295b);
    }

    public final int hashCode() {
        return this.f11294a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f11294a));
    }
}
