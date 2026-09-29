package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3172k5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f46717b;

    public /* synthetic */ C3172k5(Object obj, int i) {
        this.f46716a = i;
        this.f46717b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f46716a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f46717b;
                actionBarOverlayLayout.f1089R = null;
                actionBarOverlayLayout.f1104j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f46716a;
        Object obj = this.f46717b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f1089R = null;
                actionBarOverlayLayout.f1104j = false;
                break;
            default:
                ((daa) obj).m10213q();
                animator.removeListener(this);
                break;
        }
    }
}
