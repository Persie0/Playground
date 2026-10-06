package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class icv extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MoreModesGrid f30399a;

    public icv(MoreModesGrid moreModesGrid) {
        this.f30399a = moreModesGrid;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30399a.setVisibility(8);
    }
}
