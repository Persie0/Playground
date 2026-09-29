package p285o1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import dm.C5207g;

/* JADX INFO: renamed from: o1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7896i extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public Paint.FontMetricsInt f43021a;

    /* JADX INFO: renamed from: b */
    public int f43022b;

    /* JADX INFO: renamed from: c */
    public int f43023c;

    /* JADX INFO: renamed from: d */
    public boolean f43024d;

    public C7896i() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m15660a() {
        Paint.FontMetricsInt fontMetricsInt = this.f43021a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C5207g.m11117l("fontMetrics");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final int m15661b() {
        if (this.f43024d) {
            return this.f43023c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* JADX INFO: renamed from: c */
    public final int m15662c() {
        if (this.f43024d) {
            return this.f43022b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
        C5207g.m11111f(canvas, "canvas");
        C5207g.m11111f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        C5207g.m11111f(paint, "paint");
        boolean z10 = true;
        this.f43024d = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        C5207g.m11110e(fontMetricsInt2, "paint.fontMetricsInt");
        this.f43021a = fontMetricsInt2;
        if (m15660a().descent <= m15660a().ascent) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        this.f43022b = (int) Math.ceil(0.0f);
        this.f43023c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m15660a().ascent;
            fontMetricsInt.descent = m15660a().descent;
            fontMetricsInt.leading = m15660a().leading;
            if (fontMetricsInt.ascent > (-m15661b())) {
                fontMetricsInt.ascent = -m15661b();
            }
            fontMetricsInt.top = Math.min(m15660a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m15660a().bottom, fontMetricsInt.descent);
        }
        return m15662c();
    }
}
