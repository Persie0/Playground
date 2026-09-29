package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.Objects;
import p000.C3386nv;
import p000.ad5;
import p000.cm2;
import p000.dy9;
import p000.ed5;
import p000.mc2;
import p000.o34;
import p000.vc5;
import p000.x90;
import p000.yc5;

/* JADX INFO: loaded from: classes2.dex */
public class LinearProgressIndicator extends AbstractC1068a {

    /* JADX INFO: renamed from: L */
    public static final int f13065L = R$style.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f13065L);
        ed5 ed5Var = (ed5) this.f13070a;
        vc5 vc5Var = new vc5(ed5Var);
        vc5Var.f65183f = 300.0f;
        vc5Var.f65192o = new Pair(new cm2(), new cm2());
        Context context2 = getContext();
        setIndeterminateDrawable(new o34(context2, ed5Var, vc5Var, ed5Var.f37057q == 0 ? new yc5(ed5Var) : new ad5(context2, ed5Var)));
        setProgressDrawable(new mc2(getContext(), ed5Var, vc5Var));
        this.f13079j = true;
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    /* JADX INFO: renamed from: a */
    public final x90 mo6159a(Context context, AttributeSet attributeSet) {
        int i = R$attr.linearProgressIndicatorStyle;
        int i2 = f13065L;
        ed5 ed5Var = new ed5(context, attributeSet, i, i2);
        int[] iArr = R$styleable.LinearProgressIndicator;
        int i3 = R$attr.linearProgressIndicatorStyle;
        dy9.m10748a(context, attributeSet, i3, i2);
        dy9.m10749b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        ed5Var.f37057q = typedArrayObtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        ed5Var.f37058r = typedArrayObtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        ed5Var.f37060t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearProgressIndicator_trackStopIndicatorSize, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LinearProgressIndicator_trackStopIndicatorPadding)) {
            ed5Var.f37061u = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                ed5Var.f37062v = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), ed5Var.f67944a / 2);
                ed5Var.f37064x = false;
                ed5Var.f37065y = true;
            } else if (i4 == 6) {
                ed5Var.f37063w = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                ed5Var.f37064x = true;
                ed5Var.f37065y = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        ed5Var.mo11063d();
        ed5Var.f37059s = ed5Var.f37058r == 1;
        return ed5Var;
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    /* JADX INFO: renamed from: d */
    public final void mo6160d(int i) {
        x90 x90Var = this.f13070a;
        if (x90Var != null && ((ed5) x90Var).f37057q == 0 && isIndeterminate()) {
            return;
        }
        super.mo6160d(i);
    }

    public int getIndeterminateAnimationType() {
        return ((ed5) this.f13070a).f37057q;
    }

    public int getIndicatorDirection() {
        return ((ed5) this.f13070a).f37058r;
    }

    public int getTrackInnerCornerRadius() {
        return ((ed5) this.f13070a).f37062v;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((ed5) this.f13070a).f37061u;
    }

    public int getTrackStopIndicatorSize() {
        return ((ed5) this.f13070a).f37060t;
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x90 x90Var = this.f13070a;
        ed5 ed5Var = (ed5) x90Var;
        boolean z2 = true;
        if (((ed5) x90Var).f37058r != 1 && ((getLayoutDirection() != 1 || ((ed5) x90Var).f37058r != 2) && (getLayoutDirection() != 0 || ((ed5) x90Var).f37058r != 3))) {
            z2 = false;
        }
        ed5Var.f37059s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        o34 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        mc2 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        x90 x90Var = this.f13070a;
        if (((ed5) x90Var).f37057q == i) {
            return;
        }
        if (m6164f() && isIndeterminate()) {
            C3386nv.m17633t("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((ed5) x90Var).f37057q = i;
        ((ed5) x90Var).mo11063d();
        if (i == 0) {
            o34 indeterminateDrawable = getIndeterminateDrawable();
            yc5 yc5Var = new yc5((ed5) x90Var);
            indeterminateDrawable.f53767J = yc5Var;
            yc5Var.f67808a = indeterminateDrawable;
        } else {
            o34 indeterminateDrawable2 = getIndeterminateDrawable();
            ad5 ad5Var = new ad5(getContext(), (ed5) x90Var);
            indeterminateDrawable2.f53767J = ad5Var;
            ad5Var.f67808a = indeterminateDrawable2;
        }
        m6162c();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((ed5) this.f13070a).mo11063d();
    }

    public void setIndicatorDirection(int i) {
        x90 x90Var = this.f13070a;
        ((ed5) x90Var).f37058r = i;
        ed5 ed5Var = (ed5) x90Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((ed5) x90Var).f37058r != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        ed5Var.f37059s = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((ed5) this.f13070a).mo11063d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        x90 x90Var = this.f13070a;
        if (((ed5) x90Var).f37062v != i) {
            ((ed5) x90Var).f37062v = Math.round(Math.min(i, ((ed5) x90Var).f67944a / 2.0f));
            ((ed5) x90Var).f37064x = false;
            ((ed5) x90Var).f37065y = true;
            ((ed5) x90Var).mo11063d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        x90 x90Var = this.f13070a;
        if (((ed5) x90Var).f37063w != f) {
            ((ed5) x90Var).f37063w = Math.min(f, 0.5f);
            ((ed5) x90Var).f37064x = true;
            ((ed5) x90Var).f37065y = true;
            ((ed5) x90Var).mo11063d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        x90 x90Var = this.f13070a;
        if (Objects.equals(((ed5) x90Var).f37061u, num)) {
            return;
        }
        ((ed5) x90Var).f37061u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        x90 x90Var = this.f13070a;
        if (((ed5) x90Var).f37060t != i) {
            ((ed5) x90Var).f37060t = i;
            ((ed5) x90Var).mo11063d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
