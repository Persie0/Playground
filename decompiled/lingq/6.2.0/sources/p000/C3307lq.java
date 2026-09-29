package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R$attr;

/* JADX INFO: renamed from: lq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3307lq extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C3156jq f49995a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3307lq(Context context, AttributeSet attributeSet) {
        int i = R$attr.ratingBarStyle;
        super(context, attributeSet, i);
        oz9.m18842a(this, getContext());
        C3156jq c3156jq = new C3156jq(this);
        this.f49995a = c3156jq;
        c3156jq.mo14587A(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f49995a.f45991b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
