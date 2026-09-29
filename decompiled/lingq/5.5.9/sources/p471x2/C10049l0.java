package p471x2;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: x2.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10049l0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f51041a;

    /* JADX INFO: renamed from: x2.l0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static ViewPropertyAnimator m18840a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public C10049l0(View view) {
        this.f51041a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m18835a(float f3) {
        View view = this.f51041a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18836b() {
        View view = this.f51041a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18837c(long j10) {
        View view = this.f51041a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18838d(InterfaceC10051m0 interfaceC10051m0) {
        View view = this.f51041a.get();
        if (view != null) {
            if (interfaceC10051m0 != null) {
                view.animate().setListener(new C10047k0(interfaceC10051m0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18839e(float f3) {
        View view = this.f51041a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
