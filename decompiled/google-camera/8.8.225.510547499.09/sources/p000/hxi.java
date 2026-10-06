package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxi extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    boolean f29799a = false;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ double f29800b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ hxk f29801c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f29802d;

    public hxi(hxk hxkVar, double d, int i) {
        this.f29801c = hxkVar;
        this.f29800b = d;
        this.f29802d = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f29799a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f29799a) {
            return;
        }
        this.f29801c.f29806d.setEnabled(true);
        hxk hxkVar = this.f29801c;
        hxkVar.f29805c.m4354n(hxkVar.f29806d.m4440a(this.f29800b));
        if (this.f29802d == 2) {
            hxk hxkVar2 = this.f29801c;
            hxkVar2.m10830s(hxk.m10811u((int) hxkVar2.f29806d.m4442c()));
            this.f29801c.m10819h();
        } else {
            hxk hxkVar3 = this.f29801c;
            hxkVar3.f29806d.f7204e = 0.0d;
            hxkVar3.f29805c.m4351k(hxkVar3.m10813b(hxkVar3.f29808f));
        }
        this.f29801c.f29806d.setProgress((int) this.f29800b);
        hxk hxkVar4 = this.f29801c;
        hxkVar4.f29807e = false;
        hxkVar4.m10817f();
    }
}
