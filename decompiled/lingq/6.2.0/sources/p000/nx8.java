package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nx8 {

    /* JADX INFO: renamed from: a */
    public final int f53365a;

    /* JADX INFO: renamed from: b */
    public final int f53366b;

    public nx8(int i, int i2) {
        this.f53365a = i;
        this.f53366b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx8)) {
            return false;
        }
        nx8 nx8Var = (nx8) obj;
        return this.f53365a == nx8Var.f53365a && this.f53366b == nx8Var.f53366b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53366b) + (Integer.hashCode(this.f53365a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f53365a, this.f53366b, "SentenceTokenKey(tokenIndex=", ", sentenceIndex=", ")");
    }
}
