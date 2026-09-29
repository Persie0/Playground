package so;

import dm.C5207g;
import java.io.Closeable;
import okhttp3.Handshake;
import okhttp3.Protocol;
import p467wo.C9988c;

/* JADX INFO: renamed from: so.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C9106x implements Closeable {

    /* JADX INFO: renamed from: H */
    public final C9988c f47561H;

    /* JADX INFO: renamed from: I */
    public C9085c f47562I;

    /* JADX INFO: renamed from: a */
    public final C9101s f47563a;

    /* JADX INFO: renamed from: b */
    public final Protocol f47564b;

    /* JADX INFO: renamed from: c */
    public final String f47565c;

    /* JADX INFO: renamed from: d */
    public final int f47566d;

    /* JADX INFO: renamed from: e */
    public final Handshake f47567e;

    /* JADX INFO: renamed from: f */
    public final C9095m f47568f;

    /* JADX INFO: renamed from: g */
    public final AbstractC9107y f47569g;

    /* JADX INFO: renamed from: h */
    public final C9106x f47570h;

    /* JADX INFO: renamed from: i */
    public final C9106x f47571i;

    /* JADX INFO: renamed from: j */
    public final C9106x f47572j;

    /* JADX INFO: renamed from: k */
    public final long f47573k;

    /* JADX INFO: renamed from: l */
    public final long f47574l;

    /* JADX INFO: renamed from: so.x$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C9101s f47575a;

        /* JADX INFO: renamed from: b */
        public Protocol f47576b;

        /* JADX INFO: renamed from: c */
        public int f47577c;

        /* JADX INFO: renamed from: d */
        public String f47578d;

        /* JADX INFO: renamed from: e */
        public Handshake f47579e;

        /* JADX INFO: renamed from: f */
        public C9095m.a f47580f;

        /* JADX INFO: renamed from: g */
        public AbstractC9107y f47581g;

        /* JADX INFO: renamed from: h */
        public C9106x f47582h;

        /* JADX INFO: renamed from: i */
        public C9106x f47583i;

        /* JADX INFO: renamed from: j */
        public C9106x f47584j;

        /* JADX INFO: renamed from: k */
        public long f47585k;

        /* JADX INFO: renamed from: l */
        public long f47586l;

        /* JADX INFO: renamed from: m */
        public C9988c f47587m;

        public a() {
            this.f47577c = -1;
            this.f47580f = new C9095m.a();
        }

        public a(C9106x c9106x) {
            C5207g.m11111f(c9106x, "response");
            this.f47575a = c9106x.f47563a;
            this.f47576b = c9106x.f47564b;
            this.f47577c = c9106x.f47566d;
            this.f47578d = c9106x.f47565c;
            this.f47579e = c9106x.f47567e;
            this.f47580f = c9106x.f47568f.m17307g();
            this.f47581g = c9106x.f47569g;
            this.f47582h = c9106x.f47570h;
            this.f47583i = c9106x.f47571i;
            this.f47584j = c9106x.f47572j;
            this.f47585k = c9106x.f47573k;
            this.f47586l = c9106x.f47574l;
            this.f47587m = c9106x.f47561H;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: b */
        public static void m17351b(String str, C9106x c9106x) {
            if (c9106x == null) {
                return;
            }
            boolean z10 = true;
            if (!(c9106x.f47569g == null)) {
                throw new IllegalArgumentException(C5207g.m11116k(".body != null", str).toString());
            }
            if (!(c9106x.f47570h == null)) {
                throw new IllegalArgumentException(C5207g.m11116k(".networkResponse != null", str).toString());
            }
            if (!(c9106x.f47571i == null)) {
                throw new IllegalArgumentException(C5207g.m11116k(".cacheResponse != null", str).toString());
            }
            if (c9106x.f47572j != null) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(C5207g.m11116k(".priorResponse != null", str).toString());
            }
        }

        /* JADX INFO: renamed from: a */
        public final C9106x m17352a() {
            int i10 = this.f47577c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(C5207g.m11116k(Integer.valueOf(i10), "code < 0: ").toString());
            }
            C9101s c9101s = this.f47575a;
            if (c9101s == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f47576b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f47578d;
            if (str != null) {
                return new C9106x(c9101s, protocol, str, i10, this.f47579e, this.f47580f.m17314d(), this.f47581g, this.f47582h, this.f47583i, this.f47584j, this.f47585k, this.f47586l, this.f47587m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* JADX INFO: renamed from: c */
        public final void m17353c(C9095m c9095m) {
            C5207g.m11111f(c9095m, "headers");
            this.f47580f = c9095m.m17307g();
        }
    }

    public C9106x(C9101s c9101s, Protocol protocol, String str, int i10, Handshake handshake, C9095m c9095m, AbstractC9107y abstractC9107y, C9106x c9106x, C9106x c9106x2, C9106x c9106x3, long j10, long j11, C9988c c9988c) {
        this.f47563a = c9101s;
        this.f47564b = protocol;
        this.f47565c = str;
        this.f47566d = i10;
        this.f47567e = handshake;
        this.f47568f = c9095m;
        this.f47569g = abstractC9107y;
        this.f47570h = c9106x;
        this.f47571i = c9106x2;
        this.f47572j = c9106x3;
        this.f47573k = j10;
        this.f47574l = j11;
        this.f47561H = c9988c;
    }

    /* JADX INFO: renamed from: b */
    public static String m17348b(C9106x c9106x, String str) {
        c9106x.getClass();
        String strM17305a = c9106x.f47568f.m17305a(str);
        if (strM17305a == null) {
            strM17305a = null;
        }
        return strM17305a;
    }

    /* JADX INFO: renamed from: a */
    public final C9085c m17349a() {
        C9085c c9085c = this.f47562I;
        if (c9085c != null) {
            return c9085c;
        }
        int i10 = C9085c.f47385n;
        C9085c c9085cM17286b = C9085c.b.m17286b(this.f47568f);
        this.f47562I = c9085cM17286b;
        return c9085cM17286b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC9107y abstractC9107y = this.f47569g;
        if (abstractC9107y == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC9107y.close();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17350l() {
        boolean z10 = false;
        int i10 = this.f47566d;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        return z10;
    }

    public final String toString() {
        return "Response{protocol=" + this.f47564b + ", code=" + this.f47566d + ", message=" + this.f47565c + ", url=" + this.f47563a.f47542a + '}';
    }
}
