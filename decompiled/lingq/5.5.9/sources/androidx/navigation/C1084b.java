package androidx.navigation;

import android.view.View;
import cm.InterfaceC2052l;
import com.linguist.R;
import dm.C5207g;
import java.lang.ref.WeakReference;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: renamed from: androidx.navigation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1084b {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final NavController m4034a(View view) {
        NavController navController = (NavController) C7073a.m14259T2(C7073a.m14262W2(SequencesKt__SequencesKt.m14252M2(view, new InterfaceC2052l<View, View>() { // from class: androidx.navigation.Navigation$findViewNavController$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final View mo528n(View view2) {
                View view3 = view2;
                C5207g.m11111f(view3, "it");
                Object parent = view3.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new InterfaceC2052l<View, NavController>() { // from class: androidx.navigation.Navigation$findViewNavController$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final NavController mo528n(View view2) {
                View view3 = view2;
                C5207g.m11111f(view3, "it");
                Object tag = view3.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (NavController) ((WeakReference) tag).get();
                }
                if (tag instanceof NavController) {
                    return (NavController) tag;
                }
                return null;
            }
        }));
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
