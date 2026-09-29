package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class t04 implements saa, c72, lr9 {

    /* JADX INFO: renamed from: a */
    public boolean f61702a;

    /* JADX INFO: renamed from: b */
    public final ImageView f61703b;

    public t04(ImageView imageView) {
        this.f61703b = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m21804a() {
        Object drawable = this.f61703b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f61702a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21805d(Drawable drawable) {
        ImageView imageView = this.f61703b;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        m21804a();
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: e */
    public final void mo1326e(ub5 ub5Var) {
        this.f61702a = false;
        m21804a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t04) {
            return this.f61703b.equals(((t04) obj).f61703b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61703b.hashCode();
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: n */
    public final void mo1335n(ub5 ub5Var) {
        this.f61702a = true;
        m21804a();
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: p */
    public final void mo11812p(Drawable drawable) {
        m21805d(drawable);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: s */
    public final void mo11813s(Drawable drawable) {
        m21805d(drawable);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: u */
    public final void mo11814u(Drawable drawable) {
        m21805d(drawable);
    }
}
