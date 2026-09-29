package kotlin.reflect.jvm.internal.impl.resolve;

import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.Collection;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p102eo.AbstractC5439d;
import p102eo.InterfaceC5438c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8862t;
import p372rm.InterfaceC8865w;
import p543do.InterfaceC5240k0;
import pn.C8413d;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7012a {

    /* JADX INFO: renamed from: a */
    public static final C7012a f39644a = new C7012a();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m14093c(C7012a c7012a, InterfaceC8847k0 interfaceC8847k0, InterfaceC8847k0 interfaceC8847k1, boolean z10) {
        return c7012a.m14096b(interfaceC8847k0, interfaceC8847k1, z10, new InterfaceC2056p<InterfaceC8838g, InterfaceC8838g, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Boolean mo1337m0(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC8837f0 m14094e(InterfaceC6816a interfaceC6816a) {
        while (interfaceC6816a instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) interfaceC6816a;
            if (callableMemberDescriptor.mo11897u() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> collectionMo11893p = callableMemberDescriptor.mo11893p();
            C5207g.m11110e(collectionMo11893p, "overriddenDescriptors");
            interfaceC6816a = (CallableMemberDescriptor) C6752c.m13444l0(collectionMo11893p);
            if (interfaceC6816a == null) {
                return null;
            }
        }
        return interfaceC6816a.mo11890j();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14095a(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2, final boolean z10, boolean z11) {
        if ((interfaceC8838g instanceof InterfaceC8830c) && (interfaceC8838g2 instanceof InterfaceC8830c)) {
            return C5207g.m11106a(((InterfaceC8830c) interfaceC8838g).mo13600k(), ((InterfaceC8830c) interfaceC8838g2).mo13600k());
        }
        if ((interfaceC8838g instanceof InterfaceC8847k0) && (interfaceC8838g2 instanceof InterfaceC8847k0)) {
            return m14093c(this, (InterfaceC8847k0) interfaceC8838g, (InterfaceC8847k0) interfaceC8838g2, z10);
        }
        if (!(interfaceC8838g instanceof InterfaceC6816a) || !(interfaceC8838g2 instanceof InterfaceC6816a)) {
            return ((interfaceC8838g instanceof InterfaceC8865w) && (interfaceC8838g2 instanceof InterfaceC8865w)) ? C5207g.m11106a(((InterfaceC8865w) interfaceC8838g).mo17120e(), ((InterfaceC8865w) interfaceC8838g2).mo17120e()) : C5207g.m11106a(interfaceC8838g, interfaceC8838g2);
        }
        final InterfaceC6816a interfaceC6816a = (InterfaceC6816a) interfaceC8838g;
        final InterfaceC6816a interfaceC6816a2 = (InterfaceC6816a) interfaceC8838g2;
        AbstractC5439d.a aVar = AbstractC5439d.a.f33983a;
        C5207g.m11111f(interfaceC6816a, "a");
        C5207g.m11111f(interfaceC6816a2, "b");
        C5207g.m11111f(aVar, "kotlinTypeRefiner");
        if (!C5207g.m11106a(interfaceC6816a, interfaceC6816a2)) {
            if (C5207g.m11106a(interfaceC6816a.mo11874a(), interfaceC6816a2.mo11874a()) && ((!z11 || !(interfaceC6816a instanceof InterfaceC8862t) || !(interfaceC6816a2 instanceof InterfaceC8862t) || ((InterfaceC8862t) interfaceC6816a).mo11882T() == ((InterfaceC8862t) interfaceC6816a2).mo11882T()) && ((!C5207g.m11106a(interfaceC6816a.mo11876g(), interfaceC6816a2.mo11876g()) || (z10 && C5207g.m11106a(m14094e(interfaceC6816a), m14094e(interfaceC6816a2)))) && !C8413d.m16456o(interfaceC6816a) && !C8413d.m16456o(interfaceC6816a2) && m14097d(interfaceC6816a, interfaceC6816a2, new InterfaceC2056p<InterfaceC8838g, InterfaceC8838g, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Boolean mo1337m0(InterfaceC8838g interfaceC8838g3, InterfaceC8838g interfaceC8838g4) {
                    return Boolean.FALSE;
                }
            }, z10)))) {
                OverridingUtil overridingUtil = new OverridingUtil(new InterfaceC5438c.a() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1
                    @Override // p102eo.InterfaceC5438c.a
                    /* JADX INFO: renamed from: a */
                    public final boolean mo11658a(InterfaceC5240k0 interfaceC5240k0, InterfaceC5240k0 interfaceC5240k1) {
                        C5207g.m11111f(interfaceC5240k0, "c1");
                        C5207g.m11111f(interfaceC5240k1, "c2");
                        if (C5207g.m11106a(interfaceC5240k0, interfaceC5240k1)) {
                            return true;
                        }
                        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
                        InterfaceC8834e interfaceC8834eMo11235q2 = interfaceC5240k1.mo11235q();
                        if ((interfaceC8834eMo11235q instanceof InterfaceC8847k0) && (interfaceC8834eMo11235q2 instanceof InterfaceC8847k0)) {
                            final InterfaceC6816a interfaceC6816a3 = interfaceC6816a;
                            final InterfaceC6816a interfaceC6816a4 = interfaceC6816a2;
                            return C7012a.f39644a.m14096b((InterfaceC8847k0) interfaceC8834eMo11235q, (InterfaceC8847k0) interfaceC8834eMo11235q2, z10, new InterfaceC2056p<InterfaceC8838g, InterfaceC8838g, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final Boolean mo1337m0(InterfaceC8838g interfaceC8838g3, InterfaceC8838g interfaceC8838g4) {
                                    return Boolean.valueOf(C5207g.m11106a(interfaceC8838g3, interfaceC6816a3) && C5207g.m11106a(interfaceC8838g4, interfaceC6816a4));
                                }
                            });
                        }
                        return false;
                    }
                }, aVar, KotlinTypePreparator.C7059a.f39903a);
                OverridingUtil.OverrideCompatibilityInfo.Result resultM14090c = overridingUtil.m14085m(interfaceC6816a, interfaceC6816a2, null, true).m14090c();
                OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                if (resultM14090c == result && overridingUtil.m14085m(interfaceC6816a2, interfaceC6816a, null, true).m14090c() == result) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14096b(InterfaceC8847k0 interfaceC8847k0, InterfaceC8847k0 interfaceC8847k1, boolean z10, InterfaceC2056p<? super InterfaceC8838g, ? super InterfaceC8838g, Boolean> interfaceC2056p) {
        C5207g.m11111f(interfaceC8847k0, "a");
        C5207g.m11111f(interfaceC8847k1, "b");
        C5207g.m11111f(interfaceC2056p, "equivalentCallables");
        if (C5207g.m11106a(interfaceC8847k0, interfaceC8847k1)) {
            return true;
        }
        if (!C5207g.m11106a(interfaceC8847k0.mo11876g(), interfaceC8847k1.mo11876g()) && m14097d(interfaceC8847k0, interfaceC8847k1, interfaceC2056p, z10) && interfaceC8847k0.getIndex() == interfaceC8847k1.getIndex()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14097d(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2, InterfaceC2056p<? super InterfaceC8838g, ? super InterfaceC8838g, Boolean> interfaceC2056p, boolean z10) {
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8838g.mo11876g();
        InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC8838g2.mo11876g();
        return ((interfaceC8838gMo11876g instanceof CallableMemberDescriptor) || (interfaceC8838gMo11876g2 instanceof CallableMemberDescriptor)) ? interfaceC2056p.mo1337m0(interfaceC8838gMo11876g, interfaceC8838gMo11876g2).booleanValue() : m14095a(interfaceC8838gMo11876g, interfaceC8838gMo11876g2, z10, true);
    }
}
