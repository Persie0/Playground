package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxl extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f29818a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ImageView f29819b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ImageView f29820c;

    public hxl(boolean z, ImageView imageView, ImageView imageView2) {
        this.f29818a = z;
        this.f29819b = imageView;
        this.f29820c = imageView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f29818a) {
            this.f29820c.setVisibility(8);
        } else {
            this.f29819b.setVisibility(8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f29818a) {
            this.f29819b.setVisibility(0);
        } else {
            this.f29820c.setVisibility(0);
        }
    }
}
