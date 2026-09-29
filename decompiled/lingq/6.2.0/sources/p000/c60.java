package p000;

import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import com.facebook.internal.FeatureManager$Feature;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c60 {

    /* JADX INFO: renamed from: a */
    public static final m58 f9605a = new m58(sy2.m21766a());

    /* JADX INFO: renamed from: a */
    public static b60 m4337a(String str, Bundle bundle, jz6 jz6Var, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str.equals(InAppPurchaseUtils$IAPProductType.SUBS.getType())) {
            Map map = jz6.f46432b;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            string.getClass();
            fa4.m11646h(operationalDataEnum, "fb_iap_subs_auto_renewing", string, bundle, jz6Var);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            strOptString.getClass();
            fa4.m11646h(operationalDataEnum, "fb_iap_subs_period", strOptString, bundle, jz6Var);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            strOptString2.getClass();
            fa4.m11646h(operationalDataEnum, "fb_free_trial_period", strOptString2, bundle, jz6Var);
            String strOptString3 = jSONObject2.optString("introductoryPriceCycles");
            strOptString3.getClass();
            if (strOptString3.length() > 0) {
                fa4.m11646h(operationalDataEnum, "fb_intro_price_cycles", strOptString3, bundle, jz6Var);
            }
            String strOptString4 = jSONObject2.optString("introductoryPricePeriod");
            strOptString4.getClass();
            if (strOptString4.length() > 0) {
                fa4.m11646h(operationalDataEnum, "fb_intro_period", strOptString4, bundle, jz6Var);
            }
            String strOptString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            strOptString5.getClass();
            if (strOptString5.length() > 0) {
                fa4.m11646h(operationalDataEnum, "fb_intro_price_amount_micros", strOptString5, bundle, jz6Var);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        currency.getClass();
        return new b60(bigDecimal, currency, bundle, jz6Var);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m4338b(String str, Bundle bundle, jz6 jz6Var, JSONObject jSONObject) throws JSONException {
        if (!str.equals(InAppPurchaseUtils$IAPProductType.SUBS.getType())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            currency.getClass();
            return vz1.m23608N(new b60(bigDecimal, currency, bundle, jz6Var));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            jz6 jz6Var2 = new jz6();
            LinkedHashMap linkedHashMap = jz6Var.f46433a;
            for (OperationalDataEnum operationalDataEnum : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(operationalDataEnum);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i2 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            jz6Var2.m14754a(operationalDataEnum, str3, obj);
                        }
                        str2 = str4;
                        length = i2;
                    }
                }
            }
            String str5 = str2;
            int i3 = length;
            String string = jSONObject3.getString("basePlanId");
            Map map2 = jz6.f46432b;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            string.getClass();
            fa4.m11646h(operationalDataEnum2, "fb_iap_base_plan", string, bundle2, jz6Var2);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            strOptString.getClass();
            fa4.m11646h(operationalDataEnum2, "fb_iap_subs_period", strOptString, bundle2, jz6Var2);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                fa4.m11646h(operationalDataEnum2, "fb_iap_subs_auto_renewing", "false", bundle2, jz6Var2);
            } else {
                fa4.m11646h(operationalDataEnum2, "fb_iap_subs_auto_renewing", "true", bundle2, jz6Var2);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            currency2.getClass();
            arrayList.add(new b60(bigDecimal2, currency2, bundle2, jz6Var2));
            i++;
            str2 = str5;
            length = i3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4339c() {
        w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
        return w23VarM24854b != null && ema.m11256c() && w23VarM24854b.f66257f;
    }

    /* JADX INFO: renamed from: d */
    public static final void m4340d(String str, String str2, boolean z, InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion, boolean z2) {
        ArrayList<b60> arrayListM23608N;
        String str3;
        String str4;
        str.getClass();
        str2.getClass();
        if (m4339c()) {
            HashMap map = new HashMap();
            Bundle bundleM25416c = null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Bundle bundle = new Bundle(1);
                jz6 jz6Var = new jz6();
                if (inAppPurchaseUtils$BillingClientVersion != null) {
                    fa4.m11646h(OperationalDataEnum.IAPParameters, "fb_iap_sdk_supported_library_versions", inAppPurchaseUtils$BillingClientVersion.getType(), bundle, jz6Var);
                }
                OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                String string = jSONObject.getString("productId");
                string.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_product_id", string, bundle, jz6Var);
                String string2 = jSONObject.getString("productId");
                string2.getClass();
                fa4.m11646h(operationalDataEnum, "fb_content_id", string2, bundle, jz6Var);
                fa4.m11646h(operationalDataEnum, "android_dynamic_ads_content_id", "client_implicit", bundle, jz6Var);
                String string3 = jSONObject.getString("purchaseTime");
                string3.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_purchase_time", string3, bundle, jz6Var);
                String string4 = jSONObject.getString("purchaseToken");
                string4.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_purchase_token", string4, bundle, jz6Var);
                String strOptString = jSONObject.optString("packageName");
                strOptString.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_package_name", strOptString, bundle, jz6Var);
                String strOptString2 = jSONObject2.optString("title");
                strOptString2.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_product_title", strOptString2, bundle, jz6Var);
                String strOptString3 = jSONObject2.optString("description");
                strOptString3.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_product_description", strOptString3, bundle, jz6Var);
                String strOptString4 = jSONObject2.optString("type");
                strOptString4.getClass();
                fa4.m11646h(operationalDataEnum, "fb_iap_product_type", strOptString4, bundle, jz6Var);
                z24 z24Var = z24.f70782a;
                if (lp1.f49971a.contains(z24.class)) {
                    str4 = null;
                } else {
                    try {
                        str4 = z24.f70785d;
                    } catch (Throwable th) {
                        lp1.m16420a(z24.class, th);
                        str4 = null;
                    }
                }
                if (str4 != null) {
                    Map map2 = jz6.f46432b;
                    fa4.m11646h(OperationalDataEnum.IAPParameters, "fb_iap_client_library_version", str4, bundle, jz6Var);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str5 = (String) entry.getKey();
                    String str6 = (String) entry.getValue();
                    Map map3 = jz6.f46432b;
                    fa4.m11646h(OperationalDataEnum.IAPParameters, str5, str6, bundle, jz6Var);
                }
                arrayListM23608N = jSONObject2.has("price_amount_micros") ? vz1.m23608N(m4337a(strOptString4, bundle, jz6Var, jSONObject, jSONObject2)) : (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) ? m4338b(strOptString4, bundle, jz6Var, jSONObject2) : null;
            } catch (JSONException e) {
                Log.e("c60", "Error parsing in-app purchase/subscription data.", e);
            } catch (Exception e2) {
                Log.e("c60", "Failed to get purchase logging parameters,", e2);
            }
            if (arrayListM23608N == null || arrayListM23608N.isEmpty()) {
                return;
            }
            if (!z || !v23.m23054b("app_events_if_auto_log_subs", sy2.m21767b(), false)) {
                str3 = z2 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
            } else if (z2) {
                str3 = "SubscriptionRestore";
            } else {
                str3 = w24.f66276a.m23683h(str2) ? "StartTrial" : "Subscribe";
            }
            String str7 = str3;
            if (z && p13.m18852b(FeatureManager$Feature.AndroidManualImplicitSubsDedupe)) {
                synchronized (c60.class) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (b60 b60Var : arrayListM23608N) {
                            arrayList.add(new j24(str7, b60Var.m3344d().doubleValue(), b60Var.m3341a()));
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayListM23608N, 10));
                        for (b60 b60Var2 : arrayListM23608N) {
                            arrayList2.add(new Pair(b60Var2.m3343c(), b60Var2.m3342b()));
                        }
                        bundleM25416c = z24.m25416c(arrayList, jCurrentTimeMillis, true, arrayList2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (!z && p13.m18852b(FeatureManager$Feature.AndroidManualImplicitPurchaseDedupe)) {
                synchronized (c60.class) {
                    b60 b60Var3 = (b60) arrayListM23608N.get(0);
                    bundleM25416c = z24.m25416c(vz1.m23604J(new j24("fb_mobile_purchase", b60Var3.m3344d().doubleValue(), b60Var3.m3341a())), System.currentTimeMillis(), true, vz1.m23604J(new Pair(b60Var3.m3343c(), b60Var3.m3342b())));
                }
            }
            List list = v24.f64729a;
            v24.m23059a(bundleM25416c, ((b60) arrayListM23608N.get(0)).m3343c(), ((b60) arrayListM23608N.get(0)).m3342b());
            if (str7.equals("fb_mobile_purchase")) {
                m58 m58Var = f9605a;
                BigDecimal bigDecimalM3344d = ((b60) arrayListM23608N.get(0)).m3344d();
                Currency currencyM3341a = ((b60) arrayListM23608N.get(0)).m3341a();
                Bundle bundleM3343c = ((b60) arrayListM23608N.get(0)).m3343c();
                jz6 jz6VarM3342b = ((b60) arrayListM23608N.get(0)).m3342b();
                m58Var.getClass();
                sy2 sy2Var = sy2.f61585a;
                if (ema.m11256c()) {
                    C3012fs c3012fs = (C3012fs) m58Var.f50618b;
                    c3012fs.getClass();
                    if (lp1.f49971a.contains(c3012fs)) {
                        return;
                    }
                    try {
                        c3012fs.m12041h(bigDecimalM3344d, currencyM3341a, bundleM3343c, jz6VarM3342b);
                        return;
                    } catch (Throwable th3) {
                        lp1.m16420a(c3012fs, th3);
                        return;
                    }
                }
                return;
            }
            m58 m58Var2 = f9605a;
            BigDecimal bigDecimalM3344d2 = ((b60) arrayListM23608N.get(0)).m3344d();
            Currency currencyM3341a2 = ((b60) arrayListM23608N.get(0)).m3341a();
            Bundle bundleM3343c2 = ((b60) arrayListM23608N.get(0)).m3343c();
            jz6 jz6VarM3342b2 = ((b60) arrayListM23608N.get(0)).m3342b();
            m58Var2.getClass();
            sy2 sy2Var2 = sy2.f61585a;
            if (ema.m11256c()) {
                C3012fs c3012fs2 = (C3012fs) m58Var2.f50618b;
                c3012fs2.getClass();
                if (lp1.f49971a.contains(c3012fs2)) {
                    return;
                }
                try {
                    bundleM3343c2.putString("fb_currency", currencyM3341a2.getCurrencyCode());
                    c3012fs2.m12039e(str7, Double.valueOf(bigDecimalM3344d2.doubleValue()), bundleM3343c2, true, AbstractC3785y6.m24949b(), jz6VarM3342b2);
                } catch (Throwable th4) {
                    lp1.m16420a(c3012fs2, th4);
                }
            }
        }
    }
}
