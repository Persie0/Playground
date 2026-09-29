package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.sequences.C7073a;
import p249lo.C7422o;
import p249lo.InterfaceC7415h;
import p372rm.C8826a;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p388t1.C9181g;
import p543do.AbstractC5265x;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import pn.C8413d;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final C9181g m13611a(AbstractC5265x abstractC5265x, InterfaceC8836f interfaceC8836f, int i10) {
        if (interfaceC8836f != null && !C5602h.m11915f(interfaceC8836f)) {
            int size = interfaceC8836f.mo13604z().size() + i10;
            if (interfaceC8836f.mo13596U()) {
                List<InterfaceC5246n0> listSubList = abstractC5265x.mo11240V0().subList(i10, size);
                InterfaceC8838g interfaceC8838gMo11876g = interfaceC8836f.mo11876g();
                return new C9181g(interfaceC8836f, listSubList, m13611a(abstractC5265x, interfaceC8838gMo11876g instanceof InterfaceC8836f ? (InterfaceC8836f) interfaceC8838gMo11876g : null, size));
            }
            if (size != abstractC5265x.mo11240V0().size()) {
                C8413d.m16456o(interfaceC8836f);
            }
            return new C9181g(interfaceC8836f, abstractC5265x.mo11240V0().subList(i10, abstractC5265x.mo11240V0().size()), (C9181g) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final List<InterfaceC8847k0> m13612b(InterfaceC8836f interfaceC8836f) {
        List<InterfaceC8847k0> listMo11260r;
        InterfaceC8838g next;
        InterfaceC5240k0 interfaceC5240k0Mo13600k;
        C5207g.m11111f(interfaceC8836f, "<this>");
        List<InterfaceC8847k0> listMo13604z = interfaceC8836f.mo13604z();
        C5207g.m11110e(listMo13604z, "declaredTypeParameters");
        if (!interfaceC8836f.mo13596U() && !(interfaceC8836f.mo11876g() instanceof InterfaceC6816a)) {
            return listMo13604z;
        }
        InterfaceC7415h<InterfaceC8838g> interfaceC7415hM14114k = DescriptorUtilsKt.m14114k(interfaceC8836f);
        C6813x246a49e2 c6813x246a49e2 = new InterfaceC2052l<InterfaceC8838g, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC8838g interfaceC8838g) {
                InterfaceC8838g interfaceC8838g2 = interfaceC8838g;
                C5207g.m11111f(interfaceC8838g2, "it");
                return Boolean.valueOf(interfaceC8838g2 instanceof InterfaceC6816a);
            }
        };
        C5207g.m11111f(interfaceC7415hM14114k, "<this>");
        C5207g.m11111f(c6813x246a49e2, "predicate");
        List listM17255u = C9000b.m17255u(C7073a.m14267b3(C7073a.m14260U2(C7073a.m14255P2(new C7422o(interfaceC7415hM14114k, c6813x246a49e2), new InterfaceC2052l<InterfaceC8838g, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC8838g interfaceC8838g) {
                InterfaceC8838g interfaceC8838g2 = interfaceC8838g;
                C5207g.m11111f(interfaceC8838g2, "it");
                return Boolean.valueOf(!(interfaceC8838g2 instanceof InterfaceC6821b));
            }
        }), new InterfaceC2052l<InterfaceC8838g, InterfaceC7415h<? extends InterfaceC8847k0>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC7415h<? extends InterfaceC8847k0> mo528n(InterfaceC8838g interfaceC8838g) {
                InterfaceC8838g interfaceC8838g2 = interfaceC8838g;
                C5207g.m11111f(interfaceC8838g2, "it");
                List<InterfaceC8847k0> listMo11895r = ((InterfaceC6816a) interfaceC8838g2).mo11895r();
                C5207g.m11110e(listMo11895r, "it as CallableDescriptor).typeParameters");
                return C6752c.m13413G(listMo11895r);
            }
        })));
        Iterator<InterfaceC8838g> it = DescriptorUtilsKt.m14114k(interfaceC8836f).iterator();
        do {
            listMo11260r = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof InterfaceC8830c));
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) next;
        if (interfaceC8830c != null && (interfaceC5240k0Mo13600k = interfaceC8830c.mo13600k()) != null) {
            listMo11260r = interfaceC5240k0Mo13600k.mo11260r();
        }
        if (listMo11260r == null) {
            listMo11260r = EmptyList.f38032a;
        }
        if (listM17255u.isEmpty() && listMo11260r.isEmpty()) {
            List<InterfaceC8847k0> listMo13604z2 = interfaceC8836f.mo13604z();
            C5207g.m11110e(listMo13604z2, "declaredTypeParameters");
            return listMo13604z2;
        }
        ArrayList<InterfaceC8847k0> arrayListM13438f0 = C6752c.m13438f0(listMo11260r, listM17255u);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM13438f0, 10));
        for (InterfaceC8847k0 interfaceC8847k0 : arrayListM13438f0) {
            C5207g.m11110e(interfaceC8847k0, "it");
            arrayList.add(new C8826a(interfaceC8847k0, interfaceC8836f, listMo13604z.size()));
        }
        return C6752c.m13438f0(arrayList, listMo13604z);
    }
}
