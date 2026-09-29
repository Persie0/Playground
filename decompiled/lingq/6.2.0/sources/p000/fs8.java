package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fs8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final int f39593a;

    public fs8(int i) {
        this.f39593a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs8) && this.f39593a == ((fs8) obj).f39593a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39593a);
    }

    public final String toString() {
        return ux5.m22989l("OnUndoCourseBlacklist(courseId=", this.f39593a, ")");
    }
}
