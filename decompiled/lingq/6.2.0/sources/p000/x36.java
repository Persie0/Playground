package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x36 {

    /* JADX INFO: renamed from: a */
    public final long f67722a;

    /* JADX INFO: renamed from: b */
    public final long f67723b;

    /* JADX INFO: renamed from: c */
    public final boolean f67724c;

    public x36(long j, long j2, boolean z) {
        this.f67722a = j;
        this.f67723b = j2;
        this.f67724c = z;
    }

    /* JADX INFO: renamed from: a */
    public final x36 m24253a(x36 x36Var) {
        return new x36(gq6.m12825f(this.f67722a, x36Var.f67722a), Math.max(this.f67723b, x36Var.f67723b), this.f67724c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x36)) {
            return false;
        }
        x36 x36Var = (x36) obj;
        return gq6.m12821b(this.f67722a, x36Var.f67722a) && this.f67723b == x36Var.f67723b && this.f67724c == x36Var.f67724c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67724c) + ux5.m22981d(this.f67723b, Long.hashCode(this.f67722a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) gq6.m12827h(this.f67722a));
        sb.append(", timeMillis=");
        sb.append(this.f67723b);
        sb.append(", shouldApplyImmediately=");
        return ux5.m22993p(sb, this.f67724c, ')');
    }
}
