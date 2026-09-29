package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import com.lingq.core.designsystem.R$dimen;

/* JADX INFO: loaded from: classes2.dex */
public final class nu8 implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final Layout f53261a;

    /* JADX INFO: renamed from: b */
    public final String f53262b;

    /* JADX INFO: renamed from: c */
    public final je9 f53263c;

    /* JADX INFO: renamed from: d */
    public final float f53264d;

    /* JADX INFO: renamed from: e */
    public final float f53265e;

    /* JADX INFO: renamed from: f */
    public final float f53266f;

    /* JADX INFO: renamed from: g */
    public final RectF f53267g;

    /* JADX INFO: renamed from: h */
    public final float f53268h;

    public nu8(Context context, Layout layout, String str, je9 je9Var) {
        str.getClass();
        je9Var.getClass();
        this.f53261a = layout;
        this.f53262b = str;
        this.f53263c = je9Var;
        this.f53264d = jfa.m14419b(context, 8);
        jfa.m14419b(context, 4);
        this.f53265e = jfa.m14419b(context, 2);
        this.f53266f = jfa.m14419b(context, 2);
        this.f53267g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f53268h = context.getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float lineRight;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        Layout layout = this.f53261a;
        if (layout != null) {
            paint.setAntiAlias(true);
            je9 je9Var = this.f53263c;
            xz7 xz7Var = je9Var.f45484e;
            int i9 = xz7Var.f69004a;
            int length = xz7Var.f69005b >= charSequence.length() ? charSequence.length() : je9Var.f45484e.f69005b;
            int lineForOffset = layout.getLineForOffset(i9);
            int lineForOffset2 = layout.getLineForOffset(length);
            float primaryHorizontal = layout.getPrimaryHorizontal(length);
            float f = this.f53268h;
            if (primaryHorizontal == f) {
                lineForOffset2 = lineForOffset;
            }
            if (lineForOffset > i8 || i8 > lineForOffset2) {
                return;
            }
            String str = this.f53262b;
            if (lineForOffset != i8) {
                lineRight = AbstractC3184kh.m15194A(str) ? layout.getLineRight(lineForOffset2) : layout.getPrimaryHorizontal(0);
            } else if (i9 < 0 || i9 >= charSequence.length()) {
                return;
            } else {
                lineRight = layout.getPrimaryHorizontal(i9);
            }
            int i10 = (int) lineRight;
            if (lineForOffset2 != i8) {
                primaryHorizontal = AbstractC3184kh.m15194A(str) ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
            } else if (primaryHorizontal == f) {
                primaryHorizontal = layout.getLineRight(lineForOffset2);
            }
            int i11 = (int) primaryHorizontal;
            if (AbstractC3184kh.m15194A(str)) {
                i10 = i11;
                i11 = i10;
            }
            int lineTop = (int) (((double) layout.getLineTop(i8)) - (((double) layout.getLineAscent(i8)) / 5.0d));
            double lineBaseline = (((double) (layout.getLineBaseline(i8) - lineTop)) / 5.0d) + ((double) layout.getLineBaseline(i8));
            int color = paint.getColor();
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setStrokeWidth(0.0f);
            paint.setColor(color);
            float f2 = i10;
            float f3 = lineTop;
            float f4 = i11;
            float f5 = (float) lineBaseline;
            RectF rectF = this.f53267g;
            rectF.set(f2, f3, f4, f5);
            float f6 = this.f53266f;
            Number numberValueOf = f2 - f6 < 0.0f ? Integer.valueOf(i10) : Float.valueOf(f2 - f6);
            Number numberValueOf2 = f4 + f6 > ((float) canvas.getClipBounds().right) ? Integer.valueOf(i11) : Float.valueOf(f4 + f6);
            float fFloatValue = numberValueOf.floatValue();
            float f7 = this.f53264d;
            rectF.set(fFloatValue, f3 - f7, numberValueOf2.floatValue(), f5 + f7);
            paint.setStrokeWidth(0.0f);
            paint.setColor(je9Var.f45480a);
            paint.setStyle(style);
            float f8 = this.f53265e;
            canvas.drawRoundRect(rectF, f8, f8, paint);
            rectF.set(Float.valueOf(f2 - f6 < 0.0f ? f2 + f6 : f2 - f6).floatValue(), f3 - f7, Float.valueOf(f4 + f6 > ((float) canvas.getClipBounds().right) ? f4 - f6 : f4 + f6).floatValue(), f5 + f7);
            paint.setColor(je9Var.f45482c);
            paint.setStrokeWidth(f6);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRoundRect(rectF, f8, f8, paint);
            rectF.set(f2, f3 - f7, f4, f5 + f7);
            paint.setStyle(style);
            paint.setStrokeWidth(0.0f);
            paint.setColor(color);
        }
    }
}
