package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hj9 {

    /* JADX INFO: renamed from: a */
    public final int f42500a;

    /* JADX INFO: renamed from: b */
    public final int f42501b;

    /* JADX INFO: renamed from: c */
    public final int f42502c;

    public hj9(int i, int i2, int i3) {
        this.f42500a = i;
        this.f42501b = i2;
        this.f42502c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj9)) {
            return false;
        }
        hj9 hj9Var = (hj9) obj;
        return this.f42500a == hj9Var.f42500a && this.f42501b == hj9Var.f42501b && this.f42502c == hj9Var.f42502c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42502c) + wq1.m24106b(this.f42501b, Integer.hashCode(this.f42500a) * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22994q(this.f42500a, this.f42501b, "StreakActivityLevelState(count=", ", goal=", ", activityId="), this.f42502c, ")");
    }
}
