package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class n39 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f52296a;

    /* JADX INFO: renamed from: b */
    public final float f52297b;

    /* JADX INFO: renamed from: c */
    public final float f52298c;

    /* JADX INFO: renamed from: d */
    public final float f52299d;

    public n39(int i, float f, float f2, float f3) {
        this.f52296a = i;
        this.f52297b = f;
        this.f52298c = f2;
        this.f52299d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f52299d, this.f52297b, this.f52298c, this.f52296a);
    }
}
