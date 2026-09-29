package p034bp;

import dm.C5207g;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: renamed from: bp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1636d extends C1640h {

    /* JADX INFO: renamed from: d */
    public static final boolean f9185d;

    /* JADX INFO: renamed from: c */
    public final Provider f9186c;

    /* JADX INFO: renamed from: bp.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m5330a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                return version.major() > 2;
            }
            if (version.minor() != 1) {
                return version.minor() > 1;
            }
            return version.patch() >= 0;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m5331b() {
            return C1636d.f9185d;
        }
    }

    /* JADX INFO: renamed from: bp.d$b */
    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a */
        public static final b f9187a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable() && a.m5330a()) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f9185d = z10;
    }

    public C1636d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        C5207g.m11110e(providerNewProvider, "newProvider()");
        this.f9186c = providerNewProvider;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C5207g.m11111f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo5318d(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: l */
    public final SSLContext mo5326l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f9186c);
        C5207g.m11110e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory mo5329m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextMo5326l = mo5326l();
        sSLContextMo5326l.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo5326l.getSocketFactory();
        C5207g.m11110e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo5327n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C5207g.m11108c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (!z10) {
            String string = Arrays.toString(trustManagers);
            C5207g.m11110e(string, "toString(this)");
            throw new IllegalStateException(C5207g.m11116k(string, "Unexpected default trust managers: ").toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f9187a);
        return x509TrustManager;
    }
}
