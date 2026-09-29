package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g55 {

    /* JADX INFO: renamed from: a */
    public final int f40229a;

    /* JADX INFO: renamed from: b */
    public final int f40230b;

    /* JADX INFO: renamed from: c */
    public final int f40231c;

    /* JADX INFO: renamed from: d */
    public final float f40232d;

    public g55(float f, int i, int i2, int i3) {
        this.f40229a = i;
        this.f40230b = i2;
        this.f40231c = i3;
        this.f40232d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g55)) {
            return false;
        }
        g55 g55Var = (g55) obj;
        return this.f40229a == g55Var.f40229a && this.f40230b == g55Var.f40230b && this.f40231c == g55Var.f40231c && Float.compare(this.f40232d, g55Var.f40232d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40232d) + wq1.m24106b(this.f40231c, wq1.m24106b(this.f40230b, Integer.hashCode(this.f40229a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f40229a, this.f40230b, "SentenceBlock(sentenceIndex=", ", startOffset=", ", endOffset=");
        sbM22994q.append(this.f40231c);
        sbM22994q.append(", heightPx=");
        sbM22994q.append(this.f40232d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
