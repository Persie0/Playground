package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjl extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mjp f40751a;

    public mjl(mjp mjpVar) {
        this.f40751a = mjpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        mjp mjpVar = this.f40751a;
        mjpVar.f40760f = (mjpVar.f40760f + 4) % mjpVar.f40759e.f40743c.length;
    }
}
