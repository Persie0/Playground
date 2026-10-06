package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class AnimationAnimationListenerC0055ba implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0133dl f2833a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewGroup f2834b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f2835c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0060bf f2836d;

    public AnimationAnimationListenerC0055ba(C0133dl c0133dl, ViewGroup viewGroup, View view, C0060bf c0060bf) {
        this.f2833a = c0133dl;
        this.f2834b = viewGroup;
        this.f2835c = view;
        this.f2836d = c0060bf;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2834b.post(new RunnableC0059be(this, 1));
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.f2833a);
            sb.append(" has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.f2833a);
            sb.append(" has reached onAnimationStart.");
        }
    }
}
