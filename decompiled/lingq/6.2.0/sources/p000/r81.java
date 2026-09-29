package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f58870a;

    public r81(h81 h81Var) {
        h81Var.getClass();
        this.f58870a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r81) && fa4.m11650l(this.f58870a, ((r81) obj).f58870a);
    }

    public final int hashCode() {
        return this.f58870a.hashCode();
    }

    public final String toString() {
        return "OnOpenLessonInfo(item=" + this.f58870a + ")";
    }
}
