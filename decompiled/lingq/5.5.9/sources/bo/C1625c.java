package bo;

import dm.C5207g;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9573j;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: bo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1625c extends C9573j implements InterfaceC1624b {

    /* JADX INFO: renamed from: a0 */
    public final ProtoBuf$Constructor f9147a0;

    /* JADX INFO: renamed from: b0 */
    public final InterfaceC6733c f9148b0;

    /* JADX INFO: renamed from: c0 */
    public final C6735e f9149c0;

    /* JADX INFO: renamed from: d0 */
    public final C6736f f9150d0;

    /* JADX INFO: renamed from: e0 */
    public final InterfaceC1626d f9151e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625c(InterfaceC8830c interfaceC8830c, InterfaceC6821b interfaceC6821b, InterfaceC9077e interfaceC9077e, boolean z10, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, InterfaceC1626d interfaceC1626d, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8830c, interfaceC6821b, interfaceC9077e, z10, kind, interfaceC8837f0 == null ? InterfaceC8837f0.f46730a : interfaceC8837f0);
        C5207g.m11111f(interfaceC8830c, "containingDeclaration");
        C5207g.m11111f(interfaceC9077e, "annotations");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(protoBuf$Constructor, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        this.f9147a0 = protoBuf$Constructor;
        this.f9148b0 = interfaceC6733c;
        this.f9149c0 = c6735e;
        this.f9150d0 = c6736f;
        this.f9151e0 = interfaceC1626d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: F0 */
    public final boolean mo5294F0() {
        return false;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: K */
    public final InterfaceC6997h mo5295K() {
        return this.f9147a0;
    }

    @Override // p420um.C9573j, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final /* bridge */ /* synthetic */ AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        return m5299i1(kind, interfaceC8838g, interfaceC6822c, interfaceC8837f0, interfaceC9077e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: W */
    public final boolean mo5296W() {
        return false;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: a0 */
    public final C6735e mo5297a0() {
        return this.f9149c0;
    }

    @Override // p420um.C9573j
    /* JADX INFO: renamed from: e1 */
    public final /* bridge */ /* synthetic */ C9573j mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        return m5299i1(kind, interfaceC8838g, interfaceC6822c, interfaceC8837f0, interfaceC9077e);
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC6733c mo5298h0() {
        return this.f9148b0;
    }

    /* JADX INFO: renamed from: i1 */
    public final C1625c m5299i1(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(interfaceC9077e, "annotations");
        C1625c c1625c = new C1625c((InterfaceC8830c) interfaceC8838g, (InterfaceC6821b) interfaceC6822c, interfaceC9077e, this.f49205Z, kind, this.f9147a0, this.f9148b0, this.f9149c0, this.f9150d0, this.f9151e0, interfaceC8837f0);
        c1625c.f38524R = this.f38524R;
        return c1625c;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC1626d mo5300j0() {
        return this.f9151e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: x */
    public final boolean mo5301x() {
        return false;
    }
}
