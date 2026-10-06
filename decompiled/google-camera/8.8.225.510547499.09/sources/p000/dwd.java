package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwd extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FilmstripTransitionLayout f12725a;

    public dwd(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f12725a = filmstripTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        dwa dwaVar = this.f12725a.f6670i;
        if (dwaVar != null) {
            dwaVar.f12701c.f12706d.setVisibility(4);
            dwaVar.f12701c.f12707e.setVisibility(0);
            dwaVar.f12699a.mo8566a(new CancellationException("Animation is cancelled"));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12725a;
        if (filmstripTransitionLayout.f6668g) {
            filmstripTransitionLayout.setVisibility(4);
        }
        FilmstripTransitionLayout filmstripTransitionLayout2 = this.f12725a;
        if (filmstripTransitionLayout2.f6664c) {
            filmstripTransitionLayout2.f6664c = false;
            return;
        }
        dwa dwaVar = filmstripTransitionLayout2.f6670i;
        if (dwaVar != null) {
            if (!dwaVar.f12701c.f12710h.isDone()) {
                dwaVar.f12699a.mo16665f(dwaVar.f12701c.m6803h(dwaVar.f12700b));
                return;
            }
            CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
            ((nbe) ((nbe) ((nbe) dwc.f12703a.m17252c()).mo17283h(cancellationException)).mo17276G((char) 1142)).mo17290o("onTransitionEnd");
            dwaVar.f12699a.mo8566a(cancellationException);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12725a.setVisibility(0);
        this.f12725a.f6667f.setVisibility(4);
    }
}
