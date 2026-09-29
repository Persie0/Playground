package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final pq8 f39533a;

    public fr8(pq8 pq8Var) {
        this.f39533a = pq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr8) && this.f39533a.equals(((fr8) obj).f39533a);
    }

    public final int hashCode() {
        return this.f39533a.hashCode();
    }

    public final String toString() {
        return "OnCourseBlacklistClicked(item=" + this.f39533a + ")";
    }
}
