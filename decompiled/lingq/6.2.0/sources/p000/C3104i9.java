package p000;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C3104i9 {

    /* JADX INFO: renamed from: a */
    public final g9c f43713a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f43714b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f43715c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f43716d;

    /* JADX INFO: renamed from: e */
    public final xo0 f43717e;

    /* JADX INFO: renamed from: f */
    public final ho5 f43718f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f43719g;

    /* JADX INFO: renamed from: h */
    public final ex3 f43720h;

    /* JADX INFO: renamed from: i */
    public final List f43721i;

    /* JADX INFO: renamed from: j */
    public final List f43722j;

    public C3104i9(String str, int i, g9c g9cVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, yq6 yq6Var, xo0 xo0Var, ho5 ho5Var, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        g9cVar.getClass();
        socketFactory.getClass();
        ho5Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f43713a = g9cVar;
        this.f43714b = socketFactory;
        this.f43715c = sSLSocketFactory;
        this.f43716d = yq6Var;
        this.f43717e = xo0Var;
        this.f43718f = ho5Var;
        this.f43719g = proxySelector;
        dx3 dx3Var = new dx3();
        dx3Var.m10739f(sSLSocketFactory != null ? "https" : "http");
        dx3Var.m10736c(str);
        dx3Var.m10738e(i);
        this.f43720h = dx3Var.m10734a();
        this.f43721i = kcb.m15119j(list);
        this.f43722j = kcb.m15119j(list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13722a(C3104i9 c3104i9) {
        c3104i9.getClass();
        return fa4.m11650l(this.f43713a, c3104i9.f43713a) && fa4.m11650l(this.f43718f, c3104i9.f43718f) && fa4.m11650l(this.f43721i, c3104i9.f43721i) && fa4.m11650l(this.f43722j, c3104i9.f43722j) && fa4.m11650l(this.f43719g, c3104i9.f43719g) && fa4.m11650l(this.f43715c, c3104i9.f43715c) && fa4.m11650l(this.f43716d, c3104i9.f43716d) && fa4.m11650l(this.f43717e, c3104i9.f43717e) && this.f43720h.f38028e == c3104i9.f43720h.f38028e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3104i9)) {
            return false;
        }
        C3104i9 c3104i9 = (C3104i9) obj;
        return fa4.m11650l(this.f43720h, c3104i9.f43720h) && m13722a(c3104i9);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f43717e) + ((Objects.hashCode(this.f43716d) + ((Objects.hashCode(this.f43715c) + ((this.f43719g.hashCode() + ux5.m22979b(ux5.m22979b((this.f43718f.hashCode() + ((this.f43713a.hashCode() + ux5.m22980c(527, this.f43720h.f38032i, 31)) * 31)) * 31, 31, this.f43721i), 31, this.f43722j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ex3 ex3Var = this.f43720h;
        sb.append(ex3Var.f38027d);
        sb.append(':');
        sb.append(ex3Var.f38028e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f43719g);
        sb.append('}');
        return sb.toString();
    }
}
