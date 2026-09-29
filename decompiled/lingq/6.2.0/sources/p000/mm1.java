package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class mm1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f51511b;

    public /* synthetic */ mm1(ViewGroup viewGroup, int i) {
        this.f51510a = i;
        this.f51511b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        int i = this.f51510a;
        ViewGroup viewGroup = this.f51511b;
        switch (i) {
            case 0:
                ((CoordinatorLayout) viewGroup).m1983p(0);
                break;
            default:
                en3 en3Var = (en3) viewGroup;
                en3Var.postInvalidateOnAnimation();
                ViewGroup viewGroup2 = en3Var.f37554a;
                if (viewGroup2 != null && (view = en3Var.f37555b) != null) {
                    viewGroup2.endViewTransition(view);
                    en3Var.f37554a.postInvalidateOnAnimation();
                    en3Var.f37554a = null;
                    en3Var.f37555b = null;
                }
                break;
        }
        return true;
    }
}
