package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mhx extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mhy f40554a;

    public mhx(mhy mhyVar) {
        this.f40554a = mhyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.f40554a;
    }
}
