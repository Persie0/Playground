package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class yn5 implements bo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f70104a;

    public yn5(boolean z) {
        this.f70104a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn5) && this.f70104a == ((yn5) obj).f70104a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70104a);
    }

    public final String toString() {
        return hn1.m13355e("SetDarkMode(enabled=", ")", this.f70104a);
    }
}
