package p000;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: mf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0820mf extends C0158ej {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RecyclerView f40290a;

    public C0820mf(RecyclerView recyclerView) {
        this.f40290a = recyclerView;
    }

    @Override // p000.C0158ej
    /* JADX INFO: renamed from: b */
    public final void mo2040b() {
        this.f40290a.m1260q(null);
        RecyclerView recyclerView = this.f40290a;
        recyclerView.f1075M.f40921f = true;
        recyclerView.m1221T(true);
        if (this.f40290a.f1082T.m13606m()) {
            return;
        }
        this.f40290a.requestLayout();
    }

    @Override // p000.C0158ej
    /* JADX INFO: renamed from: d */
    public final void mo2042d(int i, Object obj) {
        this.f40290a.m1260q(null);
        jvx jvxVar = this.f40290a.f1082T;
        ((ArrayList) jvxVar.f34928d).add(jvxVar.m13597d(4, i, 1, obj));
        jvxVar.f34926b |= 4;
        if (((ArrayList) jvxVar.f34928d).size() == 1) {
            if (RecyclerView.f1059b) {
                RecyclerView recyclerView = this.f40290a;
                if (recyclerView.f1130t && recyclerView.f1129s) {
                    afb.m428i(recyclerView, recyclerView.f1120j);
                    return;
                }
            }
            RecyclerView recyclerView2 = this.f40290a;
            recyclerView2.f1134x = true;
            recyclerView2.requestLayout();
        }
    }
}
