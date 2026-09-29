package p034bp;

import android.util.Log;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import p057cp.C4989c;
import p057cp.C4990d;
import p103ep.AbstractC5449c;
import p103ep.C5447a;
import p103ep.C5448b;
import p103ep.InterfaceC5451e;
import p124fp.C5608e;
import so.C9100r;
import tl.C9325m;

/* JADX INFO: renamed from: bp.h */
/* JADX INFO: loaded from: classes2.dex */
public class C1640h {

    /* JADX INFO: renamed from: a */
    public static volatile C1640h f9199a;

    /* JADX INFO: renamed from: b */
    public static final Logger f9200b;

    /* JADX INFO: renamed from: bp.h$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static ArrayList m5335a(List list) {
            C5207g.m11111f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m5336b(List list) {
            C5207g.m11111f(list, "protocols");
            C5608e c5608e = new C5608e();
            for (String str : m5335a(list)) {
                c5608e.m11954d1(str.length());
                c5608e.m11969t1(str);
            }
            return c5608e.mo11933I();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m5337c() {
            return C5207g.m11106a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4  */
    static {
        C1640h c1640h;
        String property;
        Level level;
        new a();
        C1640h c1637e = null;
        if (a.m5337c()) {
            Iterator<Map.Entry<String, String>> it = C4989c.f32569b.entrySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Map.Entry<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    Logger logger = Logger.getLogger(key);
                    if (C4989c.f32568a.add(logger)) {
                        logger.setUseParentHandlers(false);
                        if (Log.isLoggable(value, 3)) {
                            level = Level.FINE;
                        } else {
                            level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                        }
                        logger.setLevel(level);
                        logger.addHandler(C4990d.f32570a);
                    }
                }
            }
            c1640h = C1633a.f9176d ? new C1633a() : null;
            if (c1640h == null) {
                c1637e = C1634b.f9178e ? new C1634b() : null;
                C5207g.m11108c(c1637e);
                c1640h = c1637e;
            }
        } else if (C5207g.m11106a("Conscrypt", Security.getProviders()[0].getName())) {
            c1640h = C1636d.f9185d ? new C1636d() : null;
            if (c1640h == null) {
                if (!C5207g.m11106a("BC", Security.getProviders()[0].getName())) {
                    if (C1635c.f9183d) {
                        c1640h = new C1635c();
                    } else {
                        c1640h = null;
                    }
                    if (c1640h != null) {
                        if (C5207g.m11106a("OpenJSSE", Security.getProviders()[0].getName())) {
                            if (C1639g.f9197d) {
                                c1640h = new C1639g();
                            } else {
                                c1640h = null;
                            }
                            if (c1640h != null) {
                                if (C1638f.f9196c) {
                                    c1640h = new C1638f();
                                } else {
                                    c1640h = null;
                                }
                                if (c1640h == null) {
                                    property = System.getProperty("java.specification.version", "unknown");
                                    C5207g.m11110e(property, "jvmVersion");
                                    if (Integer.parseInt(property) >= 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Class<?> cls3 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Class<?> cls4 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method method2 = cls.getMethod("get", SSLSocket.class);
                                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                                        C5207g.m11110e(method, "putMethod");
                                        C5207g.m11110e(method2, "getMethod");
                                        C5207g.m11110e(method3, "removeMethod");
                                        C5207g.m11110e(cls3, "clientProviderClass");
                                        C5207g.m11110e(cls4, "serverProviderClass");
                                        c1637e = new C1637e(method, method2, method3, cls3, cls4);
                                    }
                                    if (c1637e != null) {
                                        c1640h = c1637e;
                                    } else {
                                        c1640h = new C1640h();
                                    }
                                }
                            }
                        } else {
                            if (C1638f.f9196c) {
                                c1640h = new C1638f();
                            } else {
                                c1640h = null;
                            }
                            if (c1640h == null) {
                                property = System.getProperty("java.specification.version", "unknown");
                                C5207g.m11110e(property, "jvmVersion");
                                if (Integer.parseInt(property) >= 9) {
                                    Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls6 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                    Class<?> cls7 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                    Class<?> cls8 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                    Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                                    Method method5 = cls5.getMethod("get", SSLSocket.class);
                                    Method method6 = cls5.getMethod("remove", SSLSocket.class);
                                    C5207g.m11110e(method4, "putMethod");
                                    C5207g.m11110e(method5, "getMethod");
                                    C5207g.m11110e(method6, "removeMethod");
                                    C5207g.m11110e(cls7, "clientProviderClass");
                                    C5207g.m11110e(cls8, "serverProviderClass");
                                    c1637e = new C1637e(method4, method5, method6, cls7, cls8);
                                }
                                if (c1637e != null) {
                                    c1640h = c1637e;
                                } else {
                                    c1640h = new C1640h();
                                }
                            }
                        }
                    }
                } else if (C5207g.m11106a("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (C1638f.f9196c) {
                        c1640h = new C1638f();
                    } else {
                        c1640h = null;
                    }
                    if (c1640h == null) {
                        property = System.getProperty("java.specification.version", "unknown");
                        C5207g.m11110e(property, "jvmVersion");
                        if (Integer.parseInt(property) >= 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls11 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls12 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method method8 = cls9.getMethod("get", SSLSocket.class);
                            Method method9 = cls9.getMethod("remove", SSLSocket.class);
                            C5207g.m11110e(method7, "putMethod");
                            C5207g.m11110e(method8, "getMethod");
                            C5207g.m11110e(method9, "removeMethod");
                            C5207g.m11110e(cls11, "clientProviderClass");
                            C5207g.m11110e(cls12, "serverProviderClass");
                            c1637e = new C1637e(method7, method8, method9, cls11, cls12);
                        }
                        if (c1637e != null) {
                            c1640h = c1637e;
                        } else {
                            c1640h = new C1640h();
                        }
                    }
                } else {
                    if (C1639g.f9197d) {
                        c1640h = new C1639g();
                    } else {
                        c1640h = null;
                    }
                    if (c1640h != null) {
                        if (C1638f.f9196c) {
                            c1640h = new C1638f();
                        } else {
                            c1640h = null;
                        }
                        if (c1640h == null) {
                            property = System.getProperty("java.specification.version", "unknown");
                            C5207g.m11110e(property, "jvmVersion");
                            if (Integer.parseInt(property) >= 9) {
                                Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls14 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls15 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls16 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                                Method method11 = cls13.getMethod("get", SSLSocket.class);
                                Method method12 = cls13.getMethod("remove", SSLSocket.class);
                                C5207g.m11110e(method10, "putMethod");
                                C5207g.m11110e(method11, "getMethod");
                                C5207g.m11110e(method12, "removeMethod");
                                C5207g.m11110e(cls15, "clientProviderClass");
                                C5207g.m11110e(cls16, "serverProviderClass");
                                c1637e = new C1637e(method10, method11, method12, cls15, cls16);
                            }
                            if (c1637e != null) {
                                c1640h = c1637e;
                            } else {
                                c1640h = new C1640h();
                            }
                        }
                    }
                }
            }
        } else if (!C5207g.m11106a("BC", Security.getProviders()[0].getName())) {
            if (C1635c.f9183d) {
                c1640h = new C1635c();
            } else {
                c1640h = null;
            }
            if (c1640h != null) {
                if (C5207g.m11106a("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (C1638f.f9196c) {
                        c1640h = new C1638f();
                    } else {
                        c1640h = null;
                    }
                    if (c1640h == null) {
                        property = System.getProperty("java.specification.version", "unknown");
                        C5207g.m11110e(property, "jvmVersion");
                        if (Integer.parseInt(property) >= 9) {
                            Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls18 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls19 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls110 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                            Method method14 = cls17.getMethod("get", SSLSocket.class);
                            Method method15 = cls17.getMethod("remove", SSLSocket.class);
                            C5207g.m11110e(method13, "putMethod");
                            C5207g.m11110e(method14, "getMethod");
                            C5207g.m11110e(method15, "removeMethod");
                            C5207g.m11110e(cls19, "clientProviderClass");
                            C5207g.m11110e(cls110, "serverProviderClass");
                            c1637e = new C1637e(method13, method14, method15, cls19, cls110);
                        }
                        if (c1637e != null) {
                            c1640h = c1637e;
                        } else {
                            c1640h = new C1640h();
                        }
                    }
                } else {
                    if (C1639g.f9197d) {
                        c1640h = new C1639g();
                    } else {
                        c1640h = null;
                    }
                    if (c1640h != null) {
                        if (C1638f.f9196c) {
                            c1640h = new C1638f();
                        } else {
                            c1640h = null;
                        }
                        if (c1640h == null) {
                            property = System.getProperty("java.specification.version", "unknown");
                            C5207g.m11110e(property, "jvmVersion");
                            if (Integer.parseInt(property) >= 9) {
                                Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls112 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls113 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Class<?> cls114 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                                Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                                Method method17 = cls111.getMethod("get", SSLSocket.class);
                                Method method18 = cls111.getMethod("remove", SSLSocket.class);
                                C5207g.m11110e(method16, "putMethod");
                                C5207g.m11110e(method17, "getMethod");
                                C5207g.m11110e(method18, "removeMethod");
                                C5207g.m11110e(cls113, "clientProviderClass");
                                C5207g.m11110e(cls114, "serverProviderClass");
                                c1637e = new C1637e(method16, method17, method18, cls113, cls114);
                            }
                            if (c1637e != null) {
                                c1640h = c1637e;
                            } else {
                                c1640h = new C1640h();
                            }
                        }
                    }
                }
            }
        } else if (C5207g.m11106a("OpenJSSE", Security.getProviders()[0].getName())) {
            if (C1638f.f9196c) {
                c1640h = new C1638f();
            } else {
                c1640h = null;
            }
            if (c1640h == null) {
                property = System.getProperty("java.specification.version", "unknown");
                try {
                    C5207g.m11110e(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        try {
                            Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls116 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls117 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Class<?> cls118 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                            Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                            Method method110 = cls115.getMethod("get", SSLSocket.class);
                            Method method111 = cls115.getMethod("remove", SSLSocket.class);
                            C5207g.m11110e(method19, "putMethod");
                            C5207g.m11110e(method110, "getMethod");
                            C5207g.m11110e(method111, "removeMethod");
                            C5207g.m11110e(cls117, "clientProviderClass");
                            C5207g.m11110e(cls118, "serverProviderClass");
                            c1637e = new C1637e(method19, method110, method111, cls117, cls118);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (c1637e != null) {
                    c1640h = c1637e;
                } else {
                    c1640h = new C1640h();
                }
            }
        } else {
            if (C1639g.f9197d) {
                c1640h = new C1639g();
            } else {
                c1640h = null;
            }
            if (c1640h != null) {
                if (C1638f.f9196c) {
                    c1640h = new C1638f();
                } else {
                    c1640h = null;
                }
                if (c1640h == null) {
                    property = System.getProperty("java.specification.version", "unknown");
                    C5207g.m11110e(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls1110 = Class.forName(C5207g.m11116k("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls1111 = Class.forName(C5207g.m11116k("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls1112 = Class.forName(C5207g.m11116k("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                        Method method113 = cls119.getMethod("get", SSLSocket.class);
                        Method method114 = cls119.getMethod("remove", SSLSocket.class);
                        C5207g.m11110e(method112, "putMethod");
                        C5207g.m11110e(method113, "getMethod");
                        C5207g.m11110e(method114, "removeMethod");
                        C5207g.m11110e(cls1111, "clientProviderClass");
                        C5207g.m11110e(cls1112, "serverProviderClass");
                        c1637e = new C1637e(method112, method113, method114, cls1111, cls1112);
                    }
                    if (c1637e != null) {
                        c1640h = c1637e;
                    } else {
                        c1640h = new C1640h();
                    }
                }
            }
        }
        f9199a = c1640h;
        f9200b = Logger.getLogger(C9100r.class.getName());
    }

    /* JADX INFO: renamed from: i */
    public static void m5333i(int i10, String str, Throwable th2) {
        C5207g.m11111f(str, "message");
        f9200b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m5334j(C1640h c1640h, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        c1640h.getClass();
        m5333i(i10, str, null);
    }

    /* JADX INFO: renamed from: a */
    public void mo5332a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: b */
    public AbstractC5449c mo5317b(X509TrustManager x509TrustManager) {
        return new C5447a(mo5321c(x509TrustManager));
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC5451e mo5321c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C5207g.m11110e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C5448b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: d */
    public void mo5318d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C5207g.m11111f(list, "protocols");
    }

    /* JADX INFO: renamed from: e */
    public void mo5322e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        C5207g.m11111f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    /* JADX INFO: renamed from: f */
    public String mo5319f(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Object mo5323g() {
        if (f9200b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo5320h(String str) {
        C5207g.m11111f(str, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void mo5324k(Object obj, String str) {
        C5207g.m11111f(str, "message");
        if (obj == null) {
            str = C5207g.m11116k(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        m5333i(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public SSLContext mo5326l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C5207g.m11110e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX INFO: renamed from: m */
    public SSLSocketFactory mo5329m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo5326l = mo5326l();
            sSLContextMo5326l.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo5326l.getSocketFactory();
            C5207g.m11110e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(C5207g.m11116k(e10, "No System TLS: "), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public X509TrustManager mo5327n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C5207g.m11108c(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            C5207g.m11110e(string, "toString(this)");
            throw new IllegalStateException(C5207g.m11116k(string, "Unexpected default trust managers: ").toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
