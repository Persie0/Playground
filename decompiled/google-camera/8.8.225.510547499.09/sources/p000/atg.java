package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atg extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    private final Drawable.ConstantState f2302a;

    public atg(Drawable.ConstantState constantState) {
        this.f2302a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2302a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2302a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ati atiVar = new ati();
        atiVar.f2308e = this.f2302a.newDrawable();
        atiVar.f2308e.setCallback(atiVar.f2306d);
        return atiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ati atiVar = new ati();
        atiVar.f2308e = this.f2302a.newDrawable(resources);
        atiVar.f2308e.setCallback(atiVar.f2306d);
        return atiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ati atiVar = new ati();
        atiVar.f2308e = this.f2302a.newDrawable(resources, theme);
        atiVar.f2308e.setCallback(atiVar.f2306d);
        return atiVar;
    }
}
