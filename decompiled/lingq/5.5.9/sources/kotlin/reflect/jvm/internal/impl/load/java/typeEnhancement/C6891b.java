package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ae.C0062b;
import cm.InterfaceC2052l;
import cn.InterfaceC2065b;
import dm.C5207g;
import hn.C6082b;
import hn.C6083c;
import hn.C6084d;
import hn.C6090j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7646c;
import mn.C7647d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p347qm.C8646c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5248o0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import p543do.InterfaceC5263w;
import pn.C8413d;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6891b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2065b f38885a = InterfaceC2065b.a.f10519a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC5257t f38886a;

        /* JADX INFO: renamed from: b */
        public final int f38887b;

        public a(AbstractC5262v0 abstractC5262v0, int i10) {
            this.f38886a = abstractC5262v0;
            this.f38887b = i10;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC5265x f38888a;

        /* JADX INFO: renamed from: b */
        public final int f38889b;

        /* JADX INFO: renamed from: c */
        public final boolean f38890c;

        public b(AbstractC5265x abstractC5265x, int i10, boolean z10) {
            this.f38888a = abstractC5265x;
            this.f38889b = i10;
            this.f38890c = z10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX INFO: renamed from: a */
    public final b m13740a(AbstractC5265x abstractC5265x, InterfaceC2052l<? super Integer, C6083c> interfaceC2052l, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        InterfaceC8834e interfaceC8834eMo11235q;
        InterfaceC8830c interfaceC8830cM16707X;
        Boolean bool;
        InterfaceC5240k0 interfaceC5240k0Mo11250X0;
        boolean z12;
        Iterator it;
        a aVar;
        AbstractC5248o0 abstractC5248o0M11302m;
        InterfaceC2052l<? super Integer, C6083c> interfaceC2052l2 = interfaceC2052l;
        C5207g.m11111f(typeComponentPosition, "<this>");
        TypeComponentPosition typeComponentPosition2 = TypeComponentPosition.INFLEXIBLE;
        boolean z13 = typeComponentPosition != typeComponentPosition2;
        boolean z14 = (z11 && z10) ? false : true;
        AbstractC5262v0 abstractC5262v0 = null;
        if ((z13 || !abstractC5265x.mo11240V0().isEmpty()) && (interfaceC8834eMo11235q = abstractC5265x.mo11250X0().mo11235q()) != null) {
            AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$1 = (AbstractSignatureParts$computeIndexedQualifiers$1) interfaceC2052l2;
            C6083c c6083c = (C6083c) abstractSignatureParts$computeIndexedQualifiers$1.mo528n(Integer.valueOf(i10));
            C6082b c6082b = C6090j.f35841a;
            if (!(typeComponentPosition != typeComponentPosition2) || !(interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
                interfaceC8830cM16707X = null;
            } else if (c6083c.f35821b == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo11235q;
                String str = C8646c.f46201a;
                C7647d c7647dM16448g = C8413d.m16448g(interfaceC8830c);
                HashMap<C7647d, C7646c> map = C8646c.f46210j;
                if (map.containsKey(c7647dM16448g)) {
                    C7646c c7646c = map.get(C8413d.m16448g(interfaceC8830c));
                    if (c7646c == null) {
                        throw new IllegalArgumentException("Given class " + interfaceC8830c + " is not a mutable collection");
                    }
                    interfaceC8830cM16707X = DescriptorUtilsKt.m14108e(interfaceC8830c).m13553j(c7646c);
                } else if (c6083c.f35821b == MutabilityQualifier.MUTABLE) {
                    interfaceC8830cM16707X = null;
                } else {
                    interfaceC8830cM16707X = null;
                }
            } else if (c6083c.f35821b == MutabilityQualifier.MUTABLE || typeComponentPosition != TypeComponentPosition.FLEXIBLE_UPPER) {
                interfaceC8830cM16707X = null;
            } else {
                InterfaceC8830c interfaceC8830c2 = (InterfaceC8830c) interfaceC8834eMo11235q;
                String str2 = C8646c.f46201a;
                if (C8646c.f46211k.containsKey(C8413d.m16448g(interfaceC8830c2))) {
                    interfaceC8830cM16707X = C8573r0.m16707X(interfaceC8830c2);
                } else {
                    interfaceC8830cM16707X = null;
                }
            }
            if (typeComponentPosition != typeComponentPosition2) {
                NullabilityQualifier nullabilityQualifier = c6083c.f35820a;
                int i11 = nullabilityQualifier == null ? -1 : C6090j.a.f35843a[nullabilityQualifier.ordinal()];
                if (i11 == 1) {
                    bool = Boolean.TRUE;
                } else if (i11 != 2) {
                    bool = null;
                } else {
                    bool = Boolean.FALSE;
                }
            } else {
                bool = null;
            }
            if (interfaceC8830cM16707X == null || (interfaceC5240k0Mo11250X0 = interfaceC8830cM16707X.mo13600k()) == null) {
                interfaceC5240k0Mo11250X0 = abstractC5265x.mo11250X0();
            }
            C5207g.m11110e(interfaceC5240k0Mo11250X0, "enhancedClassifier?.typeConstructor ?: constructor");
            int i12 = i10 + 1;
            List<InterfaceC5246n0> listMo11240V0 = abstractC5265x.mo11240V0();
            List<InterfaceC8847k0> listMo11260r = interfaceC5240k0Mo11250X0.mo11260r();
            C5207g.m11110e(listMo11260r, "typeConstructor.parameters");
            Iterator it2 = listMo11240V0.iterator();
            Iterator<T> it3 = listMo11260r.iterator();
            ArrayList arrayList = new ArrayList(Math.min(C9325m.m17681z(listMo11240V0, 10), C9325m.m17681z(listMo11260r, 10)));
            while (it2.hasNext() && it3.hasNext()) {
                Object next = it2.next();
                InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) it3.next();
                InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) next;
                if (z14) {
                    it = it2;
                    if (!interfaceC5246n0.mo11239f()) {
                        aVar = m13741b(interfaceC5246n0.mo11236c().mo11288a1(), interfaceC2052l2, i12, z11);
                    } else if (((C6083c) abstractSignatureParts$computeIndexedQualifiers$1.mo528n(Integer.valueOf(i12))).f35820a == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        AbstractC5262v0 abstractC5262v0Mo11288a1 = interfaceC5246n0.mo11236c().mo11288a1();
                        aVar = new a(KotlinTypeFactory.m14184c(C0062b.m262E1(abstractC5262v0Mo11288a1).mo11217b1(false), C0062b.m415x2(abstractC5262v0Mo11288a1).mo11217b1(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                } else {
                    it = it2;
                    aVar = new a(abstractC5262v0, 0);
                }
                i12 += aVar.f38887b;
                AbstractC5257t abstractC5257t = aVar.f38886a;
                if (abstractC5257t != null) {
                    Variance varianceMo11237d = interfaceC5246n0.mo11237d();
                    C5207g.m11110e(varianceMo11237d, "arg.projectionKind");
                    abstractC5248o0M11302m = TypeUtilsKt.m14228e(abstractC5257t, varianceMo11237d, interfaceC8847k0);
                } else if (interfaceC8830cM16707X == null || interfaceC5246n0.mo11239f()) {
                    abstractC5248o0M11302m = interfaceC8830cM16707X != null ? C5258t0.m11302m(interfaceC8847k0) : null;
                } else {
                    AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c, "arg.type");
                    Variance varianceMo11237d2 = interfaceC5246n0.mo11237d();
                    C5207g.m11110e(varianceMo11237d2, "arg.projectionKind");
                    abstractC5248o0M11302m = TypeUtilsKt.m14228e(abstractC5257tMo11236c, varianceMo11237d2, interfaceC8847k0);
                }
                arrayList.add(abstractC5248o0M11302m);
                interfaceC2052l2 = interfaceC2052l;
                it2 = it;
                abstractC5262v0 = null;
            }
            int i13 = i12 - i10;
            if (interfaceC8830cM16707X == null && bool == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z12 = true;
                            break;
                        }
                        if (!(((InterfaceC5246n0) it4.next()) == null)) {
                            z12 = false;
                            break;
                        }
                    }
                } else {
                    z12 = true;
                    break;
                }
                if (z12) {
                    return new b(null, i13, false);
                }
            }
            InterfaceC9077e[] interfaceC9077eArr = new InterfaceC9077e[3];
            interfaceC9077eArr[0] = abstractC5265x.mo11289w();
            C6082b c6082b2 = C6090j.f35842b;
            if (!(interfaceC8830cM16707X != null)) {
                c6082b2 = null;
            }
            interfaceC9077eArr[1] = c6082b2;
            C6082b c6082b3 = C6090j.f35841a;
            if (!(bool != null)) {
                c6082b3 = null;
            }
            interfaceC9077eArr[2] = c6082b3;
            ArrayList arrayListM13378j0 = C6744b.m13378j0(interfaceC9077eArr);
            int size = arrayListM13378j0.size();
            if (size == 0) {
                throw new IllegalStateException("At least one Annotations object expected".toString());
            }
            C5238j0 c5238j0M379o2 = C0062b.m379o2(size != 1 ? new CompositeAnnotations((List<? extends InterfaceC9077e>) C6752c.m13453u0(arrayListM13378j0)) : (InterfaceC9077e) C6752c.m13443k0(arrayListM13378j0));
            List<InterfaceC5246n0> listMo11240V1 = abstractC5265x.mo11240V0();
            Iterator it5 = arrayList.iterator();
            Iterator<T> it6 = listMo11240V1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(C9325m.m17681z(arrayList, 10), C9325m.m17681z(listMo11240V1, 10)));
            while (it5.hasNext() && it6.hasNext()) {
                Object next2 = it5.next();
                InterfaceC5246n0 interfaceC5246n1 = (InterfaceC5246n0) it6.next();
                InterfaceC5246n0 interfaceC5246n2 = (InterfaceC5246n0) next2;
                if (interfaceC5246n2 != null) {
                    interfaceC5246n1 = interfaceC5246n2;
                }
                arrayList2.add(interfaceC5246n1);
            }
            AbstractC5265x abstractC5265xM14187f = KotlinTypeFactory.m14187f(c5238j0M379o2, interfaceC5240k0Mo11250X0, arrayList2, bool != null ? bool.booleanValue() : abstractC5265x.mo11242Y0(), null);
            if (c6083c.f35822c) {
                this.f38885a.mo6211a();
                abstractC5265xM14187f = new C6084d(abstractC5265xM14187f);
            }
            return new b(abstractC5265xM14187f, i13, bool != null && c6083c.f35823d);
        }
        return new b(null, 1, false);
    }

    /* JADX INFO: renamed from: b */
    public final a m13741b(AbstractC5262v0 abstractC5262v0, InterfaceC2052l<? super Integer, C6083c> interfaceC2052l, int i10, boolean z10) {
        AbstractC5262v0 abstractC5262v0M14184c;
        AbstractC5265x abstractC5265x;
        AbstractC5265x abstractC5265x2;
        AbstractC5262v0 abstractC5262v0M247A2 = null;
        if (C7499b.m14926X(abstractC5262v0)) {
            return new a(null, 1);
        }
        if (!(abstractC5262v0 instanceof AbstractC5249p)) {
            if (!(abstractC5262v0 instanceof AbstractC5265x)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVarM13740a = m13740a((AbstractC5265x) abstractC5262v0, interfaceC2052l, i10, TypeComponentPosition.INFLEXIBLE, false, z10);
            boolean z11 = bVarM13740a.f38890c;
            AbstractC5262v0 abstractC5262v0M247A3 = bVarM13740a.f38888a;
            if (z11) {
                abstractC5262v0M247A3 = C0062b.m247A2(abstractC5262v0, abstractC5262v0M247A3);
            }
            return new a(abstractC5262v0M247A3, bVarM13740a.f38889b);
        }
        boolean z12 = abstractC5262v0 instanceof InterfaceC5263w;
        AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0;
        b bVarM13740a2 = m13740a(abstractC5249p.f33340b, interfaceC2052l, i10, TypeComponentPosition.FLEXIBLE_LOWER, z12, z10);
        b bVarM13740a3 = m13740a(abstractC5249p.f33341c, interfaceC2052l, i10, TypeComponentPosition.FLEXIBLE_UPPER, z12, z10);
        AbstractC5265x abstractC5265x3 = bVarM13740a3.f38888a;
        AbstractC5265x abstractC5265x4 = bVarM13740a2.f38888a;
        if (abstractC5265x4 != null || abstractC5265x3 != null) {
            if (bVarM13740a2.f38890c || bVarM13740a3.f38890c) {
                if (abstractC5265x3 != null) {
                    if (abstractC5265x4 == null) {
                        abstractC5265x4 = abstractC5265x3;
                    }
                    abstractC5262v0M14184c = KotlinTypeFactory.m14184c(abstractC5265x4, abstractC5265x3);
                } else {
                    C5207g.m11108c(abstractC5265x4);
                    abstractC5262v0M14184c = abstractC5265x4;
                }
                abstractC5262v0M247A2 = C0062b.m247A2(abstractC5262v0, abstractC5262v0M14184c);
            } else {
                AbstractC5265x abstractC5265x5 = abstractC5249p.f33341c;
                AbstractC5265x abstractC5265x6 = abstractC5249p.f33340b;
                if (z12) {
                    if (abstractC5265x4 == null) {
                        abstractC5265x = abstractC5265x4;
                        abstractC5265x2 = abstractC5265x4;
                        abstractC5265x2 = abstractC5265x6;
                    }
                    if (abstractC5265x3 == null) {
                        abstractC5265x3 = abstractC5265x5;
                    }
                    abstractC5262v0M247A2 = new RawTypeImpl(abstractC5265x2, abstractC5265x3);
                } else {
                    if (abstractC5265x4 == null) {
                        abstractC5265x = abstractC5265x6;
                    }
                    if (abstractC5265x3 == null) {
                        abstractC5265x3 = abstractC5265x5;
                    }
                    abstractC5262v0M247A2 = KotlinTypeFactory.m14184c(abstractC5265x, abstractC5265x3);
                }
            }
        }
        return new a(abstractC5262v0M247A2, bVarM13740a2.f38889b);
    }
}
