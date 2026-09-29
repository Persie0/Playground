package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class iy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f44784a;

    public iy9(boolean z) {
        this.f44784a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy9) && this.f44784a == ((iy9) obj).f44784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44784a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateDockTokenPopup(docked=", ")", this.f44784a);
    }
}
