package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class yy2 extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final View f70638a;

    /* JADX INFO: renamed from: b */
    public boolean f70639b = false;

    public yy2(View view) {
        this.f70638a = view;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        float transitionAlpha;
        View view = this.f70638a;
        if (view.getVisibility() == 0) {
            r90 r90Var = awa.f7627a;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(R$id.transition_pause_alpha, Float.valueOf(transitionAlpha));
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: d */
    public final void mo4477d(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        this.f70638a.setTag(R$id.transition_pause_alpha, null);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        r90 r90Var = awa.f7627a;
        this.f70638a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f70639b;
        View view = this.f70638a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        r90 r90Var = awa.f7627a;
        view.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f70638a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f70639b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
