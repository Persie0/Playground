package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tu7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final int f62914a;

    public tu7(int i) {
        this.f62914a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu7) && this.f62914a == ((tu7) obj).f62914a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62914a);
    }

    public final String toString() {
        return ux5.m22989l("NextLesson(lessonId=", this.f62914a, ")");
    }
}
