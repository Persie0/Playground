package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxd extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dwl f12815a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Resources f12816b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ FocusIndicatorView f12817c;

    public dxd(dwl dwlVar, Resources resources, FocusIndicatorView focusIndicatorView) {
        this.f12815a = dwlVar;
        this.f12816b = resources;
        this.f12817c = focusIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f12815a.mo6823o(1);
        this.f12815a.mo6818j(-1);
        this.f12815a.mo6820l(this.f12816b.getDimension(C0100R.dimen.focus_lock_hold_outer_ring_diameter));
        this.f12815a.mo6822n(this.f12816b.getDimension(C0100R.dimen.focus_lock_hold_outer_ring_thickness));
        this.f12815a.mo6819k(this.f12816b.getDimension(C0100R.dimen.focus_indicator_ring_view_size) / 2.0f);
        this.f12815a.mo6815g(0.0f, 0.0f);
        this.f12817c.invalidate();
    }
}
