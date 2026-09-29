package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class is1 {

    /* JADX INFO: renamed from: a */
    public final int f44479a;

    /* JADX INFO: renamed from: b */
    public final int f44480b;

    /* JADX INFO: renamed from: c */
    public final boolean f44481c;

    public is1(int i, int i2, boolean z) {
        this.f44479a = i;
        this.f44480b = i2;
        this.f44481c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is1)) {
            return false;
        }
        is1 is1Var = (is1) obj;
        return this.f44479a == is1Var.f44479a && this.f44480b == is1Var.f44480b && this.f44481c == is1Var.f44481c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44481c) + wq1.m24106b(this.f44480b, Integer.hashCode(this.f44479a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f44479a, this.f44480b, "CupActiveDayBadge(tier=", ", thresholdDays=", ", earned="), this.f44481c, ")");
    }
}
