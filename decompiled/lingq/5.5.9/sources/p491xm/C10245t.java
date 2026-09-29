package p491xm;

import cm.InterfaceC2052l;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5840t;
import java.util.Collection;
import kotlin.collections.EmptyList;
import mn.C7646c;

/* JADX INFO: renamed from: xm.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C10245t extends AbstractC10238m implements InterfaceC5840t {

    /* JADX INFO: renamed from: a */
    public final C7646c f51674a;

    public C10245t(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        this.f51674a = c7646c;
    }

    @Override // gn.InterfaceC5840t
    /* JADX INFO: renamed from: G */
    public final EmptyList mo12281G() {
        return EmptyList.f38032a;
    }

    @Override // gn.InterfaceC5840t
    /* JADX INFO: renamed from: N */
    public final EmptyList mo12282N(InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return EmptyList.f38032a;
    }

    @Override // gn.InterfaceC5840t
    /* JADX INFO: renamed from: e */
    public final C7646c mo12283e() {
        return this.f51674a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10245t) {
            if (C5207g.m11106a(this.f51674a, ((C10245t) obj).f51674a)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public final InterfaceC5820a mo12239h(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return null;
    }

    public final int hashCode() {
        return this.f51674a.hashCode();
    }

    public final String toString() {
        return C10245t.class.getName() + ": " + this.f51674a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection mo12240w() {
        return EmptyList.f38032a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
