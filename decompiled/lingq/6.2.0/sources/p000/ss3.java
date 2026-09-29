package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class ss3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f61332b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61333c;

    public /* synthetic */ ss3(int i, View view, Object obj) {
        this.f61331a = i;
        this.f61333c = obj;
        this.f61332b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f61331a) {
            case 2:
                ((zua) this.f61333c).mo10395a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f61331a;
        View view = this.f61332b;
        Object obj = this.f61333c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                hideBottomViewOnScrollBehavior.f12657k = null;
                if (hideBottomViewOnScrollBehavior.f12656j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 1:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                hideViewOnScrollBehavior.f12673k = null;
                if (hideViewOnScrollBehavior.f12672j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 2:
                ((zua) obj).mo17716c();
                break;
            default:
                m5b m5bVar = (m5b) obj;
                m5bVar.f50624a.mo14860e(1.0f);
                h5b.m13061f(view, m5bVar);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f61331a) {
            case 2:
                ((zua) this.f61333c).mo10396b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
