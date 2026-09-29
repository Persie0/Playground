package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ry9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f60049a;

    public ry9(boolean z) {
        this.f60049a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry9) && this.f60049a == ((ry9) obj).f60049a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60049a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateStatusBar(enabled=", ")", this.f60049a);
    }
}
