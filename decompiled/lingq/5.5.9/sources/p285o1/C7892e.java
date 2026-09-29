package p285o1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7892e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final float f43006a;

    public C7892e(float f3) {
        this.f43006a = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f43006a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f43006a);
    }
}
