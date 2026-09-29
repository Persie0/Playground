package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oea implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f54251a;

    public /* synthetic */ oea(long j) {
        this.f54251a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fa4.m11652n(this.f54251a ^ Long.MIN_VALUE, ((oea) obj).f54251a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oea) {
            return this.f54251a == ((oea) obj).f54251a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54251a);
    }

    public final String toString() {
        return dha.m10393e(10, this.f54251a);
    }
}
