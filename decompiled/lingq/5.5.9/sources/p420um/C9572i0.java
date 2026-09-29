package p420um;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8868z;
import p466wn.AbstractC9980c;
import p466wn.AbstractC9984g;
import p466wn.C9981d;

/* JADX INFO: renamed from: um.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9572i0 extends AbstractC9984g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8863u f49203b;

    /* JADX INFO: renamed from: c */
    public final C7646c f49204c;

    public C9572i0(C6829c c6829c, C7646c c7646c) {
        C5207g.m11111f(c6829c, "moduleDescriptor");
        C5207g.m11111f(c7646c, "fqName");
        this.f49203b = c6829c;
        this.f49204c = c7646c;
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        InterfaceC8868z interfaceC8868zMo11873R;
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        if (!c9981d.m18557a(C9981d.f50716h)) {
            return EmptyList.f38032a;
        }
        C7646c c7646c = this.f49204c;
        if (c7646c.m15216d()) {
            if (c9981d.f50728a.contains(AbstractC9980c.b.f50710a)) {
                return EmptyList.f38032a;
            }
        }
        InterfaceC8863u interfaceC8863u = this.f49203b;
        Collection<C7646c> collectionMo11878t = interfaceC8863u.mo11878t(c7646c, interfaceC2052l);
        ArrayList arrayList = new ArrayList(collectionMo11878t.size());
        Iterator<C7646c> it = collectionMo11878t.iterator();
        while (it.hasNext()) {
            C7648e c7648eM15218f = it.next().m15218f();
            C5207g.m11110e(c7648eM15218f, "subFqName.shortName()");
            if (interfaceC2052l.mo528n(c7648eM15218f).booleanValue()) {
                if (!c7648eM15218f.f42087b) {
                    interfaceC8868zMo11873R = interfaceC8863u.mo11873R(c7646c.m15215c(c7648eM15218f));
                    if (interfaceC8868zMo11873R.isEmpty()) {
                    }
                    C0062b.m282K(interfaceC8868zMo11873R, arrayList);
                }
                interfaceC8868zMo11873R = null;
                C0062b.m282K(interfaceC8868zMo11873R, arrayList);
            }
        }
        return arrayList;
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        return EmptySet.f38034a;
    }

    public final String toString() {
        return "subpackages of " + this.f49204c + " from " + this.f49203b;
    }
}
