package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;

/* JADX INFO: loaded from: classes2.dex */
public final class nr5 extends ir5 {

    /* JADX INFO: renamed from: g */
    public final float f53168g;

    /* JADX INFO: renamed from: h */
    public final float f53169h;

    public nr5(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f53168g = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f53169h = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m17604a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f44455b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new qz2(1));
        return animatorSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m17605b(float f) {
        float interpolation = this.f44454a.getInterpolation(f);
        View view = this.f44455b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f53168g / width;
        float f3 = this.f53169h / height;
        float fM4878a = 1.0f - AbstractC0853cn.m4878a(0.0f, f2, interpolation);
        float fM4878a2 = 1.0f - AbstractC0853cn.m4878a(0.0f, f3, interpolation);
        if (Float.isNaN(fM4878a) || Float.isNaN(fM4878a2)) {
            return;
        }
        view.setScaleX(fM4878a);
        view.setPivotY(height);
        view.setScaleY(fM4878a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM4878a2 != 0.0f ? fM4878a / fM4878a2 : 1.0f);
            }
        }
    }
}
