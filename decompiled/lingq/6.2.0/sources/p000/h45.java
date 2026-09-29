package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h45 implements q45 {

    /* JADX INFO: renamed from: a */
    public final int f41775a;

    public h45(int i) {
        this.f41775a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h45) && this.f41775a == ((h45) obj).f41775a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41775a);
    }

    public final String toString() {
        return ux5.m22989l("ConfirmPrivateLessonLike(lessonId=", this.f41775a, ")");
    }
}
