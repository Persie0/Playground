package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhy extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f40555a;

    /* JADX INFO: renamed from: b */
    public float f40556b;

    /* JADX INFO: renamed from: c */
    public int f40557c;

    /* JADX INFO: renamed from: d */
    public int f40558d;

    /* JADX INFO: renamed from: e */
    public int f40559e;

    /* JADX INFO: renamed from: f */
    public int f40560f;

    /* JADX INFO: renamed from: h */
    public mlc f40562h;

    /* JADX INFO: renamed from: o */
    private int f40569o;

    /* JADX INFO: renamed from: p */
    private ColorStateList f40570p;

    /* JADX INFO: renamed from: i */
    private final mle f40563i = mld.f40957a;

    /* JADX INFO: renamed from: j */
    private final Path f40564j = new Path();

    /* JADX INFO: renamed from: k */
    private final Rect f40565k = new Rect();

    /* JADX INFO: renamed from: l */
    private final RectF f40566l = new RectF();

    /* JADX INFO: renamed from: m */
    private final RectF f40567m = new RectF();

    /* JADX INFO: renamed from: n */
    private final mhx f40568n = new mhx(this);

    /* JADX INFO: renamed from: g */
    public boolean f40561g = true;

    public mhy(mlc mlcVar) {
        this.f40562h = mlcVar;
        Paint paint = new Paint(1);
        this.f40555a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    protected final RectF m16396a() {
        this.f40567m.set(getBounds());
        return this.f40567m;
    }

    /* JADX INFO: renamed from: b */
    public final void m16397b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f40569o = colorStateList.getColorForState(getState(), this.f40569o);
        }
        this.f40570p = colorStateList;
        this.f40561g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f40561g) {
            Paint paint = this.f40555a;
            Rect rect = this.f40565k;
            copyBounds(rect);
            float fHeight = this.f40556b / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{acp.m211c(this.f40557c, this.f40569o), acp.m211c(this.f40558d, this.f40569o), acp.m211c(acp.m212d(this.f40558d, 0), this.f40569o), acp.m211c(acp.m212d(this.f40560f, 0), this.f40569o), acp.m211c(this.f40560f, this.f40569o), acp.m211c(this.f40559e, this.f40569o)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f40561g = false;
        }
        float strokeWidth = this.f40555a.getStrokeWidth() / 2.0f;
        copyBounds(this.f40565k);
        this.f40566l.set(this.f40565k);
        float fMin = Math.min(this.f40562h.f40945b.mo16491a(m16396a()), this.f40566l.width() / 2.0f);
        if (this.f40562h.m16595e(m16396a())) {
            this.f40566l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f40566l, fMin, fMin, this.f40555a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f40568n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f40556b > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f40562h.m16595e(m16396a())) {
            outline.setRoundRect(getBounds(), this.f40562h.f40945b.mo16491a(m16396a()));
        } else {
            copyBounds(this.f40565k);
            this.f40566l.set(this.f40565k);
            this.f40563i.m16598a(this.f40562h, 1.0f, this.f40566l, this.f40564j);
            outline.setPath(this.f40564j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.f40562h.m16595e(m16396a())) {
            return true;
        }
        int iRound = Math.round(this.f40556b);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f40570p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f40561g = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f40570p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f40569o)) != this.f40569o) {
            this.f40561g = true;
            this.f40569o = colorForState;
        }
        if (this.f40561g) {
            invalidateSelf();
        }
        return this.f40561g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40555a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40555a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
