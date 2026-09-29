package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zu0 {

    /* JADX INFO: renamed from: a */
    public final float f72167a;

    /* JADX INFO: renamed from: b */
    public final float f72168b;

    /* JADX INFO: renamed from: c */
    public final float f72169c;

    public zu0(float f, float f2, float f3) {
        this.f72167a = f;
        this.f72168b = f2;
        this.f72169c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0)) {
            return false;
        }
        zu0 zu0Var = (zu0) obj;
        return Float.compare(this.f72167a, zu0Var.f72167a) == 0 && Float.compare(this.f72168b, zu0Var.f72168b) == 0 && Float.compare(this.f72169c, zu0Var.f72169c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f72169c) + wq1.m24105a(Float.hashCode(this.f72167a) * 31, this.f72168b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartCurveData(animationProgress=");
        sb.append(this.f72167a);
        sb.append(", primaryReach=");
        sb.append(this.f72168b);
        sb.append(", secondaryReach=");
        return wq1.m24121q(sb, this.f72169c, ")");
    }
}
