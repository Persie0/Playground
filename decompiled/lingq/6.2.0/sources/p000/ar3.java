package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes.dex */
public final class ar3 {

    /* JADX INFO: renamed from: a */
    public final TlsVersion f7382a;

    /* JADX INFO: renamed from: b */
    public final c21 f7383b;

    /* JADX INFO: renamed from: c */
    public final List f7384c;

    /* JADX INFO: renamed from: d */
    public final cs4 f7385d;

    public ar3(TlsVersion tlsVersion, c21 c21Var, List list, ui3 ui3Var) {
        tlsVersion.getClass();
        this.f7382a = tlsVersion;
        this.f7383b = c21Var;
        this.f7384c = list;
        this.f7385d = AbstractC3192a.m15356a(new k92(3, ui3Var));
    }

    /* JADX INFO: renamed from: a */
    public final List m3000a() {
        return (List) this.f7385d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ar3)) {
            return false;
        }
        ar3 ar3Var = (ar3) obj;
        return ar3Var.f7382a == this.f7382a && ar3Var.f7383b == this.f7383b && fa4.m11650l(ar3Var.m3000a(), m3000a()) && ar3Var.f7384c.equals(this.f7384c);
    }

    public final int hashCode() {
        return this.f7384c.hashCode() + ((m3000a().hashCode() + ((this.f7383b.hashCode() + ((this.f7382a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM3000a = m3000a();
        ArrayList arrayList = new ArrayList(v91.m23189q0(listM3000a, 10));
        for (Certificate certificate : listM3000a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f7382a);
        sb.append(" cipherSuite=");
        sb.append(this.f7383b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f7384c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
