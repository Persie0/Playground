package okhttp3.internal.connection;

import android.support.v4.media.C0141b;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.C6752c;
import kotlin.text.C7075a;
import okhttp3.C8073b;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p034bp.C1640h;
import p103ep.AbstractC5449c;
import p103ep.C5450d;
import p124fp.C5617n;
import p124fp.C5621r;
import p124fp.C5622s;
import p290o6.C7967l0;
import p349qo.C8656b;
import p442vo.C9766b;
import p442vo.C9768d;
import p467wo.C9987b;
import p467wo.C9990e;
import p467wo.C9991f;
import p493xo.C10266f;
import p493xo.InterfaceC10264d;
import p518yo.C10421b;
import p542zo.C10561c;
import p542zo.C10562d;
import p542zo.C10572n;
import p542zo.C10574p;
import p542zo.C10575q;
import p542zo.C10578t;
import so.AbstractC9093k;
import so.C9082a;
import so.C9083a0;
import so.C9088f;
import so.C9089g;
import so.C9095m;
import so.C9096n;
import so.C9100r;
import so.C9101s;
import so.C9106x;
import tl.C9325m;
import to.C9347b;

/* JADX INFO: renamed from: okhttp3.internal.connection.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8077a extends C10562d.b {

    /* JADX INFO: renamed from: b */
    public final C9083a0 f43868b;

    /* JADX INFO: renamed from: c */
    public Socket f43869c;

    /* JADX INFO: renamed from: d */
    public Socket f43870d;

    /* JADX INFO: renamed from: e */
    public Handshake f43871e;

    /* JADX INFO: renamed from: f */
    public Protocol f43872f;

    /* JADX INFO: renamed from: g */
    public C10562d f43873g;

    /* JADX INFO: renamed from: h */
    public C5622s f43874h;

    /* JADX INFO: renamed from: i */
    public C5621r f43875i;

    /* JADX INFO: renamed from: j */
    public boolean f43876j;

    /* JADX INFO: renamed from: k */
    public boolean f43877k;

    /* JADX INFO: renamed from: l */
    public int f43878l;

    /* JADX INFO: renamed from: m */
    public int f43879m;

    /* JADX INFO: renamed from: n */
    public int f43880n;

    /* JADX INFO: renamed from: o */
    public int f43881o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f43882p;

    /* JADX INFO: renamed from: q */
    public long f43883q;

    /* JADX INFO: renamed from: okhttp3.internal.connection.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43884a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f43884a = iArr;
        }
    }

    public C8077a(C9991f c9991f, C9083a0 c9083a0) {
        C5207g.m11111f(c9991f, "connectionPool");
        C5207g.m11111f(c9083a0, "route");
        this.f43868b = c9083a0;
        this.f43881o = 1;
        this.f43882p = new ArrayList();
        this.f43883q = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static void m15969d(C9100r c9100r, C9083a0 c9083a0, IOException iOException) {
        C5207g.m11111f(c9100r, "client");
        C5207g.m11111f(c9083a0, "failedRoute");
        C5207g.m11111f(iOException, "failure");
        if (c9083a0.f47382b.type() != Proxy.Type.DIRECT) {
            C9082a c9082a = c9083a0.f47381a;
            c9082a.f47377h.connectFailed(c9082a.f47378i.m17327h(), c9083a0.f47382b.address(), iOException);
        }
        C7967l0 c7967l0 = c9100r.f47507U;
        synchronized (c7967l0) {
            try {
                ((Set) c7967l0.f43382a).add(c9083a0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p542zo.C10562d.b
    /* JADX INFO: renamed from: a */
    public final synchronized void mo15970a(C10562d c10562d, C10578t c10578t) {
        C5207g.m11111f(c10562d, "connection");
        C5207g.m11111f(c10578t, "settings");
        this.f43881o = (c10578t.f52792a & 16) != 0 ? c10578t.f52793b[4] : Integer.MAX_VALUE;
    }

    @Override // p542zo.C10562d.b
    /* JADX INFO: renamed from: b */
    public final void mo15971b(C10574p c10574p) throws IOException {
        C5207g.m11111f(c10574p, "stream");
        c10574p.m19566c(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m15972c(int i10, int i11, int i12, boolean z10, C9990e c9990e, AbstractC9093k abstractC9093k) throws Throwable {
        C5207g.m11111f(c9990e, "call");
        C5207g.m11111f(abstractC9093k, "eventListener");
        if (!(this.f43872f == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<C9089g> list = this.f43868b.f47381a.f47380k;
        C9987b c9987b = new C9987b(list);
        C9082a c9082a = this.f43868b.f47381a;
        if (c9082a.f47372c == null) {
            if (!list.contains(C9089g.f47421f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f43868b.f47381a.f47378i.f47458d;
            C1640h c1640h = C1640h.f9199a;
            if (!C1640h.f9199a.mo5320h(str)) {
                throw new RouteException(new UnknownServiceException(C0141b.m611g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c9082a.f47379j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                C9083a0 c9083a0 = this.f43868b;
                if (c9083a0.f47381a.f47372c != null && c9083a0.f47382b.type() == Proxy.Type.HTTP) {
                    m15974f(i10, i11, i12, c9990e, abstractC9093k);
                    if (this.f43869c == null) {
                        break;
                    }
                } else {
                    try {
                        m15973e(i10, i11, c9990e, abstractC9093k);
                    } catch (IOException e10) {
                        e = e10;
                        Socket socket = this.f43870d;
                        if (socket != null) {
                            C9347b.m17698e(socket);
                        }
                        Socket socket2 = this.f43869c;
                        if (socket2 != null) {
                            C9347b.m17698e(socket2);
                        }
                        this.f43870d = null;
                        this.f43869c = null;
                        this.f43874h = null;
                        this.f43875i = null;
                        this.f43871e = null;
                        this.f43872f = null;
                        this.f43873g = null;
                        this.f43881o = 1;
                        C9083a0 c9083a1 = this.f43868b;
                        InetSocketAddress inetSocketAddress = c9083a1.f47383c;
                        Proxy proxy = c9083a1.f47382b;
                        C5207g.m11111f(inetSocketAddress, "inetSocketAddress");
                        C5207g.m11111f(proxy, "proxy");
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            C8656b.m16899g(routeException.f43866a, e);
                            routeException.f43867b = e;
                        }
                        if (!z10) {
                            throw routeException;
                        }
                        c9987b.f50739d = true;
                        if (!((!c9987b.f50738c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true)) {
                            throw routeException;
                        }
                    }
                }
                m15975g(c9987b, c9990e, abstractC9093k);
                C9083a0 c9083a2 = this.f43868b;
                InetSocketAddress inetSocketAddress2 = c9083a2.f47383c;
                Proxy proxy2 = c9083a2.f47382b;
                AbstractC9093k.a aVar = AbstractC9093k.f47445a;
                C5207g.m11111f(inetSocketAddress2, "inetSocketAddress");
                C5207g.m11111f(proxy2, "proxy");
                break;
            } catch (IOException e11) {
                e = e11;
            }
        }
        C9083a0 c9083a3 = this.f43868b;
        if ((c9083a3.f47381a.f47372c != null && c9083a3.f47382b.type() == Proxy.Type.HTTP) && this.f43869c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f43883q = System.nanoTime();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m15973e(int i10, int i11, C9990e c9990e, AbstractC9093k abstractC9093k) throws IOException {
        Socket socketCreateSocket;
        C9083a0 c9083a0 = this.f43868b;
        Proxy proxy = c9083a0.f47382b;
        C9082a c9082a = c9083a0.f47381a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : a.f43884a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c9082a.f47371b.createSocket();
            C5207g.m11108c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f43869c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f43868b.f47383c;
        abstractC9093k.getClass();
        C5207g.m11111f(c9990e, "call");
        C5207g.m11111f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            C1640h c1640h = C1640h.f9199a;
            C1640h.f9199a.mo5322e(socketCreateSocket, this.f43868b.f47383c, i10);
            try {
                this.f43874h = C5617n.m11991c(C5617n.m11995g(socketCreateSocket));
                this.f43875i = C5617n.m11990b(C5617n.m11994f(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (C5207g.m11106a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(C5207g.m11116k(this.f43868b.f47383c, "Failed to connect to "));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15974f(int i10, int i11, int i12, C9990e c9990e, AbstractC9093k abstractC9093k) throws IOException {
        C9101s.a aVar = new C9101s.a();
        C9083a0 c9083a0 = this.f43868b;
        C9096n c9096n = c9083a0.f47381a.f47378i;
        C5207g.m11111f(c9096n, "url");
        aVar.f47548a = c9096n;
        aVar.m17346d("CONNECT", null);
        C9082a c9082a = c9083a0.f47381a;
        aVar.m17345c("Host", C9347b.m17716w(c9082a.f47378i, true));
        aVar.m17345c("Proxy-Connection", "Keep-Alive");
        aVar.m17345c("User-Agent", "okhttp/4.11.0");
        C9101s c9101sM17344b = aVar.m17344b();
        C9106x.a aVar2 = new C9106x.a();
        aVar2.f47575a = c9101sM17344b;
        Protocol protocol = Protocol.HTTP_1_1;
        C5207g.m11111f(protocol, "protocol");
        aVar2.f47576b = protocol;
        aVar2.f47577c = 407;
        aVar2.f47578d = "Preemptive Authenticate";
        aVar2.f47581g = C9347b.f48084c;
        aVar2.f47585k = -1L;
        aVar2.f47586l = -1L;
        C9095m.a aVar3 = aVar2.f47580f;
        aVar3.getClass();
        C9095m.b.m17317a("Proxy-Authenticate");
        C9095m.b.m17318b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.m17316f("Proxy-Authenticate");
        aVar3.m17313c("Proxy-Authenticate", "OkHttp-Preemptive");
        c9082a.f47375f.mo11091o0(c9083a0, aVar2.m17352a());
        m15973e(i10, i11, c9990e, abstractC9093k);
        String str = "CONNECT " + C9347b.m17716w(c9101sM17344b.f47542a, true) + " HTTP/1.1";
        C5622s c5622s = this.f43874h;
        C5207g.m11108c(c5622s);
        C5621r c5621r = this.f43875i;
        C5207g.m11108c(c5621r);
        C10421b c10421b = new C10421b(null, this, c5622s, c5621r);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5622s.mo11923g().mo11986g(i11, timeUnit);
        c5621r.mo11921g().mo11986g(i12, timeUnit);
        c10421b.m19399k(c9101sM17344b.f47544c, str);
        c10421b.mo19224b();
        C9106x.a aVarMo19227e = c10421b.mo19227e(false);
        C5207g.m11108c(aVarMo19227e);
        aVarMo19227e.f47575a = c9101sM17344b;
        C9106x c9106xM17352a = aVarMo19227e.m17352a();
        long jM17704k = C9347b.m17704k(c9106xM17352a);
        if (jM17704k != -1) {
            C10421b.d dVarM19398j = c10421b.m19398j(jM17704k);
            C9347b.m17714u(dVarM19398j, Integer.MAX_VALUE, timeUnit);
            dVarM19398j.close();
        }
        int i13 = c9106xM17352a.f47566d;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(C5207g.m11116k(Integer.valueOf(i13), "Unexpected response code for CONNECT: "));
            }
            c9082a.f47375f.mo11091o0(c9083a0, c9106xM17352a);
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c5622s.f34460b.mo11936L() || !c5621r.f34457b.mo11936L()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final void m15975g(C9987b c9987b, C9990e c9990e, AbstractC9093k abstractC9093k) throws Throwable {
        Protocol protocolM15939a;
        C9082a c9082a = this.f43868b.f47381a;
        if (c9082a.f47372c == null) {
            List<Protocol> list = c9082a.f47379j;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f43870d = this.f43869c;
                this.f43872f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f43870d = this.f43869c;
                this.f43872f = protocol;
                m15980l();
                return;
            }
        }
        abstractC9093k.getClass();
        C5207g.m11111f(c9990e, "call");
        final C9082a c9082a2 = this.f43868b.f47381a;
        SSLSocketFactory sSLSocketFactory = c9082a2.f47372c;
        SSLSocket sSLSocket = null;
        String strMo5319f = null;
        try {
            C5207g.m11108c(sSLSocketFactory);
            Socket socket = this.f43869c;
            C9096n c9096n = c9082a2.f47378i;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, c9096n.f47458d, c9096n.f47459e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C9089g c9089gM18559a = c9987b.m18559a(sSLSocket2);
                if (c9089gM18559a.f47423b) {
                    C1640h c1640h = C1640h.f9199a;
                    C1640h.f9199a.mo5318d(sSLSocket2, c9082a2.f47378i.f47458d, c9082a2.f47379j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                C5207g.m11110e(session, "sslSocketSession");
                final Handshake handshakeM15938a = Handshake.Companion.m15938a(session);
                HostnameVerifier hostnameVerifier = c9082a2.f47373d;
                C5207g.m11108c(hostnameVerifier);
                if (hostnameVerifier.verify(c9082a2.f47378i.f47458d, session)) {
                    final C8073b c8073b = c9082a2.f47374e;
                    C5207g.m11108c(c8073b);
                    this.f43871e = new Handshake(handshakeM15938a.f43775a, handshakeM15938a.f43776b, handshakeM15938a.f43777c, new InterfaceC2041a<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final List<? extends Certificate> mo807E() {
                            AbstractC5449c abstractC5449c = c8073b.f43810b;
                            C5207g.m11108c(abstractC5449c);
                            return abstractC5449c.mo10693a(handshakeM15938a.m15937a(), c9082a2.f47378i.f47458d);
                        }
                    });
                    c8073b.m15950b(c9082a2.f47378i.f47458d, new InterfaceC2041a<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final List<? extends X509Certificate> mo807E() {
                            Handshake handshake = this.f43865b.f43871e;
                            C5207g.m11108c(handshake);
                            List<Certificate> listM15937a = handshake.m15937a();
                            ArrayList arrayList = new ArrayList(C9325m.m17681z(listM15937a, 10));
                            Iterator<T> it = listM15937a.iterator();
                            while (it.hasNext()) {
                                arrayList.add((X509Certificate) ((Certificate) it.next()));
                            }
                            return arrayList;
                        }
                    });
                    if (c9089gM18559a.f47423b) {
                        C1640h c1640h2 = C1640h.f9199a;
                        strMo5319f = C1640h.f9199a.mo5319f(sSLSocket2);
                    }
                    this.f43870d = sSLSocket2;
                    this.f43874h = C5617n.m11991c(C5617n.m11995g(sSLSocket2));
                    this.f43875i = C5617n.m11990b(C5617n.m11994f(sSLSocket2));
                    if (strMo5319f != null) {
                        Protocol.INSTANCE.getClass();
                        protocolM15939a = Protocol.Companion.m15939a(strMo5319f);
                    } else {
                        protocolM15939a = Protocol.HTTP_1_1;
                    }
                    this.f43872f = protocolM15939a;
                    C1640h c1640h3 = C1640h.f9199a;
                    C1640h.f9199a.mo5332a(sSLSocket2);
                    if (this.f43872f == Protocol.HTTP_2) {
                        m15980l();
                    }
                    return;
                }
                List<Certificate> listM15937a = handshakeM15938a.m15937a();
                if (!(!listM15937a.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + c9082a2.f47378i.f47458d + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listM15937a.get(0);
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(c9082a2.f47378i.f47458d);
                sb2.append(" not verified:\n              |    certificate: ");
                C8073b c8073b2 = C8073b.f43808c;
                C5207g.m11111f(x509Certificate, "certificate");
                ByteString byteString = ByteString.f43897d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                C5207g.m11110e(encoded, "publicKey.encoded");
                sb2.append(C5207g.m11116k(ByteString.C8082a.m16002d(encoded).mo15991l("SHA-256").mo15990a(), "sha256/"));
                sb2.append("\n              |    DN: ");
                sb2.append((Object) x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(C6752c.m13438f0(C5450d.m11669a(x509Certificate, 2), C5450d.m11669a(x509Certificate, 7)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(C7075a.m14275J2(sb2.toString()));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C1640h c1640h4 = C1640h.f9199a;
                    C1640h.f9199a.mo5332a(sSLSocket);
                }
                if (sSLSocket != null) {
                    C9347b.m17698e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15976h(C9082a c9082a, List<C9083a0> list) {
        boolean z10;
        boolean z11;
        Handshake handshake;
        C5207g.m11111f(c9082a, "address");
        byte[] bArr = C9347b.f48082a;
        if (this.f43882p.size() < this.f43881o && !this.f43876j) {
            C9083a0 c9083a0 = this.f43868b;
            if (!c9083a0.f47381a.m17284a(c9082a)) {
                return false;
            }
            C9096n c9096n = c9082a.f47378i;
            String str = c9096n.f47458d;
            C9082a c9082a2 = c9083a0.f47381a;
            if (C5207g.m11106a(str, c9082a2.f47378i.f47458d)) {
                return true;
            }
            if (this.f43873g != null && list != null) {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        C9083a0 c9083a1 = (C9083a0) it.next();
                        if (c9083a1.f47382b.type() == Proxy.Type.DIRECT && c9083a0.f47382b.type() == Proxy.Type.DIRECT && C5207g.m11106a(c9083a0.f47383c, c9083a1.f47383c)) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    if (c9082a.f47373d != C5450d.f34001a) {
                        return false;
                    }
                    byte[] bArr2 = C9347b.f48082a;
                    C9096n c9096n2 = c9082a2.f47378i;
                    int i10 = c9096n2.f47459e;
                    String str2 = c9096n.f47458d;
                    if (c9096n.f47459e == i10) {
                        if (!C5207g.m11106a(str2, c9096n2.f47458d)) {
                            if (!this.f43877k && (handshake = this.f43871e) != null) {
                                List<Certificate> listM15937a = handshake.m15937a();
                                if ((listM15937a.isEmpty() ^ true) && C5450d.m11671c(str2, (X509Certificate) listM15937a.get(0))) {
                                }
                            }
                            z11 = false;
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                    try {
                        C8073b c8073b = c9082a.f47374e;
                        C5207g.m11108c(c8073b);
                        Handshake handshake2 = this.f43871e;
                        C5207g.m11108c(handshake2);
                        c8073b.m15949a(handshake2.m15937a(), str2);
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final boolean m15977i(boolean z10) {
        long j10;
        byte[] bArr = C9347b.f48082a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f43869c;
        C5207g.m11108c(socket);
        Socket socket2 = this.f43870d;
        C5207g.m11108c(socket2);
        C5622s c5622s = this.f43874h;
        C5207g.m11108c(c5622s);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C10562d c10562d = this.f43873g;
        if (c10562d != null) {
            synchronized (c10562d) {
                try {
                    if (c10562d.f52684g) {
                        return false;
                    }
                    return c10562d.f52666K >= c10562d.f52665J || jNanoTime < c10562d.f52667L;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (this) {
            try {
                j10 = jNanoTime - this.f43883q;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z11 = !c5622s.mo11936L();
                socket2.setSoTimeout(soTimeout);
                return z11;
            } catch (Throwable th4) {
                socket2.setSoTimeout(soTimeout);
                throw th4;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC10264d m15978j(C9100r c9100r, C10266f c10266f) throws SocketException {
        Socket socket = this.f43870d;
        C5207g.m11108c(socket);
        C5622s c5622s = this.f43874h;
        C5207g.m11108c(c5622s);
        C5621r c5621r = this.f43875i;
        C5207g.m11108c(c5621r);
        C10562d c10562d = this.f43873g;
        if (c10562d != null) {
            return new C10572n(c9100r, this, c10266f, c10562d);
        }
        int i10 = c10266f.f51703g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5622s.mo11923g().mo11986g(i10, timeUnit);
        c5621r.mo11921g().mo11986g(c10266f.f51704h, timeUnit);
        return new C10421b(c9100r, this, c5622s, c5621r);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final synchronized void m15979k() {
        this.f43876j = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final void m15980l() throws IOException {
        String strM11116k;
        int i10;
        Socket socket = this.f43870d;
        C5207g.m11108c(socket);
        C5622s c5622s = this.f43874h;
        C5207g.m11108c(c5622s);
        C5621r c5621r = this.f43875i;
        C5207g.m11108c(c5621r);
        socket.setSoTimeout(0);
        C9768d c9768d = C9768d.f49841i;
        C10562d.a aVar = new C10562d.a(c9768d);
        String str = this.f43868b.f47381a.f47378i.f47458d;
        C5207g.m11111f(str, "peerName");
        aVar.f52692c = socket;
        if (aVar.f52690a) {
            strM11116k = C9347b.f48088g + ' ' + str;
        } else {
            strM11116k = C5207g.m11116k(str, "MockWebServer ");
        }
        C5207g.m11111f(strM11116k, "<set-?>");
        aVar.f52693d = strM11116k;
        aVar.f52694e = c5622s;
        aVar.f52695f = c5621r;
        aVar.f52696g = this;
        aVar.f52698i = 0;
        C10562d c10562d = new C10562d(aVar);
        this.f43873g = c10562d;
        C10578t c10578t = C10562d.f52662W;
        this.f43881o = (c10578t.f52792a & 16) != 0 ? c10578t.f52793b[4] : Integer.MAX_VALUE;
        C10575q c10575q = c10562d.f52675T;
        synchronized (c10575q) {
            try {
                if (c10575q.f52783e) {
                    throw new IOException("closed");
                }
                if (c10575q.f52780b) {
                    Logger logger = C10575q.f52778g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C9347b.m17702i(C5207g.m11116k(C10561c.f52658b.mo15993s(), ">> CONNECTION "), new Object[0]));
                    }
                    c10575q.f52779a.mo11950Z0(C10561c.f52658b);
                    c10575q.f52779a.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C10575q c10575q2 = c10562d.f52675T;
        C10578t c10578t2 = c10562d.f52668M;
        synchronized (c10575q2) {
            try {
                C5207g.m11111f(c10578t2, "settings");
                if (c10575q2.f52783e) {
                    throw new IOException("closed");
                }
                c10575q2.m19581l(0, Integer.bitCount(c10578t2.f52792a) * 6, 4, 0);
                int i11 = 0;
                while (i11 < 10) {
                    int i12 = i11 + 1;
                    boolean z10 = true;
                    if (((1 << i11) & c10578t2.f52792a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i11 != 4) {
                            i10 = i11 != 7 ? i11 : 4;
                        } else {
                            i10 = 3;
                        }
                        c10575q2.f52779a.mo11970v(i10);
                        c10575q2.f52779a.mo11927D(c10578t2.f52793b[i11]);
                    }
                    i11 = i12;
                }
                c10575q2.f52779a.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int iM19586a = c10562d.f52668M.m19586a();
        if (iM19586a != 65535) {
            c10562d.f52675T.m19577C(0, iM19586a - 65535);
        }
        c9768d.m18266f().m18258c(new C9766b(c10562d.f52681d, c10562d.f52676U), 0L);
    }

    public final String toString() {
        C9088f c9088f;
        StringBuilder sb2 = new StringBuilder("Connection{");
        C9083a0 c9083a0 = this.f43868b;
        sb2.append(c9083a0.f47381a.f47378i.f47458d);
        sb2.append(':');
        sb2.append(c9083a0.f47381a.f47378i.f47459e);
        sb2.append(", proxy=");
        sb2.append(c9083a0.f47382b);
        sb2.append(" hostAddress=");
        sb2.append(c9083a0.f47383c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f43871e;
        Object obj = "none";
        if (handshake != null && (c9088f = handshake.f43776b) != null) {
            obj = c9088f;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f43872f);
        sb2.append('}');
        return sb2.toString();
    }
}
