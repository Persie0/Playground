package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class va4 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final float f65122a;

    /* JADX INFO: renamed from: b */
    public final float f65123b;

    /* JADX INFO: renamed from: c */
    public final float f65124c;

    /* JADX INFO: renamed from: d */
    public final float f65125d;

    /* JADX INFO: renamed from: e */
    public final o38 f65126e;

    /* JADX INFO: renamed from: f */
    public final int f65127f;

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f65128g;

    /* JADX INFO: renamed from: h */
    public boolean f65129h;

    /* JADX INFO: renamed from: i */
    public float f65130i;

    /* JADX INFO: renamed from: j */
    public float f65131j;

    /* JADX INFO: renamed from: k */
    public boolean f65132k = false;

    /* JADX INFO: renamed from: l */
    public boolean f65133l = false;

    /* JADX INFO: renamed from: m */
    public float f65134m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f65135n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ o38 f65136o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ za4 f65137p;

    public va4(za4 za4Var, o38 o38Var, int i, float f, float f2, float f3, float f4, int i2, o38 o38Var2) {
        this.f65137p = za4Var;
        this.f65135n = i2;
        this.f65136o = o38Var2;
        this.f65127f = i;
        this.f65126e = o38Var;
        this.f65122a = f;
        this.f65123b = f2;
        this.f65124c = f3;
        this.f65125d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f65128g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new gg0(this, 2));
        valueAnimatorOfFloat.setTarget(o38Var.f53781a);
        valueAnimatorOfFloat.addListener(this);
        this.f65134m = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m23212a(Animator animator) {
        if (!this.f65133l) {
            this.f65126e.m17796p(true);
        }
        this.f65133l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f65134m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m23212a(animator);
        if (this.f65132k) {
            return;
        }
        int i = this.f65135n;
        o38 o38Var = this.f65136o;
        za4 za4Var = this.f65137p;
        if (i <= 0) {
            za4Var.f71273m.m12740a(za4Var.f71277q, o38Var);
        } else {
            za4Var.f71261a.add(o38Var.f53781a);
            this.f65129h = true;
            if (i > 0) {
                za4Var.f71277q.post(new kj3(za4Var, this, i));
            }
        }
        View view = za4Var.f71282v;
        View view2 = o38Var.f53781a;
        if (view == view2 && view2 == view) {
            za4Var.f71282v = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
