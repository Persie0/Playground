package hn;

import dm.C5207g;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import mn.C7646c;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9330r;

/* JADX INFO: renamed from: hn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6082b implements InterfaceC9077e {

    /* JADX INFO: renamed from: a */
    public final C7646c f35818a;

    public C6082b(C7646c c7646c) {
        this.f35818a = c7646c;
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        if (C5207g.m11106a(c7646c, this.f35818a)) {
            return C6081a.f35817a;
        }
        return null;
    }

    @Override // sm.InterfaceC9077e
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        EmptyList.f38032a.getClass();
        return C9330r.f48065a;
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        return InterfaceC9077e.b.m17281b(this, c7646c);
    }
}
