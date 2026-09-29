package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import p000.C3386nv;
import p000.dy9;
import p000.f88;
import p000.h21;
import p000.j21;
import p000.l21;
import p000.mc2;
import p000.o34;
import p000.ooa;
import p000.pb1;
import p000.poa;
import p000.q21;
import p000.x60;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends AbstractC1068a {

    /* JADX INFO: renamed from: L */
    public static final int f13064L = R$style.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f13064L);
        q21 q21Var = (q21) this.f13070a;
        h21 h21Var = new h21(q21Var);
        Context context2 = getContext();
        o34 o34Var = new o34(context2, q21Var, h21Var, q21Var.f57150q == 1 ? new l21(context2, q21Var) : new j21(q21Var));
        Resources resources = context2.getResources();
        int i2 = R$drawable.ic_mtrl_arrow_circle;
        poa poaVar = new poa();
        ThreadLocal threadLocal = f88.f38630a;
        poaVar.f41098a = resources.getDrawable(i2, null);
        new ooa(poaVar.f41098a.getConstantState());
        o34Var.f53768K = poaVar;
        setIndeterminateDrawable(o34Var);
        setProgressDrawable(new mc2(getContext(), q21Var, h21Var));
        this.f13079j = true;
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    /* JADX INFO: renamed from: a */
    public final x90 mo6159a(Context context, AttributeSet attributeSet) {
        int i = R$attr.circularProgressIndicatorStyle;
        int i2 = f13064L;
        q21 q21Var = new q21(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = R$styleable.CircularProgressIndicator;
        dy9.m10748a(context, attributeSet, i, i2);
        dy9.m10749b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        q21Var.f57150q = typedArrayObtainStyledAttributes.getInt(R$styleable.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        q21Var.f57151r = Math.max(pb1.m19056z(context, typedArrayObtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), q21Var.f67944a * 2);
        q21Var.f57152s = pb1.m19056z(context, typedArrayObtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        q21Var.f57153t = typedArrayObtainStyledAttributes.getInt(R$styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        q21Var.f57154u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircularProgressIndicator_indeterminateTrackVisible, true);
        typedArrayObtainStyledAttributes.recycle();
        q21Var.mo11063d();
        return q21Var;
    }

    public int getIndeterminateAnimationType() {
        return ((q21) this.f13070a).f57150q;
    }

    public int getIndicatorDirection() {
        return ((q21) this.f13070a).f57153t;
    }

    public int getIndicatorInset() {
        return ((q21) this.f13070a).f57152s;
    }

    public int getIndicatorSize() {
        return ((q21) this.f13070a).f57151r;
    }

    public void setIndeterminateAnimationType(int i) {
        x90 x90Var = this.f13070a;
        if (((q21) x90Var).f57150q == i) {
            return;
        }
        if (m6164f() && isIndeterminate()) {
            C3386nv.m17633t("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((q21) x90Var).f57150q = i;
        ((q21) x90Var).mo11063d();
        x60 l21Var = i == 1 ? new l21(getContext(), (q21) x90Var) : new j21((q21) x90Var);
        o34 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.f53767J = l21Var;
        l21Var.f67808a = indeterminateDrawable;
        m6162c();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((q21) this.f13070a).f57153t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        x90 x90Var = this.f13070a;
        if (((q21) x90Var).f57152s != i) {
            ((q21) x90Var).f57152s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        x90 x90Var = this.f13070a;
        if (((q21) x90Var).f57151r != iMax) {
            ((q21) x90Var).f57151r = iMax;
            ((q21) x90Var).mo11063d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC1068a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((q21) this.f13070a).mo11063d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
