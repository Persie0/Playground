package bo;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import mn.C7646c;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: bo.a */
/* JADX INFO: loaded from: classes2.dex */
public class C1623a implements InterfaceC9077e {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f9145b = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C1623a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a */
    public final InterfaceC2073e f9146a;

    public C1623a(InterfaceC2076h interfaceC2076h, InterfaceC2041a<? extends List<? extends InterfaceC9075c>> interfaceC2041a) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f9146a = interfaceC2076h.mo6217b(interfaceC2041a);
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: h */
    public final InterfaceC9075c mo5291h(C7646c c7646c) {
        return InterfaceC9077e.b.m17280a(this, c7646c);
    }

    @Override // sm.InterfaceC9077e
    public boolean isEmpty() {
        return ((List) C0062b.m366l1(this.f9146a, f9145b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC9075c> iterator() {
        return ((List) C0062b.m366l1(this.f9146a, f9145b[0])).iterator();
    }

    @Override // sm.InterfaceC9077e
    /* JADX INFO: renamed from: x */
    public final boolean mo5292x(C7646c c7646c) {
        return InterfaceC9077e.b.m17281b(this, c7646c);
    }
}
