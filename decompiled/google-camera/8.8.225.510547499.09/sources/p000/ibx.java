package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ibx extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ icc f30279a;

    public ibx(icc iccVar) {
        this.f30279a = iccVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30279a.m11048e();
        icc iccVar = this.f30279a;
        if (iccVar.f30324t.mo16813g()) {
            ((Runnable) iccVar.f30324t.mo16809c()).run();
            iccVar.f30324t = mqu.f41450a;
        }
        try {
            Iterator it = iccVar.f30302E.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            iccVar.f30302E.clear();
        } catch (Throwable th) {
            iccVar.f30302E.clear();
            throw th;
        }
    }
}
