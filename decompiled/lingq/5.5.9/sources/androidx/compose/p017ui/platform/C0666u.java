package androidx.compose.p017ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.semantics.C0685a;
import androidx.compose.p017ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p017ui.semantics.SemanticsNode;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p166i1.C6156l0;
import p166i1.InterfaceC6154k0;
import p210k1.C6563a;
import p210k1.C6571i;
import p210k1.C6572j;
import p231l1.C7216j;
import p338qd.C8573r0;
import p375s0.C8942d;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0666u {
    /* JADX INFO: renamed from: a */
    public static final boolean m2483a(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), SemanticsProperties.f4416i) == null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: b */
    public static final boolean m2484b(SemanticsNode semanticsNode) {
        LayoutNode layoutNodeM2488f;
        boolean z10;
        InterfaceC6154k0 interfaceC6154k0M16750q0;
        boolean zM11106a;
        C6572j c6572jM12666a;
        if (m2490h(semanticsNode)) {
            if (C5207g.m11106a(SemanticsConfigurationKt.m2529a(semanticsNode.f4401f, SemanticsProperties.f4418k), Boolean.TRUE)) {
                layoutNodeM2488f = m2488f(semanticsNode.f4398c, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(LayoutNode layoutNode) {
                        LayoutNode layoutNode2 = layoutNode;
                        C5207g.m11111f(layoutNode2, "it");
                        InterfaceC6154k0 interfaceC6154k0M16750q1 = C8573r0.m16750q0(layoutNode2);
                        C6572j c6572jM12666a2 = interfaceC6154k0M16750q1 != null ? C6156l0.m12666a(interfaceC6154k0M16750q1) : null;
                        return Boolean.valueOf((c6572jM12666a2 != null && c6572jM12666a2.f37392b) && c6572jM12666a2.m13163f(C6571i.f37378g));
                    }
                });
                z10 = false;
                if (layoutNodeM2488f != null) {
                    interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNodeM2488f);
                    if (interfaceC6154k0M16750q0 != null || (c6572jM12666a = C6156l0.m12666a(interfaceC6154k0M16750q0)) == null) {
                        zM11106a = false;
                    } else {
                        zM11106a = C5207g.m11106a(SemanticsConfigurationKt.m2529a(c6572jM12666a, SemanticsProperties.f4418k), Boolean.TRUE);
                    }
                    if (!zM11106a) {
                    }
                }
            }
            z10 = true;
        } else {
            layoutNodeM2488f = m2488f(semanticsNode.f4398c, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(LayoutNode layoutNode) {
                    LayoutNode layoutNode2 = layoutNode;
                    C5207g.m11111f(layoutNode2, "it");
                    InterfaceC6154k0 interfaceC6154k0M16750q1 = C8573r0.m16750q0(layoutNode2);
                    C6572j c6572jM12666a2 = interfaceC6154k0M16750q1 != null ? C6156l0.m12666a(interfaceC6154k0M16750q1) : null;
                    return Boolean.valueOf((c6572jM12666a2 != null && c6572jM12666a2.f37392b) && c6572jM12666a2.m13163f(C6571i.f37378g));
                }
            });
            z10 = false;
            if (layoutNodeM2488f != null) {
                interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNodeM2488f);
                if (interfaceC6154k0M16750q0 != null) {
                    zM11106a = false;
                } else {
                    zM11106a = false;
                }
                if (!zM11106a) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2485c(SemanticsNode semanticsNode) {
        return semanticsNode.m2536g().m13163f(SemanticsProperties.f4431x);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m2486d(SemanticsNode semanticsNode) {
        return semanticsNode.f4398c.f3747J == LayoutDirection.Rtl;
    }

    /* JADX INFO: renamed from: e */
    public static final C0616d1 m2487e(int i10, ArrayList arrayList) {
        C5207g.m11111f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C0616d1) arrayList.get(i11)).f4298a == i10) {
                return (C0616d1) arrayList.get(i11);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final LayoutNode m2488f(LayoutNode layoutNode, InterfaceC2052l<? super LayoutNode, Boolean> interfaceC2052l) {
        for (LayoutNode layoutNodeM2128r = layoutNode.m2128r(); layoutNodeM2128r != null; layoutNodeM2128r = layoutNodeM2128r.m2128r()) {
            if (interfaceC2052l.mo528n(layoutNodeM2128r).booleanValue()) {
                return layoutNodeM2128r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m2489g(Region region, SemanticsNode semanticsNode, LinkedHashMap linkedHashMap, SemanticsNode semanticsNode2) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = semanticsNode2.f4398c;
        boolean z10 = false;
        boolean z11 = (layoutNode2.f3749L && layoutNode2.m2136z()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i10 = semanticsNode.f4402g;
        int i11 = semanticsNode2.f4402g;
        if (!zIsEmpty || i11 == i10) {
            if (!z11 || semanticsNode2.f4399d) {
                Rect rect = new Rect(C8573r0.m16710Y0(semanticsNode2.m2539j().f46894a), C8573r0.m16710Y0(semanticsNode2.m2539j().f46895b), C8573r0.m16710Y0(semanticsNode2.m2539j().f46896c), C8573r0.m16710Y0(semanticsNode2.m2539j().f46897d));
                Region region2 = new Region();
                region2.set(rect);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(i11);
                    Rect bounds = region2.getBounds();
                    C5207g.m11110e(bounds, "region.bounds");
                    linkedHashMap.put(numValueOf, new C0620e1(semanticsNode2, bounds));
                    List<SemanticsNode> listM2538i = semanticsNode2.m2538i();
                    for (int size = listM2538i.size() - 1; -1 < size; size--) {
                        m2489g(region, semanticsNode, linkedHashMap, listM2538i.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (!semanticsNode2.f4399d) {
                    if (i11 == -1) {
                        Integer numValueOf2 = Integer.valueOf(i11);
                        Rect bounds2 = region2.getBounds();
                        C5207g.m11110e(bounds2, "region.bounds");
                        linkedHashMap.put(numValueOf2, new C0620e1(semanticsNode2, bounds2));
                        return;
                    }
                    return;
                }
                SemanticsNode semanticsNodeM2537h = semanticsNode2.m2537h();
                if (semanticsNodeM2537h != null && (layoutNode = semanticsNodeM2537h.f4398c) != null && layoutNode.f3749L) {
                    z10 = true;
                }
                C8942d c8942dM2533d = z10 ? semanticsNodeM2537h.m2533d() : new C8942d(0.0f, 0.0f, 10.0f, 10.0f);
                linkedHashMap.put(Integer.valueOf(i11), new C0620e1(semanticsNode2, new Rect(C8573r0.m16710Y0(c8942dM2533d.f46894a), C8573r0.m16710Y0(c8942dM2533d.f46895b), C8573r0.m16710Y0(c8942dM2533d.f46896c), C8573r0.m16710Y0(c8942dM2533d.f46897d))));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m2490h(SemanticsNode semanticsNode) {
        C6572j c6572j = semanticsNode.f4401f;
        C0685a<C6563a<InterfaceC2052l<List<C7216j>, Boolean>>> c0685a = C6571i.f37372a;
        return c6572j.m13163f(C6571i.f37378g);
    }
}
