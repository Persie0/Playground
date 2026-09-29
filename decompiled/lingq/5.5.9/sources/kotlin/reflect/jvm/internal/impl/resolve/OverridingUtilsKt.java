package kotlin.reflect.jvm.internal.impl.resolve;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import jo.C6532d;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import p001a0.C0005d;
import p001a0.InterfaceC0004c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <H> Collection<H> m14092a(Collection<? extends H> collection, InterfaceC2052l<? super H, ? extends InterfaceC6816a> interfaceC2052l) {
        C5207g.m11111f(collection, "<this>");
        C5207g.m11111f(interfaceC2052l, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C6532d c6532d = new C6532d();
        while (!linkedList.isEmpty()) {
            Object objM13423Q = C6752c.m13423Q(linkedList);
            final C6532d c6532d2 = new C6532d();
            ArrayList arrayListM14073g = OverridingUtil.m14073g(objM13423Q, linkedList, interfaceC2052l, new InterfaceC2052l<H, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Object obj) {
                    C5207g.m11110e(obj, "it");
                    c6532d2.add(obj);
                    return C9072e.f47360a;
                }
            });
            if (arrayListM14073g.size() == 1 && c6532d2.isEmpty()) {
                Object objM13442j0 = C6752c.m13442j0(arrayListM14073g);
                C5207g.m11110e(objM13442j0, "overridableGroup.single()");
                c6532d.add(objM13442j0);
            } else {
                C0005d c0005d = (Object) OverridingUtil.m14081s(arrayListM14073g, interfaceC2052l);
                InterfaceC6816a interfaceC6816aMo528n = interfaceC2052l.mo528n(c0005d);
                Iterator it = arrayListM14073g.iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC0004c interfaceC0004c = (Object) it.next();
                        C5207g.m11110e(interfaceC0004c, "it");
                        if (!OverridingUtil.m14076k(interfaceC6816aMo528n, interfaceC2052l.mo528n(interfaceC0004c))) {
                            c6532d2.add(interfaceC0004c);
                        }
                    }
                }
                if (!c6532d2.isEmpty()) {
                    c6532d.addAll(c6532d2);
                }
                c6532d.add(c0005d);
            }
        }
        return c6532d;
    }
}
