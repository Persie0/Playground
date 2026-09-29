package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class lt0 extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final Rect f50092a;

    /* JADX INFO: renamed from: b */
    public final Rect f50093b;

    /* JADX INFO: renamed from: c */
    public final View f50094c;

    public lt0(View view, Rect rect, Rect rect2) {
        this.f50094c = view;
        this.f50092a = rect;
        this.f50093b = rect2;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        View view = this.f50094c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = mt0.f51819f0;
        }
        view.setTag(R$id.transition_clip, clipBounds);
        view.setClipBounds(this.f50093b);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        int i = R$id.transition_clip;
        View view = this.f50094c;
        view.setClipBounds((Rect) view.getTag(i));
        view.setTag(R$id.transition_clip, null);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        View view = this.f50094c;
        if (z) {
            view.setClipBounds(this.f50092a);
        } else {
            view.setClipBounds(this.f50093b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
