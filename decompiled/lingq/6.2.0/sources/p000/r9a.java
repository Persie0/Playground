package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class r9a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3275kv f58949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ daa f58950b;

    public r9a(daa daaVar, C3275kv c3275kv) {
        this.f58950b = daaVar;
        this.f58949a = c3275kv;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f58949a.remove(animator);
        this.f58950b.f35316N.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f58950b.f35316N.add(animator);
    }
}
