package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import p021j$.util.Objects;

/* JADX INFO: renamed from: ou */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0889ou extends View {

    /* JADX INFO: renamed from: a */
    public Layout f46554a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f46555b;

    /* JADX INFO: renamed from: c */
    public CharSequence f46556c;

    /* JADX INFO: renamed from: d */
    public float f46557d;

    /* JADX INFO: renamed from: e */
    public float f46558e;

    /* JADX INFO: renamed from: f */
    public float f46559f;

    /* JADX INFO: renamed from: g */
    public float f46560g;

    /* JADX INFO: renamed from: h */
    private final TextPaint f46561h;

    /* JADX INFO: renamed from: i */
    private final float f46562i;

    /* JADX INFO: renamed from: j */
    private final float f46563j;

    /* JADX INFO: renamed from: k */
    private int f46564k;

    /* JADX INFO: renamed from: l */
    private int f46565l;

    /* JADX INFO: renamed from: m */
    private float f46566m;

    /* JADX INFO: renamed from: n */
    private int f46567n;

    /* JADX INFO: renamed from: o */
    private int f46568o;

    public C0889ou(Context context) {
        super(context, null, 0, 0);
        this.f46564k = 8388659;
        this.f46557d = 1.0f;
        this.f46558e = 0.0f;
        this.f46567n = Integer.MAX_VALUE;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.scaledDensity;
        this.f46559f = 10.0f * f2;
        this.f46560g = f2 * 60.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f46561h = textPaint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0866ny.f44988a, 0, 0);
        this.f46556c = typedArrayObtainStyledAttributes.getText(4);
        this.f46559f = typedArrayObtainStyledAttributes.getDimension(10, this.f46559f);
        this.f46560g = typedArrayObtainStyledAttributes.getDimension(9, this.f46560g);
        this.f46555b = typedArrayObtainStyledAttributes.getColorStateList(2);
        this.f46567n = typedArrayObtainStyledAttributes.getInt(5, 2);
        if (this.f46555b != null) {
            m19079e();
        }
        textPaint.setTextSize(this.f46560g);
        m19078d(typedArrayObtainStyledAttributes.getString(8), typedArrayObtainStyledAttributes.getInt(0, -1), typedArrayObtainStyledAttributes.getInt(1, -1));
        this.f46564k = typedArrayObtainStyledAttributes.getInt(3, this.f46564k);
        this.f46563j = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) this.f46563j);
        this.f46562i = typedArrayObtainStyledAttributes.getFloat(7, this.f46562i);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f46556c == null) {
            this.f46556c = "";
        }
    }

    /* JADX INFO: renamed from: f */
    private final Layout m19074f(int i, int i2, Layout.Alignment alignment) {
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.f46560g;
        this.f46566m = f;
        this.f46561h.setTextSize(f);
        int i3 = i - paddingLeft;
        StaticLayout staticLayout = new StaticLayout(this.f46556c, this.f46561h, i3, alignment, this.f46557d, this.f46558e, true);
        boolean z = staticLayout.getLineCount() > this.f46567n;
        int i4 = i2 - paddingTop;
        boolean z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > i4;
        boolean z3 = this.f46561h.getTextSize() > this.f46559f;
        if (z || z2) {
            while (true) {
                if ((!z && !z2) || !z3) {
                    break;
                }
                float f2 = this.f46566m - 1.0f;
                this.f46566m = f2;
                this.f46561h.setTextSize(f2);
                staticLayout = new StaticLayout(this.f46556c, this.f46561h, i3, alignment, this.f46557d, this.f46558e, true);
                z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > i4;
                z = staticLayout.getLineCount() > this.f46567n;
                z3 = this.f46561h.getTextSize() > this.f46559f;
            }
        }
        this.f46568o = Math.min(this.f46567n, staticLayout.getLineCount());
        return staticLayout;
    }

    /* JADX INFO: renamed from: a */
    public final void m19075a(int i) {
        if (this.f46564k != i) {
            this.f46564k = i;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19076b(int i) {
        if (this.f46567n != i) {
            this.f46567n = i;
            this.f46554a = null;
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19077c(Typeface typeface) {
        if (Objects.equals(this.f46561h.getTypeface(), typeface)) {
            return;
        }
        this.f46561h.setTypeface(typeface);
        if (this.f46554a != null) {
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19078d(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                m19077c(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        switch (i) {
            case 1:
                typefaceCreate = Typeface.SANS_SERIF;
                break;
            case 2:
                typefaceCreate = Typeface.SERIF;
                break;
            case 3:
                typefaceCreate = Typeface.MONOSPACE;
                break;
        }
        if (i2 <= 0) {
            this.f46561h.setFakeBoldText(false);
            this.f46561h.setTextSkewX(0.0f);
            m19077c(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
            m19077c(typefaceDefaultFromStyle);
            int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i2;
            this.f46561h.setFakeBoldText(1 == (style & 1));
            this.f46561h.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f46555b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        m19079e();
    }

    /* JADX INFO: renamed from: e */
    public final void m19079e() {
        int colorForState = this.f46555b.getColorForState(getDrawableState(), 0);
        if (colorForState != this.f46565l) {
            this.f46565l = colorForState;
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f46554a != null) {
            canvas.save();
            this.f46561h.setColor(this.f46565l);
            this.f46561h.drawableState = getDrawableState();
            float paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int height = getHeight() - (getPaddingTop() + getPaddingBottom());
            int lineTop = this.f46554a.getLineTop(this.f46568o);
            switch (this.f46564k & 112) {
                case 16:
                    i = (height - lineTop) / 2;
                    break;
                case 48:
                    i = 0;
                    break;
                case 80:
                    i = height - lineTop;
                    break;
                default:
                    i = 0;
                    break;
            }
            canvas.translate(paddingLeft, paddingTop + i);
            canvas.clipRect(0, 0, getWidth() - getPaddingRight(), this.f46554a.getLineTop(this.f46568o));
            this.f46554a.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout.Alignment alignment;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int iMin = mode == 1073741824 ? size : -1;
        int size2 = View.MeasureSpec.getSize(i2);
        int iMin2 = mode2 == 1073741824 ? size2 : -1;
        if (iMin == -1) {
            this.f46561h.setTextSize(this.f46560g);
            iMin = (int) Math.ceil(Layout.getDesiredWidth(this.f46556c, this.f46561h));
            this.f46561h.setTextSize(this.f46566m);
        }
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size);
        }
        switch (getTextAlignment()) {
            case 1:
                switch (this.f46564k & 8388615) {
                    case 1:
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break;
                    case 3:
                    case 8388611:
                    default:
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    case 5:
                    case 8388613:
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                }
                break;
            case 2:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
            case 3:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        if (iMin2 == -1) {
            iMin2 = mode2 == Integer.MIN_VALUE ? size2 : Integer.MAX_VALUE;
        }
        Layout layout = this.f46554a;
        if (layout == null) {
            this.f46554a = m19074f(iMin, iMin2, alignment);
        } else {
            int width = layout.getWidth();
            int height = this.f46554a.getHeight();
            if (width != iMin || height != iMin2) {
                this.f46554a = m19074f(iMin, iMin2, alignment);
            }
        }
        Layout layout2 = this.f46554a;
        if (layout2 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (mode2 != 1073741824) {
            iMin2 = layout2.getLineTop(layout2.getLineCount());
        }
        if (mode2 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, size2);
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.f46554a = null;
        requestLayout();
        invalidate();
    }
}
