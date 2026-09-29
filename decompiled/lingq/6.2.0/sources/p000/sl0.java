package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class sl0 {

    /* JADX INFO: renamed from: a */
    public final Matrix f60969a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f60970b = new int[2];

    /* JADX INFO: renamed from: a */
    public void m21444a(View view, float[] fArr) {
        Matrix matrix = this.f60969a;
        matrix.reset();
        View view2 = view;
        view2.transformMatrixToGlobal(matrix);
        ViewParent parent = view2.getParent();
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        int[] iArr = this.f60970b;
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }
}
