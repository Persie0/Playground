package p103ep;

import dm.C5207g;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: ep.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5447a extends AbstractC5449c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5451e f33999a;

    public C5447a(InterfaceC5451e interfaceC5451e) {
        C5207g.m11111f(interfaceC5451e, "trustRootIndex");
        this.f33999a = interfaceC5451e;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p103ep.AbstractC5449c
    /* JADX INFO: renamed from: a */
    public final List<Certificate> mo10693a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        boolean z10;
        X509Certificate x509Certificate;
        boolean z11;
        C5207g.m11111f(list, "chain");
        C5207g.m11111f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        C5207g.m11110e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i10 = 0;
        boolean z12 = false;
        while (i10 < 9) {
            i10++;
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo5325a = this.f33999a.mo5325a(x509Certificate2);
            if (x509CertificateMo5325a != null) {
                if (arrayList.size() > 1 || !C5207g.m11106a(x509Certificate2, x509CertificateMo5325a)) {
                    arrayList.add(x509CertificateMo5325a);
                }
                if (C5207g.m11106a(x509CertificateMo5325a.getIssuerDN(), x509CertificateMo5325a.getSubjectDN())) {
                    try {
                        x509CertificateMo5325a.verify(x509CertificateMo5325a.getPublicKey());
                        z10 = true;
                    } catch (GeneralSecurityException unused) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return arrayList;
                }
                z12 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C5207g.m11110e(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z12) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException(C5207g.m11116k(x509Certificate2, "Failed to find a trusted cert that signed "));
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                    if (C5207g.m11106a(x509Certificate2.getIssuerDN(), x509Certificate.getSubjectDN())) {
                        try {
                            x509Certificate2.verify(x509Certificate.getPublicKey());
                            z11 = true;
                        } catch (GeneralSecurityException unused2) {
                            z11 = false;
                        }
                    }
                    z11 = false;
                } while (!z11);
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException(C5207g.m11116k(arrayList, "Certificate chain too long: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C5447a) && C5207g.m11106a(((C5447a) obj).f33999a, this.f33999a);
    }

    public final int hashCode() {
        return this.f33999a.hashCode();
    }
}
