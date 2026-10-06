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

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mmj extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mmk f41042a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f41043b;

    /* JADX INFO: renamed from: c */
    private final ColorStateList f41044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmj(mmk mmkVar, Context context, int i, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i, strArr);
        this.f41042a = mmkVar;
        ColorStateList colorStateList2 = null;
        if (m16625b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{mmkVar.f41047c.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f41044c = colorStateList;
        if (m16624a() && m16625b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{acp.m211c(mmkVar.f41047c.getColorForState(iArr3, 0), mmkVar.f41046b), acp.m211c(mmkVar.f41047c.getColorForState(iArr2, 0), mmkVar.f41046b), mmkVar.f41046b});
        }
        this.f41043b = colorStateList2;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m16624a() {
        return this.f41042a.f41046b != 0;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m16625b() {
        return this.f41042a.f41047c != null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            Drawable rippleDrawable = null;
            if (this.f41042a.getText().toString().contentEquals(textView.getText()) && m16624a()) {
                ColorDrawable colorDrawable = new ColorDrawable(this.f41042a.f41046b);
                if (this.f41044c != null) {
                    acv.m238g(colorDrawable, this.f41043b);
                    rippleDrawable = new RippleDrawable(this.f41044c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            afb.m432m(textView, rippleDrawable);
        }
        return view2;
    }
}
