package p476x7;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5073m;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8201h;
import p317p7.C8204k;
import p431v7.C9663g;

/* JADX INFO: renamed from: x7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10107f {

    /* JADX INFO: renamed from: a */
    public static final C10107f f51262a = new C10107f();

    /* JADX INFO: renamed from: b */
    public static final String f51263b = C10107f.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static final C8204k f51264c = new C8204k(C8004n.m15871a());

    /* JADX INFO: renamed from: x7.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final BigDecimal f51265a;

        /* JADX INFO: renamed from: b */
        public final Currency f51266b;

        /* JADX INFO: renamed from: c */
        public final Bundle f51267c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f51265a = bigDecimal;
            this.f51266b = currency;
            this.f51267c = bundle;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX INFO: renamed from: a */
    public static final void m18965a(String str, String str2, boolean z10) {
        a aVar;
        boolean z11;
        boolean z12;
        C5207g.m11111f(str2, "skuDetails");
        C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
        if (c5074nM6670b != null && C7993c0.m15849b() && c5074nM6670b.f32975i) {
            f51262a.getClass();
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
                bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
                bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
                bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
                String strOptString = jSONObject2.optString("type");
                bundle.putCharSequence("fb_iap_product_type", strOptString);
                if (C5207g.m11106a(strOptString, "subs")) {
                    bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                    bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                    bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                    String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                    C5207g.m11110e(strOptString2, "introductoryPriceCycles");
                    if (!(strOptString2.length() == 0)) {
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
                }
                BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
                Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
                C5207g.m11110e(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                aVar = new a(bigDecimal, currency, bundle);
            } catch (JSONException e10) {
                Log.e(f51263b, "Error parsing in-app subscription data.", e10);
                aVar = null;
            }
            if (aVar == null) {
                return;
            }
            if (z10) {
                C5073m c5073m = C5073m.f32961a;
                if (C5073m.m10770b("app_events_if_auto_log_subs", C8004n.m15872b(), false)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            C8204k c8204k = f51264c;
            Bundle bundle2 = aVar.f51267c;
            Currency currency2 = aVar.f51266b;
            BigDecimal bigDecimal2 = aVar.f51265a;
            if (!z11) {
                c8204k.getClass();
                C8004n c8004n = C8004n.f43550a;
                if (C7993c0.m15849b()) {
                    C8201h c8201h = c8204k.f44402a;
                    c8201h.getClass();
                    if (C6205a.m12742b(c8201h)) {
                        return;
                    }
                    try {
                        c8201h.m16335g(bigDecimal2, currency2, bundle2);
                        return;
                    } catch (Throwable th2) {
                        C6205a.m12741a(c8201h, th2);
                        return;
                    }
                }
                return;
            }
            C9663g c9663g = C9663g.f49486a;
            c9663g.getClass();
            if (!C6205a.m12742b(c9663g)) {
                try {
                    String strOptString3 = new JSONObject(str2).optString("freeTrialPeriod");
                    if (strOptString3 != null) {
                        z12 = strOptString3.length() > 0;
                    }
                } catch (JSONException unused) {
                } catch (Throwable th3) {
                    C6205a.m12741a(c9663g, th3);
                }
            }
            String str3 = z12 ? "StartTrial" : "Subscribe";
            c8204k.getClass();
            C8004n c8004n2 = C8004n.f43550a;
            if (C7993c0.m15849b()) {
                C8201h c8201h2 = c8204k.f44402a;
                c8201h2.getClass();
                if (C6205a.m12742b(c8201h2)) {
                    return;
                }
                try {
                    if (bigDecimal2 == null || currency2 == null) {
                        C5086z c5086z = C5086z.f33015a;
                        C5086z.m10807F(C8201h.f44393c, "purchaseAmount and currency cannot be null");
                        return;
                    }
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    Bundle bundle3 = bundle2;
                    bundle3.putString("fb_currency", currency2.getCurrencyCode());
                    c8201h2.m16333e(str3, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, C10105d.m18960a());
                } catch (Throwable th4) {
                    C6205a.m12741a(c8201h2, th4);
                }
            }
        }
    }
}
