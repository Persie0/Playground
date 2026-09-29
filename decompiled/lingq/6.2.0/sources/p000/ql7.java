package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ql7 {

    /* JADX INFO: renamed from: a */
    public final String f57904a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f57905b;

    /* JADX INFO: renamed from: c */
    public final String f57906c;

    /* JADX INFO: renamed from: d */
    public final String f57907d;

    /* JADX INFO: renamed from: e */
    public final String f57908e;

    /* JADX INFO: renamed from: f */
    public final String f57909f;

    /* JADX INFO: renamed from: g */
    public final String f57910g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f57911h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f57912i;

    public ql7(String str) {
        this.f57904a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f57905b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f57906c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f57907d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            C3386nv.m17626m("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            C3386nv.m17626m("Product type cannot be empty.");
            throw null;
        }
        this.f57908e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f57909f = jSONObject.optString("skuDetailsToken");
        this.f57910g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new pl7(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f57911h = arrayList;
        } else {
            this.f57911h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f57905b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f57905b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new nl7(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f57912i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f57912i = null;
        } else {
            arrayList2.add(new nl7(jSONObjectOptJSONObject));
            this.f57912i = arrayList2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final nl7 m20019a() {
        ArrayList arrayList = this.f57912i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (nl7) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ql7) {
            return TextUtils.equals(this.f57904a, ((ql7) obj).f57904a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57904a.hashCode();
    }

    public final String toString() {
        String string = this.f57905b.toString();
        String strValueOf = String.valueOf(this.f57911h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        AbstractC3393o1.m17725C(sb, this.f57904a, "', parsedJson=", string, ", productId='");
        sb.append(this.f57906c);
        sb.append("', productType='");
        sb.append(this.f57907d);
        sb.append("', title='");
        sb.append(this.f57908e);
        sb.append("', productDetailsToken='");
        return wq1.m24125u(sb, this.f57909f, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
