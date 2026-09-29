package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h55 {

    /* JADX INFO: renamed from: a */
    public final int f41802a;

    /* JADX INFO: renamed from: b */
    public final int f41803b;

    public h55(int i, int i2) {
        this.f41802a = i;
        this.f41803b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h55)) {
            return false;
        }
        h55 h55Var = (h55) obj;
        return this.f41802a == h55Var.f41802a && this.f41803b == h55Var.f41803b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41803b) + (Integer.hashCode(this.f41802a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f41802a, this.f41803b, "SentenceStart(sentenceIndex=", ", startOffset=", ")");
    }
}
