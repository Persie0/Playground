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

/* JADX INFO: loaded from: classes2.dex */
public final class ni8 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f52763a;

    /* JADX INFO: renamed from: b */
    public final Paint f52764b;

    /* JADX INFO: renamed from: c */
    public final RectF f52765c;

    /* JADX INFO: renamed from: d */
    public final Rect f52766d;

    /* JADX INFO: renamed from: e */
    public float f52767e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f52770h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f52771i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f52772j;

    /* JADX INFO: renamed from: f */
    public boolean f52768f = false;

    /* JADX INFO: renamed from: g */
    public boolean f52769g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f52773k = PorterDuff.Mode.SRC_IN;

    public ni8(ColorStateList colorStateList, float f) {
        this.f52763a = f;
        Paint paint = new Paint(5);
        this.f52764b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f52770h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f52770h.getDefaultColor()));
        this.f52765c = new RectF();
        this.f52766d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m17442a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m17443b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f52765c;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f52766d;
        rect2.set(rect);
        if (this.f52768f) {
            rect2.inset((int) Math.ceil(oi8.m18033a(this.f52767e, this.f52763a, this.f52769g)), (int) Math.ceil(oi8.m18034b(this.f52767e, this.f52763a, this.f52769g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f52771i;
        Paint paint = this.f52764b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f52771i);
            z = true;
        }
        RectF rectF = this.f52765c;
        float f = this.f52763a;
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
        outline.setRoundRect(this.f52766d, this.f52763a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f52772j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f52770h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m17443b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f52770h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f52764b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f52772j;
        if (colorStateList2 == null || (mode = this.f52773k) == null) {
            return z;
        }
        this.f52771i = m17442a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f52764b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52764b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f52772j = colorStateList;
        this.f52771i = m17442a(colorStateList, this.f52773k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f52773k = mode;
        this.f52771i = m17442a(this.f52772j, mode);
        invalidateSelf();
    }
}
