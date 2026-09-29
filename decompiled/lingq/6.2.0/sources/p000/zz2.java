package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zz2 extends e03 {

    /* JADX INFO: renamed from: a */
    public final boolean f72420a;

    public zz2(boolean z) {
        this.f72420a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz2) && this.f72420a == ((zz2) obj).f72420a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72420a);
    }

    public final String toString() {
        return hn1.m13355e("Empty(noResults=", ")", this.f72420a);
    }
}
