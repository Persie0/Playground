package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mkd f40814a;

    public mkb(mkd mkdVar) {
        this.f40814a = mkdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        mkd mkdVar = this.f40814a;
        mkdVar.f40819c = (mkdVar.f40819c + 1) % mkdVar.f40818b.f40743c.length;
        mkdVar.f40820d = true;
    }
}
