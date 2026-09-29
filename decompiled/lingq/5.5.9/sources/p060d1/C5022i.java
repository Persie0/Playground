package p060d1;

import androidx.compose.p017ui.input.pointer.PointerEventPass;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p105f0.C5458f;
import p127g1.InterfaceC5647k;
import p166i1.C6139d;
import p166i1.C6148h0;
import p166i1.InterfaceC6146g0;
import p338qd.C8573r0;
import p375s0.C8941c;

/* JADX INFO: renamed from: d1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5022i extends C5023j {

    /* JADX INFO: renamed from: b */
    public final InterfaceC6146g0 f32823b;

    /* JADX INFO: renamed from: c */
    public final C5458f<C5027n> f32824c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f32825d;

    /* JADX INFO: renamed from: e */
    public NodeCoordinator f32826e;

    /* JADX INFO: renamed from: f */
    public C5024k f32827f;

    /* JADX INFO: renamed from: g */
    public boolean f32828g;

    /* JADX INFO: renamed from: h */
    public boolean f32829h;

    /* JADX INFO: renamed from: i */
    public boolean f32830i;

    public C5022i(InterfaceC6146g0 interfaceC6146g0) {
        C5207g.m11111f(interfaceC6146g0, "pointerInputNode");
        this.f32823b = interfaceC6146g0;
        this.f32824c = new C5458f<>(new C5027n[16]);
        this.f32825d = new LinkedHashMap();
        this.f32829h = true;
        this.f32830i = true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0224 A[EDGE_INSN: B:105:0x0224->B:106:0x0225 BREAK  A[LOOP:4: B:99:0x0206->B:103:0x021f]] */
    /* JADX WARN: Code duplicated, block: B:109:0x022a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc A[ADDED_TO_REGION] */
    @Override // p060d1.C5023j
    /* JADX INFO: renamed from: a */
    public final boolean mo10705a(Map<C5027n, C5028o> map, InterfaceC5647k interfaceC5647k, C5019f c5019f, boolean z10) {
        LinkedHashMap linkedHashMap;
        C5458f<C5027n> c5458f;
        C5028o c5028o;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        boolean z17;
        int i11;
        boolean z18;
        boolean z19;
        boolean z20;
        this = this;
        interfaceC5647k = interfaceC5647k;
        C5207g.m11111f(map, "changes");
        C5207g.m11111f(interfaceC5647k, "parentCoordinates");
        boolean zMo10705a = super.mo10705a(map, interfaceC5647k, c5019f, z10);
        InterfaceC6146g0 interfaceC6146g0 = this.f32823b;
        if (!C6148h0.m12655a(interfaceC6146g0)) {
            return true;
        }
        this.f32826e = C6139d.m12651d(interfaceC6146g0, 16);
        Iterator<Map.Entry<C5027n, C5028o>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f32825d;
            c5458f = this.f32824c;
            int i12 = 0;
            if (!zHasNext) {
                break;
            }
            Map.Entry<C5027n, C5028o> next = it.next();
            long j10 = next.getKey().f32834a;
            C5028o value = next.getValue();
            if (c5458f.m11692i(new C5027n(j10))) {
                ArrayList arrayList = new ArrayList();
                List list = value.f32845k;
                if (list == null) {
                    list = EmptyList.f38032a;
                }
                int size = list.size();
                while (i12 < size) {
                    C5018e c5018e = (C5018e) list.get(i12);
                    List list2 = list;
                    long j11 = c5018e.f32810a;
                    Iterator<Map.Entry<C5027n, C5028o>> it2 = it;
                    NodeCoordinator nodeCoordinator = this.f32826e;
                    C5207g.m11108c(nodeCoordinator);
                    arrayList.add(new C5018e(j11, nodeCoordinator.m2186m1(interfaceC5647k, c5018e.f32811b)));
                    i12++;
                    list = list2;
                    size = size;
                    it = it2;
                    zMo10705a = zMo10705a;
                }
                boolean z21 = zMo10705a;
                Iterator<Map.Entry<C5027n, C5028o>> it3 = it;
                C5027n c5027n = new C5027n(j10);
                NodeCoordinator nodeCoordinator2 = this.f32826e;
                C5207g.m11108c(nodeCoordinator2);
                long jM2186m1 = nodeCoordinator2.m2186m1(interfaceC5647k, value.f32840f);
                NodeCoordinator nodeCoordinator3 = this.f32826e;
                C5207g.m11108c(nodeCoordinator3);
                long jM2186m2 = nodeCoordinator3.m2186m1(interfaceC5647k, value.f32837c);
                long j12 = value.f32835a;
                long j13 = value.f32836b;
                boolean z22 = value.f32838d;
                long j14 = value.f32839e;
                boolean z23 = value.f32841g;
                int i13 = value.f32842h;
                long j15 = value.f32843i;
                Float f3 = value.f32844j;
                C5028o c5028o2 = new C5028o(j12, j13, jM2186m2, z22, f3 != null ? f3.floatValue() : 0.0f, j14, jM2186m1, z23, i13, arrayList, j15);
                c5028o2.f32846l = value.f32846l;
                linkedHashMap.put(c5027n, c5028o2);
                it = it3;
                zMo10705a = z21;
            }
        }
        boolean z24 = zMo10705a;
        if (linkedHashMap.isEmpty()) {
            c5458f.m11691h();
            this.f32831a.m11691h();
            return true;
        }
        for (int i14 = c5458f.f34019c - 1; -1 < i14; i14--) {
            if (!map.containsKey(new C5027n(c5458f.f34017a[i14].f32834a))) {
                c5458f.m11697n(i14);
            }
        }
        C5024k c5024k = new C5024k(C6752c.m13453u0(linkedHashMap.values()), c5019f);
        List<C5028o> list3 = c5024k.f32832a;
        int size2 = list3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                c5028o = null;
                break;
            }
            c5028o = list3.get(i15);
            if (c5019f.m10700b(c5028o.f32835a)) {
                break;
            }
            i15++;
        }
        C5028o c5028o3 = c5028o;
        if (c5028o3 != null) {
            boolean z25 = c5028o3.f32838d;
            if (z10) {
                if (!this.f32829h && (z25 || c5028o3.f32841g)) {
                    NodeCoordinator nodeCoordinator4 = this.f32826e;
                    C5207g.m11108c(nodeCoordinator4);
                    boolean zM16664B0 = C8573r0.m16664B0(c5028o3, nodeCoordinator4.f3688c);
                    z11 = true;
                    this.f32829h = !zM16664B0;
                }
                z14 = this.f32829h;
                z15 = this.f32828g;
                if (z14 == z15) {
                    i10 = c5024k.f32833b;
                    if (i10 == 4) {
                        z16 = z11;
                    } else {
                        z16 = false;
                    }
                    if (z16 || !z15 || this.f32830i) {
                        if (i10 == 5) {
                            z17 = z11;
                        } else {
                            z17 = false;
                        }
                        if (z17 && z14 && z25) {
                            c5024k.f32833b = 3;
                        }
                    } else {
                        c5024k.f32833b = 3;
                    }
                } else {
                    i11 = c5024k.f32833b;
                    if (i11 == 3) {
                        z18 = z11;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        if (i11 == 4) {
                            z19 = z11;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            if (i11 == 5) {
                                z20 = z11;
                            } else {
                                z20 = false;
                            }
                            if (z20) {
                                i10 = c5024k.f32833b;
                                if (i10 == 4) {
                                    z16 = z11;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    if (i10 == 5) {
                                        z17 = z11;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        c5024k.f32833b = 3;
                                    }
                                } else {
                                    if (i10 == 5) {
                                        z17 = z11;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        c5024k.f32833b = 3;
                                    }
                                }
                            }
                        }
                    }
                    c5024k.f32833b = z14 ? 4 : 5;
                }
            } else {
                this.f32829h = false;
            }
            z11 = true;
            z14 = this.f32829h;
            z15 = this.f32828g;
            if (z14 == z15) {
                i10 = c5024k.f32833b;
                if (i10 == 4) {
                    z16 = z11;
                } else {
                    z16 = false;
                }
                if (z16) {
                    if (i10 == 5) {
                        z17 = z11;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        c5024k.f32833b = 3;
                    }
                } else {
                    if (i10 == 5) {
                        z17 = z11;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        c5024k.f32833b = 3;
                    }
                }
            } else {
                i11 = c5024k.f32833b;
                if (i11 == 3) {
                    z18 = z11;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    if (i11 == 4) {
                        z19 = z11;
                    } else {
                        z19 = false;
                    }
                    if (!z19) {
                        if (i11 == 5) {
                            z20 = z11;
                        } else {
                            z20 = false;
                        }
                        if (z20) {
                            i10 = c5024k.f32833b;
                            if (i10 == 4) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (i10 == 5) {
                                    z17 = z11;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    c5024k.f32833b = 3;
                                }
                            } else {
                                if (i10 == 5) {
                                    z17 = z11;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    c5024k.f32833b = 3;
                                }
                            }
                        }
                    }
                }
                c5024k.f32833b = z14 ? 4 : 5;
            }
        } else {
            z11 = true;
        }
        if (z24) {
            z12 = z11;
        } else if (c5024k.f32833b == 3 ? z11 : false) {
            C5024k c5024k2 = this.f32827f;
            if (c5024k2 == null) {
                z13 = z11;
                break;
            }
            List<C5028o> list4 = c5024k2.f32832a;
            if (list4.size() != list3.size()) {
                z13 = z11;
                break;
            }
            int size3 = list3.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size3) {
                    z13 = false;
                    break;
                }
                if (!C8941c.m17162a(list4.get(i16).f32837c, list3.get(i16).f32837c)) {
                    z13 = z11;
                    break;
                }
                i16++;
            }
            if (z13) {
                z12 = z11;
            } else {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        this.f32827f = c5024k;
        return z12;
    }

    @Override // p060d1.C5023j
    /* JADX INFO: renamed from: b */
    public final void mo10706b(C5019f c5019f) {
        super.mo10706b(c5019f);
        C5024k c5024k = this.f32827f;
        if (c5024k == null) {
            return;
        }
        this.f32828g = this.f32829h;
        List<C5028o> list = c5024k.f32832a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= size) {
                break;
            }
            C5028o c5028o = list.get(i10);
            boolean z11 = c5028o.f32838d;
            long j10 = c5028o.f32835a;
            if (z11 || (c5019f.m10700b(j10) && this.f32829h)) {
                z10 = false;
            }
            if (z10) {
                this.f32824c.m11696m(new C5027n(j10));
            }
            i10++;
        }
        this.f32829h = false;
        this.f32830i = c5024k.f32833b == 5;
    }

    @Override // p060d1.C5023j
    /* JADX INFO: renamed from: c */
    public final void mo10707c() {
        C5458f<C5022i> c5458f = this.f32831a;
        int i10 = c5458f.f34019c;
        if (i10 > 0) {
            C5022i[] c5022iArr = c5458f.f34017a;
            int i11 = 0;
            do {
                c5022iArr[i11].mo10707c();
                i11++;
            } while (i11 < i10);
        }
        this.f32823b.mo2088n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p060d1.C5023j
    /* JADX INFO: renamed from: d */
    public final boolean mo10708d(C5019f c5019f) {
        C5458f<C5022i> c5458f;
        int i10;
        LinkedHashMap linkedHashMap = this.f32825d;
        int i11 = 0;
        boolean z10 = i11;
        if (!linkedHashMap.isEmpty()) {
            InterfaceC6146g0 interfaceC6146g0 = this.f32823b;
            if (C6148h0.m12655a(interfaceC6146g0)) {
                C5024k c5024k = this.f32827f;
                C5207g.m11108c(c5024k);
                NodeCoordinator nodeCoordinator = this.f32826e;
                C5207g.m11108c(nodeCoordinator);
                interfaceC6146g0.mo2079D(c5024k, PointerEventPass.Final, nodeCoordinator.f3688c);
                if (C6148h0.m12655a(interfaceC6146g0) && (i10 = (c5458f = this.f32831a).f34019c) > 0) {
                    z10 = i11;
                    C5022i[] c5022iArr = c5458f.f34017a;
                    do {
                        c5022iArr[i11].mo10708d(c5019f);
                        i11++;
                    } while (i11 < i10);
                }
                z10 = i11;
                z10 = i11;
                z10 = 1;
            }
        }
        z10 = i11;
        mo10706b(c5019f);
        linkedHashMap.clear();
        this.f32826e = null;
        return z10;
    }

    @Override // p060d1.C5023j
    /* JADX INFO: renamed from: e */
    public final boolean mo10709e(Map<C5027n, C5028o> map, InterfaceC5647k interfaceC5647k, C5019f c5019f, boolean z10) {
        C5458f<C5022i> c5458f;
        int i10;
        C5207g.m11111f(map, "changes");
        C5207g.m11111f(interfaceC5647k, "parentCoordinates");
        LinkedHashMap linkedHashMap = this.f32825d;
        int i11 = 0;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        InterfaceC6146g0 interfaceC6146g0 = this.f32823b;
        if (!C6148h0.m12655a(interfaceC6146g0)) {
            return false;
        }
        C5024k c5024k = this.f32827f;
        C5207g.m11108c(c5024k);
        NodeCoordinator nodeCoordinator = this.f32826e;
        C5207g.m11108c(nodeCoordinator);
        long j10 = nodeCoordinator.f3688c;
        interfaceC6146g0.mo2079D(c5024k, PointerEventPass.Initial, j10);
        if (C6148h0.m12655a(interfaceC6146g0) && (i10 = (c5458f = this.f32831a).f34019c) > 0) {
            C5022i[] c5022iArr = c5458f.f34017a;
            do {
                C5022i c5022i = c5022iArr[i11];
                NodeCoordinator nodeCoordinator2 = this.f32826e;
                C5207g.m11108c(nodeCoordinator2);
                c5022i.mo10709e(linkedHashMap, nodeCoordinator2, c5019f, z10);
                i11++;
            } while (i11 < i10);
        }
        if (C6148h0.m12655a(interfaceC6146g0)) {
            interfaceC6146g0.mo2079D(c5024k, PointerEventPass.Main, j10);
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f32823b + ", children=" + this.f32831a + ", pointerIds=" + this.f32824c + ')';
    }
}
