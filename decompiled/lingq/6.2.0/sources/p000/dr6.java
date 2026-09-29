package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.StrictMode;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class dr6 {

    /* JADX INFO: renamed from: C */
    public static final List f36081C = kcb.m15120k(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});

    /* JADX INFO: renamed from: D */
    public static final List f36082D = kcb.m15120k(new ki1[]{ki1.f47315g, ki1.f47316h});

    /* JADX INFO: renamed from: A */
    public final as9 f36083A;

    /* JADX INFO: renamed from: B */
    public final m58 f36084B;

    /* JADX INFO: renamed from: a */
    public final ny8 f36085a;

    /* JADX INFO: renamed from: b */
    public final List f36086b;

    /* JADX INFO: renamed from: c */
    public final List f36087c;

    /* JADX INFO: renamed from: d */
    public final uk9 f36088d;

    /* JADX INFO: renamed from: e */
    public final boolean f36089e;

    /* JADX INFO: renamed from: f */
    public final boolean f36090f;

    /* JADX INFO: renamed from: g */
    public final ho5 f36091g;

    /* JADX INFO: renamed from: h */
    public final boolean f36092h;

    /* JADX INFO: renamed from: i */
    public final boolean f36093i;

    /* JADX INFO: renamed from: j */
    public final u06 f36094j;

    /* JADX INFO: renamed from: k */
    public final fl0 f36095k;

    /* JADX INFO: renamed from: l */
    public final g9c f36096l;

    /* JADX INFO: renamed from: m */
    public final ProxySelector f36097m;

    /* JADX INFO: renamed from: n */
    public final ho5 f36098n;

    /* JADX INFO: renamed from: o */
    public final SocketFactory f36099o;

    /* JADX INFO: renamed from: p */
    public final SSLSocketFactory f36100p;

    /* JADX INFO: renamed from: q */
    public final X509TrustManager f36101q;

    /* JADX INFO: renamed from: r */
    public final List f36102r;

    /* JADX INFO: renamed from: s */
    public final List f36103s;

    /* JADX INFO: renamed from: t */
    public final yq6 f36104t;

    /* JADX INFO: renamed from: u */
    public final xo0 f36105u;

    /* JADX INFO: renamed from: v */
    public final vz1 f36106v;

    /* JADX INFO: renamed from: w */
    public final int f36107w;

    /* JADX INFO: renamed from: x */
    public final int f36108x;

    /* JADX INFO: renamed from: y */
    public final int f36109y;

    /* JADX INFO: renamed from: z */
    public final or3 f36110z;

    public dr6(cr6 cr6Var) throws NoSuchAlgorithmException, KeyStoreException {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        this.f36085a = cr6Var.f34410a;
        this.f36086b = kcb.m15119j(cr6Var.f34412c);
        this.f36087c = kcb.m15119j(cr6Var.f34413d);
        this.f36088d = cr6Var.f34414e;
        this.f36089e = cr6Var.f34415f;
        this.f36090f = cr6Var.f34416g;
        this.f36091g = cr6Var.f34417h;
        this.f36092h = cr6Var.f34418i;
        this.f36093i = cr6Var.f34419j;
        this.f36094j = cr6Var.f34420k;
        this.f36095k = cr6Var.f34421l;
        this.f36096l = cr6Var.f34422m;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f36097m = proxySelector == null ? so6.f61110a : proxySelector;
        this.f36098n = cr6Var.f34423n;
        this.f36099o = cr6Var.f34424o;
        List list = cr6Var.f34425p;
        this.f36102r = list;
        this.f36103s = cr6Var.f34426q;
        this.f36104t = cr6Var.f34427r;
        this.f36107w = cr6Var.f34429t;
        this.f36108x = cr6Var.f34430u;
        this.f36109y = cr6Var.f34431v;
        this.f36110z = new or3(21);
        this.f36083A = as9.f7432l;
        m58 m58Var = cr6Var.f34411b;
        if (m58Var == null) {
            m58Var = new m58(5, 5L, TimeUnit.MINUTES);
            cr6Var.f34411b = m58Var;
        }
        this.f36084B = m58Var;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f36100p = null;
                    this.f36106v = null;
                    this.f36101q = null;
                    this.f36105u = xo0.f68421c;
                    break;
                }
                if (((ki1) it.next()).f47317a) {
                    C2927dg c2927dg = u87.f63590a;
                    u87.f63590a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f36101q = x509TrustManager;
                            u87.f63590a.getClass();
                            try {
                                StrictMode.noteSlowCall("newSSLContext");
                                SSLContext sSLContext = SSLContext.getInstance("TLS");
                                sSLContext.getClass();
                                sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                                socketFactory.getClass();
                                this.f36100p = socketFactory;
                                u87.f63590a.getClass();
                                try {
                                    x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
                                } catch (IllegalArgumentException unused) {
                                    x509TrustManagerExtensions = null;
                                }
                                vz1 c3535rg = x509TrustManagerExtensions != null ? new C3535rg(x509TrustManager, x509TrustManagerExtensions) : null;
                                if (c3535rg == null) {
                                    StrictMode.noteSlowCall("buildTrustRootIndex");
                                    X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                                    c3535rg = new qa0(new tb0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
                                }
                                this.f36106v = c3535rg;
                                xo0 xo0Var = cr6Var.f34428s;
                                this.f36105u = fa4.m11650l(xo0Var.f68423b, c3535rg) ? xo0Var : new xo0(xo0Var.f68422a, c3535rg);
                                break;
                            } catch (GeneralSecurityException e) {
                                throw new AssertionError("No System TLS: " + e, e);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    string.getClass();
                    gm5.m12751g("Unexpected default trust managers: ".concat(string));
                    throw null;
                }
            }
        } else {
            this.f36100p = null;
            this.f36106v = null;
            this.f36101q = null;
            this.f36105u = xo0.f68421c;
            break;
        }
        X509TrustManager x509TrustManager2 = this.f36101q;
        vz1 vz1Var = this.f36106v;
        SSLSocketFactory sSLSocketFactory = this.f36100p;
        List list3 = this.f36087c;
        List list4 = this.f36086b;
        list4.getClass();
        if (list4.contains(null)) {
            ij6.m13951i(list4, "Null interceptor: ");
            throw null;
        }
        list3.getClass();
        if (list3.contains(null)) {
            ij6.m13951i(list3, "Null network interceptor: ");
            throw null;
        }
        List list5 = this.f36102r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ki1) it2.next()).f47317a) {
                    if (sSLSocketFactory == null) {
                        C3386nv.m17633t("sslSocketFactory == null");
                        throw null;
                    }
                    if (vz1Var == null) {
                        C3386nv.m17633t("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager2 != null) {
                        return;
                    }
                    C3386nv.m17633t("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            C3386nv.m17633t("Check failed.");
            throw null;
        }
        if (vz1Var != null) {
            C3386nv.m17633t("Check failed.");
            throw null;
        }
        if (x509TrustManager2 != null) {
            C3386nv.m17633t("Check failed.");
            throw null;
        }
        if (fa4.m11650l(this.f36105u, xo0.f68421c)) {
            return;
        }
        C3386nv.m17633t("Check failed.");
        throw null;
    }

    public dr6() {
        this(new cr6());
    }
}
