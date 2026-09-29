package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class qt0 extends AnimatorListenerAdapter implements caa {

    /* JADX INFO: renamed from: a */
    public final ImageView f58171a;

    /* JADX INFO: renamed from: b */
    public final Matrix f58172b;

    /* JADX INFO: renamed from: c */
    public final Matrix f58173c;

    /* JADX INFO: renamed from: d */
    public boolean f58174d = true;

    public qt0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.f58171a = imageView;
        this.f58172b = matrix;
        this.f58173c = matrix2;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        if (this.f58174d) {
            int i = R$id.transition_image_transform;
            ImageView imageView = this.f58171a;
            imageView.setTag(i, this.f58172b);
            u04.m22374a(imageView, this.f58173c);
        }
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        int i = R$id.transition_image_transform;
        ImageView imageView = this.f58171a;
        Matrix matrix = (Matrix) imageView.getTag(i);
        if (matrix != null) {
            u04.m22374a(imageView, matrix);
            imageView.setTag(R$id.transition_image_transform, null);
        }
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f58174d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
        int i = R$id.transition_image_transform;
        ImageView imageView = this.f58171a;
        imageView.setTag(i, matrix);
        u04.m22374a(imageView, this.f58173c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        int i = R$id.transition_image_transform;
        ImageView imageView = this.f58171a;
        Matrix matrix = (Matrix) imageView.getTag(i);
        if (matrix != null) {
            u04.m22374a(imageView, matrix);
            imageView.setTag(R$id.transition_image_transform, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        this.f58174d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.f58174d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f58174d = false;
    }
}
