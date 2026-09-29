package p000;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl2 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: H */
    public static final ft0 f69972H = new ft0(Float.class, "growFraction", 7);

    /* JADX INFO: renamed from: a */
    public final Context f69973a;

    /* JADX INFO: renamed from: b */
    public final x90 f69974b;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f69976d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f69977e;

    /* JADX INFO: renamed from: g */
    public ArrayList f69979g;

    /* JADX INFO: renamed from: h */
    public boolean f69980h;

    /* JADX INFO: renamed from: i */
    public float f69981i;

    /* JADX INFO: renamed from: k */
    public int f69983k;

    /* JADX INFO: renamed from: f */
    public final float f69978f = -1.0f;

    /* JADX INFO: renamed from: j */
    public final Paint f69982j = new Paint();

    /* JADX INFO: renamed from: l */
    public final Rect f69984l = new Rect();

    /* JADX INFO: renamed from: c */
    public C3153jn f69975c = new C3153jn();

    public yl2(Context context, x90 x90Var) {
        this.f69973a = context;
        this.f69974b = x90Var;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public final float m25182b() {
        x90 x90Var = this.f69974b;
        if (x90Var.f67950g == 0 && x90Var.f67951h == 0) {
            return 1.0f;
        }
        return this.f69981i;
    }

    /* JADX INFO: renamed from: c */
    public final float m25183c() {
        float f = this.f69978f;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof mc2;
        x90 x90Var = this.f69974b;
        if (x90Var.m24412b(z) && x90Var.f67956m != 0) {
            C3153jn c3153jn = this.f69975c;
            ContentResolver contentResolver = this.f69973a.getContentResolver();
            c3153jn.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                int i = (int) ((((z ? x90Var.f67953j : x90Var.f67954k) * 1000.0f) / x90Var.f67956m) * f2);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i)) / i;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25184d(boolean z, boolean z2, boolean z3) {
        C3153jn c3153jn = this.f69975c;
        ContentResolver contentResolver = this.f69973a.getContentResolver();
        c3153jn.getClass();
        return mo16760e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo16760e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f69976d;
        int i = 0;
        ft0 ft0Var = f69972H;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ft0Var, 0.0f, 1.0f);
            this.f69976d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f69976d.setInterpolator(AbstractC0853cn.f10297b);
            ObjectAnimator objectAnimator2 = this.f69976d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                C3386nv.m17626m("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f69976d = objectAnimator2;
            objectAnimator2.addListener(new xl2(this, i));
        }
        int i2 = 1;
        if (this.f69977e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, ft0Var, 1.0f, 0.0f);
            this.f69977e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f69977e.setInterpolator(AbstractC0853cn.f10297b);
            ObjectAnimator objectAnimator3 = this.f69977e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                C3386nv.m17626m("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.f69977e = objectAnimator3;
            objectAnimator3.addListener(new xl2(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f69976d : this.f69977e;
            ObjectAnimator objectAnimator5 = z ? this.f69977e : this.f69976d;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.f69980h;
                    this.f69980h = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f69980h = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.f69980h;
                    this.f69980h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f69980h = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                x90 x90Var = this.f69974b;
                if (!z ? x90Var.f67951h != 0 : x90Var.f67950g != 0) {
                    boolean z7 = this.f69980h;
                    this.f69980h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f69980h = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m25185f(w90 w90Var) {
        ArrayList arrayList = this.f69979g;
        if (arrayList == null || !arrayList.contains(w90Var)) {
            return;
        }
        this.f69979g.remove(w90Var);
        if (this.f69979g.isEmpty()) {
            this.f69979g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f69983k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f69976d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f69977e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f69983k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f69982j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return m25184d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo16760e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo16760e(false, true, false);
    }
}
