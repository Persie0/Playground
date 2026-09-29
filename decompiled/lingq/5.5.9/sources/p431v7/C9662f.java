package p431v7;

import android.content.Context;
import dm.C5207g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import mo.C7661i;
import org.json.JSONException;
import org.json.JSONObject;
import p173i8.C6205a;
import p213k4.RunnableC6590j;

/* JADX INFO: renamed from: v7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9662f {

    /* JADX INFO: renamed from: u */
    public static C9662f f49460u;

    /* JADX INFO: renamed from: a */
    public final Context f49464a;

    /* JADX INFO: renamed from: b */
    public final Object f49465b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f49466c;

    /* JADX INFO: renamed from: d */
    public final Class<?> f49467d;

    /* JADX INFO: renamed from: e */
    public final Class<?> f49468e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f49469f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f49470g;

    /* JADX INFO: renamed from: h */
    public final Class<?> f49471h;

    /* JADX INFO: renamed from: i */
    public final Class<?> f49472i;

    /* JADX INFO: renamed from: j */
    public final Method f49473j;

    /* JADX INFO: renamed from: k */
    public final Method f49474k;

    /* JADX INFO: renamed from: l */
    public final Method f49475l;

    /* JADX INFO: renamed from: m */
    public final Method f49476m;

    /* JADX INFO: renamed from: n */
    public final Method f49477n;

    /* JADX INFO: renamed from: o */
    public final Method f49478o;

    /* JADX INFO: renamed from: p */
    public final Method f49479p;

    /* JADX INFO: renamed from: q */
    public final C9666j f49480q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArraySet f49481r;

    /* JADX INFO: renamed from: s */
    public static final b f49458s = new b();

    /* JADX INFO: renamed from: t */
    public static final AtomicBoolean f49459t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v */
    public static final AtomicBoolean f49461v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w */
    public static final ConcurrentHashMap f49462w = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x */
    public static final ConcurrentHashMap f49463x = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v7.f$a */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(obj, "proxy");
                C5207g.m11111f(method, "m");
                if (C5207g.m11106a(method.getName(), "onBillingSetupFinished")) {
                    b bVar = C9662f.f49458s;
                    b.m18129c().set(true);
                } else {
                    String name = method.getName();
                    C5207g.m11110e(name, "m.name");
                    if (C7661i.m15248N2(name, "onBillingServiceDisconnected")) {
                        b bVar2 = C9662f.f49458s;
                        b.m18129c().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: v7.f$b */
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        /* JADX WARN: Code duplicated, block: B:98:0x01bf  */
        /* JADX INFO: renamed from: a */
        public static void m18127a(Context context) {
            AtomicBoolean atomicBoolean;
            AtomicBoolean atomicBoolean2;
            C9666j c9666j;
            Class<?> cls;
            Object obj;
            Object objM18155d;
            C9666j c9666j2 = C9666j.f49498g;
            Object objM18155d2 = null;
            if (C6205a.m12742b(C9666j.class)) {
                atomicBoolean = null;
            } else {
                try {
                    atomicBoolean = C9666j.f49499h;
                } catch (Throwable th2) {
                    C6205a.m12741a(C9666j.class, th2);
                    atomicBoolean = null;
                }
            }
            if (!atomicBoolean.get()) {
                Class<?> clsM18152a = C9667k.m18152a("com.android.billingclient.api.SkuDetailsParams");
                Class<?> clsM18152a2 = C9667k.m18152a("com.android.billingclient.api.SkuDetailsParams$Builder");
                if (clsM18152a != null && clsM18152a2 != null) {
                    Method methodM18154c = C9667k.m18154c(clsM18152a, "newBuilder", new Class[0]);
                    Method methodM18154c2 = C9667k.m18154c(clsM18152a2, "setType", String.class);
                    Method methodM18154c3 = C9667k.m18154c(clsM18152a2, "setSkusList", List.class);
                    Method methodM18154c4 = C9667k.m18154c(clsM18152a2, "build", new Class[0]);
                    if (methodM18154c != null && methodM18154c2 != null && methodM18154c3 != null && methodM18154c4 != null) {
                        C9666j c9666j3 = new C9666j(clsM18152a, clsM18152a2, methodM18154c, methodM18154c2, methodM18154c3, methodM18154c4);
                        if (!C6205a.m12742b(C9666j.class)) {
                            try {
                                C9666j.f49498g = c9666j3;
                            } catch (Throwable th3) {
                                C6205a.m12741a(C9666j.class, th3);
                            }
                        }
                    }
                }
                if (C6205a.m12742b(C9666j.class)) {
                    atomicBoolean2 = null;
                } else {
                    try {
                        atomicBoolean2 = C9666j.f49499h;
                    } catch (Throwable th4) {
                        C6205a.m12741a(C9666j.class, th4);
                        atomicBoolean2 = null;
                    }
                }
                atomicBoolean2.set(true);
                if (C6205a.m12742b(C9666j.class)) {
                    c9666j = null;
                } else {
                    try {
                        c9666j = C9666j.f49498g;
                    } catch (Throwable th5) {
                        C6205a.m12741a(C9666j.class, th5);
                        c9666j = null;
                    }
                }
            } else if (C6205a.m12742b(C9666j.class)) {
                c9666j = null;
            } else {
                try {
                    c9666j = C9666j.f49498g;
                } catch (Throwable th6) {
                    C6205a.m12741a(C9666j.class, th6);
                    c9666j = null;
                }
            }
            C9666j c9666j4 = c9666j;
            if (c9666j4 == null) {
                return;
            }
            Class<?> clsM18152a3 = C9667k.m18152a("com.android.billingclient.api.BillingClient");
            Class<?> clsM18152a4 = C9667k.m18152a("com.android.billingclient.api.Purchase");
            Class<?> clsM18152a5 = C9667k.m18152a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsM18152a6 = C9667k.m18152a("com.android.billingclient.api.SkuDetails");
            Class<?> clsM18152a7 = C9667k.m18152a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM18152a8 = C9667k.m18152a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsM18152a9 = C9667k.m18152a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM18152a3 == null || clsM18152a5 == null || clsM18152a4 == null || clsM18152a6 == null || clsM18152a8 == null || clsM18152a7 == null || clsM18152a9 == null) {
                return;
            }
            Method methodM18154c5 = C9667k.m18154c(clsM18152a3, "queryPurchases", String.class);
            Method methodM18154c6 = C9667k.m18154c(clsM18152a5, "getPurchasesList", new Class[0]);
            Method methodM18154c7 = C9667k.m18154c(clsM18152a4, "getOriginalJson", new Class[0]);
            Method methodM18154c8 = C9667k.m18154c(clsM18152a6, "getOriginalJson", new Class[0]);
            Method methodM18154c9 = C9667k.m18154c(clsM18152a7, "getOriginalJson", new Class[0]);
            Class[] clsArr = new Class[2];
            if (C6205a.m12742b(c9666j4)) {
                cls = null;
            } else {
                try {
                    cls = c9666j4.f49500a;
                } catch (Throwable th7) {
                    C6205a.m12741a(c9666j4, th7);
                    cls = null;
                }
            }
            clsArr[0] = cls;
            clsArr[1] = clsM18152a8;
            Method methodM18154c10 = C9667k.m18154c(clsM18152a3, "querySkuDetailsAsync", clsArr);
            Method methodM18154c11 = C9667k.m18154c(clsM18152a3, "queryPurchaseHistoryAsync", String.class, clsM18152a9);
            if (methodM18154c5 == null || methodM18154c6 == null || methodM18154c7 == null || methodM18154c8 == null || methodM18154c9 == null || methodM18154c10 == null || methodM18154c11 == null) {
                return;
            }
            Class<?> clsM18152a10 = C9667k.m18152a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM18152a11 = C9667k.m18152a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM18152a10 == null || clsM18152a11 == null) {
                obj = null;
            } else {
                Method methodM18154c12 = C9667k.m18154c(clsM18152a3, "newBuilder", Context.class);
                Method methodM18154c13 = C9667k.m18154c(clsM18152a10, "enablePendingPurchases", new Class[0]);
                Method methodM18154c14 = C9667k.m18154c(clsM18152a10, "setListener", clsM18152a11);
                Method methodM18154c15 = C9667k.m18154c(clsM18152a10, "build", new Class[0]);
                if (methodM18154c12 == null || methodM18154c13 == null || methodM18154c14 == null || methodM18154c15 == null) {
                    obj = null;
                } else {
                    Object objM18155d3 = C9667k.m18155d(clsM18152a3, null, methodM18154c12, context);
                    if (objM18155d3 != null) {
                        Object objM18155d4 = C9667k.m18155d(clsM18152a10, objM18155d3, methodM18154c14, Proxy.newProxyInstance(clsM18152a11.getClassLoader(), new Class[]{clsM18152a11}, new d()));
                        if (objM18155d4 == null || (objM18155d = C9667k.m18155d(clsM18152a10, objM18155d4, methodM18154c13, new Object[0])) == null) {
                            obj = null;
                        } else {
                            objM18155d2 = C9667k.m18155d(clsM18152a10, objM18155d, methodM18154c15, new Object[0]);
                        }
                    }
                    obj = objM18155d2;
                }
            }
            if (obj == null) {
                return;
            }
            C9662f c9662f = new C9662f(context, obj, clsM18152a3, clsM18152a5, clsM18152a4, clsM18152a6, clsM18152a7, clsM18152a8, clsM18152a9, methodM18154c5, methodM18154c6, methodM18154c7, methodM18154c8, methodM18154c9, methodM18154c10, methodM18154c11, c9666j4);
            if (!C6205a.m12742b(C9662f.class)) {
                try {
                    C9662f.f49460u = c9662f;
                } catch (Throwable th8) {
                    C6205a.m12741a(C9662f.class, th8);
                }
            }
            C9662f c9662fM18122a = C9662f.m18122a();
            if (c9662fM18122a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            if (C6205a.m12742b(C9662f.class)) {
                return;
            }
            try {
                c9662fM18122a.m18126e();
            } catch (Throwable th9) {
                C6205a.m12741a(C9662f.class, th9);
            }
        }

        /* JADX INFO: renamed from: b */
        public static ConcurrentHashMap m18128b() {
            if (!C6205a.m12742b(C9662f.class)) {
                try {
                    return C9662f.f49462w;
                } catch (Throwable th2) {
                    C6205a.m12741a(C9662f.class, th2);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static AtomicBoolean m18129c() {
            if (!C6205a.m12742b(C9662f.class)) {
                try {
                    return C9662f.f49461v;
                } catch (Throwable th2) {
                    C6205a.m12741a(C9662f.class, th2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: v7.f$c */
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Runnable f49482a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9662f f49483b;

        public c(C9662f c9662f, RunnableC6590j runnableC6590j) {
            C5207g.m11111f(c9662f, "this$0");
            this.f49483b = c9662f;
            this.f49482a = runnableC6590j;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x004a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0058 A[Catch: Exception -> 0x0014, all -> 0x00b9, TryCatch #3 {all -> 0x00b9, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001c, B:12:0x0021, B:21:0x003b, B:29:0x004b, B:31:0x0058, B:35:0x005f, B:44:0x0079, B:46:0x0089, B:53:0x009e, B:52:0x009b, B:42:0x0074, B:27:0x0047, B:19:0x0036, B:55:0x00b3), top: B:67:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x005b  */
        /* JADX WARN: Code duplicated, block: B:37:0x006d  */
        /* JADX WARN: Code duplicated, block: B:38:0x006f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0089 A[Catch: Exception -> 0x0014, all -> 0x00b9, TRY_LEAVE, TryCatch #3 {all -> 0x00b9, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001c, B:12:0x0021, B:21:0x003b, B:29:0x004b, B:31:0x0058, B:35:0x005f, B:44:0x0079, B:46:0x0089, B:53:0x009e, B:52:0x009b, B:42:0x0074, B:27:0x0047, B:19:0x0036, B:55:0x00b3), top: B:67:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0095  */
        /* JADX WARN: Code duplicated, block: B:65:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x0014 A[EDGE_INSN: B:75:0x0014->B:74:0x0014 BREAK  A[LOOP:1: B:9:0x0015->B:78:0x0015], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x005f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x005e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX INFO: renamed from: a */
        public final void m18130a(List<?> list) {
            ?? r10;
            ?? r11;
            Object objM18155d;
            ?? r12;
            JSONObject jSONObject;
            ?? r13;
            String str;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                Iterator<?> it = list.iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            this.f49482a.run();
                            return;
                        }
                        Object next = it.next();
                        try {
                            int i10 = C9667k.f49506a;
                            boolean zM12742b = C6205a.m12742b(C9662f.class);
                            C9662f c9662f = this.f49483b;
                            CopyOnWriteArraySet copyOnWriteArraySet = null;
                            if (!zM12742b) {
                                try {
                                    r10 = c9662f.f49470g;
                                } catch (Throwable th2) {
                                    C6205a.m12741a(C9662f.class, th2);
                                    r10 = copyOnWriteArraySet;
                                }
                                if (C6205a.m12742b(C9662f.class)) {
                                    r11 = copyOnWriteArraySet;
                                } else {
                                    try {
                                        r11 = c9662f.f49477n;
                                    } catch (Throwable th3) {
                                        C6205a.m12741a(C9662f.class, th3);
                                        r11 = copyOnWriteArraySet;
                                    }
                                }
                                objM18155d = C9667k.m18155d(r10, next, r11, new Object[0]);
                                if (objM18155d instanceof String) {
                                    str = (String) objM18155d;
                                } else {
                                    r12 = copyOnWriteArraySet;
                                }
                                if (r12 == 0) {
                                    r12 = str;
                                    jSONObject = new JSONObject((String) r12);
                                    if (C6205a.m12742b(C9662f.class)) {
                                        try {
                                            r13 = c9662f.f49464a;
                                        } catch (Throwable th4) {
                                            C6205a.m12741a(C9662f.class, th4);
                                            r13 = copyOnWriteArraySet;
                                        }
                                        jSONObject.put("packageName", r13.getPackageName());
                                        if (jSONObject.has("productId")) {
                                            break;
                                        }
                                        String string = jSONObject.getString("productId");
                                        if (C6205a.m12742b(C9662f.class)) {
                                            try {
                                                copyOnWriteArraySet = c9662f.f49481r;
                                            } catch (Throwable th5) {
                                                C6205a.m12741a(C9662f.class, th5);
                                            }
                                        }
                                        copyOnWriteArraySet.add(string);
                                        b bVar = C9662f.f49458s;
                                        ConcurrentHashMap concurrentHashMapM18128b = b.m18128b();
                                        C5207g.m11110e(string, "skuID");
                                        concurrentHashMapM18128b.put(string, jSONObject);
                                    }
                                    r13 = copyOnWriteArraySet;
                                    jSONObject.put("packageName", r13.getPackageName());
                                    if (jSONObject.has("productId")) {
                                        break;
                                        break;
                                    }
                                    String string2 = jSONObject.getString("productId");
                                    if (C6205a.m12742b(C9662f.class)) {
                                        copyOnWriteArraySet = c9662f.f49481r;
                                    }
                                    copyOnWriteArraySet.add(string2);
                                    b bVar2 = C9662f.f49458s;
                                    ConcurrentHashMap concurrentHashMapM18128b2 = b.m18128b();
                                    C5207g.m11110e(string2, "skuID");
                                    concurrentHashMapM18128b2.put(string2, jSONObject);
                                } else {
                                    r12 = str;
                                }
                            }
                            r10 = copyOnWriteArraySet;
                            if (C6205a.m12742b(C9662f.class)) {
                                r11 = copyOnWriteArraySet;
                            } else {
                                r11 = c9662f.f49477n;
                            }
                            objM18155d = C9667k.m18155d(r10, next, r11, new Object[0]);
                            if (objM18155d instanceof String) {
                                str = (String) objM18155d;
                            } else {
                                r12 = copyOnWriteArraySet;
                            }
                            if (r12 == 0) {
                                r12 = str;
                                jSONObject = new JSONObject((String) r12);
                                if (C6205a.m12742b(C9662f.class)) {
                                    r13 = c9662f.f49464a;
                                    jSONObject.put("packageName", r13.getPackageName());
                                    if (jSONObject.has("productId")) {
                                        break;
                                        break;
                                    }
                                    String string3 = jSONObject.getString("productId");
                                    if (C6205a.m12742b(C9662f.class)) {
                                        copyOnWriteArraySet = c9662f.f49481r;
                                    }
                                    copyOnWriteArraySet.add(string3);
                                    b bVar3 = C9662f.f49458s;
                                    ConcurrentHashMap concurrentHashMapM18128b3 = b.m18128b();
                                    C5207g.m11110e(string3, "skuID");
                                    concurrentHashMapM18128b3.put(string3, jSONObject);
                                }
                                r13 = copyOnWriteArraySet;
                                jSONObject.put("packageName", r13.getPackageName());
                                if (jSONObject.has("productId")) {
                                    break;
                                    break;
                                }
                                String string4 = jSONObject.getString("productId");
                                if (C6205a.m12742b(C9662f.class)) {
                                    copyOnWriteArraySet = c9662f.f49481r;
                                }
                                copyOnWriteArraySet.add(string4);
                                b bVar4 = C9662f.f49458s;
                                ConcurrentHashMap concurrentHashMapM18128b4 = b.m18128b();
                                C5207g.m11110e(string4, "skuID");
                                concurrentHashMapM18128b4.put(string4, jSONObject);
                            } else {
                                r12 = str;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th6) {
                C6205a.m12741a(this, th6);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(obj, "proxy");
                C5207g.m11111f(method, "method");
                if (C5207g.m11106a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        m18130a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: v7.f$d */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(obj, "proxy");
                C5207g.m11111f(method, "m");
                return null;
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: v7.f$e */
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final Runnable f49484a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9662f f49485b;

        public e(C9662f c9662f, Runnable runnable) {
            C5207g.m11111f(c9662f, "this$0");
            this.f49485b = c9662f;
            this.f49484a = runnable;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: Exception -> 0x0014, all -> 0x0097, TryCatch #2 {all -> 0x0097, blocks: (B:5:0x000e, B:7:0x0015, B:9:0x001b, B:10:0x0020, B:19:0x0039, B:28:0x004b, B:30:0x0057, B:34:0x005f, B:36:0x006c, B:43:0x0080, B:44:0x0085, B:26:0x0047, B:17:0x0034, B:47:0x0090), top: B:57:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:31:0x005a  */
        /* JADX WARN: Code duplicated, block: B:36:0x006c A[Catch: Exception -> 0x0014, all -> 0x0097, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:5:0x000e, B:7:0x0015, B:9:0x001b, B:10:0x0020, B:19:0x0039, B:28:0x004b, B:30:0x0057, B:34:0x005f, B:36:0x006c, B:43:0x0080, B:44:0x0085, B:26:0x0047, B:17:0x0034, B:47:0x0090), top: B:57:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:39:0x007a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0014 A[EDGE_INSN: B:65:0x0014->B:64:0x0014 BREAK  A[LOOP:1: B:7:0x0015->B:68:0x0015], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x005f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x005e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m18131a(List<?> list) {
            Class cls;
            Method method;
            Object objM18155d;
            String str;
            JSONObject jSONObject;
            String str2;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                Iterator<?> it = list.iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            this.f49484a.run();
                            return;
                        }
                        Object next = it.next();
                        try {
                            int i10 = C9667k.f49506a;
                            boolean zM12742b = C6205a.m12742b(C9662f.class);
                            ConcurrentHashMap concurrentHashMap = null;
                            C9662f c9662f = this.f49485b;
                            if (!zM12742b) {
                                try {
                                    cls = c9662f.f49469f;
                                } catch (Throwable th2) {
                                    C6205a.m12741a(C9662f.class, th2);
                                    cls = concurrentHashMap;
                                }
                                if (C6205a.m12742b(C9662f.class)) {
                                    try {
                                        method = c9662f.f49476m;
                                    } catch (Throwable th3) {
                                        C6205a.m12741a(C9662f.class, th3);
                                        method = concurrentHashMap;
                                    }
                                    objM18155d = C9667k.m18155d(cls, next, method, new Object[0]);
                                    if (objM18155d instanceof String) {
                                        str2 = (String) objM18155d;
                                    } else {
                                        str = concurrentHashMap;
                                    }
                                    if (str == 0) {
                                        str = str2;
                                        jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            break;
                                        }
                                        String string = jSONObject.getString("productId");
                                        b bVar = C9662f.f49458s;
                                        if (!C6205a.m12742b(C9662f.class)) {
                                            try {
                                                concurrentHashMap = C9662f.f49463x;
                                            } catch (Throwable th4) {
                                                C6205a.m12741a(C9662f.class, th4);
                                            }
                                        }
                                        C5207g.m11110e(string, "skuID");
                                        concurrentHashMap.put(string, jSONObject);
                                    } else {
                                        str = str2;
                                    }
                                }
                                method = concurrentHashMap;
                                objM18155d = C9667k.m18155d(cls, next, method, new Object[0]);
                                if (objM18155d instanceof String) {
                                    str2 = (String) objM18155d;
                                } else {
                                    str = concurrentHashMap;
                                }
                                if (str == 0) {
                                    str = str2;
                                    jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        break;
                                        break;
                                    }
                                    String string2 = jSONObject.getString("productId");
                                    b bVar2 = C9662f.f49458s;
                                    if (!C6205a.m12742b(C9662f.class)) {
                                        concurrentHashMap = C9662f.f49463x;
                                    }
                                    C5207g.m11110e(string2, "skuID");
                                    concurrentHashMap.put(string2, jSONObject);
                                } else {
                                    str = str2;
                                }
                            }
                            cls = concurrentHashMap;
                            if (C6205a.m12742b(C9662f.class)) {
                                method = c9662f.f49476m;
                                objM18155d = C9667k.m18155d(cls, next, method, new Object[0]);
                                if (objM18155d instanceof String) {
                                    str2 = (String) objM18155d;
                                } else {
                                    str = concurrentHashMap;
                                }
                                if (str == 0) {
                                    str = str2;
                                    jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        break;
                                        break;
                                    }
                                    String string3 = jSONObject.getString("productId");
                                    b bVar3 = C9662f.f49458s;
                                    if (!C6205a.m12742b(C9662f.class)) {
                                        concurrentHashMap = C9662f.f49463x;
                                    }
                                    C5207g.m11110e(string3, "skuID");
                                    concurrentHashMap.put(string3, jSONObject);
                                } else {
                                    str = str2;
                                }
                            }
                            method = concurrentHashMap;
                            objM18155d = C9667k.m18155d(cls, next, method, new Object[0]);
                            if (objM18155d instanceof String) {
                                str2 = (String) objM18155d;
                            } else {
                                str = concurrentHashMap;
                            }
                            if (str == 0) {
                                str = str2;
                                jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    break;
                                    break;
                                }
                                String string4 = jSONObject.getString("productId");
                                b bVar4 = C9662f.f49458s;
                                if (!C6205a.m12742b(C9662f.class)) {
                                    concurrentHashMap = C9662f.f49463x;
                                }
                                C5207g.m11110e(string4, "skuID");
                                concurrentHashMap.put(string4, jSONObject);
                            } else {
                                str = str2;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th5) {
                C6205a.m12741a(this, th5);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(obj, "proxy");
                C5207g.m11111f(method, "m");
                if (C5207g.m11106a(method.getName(), "onSkuDetailsResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        m18131a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }
    }

    public C9662f() {
        throw null;
    }

    public C9662f(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C9666j c9666j) {
        this.f49464a = context;
        this.f49465b = obj;
        this.f49466c = cls;
        this.f49467d = cls2;
        this.f49468e = cls3;
        this.f49469f = cls4;
        this.f49470g = cls5;
        this.f49471h = cls6;
        this.f49472i = cls7;
        this.f49473j = method;
        this.f49474k = method2;
        this.f49475l = method3;
        this.f49476m = method4;
        this.f49477n = method5;
        this.f49478o = method6;
        this.f49479p = method7;
        this.f49480q = c9666j;
        this.f49481r = new CopyOnWriteArraySet();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C9662f m18122a() {
        if (C6205a.m12742b(C9662f.class)) {
            return null;
        }
        try {
            return f49460u;
        } catch (Throwable th2) {
            C6205a.m12741a(C9662f.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18123b(RunnableC9660d runnableC9660d) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            int i10 = C9667k.f49506a;
            Object objM18155d = C9667k.m18155d(this.f49467d, C9667k.m18155d(this.f49466c, this.f49465b, this.f49473j, "inapp"), this.f49474k, new Object[0]);
            List list = objM18155d instanceof List ? (List) objM18155d : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            m18125d(arrayList, runnableC9660d);
                            return;
                        }
                        Object next = it.next();
                        int i11 = C9667k.f49506a;
                        Object objM18155d2 = C9667k.m18155d(this.f49468e, next, this.f49475l, new Object[0]);
                        String str = objM18155d2 instanceof String ? (String) objM18155d2 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                ConcurrentHashMap concurrentHashMap = f49462w;
                                C5207g.m11110e(string, "skuID");
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18124c(RunnableC6590j runnableC6590j) {
        Class<?> cls = this.f49472i;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c(this, runnableC6590j));
            int i10 = C9667k.f49506a;
            C9667k.m18155d(this.f49466c, this.f49465b, this.f49479p, "inapp", objNewProxyInstance);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18125d(ArrayList arrayList, Runnable runnable) {
        Class<?> cls = this.f49471h;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e(this, runnable));
            Object objM18151a = this.f49480q.m18151a(arrayList);
            int i10 = C9667k.f49506a;
            C9667k.m18155d(this.f49466c, this.f49465b, this.f49478o, objM18151a, objNewProxyInstance);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18126e() {
        Method methodM18154c;
        Class<?> cls = this.f49466c;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Class<?> clsM18152a = C9667k.m18152a("com.android.billingclient.api.BillingClientStateListener");
            if (clsM18152a == null || (methodM18154c = C9667k.m18154c(cls, "startConnection", clsM18152a)) == null) {
                return;
            }
            C9667k.m18155d(cls, this.f49465b, methodM18154c, Proxy.newProxyInstance(clsM18152a.getClassLoader(), new Class[]{clsM18152a}, new a()));
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
