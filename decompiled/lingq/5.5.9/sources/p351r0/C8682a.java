package p351r0;

import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.layout.BeyondBoundsLayoutKt;
import cm.InterfaceC2052l;
import p127g1.InterfaceC5638b;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8682a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final <T> T m16936a(FocusTargetModifierNode focusTargetModifierNode, int i10, InterfaceC2052l<? super InterfaceC5638b.a, ? extends T> interfaceC2052l) {
        InterfaceC5638b interfaceC5638b = (InterfaceC5638b) focusTargetModifierNode.mo2083c(BeyondBoundsLayoutKt.f3664a);
        if (interfaceC5638b == null) {
            return null;
        }
        if (!(i10 == 5)) {
            if (!(i10 == 6)) {
                if (!(i10 == 3)) {
                    if (!(i10 == 4)) {
                        if (!(i10 == 1)) {
                            if (!(i10 == 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                        }
                    }
                }
            }
        }
        return (T) interfaceC5638b.m12010a();
    }
}
