package p285o1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7888a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final float f43003a;

    public C7888a(float f3) {
        this.f43003a = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f43003a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f43003a);
    }
}
