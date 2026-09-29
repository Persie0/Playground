package p289o5;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import p402u0.C9370m;

/* JADX INFO: renamed from: o5.o */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7935o implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7922b f43231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f43232c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f43233d;

    public /* synthetic */ CallableC7935o(C7922b c7922b, String str, Object obj, int i10) {
        this.f43230a = i10;
        this.f43231b = c7922b;
        this.f43232c = str;
        this.f43233d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C7940t c7940t;
        int i10;
        switch (this.f43230a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7922b c7922b = this.f43231b;
                String str = this.f43232c;
                C2933a.m8514f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
                ArrayList arrayList = new ArrayList();
                boolean z10 = c7922b.f43168k;
                boolean z11 = c7922b.f43155K;
                String str2 = c7922b.f43159b;
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", str2);
                int i11 = 1;
                if (z10 && z11) {
                    bundle.putBoolean("enablePendingPurchases", true);
                }
                String string = null;
                while (true) {
                    try {
                        Bundle bundleMo19174S0 = c7922b.f43168k ? c7922b.f43163f.mo19174S0(c7922b.f43162e.getPackageName(), str, string, bundle) : c7922b.f43163f.mo19175j0(c7922b.f43162e.getPackageName(), str, string);
                        C7925e c7925e = C7939s.f43248h;
                        if (bundleMo19174S0 == null) {
                            Object[] objArr = new Object[i11];
                            objArr[0] = "getPurchase()";
                            C2933a.m8515g("BillingClient", String.format("%s got null owned items list", objArr));
                            i10 = i11;
                        } else {
                            int iM8509a = C2933a.m8509a(bundleMo19174S0, "BillingClient");
                            String strM8512d = C2933a.m8512d(bundleMo19174S0, "BillingClient");
                            C7925e c7925e2 = new C7925e();
                            c7925e2.f43186a = iM8509a;
                            c7925e2.f43187b = strM8512d;
                            if (iM8509a != 0) {
                                C2933a.m8515g("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iM8509a)));
                                c7925e = c7925e2;
                                i10 = 1;
                            } else if (bundleMo19174S0.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleMo19174S0.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleMo19174S0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                ArrayList<String> stringArrayList = bundleMo19174S0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList2 = bundleMo19174S0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList3 = bundleMo19174S0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList == null) {
                                    i10 = 1;
                                    C2933a.m8515g("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                                } else {
                                    i10 = 1;
                                    if (stringArrayList2 == null) {
                                        C2933a.m8515g("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                                    } else if (stringArrayList3 == null) {
                                        C2933a.m8515g("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                                    } else {
                                        c7925e = C7939s.f43249i;
                                    }
                                }
                            } else {
                                i10 = 1;
                                C2933a.m8515g("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                            }
                        }
                        if (c7925e != C7939s.f43249i) {
                            c7940t = new C7940t(c7925e, null);
                        } else {
                            ArrayList<String> stringArrayList4 = bundleMo19174S0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList5 = bundleMo19174S0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList6 = bundleMo19174S0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            for (int i12 = 0; i12 < stringArrayList5.size(); i12++) {
                                String str3 = stringArrayList5.get(i12);
                                String str4 = stringArrayList6.get(i12);
                                C2933a.m8514f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i12))));
                                try {
                                    Purchase purchase = new Purchase(str3, str4);
                                    if (TextUtils.isEmpty(purchase.m6225a())) {
                                        C2933a.m8515g("BillingClient", "BUG: empty/null token!");
                                    }
                                    arrayList.add(purchase);
                                } catch (JSONException e10) {
                                    C2933a.m8516h("BillingClient", "Got an exception trying to decode the purchase!", e10);
                                    c7940t = new C7940t(C7939s.f43248h, null);
                                }
                            }
                            string = bundleMo19174S0.getString("INAPP_CONTINUATION_TOKEN");
                            C2933a.m8514f("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                            if (TextUtils.isEmpty(string)) {
                                c7940t = new C7940t(C7939s.f43249i, arrayList);
                            } else {
                                i11 = i10;
                            }
                        }
                    } catch (Exception e11) {
                        C2933a.m8516h("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                        c7940t = new C7940t(C7939s.f43250j, null);
                    }
                }
                List list = (List) c7940t.f43256a;
                if (list != null) {
                    ((C9370m) this.f43233d).m17743e((C7925e) c7940t.f43257b, list);
                    return null;
                }
                ((C9370m) this.f43233d).m17743e((C7925e) c7940t.f43257b, zzu.m8528Q());
                return null;
            default:
                C7922b c7922b2 = this.f43231b;
                return c7922b2.f43163f.mo19173R0(c7922b2.f43162e.getPackageName(), this.f43232c, (String) this.f43233d);
        }
    }
}
