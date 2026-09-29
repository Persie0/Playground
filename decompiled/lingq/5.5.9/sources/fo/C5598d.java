package fo;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import mn.C7648e;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8856p;
import p373rn.AbstractC8875g;
import p420um.C9562d0;
import p420um.C9564e0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: fo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5598d implements InterfaceC8829b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9562d0 f34406a;

    public C5598d() {
        C5602h c5602h = C5602h.f34418a;
        C5595a c5595a = C5602h.f34420c;
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        Modality modality = Modality.OPEN;
        C8850m.h hVar = C8850m.f46738e;
        C7648e c7648eM15234o = C7648e.m15234o(ErrorEntity.ERROR_PROPERTY.getDebugText());
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        if (c5595a == null) {
            C9562d0.m18007N(7);
            throw null;
        }
        if (modality == null) {
            C9562d0.m18007N(9);
            throw null;
        }
        if (hVar == null) {
            C9562d0.m18007N(10);
            throw null;
        }
        if (kind == null) {
            C9562d0.m18007N(12);
            throw null;
        }
        C9562d0 c9562d0 = new C9562d0(c5595a, null, c10670a, modality, hVar, true, c7648eM15234o, kind, aVar, false, false, false, false, false, false);
        C5600f c5600f = C5602h.f34422e;
        EmptyList emptyList = EmptyList.f38032a;
        c9562d0.m18011a1(c5600f, emptyList, null, null, emptyList);
        this.f34406a = c9562d0;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: A */
    public final ArrayList mo11880A() {
        return this.f34406a.mo11880A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: B */
    public final CallableMemberDescriptor mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        return this.f34406a.mo11846B(interfaceC8838g, modality, abstractC8848l, kind);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        C9562d0 c9562d0 = this.f34406a;
        c9562d0.getClass();
        return interfaceC8842i.mo14061j(c9562d0, d10);
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return this.f34406a.mo5293D();
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: F */
    public final boolean mo5286F() {
        return this.f34406a.f49154J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: G0 */
    public final void mo11847G0(Collection<? extends CallableMemberDescriptor> collection) {
        this.f34406a.mo11847G0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return this.f34406a.mo5278M();
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return this.f34406a.f49156L;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return this.f34406a.f49155K;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: V */
    public final boolean mo11883V() {
        return this.f34406a.f49158N;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        return this.f34406a.mo11874a();
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8829b0 mo18004P0() {
        return this.f34406a.mo18004P0();
    }

    @Override // p372rm.InterfaceC8851m0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11884c() {
        return this.f34406a.mo11884c();
    }

    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8829b0 mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        return this.f34406a.mo5312d(typeSubstitutor);
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: e0 */
    public final AbstractC8875g<?> mo11885e0() {
        return this.f34406a.mo11885e0();
    }

    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        return this.f34406a.mo11886f();
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return this.f34406a.mo11876g();
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC8833d0 mo11887g0() {
        return this.f34406a.f49164T;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: h */
    public final C9564e0 mo11888h() {
        return this.f34406a.f49163S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        return this.f34406a.mo11889i();
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return this.f34406a.mo11890j();
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        return this.f34406a.mo11891l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8835e0 mo11892m0() {
        return this.f34406a.f49160P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC8829b0> mo11893p() {
        return this.f34406a.mo11893p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p0 */
    public final <V> V mo5289p0(InterfaceC6816a.a<V> aVar) {
        this.f34406a.getClass();
        return null;
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: q0 */
    public final boolean mo11894q0() {
        return this.f34406a.f49221f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11895r() {
        return this.f34406a.mo11895r();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC8835e0 mo11896s0() {
        return this.f34406a.f49161Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: u */
    public final CallableMemberDescriptor.Kind mo11897u() {
        return this.f34406a.mo11897u();
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC8856p mo11898u0() {
        return this.f34406a.f49166V;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        InterfaceC9077e interfaceC9077eMo11289w = this.f34406a.mo11289w();
        C5207g.m11110e(interfaceC9077eMo11289w, "<get-annotations>(...)");
        return interfaceC9077eMo11289w;
    }

    @Override // p372rm.InterfaceC8829b0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC8856p mo11899x0() {
        return this.f34406a.f49165U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        return this.f34406a.mo11900y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y0 */
    public final List<InterfaceC8835e0> mo11901y0() {
        return this.f34406a.mo11901y0();
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: z0 */
    public final boolean mo11902z0() {
        return this.f34406a.f49153I;
    }
}
