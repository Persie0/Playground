package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yra extends csa {

    /* JADX INFO: renamed from: a */
    public final int f70353a;

    public yra(int i) {
        this.f70353a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yra) && this.f70353a == ((yra) obj).f70353a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70353a);
    }

    public final String toString() {
        return ux5.m22989l("PreviousLesson(lessonId=", this.f70353a, ")");
    }
}
