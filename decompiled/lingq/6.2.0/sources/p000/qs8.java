package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qs8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final pq8 f58146a;

    public qs8(pq8 pq8Var) {
        this.f58146a = pq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs8) && this.f58146a.equals(((qs8) obj).f58146a);
    }

    public final int hashCode() {
        return this.f58146a.hashCode();
    }

    public final String toString() {
        return "OnOpenCourse(item=" + this.f58146a + ")";
    }
}
