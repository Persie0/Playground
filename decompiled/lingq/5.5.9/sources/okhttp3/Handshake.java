package okhttp3;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C6740a;
import kotlin.collections.EmptyList;
import sl.InterfaceC9070c;
import so.C9088f;
import tl.C9325m;
import to.C9347b;

/* JADX INFO: loaded from: classes2.dex */
public final class Handshake {

    /* JADX INFO: renamed from: a */
    public final TlsVersion f43775a;

    /* JADX INFO: renamed from: b */
    public final C9088f f43776b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f43777c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9070c f43778d;

    public static final class Companion {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static Handshake m15938a(SSLSession sSLSession) throws IOException {
            final List listM17705l;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (C5207g.m11106a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C5207g.m11106a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(C5207g.m11116k(cipherSuite, "cipherSuite == "));
            }
            C9088f c9088fM17292b = C9088f.f47399b.m17292b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C5207g.m11106a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.INSTANCE.getClass();
            TlsVersion tlsVersionM15940a = TlsVersion.Companion.m15940a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listM17705l = peerCertificates != null ? C9347b.m17705l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.f38032a;
            } catch (SSLPeerUnverifiedException unused) {
                listM17705l = EmptyList.f38032a;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new Handshake(tlsVersionM15940a, c9088fM17292b, localCertificates != null ? C9347b.m17705l(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.f38032a, new InterfaceC2041a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends Certificate> mo807E() {
                    return listM17705l;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, C9088f c9088f, List<? extends Certificate> list, final InterfaceC2041a<? extends List<? extends Certificate>> interfaceC2041a) {
        C5207g.m11111f(tlsVersion, "tlsVersion");
        C5207g.m11111f(c9088f, "cipherSuite");
        C5207g.m11111f(list, "localCertificates");
        this.f43775a = tlsVersion;
        this.f43776b = c9088f;
        this.f43777c = list;
        this.f43778d = C6740a.m13372a(new InterfaceC2041a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends Certificate> mo807E() {
                try {
                    return interfaceC2041a.mo807E();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.f38032a;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final List<Certificate> m15937a() {
        return (List) this.f43778d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f43775a == this.f43775a && C5207g.m11106a(handshake.f43776b, this.f43776b) && C5207g.m11106a(handshake.m15937a(), m15937a()) && C5207g.m11106a(handshake.f43777c, this.f43777c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43777c.hashCode() + ((m15937a().hashCode() + ((this.f43776b.hashCode() + ((this.f43775a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM15937a = m15937a();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM15937a, 10));
        for (Certificate certificate : listM15937a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                C5207g.m11110e(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f43775a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f43776b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f43777c;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                C5207g.m11110e(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
