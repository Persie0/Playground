package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ol7 {

    /* JADX INFO: renamed from: a */
    public final String f54544a;

    /* JADX INFO: renamed from: b */
    public final long f54545b;

    /* JADX INFO: renamed from: c */
    public final String f54546c;

    /* JADX INFO: renamed from: d */
    public final String f54547d;

    public ol7(JSONObject jSONObject) {
        this.f54547d = jSONObject.optString("billingPeriod");
        this.f54546c = jSONObject.optString("priceCurrencyCode");
        this.f54544a = jSONObject.optString("formattedPrice");
        this.f54545b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    /* JADX INFO: renamed from: a */
    public final String m18102a() {
        return this.f54547d;
    }

    /* JADX INFO: renamed from: b */
    public final long m18103b() {
        return this.f54545b;
    }
}
