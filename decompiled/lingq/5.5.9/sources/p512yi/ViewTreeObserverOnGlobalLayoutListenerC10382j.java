package p512yi;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingq.util.C4924a;
import dm.C5207g;
import ph.C8348q3;

/* JADX INFO: renamed from: yi.j */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC10382j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f52156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8348q3 f52157b;

    public ViewTreeObserverOnGlobalLayoutListenerC10382j(LinearLayout linearLayout, C8348q3 c8348q3) {
        this.f52156a = linearLayout;
        this.f52157b = c8348q3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f52156a;
        if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            C8348q3 c8348q3 = this.f52157b;
            MaterialCardView materialCardView = c8348q3.f45175a;
            C5207g.m11110e(materialCardView, "cardView");
            C4924a.m10445X(materialCardView, linearLayout.getMeasuredWidth());
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) c8348q3.f45180f;
            C5207g.m11110e(shimmerFrameLayout, "viewBg");
            C4924a.m10445X(shimmerFrameLayout, linearLayout.getMeasuredWidth());
        }
    }
}
