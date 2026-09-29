package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ks7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final e28 f48391a;

    public ks7(e28 e28Var) {
        e28Var.getClass();
        this.f48391a = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks7) && fa4.m11650l(this.f48391a, ((ks7) obj).f48391a);
    }

    public final int hashCode() {
        return this.f48391a.hashCode();
    }

    public final String toString() {
        return "PlayButtonPositioned(bounds=" + this.f48391a + ")";
    }
}
