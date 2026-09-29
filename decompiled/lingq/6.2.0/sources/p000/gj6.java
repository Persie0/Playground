package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gj6 extends pb1 {

    /* JADX INFO: renamed from: m */
    public final zi6 f40876m;

    public gj6(zi6 zi6Var) {
        zi6Var.getClass();
        this.f40876m = zi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gj6.class == obj.getClass() && fa4.m11650l(this.f40876m, ((gj6) obj).f40876m);
    }

    public final int hashCode() {
        return this.f40876m.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f40876m + ", direction=-1)";
    }
}
