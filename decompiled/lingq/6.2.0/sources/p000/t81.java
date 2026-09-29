package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f61974a;

    public t81(h81 h81Var) {
        h81Var.getClass();
        this.f61974a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t81) && fa4.m11650l(this.f61974a, ((t81) obj).f61974a);
    }

    public final int hashCode() {
        return this.f61974a.hashCode();
    }

    public final String toString() {
        return "OnReportLesson(item=" + this.f61974a + ")";
    }
}
