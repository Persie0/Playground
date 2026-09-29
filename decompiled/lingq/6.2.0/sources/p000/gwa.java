package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes.dex */
public final class gwa extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f41433a;

    /* JADX INFO: renamed from: b */
    public final View f41434b;

    /* JADX INFO: renamed from: c */
    public final View f41435c;

    /* JADX INFO: renamed from: d */
    public boolean f41436d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hwa f41437e;

    public gwa(hwa hwaVar, ViewGroup viewGroup, View view, View view2) {
        this.f41437e = hwaVar;
        this.f41433a = viewGroup;
        this.f41434b = view;
        this.f41435c = view2;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        daaVar.mo10189I(this);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
        if (this.f41436d) {
            m12945h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12945h() {
        this.f41435c.setTag(R$id.save_overlay_view, null);
        this.f41433a.getOverlay().remove(this.f41434b);
        this.f41436d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m12945h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f41433a.getOverlay().remove(this.f41434b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f41434b;
        if (view.getParent() == null) {
            this.f41433a.getOverlay().add(view);
        } else {
            this.f41437e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f41435c;
            int i = R$id.save_overlay_view;
            View view2 = this.f41434b;
            view.setTag(i, view2);
            this.f41433a.getOverlay().add(view2);
            this.f41436d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m12945h();
    }
}
