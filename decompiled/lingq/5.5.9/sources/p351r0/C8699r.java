package p351r0;

import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import java.util.Arrays;
import java.util.Comparator;
import tl.C9322j;

/* JADX INFO: renamed from: r0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C8699r implements Comparator<FocusTargetModifierNode> {

    /* JADX INFO: renamed from: a */
    public static final C8699r f46283a = new C8699r();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.Comparator
    public final int compare(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode;
        FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode2;
        if (focusTargetModifierNode3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (focusTargetModifierNode4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i10 = 0;
        if (C8698q.m16946d(focusTargetModifierNode3) && C8698q.m16946d(focusTargetModifierNode4)) {
            NodeCoordinator nodeCoordinator = focusTargetModifierNode3.f3332g;
            LayoutNode layoutNodeM2128r = null;
            LayoutNode layoutNodeM2128r2 = nodeCoordinator != null ? nodeCoordinator.f3844g : null;
            if (layoutNodeM2128r2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            NodeCoordinator nodeCoordinator2 = focusTargetModifierNode4.f3332g;
            if (nodeCoordinator2 != null) {
                layoutNodeM2128r = nodeCoordinator2.f3844g;
            }
            if (layoutNodeM2128r == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (C5207g.m11106a(layoutNodeM2128r2, layoutNodeM2128r)) {
                return 0;
            }
            Object[] objArrCopyOf = new LayoutNode[16];
            int i11 = 0;
            while (layoutNodeM2128r2 != null) {
                int i12 = i11 + 1;
                if (objArrCopyOf.length < i12) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                    C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                }
                if (i11 != 0) {
                    C9322j.m17673a0(0 + 1, 0, i11, objArrCopyOf, objArrCopyOf);
                }
                objArrCopyOf[0] = layoutNodeM2128r2;
                i11++;
                layoutNodeM2128r2 = layoutNodeM2128r2.m2128r();
            }
            Object[] objArrCopyOf2 = new LayoutNode[16];
            int i13 = 0;
            while (layoutNodeM2128r != null) {
                int i14 = i13 + 1;
                if (objArrCopyOf2.length < i14) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i14, objArrCopyOf2.length * 2));
                    C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
                }
                if (i13 != 0) {
                    C9322j.m17673a0(0 + 1, 0, i13, objArrCopyOf2, objArrCopyOf2);
                }
                objArrCopyOf2[0] = layoutNodeM2128r;
                i13++;
                layoutNodeM2128r = layoutNodeM2128r.m2128r();
            }
            int iMin = Math.min(i11 - 1, i13 - 1);
            if (iMin >= 0) {
                while (C5207g.m11106a(objArrCopyOf[i10], objArrCopyOf2[i10])) {
                    if (i10 != iMin) {
                        i10++;
                    }
                }
                return C5207g.m11113h(((LayoutNode) objArrCopyOf[i10]).f3750M, ((LayoutNode) objArrCopyOf2[i10]).f3750M);
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
        }
        if (C8698q.m16946d(focusTargetModifierNode3)) {
            return -1;
        }
        return C8698q.m16946d(focusTargetModifierNode4) ? 1 : 0;
    }
}
