package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggd extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ OptionsMenuContainer f24647a;

    public ggd(OptionsMenuContainer optionsMenuContainer) {
        this.f24647a = optionsMenuContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Collection$EL.forEach(this.f24647a.f6830h, fax.f21157j);
    }
}
