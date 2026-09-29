package p000;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;

/* JADX INFO: loaded from: classes.dex */
public final class c93 {

    /* JADX INFO: renamed from: a */
    public final FlowLayoutOverflow$OverflowType f9754a;

    /* JADX INFO: renamed from: b */
    public ct5 f9755b;

    /* JADX INFO: renamed from: c */
    public l87 f9756c;

    /* JADX INFO: renamed from: d */
    public ct5 f9757d;

    /* JADX INFO: renamed from: e */
    public l87 f9758e;

    /* JADX INFO: renamed from: f */
    public z74 f9759f;

    /* JADX INFO: renamed from: g */
    public z74 f9760g;

    public c93(FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType) {
        this.f9754a = flowLayoutOverflow$OverflowType;
    }

    /* JADX INFO: renamed from: a */
    public final z74 m4405a(int i, int i2, boolean z) {
        int i3 = b93.f8172a[this.f9754a.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f9759f;
            }
            return null;
        }
        if (i3 != 4) {
            gm5.m12750e();
            return null;
        }
        if (z) {
            return this.f9759f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f9760g;
    }

    /* JADX INFO: renamed from: b */
    public final void m4406b(ct5 ct5Var, ct5 ct5Var2, long j) {
        long jM4728m = ci8.m4728m(j, LayoutOrientation.Horizontal);
        if (ct5Var != null) {
            int iMo1512l = ct5Var.mo1512l(bk1.m3800h(jM4728m));
            this.f9759f = new z74(z74.m25484a(iMo1512l, ct5Var.mo1510U(iMo1512l)));
            this.f9755b = ct5Var;
            this.f9756c = null;
        }
        if (ct5Var2 != null) {
            int iMo1512l2 = ct5Var2.mo1512l(bk1.m3800h(jM4728m));
            this.f9760g = new z74(z74.m25484a(iMo1512l2, ct5Var2.mo1510U(iMo1512l2)));
            this.f9757d = ct5Var2;
            this.f9758e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c93) && this.f9754a == ((c93) obj).f9754a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + wq1.m24106b(0, this.f9754a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f9754a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
