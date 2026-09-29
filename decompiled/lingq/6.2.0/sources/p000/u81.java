package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f63536a;

    public u81(h81 h81Var) {
        h81Var.getClass();
        this.f63536a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u81) && fa4.m11650l(this.f63536a, ((u81) obj).f63536a);
    }

    public final int hashCode() {
        return this.f63536a.hashCode();
    }

    public final String toString() {
        return "OnStartOrContinueCourse(item=" + this.f63536a + ")";
    }
}
