package p000;

import com.google.android.material.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class is5 extends rs5 {

    /* JADX INFO: renamed from: j0 */
    public static final int f44508j0 = R$attr.motionDurationLong1;

    /* JADX INFO: renamed from: k0 */
    public static final int f44509k0 = R$attr.motionEasingEmphasizedInterpolator;

    public is5(int i, boolean z) {
        iwa ea9Var;
        if (i == 0) {
            ea9Var = new ea9(z ? 8388613 : 8388611);
        } else if (i == 1) {
            ea9Var = new ea9(z ? 80 : 48);
        } else {
            if (i != 2) {
                C3386nv.m17626m(ux5.m22988k(i, "Invalid axis: "));
                throw null;
            }
            ea9Var = new mm8(z);
        }
        super(ea9Var, new hz2());
    }

    @Override // p000.rs5
    /* JADX INFO: renamed from: f0 */
    public final int mo4159f0(boolean z) {
        return f44508j0;
    }

    @Override // p000.rs5
    /* JADX INFO: renamed from: g0 */
    public final int mo4160g0(boolean z) {
        return f44509k0;
    }
}
