package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lta {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f50120a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f50121b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m16542a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            View view2 = (View) parent;
            m16542a(coordinatorLayout, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
