package androidx.p544savedstate;

import android.view.View;
import cm.InterfaceC2052l;
import com.linguist.R;
import dm.C5207g;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import p270n4.InterfaceC7706c;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7706c m4582a(View view) {
        C5207g.m11111f(view, "<this>");
        return (InterfaceC7706c) C7073a.m14259T2(C7073a.m14262W2(SequencesKt__SequencesKt.m14252M2(view, new InterfaceC2052l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
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
        }), new InterfaceC2052l<View, InterfaceC7706c>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC7706c mo528n(android.view.View view2) {
                android.view.View view3 = view2;
                C5207g.m11111f(view3, "view");
                Object tag = view3.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof InterfaceC7706c) {
                    return (InterfaceC7706c) tag;
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static final void m4583b(View view, InterfaceC7706c interfaceC7706c) {
        C5207g.m11111f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC7706c);
    }
}
