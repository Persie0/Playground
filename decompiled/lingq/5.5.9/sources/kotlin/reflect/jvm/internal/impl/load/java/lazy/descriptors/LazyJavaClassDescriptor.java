package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import bn.InterfaceC1619c;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5827g;
import gn.InterfaceC5830j;
import gn.InterfaceC5843w;
import gn.InterfaceC5844x;
import hn.C6088h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jm.C6525h;
import jm.C6526i;
import kotlin.C6740a;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C6892c;
import kotlin.reflect.jvm.internal.impl.name.C6979a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p016an.InterfaceC0130d;
import p101en.C5434a;
import p101en.C5435b;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p266n.C7669f;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.AbstractC8859q0;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8863u;
import p373rn.C8887s;
import p385sf.C9000b;
import p420um.AbstractC9571i;
import p420um.AbstractC9575k;
import p466wn.C9983f;
import p541zn.InterfaceC10548l;
import p543do.AbstractC5221b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import sl.InterfaceC9070c;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;
import zm.C10522g;
import zm.C10527l;
import zm.C10534s;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassDescriptor extends AbstractC9575k implements InterfaceC1619c {

    /* JADX INFO: renamed from: S */
    public static final Set<String> f38704S = C7499b.m14973x0("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: H */
    public final ClassKind f38705H;

    /* JADX INFO: renamed from: I */
    public final Modality f38706I;

    /* JADX INFO: renamed from: J */
    public final AbstractC8859q0 f38707J;

    /* JADX INFO: renamed from: K */
    public final boolean f38708K;

    /* JADX INFO: renamed from: L */
    public final LazyJavaClassTypeConstructor f38709L;

    /* JADX INFO: renamed from: M */
    public final LazyJavaClassMemberScope f38710M;

    /* JADX INFO: renamed from: N */
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f38711N;

    /* JADX INFO: renamed from: O */
    public final C9983f f38712O;

    /* JADX INFO: renamed from: P */
    public final C6856b f38713P;

    /* JADX INFO: renamed from: Q */
    public final LazyJavaAnnotations f38714Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC2073e<List<InterfaceC8847k0>> f38715R;

    /* JADX INFO: renamed from: h */
    public final C7669f f38716h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5827g f38717i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC8830c f38718j;

    /* JADX INFO: renamed from: k */
    public final C7669f f38719k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9070c f38720l;

    public final class LazyJavaClassTypeConstructor extends AbstractC5221b {

        /* JADX INFO: renamed from: c */
        public final InterfaceC2073e<List<InterfaceC8847k0>> f38721c;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f38719k.m15268b());
            this.f38721c = LazyJavaClassDescriptor.this.f38719k.m15268b().mo6217b(new InterfaceC2041a<List<? extends InterfaceC8847k0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends InterfaceC8847k0> mo807E() {
                    return TypeParameterUtilsKt.m13612b(lazyJavaClassDescriptor);
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0056  */
        /* JADX WARN: Code duplicated, block: B:28:0x006e  */
        /* JADX WARN: Code duplicated, block: B:56:0x014f  */
        /* JADX WARN: Code duplicated, block: B:60:0x015a  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:79:0x01de  */
        /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:83:0x0200  */
        /* JADX WARN: Code duplicated, block: B:86:0x0219 A[LOOP:2: B:84:0x0213->B:86:0x0219, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:90:0x0238  */
        /* JADX WARN: Code duplicated, block: B:91:0x023d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: d */
        public final Collection<AbstractC5257t> mo11258d() {
            C7646c c7646c;
            C7646c c7646c2;
            AbstractC5265x abstractC5265xM14186e;
            int i10;
            InterfaceC8830c interfaceC8830c;
            AbstractC5257t abstractC5257tM14205k;
            ArrayList arrayList;
            AbstractC5257t abstractC5257tM13735e;
            AbstractC5257t abstractC5257tM13742a;
            InterfaceC5240k0 interfaceC5240k0Mo11250X0;
            InterfaceC5240k0 interfaceC5240k0Mo11250X1;
            ArrayList arrayList2;
            String str;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            Collection<InterfaceC5830j> collectionMo12255p = lazyJavaClassDescriptor.f38717i.mo12255p();
            ArrayList arrayList3 = new ArrayList(collectionMo12255p.size());
            boolean z10 = false;
            ArrayList<InterfaceC5843w> arrayList4 = new ArrayList(0);
            C7646c c7646c3 = C10534s.f52547n;
            C5207g.m11110e(c7646c3, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC9075c interfaceC9075cMo5291h = lazyJavaClassDescriptor.f38714Q.mo5291h(c7646c3);
            AbstractC9571i abstractC9571i = null;
            if (interfaceC9075cMo5291h == null) {
                c7646c = null;
            } else {
                Object objM13444l0 = C6752c.m13444l0(interfaceC9075cMo5291h.mo12513a().values());
                C8887s c8887s = objM13444l0 instanceof C8887s ? (C8887s) objM13444l0 : null;
                if (c8887s == null || (str = (String) c8887s.f46772a) == null || !C6979a.m13891a(str)) {
                    c7646c = null;
                } else {
                    c7646c = new C7646c(str);
                }
            }
            if (c7646c == null) {
                c7646c = null;
            } else if (!(!c7646c.m15216d() && c7646c.m15220h(C6797e.f38343i))) {
                c7646c = null;
            }
            C7669f c7669f = lazyJavaClassDescriptor.f38719k;
            int i11 = 10;
            if (c7646c == null) {
                LinkedHashMap linkedHashMap = C10522g.f52511a;
                c7646c2 = C10522g.f52512b.get(DescriptorUtilsKt.m14110g(lazyJavaClassDescriptor));
                if (c7646c2 == null) {
                    abstractC5265xM14186e = null;
                }
                for (InterfaceC5830j interfaceC5830j : collectionMo12255p) {
                    abstractC5257tM13735e = ((C6859a) c7669f.f42150e).m13735e(interfaceC5830j, C5435b.m11586b(TypeUsage.SUPERTYPE, z10, abstractC9571i, 3));
                    C6892c c6892c = ((C2064a) c7669f.f42146a).f10512r;
                    c6892c.getClass();
                    int i12 = i11;
                    abstractC5257tM13742a = c6892c.m13742a(new C6088h(null, false, c7669f, AnnotationQualifierApplicabilityType.TYPE_USE, true), abstractC5257tM13735e, EmptyList.f38032a, null, false);
                    if (abstractC5257tM13742a == null) {
                        abstractC5257tM13742a = abstractC5257tM13735e;
                    }
                    if (abstractC5257tM13742a.mo11250X0().mo11235q() instanceof NotFoundClasses.C6811b) {
                        arrayList4.add(interfaceC5830j);
                    }
                    interfaceC5240k0Mo11250X0 = abstractC5257tM13742a.mo11250X0();
                    if (abstractC5265xM14186e != null) {
                        interfaceC5240k0Mo11250X1 = abstractC5265xM14186e.mo11250X0();
                    } else {
                        interfaceC5240k0Mo11250X1 = null;
                    }
                    if (!C5207g.m11106a(interfaceC5240k0Mo11250X0, interfaceC5240k0Mo11250X1) && !AbstractC6795c.m13545y(abstractC5257tM13742a)) {
                        arrayList3.add(abstractC5257tM13742a);
                    }
                    i11 = i12;
                    z10 = false;
                    abstractC9571i = null;
                }
                i10 = i11;
                interfaceC8830c = lazyJavaClassDescriptor.f38718j;
                if (interfaceC8830c != null) {
                    abstractC5257tM14205k = TypeSubstitutor.m14199e(C7499b.m14971w(interfaceC8830c, lazyJavaClassDescriptor)).m14205k(interfaceC8830c.mo5316v(), Variance.INVARIANT);
                } else {
                    abstractC5257tM14205k = null;
                }
                C0062b.m282K(abstractC5257tM14205k, arrayList3);
                C0062b.m282K(abstractC5265xM14186e, arrayList3);
                if (!arrayList4.isEmpty()) {
                    InterfaceC10548l interfaceC10548l = ((C2064a) c7669f.f42146a).f10500f;
                    arrayList = new ArrayList(C9325m.m17681z(arrayList4, i10));
                    for (InterfaceC5843w interfaceC5843w : arrayList4) {
                        C5207g.m11109d(interfaceC5843w, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList.add(((InterfaceC5830j) interfaceC5843w).mo12265s());
                    }
                    interfaceC10548l.mo16920b(lazyJavaClassDescriptor, arrayList);
                }
                return arrayList3.isEmpty() ^ true ? C6752c.m13453u0(arrayList3) : C9000b.m17251q(c7669f.m15267a().mo11877o().m13549f());
            }
            c7646c2 = c7646c;
            InterfaceC8863u interfaceC8863uM15267a = c7669f.m15267a();
            NoLookupLocation noLookupLocation = NoLookupLocation.FROM_JAVA_LOADER;
            int i13 = DescriptorUtilsKt.f39656a;
            C5207g.m11111f(interfaceC8863uM15267a, "<this>");
            C5207g.m11111f(noLookupLocation, "location");
            c7646c2.m15216d();
            C7646c c7646cM15217e = c7646c2.m15217e();
            C5207g.m11110e(c7646cM15217e, "topLevelClassFqName.parent()");
            MemberScope memberScopeMo13628q = interfaceC8863uM15267a.mo11873R(c7646cM15217e).mo13628q();
            C7648e c7648eM15218f = c7646c2.m15218f();
            C5207g.m11110e(c7648eM15218f, "topLevelClassFqName.shortName()");
            InterfaceC8834e interfaceC8834eMo5304g = memberScopeMo13628q.mo5304g(c7648eM15218f, noLookupLocation);
            InterfaceC8830c interfaceC8830c2 = interfaceC8834eMo5304g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g : null;
            if (interfaceC8830c2 == null) {
                abstractC5265xM14186e = null;
            } else {
                int size = interfaceC8830c2.mo13600k().mo11260r().size();
                List<InterfaceC8847k0> listMo11260r = lazyJavaClassDescriptor.f38709L.mo11260r();
                C5207g.m11110e(listMo11260r, "getTypeConstructor().parameters");
                int size2 = listMo11260r.size();
                if (size2 == size) {
                    arrayList2 = new ArrayList(C9325m.m17681z(listMo11260r, 10));
                    Iterator<T> it = listMo11260r.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new C5250p0(((InterfaceC8847k0) it.next()).mo5316v(), Variance.INVARIANT));
                    }
                } else if (size2 == 1 && size > 1 && c7646c == null) {
                    C5250p0 c5250p0 = new C5250p0(((InterfaceC8847k0) C6752c.m13443k0(listMo11260r)).mo5316v(), Variance.INVARIANT);
                    C6526i c6526i = new C6526i(1, size);
                    ArrayList arrayList5 = new ArrayList(C9325m.m17681z(c6526i, 10));
                    C6525h it2 = c6526i.iterator();
                    while (it2.f37168c) {
                        it2.mo13105a();
                        arrayList5.add(c5250p0);
                    }
                    arrayList2 = arrayList5;
                } else {
                    abstractC5265xM14186e = null;
                }
                C5238j0.f33329b.getClass();
                abstractC5265xM14186e = KotlinTypeFactory.m14186e(C5238j0.f33330c, interfaceC8830c2, arrayList2);
            }
            while (r2.hasNext()) {
                abstractC5257tM13735e = ((C6859a) c7669f.f42150e).m13735e(interfaceC5830j, C5435b.m11586b(TypeUsage.SUPERTYPE, z10, abstractC9571i, 3));
                C6892c c6892c2 = ((C2064a) c7669f.f42146a).f10512r;
                c6892c2.getClass();
                int i14 = i11;
                abstractC5257tM13742a = c6892c2.m13742a(new C6088h(null, false, c7669f, AnnotationQualifierApplicabilityType.TYPE_USE, true), abstractC5257tM13735e, EmptyList.f38032a, null, false);
                if (abstractC5257tM13742a == null) {
                    abstractC5257tM13742a = abstractC5257tM13735e;
                }
                if (abstractC5257tM13742a.mo11250X0().mo11235q() instanceof NotFoundClasses.C6811b) {
                    arrayList4.add(interfaceC5830j);
                }
                interfaceC5240k0Mo11250X0 = abstractC5257tM13742a.mo11250X0();
                if (abstractC5265xM14186e != null) {
                    interfaceC5240k0Mo11250X1 = abstractC5265xM14186e.mo11250X0();
                } else {
                    interfaceC5240k0Mo11250X1 = null;
                }
                if (!C5207g.m11106a(interfaceC5240k0Mo11250X0, interfaceC5240k0Mo11250X1)) {
                    arrayList3.add(abstractC5257tM13742a);
                }
                i11 = i14;
                z10 = false;
                abstractC9571i = null;
            }
            i10 = i11;
            interfaceC8830c = lazyJavaClassDescriptor.f38718j;
            if (interfaceC8830c != null) {
                abstractC5257tM14205k = TypeSubstitutor.m14199e(C7499b.m14971w(interfaceC8830c, lazyJavaClassDescriptor)).m14205k(interfaceC8830c.mo5316v(), Variance.INVARIANT);
            } else {
                abstractC5257tM14205k = null;
            }
            C0062b.m282K(abstractC5257tM14205k, arrayList3);
            C0062b.m282K(abstractC5265xM14186e, arrayList3);
            if (!arrayList4.isEmpty()) {
                InterfaceC10548l interfaceC10548l2 = ((C2064a) c7669f.f42146a).f10500f;
                arrayList = new ArrayList(C9325m.m17681z(arrayList4, i10));
                while (r4.hasNext()) {
                    C5207g.m11109d(interfaceC5843w, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList.add(((InterfaceC5830j) interfaceC5843w).mo12265s());
                }
                interfaceC10548l2.mo16920b(lazyJavaClassDescriptor, arrayList);
            }
            if (arrayList3.isEmpty() ^ true) {
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: g */
        public final InterfaceC8843i0 mo11259g() {
            return ((C2064a) LazyJavaClassDescriptor.this.f38719k.f42146a).f10507m;
        }

        @Override // p543do.AbstractC5221b
        /* JADX INFO: renamed from: l */
        public final InterfaceC8830c mo11235q() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // p543do.AbstractC5221b, p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: q */
        public final InterfaceC8834e mo11235q() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: r */
        public final List<InterfaceC8847k0> mo11260r() {
            return this.f38721c.mo807E();
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: s */
        public final boolean mo11261s() {
            return true;
        }

        public final String toString() {
            String strM15235f = LazyJavaClassDescriptor.this.mo11874a().m15235f();
            C5207g.m11110e(strM15235f, "name.asString()");
            return strM15235f;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$a */
    public static final class C6847a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(DescriptorUtilsKt.m14110g((InterfaceC8830c) t10).m15214b(), DescriptorUtilsKt.m14110g((InterfaceC8830c) t11).m15214b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(C7669f c7669f, InterfaceC8838g interfaceC8838g, InterfaceC5827g interfaceC5827g, InterfaceC8830c interfaceC8830c) {
        Modality modalityM13587a;
        super(c7669f.m15268b(), interfaceC8838g, interfaceC5827g.mo12280a(), ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5827g));
        C5207g.m11111f(c7669f, "outerContext");
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(interfaceC5827g, "jClass");
        this.f38716h = c7669f;
        this.f38717i = interfaceC5827g;
        this.f38718j = interfaceC8830c;
        C7669f c7669fM13681a = ContextKt.m13681a(c7669f, this, interfaceC5827g, 4);
        this.f38719k = c7669fM13681a;
        C2064a c2064a = (C2064a) c7669fM13681a.f42146a;
        ((InterfaceC0130d.a) c2064a.f10501g).getClass();
        interfaceC5827g.mo12249Q();
        this.f38720l = C6740a.m13372a(new InterfaceC2041a<List<? extends InterfaceC5820a>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$moduleAnnotations$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC5820a> mo807E() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38725b;
                C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(lazyJavaClassDescriptor);
                if (c7645bM14109f != null) {
                    ((C2064a) lazyJavaClassDescriptor.f38716h.f42146a).f10517w.mo11191e(c7645bM14109f);
                }
                return null;
            }
        });
        this.f38705H = interfaceC5827g.mo12256t() ? ClassKind.ANNOTATION_CLASS : interfaceC5827g.mo12248O() ? ClassKind.INTERFACE : interfaceC5827g.mo12246H() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (interfaceC5827g.mo12256t() || interfaceC5827g.mo12246H()) {
            modalityM13587a = Modality.FINAL;
        } else {
            Modality.C6809a c6809a = Modality.Companion;
            boolean zMo12247K = interfaceC5827g.mo12247K();
            boolean z10 = interfaceC5827g.mo12247K() || interfaceC5827g.mo12276P() || interfaceC5827g.mo12248O();
            boolean z11 = !interfaceC5827g.mo12279q();
            c6809a.getClass();
            modalityM13587a = Modality.C6809a.m13587a(zMo12247K, z10, z11);
        }
        this.f38706I = modalityM13587a;
        this.f38707J = interfaceC5827g.mo12278f();
        this.f38708K = (interfaceC5827g.mo12257u() == null || interfaceC5827g.mo12277X()) ? false : true;
        this.f38709L = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(c7669fM13681a, this, interfaceC5827g, interfaceC8830c != null, null);
        this.f38710M = lazyJavaClassMemberScope;
        ScopesHolderForClass.C6812a c6812a = ScopesHolderForClass.f38463e;
        InterfaceC2076h interfaceC2076hM15268b = c7669fM13681a.m15268b();
        AbstractC5439d abstractC5439dMo11666c = c2064a.f10515u.mo11666c();
        InterfaceC2052l<AbstractC5439d, LazyJavaClassMemberScope> interfaceC2052l = new InterfaceC2052l<AbstractC5439d, LazyJavaClassMemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final LazyJavaClassMemberScope mo528n(AbstractC5439d abstractC5439d) {
                C5207g.m11111f(abstractC5439d, "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38726b;
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f38719k, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f38717i, lazyJavaClassDescriptor.f38718j != null, lazyJavaClassDescriptor.f38710M);
            }
        };
        c6812a.getClass();
        this.f38711N = ScopesHolderForClass.C6812a.m13610a(interfaceC2052l, this, interfaceC2076hM15268b, abstractC5439dMo11666c);
        this.f38712O = new C9983f(lazyJavaClassMemberScope);
        this.f38713P = new C6856b(c7669fM13681a, interfaceC5827g, this);
        this.f38714Q = C7499b.m14968u0(c7669fM13681a, interfaceC5827g);
        this.f38715R = c7669fM13681a.m15268b().mo6217b(new InterfaceC2041a<List<? extends InterfaceC8847k0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC8847k0> mo807E() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38724b;
                ArrayList<InterfaceC5844x> arrayListMo12287r = lazyJavaClassDescriptor.f38717i.mo12287r();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListMo12287r, 10));
                for (InterfaceC5844x interfaceC5844x : arrayListMo12287r) {
                    InterfaceC8847k0 interfaceC8847k0Mo6215a = ((InterfaceC2068e) lazyJavaClassDescriptor.f38719k.f42147b).mo6215a(interfaceC5844x);
                    if (interfaceC8847k0Mo6215a == null) {
                        throw new AssertionError("Parameter " + interfaceC5844x + " surely belongs to class " + lazyJavaClassDescriptor.f38717i + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC8847k0Mo6215a);
                }
                return arrayList;
            }
        });
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: E */
    public final boolean mo13589E() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: G */
    public final Collection mo13590G() {
        return this.f38710M.f38730q.mo807E();
    }

    @Override // p420um.AbstractC9557b, p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: H0 */
    public final MemberScope mo13687H0() {
        return this.f38712O;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: I0 */
    public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: J */
    public final boolean mo13592J() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return false;
    }

    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: P */
    public final MemberScope mo13593P(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f38711N.m13609a(abstractC5439d);
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S */
    public final boolean mo13594S() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S0 */
    public final boolean mo13595S0() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return false;
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return this.f38708K;
    }

    @Override // p420um.AbstractC9557b, p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final LazyJavaClassMemberScope mo13688N0() {
        MemberScope memberScopeMo13688N0 = super.mo13688N0();
        C5207g.m11109d(memberScopeMo13688N0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) memberScopeMo13688N0;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final InterfaceC8828b mo13597Y() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        return this.f38713P;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8830c mo13599b0() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.d dVar = C8850m.f46734a;
        AbstractC8859q0 abstractC8859q0 = this.f38707J;
        if (!C5207g.m11106a(abstractC8859q0, dVar) || this.f38717i.mo12257u() != null) {
            return C7499b.m14895B0(abstractC8859q0);
        }
        C10527l.a aVar = C10527l.f52520a;
        C5207g.m11110e(aVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return aVar;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        return this.f38709L;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        return this.f38706I;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8830c> mo13601m() {
        if (this.f38706I != Modality.SEALED) {
            return EmptyList.f38032a;
        }
        C5434a c5434aM11586b = C5435b.m11586b(TypeUsage.COMMON, false, null, 3);
        Collection<InterfaceC5830j> collectionMo12250U = this.f38717i.mo12250U();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo12250U.iterator();
        while (it.hasNext()) {
            InterfaceC8834e interfaceC8834eMo11235q = ((C6859a) this.f38719k.f42150e).m13735e((InterfaceC5830j) it.next(), c5434aM11586b).mo11250X0().mo11235q();
            InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
            if (interfaceC8830c != null) {
                arrayList.add(interfaceC8830c);
            }
        }
        return C6752c.m13447o0(arrayList, new C6847a());
    }

    public final String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.m14111h(this);
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        return this.f38705H;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return this.f38714Q;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: x */
    public final boolean mo13603x() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        return this.f38715R.mo807E();
    }
}
