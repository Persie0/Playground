package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ffb implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39028c;

    public ffb(kc0 kc0Var, C3440oy c3440oy) {
        this.f39026a = 1;
        this.f39027b = c3440oy;
        Objects.requireNonNull(kc0Var);
        this.f39028c = kc0Var;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x029e */
    /* JADX WARN: Code duplicated, block: B:108:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:83:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x028d A[LOOP:0: B:146:0x00fe->B:93:0x028d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws Throwable {
        lzc lzcVar;
        Exception exc;
        cdb cdbVarM15106y;
        List list;
        C3440oy c3440oy;
        qc0 qc0Var;
        pmb pmbVar;
        int i;
        Bundle bundleM14028W;
        qc0 qc0VarM21585u;
        zzjd zzjdVar;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        boolean z;
        ?? r13;
        Purchase purchase;
        Exception exc2 = null;
        boolean z2 = false;
        switch (this.f39026a) {
            case 0:
                k06 k06Var = (k06) this.f39027b;
                z54 z54Var = (z54) this.f39028c;
                k06Var.getClass();
                HashMap map = lzc.f50364f;
                a3d.m80r();
                int i2 = x2d.f67686a;
                a3d.m80r();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = lzc.f50364f;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new lzc("detectorTaskWithResource#run"));
                    }
                    lzcVar = (lzc) map2.get("detectorTaskWithResource#run");
                } else {
                    lzcVar = dzc.f36476g;
                }
                lzcVar.mo10760a();
                try {
                    js9 js9VarM15713b = k06Var.f46484b.m15713b(z54Var);
                    lzcVar.close();
                    return js9VarM15713b;
                } catch (Throwable th) {
                    try {
                        lzcVar.close();
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                }
            case 1:
                kc0 kc0Var = (kc0) this.f39028c;
                int i3 = 9;
                if (!kc0Var.m15104v()) {
                    zzjd zzjdVar2 = zzjd.SERVICE_CONNECTION_NOT_READY;
                    qc0 qc0Var2 = wwb.f67445j;
                    kc0Var.m15107z(zzjdVar2, 9, qc0Var2);
                    ((C3440oy) this.f39027b).m18572k(qc0Var2, zzbw.m5669n());
                } else {
                    if (!TextUtils.isEmpty("subs")) {
                        AbstractC0985a.m5507h("BillingClient", "Querying owned items, item type: ".concat("subs"));
                        ArrayList arrayList = new ArrayList();
                        boolean z3 = kc0Var.f47006n;
                        kc0Var.f47016x.getClass();
                        kc0Var.f47016x.getClass();
                        long jLongValue = kc0Var.f46991A.longValue();
                        Bundle bundle = new Bundle();
                        AbstractC0985a.m5501b(jLongValue, bundle, kc0Var.f46995c, kc0Var.f46996d);
                        if (z3) {
                            bundle.putBoolean("enablePendingPurchases", true);
                        }
                        String string = null;
                        while (true) {
                            try {
                                synchronized (kc0Var.f46993a) {
                                    try {
                                        pmbVar = kc0Var.f47001i;
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        exc = exc2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (DeadObjectException e) {
                                                e = e;
                                                cdbVarM15106y = kc0Var.m15106y(wwb.f67445j, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                                list = (List) cdbVarM15106y.f9945b;
                                                c3440oy = (C3440oy) this.f39027b;
                                                qc0Var = (qc0) cdbVarM15106y.f9946c;
                                                if (list != null) {
                                                    c3440oy.m18572k(qc0Var, list);
                                                    return exc;
                                                }
                                                c3440oy.m18572k(qc0Var, zzbw.m5669n());
                                                return exc;
                                            } catch (Exception e2) {
                                                e = e2;
                                                cdbVarM15106y = kc0Var.m15106y(wwb.f67443h, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                                list = (List) cdbVarM15106y.f9945b;
                                                c3440oy = (C3440oy) this.f39027b;
                                                qc0Var = (qc0) cdbVarM15106y.f9946c;
                                                if (list != null) {
                                                    c3440oy.m18572k(qc0Var, list);
                                                    return exc;
                                                }
                                                c3440oy.m18572k(qc0Var, zzbw.m5669n());
                                                return exc;
                                            }
                                        }
                                    }
                                }
                                if (pmbVar == null) {
                                    cdbVarM15106y = kc0Var.m15106y(wwb.f67445j, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null", exc2);
                                    break;
                                } else {
                                    if (kc0Var.f47006n) {
                                        if (kc0Var.f47015w) {
                                            i = 26;
                                        } else if (kc0Var.f47014v) {
                                            i = 24;
                                        } else {
                                            i = kc0Var.f47011s ? 19 : i3;
                                        }
                                        bundleM14028W = ((imb) pmbVar).m14028W(i, kc0Var.f46999g.getPackageName(), string, bundle);
                                    } else {
                                        bundleM14028W = ((imb) pmbVar).m14027V(kc0Var.f46999g.getPackageName(), string);
                                    }
                                    qc0 qc0Var3 = wwb.f67443h;
                                    if (bundleM14028W == null) {
                                        AbstractC0985a.m5508i("BillingClient", "getPurchase() got null owned items list");
                                        zzjdVar = zzjd.NULL_OWNED_ITEMS_LIST;
                                    } else {
                                        int iM5500a = AbstractC0985a.m5500a("BillingClient", bundleM14028W);
                                        String strM5505f = AbstractC0985a.m5505f("BillingClient", bundleM14028W);
                                        sq6 sq6VarM19857a = qc0.m19857a();
                                        sq6VarM19857a.f61253a = iM5500a;
                                        sq6VarM19857a.f61255c = strM5505f;
                                        qc0VarM21585u = sq6VarM19857a.m21585u();
                                        if (iM5500a != 0) {
                                            AbstractC0985a.m5508i("BillingClient", "getPurchase() failed. Response code: " + iM5500a);
                                            zzjdVar = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                                        } else if (bundleM14028W.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleM14028W.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleM14028W.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                            ArrayList<String> stringArrayList4 = bundleM14028W.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            ArrayList<String> stringArrayList5 = bundleM14028W.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            ArrayList<String> stringArrayList6 = bundleM14028W.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            if (stringArrayList4 == null) {
                                                AbstractC0985a.m5508i("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                                zzjdVar = zzjd.NULL_SKUS_LIST;
                                            } else if (stringArrayList5 == null) {
                                                AbstractC0985a.m5508i("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                                zzjdVar = zzjd.NULL_PURCHASES_LIST;
                                            } else if (stringArrayList6 == null) {
                                                AbstractC0985a.m5508i("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                                zzjdVar = zzjd.NULL_SIGNATURES_LIST;
                                            } else {
                                                qc0VarM21585u = wwb.f67444i;
                                                zzjdVar = zzjd.REASON_UNSPECIFIED;
                                            }
                                        } else {
                                            AbstractC0985a.m5508i("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                                            zzjdVar = zzjd.MISSING_REQUIRED_PURCHASE_KEY;
                                        }
                                        if (qc0VarM21585u != wwb.f67444i) {
                                            cdbVarM15106y = kc0Var.m15106y(qc0VarM21585u, zzjdVar, "Purchase bundle invalid", exc2);
                                        } else {
                                            stringArrayList = bundleM14028W.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                            stringArrayList2 = bundleM14028W.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                            stringArrayList3 = bundleM14028W.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                            boolean z4 = z2;
                                            z = z4;
                                            r13 = z4;
                                            while (r13 < stringArrayList2.size()) {
                                                String str = stringArrayList2.get(r13);
                                                exc = exc2;
                                                String str2 = stringArrayList3.get(r13);
                                                AbstractC0985a.m5507h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(r13))));
                                                try {
                                                    purchase = new Purchase(str, str2);
                                                    if (TextUtils.isEmpty(purchase.m5177b())) {
                                                        AbstractC0985a.m5508i("BillingClient", "BUG: empty/null token!");
                                                        z = true;
                                                    }
                                                    arrayList.add(purchase);
                                                    exc2 = exc;
                                                    r13++;
                                                    z = z;
                                                } catch (JSONException e3) {
                                                    cdbVarM15106y = kc0Var.m15106y(wwb.f67443h, zzjd.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e3);
                                                }
                                            }
                                            exc = exc2;
                                            if (z) {
                                                kc0Var.m15107z(zzjd.EMPTY_PURCHASE_TOKEN, 9, qc0Var3);
                                            }
                                            string = bundleM14028W.getString("INAPP_CONTINUATION_TOKEN");
                                            AbstractC0985a.m5507h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                                            if (TextUtils.isEmpty(string)) {
                                                cdbVarM15106y = new cdb(9, wwb.f67444i, arrayList);
                                            } else {
                                                exc2 = exc;
                                                z2 = false;
                                                i3 = 9;
                                            }
                                        }
                                    }
                                    qc0VarM21585u = qc0Var3;
                                    if (qc0VarM21585u != wwb.f67444i) {
                                        cdbVarM15106y = kc0Var.m15106y(qc0VarM21585u, zzjdVar, "Purchase bundle invalid", exc2);
                                    } else {
                                        stringArrayList = bundleM14028W.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                        stringArrayList2 = bundleM14028W.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                        stringArrayList3 = bundleM14028W.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                        boolean z5 = z2;
                                        z = z5;
                                        r13 = z5;
                                        while (r13 < stringArrayList2.size()) {
                                            String str3 = stringArrayList2.get(r13);
                                            exc = exc2;
                                            String str4 = stringArrayList3.get(r13);
                                            AbstractC0985a.m5507h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(r13))));
                                            purchase = new Purchase(str3, str4);
                                            if (TextUtils.isEmpty(purchase.m5177b())) {
                                                AbstractC0985a.m5508i("BillingClient", "BUG: empty/null token!");
                                                z = true;
                                            }
                                            arrayList.add(purchase);
                                            exc2 = exc;
                                            r13++;
                                            z = z;
                                        }
                                        exc = exc2;
                                        if (z) {
                                            kc0Var.m15107z(zzjd.EMPTY_PURCHASE_TOKEN, 9, qc0Var3);
                                        }
                                        string = bundleM14028W.getString("INAPP_CONTINUATION_TOKEN");
                                        AbstractC0985a.m5507h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                                        if (TextUtils.isEmpty(string)) {
                                            cdbVarM15106y = new cdb(9, wwb.f67444i, arrayList);
                                        } else {
                                            exc2 = exc;
                                            z2 = false;
                                            i3 = 9;
                                        }
                                    }
                                }
                                exc = exc2;
                            } catch (DeadObjectException e4) {
                                e = e4;
                                exc = exc2;
                            } catch (Exception e5) {
                                e = e5;
                                exc = exc2;
                            }
                        }
                        list = (List) cdbVarM15106y.f9945b;
                        c3440oy = (C3440oy) this.f39027b;
                        qc0Var = (qc0) cdbVarM15106y.f9946c;
                        if (list != null) {
                            c3440oy.m18572k(qc0Var, list);
                            return exc;
                        }
                        c3440oy.m18572k(qc0Var, zzbw.m5669n());
                        return exc;
                    }
                    AbstractC0985a.m5508i("BillingClient", "Please provide a valid product type.");
                    zzjd zzjdVar3 = zzjd.EMPTY_PRODUCT_TYPE;
                    qc0 qc0Var4 = wwb.f67440e;
                    kc0Var.m15107z(zzjdVar3, 9, qc0Var4);
                    ((C3440oy) this.f39027b).m18572k(qc0Var4, zzbw.m5669n());
                }
                return null;
            case 2:
                eoc eocVar = (eoc) this.f39028c;
                eocVar.f37647f.m5902V();
                nnb nnbVar = eocVar.f37647f.f12360c;
                C1045d.m5885T(nnbVar);
                return nnbVar.m17509A0((String) this.f39027b);
            case 3:
                eoc eocVar2 = (eoc) this.f39028c;
                eocVar2.f37647f.m5902V();
                return new zzao(eocVar2.f37647f.m5938p0(((zzr) this.f39027b).f12432a));
            default:
                sq5 sq5Var = (sq5) this.f39027b;
                udd uddVar = (udd) this.f39028c;
                C0962f c0962f = (C0962f) sq5Var.f61249c;
                cdb cdbVar = new cdb(z2);
                try {
                    dgd dgdVar = (dgd) c0962f.f11849f.get();
                    Uri uri = (Uri) sq5Var.f61250d;
                    cdb cdbVar2 = new cdb(uddVar);
                    cdbVar2.f9946c = new cdb[]{cdbVar};
                    break;
                } catch (IOException | RuntimeException e6) {
                    t9a.m21916f(Level.WARNING, c0962f.m5409a(), e6, "Failed to update snapshot for %s flags may be stale.", (String) sq5Var.f61248b);
                }
                return null;
        }
    }

    public /* synthetic */ ffb(eoc eocVar, Object obj, int i) {
        this.f39026a = i;
        this.f39027b = obj;
        this.f39028c = eocVar;
    }

    public /* synthetic */ ffb(int i, Object obj, Object obj2) {
        this.f39026a = i;
        this.f39027b = obj;
        this.f39028c = obj2;
    }
}
