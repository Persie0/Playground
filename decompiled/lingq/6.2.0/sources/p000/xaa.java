package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class xaa extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final View f68002a;

    /* JADX INFO: renamed from: b */
    public final View f68003b;

    /* JADX INFO: renamed from: c */
    public int[] f68004c;

    /* JADX INFO: renamed from: d */
    public float f68005d;

    /* JADX INFO: renamed from: e */
    public float f68006e;

    /* JADX INFO: renamed from: f */
    public final float f68007f;

    /* JADX INFO: renamed from: g */
    public final float f68008g;

    /* JADX INFO: renamed from: h */
    public boolean f68009h;

    public xaa(View view, View view2, float f, float f2) {
        this.f68003b = view;
        this.f68002a = view2;
        this.f68007f = f;
        this.f68008g = f2;
        int[] iArr = (int[]) view2.getTag(R$id.transition_position);
        this.f68004c = iArr;
        if (iArr != null) {
            view2.setTag(R$id.transition_position, null);
        }
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        mo4478e(daaVar);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        if (this.f68004c == null) {
            this.f68004c = new int[2];
        }
        int[] iArr = this.f68004c;
        View view = this.f68003b;
        view.getLocationOnScreen(iArr);
        this.f68002a.setTag(R$id.transition_position, this.f68004c);
        this.f68005d = view.getTranslationX();
        this.f68006e = view.getTranslationY();
        view.setTranslationX(this.f68007f);
        view.setTranslationY(this.f68008g);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: e */
    public final void mo4478e(daa daaVar) {
        if (this.f68009h) {
            return;
        }
        this.f68002a.setTag(R$id.transition_position, null);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        float f = this.f68005d;
        View view = this.f68003b;
        view.setTranslationX(f);
        view.setTranslationY(this.f68006e);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
        this.f68009h = true;
        float f = this.f68007f;
        View view = this.f68003b;
        view.setTranslationX(f);
        view.setTranslationY(this.f68008g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f68009h = true;
        float f = this.f68007f;
        View view = this.f68003b;
        view.setTranslationX(f);
        view.setTranslationY(this.f68008g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f68007f;
        View view = this.f68003b;
        view.setTranslationX(f);
        view.setTranslationY(this.f68008g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
