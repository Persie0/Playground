package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import p289o5.C7925e;
import p289o5.C7928h;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2933a {

    /* JADX INFO: renamed from: a */
    public static final int f14568a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m8509a(Bundle bundle, String str) {
        if (bundle == null) {
            m8515g(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m8514f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m8515g(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m8510b(String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C7928h.b bVar = (C7928h.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            if (bVar.f43209b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static C7925e m8511c(Intent intent, String str) {
        if (intent == null) {
            m8515g("BillingHelper", "Got null intent!");
            C7925e c7925e = new C7925e();
            c7925e.f43186a = 6;
            c7925e.f43187b = "An internal error occurred.";
            return c7925e;
        }
        int iM8509a = m8509a(intent.getExtras(), str);
        String strM8512d = m8512d(intent.getExtras(), str);
        C7925e c7925e2 = new C7925e();
        c7925e2.f43186a = iM8509a;
        c7925e2.f43187b = strM8512d;
        return c7925e2;
    }

    /* JADX INFO: renamed from: d */
    public static String m8512d(Bundle bundle, String str) {
        if (bundle == null) {
            m8515g(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m8514f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m8515g(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: e */
    public static String m8513e(int i10) {
        return zza.zza(i10).toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m8514f(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
            } else {
                int i10 = 40000;
                while (!str2.isEmpty() && i10 > 0) {
                    int iMin = Math.min(str2.length(), Math.min(4000, i10));
                    Log.v(str, str2.substring(0, iMin));
                    str2 = str2.substring(iMin);
                    i10 -= iMin;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8515g(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8516h(String str, String str2, Exception exc) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, exc);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Purchase m8517i(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                m8515g("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        m8514f("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
