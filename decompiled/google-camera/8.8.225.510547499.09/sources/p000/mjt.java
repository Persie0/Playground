package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjt extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mjw f40776a;

    public mjt(mjw mjwVar) {
        this.f40776a = mjwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        mjw mjwVar = this.f40776a;
        List list = mjwVar.f40783f;
        if (list == null || mjwVar.f40784g) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((atc) it.next()).mo1980c(mjwVar);
        }
    }
}
