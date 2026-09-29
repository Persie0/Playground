package p034bp;

import dm.C5207g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: renamed from: bp.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1637e extends C1640h {

    /* JADX INFO: renamed from: c */
    public final Method f9188c;

    /* JADX INFO: renamed from: d */
    public final Method f9189d;

    /* JADX INFO: renamed from: e */
    public final Method f9190e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f9191f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f9192g;

    /* JADX INFO: renamed from: bp.e$a */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final List<String> f9193a;

        /* JADX INFO: renamed from: b */
        public boolean f9194b;

        /* JADX INFO: renamed from: c */
        public String f9195c;

        public a(ArrayList arrayList) {
            this.f9193a = arrayList;
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            C5207g.m11111f(obj, "proxy");
            C5207g.m11111f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C5207g.m11106a(name, "supports") && C5207g.m11106a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C5207g.m11106a(name, "unsupported") && C5207g.m11106a(Void.TYPE, returnType)) {
                this.f9194b = true;
                return null;
            }
            boolean zM11106a = C5207g.m11106a(name, "protocols");
            List<String> list = this.f9193a;
            if (zM11106a) {
                if (objArr.length == 0) {
                    return list;
                }
            }
            if ((C5207g.m11106a(name, "selectProtocol") || C5207g.m11106a(name, "select")) && C5207g.m11106a(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list2 = (List) obj2;
                    int size = list2.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj3 = list2.get(i10);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (list.contains(str)) {
                                this.f9195c = str;
                                return str;
                            }
                            if (i10 != size) {
                                i10 = i11;
                            }
                        }
                    }
                    String str2 = list.get(0);
                    this.f9195c = str2;
                    return str2;
                }
            }
            if (C5207g.m11106a(name, "protocolSelected") || C5207g.m11106a(name, "selected")) {
                if (objArr.length == 1) {
                    Object obj4 = objArr[0];
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    this.f9195c = (String) obj4;
                    return null;
                }
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public C1637e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f9188c = method;
        this.f9189d = method2;
        this.f9190e = method3;
        this.f9191f = cls;
        this.f9192g = cls2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: a */
    public final void mo5332a(SSLSocket sSLSocket) {
        try {
            this.f9190e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C5207g.m11111f(list, "protocols");
        try {
            this.f9188c.invoke(null, sSLSocket, Proxy.newProxyInstance(C1640h.class.getClassLoader(), new Class[]{this.f9191f, this.f9192g}, new a(C1640h.a.m5335a(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f9189d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            boolean z10 = aVar.f9194b;
            if (!z10 && aVar.f9195c == null) {
                C1640h.m5334j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f9195c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
