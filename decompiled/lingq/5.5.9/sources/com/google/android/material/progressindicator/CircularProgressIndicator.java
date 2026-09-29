package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import bd.AbstractC1358b;
import bd.AbstractC1359c;
import bd.C1360d;
import bd.C1363g;
import bd.C1364h;
import bd.C1365i;
import bd.C1370n;
import com.linguist.R;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicator extends AbstractC1358b<C1364h> {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f15429J = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        C1364h c1364h = (C1364h) this.f8194a;
        setIndeterminateDrawable(new C1370n(context2, c1364h, new C1360d(c1364h), new C1363g(c1364h)));
        setProgressDrawable(new C1365i(getContext(), c1364h, new C1360d(c1364h)));
    }

    @Override // bd.AbstractC1358b
    /* JADX INFO: renamed from: a */
    public final AbstractC1359c mo4932a(Context context, AttributeSet attributeSet) {
        return new C1364h(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((C1364h) this.f8194a).f8237i;
    }

    public int getIndicatorInset() {
        return ((C1364h) this.f8194a).f8236h;
    }

    public int getIndicatorSize() {
        return ((C1364h) this.f8194a).f8235g;
    }

    public void setIndicatorDirection(int i10) {
        ((C1364h) this.f8194a).f8237i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f8194a;
        if (((C1364h) s10).f8236h != i10) {
            ((C1364h) s10).f8236h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f8194a;
        if (((C1364h) s10).f8235g != iMax) {
            ((C1364h) s10).f8235g = iMax;
            ((C1364h) s10).getClass();
            invalidate();
        }
    }

    @Override // bd.AbstractC1358b
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((C1364h) this.f8194a).getClass();
    }
}
