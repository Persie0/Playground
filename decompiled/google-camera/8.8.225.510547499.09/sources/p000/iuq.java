package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.ViewGroup;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iuq extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomUi f32243a;

    public iuq(ZoomUi zoomUi) {
        this.f32243a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f32243a.m4559g().getVisibility() == 8) {
            this.f32243a.m4559g().setVisibility(0);
            this.f32243a.m4555c().setVisibility(0);
            this.f32243a.m4560h().setVisibility(0);
            this.f32243a.m4576x();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroupM4555c = this.f32243a.m4555c();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM4555c, (Property<ViewGroup, Float>) ZoomUi.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat.addListener(new iun(viewGroupM4555c));
        objectAnimatorOfFloat.start();
    }
}
