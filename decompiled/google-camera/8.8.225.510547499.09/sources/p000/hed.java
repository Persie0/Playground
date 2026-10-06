package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hed extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SmartsUiGleamingView f27436a;

    public hed(SmartsUiGleamingView smartsUiGleamingView) {
        this.f27436a = smartsUiGleamingView;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.f27436a.m4294a();
    }
}
