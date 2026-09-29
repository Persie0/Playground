package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dv7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final int f36272a;

    public dv7(int i) {
        this.f36272a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv7) && this.f36272a == ((dv7) obj).f36272a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36272a);
    }

    public final String toString() {
        return ux5.m22989l("SwitchLesson(lessonId=", this.f36272a, ")");
    }
}
