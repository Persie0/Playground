package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import p000.d32;
import p000.dh9;
import p000.lj7;
import p000.p84;
import p000.pk9;
import p000.q84;
import p000.q93;
import p000.rv3;
import p000.t66;
import p000.tj3;
import p000.u91;
import p000.v56;
import p000.we1;
import p000.wq1;
import p000.xj2;
import p000.xk2;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0233h {

    /* JADX INFO: renamed from: a */
    public final float f3426a;

    /* JADX INFO: renamed from: b */
    public final float f3427b;

    /* JADX INFO: renamed from: c */
    public final float f3428c;

    /* JADX INFO: renamed from: d */
    public final float f3429d;

    /* JADX INFO: renamed from: e */
    public final float f3430e;

    /* JADX INFO: renamed from: f */
    public final float f3431f;

    public C0233h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3426a = f;
        this.f3427b = f2;
        this.f3428c = f3;
        this.f3429d = f4;
        this.f3430e = f5;
        this.f3431f = f6;
    }

    /* JADX INFO: renamed from: a */
    public final dh9 m1157a(boolean z, v56 v56Var, ye1 ye1Var, int i) {
        C0059a c0059a;
        dh9 dh9Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(-1763481333);
        float f = this.f3426a;
        p84 p84Var = we1.f66679a;
        if (v56Var == null) {
            tj3Var.m22111b0(167726411);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(new xj2(f));
                tj3Var.m22131l0(objM22097O);
            }
            dh9Var = (t66) objM22097O;
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(167799447);
            tj3Var.m22139q(false);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new SnapshotStateList();
                tj3Var.m22131l0(objM22097O2);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objM22097O2;
            boolean z2 = true;
            boolean z3 = (((i & 112) ^ 48) > 32 && tj3Var.m22120g(v56Var)) || (i & 48) == 32;
            Object objM22097O3 = tj3Var.m22097O();
            if (z3 || objM22097O3 == p84Var) {
                objM22097O3 = new CardElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O3, v56Var);
            q84 q84Var = (q84) u91.m22598P0(snapshotStateList);
            if (!z) {
                f = this.f3431f;
            } else if (q84Var instanceof lj7) {
                f = this.f3427b;
            } else if (q84Var instanceof rv3) {
                f = this.f3429d;
            } else if (q84Var instanceof q93) {
                f = this.f3428c;
            } else if (q84Var instanceof xk2) {
                f = this.f3430e;
            }
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new C0059a(new xj2(f), pk9.f56365j, null, 12);
                tj3Var.m22131l0(objM22097O4);
            }
            C0059a c0059a2 = (C0059a) objM22097O4;
            xj2 xj2Var = new xj2(f);
            boolean zM22124i = tj3Var.m22124i(c0059a2) | tj3Var.m22114d(f) | ((((i & 14) ^ 6) > 4 && tj3Var.m22122h(z)) || (i & 6) == 4);
            if ((((i & 896) ^ 384) <= 256 || !tj3Var.m22120g(this)) && (i & 384) != 256) {
                z2 = false;
            }
            boolean zM22124i2 = zM22124i | z2 | tj3Var.m22124i(q84Var);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                c0059a = c0059a2;
                CardElevation$animateElevation$2$1 cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(c0059a, f, z, this, q84Var, null);
                tj3Var.m22131l0(cardElevation$animateElevation$2$1);
                objM22097O5 = cardElevation$animateElevation$2$1;
            } else {
                c0059a = c0059a2;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O5, xj2Var);
            dh9Var = c0059a.f1540c;
        }
        tj3Var.m22139q(false);
        return dh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0233h)) {
            return false;
        }
        C0233h c0233h = (C0233h) obj;
        return xj2.m24560b(this.f3426a, c0233h.f3426a) && xj2.m24560b(this.f3427b, c0233h.f3427b) && xj2.m24560b(this.f3428c, c0233h.f3428c) && xj2.m24560b(this.f3429d, c0233h.f3429d) && xj2.m24560b(this.f3431f, c0233h.f3431f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3431f) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f3426a) * 31, this.f3427b, 31), this.f3428c, 31), this.f3429d, 31);
    }
}
