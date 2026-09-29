package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y14 extends d24 {

    /* JADX INFO: renamed from: a */
    public final boolean f69091a;

    public y14(boolean z) {
        this.f69091a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y14) && this.f69091a == ((y14) obj).f69091a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69091a);
    }

    public final String toString() {
        return hn1.m13355e("OnAutoOpenChanged(enabled=", ")", this.f69091a);
    }
}
