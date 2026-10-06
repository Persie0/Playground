package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mju extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mjw f40777a;

    public mju(mjw mjwVar) {
        this.f40777a = mjwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        mjw mjwVar = this.f40777a;
        List list = mjwVar.f40783f;
        if (list == null || mjwVar.f40784g) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((atc) it.next()).mo1979b(mjwVar);
        }
    }
}
