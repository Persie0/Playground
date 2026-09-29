package p351r0;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusStateImpl;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import p166i1.C6139d;
import p166i1.C6166u;

/* JADX INFO: renamed from: r0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8687f {

    /* JADX INFO: renamed from: r0.f$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46278a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46278a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[LOOP:1: B:14:0x004b->B:27:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002c -> B:9:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final androidx.compose.p017ui.focus.FocusStateImpl m16939a(p351r0.InterfaceC8686e r6) {
        /*
            androidx.compose.ui.b$c r4 = r6.mo1934v()
            r0 = r4
            boolean r0 = r0.f3335j
            java.lang.String r5 = "Modded by Timozhai and secure with Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r0 == 0) goto L7e
            f0.f r0 = new f0.f
            r4 = 16
            r1 = r4
            androidx.compose.ui.b$c[] r1 = new androidx.compose.p017ui.InterfaceC0500b.c[r1]
            r0.<init>(r1)
            r5 = 1
            androidx.compose.ui.b$c r1 = r6.mo1934v()
            androidx.compose.ui.b$c r1 = r1.f3330e
            r5 = 2
            if (r1 != 0) goto L29
            androidx.compose.ui.b$c r4 = r6.mo1934v()
            r6 = r4
            p166i1.C6139d.m12648a(r0, r6)
            r5 = 4
            goto L2d
        L29:
            r0.m11687b(r1)
        L2c:
            r5 = 1
        L2d:
            boolean r6 = r0.m11695l()
            if (r6 == 0) goto L7a
            int r6 = r0.f34019c
            r4 = 1
            r1 = r4
            int r6 = r6 - r1
            java.lang.Object r4 = r0.m11697n(r6)
            r6 = r4
            androidx.compose.ui.b$c r6 = (androidx.compose.p017ui.InterfaceC0500b.c) r6
            int r2 = r6.f3328c
            r5 = 5
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L4b
            r5 = 5
            p166i1.C6139d.m12648a(r0, r6)
            goto L2d
        L4b:
            if (r6 == 0) goto L2c
            r5 = 2
            int r2 = r6.f3327b
            r5 = 5
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L76
            boolean r2 = r6 instanceof androidx.compose.p017ui.focus.FocusTargetModifierNode
            if (r2 == 0) goto L2c
            r5 = 5
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.p017ui.focus.FocusTargetModifierNode) r6
            r5 = 3
            androidx.compose.ui.focus.FocusStateImpl r6 = r6.f3392k
            r5 = 1
            int[] r2 = p351r0.C8687f.a.f46278a
            r5 = 4
            int r4 = r6.ordinal()
            r3 = r4
            r2 = r2[r3]
            r5 = 4
            if (r2 == r1) goto L75
            r5 = 5
            r1 = 2
            if (r2 == r1) goto L75
            r1 = 3
            if (r2 == r1) goto L75
            goto L2d
        L75:
            return r6
        L76:
            r5 = 4
            androidx.compose.ui.b$c r6 = r6.f3330e
            goto L4b
        L7a:
            androidx.compose.ui.focus.FocusStateImpl r6 = androidx.compose.p017ui.focus.FocusStateImpl.Inactive
            r5 = 4
            return r6
        L7e:
            r5 = 2
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r4 = "Check failed."
            r0 = r4
            java.lang.String r4 = r0.toString()
            r0 = r4
            r6.<init>(r0)
            r5 = 1
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p351r0.C8687f.m16939a(r0.e):androidx.compose.ui.focus.FocusStateImpl");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final void m16940b(FocusTargetModifierNode focusTargetModifierNode) {
        C6166u c6166u;
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        InterfaceC0500b.c cVar = focusTargetModifierNode.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        LayoutNode layoutNodeM12652e = C6139d.m12652e(focusTargetModifierNode);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 5120) != 0) {
                while (cVar2 != null) {
                    int i10 = cVar2.f3327b;
                    if ((i10 & 5120) != 0) {
                        if ((i10 & 1024) != 0) {
                            return;
                        }
                        if (!(cVar2 instanceof InterfaceC8686e)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        InterfaceC8686e interfaceC8686e = (InterfaceC8686e) cVar2;
                        interfaceC8686e.mo2095w(m16939a(interfaceC8686e));
                    }
                    cVar2 = cVar2.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar2 = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
    }
}
