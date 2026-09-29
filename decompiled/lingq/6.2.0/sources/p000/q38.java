package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class q38 extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f57194d;

    /* JADX INFO: renamed from: e */
    public final p38 f57195e;

    public q38(RecyclerView recyclerView) {
        this.f57194d = recyclerView;
        p38 p38Var = this.f57195e;
        if (p38Var != null) {
            this.f57195e = p38Var;
        } else {
            this.f57195e = new p38(this);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: c */
    public final void mo14276c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo14276c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f57194d.m2721P()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2671Y(accessibilityEvent);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        this.f44987a.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
        RecyclerView recyclerView = this.f57194d;
        if (recyclerView.m2721P() || recyclerView.getLayoutManager() == null) {
            return;
        }
        y28 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f69172b;
        layoutManager.mo2618Z(recyclerView2.f6647c, recyclerView2.f6606C0, c0797b4);
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: g */
    public final boolean mo6011g(View view, int i, Bundle bundle) {
        if (super.mo6011g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f57194d;
        if (recyclerView.m2721P() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo2633m0(i, bundle);
    }
}
