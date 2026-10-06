package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dwl f12812a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Resources f12813b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ FocusIndicatorView f12814c;

    public dxc(dwl dwlVar, Resources resources, FocusIndicatorView focusIndicatorView) {
        this.f12812a = dwlVar;
        this.f12813b = resources;
        this.f12814c = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12812a.mo6823o(1);
        this.f12812a.mo6818j(-1);
        this.f12812a.mo6822n(this.f12813b.getDimension(C0100R.dimen.active_focus_outer_ring_thickness));
        this.f12812a.mo6819k(this.f12813b.getDimension(C0100R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f12812a.mo6815g(0.0f, 0.0f);
        this.f12814c.invalidate();
    }
}
