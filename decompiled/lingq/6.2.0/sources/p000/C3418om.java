package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: om */
/* JADX INFO: loaded from: classes2.dex */
public final class C3418om extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f54561a;

    public C3418om(Drawable.ConstantState constantState) {
        this.f54561a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f54561a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f54561a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3465pm c3465pm = new C3465pm(null);
        Drawable drawableNewDrawable = this.f54561a.newDrawable();
        c3465pm.f41098a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3465pm.f56438f);
        return c3465pm;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C3465pm c3465pm = new C3465pm(null);
        Drawable drawableNewDrawable = this.f54561a.newDrawable(resources);
        c3465pm.f41098a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3465pm.f56438f);
        return c3465pm;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C3465pm c3465pm = new C3465pm(null);
        Drawable drawableNewDrawable = this.f54561a.newDrawable(resources, theme);
        c3465pm.f41098a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3465pm.f56438f);
        return c3465pm;
    }
}
