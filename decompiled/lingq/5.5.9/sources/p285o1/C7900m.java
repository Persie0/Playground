package p285o1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7900m extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final Typeface f43032a;

    public C7900m(Typeface typeface) {
        C5207g.m11111f(typeface, "typeface");
        this.f43032a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "ds");
        textPaint.setTypeface(this.f43032a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "paint");
        textPaint.setTypeface(this.f43032a);
    }
}
