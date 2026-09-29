package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import bn.C1618b;
import bn.C1620d;
import bn.C1621e;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2072d;
import co.InterfaceC2073e;
import dm.C5206f;
import dm.C5207g;
import gn.InterfaceC5826f;
import gn.InterfaceC5827g;
import gn.InterfaceC5831k;
import gn.InterfaceC5834n;
import gn.InterfaceC5836p;
import gn.InterfaceC5837q;
import gn.InterfaceC5842v;
import gn.InterfaceC5843w;
import gn.InterfaceC5844x;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jo.C6532d;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.C6841b;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C6892c;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mo.C7661i;
import p016an.InterfaceC0130d;
import p016an.InterfaceC0131e;
import p078dn.InterfaceC5215a;
import p101en.C5434a;
import p101en.C5435b;
import p102eo.C5443h;
import p102eo.InterfaceC5438c;
import p260m8.C7499b;
import p266n.C7669f;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p385sf.C9000b;
import p420um.AbstractC9575k;
import p420um.C9564e0;
import p420um.C9566f0;
import p420um.C9570h0;
import p420um.C9584q;
import p466wn.C9981d;
import p516ym.InterfaceC10417b;
import p541zn.InterfaceC10548l;
import p543do.AbstractC5257t;
import p543do.C5258t0;
import pn.C8412c;
import pn.C8413d;
import sl.InterfaceC9070c;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9327o;
import tl.C9338z;
import zm.C10518c;
import zm.C10519d;
import zm.C10527l;
import zm.C10528m;
import zm.C10533r;
import zm.C10534s;
import zm.InterfaceC10524i;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: n */
    public final InterfaceC8830c f38727n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC5827g f38728o;

    /* JADX INFO: renamed from: p */
    public final boolean f38729p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2073e<List<InterfaceC8828b>> f38730q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2073e<Set<C7648e>> f38731r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2073e<Map<C7648e, InterfaceC5834n>> f38732s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2072d<C7648e, AbstractC9575k> f38733t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final C7669f c7669f, InterfaceC8830c interfaceC8830c, InterfaceC5827g interfaceC5827g, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c7669f, lazyJavaClassMemberScope);
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(interfaceC8830c, "ownerDescriptor");
        C5207g.m11111f(interfaceC5827g, "jClass");
        this.f38727n = interfaceC8830c;
        this.f38728o = interfaceC5827g;
        this.f38729p = z10;
        this.f38730q = c7669f.m15268b().mo6217b(new InterfaceC2041a<List<? extends InterfaceC8828b>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [bn.b, kotlin.reflect.jvm.internal.impl.descriptors.impl.b, um.j] */
            /* JADX WARN: Type inference failed for: r15v16 */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r15v4 */
            /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r1v22, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC8828b> mo807E() {
                boolean z11;
                C7669f c7669f2;
                InterfaceC8830c interfaceC8830c2;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2;
                C7669f c7669f3;
                C7669f c7669f4;
                List listM17253s;
                C6892c c6892c;
                ?? EmptyList;
                Pair pair;
                C6892c c6892c2;
                ?? r15;
                boolean z12;
                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.f38737b;
                List listMo12253l = lazyJavaClassMemberScope3.f38728o.mo12253l();
                ArrayList arrayList = new ArrayList(listMo12253l.size());
                Iterator it = listMo12253l.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z11 = false;
                    c7669f2 = lazyJavaClassMemberScope3.f38771b;
                    interfaceC8830c2 = lazyJavaClassMemberScope3.f38727n;
                    if (!zHasNext) {
                        break;
                    }
                    InterfaceC5831k interfaceC5831k = (InterfaceC5831k) it.next();
                    LazyJavaAnnotations lazyJavaAnnotationsM14968u0 = C7499b.m14968u0(c7669f2, interfaceC5831k);
                    Object obj = c7669f2.f42146a;
                    C1618b c1618bM5277i1 = C1618b.m5277i1(interfaceC8830c2, lazyJavaAnnotationsM14968u0, false, ((C2064a) obj).f10504j.mo11843a(interfaceC5831k));
                    C7669f c7669f5 = new C7669f((C2064a) obj, new LazyJavaTypeParameterResolver(c7669f2, c1618bM5277i1, interfaceC5831k, interfaceC8830c2.mo13604z().size()), (InterfaceC9070c) c7669f2.f42148c);
                    LazyJavaScope.C6852b c6852bM13721u = LazyJavaScope.m13721u(c7669f5, c1618bM5277i1, interfaceC5831k.mo12266i());
                    List<InterfaceC8847k0> listMo13604z = interfaceC8830c2.mo13604z();
                    C5207g.m11110e(listMo13604z, "classDescriptor.declaredTypeParameters");
                    ArrayList arrayListMo12287r = interfaceC5831k.mo12287r();
                    ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayListMo12287r, 10));
                    Iterator it2 = arrayListMo12287r.iterator();
                    while (it2.hasNext()) {
                        InterfaceC8847k0 interfaceC8847k0Mo6215a = ((InterfaceC2068e) c7669f5.f42147b).mo6215a((InterfaceC5844x) it2.next());
                        C5207g.m11108c(interfaceC8847k0Mo6215a);
                        arrayList2.add(interfaceC8847k0Mo6215a);
                    }
                    c1618bM5277i1.m18030h1(c6852bM13721u.f38789a, C7499b.m14895B0(interfaceC5831k.mo12278f()), C6752c.m13438f0(arrayList2, listMo13604z));
                    c1618bM5277i1.mo5280b1(false);
                    c1618bM5277i1.mo5281c1(c6852bM13721u.f38790b);
                    c1618bM5277i1.m13639d1(interfaceC8830c2.mo5316v());
                    ((InterfaceC0130d.a) ((C2064a) c7669f5.f42146a).f10501g).getClass();
                    arrayList.add(c1618bM5277i1);
                }
                InterfaceC5827g interfaceC5827g2 = lazyJavaClassMemberScope3.f38728o;
                boolean zMo12259y = interfaceC5827g2.mo12259y();
                InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
                String str = "PROTECTED_AND_PACKAGE";
                String str2 = "classDescriptor.visibility";
                C7669f c7669f6 = c7669f;
                if (zMo12259y) {
                    C1618b c1618bM5277i2 = C1618b.m5277i1(interfaceC8830c2, c10670a, true, ((C2064a) c7669f2.f42146a).f10504j.mo11843a(interfaceC5827g2));
                    ArrayList arrayListMo12254n = interfaceC5827g2.mo12254n();
                    ArrayList arrayList3 = new ArrayList(arrayListMo12254n.size());
                    C5434a c5434aM11586b = C5435b.m11586b(TypeUsage.COMMON, false, null, 2);
                    Iterator it3 = arrayListMo12254n.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        int i11 = i10 + 1;
                        InterfaceC5842v interfaceC5842v = (InterfaceC5842v) it3.next();
                        AbstractC5257t abstractC5257tM13735e = ((C6859a) c7669f2.f42150e).m13735e(interfaceC5842v.mo12286c(), c5434aM11586b);
                        boolean zMo12285b = interfaceC5842v.mo12285b();
                        Iterator it4 = it3;
                        Object obj2 = c7669f2.f42146a;
                        LazyJavaClassMemberScope lazyJavaClassMemberScope4 = lazyJavaClassMemberScope3;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new C6830d(c1618bM5277i2, null, i10, c10670a, interfaceC5842v.mo12280a(), abstractC5257tM13735e, false, false, false, zMo12285b ? ((C2064a) obj2).f10509o.mo11877o().m13550g(abstractC5257tM13735e) : null, ((C2064a) obj2).f10504j.mo11843a(interfaceC5842v)));
                        c7669f6 = c7669f6;
                        arrayList3 = arrayList4;
                        i10 = i11;
                        it3 = it4;
                        c5434aM11586b = c5434aM11586b;
                        lazyJavaClassMemberScope3 = lazyJavaClassMemberScope4;
                        z11 = false;
                    }
                    lazyJavaClassMemberScope2 = lazyJavaClassMemberScope3;
                    c7669f3 = c7669f6;
                    ArrayList arrayList5 = arrayList3;
                    c1618bM5277i2.mo5281c1(z11);
                    AbstractC8852n abstractC8852nMo11886f = interfaceC8830c2.mo11886f();
                    C5207g.m11110e(abstractC8852nMo11886f, "classDescriptor.visibility");
                    if (C5207g.m11106a(abstractC8852nMo11886f, C10527l.f52521b)) {
                        abstractC8852nMo11886f = C10527l.f52522c;
                        C5207g.m11110e(abstractC8852nMo11886f, "PROTECTED_AND_PACKAGE");
                    }
                    c1618bM5277i2.m18029g1(arrayList5, abstractC8852nMo11886f);
                    c1618bM5277i2.mo5280b1(false);
                    c1618bM5277i2.m13639d1(interfaceC8830c2.mo5316v());
                    int i12 = 2;
                    String strM14957p = C7499b.m14957p(c1618bM5277i2, 2);
                    if (arrayList.isEmpty()) {
                        z12 = true;
                        break;
                    }
                    Iterator it5 = arrayList.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z12 = true;
                            break;
                        }
                        if (C5207g.m11106a(C7499b.m14957p((InterfaceC8828b) it5.next(), i12), strM14957p)) {
                            z12 = false;
                            break;
                        }
                        i12 = 2;
                    }
                    if (z12) {
                        arrayList.add(c1618bM5277i2);
                        ((InterfaceC0130d.a) ((C2064a) c7669f3.f42146a).f10501g).getClass();
                    }
                } else {
                    lazyJavaClassMemberScope2 = lazyJavaClassMemberScope3;
                    c7669f3 = c7669f6;
                }
                ((C2064a) c7669f3.f42146a).f10518x.mo18062e(interfaceC8830c2, arrayList);
                C6892c c6892c3 = ((C2064a) c7669f3.f42146a).f10512r;
                if (arrayList.isEmpty()) {
                    boolean zMo12256t = interfaceC5827g2.mo12256t();
                    if (!interfaceC5827g2.mo12248O()) {
                        interfaceC5827g2.mo12244A();
                    }
                    if (zMo12256t) {
                        ?? M5277i1 = C1618b.m5277i1(interfaceC8830c2, c10670a, true, ((C2064a) c7669f2.f42146a).f10504j.mo11843a(interfaceC5827g2));
                        if (zMo12256t) {
                            List listMo12245B = interfaceC5827g2.mo12245B();
                            EmptyList = new ArrayList(listMo12245B.size());
                            C5434a c5434aM11586b2 = C5435b.m11586b(TypeUsage.COMMON, true, null, 2);
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList<InterfaceC5837q> arrayList7 = new ArrayList();
                            for (Object obj3 : listMo12245B) {
                                if (C5207g.m11106a(((InterfaceC5837q) obj3).mo12280a(), C10534s.f52535b)) {
                                    arrayList6.add(obj3);
                                } else {
                                    arrayList7.add(obj3);
                                }
                            }
                            arrayList6.size();
                            InterfaceC5837q interfaceC5837q = (InterfaceC5837q) C6752c.m13425S(arrayList6);
                            Object obj4 = c7669f2.f42150e;
                            if (interfaceC5837q != null) {
                                InterfaceC5843w interfaceC5843wMo12275m = interfaceC5837q.mo12275m();
                                if (interfaceC5843wMo12275m instanceof InterfaceC5826f) {
                                    C6859a c6859a = (C6859a) obj4;
                                    InterfaceC5826f interfaceC5826f = (InterfaceC5826f) interfaceC5843wMo12275m;
                                    pair = new Pair(c6859a.m13734c(interfaceC5826f, c5434aM11586b2, true), c6859a.m13735e(interfaceC5826f.mo12243S(), c5434aM11586b2));
                                } else {
                                    pair = new Pair(((C6859a) obj4).m13735e(interfaceC5843wMo12275m, c5434aM11586b2), null);
                                }
                                lazyJavaClassMemberScope2.m13715x(EmptyList, M5277i1, 0, interfaceC5837q, (AbstractC5257t) pair.f38012a, (AbstractC5257t) pair.f38013b);
                            }
                            int i13 = interfaceC5837q != null ? 1 : 0;
                            int i14 = 0;
                            for (InterfaceC5837q interfaceC5837q2 : arrayList7) {
                                lazyJavaClassMemberScope2.m13715x(EmptyList, M5277i1, i14 + i13, interfaceC5837q2, ((C6859a) obj4).m13735e(interfaceC5837q2.mo12275m(), c5434aM11586b2), null);
                                i14++;
                            }
                        } else {
                            c6892c3 = c6892c3;
                            c7669f3 = c7669f3;
                            str2 = "classDescriptor.visibility";
                            str = "PROTECTED_AND_PACKAGE";
                            EmptyList = Collections.emptyList();
                        }
                        M5277i1.mo5281c1(false);
                        AbstractC8852n abstractC8852nMo11886f2 = interfaceC8830c2.mo11886f();
                        C5207g.m11110e(abstractC8852nMo11886f2, str2);
                        if (C5207g.m11106a(abstractC8852nMo11886f2, C10527l.f52521b)) {
                            abstractC8852nMo11886f2 = C10527l.f52522c;
                            C5207g.m11110e(abstractC8852nMo11886f2, str);
                        }
                        M5277i1.m18029g1(EmptyList, abstractC8852nMo11886f2);
                        M5277i1.mo5280b1(true);
                        M5277i1.m13639d1(interfaceC8830c2.mo5316v());
                        ((InterfaceC0130d.a) ((C2064a) c7669f2.f42146a).f10501g).getClass();
                        r15 = M5277i1;
                        c6892c2 = c6892c3;
                    } else {
                        c6892c2 = c6892c3;
                        c7669f3 = c7669f3;
                        r15 = 0;
                    }
                    c6892c = c6892c2;
                    c7669f4 = c7669f3;
                    listM17253s = C9000b.m17253s(r15);
                } else {
                    c7669f4 = c7669f3;
                    c6892c = c6892c3;
                    listM17253s = arrayList;
                }
                return C6752c.m13453u0(c6892c.m13744c(c7669f4, listM17253s));
            }
        });
        this.f38731r = c7669f.m15268b().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                return C6752c.m13457y0(this.f38742b.f38728o.mo12251W());
            }
        });
        this.f38732s = c7669f.m15268b().mo6217b(new InterfaceC2041a<Map<C7648e, ? extends InterfaceC5834n>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<C7648e, ? extends InterfaceC5834n> mo807E() {
                List listMo12258v = this.f38739b.f38728o.mo12258v();
                ArrayList arrayList = new ArrayList();
                Iterator it = listMo12258v.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (((InterfaceC5834n) next).mo12269M()) {
                            arrayList.add(next);
                        }
                    }
                }
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(arrayList, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                for (Object obj : arrayList) {
                    linkedHashMap.put(((InterfaceC5834n) obj).mo12280a(), obj);
                }
                return linkedHashMap;
            }
        });
        this.f38733t = c7669f.m15268b().mo6222g(new InterfaceC2052l<C7648e, AbstractC9575k>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC9575k mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                C5207g.m11111f(c7648e2, "name");
                final LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.f38743b;
                boolean zContains = lazyJavaClassMemberScope2.f38731r.mo807E().contains(c7648e2);
                C7669f c7669f2 = c7669f;
                if (!zContains) {
                    InterfaceC5834n interfaceC5834n = lazyJavaClassMemberScope2.f38732s.mo807E().get(c7648e2);
                    if (interfaceC5834n == null) {
                        return null;
                    }
                    return C9584q.m18046V0(c7669f2.m15268b(), lazyJavaClassMemberScope2.f38727n, c7648e2, c7669f2.m15268b().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Set<? extends C7648e> mo807E() {
                            LazyJavaClassMemberScope lazyJavaClassMemberScope3 = lazyJavaClassMemberScope2;
                            return C9338z.m17691N0(lazyJavaClassMemberScope3.mo11903a(), lazyJavaClassMemberScope3.mo11906d());
                        }
                    }), C7499b.m14968u0(c7669f2, interfaceC5834n), ((C2064a) c7669f2.f42146a).f10504j.mo11843a(interfaceC5834n));
                }
                InterfaceC10524i interfaceC10524i = ((C2064a) c7669f2.f42146a).f10496b;
                InterfaceC8830c interfaceC8830c2 = lazyJavaClassMemberScope2.f38727n;
                C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c2);
                C5207g.m11108c(c7645bM14109f);
                C6831a c6831aMo18551c = interfaceC10524i.mo18551c(new InterfaceC10524i.a(c7645bM14109f.m15206d(c7648e2), lazyJavaClassMemberScope2.f38728o, 2));
                if (c6831aMo18551c == null) {
                    return null;
                }
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(c7669f2, interfaceC8830c2, c6831aMo18551c, null);
                ((C2064a) c7669f2.f42146a).f10513s.mo19498a(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static InterfaceC6824e m13690C(InterfaceC6824e interfaceC6824e, InterfaceC6822c interfaceC6822c, AbstractCollection abstractCollection) {
        boolean z10 = true;
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) it.next();
                if (!C5207g.m11106a(interfaceC6824e, interfaceC6824e2) && interfaceC6824e2.mo13620k0() == null && m13692F(interfaceC6824e2, interfaceC6822c)) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            return interfaceC6824e;
        }
        InterfaceC6822c interfaceC6822cMo11851a = interfaceC6824e.mo11848M0().mo11864n().mo11851a();
        C5207g.m11108c(interfaceC6822cMo11851a);
        return (InterfaceC6824e) interfaceC6822cMo11851a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: D */
    public static InterfaceC6824e m13691D(InterfaceC6824e interfaceC6824e) {
        C7646c c7646cM15229h;
        List<InterfaceC8853n0> listMo11889i = interfaceC6824e.mo11889i();
        C5207g.m11110e(listMo11889i, "valueParameters");
        InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) C6752c.m13433a0(listMo11889i);
        if (interfaceC8853n0 != null) {
            InterfaceC8834e interfaceC8834eMo11235q = interfaceC8853n0.mo11884c().mo11250X0().mo11235q();
            if (interfaceC8834eMo11235q != null) {
                C7647d c7647dM14111h = DescriptorUtilsKt.m14111h(interfaceC8834eMo11235q);
                if (!c7647dM14111h.m15226e()) {
                    c7647dM14111h = null;
                }
                if (c7647dM14111h != null) {
                    c7646cM15229h = c7647dM14111h.m15229h();
                } else {
                    c7646cM15229h = null;
                }
            } else {
                c7646cM15229h = null;
            }
            if (!C5207g.m11106a(c7646cM15229h, C6797e.f38339e)) {
                interfaceC8853n0 = null;
            }
            if (interfaceC8853n0 != null) {
                InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M0 = interfaceC6824e.mo11848M0();
                List<InterfaceC8853n0> listMo11889i2 = interfaceC6824e.mo11889i();
                C5207g.m11110e(listMo11889i2, "valueParameters");
                InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) aVarMo11848M0.mo11853c(C6752c.m13418L(listMo11889i2)).mo11855e(interfaceC8853n0.mo11884c().mo11240V0().get(0).mo11236c()).mo11851a();
                C9570h0 c9570h0 = (C9570h0) interfaceC6824e2;
                if (c9570h0 != null) {
                    c9570h0.f38523Q = true;
                }
                return interfaceC6824e2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m13692F(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultM14090c = OverridingUtil.f39632f.m14086n(interfaceC6816a2, interfaceC6816a, true).m14090c();
        C5207g.m11110e(resultM14090c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return resultM14090c == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !C10528m.a.m19505a(interfaceC6816a2, interfaceC6816a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.c, kotlin.reflect.jvm.internal.impl.descriptors.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.a] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX INFO: renamed from: G */
    public static boolean m13693G(InterfaceC6824e interfaceC6824e, InterfaceC6824e interfaceC6824e2) {
        int i10 = C10518c.f52505m;
        C5207g.m11111f(interfaceC6824e, "<this>");
        if (C5207g.m11106a(interfaceC6824e.mo11874a().m15235f(), "removeAt") && C5207g.m11106a(C7499b.m14959q(interfaceC6824e), SpecialGenericSignatures.f38622h.f38628b)) {
            interfaceC6824e2 = interfaceC6824e2.mo18004P0();
        }
        C5207g.m11110e(interfaceC6824e2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m13692F(interfaceC6824e2, interfaceC6824e);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC6824e m13694H(InterfaceC8829b0 interfaceC8829b0, String str, InterfaceC2052l interfaceC2052l) {
        InterfaceC6824e interfaceC6824e;
        Iterator it = ((Iterable) interfaceC2052l.mo528n(C7648e.m15232l(str))).iterator();
        do {
            interfaceC6824e = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) it.next();
            if (interfaceC6824e2.mo11889i().size() == 0) {
                C5443h c5443h = InterfaceC5438c.f33982a;
                AbstractC5257t abstractC5257tMo11900y = interfaceC6824e2.mo11900y();
                interfaceC6824e = abstractC5257tMo11900y == null ? false : c5443h.m11667d(abstractC5257tMo11900y, interfaceC8829b0.mo11884c()) ? interfaceC6824e2 : null;
            }
        } while (interfaceC6824e == null);
        return interfaceC6824e;
    }

    /* JADX INFO: renamed from: J */
    public static InterfaceC6824e m13695J(InterfaceC8829b0 interfaceC8829b0, InterfaceC2052l interfaceC2052l) {
        InterfaceC6824e interfaceC6824e;
        AbstractC5257t abstractC5257tMo11900y;
        String strM15235f = interfaceC8829b0.mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        Iterator it = ((Iterable) interfaceC2052l.mo528n(C7648e.m15232l(C10533r.m19508b(strM15235f)))).iterator();
        do {
            interfaceC6824e = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) it.next();
            if (interfaceC6824e2.mo11889i().size() == 1 && (abstractC5257tMo11900y = interfaceC6824e2.mo11900y()) != null) {
                C7648e c7648e = AbstractC6795c.f38322e;
                if (AbstractC6795c.m13532E(abstractC5257tMo11900y, C6797e.a.f38381d)) {
                    C5443h c5443h = InterfaceC5438c.f33982a;
                    List<InterfaceC8853n0> listMo11889i = interfaceC6824e2.mo11889i();
                    C5207g.m11110e(listMo11889i, "descriptor.valueParameters");
                    if (c5443h.mo11657a(((InterfaceC8853n0) C6752c.m13443k0(listMo11889i)).mo11884c(), interfaceC8829b0.mo11884c())) {
                        interfaceC6824e = interfaceC6824e2;
                    }
                }
            }
        } while (interfaceC6824e == null);
        return interfaceC6824e;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m13696M(InterfaceC6824e interfaceC6824e, InterfaceC6822c interfaceC6822c) {
        String strM14957p = C7499b.m14957p(interfaceC6824e, 2);
        InterfaceC6822c interfaceC6822cMo18004P0 = interfaceC6822c.mo18004P0();
        C5207g.m11110e(interfaceC6822cMo18004P0, "builtinWithErasedParameters.original");
        return C5207g.m11106a(strM14957p, C7499b.m14957p(interfaceC6822cMo18004P0, 2)) && !m13692F(interfaceC6824e, interfaceC6822c);
    }

    /* JADX INFO: renamed from: v */
    public static final ArrayList m13697v(LazyJavaClassMemberScope lazyJavaClassMemberScope, C7648e c7648e) {
        Collection<InterfaceC5837q> collectionMo11205d = lazyJavaClassMemberScope.f38774e.mo807E().mo11205d(c7648e);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11205d, 10));
        Iterator<T> it = collectionMo11205d.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.m13722t((InterfaceC5837q) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static final ArrayList m13698w(LazyJavaClassMemberScope lazyJavaClassMemberScope, C7648e c7648e) {
        LinkedHashSet linkedHashSetM13703K = lazyJavaClassMemberScope.m13703K(c7648e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM13703K) {
            InterfaceC6824e interfaceC6824e = (InterfaceC6824e) obj;
            C5207g.m11111f(interfaceC6824e, "<this>");
            boolean z10 = true;
            if (!(SpecialBuiltinMembers.m13659b(interfaceC6824e) != null) && BuiltinMethodsWithSpecialGenericSignature.m13654a(interfaceC6824e) == null) {
                z10 = false;
            }
            if (!z10) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public final void m13699A(Set set, AbstractCollection abstractCollection, C6532d c6532d, InterfaceC2052l interfaceC2052l) {
        InterfaceC6824e interfaceC6824eM13695J;
        C9566f0 c9566f0M16440i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) it.next();
            C1620d c1620d = null;
            if (m13701E(interfaceC8829b0, interfaceC2052l)) {
                InterfaceC6824e interfaceC6824eM13702I = m13702I(interfaceC8829b0, interfaceC2052l);
                C5207g.m11108c(interfaceC6824eM13702I);
                if (interfaceC8829b0.mo11894q0()) {
                    interfaceC6824eM13695J = m13695J(interfaceC8829b0, interfaceC2052l);
                    C5207g.m11108c(interfaceC6824eM13695J);
                } else {
                    interfaceC6824eM13695J = null;
                }
                if (interfaceC6824eM13695J != null) {
                    interfaceC6824eM13695J.mo11891l();
                    interfaceC6824eM13702I.mo11891l();
                }
                C1620d c1620d2 = new C1620d(this.f38727n, interfaceC6824eM13702I, interfaceC6824eM13695J, interfaceC8829b0);
                AbstractC5257t abstractC5257tMo11900y = interfaceC6824eM13702I.mo11900y();
                C5207g.m11108c(abstractC5257tMo11900y);
                EmptyList emptyList = EmptyList.f38032a;
                c1620d2.m18011a1(abstractC5257tMo11900y, emptyList, mo11211p(), null, emptyList);
                C9564e0 c9564e0M16439h = C8412c.m16439h(c1620d2, interfaceC6824eM13702I.mo11289w(), false, interfaceC6824eM13702I.mo11890j());
                c9564e0M16439h.f49151l = interfaceC6824eM13702I;
                c9564e0M16439h.m18016X0(c1620d2.mo11884c());
                if (interfaceC6824eM13695J != null) {
                    List<InterfaceC8853n0> listMo11889i = interfaceC6824eM13695J.mo11889i();
                    C5207g.m11110e(listMo11889i, "setterMethod.valueParameters");
                    InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) C6752c.m13425S(listMo11889i);
                    if (interfaceC8853n0 == null) {
                        throw new AssertionError("No parameter found for " + interfaceC6824eM13695J);
                    }
                    c9566f0M16440i = C8412c.m16440i(c1620d2, interfaceC6824eM13695J.mo11289w(), interfaceC8853n0.mo11289w(), false, interfaceC6824eM13695J.mo11886f(), interfaceC6824eM13695J.mo11890j());
                    c9566f0M16440i.f49151l = interfaceC6824eM13695J;
                } else {
                    c9566f0M16440i = null;
                }
                c1620d2.m18010Y0(c9564e0M16439h, c9566f0M16440i, null, null);
                c1620d = c1620d2;
            }
            if (c1620d != null) {
                abstractCollection.add(c1620d);
                if (c6532d != null) {
                    c6532d.add(interfaceC8829b0);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Collection<AbstractC5257t> m13700B() {
        boolean z10 = this.f38729p;
        InterfaceC8830c interfaceC8830c = this.f38727n;
        if (!z10) {
            return ((C2064a) this.f38771b.f42146a).f10515u.mo11666c().mo11662n0(interfaceC8830c);
        }
        Collection<AbstractC5257t> collectionMo11278p = interfaceC8830c.mo13600k().mo11278p();
        C5207g.m11110e(collectionMo11278p, "ownerDescriptor.typeConstructor.supertypes");
        return collectionMo11278p;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m13701E(InterfaceC8829b0 interfaceC8829b0, InterfaceC2052l<? super C7648e, ? extends Collection<? extends InterfaceC6824e>> interfaceC2052l) {
        if (C0062b.m418y1(interfaceC8829b0)) {
            return false;
        }
        InterfaceC6824e interfaceC6824eM13702I = m13702I(interfaceC8829b0, interfaceC2052l);
        InterfaceC6824e interfaceC6824eM13695J = m13695J(interfaceC8829b0, interfaceC2052l);
        if (interfaceC6824eM13702I == null) {
            return false;
        }
        if (interfaceC8829b0.mo11894q0()) {
            return interfaceC6824eM13695J != null && interfaceC6824eM13695J.mo11891l() == interfaceC6824eM13702I.mo11891l();
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC6824e m13702I(InterfaceC8829b0 interfaceC8829b0, InterfaceC2052l<? super C7648e, ? extends Collection<? extends InterfaceC6824e>> interfaceC2052l) {
        C9564e0 c9564e0Mo11888h = interfaceC8829b0.mo11888h();
        String strM13674a = null;
        InterfaceC8831c0 interfaceC8831c0 = c9564e0Mo11888h != null ? (InterfaceC8831c0) SpecialBuiltinMembers.m13659b(c9564e0Mo11888h) : null;
        if (interfaceC8831c0 != null) {
            strM13674a = C6841b.m13674a(interfaceC8831c0);
        }
        if (strM13674a != null && !SpecialBuiltinMembers.m13661d(this.f38727n, interfaceC8831c0)) {
            return m13694H(interfaceC8829b0, strM13674a, interfaceC2052l);
        }
        String strM15235f = interfaceC8829b0.mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        return m13694H(interfaceC8829b0, C10533r.m19507a(strM15235f), interfaceC2052l);
    }

    /* JADX INFO: renamed from: K */
    public final LinkedHashSet m13703K(C7648e c7648e) {
        Collection<AbstractC5257t> collectionM13700B = m13700B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionM13700B.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((AbstractC5257t) it.next()).mo11245q().mo11904b(c7648e, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: L */
    public final Set<InterfaceC8829b0> m13704L(C7648e c7648e) {
        Collection<AbstractC5257t> collectionM13700B = m13700B();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionM13700B.iterator();
        while (it.hasNext()) {
            Collection collectionMo11905c = ((AbstractC5257t) it.next()).mo11245q().mo11905c(c7648e, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(collectionMo11905c, 10));
            Iterator it2 = collectionMo11905c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC8829b0) it2.next());
            }
            C9327o.m17684D(arrayList2, arrayList);
        }
        return C6752c.m13457y0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0208  */
    /* JADX WARN: Code duplicated, block: B:105:0x020f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x0231  */
    /* JADX WARN: Code duplicated, block: B:113:0x023f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249  */
    /* JADX WARN: Code duplicated, block: B:120:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x0151 A[EDGE_INSN: B:125:0x0151->B:67:0x0151 BREAK  A[LOOP:0: B:58:0x012c->B:128:?, LOOP_LABEL: LOOP:0: B:58:0x012c->B:128:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:0: B:58:0x012c->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[LOOP:2: B:74:0x017e->B:131:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[LOOP:3: B:109:0x022a->B:136:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01dd A[EDGE_INSN: B:137:0x01dd->B:91:0x01dd BREAK  A[LOOP:4: B:85:0x01c5->B:138:?, LOOP_LABEL: LOOP:4: B:85:0x01c5->B:138:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:4: B:85:0x01c5->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[LOOP:6: B:95:0x01ec->B:141:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[LOOP:1: B:59:0x012d->B:66:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9 A[LOOP:5: B:86:0x01c6->B:90:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f4  */
    /* JADX INFO: renamed from: N */
    public final boolean m13705N(final InterfaceC6824e interfaceC6824e) {
        Collection collectionM13378j0;
        boolean z10;
        boolean z11;
        boolean z12;
        C7648e c7648e;
        boolean z13;
        C7648e c7648eMo11874a;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        boolean z14;
        InterfaceC6822c interfaceC6822cM13654a;
        InterfaceC6824e interfaceC6824eM13691D;
        boolean z15;
        LinkedHashSet linkedHashSetM13703K;
        Iterator it3;
        InterfaceC6824e interfaceC6824e2;
        boolean z16;
        ArrayList arrayList2;
        Iterator it4;
        InterfaceC6824e interfaceC6824e3;
        Iterator it5;
        Object next;
        InterfaceC6824e interfaceC6824e4;
        boolean z17;
        C7648e c7648eMo11874a2 = interfaceC6824e.mo11874a();
        C5207g.m11110e(c7648eMo11874a2, "function.name");
        String strM15235f = c7648eMo11874a2.m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        C7646c c7646c = C10533r.f52532a;
        boolean z18 = false;
        if (C7661i.m15256V2(strM15235f, "get", false) || C7661i.m15256V2(strM15235f, "is", false)) {
            C7648e c7648eM14954n0 = C7499b.m14954n0(c7648eMo11874a2, "get", null, 12);
            if (c7648eM14954n0 == null) {
                c7648eM14954n0 = C7499b.m14954n0(c7648eMo11874a2, "is", null, 8);
            }
            collectionM13378j0 = C9000b.m17253s(c7648eM14954n0);
        } else if (C7661i.m15256V2(strM15235f, "set", false)) {
            collectionM13378j0 = C6744b.m13378j0(new C7648e[]{C7499b.m14954n0(c7648eMo11874a2, "set", null, 4), C7499b.m14954n0(c7648eMo11874a2, "set", "is", 4)});
        } else {
            collectionM13378j0 = (List) C10519d.f52507b.get(c7648eMo11874a2);
            if (collectionM13378j0 == null) {
                collectionM13378j0 = EmptyList.f38032a;
            }
        }
        if (!(collectionM13378j0 instanceof Collection) || !collectionM13378j0.isEmpty()) {
            Iterator it6 = collectionM13378j0.iterator();
            while (true) {
                if (it6.hasNext()) {
                    Set<InterfaceC8829b0> setM13704L = m13704L((C7648e) it6.next());
                    if (!(setM13704L instanceof Collection) || !setM13704L.isEmpty()) {
                        Iterator<T> it7 = setM13704L.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                z11 = false;
                                break;
                            }
                            InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) it7.next();
                            if (m13701E(interfaceC8829b0, new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e2) {
                                    C7648e c7648e3 = c7648e2;
                                    C5207g.m11111f(c7648e3, "accessorName");
                                    InterfaceC6824e interfaceC6824e5 = interfaceC6824e;
                                    if (C5207g.m11106a(interfaceC6824e5.mo11874a(), c7648e3)) {
                                        return C9000b.m17251q(interfaceC6824e5);
                                    }
                                    LazyJavaClassMemberScope lazyJavaClassMemberScope = this;
                                    return C6752c.m13438f0(LazyJavaClassMemberScope.m13698w(lazyJavaClassMemberScope, c7648e3), LazyJavaClassMemberScope.m13697v(lazyJavaClassMemberScope, c7648e3));
                                }
                            })) {
                                if (!interfaceC8829b0.mo11894q0()) {
                                    String strM15235f2 = interfaceC6824e.mo11874a().m15235f();
                                    C5207g.m11110e(strM15235f2, "function.name.asString()");
                                    if (C7661i.m15256V2(strM15235f2, "set", false)) {
                                        z10 = false;
                                    }
                                }
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                        break;
                    }
                    if (z11) {
                        z12 = true;
                        break;
                    }
                }
            }
            if (z12) {
                return false;
            }
            SpecialGenericSignatures.C6839a c6839a = SpecialGenericSignatures.f38615a;
            C7648e c7648eMo11874a3 = interfaceC6824e.mo11874a();
            C5207g.m11110e(c7648eMo11874a3, "name");
            c7648e = (C7648e) SpecialGenericSignatures.f38626l.get(c7648eMo11874a3);
            if (c7648e == null) {
                LinkedHashSet linkedHashSetM13703K2 = m13703K(c7648e);
                arrayList2 = new ArrayList();
                it4 = linkedHashSetM13703K2.iterator();
                loop0: while (true) {
                    while (true) {
                        if (it4.hasNext()) {
                            break loop0;
                        }
                        next = it4.next();
                        interfaceC6824e4 = (InterfaceC6824e) next;
                        C5207g.m11111f(interfaceC6824e4, "<this>");
                        if (SpecialBuiltinMembers.m13659b(interfaceC6824e4) != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            arrayList2.add(next);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M0 = interfaceC6824e.mo11848M0();
                    aVarMo11848M0.mo11860j(c7648e);
                    aVarMo11848M0.mo11869s();
                    aVarMo11848M0.mo11858h();
                    InterfaceC6822c interfaceC6822cMo11851a = aVarMo11848M0.mo11851a();
                    C5207g.m11108c(interfaceC6822cMo11851a);
                    interfaceC6824e3 = (InterfaceC6824e) interfaceC6822cMo11851a;
                    if (arrayList2.isEmpty()) {
                        it5 = arrayList2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                z13 = false;
                                break;
                            }
                            if (m13693G((InterfaceC6824e) it5.next(), interfaceC6824e3)) {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        z13 = false;
                        break;
                    }
                } else {
                    z13 = false;
                    break;
                }
            } else {
                z13 = false;
                break;
            }
            if (!z13) {
                int i10 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
                c7648eMo11874a = interfaceC6824e.mo11874a();
                C5207g.m11110e(c7648eMo11874a, "name");
                if (!BuiltinMethodsWithSpecialGenericSignature.m13655b(c7648eMo11874a)) {
                    C7648e c7648eMo11874a4 = interfaceC6824e.mo11874a();
                    C5207g.m11110e(c7648eMo11874a4, "name");
                    LinkedHashSet linkedHashSetM13703K3 = m13703K(c7648eMo11874a4);
                    arrayList = new ArrayList();
                    it = linkedHashSetM13703K3.iterator();
                    loop4: while (true) {
                        while (true) {
                            if (it.hasNext()) {
                                break loop4;
                            }
                            interfaceC6822cM13654a = BuiltinMethodsWithSpecialGenericSignature.m13654a((InterfaceC6824e) it.next());
                            if (interfaceC6822cM13654a != null) {
                                arrayList.add(interfaceC6822cM13654a);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (m13696M(interfaceC6824e, (InterfaceC6822c) it2.next())) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                        if (!z14) {
                            interfaceC6824eM13691D = m13691D(interfaceC6824e);
                            if (interfaceC6824eM13691D == null) {
                                C7648e c7648eMo11874a5 = interfaceC6824e.mo11874a();
                                C5207g.m11110e(c7648eMo11874a5, "name");
                                linkedHashSetM13703K = m13703K(c7648eMo11874a5);
                                if (linkedHashSetM13703K.isEmpty()) {
                                    it3 = linkedHashSetM13703K.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        interfaceC6824e2 = (InterfaceC6824e) it3.next();
                                        if (interfaceC6824e2.mo5294F0() || !m13692F(interfaceC6824eM13691D, interfaceC6824e2)) {
                                            z16 = false;
                                        } else {
                                            z16 = true;
                                        }
                                        if (z16) {
                                            z15 = true;
                                            break;
                                        }
                                    }
                                } else {
                                    z15 = false;
                                    break;
                                }
                            } else {
                                z15 = false;
                                break;
                            }
                            if (!z15) {
                                z18 = true;
                            }
                        }
                    }
                }
                z14 = false;
                if (!z14) {
                    interfaceC6824eM13691D = m13691D(interfaceC6824e);
                    if (interfaceC6824eM13691D == null) {
                        C7648e c7648eMo11874a6 = interfaceC6824e.mo11874a();
                        C5207g.m11110e(c7648eMo11874a6, "name");
                        linkedHashSetM13703K = m13703K(c7648eMo11874a6);
                        if (linkedHashSetM13703K.isEmpty()) {
                            it3 = linkedHashSetM13703K.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    z15 = false;
                                    break;
                                }
                                interfaceC6824e2 = (InterfaceC6824e) it3.next();
                                if (interfaceC6824e2.mo5294F0()) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    z15 = true;
                                    break;
                                }
                            }
                        } else {
                            z15 = false;
                            break;
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                    if (!z15) {
                        z18 = true;
                    }
                }
            }
            return z18;
        }
        z12 = false;
        if (z12) {
            return false;
        }
        SpecialGenericSignatures.C6839a c6839a2 = SpecialGenericSignatures.f38615a;
        C7648e c7648eMo11874a7 = interfaceC6824e.mo11874a();
        C5207g.m11110e(c7648eMo11874a7, "name");
        c7648e = (C7648e) SpecialGenericSignatures.f38626l.get(c7648eMo11874a7);
        if (c7648e == null) {
            LinkedHashSet linkedHashSetM13703K4 = m13703K(c7648e);
            arrayList2 = new ArrayList();
            it4 = linkedHashSetM13703K4.iterator();
            loop0: while (true) {
                while (true) {
                    if (it4.hasNext()) {
                        break loop0;
                        break loop0;
                    }
                    next = it4.next();
                    interfaceC6824e4 = (InterfaceC6824e) next;
                    C5207g.m11111f(interfaceC6824e4, "<this>");
                    if (SpecialBuiltinMembers.m13659b(interfaceC6824e4) != null) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        arrayList2.add(next);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M1 = interfaceC6824e.mo11848M0();
                aVarMo11848M1.mo11860j(c7648e);
                aVarMo11848M1.mo11869s();
                aVarMo11848M1.mo11858h();
                InterfaceC6822c interfaceC6822cMo11851a2 = aVarMo11848M1.mo11851a();
                C5207g.m11108c(interfaceC6822cMo11851a2);
                interfaceC6824e3 = (InterfaceC6824e) interfaceC6822cMo11851a2;
                if (arrayList2.isEmpty()) {
                    it5 = arrayList2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            z13 = false;
                            break;
                        }
                        if (m13693G((InterfaceC6824e) it5.next(), interfaceC6824e3)) {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    z13 = false;
                    break;
                }
            } else {
                z13 = false;
                break;
            }
        } else {
            z13 = false;
            break;
        }
        if (!z13) {
            int i11 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
            c7648eMo11874a = interfaceC6824e.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "name");
            if (!BuiltinMethodsWithSpecialGenericSignature.m13655b(c7648eMo11874a)) {
                C7648e c7648eMo11874a8 = interfaceC6824e.mo11874a();
                C5207g.m11110e(c7648eMo11874a8, "name");
                LinkedHashSet linkedHashSetM13703K5 = m13703K(c7648eMo11874a8);
                arrayList = new ArrayList();
                it = linkedHashSetM13703K5.iterator();
                loop4: while (true) {
                    while (true) {
                        if (it.hasNext()) {
                            break loop4;
                            break loop4;
                        }
                        interfaceC6822cM13654a = BuiltinMethodsWithSpecialGenericSignature.m13654a((InterfaceC6824e) it.next());
                        if (interfaceC6822cM13654a != null) {
                            arrayList.add(interfaceC6822cM13654a);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (m13696M(interfaceC6824e, (InterfaceC6822c) it2.next())) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    if (!z14) {
                        interfaceC6824eM13691D = m13691D(interfaceC6824e);
                        if (interfaceC6824eM13691D == null) {
                            C7648e c7648eMo11874a9 = interfaceC6824e.mo11874a();
                            C5207g.m11110e(c7648eMo11874a9, "name");
                            linkedHashSetM13703K = m13703K(c7648eMo11874a9);
                            if (linkedHashSetM13703K.isEmpty()) {
                                it3 = linkedHashSetM13703K.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z15 = false;
                                        break;
                                    }
                                    interfaceC6824e2 = (InterfaceC6824e) it3.next();
                                    if (interfaceC6824e2.mo5294F0()) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        z15 = true;
                                        break;
                                    }
                                }
                            } else {
                                z15 = false;
                                break;
                            }
                        } else {
                            z15 = false;
                            break;
                        }
                        if (!z15) {
                            z18 = true;
                        }
                    }
                }
            }
            z14 = false;
            if (!z14) {
                interfaceC6824eM13691D = m13691D(interfaceC6824e);
                if (interfaceC6824eM13691D == null) {
                    C7648e c7648eMo11874a10 = interfaceC6824e.mo11874a();
                    C5207g.m11110e(c7648eMo11874a10, "name");
                    linkedHashSetM13703K = m13703K(c7648eMo11874a10);
                    if (linkedHashSetM13703K.isEmpty()) {
                        it3 = linkedHashSetM13703K.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                z15 = false;
                                break;
                            }
                            interfaceC6824e2 = (InterfaceC6824e) it3.next();
                            if (interfaceC6824e2.mo5294F0()) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                z15 = true;
                                break;
                            }
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                } else {
                    z15 = false;
                    break;
                }
                if (!z15) {
                    z18 = true;
                }
            }
        }
        return z18;
    }

    /* JADX INFO: renamed from: O */
    public final void m13706O(C7648e c7648e, InterfaceC10417b interfaceC10417b) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(interfaceC10417b, "location");
        C7499b.m14956o0(((C2064a) this.f38771b.f42146a).f10508n, (NoLookupLocation) interfaceC10417b, this.f38727n, c7648e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13706O(c7648e, noLookupLocation);
        return super.mo11904b(c7648e, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13706O(c7648e, noLookupLocation);
        return super.mo11905c(c7648e, noLookupLocation);
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        InterfaceC2072d<C7648e, AbstractC9575k> interfaceC2072d;
        AbstractC9575k abstractC9575kMo528n;
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13706O(c7648e, noLookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.f38772c;
        return (lazyJavaClassMemberScope == null || (interfaceC2072d = lazyJavaClassMemberScope.f38733t) == null || (abstractC9575kMo528n = interfaceC2072d.mo528n(c7648e)) == null) ? this.f38733t.mo528n(c7648e) : abstractC9575kMo528n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: h */
    public final Set<C7648e> mo13707h(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        return C9338z.m17691N0(this.f38731r.mo807E(), this.f38732s.mo807E().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i */
    public final Set mo13708i(C9981d c9981d, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        InterfaceC8830c interfaceC8830c = this.f38727n;
        Collection<AbstractC5257t> collectionMo11278p = interfaceC8830c.mo13600k().mo11278p();
        C5207g.m11110e(collectionMo11278p, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionMo11278p.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((AbstractC5257t) it.next()).mo11245q().mo11903a(), linkedHashSet);
        }
        InterfaceC2073e<InterfaceC5215a> interfaceC2073e = this.f38774e;
        linkedHashSet.addAll(interfaceC2073e.mo807E().mo11202a());
        linkedHashSet.addAll(interfaceC2073e.mo807E().mo11204c());
        linkedHashSet.addAll(mo13707h(c9981d, interfaceC2052l));
        linkedHashSet.addAll(((C2064a) this.f38771b.f42146a).f10518x.mo18059b(interfaceC8830c));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: j */
    public final void mo13709j(ArrayList arrayList, C7648e c7648e) {
        boolean z10;
        C5207g.m11111f(c7648e, "name");
        boolean zMo12259y = this.f38728o.mo12259y();
        InterfaceC8830c interfaceC8830c = this.f38727n;
        C7669f c7669f = this.f38771b;
        if (zMo12259y) {
            InterfaceC2073e<InterfaceC5215a> interfaceC2073e = this.f38774e;
            if (interfaceC2073e.mo807E().mo11203b(c7648e) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                            break;
                        } else if (((InterfaceC6824e) it.next()).mo11889i().isEmpty()) {
                            z10 = false;
                            break;
                        }
                    }
                } else {
                    z10 = true;
                    break;
                }
                if (z10) {
                    InterfaceC5842v interfaceC5842vMo11203b = interfaceC2073e.mo807E().mo11203b(c7648e);
                    C5207g.m11108c(interfaceC5842vMo11203b);
                    LazyJavaAnnotations lazyJavaAnnotationsM14968u0 = C7499b.m14968u0(c7669f, interfaceC5842vMo11203b);
                    C7648e c7648eMo12280a = interfaceC5842vMo11203b.mo12280a();
                    C2064a c2064a = (C2064a) c7669f.f42146a;
                    JavaMethodDescriptor javaMethodDescriptorM13678j1 = JavaMethodDescriptor.m13678j1(interfaceC8830c, lazyJavaAnnotationsM14968u0, c7648eMo12280a, c2064a.f10504j.mo11843a(interfaceC5842vMo11203b), true);
                    AbstractC5257t abstractC5257tM13735e = ((C6859a) c7669f.f42150e).m13735e(interfaceC5842vMo11203b.mo12286c(), C5435b.m11586b(TypeUsage.COMMON, false, null, 2));
                    InterfaceC8835e0 interfaceC8835e0Mo11211p = mo11211p();
                    EmptyList emptyList = EmptyList.f38032a;
                    Modality.Companion.getClass();
                    javaMethodDescriptorM13678j1.mo13679i1(null, interfaceC8835e0Mo11211p, emptyList, emptyList, emptyList, abstractC5257tM13735e, Modality.C6809a.m13587a(false, false, true), C8850m.f46738e, null);
                    javaMethodDescriptorM13678j1.m13680k1(false, false);
                    ((InterfaceC0130d.a) c2064a.f10501g).getClass();
                    arrayList.add(javaMethodDescriptorM13678j1);
                }
            }
        }
        ((C2064a) c7669f.f42146a).f10518x.mo18060c(interfaceC8830c, c7648e, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: k */
    public final InterfaceC5215a mo13710k() {
        return new ClassDeclaredMemberIndex(this.f38728o, new InterfaceC2052l<InterfaceC5836p, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeMemberIndex$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC5836p interfaceC5836p) {
                InterfaceC5836p interfaceC5836p2 = interfaceC5836p;
                C5207g.m11111f(interfaceC5836p2, "it");
                return Boolean.valueOf(!interfaceC5836p2.mo12277X());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: m */
    public final void mo13711m(LinkedHashSet linkedHashSet, C7648e c7648e) {
        boolean z10;
        C5207g.m11111f(c7648e, "name");
        LinkedHashSet linkedHashSetM13703K = m13703K(c7648e);
        SpecialGenericSignatures.C6839a c6839a = SpecialGenericSignatures.f38615a;
        if (!SpecialGenericSignatures.f38625k.contains(c7648e)) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f38597m;
            if (!BuiltinMethodsWithSpecialGenericSignature.m13655b(c7648e)) {
                if (linkedHashSetM13703K.isEmpty()) {
                    z10 = true;
                    break;
                }
                Iterator it = linkedHashSetM13703K.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC6822c) it.next()).mo5294F0()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : linkedHashSetM13703K) {
                        if (m13705N((InterfaceC6824e) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    m13716y(linkedHashSet, c7648e, arrayList, false);
                    return;
                }
            }
        }
        C6532d c6532d = new C6532d();
        LinkedHashSet linkedHashSetM302Q1 = C0062b.m302Q1(c7648e, linkedHashSetM13703K, EmptyList.f38032a, this.f38727n, InterfaceC10548l.f52601b, ((C2064a) this.f38771b.f42146a).f10515u.mo11665b());
        m13717z(c7648e, linkedHashSet, linkedHashSetM302Q1, linkedHashSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        m13717z(c7648e, linkedHashSet, linkedHashSetM302Q1, c6532d, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetM13703K) {
            if (m13705N((InterfaceC6824e) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m13716y(linkedHashSet, c7648e, C6752c.m13438f0(c6532d, arrayList2), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: n */
    public final void mo11210n(ArrayList arrayList, C7648e c7648e) {
        Set setM13457y0;
        InterfaceC5837q interfaceC5837q;
        C5207g.m11111f(c7648e, "name");
        boolean zMo12256t = this.f38728o.mo12256t();
        C7669f c7669f = this.f38771b;
        if (zMo12256t && (interfaceC5837q = (InterfaceC5837q) C6752c.m13444l0(this.f38774e.mo807E().mo11205d(c7648e))) != null) {
            C1621e c1621eM5285b1 = C1621e.m5285b1(this.f38727n, C7499b.m14968u0(c7669f, interfaceC5837q), Modality.FINAL, C7499b.m14895B0(interfaceC5837q.mo12278f()), false, interfaceC5837q.mo12280a(), ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5837q), false);
            C9564e0 c9564e0M16434c = C8412c.m16434c(c1621eM5285b1, InterfaceC9077e.a.f47365a);
            c1621eM5285b1.m18010Y0(c9564e0M16434c, null, null, null);
            C5207g.m11111f(c7669f, "<this>");
            AbstractC5257t abstractC5257tM13720l = LazyJavaScope.m13720l(interfaceC5837q, new C7669f((C2064a) c7669f.f42146a, new LazyJavaTypeParameterResolver(c7669f, c1621eM5285b1, interfaceC5837q, 0), (InterfaceC9070c) c7669f.f42148c));
            EmptyList emptyList = EmptyList.f38032a;
            c1621eM5285b1.m18011a1(abstractC5257tM13720l, emptyList, mo11211p(), null, emptyList);
            c9564e0M16434c.m18016X0(abstractC5257tM13720l);
            arrayList.add(c1621eM5285b1);
        }
        Set<InterfaceC8829b0> setM13704L = m13704L(c7648e);
        if (setM13704L.isEmpty()) {
            return;
        }
        C6532d c6532d = new C6532d();
        C6532d c6532d2 = new C6532d();
        m13699A(setM13704L, arrayList, c6532d, new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e2) {
                C7648e c7648e3 = c7648e2;
                C5207g.m11111f(c7648e3, "it");
                return LazyJavaClassMemberScope.m13697v(this.f38735b, c7648e3);
            }
        });
        if (c6532d.isEmpty()) {
            setM13457y0 = C6752c.m13457y0(setM13704L);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : setM13704L) {
                if (!c6532d.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setM13457y0 = linkedHashSet;
        }
        m13699A(setM13457y0, c6532d2, null, new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e2) {
                C7648e c7648e3 = c7648e2;
                C5207g.m11111f(c7648e3, "it");
                return LazyJavaClassMemberScope.m13698w(this.f38736b, c7648e3);
            }
        });
        LinkedHashSet linkedHashSetM17691N0 = C9338z.m17691N0(setM13704L, c6532d2);
        InterfaceC8830c interfaceC8830c = this.f38727n;
        C2064a c2064a = (C2064a) c7669f.f42146a;
        arrayList.addAll(C0062b.m302Q1(c7648e, linkedHashSetM17691N0, arrayList, interfaceC8830c, c2064a.f10500f, c2064a.f10515u.mo11665b()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: o */
    public final Set mo13712o(C9981d c9981d) {
        C5207g.m11111f(c9981d, "kindFilter");
        if (this.f38728o.mo12256t()) {
            return mo11903a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f38774e.mo807E().mo11206e());
        Collection<AbstractC5257t> collectionMo11278p = this.f38727n.mo13600k().mo11278p();
        C5207g.m11110e(collectionMo11278p, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = collectionMo11278p.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((AbstractC5257t) it.next()).mo11245q().mo11906d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: p */
    public final InterfaceC8835e0 mo11211p() {
        InterfaceC8830c interfaceC8830c = this.f38727n;
        if (interfaceC8830c != null) {
            int i10 = C8413d.f45539a;
            return interfaceC8830c.mo17092U0();
        }
        C8413d.m16442a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: q */
    public final InterfaceC8838g mo13713q() {
        return this.f38727n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: r */
    public final boolean mo13714r(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.f38728o.mo12256t()) {
            return false;
        }
        return m13705N(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: s */
    public final LazyJavaScope.C6851a mo11212s(InterfaceC5837q interfaceC5837q, ArrayList arrayList, AbstractC5257t abstractC5257t, List list) {
        C5207g.m11111f(interfaceC5837q, "method");
        C5207g.m11111f(list, "valueParameters");
        ((InterfaceC0131e.a) ((C2064a) this.f38771b.f42146a).f10499e).getClass();
        if (this.f38727n == null) {
            InterfaceC0131e.a.m532a(1);
            throw null;
        }
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return new LazyJavaScope.C6851a(list, arrayList, listEmptyList, abstractC5257t);
        }
        InterfaceC0131e.b.m533a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final String toString() {
        return "Lazy Java member scope for " + this.f38728o.mo12252e();
    }

    /* JADX INFO: renamed from: x */
    public final void m13715x(ArrayList arrayList, C1618b c1618b, int i10, InterfaceC5837q interfaceC5837q, AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2) {
        arrayList.add(new C6830d(c1618b, null, i10, InterfaceC9077e.a.f47365a, interfaceC5837q.mo12280a(), C5258t0.m11298i(abstractC5257t), interfaceC5837q.mo12273T(), false, false, abstractC5257t2 != null ? C5258t0.m11298i(abstractC5257t2) : null, ((C2064a) this.f38771b.f42146a).f10504j.mo11843a(interfaceC5837q)));
    }

    /* JADX INFO: renamed from: y */
    public final void m13716y(LinkedHashSet linkedHashSet, C7648e c7648e, ArrayList arrayList, boolean z10) {
        InterfaceC8830c interfaceC8830c = this.f38727n;
        C2064a c2064a = (C2064a) this.f38771b.f42146a;
        LinkedHashSet<InterfaceC6824e> linkedHashSetM302Q1 = C0062b.m302Q1(c7648e, arrayList, linkedHashSet, interfaceC8830c, c2064a.f10500f, c2064a.f10515u.mo11665b());
        if (!z10) {
            linkedHashSet.addAll(linkedHashSetM302Q1);
            return;
        }
        ArrayList arrayListM13438f0 = C6752c.m13438f0(linkedHashSetM302Q1, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(linkedHashSetM302Q1, 10));
        for (InterfaceC6824e interfaceC6824eM13690C : linkedHashSetM302Q1) {
            InterfaceC6824e interfaceC6824e = (InterfaceC6824e) SpecialBuiltinMembers.m13660c(interfaceC6824eM13690C);
            if (interfaceC6824e != null) {
                interfaceC6824eM13690C = m13690C(interfaceC6824eM13690C, interfaceC6824e, arrayListM13438f0);
            }
            arrayList2.add(interfaceC6824eM13690C);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:2: B:45:0x0143->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m13717z(C7648e c7648e, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, InterfaceC2052l interfaceC2052l) {
        InterfaceC6824e interfaceC6824eM13690C;
        Object next;
        InterfaceC6824e interfaceC6824e;
        InterfaceC6824e interfaceC6824eM13690C2;
        Iterator it;
        InterfaceC6824e interfaceC6824eM13691D;
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) it2.next();
            InterfaceC6824e interfaceC6824e3 = (InterfaceC6824e) SpecialBuiltinMembers.m13659b(interfaceC6824e2);
            InterfaceC6824e interfaceC6824e4 = null;
            if (interfaceC6824e3 != null) {
                String strM13658a = SpecialBuiltinMembers.m13658a(interfaceC6824e3);
                C5207g.m11108c(strM13658a);
                Iterator it3 = ((Collection) interfaceC2052l.mo528n(C7648e.m15232l(strM13658a))).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        interfaceC6824eM13690C = null;
                        break;
                    }
                    InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M0 = ((InterfaceC6824e) it3.next()).mo11848M0();
                    aVarMo11848M0.mo11860j(c7648e);
                    aVarMo11848M0.mo11869s();
                    aVarMo11848M0.mo11858h();
                    InterfaceC6822c interfaceC6822cMo11851a = aVarMo11848M0.mo11851a();
                    C5207g.m11108c(interfaceC6822cMo11851a);
                    InterfaceC6824e interfaceC6824e5 = (InterfaceC6824e) interfaceC6822cMo11851a;
                    if (m13693G(interfaceC6824e3, interfaceC6824e5)) {
                        interfaceC6824eM13690C = m13690C(interfaceC6824e5, interfaceC6824e3, linkedHashSet);
                        break;
                    }
                }
            } else {
                interfaceC6824eM13690C = null;
                break;
            }
            C0062b.m282K(interfaceC6824eM13690C, abstractSet);
            InterfaceC6822c interfaceC6822cM13654a = BuiltinMethodsWithSpecialGenericSignature.m13654a(interfaceC6824e2);
            if (interfaceC6822cM13654a != null) {
                C7648e c7648eMo11874a = interfaceC6822cM13654a.mo11874a();
                C5207g.m11110e(c7648eMo11874a, "overridden.name");
                Iterator it4 = ((Iterable) interfaceC2052l.mo528n(c7648eMo11874a)).iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!m13696M((InterfaceC6824e) next, interfaceC6822cM13654a));
                InterfaceC6824e interfaceC6824e6 = (InterfaceC6824e) next;
                if (interfaceC6824e6 != null) {
                    InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M1 = interfaceC6824e6.mo11848M0();
                    List<InterfaceC8853n0> listMo11889i = interfaceC6822cM13654a.mo11889i();
                    C5207g.m11110e(listMo11889i, "overridden.valueParameters");
                    ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11889i, 10));
                    Iterator<T> it5 = listMo11889i.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((InterfaceC8853n0) it5.next()).mo11884c());
                    }
                    List<InterfaceC8853n0> listMo11889i2 = interfaceC6824e6.mo11889i();
                    C5207g.m11110e(listMo11889i2, "override.valueParameters");
                    aVarMo11848M1.mo11853c(C5206f.m10982C0(arrayList, listMo11889i2, interfaceC6822cM13654a));
                    aVarMo11848M1.mo11869s();
                    aVarMo11848M1.mo11858h();
                    aVarMo11848M1.mo11854d(Boolean.TRUE);
                    interfaceC6824e = (InterfaceC6824e) aVarMo11848M1.mo11851a();
                } else {
                    interfaceC6824e = null;
                }
                if (interfaceC6824e != null) {
                    if (!m13705N(interfaceC6824e)) {
                        interfaceC6824e = null;
                    }
                    if (interfaceC6824e != null) {
                        interfaceC6824eM13690C2 = m13690C(interfaceC6824e, interfaceC6822cM13654a, linkedHashSet);
                    }
                }
                C0062b.m282K(interfaceC6824eM13690C2, abstractSet);
                if (!interfaceC6824e2.mo5294F0()) {
                    C7648e c7648eMo11874a2 = interfaceC6824e2.mo11874a();
                    C5207g.m11110e(c7648eMo11874a2, "descriptor.name");
                    it = ((Iterable) interfaceC2052l.mo528n(c7648eMo11874a2)).iterator();
                    while (it.hasNext()) {
                        interfaceC6824eM13691D = m13691D((InterfaceC6824e) it.next());
                        if (interfaceC6824eM13691D != null || !m13692F(interfaceC6824eM13691D, interfaceC6824e2)) {
                            interfaceC6824eM13691D = null;
                        }
                        if (interfaceC6824eM13691D != null) {
                            interfaceC6824e4 = interfaceC6824eM13691D;
                            break;
                        }
                    }
                }
                C0062b.m282K(interfaceC6824e4, abstractSet);
            }
            interfaceC6824eM13690C2 = null;
            C0062b.m282K(interfaceC6824eM13690C2, abstractSet);
            if (!interfaceC6824e2.mo5294F0()) {
                C7648e c7648eMo11874a3 = interfaceC6824e2.mo11874a();
                C5207g.m11110e(c7648eMo11874a3, "descriptor.name");
                it = ((Iterable) interfaceC2052l.mo528n(c7648eMo11874a3)).iterator();
                while (it.hasNext()) {
                    interfaceC6824eM13691D = m13691D((InterfaceC6824e) it.next());
                    if (interfaceC6824eM13691D != null) {
                        interfaceC6824eM13691D = null;
                    } else {
                        interfaceC6824eM13691D = null;
                    }
                    if (interfaceC6824eM13691D != null) {
                        interfaceC6824e4 = interfaceC6824eM13691D;
                        break;
                        break;
                    }
                }
            }
            C0062b.m282K(interfaceC6824e4, abstractSet);
        }
    }
}
