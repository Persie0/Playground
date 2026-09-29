package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r8d {
    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m20448a(View view, waa waaVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, hwa hwaVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) waaVar.f66571b.getTag(R$id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        xaa xaaVar = new xaa(view, waaVar.f66571b, translationX, translationY);
        hwaVar.m10202a(xaaVar);
        objectAnimatorOfPropertyValuesHolder.addListener(xaaVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: b */
    public static wi1 m20449b() {
        return wi1.f66846b;
    }
}
