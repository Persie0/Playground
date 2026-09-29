package p021b0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.activity.RunnableC0190i;
import cm.InterfaceC2041a;
import dm.C5207g;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.C9169u;
import p423v.C9615m;
import sl.C9072e;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1282g extends View {

    /* JADX INFO: renamed from: f */
    public static final int[] f7969f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g */
    public static final int[] f7970g = new int[0];

    /* JADX INFO: renamed from: a */
    public C1287l f7971a;

    /* JADX INFO: renamed from: b */
    public Boolean f7972b;

    /* JADX INFO: renamed from: c */
    public Long f7973c;

    /* JADX INFO: renamed from: d */
    public RunnableC0190i f7974d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2041a<C9072e> f7975e;

    public C1282g(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f7974d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f7973c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f7969f : f7970g;
            C1287l c1287l = this.f7971a;
            if (c1287l != null) {
                c1287l.setState(iArr);
            }
        } else {
            RunnableC0190i runnableC0190i = new RunnableC0190i(2, this);
            this.f7974d = runnableC0190i;
            postDelayed(runnableC0190i, 50L);
        }
        this.f7973c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(C1282g c1282g) {
        C5207g.m11111f(c1282g, "this$0");
        C1287l c1287l = c1282g.f7971a;
        if (c1287l != null) {
            c1287l.setState(f7970g);
        }
        c1282g.f7974d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4784b(C9615m c9615m, boolean z10, long j10, int i10, long j11, float f3, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(c9615m, "interaction");
        C5207g.m11111f(interfaceC2041a, "onInvalidateRipple");
        if (this.f7971a == null || !C5207g.m11106a(Boolean.valueOf(z10), this.f7972b)) {
            C1287l c1287l = new C1287l(z10);
            setBackground(c1287l);
            this.f7971a = c1287l;
            this.f7972b = Boolean.valueOf(z10);
        }
        C1287l c1287l2 = this.f7971a;
        C5207g.m11108c(c1287l2);
        this.f7975e = interfaceC2041a;
        m4787e(f3, i10, j10, j11);
        if (z10) {
            long j12 = c9615m.f49282a;
            c1287l2.setHotspot(C8941c.m17164c(j12), C8941c.m17165d(j12));
        } else {
            c1287l2.setHotspot(c1287l2.getBounds().centerX(), c1287l2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m4785c() {
        this.f7975e = null;
        RunnableC0190i runnableC0190i = this.f7974d;
        if (runnableC0190i != null) {
            removeCallbacks(runnableC0190i);
            RunnableC0190i runnableC0190i2 = this.f7974d;
            C5207g.m11108c(runnableC0190i2);
            runnableC0190i2.run();
        } else {
            C1287l c1287l = this.f7971a;
            if (c1287l != null) {
                c1287l.setState(f7970g);
            }
        }
        C1287l c1287l2 = this.f7971a;
        if (c1287l2 == null) {
            return;
        }
        c1287l2.setVisible(false, false);
        unscheduleDrawable(c1287l2);
    }

    /* JADX INFO: renamed from: d */
    public final void m4786d() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m4787e(float f3, int i10, long j10, long j11) {
        C1287l c1287l = this.f7971a;
        if (c1287l == null) {
            return;
        }
        Integer num = c1287l.f7985c;
        if (num == null || num.intValue() != i10) {
            c1287l.f7985c = Integer.valueOf(i10);
            C1287l.a.f7987a.m4790a(c1287l, i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        long jM17496b = C9169u.m17496b(j11, f3);
        C9169u c9169u = c1287l.f7984b;
        if (!(c9169u == null ? false : C9169u.m17497c(c9169u.f47705a, jM17496b))) {
            c1287l.f7984b = new C9169u(jM17496b);
            c1287l.setColor(ColorStateList.valueOf(C8584v.m16780C(jM17496b)));
        }
        Rect rect = new Rect(0, 0, C8573r0.m16710Y0(C8944f.m17177d(j10)), C8573r0.m16710Y0(C8944f.m17175b(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1287l.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C5207g.m11111f(drawable, "who");
        InterfaceC2041a<C9072e> interfaceC2041a = this.f7975e;
        if (interfaceC2041a != null) {
            interfaceC2041a.mo807E();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
