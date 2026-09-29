package p249lo;

import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.Iterator;
import p349qo.C8656b;

/* JADX INFO: renamed from: lo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C7418k implements InterfaceC7415h<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2056p f41258a;

    public C7418k(InterfaceC2056p interfaceC2056p) {
        this.f41258a = interfaceC2056p;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<Object> iterator() {
        InterfaceC2056p interfaceC2056p = this.f41258a;
        C5207g.m11111f(interfaceC2056p, "block");
        C7416i c7416i = new C7416i();
        c7416i.f41257d = C8656b.m16908p(interfaceC2056p, c7416i, c7416i);
        return c7416i;
    }
}
