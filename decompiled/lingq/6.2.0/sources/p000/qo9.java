package p000;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class qo9 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f58019b;

    public /* synthetic */ qo9(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f58018a = i;
        this.f58019b = swipeRefreshLayout;
    }

    /* JADX INFO: renamed from: a */
    private final void m20087a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m20088b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m20089c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m20090d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.f58018a;
        SwipeRefreshLayout swipeRefreshLayout = this.f58019b;
        switch (i) {
            case 0:
                if (!swipeRefreshLayout.f7092b) {
                    swipeRefreshLayout.m2886l();
                } else {
                    swipeRefreshLayout.f7086T.setAlpha(255);
                    swipeRefreshLayout.f7086T.start();
                    swipeRefreshLayout.f7074H = swipeRefreshLayout.f7080N.getTop();
                }
                break;
            default:
                ro9 ro9Var = new ro9(swipeRefreshLayout, 1);
                swipeRefreshLayout.f7088V = ro9Var;
                ro9Var.setDuration(150L);
                e21 e21Var = swipeRefreshLayout.f7080N;
                e21Var.f36611a = null;
                e21Var.clearAnimation();
                swipeRefreshLayout.f7080N.startAnimation(swipeRefreshLayout.f7088V);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f58018a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f58018a;
    }
}
