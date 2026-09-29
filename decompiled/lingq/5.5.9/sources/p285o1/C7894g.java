package p285o1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7894g implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f43008a;

    public C7894g(float f3) {
        this.f43008a = f3;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(fontMetricsInt, "fontMetricsInt");
        int i14 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i14 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f43008a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i14)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
