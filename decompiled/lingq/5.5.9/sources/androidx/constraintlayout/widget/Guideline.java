package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a */
    public boolean f5365a;

    public Guideline(Context context) {
        super(context);
        this.f5365a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5365a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f5365a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) getLayoutParams();
        if (this.f5365a && c0759b.f5313a == i10) {
            return;
        }
        c0759b.f5313a = i10;
        setLayoutParams(c0759b);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) getLayoutParams();
        if (this.f5365a && c0759b.f5315b == i10) {
            return;
        }
        c0759b.f5315b = i10;
        setLayoutParams(c0759b);
    }

    public void setGuidelinePercent(float f3) {
        ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) getLayoutParams();
        if (this.f5365a && c0759b.f5317c == f3) {
            return;
        }
        c0759b.f5317c = f3;
        setLayoutParams(c0759b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
