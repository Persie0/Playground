package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class j18 extends lw3 implements qu2 {

    /* JADX INFO: renamed from: b */
    public final as9 f44897b;

    /* JADX INFO: renamed from: c */
    public final ij8 f44898c;

    /* JADX INFO: renamed from: d */
    public final Socket f44899d;

    /* JADX INFO: renamed from: e */
    public final Socket f44900e;

    /* JADX INFO: renamed from: f */
    public final ar3 f44901f;

    /* JADX INFO: renamed from: g */
    public final Protocol f44902g;

    /* JADX INFO: renamed from: h */
    public final C3309ls f44903h;

    /* JADX INFO: renamed from: i */
    public mw3 f44904i;

    /* JADX INFO: renamed from: j */
    public boolean f44905j;

    /* JADX INFO: renamed from: k */
    public boolean f44906k;

    /* JADX INFO: renamed from: l */
    public int f44907l;

    /* JADX INFO: renamed from: m */
    public int f44908m;

    /* JADX INFO: renamed from: n */
    public int f44909n;

    /* JADX INFO: renamed from: o */
    public int f44910o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f44911p;

    /* JADX INFO: renamed from: q */
    public long f44912q;

    public j18(as9 as9Var, kl2 kl2Var, ij8 ij8Var, Socket socket, Socket socket2, ar3 ar3Var, Protocol protocol, C3309ls c3309ls) {
        as9Var.getClass();
        kl2Var.getClass();
        ij8Var.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        c3309ls.getClass();
        this.f44897b = as9Var;
        this.f44898c = ij8Var;
        this.f44899d = socket;
        this.f44900e = socket2;
        this.f44901f = ar3Var;
        this.f44902g = protocol;
        this.f44903h = c3309ls;
        this.f44910o = 1;
        this.f44911p = new ArrayList();
        this.f44912q = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static void m14265c(dr6 dr6Var, ij8 ij8Var, IOException iOException) {
        dr6Var.getClass();
        ij8Var.getClass();
        iOException.getClass();
        if (ij8Var.f44193b.type() != Proxy.Type.DIRECT) {
            C3104i9 c3104i9 = ij8Var.f44192a;
            c3104i9.f43719g.connectFailed(c3104i9.f43720h.m11383i(), ij8Var.f44193b.address(), iOException);
        }
        or3 or3Var = dr6Var.f36110z;
        synchronized (or3Var) {
            ((LinkedHashSet) or3Var.f54782a).add(ij8Var);
        }
    }

    @Override // p000.lw3
    /* JADX INFO: renamed from: a */
    public final void mo14266a(mw3 mw3Var, h09 h09Var) {
        h09Var.getClass();
        synchronized (this) {
            this.f44910o = (h09Var.f41639a & 8) != 0 ? h09Var.f41640b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // p000.lw3
    /* JADX INFO: renamed from: b */
    public final void mo14267b(tw3 tw3Var) {
        tw3Var.m22319d(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // p000.qu2
    public final void cancel() {
        kcb.m15112c(this.f44899d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14268d(C3104i9 c3104i9, List list) {
        ex3 ex3Var = c3104i9.f43720h;
        TimeZone timeZone = kcb.f47051a;
        if (this.f44911p.size() < this.f44910o && !this.f44905j) {
            ij8 ij8Var = this.f44898c;
            C3104i9 c3104i10 = ij8Var.f44192a;
            C3104i9 c3104i11 = ij8Var.f44192a;
            if (c3104i10.m13722a(c3104i9)) {
                String str = ex3Var.f38027d;
                String str2 = ex3Var.f38027d;
                if (fa4.m11650l(str, c3104i11.f43720h.f38027d)) {
                    return true;
                }
                if (this.f44904i != null && list != null) {
                    List<ij8> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (ij8 ij8Var2 : list2) {
                            Proxy.Type type = ij8Var2.f44193b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && ij8Var.f44193b.type() == type2 && fa4.m11650l(ij8Var.f44194c, ij8Var2.f44194c)) {
                                if (c3104i9.f43716d != yq6.f70293a) {
                                    break;
                                }
                                TimeZone timeZone2 = kcb.f47051a;
                                ex3 ex3Var2 = c3104i11.f43720h;
                                if (ex3Var.f38028e != ex3Var2.f38028e) {
                                    break;
                                }
                                boolean zM11650l = fa4.m11650l(str2, ex3Var2.f38027d);
                                ar3 ar3Var = this.f44901f;
                                if (!zM11650l) {
                                    if (!this.f44906k && ar3Var != null) {
                                        List listM3000a = ar3Var.m3000a();
                                        if (listM3000a.isEmpty()) {
                                            break;
                                        }
                                        Object obj = listM3000a.get(0);
                                        obj.getClass();
                                        if (!yq6.m25285c(str2, (X509Certificate) obj)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    xo0 xo0Var = c3104i9.f43717e;
                                    xo0Var.getClass();
                                    ar3Var.getClass();
                                    List listM3000a2 = ar3Var.m3000a();
                                    str2.getClass();
                                    listM3000a2.getClass();
                                    Iterator it = xo0Var.f68422a.iterator();
                                    if (!it.hasNext()) {
                                        return true;
                                    }
                                    g9a.m12435l(it.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: e */
    public final void mo11847e() {
        synchronized (this) {
            this.f44905j = true;
        }
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: f */
    public final void mo11848f(i18 i18Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f44904i != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f44905j = true;
                        if (this.f44908m == 0) {
                            if (iOException != null) {
                                m14265c(i18Var.f43342a, this.f44898c, iOException);
                            }
                            this.f44907l++;
                        }
                    }
                } else if (((StreamResetException) iOException).f54502a == ErrorCode.REFUSED_STREAM) {
                    int i = this.f44909n + 1;
                    this.f44909n = i;
                    if (i > 1) {
                        this.f44905j = true;
                        this.f44907l++;
                    }
                } else if (((StreamResetException) iOException).f54502a != ErrorCode.CANCEL || !i18Var.f43339K) {
                    this.f44905j = true;
                    this.f44907l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14269g(boolean z) {
        long j;
        TimeZone timeZone = kcb.f47051a;
        long jNanoTime = System.nanoTime();
        if (this.f44899d.isClosed() || this.f44900e.isClosed() || this.f44900e.isInputShutdown() || this.f44900e.isOutputShutdown()) {
            return false;
        }
        mw3 mw3Var = this.f44904i;
        if (mw3Var != null) {
            synchronized (mw3Var) {
                if (mw3Var.f51931f) {
                    return false;
                }
                return mw3Var.f51914I >= mw3Var.f51913H || jNanoTime < mw3Var.f51915J;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f44912q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f44900e;
        e18 e18Var = (e18) this.f44903h.f50065c;
        socket.getClass();
        e18Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !e18Var.m10787a();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // p000.qu2
    /* JADX INFO: renamed from: h */
    public final ij8 mo11850h() {
        return this.f44898c;
    }

    /* JADX INFO: renamed from: i */
    public final void m14270i() throws SocketException {
        this.f44912q = System.nanoTime();
        Protocol protocol = this.f44902g;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f44900e.setSoTimeout(0);
            gz8 gz8Var = gz8.f41563d;
            f83 f83Var = f83.f38611a;
            as9 as9Var = this.f44897b;
            as9Var.getClass();
            w41 w41Var = new w41();
            w41Var.f66365a = as9Var;
            w41Var.f66368d = lw3.f50204a;
            w41Var.f66369e = f83.f38611a;
            C3309ls c3309ls = this.f44903h;
            String str = this.f44898c.f44192a.f43720h.f38027d;
            c3309ls.getClass();
            str.getClass();
            w41Var.f66366b = c3309ls;
            w41Var.f66367c = kcb.f47052b + ' ' + str;
            w41Var.f66368d = this;
            w41Var.f66369e = f83Var;
            mw3 mw3Var = new mw3(w41Var);
            this.f44904i = mw3Var;
            h09 h09Var = mw3.f51912U;
            this.f44910o = (h09Var.f41639a & 8) != 0 ? h09Var.f41640b[3] : Integer.MAX_VALUE;
            uw3 uw3Var = mw3Var.f51923R;
            synchronized (uw3Var) {
                try {
                    if (uw3Var.f64462d) {
                        throw new IOException("closed");
                    }
                    Logger logger = uw3.f64458f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(kcb.m15113d(">> CONNECTION " + gw3.f41422a.mo18079e(), new Object[0]));
                    }
                    uw3Var.f64459a.mo468U(gw3.f41422a);
                    uw3Var.f64459a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            uw3 uw3Var2 = mw3Var.f51923R;
            h09 h09Var2 = mw3Var.f51917L;
            uw3Var2.getClass();
            h09Var2.getClass();
            synchronized (uw3Var2) {
                try {
                    if (uw3Var2.f64462d) {
                        throw new IOException("closed");
                    }
                    uw3Var2.m22962c(0, Integer.bitCount(h09Var2.f41639a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & h09Var2.f41639a) == 0) {
                            z = false;
                        }
                        if (z) {
                            uw3Var2.f64459a.writeShort(i);
                            uw3Var2.f64459a.writeInt(h09Var2.f41640b[i]);
                        }
                    }
                    uw3Var2.f64459a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iM12993a = mw3Var.f51917L.m12993a();
            if (iM12993a != 65535) {
                mw3Var.f51923R.m22967r(0, iM12993a - 65535);
            }
            zr9.m25750b(mw3Var.f51932g.m3023d(), mw3Var.f51928c, mw3Var.f51924S);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        ij8 ij8Var = this.f44898c;
        sb.append(ij8Var.f44192a.f43720h.f38027d);
        sb.append(':');
        sb.append(ij8Var.f44192a.f43720h.f38028e);
        sb.append(", proxy=");
        sb.append(ij8Var.f44193b);
        sb.append(" hostAddress=");
        sb.append(ij8Var.f44194c);
        sb.append(" cipherSuite=");
        ar3 ar3Var = this.f44901f;
        sb.append(ar3Var != null ? ar3Var.f7383b : "none");
        sb.append(" protocol=");
        sb.append(this.f44902g);
        sb.append('}');
        return sb.toString();
    }
}
