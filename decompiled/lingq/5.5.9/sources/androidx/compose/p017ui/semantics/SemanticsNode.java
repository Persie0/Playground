package androidx.compose.p017ui.semantics;

import ae.C0062b;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p127g1.InterfaceC5647k;
import p166i1.C6139d;
import p166i1.C6156l0;
import p166i1.InterfaceC6154k0;
import p210k1.C6569g;
import p210k1.C6571i;
import p210k1.C6572j;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8940b;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p385sf.C9000b;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNode {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6154k0 f4396a;

    /* JADX INFO: renamed from: b */
    public final boolean f4397b;

    /* JADX INFO: renamed from: c */
    public final LayoutNode f4398c;

    /* JADX INFO: renamed from: d */
    public boolean f4399d;

    /* JADX INFO: renamed from: e */
    public SemanticsNode f4400e;

    /* JADX INFO: renamed from: f */
    public final C6572j f4401f;

    /* JADX INFO: renamed from: g */
    public final int f4402g;

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsNode$a */
    public static final class C0684a extends InterfaceC0500b.c implements InterfaceC6154k0 {

        /* JADX INFO: renamed from: k */
        public final C6572j f4403k;

        public C0684a(InterfaceC2052l<? super InterfaceC6577o, C9072e> interfaceC2052l) {
            C6572j c6572j = new C6572j();
            c6572j.f37392b = false;
            c6572j.f37393c = false;
            interfaceC2052l.mo528n(c6572j);
            this.f4403k = c6572j;
        }

        @Override // p166i1.InterfaceC6154k0
        /* JADX INFO: renamed from: C */
        public final C6572j mo2078C() {
            return this.f4403k;
        }
    }

    public /* synthetic */ SemanticsNode(InterfaceC6154k0 interfaceC6154k0, boolean z10) {
        this(interfaceC6154k0, z10, C6139d.m12652e(interfaceC6154k0));
    }

    public SemanticsNode(InterfaceC6154k0 interfaceC6154k0, boolean z10, LayoutNode layoutNode) {
        C5207g.m11111f(interfaceC6154k0, "outerSemanticsNode");
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f4396a = interfaceC6154k0;
        this.f4397b = z10;
        this.f4398c = layoutNode;
        this.f4401f = C6156l0.m12666a(interfaceC6154k0);
        this.f4402g = layoutNode.f3766b;
    }

    /* JADX INFO: renamed from: a */
    public final SemanticsNode m2530a(C6569g c6569g, InterfaceC2052l<? super InterfaceC6577o, C9072e> interfaceC2052l) {
        SemanticsNode semanticsNode = new SemanticsNode(new C0684a(interfaceC2052l), false, new LayoutNode(this.f4402g + (c6569g != null ? 1000000000 : 2000000000), true));
        semanticsNode.f4399d = true;
        semanticsNode.f4400e = this;
        return semanticsNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [i1.c] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: b */
    public final NodeCoordinator m2531b() {
        Object obj;
        NodeCoordinator nodeCoordinatorM2531b;
        NodeCoordinator nodeCoordinator = null;
        if (this.f4399d) {
            SemanticsNode semanticsNodeM2537h = m2537h();
            if (semanticsNodeM2537h != null) {
                nodeCoordinatorM2531b = nodeCoordinator;
                nodeCoordinatorM2531b = semanticsNodeM2537h.m2531b();
            }
            nodeCoordinatorM2531b = nodeCoordinator;
            return nodeCoordinatorM2531b;
        }
        InterfaceC6154k0 interfaceC6154k0M16747p0 = C8573r0.m16747p0(this.f4398c);
        if (this.f4401f.f37392b) {
            obj = nodeCoordinator;
            obj = interfaceC6154k0M16747p0;
        }
        obj = nodeCoordinator;
        ?? r10 = obj;
        if (obj == null) {
            r10 = this.f4396a;
        }
        return C6139d.m12651d(r10, 8);
    }

    /* JADX INFO: renamed from: c */
    public final void m2532c(List list) {
        List<SemanticsNode> listM2542m = m2542m(false);
        int size = listM2542m.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = listM2542m.get(i10);
            if (semanticsNode.m2540k()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f4401f.f37393c) {
                semanticsNode.m2532c(list);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C8942d m2533d() {
        NodeCoordinator nodeCoordinatorM2531b = m2531b();
        if (nodeCoordinatorM2531b != null) {
            if (!nodeCoordinatorM2531b.mo2190q()) {
                nodeCoordinatorM2531b = null;
            }
            if (nodeCoordinatorM2531b != null) {
                return C5212l.m11180u(nodeCoordinatorM2531b);
            }
        }
        return C8942d.f46893e;
    }

    /* JADX INFO: renamed from: e */
    public final C8942d m2534e() {
        NodeCoordinator nodeCoordinatorM2531b = m2531b();
        C8942d c8942d = C8942d.f46893e;
        if (nodeCoordinatorM2531b == null) {
            return c8942d;
        }
        if (!nodeCoordinatorM2531b.mo2190q()) {
            nodeCoordinatorM2531b = null;
        }
        if (nodeCoordinatorM2531b == null) {
            return c8942d;
        }
        InterfaceC5647k interfaceC5647kM11143P = C5212l.m11143P(nodeCoordinatorM2531b);
        C8942d c8942dM11180u = C5212l.m11180u(nodeCoordinatorM2531b);
        NodeCoordinator nodeCoordinator = (NodeCoordinator) interfaceC5647kM11143P;
        long j10 = nodeCoordinator.f3688c;
        float f3 = (int) (j10 >> 32);
        float fM18628b = C10022j.m18628b(j10);
        float fM357j0 = C0062b.m357j0(c8942dM11180u.f46894a, 0.0f, f3);
        float fM357j1 = C0062b.m357j0(c8942dM11180u.f46895b, 0.0f, fM18628b);
        float fM357j2 = C0062b.m357j0(c8942dM11180u.f46896c, 0.0f, f3);
        float fM357j3 = C0062b.m357j0(c8942dM11180u.f46897d, 0.0f, fM18628b);
        if (fM357j0 == fM357j2) {
            return c8942d;
        }
        if (fM357j1 == fM357j3) {
            return c8942d;
        }
        long jMo2173b = nodeCoordinator.mo2173b(C7499b.m14932c(fM357j0, fM357j1));
        long jMo2173b2 = nodeCoordinator.mo2173b(C7499b.m14932c(fM357j2, fM357j1));
        long jMo2173b3 = nodeCoordinator.mo2173b(C7499b.m14932c(fM357j2, fM357j3));
        long jMo2173b4 = nodeCoordinator.mo2173b(C7499b.m14932c(fM357j0, fM357j3));
        float fM17164c = C8941c.m17164c(jMo2173b);
        float[] fArr = {C8941c.m17164c(jMo2173b2), C8941c.m17164c(jMo2173b4), C8941c.m17164c(jMo2173b3)};
        for (int i10 = 0; i10 < 3; i10++) {
            fM17164c = Math.min(fM17164c, fArr[i10]);
        }
        float fM17165d = C8941c.m17165d(jMo2173b);
        float[] fArr2 = {C8941c.m17165d(jMo2173b2), C8941c.m17165d(jMo2173b4), C8941c.m17165d(jMo2173b3)};
        for (int i11 = 0; i11 < 3; i11++) {
            fM17165d = Math.min(fM17165d, fArr2[i11]);
        }
        float fM17164c2 = C8941c.m17164c(jMo2173b);
        float[] fArr3 = {C8941c.m17164c(jMo2173b2), C8941c.m17164c(jMo2173b4), C8941c.m17164c(jMo2173b3)};
        for (int i12 = 0; i12 < 3; i12++) {
            fM17164c2 = Math.max(fM17164c2, fArr3[i12]);
        }
        float fM17165d2 = C8941c.m17165d(jMo2173b);
        float[] fArr4 = {C8941c.m17165d(jMo2173b2), C8941c.m17165d(jMo2173b4), C8941c.m17165d(jMo2173b3)};
        for (int i13 = 0; i13 < 3; i13++) {
            fM17165d2 = Math.max(fM17165d2, fArr4[i13]);
        }
        return new C8942d(fM17164c, fM17165d, fM17164c2, fM17165d2);
    }

    /* JADX INFO: renamed from: f */
    public final List<SemanticsNode> m2535f(boolean z10, boolean z11) {
        if (!z10 && this.f4401f.f37393c) {
            return EmptyList.f38032a;
        }
        if (!m2540k()) {
            return m2542m(z11);
        }
        ArrayList arrayList = new ArrayList();
        m2532c(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final C6572j m2536g() {
        boolean zM2540k = m2540k();
        C6572j c6572j = this.f4401f;
        if (!zM2540k) {
            return c6572j;
        }
        c6572j.getClass();
        C6572j c6572j2 = new C6572j();
        c6572j2.f37392b = c6572j.f37392b;
        c6572j2.f37393c = c6572j.f37393c;
        c6572j2.f37391a.putAll(c6572j.f37391a);
        m2541l(c6572j2);
        return c6572j2;
    }

    /* JADX INFO: renamed from: h */
    public final SemanticsNode m2537h() {
        SemanticsNode semanticsNode = this.f4400e;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        boolean z10 = this.f4397b;
        LayoutNode layoutNode = this.f4398c;
        LayoutNode layoutNodeM16723f0 = z10 ? C8573r0.m16723f0(layoutNode, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            /* JADX WARN: Code duplicated, block: B:9:0x0022  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(LayoutNode layoutNode2) {
                boolean z11;
                C6572j c6572jM12666a;
                LayoutNode layoutNode3 = layoutNode2;
                C5207g.m11111f(layoutNode3, "it");
                InterfaceC6154k0 interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNode3);
                if (interfaceC6154k0M16750q0 != null && (c6572jM12666a = C6156l0.m12666a(interfaceC6154k0M16750q0)) != null) {
                    z11 = c6572jM12666a.f37392b;
                }
                return Boolean.valueOf(z11);
            }
        }) : null;
        if (layoutNodeM16723f0 == null) {
            layoutNodeM16723f0 = C8573r0.m16723f0(layoutNode, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(LayoutNode layoutNode2) {
                    LayoutNode layoutNode3 = layoutNode2;
                    C5207g.m11111f(layoutNode3, "it");
                    return Boolean.valueOf(C8573r0.m16750q0(layoutNode3) != null);
                }
            });
        }
        InterfaceC6154k0 interfaceC6154k0M16750q0 = layoutNodeM16723f0 != null ? C8573r0.m16750q0(layoutNodeM16723f0) : null;
        if (interfaceC6154k0M16750q0 == null) {
            return null;
        }
        return new SemanticsNode(interfaceC6154k0M16750q0, z10, C6139d.m12652e(interfaceC6154k0M16750q0));
    }

    /* JADX INFO: renamed from: i */
    public final List<SemanticsNode> m2538i() {
        return m2535f(false, true);
    }

    /* JADX INFO: renamed from: j */
    public final C8942d m2539j() {
        InterfaceC6154k0 interfaceC6154k0M16747p0;
        if (!this.f4401f.f37392b || (interfaceC6154k0M16747p0 = C8573r0.m16747p0(this.f4398c)) == null) {
            interfaceC6154k0M16747p0 = this.f4396a;
        }
        C5207g.m11111f(interfaceC6154k0M16747p0, "<this>");
        boolean z10 = interfaceC6154k0M16747p0.mo1934v().f3335j;
        C8942d c8942d = C8942d.f46893e;
        if (!z10) {
            return c8942d;
        }
        if (!(SemanticsConfigurationKt.m2529a(interfaceC6154k0M16747p0.mo2078C(), C6571i.f37373b) != null)) {
            return C5212l.m11180u(C6139d.m12651d(interfaceC6154k0M16747p0, 8));
        }
        NodeCoordinator nodeCoordinatorM12651d = C6139d.m12651d(interfaceC6154k0M16747p0, 8);
        if (!nodeCoordinatorM12651d.mo2190q()) {
            return c8942d;
        }
        InterfaceC5647k interfaceC5647kM11143P = C5212l.m11143P(nodeCoordinatorM12651d);
        C8940b c8940b = nodeCoordinatorM12651d.f3839P;
        if (c8940b == null) {
            c8940b = new C8940b();
            nodeCoordinatorM12651d.f3839P = c8940b;
        }
        long jM2168W0 = nodeCoordinatorM12651d.m2168W0(nodeCoordinatorM12651d.m2177d1());
        c8940b.f46884a = -C8944f.m17177d(jM2168W0);
        c8940b.f46885b = -C8944f.m17175b(jM2168W0);
        c8940b.f46886c = C8944f.m17177d(jM2168W0) + nodeCoordinatorM12651d.mo2055e0();
        c8940b.f46887d = C8944f.m17175b(jM2168W0) + nodeCoordinatorM12651d.mo2054X();
        while (nodeCoordinatorM12651d != interfaceC5647kM11143P) {
            nodeCoordinatorM12651d.m2193s1(c8940b, false, true);
            if (c8940b.m17161b()) {
                return c8942d;
            }
            nodeCoordinatorM12651d = nodeCoordinatorM12651d.f3846i;
            C5207g.m11108c(nodeCoordinatorM12651d);
        }
        return new C8942d(c8940b.f46884a, c8940b.f46885b, c8940b.f46886c, c8940b.f46887d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2540k() {
        return this.f4397b && this.f4401f.f37392b;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: l */
    public final void m2541l(C6572j c6572j) {
        if (!this.f4401f.f37393c) {
            List<SemanticsNode> listM2542m = m2542m(false);
            int size = listM2542m.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode = listM2542m.get(i10);
                if (!semanticsNode.m2540k()) {
                    C6572j c6572j2 = semanticsNode.f4401f;
                    C5207g.m11111f(c6572j2, "child");
                    for (Map.Entry entry : c6572j2.f37391a.entrySet()) {
                        C0685a c0685a = (C0685a) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = c6572j.f37391a;
                        Object obj = linkedHashMap.get(c0685a);
                        C5207g.m11109d(c0685a, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objMo1337m0 = c0685a.f4446b.mo1337m0((T) obj, (T) value);
                        if (objMo1337m0 != null) {
                            linkedHashMap.put(c0685a, objMo1337m0);
                        }
                    }
                    semanticsNode.m2541l(c6572j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final List<SemanticsNode> m2542m(boolean z10) {
        if (this.f4399d) {
            return EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C8573r0.m16727h0(this.f4398c, arrayList2);
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new SemanticsNode((InterfaceC6154k0) arrayList2.get(i10), this.f4397b));
        }
        if (z10) {
            C0685a<C6569g> c0685a = SemanticsProperties.f4424q;
            C6572j c6572j = this.f4401f;
            final C6569g c6569g = (C6569g) SemanticsConfigurationKt.m2529a(c6572j, c0685a);
            if (c6569g != null && c6572j.f37392b && (!arrayList.isEmpty())) {
                arrayList.add(m2530a(c6569g, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                        C5207g.m11111f(interfaceC6577o2, "$this$fakeSemanticsNode");
                        C6576n.m13167a(interfaceC6577o2, c6569g.f37368a);
                        return C9072e.f47360a;
                    }
                }));
            }
            C0685a<List<String>> c0685a2 = SemanticsProperties.f4408a;
            if (c6572j.m13163f(c0685a2) && (!arrayList.isEmpty()) && c6572j.f37392b) {
                List list = (List) SemanticsConfigurationKt.m2529a(c6572j, c0685a2);
                final String str = list != null ? (String) C6752c.m13425S(list) : null;
                if (str != null) {
                    arrayList.add(0, m2530a(null, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                            InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                            C5207g.m11111f(interfaceC6577o2, "$this$fakeSemanticsNode");
                            InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                            String str2 = str;
                            C5207g.m11111f(str2, "value");
                            interfaceC6577o2.mo13162a(SemanticsProperties.f4408a, C9000b.m17251q(str2));
                            return C9072e.f47360a;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }
}
