package p160hj;

import android.animation.Animator;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;

/* JADX INFO: renamed from: hj.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6067m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LessonProgressBar f35781a;

    public C6067m(LessonProgressBar lessonProgressBar) {
        this.f35781a = lessonProgressBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5207g.m11111f(animator, "animator");
        this.f35781a.f27369g0 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }
}
