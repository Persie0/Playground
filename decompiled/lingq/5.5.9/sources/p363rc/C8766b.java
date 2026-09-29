package p363rc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;

/* JADX INFO: renamed from: rc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8766b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static AnimatorSet m17015a(InterfaceC8768d interfaceC8768d, float f3, float f10, float f11) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC8768d, InterfaceC8768d.b.f46483a, InterfaceC8768d.a.f46481b, new InterfaceC8768d.d(f3, f10, f11));
        InterfaceC8768d.d revealInfo = interfaceC8768d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC8768d, (int) f3, (int) f10, revealInfo.f46487c, f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
