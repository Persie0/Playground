package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.R$id;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xt0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f68674a;

    /* JADX INFO: renamed from: b */
    public final Matrix f68675b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final boolean f68676c;

    /* JADX INFO: renamed from: d */
    public final boolean f68677d;

    /* JADX INFO: renamed from: e */
    public final View f68678e;

    /* JADX INFO: renamed from: f */
    public final zt0 f68679f;

    /* JADX INFO: renamed from: g */
    public final yt0 f68680g;

    /* JADX INFO: renamed from: h */
    public final Matrix f68681h;

    public xt0(View view, zt0 zt0Var, yt0 yt0Var, Matrix matrix, boolean z, boolean z2) {
        this.f68676c = z;
        this.f68677d = z2;
        this.f68678e = view;
        this.f68679f = zt0Var;
        this.f68680g = yt0Var;
        this.f68681h = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f68674a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.f68674a;
        zt0 zt0Var = this.f68679f;
        View view = this.f68678e;
        if (!z) {
            if (this.f68676c && this.f68677d) {
                Matrix matrix = this.f68675b;
                matrix.set(this.f68681h);
                view.setTag(R$id.transition_transform, matrix);
                float f = zt0Var.f72116a;
                float f2 = zt0Var.f72117b;
                float f3 = zt0Var.f72118c;
                float f4 = zt0Var.f72119d;
                float f5 = zt0Var.f72120e;
                float f6 = zt0Var.f72121f;
                float f7 = zt0Var.f72122g;
                float f8 = zt0Var.f72123h;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap weakHashMap = dta.f36217a;
                view.setTranslationZ(f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            } else {
                view.setTag(R$id.transition_transform, null);
                view.setTag(R$id.parent_matrix, null);
            }
        }
        r90 r90Var = awa.f7627a;
        view.setAnimationMatrix(null);
        float f9 = zt0Var.f72116a;
        float f10 = zt0Var.f72117b;
        float f11 = zt0Var.f72118c;
        float f12 = zt0Var.f72119d;
        float f13 = zt0Var.f72120e;
        float f14 = zt0Var.f72121f;
        float f15 = zt0Var.f72122g;
        float f16 = zt0Var.f72123h;
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        WeakHashMap weakHashMap2 = dta.f36217a;
        view.setTranslationZ(f11);
        view.setScaleX(f12);
        view.setScaleY(f13);
        view.setRotationX(f14);
        view.setRotationY(f15);
        view.setRotation(f16);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f68680g.f70433a;
        Matrix matrix2 = this.f68675b;
        matrix2.set(matrix);
        int i = R$id.transition_transform;
        View view = this.f68678e;
        view.setTag(i, matrix2);
        zt0 zt0Var = this.f68679f;
        float f = zt0Var.f72116a;
        float f2 = zt0Var.f72117b;
        float f3 = zt0Var.f72118c;
        float f4 = zt0Var.f72119d;
        float f5 = zt0Var.f72120e;
        float f6 = zt0Var.f72121f;
        float f7 = zt0Var.f72122g;
        float f8 = zt0Var.f72123h;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap weakHashMap = dta.f36217a;
        view.setTranslationZ(f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f68678e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = dta.f36217a;
        view.setTranslationZ(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
