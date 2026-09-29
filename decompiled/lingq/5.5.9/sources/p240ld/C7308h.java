package p240ld;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;

/* JADX INFO: renamed from: ld.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7308h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40932b;

    public /* synthetic */ C7308h(int i10, Object obj) {
        this.f40931a = i10;
        this.f40932b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40931a;
        Object obj = this.f40932b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7312l c7312l = (C7312l) obj;
                c7312l.getClass();
                c7312l.f40954d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                LessonProgressBar lessonProgressBar = (LessonProgressBar) obj;
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
        }
    }
}
