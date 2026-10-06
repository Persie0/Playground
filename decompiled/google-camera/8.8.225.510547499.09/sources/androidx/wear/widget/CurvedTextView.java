package androidx.wear.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000.auv;
import p000.auy;
import p000.avd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CurvedTextView extends View implements auy {

    /* JADX INFO: renamed from: a */
    public boolean f1742a;

    /* JADX INFO: renamed from: b */
    public String f1743b;

    /* JADX INFO: renamed from: c */
    public int f1744c;

    /* JADX INFO: renamed from: d */
    private final Path f1745d;

    /* JADX INFO: renamed from: e */
    private final Path f1746e;

    /* JADX INFO: renamed from: f */
    private final TextPaint f1747f;

    /* JADX INFO: renamed from: g */
    private final Rect f1748g;

    /* JADX INFO: renamed from: h */
    private final Rect f1749h;

    /* JADX INFO: renamed from: i */
    private String f1750i;

    /* JADX INFO: renamed from: j */
    private float f1751j;

    /* JADX INFO: renamed from: k */
    private float f1752k;

    /* JADX INFO: renamed from: l */
    private float f1753l;

    /* JADX INFO: renamed from: m */
    private int f1754m;

    /* JADX INFO: renamed from: n */
    private float f1755n;

    /* JADX INFO: renamed from: o */
    private int f1756o;

    /* JADX INFO: renamed from: p */
    private float f1757p;

    /* JADX INFO: renamed from: q */
    private float f1758q;

    /* JADX INFO: renamed from: r */
    private float f1759r;

    /* JADX INFO: renamed from: s */
    private float f1760s;

    /* JADX INFO: renamed from: t */
    private Typeface f1761t;

    /* JADX INFO: renamed from: u */
    private boolean f1762u;

    /* JADX INFO: renamed from: v */
    private TextUtils.TruncateAt f1763v;

    /* JADX INFO: renamed from: w */
    private boolean f1764w;

    public CurvedTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h */
    private static final void m1682h(TypedArray typedArray, avd avdVar, boolean z) {
        int i;
        if (z) {
            int[] iArr = auv.f2441a;
            i = 3;
        } else {
            int[] iArr2 = auv.f2441a;
            i = 4;
        }
        if (typedArray.hasValue(i)) {
            avdVar.f2486a = typedArray.getColorStateList(i);
        }
        boolean z2 = !z;
        avdVar.f2487b = typedArray.getDimensionPixelSize(z2 ? 1 : 0, (int) avdVar.f2487b);
        avdVar.f2491f = typedArray.getInt(true == z ? 2 : 3, avdVar.f2491f);
        int i2 = typedArray.getInt(true == z ? 1 : 2, avdVar.f2490e);
        avdVar.f2490e = i2;
        if (i2 != -1 && !avdVar.f2489d) {
            avdVar.f2488c = null;
        }
        int i3 = true != z ? 7 : 10;
        if (typedArray.hasValue(i3)) {
            avdVar.f2488c = typedArray.getString(i3);
            avdVar.f2489d = z2;
        }
        avdVar.f2492g = typedArray.getInt(true != z ? 11 : 14, avdVar.f2492g);
        avdVar.f2493h = typedArray.getFloat(true != z ? 8 : 11, avdVar.f2493h);
        int i4 = true != z ? 9 : 12;
        if (typedArray.hasValue(i4)) {
            avdVar.f2494i = typedArray.getString(i4);
        }
        int i5 = true == z ? 13 : 10;
        if (typedArray.hasValue(i5)) {
            avdVar.f2495j = typedArray.getString(i5);
        }
    }

    @Override // p000.auy
    /* JADX INFO: renamed from: a */
    public final float mo1683a() {
        return this.f1753l;
    }

    @Override // p000.auy
    /* JADX INFO: renamed from: b */
    public final int mo1684b() {
        return Math.round(this.f1747f.getFontMetrics().descent - this.f1747f.getFontMetrics().ascent);
    }

    @Override // p000.auy
    /* JADX INFO: renamed from: c */
    public final void mo1685c() {
        if (this.f1756o != -1) {
            throw new IllegalArgumentException("CurvedTextView shall not set anchorType value when added intoArcLayout");
        }
        if (this.f1757p != -1.0f) {
            throw new IllegalArgumentException("CurvedTextView shall not set anchorAngleDegrees value when added into ArcLayout");
        }
    }

    @Override // p000.auy
    /* JADX INFO: renamed from: d */
    public final void mo1686d(float f) {
        this.f1753l = f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        String str;
        float f;
        Drawable drawable;
        canvas.save();
        Drawable background = getBackground();
        if (this.f1742a || getTextAlignment() != this.f1754m) {
            this.f1742a = false;
            this.f1754m = getTextAlignment();
            float f2 = this.f1752k;
            float f3 = this.f1759r;
            if (f2 <= f3) {
                this.f1750i = this.f1743b;
            } else {
                double d = f3 / 180.0f;
                Double.isNaN(d);
                double d2 = this.f1751j;
                int paddingLeft = getPaddingLeft();
                Double.isNaN(d2);
                int paddingRight = (((int) ((d * 3.141592653589793d) * d2)) - paddingLeft) - getPaddingRight();
                String str2 = this.f1743b;
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), this.f1747f, paddingRight);
                builderObtain.setEllipsize(this.f1763v);
                builderObtain.setMaxLines(1);
                StaticLayout staticLayoutBuild = builderObtain.build();
                if (this.f1763v == null) {
                    str = this.f1743b.substring(0, staticLayoutBuild.getLineEnd(0));
                } else {
                    int ellipsisCount = staticLayoutBuild.getEllipsisCount(0);
                    if (ellipsisCount == 0) {
                        str = this.f1743b;
                    } else {
                        int ellipsisStart = staticLayoutBuild.getEllipsisStart(0);
                        char[] charArray = this.f1743b.toCharArray();
                        charArray[ellipsisStart] = 8230;
                        for (int i = ellipsisStart + 1; i < ellipsisStart + ellipsisCount; i++) {
                            if (i >= 0 && i < this.f1743b.length()) {
                                charArray[i] = 65279;
                            }
                        }
                        str = new String(charArray);
                    }
                }
                this.f1750i = str;
                this.f1752k = this.f1759r;
            }
            float f4 = 1.0f;
            float f5 = true != this.f1762u ? -1.0f : 1.0f;
            switch (getTextAlignment()) {
                case 2:
                case 5:
                    f4 = 0.0f;
                    break;
                case 3:
                case 6:
                    break;
                case 4:
                default:
                    f4 = 0.5f;
                    break;
            }
            switch (this.f1756o) {
                case 0:
                    f = 0.5f;
                    break;
                case 1:
                default:
                    f = 0.0f;
                    break;
                case 2:
                    f = -0.5f;
                    break;
            }
            float f6 = this.f1757p;
            float f7 = f6 != -1.0f ? f6 : 0.0f;
            float f8 = this.f1753l;
            this.f1755n = f7 + (f * f5 * f8);
            float f9 = -f5;
            float f10 = 0.5f * f9 * f8;
            float f11 = f4 * (f8 - this.f1752k);
            double paddingLeft2 = getPaddingLeft() / this.f1751j;
            Double.isNaN(paddingLeft2);
            double d3 = f11;
            Double.isNaN(d3);
            float f12 = f10 - 90.0f;
            float f13 = ((float) (d3 + ((paddingLeft2 / 3.141592653589793d) * 180.0d))) * f5;
            float width = getWidth();
            float height = getHeight();
            this.f1745d.reset();
            Path path = this.f1745d;
            float f14 = height / 2.0f;
            float f15 = width / 2.0f;
            float f16 = this.f1751j;
            path.addArc(f15 - f16, f14 - f16, f15 + f16, f14 + f16, f12 + f13, f5 * this.f1752k);
            if (background != null) {
                this.f1746e.reset();
                float f17 = this.f1751j - (this.f1747f.getFontMetrics().descent * f5);
                float f18 = this.f1751j - (this.f1747f.getFontMetrics().ascent * f5);
                this.f1746e.arcTo(f15 - f18, f14 - f18, f15 + f18, f14 + f18, f12, f5 * this.f1753l, false);
                float f19 = this.f1753l;
                this.f1746e.arcTo(f15 - f17, f14 - f17, f15 + f17, f14 + f17, f12 + (f5 * f19), f9 * f19, false);
                this.f1746e.close();
                double d4 = f15;
                double d5 = f12;
                Double.isNaN(d5);
                double d6 = (d5 * 3.141592653589793d) / 180.0d;
                double d7 = f18;
                double dCos = Math.cos(d6);
                Double.isNaN(d7);
                double d8 = f17;
                double dCos2 = Math.cos(d6);
                Double.isNaN(d8);
                double d9 = f14;
                double dSin = Math.sin(d6);
                Double.isNaN(d7);
                double dSin2 = Math.sin(d6);
                Double.isNaN(d8);
                float f20 = f12 + (f5 * this.f1753l);
                drawable = background;
                double d10 = f20;
                Double.isNaN(d10);
                double d11 = (d10 * 3.141592653589793d) / 180.0d;
                double dCos3 = Math.cos(d11);
                Double.isNaN(d7);
                double dCos4 = Math.cos(d11);
                Double.isNaN(d8);
                float fMax = Math.max(f17, f18);
                this.f1749h.top = (int) (f14 - fMax);
                Rect rect = this.f1749h;
                Double.isNaN(d9);
                Double.isNaN(d9);
                rect.bottom = (int) Math.max((float) (d9 + (dSin * d7)), (float) (d9 + (dSin2 * d8)));
                Rect rect2 = this.f1749h;
                float f21 = this.f1753l;
                Double.isNaN(d4);
                float f22 = (float) (d4 + (d7 * dCos3));
                Double.isNaN(d4);
                float f23 = (float) (d4 + (dCos * d7));
                Double.isNaN(d4);
                float f24 = (float) (d4 + (dCos2 * d8));
                Double.isNaN(d4);
                float f25 = (float) (d4 + (d8 * dCos4));
                rect2.left = f21 >= 180.0f ? (int) (f15 - fMax) : (int) Math.min(f23, Math.min(f24, Math.min(f22, f25)));
                this.f1749h.right = this.f1753l >= 180.0f ? (int) (f15 + fMax) : (int) Math.max(f23, Math.max(f24, Math.max(f22, f25)));
            } else {
                drawable = background;
            }
        } else {
            drawable = background;
        }
        canvas.rotate(this.f1755n, getWidth() / 2.0f, getHeight() / 2.0f);
        if (drawable != null) {
            canvas.clipPath(this.f1746e);
            getBackground().setBounds(this.f1749h);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // p000.auy
    /* JADX INFO: renamed from: e */
    public final boolean mo1687e(float f, float f2) {
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - (this.f1762u ? getPaddingTop() : getPaddingBottom());
        float f3 = (fMin - this.f1747f.getFontMetrics().descent) + this.f1747f.getFontMetrics().ascent;
        float width = f - (getWidth() / 2);
        float height = f2 - (getHeight() / 2);
        float f4 = (width * width) + (height * height);
        return f4 >= f3 * f3 && f4 <= fMin * fMin && ((float) Math.toDegrees(Math.atan2((double) Math.abs(width), (double) (-height)))) < this.f1753l / 2.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m1688f() {
        this.f1742a = true;
        requestLayout();
        postInvalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.f1747f.setColor(this.f1744c);
        this.f1747f.setStyle(Paint.Style.FILL);
        canvas.drawTextOnPath(this.f1750i, this.f1745d, 0.0f, 0.0f, this.f1747f);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f1743b);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextPaint textPaint = this.f1747f;
        String str = this.f1743b;
        textPaint.getTextBounds(str, 0, str.length(), this.f1748g);
        this.f1751j = (Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f) + (this.f1762u ? this.f1747f.getFontMetrics().ascent - getPaddingTop() : (-this.f1747f.getFontMetrics().descent) - getPaddingBottom());
        float fMin = Math.min(((((this.f1748g.width() + getPaddingLeft()) + getPaddingRight()) / this.f1751j) / 3.1415927f) * 180.0f, 359.9f);
        this.f1752k = fMin;
        this.f1753l = Math.max(Math.min(this.f1759r, fMin), this.f1758q);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.f1743b);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1688f();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1764w && motionEvent.getAction() != 0) {
            return false;
        }
        float x = motionEvent.getX() - (getWidth() / 2);
        float y = motionEvent.getY() - (getHeight() / 2);
        double d = -Math.toRadians(this.f1755n);
        double d2 = x;
        double dCos = Math.cos(d);
        Double.isNaN(d2);
        double d3 = dCos * d2;
        double d4 = y;
        double dSin = Math.sin(d);
        Double.isNaN(d4);
        double d5 = dSin * d4;
        int width = getWidth() / 2;
        double dSin2 = Math.sin(d);
        Double.isNaN(d2);
        double dCos2 = Math.cos(d);
        Double.isNaN(d4);
        double d6 = d4 * dCos2;
        int height = getHeight() / 2;
        boolean z = this.f1764w;
        double d7 = (d2 * dSin2) + d6;
        double d8 = height;
        Double.isNaN(d8);
        double d9 = d7 + d8;
        double d10 = width;
        Double.isNaN(d10);
        float f = (float) ((d3 - d5) + d10);
        float f2 = (float) d9;
        if (!z && mo1687e(f, f2)) {
            this.f1764w = true;
        }
        if (!this.f1764w) {
            return false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f1764w = false;
        }
        motionEvent.offsetLocation(f - motionEvent.getX(), f2 - motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public CurvedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public CurvedTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CurvedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        TextUtils.TruncateAt truncateAt;
        super(context, attributeSet, i, i2);
        this.f1745d = new Path();
        this.f1746e = new Path();
        TextPaint textPaint = new TextPaint();
        this.f1747f = textPaint;
        this.f1748g = new Rect();
        this.f1749h = new Rect();
        this.f1742a = true;
        this.f1750i = "";
        this.f1751j = 0.0f;
        this.f1752k = 0.0f;
        this.f1753l = 359.9f;
        this.f1754m = -1;
        this.f1755n = 0.0f;
        this.f1743b = "";
        this.f1760s = 24.0f;
        this.f1761t = null;
        this.f1762u = true;
        this.f1744c = -1;
        this.f1763v = null;
        this.f1764w = false;
        textPaint.setAntiAlias(true);
        avd avdVar = new avd();
        avdVar.f2486a = ColorStateList.valueOf(-1);
        Resources.Theme theme = context.getTheme();
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, auv.f2448h, i, i2);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(resourceId, auv.f2447g);
        } else {
            typedArrayObtainStyledAttributes = null;
        }
        if (typedArrayObtainStyledAttributes != null) {
            m1682h(typedArrayObtainStyledAttributes, avdVar, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, auv.f2445e, i, i2);
        m1682h(typedArrayObtainStyledAttributes3, avdVar, false);
        if (typedArrayObtainStyledAttributes3.hasValue(6)) {
            this.f1743b = typedArrayObtainStyledAttributes3.getString(6);
        }
        switch (typedArrayObtainStyledAttributes3.getInt(5, 0)) {
            case 1:
                truncateAt = TextUtils.TruncateAt.START;
                this.f1763v = truncateAt;
                break;
            case 2:
                truncateAt = TextUtils.TruncateAt.MIDDLE;
                this.f1763v = truncateAt;
                break;
            case 3:
                truncateAt = TextUtils.TruncateAt.END;
                this.f1763v = truncateAt;
                break;
            default:
                this.f1763v = null;
                break;
        }
        float f = typedArrayObtainStyledAttributes3.getFloat(15, 359.9f);
        this.f1759r = f;
        this.f1759r = Math.min(f, 359.9f);
        float f2 = typedArrayObtainStyledAttributes3.getFloat(16, 0.0f);
        this.f1758q = f2;
        if (f2 > this.f1759r) {
            throw new IllegalArgumentException("MinSweepDegrees cannot be bigger than MaxSweepDegrees");
        }
        this.f1756o = typedArrayObtainStyledAttributes3.getInt(13, -1);
        this.f1757p = typedArrayObtainStyledAttributes3.getFloat(12, -1.0f) % 360.0f;
        this.f1762u = typedArrayObtainStyledAttributes3.getBoolean(14, true);
        typedArrayObtainStyledAttributes3.recycle();
        ColorStateList colorStateList = avdVar.f2486a;
        if (colorStateList != null) {
            this.f1744c = colorStateList.getDefaultColor();
        }
        float f3 = avdVar.f2487b;
        if (f3 != -1.0f) {
            this.f1760s = f3;
        }
        String str = avdVar.f2488c;
        int i3 = avdVar.f2490e;
        int i4 = avdVar.f2491f;
        int i5 = avdVar.f2492g;
        Typeface typeface = this.f1761t;
        if (typeface == null && str != null) {
            m1681g(Typeface.create(str, 0), i4, i5);
        } else if (typeface != null) {
            m1681g(typeface, i4, i5);
        } else {
            switch (i3) {
                case 1:
                    m1681g(Typeface.SANS_SERIF, i4, i5);
                    break;
                case 2:
                    m1681g(Typeface.SERIF, i4, i5);
                    break;
                case 3:
                    m1681g(Typeface.MONOSPACE, i4, i5);
                    break;
                default:
                    m1681g(null, i4, i5);
                    break;
            }
        }
        textPaint.setLetterSpacing(avdVar.f2493h);
        textPaint.setFontFeatureSettings(avdVar.f2494i);
        textPaint.setFontVariationSettings(avdVar.f2495j);
        textPaint.setTextSize(this.f1760s);
    }

    /* JADX INFO: renamed from: g */
    private final void m1681g(Typeface typeface, int i, int i2) {
        if (i2 >= 0) {
            Typeface typefaceCreate = Typeface.create(typeface, Math.min(1000, i2), (i & 2) != 0);
            this.f1761t = typefaceCreate;
            this.f1747f.setTypeface(typefaceCreate);
            return;
        }
        if (i > 0) {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            if (!typefaceDefaultFromStyle.equals(this.f1747f.getTypeface())) {
                this.f1747f.setTypeface(typefaceDefaultFromStyle);
                this.f1761t = typefaceDefaultFromStyle;
            }
            int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i;
            this.f1747f.setFakeBoldText(1 == (style & 1));
            this.f1747f.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        } else {
            this.f1747f.setFakeBoldText(false);
            this.f1747f.setTextSkewX(0.0f);
            if ((typeface != null && !typeface.equals(this.f1747f.getTypeface())) || (typeface == null && this.f1747f.getTypeface() != null)) {
                this.f1747f.setTypeface(typeface);
                this.f1761t = typeface;
            }
        }
        m1688f();
    }
}
