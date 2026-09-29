package no;

/* JADX INFO: renamed from: no.x0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7879x0 extends C7883z0 {

    /* JADX INFO: renamed from: b */
    public final boolean f42978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7879x0(InterfaceC7875v0 interfaceC7875v0) {
        super(true);
        boolean z10 = true;
        m15635P(interfaceC7875v0);
        InterfaceC7852n interfaceC7852nM15633L = m15633L();
        C7855o c7855o = interfaceC7852nM15633L instanceof C7855o ? (C7855o) interfaceC7852nM15633L : null;
        if (c7855o == null) {
            z10 = false;
            break;
        }
        C7883z0 c7883z0M15626L = c7855o.m15626L();
        while (true) {
            C7883z0 c7883z0 = c7883z0M15626L;
            if (!c7883z0.mo15624I()) {
                InterfaceC7852n interfaceC7852nM15633L2 = c7883z0.m15633L();
                C7855o c7855o2 = interfaceC7852nM15633L2 instanceof C7855o ? (C7855o) interfaceC7852nM15633L2 : null;
                if (c7855o2 == null) {
                    z10 = false;
                    break;
                }
                c7883z0M15626L = c7855o2.m15626L();
            } else {
                break;
            }
        }
        this.f42978b = z10;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: I */
    public final boolean mo15624I() {
        return this.f42978b;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: J */
    public final boolean mo15625J() {
        return true;
    }
}
