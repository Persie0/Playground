package p000;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gq3 extends vj1 {

    /* JADX INFO: renamed from: t0 */
    public float f41179t0 = -1.0f;

    /* JADX INFO: renamed from: u0 */
    public int f41180u0 = -1;

    /* JADX INFO: renamed from: v0 */
    public int f41181v0 = -1;

    /* JADX INFO: renamed from: w0 */
    public bj1 f41182w0 = this.f65441J;

    /* JADX INFO: renamed from: x0 */
    public int f41183x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public boolean f41184y0;

    public gq3() {
        this.f65449R.clear();
        this.f65449R.add(this.f41182w0);
        int length = this.f65448Q.length;
        for (int i = 0; i < length; i++) {
            this.f65448Q[i] = this.f41182w0;
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: B */
    public final boolean mo12813B() {
        return this.f41184y0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: C */
    public final boolean mo12814C() {
        return this.f41184y0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: R */
    public final void mo12815R(gd5 gd5Var, boolean z) {
        if (this.f65452U == null) {
            return;
        }
        bj1 bj1Var = this.f41182w0;
        gd5Var.getClass();
        int iM12484n = gd5.m12484n(bj1Var);
        if (this.f41183x0 == 1) {
            this.f65457Z = iM12484n;
            this.f65459a0 = 0;
            m23310M(this.f65452U.m23322l());
            m23313P(0);
            return;
        }
        this.f65457Z = 0;
        this.f65459a0 = iM12484n;
        m23313P(this.f65452U.m23326r());
        m23310M(0);
    }

    /* JADX INFO: renamed from: S */
    public final void m12816S(int i) {
        this.f41182w0.m3768l(i);
        this.f41184y0 = true;
    }

    /* JADX INFO: renamed from: T */
    public final void m12817T(int i) {
        if (this.f41183x0 == i) {
            return;
        }
        this.f41183x0 = i;
        ArrayList arrayList = this.f65449R;
        arrayList.clear();
        if (this.f41183x0 == 1) {
            this.f41182w0 = this.f65440I;
        } else {
            this.f41182w0 = this.f65441J;
        }
        arrayList.add(this.f41182w0);
        bj1[] bj1VarArr = this.f65448Q;
        int length = bj1VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bj1VarArr[i2] = this.f41182w0;
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: b */
    public final void mo10149b(gd5 gd5Var, boolean z) {
        wj1 wj1Var = (wj1) this.f65452U;
        if (wj1Var == null) {
            return;
        }
        Object objMo12819j = wj1Var.mo12819j(ConstraintAnchor$Type.LEFT);
        Object objMo12819j2 = wj1Var.mo12819j(ConstraintAnchor$Type.RIGHT);
        vj1 vj1Var = this.f65452U;
        boolean z2 = vj1Var != null && vj1Var.f65451T[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (this.f41183x0 == 0) {
            objMo12819j = wj1Var.mo12819j(ConstraintAnchor$Type.TOP);
            objMo12819j2 = wj1Var.mo12819j(ConstraintAnchor$Type.BOTTOM);
            vj1 vj1Var2 = this.f65452U;
            z2 = vj1Var2 != null && vj1Var2.f65451T[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f41184y0) {
            bj1 bj1Var = this.f41182w0;
            if (bj1Var.f8579c) {
                rd9 rd9VarM12495k = gd5Var.m12495k(bj1Var);
                gd5Var.m12488d(rd9VarM12495k, this.f41182w0.m3760d());
                if (this.f41180u0 != -1) {
                    if (z2) {
                        gd5Var.m12490f(gd5Var.m12495k(objMo12819j2), rd9VarM12495k, 0, 5);
                    }
                } else if (this.f41181v0 != -1 && z2) {
                    rd9 rd9VarM12495k2 = gd5Var.m12495k(objMo12819j2);
                    gd5Var.m12490f(rd9VarM12495k, gd5Var.m12495k(objMo12819j), 0, 5);
                    gd5Var.m12490f(rd9VarM12495k2, rd9VarM12495k, 0, 5);
                }
                this.f41184y0 = false;
                return;
            }
        }
        if (this.f41180u0 != -1) {
            rd9 rd9VarM12495k3 = gd5Var.m12495k(this.f41182w0);
            gd5Var.m12489e(rd9VarM12495k3, gd5Var.m12495k(objMo12819j), this.f41180u0, 8);
            if (z2) {
                gd5Var.m12490f(gd5Var.m12495k(objMo12819j2), rd9VarM12495k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f41181v0 != -1) {
            rd9 rd9VarM12495k4 = gd5Var.m12495k(this.f41182w0);
            rd9 rd9VarM12495k5 = gd5Var.m12495k(objMo12819j2);
            gd5Var.m12489e(rd9VarM12495k4, rd9VarM12495k5, -this.f41181v0, 8);
            if (z2) {
                gd5Var.m12490f(rd9VarM12495k4, gd5Var.m12495k(objMo12819j), 0, 5);
                gd5Var.m12490f(rd9VarM12495k5, rd9VarM12495k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f41179t0 != -1.0f) {
            rd9 rd9VarM12495k6 = gd5Var.m12495k(this.f41182w0);
            rd9 rd9VarM12495k7 = gd5Var.m12495k(objMo12819j2);
            float f = this.f41179t0;
            C3349mv c3349mvM12496l = gd5Var.m12496l();
            c3349mvM12496l.f51873d.m9908g(rd9VarM12495k6, -1.0f);
            c3349mvM12496l.f51873d.m9908g(rd9VarM12495k7, f);
            gd5Var.m12487c(c3349mvM12496l);
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: c */
    public final boolean mo12818c() {
        return true;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: g */
    public final void mo10150g(vj1 vj1Var, HashMap map) {
        super.mo10150g(vj1Var, map);
        gq3 gq3Var = (gq3) vj1Var;
        this.f41179t0 = gq3Var.f41179t0;
        this.f41180u0 = gq3Var.f41180u0;
        this.f41181v0 = gq3Var.f41181v0;
        m12817T(gq3Var.f41183x0);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: j */
    public final bj1 mo12819j(ConstraintAnchor$Type constraintAnchor$Type) {
        int i = fq3.f39453a[constraintAnchor$Type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f41183x0 == 1) {
                return this.f41182w0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f41183x0 == 0) {
            return this.f41182w0;
        }
        return null;
    }
}
