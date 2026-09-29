package p000;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fl5 implements xl5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39249a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f39250b;

    public fl5(LottieAnimationView lottieAnimationView, int i) {
        this.f39249a = i;
        switch (i) {
            case 1:
                this.f39250b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f39250b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // p000.xl5
    public final void onResult(Object obj) {
        int i = this.f39249a;
        WeakReference weakReference = this.f39250b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i2 = lottieAnimationView.f10586g;
                    if (i2 != 0) {
                        lottieAnimationView.setImageResource(i2);
                    }
                    xl5 xl5Var = lottieAnimationView.f10585f;
                    if (xl5Var == null) {
                        xl5Var = LottieAnimationView.f10578L;
                    }
                    xl5Var.onResult(th);
                    break;
                }
                break;
            default:
                gl5 gl5Var = (gl5) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(gl5Var);
                    break;
                }
                break;
        }
    }
}
