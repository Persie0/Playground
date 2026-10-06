package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dwl f12825a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f12826b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Resources f12827c;

    public dxg(dwl dwlVar, Context context, Resources resources) {
        this.f12825a = dwlVar;
        this.f12826b = context;
        this.f12827c = resources;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12825a.mo6823o(0);
        this.f12825a.mo6818j(this.f12826b.getColor(C0100R.color.square_focus_ring_color));
        this.f12825a.mo6820l(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_size));
        this.f12825a.mo6822n(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_thickness));
        this.f12825a.mo6819k(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_corner_radius));
        this.f12825a.mo6815g(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_inner_boundary_size), this.f12827c.getDimension(C0100R.dimen.square_focus_ring_outer_boundary_size));
        this.f12825a.mo6814f(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_inner_boundary_corner_radius), this.f12827c.getDimension(C0100R.dimen.square_focus_ring_outer_boundary_corner_radius));
        this.f12825a.mo6816h(this.f12827c.getDimension(C0100R.dimen.square_focus_ring_boundary_thickness));
        this.f12825a.mo6813e(this.f12826b.getColor(C0100R.color.square_focus_ring_boundary_color));
    }
}
