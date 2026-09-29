package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k71 extends n71 {

    /* JADX INFO: renamed from: a */
    public final h81 f46806a;

    public k71(h81 h81Var) {
        h81Var.getClass();
        this.f46806a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k71) && fa4.m11650l(this.f46806a, ((k71) obj).f46806a);
    }

    public final int hashCode() {
        return this.f46806a.hashCode();
    }

    public final String toString() {
        return "Lesson(state=" + this.f46806a + ")";
    }
}
