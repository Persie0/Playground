package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hhg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aip f27803a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hhh f27804b;

    /* JADX INFO: renamed from: c */
    private boolean f27805c = false;

    public hhg(hhh hhhVar, aip aipVar) {
        this.f27804b = hhhVar;
        this.f27803a = aipVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f27805c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f27805c) {
            return;
        }
        hhh hhhVar = this.f27804b;
        aip aipVar = this.f27803a;
        hhhVar.m10295f(false);
        aiw aiwVar = new aiw();
        aiwVar.m791c(0.5f);
        aiwVar.m793e(200.0f);
        aiwVar.m792d(hhhVar.m10290a(C0100R.dimen.social_share_menu_bounce_height));
        aiv aivVar = new aiv(hhhVar, ais.f441a);
        aivVar.f461q = aiwVar;
        aivVar.m785i(0.0f);
        aivVar.m782f(aipVar);
        aivVar.m782f(new icl(hhhVar, 1));
        aivVar.mo780d();
    }
}
