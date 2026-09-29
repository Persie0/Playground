package p309p;

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

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8158b extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f44271a;

    /* JADX INFO: renamed from: c */
    public final RectF f44273c;

    /* JADX INFO: renamed from: d */
    public final Rect f44274d;

    /* JADX INFO: renamed from: e */
    public float f44275e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f44278h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f44279i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f44280j;

    /* JADX INFO: renamed from: f */
    public boolean f44276f = false;

    /* JADX INFO: renamed from: g */
    public boolean f44277g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f44281k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f44272b = new Paint(5);

    public C8158b(float f3, ColorStateList colorStateList) {
        this.f44271a = f3;
        m16183b(colorStateList);
        this.f44273c = new RectF();
        this.f44274d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m16182a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m16183b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f44278h = colorStateList;
        this.f44272b.setColor(colorStateList.getColorForState(getState(), this.f44278h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: c */
    public final void m16184c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f44273c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f44274d;
        rect2.set(rect);
        if (this.f44276f) {
            float fM16185a = C8159c.m16185a(this.f44275e, this.f44271a, this.f44277g);
            float f3 = this.f44275e;
            float f10 = this.f44271a;
            if (this.f44277g) {
                f3 = (float) (((1.0d - C8159c.f44282a) * ((double) f10)) + ((double) f3));
            }
            rect2.inset((int) Math.ceil(f3), (int) Math.ceil(fM16185a));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f44272b;
        if (this.f44279i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f44279i);
            z10 = true;
        }
        RectF rectF = this.f44273c;
        float f3 = this.f44271a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f44274d, this.f44271a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f44280j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f44278h;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                if (!super.isStateful()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m16184c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f44278h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f44272b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f44280j;
        if (colorStateList2 == null || (mode = this.f44281k) == null) {
            return z10;
        }
        this.f44279i = m16182a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f44272b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44272b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f44280j = colorStateList;
        this.f44279i = m16182a(colorStateList, this.f44281k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f44281k = mode;
        this.f44279i = m16182a(this.f44280j, mode);
        invalidateSelf();
    }
}
