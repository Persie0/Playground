package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f37 {

    /* JADX INFO: renamed from: a */
    public final C3300lj f38358a;

    /* JADX INFO: renamed from: b */
    public final int f38359b;

    /* JADX INFO: renamed from: c */
    public final int f38360c;

    /* JADX INFO: renamed from: d */
    public final int f38361d;

    /* JADX INFO: renamed from: e */
    public final int f38362e;

    /* JADX INFO: renamed from: f */
    public final float f38363f;

    /* JADX INFO: renamed from: g */
    public final float f38364g;

    public f37(C3300lj c3300lj, int i, int i2, int i3, int i4, float f, float f2) {
        this.f38358a = c3300lj;
        this.f38359b = i;
        this.f38360c = i2;
        this.f38361d = i3;
        this.f38362e = i4;
        this.f38363f = f;
        this.f38364g = f2;
    }

    /* JADX INFO: renamed from: a */
    public final e28 m11524a(e28 e28Var) {
        return e28Var.m10810k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f38363f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public final long m11525b(long j, boolean z) {
        if (z) {
            long j2 = cx9.f34692b;
            if (cx9.m9920b(j, j2)) {
                return j2;
            }
        }
        int i = cx9.f34693c;
        int i2 = this.f38359b;
        return eh0.m11127g(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: c */
    public final e28 m11526c(e28 e28Var) {
        float f = -this.f38363f;
        return e28Var.m10810k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final int m11527d(int i) {
        int i2 = this.f38360c;
        int i3 = this.f38359b;
        return l70.m15945h(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f37) {
            f37 f37Var = (f37) obj;
            if (this.f38358a == f37Var.f38358a && this.f38359b == f37Var.f38359b && this.f38360c == f37Var.f38360c && this.f38361d == f37Var.f38361d && this.f38362e == f37Var.f38362e && Float.compare(this.f38363f, f37Var.f38363f) == 0 && Float.compare(this.f38364g, f37Var.f38364g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38364g) + wq1.m24105a(wq1.m24106b(this.f38362e, wq1.m24106b(this.f38361d, wq1.m24106b(this.f38360c, wq1.m24106b(this.f38359b, this.f38358a.hashCode() * 31, 31), 31), 31), 31), this.f38363f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f38358a);
        sb.append(", startIndex=");
        sb.append(this.f38359b);
        sb.append(", endIndex=");
        sb.append(this.f38360c);
        sb.append(", startLineIndex=");
        sb.append(this.f38361d);
        sb.append(", endLineIndex=");
        sb.append(this.f38362e);
        sb.append(", top=");
        sb.append(this.f38363f);
        sb.append(", bottom=");
        return AbstractC3393o1.m17737l(sb, this.f38364g, ')');
    }
}
