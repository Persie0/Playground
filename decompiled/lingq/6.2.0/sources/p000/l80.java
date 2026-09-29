package p000;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l80 extends os3 {

    /* JADX INFO: renamed from: v0 */
    public int f49285v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public boolean f49286w0 = true;

    /* JADX INFO: renamed from: x0 */
    public int f49287x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public boolean f49288y0 = false;

    @Override // p000.vj1
    /* JADX INFO: renamed from: B */
    public final boolean mo12813B() {
        return this.f49288y0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: C */
    public final boolean mo12814C() {
        return this.f49288y0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m16017V() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f54931u0;
            if (i4 >= i) {
                break;
            }
            vj1 vj1Var = this.f54930t0[i4];
            if ((this.f49286w0 || vj1Var.mo12818c()) && ((((i2 = this.f49285v0) == 0 || i2 == 1) && !vj1Var.mo12813B()) || (((i3 = this.f49285v0) == 2 || i3 == 3) && !vj1Var.mo12814C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f54931u0; i5++) {
            vj1 vj1Var2 = this.f54930t0[i5];
            if (this.f49286w0 || vj1Var2.mo12818c()) {
                if (!z2) {
                    int i6 = this.f49285v0;
                    if (i6 == 0) {
                        iMax = vj1Var2.mo12819j(ConstraintAnchor$Type.LEFT).m3760d();
                    } else if (i6 == 1) {
                        iMax = vj1Var2.mo12819j(ConstraintAnchor$Type.RIGHT).m3760d();
                    } else if (i6 == 2) {
                        iMax = vj1Var2.mo12819j(ConstraintAnchor$Type.TOP).m3760d();
                    } else if (i6 == 3) {
                        iMax = vj1Var2.mo12819j(ConstraintAnchor$Type.BOTTOM).m3760d();
                    }
                    z2 = true;
                }
                int i7 = this.f49285v0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, vj1Var2.mo12819j(ConstraintAnchor$Type.LEFT).m3760d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, vj1Var2.mo12819j(ConstraintAnchor$Type.RIGHT).m3760d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, vj1Var2.mo12819j(ConstraintAnchor$Type.TOP).m3760d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, vj1Var2.mo12819j(ConstraintAnchor$Type.BOTTOM).m3760d());
                }
            }
        }
        int i8 = iMax + this.f49287x0;
        int i9 = this.f49285v0;
        if (i9 == 0 || i9 == 1) {
            m23308K(i8, i8);
        } else {
            m23309L(i8, i8);
        }
        this.f49288y0 = true;
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final int m16018W() {
        int i = this.f49285v0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: b */
    public final void mo10149b(gd5 gd5Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        bj1[] bj1VarArr = this.f65448Q;
        bj1 bj1Var = this.f65440I;
        bj1VarArr[0] = bj1Var;
        int i3 = 2;
        bj1 bj1Var2 = this.f65441J;
        bj1VarArr[2] = bj1Var2;
        bj1 bj1Var3 = this.f65442K;
        bj1VarArr[1] = bj1Var3;
        bj1 bj1Var4 = this.f65443L;
        bj1VarArr[3] = bj1Var4;
        for (bj1 bj1Var5 : bj1VarArr) {
            bj1Var5.f8585i = gd5Var.m12495k(bj1Var5);
        }
        int i4 = this.f49285v0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        bj1 bj1Var6 = bj1VarArr[i4];
        if (!this.f49288y0) {
            m16017V();
        }
        if (this.f49288y0) {
            this.f49288y0 = false;
            int i5 = this.f49285v0;
            if (i5 == 0 || i5 == 1) {
                gd5Var.m12488d(bj1Var.f8585i, this.f65457Z);
                gd5Var.m12488d(bj1Var3.f8585i, this.f65457Z);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    gd5Var.m12488d(bj1Var2.f8585i, this.f65459a0);
                    gd5Var.m12488d(bj1Var4.f8585i, this.f65459a0);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f54931u0) {
                z2 = false;
                break;
            }
            vj1 vj1Var = this.f54930t0[i6];
            if ((this.f49286w0 || vj1Var.mo12818c()) && ((((i2 = this.f49285v0) == 0 || i2 == 1) && vj1Var.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && vj1Var.f65440I.f8582f != null && vj1Var.f65442K.f8582f != null) || ((i2 == 2 || i2 == 3) && vj1Var.f65451T[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && vj1Var.f65441J.f8582f != null && vj1Var.f65443L.f8582f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = bj1Var.m3763g() || bj1Var3.m3763g();
        boolean z4 = bj1Var2.m3763g() || bj1Var4.m3763g();
        int i7 = !(!z2 && (((i = this.f49285v0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f54931u0) {
            vj1 vj1Var2 = this.f54930t0[i8];
            if (this.f49286w0 || vj1Var2.mo12818c()) {
                rd9 rd9VarM12495k = gd5Var.m12495k(vj1Var2.f65448Q[this.f49285v0]);
                bj1[] bj1VarArr2 = vj1Var2.f65448Q;
                int i9 = this.f49285v0;
                bj1 bj1Var7 = bj1VarArr2[i9];
                bj1Var7.f8585i = rd9VarM12495k;
                bj1 bj1Var8 = bj1Var7.f8582f;
                int i10 = (bj1Var8 == null || bj1Var8.f8580d != this) ? 0 : bj1Var7.f8583g;
                if (i9 == 0 || i9 == i3) {
                    rd9 rd9Var = bj1Var6.f8585i;
                    int i11 = this.f49287x0 - i10;
                    C3349mv c3349mvM12496l = gd5Var.m12496l();
                    rd9 rd9VarM12497m = gd5Var.m12497m();
                    rd9VarM12497m.f59129d = 0;
                    c3349mvM12496l.m17051c(rd9Var, rd9VarM12495k, rd9VarM12497m, i11);
                    gd5Var.m12487c(c3349mvM12496l);
                } else {
                    rd9 rd9Var2 = bj1Var6.f8585i;
                    int i12 = this.f49287x0 + i10;
                    C3349mv c3349mvM12496l2 = gd5Var.m12496l();
                    rd9 rd9VarM12497m2 = gd5Var.m12497m();
                    rd9VarM12497m2.f59129d = 0;
                    c3349mvM12496l2.m17050b(rd9Var2, rd9VarM12495k, rd9VarM12497m2, i12);
                    gd5Var.m12487c(c3349mvM12496l2);
                }
                gd5Var.m12489e(bj1Var6.f8585i, rd9VarM12495k, this.f49287x0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f49285v0;
        if (i13 == 0) {
            gd5Var.m12489e(bj1Var3.f8585i, bj1Var.f8585i, 0, 8);
            gd5Var.m12489e(bj1Var.f8585i, this.f65452U.f65442K.f8585i, 0, 4);
            gd5Var.m12489e(bj1Var.f8585i, this.f65452U.f65440I.f8585i, 0, 0);
            return;
        }
        if (i13 == 1) {
            gd5Var.m12489e(bj1Var.f8585i, bj1Var3.f8585i, 0, 8);
            gd5Var.m12489e(bj1Var.f8585i, this.f65452U.f65440I.f8585i, 0, 4);
            gd5Var.m12489e(bj1Var.f8585i, this.f65452U.f65442K.f8585i, 0, 0);
        } else if (i13 == 2) {
            gd5Var.m12489e(bj1Var4.f8585i, bj1Var2.f8585i, 0, 8);
            gd5Var.m12489e(bj1Var2.f8585i, this.f65452U.f65443L.f8585i, 0, 4);
            gd5Var.m12489e(bj1Var2.f8585i, this.f65452U.f65441J.f8585i, 0, 0);
        } else if (i13 == 3) {
            gd5Var.m12489e(bj1Var2.f8585i, bj1Var4.f8585i, 0, 8);
            gd5Var.m12489e(bj1Var2.f8585i, this.f65452U.f65441J.f8585i, 0, 4);
            gd5Var.m12489e(bj1Var2.f8585i, this.f65452U.f65443L.f8585i, 0, 0);
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: c */
    public final boolean mo12818c() {
        return true;
    }

    @Override // p000.os3, p000.vj1
    /* JADX INFO: renamed from: g */
    public final void mo10150g(vj1 vj1Var, HashMap map) {
        super.mo10150g(vj1Var, map);
        l80 l80Var = (l80) vj1Var;
        this.f49285v0 = l80Var.f49285v0;
        this.f49286w0 = l80Var.f49286w0;
        this.f49287x0 = l80Var.f49287x0;
    }

    @Override // p000.vj1
    public final String toString() {
        String strM17738m = AbstractC3393o1.m17738m(new StringBuilder("[Barrier] "), this.f65477j0, " {");
        for (int i = 0; i < this.f54931u0; i++) {
            vj1 vj1Var = this.f54930t0[i];
            if (i > 0) {
                strM17738m = strM17738m.concat(", ");
            }
            StringBuilder sbM22997t = ux5.m22997t(strM17738m);
            sbM22997t.append(vj1Var.f65477j0);
            strM17738m = sbM22997t.toString();
        }
        return strM17738m.concat("}");
    }
}
