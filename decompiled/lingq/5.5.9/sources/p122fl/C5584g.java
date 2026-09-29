package p122fl;

/* JADX INFO: renamed from: fl.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5584g {

    /* JADX INFO: renamed from: a */
    public final int f34397a;

    /* JADX INFO: renamed from: b */
    public final long f34398b;

    public C5584g(int i10, long j10) {
        this.f34397a = i10;
        this.f34398b = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5584g) {
                C5584g c5584g = (C5584g) obj;
                if (this.f34397a == c5584g.f34397a && this.f34398b == c5584g.f34398b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f34397a * 31;
        long j10 = this.f34398b;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "FileSliceInfo(slicingCount=" + this.f34397a + ", bytesPerFileSlice=" + this.f34398b + ")";
    }
}
