package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkh extends mjy {

    /* JADX INFO: renamed from: a */
    public static final int[] f40825a = {533, 567, 850, 750};

    /* JADX INFO: renamed from: b */
    public static final int[] f40826b = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: i */
    private static final Property f40827i = new mkg(Float.class);

    /* JADX INFO: renamed from: c */
    public final Interpolator[] f40828c;

    /* JADX INFO: renamed from: d */
    public final mjj f40829d;

    /* JADX INFO: renamed from: e */
    public int f40830e;

    /* JADX INFO: renamed from: f */
    public boolean f40831f;

    /* JADX INFO: renamed from: g */
    public float f40832g;

    /* JADX INFO: renamed from: h */
    atc f40833h;

    /* JADX INFO: renamed from: m */
    private ObjectAnimator f40834m;

    /* JADX INFO: renamed from: n */
    private ObjectAnimator f40835n;

    public mkh(Context context, mki mkiVar) {
        super(2);
        this.f40830e = 0;
        this.f40833h = null;
        this.f40829d = mkiVar;
        this.f40828c = new Interpolator[]{aso.m1967b(context, C0100R.anim.linear_indeterminate_line1_head_interpolator), aso.m1967b(context, C0100R.anim.linear_indeterminate_line1_tail_interpolator), aso.m1967b(context, C0100R.anim.linear_indeterminate_line2_head_interpolator), aso.m1967b(context, C0100R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: a */
    public final void mo16459a() {
        ObjectAnimator objectAnimator = this.f40834m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: b */
    public final void mo16460b(atc atcVar) {
        this.f40833h = atcVar;
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: c */
    public final void mo16461c() {
        ObjectAnimator objectAnimator = this.f40835n;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo16459a();
        if (this.f40790j.isVisible()) {
            this.f40835n.setFloatValues(this.f40832g, 1.0f);
            this.f40835n.setDuration((long) ((1.0f - this.f40832g) * 1800.0f));
            this.f40835n.start();
        }
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: d */
    public final void mo16462d() {
        if (this.f40834m == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<mkh, Float>) f40827i, 0.0f, 1.0f);
            this.f40834m = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f40834m.setInterpolator(null);
            this.f40834m.setRepeatCount(-1);
            this.f40834m.addListener(new mke(this));
        }
        if (this.f40835n == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<mkh, Float>) f40827i, 1.0f);
            this.f40835n = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f40835n.setInterpolator(null);
            this.f40835n.addListener(new mkf(this));
        }
        this.f40830e = 0;
        int iM15023p = kxk.m15023p(this.f40829d.f40743c[0], this.f40790j.f40786i);
        int[] iArr = this.f40792l;
        iArr[0] = iM15023p;
        iArr[1] = iM15023p;
        this.f40834m.start();
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: e */
    public final void mo16463e() {
        this.f40833h = null;
    }
}
