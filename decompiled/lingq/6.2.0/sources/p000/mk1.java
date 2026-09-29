package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mk1 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51430a;

    /* JADX INFO: renamed from: b */
    public final Object f51431b;

    /* JADX INFO: renamed from: c */
    public final Object f51432c;

    public mk1(z21 z21Var, vi3 vi3Var) {
        this.f51430a = 0;
        this.f51431b = z21Var;
        this.f51432c = vi3Var;
    }

    /* JADX INFO: renamed from: a */
    public void m16865a(Object obj, Method method, Object[] objArr) {
        Class cls;
        Method method2;
        s24 s24Var = (s24) this.f51432c;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            obj.getClass();
            method.getClass();
            if (fa4.m11650l(method.getName(), "onSkuDetailsResponse")) {
                Object objM20842j0 = objArr != null ? AbstractC3550rv.m20842j0(objArr, 1) : null;
                if (objM20842j0 != null && (objM20842j0 instanceof List)) {
                    for (Object obj2 : (List) objM20842j0) {
                        try {
                            if (lp1.f49971a.contains(s24.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = s24Var.f60186c;
                                } catch (Throwable th) {
                                    lp1.m16420a(s24.class, th);
                                    cls = null;
                                }
                            }
                            if (lp1.f49971a.contains(s24.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = s24Var.f60190g;
                                } catch (Throwable th2) {
                                    lp1.m16420a(s24.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objM3252s = b34.m3252s(cls, obj2, method2, new Object[0]);
                            String str = objM3252s instanceof String ? (String) objM3252s : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    a3d a3dVar = s24.f60178l;
                                    ConcurrentHashMap concurrentHashMapM78p = a3d.m78p();
                                    string.getClass();
                                    concurrentHashMapM78p.put(string, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ((Runnable) this.f51431b).run();
                }
            }
        } catch (Throwable th3) {
            lp1.m16420a(this, th3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i = this.f51430a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f51432c;
        Object obj3 = this.f51431b;
        switch (i) {
            case 0:
                vi3 vi3Var = (vi3) obj2;
                obj.getClass();
                method.getClass();
                if (fa4.m11650l(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    z21 z21Var = (z21) obj3;
                    Object obj4 = objArr[0];
                    if (z21Var.m25415d(obj4)) {
                        obj4.getClass();
                        vi3Var.invoke(obj4);
                        return xfaVar;
                    }
                    throw new ClassCastException("Value cannot be cast to " + z21Var.m25413b());
                }
                if (fa4.m11650l(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(obj == objArr[0]);
                }
                if (fa4.m11650l(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(vi3Var.hashCode());
                }
                if (fa4.m11650l(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return vi3Var.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            case 1:
                if (!lp1.f49971a.contains(this)) {
                    try {
                        m16865a(obj, method, objArr);
                        return xfaVar;
                    } catch (Throwable th) {
                        lp1.m16420a(this, th);
                    }
                }
                return null;
            default:
                Object[] objArr2 = (Object[]) obj3;
                u24 u24Var = (u24) obj2;
                obj.getClass();
                method.getClass();
                String name = method.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -1642587947:
                            if (name.equals("onPurchaseHistoryResponse") && !lp1.f49971a.contains(u24.class)) {
                                try {
                                    u24Var.m22404j(objArr2, objArr);
                                } catch (Throwable th2) {
                                    lp1.m16420a(u24.class, th2);
                                }
                            }
                            break;
                        case -1599362358:
                            if (name.equals("onQueryPurchasesResponse") && !lp1.f49971a.contains(u24.class)) {
                                try {
                                    u24Var.m22405k(objArr2, objArr);
                                } catch (Throwable th3) {
                                    lp1.m16420a(u24.class, th3);
                                }
                            }
                            break;
                        case -79406125:
                            if (name.equals("onBillingSetupFinished") && !lp1.f49971a.contains(u24.class)) {
                                try {
                                    u24Var.m22402h(objArr2, objArr);
                                } catch (Throwable th4) {
                                    lp1.m16420a(u24.class, th4);
                                }
                            }
                            break;
                        case 1227540564:
                            if (name.equals("onBillingServiceDisconnected")) {
                                Set set = lp1.f49971a;
                                if (!set.contains(u24.class)) {
                                    try {
                                        if (!set.contains(u24Var)) {
                                            try {
                                                u24.f63275H.set(false);
                                            } catch (Throwable th5) {
                                                lp1.m16420a(u24Var, th5);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        lp1.m16420a(u24.class, th6);
                                    }
                                }
                            }
                            break;
                        case 1940131955:
                            if (name.equals("onProductDetailsResponse") && !lp1.f49971a.contains(u24.class)) {
                                try {
                                    u24Var.m22403i(objArr2, objArr);
                                } catch (Throwable th7) {
                                    lp1.m16420a(u24.class, th7);
                                }
                            }
                            break;
                    }
                }
                return null;
        }
    }

    public /* synthetic */ mk1(o24 o24Var, Object obj, int i) {
        this.f51430a = i;
        this.f51432c = o24Var;
        this.f51431b = obj;
    }
}
