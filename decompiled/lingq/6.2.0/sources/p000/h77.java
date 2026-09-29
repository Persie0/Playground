package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h77 implements j77 {

    /* JADX INFO: renamed from: a */
    public final boolean f41885a;

    public h77(boolean z) {
        this.f41885a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h77) && this.f41885a == ((h77) obj).f41885a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41885a);
    }

    public final String toString() {
        return ux5.m22993p(new StringBuilder("Denied(shouldShowRationale="), this.f41885a, ')');
    }
}
