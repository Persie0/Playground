package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class sda extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final rda f60719b;

    /* JADX INFO: renamed from: e */
    public TextPaint f60722e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f60718a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f60720c = -1;

    /* JADX INFO: renamed from: d */
    public float f60721d = 1.0f;

    public sda(rda rdaVar) {
        xwc.m24776n(rdaVar, "rasterizer cannot be null");
        this.f60719b = rdaVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f60722e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f60722e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f60720c, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        pq2.m19448a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        rda rdaVar = this.f60719b;
        C3329mb c3329mb = rdaVar.f59140b;
        Typeface typeface = (Typeface) c3329mb.f50863e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c3329mb.f50861c, rdaVar.f59139a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f60718a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        rda rdaVar = this.f60719b;
        ky5 ky5VarM20595b = rdaVar.m20595b();
        int iM22869a = ky5VarM20595b.m22869a(14);
        this.f60721d = fAbs / (iM22869a != 0 ? ((ByteBuffer) ky5VarM20595b.f64232d).getShort(iM22869a + ky5VarM20595b.f64229a) : (short) 0);
        ky5 ky5VarM20595b2 = rdaVar.m20595b();
        int iM22869a2 = ky5VarM20595b2.m22869a(14);
        if (iM22869a2 != 0) {
            ((ByteBuffer) ky5VarM20595b2.f64232d).getShort(iM22869a2 + ky5VarM20595b2.f64229a);
        }
        ky5 ky5VarM20595b3 = rdaVar.m20595b();
        int iM22869a3 = ky5VarM20595b3.m22869a(12);
        short s = (short) ((iM22869a3 != 0 ? ((ByteBuffer) ky5VarM20595b3.f64232d).getShort(iM22869a3 + ky5VarM20595b3.f64229a) : (short) 0) * this.f60721d);
        this.f60720c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
