package p322pd;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v4.media.session.C0166e;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: pd.o */
/* JADX INFO: loaded from: classes.dex */
public final class C8234o implements InterfaceC8236q {

    /* JADX INFO: renamed from: a */
    public final int f44501a;

    public C8234o(int i10) {
        this.f44501a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static ObjectAnimator m16376c(View view, float f3, float f10, float f11) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f3, f10));
        objectAnimatorOfPropertyValuesHolder.addListener(new C8232m(view, f11));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m16377d(View view, float f3, float f10, float f11) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f3, f10));
        objectAnimatorOfPropertyValuesHolder.addListener(new C8233n(view, f11));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: a */
    public final Animator mo16365a(ViewGroup viewGroup, View view) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i10 = this.f44501a;
        if (i10 == 3) {
            return m16376c(view, dimensionPixelSize + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return m16376c(view, translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i10 == 48) {
            return m16377d(view, translationY - dimensionPixelSize, translationY, translationY);
        }
        if (i10 == 80) {
            return m16377d(view, dimensionPixelSize + translationY, translationY, translationY);
        }
        boolean z10 = false;
        if (i10 == 8388611) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.e.m18686d(viewGroup) == 1) {
                z10 = true;
            }
            float f3 = dimensionPixelSize;
            return m16376c(view, z10 ? f3 + translationX : translationX - f3, translationX, translationX);
        }
        if (i10 != 8388613) {
            throw new IllegalArgumentException(C0166e.m761g("Invalid slide direction: ", i10));
        }
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        if (C10029b0.e.m18686d(viewGroup) == 1) {
            z10 = true;
        }
        float f10 = dimensionPixelSize;
        return m16376c(view, z10 ? translationX - f10 : f10 + translationX, translationX, translationX);
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: b */
    public final Animator mo16366b(ViewGroup viewGroup, View view) {
        boolean z10;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int i10 = this.f44501a;
        if (i10 == 3) {
            return m16376c(view, translationX, translationX - dimensionPixelSize, translationX);
        }
        if (i10 == 5) {
            return m16376c(view, translationX, dimensionPixelSize + translationX, translationX);
        }
        if (i10 == 48) {
            return m16377d(view, translationY, dimensionPixelSize + translationY, translationY);
        }
        if (i10 == 80) {
            return m16377d(view, translationY, translationY - dimensionPixelSize, translationY);
        }
        if (i10 == 8388611) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            z10 = C10029b0.e.m18686d(viewGroup) == 1;
            float f3 = dimensionPixelSize;
            return m16376c(view, translationX, z10 ? translationX - f3 : f3 + translationX, translationX);
        }
        if (i10 != 8388613) {
            throw new IllegalArgumentException(C0166e.m761g("Invalid slide direction: ", i10));
        }
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        z10 = C10029b0.e.m18686d(viewGroup) == 1;
        float f10 = dimensionPixelSize;
        return m16376c(view, translationX, z10 ? f10 + translationX : translationX - f10, translationX);
    }
}
