package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mz1 implements nz1 {

    /* JADX INFO: renamed from: a */
    public final int f52059a;

    public mz1(int i) {
        this.f52059a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz1) && this.f52059a == ((mz1) obj).f52059a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52059a);
    }

    public final String toString() {
        return ux5.m22989l("Resource(resId=", this.f52059a, ")");
    }
}
