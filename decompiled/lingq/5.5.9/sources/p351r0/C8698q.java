package p351r0;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusStateImpl;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import dm.C5212l;
import p105f0.C5458f;
import p166i1.C6139d;
import p375s0.C8942d;

/* JADX INFO: renamed from: r0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C8698q {

    /* JADX INFO: renamed from: r0.q$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46281a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f46282b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46281a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f46282b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[LOOP:1: B:26:0x0070->B:34:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x007b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final androidx.compose.p017ui.focus.FocusTargetModifierNode m16943a(androidx.compose.p017ui.focus.FocusTargetModifierNode r5) {
        /*
            java.lang.String r4 = "<this>"
            r0 = r4
            dm.C5207g.m11111f(r5, r0)
            java.lang.String r4 = "Modded by Timozhai and secure with Smob - Mod obfuscation tool v4.6 by Kirlif'"
            androidx.compose.ui.focus.FocusStateImpl r0 = r5.f3392k
            r4 = 1
            int[] r1 = p351r0.C8698q.a.f46282b
            int r4 = r0.ordinal()
            r0 = r4
            r0 = r1[r0]
            r4 = 1
            r1 = 1
            r4 = 5
            if (r0 == r1) goto La0
            r4 = 2
            r4 = 2
            r2 = r4
            r3 = 0
            if (r0 == r2) goto L2f
            r4 = 3
            r1 = r4
            if (r0 == r1) goto La0
            r5 = 4
            if (r0 != r5) goto L27
            return r3
        L27:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r4 = 3
            r5.<init>()
            r4 = 3
            throw r5
        L2f:
            r4 = 7
            androidx.compose.ui.b$c r5 = r5.f3326a
            r4 = 4
            boolean r0 = r5.f3335j
            if (r0 == 0) goto L91
            f0.f r0 = new f0.f
            r4 = 16
            r2 = r4
            androidx.compose.ui.b$c[] r2 = new androidx.compose.p017ui.InterfaceC0500b.c[r2]
            r0.<init>(r2)
            androidx.compose.ui.b$c r2 = r5.f3330e
            r4 = 6
            if (r2 != 0) goto L4c
            r4 = 1
            p166i1.C6139d.m12648a(r0, r5)
            r4 = 3
            goto L50
        L4c:
            r0.m11687b(r2)
        L4f:
            r4 = 2
        L50:
            boolean r4 = r0.m11695l()
            r5 = r4
            if (r5 == 0) goto L90
            int r5 = r0.f34019c
            r4 = 3
            int r5 = r5 - r1
            r4 = 6
            java.lang.Object r4 = r0.m11697n(r5)
            r5 = r4
            androidx.compose.ui.b$c r5 = (androidx.compose.p017ui.InterfaceC0500b.c) r5
            r4 = 6
            int r2 = r5.f3328c
            r4 = 3
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L6f
            p166i1.C6139d.m12648a(r0, r5)
            goto L50
        L6f:
            r4 = 2
        L70:
            if (r5 == 0) goto L4f
            r4 = 3
            int r2 = r5.f3327b
            r4 = 4
            r2 = r2 & 1024(0x400, float:1.435E-42)
            r4 = 2
            if (r2 == 0) goto L8d
            r4 = 2
            boolean r2 = r5 instanceof androidx.compose.p017ui.focus.FocusTargetModifierNode
            r4 = 6
            if (r2 == 0) goto L4f
            r4 = 7
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p017ui.focus.FocusTargetModifierNode) r5
            r4 = 2
            androidx.compose.ui.focus.FocusTargetModifierNode r4 = m16943a(r5)
            r5 = r4
            if (r5 == 0) goto L4f
            return r5
        L8d:
            androidx.compose.ui.b$c r5 = r5.f3330e
            goto L70
        L90:
            return r3
        L91:
            r4 = 4
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r4 = 1
            java.lang.String r4 = "Check failed."
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p351r0.C8698q.m16943a(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    /* JADX INFO: renamed from: b */
    public static final C8942d m16944b(FocusTargetModifierNode focusTargetModifierNode) {
        C8942d c8942dMo2194t;
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        NodeCoordinator nodeCoordinator = focusTargetModifierNode.f3332g;
        return (nodeCoordinator == null || (c8942dMo2194t = ((NodeCoordinator) C5212l.m11143P(nodeCoordinator)).mo2194t(nodeCoordinator, false)) == null) ? C8942d.f46893e : c8942dMo2194t;
    }

    /* JADX INFO: renamed from: c */
    public static final FocusTargetModifierNode m16945c(FocusTargetModifierNode focusTargetModifierNode) {
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        InterfaceC0500b.c cVar = focusTargetModifierNode.f3326a;
        boolean z10 = cVar.f3335j;
        if (!z10) {
            return null;
        }
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar2 = cVar.f3330e;
        if (cVar2 == null) {
            C6139d.m12648a(c5458f, cVar);
        } else {
            c5458f.m11687b(cVar2);
        }
        while (c5458f.m11695l()) {
            InterfaceC0500b.c cVar3 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
            if ((cVar3.f3328c & 1024) == 0) {
                C6139d.m12648a(c5458f, cVar3);
            } else {
                while (cVar3 != null) {
                    if ((cVar3.f3327b & 1024) != 0) {
                        if (!(cVar3 instanceof FocusTargetModifierNode)) {
                            break;
                        }
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) cVar3;
                        int i10 = a.f46282b[focusTargetModifierNode2.f3392k.ordinal()];
                        if (i10 != 1 && i10 != 2 && i10 != 3) {
                            break;
                        }
                        return focusTargetModifierNode2;
                    }
                    cVar3 = cVar3.f3330e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16946d(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        NodeCoordinator nodeCoordinator = focusTargetModifierNode.f3332g;
        if ((nodeCoordinator == null || (layoutNode2 = nodeCoordinator.f3844g) == null || !layoutNode2.f3749L) ? false : true) {
            if ((nodeCoordinator == null || (layoutNode = nodeCoordinator.f3844g) == null || !layoutNode.m2136z()) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
