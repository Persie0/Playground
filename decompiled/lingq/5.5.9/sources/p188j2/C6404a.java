package p188j2;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: j2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6404a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Matrix> f36867a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<RectF> f36868b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m13029a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m13029a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
