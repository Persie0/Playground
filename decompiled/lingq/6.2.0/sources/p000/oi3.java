package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oi3 {

    /* JADX INFO: renamed from: a */
    public final long f54368a;

    /* JADX INFO: renamed from: b */
    public long f54369b;

    /* JADX INFO: renamed from: c */
    public int f54370c = 1;

    /* JADX INFO: renamed from: d */
    public final float f54371d;

    /* JADX INFO: renamed from: e */
    public final float f54372e;

    /* JADX INFO: renamed from: f */
    public final pi3 f54373f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f54374g;

    public oi3(long j, long j2, float f, float f2, pi3 pi3Var, ArrayList arrayList) {
        this.f54368a = j;
        this.f54369b = j2;
        this.f54371d = f;
        this.f54372e = f2;
        this.f54373f = pi3Var;
        this.f54374g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        return this.f54368a == oi3Var.f54368a && this.f54369b == oi3Var.f54369b && this.f54370c == oi3Var.f54370c && Float.compare(this.f54371d, oi3Var.f54371d) == 0 && Float.compare(this.f54372e, oi3Var.f54372e) == 0 && this.f54373f.equals(oi3Var.f54373f) && this.f54374g.equals(oi3Var.f54374g);
    }

    public final int hashCode() {
        return this.f54374g.hashCode() + ((this.f54373f.hashCode() + wq1.m24105a(wq1.m24105a(wq1.m24106b(this.f54370c, ux5.m22981d(this.f54369b, Long.hashCode(this.f54368a) * 31, 31), 31), this.f54371d, 31), this.f54372e, 31)) * 31);
    }

    public final String toString() {
        return "RageClickSession(firstClickTime=" + this.f54368a + ", lastClickTime=" + this.f54369b + ", clickCount=" + this.f54370c + ", firstClickX=" + this.f54371d + ", firstClickY=" + this.f54372e + ", targetInfo=" + this.f54373f + ", clicks=" + this.f54374g + ')';
    }
}
