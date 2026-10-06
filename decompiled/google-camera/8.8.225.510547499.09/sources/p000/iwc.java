package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    private final WearSnapshot f32458a;

    public iwc(WearSnapshot wearSnapshot) {
        this.f32458a = wearSnapshot;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f32458a.m4601b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32458a.m4601b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f32458a.f7456a.getBitmap().prepareToDraw();
        WearSnapshot wearSnapshot = this.f32458a;
        wearSnapshot.m4600a().add(wearSnapshot.f7456a);
    }
}
