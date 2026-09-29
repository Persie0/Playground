package p057cp;

import android.net.http.X509TrustManagerExtensions;
import dm.C5207g;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p103ep.AbstractC5449c;

/* JADX INFO: renamed from: cp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4988b extends AbstractC5449c {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f32566a;

    /* JADX INFO: renamed from: b */
    public final X509TrustManagerExtensions f32567b;

    public C4988b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f32566a = x509TrustManager;
        this.f32567b = x509TrustManagerExtensions;
    }

    @Override // p103ep.AbstractC5449c
    /* JADX INFO: renamed from: a */
    public final List<Certificate> mo10693a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        C5207g.m11111f(list, "chain");
        C5207g.m11111f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f32567b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            C5207g.m11110e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4988b) && ((C4988b) obj).f32566a == this.f32566a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f32566a);
    }
}
