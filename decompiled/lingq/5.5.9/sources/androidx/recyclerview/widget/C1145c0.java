package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1145c0 implements C1150f.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f7226a;

    public C1145c0(RecyclerView recyclerView) {
        this.f7226a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final int m4436a() {
        return this.f7226a.getChildCount();
    }

    /* JADX INFO: renamed from: b */
    public final void m4437b(int i10) {
        RecyclerView recyclerView = this.f7226a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.m4216q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
