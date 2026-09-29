package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p38 extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final q38 f55530d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f55531e = new WeakHashMap();

    public p38(q38 q38Var) {
        this.f55530d = q38Var;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: a */
    public final boolean mo14275a(View view, AccessibilityEvent accessibilityEvent) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        return c3133j3 != null ? c3133j3.mo14275a(view, accessibilityEvent) : this.f44987a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: b */
    public final qn3 mo1782b(View view) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        return c3133j3 != null ? c3133j3.mo1782b(view) : super.mo1782b(view);
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: c */
    public final void mo14276c(View view, AccessibilityEvent accessibilityEvent) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            c3133j3.mo14276c(view, accessibilityEvent);
        } else {
            super.mo14276c(view, accessibilityEvent);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        q38 q38Var = this.f55530d;
        RecyclerView recyclerView = q38Var.f57194d;
        RecyclerView recyclerView2 = q38Var.f57194d;
        boolean zM2721P = recyclerView.m2721P();
        View.AccessibilityDelegate accessibilityDelegate = this.f44987a;
        if (zM2721P || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m24897b0(view, c0797b4);
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            c3133j3.mo6010d(view, c0797b4);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: e */
    public final void mo10704e(View view, AccessibilityEvent accessibilityEvent) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            c3133j3.mo10704e(view, accessibilityEvent);
        } else {
            super.mo10704e(view, accessibilityEvent);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: f */
    public final boolean mo14277f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(viewGroup);
        return c3133j3 != null ? c3133j3.mo14277f(viewGroup, view, accessibilityEvent) : this.f44987a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: g */
    public final boolean mo6011g(View view, int i, Bundle bundle) {
        q38 q38Var = this.f55530d;
        RecyclerView recyclerView = q38Var.f57194d;
        RecyclerView recyclerView2 = q38Var.f57194d;
        if (recyclerView.m2721P() || recyclerView2.getLayoutManager() == null) {
            return super.mo6011g(view, i, bundle);
        }
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            if (c3133j3.mo6011g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo6011g(view, i, bundle)) {
            return true;
        }
        g38 g38Var = recyclerView2.getLayoutManager().f69172b.f6647c;
        return false;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: h */
    public final void mo14278h(View view, int i) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            c3133j3.mo14278h(view, i);
        } else {
            super.mo14278h(view, i);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: i */
    public final void mo14279i(View view, AccessibilityEvent accessibilityEvent) {
        C3133j3 c3133j3 = (C3133j3) this.f55531e.get(view);
        if (c3133j3 != null) {
            c3133j3.mo14279i(view, accessibilityEvent);
        } else {
            super.mo14279i(view, accessibilityEvent);
        }
    }
}
