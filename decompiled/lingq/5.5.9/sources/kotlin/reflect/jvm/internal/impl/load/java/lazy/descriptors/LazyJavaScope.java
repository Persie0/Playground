package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import androidx.activity.result.C0204c;
import bn.C1621e;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2071c;
import co.InterfaceC2072d;
import co.InterfaceC2073e;
import co.InterfaceC2074f;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5826f;
import gn.InterfaceC5834n;
import gn.InterfaceC5837q;
import gn.InterfaceC5843w;
import gn.InterfaceC5844x;
import gn.InterfaceC5846z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7648e;
import om.C8091h;
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
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p373rn.AbstractC8875g;
import p420um.C9562d0;
import p420um.C9568g0;
import p466wn.AbstractC9980c;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.C5258t0;
import pn.C8412c;
import pn.C8413d;
import sl.InterfaceC9070c;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaScope extends AbstractC9984g {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38770m = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b */
    public final C7669f f38771b;

    /* JADX INFO: renamed from: c */
    public final LazyJavaScope f38772c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e<Collection<InterfaceC8838g>> f38773d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2073e<InterfaceC5215a> f38774e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2071c<C7648e, Collection<InterfaceC6824e>> f38775f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2072d<C7648e, InterfaceC8829b0> f38776g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2071c<C7648e, Collection<InterfaceC6824e>> f38777h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2073e f38778i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2073e f38779j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2073e f38780k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2071c<C7648e, List<InterfaceC8829b0>> f38781l;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$a */
    public static final class C6851a {

        /* JADX INFO: renamed from: a */
        public final AbstractC5257t f38782a;

        /* JADX INFO: renamed from: b */
        public final AbstractC5257t f38783b;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC8853n0> f38784c;

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC8847k0> f38785d;

        /* JADX INFO: renamed from: e */
        public final boolean f38786e;

        /* JADX INFO: renamed from: f */
        public final List<String> f38787f;

        public C6851a(List list, ArrayList arrayList, List list2, AbstractC5257t abstractC5257t) {
            C5207g.m11111f(list, "valueParameters");
            C5207g.m11111f(list2, "errors");
            this.f38782a = abstractC5257t;
            this.f38783b = null;
            this.f38784c = list;
            this.f38785d = arrayList;
            this.f38786e = false;
            this.f38787f = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6851a)) {
                return false;
            }
            C6851a c6851a = (C6851a) obj;
            return C5207g.m11106a(this.f38782a, c6851a.f38782a) && C5207g.m11106a(this.f38783b, c6851a.f38783b) && C5207g.m11106a(this.f38784c, c6851a.f38784c) && C5207g.m11106a(this.f38785d, c6851a.f38785d) && this.f38786e == c6851a.f38786e && C5207g.m11106a(this.f38787f, c6851a.f38787f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        public final int hashCode() {
            int iHashCode = this.f38782a.hashCode() * 31;
            AbstractC5257t abstractC5257t = this.f38783b;
            int iM848g = C0204c.m848g(this.f38785d, C0204c.m848g(this.f38784c, (iHashCode + (abstractC5257t == null ? 0 : abstractC5257t.hashCode())) * 31, 31), 31);
            boolean z10 = this.f38786e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f38787f.hashCode() + ((iM848g + r10) * 31);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.f38782a + ", receiverType=" + this.f38783b + ", valueParameters=" + this.f38784c + ", typeParameters=" + this.f38785d + ", hasStableParameterNames=" + this.f38786e + ", errors=" + this.f38787f + ')';
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b */
    public static final class C6852b {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC8853n0> f38789a;

        /* JADX INFO: renamed from: b */
        public final boolean f38790b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6852b(List<? extends InterfaceC8853n0> list, boolean z10) {
            C5207g.m11111f(list, "descriptors");
            this.f38789a = list;
            this.f38790b = z10;
        }
    }

    public LazyJavaScope(C7669f c7669f, LazyJavaScope lazyJavaScope) {
        C5207g.m11111f(c7669f, "c");
        this.f38771b = c7669f;
        this.f38772c = lazyJavaScope;
        this.f38773d = c7669f.m15268b().mo6223h(EmptyList.f38032a, new InterfaceC2041a<Collection<? extends InterfaceC8838g>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends InterfaceC8838g> mo807E() {
                C9981d c9981d = C9981d.f50721m;
                MemberScope.f39666a.getClass();
                InterfaceC2052l<C7648e, Boolean> interfaceC2052l = MemberScope.Companion.f39668b;
                LazyJavaScope lazyJavaScope2 = this.f38788b;
                lazyJavaScope2.getClass();
                C5207g.m11111f(c9981d, "kindFilter");
                C5207g.m11111f(interfaceC2052l, "nameFilter");
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c9981d.m18557a(C9981d.f50720l)) {
                    for (C7648e c7648e : lazyJavaScope2.mo13707h(c9981d, interfaceC2052l)) {
                        if (interfaceC2052l.mo528n(c7648e).booleanValue()) {
                            C0062b.m282K(lazyJavaScope2.mo5304g(c7648e, noLookupLocation), linkedHashSet);
                        }
                    }
                }
                boolean zM18557a = c9981d.m18557a(C9981d.f50717i);
                List<AbstractC9980c> list = c9981d.f50728a;
                if (zM18557a && !list.contains(AbstractC9980c.a.f50708a)) {
                    for (C7648e c7648e2 : lazyJavaScope2.mo13708i(c9981d, interfaceC2052l)) {
                        if (interfaceC2052l.mo528n(c7648e2).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope2.mo11904b(c7648e2, noLookupLocation));
                        }
                    }
                }
                if (c9981d.m18557a(C9981d.f50718j) && !list.contains(AbstractC9980c.a.f50708a)) {
                    for (C7648e c7648e3 : lazyJavaScope2.mo13712o(c9981d)) {
                        if (interfaceC2052l.mo528n(c7648e3).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope2.mo11905c(c7648e3, noLookupLocation));
                        }
                    }
                }
                return C6752c.m13453u0(linkedHashSet);
            }
        });
        this.f38774e = c7669f.m15268b().mo6217b(new InterfaceC2041a<InterfaceC5215a>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC5215a mo807E() {
                return this.f38794b.mo13710k();
            }
        });
        this.f38775f = c7669f.m15268b().mo6221f(new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredFunctions$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                C5207g.m11111f(c7648e2, "name");
                LazyJavaScope lazyJavaScope2 = this.f38793b;
                LazyJavaScope lazyJavaScope3 = lazyJavaScope2.f38772c;
                if (lazyJavaScope3 != null) {
                    return (Collection) ((LockBasedStorageManager.C7045k) lazyJavaScope3.f38775f).mo528n(c7648e2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC5837q> it = lazyJavaScope2.f38774e.mo807E().mo11205d(c7648e2).iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            lazyJavaScope2.mo13709j(arrayList, c7648e2);
                            return arrayList;
                        }
                        JavaMethodDescriptor javaMethodDescriptorM13722t = lazyJavaScope2.m13722t(it.next());
                        if (lazyJavaScope2.mo13714r(javaMethodDescriptorM13722t)) {
                            ((InterfaceC0130d.a) ((C2064a) lazyJavaScope2.f38771b.f42146a).f10501g).getClass();
                            arrayList.add(javaMethodDescriptorM13722t);
                        }
                    }
                }
            }
        });
        this.f38776g = c7669f.m15268b().mo6222g(new InterfaceC2052l<C7648e, InterfaceC8829b0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:48:0x0105  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8829b0 mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                C5207g.m11111f(c7648e2, "name");
                final LazyJavaScope lazyJavaScope2 = this.f38792b;
                LazyJavaScope lazyJavaScope3 = lazyJavaScope2.f38772c;
                if (lazyJavaScope3 != null) {
                    return lazyJavaScope3.f38776g.mo528n(c7648e2);
                }
                final InterfaceC5834n interfaceC5834nMo11207f = lazyJavaScope2.f38774e.mo807E().mo11207f(c7648e2);
                if (interfaceC5834nMo11207f == null || interfaceC5834nMo11207f.mo12269M()) {
                    return null;
                }
                boolean z10 = true;
                boolean z11 = !interfaceC5834nMo11207f.mo12279q();
                C7669f c7669f2 = lazyJavaScope2.f38771b;
                LazyJavaAnnotations lazyJavaAnnotationsM14968u0 = C7499b.m14968u0(c7669f2, interfaceC5834nMo11207f);
                InterfaceC8838g interfaceC8838gMo13713q = lazyJavaScope2.mo13713q();
                Modality modality = Modality.FINAL;
                AbstractC8852n abstractC8852nM14895B0 = C7499b.m14895B0(interfaceC5834nMo11207f.mo12278f());
                C7648e c7648eMo12280a = interfaceC5834nMo11207f.mo12280a();
                C2064a c2064a = (C2064a) c7669f2.f42146a;
                final C1621e c1621eM5285b1 = C1621e.m5285b1(interfaceC8838gMo13713q, lazyJavaAnnotationsM14968u0, modality, abstractC8852nM14895B0, z11, c7648eMo12280a, c2064a.f10504j.mo11843a(interfaceC5834nMo11207f), interfaceC5834nMo11207f.mo12279q() && interfaceC5834nMo11207f.mo12277X());
                c1621eM5285b1.m18010Y0(null, null, null, null);
                AbstractC5257t abstractC5257tM13735e = ((C6859a) c7669f2.f42150e).m13735e(interfaceC5834nMo11207f.mo12271c(), C5435b.m11586b(TypeUsage.COMMON, false, null, 3));
                if (AbstractC6795c.m13535H(abstractC5257tM13735e) || AbstractC6795c.m13537J(abstractC5257tM13735e)) {
                    if (interfaceC5834nMo11207f.mo12279q() && interfaceC5834nMo11207f.mo12277X()) {
                        interfaceC5834nMo11207f.mo12270V();
                    }
                }
                EmptyList emptyList = EmptyList.f38032a;
                c1621eM5285b1.m18011a1(abstractC5257tM13735e, emptyList, lazyJavaScope2.mo11211p(), null, emptyList);
                AbstractC5257t abstractC5257tMo11884c = c1621eM5285b1.mo11884c();
                if (abstractC5257tMo11884c == null) {
                    C8413d.m16442a(64);
                    throw null;
                }
                int i10 = C8413d.f45539a;
                if (c1621eM5285b1.f49221f || C7499b.m14926X(abstractC5257tMo11884c)) {
                    z10 = false;
                } else if (!C5258t0.m11291b(abstractC5257tMo11884c)) {
                    AbstractC6795c abstractC6795cM14108e = DescriptorUtilsKt.m14108e(c1621eM5285b1);
                    if (!AbstractC6795c.m13535H(abstractC5257tMo11884c)) {
                        C5443h c5443h = InterfaceC5438c.f33982a;
                        if (!c5443h.mo11657a(abstractC6795cM14108e.m13563v(), abstractC5257tMo11884c) && !c5443h.mo11657a(abstractC6795cM14108e.m13554k("Number").mo5316v(), abstractC5257tMo11884c) && !c5443h.mo11657a(abstractC6795cM14108e.m13549f(), abstractC5257tMo11884c) && !C8091h.m16005a(abstractC5257tMo11884c)) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    c1621eM5285b1.m18041P0(null, new InterfaceC2041a<InterfaceC2074f<? extends AbstractC8875g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final InterfaceC2074f<? extends AbstractC8875g<?>> mo807E() {
                            final LazyJavaScope lazyJavaScope4 = lazyJavaScope2;
                            InterfaceC2076h interfaceC2076hM15268b = lazyJavaScope4.f38771b.m15268b();
                            final InterfaceC5834n interfaceC5834n = interfaceC5834nMo11207f;
                            final C9562d0 c9562d0 = c1621eM5285b1;
                            return interfaceC2076hM15268b.mo6219d(new InterfaceC2041a<AbstractC8875g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final AbstractC8875g<?> mo807E() {
                                    ((C2064a) lazyJavaScope4.f38771b.f42146a).f10502h.mo531a(interfaceC5834n, c9562d0);
                                    return null;
                                }
                            });
                        }
                    });
                }
                ((InterfaceC0130d.a) c2064a.f10501g).getClass();
                return c1621eM5285b1;
            }
        });
        this.f38777h = c7669f.m15268b().mo6221f(new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

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
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                C5207g.m11111f(c7648e2, "name");
                LazyJavaScope lazyJavaScope2 = this.f38796b;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((LockBasedStorageManager.C7045k) lazyJavaScope2.f38775f).mo528n(c7648e2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : linkedHashSet) {
                    String strM14957p = C7499b.m14957p((InterfaceC6824e) obj, 2);
                    Object arrayList = linkedHashMap.get(strM14957p);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strM14957p, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                Iterator it = linkedHashMap.values().iterator();
                while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            lazyJavaScope2.mo13711m(linkedHashSet, c7648e2);
                            C7669f c7669f2 = lazyJavaScope2.f38771b;
                            return C6752c.m13453u0(((C2064a) c7669f2.f42146a).f10512r.m13744c(c7669f2, linkedHashSet));
                        }
                        List list = (List) it.next();
                        if (list.size() != 1) {
                            Collection collectionM14092a = OverridingUtilsKt.m14092a(list, new InterfaceC2052l<InterfaceC6824e, InterfaceC6816a>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final InterfaceC6816a mo528n(InterfaceC6824e interfaceC6824e) {
                                    InterfaceC6824e interfaceC6824e2 = interfaceC6824e;
                                    C5207g.m11111f(interfaceC6824e2, "$this$selectMostSpecificInEachOverridableGroup");
                                    return interfaceC6824e2;
                                }
                            });
                            linkedHashSet.removeAll(list);
                            linkedHashSet.addAll(collectionM14092a);
                        }
                    }
                }
            }
        });
        this.f38778i = c7669f.m15268b().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                return this.f38795b.mo13708i(C9981d.f50724p, null);
            }
        });
        this.f38779j = c7669f.m15268b().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                return this.f38798b.mo13712o(C9981d.f50725q);
            }
        });
        this.f38780k = c7669f.m15268b().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                return this.f38791b.mo13707h(C9981d.f50723o, null);
            }
        });
        this.f38781l = c7669f.m15268b().mo6221f(new InterfaceC2052l<C7648e, List<? extends InterfaceC8829b0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final List<? extends InterfaceC8829b0> mo528n(C7648e c7648e) {
                C7648e c7648e2 = c7648e;
                C5207g.m11111f(c7648e2, "name");
                ArrayList arrayList = new ArrayList();
                LazyJavaScope lazyJavaScope2 = this.f38797b;
                C0062b.m282K(lazyJavaScope2.f38776g.mo528n(c7648e2), arrayList);
                lazyJavaScope2.mo11210n(arrayList, c7648e2);
                InterfaceC8838g interfaceC8838gMo13713q = lazyJavaScope2.mo13713q();
                int i10 = C8413d.f45539a;
                if (C8413d.m16455n(interfaceC8838gMo13713q, ClassKind.ANNOTATION_CLASS)) {
                    return C6752c.m13453u0(arrayList);
                }
                C7669f c7669f2 = lazyJavaScope2.f38771b;
                return C6752c.m13453u0(((C2064a) c7669f2.f42146a).f10512r.m13744c(c7669f2, arrayList));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC5257t m13720l(InterfaceC5837q interfaceC5837q, C7669f c7669f) {
        C5207g.m11111f(interfaceC5837q, "method");
        return ((C6859a) c7669f.f42150e).m13735e(interfaceC5837q.mo12275m(), C5435b.m11586b(TypeUsage.COMMON, interfaceC5837q.mo12272o().mo12256t(), null, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static C6852b m13721u(C7669f c7669f, AbstractC6828b abstractC6828b, List list) {
        Pair pair;
        C7648e c7648eMo12288a;
        C5207g.m11111f(list, "jValueParameters");
        C9332t c9332tM13458z0 = C6752c.m13458z0(list);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c9332tM13458z0, 10));
        Iterator it = c9332tM13458z0.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            C9333u c9333u = (C9333u) it;
            if (!c9333u.hasNext()) {
                return new C6852b(C6752c.m13453u0(arrayList), z11);
            }
            C9331s c9331s = (C9331s) c9333u.next();
            int i10 = c9331s.f48066a;
            InterfaceC5846z interfaceC5846z = (InterfaceC5846z) c9331s.f48067b;
            LazyJavaAnnotations lazyJavaAnnotationsM14968u0 = C7499b.m14968u0(c7669f, interfaceC5846z);
            C5434a c5434aM11586b = C5435b.m11586b(TypeUsage.COMMON, z10, null, 3);
            boolean zMo12289b = interfaceC5846z.mo12289b();
            Object obj = c7669f.f42150e;
            if (zMo12289b) {
                InterfaceC5843w interfaceC5843wMo12290c = interfaceC5846z.mo12290c();
                InterfaceC5826f interfaceC5826f = interfaceC5843wMo12290c instanceof InterfaceC5826f ? (InterfaceC5826f) interfaceC5843wMo12290c : null;
                if (interfaceC5826f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC5846z);
                }
                AbstractC5262v0 abstractC5262v0M13734c = ((C6859a) obj).m13734c(interfaceC5826f, c5434aM11586b, true);
                pair = new Pair(abstractC5262v0M13734c, c7669f.m15267a().mo11877o().m13550g(abstractC5262v0M13734c));
            } else {
                pair = new Pair(((C6859a) obj).m13735e(interfaceC5846z.mo12290c(), c5434aM11586b), null);
            }
            AbstractC5257t abstractC5257t = (AbstractC5257t) pair.f38012a;
            AbstractC5257t abstractC5257t2 = (AbstractC5257t) pair.f38013b;
            if (C5207g.m11106a(abstractC6828b.mo11874a().m15235f(), "equals") && list.size() == 1 && C5207g.m11106a(c7669f.m15267a().mo11877o().m13559p(), abstractC5257t)) {
                c7648eMo12288a = C7648e.m15232l("other");
            } else {
                c7648eMo12288a = interfaceC5846z.mo12288a();
                if (c7648eMo12288a == null) {
                    z11 = true;
                }
                if (c7648eMo12288a == null) {
                    c7648eMo12288a = C7648e.m15232l("p" + i10);
                }
            }
            arrayList.add(new C6830d(abstractC6828b, null, i10, lazyJavaAnnotationsM14968u0, c7648eMo12288a, abstractC5257t, false, false, false, abstractC5257t2, ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5846z)));
            z10 = false;
        }
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        return (Set) C0062b.m366l1(this.f38778i, f38770m[0]);
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return !mo11903a().contains(c7648e) ? EmptyList.f38032a : (Collection) ((LockBasedStorageManager.C7045k) this.f38777h).mo528n(c7648e);
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return !mo11906d().contains(c7648e) ? EmptyList.f38032a : (Collection) ((LockBasedStorageManager.C7045k) this.f38781l).mo528n(c7648e);
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        return (Set) C0062b.m366l1(this.f38779j, f38770m[1]);
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return this.f38773d.mo807E();
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        return (Set) C0062b.m366l1(this.f38780k, f38770m[2]);
    }

    /* JADX INFO: renamed from: h */
    public abstract Set<C7648e> mo13707h(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l);

    /* JADX INFO: renamed from: i */
    public abstract Set<C7648e> mo13708i(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l);

    /* JADX INFO: renamed from: j */
    public void mo13709j(ArrayList arrayList, C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
    }

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC5215a mo13710k();

    /* JADX INFO: renamed from: m */
    public abstract void mo13711m(LinkedHashSet linkedHashSet, C7648e c7648e);

    /* JADX INFO: renamed from: n */
    public abstract void mo11210n(ArrayList arrayList, C7648e c7648e);

    /* JADX INFO: renamed from: o */
    public abstract Set mo13712o(C9981d c9981d);

    /* JADX INFO: renamed from: p */
    public abstract InterfaceC8835e0 mo11211p();

    /* JADX INFO: renamed from: q */
    public abstract InterfaceC8838g mo13713q();

    /* JADX INFO: renamed from: r */
    public boolean mo13714r(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public abstract C6851a mo11212s(InterfaceC5837q interfaceC5837q, ArrayList arrayList, AbstractC5257t abstractC5257t, List list);

    /* JADX INFO: renamed from: t */
    public final JavaMethodDescriptor m13722t(InterfaceC5837q interfaceC5837q) {
        C5207g.m11111f(interfaceC5837q, "method");
        C7669f c7669f = this.f38771b;
        JavaMethodDescriptor javaMethodDescriptorM13678j1 = JavaMethodDescriptor.m13678j1(mo13713q(), C7499b.m14968u0(c7669f, interfaceC5837q), interfaceC5837q.mo12280a(), ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5837q), this.f38774e.mo807E().mo11203b(interfaceC5837q.mo12280a()) != null && interfaceC5837q.mo12274i().isEmpty());
        C5207g.m11111f(c7669f, "<this>");
        C7669f c7669f2 = new C7669f((C2064a) c7669f.f42146a, new LazyJavaTypeParameterResolver(c7669f, javaMethodDescriptorM13678j1, interfaceC5837q, 0), (InterfaceC9070c) c7669f.f42148c);
        ArrayList arrayListMo12287r = interfaceC5837q.mo12287r();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListMo12287r, 10));
        Iterator it = arrayListMo12287r.iterator();
        while (it.hasNext()) {
            InterfaceC8847k0 interfaceC8847k0Mo6215a = ((InterfaceC2068e) c7669f2.f42147b).mo6215a((InterfaceC5844x) it.next());
            C5207g.m11108c(interfaceC8847k0Mo6215a);
            arrayList.add(interfaceC8847k0Mo6215a);
        }
        C6852b c6852bM13721u = m13721u(c7669f2, javaMethodDescriptorM13678j1, interfaceC5837q.mo12274i());
        AbstractC5257t abstractC5257tM13720l = m13720l(interfaceC5837q, c7669f2);
        List<InterfaceC8853n0> list = c6852bM13721u.f38789a;
        C6851a c6851aMo11212s = mo11212s(interfaceC5837q, arrayList, abstractC5257tM13720l, list);
        AbstractC5257t abstractC5257t = c6851aMo11212s.f38783b;
        C9568g0 c9568g0M16438g = abstractC5257t != null ? C8412c.m16438g(javaMethodDescriptorM13678j1, abstractC5257t, InterfaceC9077e.a.f47365a) : null;
        InterfaceC8835e0 interfaceC8835e0Mo11211p = mo11211p();
        EmptyList emptyList = EmptyList.f38032a;
        List<InterfaceC8847k0> list2 = c6851aMo11212s.f38785d;
        List<InterfaceC8853n0> list3 = c6851aMo11212s.f38784c;
        AbstractC5257t abstractC5257t2 = c6851aMo11212s.f38782a;
        Modality.C6809a c6809a = Modality.Companion;
        boolean zMo12276P = interfaceC5837q.mo12276P();
        boolean z10 = !interfaceC5837q.mo12279q();
        c6809a.getClass();
        javaMethodDescriptorM13678j1.mo13679i1(c9568g0M16438g, interfaceC8835e0Mo11211p, emptyList, list2, list3, abstractC5257t2, Modality.C6809a.m13587a(false, zMo12276P, z10), C7499b.m14895B0(interfaceC5837q.mo12278f()), c6851aMo11212s.f38783b != null ? C7499b.m14943h0(new Pair(JavaMethodDescriptor.f38656b0, C6752c.m13423Q(list))) : C6753d.m13459L0());
        javaMethodDescriptorM13678j1.m13680k1(c6851aMo11212s.f38786e, c6852bM13721u.f38790b);
        if (!(!c6851aMo11212s.f38787f.isEmpty())) {
            return javaMethodDescriptorM13678j1;
        }
        ((InterfaceC0131e.a) ((C2064a) c7669f2.f42146a).f10499e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + mo13713q();
    }
}
