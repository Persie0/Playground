package p471x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: x2.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10047k0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10051m0 f51039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f51040b;

    public C10047k0(InterfaceC10051m0 interfaceC10051m0, View view) {
        this.f51039a = interfaceC10051m0;
        this.f51040b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f51039a.mo1079b(this.f51040b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f51039a.mo1078a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f51039a.mo1080c();
    }
}
