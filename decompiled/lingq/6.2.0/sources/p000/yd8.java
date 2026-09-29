package p000;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.lingq.feature.review.views.ReviewProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewProgressBar f69700b;

    public /* synthetic */ yd8(ReviewProgressBar reviewProgressBar, int i) {
        this.f69699a = i;
        this.f69700b = reviewProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f69699a;
        ReviewProgressBar reviewProgressBar = this.f69700b;
        switch (i) {
            case 0:
                int i2 = ReviewProgressBar.f32763Q;
                valueAnimator.getClass();
                Paint paint = reviewProgressBar.f32775c;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                paint.setAlpha(((Integer) animatedValue).intValue());
                Paint paint2 = reviewProgressBar.f32774b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                paint2.setAlpha(((Integer) animatedValue2).intValue());
                break;
            case 1:
                int i3 = ReviewProgressBar.f32763Q;
                valueAnimator.getClass();
                Paint paint3 = reviewProgressBar.f32775c;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                paint3.setAlpha(((Integer) animatedValue3).intValue());
                Paint paint4 = reviewProgressBar.f32774b;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                paint4.setAlpha(((Integer) animatedValue4).intValue());
                break;
            case 2:
                int i4 = ReviewProgressBar.f32763Q;
                valueAnimator.getClass();
                Paint paint5 = reviewProgressBar.f32775c;
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                animatedValue5.getClass();
                paint5.setAlpha(((Integer) animatedValue5).intValue());
                Paint paint6 = reviewProgressBar.f32774b;
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                animatedValue6.getClass();
                paint6.setAlpha(((Integer) animatedValue6).intValue());
                break;
            case 3:
                int i5 = ReviewProgressBar.f32763Q;
                valueAnimator.getClass();
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                animatedValue7.getClass();
                reviewProgressBar.f32779g = ((Float) animatedValue7).floatValue();
                reviewProgressBar.m9658e();
                break;
            default:
                int i6 = ReviewProgressBar.f32763Q;
                valueAnimator.getClass();
                Paint paint7 = reviewProgressBar.f32775c;
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                animatedValue8.getClass();
                paint7.setAlpha(((Integer) animatedValue8).intValue());
                Paint paint8 = reviewProgressBar.f32774b;
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                animatedValue9.getClass();
                paint8.setAlpha(((Integer) animatedValue9).intValue());
                break;
        }
    }
}
