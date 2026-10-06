package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p000.aeo;
import p000.afc;
import p000.anc;
import p000.ane;
import p000.anf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PercentRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private final ane f1538a;

    public PercentRelativeLayout(Context context) {
        super(context);
        this.f1538a = new ane(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final anf generateLayoutParams(AttributeSet attributeSet) {
        return new anf(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new anf();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        anc ancVarM1722a;
        super.onLayout(z, i, i2, i3, i4);
        ane aneVar = this.f1538a;
        int childCount = aneVar.f1828a.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = aneVar.f1828a.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof anf) && (ancVarM1722a = ((anf) layoutParams).m1722a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ancVarM1722a.m1015b(marginLayoutParams);
                    marginLayoutParams.leftMargin = ancVarM1722a.f849j.leftMargin;
                    marginLayoutParams.topMargin = ancVarM1722a.f849j.topMargin;
                    marginLayoutParams.rightMargin = ancVarM1722a.f849j.rightMargin;
                    marginLayoutParams.bottomMargin = ancVarM1722a.f849j.bottomMargin;
                    aeo.m361g(marginLayoutParams, aeo.m357c(ancVarM1722a.f849j));
                    aeo.m360f(marginLayoutParams, aeo.m356b(ancVarM1722a.f849j));
                } else {
                    ancVarM1722a.m1015b(layoutParams);
                }
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        anc ancVarM1722a;
        anc ancVarM1722a2;
        ane aneVar = this.f1538a;
        int size = (View.MeasureSpec.getSize(i) - aneVar.f1828a.getPaddingLeft()) - aneVar.f1828a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - aneVar.f1828a.getPaddingTop()) - aneVar.f1828a.getPaddingBottom();
        int childCount = aneVar.f1828a.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = aneVar.f1828a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof anf) && (ancVarM1722a2 = ((anf) layoutParams).m1722a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ancVarM1722a2.m1014a(marginLayoutParams, size, size2);
                    ancVarM1722a2.f849j.leftMargin = marginLayoutParams.leftMargin;
                    ancVarM1722a2.f849j.topMargin = marginLayoutParams.topMargin;
                    ancVarM1722a2.f849j.rightMargin = marginLayoutParams.rightMargin;
                    ancVarM1722a2.f849j.bottomMargin = marginLayoutParams.bottomMargin;
                    aeo.m361g(ancVarM1722a2.f849j, aeo.m357c(marginLayoutParams));
                    aeo.m360f(ancVarM1722a2.f849j, aeo.m356b(marginLayoutParams));
                    float f = ancVarM1722a2.f842c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(size * f);
                    }
                    float f2 = ancVarM1722a2.f843d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f2);
                    }
                    float f3 = ancVarM1722a2.f844e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(size * f3);
                    }
                    float f4 = ancVarM1722a2.f845f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f4);
                    }
                    float f5 = ancVarM1722a2.f846g;
                    if (f5 >= 0.0f) {
                        aeo.m361g(marginLayoutParams, Math.round(size * f5));
                    } else {
                        z = false;
                    }
                    float f6 = ancVarM1722a2.f847h;
                    if (f6 >= 0.0f) {
                        aeo.m360f(marginLayoutParams, Math.round(size * f6));
                    } else if (z) {
                    }
                    if (childAt != null) {
                        aeo.m358d(marginLayoutParams, afc.m442c(childAt));
                    }
                } else {
                    ancVarM1722a2.m1014a(layoutParams, size, size2);
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        ane aneVar2 = this.f1538a;
        int childCount2 = aneVar2.f1828a.getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = aneVar2.f1828a.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof anf) && (ancVarM1722a = ((anf) layoutParams2).m1722a()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & (-16777216)) == 16777216 && ancVarM1722a.f840a >= 0.0f && ancVarM1722a.f849j.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && ancVarM1722a.f841b >= 0.0f && ancVarM1722a.f849j.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1538a = new ane(this);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1538a = new ane(this);
    }
}
