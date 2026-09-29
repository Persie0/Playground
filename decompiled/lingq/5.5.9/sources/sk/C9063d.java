package sk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import dm.C5207g;

/* JADX INFO: renamed from: sk.d */
/* JADX INFO: loaded from: classes2.dex */
public class C9063d extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9063d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9063d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C5207g.m11111f(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) * 9) / 16, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
