package p034bp;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C6744b;
import okhttp3.Protocol;
import p057cp.C4988b;
import p057cp.C4992f;
import p057cp.C4993g;
import p057cp.C4994h;
import p057cp.C4995i;
import p057cp.C4996j;
import p057cp.C4998l;
import p057cp.InterfaceC4997k;
import p103ep.AbstractC5449c;
import p103ep.C5447a;
import p103ep.InterfaceC5451e;

/* JADX INFO: renamed from: bp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1634b extends C1640h {

    /* JADX INFO: renamed from: e */
    public static final boolean f9178e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9179c;

    /* JADX INFO: renamed from: d */
    public final C4994h f9180d;

    /* JADX INFO: renamed from: bp.b$a */
    public static final class a implements InterfaceC5451e {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f9181a;

        /* JADX INFO: renamed from: b */
        public final Method f9182b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f9181a = x509TrustManager;
            this.f9182b = method;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p103ep.InterfaceC5451e
        /* JADX INFO: renamed from: a */
        public final X509Certificate mo5325a(X509Certificate x509Certificate) {
            C5207g.m11111f(x509Certificate, "cert");
            try {
                Object objInvoke = this.f9182b.invoke(this.f9181a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f9181a, aVar.f9181a) && C5207g.m11106a(this.f9182b, aVar.f9182b);
        }

        public final int hashCode() {
            return this.f9182b.hashCode() + (this.f9181a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f9181a + ", findByIssuerAndSignatureMethod=" + this.f9182b + ')';
        }
    }

    static {
        f9178e = C1640h.a.m5337c() && Build.VERSION.SDK_INT < 30;
    }

    public C1634b() throws NoSuchMethodException {
        C4998l c4998l;
        ArrayList arrayList;
        Iterator it;
        Method method;
        Method method2;
        InterfaceC4997k[] interfaceC4997kArr = new InterfaceC4997k[4];
        Method method3 = null;
        try {
            c4998l = new C4998l(Class.forName(C5207g.m11116k(".OpenSSLSocketImpl", "com.android.org.conscrypt")), Class.forName(C5207g.m11116k(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt")), Class.forName(C5207g.m11116k(".SSLParametersImpl", "com.android.org.conscrypt")));
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (((InterfaceC4997k) next).isSupported()) {
                        arrayList.add(next);
                    }
                }
            }
        } catch (Exception e10) {
            C1640h.f9199a.getClass();
            C1640h.m5333i(5, "unable to load android socket classes", e10);
            c4998l = null;
        }
        interfaceC4997kArr[0] = c4998l;
        interfaceC4997kArr[1] = new C4996j(C4992f.f32572f);
        interfaceC4997kArr[2] = new C4996j(C4995i.f32582a);
        interfaceC4997kArr[3] = new C4996j(C4993g.f32578a);
        ArrayList arrayListM13378j0 = C6744b.m13378j0(interfaceC4997kArr);
        arrayList = new ArrayList();
        it = arrayListM13378j0.iterator();
        this.f9179c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f9180d = new C4994h(method3, method2, method);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: b */
    public final AbstractC5449c mo5317b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AbstractC5449c c4988b = x509TrustManagerExtensions != null ? new C4988b(x509TrustManager, x509TrustManagerExtensions) : null;
        if (c4988b == null) {
            c4988b = new C5447a(mo5321c(x509TrustManager));
        }
        return c4988b;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: c */
    public final InterfaceC5451e mo5321c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo5321c(x509TrustManager);
        }
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object next;
        C5207g.m11111f(list, "protocols");
        Iterator it = this.f9179c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4997k) next).mo10690a(sSLSocket));
        InterfaceC4997k interfaceC4997k = (InterfaceC4997k) next;
        if (interfaceC4997k == null) {
            return;
        }
        interfaceC4997k.mo10692c(sSLSocket, str, list);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: e */
    public final void mo5322e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        C5207g.m11111f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f9179c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4997k) next).mo10690a(sSLSocket));
        InterfaceC4997k interfaceC4997k = (InterfaceC4997k) next;
        if (interfaceC4997k == null) {
            return null;
        }
        return interfaceC4997k.mo10691b(sSLSocket);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: g */
    public final Object mo5323g() {
        C4994h c4994h = this.f9180d;
        c4994h.getClass();
        Object obj = null;
        Method method = c4994h.f32579a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = c4994h.f32580b;
                C5207g.m11108c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                obj = objInvoke;
            } catch (Exception unused) {
            }
        }
        return obj;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: h */
    public final boolean mo5320h(String str) {
        C5207g.m11111f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: k */
    public final void mo5324k(Object obj, String str) {
        C5207g.m11111f(str, "message");
        C4994h c4994h = this.f9180d;
        c4994h.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = c4994h.f32581c;
                C5207g.m11108c(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            C1640h.m5334j(this, str, 5, 4);
        }
    }
}
