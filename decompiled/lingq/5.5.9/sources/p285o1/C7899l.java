package p285o1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import dm.C5207g;

/* JADX INFO: renamed from: o1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7899l extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f43030a;

    /* JADX INFO: renamed from: b */
    public final boolean f43031b;

    public C7899l(boolean z10, boolean z11) {
        this.f43030a = z10;
        this.f43031b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f43030a);
        textPaint.setStrikeThruText(this.f43031b);
    }
}
