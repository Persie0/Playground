package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ooa extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f54660a;

    public ooa(Drawable.ConstantState constantState) {
        this.f54660a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f54660a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f54660a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        poa poaVar = new poa();
        poaVar.f41098a = (VectorDrawable) this.f54660a.newDrawable();
        return poaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        poa poaVar = new poa();
        poaVar.f41098a = (VectorDrawable) this.f54660a.newDrawable(resources);
        return poaVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        poa poaVar = new poa();
        poaVar.f41098a = (VectorDrawable) this.f54660a.newDrawable(resources, theme);
        return poaVar;
    }
}
