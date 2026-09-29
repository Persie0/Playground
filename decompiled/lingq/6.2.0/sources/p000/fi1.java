package p000;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 implements lj8, qu2 {

    /* JADX INFO: renamed from: a */
    public final as9 f39116a;

    /* JADX INFO: renamed from: b */
    public final kl2 f39117b;

    /* JADX INFO: renamed from: c */
    public final int f39118c;

    /* JADX INFO: renamed from: d */
    public final int f39119d;

    /* JADX INFO: renamed from: e */
    public final int f39120e;

    /* JADX INFO: renamed from: f */
    public final int f39121f;

    /* JADX INFO: renamed from: g */
    public final boolean f39122g;

    /* JADX INFO: renamed from: h */
    public final i18 f39123h;

    /* JADX INFO: renamed from: i */
    public final p18 f39124i;

    /* JADX INFO: renamed from: j */
    public final ij8 f39125j;

    /* JADX INFO: renamed from: k */
    public final List f39126k;

    /* JADX INFO: renamed from: l */
    public final co7 f39127l;

    /* JADX INFO: renamed from: m */
    public final int f39128m;

    /* JADX INFO: renamed from: n */
    public final boolean f39129n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f39130o;

    /* JADX INFO: renamed from: p */
    public Socket f39131p;

    /* JADX INFO: renamed from: q */
    public Socket f39132q;

    /* JADX INFO: renamed from: r */
    public ar3 f39133r;

    /* JADX INFO: renamed from: s */
    public Protocol f39134s;

    /* JADX INFO: renamed from: t */
    public C3309ls f39135t;

    /* JADX INFO: renamed from: u */
    public j18 f39136u;

    public fi1(as9 as9Var, kl2 kl2Var, int i, int i2, int i3, int i4, boolean z, i18 i18Var, p18 p18Var, ij8 ij8Var, List list, co7 co7Var, int i5, boolean z2) {
        as9Var.getClass();
        kl2Var.getClass();
        ij8Var.getClass();
        this.f39116a = as9Var;
        this.f39117b = kl2Var;
        this.f39118c = i;
        this.f39119d = i2;
        this.f39120e = i3;
        this.f39121f = i4;
        this.f39122g = z;
        this.f39123h = i18Var;
        this.f39124i = p18Var;
        this.f39125j = ij8Var;
        this.f39126k = list;
        this.f39127l = co7Var;
        this.f39128m = i5;
        this.f39129n = z2;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: a */
    public final boolean mo11843a() {
        return this.f39134s != null;
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: b */
    public final lj8 mo11844b() {
        return new fi1(this.f39116a, this.f39117b, this.f39118c, this.f39119d, this.f39120e, this.f39121f, this.f39122g, this.f39123h, this.f39124i, this.f39125j, this.f39126k, this.f39127l, this.f39128m, this.f39129n);
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: c */
    public final j18 mo11845c() {
        or3 or3Var = this.f39123h.f43342a.f36110z;
        ij8 ij8Var = this.f39125j;
        synchronized (or3Var) {
            ij8Var.getClass();
            ((LinkedHashSet) or3Var.f54782a).remove(ij8Var);
        }
        j18 j18Var = this.f39136u;
        j18Var.getClass();
        this.f39125j.getClass();
        r98 r98VarM18856d = this.f39124i.m18856d(this, this.f39126k);
        if (r98VarM18856d != null) {
            return r98VarM18856d.f58947a;
        }
        synchronized (j18Var) {
            kl2 kl2Var = this.f39117b;
            kl2Var.getClass();
            TimeZone timeZone = kcb.f47051a;
            ((ConcurrentLinkedQueue) kl2Var.f47485e).add(j18Var);
            ((zr9) kl2Var.f47483c).m25753c((dh2) kl2Var.f47484d, 0L);
            this.f39123h.m13619b(j18Var);
        }
        return j18Var;
    }

    @Override // p000.lj8, p000.qu2
    public final void cancel() {
        this.f39130o = true;
        Socket socket = this.f39131p;
        if (socket != null) {
            kcb.m15112c(socket);
        }
    }

    @Override // p000.lj8
    /* JADX INFO: renamed from: d */
    public final kj8 mo11846d() {
        Socket socket;
        Socket socket2;
        kl2 kl2Var = this.f39117b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39123h.f43341M;
        ij8 ij8Var = this.f39125j;
        if (this.f39131p != null) {
            C3386nv.m17633t("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                ij8Var.f44194c.getClass();
                kl2Var.getClass();
                m11851i();
                z = true;
                kj8 kj8Var = new kj8(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return kj8Var;
            } catch (IOException e) {
                C3104i9 c3104i9 = ij8Var.f44192a;
                if (ij8Var.f44193b.type() != Proxy.Type.DIRECT) {
                    C3104i9 c3104i10 = ij8Var.f44192a;
                    c3104i10.f43719g.connectFailed(c3104i10.f43720h.m11383i(), ij8Var.f44193b.address(), e);
                }
                ij8Var.f44194c.getClass();
                kl2Var.getClass();
                kj8 kj8Var2 = new kj8(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.f39131p) != null) {
                    kcb.m15112c(socket2);
                }
                return kj8Var2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.f39131p) != null) {
                kcb.m15112c(socket);
            }
            throw th;
        }
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: e */
    public final void mo11847e() {
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: f */
    public final void mo11848f(i18 i18Var, IOException iOException) {
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    @Override // p000.lj8
    /* JADX INFO: renamed from: g */
    public final kj8 mo11849g() throws Throwable {
        fi1 fi1VarM11854l;
        Socket socket;
        fi1 fi1Var;
        kl2 kl2Var = this.f39117b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39123h.f43341M;
        Socket socket2 = this.f39131p;
        fi1 fi1Var2 = null;
        if (socket2 == null) {
            C3386nv.m17626m("TCP not connected");
            return null;
        }
        if (mo11843a()) {
            C3386nv.m17633t("already connected");
            return null;
        }
        ij8 ij8Var = this.f39125j;
        C3104i9 c3104i9 = ij8Var.f44192a;
        InetSocketAddress inetSocketAddress = ij8Var.f44194c;
        C3104i9 c3104i10 = ij8Var.f44192a;
        List list = c3104i9.f43722j;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.f39127l != null) {
                    kj8 kj8VarM11853k = m11853k();
                    if (kj8VarM11853k.f47400c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.f39132q;
                        if (socket3 != null) {
                            kcb.m15112c(socket3);
                        }
                        kcb.m15112c(socket2);
                        return kj8VarM11853k;
                    }
                }
                if (c3104i10.f43715c != null) {
                    C3309ls c3309ls = this.f39135t;
                    if (c3309ls == null) {
                        fa4.m11636J("socket");
                        throw null;
                    }
                    if (((e18) c3309ls.f50065c).f36575b.m492p()) {
                        C3309ls c3309ls2 = this.f39135t;
                        if (c3309ls2 == null) {
                            fa4.m11636J("socket");
                            throw null;
                        }
                        if (((d18) c3309ls2.f50066d).f34850b.m492p()) {
                            SSLSocketFactory sSLSocketFactory = c3104i10.f43715c;
                            ex3 ex3Var = c3104i10.f43720h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, ex3Var.f38027d, ex3Var.f38028e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            fi1 fi1VarM11855m = m11855m(list, sSLSocket);
                            ki1 ki1Var = (ki1) list.get(fi1VarM11855m.f39128m);
                            fi1VarM11854l = fi1VarM11855m.m11854l(list, sSLSocket);
                            try {
                                ki1Var.m15260a(sSLSocket, fi1VarM11855m.f39129n);
                                m11852j(sSLSocket, ki1Var);
                                fi1Var = fi1VarM11854l;
                            } catch (IOException e) {
                                e = e;
                                inetSocketAddress.getClass();
                                kl2Var.getClass();
                                if (this.f39122g && ivc.m14163b(e)) {
                                    fi1Var2 = fi1VarM11854l;
                                }
                                kj8 kj8Var = new kj8(this, fi1Var2, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    socket = this.f39132q;
                                    if (socket != null) {
                                        kcb.m15112c(socket);
                                    }
                                    kcb.m15112c(socket2);
                                }
                                return kj8Var;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f39132q = socket2;
                List list2 = c3104i10.f43721i;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.f39134s = protocol;
                fi1Var = null;
                try {
                    as9 as9Var = this.f39116a;
                    kl2 kl2Var2 = this.f39117b;
                    ij8 ij8Var2 = this.f39125j;
                    Socket socket4 = this.f39132q;
                    socket4.getClass();
                    ar3 ar3Var = this.f39133r;
                    Protocol protocol2 = this.f39134s;
                    protocol2.getClass();
                    C3309ls c3309ls3 = this.f39135t;
                    if (c3309ls3 == null) {
                        fa4.m11636J("socket");
                        throw null;
                    }
                    kl2Var.getClass();
                    j18 j18Var = new j18(as9Var, kl2Var2, ij8Var2, socket2, socket4, ar3Var, protocol2, c3309ls3);
                    this.f39136u = j18Var;
                    j18Var.m14270i();
                    inetSocketAddress.getClass();
                    try {
                        kj8 kj8Var2 = new kj8(this, (Throwable) null, 6);
                        copyOnWriteArrayList.remove(this);
                        return kj8Var2;
                    } catch (IOException e2) {
                        e = e2;
                        fi1VarM11854l = fi1Var;
                        z = true;
                        inetSocketAddress.getClass();
                        kl2Var.getClass();
                        if (this.f39122g) {
                            fi1Var2 = fi1VarM11854l;
                        }
                        kj8 kj8Var3 = new kj8(this, fi1Var2, e);
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            socket = this.f39132q;
                            if (socket != null) {
                                kcb.m15112c(socket);
                            }
                            kcb.m15112c(socket2);
                        }
                        return kj8Var3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            Socket socket5 = this.f39132q;
                            if (socket5 != null) {
                                kcb.m15112c(socket5);
                            }
                            kcb.m15112c(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fi1VarM11854l = fi1Var;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            fi1VarM11854l = null;
        }
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: h */
    public final ij8 mo11850h() {
        return this.f39125j;
    }

    /* JADX INFO: renamed from: i */
    public final void m11851i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.f39125j.f44193b.type();
        int i = type == null ? -1 : ei1.f37276a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.f39125j.f44192a.f43714b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.f39125j.f44193b);
        }
        this.f39131p = socketCreateSocket;
        if (this.f39130o) {
            v63.m23133k("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f39121f);
        try {
            C2927dg c2927dg = u87.f63590a;
            C2927dg c2927dg2 = u87.f63590a;
            InetSocketAddress inetSocketAddress = this.f39125j.f44194c;
            int i2 = this.f39120e;
            c2927dg2.getClass();
            inetSocketAddress.getClass();
            socketCreateSocket.connect(inetSocketAddress, i2);
            try {
                this.f39135t = new C3309ls(new ny8(socketCreateSocket));
            } catch (NullPointerException e) {
                if (fa4.m11650l(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f39125j.f44194c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11852j(SSLSocket sSLSocket, ki1 ki1Var) {
        Protocol protocolM18189a;
        Object next;
        Object next2;
        C3104i9 c3104i9 = this.f39125j.f44192a;
        try {
            String strMo208c = null;
            if (ki1Var.f47318b) {
                C2927dg c2927dg = u87.f63590a;
                C2927dg c2927dg2 = u87.f63590a;
                String str = c3104i9.f43720h.f38027d;
                List list = c3104i9.f43721i;
                c2927dg2.getClass();
                list.getClass();
                Iterator it = c2927dg2.f35578d.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!((jd9) next2).mo206a(sSLSocket));
                jd9 jd9Var = (jd9) next2;
                if (jd9Var != null) {
                    jd9Var.mo209d(sSLSocket, str, list);
                }
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            ar3 ar3VarM22054m = thb.m22054m(session);
            HostnameVerifier hostnameVerifier = c3104i9.f43716d;
            hostnameVerifier.getClass();
            boolean zVerify = hostnameVerifier.verify(c3104i9.f43720h.f38027d, session);
            int i = 2;
            if (!zVerify) {
                List listM3000a = ar3VarM22054m.m3000a();
                if (listM3000a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c3104i9.f43720h.f38027d + " not verified (no certificates)");
                }
                Object obj = listM3000a.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("\n            |Hostname ");
                sb.append(c3104i9.f43720h.f38027d);
                sb.append(" not verified:\n            |    certificate: ");
                xo0 xo0Var = xo0.f68421c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                ByteString byteString = ByteString.f54513d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                encoded.getClass();
                sb2.append(iy5.m14200p(encoded).mo18077c("SHA-256").mo18075a());
                sb.append(sb2.toString());
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(u91.m22603U0(yq6.m25283a(x509Certificate, 2), yq6.m25283a(x509Certificate, 7)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(wk9.m24030M(sb.toString()));
            }
            xo0 xo0Var2 = c3104i9.f43717e;
            xo0Var2.getClass();
            this.f39133r = new ar3(ar3VarM22054m.f7382a, ar3VarM22054m.f7383b, ar3VarM22054m.f7384c, new r60(xo0Var2, ar3VarM22054m, c3104i9, i));
            c3104i9.f43720h.f38027d.getClass();
            Iterator it2 = xo0Var2.f68422a.iterator();
            if (it2.hasNext()) {
                g9a.m12435l(it2.next());
                throw null;
            }
            if (ki1Var.f47318b) {
                C2927dg c2927dg3 = u87.f63590a;
                C2927dg c2927dg4 = u87.f63590a;
                c2927dg4.getClass();
                Iterator it3 = c2927dg4.f35578d.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((jd9) next).mo206a(sSLSocket));
                jd9 jd9Var2 = (jd9) next;
                if (jd9Var2 != null) {
                    strMo208c = jd9Var2.mo208c(sSLSocket);
                }
            }
            this.f39132q = sSLSocket;
            this.f39135t = new C3309ls(new ny8(sSLSocket));
            if (strMo208c != null) {
                Protocol.Companion.getClass();
                protocolM18189a = oo7.m18189a(strMo208c);
            } else {
                protocolM18189a = Protocol.HTTP_1_1;
            }
            this.f39134s = protocolM18189a;
            C2927dg c2927dg5 = u87.f63590a;
            u87.f63590a.getClass();
        } catch (Throwable th) {
            C2927dg c2927dg6 = u87.f63590a;
            u87.f63590a.getClass();
            kcb.m15112c(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final kj8 m11853k() throws IOException {
        co7 co7Var = this.f39127l;
        co7Var.getClass();
        ij8 ij8Var = this.f39125j;
        String str = "CONNECT " + kcb.m15118i(ij8Var.f44192a.f43720h, true) + " HTTP/1.1";
        C3309ls c3309ls = this.f39135t;
        if (c3309ls == null) {
            fa4.m11636J("socket");
            throw null;
        }
        fw3 fw3Var = new fw3(null, this, c3309ls);
        C3309ls c3309ls2 = this.f39135t;
        if (c3309ls2 == null) {
            fa4.m11636J("socket");
            throw null;
        }
        ((e18) c3309ls2.f50065c).f36574a.mo484i().mo3173g(this.f39118c);
        C3309ls c3309ls3 = this.f39135t;
        if (c3309ls3 == null) {
            fa4.m11636J("socket");
            throw null;
        }
        ((d18) c3309ls3.f50066d).f34849a.mo484i().mo3173g(this.f39119d);
        fw3Var.m12232m((qr3) co7Var.f10361d, str);
        fw3Var.mo12222b();
        h88 h88VarMo12225e = fw3Var.mo12225e(false);
        h88VarMo12225e.getClass();
        h88VarMo12225e.f41979a = co7Var;
        j88 j88VarM13143a = h88VarMo12225e.m13143a();
        int i = j88VarM13143a.f45204d;
        long jM15114e = kcb.m15114e(j88VarM13143a);
        if (jM15114e != -1) {
            cw3 cw3VarM12231l = fw3Var.m12231l((ex3) j88VarM13143a.f45201a.f10360c, jM15114e);
            kcb.m15116g(cw3VarM12231l, Integer.MAX_VALUE);
            cw3VarM12231l.close();
        }
        if (i == 200) {
            return new kj8(this, (Throwable) null, 6);
        }
        if (i != 407) {
            v63.m23133k(ux5.m22988k(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        ij8Var.f44192a.f43718f.getClass();
        v63.m23133k("Failed to authenticate with proxy");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final fi1 m11854l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.f39128m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ki1 ki1Var = (ki1) list.get(i2);
            ki1Var.getClass();
            if (ki1Var.f47317a && (((strArr = ki1Var.f47320d) == null || icb.m13771g(strArr, sSLSocket.getEnabledProtocols(), t76.f61938b)) && ((strArr2 = ki1Var.f47319c) == null || icb.m13771g(strArr2, sSLSocket.getEnabledCipherSuites(), c21.f9328c)))) {
                return new fi1(this.f39116a, this.f39117b, this.f39118c, this.f39119d, this.f39120e, this.f39121f, this.f39122g, this.f39123h, this.f39124i, this.f39125j, this.f39126k, this.f39127l, i2, i != -1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final fi1 m11855m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.f39128m != -1) {
            return this;
        }
        fi1 fi1VarM11854l = m11854l(list, sSLSocket);
        if (fi1VarM11854l != null) {
            return fi1VarM11854l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f39129n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
