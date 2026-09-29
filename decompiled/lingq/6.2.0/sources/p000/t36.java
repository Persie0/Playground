package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class t36 {

    /* JADX INFO: renamed from: a */
    public long f61795a;

    /* JADX INFO: renamed from: b */
    public long f61796b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f61797c;

    /* JADX INFO: renamed from: d */
    public int f61798d;

    /* JADX INFO: renamed from: e */
    public int f61799e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m21833a() {
        TimeInterpolator timeInterpolator = this.f61797c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0853cn.f10297b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t36)) {
            return false;
        }
        t36 t36Var = (t36) obj;
        if (this.f61795a == t36Var.f61795a && this.f61796b == t36Var.f61796b && this.f61798d == t36Var.f61798d && this.f61799e == t36Var.f61799e) {
            return m21833a().getClass().equals(t36Var.m21833a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f61795a;
        long j2 = this.f61796b;
        return ((((m21833a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f61798d) * 31) + this.f61799e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(t36.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f61795a);
        sb.append(" duration: ");
        sb.append(this.f61796b);
        sb.append(" interpolator: ");
        sb.append(m21833a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f61798d);
        sb.append(" repeatMode: ");
        return wq1.m24123s(sb, this.f61799e, "}\n");
    }
}
