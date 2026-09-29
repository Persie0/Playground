package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1151f0 {
    /* JADX INFO: renamed from: a */
    public static int m4474a(RecyclerView.C1131x c1131x, AbstractC1175z abstractC1175z, View view, View view2, RecyclerView.AbstractC1120m abstractC1120m, boolean z10) {
        if (abstractC1120m.m4326y() != 0 && c1131x.m4364b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(RecyclerView.AbstractC1120m.m4286J(view) - RecyclerView.AbstractC1120m.m4286J(view2)) + 1;
            }
            return Math.min(abstractC1175z.mo4540l(), abstractC1175z.mo4530b(view2) - abstractC1175z.mo4533e(view));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m4475b(RecyclerView.C1131x c1131x, AbstractC1175z abstractC1175z, View view, View view2, RecyclerView.AbstractC1120m abstractC1120m, boolean z10, boolean z11) {
        if (abstractC1120m.m4326y() != 0 && c1131x.m4364b() != 0 && view != null && view2 != null) {
            int iMax = z11 ? Math.max(0, (c1131x.m4364b() - Math.max(RecyclerView.AbstractC1120m.m4286J(view), RecyclerView.AbstractC1120m.m4286J(view2))) - 1) : Math.max(0, Math.min(RecyclerView.AbstractC1120m.m4286J(view), RecyclerView.AbstractC1120m.m4286J(view2)));
            if (z10) {
                return Math.round((iMax * (Math.abs(abstractC1175z.mo4530b(view2) - abstractC1175z.mo4533e(view)) / (Math.abs(RecyclerView.AbstractC1120m.m4286J(view) - RecyclerView.AbstractC1120m.m4286J(view2)) + 1))) + (abstractC1175z.mo4539k() - abstractC1175z.mo4533e(view)));
            }
            return iMax;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m4476c(RecyclerView.C1131x c1131x, AbstractC1175z abstractC1175z, View view, View view2, RecyclerView.AbstractC1120m abstractC1120m, boolean z10) {
        if (abstractC1120m.m4326y() != 0 && c1131x.m4364b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return c1131x.m4364b();
            }
            return (int) (((abstractC1175z.mo4530b(view2) - abstractC1175z.mo4533e(view)) / (Math.abs(RecyclerView.AbstractC1120m.m4286J(view) - RecyclerView.AbstractC1120m.m4286J(view2)) + 1)) * c1131x.m4364b());
        }
        return 0;
    }
}
