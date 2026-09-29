package p265mj;

import ae.C0062b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.session.C0166e;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.util.DisplayMetrics;
import androidx.activity.result.C0204c;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.uimodel.CardStatus;
import com.linguist.R;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import jm.C6526i;
import kotlin.text.C7076b;
import p096ei.C5408a;
import p225kk.C6716m;

/* JADX INFO: renamed from: mj.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7571e implements LineBackgroundSpan {

    /* JADX INFO: renamed from: l */
    public static final float f41735l;

    /* JADX INFO: renamed from: m */
    public static final float f41736m;

    /* JADX INFO: renamed from: n */
    public static final float f41737n;

    /* JADX INFO: renamed from: o */
    public static final float f41738o;

    /* JADX INFO: renamed from: p */
    public static final float f41739p;

    /* JADX INFO: renamed from: q */
    public static final float f41740q;

    /* JADX INFO: renamed from: r */
    public static final float f41741r;

    /* JADX INFO: renamed from: a */
    public final Context f41742a;

    /* JADX INFO: renamed from: b */
    public final Layout f41743b;

    /* JADX INFO: renamed from: c */
    public final String f41744c;

    /* JADX INFO: renamed from: d */
    public final List<C7569c> f41745d;

    /* JADX INFO: renamed from: e */
    public final C7570d f41746e;

    /* JADX INFO: renamed from: f */
    public final LessonHighlightStyle f41747f;

    /* JADX INFO: renamed from: g */
    public final DashPathEffect f41748g;

    /* JADX INFO: renamed from: h */
    public final RectF f41749h;

    /* JADX INFO: renamed from: i */
    public final TextPaint f41750i;

    /* JADX INFO: renamed from: j */
    public final Paint f41751j;

    /* JADX INFO: renamed from: k */
    public final float f41752k;

    static {
        List<Integer> list = C6716m.f37937a;
        f41735l = C6716m.m13316a(4);
        f41736m = C6716m.m13316a(2);
        f41737n = C6716m.m13316a(4);
        f41738o = C6716m.m13316a(2);
        f41739p = C6716m.m13316a(2);
        f41740q = C6716m.m13316a(2);
        f41741r = C6716m.m13316a(3);
    }

    public C7571e(Context context, Layout layout, String str, List<C7569c> list, C7570d c7570d, LessonHighlightStyle lessonHighlightStyle) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(lessonHighlightStyle, "highlightStyle");
        this.f41742a = context;
        this.f41743b = layout;
        this.f41744c = str;
        this.f41745d = list;
        this.f41746e = c7570d;
        this.f41747f = lessonHighlightStyle;
        float f3 = f41741r;
        this.f41748g = new DashPathEffect(new float[]{f3, f3 / 2}, 0.0f);
        this.f41749h = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TextPaint textPaint = new TextPaint();
        this.f41750i = textPaint;
        Paint paint = new Paint();
        this.f41751j = paint;
        this.f41752k = context.getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        List<Integer> list2 = C6716m.f37937a;
        textPaint.setColor(C6716m.m13333r(R.attr.secondaryTextColor, context));
        textPaint.setAntiAlias(true);
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0286  */
    /* JADX WARN: Code duplicated, block: B:105:0x0296  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:119:0x030e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0311  */
    /* JADX WARN: Code duplicated, block: B:122:0x0315  */
    /* JADX WARN: Code duplicated, block: B:124:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0321  */
    /* JADX WARN: Code duplicated, block: B:128:0x0327 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x033c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x035e  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x018b  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01db  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x020f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    /* JADX WARN: Code duplicated, block: B:94:0x0225  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x023d  */
    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        C7571e c7571e;
        CharSequence charSequence2;
        int i18;
        Layout layout;
        int primaryHorizontal;
        float lineRight;
        float lineRight2;
        int i19;
        Layout layout2;
        int color;
        RectF rectF;
        float f3;
        float f10;
        float f11;
        float f12;
        LessonHighlightStyle lessonHighlightStyle;
        LessonHighlightStyle lessonHighlightStyle2;
        Context context;
        LessonHighlightStyle lessonHighlightStyle3;
        DashPathEffect dashPathEffect;
        float f13;
        LessonHighlightStyle lessonHighlightStyle4;
        boolean zM11106a;
        float f14;
        Paint paint2;
        int i20;
        RectF rectF2;
        int i21;
        LessonHighlightStyle lessonHighlightStyle5;
        C7570d c7570d;
        Float f15;
        C7570d c7570d2;
        String strM14301u3;
        boolean z10;
        C6526i c6526iM411w2;
        Resources resources;
        Float fValueOf;
        DisplayMetrics displayMetrics;
        float f16;
        Number numberValueOf;
        float f17;
        Number numberValueOf2;
        int i22;
        LessonHighlightStyle lessonHighlightStyle6;
        int iM13333r;
        float f18;
        Paint paint3;
        int i23;
        CardStatus cardStatus;
        int iM13333r2;
        boolean z11;
        C7571e c7571e2 = this;
        CharSequence charSequence3 = charSequence;
        int i24 = i17;
        C5207g.m11111f(canvas, "c");
        C5207g.m11111f(paint, "p");
        C5207g.m11111f(charSequence3, "text");
        Layout layout3 = c7571e2.f41743b;
        if (layout3 != null) {
            paint.setAntiAlias(true);
            Iterator it = c7571e2.f41745d.iterator();
            C7571e c7571e3 = c7571e2;
            Paint paint4 = paint;
            int i25 = i24;
            while (it.hasNext()) {
                C7569c c7569c = (C7569c) it.next();
                C7570d c7570d3 = c7569c.f41717d;
                int i26 = c7570d3.f41721a;
                int i27 = c7570d3.f41722b;
                int length = charSequence.length();
                C7570d c7570d4 = c7569c.f41717d;
                int length2 = i27 >= length ? charSequence.length() : c7570d4.f41722b;
                int lineForOffset = layout3.getLineForOffset(i26);
                int lineForOffset2 = layout3.getLineForOffset(length2);
                float primaryHorizontal2 = layout3.getPrimaryHorizontal(length2);
                float f19 = c7571e3.f41752k;
                Iterator it2 = it;
                int i28 = (primaryHorizontal2 > f19 ? 1 : (primaryHorizontal2 == f19 ? 0 : -1)) == 0 ? lineForOffset : lineForOffset2;
                if (lineForOffset <= i25 && i25 <= i28) {
                    String str = c7571e3.f41744c;
                    if (lineForOffset != i25) {
                        if (C5408a.m11572e(str)) {
                            lineRight = layout3.getLineRight(i28);
                        } else {
                            primaryHorizontal = (int) layout3.getPrimaryHorizontal(0);
                        }
                        if (i28 == i25) {
                            lineRight2 = layout3.getPrimaryHorizontal(length2);
                            if (lineRight2 == f19) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                lineRight2 = layout3.getLineRight(i28);
                            }
                        } else if (C5408a.m11572e(str)) {
                            lineRight2 = layout3.getLineLeft(lineForOffset);
                        } else {
                            lineRight2 = layout3.getLineRight(lineForOffset);
                        }
                        i19 = (int) lineRight2;
                        if (C5408a.m11572e(str)) {
                            i19 = primaryHorizontal;
                            primaryHorizontal = i19;
                        }
                        int lineTop = (int) (((double) layout3.getLineTop(i25)) - (((double) layout3.getLineAscent(i25)) / 5.0d));
                        layout2 = layout3;
                        double lineBaseline = (((double) (layout3.getLineBaseline(i25) - lineTop)) / 5.0d) + ((double) layout3.getLineBaseline(i25));
                        color = paint.getColor();
                        paint4.setStyle(Paint.Style.FILL);
                        paint4.setStrokeWidth(0.0f);
                        paint4.setColor(color);
                        rectF = c7571e3.f41749h;
                        f3 = primaryHorizontal;
                        f10 = lineTop;
                        f11 = i19;
                        f12 = (float) lineBaseline;
                        rectF.set(f3, f10, f11, f12);
                        lessonHighlightStyle = LessonHighlightStyle.Off;
                        int i29 = i28;
                        lessonHighlightStyle2 = c7571e3.f41747f;
                        context = c7571e3.f41742a;
                        if (lessonHighlightStyle2 == lessonHighlightStyle && c7569c.f41714a != R.attr.relatedPhraseHighlightColor) {
                            c7569c.f41714a = context.getColor(R.color.transparent);
                            c7569c.f41716c = context.getColor(R.color.transparent);
                        }
                        lessonHighlightStyle3 = LessonHighlightStyle.Underlined;
                        dashPathEffect = c7571e3.f41748g;
                        f13 = f41736m;
                        if (lessonHighlightStyle2 == lessonHighlightStyle3) {
                            if (c7569c.f41718e) {
                                lessonHighlightStyle4 = lessonHighlightStyle3;
                                if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                                }
                                zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                                f14 = f41739p;
                                if (zM11106a) {
                                    f16 = f3 - f14;
                                    if (f16 < 0.0f) {
                                        numberValueOf = Integer.valueOf(primaryHorizontal);
                                    } else {
                                        numberValueOf = Float.valueOf(f16);
                                    }
                                    f17 = f11 + f14;
                                    if (f17 > canvas.getClipBounds().right) {
                                        numberValueOf2 = Integer.valueOf(i19);
                                    } else {
                                        numberValueOf2 = Float.valueOf(f17);
                                    }
                                    float fFloatValue = numberValueOf.floatValue();
                                    float f20 = f41735l;
                                    float f21 = f10 - f20;
                                    float f22 = f12 + f20;
                                    i20 = primaryHorizontal;
                                    rectF2 = rectF;
                                    rectF2.set(fFloatValue, f21, numberValueOf2.floatValue(), f22);
                                    paint2 = paint;
                                    paint2.setStrokeWidth(0.0f);
                                    i22 = c7569c.f41714a;
                                    i21 = i19;
                                    if (i22 == R.attr.yellowWordStatus4Color) {
                                        List<Integer> list = C6716m.f37937a;
                                        iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                                        c7570d = c7570d4;
                                    } else {
                                        lessonHighlightStyle6 = lessonHighlightStyle4;
                                        c7570d = c7570d4;
                                        if (lessonHighlightStyle2 == lessonHighlightStyle6 || c7569c.f41718e) {
                                            List<Integer> list2 = C6716m.f37937a;
                                            iM13333r = C6716m.m13333r(i22, context);
                                        } else {
                                            List<Integer> list3 = C6716m.f37937a;
                                            iM13333r = C6716m.m13333r(R.attr.yellowWordStatus4Color, context);
                                        }
                                    }
                                    paint2.setColor(iM13333r);
                                    paint2.setStyle(Paint.Style.FILL);
                                    float f23 = f41738o;
                                    canvas.drawRoundRect(rectF2, f23, f23, paint2);
                                    if (f16 < 0.0f) {
                                        f18 = f3 + f14;
                                    } else {
                                        f18 = f16;
                                    }
                                    Float fValueOf2 = Float.valueOf(f18);
                                    if (f17 > canvas.getClipBounds().right) {
                                        f17 = f11 - f14;
                                    }
                                    rectF2.set(fValueOf2.floatValue(), f21, Float.valueOf(f17).floatValue(), f22);
                                    List<Integer> list4 = C6716m.f37937a;
                                    paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                                    paint2.setStrokeWidth(f14);
                                    paint2.setStyle(Paint.Style.STROKE);
                                    canvas.drawRoundRect(rectF2, f23, f23, paint2);
                                    rectF2.set(f3, f21, f11, f22);
                                    paint2.setStyle(Paint.Style.FILL);
                                    paint2.setStrokeWidth(0.0f);
                                    paint2.setColor(color);
                                } else {
                                    paint2 = paint;
                                    i20 = primaryHorizontal;
                                    rectF2 = rectF;
                                    i21 = i19;
                                    lessonHighlightStyle5 = lessonHighlightStyle4;
                                    c7570d = c7570d4;
                                    if (lessonHighlightStyle2 == lessonHighlightStyle5 || c7569c.f41718e) {
                                        if (c7569c.f41720g == CardStatus.Learned.getValue() || c7569c.f41714a == R.color.transparent || lessonHighlightStyle2 == lessonHighlightStyle5) {
                                            f15 = null;
                                        } else {
                                            List<Integer> list5 = C6716m.f37937a;
                                            paint2.setColor(C6716m.m13333r(R.attr.primaryTextColor, context));
                                            paint2.setStrokeWidth(f14);
                                            paint2.setStyle(Paint.Style.STROKE);
                                            paint2.setPathEffect(dashPathEffect);
                                            Path path = new Path();
                                            path.moveTo(f3 + f13, f12);
                                            path.lineTo(f11 - f13, f12);
                                            canvas.drawPath(path, paint2);
                                            f15 = null;
                                            paint2.setPathEffect(null);
                                            paint2.setStyle(Paint.Style.FILL);
                                            paint2.setStrokeWidth(0.0f);
                                            paint2.setColor(color);
                                        }
                                        List<Integer> list6 = C6716m.f37937a;
                                        paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                                        rectF2.set(f3, f10, f11, f12);
                                        float f24 = f41737n;
                                        canvas.drawRoundRect(rectF2, f24, f24, paint2);
                                        paint2.setColor(color);
                                        c7570d2 = c7570d;
                                    }
                                    strM14301u3 = c7570d2.f41729i;
                                    if (strM14301u3.length() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        i18 = i17;
                                        if (lineForOffset == i18 || i29 != i18) {
                                            if (lineForOffset != i18 && i29 != i18) {
                                                C6526i c6526iM411w3 = C0062b.m411w2(0, strM14301u3.length() / 2);
                                                C5207g.m11111f(c6526iM411w3, "indices");
                                                if (c6526iM411w3.isEmpty()) {
                                                    strM14301u3 = "";
                                                } else {
                                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w3);
                                                }
                                            } else if (lineForOffset != i18 && i29 == i18) {
                                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                                C5207g.m11111f(c6526iM411w2, "indices");
                                                if (c6526iM411w2.isEmpty()) {
                                                    strM14301u3 = "";
                                                } else {
                                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                                }
                                            }
                                        }
                                        Rect rect = new Rect();
                                        c7571e = this;
                                        TextPaint textPaint = c7571e.f41750i;
                                        textPaint.setColor(color);
                                        textPaint.setTextSize(10.0f);
                                        layout = layout2;
                                        charSequence2 = charSequence;
                                        charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                        textPaint.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect);
                                        float fWidth = ((rectF2.width() / 2) / rect.width()) * 10.0f;
                                        float f25 = fWidth <= 10.0f ? fWidth : 10.0f;
                                        resources = context.getResources();
                                        if (resources != null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                                            fValueOf = f15;
                                        } else {
                                            fValueOf = Float.valueOf(displayMetrics.scaledDensity);
                                        }
                                        C5207g.m11108c(fValueOf);
                                        textPaint.setTextSize(fValueOf.floatValue() * f25);
                                        canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint.measureText(strM14301u3)) / 2), i12, textPaint);
                                    } else {
                                        c7571e = this;
                                        layout = layout2;
                                        charSequence2 = charSequence;
                                        i18 = i17;
                                    }
                                    paint4 = paint2;
                                    i25 = i18;
                                    c7571e3 = c7571e;
                                }
                                c7570d2 = c7570d;
                                f15 = null;
                                strM14301u3 = c7570d2.f41729i;
                                if (strM14301u3.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i18 = i17;
                                    if (lineForOffset == i18) {
                                        if (lineForOffset != i18) {
                                            if (lineForOffset != i18) {
                                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                                C5207g.m11111f(c6526iM411w2, "indices");
                                                if (c6526iM411w2.isEmpty()) {
                                                    strM14301u3 = "";
                                                } else {
                                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                                }
                                            }
                                        } else if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                    Rect rect2 = new Rect();
                                    c7571e = this;
                                    TextPaint textPaint2 = c7571e.f41750i;
                                    textPaint2.setColor(color);
                                    textPaint2.setTextSize(10.0f);
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                    textPaint2.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect2);
                                    float fWidth2 = ((rectF2.width() / 2) / rect2.width()) * 10.0f;
                                    if (fWidth2 <= 10.0f) {
                                    }
                                    resources = context.getResources();
                                    if (resources != null) {
                                        fValueOf = f15;
                                    } else {
                                        fValueOf = f15;
                                    }
                                    C5207g.m11108c(fValueOf);
                                    textPaint2.setTextSize(fValueOf.floatValue() * f25);
                                    canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint2.measureText(strM14301u3)) / 2), i12, textPaint2);
                                } else {
                                    c7571e = this;
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    i18 = i17;
                                }
                                paint4 = paint2;
                                i25 = i18;
                                c7571e3 = c7571e;
                            } else {
                                lessonHighlightStyle4 = lessonHighlightStyle3;
                            }
                            paint3 = c7571e3.f41751j;
                            i23 = c7569c.f41720g;
                            cardStatus = CardStatus.Learned;
                            if (i23 == cardStatus.getValue()) {
                                List<Integer> list7 = C6716m.f37937a;
                                iM13333r2 = C6716m.m13333r(R.attr.primaryTextColor, context);
                            } else if (c7569c.f41714a == R.color.transparent) {
                                iM13333r2 = context.getColor(R.color.transparent);
                            } else {
                                List<Integer> list8 = C6716m.f37937a;
                                iM13333r2 = C6716m.m13333r(c7569c.f41715b, context);
                            }
                            paint3.setColor(iM13333r2);
                            paint3.setStrokeWidth(f41740q);
                            paint3.setStyle(Paint.Style.STROKE);
                            if (c7569c.f41720g == cardStatus.getValue()) {
                                paint3.setPathEffect(dashPathEffect);
                            } else {
                                paint3.setPathEffect(null);
                            }
                            Path path2 = new Path();
                            path2.moveTo(f3 + f13, f12);
                            path2.lineTo(f11 - f13, f12);
                            canvas.drawPath(path2, paint3);
                            paint3.setColor(color);
                            zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                            f14 = f41739p;
                            if (zM11106a) {
                                f16 = f3 - f14;
                                if (f16 < 0.0f) {
                                    numberValueOf = Integer.valueOf(primaryHorizontal);
                                } else {
                                    numberValueOf = Float.valueOf(f16);
                                }
                                f17 = f11 + f14;
                                if (f17 > canvas.getClipBounds().right) {
                                    numberValueOf2 = Integer.valueOf(i19);
                                } else {
                                    numberValueOf2 = Float.valueOf(f17);
                                }
                                float fFloatValue2 = numberValueOf.floatValue();
                                float f26 = f41735l;
                                float f27 = f10 - f26;
                                float f28 = f12 + f26;
                                i20 = primaryHorizontal;
                                rectF2 = rectF;
                                rectF2.set(fFloatValue2, f27, numberValueOf2.floatValue(), f28);
                                paint2 = paint;
                                paint2.setStrokeWidth(0.0f);
                                i22 = c7569c.f41714a;
                                i21 = i19;
                                if (i22 == R.attr.yellowWordStatus4Color) {
                                    List<Integer> list9 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                                    c7570d = c7570d4;
                                } else {
                                    lessonHighlightStyle6 = lessonHighlightStyle4;
                                    c7570d = c7570d4;
                                    if (lessonHighlightStyle2 == lessonHighlightStyle6) {
                                        List<Integer> list10 = C6716m.f37937a;
                                        iM13333r = C6716m.m13333r(i22, context);
                                    } else {
                                        List<Integer> list11 = C6716m.f37937a;
                                        iM13333r = C6716m.m13333r(i22, context);
                                    }
                                }
                                paint2.setColor(iM13333r);
                                paint2.setStyle(Paint.Style.FILL);
                                float f29 = f41738o;
                                canvas.drawRoundRect(rectF2, f29, f29, paint2);
                                if (f16 < 0.0f) {
                                    f18 = f3 + f14;
                                } else {
                                    f18 = f16;
                                }
                                Float fValueOf3 = Float.valueOf(f18);
                                if (f17 > canvas.getClipBounds().right) {
                                    f17 = f11 - f14;
                                }
                                rectF2.set(fValueOf3.floatValue(), f27, Float.valueOf(f17).floatValue(), f28);
                                List<Integer> list12 = C6716m.f37937a;
                                paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                                paint2.setStrokeWidth(f14);
                                paint2.setStyle(Paint.Style.STROKE);
                                canvas.drawRoundRect(rectF2, f29, f29, paint2);
                                rectF2.set(f3, f27, f11, f28);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setStrokeWidth(0.0f);
                                paint2.setColor(color);
                            } else {
                                paint2 = paint;
                                i20 = primaryHorizontal;
                                rectF2 = rectF;
                                i21 = i19;
                                lessonHighlightStyle5 = lessonHighlightStyle4;
                                c7570d = c7570d4;
                                if (lessonHighlightStyle2 == lessonHighlightStyle5) {
                                }
                                if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                                    f15 = null;
                                } else {
                                    f15 = null;
                                }
                                List<Integer> list13 = C6716m.f37937a;
                                paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                                rectF2.set(f3, f10, f11, f12);
                                float f210 = f41737n;
                                canvas.drawRoundRect(rectF2, f210, f210, paint2);
                                paint2.setColor(color);
                                c7570d2 = c7570d;
                                strM14301u3 = c7570d2.f41729i;
                                if (strM14301u3.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i18 = i17;
                                    if (lineForOffset == i18) {
                                        if (lineForOffset != i18) {
                                            if (lineForOffset != i18) {
                                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                                C5207g.m11111f(c6526iM411w2, "indices");
                                                if (c6526iM411w2.isEmpty()) {
                                                    strM14301u3 = "";
                                                } else {
                                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                                }
                                            }
                                        } else if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                    Rect rect3 = new Rect();
                                    c7571e = this;
                                    TextPaint textPaint3 = c7571e.f41750i;
                                    textPaint3.setColor(color);
                                    textPaint3.setTextSize(10.0f);
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                    textPaint3.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect3);
                                    float fWidth3 = ((rectF2.width() / 2) / rect3.width()) * 10.0f;
                                    if (fWidth3 <= 10.0f) {
                                    }
                                    resources = context.getResources();
                                    if (resources != null) {
                                        fValueOf = f15;
                                    } else {
                                        fValueOf = f15;
                                    }
                                    C5207g.m11108c(fValueOf);
                                    textPaint3.setTextSize(fValueOf.floatValue() * f25);
                                    canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint3.measureText(strM14301u3)) / 2), i12, textPaint3);
                                } else {
                                    c7571e = this;
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    i18 = i17;
                                }
                                paint4 = paint2;
                                i25 = i18;
                                c7571e3 = c7571e;
                            }
                            c7570d2 = c7570d;
                            f15 = null;
                            strM14301u3 = c7570d2.f41729i;
                            if (strM14301u3.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i18 = i17;
                                if (lineForOffset == i18) {
                                    if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                                Rect rect4 = new Rect();
                                c7571e = this;
                                TextPaint textPaint4 = c7571e.f41750i;
                                textPaint4.setColor(color);
                                textPaint4.setTextSize(10.0f);
                                layout = layout2;
                                charSequence2 = charSequence;
                                charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                textPaint4.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect4);
                                float fWidth4 = ((rectF2.width() / 2) / rect4.width()) * 10.0f;
                                if (fWidth4 <= 10.0f) {
                                }
                                resources = context.getResources();
                                if (resources != null) {
                                    fValueOf = f15;
                                } else {
                                    fValueOf = f15;
                                }
                                C5207g.m11108c(fValueOf);
                                textPaint4.setTextSize(fValueOf.floatValue() * f25);
                                canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint4.measureText(strM14301u3)) / 2), i12, textPaint4);
                            } else {
                                c7571e = this;
                                layout = layout2;
                                charSequence2 = charSequence;
                                i18 = i17;
                            }
                            paint4 = paint2;
                            i25 = i18;
                            c7571e3 = c7571e;
                        } else {
                            lessonHighlightStyle4 = lessonHighlightStyle3;
                        }
                        zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                        f14 = f41739p;
                        if (zM11106a) {
                            f16 = f3 - f14;
                            if (f16 < 0.0f) {
                                numberValueOf = Integer.valueOf(primaryHorizontal);
                            } else {
                                numberValueOf = Float.valueOf(f16);
                            }
                            f17 = f11 + f14;
                            if (f17 > canvas.getClipBounds().right) {
                                numberValueOf2 = Integer.valueOf(i19);
                            } else {
                                numberValueOf2 = Float.valueOf(f17);
                            }
                            float fFloatValue3 = numberValueOf.floatValue();
                            float f211 = f41735l;
                            float f212 = f10 - f211;
                            float f213 = f12 + f211;
                            i20 = primaryHorizontal;
                            rectF2 = rectF;
                            rectF2.set(fFloatValue3, f212, numberValueOf2.floatValue(), f213);
                            paint2 = paint;
                            paint2.setStrokeWidth(0.0f);
                            i22 = c7569c.f41714a;
                            i21 = i19;
                            if (i22 == R.attr.yellowWordStatus4Color) {
                                List<Integer> list14 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                                c7570d = c7570d4;
                            } else {
                                lessonHighlightStyle6 = lessonHighlightStyle4;
                                c7570d = c7570d4;
                                if (lessonHighlightStyle2 == lessonHighlightStyle6) {
                                    List<Integer> list15 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(i22, context);
                                } else {
                                    List<Integer> list16 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(i22, context);
                                }
                            }
                            paint2.setColor(iM13333r);
                            paint2.setStyle(Paint.Style.FILL);
                            float f214 = f41738o;
                            canvas.drawRoundRect(rectF2, f214, f214, paint2);
                            if (f16 < 0.0f) {
                                f18 = f3 + f14;
                            } else {
                                f18 = f16;
                            }
                            Float fValueOf4 = Float.valueOf(f18);
                            if (f17 > canvas.getClipBounds().right) {
                                f17 = f11 - f14;
                            }
                            rectF2.set(fValueOf4.floatValue(), f212, Float.valueOf(f17).floatValue(), f213);
                            List<Integer> list17 = C6716m.f37937a;
                            paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                            paint2.setStrokeWidth(f14);
                            paint2.setStyle(Paint.Style.STROKE);
                            canvas.drawRoundRect(rectF2, f214, f214, paint2);
                            rectF2.set(f3, f212, f11, f213);
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setStrokeWidth(0.0f);
                            paint2.setColor(color);
                        } else {
                            paint2 = paint;
                            i20 = primaryHorizontal;
                            rectF2 = rectF;
                            i21 = i19;
                            lessonHighlightStyle5 = lessonHighlightStyle4;
                            c7570d = c7570d4;
                            if (lessonHighlightStyle2 == lessonHighlightStyle5) {
                            }
                            if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                                f15 = null;
                            } else {
                                f15 = null;
                            }
                            List<Integer> list18 = C6716m.f37937a;
                            paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                            rectF2.set(f3, f10, f11, f12);
                            float f215 = f41737n;
                            canvas.drawRoundRect(rectF2, f215, f215, paint2);
                            paint2.setColor(color);
                            c7570d2 = c7570d;
                            strM14301u3 = c7570d2.f41729i;
                            if (strM14301u3.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i18 = i17;
                                if (lineForOffset == i18) {
                                    if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                                Rect rect5 = new Rect();
                                c7571e = this;
                                TextPaint textPaint5 = c7571e.f41750i;
                                textPaint5.setColor(color);
                                textPaint5.setTextSize(10.0f);
                                layout = layout2;
                                charSequence2 = charSequence;
                                charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                textPaint5.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect5);
                                float fWidth5 = ((rectF2.width() / 2) / rect5.width()) * 10.0f;
                                if (fWidth5 <= 10.0f) {
                                }
                                resources = context.getResources();
                                if (resources != null) {
                                    fValueOf = f15;
                                } else {
                                    fValueOf = f15;
                                }
                                C5207g.m11108c(fValueOf);
                                textPaint5.setTextSize(fValueOf.floatValue() * f25);
                                canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint5.measureText(strM14301u3)) / 2), i12, textPaint5);
                            } else {
                                c7571e = this;
                                layout = layout2;
                                charSequence2 = charSequence;
                                i18 = i17;
                            }
                            paint4 = paint2;
                            i25 = i18;
                            c7571e3 = c7571e;
                        }
                        c7570d2 = c7570d;
                        f15 = null;
                        strM14301u3 = c7570d2.f41729i;
                        if (strM14301u3.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i18 = i17;
                            if (lineForOffset == i18) {
                                if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                C5207g.m11111f(c6526iM411w2, "indices");
                                if (c6526iM411w2.isEmpty()) {
                                    strM14301u3 = "";
                                } else {
                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                }
                            }
                            Rect rect6 = new Rect();
                            c7571e = this;
                            TextPaint textPaint6 = c7571e.f41750i;
                            textPaint6.setColor(color);
                            textPaint6.setTextSize(10.0f);
                            layout = layout2;
                            charSequence2 = charSequence;
                            charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                            textPaint6.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect6);
                            float fWidth6 = ((rectF2.width() / 2) / rect6.width()) * 10.0f;
                            if (fWidth6 <= 10.0f) {
                            }
                            resources = context.getResources();
                            if (resources != null) {
                                fValueOf = f15;
                            } else {
                                fValueOf = f15;
                            }
                            C5207g.m11108c(fValueOf);
                            textPaint6.setTextSize(fValueOf.floatValue() * f25);
                            canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint6.measureText(strM14301u3)) / 2), i12, textPaint6);
                        } else {
                            c7571e = this;
                            layout = layout2;
                            charSequence2 = charSequence;
                            i18 = i17;
                        }
                        paint4 = paint2;
                        i25 = i18;
                        c7571e3 = c7571e;
                    } else if (i26 < 0 || i26 >= charSequence.length()) {
                        return;
                    } else {
                        lineRight = layout3.getPrimaryHorizontal(i26);
                    }
                    primaryHorizontal = (int) lineRight;
                    if (i28 == i25) {
                        lineRight2 = layout3.getPrimaryHorizontal(length2);
                        if (lineRight2 == f19) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            lineRight2 = layout3.getLineRight(i28);
                        }
                    } else if (C5408a.m11572e(str)) {
                        lineRight2 = layout3.getLineLeft(lineForOffset);
                    } else {
                        lineRight2 = layout3.getLineRight(lineForOffset);
                    }
                    i19 = (int) lineRight2;
                    if (C5408a.m11572e(str)) {
                        i19 = primaryHorizontal;
                        primaryHorizontal = i19;
                    }
                    int lineTop2 = (int) (((double) layout3.getLineTop(i25)) - (((double) layout3.getLineAscent(i25)) / 5.0d));
                    layout2 = layout3;
                    double lineBaseline2 = (((double) (layout3.getLineBaseline(i25) - lineTop2)) / 5.0d) + ((double) layout3.getLineBaseline(i25));
                    color = paint.getColor();
                    paint4.setStyle(Paint.Style.FILL);
                    paint4.setStrokeWidth(0.0f);
                    paint4.setColor(color);
                    rectF = c7571e3.f41749h;
                    f3 = primaryHorizontal;
                    f10 = lineTop2;
                    f11 = i19;
                    f12 = (float) lineBaseline2;
                    rectF.set(f3, f10, f11, f12);
                    lessonHighlightStyle = LessonHighlightStyle.Off;
                    int i210 = i28;
                    lessonHighlightStyle2 = c7571e3.f41747f;
                    context = c7571e3.f41742a;
                    if (lessonHighlightStyle2 == lessonHighlightStyle) {
                        c7569c.f41714a = context.getColor(R.color.transparent);
                        c7569c.f41716c = context.getColor(R.color.transparent);
                    }
                    lessonHighlightStyle3 = LessonHighlightStyle.Underlined;
                    dashPathEffect = c7571e3.f41748g;
                    f13 = f41736m;
                    if (lessonHighlightStyle2 == lessonHighlightStyle3) {
                        if (c7569c.f41718e) {
                            lessonHighlightStyle4 = lessonHighlightStyle3;
                            if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                            }
                            zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                            f14 = f41739p;
                            if (zM11106a) {
                                f16 = f3 - f14;
                                if (f16 < 0.0f) {
                                    numberValueOf = Integer.valueOf(primaryHorizontal);
                                } else {
                                    numberValueOf = Float.valueOf(f16);
                                }
                                f17 = f11 + f14;
                                if (f17 > canvas.getClipBounds().right) {
                                    numberValueOf2 = Integer.valueOf(i19);
                                } else {
                                    numberValueOf2 = Float.valueOf(f17);
                                }
                                float fFloatValue4 = numberValueOf.floatValue();
                                float f216 = f41735l;
                                float f217 = f10 - f216;
                                float f218 = f12 + f216;
                                i20 = primaryHorizontal;
                                rectF2 = rectF;
                                rectF2.set(fFloatValue4, f217, numberValueOf2.floatValue(), f218);
                                paint2 = paint;
                                paint2.setStrokeWidth(0.0f);
                                i22 = c7569c.f41714a;
                                i21 = i19;
                                if (i22 == R.attr.yellowWordStatus4Color) {
                                    List<Integer> list19 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                                    c7570d = c7570d4;
                                } else {
                                    lessonHighlightStyle6 = lessonHighlightStyle4;
                                    c7570d = c7570d4;
                                    if (lessonHighlightStyle2 == lessonHighlightStyle6) {
                                        List<Integer> list110 = C6716m.f37937a;
                                        iM13333r = C6716m.m13333r(i22, context);
                                    } else {
                                        List<Integer> list111 = C6716m.f37937a;
                                        iM13333r = C6716m.m13333r(i22, context);
                                    }
                                }
                                paint2.setColor(iM13333r);
                                paint2.setStyle(Paint.Style.FILL);
                                float f219 = f41738o;
                                canvas.drawRoundRect(rectF2, f219, f219, paint2);
                                if (f16 < 0.0f) {
                                    f18 = f3 + f14;
                                } else {
                                    f18 = f16;
                                }
                                Float fValueOf5 = Float.valueOf(f18);
                                if (f17 > canvas.getClipBounds().right) {
                                    f17 = f11 - f14;
                                }
                                rectF2.set(fValueOf5.floatValue(), f217, Float.valueOf(f17).floatValue(), f218);
                                List<Integer> list112 = C6716m.f37937a;
                                paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                                paint2.setStrokeWidth(f14);
                                paint2.setStyle(Paint.Style.STROKE);
                                canvas.drawRoundRect(rectF2, f219, f219, paint2);
                                rectF2.set(f3, f217, f11, f218);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setStrokeWidth(0.0f);
                                paint2.setColor(color);
                            } else {
                                paint2 = paint;
                                i20 = primaryHorizontal;
                                rectF2 = rectF;
                                i21 = i19;
                                lessonHighlightStyle5 = lessonHighlightStyle4;
                                c7570d = c7570d4;
                                if (lessonHighlightStyle2 == lessonHighlightStyle5) {
                                }
                                if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                                    f15 = null;
                                } else {
                                    f15 = null;
                                }
                                List<Integer> list113 = C6716m.f37937a;
                                paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                                rectF2.set(f3, f10, f11, f12);
                                float f2110 = f41737n;
                                canvas.drawRoundRect(rectF2, f2110, f2110, paint2);
                                paint2.setColor(color);
                                c7570d2 = c7570d;
                                strM14301u3 = c7570d2.f41729i;
                                if (strM14301u3.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i18 = i17;
                                    if (lineForOffset == i18) {
                                        if (lineForOffset != i18) {
                                            if (lineForOffset != i18) {
                                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                                C5207g.m11111f(c6526iM411w2, "indices");
                                                if (c6526iM411w2.isEmpty()) {
                                                    strM14301u3 = "";
                                                } else {
                                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                                }
                                            }
                                        } else if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                    Rect rect7 = new Rect();
                                    c7571e = this;
                                    TextPaint textPaint7 = c7571e.f41750i;
                                    textPaint7.setColor(color);
                                    textPaint7.setTextSize(10.0f);
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                    textPaint7.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect7);
                                    float fWidth7 = ((rectF2.width() / 2) / rect7.width()) * 10.0f;
                                    if (fWidth7 <= 10.0f) {
                                    }
                                    resources = context.getResources();
                                    if (resources != null) {
                                        fValueOf = f15;
                                    } else {
                                        fValueOf = f15;
                                    }
                                    C5207g.m11108c(fValueOf);
                                    textPaint7.setTextSize(fValueOf.floatValue() * f25);
                                    canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint7.measureText(strM14301u3)) / 2), i12, textPaint7);
                                } else {
                                    c7571e = this;
                                    layout = layout2;
                                    charSequence2 = charSequence;
                                    i18 = i17;
                                }
                                paint4 = paint2;
                                i25 = i18;
                                c7571e3 = c7571e;
                            }
                            c7570d2 = c7570d;
                            f15 = null;
                            strM14301u3 = c7570d2.f41729i;
                            if (strM14301u3.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i18 = i17;
                                if (lineForOffset == i18) {
                                    if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                                Rect rect8 = new Rect();
                                c7571e = this;
                                TextPaint textPaint8 = c7571e.f41750i;
                                textPaint8.setColor(color);
                                textPaint8.setTextSize(10.0f);
                                layout = layout2;
                                charSequence2 = charSequence;
                                charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                textPaint8.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect8);
                                float fWidth8 = ((rectF2.width() / 2) / rect8.width()) * 10.0f;
                                if (fWidth8 <= 10.0f) {
                                }
                                resources = context.getResources();
                                if (resources != null) {
                                    fValueOf = f15;
                                } else {
                                    fValueOf = f15;
                                }
                                C5207g.m11108c(fValueOf);
                                textPaint8.setTextSize(fValueOf.floatValue() * f25);
                                canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint8.measureText(strM14301u3)) / 2), i12, textPaint8);
                            } else {
                                c7571e = this;
                                layout = layout2;
                                charSequence2 = charSequence;
                                i18 = i17;
                            }
                            paint4 = paint2;
                            i25 = i18;
                            c7571e3 = c7571e;
                        } else {
                            lessonHighlightStyle4 = lessonHighlightStyle3;
                        }
                        paint3 = c7571e3.f41751j;
                        i23 = c7569c.f41720g;
                        cardStatus = CardStatus.Learned;
                        if (i23 == cardStatus.getValue()) {
                            List<Integer> list20 = C6716m.f37937a;
                            iM13333r2 = C6716m.m13333r(R.attr.primaryTextColor, context);
                        } else if (c7569c.f41714a == R.color.transparent) {
                            iM13333r2 = context.getColor(R.color.transparent);
                        } else {
                            List<Integer> list21 = C6716m.f37937a;
                            iM13333r2 = C6716m.m13333r(c7569c.f41715b, context);
                        }
                        paint3.setColor(iM13333r2);
                        paint3.setStrokeWidth(f41740q);
                        paint3.setStyle(Paint.Style.STROKE);
                        if (c7569c.f41720g == cardStatus.getValue()) {
                            paint3.setPathEffect(dashPathEffect);
                        } else {
                            paint3.setPathEffect(null);
                        }
                        Path path3 = new Path();
                        path3.moveTo(f3 + f13, f12);
                        path3.lineTo(f11 - f13, f12);
                        canvas.drawPath(path3, paint3);
                        paint3.setColor(color);
                        zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                        f14 = f41739p;
                        if (zM11106a) {
                            f16 = f3 - f14;
                            if (f16 < 0.0f) {
                                numberValueOf = Integer.valueOf(primaryHorizontal);
                            } else {
                                numberValueOf = Float.valueOf(f16);
                            }
                            f17 = f11 + f14;
                            if (f17 > canvas.getClipBounds().right) {
                                numberValueOf2 = Integer.valueOf(i19);
                            } else {
                                numberValueOf2 = Float.valueOf(f17);
                            }
                            float fFloatValue5 = numberValueOf.floatValue();
                            float f2111 = f41735l;
                            float f2112 = f10 - f2111;
                            float f2113 = f12 + f2111;
                            i20 = primaryHorizontal;
                            rectF2 = rectF;
                            rectF2.set(fFloatValue5, f2112, numberValueOf2.floatValue(), f2113);
                            paint2 = paint;
                            paint2.setStrokeWidth(0.0f);
                            i22 = c7569c.f41714a;
                            i21 = i19;
                            if (i22 == R.attr.yellowWordStatus4Color) {
                                List<Integer> list114 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                                c7570d = c7570d4;
                            } else {
                                lessonHighlightStyle6 = lessonHighlightStyle4;
                                c7570d = c7570d4;
                                if (lessonHighlightStyle2 == lessonHighlightStyle6) {
                                    List<Integer> list115 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(i22, context);
                                } else {
                                    List<Integer> list116 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(i22, context);
                                }
                            }
                            paint2.setColor(iM13333r);
                            paint2.setStyle(Paint.Style.FILL);
                            float f2114 = f41738o;
                            canvas.drawRoundRect(rectF2, f2114, f2114, paint2);
                            if (f16 < 0.0f) {
                                f18 = f3 + f14;
                            } else {
                                f18 = f16;
                            }
                            Float fValueOf6 = Float.valueOf(f18);
                            if (f17 > canvas.getClipBounds().right) {
                                f17 = f11 - f14;
                            }
                            rectF2.set(fValueOf6.floatValue(), f2112, Float.valueOf(f17).floatValue(), f2113);
                            List<Integer> list117 = C6716m.f37937a;
                            paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                            paint2.setStrokeWidth(f14);
                            paint2.setStyle(Paint.Style.STROKE);
                            canvas.drawRoundRect(rectF2, f2114, f2114, paint2);
                            rectF2.set(f3, f2112, f11, f2113);
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setStrokeWidth(0.0f);
                            paint2.setColor(color);
                        } else {
                            paint2 = paint;
                            i20 = primaryHorizontal;
                            rectF2 = rectF;
                            i21 = i19;
                            lessonHighlightStyle5 = lessonHighlightStyle4;
                            c7570d = c7570d4;
                            if (lessonHighlightStyle2 == lessonHighlightStyle5) {
                            }
                            if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                                f15 = null;
                            } else {
                                f15 = null;
                            }
                            List<Integer> list118 = C6716m.f37937a;
                            paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                            rectF2.set(f3, f10, f11, f12);
                            float f2115 = f41737n;
                            canvas.drawRoundRect(rectF2, f2115, f2115, paint2);
                            paint2.setColor(color);
                            c7570d2 = c7570d;
                            strM14301u3 = c7570d2.f41729i;
                            if (strM14301u3.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i18 = i17;
                                if (lineForOffset == i18) {
                                    if (lineForOffset != i18) {
                                        if (lineForOffset != i18) {
                                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                            C5207g.m11111f(c6526iM411w2, "indices");
                                            if (c6526iM411w2.isEmpty()) {
                                                strM14301u3 = "";
                                            } else {
                                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                            }
                                        }
                                    } else if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                                Rect rect9 = new Rect();
                                c7571e = this;
                                TextPaint textPaint9 = c7571e.f41750i;
                                textPaint9.setColor(color);
                                textPaint9.setTextSize(10.0f);
                                layout = layout2;
                                charSequence2 = charSequence;
                                charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                                textPaint9.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect9);
                                float fWidth9 = ((rectF2.width() / 2) / rect9.width()) * 10.0f;
                                if (fWidth9 <= 10.0f) {
                                }
                                resources = context.getResources();
                                if (resources != null) {
                                    fValueOf = f15;
                                } else {
                                    fValueOf = f15;
                                }
                                C5207g.m11108c(fValueOf);
                                textPaint9.setTextSize(fValueOf.floatValue() * f25);
                                canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint9.measureText(strM14301u3)) / 2), i12, textPaint9);
                            } else {
                                c7571e = this;
                                layout = layout2;
                                charSequence2 = charSequence;
                                i18 = i17;
                            }
                            paint4 = paint2;
                            i25 = i18;
                            c7571e3 = c7571e;
                        }
                        c7570d2 = c7570d;
                        f15 = null;
                        strM14301u3 = c7570d2.f41729i;
                        if (strM14301u3.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i18 = i17;
                            if (lineForOffset == i18) {
                                if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                C5207g.m11111f(c6526iM411w2, "indices");
                                if (c6526iM411w2.isEmpty()) {
                                    strM14301u3 = "";
                                } else {
                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                }
                            }
                            Rect rect10 = new Rect();
                            c7571e = this;
                            TextPaint textPaint10 = c7571e.f41750i;
                            textPaint10.setColor(color);
                            textPaint10.setTextSize(10.0f);
                            layout = layout2;
                            charSequence2 = charSequence;
                            charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                            textPaint10.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect10);
                            float fWidth10 = ((rectF2.width() / 2) / rect10.width()) * 10.0f;
                            if (fWidth10 <= 10.0f) {
                            }
                            resources = context.getResources();
                            if (resources != null) {
                                fValueOf = f15;
                            } else {
                                fValueOf = f15;
                            }
                            C5207g.m11108c(fValueOf);
                            textPaint10.setTextSize(fValueOf.floatValue() * f25);
                            canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint10.measureText(strM14301u3)) / 2), i12, textPaint10);
                        } else {
                            c7571e = this;
                            layout = layout2;
                            charSequence2 = charSequence;
                            i18 = i17;
                        }
                        paint4 = paint2;
                        i25 = i18;
                        c7571e3 = c7571e;
                    } else {
                        lessonHighlightStyle4 = lessonHighlightStyle3;
                    }
                    zM11106a = C5207g.m11106a(c7571e3.f41746e, c7570d4);
                    f14 = f41739p;
                    if (zM11106a) {
                        f16 = f3 - f14;
                        if (f16 < 0.0f) {
                            numberValueOf = Integer.valueOf(primaryHorizontal);
                        } else {
                            numberValueOf = Float.valueOf(f16);
                        }
                        f17 = f11 + f14;
                        if (f17 > canvas.getClipBounds().right) {
                            numberValueOf2 = Integer.valueOf(i19);
                        } else {
                            numberValueOf2 = Float.valueOf(f17);
                        }
                        float fFloatValue6 = numberValueOf.floatValue();
                        float f2116 = f41735l;
                        float f2117 = f10 - f2116;
                        float f2118 = f12 + f2116;
                        i20 = primaryHorizontal;
                        rectF2 = rectF;
                        rectF2.set(fFloatValue6, f2117, numberValueOf2.floatValue(), f2118);
                        paint2 = paint;
                        paint2.setStrokeWidth(0.0f);
                        i22 = c7569c.f41714a;
                        i21 = i19;
                        if (i22 == R.attr.yellowWordStatus4Color) {
                            List<Integer> list119 = C6716m.f37937a;
                            iM13333r = C6716m.m13333r(R.attr.backgroundGeneral, context);
                            c7570d = c7570d4;
                        } else {
                            lessonHighlightStyle6 = lessonHighlightStyle4;
                            c7570d = c7570d4;
                            if (lessonHighlightStyle2 == lessonHighlightStyle6) {
                                List<Integer> list1110 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(i22, context);
                            } else {
                                List<Integer> list1111 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(i22, context);
                            }
                        }
                        paint2.setColor(iM13333r);
                        paint2.setStyle(Paint.Style.FILL);
                        float f2119 = f41738o;
                        canvas.drawRoundRect(rectF2, f2119, f2119, paint2);
                        if (f16 < 0.0f) {
                            f18 = f3 + f14;
                        } else {
                            f18 = f16;
                        }
                        Float fValueOf7 = Float.valueOf(f18);
                        if (f17 > canvas.getClipBounds().right) {
                            f17 = f11 - f14;
                        }
                        rectF2.set(fValueOf7.floatValue(), f2117, Float.valueOf(f17).floatValue(), f2118);
                        List<Integer> list1112 = C6716m.f37937a;
                        paint2.setColor(C6716m.m13333r(c7569c.f41716c, context));
                        paint2.setStrokeWidth(f14);
                        paint2.setStyle(Paint.Style.STROKE);
                        canvas.drawRoundRect(rectF2, f2119, f2119, paint2);
                        rectF2.set(f3, f2117, f11, f2118);
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setStrokeWidth(0.0f);
                        paint2.setColor(color);
                    } else {
                        paint2 = paint;
                        i20 = primaryHorizontal;
                        rectF2 = rectF;
                        i21 = i19;
                        lessonHighlightStyle5 = lessonHighlightStyle4;
                        c7570d = c7570d4;
                        if (lessonHighlightStyle2 == lessonHighlightStyle5) {
                        }
                        if (c7569c.f41720g == CardStatus.Learned.getValue()) {
                            f15 = null;
                        } else {
                            f15 = null;
                        }
                        List<Integer> list1113 = C6716m.f37937a;
                        paint2.setColor(C6716m.m13333r(c7569c.f41714a, context));
                        rectF2.set(f3, f10, f11, f12);
                        float f21110 = f41737n;
                        canvas.drawRoundRect(rectF2, f21110, f21110, paint2);
                        paint2.setColor(color);
                        c7570d2 = c7570d;
                        strM14301u3 = c7570d2.f41729i;
                        if (strM14301u3.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i18 = i17;
                            if (lineForOffset == i18) {
                                if (lineForOffset != i18) {
                                    if (lineForOffset != i18) {
                                        c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                        C5207g.m11111f(c6526iM411w2, "indices");
                                        if (c6526iM411w2.isEmpty()) {
                                            strM14301u3 = "";
                                        } else {
                                            strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                        }
                                    }
                                } else if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                C5207g.m11111f(c6526iM411w2, "indices");
                                if (c6526iM411w2.isEmpty()) {
                                    strM14301u3 = "";
                                } else {
                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                }
                            }
                            Rect rect11 = new Rect();
                            c7571e = this;
                            TextPaint textPaint11 = c7571e.f41750i;
                            textPaint11.setColor(color);
                            textPaint11.setTextSize(10.0f);
                            layout = layout2;
                            charSequence2 = charSequence;
                            charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                            textPaint11.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect11);
                            float fWidth11 = ((rectF2.width() / 2) / rect11.width()) * 10.0f;
                            if (fWidth11 <= 10.0f) {
                            }
                            resources = context.getResources();
                            if (resources != null) {
                                fValueOf = f15;
                            } else {
                                fValueOf = f15;
                            }
                            C5207g.m11108c(fValueOf);
                            textPaint11.setTextSize(fValueOf.floatValue() * f25);
                            canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint11.measureText(strM14301u3)) / 2), i12, textPaint11);
                        } else {
                            c7571e = this;
                            layout = layout2;
                            charSequence2 = charSequence;
                            i18 = i17;
                        }
                        paint4 = paint2;
                        i25 = i18;
                        c7571e3 = c7571e;
                    }
                    c7570d2 = c7570d;
                    f15 = null;
                    strM14301u3 = c7570d2.f41729i;
                    if (strM14301u3.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i18 = i17;
                        if (lineForOffset == i18) {
                            if (lineForOffset != i18) {
                                if (lineForOffset != i18) {
                                    c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                    C5207g.m11111f(c6526iM411w2, "indices");
                                    if (c6526iM411w2.isEmpty()) {
                                        strM14301u3 = "";
                                    } else {
                                        strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                    }
                                }
                            } else if (lineForOffset != i18) {
                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                C5207g.m11111f(c6526iM411w2, "indices");
                                if (c6526iM411w2.isEmpty()) {
                                    strM14301u3 = "";
                                } else {
                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                }
                            }
                        } else if (lineForOffset != i18) {
                            if (lineForOffset != i18) {
                                c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                                C5207g.m11111f(c6526iM411w2, "indices");
                                if (c6526iM411w2.isEmpty()) {
                                    strM14301u3 = "";
                                } else {
                                    strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                                }
                            }
                        } else if (lineForOffset != i18) {
                            c6526iM411w2 = C0062b.m411w2(strM14301u3.length() / 2, strM14301u3.length());
                            C5207g.m11111f(c6526iM411w2, "indices");
                            if (c6526iM411w2.isEmpty()) {
                                strM14301u3 = "";
                            } else {
                                strM14301u3 = C7076b.m14301u3(strM14301u3, c6526iM411w2);
                            }
                        }
                        Rect rect12 = new Rect();
                        c7571e = this;
                        TextPaint textPaint12 = c7571e.f41750i;
                        textPaint12.setColor(color);
                        textPaint12.setTextSize(10.0f);
                        layout = layout2;
                        charSequence2 = charSequence;
                        charSequence2.subSequence(layout.getOffsetForHorizontal(i18, f3), layout.getOffsetForHorizontal(i18, f11)).toString();
                        textPaint12.getTextBounds(strM14301u3, 0, strM14301u3.length(), rect12);
                        float fWidth12 = ((rectF2.width() / 2) / rect12.width()) * 10.0f;
                        if (fWidth12 <= 10.0f) {
                        }
                        resources = context.getResources();
                        if (resources != null) {
                            fValueOf = f15;
                        } else {
                            fValueOf = f15;
                        }
                        C5207g.m11108c(fValueOf);
                        textPaint12.setTextSize(fValueOf.floatValue() * f25);
                        canvas.drawText(strM14301u3, (((i21 - i20) / 2) + i20) - (((int) textPaint12.measureText(strM14301u3)) / 2), i12, textPaint12);
                    } else {
                        c7571e = this;
                        layout = layout2;
                        charSequence2 = charSequence;
                        i18 = i17;
                    }
                    paint4 = paint2;
                    i25 = i18;
                    c7571e3 = c7571e;
                } else {
                    c7571e = c7571e2;
                    charSequence2 = charSequence3;
                    i18 = i24;
                    layout = layout3;
                }
                it = it2;
                i24 = i18;
                c7571e2 = c7571e;
                charSequence3 = charSequence2;
                layout3 = layout;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7571e)) {
            return false;
        }
        C7571e c7571e = (C7571e) obj;
        return C5207g.m11106a(this.f41742a, c7571e.f41742a) && C5207g.m11106a(this.f41743b, c7571e.f41743b) && C5207g.m11106a(this.f41744c, c7571e.f41744c) && C5207g.m11106a(this.f41745d, c7571e.f41745d) && C5207g.m11106a(this.f41746e, c7571e.f41746e) && this.f41747f == c7571e.f41747f;
    }

    public final int hashCode() {
        int iHashCode = this.f41742a.hashCode() * 31;
        int iHashCode2 = 0;
        Layout layout = this.f41743b;
        int iM848g = C0204c.m848g(this.f41745d, C0166e.m758d(this.f41744c, (iHashCode + (layout == null ? 0 : layout.hashCode())) * 31, 31), 31);
        C7570d c7570d = this.f41746e;
        if (c7570d != null) {
            iHashCode2 = c7570d.hashCode();
        }
        return this.f41747f.hashCode() + ((iM848g + iHashCode2) * 31);
    }

    public final String toString() {
        return "TokenBackgroundSpan(context=" + this.f41742a + ", layout=" + this.f41743b + ", language=" + this.f41744c + ", spans=" + this.f41745d + ", spanSelected=" + this.f41746e + ", highlightStyle=" + this.f41747f + ")";
    }
}
