package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class o44 {

    /* JADX INFO: renamed from: a */
    public final int f53821a;

    /* JADX INFO: renamed from: b */
    public final int f53822b;

    /* JADX INFO: renamed from: c */
    public final Integer f53823c;

    public o44(int i, int i2, Integer num) {
        this.f53821a = i;
        this.f53822b = i2;
        this.f53823c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o44)) {
            return false;
        }
        o44 o44Var = (o44) obj;
        return this.f53821a == o44Var.f53821a && this.f53822b == o44Var.f53822b && this.f53823c.equals(o44Var.f53823c);
    }

    public final int hashCode() {
        return this.f53823c.hashCode() + wq1.m24106b(this.f53822b, Integer.hashCode(this.f53821a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f53821a, this.f53822b, "InfoPageConfig(titleRes=", ", subtitleRes=", ", imageRes=");
        sbM22994q.append(this.f53823c);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
