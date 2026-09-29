package p420um;

import dm.C5207g;
import mn.C7646c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.a0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9556a0 extends AbstractC9582o implements InterfaceC8865w {

    /* JADX INFO: renamed from: e */
    public final C7646c f49131e;

    /* JADX INFO: renamed from: f */
    public final String f49132f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9556a0(InterfaceC8863u interfaceC8863u, C7646c c7646c) {
        super(interfaceC8863u, InterfaceC9077e.a.f47365a, c7646c.m15219g(), InterfaceC8837f0.f46730a);
        C5207g.m11111f(interfaceC8863u, "module");
        C5207g.m11111f(c7646c, "fqName");
        this.f49131e = c7646c;
        this.f49132f = "package " + c7646c + " of " + interfaceC8863u;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14056e(this, d10);
    }

    @Override // p372rm.InterfaceC8865w
    /* JADX INFO: renamed from: e */
    public final C7646c mo17120e() {
        return this.f49131e;
    }

    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8863u mo11876g() {
        InterfaceC8838g interfaceC8838gMo11876g = super.mo11876g();
        C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC8863u) interfaceC8838gMo11876g;
    }

    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public InterfaceC8837f0 mo11890j() {
        return InterfaceC8837f0.f46730a;
    }

    @Override // p420um.AbstractC9581n
    public String toString() {
        return this.f49132f;
    }
}
