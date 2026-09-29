package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class yw9 {

    /* JADX INFO: renamed from: a */
    public final wa3 f70597a;

    /* JADX INFO: renamed from: b */
    public final fb2 f70598b;

    /* JADX INFO: renamed from: c */
    public final LayoutDirection f70599c;

    /* JADX INFO: renamed from: d */
    public final sq5 f70600d = new sq5(16);

    public yw9(wa3 wa3Var, fb2 fb2Var, LayoutDirection layoutDirection) {
        this.f70597a = wa3Var;
        this.f70598b = fb2Var;
        this.f70599c = layoutDirection;
    }

    /* JADX INFO: renamed from: a */
    public static rw9 m25367a(yw9 yw9Var, String str, vx9 vx9Var, long j, int i) {
        rw9 rw9Var;
        int i2 = (i & 4) != 0 ? 1 : 2;
        int i3 = (i & 16) != 0 ? Integer.MAX_VALUE : 1;
        LayoutDirection layoutDirection = yw9Var.f70599c;
        fb2 fb2Var = yw9Var.f70598b;
        wa3 wa3Var = yw9Var.f70597a;
        yw9Var.getClass();
        C3419on c3419on = new C3419on(str);
        sq5 sq5Var = yw9Var.f70600d;
        EmptyList emptyList = EmptyList.f47638a;
        qw9 qw9Var = new qw9(c3419on, vx9Var, emptyList, i3, true, i2, fb2Var, layoutDirection, wa3Var, j);
        rw9 rw9Var2 = null;
        if (sq5Var != null) {
            ml0 ml0Var = new ml0(qw9Var);
            ab9 ab9Var = (ab9) sq5Var.f61248b;
            if (ab9Var != null) {
                rw9Var = (rw9) ab9Var.m238d(ml0Var);
            } else if (fa4.m11650l((ml0) sq5Var.f61249c, ml0Var)) {
                rw9Var = (rw9) sq5Var.f61250d;
            }
            if (rw9Var != null && !rw9Var.f59976b.f66376a.mo13024a()) {
                rw9Var2 = rw9Var;
            }
        }
        if (rw9Var2 != null) {
            w46 w46Var = rw9Var2.f59976b;
            return new rw9(qw9Var, w46Var, dk1.m10426d(j, (((long) ((int) Math.ceil(w46Var.f66379d))) << 32) | (((long) ((int) Math.ceil(w46Var.f66380e))) & 4294967295L)));
        }
        w41 w41Var = new w41(c3419on, vz1.m23615W(vx9Var, layoutDirection), emptyList, fb2Var, wa3Var);
        int iM3803k = bk1.m3803k(j);
        int iM3801i = bk1.m3797e(j) ? bk1.m3801i(j) : Integer.MAX_VALUE;
        if (iM3803k != iM3801i) {
            iM3801i = l70.m15945h((int) Math.ceil(w41Var.mo13026c()), iM3803k, iM3801i);
        }
        w46 w46Var2 = new w46(w41Var, AbstractC3423or.m18278s(0, iM3801i, 0, bk1.m3800h(j)), i3, i2);
        rw9 rw9Var3 = new rw9(qw9Var, w46Var2, dk1.m10426d(j, (((long) ((int) Math.ceil(w46Var2.f66380e))) & 4294967295L) | (((long) ((int) Math.ceil(w46Var2.f66379d))) << 32)));
        if (sq5Var != null) {
            ab9 ab9Var2 = (ab9) sq5Var.f61248b;
            if (ab9Var2 != null) {
                ab9Var2.m240f(new ml0(qw9Var), rw9Var3);
                return rw9Var3;
            }
            sq5Var.f61249c = new ml0(qw9Var);
            sq5Var.f61250d = rw9Var3;
        }
        return rw9Var3;
    }
}
