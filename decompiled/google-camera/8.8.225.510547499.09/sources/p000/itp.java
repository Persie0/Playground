package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class itp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ itq f32153a;

    public itp(itq itqVar) {
        this.f32153a = itqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f32153a.f32155b.f32207s.m4550D()) {
            this.f32153a.f32155b.f32207s.m4560h().setAlpha(1.0f);
            this.f32153a.f32155b.f32207s.m4560h().setVisibility(0);
        }
        itx itxVar = this.f32153a.f32155b;
        if (itxVar.f32176L != 1) {
            itxVar.f32207s.m4566n().setVisibility(8);
            this.f32153a.f32155b.f32207s.m4566n().setEnabled(false);
        }
        this.f32153a.f32155b.f32207s.m4563k().setEnabled(true);
        this.f32153a.f32155b.f32207s.m4556d().animate().setListener(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f32153a.f32155b.f32207s.m4556d().setVisibility(0);
    }
}
