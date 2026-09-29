package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g71 extends n71 {

    /* JADX INFO: renamed from: a */
    public final d71 f40308a;

    public g71(d71 d71Var) {
        this.f40308a = d71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g71) && this.f40308a.equals(((g71) obj).f40308a);
    }

    public final int hashCode() {
        return this.f40308a.hashCode();
    }

    public final String toString() {
        return "CourseHeader(state=" + this.f40308a + ")";
    }
}
