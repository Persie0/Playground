package p000;

/* JADX INFO: renamed from: ln */
/* JADX INFO: loaded from: classes.dex */
public final class C3304ln {

    /* JADX INFO: renamed from: a */
    public final Object f49849a;

    /* JADX INFO: renamed from: b */
    public final int f49850b;

    /* JADX INFO: renamed from: c */
    public int f49851c;

    /* JADX INFO: renamed from: d */
    public final String f49852d;

    public /* synthetic */ C3304ln(InterfaceC3190kn interfaceC3190kn, int i, int i2, int i3) {
        this(interfaceC3190kn, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
    }

    /* JADX INFO: renamed from: a */
    public final C3378nn m16392a(int i) {
        int i2 = this.f49851c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            j54.m14290c("Item.end should be set first");
        }
        return new C3378nn(this.f49849a, this.f49850b, i, this.f49852d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3304ln)) {
            return false;
        }
        C3304ln c3304ln = (C3304ln) obj;
        return fa4.m11650l(this.f49849a, c3304ln.f49849a) && this.f49850b == c3304ln.f49850b && this.f49851c == c3304ln.f49851c && fa4.m11650l(this.f49852d, c3304ln.f49852d);
    }

    public final int hashCode() {
        Object obj = this.f49849a;
        return this.f49852d.hashCode() + wq1.m24106b(this.f49851c, wq1.m24106b(this.f49850b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f49849a);
        sb.append(", start=");
        sb.append(this.f49850b);
        sb.append(", end=");
        sb.append(this.f49851c);
        sb.append(", tag=");
        return ux5.m22992o(sb, this.f49852d, ')');
    }

    public C3304ln(Object obj, int i, int i2, String str) {
        this.f49849a = obj;
        this.f49850b = i;
        this.f49851c = i2;
        this.f49852d = str;
    }
}
