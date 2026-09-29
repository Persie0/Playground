package p000;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;

/* JADX INFO: loaded from: classes2.dex */
public final class f36 {

    /* JADX INFO: renamed from: a */
    public float[] f38344a;

    /* JADX INFO: renamed from: b */
    public final int[] f38345b;

    /* JADX INFO: renamed from: c */
    public final float[] f38346c;

    /* JADX INFO: renamed from: d */
    public Path f38347d;

    /* JADX INFO: renamed from: e */
    public final Paint f38348e;

    /* JADX INFO: renamed from: f */
    public final Paint f38349f;

    /* JADX INFO: renamed from: g */
    public final Paint f38350g;

    /* JADX INFO: renamed from: h */
    public final Paint f38351h;

    /* JADX INFO: renamed from: i */
    public final Paint f38352i;

    /* JADX INFO: renamed from: j */
    public final float[] f38353j;

    /* JADX INFO: renamed from: k */
    public int f38354k;

    /* JADX INFO: renamed from: l */
    public final Rect f38355l = new Rect();

    /* JADX INFO: renamed from: m */
    public final int f38356m = 1;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0475b f38357n;

    public f36(AbstractC0475b abstractC0475b) {
        this.f38357n = abstractC0475b;
        Paint paint = new Paint();
        this.f38348e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f38349f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f38350g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f38351h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(abstractC0475b.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f38353j = new float[8];
        Paint paint5 = new Paint();
        this.f38352i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f38346c = new float[100];
        this.f38345b = new int[50];
    }

    /* JADX INFO: renamed from: a */
    public final void m11519a(Canvas canvas, int i, int i2, y26 y26Var) {
        Canvas canvas2;
        int width;
        int height;
        float f;
        boolean z;
        Paint paint = this.f38350g;
        int[] iArr = this.f38345b;
        boolean z2 = false;
        int i3 = 4;
        if (i == 4) {
            int i4 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i4 < this.f38354k) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = z3;
                    z = true;
                }
                if (i5 == 0) {
                    z4 = true;
                }
                i4++;
                z3 = z;
                z4 = z4;
            }
            if (z3) {
                float[] fArr = this.f38344a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z4) {
                m11520b(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f38344a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[fArr2.length - 2];
            float f5 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f2, f3, f4, f5, paint);
        } else {
            canvas2 = canvas;
        }
        if (i == 3) {
            m11520b(canvas);
        }
        canvas2.drawLines(this.f38344a, this.f38348e);
        View view = y26Var.f69142b;
        if (view != null) {
            width = view.getWidth();
            height = y26Var.f69142b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 1;
        while (i6 < i2 - 1) {
            if (i != i3 || iArr[i6 - 1] != 0) {
                int i7 = i6 * 2;
                float[] fArr3 = this.f38346c;
                float f6 = fArr3[i7];
                float f7 = fArr3[i7 + 1];
                this.f38347d.reset();
                this.f38347d.moveTo(f6, f7 + 10.0f);
                this.f38347d.lineTo(f6 + 10.0f, f7);
                this.f38347d.lineTo(f6, f7 - 10.0f);
                this.f38347d.lineTo(f6 - 10.0f, f7);
                this.f38347d.close();
                int i8 = i6 - 1;
                Paint paint2 = this.f38352i;
                if (i == i3) {
                    int i9 = iArr[i8];
                    if (i9 == 1) {
                        m11522d(canvas2, f6 - 0.0f, f7 - 0.0f);
                    } else if (i9 == 0) {
                        m11521c(canvas2, f6 - 0.0f, f7 - 0.0f);
                    } else {
                        if (i9 == 2) {
                            f = f7;
                            m11523e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f38347d, paint2);
                    }
                    f = f7;
                    canvas2.drawPath(this.f38347d, paint2);
                } else {
                    f = f7;
                }
                if (i == 2) {
                    m11522d(canvas2, f6 - 0.0f, f - 0.0f);
                }
                if (i == 3) {
                    m11521c(canvas2, f6 - 0.0f, f - 0.0f);
                }
                if (i == 6) {
                    m11523e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                }
                canvas2.drawPath(this.f38347d, paint2);
            }
            i6++;
            z2 = z2;
            i3 = 4;
        }
        boolean z5 = z2;
        float[] fArr4 = this.f38344a;
        if (fArr4.length > 1) {
            float f8 = fArr4[z5 ? 1 : 0];
            float f9 = fArr4[1];
            Paint paint3 = this.f38349f;
            canvas2.drawCircle(f8, f9, 8.0f, paint3);
            float[] fArr5 = this.f38344a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11520b(Canvas canvas) {
        float[] fArr = this.f38344a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = this.f38350g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* JADX INFO: renamed from: c */
    public final void m11521c(Canvas canvas, float f, float f2) {
        float[] fArr = this.f38344a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f38351h;
        Rect rect = this.f38355l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = this.f38350g;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* JADX INFO: renamed from: d */
    public final void m11522d(Canvas canvas, float f, float f2) {
        float[] fArr = this.f38344a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = (f7 * f9) + f3;
        float f11 = (f9 * f8) + f4;
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f38351h;
        Rect rect = this.f38355l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f38350g);
    }

    /* JADX INFO: renamed from: e */
    public final void m11523e(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        AbstractC0475b abstractC0475b = this.f38357n;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (abstractC0475b.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f38351h;
        Rect rect = this.f38355l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f38350g;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (abstractC0475b.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
