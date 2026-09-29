package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cm4 extends em4 {

    /* JADX INFO: renamed from: a */
    public final int f10267a;

    public cm4(int i) {
        this.f10267a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm4) && this.f10267a == ((cm4) obj).f10267a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10267a);
    }

    public final String toString() {
        return ux5.m22989l("Header(title=", this.f10267a, ")");
    }
}
