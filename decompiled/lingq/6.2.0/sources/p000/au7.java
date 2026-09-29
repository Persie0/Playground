package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class au7 extends zic {

    /* JADX INFO: renamed from: c */
    public final boolean f7520c;

    public au7(boolean z) {
        this.f7520c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au7) && this.f7520c == ((au7) obj).f7520c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7520c);
    }

    public final String toString() {
        return hn1.m13355e("WordTapped(isKnown=", ")", this.f7520c);
    }
}
