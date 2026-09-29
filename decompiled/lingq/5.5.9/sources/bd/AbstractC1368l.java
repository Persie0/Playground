package bd;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import p177ic.C6308a;

/* JADX INFO: renamed from: bd.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1368l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: k */
    public static final a f8246k = new a();

    /* JADX INFO: renamed from: a */
    public final Context f8247a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1359c f8248b;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f8250d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f8251e;

    /* JADX INFO: renamed from: f */
    public ArrayList f8252f;

    /* JADX INFO: renamed from: g */
    public boolean f8253g;

    /* JADX INFO: renamed from: h */
    public float f8254h;

    /* JADX INFO: renamed from: j */
    public int f8256j;

    /* JADX INFO: renamed from: i */
    public final Paint f8255i = new Paint();

    /* JADX INFO: renamed from: c */
    public C1357a f8249c = new C1357a();

    /* JADX INFO: renamed from: bd.l$a */
    public class a extends Property<AbstractC1368l, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(AbstractC1368l abstractC1368l) {
            return Float.valueOf(abstractC1368l.m4956b());
        }

        @Override // android.util.Property
        public final void set(AbstractC1368l abstractC1368l, Float f3) {
            AbstractC1368l abstractC1368l2 = abstractC1368l;
            float fFloatValue = f3.floatValue();
            if (abstractC1368l2.f8254h != fFloatValue) {
                abstractC1368l2.f8254h = fFloatValue;
                abstractC1368l2.invalidateSelf();
            }
        }
    }

    public AbstractC1368l(Context context, AbstractC1359c abstractC1359c) {
        this.f8247a = context;
        this.f8248b = abstractC1359c;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public final float m4956b() {
        AbstractC1359c abstractC1359c = this.f8248b;
        boolean z10 = true;
        if (!(abstractC1359c.f8214e != 0)) {
            if (abstractC1359c.f8215f == 0) {
                z10 = false;
            }
            if (!z10) {
                return 1.0f;
            }
        }
        return this.f8254h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4957c() {
        ValueAnimator valueAnimator = this.f8251e;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4958d() {
        ValueAnimator valueAnimator = this.f8250d;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4959e(boolean z10, boolean z11, boolean z12) {
        C1357a c1357a = this.f8249c;
        ContentResolver contentResolver = this.f8247a.getContentResolver();
        c1357a.getClass();
        return mo4952f(z10, z11, z12 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo4952f(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator = this.f8250d;
        a aVar = f8246k;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f8250d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f8250d.setInterpolator(C6308a.f36524b);
            ValueAnimator valueAnimator2 = this.f8250d;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f8250d = valueAnimator2;
            valueAnimator2.addListener(new C1366j(this));
        }
        if (this.f8251e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.f8251e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f8251e.setInterpolator(C6308a.f36524b);
            ValueAnimator valueAnimator3 = this.f8251e;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f8251e = valueAnimator3;
            valueAnimator3.addListener(new C1367k(this));
        }
        boolean z13 = false;
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator4 = z10 ? this.f8250d : this.f8251e;
        ValueAnimator valueAnimator5 = z10 ? this.f8251e : this.f8250d;
        if (!z12) {
            if (valueAnimator5.isRunning()) {
                boolean z14 = this.f8253g;
                this.f8253g = true;
                valueAnimator5.cancel();
                this.f8253g = z14;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z15 = this.f8253g;
                this.f8253g = true;
                valueAnimator4.end();
                this.f8253g = z15;
            }
            return super.setVisible(z10, false);
        }
        if (z12 && valueAnimator4.isRunning()) {
            return false;
        }
        boolean z16 = !z10 || super.setVisible(z10, false);
        AbstractC1359c abstractC1359c = this.f8248b;
        if (!z10 ? abstractC1359c.f8215f != 0 : abstractC1359c.f8214e != 0) {
            z13 = true;
        }
        if (z13) {
            if (z11 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z16;
        }
        boolean z17 = this.f8253g;
        this.f8253g = true;
        valueAnimator4.end();
        this.f8253g = z17;
        return z16;
    }

    /* JADX INFO: renamed from: g */
    public final void m4960g(AbstractC1358b.d dVar) {
        ArrayList arrayList = this.f8252f;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.f8252f.remove(dVar);
            if (this.f8252f.isEmpty()) {
                this.f8252f = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8256j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m4958d() || m4957c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f8256j = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8255i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return m4959e(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo4952f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo4952f(false, true, false);
    }
}
