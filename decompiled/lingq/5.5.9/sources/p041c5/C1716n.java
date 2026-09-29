package p041c5;

import androidx.view.C1056v;
import androidx.work.impl.utils.futures.C1268a;
import p026b5.InterfaceC1316i;

/* JADX INFO: renamed from: c5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1716n implements InterfaceC1316i {

    /* JADX INFO: renamed from: c */
    public final C1056v<InterfaceC1316i.a> f9528c = new C1056v<>();

    /* JADX INFO: renamed from: d */
    public final C1268a<InterfaceC1316i.a.c> f9529d = new C1268a<>();

    public C1716n() {
        m5452a(InterfaceC1316i.f8064b);
    }

    /* JADX INFO: renamed from: a */
    public final void m5452a(InterfaceC1316i.a aVar) {
        this.f9528c.m3963j(aVar);
        boolean z10 = aVar instanceof InterfaceC1316i.a.c;
        C1268a<InterfaceC1316i.a.c> c1268a = this.f9529d;
        if (z10) {
            c1268a.m4766i((InterfaceC1316i.a.c) aVar);
        } else {
            if (aVar instanceof InterfaceC1316i.a.C10595a) {
                c1268a.m4767j(((InterfaceC1316i.a.C10595a) aVar).f8065a);
            }
        }
    }
}
