package androidx.view;

import android.view.View;
import cm.InterfaceC2052l;
import com.linguist.R;
import dm.C5207g;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1048n0 m3913a(View view) {
        C5207g.m11111f(view, "<this>");
        return (InterfaceC1048n0) C7073a.m14259T2(C7073a.m14262W2(SequencesKt__SequencesKt.m14252M2(view, new InterfaceC2052l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final View mo528n(View view2) {
                View view3 = view2;
                C5207g.m11111f(view3, "view");
                Object parent = view3.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new InterfaceC2052l<View, InterfaceC1048n0>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC1048n0 mo528n(View view2) {
                View view3 = view2;
                C5207g.m11111f(view3, "view");
                Object tag = view3.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof InterfaceC1048n0) {
                    return (InterfaceC1048n0) tag;
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static final void m3914b(View view, InterfaceC1048n0 interfaceC1048n0) {
        C5207g.m11111f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, interfaceC1048n0);
    }
}
