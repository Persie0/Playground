package p000;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgk implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3163a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ LottieAnimationView f3164b;

    public bgk(LottieAnimationView lottieAnimationView, int i) {
        this.f3164b = lottieAnimationView;
        this.f3163a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.f3164b;
        boolean z = lottieAnimationView.f6457e;
        Context context = lottieAnimationView.getContext();
        return z ? bgp.m2422c(context, this.f3163a) : bgp.m2423d(context, this.f3163a, null);
    }
}
