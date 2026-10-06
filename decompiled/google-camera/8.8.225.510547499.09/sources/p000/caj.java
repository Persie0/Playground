package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class caj extends can {

    /* JADX INFO: renamed from: c */
    private Animatable f4916c;

    public caj(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: renamed from: n */
    private final void m3360n(Object obj) {
        mo3359l(obj);
        if (!(obj instanceof Animatable)) {
            this.f4916c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f4916c = animatable;
        animatable.start();
    }

    @Override // p000.caf, p000.cal
    /* JADX INFO: renamed from: a */
    public final void mo3191a(Drawable drawable) {
        this.f4919b.m1590U();
        Animatable animatable = this.f4916c;
        if (animatable != null) {
            animatable.stop();
        }
        m3360n(null);
        m3361m(drawable);
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: b */
    public final void mo3192b(Object obj) {
        m3360n(obj);
    }

    @Override // p000.caf, p000.cal
    /* JADX INFO: renamed from: e */
    public final void mo3339e(Drawable drawable) {
        m3360n(null);
        m3361m(drawable);
    }

    @Override // p000.caf, p000.cal
    /* JADX INFO: renamed from: f */
    public final void mo3340f(Drawable drawable) {
        m3360n(null);
        m3361m(drawable);
    }

    @Override // p000.caf, p000.bza
    /* JADX INFO: renamed from: h */
    public final void mo2868h() {
        Animatable animatable = this.f4916c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p000.caf, p000.bza
    /* JADX INFO: renamed from: i */
    public final void mo2869i() {
        Animatable animatable = this.f4916c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo3359l(Object obj);

    /* JADX INFO: renamed from: m */
    public final void m3361m(Drawable drawable) {
        ((ImageView) this.f4918a).setImageDrawable(drawable);
    }
}
