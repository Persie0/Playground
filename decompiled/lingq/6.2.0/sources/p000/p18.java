package p000;

import android.security.NetworkSecurityPolicy;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class p18 {

    /* JADX INFO: renamed from: a */
    public final as9 f55438a;

    /* JADX INFO: renamed from: b */
    public final kl2 f55439b;

    /* JADX INFO: renamed from: c */
    public final int f55440c;

    /* JADX INFO: renamed from: d */
    public final int f55441d;

    /* JADX INFO: renamed from: e */
    public final int f55442e;

    /* JADX INFO: renamed from: f */
    public final int f55443f;

    /* JADX INFO: renamed from: g */
    public final boolean f55444g;

    /* JADX INFO: renamed from: h */
    public final boolean f55445h;

    /* JADX INFO: renamed from: i */
    public final C3104i9 f55446i;

    /* JADX INFO: renamed from: j */
    public final or3 f55447j;

    /* JADX INFO: renamed from: k */
    public final i18 f55448k;

    /* JADX INFO: renamed from: l */
    public final boolean f55449l;

    /* JADX INFO: renamed from: m */
    public xh8 f55450m;

    /* JADX INFO: renamed from: n */
    public mj8 f55451n;

    /* JADX INFO: renamed from: o */
    public ij8 f55452o;

    /* JADX INFO: renamed from: p */
    public final C0825bv f55453p;

    public p18(as9 as9Var, kl2 kl2Var, int i, int i2, int i3, int i4, boolean z, boolean z2, C3104i9 c3104i9, or3 or3Var, i18 i18Var, co7 co7Var) {
        as9Var.getClass();
        kl2Var.getClass();
        or3Var.getClass();
        this.f55438a = as9Var;
        this.f55439b = kl2Var;
        this.f55440c = i;
        this.f55441d = i2;
        this.f55442e = i3;
        this.f55443f = i4;
        this.f55444g = z;
        this.f55445h = z2;
        this.f55446i = c3104i9;
        this.f55447j = or3Var;
        this.f55448k = i18Var;
        this.f55449l = !fa4.m11650l((String) co7Var.f10359b, "GET");
        this.f55453p = new C0825bv();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18853a(j18 j18Var) {
        mj8 mj8Var;
        ij8 ij8Var;
        if (this.f55453p.isEmpty() && this.f55452o == null) {
            if (j18Var != null) {
                synchronized (j18Var) {
                    ij8Var = null;
                    if (j18Var.f44907l == 0 && j18Var.f44905j && kcb.m15110a(j18Var.f44898c.f44192a.f43720h, this.f55446i.f43720h)) {
                        ij8Var = j18Var.f44898c;
                    }
                }
                if (ij8Var != null) {
                    this.f55452o = ij8Var;
                    return true;
                }
            }
            xh8 xh8Var = this.f55450m;
            if ((xh8Var == null || xh8Var.f68212b >= xh8Var.f68211a.size()) && (mj8Var = this.f55451n) != null) {
                return mj8Var.m16858a();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final lj8 m18854b() {
        Socket socketM13626i;
        r98 r98Var;
        fi1 fi1VarM18855c;
        String hostAddress;
        int port;
        List listM23635i;
        boolean zContains;
        j18 j18Var = this.f55448k.f43349h;
        if (j18Var == null) {
            r98Var = null;
        } else {
            boolean zM14269g = j18Var.m14269g(this.f55449l);
            synchronized (j18Var) {
                boolean z = j18Var.f44905j;
                try {
                    if (!zM14269g) {
                        j18Var.f44905j = true;
                        socketM13626i = this.f55448k.m13626i();
                    } else if (!z) {
                        ex3 ex3Var = j18Var.f44898c.f44192a.f43720h;
                        ex3Var.getClass();
                        ex3 ex3Var2 = this.f55446i.f43720h;
                        socketM13626i = !(ex3Var.f38028e == ex3Var2.f38028e && fa4.m11650l(ex3Var.f38027d, ex3Var2.f38027d)) ? this.f55448k.m13626i() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f55448k.f43349h == null) {
                if (socketM13626i != null) {
                    kcb.m15112c(socketM13626i);
                }
                r98Var = null;
            } else {
                if (socketM13626i != null) {
                    C3386nv.m17633t("Check failed.");
                    return null;
                }
                r98Var = new r98(j18Var);
            }
        }
        if (r98Var != null) {
            return r98Var;
        }
        r98 r98VarM18856d = m18856d(null, null);
        if (r98VarM18856d != null) {
            return r98VarM18856d;
        }
        if (!this.f55453p.isEmpty()) {
            return (lj8) this.f55453p.removeFirst();
        }
        ij8 ij8Var = this.f55452o;
        if (ij8Var != null) {
            this.f55452o = null;
            fi1VarM18855c = m18855c(ij8Var, null);
        } else {
            xh8 xh8Var = this.f55450m;
            if (xh8Var == null || xh8Var.f68212b >= xh8Var.f68211a.size()) {
                mj8 mj8Var = this.f55451n;
                if (mj8Var == null) {
                    mj8Var = new mj8(this.f55446i, this.f55447j, this.f55448k, this.f55445h);
                    this.f55451n = mj8Var;
                }
                if (!mj8Var.m16858a()) {
                    v63.m23133k("exhausted all routes");
                    return null;
                }
                if (!mj8Var.m16858a()) {
                    uk9.m22784s();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (mj8Var.f51404e < mj8Var.f51403d.size()) {
                    C3104i9 c3104i9 = mj8Var.f51400a;
                    if (mj8Var.f51404e >= mj8Var.f51403d.size()) {
                        throw new SocketException("No route to " + c3104i9.f43720h.f38027d + "; exhausted proxy configurations: " + mj8Var.f51403d);
                    }
                    List list = mj8Var.f51403d;
                    int i = mj8Var.f51404e;
                    mj8Var.f51404e = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    mj8Var.f51405f = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        ex3 ex3Var3 = c3104i9.f43720h;
                        hostAddress = ex3Var3.f38027d;
                        port = ex3Var3.f38028e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            ij6.m13961s(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        Regex regex = gcb.f40555a;
                        hostAddress.getClass();
                        if (gcb.f40555a.m15427f(hostAddress)) {
                            listM23635i = vz1.m23604J(InetAddress.getByName(hostAddress));
                        } else {
                            c3104i9.f43713a.getClass();
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                allByName.getClass();
                                List listM20852t0 = AbstractC3550rv.m20852t0(allByName);
                                if (listM20852t0.isEmpty()) {
                                    throw new UnknownHostException(c3104i9.f43713a + " returned no addresses for " + hostAddress);
                                }
                                listM23635i = listM20852t0;
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (mj8Var.f51402c && listM23635i.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listM23635i) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = icb.f43946a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                ListBuilder listBuilderM23650t = vz1.m23650t();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        listBuilderM23650t.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        listBuilderM23650t.add(it2.next());
                                    }
                                }
                                listM23635i = vz1.m23635i(listBuilderM23650t);
                            }
                        }
                        Iterator it3 = listM23635i.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = mj8Var.f51405f.iterator();
                    while (it4.hasNext()) {
                        ij8 ij8Var2 = new ij8(mj8Var.f51400a, proxy, (InetSocketAddress) it4.next());
                        or3 or3Var = mj8Var.f51401b;
                        synchronized (or3Var) {
                            zContains = ((LinkedHashSet) or3Var.f54782a).contains(ij8Var2);
                        }
                        if (zContains) {
                            mj8Var.f51406g.add(ij8Var2);
                        } else {
                            arrayList.add(ij8Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    u91.m22630w0(mj8Var.f51406g, arrayList);
                    mj8Var.f51406g.clear();
                }
                xh8 xh8Var2 = new xh8(arrayList);
                this.f55450m = xh8Var2;
                if (this.f55448k.f43339K) {
                    v63.m23133k("Canceled");
                    return null;
                }
                if (xh8Var2.f68212b >= arrayList.size()) {
                    uk9.m22784s();
                    return null;
                }
                int i2 = xh8Var2.f68212b;
                xh8Var2.f68212b = i2 + 1;
                fi1VarM18855c = m18855c((ij8) arrayList.get(i2), arrayList);
            } else {
                int i3 = xh8Var.f68212b;
                ArrayList arrayList5 = xh8Var.f68211a;
                if (i3 >= arrayList5.size()) {
                    uk9.m22784s();
                    return null;
                }
                int i4 = xh8Var.f68212b;
                xh8Var.f68212b = i4 + 1;
                fi1VarM18855c = m18855c((ij8) arrayList5.get(i4), null);
            }
        }
        r98 r98VarM18856d2 = m18856d(fi1VarM18855c, fi1VarM18855c.f39126k);
        return r98VarM18856d2 != null ? r98VarM18856d2 : fi1VarM18855c;
    }

    /* JADX INFO: renamed from: c */
    public final fi1 m18855c(ij8 ij8Var, ArrayList arrayList) throws UnknownServiceException {
        ij8Var.getClass();
        C3104i9 c3104i9 = ij8Var.f44192a;
        if (c3104i9.f43715c == null) {
            if (!c3104i9.f43722j.contains(ki1.f47316h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = ij8Var.f44192a.f43720h.f38027d;
            C2927dg c2927dg = u87.f63590a;
            u87.f63590a.getClass();
            str.getClass();
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str)) {
                throw new UnknownServiceException(wq1.m24118n("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c3104i9.f43721i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        co7 co7Var = null;
        if (ij8Var.f44193b.type() == Proxy.Type.HTTP) {
            C3104i9 c3104i10 = ij8Var.f44192a;
            if (c3104i10.f43715c != null || c3104i10.f43721i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                w41 w41Var = new w41(13);
                ex3 ex3Var = ij8Var.f44192a.f43720h;
                ex3Var.getClass();
                w41Var.f66365a = ex3Var;
                w41Var.m23736y("CONNECT", null);
                C3104i9 c3104i11 = ij8Var.f44192a;
                w41Var.m23732u("Host", kcb.m15118i(c3104i11.f43720h, true));
                w41Var.m23732u("Proxy-Connection", "Keep-Alive");
                w41Var.m23732u("User-Agent", "okhttp/5.3.2");
                co7Var = new co7(w41Var);
                l88 l88Var = m88.f50759b;
                or3 or3Var = new or3(0);
                Protocol.HTTP_1_1.getClass();
                oha.m17997c("Proxy-Authenticate");
                oha.m17998d("OkHttp-Preemptive", "Proxy-Authenticate");
                or3Var.m18300M("Proxy-Authenticate");
                oha.m17995a(or3Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                or3Var.m18309w();
                l88Var.getClass();
                c3104i11.f43718f.getClass();
            }
        }
        return new fi1(this.f55438a, this.f55439b, this.f55440c, this.f55441d, this.f55442e, this.f55443f, this.f55444g, this.f55448k, this, ij8Var, arrayList, co7Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX INFO: renamed from: d */
    public final r98 m18856d(fi1 fi1Var, List list) {
        j18 j18Var;
        boolean z;
        Socket socketM13626i;
        kl2 kl2Var = this.f55439b;
        boolean z2 = this.f55449l;
        C3104i9 c3104i9 = this.f55446i;
        i18 i18Var = this.f55448k;
        boolean z3 = fi1Var != null && fi1Var.mo11843a();
        kl2Var.getClass();
        Iterator it = ((ConcurrentLinkedQueue) kl2Var.f47485e).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                j18Var = null;
                break;
            }
            j18Var = (j18) it.next();
            j18Var.getClass();
            synchronized (j18Var) {
                if (z3) {
                    try {
                        if (!(j18Var.f44904i != null)) {
                            z = false;
                        } else if (j18Var.m14268d(c3104i9, list)) {
                            i18Var.m13619b(j18Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (j18Var.m14268d(c3104i9, list)) {
                    z = false;
                } else {
                    i18Var.m13619b(j18Var);
                    z = true;
                }
            }
            if (z) {
                if (j18Var.m14269g(z2)) {
                    break;
                }
                synchronized (j18Var) {
                    j18Var.f44905j = true;
                    socketM13626i = i18Var.m13626i();
                }
                if (socketM13626i != null) {
                    kcb.m15112c(socketM13626i);
                }
            }
        }
        if (j18Var == null) {
            return null;
        }
        if (fi1Var != null) {
            this.f55452o = fi1Var.f39125j;
            Socket socket = fi1Var.f39132q;
            if (socket != null) {
                kcb.m15112c(socket);
            }
        }
        return new r98(j18Var);
    }
}
