package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j84 {

    /* JADX INFO: renamed from: e */
    public static final j84 f45184e = new j84(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f45185a;

    /* JADX INFO: renamed from: b */
    public final int f45186b;

    /* JADX INFO: renamed from: c */
    public final int f45187c;

    /* JADX INFO: renamed from: d */
    public final int f45188d;

    public j84(int i, int i2, int i3, int i4) {
        this.f45185a = i;
        this.f45186b = i2;
        this.f45187c = i3;
        this.f45188d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final long m14321a() {
        return (((long) ((m14322b() / 2) + this.f45186b)) & 4294967295L) | (((long) ((m14324d() / 2) + this.f45185a)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public final int m14322b() {
        return this.f45188d - this.f45186b;
    }

    /* JADX INFO: renamed from: c */
    public final long m14323c() {
        return (((long) this.f45185a) << 32) | (((long) this.f45186b) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final int m14324d() {
        return this.f45187c - this.f45185a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j84)) {
            return false;
        }
        j84 j84Var = (j84) obj;
        return this.f45185a == j84Var.f45185a && this.f45186b == j84Var.f45186b && this.f45187c == j84Var.f45187c && this.f45188d == j84Var.f45188d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45188d) + wq1.m24106b(this.f45187c, wq1.m24106b(this.f45186b, Integer.hashCode(this.f45185a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f45185a);
        sb.append(", ");
        sb.append(this.f45186b);
        sb.append(", ");
        sb.append(this.f45187c);
        sb.append(", ");
        return wq1.m24122r(sb, this.f45188d, ')');
    }
}
