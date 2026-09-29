package bo;

import dm.C5207g;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9570h0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: bo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1630h extends C9570h0 implements InterfaceC1624b {

    /* JADX INFO: renamed from: Z */
    public final ProtoBuf$Function f9160Z;

    /* JADX INFO: renamed from: a0 */
    public final InterfaceC6733c f9161a0;

    /* JADX INFO: renamed from: b0 */
    public final C6735e f9162b0;

    /* JADX INFO: renamed from: c0 */
    public final C6736f f9163c0;

    /* JADX INFO: renamed from: d0 */
    public final InterfaceC1626d f9164d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630h(InterfaceC8838g interfaceC8838g, InterfaceC6824e interfaceC6824e, InterfaceC9077e interfaceC9077e, C7648e c7648e, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, InterfaceC1626d interfaceC1626d, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8838g, interfaceC6824e, interfaceC9077e, c7648e, kind, interfaceC8837f0 == null ? InterfaceC8837f0.f46730a : interfaceC8837f0);
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(interfaceC9077e, "annotations");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(protoBuf$Function, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        this.f9160Z = protoBuf$Function;
        this.f9161a0 = interfaceC6733c;
        this.f9162b0 = c6735e;
        this.f9163c0 = c6736f;
        this.f9164d0 = interfaceC1626d;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: K */
    public final InterfaceC6997h mo5295K() {
        return this.f9160Z;
    }

    @Override // p420um.C9570h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        C7648e c7648e2;
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(interfaceC9077e, "annotations");
        InterfaceC6824e interfaceC6824e = (InterfaceC6824e) interfaceC6822c;
        if (c7648e == null) {
            C7648e c7648eMo11874a = mo11874a();
            C5207g.m11110e(c7648eMo11874a, "name");
            c7648e2 = c7648eMo11874a;
        } else {
            c7648e2 = c7648e;
        }
        C1630h c1630h = new C1630h(interfaceC8838g, interfaceC6824e, interfaceC9077e, c7648e2, kind, this.f9160Z, this.f9161a0, this.f9162b0, this.f9163c0, this.f9164d0, interfaceC8837f0);
        c1630h.f38524R = this.f38524R;
        return c1630h;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: a0 */
    public final C6735e mo5297a0() {
        return this.f9162b0;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC6733c mo5298h0() {
        return this.f9161a0;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC1626d mo5300j0() {
        return this.f9164d0;
    }
}
