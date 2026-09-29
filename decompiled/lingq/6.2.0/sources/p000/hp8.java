package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hp8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f42744a;

    public hp8(int i) {
        this.f42744a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp8) && this.f42744a == ((hp8) obj).f42744a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42744a);
    }

    public final String toString() {
        return ux5.m22989l("UpdateCourseLike(coursePk=", this.f42744a, ")");
    }
}
