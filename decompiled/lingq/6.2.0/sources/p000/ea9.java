package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;

/* JADX INFO: loaded from: classes.dex */
public final class ea9 implements iwa {

    /* JADX INFO: renamed from: a */
    public final int f36949a;

    public ea9(int i) {
        this.f36949a = i;
    }

    /* JADX INFO: renamed from: c */
    public static ObjectAnimator m11000c(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new ez2(view, f3, 2));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m11001d(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new da9(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: a */
    public final Animator mo11002a(View view, ViewGroup viewGroup) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i = this.f36949a;
        if (i == 3) {
            return m11000c(view, translationX, translationX - dimensionPixelSize, translationX);
        }
        if (i == 5) {
            return m11000c(view, translationX, dimensionPixelSize + translationX, translationX);
        }
        if (i == 48) {
            return m11001d(view, translationY, dimensionPixelSize + translationY, translationY);
        }
        if (i == 80) {
            return m11001d(view, translationY, translationY - dimensionPixelSize, translationY);
        }
        if (i == 8388611) {
            return m11000c(view, translationX, viewGroup.getLayoutDirection() == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX);
        }
        if (i == 8388613) {
            return m11000c(view, translationX, viewGroup.getLayoutDirection() == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX);
        }
        C3386nv.m17626m(ux5.m22988k(i, "Invalid slide direction: "));
        return null;
    }

    @Override // p000.iwa
    /* JADX INFO: renamed from: b */
    public final Animator mo11003b(View view, ViewGroup viewGroup) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i = this.f36949a;
        if (i == 3) {
            return m11000c(view, dimensionPixelSize + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m11000c(view, translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i == 48) {
            return m11001d(view, translationY - dimensionPixelSize, translationY, translationY);
        }
        if (i == 80) {
            return m11001d(view, dimensionPixelSize + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return m11000c(view, viewGroup.getLayoutDirection() == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i == 8388613) {
            return m11000c(view, viewGroup.getLayoutDirection() == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX, translationX);
        }
        C3386nv.m17626m(ux5.m22988k(i, "Invalid slide direction: "));
        return null;
    }
}
