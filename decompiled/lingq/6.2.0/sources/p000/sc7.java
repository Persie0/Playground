package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final int f60682a;

    public sc7(int i) {
        this.f60682a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc7) && this.f60682a == ((sc7) obj).f60682a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60682a);
    }

    public final String toString() {
        return ux5.m22989l("OnGenerateLesson(lessonId=", this.f60682a, ")");
    }
}
