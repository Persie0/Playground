package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class itk extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ itx f32148a;

    public itk(itx itxVar) {
        this.f32148a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float fFloatValue = ((Float) this.f32148a.f32198j.mo3831be()).floatValue();
        itx itxVar = this.f32148a;
        float f = itxVar.f32170F;
        if (fFloatValue < f) {
            itxVar.f32198j.mo3415bf(Float.valueOf(f));
        }
        if (this.f32148a.f32207s.m4550D()) {
            this.f32148a.m11781C();
        } else {
            this.f32148a.mo11681k();
        }
    }
}
