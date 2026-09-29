package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f51770a;

    public mr8(uq8 uq8Var) {
        this.f51770a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr8) && this.f51770a.equals(((mr8) obj).f51770a);
    }

    public final int hashCode() {
        return this.f51770a.hashCode();
    }

    public final String toString() {
        return "OnLessonBlacklistSource(item=" + this.f51770a + ")";
    }
}
