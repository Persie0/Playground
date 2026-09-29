package p225kk;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import dm.C5207g;

/* JADX INFO: renamed from: kk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6705b implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final int f37892a;

    /* JADX INFO: renamed from: b */
    public final int f37893b;

    /* JADX INFO: renamed from: c */
    public final boolean f37894c;

    /* JADX INFO: renamed from: d */
    public final Paint f37895d;

    /* JADX INFO: renamed from: e */
    public final float f37896e;

    public C6705b(int i10, int i11, int i12, boolean z10) {
        this.f37892a = i11;
        this.f37893b = i12;
        this.f37894c = z10;
        Paint paint = new Paint();
        this.f37895d = paint;
        this.f37896e = 10.0f;
        paint.setColor(i10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 15.0f}, 15.0f));
        paint.setStrokeWidth(5.0f);
        paint.setAlpha(80);
        this.f37896e = 10.0f;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        C5207g.m11111f(canvas, "c");
        C5207g.m11111f(paint, "p");
        C5207g.m11111f(charSequence, "text");
        int i18 = this.f37892a;
        if (i18 <= i16) {
            int i19 = this.f37893b;
            if (i19 < i15) {
                return;
            }
            boolean z10 = this.f37894c;
            if (!z10) {
                i11 = 10;
            }
            if (i18 > i15 && !z10) {
                i11 = (int) paint.measureText(charSequence.subSequence(i15, i18).toString());
            }
            if (i19 < i16 && z10) {
                i11 -= (int) paint.measureText(charSequence.subSequence(i15, i19).toString());
            }
            if (i15 < i18) {
                i15 = i18;
            }
            if (i16 > i19) {
                i16 = i19;
            }
            int iMeasureText = (int) paint.measureText(charSequence.subSequence(i15, i16).toString());
            float f3 = i13;
            float f10 = this.f37896e;
            canvas.drawLine(i11, f3 + f10, (iMeasureText + i11) - f10, f3 + f10, this.f37895d);
        }
    }
}
