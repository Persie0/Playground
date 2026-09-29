package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class fwa extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final View f39816a;

    /* JADX INFO: renamed from: b */
    public final int f39817b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f39818c;

    /* JADX INFO: renamed from: e */
    public boolean f39820e;

    /* JADX INFO: renamed from: f */
    public boolean f39821f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f39819d = true;

    public fwa(View view, int i) {
        this.f39816a = view;
        this.f39817b = i;
        this.f39818c = (ViewGroup) view.getParent();
        m12239h(true);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        daaVar.mo10189I(this);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        m12239h(false);
        if (this.f39821f) {
            return;
        }
        r90 r90Var = awa.f7627a;
        this.f39816a.setTransitionVisibility(this.f39817b);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        m12239h(true);
        if (this.f39821f) {
            return;
        }
        r90 r90Var = awa.f7627a;
        this.f39816a.setTransitionVisibility(0);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
    }

    /* JADX INFO: renamed from: h */
    public final void m12239h(boolean z) {
        ViewGroup viewGroup;
        if (!this.f39819d || this.f39820e == z || (viewGroup = this.f39818c) == null) {
            return;
        }
        this.f39820e = z;
        kta.m15689b(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f39821f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f39821f) {
            r90 r90Var = awa.f7627a;
            this.f39816a.setTransitionVisibility(this.f39817b);
            ViewGroup viewGroup = this.f39818c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12239h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            r90 r90Var = awa.f7627a;
            this.f39816a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.f39818c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f39821f) {
            r90 r90Var = awa.f7627a;
            this.f39816a.setTransitionVisibility(this.f39817b);
            ViewGroup viewGroup = this.f39818c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m12239h(false);
    }
}
