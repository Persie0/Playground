package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jea implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f45490a;

    public /* synthetic */ jea(int i) {
        this.f45490a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fa4.m11651m(this.f45490a ^ Integer.MIN_VALUE, ((jea) obj).f45490a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jea) {
            return this.f45490a == ((jea) obj).f45490a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45490a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f45490a) & 4294967295L);
    }
}
