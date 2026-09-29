package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: androidx.emoji2.text.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0904r extends AbstractC0898l {

    /* JADX INFO: renamed from: e */
    public TextPaint f6050e;

    public C0904r(C0903q c0903q) {
        super(c0903q);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f6050e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f6050e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i12, f3 + this.f6024c, i14, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0892f.m3519a().getClass();
        float f10 = i13;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        C0903q c0903q = this.f6023b;
        C0901o c0901o = c0903q.f6048b;
        Typeface typeface = c0901o.f6039d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText(c0901o.f6037b, c0903q.f6047a * 2, 2, f3, f10, paint2);
        paint2.setTypeface(typeface2);
    }
}
