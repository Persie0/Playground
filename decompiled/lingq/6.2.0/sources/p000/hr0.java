package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a */
    public final double f42816a;

    /* JADX INFO: renamed from: b */
    public final double f42817b;

    /* JADX INFO: renamed from: c */
    public final String f42818c;

    /* JADX INFO: renamed from: d */
    public final int f42819d;

    public hr0(double d, double d2, int i, String str) {
        this.f42816a = d;
        this.f42817b = d2;
        this.f42818c = str;
        this.f42819d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr0)) {
            return false;
        }
        hr0 hr0Var = (hr0) obj;
        return Double.compare(this.f42816a, hr0Var.f42816a) == 0 && Double.compare(this.f42817b, hr0Var.f42817b) == 0 && this.f42818c.equals(hr0Var.f42818c) && this.f42819d == hr0Var.f42819d;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + wq1.m24106b(this.f42819d, ux5.m22980c(g9a.m12424a(this.f42817b, Double.hashCode(this.f42816a) * 31, 31), this.f42818c, 31), 31);
    }

    public final String toString() {
        return "ChallengeGoal(progress=" + this.f42816a + ", goal=" + this.f42817b + ", title=" + this.f42818c + ", progressColor=" + this.f42819d + ", numberOfFields=0)";
    }
}
