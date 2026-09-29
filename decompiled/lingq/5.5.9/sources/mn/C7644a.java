package mn;

import dm.C5207g;
import mo.C7661i;

/* JADX INFO: renamed from: mn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7644a {

    /* JADX INFO: renamed from: a */
    public final C7646c f42069a;

    /* JADX INFO: renamed from: b */
    public final C7646c f42070b;

    /* JADX INFO: renamed from: c */
    public final C7648e f42071c;

    /* JADX INFO: renamed from: d */
    public final C7646c f42072d;

    static {
        C7646c.m15213j(C7650g.f42094f);
    }

    public C7644a(C7646c c7646c, C7648e c7648e) {
        C5207g.m11111f(c7646c, "packageName");
        this.f42069a = c7646c;
        this.f42070b = null;
        this.f42071c = c7648e;
        this.f42072d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7644a)) {
            return false;
        }
        C7644a c7644a = (C7644a) obj;
        return C5207g.m11106a(this.f42069a, c7644a.f42069a) && C5207g.m11106a(this.f42070b, c7644a.f42070b) && C5207g.m11106a(this.f42071c, c7644a.f42071c) && C5207g.m11106a(this.f42072d, c7644a.f42072d);
    }

    public final int hashCode() {
        int iHashCode = this.f42069a.hashCode() * 31;
        C7646c c7646c = this.f42070b;
        int iHashCode2 = (this.f42071c.hashCode() + ((iHashCode + (c7646c == null ? 0 : c7646c.hashCode())) * 31)) * 31;
        C7646c c7646c2 = this.f42072d;
        return iHashCode2 + (c7646c2 != null ? c7646c2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C7661i.m15253S2(this.f42069a.m15214b(), '.', '/'));
        sb2.append("/");
        C7646c c7646c = this.f42070b;
        if (c7646c != null) {
            sb2.append(c7646c);
            sb2.append(".");
        }
        sb2.append(this.f42071c);
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
