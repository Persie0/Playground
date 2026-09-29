package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f50046a;

    public lr8(uq8 uq8Var) {
        this.f50046a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr8) && this.f50046a.equals(((lr8) obj).f50046a);
    }

    public final int hashCode() {
        return this.f50046a.hashCode();
    }

    public final String toString() {
        return "OnLessonAddClicked(item=" + this.f50046a + ")";
    }
}
