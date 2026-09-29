package androidx.compose.p017ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import dm.C5207g;
import p338qd.C8573r0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631i0 implements InterfaceC0625g0 {

    /* JADX INFO: renamed from: a */
    public final Matrix f4316a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f4317b = new int[2];

    @Override // androidx.compose.p017ui.platform.InterfaceC0625g0
    /* JADX INFO: renamed from: a */
    public void mo2355a(View view, float[] fArr) {
        C5207g.m11111f(view, "view");
        C5207g.m11111f(fArr, "matrix");
        Matrix matrix = this.f4316a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f4317b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        C8573r0.m16716b1(matrix, fArr);
    }
}
