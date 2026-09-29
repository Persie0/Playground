package p034bp;

import dm.C5207g;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: renamed from: bp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1635c extends C1640h {

    /* JADX INFO: renamed from: d */
    public static final boolean f9183d;

    /* JADX INFO: renamed from: c */
    public final Provider f9184c = new BouncyCastleJsseProvider();

    /* JADX INFO: renamed from: bp.c$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m5328a() {
            return C1635c.f9183d;
        }
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f9183d = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C5207g.m11111f(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.mo5318d(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        Object[] array = C1640h.a.m5335a(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (sSLSocket instanceof BCSSLSocket) {
            applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null ? true : C5207g.m11106a(applicationProtocol, "")) {
                applicationProtocol = null;
            }
        } else {
            applicationProtocol = null;
        }
        return applicationProtocol;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: l */
    public final SSLContext mo5326l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f9184c);
        C5207g.m11110e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: n */
    public final X509TrustManager mo5327n() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
}
