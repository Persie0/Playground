package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class njb implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f52861d;

    public /* synthetic */ njb(Object obj, Object obj2, Object obj3, int i) {
        this.f52858a = i;
        this.f52859b = obj;
        this.f52860c = obj2;
        this.f52861d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleM5502c;
        pmb pmbVar;
        pmb pmbVar2;
        C3299li c3299li;
        pmb pmbVar3;
        Exception exc = null;
        switch (this.f52858a) {
            case 0:
                kc0 kc0Var = (kc0) this.f52859b;
                String str = (String) this.f52860c;
                String str2 = (String) this.f52861d;
                try {
                    synchronized (kc0Var.f46993a) {
                        pmbVar = kc0Var.f47001i;
                        break;
                    }
                    if (pmbVar == null) {
                        return AbstractC0985a.m5502c(wwb.f67445j, zzjd.SERVICE_RESET_TO_NULL);
                    }
                    return ((imb) pmbVar).m14025T(kc0Var.f46999g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    qc0 qc0Var = wwb.f67445j;
                    zzjd zzjdVar = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    String strM20181a = qvb.m20181a(e);
                    bundleM5502c = AbstractC0985a.m5502c(qc0Var, zzjdVar);
                    if (strM20181a != null) {
                        bundleM5502c.putString("ADDITIONAL_LOG_DETAILS", strM20181a);
                    }
                    return bundleM5502c;
                } catch (Exception e2) {
                    qc0 qc0Var2 = wwb.f67443h;
                    zzjd zzjdVar2 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    String strM20181a2 = qvb.m20181a(e2);
                    bundleM5502c = AbstractC0985a.m5502c(qc0Var2, zzjdVar2);
                    if (strM20181a2 != null) {
                        bundleM5502c.putString("ADDITIONAL_LOG_DETAILS", strM20181a2);
                    }
                    return bundleM5502c;
                }
            case 1:
                kc0 kc0Var2 = (kc0) this.f52859b;
                C3440oy c3440oy = (C3440oy) this.f52860c;
                gp0 gp0Var = (gp0) this.f52861d;
                try {
                    if (!kc0Var2.m15104v()) {
                        zzjd zzjdVar3 = zzjd.SERVICE_CONNECTION_NOT_READY;
                        qc0 qc0Var3 = wwb.f67445j;
                        kc0Var2.m15107z(zzjdVar3, 3, qc0Var3);
                        c3440oy.m18570e(qc0Var3);
                    } else if (TextUtils.isEmpty(gp0Var.f41124b)) {
                        AbstractC0985a.m5508i("BillingClient", "Please provide a valid purchase token.");
                        zzjd zzjdVar4 = zzjd.EMPTY_PURCHASE_TOKEN;
                        qc0 qc0Var4 = wwb.f67442g;
                        kc0Var2.m15107z(zzjdVar4, 3, qc0Var4);
                        c3440oy.m18570e(qc0Var4);
                    } else if (kc0Var2.f47006n) {
                        synchronized (kc0Var2.f46993a) {
                            pmbVar2 = kc0Var2.f47001i;
                            break;
                        }
                        if (pmbVar2 == null) {
                            kc0Var2.m15093j(c3440oy, wwb.f67445j, zzjd.SERVICE_RESET_TO_NULL, null);
                        } else {
                            String packageName = kc0Var2.f46999g.getPackageName();
                            String str3 = gp0Var.f41124b;
                            String str4 = kc0Var2.f46995c;
                            String str5 = kc0Var2.f46996d;
                            long jLongValue = kc0Var2.f46991A.longValue();
                            int i = AbstractC0985a.f12176a;
                            Bundle bundle = new Bundle();
                            AbstractC0985a.m5501b(jLongValue, bundle, str4, str5);
                            Bundle bundleM14024S = ((imb) pmbVar2).m14024S(packageName, str3, bundle);
                            c3440oy.m18570e(wwb.m24184a(AbstractC0985a.m5500a("BillingClient", bundleM14024S), AbstractC0985a.m5505f("BillingClient", bundleM14024S)));
                        }
                    } else {
                        zzjd zzjdVar5 = zzjd.API_VERSION_NOT_V9;
                        qc0 qc0Var5 = wwb.f67436a;
                        kc0Var2.m15107z(zzjdVar5, 3, qc0Var5);
                        c3440oy.m18570e(qc0Var5);
                    }
                } catch (DeadObjectException e3) {
                    kc0Var2.m15093j(c3440oy, wwb.f67445j, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e3);
                } catch (Exception e4) {
                    kc0Var2.m15093j(c3440oy, wwb.f67443h, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e4);
                }
                return null;
            case 2:
                kc0 kc0Var3 = (kc0) this.f52859b;
                C3440oy c3440oy2 = (C3440oy) this.f52860c;
                cc4 cc4Var = (cc4) this.f52861d;
                if (!kc0Var3.m15104v()) {
                    zzjd zzjdVar6 = zzjd.SERVICE_CONNECTION_NOT_READY;
                    qc0 qc0Var6 = wwb.f67445j;
                    kc0Var3.m15107z(zzjdVar6, 7, qc0Var6);
                    zzbw zzbwVarM5669n = zzbw.m5669n();
                    zzbw.m5669n();
                    fy4 fy4Var = (fy4) c3440oy2.f55160b;
                    qc0Var6.getClass();
                    if (qc0Var6.f57553a == 0) {
                        zzbwVarM5669n.getClass();
                        if (!zzbwVarM5669n.isEmpty()) {
                            fy4Var.invoke(zzbwVarM5669n);
                            return null;
                        }
                    }
                    return null;
                }
                if (kc0Var3.f47010r) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    String str6 = ((vp7) ((zzbw) cc4Var.f9881a).get(0)).f65766b;
                    zzbw zzbwVar = (zzbw) cc4Var.f9881a;
                    int size = zzbwVar.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            c3299li = new C3299li(0, "", arrayList, arrayList2);
                        } else {
                            int i4 = i3 + 20;
                            ArrayList<vp7> arrayList3 = new ArrayList(zzbwVar.subList(i3, i4 > size ? size : i4));
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            int size2 = arrayList3.size();
                            for (int i5 = i2; i5 < size2; i5++) {
                                arrayList4.add(((vp7) arrayList3.get(i5)).f65765a);
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList4);
                            String str7 = kc0Var3.f46995c;
                            bundle2.putString("playBillingLibraryVersion", str7);
                            try {
                                synchronized (kc0Var3.f46993a) {
                                    pmbVar3 = kc0Var3.f47001i;
                                    break;
                                }
                                if (pmbVar3 == null) {
                                    c3299li = kc0Var3.m15095m(wwb.f67445j, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", exc);
                                } else {
                                    if (kc0Var3.f47011s) {
                                        kc0Var3.f47016x.getClass();
                                    }
                                    kc0Var3.m15092h();
                                    kc0Var3.m15092h();
                                    kc0Var3.m15092h();
                                    kc0Var3.m15092h();
                                    Bundle bundleM14029X = ((imb) pmbVar3).m14029X(true != kc0Var3.f47012t ? 17 : 20, kc0Var3.f46999g.getPackageName(), str6, bundle2, AbstractC0985a.m5503d(str7, kc0Var3.f46996d, arrayList3, new wkd(), kc0Var3.f46991A.longValue()));
                                    if (bundleM14029X == null) {
                                        c3299li = kc0Var3.m15095m(wwb.f67451p, zzjd.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                                    } else if (bundleM14029X.containsKey("DETAILS_LIST")) {
                                        ArrayList<String> stringArrayList = bundleM14029X.getStringArrayList("DETAILS_LIST");
                                        if (stringArrayList == null) {
                                            c3299li = kc0Var3.m15095m(wwb.f67451p, zzjd.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                                        } else {
                                            ArrayList arrayList5 = new ArrayList();
                                            int size3 = stringArrayList.size();
                                            for (int i6 = 0; i6 < size3; i6++) {
                                                try {
                                                    ql7 ql7Var = new ql7(stringArrayList.get(i6));
                                                    AbstractC0985a.m5507h("BillingClient", "Got product details: ".concat(ql7Var.toString()));
                                                    arrayList5.add(ql7Var);
                                                } catch (JSONException e5) {
                                                    c3299li = kc0Var3.m15095m(wwb.m24184a(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e5);
                                                }
                                            }
                                            ArrayList<String> stringArrayList2 = bundleM14029X.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                            new ArrayList();
                                            try {
                                                ArrayList arrayList6 = new ArrayList();
                                                if (stringArrayList2 == null) {
                                                    for (vp7 vp7Var : arrayList3) {
                                                        Iterator it = arrayList5.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                arrayList6.add(new sfa(new JSONObject().put("productId", vp7Var.f65765a).put("type", vp7Var.f65766b).put("statusCode", 0).toString()));
                                                            }
                                                            ql7 ql7Var2 = (ql7) it.next();
                                                            if (vp7Var.f65765a.equals(ql7Var2.f57906c) && vp7Var.f65766b.equals(ql7Var2.f57907d)) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Iterator<String> it2 = stringArrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        sfa sfaVar = new sfa(it2.next());
                                                        AbstractC0985a.m5507h("BillingClient", "Got unfetchedProduct: ".concat(sfaVar.toString()));
                                                        arrayList6.add(sfaVar);
                                                    }
                                                }
                                                arrayList.addAll(arrayList5);
                                                arrayList2.addAll(arrayList6);
                                                i3 = i4;
                                                exc = null;
                                                i2 = 0;
                                            } catch (JSONException e6) {
                                                c3299li = kc0Var3.m15095m(wwb.m24184a(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e6);
                                            }
                                        }
                                    } else {
                                        int iM5500a = AbstractC0985a.m5500a("BillingClient", bundleM14029X);
                                        String strM5505f = AbstractC0985a.m5505f("BillingClient", bundleM14029X);
                                        c3299li = iM5500a != 0 ? kc0Var3.m15095m(wwb.m24184a(iM5500a, strM5505f), zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, ux5.m22988k(iM5500a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : kc0Var3.m15095m(wwb.m24184a(6, strM5505f), zzjd.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                    }
                                }
                            } catch (DeadObjectException e7) {
                                c3299li = kc0Var3.m15095m(wwb.f67445j, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e7);
                            } catch (Exception e8) {
                                c3299li = kc0Var3.m15095m(wwb.f67443h, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e8);
                            }
                        }
                        break;
                    }
                    qc0 qc0VarM24184a = wwb.m24184a(c3299li.f49690a, (String) c3299li.f49692c);
                    ArrayList arrayList7 = (ArrayList) c3299li.f49691b;
                    fy4 fy4Var2 = (fy4) c3440oy2.f55160b;
                    if (qc0VarM24184a.f57553a == 0 && !arrayList7.isEmpty()) {
                        fy4Var2.invoke(arrayList7);
                    }
                } else {
                    AbstractC0985a.m5508i("BillingClient", "Querying product details is not supported.");
                    zzjd zzjdVar7 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
                    qc0 qc0Var7 = wwb.f67450o;
                    kc0Var3.m15107z(zzjdVar7, 7, qc0Var7);
                    zzbw zzbwVarM5669n2 = zzbw.m5669n();
                    zzbw.m5669n();
                    fy4 fy4Var3 = (fy4) c3440oy2.f55160b;
                    qc0Var7.getClass();
                    if (qc0Var7.f57553a == 0) {
                        zzbwVarM5669n2.getClass();
                        if (!zzbwVarM5669n2.isEmpty()) {
                            fy4Var3.invoke(zzbwVarM5669n2);
                            return null;
                        }
                    }
                }
                return null;
            case 3:
                return Boolean.valueOf(((SharedPreferences) this.f52859b).getBoolean((String) this.f52860c, ((Boolean) this.f52861d).booleanValue()));
            case 4:
                return Integer.valueOf(((SharedPreferences) this.f52859b).getInt((String) this.f52860c, ((Integer) this.f52861d).intValue()));
            case 5:
                return Long.valueOf(((SharedPreferences) this.f52859b).getLong((String) this.f52860c, ((Long) this.f52861d).longValue()));
            default:
                return ((SharedPreferences) this.f52859b).getString((String) this.f52860c, (String) this.f52861d);
        }
    }
}
