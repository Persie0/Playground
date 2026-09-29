package p000;

/* JADX INFO: renamed from: nn */
/* JADX INFO: loaded from: classes.dex */
public final class C3378nn {

    /* JADX INFO: renamed from: a */
    public final Object f52979a;

    /* JADX INFO: renamed from: b */
    public final int f52980b;

    /* JADX INFO: renamed from: c */
    public final int f52981c;

    /* JADX INFO: renamed from: d */
    public final String f52982d;

    public C3378nn(Object obj, int i, int i2, String str) {
        this.f52979a = obj;
        this.f52980b = i;
        this.f52981c = i2;
        this.f52982d = str;
        if (i <= i2) {
            return;
        }
        j54.m14288a("Reversed range is not supported");
    }

    /* JADX INFO: renamed from: a */
    public static C3378nn m17501a(C3378nn c3378nn, InterfaceC3190kn interfaceC3190kn, int i, int i2) {
        Object obj = interfaceC3190kn;
        if ((i2 & 1) != 0) {
            obj = c3378nn.f52979a;
        }
        int i3 = c3378nn.f52980b;
        if ((i2 & 4) != 0) {
            i = c3378nn.f52981c;
        }
        String str = c3378nn.f52982d;
        c3378nn.getClass();
        return new C3378nn(obj, i3, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3378nn)) {
            return false;
        }
        C3378nn c3378nn = (C3378nn) obj;
        return fa4.m11650l(this.f52979a, c3378nn.f52979a) && this.f52980b == c3378nn.f52980b && this.f52981c == c3378nn.f52981c && fa4.m11650l(this.f52982d, c3378nn.f52982d);
    }

    public final int hashCode() {
        Object obj = this.f52979a;
        return this.f52982d.hashCode() + wq1.m24106b(this.f52981c, wq1.m24106b(this.f52980b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f52979a);
        sb.append(", start=");
        sb.append(this.f52980b);
        sb.append(", end=");
        sb.append(this.f52981c);
        sb.append(", tag=");
        return ux5.m22992o(sb, this.f52982d, ')');
    }

    public C3378nn(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }
}
