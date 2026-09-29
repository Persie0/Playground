package bo;

import cm.InterfaceC2041a;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.List;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: bo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1632j extends C1623a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632j(InterfaceC2076h interfaceC2076h, InterfaceC2041a<? extends List<? extends InterfaceC9075c>> interfaceC2041a) {
        super(interfaceC2076h, interfaceC2041a);
        C5207g.m11111f(interfaceC2076h, "storageManager");
    }

    @Override // bo.C1623a, sm.InterfaceC9077e
    public final boolean isEmpty() {
        return false;
    }
}
