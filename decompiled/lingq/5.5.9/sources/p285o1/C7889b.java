package p285o1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7889b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final String f43004a;

    public C7889b(String str) {
        this.f43004a = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f43004a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f43004a);
    }
}
