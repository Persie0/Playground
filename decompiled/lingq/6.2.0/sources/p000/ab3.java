package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class ab3 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f456a;

    /* JADX INFO: renamed from: b */
    public final Object f457b;

    public /* synthetic */ ab3(Object obj, int i) {
        this.f456a = i;
        this.f457b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f456a;
        Object obj = this.f457b;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f456a;
        Object obj = this.f457b;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
