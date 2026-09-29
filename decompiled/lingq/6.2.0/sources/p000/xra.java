package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xra extends csa {

    /* JADX INFO: renamed from: a */
    public final int f68589a;

    public xra(int i) {
        this.f68589a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xra) && this.f68589a == ((xra) obj).f68589a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68589a);
    }

    public final String toString() {
        return ux5.m22989l("NextLesson(lessonId=", this.f68589a, ")");
    }
}
