package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p255m3.C7475a;

/* JADX INFO: renamed from: androidx.emoji2.text.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0898l extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0903q f6023b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f6022a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f6024c = -1;

    /* JADX INFO: renamed from: d */
    public float f6025d = 1.0f;

    public AbstractC0898l(C0903q c0903q) {
        if (c0903q == null) {
            throw new NullPointerException("rasterizer cannot be null");
        }
        this.f6023b = c0903q;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f6022a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0903q c0903q = this.f6023b;
        C7475a c7475aM3552c = c0903q.m3552c();
        int iM14859a = c7475aM3552c.m14859a(14);
        this.f6025d = fAbs / (iM14859a != 0 ? c7475aM3552c.f41325b.getShort(iM14859a + c7475aM3552c.f41324a) : (short) 0);
        C7475a c7475aM3552c2 = c0903q.m3552c();
        int iM14859a2 = c7475aM3552c2.m14859a(14);
        if (iM14859a2 != 0) {
            c7475aM3552c2.f41325b.getShort(iM14859a2 + c7475aM3552c2.f41324a);
        }
        C7475a c7475aM3552c3 = c0903q.m3552c();
        int iM14859a3 = c7475aM3552c3.m14859a(12);
        short s10 = (short) ((iM14859a3 != 0 ? c7475aM3552c3.f41325b.getShort(iM14859a3 + c7475aM3552c3.f41324a) : (short) 0) * this.f6025d);
        this.f6024c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
