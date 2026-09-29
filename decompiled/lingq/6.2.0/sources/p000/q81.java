package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f57376a;

    public q81(h81 h81Var) {
        h81Var.getClass();
        this.f57376a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q81) && fa4.m11650l(this.f57376a, ((q81) obj).f57376a);
    }

    public final int hashCode() {
        return this.f57376a.hashCode();
    }

    public final String toString() {
        return "OnOpenLessonCourse(item=" + this.f57376a + ")";
    }
}
