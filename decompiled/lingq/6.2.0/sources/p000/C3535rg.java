package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: rg */
/* JADX INFO: loaded from: classes.dex */
public final class C3535rg extends vz1 {

    /* JADX INFO: renamed from: l */
    public final X509TrustManager f59215l;

    /* JADX INFO: renamed from: m */
    public final X509TrustManagerExtensions f59216m;

    public C3535rg(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f59215l = x509TrustManager;
        this.f59216m = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3535rg) && ((C3535rg) obj).f59215l == this.f59215l;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f59215l);
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: q */
    public final List mo19836q(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.f59216m.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
