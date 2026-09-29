package p467wo;

import dm.C5207g;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p440vl.C9758b;
import so.C9088f;
import so.C9089g;
import to.C9347b;

/* JADX INFO: renamed from: wo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9987b {

    /* JADX INFO: renamed from: a */
    public final List<C9089g> f50736a;

    /* JADX INFO: renamed from: b */
    public int f50737b;

    /* JADX INFO: renamed from: c */
    public boolean f50738c;

    /* JADX INFO: renamed from: d */
    public boolean f50739d;

    public C9987b(List<C9089g> list) {
        C5207g.m11111f(list, "connectionSpecs");
        this.f50736a = list;
    }

    /* JADX INFO: renamed from: a */
    public final C9089g m18559a(SSLSocket sSLSocket) throws IOException {
        C9089g c9089g;
        boolean z10;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i10 = this.f50737b;
        List<C9089g> list = this.f50736a;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                c9089g = null;
                break;
            }
            int i11 = i10 + 1;
            c9089g = list.get(i10);
            if (c9089g.m17294b(sSLSocket)) {
                this.f50737b = i11;
                break;
            }
            i10 = i11;
        }
        if (c9089g == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f50739d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            C5207g.m11108c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            C5207g.m11110e(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f50737b;
        int size2 = list.size();
        while (true) {
            if (i12 >= size2) {
                z10 = false;
                break;
            }
            int i13 = i12 + 1;
            if (list.get(i12).m17294b(sSLSocket)) {
                z10 = true;
                break;
            }
            i12 = i13;
        }
        this.f50738c = z10;
        boolean z11 = this.f50739d;
        String[] strArr = c9089g.f47424c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            C5207g.m11110e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = C9347b.m17709p(enabledCipherSuites2, strArr, C9088f.f47400c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c9089g.f47425d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            C5207g.m11110e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = C9347b.m17709p(enabledProtocols3, strArr2, C9758b.f49823a);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C5207g.m11110e(supportedCipherSuites, "supportedCipherSuites");
        C9088f.a aVar = C9088f.f47400c;
        byte[] bArr = C9347b.f48082a;
        int length = supportedCipherSuites.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                i14 = -1;
                break;
            }
            if (aVar.compare(supportedCipherSuites[i14], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i14++;
        }
        if (z11 && i14 != -1) {
            C5207g.m11110e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i14];
            C5207g.m11110e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C9089g.a aVar2 = new C9089g.a(c9089g);
        C5207g.m11110e(enabledCipherSuites, "cipherSuitesIntersection");
        aVar2.m17297b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        C5207g.m11110e(enabledProtocols, "tlsVersionsIntersection");
        aVar2.m17300e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C9089g c9089gM17296a = aVar2.m17296a();
        if (c9089gM17296a.m17295c() != null) {
            sSLSocket.setEnabledProtocols(c9089gM17296a.f47425d);
        }
        if (c9089gM17296a.m17293a() != null) {
            sSLSocket.setEnabledCipherSuites(c9089gM17296a.f47424c);
        }
        return c9089g;
    }
}
