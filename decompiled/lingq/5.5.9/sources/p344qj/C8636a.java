package p344qj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import p003a2.C0009a;
import p096ei.C5408a;
import p225kk.C6716m;
import p265mj.C7569c;
import p265mj.C7570d;
import sj.C9050i;

/* JADX INFO: renamed from: qj.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8636a implements LineBackgroundSpan {

    /* JADX INFO: renamed from: e */
    public static final float f46174e;

    /* JADX INFO: renamed from: f */
    public static final float f46175f;

    /* JADX INFO: renamed from: a */
    public final Context f46176a;

    /* JADX INFO: renamed from: b */
    public final Layout f46177b;

    /* JADX INFO: renamed from: c */
    public final List<C7569c> f46178c;

    /* JADX INFO: renamed from: d */
    public final RectF f46179d;

    static {
        List<Integer> list = C6716m.f37937a;
        f46174e = C6716m.m13316a(2);
        f46175f = C6716m.m13316a(3);
    }

    public C8636a(Context context, Layout layout, List<C7569c> list) {
        C5207g.m11111f(list, "spans");
        this.f46176a = context;
        this.f46177b = layout;
        this.f46178c = list;
        this.f46179d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        int i18;
        float lineRight;
        int primaryHorizontal;
        C5207g.m11111f(canvas, "c");
        C5207g.m11111f(paint, "p");
        C5207g.m11111f(charSequence, "text");
        Layout layout = this.f46177b;
        if (layout != null) {
            boolean z10 = true;
            paint.setAntiAlias(true);
            Iterator it = this.f46178c.iterator();
            while (it.hasNext()) {
                C7569c c7569c = (C7569c) it.next();
                C7570d c7570d = c7569c.f41717d;
                int i19 = c7570d.f41721a;
                int length = c7570d.f41722b >= charSequence.length() ? charSequence.length() : c7569c.f41717d.f41722b;
                int lineForOffset = layout.getLineForOffset(i19);
                int lineForOffset2 = layout.getLineForOffset(length);
                if ((lineForOffset > i17 || i17 > lineForOffset2) ? false : z10) {
                    if (lineForOffset != i17) {
                        if (C5408a.m11572e(C9050i.f47331a)) {
                            lineRight = layout.getLineRight(lineForOffset2);
                        } else {
                            i18 = i10;
                        }
                        primaryHorizontal = (int) layout.getPrimaryHorizontal(length);
                        if (primaryHorizontal == 0) {
                            primaryHorizontal = (int) layout.getLineRight(lineForOffset2);
                        }
                        if (C5408a.m11572e(C9050i.f47331a)) {
                            int i20 = i18;
                            i18 = primaryHorizontal;
                            primaryHorizontal = i20;
                        }
                        double lineBaseline = (((double) (layout.getLineBaseline(i17) - i12)) / 3.0d) + ((double) layout.getLineBaseline(i17));
                        int i21 = (int) f46174e;
                        int color = paint.getColor();
                        paint.setStyle(Paint.Style.FILL);
                        paint.setStrokeWidth(0.0f);
                        paint.setColor(color);
                        List<Integer> list = C6716m.f37937a;
                        paint.setColor(C6716m.m13333r(c7569c.f41714a, this.f46176a));
                        RectF rectF = this.f46179d;
                        float f3 = i18;
                        float f10 = i21 / 2;
                        rectF.set(f3 - f10, i12 - i21, primaryHorizontal + f10, (float) (lineBaseline + ((double) i21)));
                        float f11 = f46175f;
                        canvas.drawRoundRect(rectF, f11, f11, paint);
                        paint.setColor(color);
                    } else if (i19 < 0 || i19 >= charSequence.length()) {
                        return;
                    } else {
                        lineRight = layout.getPrimaryHorizontal(i19);
                    }
                    i18 = (int) lineRight;
                    primaryHorizontal = (int) layout.getPrimaryHorizontal(length);
                    if (primaryHorizontal == 0) {
                        primaryHorizontal = (int) layout.getLineRight(lineForOffset2);
                    }
                    if (C5408a.m11572e(C9050i.f47331a)) {
                        int i22 = i18;
                        i18 = primaryHorizontal;
                        primaryHorizontal = i22;
                    }
                    double lineBaseline2 = (((double) (layout.getLineBaseline(i17) - i12)) / 3.0d) + ((double) layout.getLineBaseline(i17));
                    int i23 = (int) f46174e;
                    int color2 = paint.getColor();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setStrokeWidth(0.0f);
                    paint.setColor(color2);
                    List<Integer> list2 = C6716m.f37937a;
                    paint.setColor(C6716m.m13333r(c7569c.f41714a, this.f46176a));
                    RectF rectF2 = this.f46179d;
                    float f12 = i18;
                    float f13 = i23 / 2;
                    rectF2.set(f12 - f13, i12 - i23, primaryHorizontal + f13, (float) (lineBaseline2 + ((double) i23)));
                    float f14 = f46175f;
                    canvas.drawRoundRect(rectF2, f14, f14, paint);
                    paint.setColor(color2);
                }
                it = it;
                z10 = true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8636a)) {
            return false;
        }
        C8636a c8636a = (C8636a) obj;
        return C5207g.m11106a(this.f46176a, c8636a.f46176a) && C5207g.m11106a(this.f46177b, c8636a.f46177b) && C5207g.m11106a(this.f46178c, c8636a.f46178c);
    }

    public final int hashCode() {
        int iHashCode = this.f46176a.hashCode() * 31;
        Layout layout = this.f46177b;
        return this.f46178c.hashCode() + ((iHashCode + (layout == null ? 0 : layout.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirstLingQBackgroundSpan(context=");
        sb2.append(this.f46176a);
        sb2.append(", layout=");
        sb2.append(this.f46177b);
        sb2.append(", spans=");
        return C0009a.m24m(sb2, this.f46178c, ")");
    }
}
