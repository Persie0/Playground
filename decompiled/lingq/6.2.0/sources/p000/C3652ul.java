package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ul */
/* JADX INFO: loaded from: classes2.dex */
public final class C3652ul extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC3689vl f64039a;

    public C3652ul(AbstractC3689vl abstractC3689vl) {
        this.f64039a = abstractC3689vl;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f64039a.mo23406a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f64039a.mo23407b(drawable);
    }
}
