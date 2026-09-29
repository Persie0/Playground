package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final nd8 f66619a;

    public wc8(nd8 nd8Var) {
        this.f66619a = nd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc8) && this.f66619a.equals(((wc8) obj).f66619a);
    }

    public final int hashCode() {
        return this.f66619a.f52624a.hashCode();
    }

    public final String toString() {
        return "Matching(state=" + this.f66619a + ")";
    }
}
