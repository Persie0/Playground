package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0866ny;
import p000.C0898pc;
import p000.aua;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PageIndicatorView extends View implements aua {

    /* JADX INFO: renamed from: a */
    public int f1383a;

    /* JADX INFO: renamed from: b */
    public int f1384b;

    /* JADX INFO: renamed from: c */
    public boolean f1385c;

    /* JADX INFO: renamed from: d */
    private int f1386d;

    /* JADX INFO: renamed from: e */
    private float f1387e;

    /* JADX INFO: renamed from: f */
    private float f1388f;

    /* JADX INFO: renamed from: g */
    private int f1389g;

    /* JADX INFO: renamed from: h */
    private int f1390h;

    /* JADX INFO: renamed from: i */
    private boolean f1391i;

    /* JADX INFO: renamed from: j */
    private int f1392j;

    /* JADX INFO: renamed from: k */
    private float f1393k;

    /* JADX INFO: renamed from: l */
    private float f1394l;

    /* JADX INFO: renamed from: m */
    private float f1395m;

    /* JADX INFO: renamed from: n */
    private int f1396n;

    /* JADX INFO: renamed from: o */
    private int f1397o;

    /* JADX INFO: renamed from: p */
    private int f1398p;

    /* JADX INFO: renamed from: q */
    private int f1399q;

    /* JADX INFO: renamed from: r */
    private final Paint f1400r;

    /* JADX INFO: renamed from: s */
    private final Paint f1401s;

    /* JADX INFO: renamed from: t */
    private final Paint f1402t;

    /* JADX INFO: renamed from: u */
    private final Paint f1403u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m1397c(long j) {
        this.f1385c = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration(this.f1384b).start();
    }

    /* JADX INFO: renamed from: d */
    private static final void m1398d(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: b */
    public final void mo1400b(int i, float f) {
        if (this.f1391i && this.f1399q == 1) {
            if (f == 0.0f) {
                if (this.f1385c) {
                    m1397c(0L);
                }
            } else {
                if (this.f1385c) {
                    return;
                }
                this.f1385c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.f1392j).start();
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1397o > 1) {
            float paddingLeft = getPaddingLeft();
            float f = this.f1386d;
            float height = getHeight();
            canvas.save();
            canvas.translate(paddingLeft + (f / 2.0f), height / 2.0f);
            for (int i = 0; i < this.f1397o; i++) {
                if (i == this.f1398p) {
                    canvas.drawCircle(this.f1393k, this.f1394l, this.f1388f + this.f1395m, this.f1403u);
                    canvas.drawCircle(0.0f, 0.0f, this.f1388f, this.f1402t);
                } else {
                    canvas.drawCircle(this.f1393k, this.f1394l, this.f1387e + this.f1395m, this.f1401s);
                    canvas.drawCircle(0.0f, 0.0f, this.f1387e, this.f1400r);
                }
                canvas.translate(this.f1386d, 0.0f);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : (this.f1397o * this.f1386d) + getPaddingLeft() + getPaddingRight();
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iCeil = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.f1387e;
            float f2 = this.f1395m;
            float fMax = Math.max(f + f2, this.f1388f + f2);
            iCeil = ((int) (((int) Math.ceil(fMax + fMax)) + this.f1394l)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(resolveSizeAndState(size, i, 0), resolveSizeAndState(iCeil, i2, 0));
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0866ny.f44993f, i, C0100R.style.PageIndicatorViewStyle);
        this.f1386d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.f1387e = typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
        this.f1388f = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.f1389g = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.f1390h = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.f1383a = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f1384b = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f1392j = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1391i = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f1393k = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        this.f1394l = typedArrayObtainStyledAttributes.getDimension(10, 0.0f);
        this.f1395m = typedArrayObtainStyledAttributes.getDimension(11, 0.0f);
        this.f1396n = typedArrayObtainStyledAttributes.getColor(8, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f1400r = paint;
        paint.setColor(this.f1389g);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f1402t = paint2;
        paint2.setColor(this.f1390h);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f1401s = paint3;
        Paint paint4 = new Paint(1);
        this.f1403u = paint4;
        this.f1399q = 0;
        if (isInEditMode()) {
            this.f1397o = 5;
            this.f1398p = 2;
            this.f1391i = false;
        }
        if (this.f1391i) {
            this.f1385c = false;
            animate().alpha(0.0f).setStartDelay(2000L).setDuration(this.f1384b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        m1398d(paint, paint3, this.f1387e, this.f1395m, this.f1389g, this.f1396n);
        m1398d(paint2, paint4, this.f1388f, this.f1395m, this.f1390h, this.f1396n);
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: a */
    public final void mo1399a(int i) {
        if (this.f1399q != i) {
            this.f1399q = i;
            if (this.f1391i && i == 0) {
                if (this.f1385c) {
                    m1397c(this.f1383a);
                    return;
                }
                this.f1385c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.f1392j).setListener(new C0898pc(this)).start();
            }
        }
    }
}
