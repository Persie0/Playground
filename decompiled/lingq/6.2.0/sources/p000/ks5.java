package p000;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;

/* JADX INFO: loaded from: classes2.dex */
public final class ks5 extends ir5 {

    /* JADX INFO: renamed from: g */
    public final float f48385g;

    /* JADX INFO: renamed from: h */
    public final float f48386h;

    /* JADX INFO: renamed from: i */
    public final float f48387i;

    public ks5(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f48385g = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f48386h = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f48387i = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final void m15661a(float f, int i, boolean z) {
        float interpolation = this.f44454a.getInterpolation(f);
        View view = this.f44455b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.f48385g / f2;
            float f5 = this.f48386h / f2;
            float f6 = this.f48387i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fM4878a = AbstractC0853cn.m4878a(0.0f, f5, interpolation);
            float f7 = fM4878a + 1.0f;
            float fM4878a2 = 1.0f - AbstractC0853cn.m4878a(0.0f, f6, interpolation);
            if (Float.isNaN(f7) || Float.isNaN(fM4878a2)) {
                return;
            }
            view.setScaleX(f7);
            view.setScaleY(fM4878a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fM4878a : 1.0f;
                    float f9 = fM4878a2 != 0.0f ? (f7 / fM4878a2) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }
}
