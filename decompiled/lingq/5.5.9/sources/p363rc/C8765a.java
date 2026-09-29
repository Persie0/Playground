package p363rc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: rc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8765a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8768d f46480a;

    public C8765a(InterfaceC8768d interfaceC8768d) {
        this.f46480a = interfaceC8768d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f46480a.mo17017b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f46480a.mo17016a();
    }
}
