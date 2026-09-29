package p420um;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8866x;
import p372rm.InterfaceC8867y;

/* JADX INFO: renamed from: um.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C9579m implements InterfaceC8867y {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC8866x> f49219a;

    /* JADX INFO: renamed from: b */
    public final String f49220b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9579m(List<? extends InterfaceC8866x> list, String str) {
        C5207g.m11111f(list, "providers");
        C5207g.m11111f(str, "debugName");
        this.f49219a = list;
        this.f49220b = str;
        list.size();
        C6752c.m13457y0(list).size();
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: a */
    public final boolean mo13605a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        List<InterfaceC8866x> list = this.f49219a;
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!C0062b.m406v1((InterfaceC8866x) it.next(), c7646c)) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC8865w> mo13606b(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8866x> it = this.f49219a.iterator();
        while (it.hasNext()) {
            C0062b.m373n0(it.next(), c7646c, arrayList);
        }
        return C6752c.m13453u0(arrayList);
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: c */
    public final void mo13607c(C7646c c7646c, ArrayList arrayList) {
        C5207g.m11111f(c7646c, "fqName");
        Iterator<InterfaceC8866x> it = this.f49219a.iterator();
        while (it.hasNext()) {
            C0062b.m373n0(it.next(), c7646c, arrayList);
        }
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: t */
    public final Collection<C7646c> mo13608t(C7646c c7646c, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC8866x> it = this.f49219a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mo13608t(c7646c, interfaceC2052l));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f49220b;
    }
}
