package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxe extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FocusIndicatorView f12818a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ FocusIndicatorAccessoryView f12819b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ dwl f12820c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Context f12821d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Resources f12822e;

    public dxe(FocusIndicatorView focusIndicatorView, FocusIndicatorAccessoryView focusIndicatorAccessoryView, dwl dwlVar, Context context, Resources resources) {
        this.f12818a = focusIndicatorView;
        this.f12819b = focusIndicatorAccessoryView;
        this.f12820c = dwlVar;
        this.f12821d = context;
        this.f12822e = resources;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (((Boolean) ((jwf) this.f12818a.f6694d).f34942d).booleanValue()) {
            this.f12819b.setImageDrawable(this.f12819b.getResources().getDrawable(C0100R.drawable.ic_focus_lock, null));
            this.f12820c.mo6818j(this.f12821d.getColor(C0100R.color.square_focus_ring_color));
        }
        this.f12819b.m4130e();
        this.f12819b.m4127b();
        this.f12820c.mo6823o(1);
        this.f12820c.mo6820l(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_size));
        this.f12820c.mo6822n(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_thickness));
        this.f12820c.mo6819k(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_corner_radius));
        this.f12820c.mo6815g(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_inner_boundary_size), this.f12822e.getDimension(C0100R.dimen.square_focus_ring_outer_boundary_size));
        this.f12820c.mo6814f(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_inner_boundary_corner_radius), this.f12822e.getDimension(C0100R.dimen.square_focus_ring_outer_boundary_corner_radius));
        this.f12820c.mo6816h(this.f12822e.getDimension(C0100R.dimen.square_focus_ring_boundary_thickness));
        this.f12820c.mo6813e(this.f12821d.getColor(C0100R.color.square_focus_ring_boundary_color));
    }
}
