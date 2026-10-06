package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class atb extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ atc f2292a;

    public atb(atc atcVar) {
        this.f2292a = atcVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f2292a.mo1979b(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f2292a.mo1980c(drawable);
    }
}
