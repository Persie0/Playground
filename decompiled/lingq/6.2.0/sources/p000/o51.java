package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final h81 f53857a;

    public o51(h81 h81Var) {
        h81Var.getClass();
        this.f53857a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o51) && fa4.m11650l(this.f53857a, ((o51) obj).f53857a);
    }

    public final int hashCode() {
        return this.f53857a.hashCode();
    }

    public final String toString() {
        return "OnLessonAddClicked(item=" + this.f53857a + ")";
    }
}
