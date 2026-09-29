package p000;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ny7 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderProgressBar f53411b;

    public /* synthetic */ ny7(ReaderProgressBar readerProgressBar, int i) {
        this.f53410a = i;
        this.f53411b = readerProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f53410a;
        ReaderProgressBar readerProgressBar = this.f53411b;
        switch (i) {
            case 0:
                int i2 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Paint paint = readerProgressBar.f30424d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                paint.setAlpha(((Integer) animatedValue).intValue());
                Paint paint2 = readerProgressBar.f30422c;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                paint2.setAlpha(((Integer) animatedValue2).intValue());
                readerProgressBar.m9428l();
                break;
            case 1:
                int i3 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                readerProgressBar.f30405K = ((Float) animatedValue3).floatValue();
                readerProgressBar.m9429m();
                readerProgressBar.m9428l();
                break;
            case 2:
                int i4 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Paint paint3 = readerProgressBar.f30424d;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                paint3.setAlpha(((Integer) animatedValue4).intValue());
                Paint paint4 = readerProgressBar.f30422c;
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                animatedValue5.getClass();
                paint4.setAlpha(((Integer) animatedValue5).intValue());
                readerProgressBar.m9428l();
                break;
            case 3:
                int i5 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Paint paint5 = readerProgressBar.f30424d;
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                animatedValue6.getClass();
                paint5.setAlpha(((Integer) animatedValue6).intValue());
                Paint paint6 = readerProgressBar.f30422c;
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                animatedValue7.getClass();
                paint6.setAlpha(((Integer) animatedValue7).intValue());
                readerProgressBar.m9428l();
                break;
            case 4:
                int i6 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                animatedValue8.getClass();
                readerProgressBar.f30407M = ((Float) animatedValue8).floatValue();
                readerProgressBar.m9429m();
                readerProgressBar.m9428l();
                break;
            default:
                int i7 = ReaderProgressBar.f30401n0;
                valueAnimator.getClass();
                Paint paint7 = readerProgressBar.f30424d;
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                animatedValue9.getClass();
                paint7.setAlpha(((Integer) animatedValue9).intValue());
                Paint paint8 = readerProgressBar.f30422c;
                Object animatedValue10 = valueAnimator.getAnimatedValue();
                animatedValue10.getClass();
                paint8.setAlpha(((Integer) animatedValue10).intValue());
                readerProgressBar.m9428l();
                break;
        }
    }
}
