package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwt extends ixl {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f32506a = 0;

    /* JADX INFO: renamed from: s */
    private static final Interpolator f32507s = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: t */
    private final ValueAnimator.AnimatorUpdateListener f32508t;

    /* JADX INFO: renamed from: u */
    private final ixd f32509u;

    public iwt(ixd ixdVar) {
        this.f32509u = ixdVar;
        this.f32508t = ixdVar.f32537c ? avb.f2475a : new iws(ixdVar, 0);
    }

    /* JADX INFO: renamed from: G */
    private static void m11830G(View view, boolean z) {
        view.setTag(C0100R.id.animating_item, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: H */
    private final void m11831H(C0829mo c0829mo) {
        c0829mo.f41155a.animate().setUpdateListener(this.f32508t);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: A */
    protected final void mo11832A(C0829mo c0829mo) {
        c0829mo.f41155a.setScaleY(1.0f);
        c0829mo.f41155a.setScaleX(1.0f);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: B */
    protected final void mo11833B(C0829mo c0829mo) {
        c0829mo.f41155a.setTranslationX(0.0f);
        c0829mo.f41155a.setTranslationY(0.0f);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: C */
    protected final void mo11834C(C0829mo c0829mo) {
        m11830G(c0829mo.f41155a, false);
        this.f32509u.m11850b(c0829mo.f41155a);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: a */
    public final ViewPropertyAnimator mo11835a(C0829mo c0829mo) {
        View view = c0829mo.f41155a;
        ixd ixdVar = this.f32509u;
        if (ixdVar.m11852d(view)) {
            ixd.m11847e(view, ixdVar.m11849a(view));
        }
        ViewPropertyAnimator updateListener = view.animate().setUpdateListener(this.f32508t);
        updateListener.setDuration(this.f39371h).setInterpolator(f32507s);
        return updateListener;
    }

    @Override // p000.ixl, p000.AbstractC0836mv
    /* JADX INFO: renamed from: e */
    public final boolean mo11836e(C0829mo c0829mo, C0829mo c0829mo2, int i, int i2, int i3, int i4) {
        m11831H(c0829mo2);
        if (c0829mo == c0829mo2) {
            return mo11837f(c0829mo, i, i2, i3, i4);
        }
        float translationX = c0829mo.f41155a.getTranslationX();
        float translationY = c0829mo.f41155a.getTranslationY();
        super.m11858E(c0829mo);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        c0829mo.f41155a.setTranslationX(translationX);
        c0829mo.f41155a.setTranslationY(translationY);
        c0829mo.f41155a.setScaleY(1.0f);
        c0829mo.f41155a.setScaleX(1.0f);
        if (c0829mo2 != null) {
            super.m11858E(c0829mo2);
            c0829mo2.f41155a.setTranslationX(-f);
            c0829mo2.f41155a.setTranslationY(-f2);
            c0829mo2.f41155a.setScaleX(0.1f);
            c0829mo2.f41155a.setScaleY(0.1f);
        }
        this.f32575f.add(new ixj(c0829mo, c0829mo2, i, i2, i3, i4));
        return true;
    }

    @Override // p000.ixl, p000.AbstractC0836mv
    /* JADX INFO: renamed from: f */
    public final boolean mo11837f(C0829mo c0829mo, int i, int i2, int i3, int i4) {
        m11831H(c0829mo);
        int translationX = (int) c0829mo.f41155a.getTranslationX();
        int translationY = (int) c0829mo.f41155a.getTranslationY();
        super.m11858E(c0829mo);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        View view = c0829mo.f41155a;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                m16076l(c0829mo);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.f32574e.add(new ixk(c0829mo, i5, i7, i3, i4));
        return true;
    }

    @Override // p000.ixl, p000.AbstractC0836mv
    /* JADX INFO: renamed from: i */
    public final void mo11838i(C0829mo c0829mo) {
        m11831H(c0829mo);
        super.m11858E(c0829mo);
        View view = c0829mo.f41155a;
        m11830G(view, true);
        view.setScaleX(0.1f);
        view.setScaleY(0.1f);
        view.setAlpha(0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        this.f32573d.add(c0829mo);
    }

    @Override // p000.ixl, p000.AbstractC0836mv
    /* JADX INFO: renamed from: j */
    public final void mo11839j(C0829mo c0829mo) {
        m11831H(c0829mo);
        super.m11858E(c0829mo);
        View view = c0829mo.f41155a;
        this.f32509u.m11850b(view);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        m11830G(view, true);
        this.f32572c.add(c0829mo);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: k */
    public final ViewPropertyAnimator mo11840k(C0829mo c0829mo) {
        View view = c0829mo.f41155a;
        view.animate().scaleX(1.0f).scaleY(1.0f);
        return view.animate();
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: v */
    public final ViewPropertyAnimator mo11841v(C0829mo c0829mo) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = c0829mo.f41155a.animate();
        viewPropertyAnimatorAnimate.scaleX(0.1f).scaleY(0.1f).setUpdateListener(this.f32508t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: w */
    public final ViewPropertyAnimator mo11842w(C0829mo c0829mo, int i, int i2, int i3, int i4) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = c0829mo.f41155a.animate();
        if (i3 - i != 0) {
            viewPropertyAnimatorAnimate.translationX(0.0f);
        }
        if (i4 - i2 != 0) {
            viewPropertyAnimatorAnimate.translationY(0.0f);
        }
        viewPropertyAnimatorAnimate.setUpdateListener(this.f32508t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: x */
    protected final ViewPropertyAnimator mo11843x(C0829mo c0829mo) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = c0829mo.f41155a.animate();
        viewPropertyAnimatorAnimate.scaleX(0.1f).scaleY(0.1f).alpha(0.0f).setDuration(this.f39372i).setInterpolator(f32507s).setUpdateListener(this.f32508t);
        return viewPropertyAnimatorAnimate;
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: y */
    protected final void mo11844y(C0829mo c0829mo) {
        this.f32509u.m11850b(c0829mo.f41155a);
        m11830G(c0829mo.f41155a, false);
    }

    @Override // p000.ixl
    /* JADX INFO: renamed from: z */
    protected final void mo11845z(C0829mo c0829mo) {
        c0829mo.f41155a.setScaleY(1.0f);
        c0829mo.f41155a.setScaleX(1.0f);
    }
}
