package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qt7 extends zic {

    /* JADX INFO: renamed from: c */
    public final int f58190c;

    public qt7(int i) {
        this.f58190c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt7) && this.f58190c == ((qt7) obj).f58190c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58190c);
    }

    public final String toString() {
        return ux5.m22989l("CardTapped(cardStatus=", this.f58190c, ")");
    }
}
