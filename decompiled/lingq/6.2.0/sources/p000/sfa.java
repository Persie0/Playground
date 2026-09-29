package p000;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class sfa {

    /* JADX INFO: renamed from: a */
    public final String f60798a;

    /* JADX INFO: renamed from: b */
    public final String f60799b;

    /* JADX INFO: renamed from: c */
    public final String f60800c;

    /* JADX INFO: renamed from: d */
    public final int f60801d;

    public sfa(String str) {
        this.f60798a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f60799b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f60800c = strOptString;
        this.f60801d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            C3386nv.m17626m("Product type cannot be empty.");
            throw null;
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sfa) {
            return TextUtils.equals(this.f60798a, ((sfa) obj).f60798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60798a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f60799b);
        sb.append("', productType='");
        sb.append(this.f60800c);
        sb.append("', statusCode=");
        return wq1.m24123s(sb, this.f60801d, "}");
    }
}
