package p000;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auo implements ahc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2427a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2428b;

    public auo(auq auqVar, int i) {
        this.f2428b = i;
        this.f2427a = auqVar;
    }

    public auo(SwipeDismissBehavior swipeDismissBehavior, int i) {
        this.f2428b = i;
        this.f2427a = swipeDismissBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    @Override // p000.ahc
    /* JADX INFO: renamed from: a */
    public final boolean mo654a(View view) {
        int width;
        switch (this.f2428b) {
            case 0:
                ((auq) this.f2427a).m2044e(((ViewPager2) view).f1667b - 1);
                return true;
            case 1:
                ((auq) this.f2427a).m2044e(((ViewPager2) view).f1667b + 1);
                return true;
            default:
                boolean z = false;
                if (!((SwipeDismissBehavior) this.f2427a).mo4792u(view)) {
                    return false;
                }
                boolean z2 = afc.m442c(view) == 1;
                int i = ((SwipeDismissBehavior) this.f2427a).f8070c;
                if (i == 0) {
                    if (z2) {
                        width = -view.getWidth();
                    }
                    view.offsetLeftAndRight(width);
                    view.setAlpha(0.0f);
                    return true;
                }
                z = z2;
                if (i != 1 || z) {
                    width = view.getWidth();
                } else {
                    width = -view.getWidth();
                }
                view.offsetLeftAndRight(width);
                view.setAlpha(0.0f);
                return true;
        }
    }
}
