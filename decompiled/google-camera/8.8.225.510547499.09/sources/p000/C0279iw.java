package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: iw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0279iw extends RatingBar {

    /* JADX INFO: renamed from: a */
    private final C0277iu f32457a;

    public C0279iw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.ratingBarStyle);
        C0847nf.m17435d(this, getContext());
        C0277iu c0277iu = new C0277iu(this);
        this.f32457a = c0277iu;
        c0277iu.mo11798b(attributeSet, C0100R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f32457a.f32218a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
