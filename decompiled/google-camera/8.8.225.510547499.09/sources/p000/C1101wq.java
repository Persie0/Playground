package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: wq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1101wq extends Drawable {

    /* JADX INFO: renamed from: a */
    public final float f47953a;

    /* JADX INFO: renamed from: b */
    public float f47954b;

    /* JADX INFO: renamed from: e */
    private final Paint f47957e;

    /* JADX INFO: renamed from: f */
    private final RectF f47958f;

    /* JADX INFO: renamed from: g */
    private final Rect f47959g;

    /* JADX INFO: renamed from: h */
    private final ColorStateList f47960h;

    /* JADX INFO: renamed from: i */
    private PorterDuffColorFilter f47961i;

    /* JADX INFO: renamed from: j */
    private ColorStateList f47962j;

    /* JADX INFO: renamed from: c */
    public boolean f47955c = false;

    /* JADX INFO: renamed from: d */
    public boolean f47956d = true;

    /* JADX INFO: renamed from: k */
    private PorterDuff.Mode f47963k = PorterDuff.Mode.SRC_IN;

    public C1101wq(ColorStateList colorStateList, float f) {
        this.f47953a = f;
        Paint paint = new Paint(5);
        this.f47957e = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f47960h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), colorStateList.getDefaultColor()));
        this.f47958f = new RectF();
        this.f47959g = new Rect();
    }

    /* JADX INFO: renamed from: b */
    private final PorterDuffColorFilter m19529b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: a */
    public final void m19530a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f47958f.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f47959g.set(rect);
        if (this.f47955c) {
            this.f47959g.inset((int) Math.ceil(C1102wr.m19531a(this.f47954b, this.f47953a, this.f47956d)), (int) Math.ceil(C1102wr.m19532b(this.f47954b, this.f47953a, this.f47956d)));
            this.f47958f.set(this.f47959g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f47957e;
        boolean z = false;
        if (this.f47961i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f47961i);
            z = true;
        }
        RectF rectF = this.f47958f;
        float f = this.f47953a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f47959g, this.f47953a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f47962j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f47960h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m19530a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f47960h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f47957e.getColor();
        if (z) {
            this.f47957e.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f47962j;
        if (colorStateList2 == null || (mode = this.f47963k) == null) {
            return z;
        }
        this.f47961i = m19529b(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f47957e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47957e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f47962j = colorStateList;
        this.f47961i = m19529b(colorStateList, this.f47963k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f47963k = mode;
        this.f47961i = m19529b(this.f47962j, mode);
        invalidateSelf();
    }
}
