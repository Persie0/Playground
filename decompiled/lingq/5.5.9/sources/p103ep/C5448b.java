package p103ep;

import dm.C5207g;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: ep.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5448b implements InterfaceC5451e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f34000a;

    public C5448b(X509Certificate... x509CertificateArr) {
        C5207g.m11111f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C5207g.m11110e(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f34000a = linkedHashMap;
    }

    @Override // p103ep.InterfaceC5451e
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo5325a(X509Certificate x509Certificate) {
        boolean z10;
        C5207g.m11111f(x509Certificate, "cert");
        Set set = (Set) this.f34000a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = obj2;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5448b) && C5207g.m11106a(((C5448b) obj).f34000a, this.f34000a));
    }

    public final int hashCode() {
        return this.f34000a.hashCode();
    }
}
