package p285o1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import dm.C5207g;

/* JADX INFO: renamed from: o1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7897j extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f43025a;

    /* JADX INFO: renamed from: b */
    public final float f43026b;

    /* JADX INFO: renamed from: c */
    public final float f43027c;

    /* JADX INFO: renamed from: d */
    public final float f43028d;

    public C7897j(float f3, float f10, float f11, int i10) {
        this.f43025a = i10;
        this.f43026b = f3;
        this.f43027c = f10;
        this.f43028d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "tp");
        textPaint.setShadowLayer(this.f43028d, this.f43026b, this.f43027c, this.f43025a);
    }
}
