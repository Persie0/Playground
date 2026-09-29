package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gr5 extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f41232a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f41233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hr5 f41234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr5(hr5 hr5Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f41234c = hr5Var;
        m12850a();
    }

    /* JADX INFO: renamed from: a */
    public final void m12850a() {
        ColorStateList colorStateList;
        hr5 hr5Var = this.f41234c;
        ColorStateList colorStateList2 = hr5Var.f42829H;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f41233b = colorStateList;
        if (hr5Var.f42837l != 0 && hr5Var.f42829H != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ya1.m25014g(hr5Var.f42829H.getColorForState(iArr3, 0), hr5Var.f42837l), ya1.m25014g(hr5Var.f42829H.getColorForState(iArr2, 0), hr5Var.f42837l), hr5Var.f42837l});
        }
        this.f41232a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            hr5 hr5Var = this.f41234c;
            Drawable drawable = null;
            if (hr5Var.getText().toString().contentEquals(textView.getText()) && hr5Var.f42837l != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(hr5Var.f42837l);
                if (this.f41233b != null) {
                    colorDrawable.setTintList(this.f41232a);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f41233b, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableM6147f = FocusRingDrawable.m6147f(getContext(), rippleDrawable, null);
                    if (focusRingDrawableM6147f != null) {
                        focusRingDrawableM6147f.f12983J.f36922x = hr5Var.f42832g;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
