package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dwl f12809a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Resources f12810b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ FocusIndicatorView f12811c;

    public dxb(dwl dwlVar, Resources resources, FocusIndicatorView focusIndicatorView) {
        this.f12809a = dwlVar;
        this.f12810b = resources;
        this.f12811c = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12809a.mo6823o(1);
        this.f12809a.mo6818j(-1);
        this.f12809a.mo6822n(this.f12810b.getDimension(C0100R.dimen.tracking_focus_outer_ring_thickness));
        this.f12809a.mo6819k(this.f12810b.getDimension(C0100R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f12809a.mo6815g(0.0f, 0.0f);
        this.f12811c.invalidate();
    }
}
