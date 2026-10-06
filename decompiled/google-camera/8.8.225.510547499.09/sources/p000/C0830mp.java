package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0830mp extends aei {

    /* JADX INFO: renamed from: a */
    final C0831mq f41224a;

    /* JADX INFO: renamed from: b */
    public final Map f41225b = new WeakHashMap();

    public C0830mp(C0831mq c0831mq) {
        this.f41224a = c0831mq;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            aeiVar.mo325a(view, accessibilityEvent);
        } else {
            super.mo325a(view, accessibilityEvent);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public void mo326b(View view, agt agtVar) {
        AbstractC0812ly abstractC0812ly;
        if (this.f41224a.m16791k() || (abstractC0812ly = this.f41224a.f41317a.f1124n) == null) {
            super.mo326b(view, agtVar);
            return;
        }
        abstractC0812ly.m16149aI(view, agtVar);
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            aeiVar.mo326b(view, agtVar);
        } else {
            super.mo326b(view, agtVar);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: c */
    public final void mo327c(View view, AccessibilityEvent accessibilityEvent) {
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            aeiVar.mo327c(view, accessibilityEvent);
        } else {
            super.mo327c(view, accessibilityEvent);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: d */
    public final void mo328d(View view, int i) {
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            aeiVar.mo328d(view, i);
        } else {
            super.mo328d(view, i);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: e */
    public final void mo329e(View view, AccessibilityEvent accessibilityEvent) {
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            aeiVar.mo329e(view, accessibilityEvent);
        } else {
            super.mo329e(view, accessibilityEvent);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: f */
    public final boolean mo330f(View view, AccessibilityEvent accessibilityEvent) {
        aei aeiVar = (aei) this.f41225b.get(view);
        return aeiVar != null ? aeiVar.mo330f(view, accessibilityEvent) : super.mo330f(view, accessibilityEvent);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: g */
    public final boolean mo331g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        aei aeiVar = (aei) this.f41225b.get(viewGroup);
        return aeiVar != null ? aeiVar.mo331g(viewGroup, view, accessibilityEvent) : super.mo331g(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: h */
    public boolean mo332h(View view, int i, Bundle bundle) {
        if (this.f41224a.m16791k() || this.f41224a.f41317a.f1124n == null) {
            return super.mo332h(view, i, bundle);
        }
        aei aeiVar = (aei) this.f41225b.get(view);
        if (aeiVar != null) {
            if (aeiVar.mo332h(view, i, bundle)) {
                return true;
            }
        } else if (super.mo332h(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f41224a.f41317a.f1124n.f39550q;
        C0818md c0818md = recyclerView.f1116f;
        C0826ml c0826ml = recyclerView.f1075M;
        return false;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: i */
    public final bkn mo333i(View view) {
        aei aeiVar = (aei) this.f41225b.get(view);
        return aeiVar != null ? aeiVar.mo333i(view) : super.mo333i(view);
    }
}
