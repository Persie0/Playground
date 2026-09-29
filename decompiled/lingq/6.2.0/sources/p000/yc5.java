package p000;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yc5 extends x60 {

    /* JADX INFO: renamed from: i */
    public static final r90 f69627i = new r90(Float.class, "animationFraction", 10);

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f69628c;

    /* JADX INFO: renamed from: d */
    public final qz2 f69629d;

    /* JADX INFO: renamed from: e */
    public final ed5 f69630e;

    /* JADX INFO: renamed from: f */
    public int f69631f;

    /* JADX INFO: renamed from: g */
    public boolean f69632g;

    /* JADX INFO: renamed from: h */
    public float f69633h;

    public yc5(ed5 ed5Var) {
        super(3);
        this.f69631f = 1;
        this.f69630e = ed5Var;
        this.f69629d = new qz2(1);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo278a() {
        ObjectAnimator objectAnimator = this.f69628c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final void mo279c() {
        m25069m();
        this.f69628c.setDuration((long) (this.f69630e.f67957n * 333.0f));
        m25070n();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: i */
    public final void mo280i(w90 w90Var) {
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: j */
    public final void mo281j() {
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final void mo282k() {
        m25069m();
        m25070n();
        this.f69628c.start();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo283l() {
    }

    /* JADX INFO: renamed from: m */
    public final void m25069m() {
        if (this.f69628c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f69627i, 0.0f, 1.0f);
            this.f69628c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f69630e.f67957n * 333.0f));
            this.f69628c.setInterpolator(null);
            this.f69628c.setRepeatCount(-1);
            this.f69628c.addListener(new C3340mm(this, 6));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m25070n() {
        this.f69632g = true;
        this.f69631f = 1;
        for (bm2 bm2Var : (ArrayList) this.f67809b) {
            ed5 ed5Var = this.f69630e;
            bm2Var.f8673c = ed5Var.f67948e[0];
            bm2Var.f8674d = ed5Var.f67952i / 2;
        }
    }
}
