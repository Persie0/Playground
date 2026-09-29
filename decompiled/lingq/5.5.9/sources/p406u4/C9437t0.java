package p406u4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: u4.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C9437t0 extends C9435s0 {

    /* JADX INFO: renamed from: J */
    public static boolean f48408J = true;

    /* JADX INFO: renamed from: K */
    public static boolean f48409K = true;

    /* JADX INFO: renamed from: L */
    public static boolean f48410L = true;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: G */
    public void mo17835G(View view, Matrix matrix) {
        if (f48408J) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f48408J = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: H */
    public void mo17836H(View view, Matrix matrix) {
        if (f48409K) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f48409K = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: I */
    public void mo17837I(View view, Matrix matrix) {
        if (f48410L) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f48410L = false;
            }
        }
    }
}
