package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.google.android.material.R$attr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l21 extends x60 {

    /* JADX INFO: renamed from: k */
    public static final qz2 f48919k = AbstractC0853cn.f10297b;

    /* JADX INFO: renamed from: l */
    public static final int[] f48920l = {0, 1500, 3000, 4500};

    /* JADX INFO: renamed from: m */
    public static final float[] f48921m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n */
    public static final ft0 f48922n;

    /* JADX INFO: renamed from: o */
    public static final ft0 f48923o;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f48924c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f48925d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f48926e;

    /* JADX INFO: renamed from: f */
    public final q21 f48927f;

    /* JADX INFO: renamed from: g */
    public int f48928g;

    /* JADX INFO: renamed from: h */
    public float f48929h;

    /* JADX INFO: renamed from: i */
    public float f48930i;

    /* JADX INFO: renamed from: j */
    public AbstractC3689vl f48931j;

    static {
        Class<Float> cls = Float.class;
        f48922n = new ft0(cls, "animationFraction", 5);
        f48923o = new ft0(cls, "completeEndFraction", 6);
    }

    public l21(Context context, q21 q21Var) {
        super(1);
        this.f48928g = 0;
        this.f48931j = null;
        this.f48927f = q21Var;
        this.f48926e = r46.m20365H(context, R$attr.motionEasingStandardInterpolator, f48919k);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo278a() {
        ObjectAnimator objectAnimator = this.f48924c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final void mo279c() {
        m15744m();
        ObjectAnimator objectAnimator = this.f48924c;
        q21 q21Var = this.f48927f;
        objectAnimator.setDuration((long) (q21Var.f67957n * 6000.0f));
        this.f48925d.setDuration((long) (q21Var.f67957n * 500.0f));
        this.f48928g = 0;
        ((bm2) ((ArrayList) this.f67809b).get(0)).f8673c = q21Var.f67948e[0];
        this.f48930i = 0.0f;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: i */
    public final void mo280i(w90 w90Var) {
        this.f48931j = w90Var;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: j */
    public final void mo281j() {
        ObjectAnimator objectAnimator = this.f48925d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((o34) this.f67808a).isVisible()) {
            this.f48925d.start();
        } else {
            mo278a();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final void mo282k() {
        m15744m();
        this.f48928g = 0;
        ((bm2) ((ArrayList) this.f67809b).get(0)).f8673c = this.f48927f.f67948e[0];
        this.f48930i = 0.0f;
        this.f48924c.start();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo283l() {
        this.f48931j = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m15744m() {
        ObjectAnimator objectAnimator = this.f48924c;
        q21 q21Var = this.f48927f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f48922n, 0.0f, 1.0f);
            this.f48924c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (q21Var.f67957n * 6000.0f));
            this.f48924c.setInterpolator(null);
            this.f48924c.setRepeatCount(-1);
            this.f48924c.addListener(new k21(this, 0));
        }
        if (this.f48925d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f48923o, 0.0f, 1.0f);
            this.f48925d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (q21Var.f67957n * 500.0f));
            this.f48925d.addListener(new k21(this, 1));
        }
    }
}
