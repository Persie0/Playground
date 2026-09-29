package in;

import ae.C0062b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6898a;
import mn.C7645b;
import p465wm.C9974d;
import p541zn.C10541e;
import p541zn.InterfaceC10542f;

/* JADX INFO: renamed from: in.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6362f implements InterfaceC10542f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6366j f36738a;

    /* JADX INFO: renamed from: b */
    public final C6898a f36739b;

    public C6362f(C9974d c9974d, C6898a c6898a) {
        this.f36738a = c9974d;
        this.f36739b = c6898a;
    }

    @Override // p541zn.InterfaceC10542f
    /* JADX INFO: renamed from: a */
    public final C10541e mo12988a(C7645b c7645b) {
        C5207g.m11111f(c7645b, "classId");
        InterfaceC6367k interfaceC6367kM301Q0 = C0062b.m301Q0(this.f36738a, c7645b);
        if (interfaceC6367kM301Q0 == null) {
            return null;
        }
        C5207g.m11106a(interfaceC6367kM301Q0.mo13002j(), c7645b);
        return this.f36739b.m13772f(interfaceC6367kM301Q0);
    }
}
