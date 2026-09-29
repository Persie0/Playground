package p289o5;

import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7926f {

    /* JADX INFO: renamed from: a */
    public final String f43190a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f43191b;

    /* JADX INFO: renamed from: c */
    public final String f43192c;

    /* JADX INFO: renamed from: d */
    public final String f43193d;

    /* JADX INFO: renamed from: e */
    public final String f43194e;

    /* JADX INFO: renamed from: f */
    public final String f43195f;

    /* JADX INFO: renamed from: g */
    public final String f43196g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f43197h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f43198i;

    /* JADX INFO: renamed from: o5.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f43199a;

        public a(JSONObject jSONObject) throws JSONException {
            jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optString("priceCurrencyCode");
            this.f43199a = jSONObject.optString("offerIdToken");
            jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            zzu.m8527G(arrayList);
        }
    }

    /* JADX INFO: renamed from: o5.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f43200a;

        /* JADX INFO: renamed from: b */
        public final String f43201b;

        public b(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            this.f43201b = jSONObject.optString("priceCurrencyCode");
            jSONObject.optString("formattedPrice");
            this.f43200a = jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    /* JADX INFO: renamed from: o5.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ArrayList f43202a;

        public c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new b(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f43202a = arrayList;
        }
    }

    /* JADX INFO: renamed from: o5.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f43203a;

        /* JADX INFO: renamed from: b */
        public final c f43204b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f43205c;

        public d(JSONObject jSONObject) throws JSONException {
            jSONObject.optString("basePlanId");
            jSONObject.optString("offerId").getClass();
            this.f43203a = jSONObject.getString("offerIdToken");
            this.f43204b = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
                jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f43205c = arrayList;
        }
    }

    public C7926f(String str) throws JSONException {
        this.f43190a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f43191b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f43192c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f43193d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f43194e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        this.f43195f = jSONObject.optString("skuDetailsToken");
        this.f43196g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new d(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f43197h = arrayList;
        } else {
            this.f43197h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f43191b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f43191b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new a(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f43198i = arrayList2;
        } else if (jSONObjectOptJSONObject != null) {
            arrayList2.add(new a(jSONObjectOptJSONObject));
            this.f43198i = arrayList2;
        } else {
            this.f43198i = null;
        }
        JSONObject jSONObjectOptJSONObject2 = this.f43191b.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getInt("maximumQuantity");
            jSONObjectOptJSONObject2.getInt("remainingQuantity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m15746a() {
        ArrayList arrayList = this.f43198i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (a) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7926f) {
            return TextUtils.equals(this.f43190a, ((C7926f) obj).f43190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43190a.hashCode();
    }

    public final String toString() {
        String string = this.f43191b.toString();
        String strValueOf = String.valueOf(this.f43197h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        C0166e.m777x(sb2, this.f43190a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f43192c);
        sb2.append("', productType='");
        sb2.append(this.f43193d);
        sb2.append("', title='");
        sb2.append(this.f43194e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f43195f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
