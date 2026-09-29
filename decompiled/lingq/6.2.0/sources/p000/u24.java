package p000;

import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u24 implements o24 {

    /* JADX INFO: renamed from: I */
    public static u24 f63276I;

    /* JADX INFO: renamed from: A */
    public final Method f63280A;

    /* JADX INFO: renamed from: B */
    public final Method f63281B;

    /* JADX INFO: renamed from: C */
    public final Method f63282C;

    /* JADX INFO: renamed from: D */
    public final Method f63283D;

    /* JADX INFO: renamed from: E */
    public final Method f63284E;

    /* JADX INFO: renamed from: F */
    public final Method f63285F;

    /* JADX INFO: renamed from: a */
    public final Object f63286a;

    /* JADX INFO: renamed from: b */
    public final Class f63287b;

    /* JADX INFO: renamed from: c */
    public final Class f63288c;

    /* JADX INFO: renamed from: d */
    public final Class f63289d;

    /* JADX INFO: renamed from: e */
    public final Class f63290e;

    /* JADX INFO: renamed from: f */
    public final Class f63291f;

    /* JADX INFO: renamed from: g */
    public final Class f63292g;

    /* JADX INFO: renamed from: h */
    public final Class f63293h;

    /* JADX INFO: renamed from: i */
    public final Class f63294i;

    /* JADX INFO: renamed from: j */
    public final Class f63295j;

    /* JADX INFO: renamed from: k */
    public final Class f63296k;

    /* JADX INFO: renamed from: l */
    public final Class f63297l;

    /* JADX INFO: renamed from: m */
    public final Class f63298m;

    /* JADX INFO: renamed from: n */
    public final Class f63299n;

    /* JADX INFO: renamed from: o */
    public final Class f63300o;

    /* JADX INFO: renamed from: p */
    public final Method f63301p;

    /* JADX INFO: renamed from: q */
    public final Method f63302q;

    /* JADX INFO: renamed from: r */
    public final Method f63303r;

    /* JADX INFO: renamed from: s */
    public final Method f63304s;

    /* JADX INFO: renamed from: t */
    public final Method f63305t;

    /* JADX INFO: renamed from: u */
    public final Method f63306u;

    /* JADX INFO: renamed from: v */
    public final Method f63307v;

    /* JADX INFO: renamed from: w */
    public final Method f63308w;

    /* JADX INFO: renamed from: x */
    public final Method f63309x;

    /* JADX INFO: renamed from: y */
    public final Method f63310y;

    /* JADX INFO: renamed from: z */
    public final Method f63311z;

    /* JADX INFO: renamed from: G */
    public static final t24 f63274G = new t24();

    /* JADX INFO: renamed from: H */
    public static final AtomicBoolean f63275H = new AtomicBoolean(false);

    /* JADX INFO: renamed from: J */
    public static final ConcurrentHashMap f63277J = new ConcurrentHashMap();

    /* JADX INFO: renamed from: K */
    public static final ConcurrentHashMap f63278K = new ConcurrentHashMap();

    /* JADX INFO: renamed from: L */
    public static final ConcurrentHashMap f63279L = new ConcurrentHashMap();

    public u24(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.f63286a = obj;
        this.f63287b = cls;
        this.f63288c = cls2;
        this.f63289d = cls3;
        this.f63290e = cls4;
        this.f63291f = cls5;
        this.f63292g = cls6;
        this.f63293h = cls7;
        this.f63294i = cls8;
        this.f63295j = cls9;
        this.f63296k = cls10;
        this.f63297l = cls11;
        this.f63298m = cls12;
        this.f63299n = cls13;
        this.f63300o = cls14;
        this.f63301p = method;
        this.f63302q = method2;
        this.f63303r = method3;
        this.f63304s = method4;
        this.f63305t = method5;
        this.f63306u = method6;
        this.f63307v = method7;
        this.f63308w = method8;
        this.f63309x = method9;
        this.f63310y = method10;
        this.f63311z = method11;
        this.f63280A = method12;
        this.f63281B = method13;
        this.f63282C = method14;
        this.f63283D = method15;
        this.f63284E = method16;
        this.f63285F = method17;
    }

    /* JADX INFO: renamed from: b */
    public static final String m22396b() {
        if (lp1.f49971a.contains(u24.class)) {
            return null;
        }
        return "u24";
    }

    @Override // p000.o24
    /* JADX INFO: renamed from: a */
    public final void mo17770a(InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType, Runnable runnable) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            inAppPurchaseUtils$IAPProductType.getClass();
            m22397c(new RunnableC3725wk(this, inAppPurchaseUtils$IAPProductType, runnable, 12));
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22397c(Runnable runnable) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (f63275H.get()) {
                runnable.run();
            } else {
                m22406l(runnable);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m22398d() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return this.f63286a;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m22399e(String str) {
        if (!lp1.f49971a.contains(this)) {
            try {
                dr5 dr5VarM15424b = new Regex("jsonString='(.*?)'").m15424b(str);
                if (dr5VarM15424b != null) {
                    return (String) u91.m22592J0(1, dr5VarM15424b.m10610a());
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final Object m22400f(InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType, ArrayList arrayList) {
        Class cls = this.f63295j;
        Class cls2 = this.f63297l;
        if (!lp1.f49971a.contains(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object objM3252s = b34.m3252s(cls2, b34.m3252s(cls2, b34.m3252s(cls2, b34.m3252s(this.f63291f, null, this.f63311z, new Object[0]), this.f63281B, (String) it.next()), this.f63282C, inAppPurchaseUtils$IAPProductType.getType()), this.f63280A, new Object[0]);
                        if (objM3252s != null) {
                            arrayList2.add(objM3252s);
                        }
                    }
                    return b34.m3252s(cls, b34.m3252s(cls, b34.m3252s(this.f63293h, null, this.f63308w, new Object[0]), this.f63310y, arrayList2), this.f63309x, new Object[0]);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m22401g(InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType) {
        Class cls = this.f63296k;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return b34.m3252s(cls, b34.m3252s(cls, b34.m3252s(this.f63294i, null, this.f63303r, new Object[0]), this.f63305t, inAppPurchaseUtils$IAPProductType.getType()), this.f63304s, new Object[0]);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22402h(Object[] objArr, Object[] objArr2) {
        if (lp1.f49971a.contains(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (fa4.m11650l(b34.m3252s(this.f63292g, objArr2[0], this.f63285F, new Object[0]), 0)) {
                f63275H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m22403i(Object[] objArr, Object[] objArr2) {
        String strM22399e;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Object objM20842j0 = AbstractC3550rv.m20842j0(objArr, 0);
            Object objM20842j1 = objArr2 != null ? AbstractC3550rv.m20842j0(objArr2, 1) : null;
            if (objM20842j1 != null && (objM20842j1 instanceof List)) {
                Iterator it = ((List) objM20842j1).iterator();
                while (it.hasNext()) {
                    try {
                        Object objM3252s = b34.m3252s(this.f63289d, it.next(), this.f63283D, new Object[0]);
                        String str = objM3252s instanceof String ? (String) objM3252s : null;
                        if (str != null && (strM22399e = m22399e(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strM22399e);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                ConcurrentHashMap concurrentHashMap = f63279L;
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (objM20842j0 == null || !(objM20842j0 instanceof Runnable)) {
                    return;
                }
                ((Runnable) objM20842j0).run();
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m22404j(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objM20842j0;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Object objM20842j1 = AbstractC3550rv.m20842j0(objArr, 0);
            if (objM20842j1 != null && (objM20842j1 instanceof InAppPurchaseUtils$IAPProductType)) {
                Object objM20842j2 = AbstractC3550rv.m20842j0(objArr, 1);
                if (objM20842j2 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objM20842j0 = AbstractC3550rv.m20842j0(objArr2, 1);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objM20842j0 = null;
                    }
                    if (objM20842j0 != null && (objM20842j0 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objM20842j0).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM3252s = b34.m3252s(this.f63290e, it.next(), this.f63306u, new Object[0]);
                                String str = objM3252s instanceof String ? (String) objM3252s : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        if (!f63279L.containsKey(string)) {
                                            string.getClass();
                                            arrayList.add(string);
                                        }
                                        if (objM20842j1 == InAppPurchaseUtils$IAPProductType.INAPP) {
                                            ConcurrentHashMap concurrentHashMap = f63277J;
                                            string.getClass();
                                            concurrentHashMap.put(string, jSONObject);
                                        } else {
                                            ConcurrentHashMap concurrentHashMap2 = f63278K;
                                            string.getClass();
                                            concurrentHashMap2.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objM20842j2).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType = (InAppPurchaseUtils$IAPProductType) objM20842j1;
                            Runnable runnable = (Runnable) objM20842j2;
                            try {
                                try {
                                    if (lp1.f49971a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.m22397c(new oc0(this, runnable, inAppPurchaseUtils$IAPProductType, arrayList, 2));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                lp1.m16420a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                lp1.m16420a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                lp1.m16420a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m22405k(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objM20842j0;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Object objM20842j1 = AbstractC3550rv.m20842j0(objArr, 0);
            if (objM20842j1 != null && (objM20842j1 instanceof InAppPurchaseUtils$IAPProductType)) {
                Object objM20842j2 = AbstractC3550rv.m20842j0(objArr, 1);
                if (objM20842j2 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objM20842j0 = AbstractC3550rv.m20842j0(objArr2, 1);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objM20842j0 = null;
                    }
                    if (objM20842j0 != null && (objM20842j0 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objM20842j0).iterator();
                        while (it.hasNext()) {
                            Object objM3252s = b34.m3252s(this.f63288c, it.next(), this.f63301p, new Object[0]);
                            String str = objM3252s instanceof String ? (String) objM3252s : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!f63279L.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (objM20842j1 == InAppPurchaseUtils$IAPProductType.INAPP) {
                                        ConcurrentHashMap concurrentHashMap = f63277J;
                                        string.getClass();
                                        concurrentHashMap.put(string, jSONObject);
                                    } else {
                                        ConcurrentHashMap concurrentHashMap2 = f63278K;
                                        string.getClass();
                                        concurrentHashMap2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objM20842j2).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType = (InAppPurchaseUtils$IAPProductType) objM20842j1;
                            Runnable runnable = (Runnable) objM20842j2;
                            try {
                                try {
                                    if (lp1.f49971a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.m22397c(new oc0(this, runnable, inAppPurchaseUtils$IAPProductType, arrayList, 2));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                lp1.m16420a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                lp1.m16420a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                lp1.m16420a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22406l(Runnable runnable) {
        Class cls = this.f63298m;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new mk1(this, new Object[]{runnable}, 2));
            b34.m3252s(this.f63287b, m22398d(), this.f63284E, objNewProxyInstance);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
