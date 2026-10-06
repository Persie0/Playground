package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.clockwork.common.wearable.wearmaterial.button.ContentChangeTransition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iwa extends Fade {
    public iwa() {
        super(1);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        ContentChangeTransition.m4580b(transitionValues);
    }

    @Override // android.transition.Fade, android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        ContentChangeTransition.m4580b(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.view;
        Animator animatorOnAppear = onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorOnAppear == null) {
            return null;
        }
        if (animatorOnAppear instanceof ObjectAnimator) {
            ((ObjectAnimator) animatorOnAppear).setFloatValues(0.1f, 1.0f);
        }
        addListener(new iwg(view));
        return animatorOnAppear;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final String[] getTransitionProperties() {
        return ContentChangeTransition.f7420a;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return (transitionValues == null || transitionValues2 == null || !ContentChangeTransition.m4583e(transitionValues, transitionValues2)) ? false : true;
    }
}
