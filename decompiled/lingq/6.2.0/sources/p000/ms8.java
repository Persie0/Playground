package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ms8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final pq8 f51807a;

    public ms8(pq8 pq8Var) {
        this.f51807a = pq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms8) && this.f51807a.equals(((ms8) obj).f51807a);
    }

    public final int hashCode() {
        return this.f51807a.hashCode();
    }

    public final String toString() {
        return "OnAddCourseToPlaylist(item=" + this.f51807a + ")";
    }
}
