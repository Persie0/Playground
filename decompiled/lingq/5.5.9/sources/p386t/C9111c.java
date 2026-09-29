package p386t;

import dm.C5207g;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9174z;
import p424v0.C9617a;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9111c {

    /* JADX INFO: renamed from: a */
    public InterfaceC9174z f47604a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9165q f47605b;

    /* JADX INFO: renamed from: c */
    public C9617a f47606c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9138c0 f47607d;

    public C9111c() {
        this(0);
    }

    public C9111c(int i10) {
        this.f47604a = null;
        this.f47605b = null;
        this.f47606c = null;
        this.f47607d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9111c)) {
            return false;
        }
        C9111c c9111c = (C9111c) obj;
        if (C5207g.m11106a(this.f47604a, c9111c.f47604a) && C5207g.m11106a(this.f47605b, c9111c.f47605b) && C5207g.m11106a(this.f47606c, c9111c.f47606c) && C5207g.m11106a(this.f47607d, c9111c.f47607d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC9174z interfaceC9174z = this.f47604a;
        int iHashCode = 0;
        int iHashCode2 = (interfaceC9174z == null ? 0 : interfaceC9174z.hashCode()) * 31;
        InterfaceC9165q interfaceC9165q = this.f47605b;
        int iHashCode3 = (iHashCode2 + (interfaceC9165q == null ? 0 : interfaceC9165q.hashCode())) * 31;
        C9617a c9617a = this.f47606c;
        int iHashCode4 = (iHashCode3 + (c9617a == null ? 0 : c9617a.hashCode())) * 31;
        InterfaceC9138c0 interfaceC9138c0 = this.f47607d;
        if (interfaceC9138c0 != null) {
            iHashCode = interfaceC9138c0.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f47604a + ", canvas=" + this.f47605b + ", canvasDrawScope=" + this.f47606c + ", borderPath=" + this.f47607d + ')';
    }
}
