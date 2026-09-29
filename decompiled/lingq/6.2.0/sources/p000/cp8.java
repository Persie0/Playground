package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cp8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f34349a;

    public cp8(int i) {
        this.f34349a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp8) && this.f34349a == ((cp8) obj).f34349a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34349a);
    }

    public final String toString() {
        return ux5.m22989l("RemoveBlacklistCourse(coursePk=", this.f34349a, ")");
    }
}
