package androidx.wear.widget.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aua;
import p000.auv;
import p000.avn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PageIndicatorView extends View implements aua {

    /* JADX INFO: renamed from: a */
    public int f1766a;

    /* JADX INFO: renamed from: b */
    public int f1767b;

    /* JADX INFO: renamed from: c */
    public boolean f1768c;

    /* JADX INFO: renamed from: d */
    private final Paint f1769d;

    /* JADX INFO: renamed from: e */
    private final Paint f1770e;

    /* JADX INFO: renamed from: f */
    private final Paint f1771f;

    /* JADX INFO: renamed from: g */
    private final Paint f1772g;

    /* JADX INFO: renamed from: h */
    private int f1773h;

    /* JADX INFO: renamed from: i */
    private float f1774i;

    /* JADX INFO: renamed from: j */
    private float f1775j;

    /* JADX INFO: renamed from: k */
    private int f1776k;

    /* JADX INFO: renamed from: l */
    private int f1777l;

    /* JADX INFO: renamed from: m */
    private boolean f1778m;

    /* JADX INFO: renamed from: n */
    private int f1779n;

    /* JADX INFO: renamed from: o */
    private float f1780o;

    /* JADX INFO: renamed from: p */
    private float f1781p;

    /* JADX INFO: renamed from: q */
    private float f1782q;

    /* JADX INFO: renamed from: r */
    private int f1783r;

    /* JADX INFO: renamed from: s */
    private int f1784s;

    /* JADX INFO: renamed from: t */
    private int f1785t;

    /* JADX INFO: renamed from: u */
    private int f1786u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m1692c(long j) {
        this.f1768c = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration(this.f1767b).start();
    }

    /* JADX INFO: renamed from: d */
    private static final void m1693d(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: b */
    public final void mo1400b(int i, float f) {
        if (this.f1778m && this.f1786u == 1) {
            if (f == 0.0f) {
                if (this.f1768c) {
                    m1692c(0L);
                }
            } else {
                if (this.f1768c) {
                    return;
                }
                this.f1768c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.f1779n).start();
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1784s > 1) {
            float paddingLeft = getPaddingLeft();
            float f = this.f1773h;
            float height = getHeight();
            canvas.save();
            canvas.translate(paddingLeft + (f / 2.0f), height / 2.0f);
            for (int i = 0; i < this.f1784s; i++) {
                if (i == this.f1785t) {
                    canvas.drawCircle(this.f1780o, this.f1781p, this.f1775j + this.f1782q, this.f1772g);
                    canvas.drawCircle(0.0f, 0.0f, this.f1775j, this.f1771f);
                } else {
                    canvas.drawCircle(this.f1780o, this.f1781p, this.f1774i + this.f1782q, this.f1770e);
                    canvas.drawCircle(0.0f, 0.0f, this.f1774i, this.f1769d);
                }
                canvas.translate(this.f1773h, 0.0f);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : (this.f1784s * this.f1773h) + getPaddingLeft() + getPaddingRight();
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iCeil = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.f1774i;
            float f2 = this.f1782q;
            float fMax = Math.max(f + f2, this.f1775j + f2);
            iCeil = ((int) (((int) Math.ceil(fMax + fMax)) + this.f1781p)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(resolveSizeAndState(size, i, 0), resolveSizeAndState(iCeil, i2, 0));
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, auv.f2446f, i, C0100R.style.WsPageIndicatorViewStyle);
        this.f1773h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(25, 0);
        this.f1774i = typedArrayObtainStyledAttributes.getDimension(19, 0.0f);
        this.f1775j = typedArrayObtainStyledAttributes.getDimension(20, 0.0f);
        this.f1776k = typedArrayObtainStyledAttributes.getColor(13, 0);
        this.f1777l = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f1766a = typedArrayObtainStyledAttributes.getInt(16, 0);
        this.f1767b = typedArrayObtainStyledAttributes.getInt(17, 0);
        this.f1779n = typedArrayObtainStyledAttributes.getInt(15, 0);
        this.f1778m = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f1780o = typedArrayObtainStyledAttributes.getDimension(22, 0.0f);
        this.f1781p = typedArrayObtainStyledAttributes.getDimension(23, 0.0f);
        this.f1782q = typedArrayObtainStyledAttributes.getDimension(24, 0.0f);
        this.f1783r = typedArrayObtainStyledAttributes.getColor(21, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f1769d = paint;
        paint.setColor(this.f1776k);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f1771f = paint2;
        paint2.setColor(this.f1777l);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f1770e = paint3;
        Paint paint4 = new Paint(1);
        this.f1772g = paint4;
        this.f1786u = 0;
        if (isInEditMode()) {
            this.f1784s = 5;
            this.f1785t = 2;
            this.f1778m = false;
        }
        if (this.f1778m) {
            this.f1768c = false;
            animate().alpha(0.0f).setStartDelay(2000L).setDuration(this.f1767b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        m1693d(paint, paint3, this.f1774i, this.f1782q, this.f1776k, this.f1783r);
        m1693d(paint2, paint4, this.f1775j, this.f1782q, this.f1777l, this.f1783r);
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: a */
    public final void mo1399a(int i) {
        if (this.f1786u != i) {
            this.f1786u = i;
            if (this.f1778m && i == 0) {
                if (this.f1768c) {
                    m1692c(this.f1766a);
                    return;
                }
                this.f1768c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.f1779n).setListener(new avn(this)).start();
            }
        }
    }
}
