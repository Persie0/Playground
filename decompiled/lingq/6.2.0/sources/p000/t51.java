package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final h81 f61872a;

    public t51(h81 h81Var) {
        h81Var.getClass();
        this.f61872a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t51) && fa4.m11650l(this.f61872a, ((t51) obj).f61872a);
    }

    public final int hashCode() {
        return this.f61872a.hashCode();
    }

    public final String toString() {
        return "OnLessonUpdateIsTakenClicked(item=" + this.f61872a + ")";
    }
}
