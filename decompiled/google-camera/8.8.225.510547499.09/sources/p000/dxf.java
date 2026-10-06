package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dwl f12823a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ FocusIndicatorView f12824b;

    public dxf(dwl dwlVar, FocusIndicatorView focusIndicatorView) {
        this.f12823a = dwlVar;
        this.f12824b = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        if (this.f12823a.mo6809a() == -1 || ((Boolean) ((jwf) this.f12824b.f6694d).f34942d).booleanValue()) {
            return;
        }
        this.f12823a.mo6818j(-1);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f12823a.mo6809a() == -1 || ((Boolean) ((jwf) this.f12824b.f6694d).f34942d).booleanValue()) {
            return;
        }
        this.f12823a.mo6818j(-1);
    }
}
