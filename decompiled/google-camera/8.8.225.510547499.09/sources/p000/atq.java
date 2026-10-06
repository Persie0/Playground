package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class atq extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    private final Drawable.ConstantState f2367a;

    public atq(Drawable.ConstantState constantState) {
        this.f2367a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2367a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2367a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        atr atrVar = new atr();
        atrVar.f2308e = (VectorDrawable) this.f2367a.newDrawable();
        return atrVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        atr atrVar = new atr();
        atrVar.f2308e = (VectorDrawable) this.f2367a.newDrawable(resources);
        return atrVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        atr atrVar = new atr();
        atrVar.f2308e = (VectorDrawable) this.f2367a.newDrawable(resources, theme);
        return atrVar;
    }
}
