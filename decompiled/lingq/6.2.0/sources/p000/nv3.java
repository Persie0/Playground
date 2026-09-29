package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1062j;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class nv3 extends w28 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53284a = 0;

    public nv3(MaterialCalendar materialCalendar) {
        fma.m11945c(null);
        fma.m11945c(null);
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: f */
    public void mo17638f(Rect rect, View view, RecyclerView recyclerView, k38 k38Var) {
        switch (this.f53284a) {
            case 0:
                rect.getClass();
                view.getClass();
                k38Var.getClass();
                rect.right = 15;
                break;
            default:
                super.mo17638f(rect, view, recyclerView, k38Var);
                break;
        }
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: g */
    public void mo17639g(Canvas canvas, RecyclerView recyclerView) {
        switch (this.f53284a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof C1062j) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ nv3() {
    }
}
