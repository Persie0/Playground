package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import gn.InterfaceC5827g;
import gn.InterfaceC5829i;
import gn.InterfaceC5830j;
import gn.InterfaceC5834n;
import gn.InterfaceC5836p;
import gn.InterfaceC5837q;
import gn.InterfaceC5842v;
import gn.InterfaceC5843w;
import gn.InterfaceC5846z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.sequences.C7073a;
import mn.C7646c;
import mn.C7648e;
import p078dn.InterfaceC5215a;
import p249lo.C7412e;
import p260m8.C7499b;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassDeclaredMemberIndex implements InterfaceC5215a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5827g f38679a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<InterfaceC5836p, Boolean> f38680b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<InterfaceC5837q, Boolean> f38681c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f38682d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f38683e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f38684f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(InterfaceC5827g interfaceC5827g, InterfaceC2052l<? super InterfaceC5836p, Boolean> interfaceC2052l) {
        C5207g.m11111f(interfaceC5827g, "jClass");
        C5207g.m11111f(interfaceC2052l, "memberFilter");
        this.f38679a = interfaceC5827g;
        this.f38680b = interfaceC2052l;
        InterfaceC2052l<InterfaceC5837q, Boolean> interfaceC2052l2 = new InterfaceC2052l<InterfaceC5837q, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC5837q interfaceC5837q) {
                boolean z10;
                boolean zIsEmpty;
                C7646c c7646cMo12252e;
                InterfaceC5837q interfaceC5837q2 = interfaceC5837q;
                C5207g.m11111f(interfaceC5837q2, "m");
                boolean z11 = false;
                if (this.f38685b.f38680b.mo528n(interfaceC5837q2).booleanValue()) {
                    if (interfaceC5837q2.mo12272o().mo12248O()) {
                        String strM15235f = interfaceC5837q2.mo12280a().m15235f();
                        int iHashCode = strM15235f.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strM15235f.equals("hashCode")) {
                                }
                            } else if (strM15235f.equals("equals")) {
                                InterfaceC5846z interfaceC5846z = (InterfaceC5846z) C6752c.m13445m0(interfaceC5837q2.mo12274i());
                                InterfaceC5830j interfaceC5830j = null;
                                InterfaceC5843w interfaceC5843wMo12290c = interfaceC5846z != null ? interfaceC5846z.mo12290c() : null;
                                if (interfaceC5843wMo12290c instanceof InterfaceC5830j) {
                                    interfaceC5830j = (InterfaceC5830j) interfaceC5843wMo12290c;
                                }
                                if (interfaceC5830j != null) {
                                    InterfaceC5829i interfaceC5829iMo12264g = interfaceC5830j.mo12264g();
                                    if ((interfaceC5829iMo12264g instanceof InterfaceC5827g) && (c7646cMo12252e = ((InterfaceC5827g) interfaceC5829iMo12264g).mo12252e()) != null && C5207g.m11106a(c7646cMo12252e.m15214b(), "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                        } else {
                            zIsEmpty = strM15235f.equals("toString") ? interfaceC5837q2.mo12274i().isEmpty() : false;
                        }
                        if (zIsEmpty) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }
        };
        this.f38681c = interfaceC2052l2;
        C7412e c7412eM14255P2 = C7073a.m14255P2(C6752c.m13413G(interfaceC5827g.mo12245B()), interfaceC2052l2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7412e.a aVar = new C7412e.a(c7412eM14255P2);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            C7648e c7648eMo12280a = ((InterfaceC5837q) next).mo12280a();
            Object arrayList = linkedHashMap.get(c7648eMo12280a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c7648eMo12280a, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f38682d = linkedHashMap;
        C7412e c7412eM14255P3 = C7073a.m14255P2(C6752c.m13413G(this.f38679a.mo12258v()), this.f38680b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C7412e.a aVar2 = new C7412e.a(c7412eM14255P3);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((InterfaceC5834n) next2).mo12280a(), next2);
        }
        this.f38683e = linkedHashMap2;
        ArrayList arrayListMo12254n = this.f38679a.mo12254n();
        InterfaceC2052l<InterfaceC5836p, Boolean> interfaceC2052l3 = this.f38680b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListMo12254n) {
            if (interfaceC2052l3.mo528n((InterfaceC5836p) obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM14941g0 < 16 ? 16 : iM14941g0);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((InterfaceC5842v) obj2).mo12280a(), obj2);
        }
        this.f38684f = linkedHashMap3;
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11202a() {
        C7412e c7412eM14255P2 = C7073a.m14255P2(C6752c.m13413G(this.f38679a.mo12245B()), this.f38681c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7412e.a aVar = new C7412e.a(c7412eM14255P2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((InterfaceC5837q) aVar.next()).mo12280a());
        }
        return linkedHashSet;
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: b */
    public final InterfaceC5842v mo11203b(C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        return (InterfaceC5842v) this.f38684f.get(c7648e);
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: c */
    public final Set<C7648e> mo11204c() {
        return this.f38684f.keySet();
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: d */
    public final Collection<InterfaceC5837q> mo11205d(C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        List list = (List) this.f38682d.get(c7648e);
        return list != null ? list : EmptyList.f38032a;
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: e */
    public final Set<C7648e> mo11206e() {
        C7412e c7412eM14255P2 = C7073a.m14255P2(C6752c.m13413G(this.f38679a.mo12258v()), this.f38680b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7412e.a aVar = new C7412e.a(c7412eM14255P2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((InterfaceC5834n) aVar.next()).mo12280a());
        }
        return linkedHashSet;
    }

    @Override // p078dn.InterfaceC5215a
    /* JADX INFO: renamed from: f */
    public final InterfaceC5834n mo11207f(C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        return (InterfaceC5834n) this.f38683e.get(c7648e);
    }
}
