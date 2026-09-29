package p406u4;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: u4.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9443w0 extends C9441v0 {
    @Override // p406u4.C9441v0, p338qd.C8584v
    /* JADX INFO: renamed from: B */
    public final void mo16802B(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p406u4.C9435s0
    /* JADX INFO: renamed from: E */
    public final float mo17833E(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p406u4.C9435s0
    /* JADX INFO: renamed from: F */
    public final void mo17834F(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // p406u4.C9437t0
    /* JADX INFO: renamed from: G */
    public final void mo17835G(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p406u4.C9437t0
    /* JADX INFO: renamed from: H */
    public final void mo17836H(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p406u4.C9437t0
    /* JADX INFO: renamed from: I */
    public final void mo17837I(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p406u4.C9439u0
    /* JADX INFO: renamed from: J */
    public final void mo17839J(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
