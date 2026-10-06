package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class itn extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ itx f32151a;

    public itn(itx itxVar) {
        this.f32151a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f32151a.f32207s.m4550D()) {
            this.f32151a.f32207s.m4560h().setVisibility(0);
        }
        this.f32151a.f32207s.m4556d().setEnabled(true);
        this.f32151a.f32207s.m4576x();
        this.f32151a.f32207s.m4566n().setVisibility(8);
        this.f32151a.f32207s.m4562j().setVisibility(8);
    }
}
