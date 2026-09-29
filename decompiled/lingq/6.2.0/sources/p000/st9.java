package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class st9 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f61395a;

    /* JADX INFO: renamed from: b */
    public final boolean f61396b;

    public st9(boolean z, boolean z2) {
        this.f61395a = z;
        this.f61396b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f61395a);
        textPaint.setStrikeThruText(this.f61396b);
    }
}
