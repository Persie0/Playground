package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.theme.TextHighlightStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class k3a implements LineBackgroundSpan {

    /* JADX INFO: renamed from: H */
    public final int f46641H;

    /* JADX INFO: renamed from: I */
    public final float f46642I;

    /* JADX INFO: renamed from: J */
    public final int f46643J;

    /* JADX INFO: renamed from: K */
    public final float f46644K;

    /* JADX INFO: renamed from: L */
    public final float f46645L;

    /* JADX INFO: renamed from: M */
    public final float f46646M;

    /* JADX INFO: renamed from: N */
    public final float f46647N;

    /* JADX INFO: renamed from: O */
    public final float f46648O;

    /* JADX INFO: renamed from: P */
    public final float f46649P;

    /* JADX INFO: renamed from: Q */
    public final float f46650Q;

    /* JADX INFO: renamed from: R */
    public final float f46651R;

    /* JADX INFO: renamed from: S */
    public final DashPathEffect f46652S;

    /* JADX INFO: renamed from: T */
    public final RectF f46653T;

    /* JADX INFO: renamed from: U */
    public final Paint f46654U;

    /* JADX INFO: renamed from: V */
    public final Paint f46655V;

    /* JADX INFO: renamed from: a */
    public final Context f46656a;

    /* JADX INFO: renamed from: b */
    public final Layout f46657b;

    /* JADX INFO: renamed from: c */
    public final String f46658c;

    /* JADX INFO: renamed from: d */
    public final je9 f46659d;

    /* JADX INFO: renamed from: e */
    public final xz7 f46660e;

    /* JADX INFO: renamed from: f */
    public final TextHighlightStyle f46661f;

    /* JADX INFO: renamed from: g */
    public final boolean f46662g;

    /* JADX INFO: renamed from: h */
    public final int f46663h;

    /* JADX INFO: renamed from: i */
    public final int f46664i;

    /* JADX INFO: renamed from: j */
    public final int f46665j;

    /* JADX INFO: renamed from: k */
    public final int f46666k;

    /* JADX INFO: renamed from: l */
    public final int f46667l;

    public k3a(Context context, Layout layout, String str, je9 je9Var, xz7 xz7Var, TextHighlightStyle textHighlightStyle, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8) {
        str.getClass();
        this.f46656a = context;
        this.f46657b = layout;
        this.f46658c = str;
        this.f46659d = je9Var;
        this.f46660e = xz7Var;
        this.f46661f = textHighlightStyle;
        this.f46662g = z;
        this.f46663h = i;
        this.f46664i = i2;
        this.f46665j = i4;
        this.f46666k = i5;
        this.f46667l = i6;
        this.f46641H = i7;
        this.f46642I = f;
        this.f46643J = i8;
        this.f46644K = jfa.m14419b(context, 4);
        this.f46645L = jfa.m14419b(context, 8);
        this.f46646M = jfa.m14419b(context, 2);
        this.f46647N = jfa.m14419b(context, 4);
        this.f46648O = jfa.m14419b(context, 2);
        this.f46649P = jfa.m14419b(context, 2);
        this.f46650Q = jfa.m14419b(context, 2);
        float fM14419b = jfa.m14419b(context, 3);
        this.f46651R = jfa.m14430m(context, 11);
        this.f46652S = new DashPathEffect(new float[]{fM14419b, fM14419b / 2.0f}, 0.0f);
        this.f46653T = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f46654U = paint;
        Paint paint2 = new Paint();
        this.f46655V = paint2;
        paint.setColor(i3);
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0320 A[PHI: r18
      0x0320: PHI (r18v2 android.graphics.RectF) = 
      (r18v1 android.graphics.RectF)
      (r18v1 android.graphics.RectF)
      (r18v1 android.graphics.RectF)
      (r18v5 android.graphics.RectF)
     binds: [B:142:0x0339, B:143:0x033b, B:148:0x034d, B:136:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float lineRight;
        float f;
        int i9;
        xz7 xz7Var;
        float f2;
        RectF rectF;
        int iWidth;
        float primaryHorizontal;
        float f3;
        float f4;
        int i10;
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        Layout layout = this.f46657b;
        if (layout != null) {
            paint.setAntiAlias(true);
            je9 je9Var = this.f46659d;
            xz7 xz7Var2 = je9Var.f45484e;
            xz7 xz7Var3 = je9Var.f45484e;
            int i11 = xz7Var2.f69004a;
            int length = xz7Var2.f69005b >= charSequence.length() ? charSequence.length() : xz7Var3.f69005b;
            int lineForOffset = layout.getLineForOffset(i11);
            int lineForOffset2 = layout.getLineForOffset(length);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(length);
            float f5 = this.f46642I;
            if (primaryHorizontal2 == f5) {
                lineForOffset2 = lineForOffset;
            }
            if (lineForOffset > i8 || i8 > lineForOffset2) {
                return;
            }
            String str = this.f46658c;
            if (lineForOffset != i8) {
                lineRight = AbstractC3184kh.m15194A(str) ? layout.getLineRight(lineForOffset2) : layout.getPrimaryHorizontal(0);
            } else if (i11 < 0 || i11 >= charSequence.length()) {
                return;
            } else {
                lineRight = layout.getPrimaryHorizontal(i11);
            }
            int i12 = (int) lineRight;
            if (lineForOffset2 != i8) {
                primaryHorizontal2 = AbstractC3184kh.m15194A(str) ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
            } else if (primaryHorizontal2 == f5) {
                primaryHorizontal2 = layout.getLineRight(lineForOffset2);
            }
            int i13 = (int) primaryHorizontal2;
            if (AbstractC3184kh.m15194A(str)) {
                i12 = i13;
                i13 = i12;
            }
            int lineTop = (int) (((double) layout.getLineTop(i8)) - (((double) layout.getLineAscent(i8)) / 5.0d));
            double lineBaseline = (((double) (layout.getLineBaseline(i8) - lineTop)) / 5.0d) + ((double) layout.getLineBaseline(i8));
            int color = paint.getColor();
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            int i14 = lineForOffset2;
            paint.setStrokeWidth(0.0f);
            paint.setColor(color);
            float f6 = i12;
            int i15 = i12;
            float f7 = lineTop;
            float f8 = i13;
            float f9 = (float) lineBaseline;
            RectF rectF2 = this.f46653T;
            rectF2.set(f6, f7, f8, f9);
            int i16 = i13;
            TextHighlightStyle textHighlightStyle = TextHighlightStyle.Underlined;
            DashPathEffect dashPathEffect = this.f46652S;
            float f10 = this.f46650Q;
            int i17 = this.f46663h;
            int i18 = this.f46664i;
            float f11 = this.f46646M;
            TextHighlightStyle textHighlightStyle2 = this.f46661f;
            if (textHighlightStyle2 == textHighlightStyle) {
                i9 = i18;
                int i19 = je9Var.f45487h;
                CardStatus cardStatus = CardStatus.Learned;
                f = f6;
                if (i19 == cardStatus.getValue()) {
                    i10 = i9;
                } else {
                    i10 = je9Var.f45480a == i17 ? i17 : this.f46665j;
                }
                Paint paint2 = this.f46655V;
                paint2.setColor(i10);
                paint2.setStrokeWidth(f10);
                paint2.setStyle(Paint.Style.STROKE);
                if (je9Var.f45487h == cardStatus.getValue()) {
                    paint2.setPathEffect(dashPathEffect);
                } else {
                    paint2.setPathEffect(null);
                }
                Path path = new Path();
                path.moveTo(f + f11, f9 + (je9Var.f45485f ? 4.0f : 0.0f));
                path.lineTo(f8 - f11, f9 + (je9Var.f45485f ? 4.0f : 0.0f));
                canvas.drawPath(path, paint2);
                paint2.setColor(color);
            } else {
                f = f6;
                i9 = i18;
            }
            boolean zM11650l = fa4.m11650l(this.f46660e, xz7Var3);
            int i20 = this.f46666k;
            if (zM11650l) {
                float f12 = this.f46649P;
                float f13 = f - f12;
                Number numberValueOf = f13 < 0.0f ? Integer.valueOf(i15) : Float.valueOf(f13);
                float f14 = f8 + f12;
                Number numberValueOf2 = f14 > ((float) canvas.getClipBounds().right) ? Integer.valueOf(i16) : Float.valueOf(f14);
                float fFloatValue = numberValueOf.floatValue();
                boolean z = this.f46662g;
                float f15 = this.f46644K;
                float f16 = this.f46645L;
                if (z) {
                    f4 = f16;
                    f3 = f4;
                } else {
                    f3 = f16;
                    f4 = f15;
                }
                float f17 = f7 - f4;
                xz7Var = xz7Var3;
                rectF2.set(fFloatValue, f17, numberValueOf2.floatValue(), f9 + (z ? f3 : f15));
                paint.setStrokeWidth(0.0f);
                if (je9Var.f45480a != i17) {
                    i17 = (textHighlightStyle2 != textHighlightStyle || je9Var.f45485f) ? i20 : this.f46641H;
                }
                paint.setColor(i17);
                paint.setStyle(style);
                float f18 = this.f46648O;
                canvas.drawRoundRect(rectF2, f18, f18, paint);
                rectF2.set((f13 < 0.0f ? Float.valueOf(f + f12) : Float.valueOf(f13)).floatValue(), f7 - (z ? f3 : f15), (f14 > ((float) canvas.getClipBounds().right) ? Float.valueOf(f8 - f12) : Float.valueOf(f14)).floatValue(), f9 + (z ? f3 : f15));
                paint.setColor(this.f46667l);
                paint.setStrokeWidth(f12);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawRoundRect(rectF2, f18, f18, paint);
                float f19 = f7 - (z ? f3 : f15);
                if (z) {
                    f15 = f3;
                }
                rectF2.set(f, f19, f8, f9 + f15);
                paint.setStyle(style);
                paint.setStrokeWidth(0.0f);
                paint.setColor(color);
            } else {
                xz7Var = xz7Var3;
                float f20 = f;
                if (textHighlightStyle2 != TextHighlightStyle.Off && textHighlightStyle2 != textHighlightStyle) {
                    if (je9Var.f45487h == CardStatus.Learned.getValue()) {
                        paint.setColor(i9);
                        paint.setStrokeWidth(f10);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setPathEffect(dashPathEffect);
                        Path path2 = new Path();
                        f2 = f9;
                        path2.moveTo(f20 + f11, f2);
                        path2.lineTo(f8 - f11, f2);
                        canvas.drawPath(path2, paint);
                        paint.setPathEffect(null);
                        paint.setStyle(style);
                        paint.setStrokeWidth(0.0f);
                        paint.setColor(color);
                    } else {
                        f2 = f9;
                    }
                    paint.setColor(i20);
                    rectF2.set(f20, f7, f8, f2);
                    float f21 = this.f46647N;
                    canvas.drawRoundRect(rectF2, f21, f21, paint);
                }
            }
            paint.setColor(color);
            if (je9Var.f45488i) {
                return;
            }
            xz7 xz7Var4 = xz7Var;
            hn8 hn8VarM17483a = nkc.m17483a(xz7Var4.f69012i);
            String str2 = hn8VarM17483a.f42661a;
            String strM23402y0 = hn8VarM17483a.f42662b;
            if (strM23402y0.length() > 0) {
                String str3 = xz7Var4.f69008e;
                String str4 = xz7Var4.f69008e;
                if (strM23402y0.equals(str3)) {
                    return;
                }
                int iM23389l0 = vk9.m23389l0(str4, str2, 0, false, 6) + i11;
                int lineForOffset3 = layout.getLineForOffset(iM23389l0);
                int lineForOffset4 = layout.getLineForOffset(str2.length() + iM23389l0);
                int lineEnd = layout.getLineEnd(i8);
                if (lineForOffset == i8 && i14 == i8) {
                    rectF = rectF2;
                } else if (lineForOffset != i8 || i14 == i8) {
                    rectF = rectF2;
                    if (lineForOffset == i8 || i14 != i8) {
                        strM23402y0 = "";
                    } else if (str2.length() <= 0 || str2.length() >= str4.length()) {
                        strM23402y0 = vk9.m23402y0(strM23402y0, l70.m15922M(strM23402y0.length() / 2, strM23402y0.length()));
                    } else if (lineForOffset3 != i14) {
                        strM23402y0 = "";
                    }
                } else {
                    if (str2.length() > 0) {
                        rectF = rectF2;
                        if (str2.length() < str4.length()) {
                            if (lineForOffset3 != lineForOffset) {
                                strM23402y0 = "";
                            }
                        }
                    } else {
                        rectF = rectF2;
                    }
                    strM23402y0 = vk9.m23402y0(strM23402y0, l70.m15922M(0, strM23402y0.length() / 2));
                }
                int i21 = this.f46643J;
                Context context = this.f46656a;
                double dM14430m = ((double) jfa.m14430m(context, i21)) * 0.4d;
                double d = this.f46651R;
                if (dM14430m >= d) {
                    d = dM14430m;
                }
                float f22 = (float) d;
                Rect rect = new Rect();
                Paint paint3 = this.f46654U;
                paint3.setColor(color);
                paint3.setTextSize(f22);
                paint3.getTextBounds(strM23402y0, 0, strM23402y0.length(), rect);
                float fWidth = (rectF.width() / rect.width()) * f22;
                if (fWidth <= f22) {
                    f22 = fWidth;
                }
                float fM14430m = jfa.m14430m(context, 9);
                if (f22 < fM14430m) {
                    f22 = fM14430m;
                }
                paint3.setTextSize(f22);
                float fMeasureText = paint3.measureText(strM23402y0);
                Rect rect2 = new Rect();
                if (str2.length() > 0) {
                    if (lineForOffset3 != lineForOffset4 && lineForOffset == i8 && i14 != i8) {
                        if (iM23389l0 > lineEnd) {
                            iM23389l0 = lineEnd;
                        }
                        primaryHorizontal = layout.getPrimaryHorizontal(iM23389l0);
                    } else if (lineForOffset == i8 || i14 != i8) {
                        if (iM23389l0 > lineEnd) {
                            iM23389l0 = lineEnd;
                        }
                        primaryHorizontal = layout.getPrimaryHorizontal(iM23389l0);
                    } else {
                        primaryHorizontal = layout.getPrimaryHorizontal(0);
                    }
                    int i22 = (int) primaryHorizontal;
                    if (lineForOffset != i14) {
                        String strM23402y1 = vk9.m23402y0(str2, l70.m15922M(0, str2.length() / 2));
                        paint.getTextBounds(strM23402y1, 0, strM23402y1.length(), rect2);
                    } else {
                        paint.getTextBounds(str2, 0, str2.length(), rect2);
                    }
                    iWidth = ((((rect2.width() + i22) - i22) / 2) + i22) - (((int) fMeasureText) / 2);
                } else {
                    iWidth = (((i16 - i15) / 2) + i15) - (((int) fMeasureText) / 2);
                }
                canvas.drawText(strM23402y0, iWidth, ((lineTop - i3) / 2) + i3, paint3);
            }
        }
    }
}
