package p000;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;

/* JADX INFO: loaded from: classes.dex */
public final class x83 {

    /* JADX INFO: renamed from: a */
    public final int f67926a;

    /* JADX INFO: renamed from: b */
    public final c93 f67927b;

    /* JADX INFO: renamed from: c */
    public final long f67928c;

    /* JADX INFO: renamed from: d */
    public final int f67929d;

    /* JADX INFO: renamed from: e */
    public final int f67930e;

    public x83(int i, c93 c93Var, long j, int i2, int i3) {
        this.f67926a = i;
        this.f67927b = c93Var;
        this.f67928c = j;
        this.f67929d = i2;
        this.f67930e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    /* JADX INFO: renamed from: a */
    public final up2 m24401a(w83 w83Var, boolean z, int i, int i2, int i3, int i4) {
        up2 up2Var;
        ct5 ct5Var;
        z74 z74Var;
        l87 l87Var;
        if (w83Var.f66512b) {
            c93 c93Var = this.f67927b;
            int i5 = b93.f8172a[c93Var.f9754a.ordinal()];
            boolean z2 = true;
            if (i5 == 1 || i5 == 2) {
                up2Var = null;
            } else {
                if (i5 != 3 && i5 != 4) {
                    gm5.m12750e();
                    return null;
                }
                if (z) {
                    ct5Var = c93Var.f9755b;
                    z74Var = c93Var.f9759f;
                    l87Var = c93Var.f9756c;
                } else {
                    ct5Var = (i < -1 || i2 < 0) ? null : c93Var.f9757d;
                    z74Var = c93Var.f9760g;
                    l87Var = c93Var.f9758e;
                }
                if (ct5Var == null) {
                    up2Var = null;
                } else {
                    z74Var.getClass();
                    up2Var = new up2(ct5Var, l87Var, z74Var.f71017a);
                }
            }
            if (up2Var != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (up2Var.f64164a >> 32)) < 0 || i4 >= this.f67926a))) {
                    z2 = false;
                }
                up2Var.f64165b = z2;
                return up2Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w83 m24402b(boolean z, int i, long j, z74 z74Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        int i5 = i3 + i4;
        if (z74Var == null) {
            return new w83(true, true);
        }
        long j3 = z74Var.f71017a;
        c93 c93Var = this.f67927b;
        if (c93Var.f9754a != FlowLayoutOverflow$OverflowType.Visible && (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0)) {
            return new w83(true, true);
        }
        int i6 = this.f67929d;
        int i7 = this.f67930e;
        long j4 = this.f67928c;
        int i8 = this.f67926a;
        if (i != 0) {
            if (i >= i8) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
            }
            return z2 ? new w83(true, true) : new w83(true, m24402b(z, 0, z74.m25484a(bk1.m3801i(j4), (((int) (j & j2)) - i7) - i4), new z74(z74.m25484a(((int) (j3 >> 32)) - i6, (int) (j3 & j2))), i2 + 1, i5, 0, true, false).f66512b);
        }
        j2 = 4294967295L;
        int i9 = (int) (j3 & j2);
        int iMax = Math.max(i4, i9) + i3;
        z74 z74VarM4405a = z3 ? null : c93Var.m4405a(i2, iMax, z);
        if (z74VarM4405a == null || (i + 1 < i8 && ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (z74VarM4405a.f71017a >> 32)) >= 0)) {
            return new w83(false, false);
        }
        if (z3) {
            return new w83(true, true);
        }
        boolean z4 = m24402b(false, 0, z74.m25484a(bk1.m3801i(j4), (((int) (j & j2)) - i7) - Math.max(i4, i9)), z74VarM4405a, i2 + 1, iMax, 0, true, true).f66512b;
        return new w83(z4, z4);
    }
}
