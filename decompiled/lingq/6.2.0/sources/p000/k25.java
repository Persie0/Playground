package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k25 implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final Context f46578a;

    /* JADX INFO: renamed from: b */
    public final Layout f46579b;

    /* JADX INFO: renamed from: c */
    public final String f46580c;

    /* JADX INFO: renamed from: d */
    public final List f46581d;

    /* JADX INFO: renamed from: e */
    public final float f46582e;

    /* JADX INFO: renamed from: f */
    public final float f46583f;

    /* JADX INFO: renamed from: g */
    public final RectF f46584g;

    public k25(Context context, Layout layout, String str, List list) {
        str.getClass();
        this.f46578a = context;
        this.f46579b = layout;
        this.f46580c = str;
        this.f46581d = list;
        this.f46582e = jfa.m14419b(context, 2);
        this.f46583f = jfa.m14419b(context, 3);
        this.f46584g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        float lineRight;
        int primaryHorizontal;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        Layout layout = this.f46579b;
        if (layout != null) {
            paint.setAntiAlias(true);
            for (je9 je9Var : this.f46581d) {
                xz7 xz7Var = je9Var.f45484e;
                int i10 = xz7Var.f69004a;
                int length = xz7Var.f69005b >= charSequence.length() ? charSequence.length() : je9Var.f45484e.f69005b;
                int lineForOffset = layout.getLineForOffset(i10);
                int lineForOffset2 = layout.getLineForOffset(length);
                if (lineForOffset <= i8 && i8 <= lineForOffset2) {
                    String str = this.f46580c;
                    if (lineForOffset != i8) {
                        if (AbstractC3184kh.m15194A(str)) {
                            lineRight = layout.getLineRight(lineForOffset2);
                        } else {
                            i9 = i;
                        }
                        primaryHorizontal = (int) layout.getPrimaryHorizontal(length);
                        if (primaryHorizontal == 0) {
                            primaryHorizontal = (int) layout.getLineRight(lineForOffset2);
                        }
                        if (AbstractC3184kh.m15194A(str)) {
                            int i11 = i9;
                            i9 = primaryHorizontal;
                            primaryHorizontal = i11;
                        }
                        double lineBaseline = (((double) (layout.getLineBaseline(i8) - i3)) / 3.0d) + ((double) layout.getLineBaseline(i8));
                        int i12 = (int) this.f46582e;
                        int color = paint.getColor();
                        paint.setStyle(Paint.Style.FILL);
                        paint.setStrokeWidth(0.0f);
                        paint.setColor(color);
                        paint.setColor(jfa.m14431n(this.f46578a, je9Var.f45480a));
                        float f = i9;
                        float f2 = i12 / 2;
                        RectF rectF = this.f46584g;
                        rectF.set(f - f2, i3 - i12, primaryHorizontal + f2, (float) (lineBaseline + ((double) i12)));
                        float f3 = this.f46583f;
                        canvas.drawRoundRect(rectF, f3, f3, paint);
                        paint.setColor(color);
                    } else if (i10 >= 0 && i10 < charSequence.length()) {
                        lineRight = layout.getPrimaryHorizontal(i10);
                    }
                    i9 = (int) lineRight;
                    primaryHorizontal = (int) layout.getPrimaryHorizontal(length);
                    if (primaryHorizontal == 0) {
                        primaryHorizontal = (int) layout.getLineRight(lineForOffset2);
                    }
                    if (AbstractC3184kh.m15194A(str)) {
                        int i13 = i9;
                        i9 = primaryHorizontal;
                        primaryHorizontal = i13;
                    }
                    double lineBaseline2 = (((double) (layout.getLineBaseline(i8) - i3)) / 3.0d) + ((double) layout.getLineBaseline(i8));
                    int i14 = (int) this.f46582e;
                    int color2 = paint.getColor();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setStrokeWidth(0.0f);
                    paint.setColor(color2);
                    paint.setColor(jfa.m14431n(this.f46578a, je9Var.f45480a));
                    float f4 = i9;
                    float f5 = i14 / 2;
                    RectF rectF2 = this.f46584g;
                    rectF2.set(f4 - f5, i3 - i14, primaryHorizontal + f5, (float) (lineBaseline2 + ((double) i14)));
                    float f6 = this.f46583f;
                    canvas.drawRoundRect(rectF2, f6, f6, paint);
                    paint.setColor(color2);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k25)) {
            return false;
        }
        k25 k25Var = (k25) obj;
        return this.f46578a.equals(k25Var.f46578a) && fa4.m11650l(this.f46579b, k25Var.f46579b) && fa4.m11650l(this.f46580c, k25Var.f46580c) && this.f46581d.equals(k25Var.f46581d);
    }

    public final int hashCode() {
        int iHashCode = this.f46578a.hashCode() * 31;
        Layout layout = this.f46579b;
        return this.f46581d.hashCode() + ux5.m22980c((iHashCode + (layout == null ? 0 : layout.hashCode())) * 31, this.f46580c, 31);
    }

    public final String toString() {
        return "LessonFirstLingQBackgroundSpan(context=" + this.f46578a + ", layout=" + this.f46579b + ", language=" + this.f46580c + ", spans=" + this.f46581d + ")";
    }
}
