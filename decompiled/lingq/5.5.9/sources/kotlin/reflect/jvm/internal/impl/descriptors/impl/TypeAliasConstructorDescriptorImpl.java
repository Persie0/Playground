package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cm.InterfaceC2041a;
import co.InterfaceC2074f;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import mn.C7650g;
import p372rm.AbstractC8848l;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p420um.AbstractC9561d;
import p420um.InterfaceC9574j0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasConstructorDescriptorImpl extends AbstractC6828b implements InterfaceC9574j0 {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC2076h f38505Z;

    /* JADX INFO: renamed from: a0 */
    public final InterfaceC8845j0 f38506a0;

    /* JADX INFO: renamed from: b0 */
    public final InterfaceC2074f f38507b0;

    /* JADX INFO: renamed from: c0 */
    public InterfaceC8828b f38508c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38504e0 = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* JADX INFO: renamed from: d0 */
    public static final C6826a f38503d0 = new C6826a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$a */
    public static final class C6826a {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public /* synthetic */ TypeAliasConstructorDescriptorImpl() {
        throw null;
    }

    public TypeAliasConstructorDescriptorImpl(InterfaceC2076h interfaceC2076h, InterfaceC8845j0 interfaceC8845j0, final InterfaceC8828b interfaceC8828b, InterfaceC9574j0 interfaceC9574j0, InterfaceC9077e interfaceC9077e, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        super(kind, interfaceC8845j0, interfaceC9574j0, interfaceC8837f0, interfaceC9077e, C7650g.f42093e);
        this.f38505Z = interfaceC2076h;
        this.f38506a0 = interfaceC8845j0;
        this.f38520N = interfaceC8845j0.mo11881O0();
        this.f38507b0 = interfaceC2076h.mo6219d(new InterfaceC2041a<TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final TypeAliasConstructorDescriptorImpl mo807E() {
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.f38509b;
                InterfaceC2076h interfaceC2076h2 = typeAliasConstructorDescriptorImpl.f38505Z;
                InterfaceC8845j0 interfaceC8845j1 = typeAliasConstructorDescriptorImpl.f38506a0;
                InterfaceC8828b interfaceC8828b2 = interfaceC8828b;
                InterfaceC9077e interfaceC9077eMo11289w = interfaceC8828b2.mo11289w();
                CallableMemberDescriptor.Kind kindMo11897u = interfaceC8828b2.mo11897u();
                C5207g.m11110e(kindMo11897u, "underlyingConstructorDescriptor.kind");
                InterfaceC8845j0 interfaceC8845j2 = typeAliasConstructorDescriptorImpl.f38506a0;
                InterfaceC8837f0 interfaceC8837f0Mo11890j = interfaceC8845j2.mo11890j();
                C5207g.m11110e(interfaceC8837f0Mo11890j, "typeAliasDescriptor.source");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(interfaceC2076h2, interfaceC8845j1, interfaceC8828b2, typeAliasConstructorDescriptorImpl, interfaceC9077eMo11289w, kindMo11897u, interfaceC8837f0Mo11890j);
                TypeAliasConstructorDescriptorImpl.f38503d0.getClass();
                AbstractC9561d abstractC9561dMo5312d = null;
                TypeSubstitutor typeSubstitutorM14198d = interfaceC8845j2.mo5315s() == null ? null : TypeSubstitutor.m14198d(interfaceC8845j2.mo5313d0());
                if (typeSubstitutorM14198d == null) {
                    return null;
                }
                InterfaceC8835e0 interfaceC8835e0Mo11892m0 = interfaceC8828b2.mo11892m0();
                if (interfaceC8835e0Mo11892m0 != null) {
                    abstractC9561dMo5312d = interfaceC8835e0Mo11892m0.mo5312d(typeSubstitutorM14198d);
                }
                AbstractC9561d abstractC9561d = abstractC9561dMo5312d;
                List<InterfaceC8835e0> listMo11901y0 = interfaceC8828b2.mo11901y0();
                C5207g.m11110e(listMo11901y0, "underlyingConstructorDes…contextReceiverParameters");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11901y0, 10));
                Iterator<T> it = listMo11901y0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC8835e0) it.next()).mo5312d(typeSubstitutorM14198d));
                }
                List<InterfaceC8847k0> listMo13604z = interfaceC8845j2.mo13604z();
                List<InterfaceC8853n0> listMo11889i = typeAliasConstructorDescriptorImpl.mo11889i();
                AbstractC5257t abstractC5257t = typeAliasConstructorDescriptorImpl.f38534g;
                C5207g.m11108c(abstractC5257t);
                typeAliasConstructorDescriptorImpl2.mo13636Y0(null, abstractC9561d, arrayList, listMo13604z, listMo11889i, abstractC5257t, Modality.FINAL, interfaceC8845j2.mo11886f());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.f38508c0 = interfaceC8828b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b
    /* JADX INFO: renamed from: H */
    public final boolean mo13614H() {
        return this.f38508c0.mo13614H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b
    /* JADX INFO: renamed from: I */
    public final InterfaceC8830c mo13615I() {
        InterfaceC8830c interfaceC8830cMo13615I = this.f38508c0.mo13615I();
        C5207g.m11110e(interfaceC8830cMo13615I, "underlyingConstructorDescriptor.constructedClass");
        return interfaceC8830cMo13615I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(interfaceC9077e, "annotations");
        return new TypeAliasConstructorDescriptorImpl(this.f38505Z, this.f38506a0, this.f38508c0, this, interfaceC9077e, CallableMemberDescriptor.Kind.DECLARATION, interfaceC8837f0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c, p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC6821b mo5312d(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9574j0 mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(abstractC8848l, "visibility");
        C5207g.m11111f(kind, "kind");
        AbstractC6828b.a aVar = (AbstractC6828b.a) mo11848M0();
        aVar.mo11856f(interfaceC8838g);
        aVar.mo11857g(modality);
        aVar.mo11863m(abstractC8848l);
        aVar.mo11865o(kind);
        aVar.f38552m = false;
        InterfaceC6822c interfaceC6822cMo11851a = aVar.mo11851a();
        C5207g.m11109d(interfaceC6822cMo11851a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC9574j0) interfaceC6822cMo11851a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9574j0 mo18004P0() {
        InterfaceC6822c interfaceC6822cMo18004P0 = super.mo18004P0();
        C5207g.m11109d(interfaceC6822cMo18004P0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC9574j0) interfaceC6822cMo18004P0;
    }

    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8836f mo11876g() {
        return this.f38506a0;
    }

    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return this.f38506a0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptorImpl mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        InterfaceC6822c interfaceC6822cMo5312d = super.mo5312d(typeSubstitutor);
        C5207g.m11109d(interfaceC6822cMo5312d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) interfaceC6822cMo5312d;
        AbstractC5257t abstractC5257t = typeAliasConstructorDescriptorImpl.f38534g;
        C5207g.m11108c(abstractC5257t);
        InterfaceC8828b interfaceC8828bMo5312d = this.f38508c0.mo18004P0().mo5312d(TypeSubstitutor.m14198d(abstractC5257t));
        if (interfaceC8828bMo5312d == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f38508c0 = interfaceC8828bMo5312d;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // p420um.InterfaceC9574j0
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC8828b mo13632w0() {
        return this.f38508c0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        AbstractC5257t abstractC5257t = this.f38534g;
        C5207g.m11108c(abstractC5257t);
        return abstractC5257t;
    }
}
