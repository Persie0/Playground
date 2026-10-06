package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asw extends AnimatorListenerAdapter implements ase {

    /* JADX INFO: renamed from: b */
    private final View f2270b;

    /* JADX INFO: renamed from: c */
    private final int f2271c;

    /* JADX INFO: renamed from: d */
    private final ViewGroup f2272d;

    /* JADX INFO: renamed from: f */
    private boolean f2274f;

    /* JADX INFO: renamed from: a */
    boolean f2269a = false;

    /* JADX INFO: renamed from: e */
    private final boolean f2273e = true;

    public asw(View view, int i) {
        this.f2270b = view;
        this.f2271c = i;
        this.f2272d = (ViewGroup) view.getParent();
        m1975g(true);
    }

    /* JADX INFO: renamed from: f */
    private final void m1974f() {
        if (!this.f2269a) {
            View view = this.f2270b;
            int i = this.f2271c;
            int i2 = asu.f2264b;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.f2272d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1975g(false);
    }

    /* JADX INFO: renamed from: g */
    private final void m1975g(boolean z) {
        ViewGroup viewGroup;
        if (!this.f2273e || this.f2274f == z || (viewGroup = this.f2272d) == null) {
            return;
        }
        this.f2274f = z;
        asr.m1972b(viewGroup, z);
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        m1974f();
        asfVar.m1955y(this);
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: b */
    public final void mo1894b() {
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: c */
    public final void mo1895c() {
        m1975g(false);
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: d */
    public final void mo1896d() {
        m1975g(true);
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: e */
    public final void mo1907e(asf asfVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2269a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m1974f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f2269a) {
            return;
        }
        View view = this.f2270b;
        int i = this.f2271c;
        int i2 = asu.f2264b;
        view.setTransitionVisibility(i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f2269a) {
            return;
        }
        View view = this.f2270b;
        int i = asu.f2264b;
        view.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
