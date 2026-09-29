package bo;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import kn.C6732b;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import mn.C7648e;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9562d0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: bo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1629g extends C9562d0 implements InterfaceC1624b {

    /* JADX INFO: renamed from: W */
    public final ProtoBuf$Property f9155W;

    /* JADX INFO: renamed from: X */
    public final InterfaceC6733c f9156X;

    /* JADX INFO: renamed from: Y */
    public final C6735e f9157Y;

    /* JADX INFO: renamed from: Z */
    public final C6736f f9158Z;

    /* JADX INFO: renamed from: a0 */
    public final InterfaceC1626d f9159a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1629g(InterfaceC8838g interfaceC8838g, InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, Modality modality, AbstractC8852n abstractC8852n, boolean z10, C7648e c7648e, CallableMemberDescriptor.Kind kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ProtoBuf$Property protoBuf$Property, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, InterfaceC1626d interfaceC1626d) {
        super(interfaceC8838g, interfaceC8829b0, interfaceC9077e, modality, abstractC8852n, z10, c7648e, kind, InterfaceC8837f0.f46730a, z11, z12, z15, false, z13, z14);
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(interfaceC9077e, "annotations");
        C5207g.m11111f(modality, "modality");
        C5207g.m11111f(abstractC8852n, "visibility");
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(protoBuf$Property, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        this.f9155W = protoBuf$Property;
        this.f9156X = interfaceC6733c;
        this.f9157Y = c6735e;
        this.f9158Z = c6736f;
        this.f9159a0 = interfaceC1626d;
    }

    @Override // p420um.C9562d0, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return C0166e.m779z(C6732b.f37953D, this.f9155W.f39193d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: K */
    public final InterfaceC6997h mo5295K() {
        return this.f9155W;
    }

    @Override // p420um.C9562d0
    /* JADX INFO: renamed from: W0 */
    public final C9562d0 mo5287W0(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8852n abstractC8852n, InterfaceC8829b0 interfaceC8829b0, CallableMemberDescriptor.Kind kind, C7648e c7648e) {
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(modality, "newModality");
        C5207g.m11111f(abstractC8852n, "newVisibility");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(c7648e, "newName");
        return new C1629g(interfaceC8838g, interfaceC8829b0, mo11289w(), modality, abstractC8852n, this.f49221f, c7648e, kind, this.f49153I, this.f49154J, mo5293D(), this.f49158N, this.f49155K, this.f9155W, this.f9156X, this.f9157Y, this.f9158Z, this.f9159a0);
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: a0 */
    public final C6735e mo5297a0() {
        return this.f9157Y;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC6733c mo5298h0() {
        return this.f9156X;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC1626d mo5300j0() {
        return this.f9159a0;
    }
}
