package p160hj;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;

/* JADX INFO: renamed from: hj.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6066l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonProgressBar f35780b;

    public /* synthetic */ C6066l(LessonProgressBar lessonProgressBar, int i10) {
        this.f35779a = i10;
        this.f35780b = lessonProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35779a;
        LessonProgressBar lessonProgressBar = this.f35780b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                int i11 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                C5207g.m11111f(valueAnimator, "animation");
                Paint paint = lessonProgressBar.f27362d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                paint.setAlpha(((Integer) animatedValue).intValue());
                Paint paint2 = lessonProgressBar.f27360c;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                paint2.setAlpha(((Integer) animatedValue2).intValue());
                lessonProgressBar.m10127m();
                break;
            default:
                int i12 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                C5207g.m11111f(valueAnimator, "animation");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                lessonProgressBar.f27345M = ((Float) animatedValue3).floatValue();
                lessonProgressBar.m10128n();
                lessonProgressBar.m10127m();
                break;
        }
    }
}
