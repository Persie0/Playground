package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jo.C6530b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p249lo.InterfaceC7415h;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p385sf.C9000b;
import pn.C8413d;
import sm.InterfaceC9075c;
import tl.C9325m;
import tn.C9344a;
import tn.C9345b;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f39656a = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$a */
    public static final class C7014a<N> implements C6530b.b {

        /* JADX INFO: renamed from: a */
        public static final C7014a<N> f39657a = new C7014a<>();

        @Override // jo.C6530b.b
        /* JADX INFO: renamed from: c */
        public final Iterable mo13114c(Object obj) {
            Collection<? extends InterfaceC6816a> collectionMo11893p = ((InterfaceC8853n0) obj).mo11893p();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11893p, 10));
            Iterator<T> it = collectionMo11893p.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8853n0) it.next()).mo18004P0());
            }
            return arrayList;
        }
    }

    static {
        C7648e.m15232l("value");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m14104a(InterfaceC8853n0 interfaceC8853n0) {
        C5207g.m11111f(interfaceC8853n0, "<this>");
        Boolean boolM13112d = C6530b.m13112d(C9000b.m17251q(interfaceC8853n0), C7014a.f39657a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.f39658j);
        C5207g.m11110e(boolM13112d, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolM13112d.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static CallableMemberDescriptor m14105b(CallableMemberDescriptor callableMemberDescriptor, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(callableMemberDescriptor, "<this>");
        C5207g.m11111f(interfaceC2052l, "predicate");
        return (CallableMemberDescriptor) C6530b.m13110b(C9000b.m17251q(callableMemberDescriptor), new C9344a(false), new C9345b(new Ref$ObjectRef(), interfaceC2052l));
    }

    /* JADX INFO: renamed from: c */
    public static final C7646c m14106c(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        C7647d c7647dM14111h = m14111h(interfaceC8838g);
        if (!c7647dM14111h.m15226e()) {
            c7647dM14111h = null;
        }
        if (c7647dM14111h != null) {
            return c7647dM14111h.m15229h();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8830c m14107d(InterfaceC9075c interfaceC9075c) {
        C5207g.m11111f(interfaceC9075c, "<this>");
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC9075c.mo12514c().mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
            return (InterfaceC8830c) interfaceC8834eMo11235q;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC6795c m14108e(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        return m14113j(interfaceC8838g).mo11877o();
    }

    /* JADX INFO: renamed from: f */
    public static final C7645b m14109f(InterfaceC8834e interfaceC8834e) {
        InterfaceC8838g interfaceC8838gMo11876g;
        C7645b c7645bM14109f;
        C7645b c7645bM15206d = null;
        if (interfaceC8834e != null && (interfaceC8838gMo11876g = interfaceC8834e.mo11876g()) != null) {
            if (interfaceC8838gMo11876g instanceof InterfaceC8865w) {
                return new C7645b(((InterfaceC8865w) interfaceC8838gMo11876g).mo17120e(), interfaceC8834e.mo11874a());
            }
            if ((interfaceC8838gMo11876g instanceof InterfaceC8836f) && (c7645bM14109f = m14109f((InterfaceC8834e) interfaceC8838gMo11876g)) != null) {
                c7645bM15206d = c7645bM14109f.m15206d(interfaceC8834e.mo11874a());
            }
        }
        return c7645bM15206d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static final C7646c m14110g(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        C7646c c7646cM16449h = C8413d.m16449h(interfaceC8838g);
        if (c7646cM16449h == null) {
            c7646cM16449h = C8413d.m16448g(interfaceC8838g.mo11876g()).m15223b(interfaceC8838g.mo11874a()).m15229h();
        }
        if (c7646cM16449h != null) {
            return c7646cM16449h;
        }
        C8413d.m16442a(4);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static final C7647d m14111h(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        C7647d c7647dM16448g = C8413d.m16448g(interfaceC8838g);
        C5207g.m11110e(c7647dM16448g, "getFqName(this)");
        return c7647dM16448g;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC5439d.a m14112i(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "<this>");
        return AbstractC5439d.a.f33983a;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC8863u m14113j(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        InterfaceC8863u interfaceC8863uM16445d = C8413d.m16445d(interfaceC8838g);
        C5207g.m11110e(interfaceC8863uM16445d, "getContainingModule(this)");
        return interfaceC8863uM16445d;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC7415h<InterfaceC8838g> m14114k(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        return C7073a.m14254O2(SequencesKt__SequencesKt.m14252M2(interfaceC8838g, new InterfaceC2052l<InterfaceC8838g, InterfaceC8838g>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$parentsWithSelf$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8838g mo528n(InterfaceC8838g interfaceC8838g2) {
                InterfaceC8838g interfaceC8838g3 = interfaceC8838g2;
                C5207g.m11111f(interfaceC8838g3, "it");
                return interfaceC8838g3.mo11876g();
            }
        }), 1);
    }

    /* JADX INFO: renamed from: l */
    public static final CallableMemberDescriptor m14115l(CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof InterfaceC6823d)) {
            return callableMemberDescriptor;
        }
        InterfaceC8829b0 interfaceC8829b0Mo13621K0 = ((InterfaceC6823d) callableMemberDescriptor).mo13621K0();
        C5207g.m11110e(interfaceC8829b0Mo13621K0, "correspondingProperty");
        return interfaceC8829b0Mo13621K0;
    }
}
