package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.R$id;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class rt0 extends daa {

    /* JADX INFO: renamed from: e0 */
    public static final String[] f59782e0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: f0 */
    public static final ot0 f59783f0 = new ot0();

    /* JADX INFO: renamed from: g0 */
    public static final r90 f59784g0 = new r90(Matrix.class, "animatedTransform", 1);

    /* JADX INFO: renamed from: W */
    public static void m20774W(waa waaVar, boolean z) {
        Matrix matrix;
        View view = waaVar.f66571b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = waaVar.f66570a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(R$id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = pt0.f56777a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        m20774W(waaVar, false);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        m20774W(waaVar, true);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        if (waaVar == null) {
            return null;
        }
        HashMap map = waaVar.f66570a;
        if (waaVar2 == null) {
            return null;
        }
        HashMap map2 = waaVar2.f66570a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) waaVar2.f66571b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        r90 r90Var = f59784g0;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            us5 us5Var = vs5.f65857a;
            return ObjectAnimator.ofObject(imageView, r90Var, f59783f0, us5Var, us5Var);
        }
        if (matrix == null) {
            matrix = vs5.f65857a;
        }
        if (matrix2 == null) {
            matrix2 = vs5.f65857a;
        }
        r90Var.getClass();
        u04.m22374a(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, r90Var, new uaa(), matrix, matrix2);
        qt0 qt0Var = new qt0(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(qt0Var);
        objectAnimatorOfObject.addPauseListener(qt0Var);
        m10202a(qt0Var);
        return objectAnimatorOfObject;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public final String[] mo3045y() {
        return f59782e0;
    }
}
