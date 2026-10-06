package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gsj extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gsm f26221a;

    public gsj(gsm gsmVar) {
        this.f26221a = gsmVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        gsm gsmVar = this.f26221a;
        if (gsmVar.f26224b) {
            gsmVar.f26225c.start();
        }
    }
}
