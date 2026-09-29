package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p105f0.C5458f;
import p127g1.InterfaceC5638b;
import p166i1.C6139d;
import p166i1.InterfaceC6137c;
import p351r0.C8682a;
import p351r0.C8698q;
import p351r0.InterfaceC8695n;
import p375s0.C8942d;

/* JADX INFO: loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$a */
    public /* synthetic */ class C0508a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3404a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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
            f3404a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e7, code lost:
    
        if (r1 < java.lang.Math.max(1.0f, r13 - r12)) goto L97;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1987a(C8942d c8942d, C8942d c8942d2, C8942d c8942d3, int i10) {
        boolean z10;
        float f3;
        float f10;
        if (!m1988b(i10, c8942d3, c8942d) && m1988b(i10, c8942d2, c8942d)) {
            boolean z11 = i10 == 3;
            float f11 = c8942d3.f46895b;
            float f12 = c8942d3.f46897d;
            float f13 = c8942d3.f46894a;
            float f14 = c8942d3.f46896c;
            float f15 = c8942d.f46897d;
            float f16 = c8942d.f46895b;
            float f17 = c8942d.f46896c;
            float f18 = c8942d.f46894a;
            if (!z11) {
                if (!(i10 == 4)) {
                    if (!(i10 == 5)) {
                        if (!(i10 == 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                        if (f15 <= f11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (f16 >= f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (f17 <= f13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (f18 >= f14) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (!(i10 == 3)) {
                    if (!(i10 == 4)) {
                        if (i10 == 3) {
                            f10 = c8942d2.f46896c;
                            f3 = f18;
                        } else {
                            if (i10 == 4) {
                                f3 = c8942d2.f46894a;
                                f10 = f17;
                            } else {
                                if (i10 == 5) {
                                    f10 = c8942d2.f46897d;
                                    f3 = f16;
                                } else {
                                    if (!(i10 == 6)) {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                    f3 = c8942d2.f46895b;
                                    f10 = f15;
                                }
                            }
                        }
                        float fMax = Math.max(0.0f, f3 - f10);
                        if (i10 == 3) {
                            f12 = f18;
                            f11 = f13;
                        } else {
                            if (i10 == 4) {
                                f12 = f14;
                                f11 = f17;
                            } else {
                                if (i10 == 5) {
                                    f12 = f16;
                                } else {
                                    if (!(i10 == 6)) {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                    f11 = f15;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1988b(int i10, C8942d c8942d, C8942d c8942d2) {
        boolean z10 = false;
        if (!((i10 == 3) || i10 == 4)) {
            if (!((i10 == 5) || i10 == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (c8942d.f46896c > c8942d2.f46894a && c8942d.f46894a < c8942d2.f46896c) {
                z10 = true;
            }
        } else if (c8942d.f46897d > c8942d2.f46895b && c8942d.f46895b < c8942d2.f46897d) {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX INFO: renamed from: c */
    public static final void m1989c(InterfaceC6137c interfaceC6137c, C5458f<FocusTargetModifierNode> c5458f) {
        boolean z10;
        C5458f<InterfaceC8695n> c5458f2;
        int i10;
        if (!interfaceC6137c.mo1934v().f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f3 = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar = interfaceC6137c.mo1934v().f3330e;
        if (cVar == null) {
            C6139d.m12648a(c5458f3, interfaceC6137c.mo1934v());
        } else {
            c5458f3.m11687b(cVar);
        }
        while (c5458f3.m11695l()) {
            InterfaceC0500b.c cVar2 = (InterfaceC0500b.c) c5458f3.m11697n(c5458f3.f34019c - 1);
            if ((cVar2.f3328c & 1024) != 0) {
                InterfaceC0500b.c cVar3 = cVar2;
                while (true) {
                    if (cVar3 != null) {
                        if ((cVar3.f3327b & 1024) != 0) {
                            if (cVar3 instanceof FocusTargetModifierNode) {
                                FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) cVar3;
                                z10 = false;
                                if (focusTargetModifierNode.m1971I().f3373a) {
                                    c5458f.m11687b(focusTargetModifierNode);
                                } else {
                                    ((FocusPropertiesImpl$enter$1) focusTargetModifierNode.m1971I().f3382j).getClass();
                                    FocusRequester focusRequester = FocusRequester.f3386b;
                                    if (C5207g.m11106a(focusRequester, focusRequester)) {
                                        focusRequester = null;
                                    }
                                    if (focusRequester == null) {
                                        z10 = true;
                                    } else if (!C5207g.m11106a(focusRequester, FocusRequester.f3387c) && (i10 = (c5458f2 = focusRequester.f3388a).f34019c) > 0) {
                                        InterfaceC8695n[] interfaceC8695nArr = c5458f2.f34017a;
                                        int i11 = 0;
                                        do {
                                            m1989c(interfaceC8695nArr[i11], c5458f);
                                            i11++;
                                        } while (i11 < i10);
                                    }
                                }
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                break;
                            }
                        }
                        cVar3 = cVar3.f3330e;
                    }
                }
            }
            C6139d.m12648a(c5458f3, cVar2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final FocusTargetModifierNode m1990d(C5458f<FocusTargetModifierNode> c5458f, C8942d c8942d, int i10) {
        C8942d c8942dM17172c;
        boolean z10 = i10 == 3;
        float f3 = c8942d.f46894a;
        float f10 = c8942d.f46896c;
        if (z10) {
            c8942dM17172c = c8942d.m17172c((f10 - f3) + 1, 0.0f);
        } else {
            if (i10 == 4) {
                c8942dM17172c = c8942d.m17172c(-((f10 - f3) + 1), 0.0f);
            } else {
                boolean z11 = i10 == 5;
                float f11 = c8942d.f46895b;
                float f12 = c8942d.f46897d;
                if (z11) {
                    c8942dM17172c = c8942d.m17172c(0.0f, (f12 - f11) + 1);
                } else {
                    if (!(i10 == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    c8942dM17172c = c8942d.m17172c(0.0f, -((f12 - f11) + 1));
                }
            }
        }
        int i11 = c5458f.f34019c;
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (i11 > 0) {
            FocusTargetModifierNode[] focusTargetModifierNodeArr = c5458f.f34017a;
            int i12 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNodeArr[i12];
                if (C8698q.m16946d(focusTargetModifierNode2)) {
                    C8942d c8942dM16944b = C8698q.m16944b(focusTargetModifierNode2);
                    if (m1993g(i10, c8942dM16944b, c8942d) && (!m1993g(i10, c8942dM17172c, c8942d) || m1987a(c8942d, c8942dM16944b, c8942dM17172c, i10) || (!m1987a(c8942d, c8942dM17172c, c8942dM16944b, i10) && m1994h(i10, c8942d, c8942dM16944b) < m1994h(i10, c8942d, c8942dM17172c)))) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        c8942dM17172c = c8942dM16944b;
                    }
                }
                i12++;
            } while (i12 < i11);
        }
        return focusTargetModifierNode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m1991e(FocusTargetModifierNode focusTargetModifierNode, int i10, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        C8942d c8942d;
        C5207g.m11111f(focusTargetModifierNode, "$this$findChildCorrespondingToFocusEnter");
        C5207g.m11111f(interfaceC2052l, "onFound");
        ((FocusPropertiesImpl$enter$1) focusTargetModifierNode.m1971I().f3382j).getClass();
        FocusRequester focusRequester = FocusRequester.f3386b;
        Object obj = null;
        if (C5207g.m11106a(focusRequester, focusRequester)) {
            focusRequester = null;
        }
        if (focusRequester != null) {
            if (C5207g.m11106a(focusRequester, FocusRequester.f3387c)) {
                return false;
            }
            return focusRequester.m1969a(interfaceC2052l);
        }
        C5458f c5458f = new C5458f(new FocusTargetModifierNode[16]);
        m1989c(focusTargetModifierNode, c5458f);
        boolean z10 = true;
        if (c5458f.f34019c <= 1) {
            if (!c5458f.m11694k()) {
                obj = c5458f.f34017a[0];
            }
            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) obj;
            if (focusTargetModifierNode2 != null) {
                return interfaceC2052l.mo528n(focusTargetModifierNode2).booleanValue();
            }
            return false;
        }
        if (i10 == 7) {
            i10 = 4;
        }
        if ((i10 == 4) || i10 == 6) {
            C8942d c8942dM16944b = C8698q.m16944b(focusTargetModifierNode);
            float f3 = c8942dM16944b.f46894a;
            float f10 = c8942dM16944b.f46895b;
            c8942d = new C8942d(f3, f10, f3, f10);
        } else {
            if (!(i10 == 3) && i10 != 5) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            C8942d c8942dM16944b2 = C8698q.m16944b(focusTargetModifierNode);
            float f11 = c8942dM16944b2.f46896c;
            float f12 = c8942dM16944b2.f46897d;
            c8942d = new C8942d(f11, f12, f11, f12);
        }
        FocusTargetModifierNode focusTargetModifierNodeM1990d = m1990d(c5458f, c8942d, i10);
        if (focusTargetModifierNodeM1990d != null) {
            return interfaceC2052l.mo528n(focusTargetModifierNodeM1990d).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m1992f(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i10, final InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        if (m1995i(focusTargetModifierNode, focusTargetModifierNode2, i10, interfaceC2052l)) {
            return true;
        }
        Boolean bool = (Boolean) C8682a.m16936a(focusTargetModifierNode, i10, new InterfaceC2052l<InterfaceC5638b.a, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC5638b.a aVar) {
                InterfaceC5638b.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m1995i(focusTargetModifierNode, focusTargetModifierNode2, i10, interfaceC2052l));
                if (boolValueOf.booleanValue() || !aVar2.m12011a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m1993g(int i10, C8942d c8942d, C8942d c8942d2) {
        boolean z10 = i10 == 3;
        float f3 = c8942d.f46894a;
        float f10 = c8942d.f46896c;
        float f11 = c8942d2.f46894a;
        float f12 = c8942d2.f46896c;
        if (!z10) {
            if (!(i10 == 4)) {
                boolean z11 = i10 == 5;
                float f13 = c8942d.f46895b;
                float f14 = c8942d.f46897d;
                float f15 = c8942d2.f46895b;
                float f16 = c8942d2.f46897d;
                if (!z11) {
                    if (!(i10 == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    if (f15 < f13 || f16 <= f13) {
                        if (f16 < f14) {
                            return true;
                        }
                    }
                } else if (f16 > f14 || f15 >= f14) {
                    if (f15 > f13) {
                        return true;
                    }
                }
            } else if (f11 < f3 || f12 <= f3) {
                if (f12 < f10) {
                    return true;
                }
            }
        } else if ((f12 > f10 || f11 >= f10) && f11 > f3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final long m1994h(int i10, C8942d c8942d, C8942d c8942d2) {
        float f3;
        float f10;
        float f11;
        float f12;
        boolean z10 = i10 == 3;
        float f13 = c8942d.f46897d;
        float f14 = c8942d.f46895b;
        float f15 = c8942d.f46896c;
        float f16 = c8942d.f46894a;
        float f17 = c8942d2.f46895b;
        float f18 = c8942d2.f46897d;
        float f19 = c8942d2.f46894a;
        float f20 = c8942d2.f46896c;
        if (z10) {
            f10 = f16;
            f3 = f20;
        } else {
            if (i10 == 4) {
                f3 = f15;
                f10 = f19;
            } else {
                if (i10 == 5) {
                    f10 = f14;
                    f3 = f18;
                } else {
                    if (!(i10 == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    f3 = f13;
                    f10 = f17;
                }
            }
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, f10 - f3));
        if ((i10 == 3) || i10 == 4) {
            f11 = 2;
            f12 = ((f13 - f14) / f11) + f14;
        } else {
            if (!((i10 == 5) || i10 == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f11 = 2;
            f12 = ((f15 - f16) / f11) + f16;
            f18 = f20;
            f17 = f19;
        }
        long jAbs2 = (long) Math.abs(f12 - (((f18 - f17) / f11) + f17));
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[LOOP:1: B:15:0x0049->B:21:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0029 A[EDGE_INSN: B:55:0x0029->B:8:0x0029 BREAK  A[LOOP:0: B:9:0x002a->B:57:0x002a, LOOP_LABEL: LOOP:0: B:9:0x002a->B:57:0x002a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0029 A[EDGE_INSN: B:56:0x0029->B:8:0x0029 BREAK  A[LOOP:0: B:9:0x002a->B:57:0x002a, LOOP_LABEL: LOOP:0: B:9:0x002a->B:57:0x002a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0029 -> B:9:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public static final boolean m1995i(androidx.compose.p017ui.focus.FocusTargetModifierNode r8, androidx.compose.p017ui.focus.FocusTargetModifierNode r9, int r10, cm.InterfaceC2052l<? super androidx.compose.p017ui.focus.FocusTargetModifierNode, java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.focus.TwoDimensionalFocusSearchKt.m1995i(androidx.compose.ui.focus.FocusTargetModifierNode, androidx.compose.ui.focus.FocusTargetModifierNode, int, cm.l):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: j */
    public static final Boolean m1996j(FocusTargetModifierNode focusTargetModifierNode, int i10, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        FocusStateImpl focusStateImpl = focusTargetModifierNode.f3392k;
        int[] iArr = C0508a.f3404a;
        int i11 = iArr[focusStateImpl.ordinal()];
        boolean z10 = true;
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m1991e(focusTargetModifierNode, i10, interfaceC2052l));
            }
            if (i11 == 4) {
                return focusTargetModifierNode.m1971I().f3373a ? (Boolean) ((FocusOwnerImpl$moveFocus$foundNextItem$1) interfaceC2052l).mo528n(focusTargetModifierNode) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
        if (focusTargetModifierNodeM16945c == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i12 = iArr[focusTargetModifierNodeM16945c.f3392k.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(m1992f(focusTargetModifierNode, focusTargetModifierNodeM16945c, i10, interfaceC2052l));
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        Boolean boolM1996j = m1996j(focusTargetModifierNodeM16945c, i10, interfaceC2052l);
        if (!C5207g.m11106a(boolM1996j, Boolean.FALSE)) {
            return boolM1996j;
        }
        ((FocusPropertiesImpl$exit$1) focusTargetModifierNodeM16945c.m1971I().f3383k).getClass();
        FocusRequester focusRequester = FocusRequester.f3386b;
        if (C5207g.m11106a(focusRequester, focusRequester)) {
            focusRequester = null;
        }
        if (focusRequester != null) {
            if (C5207g.m11106a(focusRequester, FocusRequester.f3387c)) {
                return null;
            }
            return Boolean.valueOf(focusRequester.m1969a(interfaceC2052l));
        }
        if (focusTargetModifierNodeM16945c.f3392k != FocusStateImpl.ActiveParent) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusTargetModifierNode focusTargetModifierNodeM16943a = C8698q.m16943a(focusTargetModifierNodeM16945c);
        if (focusTargetModifierNodeM16943a != null) {
            return Boolean.valueOf(m1992f(focusTargetModifierNode, focusTargetModifierNodeM16943a, i10, interfaceC2052l));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
