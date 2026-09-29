package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ne8 extends oe8 {

    /* JADX INFO: renamed from: a */
    public final int f52654a;

    public ne8(int i) {
        this.f52654a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne8) && this.f52654a == ((ne8) obj).f52654a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52654a);
    }

    public final String toString() {
        return ux5.m22989l("Title(title=", this.f52654a, ")");
    }
}
