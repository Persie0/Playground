package p000;

import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkd extends mjy {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f40815f = 0;

    /* JADX INFO: renamed from: g */
    private static final Property f40816g = new mkc(Float.class);

    /* JADX INFO: renamed from: a */
    public final akf f40817a;

    /* JADX INFO: renamed from: b */
    public final mjj f40818b;

    /* JADX INFO: renamed from: c */
    public int f40819c;

    /* JADX INFO: renamed from: d */
    public boolean f40820d;

    /* JADX INFO: renamed from: e */
    public float f40821e;

    /* JADX INFO: renamed from: h */
    private ObjectAnimator f40822h;

    public mkd(mki mkiVar) {
        super(3);
        this.f40819c = 1;
        this.f40818b = mkiVar;
        this.f40817a = new akf();
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: a */
    public final void mo16459a() {
        ObjectAnimator objectAnimator = this.f40822h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: b */
    public final void mo16460b(atc atcVar) {
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: c */
    public final void mo16461c() {
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: d */
    public final void mo16462d() {
        if (this.f40822h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<mkd, Float>) f40816g, 0.0f, 1.0f);
            this.f40822h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f40822h.setInterpolator(null);
            this.f40822h.setRepeatCount(-1);
            this.f40822h.addListener(new mkb(this));
        }
        this.f40820d = true;
        this.f40819c = 1;
        Arrays.fill(this.f40792l, kxk.m15023p(this.f40818b.f40743c[0], this.f40790j.f40786i));
        this.f40822h.start();
    }

    @Override // p000.mjy
    /* JADX INFO: renamed from: e */
    public final void mo16463e() {
    }
}
