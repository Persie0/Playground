package androidx.view;

import android.view.View;
import cm.InterfaceC2052l;
import com.linguist.R;
import dm.C5207g;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1051q m3911a(View view) {
        C5207g.m11111f(view, "<this>");
        return (InterfaceC1051q) C7073a.m14259T2(C7073a.m14262W2(SequencesKt__SequencesKt.m14252M2(view, new InterfaceC2052l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final View mo528n(View view2) {
                View view3 = view2;
                C5207g.m11111f(view3, "currentView");
                Object parent = view3.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new InterfaceC2052l<View, InterfaceC1051q>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC1051q mo528n(android.view.View view2) {
                android.view.View view3 = view2;
                C5207g.m11111f(view3, "viewParent");
                Object tag = view3.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC1051q) {
                    return (InterfaceC1051q) tag;
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static final void m3912b(View view, InterfaceC1051q interfaceC1051q) {
        C5207g.m11111f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1051q);
    }
}
