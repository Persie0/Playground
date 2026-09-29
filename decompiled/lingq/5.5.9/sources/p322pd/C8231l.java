package p322pd;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: pd.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8231l implements InterfaceC8236q {

    /* JADX INFO: renamed from: b */
    public final boolean f44495b;

    /* JADX INFO: renamed from: a */
    public float f44494a = 0.8f;

    /* JADX INFO: renamed from: c */
    public boolean f44496c = true;

    public C8231l(boolean z10) {
        this.f44495b = z10;
    }

    /* JADX INFO: renamed from: c */
    public static ObjectAnimator m16375c(View view, float f3, float f10) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f3, scaleX * f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f3 * scaleY, f10 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new C8230k(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: a */
    public final Animator mo16365a(ViewGroup viewGroup, View view) {
        return this.f44495b ? m16375c(view, this.f44494a, 1.0f) : m16375c(view, 1.1f, 1.0f);
    }

    @Override // p322pd.InterfaceC8236q
    /* JADX INFO: renamed from: b */
    public final Animator mo16366b(ViewGroup viewGroup, View view) {
        if (this.f44496c) {
            return this.f44495b ? m16375c(view, 1.0f, 1.1f) : m16375c(view, 1.0f, this.f44494a);
        }
        return null;
    }
}
