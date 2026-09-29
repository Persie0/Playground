package p160hj;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;

/* JADX INFO: renamed from: hj.j */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6064j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonProgressBar f35776b;

    public /* synthetic */ C6064j(LessonProgressBar lessonProgressBar, int i10) {
        this.f35775a = i10;
        this.f35776b = lessonProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f35775a;
        LessonProgressBar lessonProgressBar = this.f35776b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                int i11 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                C5207g.m11111f(valueAnimator, "value");
                Object animatedValue = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                lessonProgressBar.f27343K = ((Float) animatedValue).floatValue();
                lessonProgressBar.m10128n();
                lessonProgressBar.m10127m();
                break;
            case 1:
                int i12 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                C5207g.m11111f(valueAnimator, "animation");
                Paint paint = lessonProgressBar.f27362d;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                paint.setAlpha(((Integer) animatedValue2).intValue());
                Paint paint2 = lessonProgressBar.f27360c;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                paint2.setAlpha(((Integer) animatedValue3).intValue());
                lessonProgressBar.m10127m();
                break;
            default:
                int i13 = LessonProgressBar.f27339n0;
                C5207g.m11111f(lessonProgressBar, "this$0");
                C5207g.m11111f(valueAnimator, "animation");
                Paint paint3 = lessonProgressBar.f27362d;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                paint3.setAlpha(((Integer) animatedValue4).intValue());
                Paint paint4 = lessonProgressBar.f27360c;
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                C5207g.m11109d(animatedValue5, "null cannot be cast to non-null type kotlin.Int");
                paint4.setAlpha(((Integer) animatedValue5).intValue());
                lessonProgressBar.m10127m();
                break;
        }
    }
}
