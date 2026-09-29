package p000;

import android.animation.Animator;
import com.lingq.feature.review.views.ReviewProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class ae8 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewProgressBar f555b;

    public /* synthetic */ ae8(ReviewProgressBar reviewProgressBar, int i) {
        this.f554a = i;
        this.f555b = reviewProgressBar;
    }

    /* JADX INFO: renamed from: a */
    private final void m305a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m306b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m307c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m308d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m309e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m310f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m311g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m312h(Animator animator) {
    }

    /* JADX INFO: renamed from: i */
    private final void m313i(Animator animator) {
    }

    /* JADX INFO: renamed from: j */
    private final void m314j(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f554a;
        ReviewProgressBar reviewProgressBar = this.f555b;
        switch (i) {
            case 0:
                reviewProgressBar.f32768L = false;
                break;
            case 1:
                break;
            case 2:
                int i2 = ReviewProgressBar.f32763Q;
                reviewProgressBar.f32766J = false;
                reviewProgressBar.f32765I = false;
                break;
            default:
                reviewProgressBar.f32767K = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f554a;
        ReviewProgressBar reviewProgressBar = this.f555b;
        switch (i) {
            case 0:
                break;
            case 1:
                reviewProgressBar.f32768L = false;
                break;
            case 2:
                int i2 = ReviewProgressBar.f32763Q;
                reviewProgressBar.f32766J = false;
                reviewProgressBar.f32765I = false;
                break;
            default:
                reviewProgressBar.f32767K = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f554a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f554a;
    }
}
