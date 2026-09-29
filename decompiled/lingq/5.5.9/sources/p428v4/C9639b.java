package p428v4;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9639b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9640c f49340a;

    public C9639b(AbstractC9640c abstractC9640c) {
        this.f49340a = abstractC9640c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f49340a.mo4937a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f49340a.mo8668b(drawable);
    }
}
