package p000;

import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjp extends mjy {

    /* JADX INFO: renamed from: a */
    public static final int[] f40753a = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: b */
    public static final int[] f40754b = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: c */
    public static final int[] f40755c = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: m */
    private static final Property f40756m = new mjn(Float.class);

    /* JADX INFO: renamed from: n */
    private static final Property f40757n = new mjo(Float.class);

    /* JADX INFO: renamed from: d */
    public final akf f40758d;

    /* JADX INFO: renamed from: e */
    public final mjj f40759e;

    /* JADX INFO: renamed from: f */
    public int f40760f;

    /* JADX INFO: renamed from: g */
    public float f40761g;

    /* JADX INFO: renamed from: h */
    public float f40762h;

    /* JADX INFO: renamed from: i */
    atc f40763i;

    /* JADX INFO: renamed from: o */
    private ObjectAnimator f40764o;

    /* JADX INFO: renamed from: p */
    private ObjectAnimator f40765p;

    public mjp(mjq mjqVar) {
        super(1);
        this.f40760f = 0;
        this.f40763i = null;
        this.f40759e = mjqVar;
        this.f40758d = new akf();
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: a */
    public final void mo16459a() {
        ObjectAnimator objectAnimator = this.f40764o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: b */
    public final void mo16460b(atc atcVar) {
        this.f40763i = atcVar;
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: c */
    public final void mo16461c() {
        ObjectAnimator objectAnimator = this.f40765p;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f40790j.isVisible()) {
            this.f40765p.start();
        } else {
            mo16459a();
        }
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: d */
    public final void mo16462d() {
        if (this.f40764o == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<mjp, Float>) f40756m, 0.0f, 1.0f);
            this.f40764o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f40764o.setInterpolator(null);
            this.f40764o.setRepeatCount(-1);
            this.f40764o.addListener(new mjl(this));
        }
        if (this.f40765p == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<mjp, Float>) f40757n, 0.0f, 1.0f);
            this.f40765p = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f40765p.setInterpolator(this.f40758d);
            this.f40765p.addListener(new mjm(this));
        }
        this.f40760f = 0;
        this.f40792l[0] = kxk.m15023p(this.f40759e.f40743c[0], this.f40790j.f40786i);
        this.f40762h = 0.0f;
        this.f40764o.start();
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: e */
    public final void mo16463e() {
        this.f40763i = null;
    }
}
