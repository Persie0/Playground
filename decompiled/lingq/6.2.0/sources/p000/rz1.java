package p000;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class rz1 implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final int f60066a;

    /* JADX INFO: renamed from: b */
    public final int f60067b;

    /* JADX INFO: renamed from: c */
    public final boolean f60068c;

    /* JADX INFO: renamed from: d */
    public final Paint f60069d;

    /* JADX INFO: renamed from: e */
    public final float f60070e;

    public rz1(int i, int i2, int i3, boolean z) {
        this.f60066a = i2;
        this.f60067b = i3;
        this.f60068c = z;
        Paint paint = new Paint();
        this.f60069d = paint;
        this.f60070e = 10.0f;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 15.0f}, 15.0f));
        paint.setStrokeWidth(5.0f);
        paint.setAlpha(80);
        this.f60070e = 10.0f;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        int i10 = this.f60066a;
        if (i10 > i7 || (i9 = this.f60067b) < i6) {
            return;
        }
        boolean z = this.f60068c;
        if (!z) {
            i2 = 10;
        }
        if (i10 > i6 && !z) {
            i2 = (int) paint.measureText(charSequence.subSequence(i6, i10).toString());
        }
        if (i9 < i7 && z) {
            i2 -= (int) paint.measureText(charSequence.subSequence(i6, i9).toString());
        }
        if (i6 < i10) {
            i6 = i10;
        }
        if (i7 > i9) {
            i7 = i9;
        }
        int iMeasureText = (int) paint.measureText(charSequence.subSequence(i6, i7).toString());
        float f = i4;
        float f2 = this.f60070e;
        canvas.drawLine(i2, f + f2, (iMeasureText + i2) - f2, f + f2, this.f60069d);
    }
}
