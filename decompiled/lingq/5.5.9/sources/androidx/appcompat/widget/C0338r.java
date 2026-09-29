package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.linguist.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0338r extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C0334p f1319a;

    public C0338r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0349w0.m1279a(getContext(), this);
        C0334p c0334p = new C0334p(this);
        this.f1319a = c0334p;
        c0334p.mo1254a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f1319a.f1310b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
