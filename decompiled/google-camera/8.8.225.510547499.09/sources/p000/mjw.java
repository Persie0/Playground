package p000;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mjw extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a */
    private static final Property f40778a = new mjv(Float.class);

    /* JADX INFO: renamed from: b */
    private ValueAnimator f40779b;

    /* JADX INFO: renamed from: c */
    private ValueAnimator f40780c;

    /* JADX INFO: renamed from: d */
    final Context f40781d;

    /* JADX INFO: renamed from: e */
    final mjj f40782e;

    /* JADX INFO: renamed from: f */
    public List f40783f;

    /* JADX INFO: renamed from: g */
    public boolean f40784g;

    /* JADX INFO: renamed from: h */
    final Paint f40785h = new Paint();

    /* JADX INFO: renamed from: i */
    public int f40786i;

    /* JADX INFO: renamed from: j */
    private float f40787j;

    public mjw(Context context, mjj mjjVar) {
        this.f40781d = context;
        this.f40782e = mjjVar;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: a */
    private final void m16466a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f40784g;
        this.f40784g = true;
        valueAnimatorArr[0].end();
        this.f40784g = z;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo16465b(boolean z, boolean z2, boolean z3) {
        if (this.f40779b == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<mjw, Float>) f40778a, 0.0f, 1.0f);
            this.f40779b = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f40779b.setInterpolator(mfs.f40384b);
            ValueAnimator valueAnimator = this.f40779b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f40779b = valueAnimator;
            valueAnimator.addListener(new mjt(this));
        }
        if (this.f40780c == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<mjw, Float>) f40778a, 1.0f, 0.0f);
            this.f40780c = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f40780c.setInterpolator(mfs.f40384b);
            ValueAnimator valueAnimator2 = this.f40780c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f40780c = valueAnimator2;
            valueAnimator2.addListener(new mju(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.f40779b : this.f40780c;
        ValueAnimator valueAnimator4 = z ? this.f40780c : this.f40779b;
        if (!z3) {
            if (valueAnimator4.isRunning()) {
                new ValueAnimator[1][0] = valueAnimator4;
                boolean z4 = this.f40784g;
                this.f40784g = true;
                valueAnimator4.cancel();
                this.f40784g = z4;
            }
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                m16466a(valueAnimator3);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator3.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        if (!(z ? this.f40782e.m16451c() : this.f40782e.m16450b())) {
            m16466a(valueAnimator3);
            return z5;
        }
        if (z2 || !valueAnimator3.isPaused()) {
            valueAnimator3.start();
        } else {
            valueAnimator3.resume();
        }
        return z5;
    }

    /* JADX INFO: renamed from: c */
    final float m16468c() {
        if (this.f40782e.m16451c() || this.f40782e.m16450b()) {
            return this.f40787j;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m16469d(atc atcVar) {
        if (this.f40783f == null) {
            this.f40783f = new ArrayList();
        }
        if (this.f40783f.contains(atcVar)) {
            return;
        }
        this.f40783f.add(atcVar);
    }

    /* JADX INFO: renamed from: e */
    final void m16470e(float f) {
        if (this.f40787j != f) {
            this.f40787j = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16471f() {
        ValueAnimator valueAnimator = this.f40780c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m16472g() {
        ValueAnimator valueAnimator = this.f40779b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40786i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16473h(boolean z, boolean z2, boolean z3) {
        float fM15397E = lij.m15397E(this.f40781d.getContentResolver());
        boolean z4 = false;
        if (z3 && fM15397E > 0.0f) {
            z4 = true;
        }
        return mo16465b(z, z2, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m16472g() || m16471f();
    }

    /* JADX INFO: renamed from: j */
    public final void m16474j() {
        m16473h(false, false, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m16475k(atc atcVar) {
        List list = this.f40783f;
        if (list == null || !list.contains(atcVar)) {
            return;
        }
        this.f40783f.remove(atcVar);
        if (this.f40783f.isEmpty()) {
            this.f40783f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40786i = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40785h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return m16473h(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo16465b(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo16465b(false, true, false);
    }
}
