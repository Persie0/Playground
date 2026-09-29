package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: loaded from: classes.dex */
public abstract class ewa extends os3 {

    /* JADX INFO: renamed from: v0 */
    public int f38005v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public int f38006w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public int f38007x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f38008y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f38009z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public int f37999A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public boolean f38000B0 = false;

    /* JADX INFO: renamed from: C0 */
    public int f38001C0 = 0;

    /* JADX INFO: renamed from: D0 */
    public int f38002D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public final ua0 f38003E0 = new ua0();

    /* JADX INFO: renamed from: F0 */
    public ij1 f38004F0 = null;

    @Override // p000.os3
    /* JADX INFO: renamed from: U */
    public final void mo11369U() {
        for (int i = 0; i < this.f54931u0; i++) {
            vj1 vj1Var = this.f54930t0[i];
            if (vj1Var != null) {
                vj1Var.f65437F = true;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo10146V(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: W */
    public final void m11370W(vj1 vj1Var, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        ij1 ij1Var;
        vj1 vj1Var2;
        while (true) {
            ij1Var = this.f38004F0;
            if (ij1Var != null || (vj1Var2 = this.f65452U) == null) {
                break;
            } else {
                this.f38004F0 = ((wj1) vj1Var2).f66921x0;
            }
        }
        ua0 ua0Var = this.f38003E0;
        ua0Var.f63626a = constraintWidget$DimensionBehaviour;
        ua0Var.f63627b = constraintWidget$DimensionBehaviour2;
        ua0Var.f63628c = i;
        ua0Var.f63629d = i2;
        ij1Var.m13942b(vj1Var, ua0Var);
        vj1Var.m23313P(ua0Var.f63630e);
        vj1Var.m23310M(ua0Var.f63631f);
        vj1Var.f65436E = ua0Var.f63633h;
        vj1Var.m23307J(ua0Var.f63632g);
    }
}
