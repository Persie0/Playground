package p301oh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dm.C5207g;

/* JADX INFO: renamed from: oh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8045d extends RecyclerView.AbstractC1119l {

    /* JADX INFO: renamed from: a */
    public final int f43711a;

    public C8045d(int i10) {
        this.f43711a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    /* JADX INFO: renamed from: f */
    public final void mo4282f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
        C5207g.m11111f(rect, "outRect");
        C5207g.m11111f(view, "view");
        C5207g.m11111f(recyclerView, "parent");
        C5207g.m11111f(c1131x, "state");
        rect.right = this.f43711a;
    }
}
