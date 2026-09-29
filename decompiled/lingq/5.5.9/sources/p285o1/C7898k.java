package p285o1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7898k extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final float f43029a;

    public C7898k(float f3) {
        this.f43029a = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f43029a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f43029a);
    }
}
