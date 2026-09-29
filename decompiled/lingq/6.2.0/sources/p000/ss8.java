package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ss8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f61369a;

    public ss8(uq8 uq8Var) {
        this.f61369a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss8) && this.f61369a.equals(((ss8) obj).f61369a);
    }

    public final int hashCode() {
        return this.f61369a.hashCode();
    }

    public final String toString() {
        return "OnOpenLessonCourse(item=" + this.f61369a + ")";
    }
}
