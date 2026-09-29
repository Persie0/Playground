package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import mn.C7646c;
import p249lo.C7413f;
import p249lo.InterfaceC7415h;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeAnnotations implements InterfaceC9077e {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC9077e> f38479a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends InterfaceC9077e> list) {
        C5207g.m11111f(list, "delegates");
        this.f38479a = list;
    }

    public CompositeAnnotations(InterfaceC9077e... interfaceC9077eArr) {
        this((List<? extends InterfaceC9077e>) C6744b.m13391w0(interfaceC9077eArr));
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(final C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return (InterfaceC9075c) C7073a.m14259T2(C7073a.m14262W2(C6752c.m13413G(this.f38479a), new InterfaceC2052l<InterfaceC9077e, InterfaceC9075c>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$findAnnotation$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC9075c mo528n(InterfaceC9077e interfaceC9077e) {
                InterfaceC9077e interfaceC9077e2 = interfaceC9077e;
                C5207g.m11111f(interfaceC9077e2, "it");
                return interfaceC9077e2.mo5291h(c7646c);
            }
        }));
    }

    @Override // sm.InterfaceC9077e
    public final boolean isEmpty() {
        List<InterfaceC9077e> list = this.f38479a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9077e) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        return new C7413f.a(C7073a.m14260U2(C6752c.m13413G(this.f38479a), new InterfaceC2052l<InterfaceC9077e, InterfaceC7415h<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.iterator.1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC7415h<? extends InterfaceC9075c> mo528n(InterfaceC9077e interfaceC9077e) {
                InterfaceC9077e interfaceC9077e2 = interfaceC9077e;
                C5207g.m11111f(interfaceC9077e2, "it");
                return C6752c.m13413G(interfaceC9077e2);
            }
        }));
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        Iterator<Object> it = C6752c.m13413G(this.f38479a).iterator();
        while (it.hasNext()) {
            if (((InterfaceC9077e) it.next()).mo5292x(c7646c)) {
                return true;
            }
        }
        return false;
    }
}
