package bd;

import ae.C0062b;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.linguist.R;
import java.util.Arrays;
import p185j.AbstractC6392b;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1376t extends AbstractC6392b {

    /* JADX INFO: renamed from: l */
    public static final int[] f8275l = {533, 567, 850, 750};

    /* JADX INFO: renamed from: m */
    public static final int[] f8276m = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: n */
    public static final a f8277n = new a();

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f8278d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f8279e;

    /* JADX INFO: renamed from: f */
    public final Interpolator[] f8280f;

    /* JADX INFO: renamed from: g */
    public final C1377u f8281g;

    /* JADX INFO: renamed from: h */
    public int f8282h;

    /* JADX INFO: renamed from: i */
    public boolean f8283i;

    /* JADX INFO: renamed from: j */
    public float f8284j;

    /* JADX INFO: renamed from: k */
    public AbstractC9640c f8285k;

    /* JADX INFO: renamed from: bd.t$a */
    public class a extends Property<C1376t, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(C1376t c1376t) {
            return Float.valueOf(c1376t.f8284j);
        }

        @Override // android.util.Property
        public final void set(C1376t c1376t, Float f3) {
            C1376t c1376t2 = c1376t;
            float fFloatValue = f3.floatValue();
            c1376t2.f8284j = fFloatValue;
            int i10 = (int) (fFloatValue * 1800.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                ((float[]) c1376t2.f36837b)[i11] = Math.max(0.0f, Math.min(1.0f, c1376t2.f8280f[i11].getInterpolation((i10 - C1376t.f8276m[i11]) / C1376t.f8275l[i11])));
            }
            if (c1376t2.f8283i) {
                Arrays.fill((int[]) c1376t2.f36838c, C0062b.m413x0(c1376t2.f8281g.f8212c[c1376t2.f8282h], ((C1370n) c1376t2.f36836a).f8256j));
                c1376t2.f8283i = false;
            }
            ((C1370n) c1376t2.f36836a).invalidateSelf();
        }
    }

    public C1376t(Context context, C1377u c1377u) {
        super(2);
        this.f8282h = 0;
        this.f8285k = null;
        this.f8281g = c1377u;
        this.f8280f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: c */
    public final void mo4945c() {
        ObjectAnimator objectAnimator = this.f8278d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: f */
    public final void mo4946f() {
        m4962k();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: g */
    public final void mo4947g(AbstractC1358b.c cVar) {
        this.f8285k = cVar;
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: h */
    public final void mo4948h() {
        ObjectAnimator objectAnimator = this.f8279e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo4945c();
            if (((C1370n) this.f36836a).isVisible()) {
                this.f8279e.setFloatValues(this.f8284j, 1.0f);
                this.f8279e.setDuration((long) ((1.0f - this.f8284j) * 1800.0f));
                this.f8279e.start();
            }
        }
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: i */
    public final void mo4949i() {
        ObjectAnimator objectAnimator = this.f8278d;
        a aVar = f8277n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f8278d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f8278d.setInterpolator(null);
            this.f8278d.setRepeatCount(-1);
            this.f8278d.addListener(new C1374r(this));
        }
        if (this.f8279e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.f8279e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f8279e.setInterpolator(null);
            this.f8279e.addListener(new C1375s(this));
        }
        m4962k();
        this.f8278d.start();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: j */
    public final void mo4950j() {
        this.f8285k = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m4962k() {
        this.f8282h = 0;
        int iM413x0 = C0062b.m413x0(this.f8281g.f8212c[0], ((C1370n) this.f36836a).f8256j);
        int[] iArr = (int[]) this.f36838c;
        iArr[0] = iM413x0;
        iArr[1] = iM413x0;
    }
}
