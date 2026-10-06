package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ibp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ibq f30214a;

    public ibp(ibq ibqVar) {
        this.f30214a = ibqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ibq ibqVar = this.f30214a;
        ibqVar.f30223h.mo11089o(ibqVar.f30222g, true);
        ibs ibsVar = ibqVar.f30226k;
        if (ibsVar != null) {
            ibsVar.m11029a();
        }
        ibqVar.f30221f = false;
        this.f30214a.m11009h(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f30214a.m11009h(false);
    }
}
