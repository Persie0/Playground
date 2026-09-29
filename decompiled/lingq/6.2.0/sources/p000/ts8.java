package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ts8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f62826a;

    public ts8(uq8 uq8Var) {
        this.f62826a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts8) && this.f62826a.equals(((ts8) obj).f62826a);
    }

    public final int hashCode() {
        return this.f62826a.hashCode();
    }

    public final String toString() {
        return "OnOpenLessonInfo(item=" + this.f62826a + ")";
    }
}
