package p000;

import android.animation.Animator;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpf implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f12205a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12206b;

    public dpf(EvCompView evCompView, int i) {
        this.f12206b = i;
        this.f12205a = evCompView;
    }

    public dpf(dab dabVar, int i) {
        this.f12206b = i;
        this.f12205a = dabVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f12206b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f12206b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f12206b) {
            case 0:
                if (((EvCompView) this.f12205a).getAlpha() == 0.0f) {
                    ((EvCompView) this.f12205a).setVisibility(8);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12206b) {
            case 0:
                if (((EvCompView) this.f12205a).getAlpha() == 0.0f) {
                    ((EvCompView) this.f12205a).setVisibility(8);
                }
                break;
            default:
                ((dab) this.f12205a).f10211f.mo10992a();
                ((dab) this.f12205a).f10220o = null;
                break;
        }
    }
}
