package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hda extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f27288a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SmartsChipView f27289b;

    public hda(SmartsChipView smartsChipView, int i) {
        this.f27289b = smartsChipView;
        this.f27288a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27289b.setVisibility(this.f27288a);
    }
}
