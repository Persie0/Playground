package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a */
    public final String f10527a;

    /* JADX INFO: renamed from: b */
    public final String f10528b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f10529c;

    public Purchase(String str, String str2) throws JSONException {
        this.f10527a = str;
        this.f10528b = str2;
        this.f10529c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m6225a() {
        JSONObject jSONObject = this.f10529c;
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
        return TextUtils.equals(this.f10527a, purchase.f10527a) && TextUtils.equals(this.f10528b, purchase.f10528b);
    }

    public final int hashCode() {
        return this.f10527a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f10527a));
    }
}
