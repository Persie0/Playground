package so;

import dm.C5206f;
import dm.C5207g;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C8072a;
import okhttp3.C8073b;
import okhttp3.Protocol;
import p034bp.C1640h;
import p079dp.C5268a;
import p103ep.AbstractC5449c;
import p103ep.C5450d;
import p118fe.C5509a;
import p290o6.C7965k0;
import p290o6.C7967l0;
import p338qd.C8584v;
import p387t0.C9166r;
import p467wo.C9990e;
import to.C9347b;

/* JADX INFO: renamed from: so.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C9100r implements Cloneable, InterfaceC9086d.a {

    /* JADX INFO: renamed from: V */
    public static final List<Protocol> f47492V = C9347b.m17705l(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: W */
    public static final List<C9089g> f47493W = C9347b.m17705l(C9089g.f47420e, C9089g.f47421f);

    /* JADX INFO: renamed from: H */
    public final ProxySelector f47494H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC9084b f47495I;

    /* JADX INFO: renamed from: J */
    public final SocketFactory f47496J;

    /* JADX INFO: renamed from: K */
    public final SSLSocketFactory f47497K;

    /* JADX INFO: renamed from: L */
    public final X509TrustManager f47498L;

    /* JADX INFO: renamed from: M */
    public final List<C9089g> f47499M;

    /* JADX INFO: renamed from: N */
    public final List<Protocol> f47500N;

    /* JADX INFO: renamed from: O */
    public final HostnameVerifier f47501O;

    /* JADX INFO: renamed from: P */
    public final C8073b f47502P;

    /* JADX INFO: renamed from: Q */
    public final AbstractC5449c f47503Q;

    /* JADX INFO: renamed from: R */
    public final int f47504R;

    /* JADX INFO: renamed from: S */
    public final int f47505S;

    /* JADX INFO: renamed from: T */
    public final int f47506T;

    /* JADX INFO: renamed from: U */
    public final C7967l0 f47507U;

    /* JADX INFO: renamed from: a */
    public final C7965k0 f47508a;

    /* JADX INFO: renamed from: b */
    public final C9166r f47509b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC9097o> f47510c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC9097o> f47511d;

    /* JADX INFO: renamed from: e */
    public final AbstractC9093k.b f47512e;

    /* JADX INFO: renamed from: f */
    public final boolean f47513f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9084b f47514g;

    /* JADX INFO: renamed from: h */
    public final boolean f47515h;

    /* JADX INFO: renamed from: i */
    public final boolean f47516i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC9091i f47517j;

    /* JADX INFO: renamed from: k */
    public final C8072a f47518k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9092j f47519l;

    /* JADX INFO: renamed from: so.r$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C7965k0 f47520a = new C7965k0();

        /* JADX INFO: renamed from: b */
        public C9166r f47521b = new C9166r(10);

        /* JADX INFO: renamed from: c */
        public final ArrayList f47522c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f47523d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final C5509a f47524e;

        /* JADX INFO: renamed from: f */
        public boolean f47525f;

        /* JADX INFO: renamed from: g */
        public final C5206f f47526g;

        /* JADX INFO: renamed from: h */
        public boolean f47527h;

        /* JADX INFO: renamed from: i */
        public boolean f47528i;

        /* JADX INFO: renamed from: j */
        public InterfaceC9091i f47529j;

        /* JADX INFO: renamed from: k */
        public C8072a f47530k;

        /* JADX INFO: renamed from: l */
        public final C8584v f47531l;

        /* JADX INFO: renamed from: m */
        public final C5206f f47532m;

        /* JADX INFO: renamed from: n */
        public final SocketFactory f47533n;

        /* JADX INFO: renamed from: o */
        public List<C9089g> f47534o;

        /* JADX INFO: renamed from: p */
        public final List<? extends Protocol> f47535p;

        /* JADX INFO: renamed from: q */
        public final C5450d f47536q;

        /* JADX INFO: renamed from: r */
        public final C8073b f47537r;

        /* JADX INFO: renamed from: s */
        public int f47538s;

        /* JADX INFO: renamed from: t */
        public int f47539t;

        /* JADX INFO: renamed from: u */
        public final int f47540u;

        /* JADX INFO: renamed from: v */
        public C7967l0 f47541v;

        public a() {
            AbstractC9093k.a aVar = AbstractC9093k.f47445a;
            byte[] bArr = C9347b.f48082a;
            C5207g.m11111f(aVar, "<this>");
            this.f47524e = new C5509a(25, aVar);
            this.f47525f = true;
            C5206f c5206f = InterfaceC9084b.f47384E;
            this.f47526g = c5206f;
            this.f47527h = true;
            this.f47528i = true;
            this.f47529j = InterfaceC9091i.f47443a;
            this.f47531l = InterfaceC9092j.f47444F;
            this.f47532m = c5206f;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C5207g.m11110e(socketFactory, "getDefault()");
            this.f47533n = socketFactory;
            this.f47534o = C9100r.f47493W;
            this.f47535p = C9100r.f47492V;
            this.f47536q = C5450d.f34001a;
            this.f47537r = C8073b.f43808c;
            this.f47538s = 10000;
            this.f47539t = 10000;
            this.f47540u = 10000;
        }
    }

    public C9100r() {
        this(new a());
    }

    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x017f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public C9100r(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        boolean z10;
        boolean z11;
        X509TrustManager x509TrustManager;
        AbstractC5449c abstractC5449c;
        SSLSocketFactory sSLSocketFactory;
        boolean z12;
        boolean z13;
        this.f47508a = aVar.f47520a;
        this.f47509b = aVar.f47521b;
        this.f47510c = C9347b.m17717x(aVar.f47522c);
        this.f47511d = C9347b.m17717x(aVar.f47523d);
        this.f47512e = aVar.f47524e;
        this.f47513f = aVar.f47525f;
        this.f47514g = aVar.f47526g;
        this.f47515h = aVar.f47527h;
        this.f47516i = aVar.f47528i;
        this.f47517j = aVar.f47529j;
        this.f47518k = aVar.f47530k;
        this.f47519l = aVar.f47531l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f47494H = proxySelector == null ? C5268a.f33363a : proxySelector;
        this.f47495I = aVar.f47532m;
        this.f47496J = aVar.f47533n;
        List<C9089g> list = aVar.f47534o;
        this.f47499M = list;
        this.f47500N = aVar.f47535p;
        this.f47501O = aVar.f47536q;
        this.f47504R = aVar.f47538s;
        this.f47505S = aVar.f47539t;
        this.f47506T = aVar.f47540u;
        C7967l0 c7967l0 = aVar.f47541v;
        this.f47507U = c7967l0 == null ? new C7967l0(11) : c7967l0;
        boolean z14 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((C9089g) it.next()).f47422a) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            this.f47497K = null;
            this.f47503Q = null;
            this.f47498L = null;
            this.f47502P = C8073b.f43808c;
        } else {
            C1640h c1640h = C1640h.f9199a;
            X509TrustManager x509TrustManagerMo5327n = C1640h.f9199a.mo5327n();
            this.f47498L = x509TrustManagerMo5327n;
            C1640h c1640h2 = C1640h.f9199a;
            C5207g.m11108c(x509TrustManagerMo5327n);
            this.f47497K = c1640h2.mo5329m(x509TrustManagerMo5327n);
            AbstractC5449c abstractC5449cMo5317b = C1640h.f9199a.mo5317b(x509TrustManagerMo5327n);
            this.f47503Q = abstractC5449cMo5317b;
            C8073b c8073b = aVar.f47537r;
            C5207g.m11108c(abstractC5449cMo5317b);
            this.f47502P = C5207g.m11106a(c8073b.f43810b, abstractC5449cMo5317b) ? c8073b : new C8073b(c8073b.f43809a, abstractC5449cMo5317b);
        }
        List<InterfaceC9097o> list2 = this.f47510c;
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(C5207g.m11116k(list2, "Null interceptor: ").toString());
        }
        List<InterfaceC9097o> list3 = this.f47511d;
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(C5207g.m11116k(list3, "Null network interceptor: ").toString());
        }
        List<C9089g> list4 = this.f47499M;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C9089g) it2.next()).f47422a) {
                        z11 = false;
                        break;
                    }
                }
            }
            x509TrustManager = this.f47498L;
            abstractC5449c = this.f47503Q;
            sSLSocketFactory = this.f47497K;
            if (z11) {
                if (sSLSocketFactory != null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
                if (abstractC5449c != null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                if (x509TrustManager != null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
                return;
            }
            if (sSLSocketFactory == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (abstractC5449c == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (x509TrustManager == null ? true : z14) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (C5207g.m11106a(this.f47502P, C8073b.f43808c)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        z11 = true;
        x509TrustManager = this.f47498L;
        abstractC5449c = this.f47503Q;
        sSLSocketFactory = this.f47497K;
        if (z11) {
            if (sSLSocketFactory != null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (abstractC5449c != null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (x509TrustManager != null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (sSLSocketFactory == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (abstractC5449c == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager == null ? true : z14) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (C5207g.m11106a(this.f47502P, C8073b.f43808c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // so.InterfaceC9086d.a
    /* JADX INFO: renamed from: b */
    public final C9990e mo17290b(C9101s c9101s) {
        return new C9990e(this, c9101s, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
