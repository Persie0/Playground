package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vu7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final int f65944a;

    public vu7(int i) {
        this.f65944a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu7) && this.f65944a == ((vu7) obj).f65944a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65944a);
    }

    public final String toString() {
        return ux5.m22989l("PreviousLesson(lessonId=", this.f65944a, ")");
    }
}
