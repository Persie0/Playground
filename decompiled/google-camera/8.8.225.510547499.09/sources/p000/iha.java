package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iha extends ViewGroup implements AutoCloseable {

    /* JADX INFO: renamed from: A */
    private final int f30909A;

    /* JADX INFO: renamed from: B */
    private final int f30910B;

    /* JADX INFO: renamed from: C */
    private final int f30911C;

    /* JADX INFO: renamed from: D */
    private final int f30912D;

    /* JADX INFO: renamed from: E */
    private final int f30913E;

    /* JADX INFO: renamed from: F */
    private final int f30914F;

    /* JADX INFO: renamed from: G */
    private boolean f30915G;

    /* JADX INFO: renamed from: H */
    private int f30916H;

    /* JADX INFO: renamed from: I */
    private int f30917I;

    /* JADX INFO: renamed from: a */
    public final int[] f30918a;

    /* JADX INFO: renamed from: b */
    public final Paint f30919b;

    /* JADX INFO: renamed from: c */
    public final Paint f30920c;

    /* JADX INFO: renamed from: d */
    public final List f30921d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f30922e;

    /* JADX INFO: renamed from: f */
    public PopupWindow f30923f;

    /* JADX INFO: renamed from: g */
    public boolean f30924g;

    /* JADX INFO: renamed from: h */
    public Runnable f30925h;

    /* JADX INFO: renamed from: i */
    public View f30926i;

    /* JADX INFO: renamed from: j */
    public int f30927j;

    /* JADX INFO: renamed from: k */
    public View f30928k;

    /* JADX INFO: renamed from: l */
    public Rect f30929l;

    /* JADX INFO: renamed from: m */
    public int f30930m;

    /* JADX INFO: renamed from: n */
    public int f30931n;

    /* JADX INFO: renamed from: o */
    public int f30932o;

    /* JADX INFO: renamed from: p */
    public int f30933p;

    /* JADX INFO: renamed from: q */
    public final Object f30934q;

    /* JADX INFO: renamed from: r */
    public long f30935r;

    /* JADX INFO: renamed from: s */
    public long f30936s;

    /* JADX INFO: renamed from: t */
    public long f30937t;

    /* JADX INFO: renamed from: u */
    public List f30938u;

    /* JADX INFO: renamed from: v */
    public final List f30939v;

    /* JADX INFO: renamed from: w */
    public final DisplayManager.DisplayListener f30940w;

    /* JADX INFO: renamed from: x */
    private final Path f30941x;

    /* JADX INFO: renamed from: y */
    private final RectF f30942y;

    /* JADX INFO: renamed from: z */
    private final int f30943z;

    public iha(Context context) {
        super(context);
        this.f30921d = Collections.synchronizedList(new ArrayList());
        this.f30922e = new AtomicInteger(Integer.MIN_VALUE);
        this.f30934q = new Object();
        this.f30939v = new ArrayList();
        this.f30940w = new fnq(this, 2);
        this.f30918a = new int[2];
        this.f30941x = new Path();
        this.f30942y = new RectF();
        Paint paint = new Paint();
        this.f30919b = paint;
        Paint paint2 = new Paint();
        this.f30920c = paint2;
        this.f30909A = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_horizontal_container_padding);
        this.f30943z = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_vertical_container_padding);
        context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_vertical_animation_movement);
        this.f30910B = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_vertical_animation_padding);
        this.f30933p = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_shadow_offset);
        this.f30911C = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_shadow_radius);
        this.f30912D = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_arrow_length);
        this.f30913E = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_arrow_base_width);
        this.f30914F = context.getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_container_corner_radius);
        int iM15024q = kxk.m15024q(this, C0100R.attr.colorTertiaryContainer);
        int iM159a = abu.m159a(context, C0100R.color.tooltip_container_shadow);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM15024q);
        paint.setAntiAlias(true);
        float f = dimensionPixelSize;
        paint.setShadowLayer(dimensionPixelSize2, f, f, iM159a);
        paint2.set(paint);
        paint2.setPathEffect(new CornerPathEffect(getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_arrow_radius)));
        this.f30924g = true;
        this.f30935r = 0L;
    }

    /* JADX INFO: renamed from: c */
    private static int m11317c(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    /* JADX INFO: renamed from: d */
    private final Point m11318d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* JADX INFO: renamed from: e */
    private final void m11319e(Canvas canvas) {
        getLocationOnScreen(this.f30918a);
        canvas.save();
        int i = this.f30927j;
        if (igq.m11294s(i)) {
            canvas.translate(this.f30933p - this.f30918a[0], 0.0f);
        } else if (i == 5 || i == 6) {
            canvas.translate(0.0f, this.f30933p - this.f30918a[1]);
        }
        canvas.drawPath(this.f30941x, this.f30920c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: a */
    public final int m11320a() {
        View view = this.f30928k;
        if (view == null || view.getDisplay() == null) {
            return this.f30922e.get();
        }
        return this.f30922e.getAndSet(ilk.m11426b(this.f30928k.getDisplay(), this.f30928k.getContext()).f31449e);
    }

    /* JADX INFO: renamed from: b */
    public final void m11321b(boolean z) {
        if (!z) {
            setVisibility(4);
        }
        clearAnimation();
        PopupWindow popupWindow = this.f30923f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            setVisibility(4);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m11321b(false);
        setOnClickListener(null);
        removeAllViews();
        this.f30921d.clear();
        PopupWindow popupWindow = this.f30923f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f30923f = null;
        this.f30926i = null;
        this.f30928k = null;
        setVisibility(8);
        Iterator it = this.f30939v.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f30939v.clear();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        canvas.save();
        int i = this.f30927j;
        if (i == 2 || i == 6) {
            m11319e(canvas);
        }
        RectF rectF = this.f30942y;
        float f = this.f30914F;
        canvas.drawRoundRect(rectF, f, f, this.f30919b);
        int i2 = this.f30927j;
        if (i2 == 1 || i2 == 5) {
            m11319e(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iHeight;
        int iWidth;
        int iHeight2;
        int i6;
        int iM11317c;
        int iM11317c2;
        int iWidth2;
        int iHeight3;
        View view = this.f30926i;
        if (view != null) {
            int i7 = this.f30909A;
            int i8 = this.f30927j;
            int i9 = (i8 == 6 ? this.f30912D : 0) + i7;
            int i10 = this.f30943z;
            view.layout(i9, (i8 == 2 ? this.f30912D : 0) + i10, ((i3 - i) - i7) - (i8 == 5 ? this.f30912D : 0), ((i4 - i2) - i10) - (i8 == 1 ? this.f30912D : 0));
        }
        Point pointM11318d = m11318d();
        int i11 = pointM11318d.x;
        int i12 = pointM11318d.y;
        switch (this.f30927j) {
            case 1:
                int i13 = this.f30933p;
                i5 = i11 - (i13 + i13);
                iHeight = this.f30929l.top - this.f30933p;
                break;
            case 2:
                int i14 = this.f30933p;
                i5 = i11 - (i14 + i14);
                iHeight = ((i12 - this.f30929l.top) - this.f30929l.height()) - this.f30933p;
                break;
            case 3:
            case 4:
            default:
                throw new IllegalStateException();
            case 5:
                int i15 = this.f30929l.left;
                int i16 = this.f30933p;
                i5 = i15 - i16;
                iHeight = i12 - (i16 + i16);
                break;
            case 6:
                int iWidth3 = (i11 - this.f30929l.left) - this.f30929l.width();
                int i17 = this.f30933p;
                i5 = iWidth3 - i17;
                iHeight = i12 - (i17 + i17);
                break;
        }
        measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iHeight, Integer.MIN_VALUE));
        int iWidth4 = this.f30929l.left;
        int i18 = this.f30929l.top;
        PopupWindow popupWindow = this.f30923f;
        if (popupWindow == null) {
            iM11317c2 = 0;
            iM11317c = 0;
        } else {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i19 = this.f30927j;
            if (i19 == 1) {
                iHeight2 = ((-measuredHeight) - this.f30932o) - this.f30910B;
                iWidth = 0;
            } else if (i19 == 2) {
                iHeight2 = this.f30929l.height() + this.f30932o + this.f30910B;
                iWidth = 0;
            } else if (i19 == 5) {
                iWidth = (-measuredWidth) - this.f30931n;
                iHeight2 = (this.f30929l.height() - measuredHeight) / 2;
            } else if (i19 == 6) {
                iWidth = this.f30929l.width() + this.f30931n;
                iHeight2 = (this.f30929l.height() - measuredHeight) / 2;
            } else {
                iWidth = 0;
                iHeight2 = 0;
            }
            int iM442c = afc.m442c(this);
            if (igq.m11294s(this.f30927j)) {
                i6 = i18 + iHeight2;
                switch (this.f30930m) {
                    case 1:
                        if (iM442c == 1) {
                            iWidth4 = (iWidth4 + this.f30929l.width()) - measuredWidth;
                        }
                        break;
                    case 2:
                        iWidth4 += (this.f30929l.width() - measuredWidth) / 2;
                        break;
                    case 3:
                        if (iM442c != 1) {
                            iWidth4 = (iWidth4 + this.f30929l.width()) - measuredWidth;
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
            } else {
                iWidth4 += iWidth;
                i6 = i18 + iHeight2;
            }
            int i20 = this.f30933p;
            iM11317c = m11317c(iWidth4, i20, (i11 - i20) - measuredWidth);
            int i21 = this.f30933p;
            iM11317c2 = m11317c(i6, i21, (i12 - i21) - measuredHeight);
            popupWindow.update(iM11317c, iM11317c2, measuredWidth, measuredHeight, true);
        }
        switch (this.f30930m) {
            case 1:
                int i22 = this.f30913E / 2;
                int i23 = this.f30933p;
                iWidth2 = i22 + i23 + i23;
                iHeight3 = 0;
                break;
            case 2:
                iWidth2 = this.f30929l.width() / 2;
                iHeight3 = this.f30929l.height() / 2;
                break;
            case 3:
                int iWidth5 = this.f30929l.width() - (this.f30913E / 2);
                int i24 = this.f30933p;
                iWidth2 = iWidth5 - (i24 + i24);
                iHeight3 = 0;
                break;
            default:
                iWidth2 = 0;
                iHeight3 = 0;
                break;
        }
        if (afc.m442c(this) == 1) {
            iWidth2 = this.f30929l.width() - iWidth2;
        }
        int i25 = iWidth2 + this.f30929l.left;
        int i26 = iHeight3 + this.f30929l.top;
        if (ill.m11433d(this)) {
            int[] iArrM11435f = ill.m11435f(getRootView());
            int i27 = this.f30916H + iM11317c;
            int i28 = iArrM11435f[0];
            if (i27 != i28) {
                int i29 = this.f30917I + iM11317c2;
                int i30 = iArrM11435f[1];
                if (i29 != i30) {
                    this.f30916H = i28;
                    this.f30917I = i30;
                }
            }
        }
        int i31 = i25 + this.f30916H;
        int i32 = i26 + this.f30917I;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.ui_tooltip_left_right_shift);
        this.f30941x.reset();
        int i33 = this.f30927j;
        if (i33 == 1) {
            this.f30941x.moveTo((i31 - this.f30933p) - (this.f30913E / 2), this.f30942y.bottom);
            this.f30941x.rLineTo(this.f30913E, 0.0f);
            this.f30941x.rLineTo((-this.f30913E) / 2, this.f30912D);
            this.f30941x.rLineTo((-this.f30913E) / 2, -this.f30912D);
            this.f30941x.close();
            return;
        }
        if (i33 == 2) {
            this.f30941x.moveTo((i31 - this.f30933p) + (this.f30913E / 2), this.f30942y.top);
            this.f30941x.rLineTo(-this.f30913E, 0.0f);
            this.f30941x.rLineTo(this.f30913E / 2, -this.f30912D);
            this.f30941x.rLineTo(this.f30913E / 2, this.f30912D);
            this.f30941x.close();
            return;
        }
        if (i33 == 5) {
            this.f30941x.moveTo(this.f30942y.right - dimensionPixelSize, (i32 - this.f30933p) - (this.f30913E / 2));
            this.f30941x.rLineTo(0.0f, this.f30913E);
            this.f30941x.rLineTo(this.f30912D, (-this.f30913E) / 2);
            this.f30941x.rLineTo(-this.f30912D, (-this.f30913E) / 2);
            this.f30941x.close();
            return;
        }
        if (i33 == 6) {
            this.f30941x.moveTo(this.f30942y.left + dimensionPixelSize, (i32 - this.f30933p) + (this.f30913E / 2));
            this.f30941x.rLineTo(0.0f, -this.f30913E);
            this.f30941x.rLineTo(-this.f30912D, this.f30913E / 2);
            this.f30941x.rLineTo(this.f30912D, this.f30913E / 2);
            this.f30941x.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (!this.f30915G && (i3 = this.f30927j) != 0) {
            this.f30927j = igq.m11293r(i3, this);
            this.f30915G = true;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f30909A;
        int i5 = size - (i4 + i4);
        int i6 = this.f30911C;
        int i7 = i5 - i6;
        int i8 = this.f30943z;
        int i9 = (size2 - (i8 + i8)) - i6;
        int i10 = this.f30927j;
        if (igq.m11294s(i10)) {
            i9 -= this.f30912D;
        } else if (i10 == 5 || i10 == 6) {
            i7 -= this.f30912D;
        }
        int iMin = Math.min(m11318d().x, i7);
        View view = this.f30926i;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i9, 0));
            if (this.f30926i.getMeasuredHeight() > i9) {
                this.f30926i.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE));
            }
        }
        View view2 = this.f30926i;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int i11 = this.f30909A;
            int i12 = measuredWidth + i11 + i11;
            int measuredHeight = this.f30926i.getMeasuredHeight();
            int i13 = this.f30943z;
            int i14 = measuredHeight + i13 + i13;
            RectF rectF = this.f30942y;
            int i15 = this.f30927j;
            rectF.set(i15 == 6 ? this.f30912D : 0.0f, i15 == 2 ? this.f30912D : 0.0f, i12 + (i15 == 6 ? this.f30912D : 0), i14 + (i15 == 2 ? this.f30912D : 0));
        }
        int iWidth = ((int) this.f30942y.width()) + this.f30911C;
        int iHeight = ((int) this.f30942y.height()) + this.f30911C;
        int i16 = this.f30927j;
        if (igq.m11294s(i16)) {
            iHeight += this.f30912D;
        } else if (i16 == 5 || i16 == 6) {
            iWidth += this.f30912D;
        }
        setMeasuredDimension(iWidth, iHeight);
    }
}
