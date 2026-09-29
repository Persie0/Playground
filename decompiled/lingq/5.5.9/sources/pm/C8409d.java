package pm;

import ae.C0062b;
import dm.C5207g;
import io.C6387n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.C8850m;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p420um.C9570h0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: renamed from: pm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8409d extends C9570h0 {

    /* JADX INFO: renamed from: pm.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C8409d m16430a(C8407b c8407b, boolean z10) {
            String lowerCase;
            C5207g.m11111f(c8407b, "functionClass");
            C8409d c8409d = new C8409d(c8407b, null, CallableMemberDescriptor.Kind.DECLARATION, z10);
            InterfaceC8835e0 interfaceC8835e0Mo17092U0 = c8407b.mo17092U0();
            EmptyList emptyList = EmptyList.f38032a;
            ArrayList arrayList = new ArrayList();
            List<InterfaceC8847k0> list = c8407b.f45535k;
            for (Object obj : list) {
                if (!(((InterfaceC8847k0) obj).mo17088n() == Variance.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            C9332t c9332tM13458z0 = C6752c.m13458z0(arrayList);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(c9332tM13458z0, 10));
            Iterator it = c9332tM13458z0.iterator();
            while (true) {
                C9333u c9333u = (C9333u) it;
                if (!c9333u.hasNext()) {
                    c8409d.mo13636Y0(null, interfaceC8835e0Mo17092U0, emptyList, emptyList, arrayList2, ((InterfaceC8847k0) C6752c.m13432Z(list)).mo5316v(), Modality.ABSTRACT, C8850m.f46738e);
                    c8409d.f38525S = true;
                    return c8409d;
                }
                C9331s c9331s = (C9331s) c9333u.next();
                int i10 = c9331s.f48066a;
                InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) c9331s.f48067b;
                String strM15235f = interfaceC8847k0.mo11874a().m15235f();
                C5207g.m11110e(strM15235f, "typeParameter.name.asString()");
                if (C5207g.m11106a(strM15235f, "T")) {
                    lowerCase = "instance";
                } else if (C5207g.m11106a(strM15235f, "E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strM15235f.toLowerCase(Locale.ROOT);
                    C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
                C7648e c7648eM15232l = C7648e.m15232l(lowerCase);
                AbstractC5265x abstractC5265xMo5316v = interfaceC8847k0.mo5316v();
                C5207g.m11110e(abstractC5265xMo5316v, "typeParameter.defaultType");
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new C6830d(c8409d, null, i10, c10670a, c7648eM15232l, abstractC5265xMo5316v, false, false, false, null, InterfaceC8837f0.f46730a));
                arrayList2 = arrayList3;
            }
        }
    }

    public C8409d(InterfaceC8838g interfaceC8838g, C8409d c8409d, CallableMemberDescriptor.Kind kind, boolean z10) {
        super(interfaceC8838g, c8409d, InterfaceC9077e.a.f47365a, C6387n.f36800g, kind, InterfaceC8837f0.f46730a);
        this.f38514H = true;
        this.f38523Q = z10;
        this.f38524R = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return false;
    }

    @Override // p420um.C9570h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        C5207g.m11111f(interfaceC8838g, "newOwner");
        C5207g.m11111f(kind, "kind");
        C5207g.m11111f(interfaceC9077e, "annotations");
        return new C8409d(interfaceC8838g, (C8409d) interfaceC6822c, kind, this.f38523Q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: W */
    public final boolean mo5296W() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: W0 */
    public final AbstractC6828b mo13635W0(AbstractC6828b.a aVar) {
        boolean z10;
        C7648e c7648e;
        boolean z11;
        C5207g.m11111f(aVar, "configuration");
        C8409d c8409d = (C8409d) super.mo13635W0(aVar);
        if (c8409d == null) {
            return null;
        }
        List<InterfaceC8853n0> listMo11889i = c8409d.mo11889i();
        C5207g.m11110e(listMo11889i, "substituted.valueParameters");
        boolean z12 = false;
        if (listMo11889i.isEmpty()) {
            z10 = true;
            break;
        }
        Iterator<T> it = listMo11889i.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            AbstractC5257t abstractC5257tMo11884c = ((InterfaceC8853n0) it.next()).mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c, "it.type");
            if (C0062b.m292N0(abstractC5257tMo11884c) != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return c8409d;
        }
        List<InterfaceC8853n0> listMo11889i2 = c8409d.mo11889i();
        C5207g.m11110e(listMo11889i2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11889i2, 10));
        Iterator<T> it2 = listMo11889i2.iterator();
        while (it2.hasNext()) {
            AbstractC5257t abstractC5257tMo11884c2 = ((InterfaceC8853n0) it2.next()).mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c2, "it.type");
            arrayList.add(C0062b.m292N0(abstractC5257tMo11884c2));
        }
        int size = c8409d.mo11889i().size() - arrayList.size();
        if (size == 0) {
            List<InterfaceC8853n0> listMo11889i3 = c8409d.mo11889i();
            C5207g.m11110e(listMo11889i3, "valueParameters");
            ArrayList arrayListM13412A0 = C6752c.m13412A0(arrayList, listMo11889i3);
            if (!arrayListM13412A0.isEmpty()) {
                Iterator it3 = arrayListM13412A0.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!C5207g.m11106a((C7648e) pair.f38012a, ((InterfaceC8853n0) pair.f38013b).mo11874a())) {
                            z11 = false;
                            break;
                        }
                    }
                }
                if (z11) {
                    return c8409d;
                }
            }
            z11 = true;
            if (z11) {
                return c8409d;
            }
        }
        List<InterfaceC8853n0> listMo11889i4 = c8409d.mo11889i();
        C5207g.m11110e(listMo11889i4, "valueParameters");
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo11889i4, 10));
        for (InterfaceC8853n0 interfaceC8853n0 : listMo11889i4) {
            C7648e c7648eMo11874a = interfaceC8853n0.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "it.name");
            int index = interfaceC8853n0.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (c7648e = (C7648e) arrayList.get(i10)) != null) {
                c7648eMo11874a = c7648e;
            }
            arrayList2.add(interfaceC8853n0.mo13646l0(c8409d, c7648eMo11874a, index));
        }
        AbstractC6828b.a aVarM13637Z0 = c8409d.m13637Z0(TypeSubstitutor.f39894b);
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((C7648e) it4.next()) == null) {
                    z12 = true;
                    break;
                }
            }
        }
        aVarM13637Z0.f38561v = Boolean.valueOf(z12);
        aVarM13637Z0.f38546g = arrayList2;
        aVarM13637Z0.f38544e = c8409d.mo18004P0();
        AbstractC6828b abstractC6828bMo13635W0 = super.mo13635W0(aVarM13637Z0);
        C5207g.m11108c(abstractC6828bMo13635W0);
        return abstractC6828bMo13635W0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: x */
    public final boolean mo5301x() {
        return false;
    }
}
