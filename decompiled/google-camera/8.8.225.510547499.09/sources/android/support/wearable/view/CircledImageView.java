package android.support.wearable.view;

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
import p000.C0866ny;
import p000.C0890ov;
import p000.C0896pa;
import p000.atd;
import p000.avb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CircledImageView extends View {

    /* JADX INFO: renamed from: a */
    final RectF f1361a;

    /* JADX INFO: renamed from: b */
    public int f1362b;

    /* JADX INFO: renamed from: c */
    private final Paint f1363c;

    /* JADX INFO: renamed from: d */
    private final C0890ov f1364d;

    /* JADX INFO: renamed from: e */
    private ColorStateList f1365e;

    /* JADX INFO: renamed from: f */
    private Drawable f1366f;

    /* JADX INFO: renamed from: g */
    private float f1367g;

    /* JADX INFO: renamed from: h */
    private float f1368h;

    /* JADX INFO: renamed from: i */
    private float f1369i;

    /* JADX INFO: renamed from: j */
    private float f1370j;

    /* JADX INFO: renamed from: k */
    private float f1371k;

    /* JADX INFO: renamed from: l */
    private int f1372l;

    /* JADX INFO: renamed from: m */
    private Paint.Cap f1373m;

    /* JADX INFO: renamed from: n */
    private float f1374n;

    /* JADX INFO: renamed from: o */
    private float f1375o;

    /* JADX INFO: renamed from: p */
    private boolean f1376p;

    /* JADX INFO: renamed from: q */
    private final C0896pa f1377q;

    /* JADX INFO: renamed from: r */
    private float f1378r;

    /* JADX INFO: renamed from: s */
    private float f1379s;

    /* JADX INFO: renamed from: t */
    private Integer f1380t;

    /* JADX INFO: renamed from: u */
    private Integer f1381u;

    /* JADX INFO: renamed from: v */
    private final Drawable.Callback f1382v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m1393d() {
        int colorForState = this.f1365e.getColorForState(getDrawableState(), this.f1365e.getDefaultColor());
        if (colorForState != this.f1362b) {
            this.f1362b = colorForState;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m1394a() {
        float fMax = this.f1367g;
        if (fMax <= 0.0f && this.f1368h > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.f1368h;
        }
        return fMax - this.f1371k;
    }

    /* JADX INFO: renamed from: b */
    public final float m1395b() {
        float fMax = this.f1369i;
        if (fMax <= 0.0f && this.f1370j > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.f1370j;
        }
        return fMax - this.f1371k;
    }

    /* JADX INFO: renamed from: c */
    public final void m1396c() {
        C0896pa c0896pa = this.f1377q;
        if (c0896pa != null) {
            c0896pa.f47141a.cancel();
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        m1393d();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float fM1395b = this.f1376p ? m1395b() : m1394a();
        getAlpha();
        this.f1361a.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        RectF rectF = this.f1361a;
        rectF.set(rectF.centerX() - fM1395b, this.f1361a.centerY() - fM1395b, this.f1361a.centerX() + fM1395b, this.f1361a.centerY() + fM1395b);
        if (this.f1374n > 0.0f) {
            this.f1363c.setColor(this.f1372l);
            Paint paint = this.f1363c;
            paint.setAlpha(Math.round(paint.getAlpha() * getAlpha()));
            this.f1363c.setStyle(Paint.Style.STROKE);
            this.f1363c.setStrokeWidth(this.f1374n);
            this.f1363c.setStrokeCap(this.f1373m);
            canvas.drawArc(this.f1361a, -90.0f, this.f1375o * 360.0f, false, this.f1363c);
        }
        this.f1363c.setColor(this.f1362b);
        Paint paint2 = this.f1363c;
        paint2.setAlpha(Math.round(paint2.getAlpha() * getAlpha()));
        this.f1363c.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f1361a.centerX(), this.f1361a.centerY(), fM1395b, this.f1363c);
        Drawable drawable = this.f1366f;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.f1380t;
            if (num != null) {
                this.f1366f.setTint(num.intValue());
            }
            this.f1366f.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable = this.f1366f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f1366f.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = this.f1378r;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            float f2 = intrinsicWidth;
            float f3 = intrinsicHeight;
            float fMin = Math.min(1.0f, Math.min(f2 != 0.0f ? (measuredWidth * f) / f2 : 1.0f, f3 != 0.0f ? (f * measuredHeight) / f3 : 1.0f));
            int iRound = Math.round(f2 * fMin);
            int iRound2 = Math.round(fMin * f3);
            int iRound3 = ((measuredWidth - iRound) / 2) + Math.round(this.f1379s * iRound);
            int i5 = (measuredHeight - iRound2) / 2;
            this.f1366f.setBounds(iRound3, i5, iRound + iRound3, iRound2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float fM1394a = m1394a() + this.f1374n;
        C0890ov c0890ov = this.f1364d;
        float f = c0890ov.f46614a;
        float f2 = c0890ov.f46615b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float f3 = fM1394a + (f * 0.0f);
        if (mode != 1073741824) {
            float f4 = f3 + f3;
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f4, size) : (int) f4;
        }
        if (mode2 != 1073741824) {
            float f5 = f3 + f3;
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f5, size2) : (int) f5;
        }
        Integer num = this.f1381u;
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
        this.f1364d.m19082a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m1396c();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m1396c();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i2 != getPaddingTop() || i3 != getPaddingRight() || i4 != getPaddingBottom()) {
            this.f1364d.m19082a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.f1376p) {
            this.f1376p = z;
            C0890ov c0890ov = this.f1364d;
            c0890ov.f46616c = z ? m1395b() : m1394a();
            c0890ov.m19083b();
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.f1375o = 1.0f;
        this.f1376p = false;
        this.f1378r = 1.0f;
        this.f1379s = 0.0f;
        atd atdVar = new atd(this, 1);
        this.f1382v = atdVar;
        avb avbVar = avb.f2475a;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0866ny.f44990c);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1366f = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            Drawable drawableNewDrawable = this.f1366f.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f1366f = drawableNewDrawable;
            this.f1366f = drawableNewDrawable.mutate();
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(13);
        this.f1365e = colorStateList;
        if (colorStateList == null) {
            this.f1365e = ColorStateList.valueOf(R.color.darker_gray);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(15, 0.0f);
        this.f1367g = dimension;
        this.f1369i = typedArrayObtainStyledAttributes.getDimension(17, dimension);
        this.f1372l = typedArrayObtainStyledAttributes.getColor(11, -16777216);
        this.f1373m = Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(10, 0)];
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, 0.0f);
        this.f1374n = dimension2;
        if (dimension2 > 0.0f) {
            this.f1371k += dimension2 / 2.0f;
        }
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(14, 0.0f);
        if (dimension3 > 0.0f) {
            this.f1371k += dimension3;
        }
        this.f1378r = typedArrayObtainStyledAttributes.getFloat(20, 0.0f);
        this.f1379s = typedArrayObtainStyledAttributes.getFloat(21, 0.0f);
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f1380t = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(22, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(28)) {
            this.f1381u = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(28, 0));
        }
        float fraction = typedArrayObtainStyledAttributes.getFraction(16, 1, 1, 0.0f);
        this.f1368h = fraction;
        this.f1370j = typedArrayObtainStyledAttributes.getFraction(18, 1, 1, fraction);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(27, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f1361a = new RectF();
        Paint paint = new Paint();
        this.f1363c = paint;
        paint.setAntiAlias(true);
        this.f1364d = new C0890ov(dimension4, m1394a(), this.f1374n);
        C0896pa c0896pa = new C0896pa();
        this.f1377q = c0896pa;
        c0896pa.setCallback(atdVar);
        setWillNotDraw(false);
        m1393d();
    }
}
