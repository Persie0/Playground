package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p000.hj1;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a */
    public boolean f5461a;

    public Guideline(Context context) {
        super(context);
        this.f5461a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f5461a = z;
    }

    public void setGuidelineBegin(int i) {
        hj1 hj1Var = (hj1) getLayoutParams();
        if (this.f5461a && hj1Var.f42442a == i) {
            return;
        }
        hj1Var.f42442a = i;
        setLayoutParams(hj1Var);
    }

    public void setGuidelineEnd(int i) {
        hj1 hj1Var = (hj1) getLayoutParams();
        if (this.f5461a && hj1Var.f42444b == i) {
            return;
        }
        hj1Var.f42444b = i;
        setLayoutParams(hj1Var);
    }

    public void setGuidelinePercent(float f) {
        hj1 hj1Var = (hj1) getLayoutParams();
        if (this.f5461a && hj1Var.f42446c == f) {
            return;
        }
        hj1Var.f42446c = f;
        setLayoutParams(hj1Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5461a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5461a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f5461a = true;
        super.setVisibility(8);
    }
}
