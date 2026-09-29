package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class vx1 extends fs5 {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f66040d0 = 0;

    /* JADX INFO: renamed from: c0 */
    public ux1 f66041c0;

    /* JADX INFO: renamed from: F */
    public final void m23564F(float f, float f2, float f3, float f4) {
        RectF rectF = this.f66041c0.f64484s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // p000.fs5
    /* JADX INFO: renamed from: h */
    public final void mo12064h(Canvas canvas) {
        if (this.f66041c0.f64484s.isEmpty()) {
            super.mo12064h(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f66041c0.f64484s);
        super.mo12064h(canvas);
        canvas.restore();
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f66041c0 = new ux1(this.f66041c0);
        return this;
    }
}
