package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i71 extends n71 {

    /* JADX INFO: renamed from: a */
    public final f71 f43615a;

    public i71(f71 f71Var) {
        this.f43615a = f71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i71) && this.f43615a.equals(((i71) obj).f43615a);
    }

    public final int hashCode() {
        return this.f43615a.hashCode();
    }

    public final String toString() {
        return "CourseInfo(state=" + this.f43615a + ")";
    }
}
