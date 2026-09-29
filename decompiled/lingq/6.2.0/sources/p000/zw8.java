package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import com.google.android.material.R$attr;
import com.lingq.core.designsystem.R$dimen;

/* JADX INFO: loaded from: classes2.dex */
public final class zw8 implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final Layout f72314a;

    /* JADX INFO: renamed from: b */
    public final String f72315b;

    /* JADX INFO: renamed from: c */
    public final int f72316c;

    /* JADX INFO: renamed from: d */
    public final int f72317d;

    /* JADX INFO: renamed from: e */
    public final float f72318e;

    /* JADX INFO: renamed from: f */
    public final float f72319f;

    /* JADX INFO: renamed from: g */
    public final Paint f72320g;

    /* JADX INFO: renamed from: h */
    public final float f72321h;

    public zw8(Context context, Layout layout, String str, int i, int i2) {
        str.getClass();
        this.f72314a = layout;
        this.f72315b = str;
        this.f72316c = i;
        this.f72317d = i2;
        this.f72318e = jfa.m14419b(context, 5);
        this.f72319f = jfa.m14419b(context, 3);
        Paint paint = new Paint();
        this.f72320g = paint;
        this.f72321h = context.getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin);
        paint.setAntiAlias(true);
        paint.setColor(jfa.m14431n(context, R$attr.colorOnSurface));
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float lineRight;
        float lineLeft;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        Layout layout = this.f72314a;
        if (layout != null) {
            paint.setAntiAlias(true);
            int i9 = this.f72316c;
            int lineForOffset = layout.getLineForOffset(i9);
            int i10 = this.f72317d;
            int lineForOffset2 = layout.getLineForOffset(i10);
            float primaryHorizontal = layout.getPrimaryHorizontal(i10);
            float f = this.f72321h;
            if (primaryHorizontal == f) {
                lineForOffset2 = lineForOffset;
            }
            if (lineForOffset > i8 || i8 > lineForOffset2) {
                return;
            }
            String str = this.f72315b;
            if (lineForOffset != i8) {
                lineRight = AbstractC3184kh.m15194A(str) ? layout.getLineRight(lineForOffset2) : layout.getPrimaryHorizontal(0);
            } else if (i9 < 0 || i9 >= charSequence.length()) {
                return;
            } else {
                lineRight = layout.getPrimaryHorizontal(i9);
            }
            int i11 = (int) lineRight;
            if (lineForOffset2 == i8) {
                lineLeft = layout.getPrimaryHorizontal(i10);
                if (lineLeft == f) {
                    lineLeft = layout.getLineRight(lineForOffset2);
                }
            } else {
                lineLeft = AbstractC3184kh.m15194A(str) ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
            }
            int i12 = (int) lineLeft;
            if (AbstractC3184kh.m15194A(str)) {
                i12 = i11;
                i11 = i12;
            }
            double lineBaseline = (((double) (layout.getLineBaseline(i8) - ((int) (((double) layout.getLineTop(i8)) - (((double) layout.getLineAscent(i8)) / 5.0d))))) / 5.0d) + ((double) layout.getLineBaseline(i8)) + ((double) this.f72318e);
            float f2 = this.f72319f;
            Paint paint2 = this.f72320g;
            paint2.setStrokeWidth(f2);
            paint2.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            float f3 = (float) lineBaseline;
            path.moveTo(i11, f3);
            path.lineTo(i12, f3);
            canvas.drawPath(path, paint2);
        }
    }
}
