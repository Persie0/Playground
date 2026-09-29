package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8867y;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderImpl implements InterfaceC8867y {

    /* JADX INFO: renamed from: a */
    public final Collection<InterfaceC8865w> f38460a;

    public PackageFragmentProviderImpl(ArrayList arrayList) {
        this.f38460a = arrayList;
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: a */
    public final boolean mo13605a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        Collection<InterfaceC8865w> collection = this.f38460a;
        boolean z10 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (C5207g.m11106a(((InterfaceC8865w) it.next()).mo17120e(), c7646c)) {
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
        while (true) {
            for (Object obj : this.f38460a) {
                if (C5207g.m11106a(((InterfaceC8865w) obj).mo17120e(), c7646c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: c */
    public final void mo13607c(C7646c c7646c, ArrayList arrayList) {
        C5207g.m11111f(c7646c, "fqName");
        while (true) {
            for (Object obj : this.f38460a) {
                if (C5207g.m11106a(((InterfaceC8865w) obj).mo17120e(), c7646c)) {
                    arrayList.add(obj);
                }
            }
            return;
        }
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: t */
    public final Collection<C7646c> mo13608t(final C7646c c7646c, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14255P2(C7073a.m14261V2(C6752c.m13413G(this.f38460a), new InterfaceC2052l<InterfaceC8865w, C7646c>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C7646c mo528n(InterfaceC8865w interfaceC8865w) {
                InterfaceC8865w interfaceC8865w2 = interfaceC8865w;
                C5207g.m11111f(interfaceC8865w2, "it");
                return interfaceC8865w2.mo17120e();
            }
        }), new InterfaceC2052l<C7646c, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C7646c c7646c2) {
                C7646c c7646c3 = c7646c2;
                C5207g.m11111f(c7646c3, "it");
                return Boolean.valueOf(!c7646c3.m15216d() && C5207g.m11106a(c7646c3.m15217e(), c7646c));
            }
        })));
    }
}
