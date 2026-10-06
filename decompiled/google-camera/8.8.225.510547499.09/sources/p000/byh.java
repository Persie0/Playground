package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byh extends Drawable implements Animatable, bym {

    /* JADX INFO: renamed from: a */
    public final byg f4744a;

    /* JADX INFO: renamed from: b */
    public boolean f4745b;

    /* JADX INFO: renamed from: c */
    private boolean f4746c;

    /* JADX INFO: renamed from: d */
    private boolean f4747d;

    /* JADX INFO: renamed from: f */
    private int f4749f;

    /* JADX INFO: renamed from: h */
    private boolean f4751h;

    /* JADX INFO: renamed from: i */
    private Paint f4752i;

    /* JADX INFO: renamed from: j */
    private Rect f4753j;

    /* JADX INFO: renamed from: e */
    private boolean f4748e = true;

    /* JADX INFO: renamed from: g */
    private final int f4750g = -1;

    public byh(byg bygVar) {
        bzq.m3278r(bygVar);
        this.f4744a = bygVar;
    }

    /* JADX INFO: renamed from: d */
    private final Paint m3184d() {
        if (this.f4752i == null) {
            this.f4752i = new Paint(2);
        }
        return this.f4752i;
    }

    /* JADX INFO: renamed from: e */
    private final Rect m3185e() {
        if (this.f4753j == null) {
            this.f4753j = new Rect();
        }
        return this.f4753j;
    }

    /* JADX INFO: renamed from: f */
    private final void m3186f() {
        bzq.m3274n(!this.f4745b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4744a.f4743a.m3193a() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f4746c) {
            return;
        }
        this.f4746c = true;
        byn bynVar = this.f4744a.f4743a;
        if (bynVar.f4764f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (bynVar.f4760b.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = bynVar.f4760b.isEmpty();
        bynVar.f4760b.add(this);
        if (zIsEmpty && !bynVar.f4762d) {
            bynVar.f4762d = true;
            bynVar.f4764f = false;
            bynVar.m3194b();
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    private final void m3187g() {
        this.f4746c = false;
        byn bynVar = this.f4744a.f4743a;
        bynVar.f4760b.remove(this);
        if (bynVar.f4760b.isEmpty()) {
            bynVar.m3198f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m3188a() {
        return this.f4744a.f4743a.f4766h;
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m3189b() {
        return ((bqd) this.f4744a.f4743a.f4759a).f4161a.asReadOnlyBuffer();
    }

    @Override // p000.bym
    /* JADX INFO: renamed from: c */
    public final void mo3190c() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        byn bynVar = this.f4744a.f4743a;
        byl bylVar = bynVar.f4763e;
        if ((bylVar != null ? bylVar.f4755a : -1) == bynVar.m3193a() - 1) {
            this.f4749f++;
        }
        if (this.f4750g == -1 || this.f4749f < 0) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4745b) {
            return;
        }
        if (this.f4751h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m3185e());
            this.f4751h = false;
        }
        byn bynVar = this.f4744a.f4743a;
        byl bylVar = bynVar.f4763e;
        canvas.drawBitmap(bylVar != null ? bylVar.f4756b : bynVar.f4766h, (Rect) null, m3185e(), m3184d());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4744a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4744a.f4743a.f4770l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4744a.f4743a.f4769k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4746c;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4751h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        m3184d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        m3184d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        bzq.m3274n(!this.f4745b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4748e = z;
        if (!z) {
            m3187g();
        } else if (this.f4747d) {
            m3186f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4747d = true;
        this.f4749f = 0;
        if (this.f4748e) {
            m3186f();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4747d = false;
        m3187g();
    }
}
