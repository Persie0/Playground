package p387t0;

/* JADX INFO: renamed from: t0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9140d0 {

    /* JADX INFO: renamed from: a */
    public final int f47647a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9140d0) {
            return this.f47647a == ((C9140d0) obj).f47647a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47647a);
    }

    public final String toString() {
        int i10 = this.f47647a;
        boolean z10 = false;
        if (i10 == 0) {
            return "NonZero";
        }
        if (i10 == 1) {
            z10 = true;
        }
        return z10 ? "EvenOdd" : "Unknown";
    }
}
