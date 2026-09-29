package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final h81 f55588a;

    public p51(h81 h81Var) {
        h81Var.getClass();
        this.f55588a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p51) && fa4.m11650l(this.f55588a, ((p51) obj).f55588a);
    }

    public final int hashCode() {
        return this.f55588a.hashCode();
    }

    public final String toString() {
        return "OnLessonBlacklistSource(item=" + this.f55588a + ")";
    }
}
