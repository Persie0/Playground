package com.google.android.clockwork.common.wearable.wearmaterial.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class SliderProgressDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f7528a;

    /* JADX INFO: renamed from: b */
    public final Paint f7529b;

    /* JADX INFO: renamed from: c */
    public final Paint f7530c;

    /* JADX INFO: renamed from: d */
    public float f7531d;

    /* JADX INFO: renamed from: e */
    private final RectF f7532e;

    /* JADX INFO: renamed from: f */
    private float f7533f;

    public SliderProgressDrawable() {
        Paint paint = new Paint();
        this.f7528a = paint;
        this.f7532e = new RectF();
        Paint paint2 = new Paint();
        this.f7529b = paint2;
        Paint paint3 = new Paint();
        this.f7530c = paint3;
        paint2.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint3.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        if (fWidth == 0.0f || fHeight == 0.0f) {
            canvas.restore();
            return;
        }
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, fWidth / 2.0f, fHeight / 2.0f);
        }
        canvas.drawPaint(this.f7530c);
        this.f7532e.right = this.f7533f * fWidth;
        this.f7532e.bottom = fHeight;
        canvas.drawRect(this.f7532e, this.f7528a);
        float f = this.f7531d;
        if (f > 0.0f) {
            float f2 = fWidth / f;
            float f3 = f2;
            for (int i = 0; i < this.f7531d; i++) {
                canvas.drawLine(f3, 0.0f, f3, fHeight, this.f7529b);
                f3 += f2;
            }
        }
        canvas.restore();
    }

    public float getFillAmount() {
        return this.f7533f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void setFillAmount(float f) {
        this.f7533f = Math.max(0.0f, Math.min(1.0f, f));
        invalidateSelf();
    }
}
