package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class qz3 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final int f58414a;

    /* JADX INFO: renamed from: b */
    public final float f58415b;

    public qz3(int i, float f) {
        this.f58414a = i;
        this.f58415b = f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        paint.getClass();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        if (fontMetricsInt == null) {
            return 1;
        }
        int i3 = -((int) (this.f58414a / this.f58415b));
        fontMetricsInt.ascent = i3;
        fontMetricsInt.top = i3;
        fontMetricsInt.descent = 0;
        fontMetricsInt.bottom = 0;
        return 1;
    }
}
