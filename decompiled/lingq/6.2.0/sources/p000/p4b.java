package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p4b implements cx5 {

    /* JADX INFO: renamed from: a */
    public final fc0 f55582a;

    /* JADX INFO: renamed from: b */
    public final int f55583b;

    public p4b(fc0 fc0Var, int i) {
        this.f55582a = fc0Var;
        this.f55583b = i;
    }

    @Override // p000.cx5
    /* JADX INFO: renamed from: a */
    public final int mo9918a(j84 j84Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.f55583b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : l70.m15945h(this.f55582a.m11762a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4b)) {
            return false;
        }
        p4b p4bVar = (p4b) obj;
        return this.f55582a.equals(p4bVar.f55582a) && this.f55583b == p4bVar.f55583b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55583b) + (Float.hashCode(this.f55582a.f38829a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f55582a);
        sb.append(", margin=");
        return wq1.m24122r(sb, this.f55583b, ')');
    }
}
