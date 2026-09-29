package androidx.compose.p017ui.platform;

import android.graphics.Matrix;
import android.view.View;
import dm.C5207g;
import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0628h0 implements InterfaceC0625g0 {

    /* JADX INFO: renamed from: a */
    public final int[] f4313a = new int[2];

    /* JADX INFO: renamed from: b */
    public final float[] f4314b = C7499b.m14961r();

    @Override // androidx.compose.p017ui.platform.InterfaceC0625g0
    /* JADX INFO: renamed from: a */
    public final void mo2355a(View view, float[] fArr) {
        C5207g.m11111f(view, "view");
        C5207g.m11111f(fArr, "matrix");
        C7499b.m14966t0(fArr);
        m2357c(view, fArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m2356b(float[] fArr, float f3, float f10) {
        float[] fArr2 = this.f4314b;
        C7499b.m14966t0(fArr2);
        C7499b.m14905G0(fArr2, f3, f10);
        AndroidComposeView_androidKt.m2302a(fArr, fArr2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2357c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m2357c((View) parent, fArr);
            m2356b(fArr, -view.getScrollX(), -view.getScrollY());
            m2356b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f4313a;
            view.getLocationInWindow(iArr);
            m2356b(fArr, -view.getScrollX(), -view.getScrollY());
            m2356b(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr2 = this.f4314b;
            C8573r0.m16716b1(matrix, fArr2);
            AndroidComposeView_androidKt.m2302a(fArr, fArr2);
        }
    }
}
