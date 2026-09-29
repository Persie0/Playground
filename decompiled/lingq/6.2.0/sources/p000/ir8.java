package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ir8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final pq8 f44461a;

    public ir8(pq8 pq8Var) {
        this.f44461a = pq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir8) && this.f44461a.equals(((ir8) obj).f44461a);
    }

    public final int hashCode() {
        return this.f44461a.hashCode();
    }

    public final String toString() {
        return "OnCourseLikeClicked(item=" + this.f44461a + ")";
    }
}
