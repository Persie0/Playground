package p512yi;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import ph.C8313k3;

/* JADX INFO: renamed from: yi.k */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC10383k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f52158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8313k3 f52159b;

    public ViewTreeObserverOnGlobalLayoutListenerC10383k(FrameLayout frameLayout, C8313k3 c8313k3) {
        this.f52158a = frameLayout;
        this.f52159b = c8313k3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f52158a;
        if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
            return;
        }
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        C8313k3 c8313k3 = this.f52159b;
        MaterialCardView materialCardView = (MaterialCardView) c8313k3.f44965d;
        C5207g.m11110e(materialCardView, "mainCard");
        int measuredWidth = frameLayout.getMeasuredWidth();
        List<Integer> list = C6716m.f37937a;
        C4924a.m10445X(materialCardView, measuredWidth - ((int) C6716m.m13316a(6)));
        MaterialCardView materialCardView2 = (MaterialCardView) c8313k3.f44966e;
        C5207g.m11110e(materialCardView2, "secondBackCard");
        C4924a.m10445X(materialCardView2, frameLayout.getMeasuredWidth() - ((int) C6716m.m13316a(4)));
        MaterialCardView materialCardView3 = (MaterialCardView) c8313k3.f44964c;
        C5207g.m11110e(materialCardView3, "firstBackCard");
        C4924a.m10445X(materialCardView3, frameLayout.getMeasuredWidth() - ((int) C6716m.m13316a(2)));
    }
}
