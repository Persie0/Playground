package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwe extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FilmstripTransitionLayout f12726a;

    public dwe(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f12726a = filmstripTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12726a.setVisibility(4);
        this.f12726a.f6667f.setVisibility(0);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12726a;
        if (filmstripTransitionLayout.f6665d) {
            filmstripTransitionLayout.f6665d = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12726a.setVisibility(0);
    }
}
