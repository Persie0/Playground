package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import p000.C3386nv;
import p000.qc0;
import p000.sq6;
import p000.vp7;
import p000.wkd;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985a {

    /* JADX INFO: renamed from: a */
    public static final int f12176a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m5500a(String str, Bundle bundle) {
        if (bundle == null) {
            m5508i(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m5507h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m5508i(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static void m5501b(long j, Bundle bundle, String str, String str2) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m5502c(qc0 qc0Var, zzjd zzjdVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", qc0Var.f57553a);
        bundle.putString("DEBUG_MESSAGE", qc0Var.f57555c);
        bundle.putInt("LOG_REASON", zzjdVar.zza());
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m5503d(String str, String str2, ArrayList arrayList, wkd wkdVar, long j) {
        Bundle bundle = new Bundle();
        m5501b(j, bundle, str, str2);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzbw.m5671r()));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(zzbw.m5670o()));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzbw.m5670o()));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            vp7 vp7Var = (vp7) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (vp7Var.f65766b.equals("first_party")) {
                C3386nv.m17635v("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static qc0 m5504e(Intent intent, String str) {
        if (intent != null) {
            sq6 sq6VarM19857a = qc0.m19857a();
            sq6VarM19857a.f61253a = m5500a(str, intent.getExtras());
            sq6VarM19857a.f61255c = m5505f(str, intent.getExtras());
            return sq6VarM19857a.m21585u();
        }
        m5508i("BillingHelper", "Got null intent!");
        sq6 sq6VarM19857a2 = qc0.m19857a();
        sq6VarM19857a2.f61253a = 6;
        sq6VarM19857a2.f61255c = "An internal error occurred.";
        return sq6VarM19857a2.m21585u();
    }

    /* JADX INFO: renamed from: f */
    public static String m5505f(String str, Bundle bundle) {
        if (bundle == null) {
            m5508i(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m5507h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m5508i(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: g */
    public static String m5506g(int i) {
        return zzb.zza(i).toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m5507h(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5508i(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m5509j(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static Purchase m5510k(String str, String str2) {
        if (str == null || str2 == null) {
            m5507h("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m5508i("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
