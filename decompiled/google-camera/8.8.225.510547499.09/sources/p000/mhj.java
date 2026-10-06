package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mhj extends atc {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mhm f40509b;

    public mhj(mhm mhmVar) {
        this.f40509b = mhmVar;
    }

    @Override // p000.atc
    /* JADX INFO: renamed from: b */
    public final void mo1979b(Drawable drawable) {
        ColorStateList colorStateList = this.f40509b.f40516b;
        if (colorStateList != null) {
            acv.m238g(drawable, colorStateList);
        }
    }

    @Override // p000.atc
    /* JADX INFO: renamed from: c */
    public final void mo1980c(Drawable drawable) {
        mhm mhmVar = this.f40509b;
        ColorStateList colorStateList = mhmVar.f40516b;
        if (colorStateList != null) {
            acv.m237f(drawable, colorStateList.getColorForState(mhmVar.f40518d, colorStateList.getDefaultColor()));
        }
    }
}
