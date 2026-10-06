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

/* JADX INFO: renamed from: pa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0896pa extends Drawable {

    /* JADX INFO: renamed from: b */
    private static final Property f47139b = new C0894oz(Integer.class);

    /* JADX INFO: renamed from: c */
    private static final TimeInterpolator f47140c = C0893oy.f46801a;

    /* JADX INFO: renamed from: a */
    public final ObjectAnimator f47141a;

    /* JADX INFO: renamed from: d */
    private final RectF f47142d = new RectF();

    /* JADX INFO: renamed from: e */
    private final Paint f47143e;

    public C0896pa() {
        Paint paint = new Paint();
        this.f47143e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<C0896pa, Integer>) f47139b, 0, 10000);
        this.f47141a = objectAnimatorOfInt;
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setRepeatMode(1);
        objectAnimatorOfInt.setDuration(6000L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: renamed from: a */
    private static float m19256a(float f, float f2, float f3) {
        if (f != f2) {
            return (f3 - f) / (f2 - f);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        this.f47142d.set(getBounds());
        this.f47142d.inset(0.0f, 0.0f);
        this.f47143e.setStrokeWidth(0.0f);
        this.f47143e.setColor(0);
        int level = getLevel();
        float f = (level - ((level / 2000) * 2000)) / 2000.0f;
        boolean z = f < 0.5f;
        float fMax = Math.max(1.0f, z ? f47140c.getInterpolation(m19256a(0.0f, 0.5f, f)) * 306.0f : (1.0f - f47140c.getInterpolation(m19256a(0.5f, 1.0f, f))) * 306.0f);
        float f2 = level * 1.0E-4f;
        canvas.rotate((((f2 + f2) * 360.0f) - 90.0f) + (f * 54.0f), this.f47142d.centerX(), this.f47142d.centerY());
        canvas.drawArc(this.f47142d, z ? 0.0f : 306.0f - fMax, fMax, false, this.f47143e);
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
