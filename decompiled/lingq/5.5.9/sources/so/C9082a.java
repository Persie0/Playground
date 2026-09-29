package so;

import ae.C0062b;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import mo.C7661i;
import okhttp3.C8073b;
import okhttp3.Protocol;
import p003a2.C0009a;
import to.C9347b;

/* JADX INFO: renamed from: so.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9082a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9092j f47370a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f47371b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f47372c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f47373d;

    /* JADX INFO: renamed from: e */
    public final C8073b f47374e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9084b f47375f;

    /* JADX INFO: renamed from: g */
    public final Proxy f47376g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f47377h;

    /* JADX INFO: renamed from: i */
    public final C9096n f47378i;

    /* JADX INFO: renamed from: j */
    public final List<Protocol> f47379j;

    /* JADX INFO: renamed from: k */
    public final List<C9089g> f47380k;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9082a(String str, int i10, InterfaceC9092j interfaceC9092j, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C8073b c8073b, InterfaceC9084b interfaceC9084b, List list, List list2, ProxySelector proxySelector) {
        C5207g.m11111f(str, "uriHost");
        C5207g.m11111f(interfaceC9092j, "dns");
        C5207g.m11111f(socketFactory, "socketFactory");
        C5207g.m11111f(interfaceC9084b, "proxyAuthenticator");
        C5207g.m11111f(list, "protocols");
        C5207g.m11111f(list2, "connectionSpecs");
        C5207g.m11111f(proxySelector, "proxySelector");
        this.f47370a = interfaceC9092j;
        this.f47371b = socketFactory;
        this.f47372c = sSLSocketFactory;
        this.f47373d = hostnameVerifier;
        this.f47374e = c8073b;
        this.f47375f = interfaceC9084b;
        this.f47376g = null;
        this.f47377h = proxySelector;
        C9096n.a aVar = new C9096n.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (C7661i.m15249O2(str2, "http")) {
            aVar.f47465a = "http";
        } else {
            if (!C7661i.m15249O2(str2, "https")) {
                throw new IllegalArgumentException(C5207g.m11116k(str2, "unexpected scheme: "));
            }
            aVar.f47465a = "https";
        }
        boolean z10 = false;
        String strM375n2 = C0062b.m375n2(C9096n.b.m17335d(str, 0, 0, false, 7));
        if (strM375n2 == null) {
            throw new IllegalArgumentException(C5207g.m11116k(str, "unexpected host: "));
        }
        aVar.f47468d = strM375n2;
        if (1 <= i10 && i10 < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(C5207g.m11116k(Integer.valueOf(i10), "unexpected port: ").toString());
        }
        aVar.f47469e = i10;
        this.f47378i = aVar.m17328a();
        this.f47379j = C9347b.m17717x(list);
        this.f47380k = C9347b.m17717x(list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17284a(C9082a c9082a) {
        C5207g.m11111f(c9082a, "that");
        return C5207g.m11106a(this.f47370a, c9082a.f47370a) && C5207g.m11106a(this.f47375f, c9082a.f47375f) && C5207g.m11106a(this.f47379j, c9082a.f47379j) && C5207g.m11106a(this.f47380k, c9082a.f47380k) && C5207g.m11106a(this.f47377h, c9082a.f47377h) && C5207g.m11106a(this.f47376g, c9082a.f47376g) && C5207g.m11106a(this.f47372c, c9082a.f47372c) && C5207g.m11106a(this.f47373d, c9082a.f47373d) && C5207g.m11106a(this.f47374e, c9082a.f47374e) && this.f47378i.f47459e == c9082a.f47378i.f47459e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9082a) {
            C9082a c9082a = (C9082a) obj;
            if (C5207g.m11106a(this.f47378i, c9082a.f47378i) && m17284a(c9082a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47374e) + ((Objects.hashCode(this.f47373d) + ((Objects.hashCode(this.f47372c) + ((Objects.hashCode(this.f47376g) + ((this.f47377h.hashCode() + C0204c.m848g(this.f47380k, C0204c.m848g(this.f47379j, (this.f47375f.hashCode() + ((this.f47370a.hashCode() + ((this.f47378i.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        C9096n c9096n = this.f47378i;
        sb2.append(c9096n.f47458d);
        sb2.append(':');
        sb2.append(c9096n.f47459e);
        sb2.append(", ");
        Proxy proxy = this.f47376g;
        return C0009a.m22j(sb2, proxy != null ? C5207g.m11116k(proxy, "proxy=") : C5207g.m11116k(this.f47377h, "proxySelector="), '}');
    }
}
