package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fb7 extends j2c {

    /* JADX INFO: renamed from: e */
    public final int f38796e;

    public fb7(int i) {
        this.f38796e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb7) && this.f38796e == ((fb7) obj).f38796e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38796e);
    }

    public final String toString() {
        return ux5.m22989l("OnSeek(positionMs=", this.f38796e, ")");
    }
}
