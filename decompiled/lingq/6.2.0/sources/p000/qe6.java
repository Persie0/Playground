package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qe6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final hf6 f57651a;

    public qe6(hf6 hf6Var) {
        this.f57651a = hf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe6) && this.f57651a.equals(((qe6) obj).f57651a);
    }

    public final int hashCode() {
        return this.f57651a.hashCode();
    }

    public final String toString() {
        return "LibraryToDestination(destination=" + this.f57651a + ")";
    }
}
