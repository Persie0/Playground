package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class isw extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ite f32039a;

    public isw(ite iteVar) {
        this.f32039a = iteVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ite iteVar = this.f32039a;
        if (iteVar.f32073X) {
            iteVar.m11736Q(iteVar.f32061L.getProgress());
            this.f32039a.f32073X = false;
        }
    }
}
