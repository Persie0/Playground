package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0950f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SpecialEffectsController.Operation f6281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f6282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6283c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0942b.b f6284d;

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnimationAnimationListenerC0950f animationAnimationListenerC0950f = AnimationAnimationListenerC0950f.this;
            animationAnimationListenerC0950f.f6282b.endViewTransition(animationAnimationListenerC0950f.f6283c);
            animationAnimationListenerC0950f.f6284d.m3721a();
        }
    }

    public AnimationAnimationListenerC0950f(View view, ViewGroup viewGroup, C0942b.b bVar, SpecialEffectsController.Operation operation) {
        this.f6281a = operation;
        this.f6282b = viewGroup;
        this.f6283c = view;
        this.f6284d = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f6282b.post(new a());
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6281a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6281a + " has reached onAnimationStart.");
        }
    }
}
