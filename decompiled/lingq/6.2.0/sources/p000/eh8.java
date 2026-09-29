package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class eh8 extends View {

    /* JADX INFO: renamed from: f */
    public static final int[] f37258f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g */
    public static final int[] f37259g = new int[0];

    /* JADX INFO: renamed from: a */
    public hga f37260a;

    /* JADX INFO: renamed from: b */
    public Boolean f37261b;

    /* JADX INFO: renamed from: c */
    public Long f37262c;

    /* JADX INFO: renamed from: d */
    public RunnableC0002a0 f37263d;

    /* JADX INFO: renamed from: e */
    public C3757xf f37264e;

    private final void setRippleState(boolean z) throws IllegalAccessException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f37263d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f37262c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f37258f : f37259g;
            hga hgaVar = this.f37260a;
            if (hgaVar != null) {
                hgaVar.setState(iArr);
            }
        } else {
            RunnableC0002a0 runnableC0002a0 = new RunnableC0002a0(this, 16);
            this.f37263d = runnableC0002a0;
            postDelayed(runnableC0002a0, 50L);
        }
        this.f37262c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(eh8 eh8Var) {
        hga hgaVar = eh8Var.f37260a;
        if (hgaVar != null) {
            hgaVar.setState(f37259g);
        }
        eh8Var.f37263d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m11152b(lj7 lj7Var, boolean z, long j, int i, long j2, float f, C3757xf c3757xf) throws IllegalAccessException {
        if (this.f37260a == null || !Boolean.valueOf(z).equals(this.f37261b)) {
            hga hgaVar = new hga(z);
            setBackground(hgaVar);
            this.f37260a = hgaVar;
            this.f37261b = Boolean.valueOf(z);
        }
        hga hgaVar2 = this.f37260a;
        hgaVar2.getClass();
        this.f37264e = c3757xf;
        m11155e(j, i, j2, f);
        if (z) {
            hgaVar2.setHotspot(Float.intBitsToFloat((int) (lj7Var.f49743a >> 32)), Float.intBitsToFloat((int) (lj7Var.f49743a & 4294967295L)));
        } else {
            hgaVar2.setHotspot(hgaVar2.getBounds().centerX(), hgaVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m11153c() throws IllegalAccessException {
        this.f37264e = null;
        RunnableC0002a0 runnableC0002a0 = this.f37263d;
        if (runnableC0002a0 != null) {
            removeCallbacks(runnableC0002a0);
            RunnableC0002a0 runnableC0002a1 = this.f37263d;
            runnableC0002a1.getClass();
            runnableC0002a1.run();
        } else {
            hga hgaVar = this.f37260a;
            if (hgaVar != null) {
                hgaVar.setState(f37259g);
            }
        }
        hga hgaVar2 = this.f37260a;
        if (hgaVar2 == null) {
            return;
        }
        hgaVar2.setVisible(false, false);
        unscheduleDrawable(hgaVar2);
    }

    /* JADX INFO: renamed from: d */
    public final void m11154d() throws IllegalAccessException {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws IllegalAccessException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m11153c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11155e(long j, int i, long j2, float f) {
        hga hgaVar = this.f37260a;
        if (hgaVar == null) {
            return;
        }
        if (hgaVar.getRadius() != i) {
            hgaVar.setRadius(i);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jM198b = aa1.m198b(f, j2);
        aa1 aa1Var = hgaVar.f42338b;
        if (!(aa1Var == null ? false : aa1.m199c(aa1Var.f414a, jM198b))) {
            hgaVar.f42338b = new aa1(jM198b);
            hgaVar.setColor(ColorStateList.valueOf(d32.m10042h0(jM198b)));
        }
        Rect rect = new Rect(0, 0, ss5.m21693T(Float.intBitsToFloat((int) (j >> 32))), ss5.m21693T(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hgaVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws Exception {
        C3757xf c3757xf = this.f37264e;
        if (c3757xf != null) {
            c3757xf.mo0a();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
