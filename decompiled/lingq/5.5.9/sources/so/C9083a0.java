package so;

import dm.C5207g;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: so.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9083a0 {

    /* JADX INFO: renamed from: a */
    public final C9082a f47381a;

    /* JADX INFO: renamed from: b */
    public final Proxy f47382b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f47383c;

    public C9083a0(C9082a c9082a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C5207g.m11111f(c9082a, "address");
        C5207g.m11111f(inetSocketAddress, "socketAddress");
        this.f47381a = c9082a;
        this.f47382b = proxy;
        this.f47383c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9083a0) {
            C9083a0 c9083a0 = (C9083a0) obj;
            if (C5207g.m11106a(c9083a0.f47381a, this.f47381a) && C5207g.m11106a(c9083a0.f47382b, this.f47382b) && C5207g.m11106a(c9083a0.f47383c, this.f47383c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47383c.hashCode() + ((this.f47382b.hashCode() + ((this.f47381a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f47383c + '}';
    }
}
