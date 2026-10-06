package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avh extends Drawable {

    /* JADX INFO: renamed from: b */
    private static final Property f2515b = new avg(Integer.class);

    /* JADX INFO: renamed from: c */
    private static final TimeInterpolator f2516c = auz.f2458a;

    /* JADX INFO: renamed from: a */
    public final ObjectAnimator f2517a;

    /* JADX INFO: renamed from: d */
    private final RectF f2518d = new RectF();

    /* JADX INFO: renamed from: e */
    private final Paint f2519e;

    public avh() {
        Paint paint = new Paint();
        this.f2519e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<avh, Integer>) f2515b, 0, 10000);
        this.f2517a = objectAnimatorOfInt;
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setRepeatMode(1);
        objectAnimatorOfInt.setDuration(6000L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: renamed from: a */
    private static float m2054a(float f, float f2, float f3) {
        if (f != f2) {
            return (f3 - f) / (f2 - f);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        this.f2518d.set(getBounds());
        this.f2518d.inset(0.0f, 0.0f);
        this.f2519e.setStrokeWidth(0.0f);
        this.f2519e.setColor(0);
        int level = getLevel();
        float f = (level - ((level / 2000) * 2000)) / 2000.0f;
        boolean z = f < 0.5f;
        float fMax = Math.max(1.0f, z ? f2516c.getInterpolation(m2054a(0.0f, 0.5f, f)) * 306.0f : (1.0f - f2516c.getInterpolation(m2054a(0.5f, 1.0f, f))) * 306.0f);
        float f2 = level * 1.0E-4f;
        canvas.rotate((((f2 + f2) * 360.0f) - 90.0f) + (f * 54.0f), this.f2518d.centerX(), this.f2518d.centerY());
        canvas.drawArc(this.f2518d, z ? 0.0f : 306.0f - fMax, fMax, false, this.f2519e);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
