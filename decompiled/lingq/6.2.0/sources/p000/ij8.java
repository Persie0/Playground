package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class ij8 {

    /* JADX INFO: renamed from: a */
    public final C3104i9 f44192a;

    /* JADX INFO: renamed from: b */
    public final Proxy f44193b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f44194c;

    public ij8(C3104i9 c3104i9, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f44192a = c3104i9;
        this.f44193b = proxy;
        this.f44194c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ij8)) {
            return false;
        }
        ij8 ij8Var = (ij8) obj;
        return ij8Var.f44192a.equals(this.f44192a) && ij8Var.f44193b.equals(this.f44193b) && fa4.m11650l(ij8Var.f44194c, this.f44194c);
    }

    public final int hashCode() {
        return this.f44194c.hashCode() + ((this.f44193b.hashCode() + ((this.f44192a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        ex3 ex3Var = this.f44192a.f43720h;
        String str = ex3Var.f38027d;
        InetSocketAddress inetSocketAddress = this.f44194c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM12480b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : gcb.m12480b(hostAddress);
        if (vk9.m23381d0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (ex3Var.f38028e != inetSocketAddress.getPort() || str.equals(strM12480b)) {
            sb.append(":");
            sb.append(ex3Var.f38028e);
        }
        if (!str.equals(strM12480b)) {
            if (this.f44193b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM12480b == null) {
                sb.append("<unresolved>");
            } else if (vk9.m23381d0(strM12480b, ':')) {
                sb.append("[");
                sb.append(strM12480b);
                sb.append("]");
            } else {
                sb.append(strM12480b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
