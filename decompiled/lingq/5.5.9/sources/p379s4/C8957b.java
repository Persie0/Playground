package p379s4;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: s4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8957b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8959d.a f46924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8959d f46925b;

    public C8957b(C8959d c8959d, C8959d.a aVar) {
        this.f46925b = c8959d;
        this.f46924a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C8959d c8959d = this.f46925b;
        c8959d.getClass();
        C8959d.a aVar = this.f46924a;
        C8959d.m17183d(fFloatValue, aVar);
        c8959d.m17184a(fFloatValue, aVar, false);
        c8959d.invalidateSelf();
    }
}
