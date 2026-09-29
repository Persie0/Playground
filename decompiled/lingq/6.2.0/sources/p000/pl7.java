package p000;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pl7 {

    /* JADX INFO: renamed from: a */
    public final String f56413a;

    /* JADX INFO: renamed from: b */
    public final String f56414b;

    /* JADX INFO: renamed from: c */
    public final String f56415c;

    /* JADX INFO: renamed from: d */
    public final s63 f56416d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f56417e;

    public pl7(JSONObject jSONObject) throws JSONException {
        this.f56413a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f56414b = true == strOptString.isEmpty() ? null : strOptString;
        this.f56415c = jSONObject.getString("offerIdToken");
        this.f56416d = new s63(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString("title");
            jSONObjectOptJSONObject2.optString("name");
            jSONObjectOptJSONObject2.optString("description");
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        this.f56417e = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m19386a() {
        return this.f56413a;
    }

    /* JADX INFO: renamed from: b */
    public final String m19387b() {
        return this.f56414b;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m19388c() {
        return this.f56417e;
    }

    /* JADX INFO: renamed from: d */
    public final s63 m19389d() {
        return this.f56416d;
    }
}
