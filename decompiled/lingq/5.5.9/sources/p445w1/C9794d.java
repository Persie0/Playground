package p445w1;

/* JADX INFO: renamed from: w1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9794d {

    /* JADX INFO: renamed from: a */
    public final int f49904a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9794d) {
            return this.f49904a == ((C9794d) obj).f49904a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49904a);
    }

    public final String toString() {
        int i10 = this.f49904a;
        boolean z10 = false;
        if (i10 == 1) {
            return "Hyphens.None";
        }
        if (i10 == 2) {
            z10 = true;
        }
        return z10 ? "Hyphens.Auto" : "Invalid";
    }
}
