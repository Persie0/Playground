package bo;

import ae.C0062b;
import co.InterfaceC2076h;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p420um.C9568g0;
import p420um.InterfaceC9574j0;
import p492xn.C10253b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8412c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: bo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1631i extends AbstractTypeAliasDescriptor implements InterfaceC1627e {

    /* JADX INFO: renamed from: H */
    public final InterfaceC1626d f9165H;

    /* JADX INFO: renamed from: I */
    public Collection<? extends InterfaceC9574j0> f9166I;

    /* JADX INFO: renamed from: J */
    public AbstractC5265x f9167J;

    /* JADX INFO: renamed from: K */
    public AbstractC5265x f9168K;

    /* JADX INFO: renamed from: L */
    public List<? extends InterfaceC8847k0> f9169L;

    /* JADX INFO: renamed from: M */
    public AbstractC5265x f9170M;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2076h f9171h;

    /* JADX INFO: renamed from: i */
    public final ProtoBuf$TypeAlias f9172i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6733c f9173j;

    /* JADX INFO: renamed from: k */
    public final C6735e f9174k;

    /* JADX INFO: renamed from: l */
    public final C6736f f9175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631i(InterfaceC2076h interfaceC2076h, InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, AbstractC8852n abstractC8852n, ProtoBuf$TypeAlias protoBuf$TypeAlias, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, InterfaceC1626d interfaceC1626d) {
        super(interfaceC8838g, interfaceC9077e, c7648e, abstractC8852n);
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(abstractC8852n, "visibility");
        C5207g.m11111f(protoBuf$TypeAlias, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        this.f9171h = interfaceC2076h;
        this.f9172i = protoBuf$TypeAlias;
        this.f9173j = interfaceC6733c;
        this.f9174k = c6735e;
        this.f9175l = c6736f;
        this.f9165H = interfaceC1626d;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m5311V0(List<? extends InterfaceC8847k0> list, AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        Collection<? extends InterfaceC9574j0> collection;
        InterfaceC8828b interfaceC8828bMo5312d;
        List list2;
        C5207g.m11111f(list, "declaredTypeParameters");
        C5207g.m11111f(abstractC5265x, "underlyingType");
        C5207g.m11111f(abstractC5265x2, "expandedType");
        this.f38488f = list;
        this.f9167J = abstractC5265x;
        this.f9168K = abstractC5265x2;
        this.f9169L = TypeParameterUtilsKt.m13612b(this);
        this.f9170M = m13624P0();
        InterfaceC8830c interfaceC8830cMo5315s = mo5315s();
        if (interfaceC8830cMo5315s == null) {
            collection = EmptyList.f38032a;
        } else {
            Collection<InterfaceC8828b> collectionMo13590G = interfaceC8830cMo5315s.mo13590G();
            C5207g.m11110e(collectionMo13590G, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (InterfaceC8828b interfaceC8828b : collectionMo13590G) {
                TypeAliasConstructorDescriptorImpl.C6826a c6826a = TypeAliasConstructorDescriptorImpl.f38503d0;
                C5207g.m11110e(interfaceC8828b, "it");
                c6826a.getClass();
                InterfaceC2076h interfaceC2076h = this.f9171h;
                C5207g.m11111f(interfaceC2076h, "storageManager");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = null;
                TypeSubstitutor typeSubstitutorM14198d = mo5315s() == null ? null : TypeSubstitutor.m14198d(mo5313d0());
                if (typeSubstitutorM14198d != null && (interfaceC8828bMo5312d = interfaceC8828b.mo5312d(typeSubstitutorM14198d)) != null) {
                    InterfaceC9077e interfaceC9077eMo11289w = interfaceC8828b.mo11289w();
                    CallableMemberDescriptor.Kind kindMo11897u = interfaceC8828b.mo11897u();
                    C5207g.m11110e(kindMo11897u, "constructor.kind");
                    InterfaceC8837f0 interfaceC8837f0Mo11890j = mo11890j();
                    C5207g.m11110e(interfaceC8837f0Mo11890j, "typeAliasDescriptor.source");
                    TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(interfaceC2076h, this, interfaceC8828bMo5312d, null, interfaceC9077eMo11289w, kindMo11897u, interfaceC8837f0Mo11890j);
                    List<InterfaceC8853n0> listMo11889i = interfaceC8828b.mo11889i();
                    if (listMo11889i == null) {
                        AbstractC6828b.m13633N(28);
                        throw null;
                    }
                    ArrayList arrayListM13634X0 = AbstractC6828b.m13634X0(typeAliasConstructorDescriptorImpl2, listMo11889i, typeSubstitutorM14198d, false, false, null);
                    if (arrayListM13634X0 != null) {
                        AbstractC5265x abstractC5265xM423z2 = C0062b.m423z2(C0062b.m262E1(interfaceC8828bMo5312d.mo11900y().mo11288a1()), mo5316v());
                        InterfaceC8835e0 interfaceC8835e0Mo11892m0 = interfaceC8828b.mo11892m0();
                        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
                        C9568g0 c9568g0M16438g = interfaceC8835e0Mo11892m0 != null ? C8412c.m16438g(typeAliasConstructorDescriptorImpl2, typeSubstitutorM14198d.m14204i(interfaceC8835e0Mo11892m0.mo11884c(), Variance.INVARIANT), c10670a) : null;
                        InterfaceC8830c interfaceC8830cMo5315s2 = mo5315s();
                        if (interfaceC8830cMo5315s2 != null) {
                            List<InterfaceC8835e0> listMo11901y0 = interfaceC8828b.mo11901y0();
                            C5207g.m11110e(listMo11901y0, "constructor.contextReceiverParameters");
                            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo11901y0, 10));
                            Iterator<T> it = listMo11901y0.iterator();
                            while (it.hasNext()) {
                                AbstractC5257t abstractC5257tM14204i = typeSubstitutorM14198d.m14204i(((InterfaceC8835e0) it.next()).mo11884c(), Variance.INVARIANT);
                                arrayList2.add(abstractC5257tM14204i == null ? null : new C9568g0(interfaceC8830cMo5315s2, new C10253b(interfaceC8830cMo5315s2, abstractC5257tM14204i), c10670a));
                            }
                            list2 = arrayList2;
                        } else {
                            list2 = EmptyList.f38032a;
                        }
                        typeAliasConstructorDescriptorImpl2.mo13636Y0(c9568g0M16438g, null, list2, mo13604z(), arrayListM13634X0, abstractC5265xM423z2, Modality.FINAL, this.f38487e);
                        typeAliasConstructorDescriptorImpl = typeAliasConstructorDescriptorImpl2;
                    }
                }
                if (typeAliasConstructorDescriptorImpl != null) {
                    arrayList.add(typeAliasConstructorDescriptorImpl);
                }
            }
            collection = arrayList;
        }
        this.f9166I = collection;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: a0 */
    public final C6735e mo5297a0() {
        throw null;
    }

    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8840h mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.m14203h()) {
            return this;
        }
        InterfaceC2076h interfaceC2076h = this.f9171h;
        InterfaceC8838g interfaceC8838gMo11876g = mo11876g();
        C5207g.m11110e(interfaceC8838gMo11876g, "containingDeclaration");
        InterfaceC9077e interfaceC9077eMo11289w = mo11289w();
        C5207g.m11110e(interfaceC9077eMo11289w, "annotations");
        C7648e c7648eMo11874a = mo11874a();
        C5207g.m11110e(c7648eMo11874a, "name");
        C1631i c1631i = new C1631i(interfaceC2076h, interfaceC8838gMo11876g, interfaceC9077eMo11289w, c7648eMo11874a, this.f38487e, this.f9172i, this.f9173j, this.f9174k, this.f9175l, this.f9165H);
        List<InterfaceC8847k0> listMo13604z = mo13604z();
        AbstractC5265x abstractC5265xMo5314n0 = mo5314n0();
        Variance variance = Variance.INVARIANT;
        AbstractC5257t abstractC5257tM14204i = typeSubstitutor.m14204i(abstractC5265xMo5314n0, variance);
        C5207g.m11110e(abstractC5257tM14204i, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        AbstractC5265x abstractC5265xM11024u0 = C5206f.m11024u0(abstractC5257tM14204i);
        AbstractC5257t abstractC5257tM14204i2 = typeSubstitutor.m14204i(mo5313d0(), variance);
        C5207g.m11110e(abstractC5257tM14204i2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        c1631i.m5311V0(listMo13604z, abstractC5265xM11024u0, C5206f.m11024u0(abstractC5257tM14204i2));
        return c1631i;
    }

    @Override // p372rm.InterfaceC8845j0
    /* JADX INFO: renamed from: d0 */
    public final AbstractC5265x mo5313d0() {
        AbstractC5265x abstractC5265x = this.f9168K;
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        C5207g.m11117l("expandedType");
        throw null;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC6733c mo5298h0() {
        throw null;
    }

    @Override // bo.InterfaceC1627e
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC1626d mo5300j0() {
        return this.f9165H;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8845j0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC5265x mo5314n0() {
        AbstractC5265x abstractC5265x = this.f9167J;
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        C5207g.m11117l("underlyingType");
        throw null;
    }

    @Override // p372rm.InterfaceC8845j0
    /* JADX INFO: renamed from: s */
    public final InterfaceC8830c mo5315s() {
        InterfaceC8830c interfaceC8830c = null;
        if (!C7499b.m14926X(mo5313d0())) {
            InterfaceC8834e interfaceC8834eMo11235q = mo5313d0().mo11250X0().mo11235q();
            interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
        }
        return interfaceC8830c;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x mo5316v() {
        AbstractC5265x abstractC5265x = this.f9170M;
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        C5207g.m11117l("defaultTypeImpl");
        throw null;
    }
}
