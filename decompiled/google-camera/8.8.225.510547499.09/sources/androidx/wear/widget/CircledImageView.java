package androidx.wear.widget;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p000.afn;
import p000.atd;
import p000.auv;
import p000.avb;
import p000.avc;
import p000.avh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CircledImageView extends View {

    /* JADX INFO: renamed from: a */
    int f1720a;

    /* JADX INFO: renamed from: b */
    private final RectF f1721b;

    /* JADX INFO: renamed from: c */
    private final Paint f1722c;

    /* JADX INFO: renamed from: d */
    private final avc f1723d;

    /* JADX INFO: renamed from: e */
    private final avh f1724e;

    /* JADX INFO: renamed from: f */
    private final Drawable.Callback f1725f;

    /* JADX INFO: renamed from: g */
    private ColorStateList f1726g;

    /* JADX INFO: renamed from: h */
    private Drawable f1727h;

    /* JADX INFO: renamed from: i */
    private float f1728i;

    /* JADX INFO: renamed from: j */
    private float f1729j;

    /* JADX INFO: renamed from: k */
    private float f1730k;

    /* JADX INFO: renamed from: l */
    private float f1731l;

    /* JADX INFO: renamed from: m */
    private float f1732m;

    /* JADX INFO: renamed from: n */
    private int f1733n;

    /* JADX INFO: renamed from: o */
    private Paint.Cap f1734o;

    /* JADX INFO: renamed from: p */
    private float f1735p;

    /* JADX INFO: renamed from: q */
    private float f1736q;

    /* JADX INFO: renamed from: r */
    private boolean f1737r;

    /* JADX INFO: renamed from: s */
    private float f1738s;

    /* JADX INFO: renamed from: t */
    private float f1739t;

    /* JADX INFO: renamed from: u */
    private Integer f1740u;

    /* JADX INFO: renamed from: v */
    private Integer f1741v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m1677d() {
        int colorForState = this.f1726g.getColorForState(getDrawableState(), this.f1726g.getDefaultColor());
        if (colorForState != this.f1720a) {
            this.f1720a = colorForState;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m1678a() {
        float fMax = this.f1728i;
        if (fMax <= 0.0f && this.f1729j > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.f1729j;
        }
        return fMax - this.f1732m;
    }

    /* JADX INFO: renamed from: b */
    public final float m1679b() {
        float fMax = this.f1730k;
        if (fMax <= 0.0f && this.f1731l > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.f1731l;
        }
        return fMax - this.f1732m;
    }

    /* JADX INFO: renamed from: c */
    public final void m1680c() {
        avh avhVar = this.f1724e;
        if (avhVar != null) {
            avhVar.f2517a.cancel();
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        m1677d();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float fM1679b = this.f1737r ? m1679b() : m1678a();
        getAlpha();
        if (this.f1735p > 0.0f) {
            this.f1721b.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            RectF rectF = this.f1721b;
            rectF.set(rectF.centerX() - fM1679b, this.f1721b.centerY() - fM1679b, this.f1721b.centerX() + fM1679b, this.f1721b.centerY() + fM1679b);
            this.f1722c.setColor(this.f1733n);
            Paint paint = this.f1722c;
            paint.setAlpha(Math.round(paint.getAlpha() * getAlpha()));
            this.f1722c.setStyle(Paint.Style.STROKE);
            this.f1722c.setStrokeWidth(this.f1735p);
            this.f1722c.setStrokeCap(this.f1734o);
            canvas.drawArc(this.f1721b, -90.0f, this.f1736q * 360.0f, false, this.f1722c);
        }
        this.f1721b.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f1722c.setColor(this.f1720a);
        Paint paint2 = this.f1722c;
        paint2.setAlpha(Math.round(paint2.getAlpha() * getAlpha()));
        this.f1722c.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f1721b.centerX(), this.f1721b.centerY(), fM1679b, this.f1722c);
        Drawable drawable = this.f1727h;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.f1740u;
            if (num != null) {
                this.f1727h.setTint(num.intValue());
            }
            this.f1727h.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable = this.f1727h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f1727h.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = this.f1738s;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            float f2 = intrinsicWidth;
            float f3 = intrinsicHeight;
            float fMin = Math.min(1.0f, Math.min(f2 != 0.0f ? (measuredWidth * f) / f2 : 1.0f, f3 != 0.0f ? (f * measuredHeight) / f3 : 1.0f));
            int iRound = Math.round(f2 * fMin);
            int iRound2 = Math.round(fMin * f3);
            int iRound3 = ((measuredWidth - iRound) / 2) + Math.round(this.f1739t * iRound);
            int i5 = (measuredHeight - iRound2) / 2;
            this.f1727h.setBounds(iRound3, i5, iRound + iRound3, iRound2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float fM1678a = m1678a() + this.f1735p;
        avc avcVar = this.f1723d;
        float f = avcVar.f2477a;
        float f2 = avcVar.f2478b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float f3 = fM1678a + (f * 0.0f);
        if (mode != 1073741824) {
            float f4 = f3 + f3;
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f4, size) : (int) f4;
        }
        if (mode2 != 1073741824) {
            float f5 = f3 + f3;
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f5, size2) : (int) f5;
        }
        Integer num = this.f1741v;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    size = size2;
                    break;
                case 2:
                    size2 = size;
                    break;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected final boolean onSetAlpha(int i) {
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1723d.m2048a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m1680c();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m1680c();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i2 != getPaddingTop() || i3 != getPaddingRight() || i4 != getPaddingBottom()) {
            this.f1723d.m2048a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.f1737r) {
            this.f1737r = z;
            avc avcVar = this.f1723d;
            avcVar.f2479c = z ? m1679b() : m1678a();
            avcVar.m2049b();
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        atd atdVar = new atd(this, 2);
        this.f1725f = atdVar;
        this.f1736q = 1.0f;
        this.f1737r = false;
        this.f1738s = 1.0f;
        this.f1739t = 0.0f;
        avb avbVar = avb.f2475a;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, auv.f2444d);
        afn.m536c(this, context, auv.f2444d, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1727h = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            Drawable drawableNewDrawable = this.f1727h.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f1727h = drawableNewDrawable;
            this.f1727h = drawableNewDrawable.mutate();
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.f1726g = colorStateList;
        if (colorStateList == null) {
            this.f1726g = ColorStateList.valueOf(context.getColor(R.color.darker_gray));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f1728i = dimension;
        this.f1730k = typedArrayObtainStyledAttributes.getDimension(7, dimension);
        this.f1733n = typedArrayObtainStyledAttributes.getColor(2, -16777216);
        this.f1734o = Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        this.f1735p = dimension2;
        if (dimension2 > 0.0f) {
            this.f1732m += dimension2 / 2.0f;
        }
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(25, 0.0f);
        if (dimension3 > 0.0f) {
            this.f1732m += dimension3;
        }
        this.f1738s = typedArrayObtainStyledAttributes.getFloat(23, 0.0f);
        this.f1739t = typedArrayObtainStyledAttributes.getFloat(24, 0.0f);
        if (typedArrayObtainStyledAttributes.hasValue(26)) {
            this.f1740u = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(26, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            this.f1741v = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(19, 0));
        }
        float fraction = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, 0.0f);
        this.f1729j = fraction;
        this.f1731l = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, fraction);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f1721b = new RectF();
        Paint paint = new Paint();
        this.f1722c = paint;
        paint.setAntiAlias(true);
        this.f1723d = new avc(dimension4, m1678a(), this.f1735p);
        avh avhVar = new avh();
        this.f1724e = avhVar;
        avhVar.setCallback(atdVar);
        setWillNotDraw(false);
        m1677d();
    }
}
