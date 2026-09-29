package p493xo;

import dm.C5207g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.C8073b;
import okhttp3.internal.connection.C8077a;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p338qd.C8584v;
import p467wo.C9988c;
import p467wo.C9989d;
import p467wo.C9990e;
import p467wo.C9991f;
import p467wo.C9992g;
import sl.C9072e;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9082a;
import so.C9083a0;
import so.C9096n;
import so.C9100r;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;
import to.C9347b;

/* JADX INFO: renamed from: xo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10268h implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final C9100r f51709a;

    public C10268h(C9100r c9100r) {
        C5207g.m11111f(c9100r, "client");
        this.f51709a = c9100r;
    }

    /* JADX INFO: renamed from: d */
    public static int m19236d(C9106x c9106x, int i10) {
        String strM17348b = C9106x.m17348b(c9106x, "Retry-After");
        if (strM17348b == null) {
            return i10;
        }
        if (!new Regex("\\d+").m14271b(strM17348b)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM17348b);
        C5207g.m11110e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C8073b c8073b;
        C9101s c9101s = c10266f.f51701e;
        C9990e c9990e = c10266f.f51697a;
        boolean z10 = true;
        List listM13439g0 = EmptyList.f38032a;
        int i10 = 0;
        C9106x c9106x = null;
        C9101s c9101sM19237b = c9101s;
        boolean z11 = true;
        while (true) {
            c9990e.getClass();
            C5207g.m11111f(c9101sM19237b, "request");
            if (!(c9990e.f50785l == null ? z10 : false)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (c9990e) {
                if (!(c9990e.f50769I ^ z10)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(c9990e.f50768H ^ z10)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                C9072e c9072e = C9072e.f47360a;
            }
            if (z11) {
                C9991f c9991f = c9990e.f50777d;
                C9096n c9096n = c9101sM19237b.f47542a;
                boolean z12 = c9096n.f47464j;
                C9100r c9100r = c9990e.f50774a;
                if (z12) {
                    SSLSocketFactory sSLSocketFactory2 = c9100r.f47497K;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = c9100r.f47501O;
                    c8073b = c9100r.f47502P;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    c8073b = null;
                }
                c9990e.f50782i = new C9989d(c9991f, new C9082a(c9096n.f47458d, c9096n.f47459e, c9100r.f47519l, c9100r.f47496J, sSLSocketFactory, hostnameVerifier, c8073b, c9100r.f47495I, c9100r.f47500N, c9100r.f47499M, c9100r.f47494H), c9990e, c9990e.f50778e);
            }
            try {
                if (c9990e.f50771K) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        C9106x c9106xM19235c = c10266f.m19235c(c9101sM19237b);
                        if (c9106x != null) {
                            C9106x.a aVar = new C9106x.a(c9106xM19235c);
                            C9106x.a aVar2 = new C9106x.a(c9106x);
                            aVar2.f47581g = null;
                            C9106x c9106xM17352a = aVar2.m17352a();
                            if (!(c9106xM17352a.f47569g == null)) {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                            aVar.f47584j = c9106xM17352a;
                            c9106xM19235c = aVar.m17352a();
                        }
                        c9106x = c9106xM19235c;
                        C9988c c9988c = c9990e.f50785l;
                        c9101sM19237b = m19237b(c9106x, c9988c);
                        if (c9101sM19237b == null) {
                            if (c9988c != null && c9988c.f50744e) {
                                if (!(!c9990e.f50784k)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                c9990e.f50784k = true;
                                c9990e.f50779f.m11917i();
                            }
                            c9990e.m18573f(false);
                            return c9106x;
                        }
                        AbstractC9107y abstractC9107y = c9106x.f47569g;
                        if (abstractC9107y != null) {
                            C9347b.m17697d(abstractC9107y);
                        }
                        i10++;
                        if (i10 > 20) {
                            throw new ProtocolException(C5207g.m11116k(Integer.valueOf(i10), "Too many follow-up requests: "));
                        }
                        c9990e.m18573f(true);
                        listM13439g0 = listM13439g0;
                        z11 = true;
                        z10 = true;
                    } catch (RouteException e10) {
                        List list = listM13439g0;
                        if (!m19238c(e10.f43867b, c9990e, c9101sM19237b, false)) {
                            IOException iOException = e10.f43866a;
                            C9347b.m17693A(iOException, list);
                            throw iOException;
                        }
                        ArrayList arrayListM13439g0 = C6752c.m13439g0(e10.f43866a, list);
                        c9990e.m18573f(true);
                        z10 = true;
                        i10 = i10;
                        listM13439g0 = arrayListM13439g0;
                        z11 = false;
                    }
                } catch (IOException e11) {
                    if (!m19238c(e11, c9990e, c9101sM19237b, !(e11 instanceof ConnectionShutdownException))) {
                        C9347b.m17693A(e11, listM13439g0);
                        throw e11;
                    }
                    listM13439g0 = C6752c.m13439g0(e11, listM13439g0);
                    c9990e.m18573f(true);
                    z10 = true;
                    i10 = i10;
                    z11 = false;
                }
            } catch (Throwable th2) {
                c9990e.m18573f(true);
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C9101s m19237b(C9106x c9106x, C9988c c9988c) throws IOException {
        String strM17348b;
        C8077a c8077a;
        AbstractC9105w abstractC9105w = null;
        C9083a0 c9083a0 = (c9988c == null || (c8077a = c9988c.f50746g) == null) ? null : c8077a.f43868b;
        int i10 = c9106x.f47566d;
        String str = c9106x.f47563a.f47543b;
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                this.f51709a.f47514g.mo11091o0(c9083a0, c9106x);
                return null;
            }
            if (i10 == 421) {
                if (c9988c == null || !(!C5207g.m11106a(c9988c.f50742c.f50759b.f47378i.f47458d, c9988c.f50746g.f43868b.f47381a.f47378i.f47458d))) {
                    return null;
                }
                C8077a c8077a2 = c9988c.f50746g;
                synchronized (c8077a2) {
                    c8077a2.f43877k = true;
                }
                return c9106x.f47563a;
            }
            if (i10 == 503) {
                C9106x c9106x2 = c9106x.f47572j;
                if ((c9106x2 == null || c9106x2.f47566d != 503) && m19236d(c9106x, Integer.MAX_VALUE) == 0) {
                    return c9106x.f47563a;
                }
                return null;
            }
            if (i10 == 407) {
                C5207g.m11108c(c9083a0);
                if (c9083a0.f47382b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.f51709a.f47495I.mo11091o0(c9083a0, c9106x);
                return null;
            }
            if (i10 == 408) {
                if (!this.f51709a.f47513f) {
                    return null;
                }
                C9106x c9106x3 = c9106x.f47572j;
                if ((c9106x3 == null || c9106x3.f47566d != 408) && m19236d(c9106x, 0) <= 0) {
                    return c9106x.f47563a;
                }
                return null;
            }
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C9100r c9100r = this.f51709a;
        if (!c9100r.f47515h || (strM17348b = C9106x.m17348b(c9106x, "Location")) == null) {
            return null;
        }
        C9101s c9101s = c9106x.f47563a;
        C9096n c9096nM17326g = c9101s.f47542a.m17326g(strM17348b);
        if (c9096nM17326g == null) {
            return null;
        }
        if (!C5207g.m11106a(c9096nM17326g.f47455a, c9101s.f47542a.f47455a) && !c9100r.f47516i) {
            return null;
        }
        C9101s.a aVar = new C9101s.a(c9101s);
        if (C8584v.m16799x(str)) {
            boolean zM11106a = C5207g.m11106a(str, "PROPFIND");
            int i11 = c9106x.f47566d;
            boolean z10 = zM11106a || i11 == 308 || i11 == 307;
            if (!(true ^ C5207g.m11106a(str, "PROPFIND")) || i11 == 308 || i11 == 307) {
                if (z10) {
                    abstractC9105w = c9101s.f47545d;
                }
                aVar.m17346d(str, abstractC9105w);
            } else {
                aVar.m17346d("GET", null);
            }
            if (!z10) {
                aVar.f47550c.m17316f("Transfer-Encoding");
                aVar.f47550c.m17316f("Content-Length");
                aVar.f47550c.m17316f("Content-Type");
            }
        }
        if (!C9347b.m17694a(c9101s.f47542a, c9096nM17326g)) {
            aVar.f47550c.m17316f("Authorization");
        }
        aVar.f47548a = c9096nM17326g;
        return aVar.m17344b();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0044  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046  */
    /* JADX WARN: Code duplicated, block: B:40:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0062  */
    /* JADX WARN: Code duplicated, block: B:43:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0067  */
    /* JADX WARN: Code duplicated, block: B:73:0x00a9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00c6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x00d7  */
    /* JADX INFO: renamed from: c */
    public final boolean m19238c(IOException iOException, C9990e c9990e, C9101s c9101s, boolean z10) {
        boolean z11;
        C9989d c9989d;
        int i10;
        C9083a0 c9083a0;
        C9992g.a aVar;
        C9992g c9992g;
        boolean zM18580a;
        C8077a c8077a;
        if (!this.f51709a.f47513f) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(iOException instanceof ProtocolException)) {
            if (iOException instanceof InterruptedIOException) {
                if ((iOException instanceof SocketTimeoutException) && !z10) {
                    z11 = true;
                }
            } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            c9989d = c9990e.f50782i;
            C5207g.m11108c(c9989d);
            i10 = c9989d.f50764g;
            if (i10 != 0 && c9989d.f50765h == 0 && c9989d.f50766i == 0) {
                zM18580a = false;
            } else {
                if (c9989d.f50767j == null) {
                    if (i10 > 1 && c9989d.f50765h <= 1 && c9989d.f50766i <= 0 && (c8077a = c9989d.f50760c.f50783j) != null) {
                        synchronized (c8077a) {
                            try {
                                if (c8077a.f43878l == 0) {
                                    if (C9347b.m17694a(c8077a.f43868b.f47381a.f47378i, c9989d.f50759b.f47378i)) {
                                        c9083a0 = c8077a.f43868b;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (c9083a0 != null) {
                        c9989d.f50767j = c9083a0;
                    } else {
                        aVar = c9989d.f50762e;
                        if ((aVar == null && aVar.m18581a()) && (c9992g = c9989d.f50763f) != null) {
                            zM18580a = c9992g.m18580a();
                        }
                    }
                }
                zM18580a = true;
            }
            if (zM18580a) {
                return true;
            }
            return false;
        }
        z11 = false;
        if (!z11) {
            return false;
        }
        c9989d = c9990e.f50782i;
        C5207g.m11108c(c9989d);
        i10 = c9989d.f50764g;
        if (i10 != 0) {
            if (c9989d.f50767j == null) {
                c9083a0 = i10 > 1 ? null : null;
                if (c9083a0 != null) {
                    c9989d.f50767j = c9083a0;
                } else {
                    aVar = c9989d.f50762e;
                    if (aVar == null) {
                        if (aVar == null && aVar.m18581a()) {
                            zM18580a = c9992g.m18580a();
                        }
                    }
                    if (aVar == null && aVar.m18581a()) {
                        zM18580a = c9992g.m18580a();
                    }
                }
            }
            zM18580a = true;
        } else {
            if (c9989d.f50767j == null) {
                if (i10 > 1) {
                }
                if (c9083a0 != null) {
                    c9989d.f50767j = c9083a0;
                } else {
                    aVar = c9989d.f50762e;
                    if (aVar == null) {
                        if (aVar == null && aVar.m18581a()) {
                            zM18580a = c9992g.m18580a();
                        }
                    }
                    if (aVar == null && aVar.m18581a()) {
                        zM18580a = c9992g.m18580a();
                    }
                }
            }
            zM18580a = true;
        }
        if (zM18580a) {
            return false;
        }
        return true;
    }
}
