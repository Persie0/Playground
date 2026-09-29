package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f56729a;

    public pr8(uq8 uq8Var) {
        this.f56729a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr8) && this.f56729a.equals(((pr8) obj).f56729a);
    }

    public final int hashCode() {
        return this.f56729a.hashCode();
    }

    public final String toString() {
        return "OnLessonUpdateIsTakenClicked(item=" + this.f56729a + ")";
    }
}
