package p000;

import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q24 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final InAppPurchaseUtils$IAPProductType f57158a;

    /* JADX INFO: renamed from: b */
    public final Runnable f57159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s24 f57160c;

    public q24(s24 s24Var, InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType, Runnable runnable) {
        inAppPurchaseUtils$IAPProductType.getClass();
        this.f57160c = s24Var;
        this.f57158a = inAppPurchaseUtils$IAPProductType;
        this.f57159b = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m19616a(Object obj, Method method, Object[] objArr) {
        InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType;
        s24 s24Var;
        Class cls;
        Method method2;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (fa4.m11650l(method.getName(), "onPurchaseHistoryResponse")) {
                Object objM20842j0 = objArr != null ? AbstractC3550rv.m20842j0(objArr, 1) : null;
                if (objM20842j0 != null && (objM20842j0 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objM20842j0).iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        inAppPurchaseUtils$IAPProductType = this.f57158a;
                        s24Var = this.f57160c;
                        if (!zHasNext) {
                            break;
                        }
                        Object next = it.next();
                        try {
                            if (lp1.f49971a.contains(s24.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = s24Var.f60187d;
                                } catch (Throwable th) {
                                    lp1.m16420a(s24.class, th);
                                    cls = null;
                                }
                            }
                            if (lp1.f49971a.contains(s24.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = s24Var.f60191h;
                                } catch (Throwable th2) {
                                    lp1.m16420a(s24.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objM3252s = b34.m3252s(cls, next, method2, new Object[0]);
                            String str = objM3252s instanceof String ? (String) objM3252s : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    string.getClass();
                                    arrayList.add(string);
                                    if (inAppPurchaseUtils$IAPProductType == InAppPurchaseUtils$IAPProductType.INAPP) {
                                        a3d a3dVar = s24.f60178l;
                                        a3d.m77n().put(string, jSONObject);
                                    } else {
                                        a3d a3dVar2 = s24.f60178l;
                                        a3d.m79q().put(string, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    Runnable runnable = this.f57159b;
                    if (zIsEmpty) {
                        runnable.run();
                        return;
                    }
                    Set set = lp1.f49971a;
                    if (set.contains(s24.class)) {
                        return;
                    }
                    try {
                        if (set.contains(s24Var)) {
                            return;
                        }
                        try {
                            s24Var.m21007c(new oc0(s24Var, runnable, inAppPurchaseUtils$IAPProductType, arrayList, 1));
                        } catch (Throwable th3) {
                            lp1.m16420a(s24Var, th3);
                        }
                    } catch (Throwable th4) {
                        lp1.m16420a(s24.class, th4);
                    }
                }
            }
        } catch (Throwable th5) {
            lp1.m16420a(this, th5);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            m19616a(obj, method, objArr);
            return xfa.f68157a;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
