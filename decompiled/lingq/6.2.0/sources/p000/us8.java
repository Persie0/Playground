package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class us8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final pq8 f64297a;

    public us8(pq8 pq8Var) {
        this.f64297a = pq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us8) && this.f64297a.equals(((us8) obj).f64297a);
    }

    public final int hashCode() {
        return this.f64297a.hashCode();
    }

    public final String toString() {
        return "OnReportCourse(item=" + this.f64297a + ")";
    }
}
