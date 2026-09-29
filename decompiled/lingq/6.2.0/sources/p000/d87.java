package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d87 {

    /* JADX INFO: renamed from: a */
    public final int f35172a;

    /* JADX INFO: renamed from: b */
    public final int f35173b;

    /* JADX INFO: renamed from: c */
    public final int f35174c;

    /* JADX INFO: renamed from: d */
    public final String f35175d;

    /* JADX INFO: renamed from: e */
    public final List f35176e;

    /* JADX INFO: renamed from: f */
    public final int f35177f;

    /* JADX INFO: renamed from: g */
    public final Integer f35178g;

    /* JADX INFO: renamed from: h */
    public final boolean f35179h;

    public d87(int i, int i2, int i3, String str, List list, int i4, Integer num, boolean z) {
        this.f35172a = i;
        this.f35173b = i2;
        this.f35174c = i3;
        this.f35175d = str;
        this.f35176e = list;
        this.f35177f = i4;
        this.f35178g = num;
        this.f35179h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d87)) {
            return false;
        }
        d87 d87Var = (d87) obj;
        return this.f35172a == d87Var.f35172a && this.f35173b == d87Var.f35173b && this.f35174c == d87Var.f35174c && this.f35175d.equals(d87Var.f35175d) && this.f35176e.equals(d87Var.f35176e) && this.f35177f == d87Var.f35177f && fa4.m11650l(this.f35178g, d87Var.f35178g) && this.f35179h == d87Var.f35179h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f35177f, ux5.m22979b(ux5.m22980c(wq1.m24106b(this.f35174c, wq1.m24106b(this.f35173b, Integer.hashCode(this.f35172a) * 31, 31), 31), this.f35175d, 31), 31, this.f35176e), 31);
        Integer num = this.f35178g;
        return Boolean.hashCode(this.f35179h) + ((iM24106b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f35172a, this.f35173b, "PhraseHighlightData(index=", ", start=", ", end=");
        hn1.m13361k(this.f35174c, ", text=", this.f35175d, ", tokens=", sbM22994q);
        sbM22994q.append(this.f35176e);
        sbM22994q.append(", cardStatus=");
        sbM22994q.append(this.f35177f);
        sbM22994q.append(", extendedCardStatus=");
        sbM22994q.append(this.f35178g);
        sbM22994q.append(", isRelatedPhrase=");
        sbM22994q.append(this.f35179h);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
