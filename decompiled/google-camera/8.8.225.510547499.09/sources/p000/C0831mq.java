package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0831mq extends aei {

    /* JADX INFO: renamed from: a */
    final RecyclerView f41317a;

    /* JADX INFO: renamed from: b */
    public final C0830mp f41318b;

    public C0831mq(RecyclerView recyclerView) {
        this.f41317a = recyclerView;
        aei aeiVarMo1780j = mo1780j();
        if (aeiVarMo1780j == null || !(aeiVarMo1780j instanceof C0830mp)) {
            this.f41318b = new C0830mp(this);
        } else {
            this.f41318b = (C0830mp) aeiVarMo1780j;
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        AbstractC0812ly abstractC0812ly;
        super.mo325a(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m16791k() || (abstractC0812ly = ((RecyclerView) view).f1124n) == null) {
            return;
        }
        abstractC0812ly.mo1157Q(accessibilityEvent);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public void mo326b(View view, agt agtVar) {
        AbstractC0812ly abstractC0812ly;
        super.mo326b(view, agtVar);
        if (m16791k() || (abstractC0812ly = this.f41317a.f1124n) == null) {
            return;
        }
        RecyclerView recyclerView = abstractC0812ly.f39550q;
        abstractC0812ly.mo1105m(recyclerView.f1116f, recyclerView.f1075M, agtVar);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: h */
    public boolean mo332h(View view, int i, Bundle bundle) {
        AbstractC0812ly abstractC0812ly;
        if (super.mo332h(view, i, bundle)) {
            return true;
        }
        if (m16791k() || (abstractC0812ly = this.f41317a.f1124n) == null) {
            return false;
        }
        RecyclerView recyclerView = abstractC0812ly.f39550q;
        C0818md c0818md = recyclerView.f1116f;
        C0826ml c0826ml = recyclerView.f1075M;
        return abstractC0812ly.m16183bs(i);
    }

    /* JADX INFO: renamed from: j */
    public aei mo1780j() {
        return this.f41318b;
    }

    /* JADX INFO: renamed from: k */
    final boolean m16791k() {
        return this.f41317a.m1238al();
    }
}
