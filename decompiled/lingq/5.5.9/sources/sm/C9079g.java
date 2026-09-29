package sm;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mn.C7646c;
import p543do.C5256s0;

/* JADX INFO: renamed from: sm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9079g implements InterfaceC9077e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9077e f47367a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<C7646c, Boolean> f47368b;

    public C9079g(InterfaceC9077e interfaceC9077e, C5256s0 c5256s0) {
        this.f47367a = interfaceC9077e;
        this.f47368b = c5256s0;
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        if (this.f47368b.mo528n(c7646c).booleanValue()) {
            return this.f47367a.mo5291h(c7646c);
        }
        return null;
    }

    @Override // sm.InterfaceC9077e
    public final boolean isEmpty() {
        InterfaceC9077e interfaceC9077e = this.f47367a;
        if ((interfaceC9077e instanceof Collection) && ((Collection) interfaceC9077e).isEmpty()) {
            return false;
        }
        Iterator<InterfaceC9075c> it = interfaceC9077e.iterator();
        while (it.hasNext()) {
            C7646c c7646cMo12515e = it.next().mo12515e();
            if (c7646cMo12515e != null && this.f47368b.mo528n(c7646cMo12515e).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9075c interfaceC9075c : this.f47367a) {
            C7646c c7646cMo12515e = interfaceC9075c.mo12515e();
            if (c7646cMo12515e != null && this.f47368b.mo528n(c7646cMo12515e).booleanValue()) {
                arrayList.add(interfaceC9075c);
            }
        }
        return arrayList.iterator();
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        if (this.f47368b.mo528n(c7646c).booleanValue()) {
            return this.f47367a.mo5292x(c7646c);
        }
        return false;
    }
}
