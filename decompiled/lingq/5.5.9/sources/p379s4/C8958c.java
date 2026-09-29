package p379s4;

import android.animation.Animator;

/* JADX INFO: renamed from: s4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8958c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8959d.a f46926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8959d f46927b;

    public C8958c(C8959d c8959d, C8959d.a aVar) {
        this.f46927b = c8959d;
        this.f46926a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C8959d c8959d = this.f46927b;
        C8959d.a aVar = this.f46926a;
        c8959d.m17184a(1.0f, aVar, true);
        aVar.f46947k = aVar.f46941e;
        aVar.f46948l = aVar.f46942f;
        aVar.f46949m = aVar.f46943g;
        aVar.m17187a((aVar.f46946j + 1) % aVar.f46945i.length);
        if (!c8959d.f46936f) {
            c8959d.f46935e += 1.0f;
            return;
        }
        c8959d.f46936f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.f46950n) {
            aVar.f46950n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f46927b.f46935e = 0.0f;
    }
}
