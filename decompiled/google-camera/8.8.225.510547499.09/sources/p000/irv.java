package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class irv implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f31954a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f31955b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f31956c;

    public irv(isa isaVar, View view, int i) {
        this.f31956c = i;
        this.f31955b = isaVar;
        this.f31954a = view;
    }

    public irv(nax naxVar, View view, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f31956c = i;
        this.f31955b = naxVar;
        this.f31954a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f31956c) {
            case 0:
                if (this.f31954a.getAlpha() == 0.0f) {
                    this.f31954a.setVisibility(8);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31956c) {
            case 0:
                if (this.f31954a.getAlpha() == 0.0f) {
                    this.f31954a.setVisibility(8);
                    ((isa) this.f31955b).m11670k();
                }
                break;
            default:
                this.f31954a.setAlpha(0.0f);
                this.f31954a.setVisibility(8);
                ((ObjectAnimator) ((nax) this.f31955b).f41919a).removeAllListeners();
                ((nax) this.f31955b).f41919a = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f31956c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f31956c) {
            case 0:
                break;
            default:
                this.f31954a.setVisibility(0);
                break;
        }
    }
}
