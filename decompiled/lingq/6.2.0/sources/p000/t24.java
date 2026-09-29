package p000;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t24 implements InvocationHandler {
    /* JADX WARN: Code duplicated, block: B:57:0x0225  */
    /* JADX WARN: Code duplicated, block: B:59:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final u24 m21819a(Context context) {
        Class cls;
        Object objM3252s;
        u24 u24Var;
        Class clsM3246l = b34.m3246l("com.android.billingclient.api.BillingClient");
        Class clsM3246l2 = b34.m3246l("com.android.billingclient.api.Purchase");
        Class clsM3246l3 = b34.m3246l("com.android.billingclient.api.ProductDetails");
        Class clsM3246l4 = b34.m3246l("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsM3246l5 = b34.m3246l("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class clsM3246l6 = b34.m3246l("com.android.billingclient.api.BillingResult");
        Class clsM3246l7 = b34.m3246l("com.android.billingclient.api.QueryProductDetailsParams");
        Class clsM3246l8 = b34.m3246l("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class clsM3246l9 = b34.m3246l("com.android.billingclient.api.QueryPurchasesParams");
        Class clsM3246l10 = b34.m3246l("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class clsM3246l11 = b34.m3246l("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class clsM3246l12 = b34.m3246l("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class clsM3246l13 = b34.m3246l("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class clsM3246l14 = b34.m3246l("com.android.billingclient.api.BillingClient$Builder");
        Class clsM3246l15 = b34.m3246l("com.android.billingclient.api.PurchasesUpdatedListener");
        Class clsM3246l16 = b34.m3246l("com.android.billingclient.api.BillingClientStateListener");
        Class clsM3246l17 = b34.m3246l("com.android.billingclient.api.ProductDetailsResponseListener");
        Class clsM3246l18 = b34.m3246l("com.android.billingclient.api.PurchasesResponseListener");
        Class clsM3246l19 = b34.m3246l("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsM3246l == null || clsM3246l2 == null || clsM3246l3 == null || clsM3246l4 == null || clsM3246l5 == null || clsM3246l6 == null || clsM3246l7 == null || clsM3246l8 == null || clsM3246l9 == null || clsM3246l10 == null || clsM3246l11 == null || clsM3246l12 == null || clsM3246l13 == null || clsM3246l14 == null || clsM3246l15 == null || clsM3246l16 == null || clsM3246l17 == null || clsM3246l18 == null || clsM3246l19 == null) {
            Log.w(u24.m22396b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodM3249p = b34.m3249p(clsM3246l, "queryPurchasesAsync", clsM3246l9, clsM3246l18);
        Method methodM3249p2 = b34.m3249p(clsM3246l9, "newBuilder", new Class[0]);
        Method methodM3249p3 = b34.m3249p(clsM3246l12, "build", new Class[0]);
        Method methodM3249p4 = b34.m3249p(clsM3246l12, "setProductType", String.class);
        Method methodM3249p5 = b34.m3249p(clsM3246l2, "getOriginalJson", new Class[0]);
        Method methodM3249p6 = b34.m3249p(clsM3246l, "queryPurchaseHistoryAsync", clsM3246l8, clsM3246l19);
        Method methodM3249p7 = b34.m3249p(clsM3246l8, "newBuilder", new Class[0]);
        Method methodM3249p8 = b34.m3249p(clsM3246l11, "build", new Class[0]);
        Method methodM3249p9 = b34.m3249p(clsM3246l11, "setProductType", String.class);
        Method methodM3249p10 = b34.m3249p(clsM3246l4, "getOriginalJson", new Class[0]);
        Method methodM3249p11 = b34.m3249p(clsM3246l, "queryProductDetailsAsync", clsM3246l7, clsM3246l17);
        Method methodM3249p12 = b34.m3249p(clsM3246l7, "newBuilder", new Class[0]);
        Method methodM3249p13 = b34.m3249p(clsM3246l10, "build", new Class[0]);
        Method methodM3249p14 = b34.m3249p(clsM3246l10, "setProductList", List.class);
        Method methodM3249p15 = b34.m3249p(clsM3246l5, "newBuilder", new Class[0]);
        Method methodM3249p16 = b34.m3249p(clsM3246l13, "build", new Class[0]);
        Method methodM3249p17 = b34.m3249p(clsM3246l13, "setProductId", String.class);
        Method methodM3249p18 = b34.m3249p(clsM3246l13, "setProductType", String.class);
        Method methodM3249p19 = b34.m3249p(clsM3246l3, "toString", new Class[0]);
        Method methodM3249p20 = b34.m3249p(clsM3246l, "startConnection", clsM3246l16);
        Method methodM3249p21 = b34.m3249p(clsM3246l6, "getResponseCode", new Class[0]);
        if (methodM3249p == null || methodM3249p2 == null || methodM3249p3 == null || methodM3249p4 == null || methodM3249p5 == null || methodM3249p6 == null || methodM3249p7 == null || methodM3249p8 == null || methodM3249p9 == null || methodM3249p10 == null || methodM3249p11 == null || methodM3249p12 == null || methodM3249p13 == null || methodM3249p14 == null || methodM3249p15 == null || methodM3249p16 == null || methodM3249p17 == null || methodM3249p18 == null || methodM3249p19 == null || methodM3249p20 == null || methodM3249p21 == null) {
            Log.w(u24.m22396b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodM3249p22 = b34.m3249p(clsM3246l, "newBuilder", Context.class);
        Method methodM3249p23 = b34.m3249p(clsM3246l14, "setListener", clsM3246l15);
        Method methodM3249p24 = b34.m3249p(clsM3246l14, "enablePendingPurchases", new Class[0]);
        Method methodM3249p25 = b34.m3249p(clsM3246l14, "build", new Class[0]);
        if (methodM3249p25 != null && methodM3249p23 != null && methodM3249p22 != null && methodM3249p24 != null) {
            cls = clsM3246l;
            Object objM3252s2 = b34.m3252s(clsM3246l14, b34.m3252s(clsM3246l, null, methodM3249p22, context), methodM3249p23, Proxy.newProxyInstance(clsM3246l15.getClassLoader(), new Class[]{clsM3246l15}, this));
            if (objM3252s2 != null) {
                objM3252s = b34.m3252s(clsM3246l14, b34.m3252s(clsM3246l14, objM3252s2, methodM3249p24, new Object[0]), methodM3249p25, new Object[0]);
            }
            if (objM3252s == null) {
                Log.w(u24.m22396b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            u24Var = new u24(objM3252s, cls, clsM3246l2, clsM3246l3, clsM3246l4, clsM3246l5, clsM3246l6, clsM3246l7, clsM3246l8, clsM3246l10, clsM3246l11, clsM3246l13, clsM3246l16, clsM3246l17, clsM3246l19, methodM3249p5, methodM3249p6, methodM3249p7, methodM3249p8, methodM3249p9, methodM3249p10, methodM3249p11, methodM3249p12, methodM3249p13, methodM3249p14, methodM3249p15, methodM3249p16, methodM3249p17, methodM3249p18, methodM3249p19, methodM3249p20, methodM3249p21);
            if (!lp1.f49971a.contains(u24.class)) {
                try {
                    u24.f63276I = u24Var;
                } catch (Throwable th) {
                    lp1.m16420a(u24.class, th);
                }
            }
            if (!lp1.f49971a.contains(u24.class)) {
                try {
                    return u24.f63276I;
                } catch (Throwable th2) {
                    lp1.m16420a(u24.class, th2);
                }
            }
            return null;
        }
        cls = clsM3246l;
        objM3252s = null;
        if (objM3252s == null) {
            Log.w(u24.m22396b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        u24Var = new u24(objM3252s, cls, clsM3246l2, clsM3246l3, clsM3246l4, clsM3246l5, clsM3246l6, clsM3246l7, clsM3246l8, clsM3246l10, clsM3246l11, clsM3246l13, clsM3246l16, clsM3246l17, clsM3246l19, methodM3249p5, methodM3249p6, methodM3249p7, methodM3249p8, methodM3249p9, methodM3249p10, methodM3249p11, methodM3249p12, methodM3249p13, methodM3249p14, methodM3249p15, methodM3249p16, methodM3249p17, methodM3249p18, methodM3249p19, methodM3249p20, methodM3249p21);
        if (!lp1.f49971a.contains(u24.class)) {
            u24.f63276I = u24Var;
        }
        if (!lp1.f49971a.contains(u24.class)) {
            return u24.f63276I;
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        return null;
    }
}
