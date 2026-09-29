package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ae.C0062b;
import bo.C1630h;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2069a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo.C6530b;
import jo.C6532d;
import km.InterfaceC6727j;
import kn.InterfaceC6733c;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C6820a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.C7058b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import p260m8.C7499b;
import p266n.C7669f;
import p338qd.C8573r0;
import p338qd.C8584v;
import p347qm.C8644a;
import p347qm.C8645b;
import p347qm.C8646c;
import p347qm.C8647d;
import p347qm.C8648e;
import p347qm.C8650g;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p385sf.C9000b;
import p420um.C9577l;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8413d;
import sl.InterfaceC9070c;
import sm.C9078f;
import sm.InterfaceC9077e;
import tl.C9325m;
import tm.C9342d;
import tm.InterfaceC9339a;
import tm.InterfaceC9341c;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInsCustomizer implements InterfaceC9339a, InterfaceC9341c {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38420h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a */
    public final InterfaceC8863u f38421a;

    /* JADX INFO: renamed from: b */
    public final C8573r0 f38422b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e f38423c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5265x f38424d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2073e f38425e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2069a<C7646c, InterfaceC8830c> f38426f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2073e f38427g;

    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a */
    public /* synthetic */ class C6802a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38428a;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            iArr[JDKMemberStatus.DROP.ordinal()] = 3;
            iArr[JDKMemberStatus.VISIBLE.ordinal()] = 4;
            f38428a = iArr;
        }
    }

    public JvmBuiltInsCustomizer(C6829c c6829c, final InterfaceC2076h interfaceC2076h, InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f38421a = c6829c;
        this.f38422b = C8573r0.f45963O;
        this.f38423c = interfaceC2076h.mo6217b(interfaceC2041a);
        C9577l c9577l = new C9577l(new C8647d(c6829c, new C7646c("java.io")), C7648e.m15232l("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, C9000b.m17251q(new C7058b(interfaceC2076h, new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5257t mo807E() {
                AbstractC5265x abstractC5265xM13549f = this.f38431b.f38421a.mo11877o().m13549f();
                C5207g.m11110e(abstractC5265xM13549f, "moduleDescriptor.builtIns.anyType");
                return abstractC5265xM13549f;
            }
        })), interfaceC2076h);
        c9577l.m18038V0(MemberScope.C7015a.f39670b, EmptySet.f38034a, null);
        AbstractC5265x abstractC5265xMo5316v = c9577l.mo5316v();
        C5207g.m11110e(abstractC5265xMo5316v, "mockSerializableClass.defaultType");
        this.f38424d = abstractC5265xMo5316v;
        this.f38425e = interfaceC2076h.mo6217b(new InterfaceC2041a<AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5265x mo807E() {
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f38429b;
                InterfaceC8863u interfaceC8863u = jvmBuiltInsCustomizer.m13580g().f38412a;
                C6805a.f38437d.getClass();
                return FindClassInModuleKt.m13586c(interfaceC8863u, C6805a.f38441h, new NotFoundClasses(interfaceC2076h, jvmBuiltInsCustomizer.m13580g().f38412a)).mo5316v();
            }
        });
        this.f38426f = interfaceC2076h.mo6218c();
        this.f38427g = interfaceC2076h.mo6217b(new InterfaceC2041a<InterfaceC9077e>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC9077e mo807E() {
                List listM17251q = C9000b.m17251q(C6820a.m13613a(this.f38436b.f38421a.mo11877o()));
                return listM17251q.isEmpty() ? InterfaceC9077e.a.f47365a : new C9078f(listM17251q);
            }
        });
    }

    @Override // tm.InterfaceC9339a
    /* JADX INFO: renamed from: a */
    public final Collection mo13574a(DeserializedClassDescriptor deserializedClassDescriptor) {
        Set<C7648e> setMo11903a;
        C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
        if (!m13580g().f38413b) {
            return EmptySet.f38034a;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM13579f = m13579f(deserializedClassDescriptor);
        return (lazyJavaClassDescriptorM13579f == null || (setMo11903a = lazyJavaClassDescriptorM13579f.mo13688N0().mo11903a()) == null) ? EmptySet.f38034a : setMo11903a;
    }

    @Override // tm.InterfaceC9341c
    /* JADX INFO: renamed from: b */
    public final boolean mo13575b(DeserializedClassDescriptor deserializedClassDescriptor, C1630h c1630h) {
        C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorM13579f = m13579f(deserializedClassDescriptor);
        if (lazyJavaClassDescriptorM13579f != null && c1630h.mo11289w().mo5292x(C9342d.f48075a)) {
            if (!m13580g().f38413b) {
                return false;
            }
            String strM14957p = C7499b.m14957p(c1630h, 3);
            LazyJavaClassMemberScope lazyJavaClassMemberScopeMo13688N0 = lazyJavaClassDescriptorM13579f.mo13688N0();
            C7648e c7648eMo11874a = c1630h.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "functionDescriptor.name");
            Collection collectionMo11904b = lazyJavaClassMemberScopeMo13688N0.mo11904b(c7648eMo11874a, NoLookupLocation.FROM_BUILTINS);
            if (!(collectionMo11904b instanceof Collection) || !collectionMo11904b.isEmpty()) {
                Iterator it = collectionMo11904b.iterator();
                while (it.hasNext()) {
                    if (C5207g.m11106a(C7499b.m14957p((InterfaceC6824e) it.next(), 3), strM14957p)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[SYNTHETIC] */
    @Override // tm.InterfaceC9339a
    /* JADX INFO: renamed from: c */
    public final Collection mo13576c(DeserializedClassDescriptor deserializedClassDescriptor) {
        boolean z10;
        boolean z11;
        InterfaceC8834e interfaceC8834eMo11235q;
        C7647d c7647dM14111h;
        if (deserializedClassDescriptor.f39768k == ClassKind.CLASS && m13580g().f38413b) {
            LazyJavaClassDescriptor lazyJavaClassDescriptorM13579f = m13579f(deserializedClassDescriptor);
            if (lazyJavaClassDescriptorM13579f == null) {
                return EmptyList.f38032a;
            }
            InterfaceC8830c interfaceC8830cM16676H0 = C8573r0.m16676H0(this.f38422b, DescriptorUtilsKt.m14110g(lazyJavaClassDescriptorM13579f), C8645b.f46200f);
            if (interfaceC8830cM16676H0 == null) {
                return EmptyList.f38032a;
            }
            TypeSubstitutor typeSubstitutorM14199e = TypeSubstitutor.m14199e(C7499b.m14971w(interfaceC8830cM16676H0, lazyJavaClassDescriptorM13579f));
            List<InterfaceC8828b> listMo807E = lazyJavaClassDescriptorM13579f.f38710M.f38730q.mo807E();
            ArrayList<InterfaceC8828b> arrayList = new ArrayList();
            Iterator<T> it = listMo807E.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    InterfaceC8828b interfaceC8828b = (InterfaceC8828b) next;
                    boolean z12 = false;
                    if (interfaceC8828b.mo11886f().mo17094a().f46765b) {
                        Collection<InterfaceC8828b> collectionMo13590G = interfaceC8830cM16676H0.mo13590G();
                        C5207g.m11110e(collectionMo13590G, "defaultKotlinVersion.constructors");
                        if (!collectionMo13590G.isEmpty()) {
                            Iterator<T> it2 = collectionMo13590G.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    InterfaceC8828b interfaceC8828b2 = (InterfaceC8828b) it2.next();
                                    C5207g.m11110e(interfaceC8828b2, "it");
                                    if (OverridingUtil.m14075j(interfaceC8828b2, interfaceC8828b.mo5312d(typeSubstitutorM14199e)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                                        z10 = false;
                                        break;
                                    }
                                }
                            }
                            if (!z10) {
                                if (interfaceC8828b.mo11889i().size() == 1) {
                                    List<InterfaceC8853n0> listMo11889i = interfaceC8828b.mo11889i();
                                    C5207g.m11110e(listMo11889i, "valueParameters");
                                    interfaceC8834eMo11235q = ((InterfaceC8853n0) C6752c.m13443k0(listMo11889i)).mo11884c().mo11250X0().mo11235q();
                                    if (interfaceC8834eMo11235q != null) {
                                        c7647dM14111h = DescriptorUtilsKt.m14111h(interfaceC8834eMo11235q);
                                    } else {
                                        c7647dM14111h = null;
                                    }
                                    if (C5207g.m11106a(c7647dM14111h, DescriptorUtilsKt.m14111h(deserializedClassDescriptor))) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                if (z11 && !AbstractC6795c.m13531D(interfaceC8828b) && !C8650g.f46223e.contains(C0062b.m344e2(lazyJavaClassDescriptorM13579f, C7499b.m14957p(interfaceC8828b, 3)))) {
                                    z12 = true;
                                }
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            if (interfaceC8828b.mo11889i().size() == 1) {
                                List<InterfaceC8853n0> listMo11889i2 = interfaceC8828b.mo11889i();
                                C5207g.m11110e(listMo11889i2, "valueParameters");
                                interfaceC8834eMo11235q = ((InterfaceC8853n0) C6752c.m13443k0(listMo11889i2)).mo11884c().mo11250X0().mo11235q();
                                if (interfaceC8834eMo11235q != null) {
                                    c7647dM14111h = DescriptorUtilsKt.m14111h(interfaceC8834eMo11235q);
                                } else {
                                    c7647dM14111h = null;
                                }
                                if (C5207g.m11106a(c7647dM14111h, DescriptorUtilsKt.m14111h(deserializedClassDescriptor))) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                        }
                    }
                    if (z12) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            for (InterfaceC8828b interfaceC8828b3 : arrayList) {
                InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M0 = interfaceC8828b3.mo11848M0();
                aVarMo11848M0.mo11856f(deserializedClassDescriptor);
                aVarMo11848M0.mo11855e(deserializedClassDescriptor.mo5316v());
                aVarMo11848M0.mo11858h();
                aVarMo11848M0.mo11866p(typeSubstitutorM14199e.m14202g());
                if (!C8650g.f46224f.contains(C0062b.m344e2(lazyJavaClassDescriptorM13579f, C7499b.m14957p(interfaceC8828b3, 3)))) {
                    aVarMo11848M0.mo11867q((InterfaceC9077e) C0062b.m366l1(this.f38427g, f38420h[2]));
                }
                InterfaceC6822c interfaceC6822cMo11851a = aVarMo11848M0.mo11851a();
                C5207g.m11109d(interfaceC6822cMo11851a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((InterfaceC8828b) interfaceC6822cMo11851a);
            }
            return arrayList2;
        }
        return EmptyList.f38032a;
    }

    @Override // tm.InterfaceC9339a
    /* JADX INFO: renamed from: d */
    public final Collection mo13577d(DeserializedClassDescriptor deserializedClassDescriptor) {
        C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
        C7647d c7647dM14111h = DescriptorUtilsKt.m14111h(deserializedClassDescriptor);
        LinkedHashSet linkedHashSet = C8650g.f46219a;
        boolean zM16870a = C8650g.m16870a(c7647dM14111h);
        AbstractC5265x abstractC5265x = this.f38424d;
        boolean zIsAssignableFrom = true;
        if (zM16870a) {
            AbstractC5265x abstractC5265x2 = (AbstractC5265x) C0062b.m366l1(this.f38425e, f38420h[1]);
            C5207g.m11110e(abstractC5265x2, "cloneableType");
            return C9000b.m17252r(abstractC5265x2, abstractC5265x);
        }
        if (!C8650g.m16870a(c7647dM14111h)) {
            String str = C8646c.f46201a;
            C7645b c7645bM16869g = C8646c.m16869g(c7647dM14111h);
            if (c7645bM16869g == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c7645bM16869g.m15204b().m15214b()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
            }
        }
        return zIsAssignableFrom ? C9000b.m17251q(abstractC5265x) : EmptyList.f38032a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x024f  */
    @Override // tm.InterfaceC9339a
    /* JADX INFO: renamed from: e */
    public final Collection mo13578e(final C7648e c7648e, DeserializedClassDescriptor deserializedClassDescriptor) {
        Iterable iterableM14972w0;
        Object obj;
        Iterable<InterfaceC6824e> iterable;
        boolean z10;
        boolean z11;
        boolean zBooleanValue;
        InterfaceC6824e interfaceC6824e;
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(deserializedClassDescriptor, "classDescriptor");
        boolean zM11106a = C5207g.m11106a(c7648e, C8644a.f46199e);
        InterfaceC6727j<Object>[] interfaceC6727jArr = f38420h;
        boolean z12 = false;
        if (zM11106a) {
            C7648e c7648e2 = AbstractC6795c.f38322e;
            if (AbstractC6795c.m13542c(deserializedClassDescriptor, C6797e.a.f38384g) || AbstractC6795c.m13543s(deserializedClassDescriptor) != null) {
                List<ProtoBuf$Function> list = deserializedClassDescriptor.f39762e.f38992L;
                C5207g.m11110e(list, "classDescriptor.classProto.functionList");
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (C5207g.m11106a(C7499b.m14910J((InterfaceC6733c) deserializedClassDescriptor.f39769l.f46000b, ((ProtoBuf$Function) it.next()).f39127f), C8644a.f46199e)) {
                            z12 = true;
                            break;
                        }
                    }
                }
                if (z12) {
                    return EmptyList.f38032a;
                }
                InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M0 = ((InterfaceC6824e) C6752c.m13442j0(((AbstractC5265x) C0062b.m366l1(this.f38425e, interfaceC6727jArr[1])).mo11245q().mo11904b(c7648e, NoLookupLocation.FROM_BUILTINS))).mo11848M0();
                aVarMo11848M0.mo11856f(deserializedClassDescriptor);
                aVarMo11848M0.mo11863m(C8850m.f46738e);
                aVarMo11848M0.mo11855e(deserializedClassDescriptor.mo5316v());
                aVarMo11848M0.mo11868r(deserializedClassDescriptor.mo17092U0());
                InterfaceC6822c interfaceC6822cMo11851a = aVarMo11848M0.mo11851a();
                C5207g.m11108c(interfaceC6822cMo11851a);
                return C9000b.m17251q((InterfaceC6824e) interfaceC6822cMo11851a);
            }
        }
        if (!m13580g().f38413b) {
            return EmptyList.f38032a;
        }
        InterfaceC2052l<MemberScope, Collection<? extends InterfaceC6824e>> interfaceC2052l = new InterfaceC2052l<MemberScope, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC6824e> mo528n(MemberScope memberScope) {
                MemberScope memberScope2 = memberScope;
                C5207g.m11111f(memberScope2, "it");
                return memberScope2.mo11904b(c7648e, NoLookupLocation.FROM_BUILTINS);
            }
        };
        final LazyJavaClassDescriptor lazyJavaClassDescriptorM13579f = m13579f(deserializedClassDescriptor);
        if (lazyJavaClassDescriptorM13579f == null) {
            iterable = EmptyList.f38032a;
        } else {
            C7646c c7646cM14110g = DescriptorUtilsKt.m14110g(lazyJavaClassDescriptorM13579f);
            C8645b c8645b = C8645b.f46200f;
            C8573r0 c8573r0 = this.f38422b;
            c8573r0.getClass();
            C5207g.m11111f(c8645b, "builtIns");
            InterfaceC8830c interfaceC8830cM16676H0 = C8573r0.m16676H0(c8573r0, c7646cM14110g, c8645b);
            if (interfaceC8830cM16676H0 == null) {
                iterableM14972w0 = EmptySet.f38034a;
            } else {
                String str = C8646c.f46201a;
                C7646c c7646c = C8646c.f46211k.get(DescriptorUtilsKt.m14111h(interfaceC8830cM16676H0));
                iterableM14972w0 = c7646c == null ? C7499b.m14972w0(interfaceC8830cM16676H0) : C9000b.m17252r(interfaceC8830cM16676H0, c8645b.m13553j(c7646c));
            }
            C5207g.m11111f(iterableM14972w0, "<this>");
            if (iterableM14972w0 instanceof List) {
                List list2 = (List) iterableM14972w0;
                if (list2.isEmpty()) {
                    obj = null;
                } else {
                    obj = list2.get(list2.size() - 1);
                }
            } else {
                Iterator it2 = iterableM14972w0.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            final InterfaceC8830c interfaceC8830c = (InterfaceC8830c) obj;
            if (interfaceC8830c == null) {
                iterable = EmptyList.f38032a;
            } else {
                int i10 = C6532d.f37193c;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(iterableM14972w0, 10));
                Iterator it3 = iterableM14972w0.iterator();
                while (it3.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.m14110g((InterfaceC8830c) it3.next()));
                }
                C6532d c6532d = new C6532d();
                c6532d.addAll(arrayList);
                String str2 = C8646c.f46201a;
                boolean zContainsKey = C8646c.f46210j.containsKey(C8413d.m16448g(deserializedClassDescriptor));
                MemberScope memberScopeMo13688N0 = ((InterfaceC8830c) ((LockBasedStorageManager.C7036b) this.f38426f).m14162d(DescriptorUtilsKt.m14110g(lazyJavaClassDescriptorM13579f), new InterfaceC2041a<InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final InterfaceC8830c mo807E() {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = lazyJavaClassDescriptorM13579f;
                        lazyJavaClassDescriptor.getClass();
                        C7669f c7669f = lazyJavaClassDescriptor.f38719k;
                        C2064a c2064a = (C2064a) c7669f.f42146a;
                        c2064a.getClass();
                        C7669f c7669f2 = new C7669f(new C2064a(c2064a.f10495a, c2064a.f10496b, c2064a.f10497c, c2064a.f10498d, c2064a.f10499e, c2064a.f10500f, c2064a.f10502h, c2064a.f10503i, c2064a.f10504j, c2064a.f10505k, c2064a.f10506l, c2064a.f10507m, c2064a.f10508n, c2064a.f10509o, c2064a.f10510p, c2064a.f10511q, c2064a.f10512r, c2064a.f10513s, c2064a.f10514t, c2064a.f10515u, c2064a.f10516v, c2064a.f10517w), (InterfaceC2068e) c7669f.f42147b, (InterfaceC9070c) c7669f.f42148c);
                        InterfaceC8838g interfaceC8838gMo11876g = lazyJavaClassDescriptor.mo11876g();
                        C5207g.m11110e(interfaceC8838gMo11876g, "containingDeclaration");
                        return new LazyJavaClassDescriptor(c7669f2, interfaceC8838gMo11876g, lazyJavaClassDescriptor.f38717i, interfaceC8830c);
                    }
                })).mo13688N0();
                C5207g.m11110e(memberScopeMo13688N0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                Collection<? extends InterfaceC6824e> collectionMo528n = interfaceC2052l.mo528n(memberScopeMo13688N0);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionMo528n) {
                    InterfaceC6824e interfaceC6824e2 = (InterfaceC6824e) obj2;
                    if (interfaceC6824e2.mo11897u() == CallableMemberDescriptor.Kind.DECLARATION && interfaceC6824e2.mo11886f().mo17094a().f46765b && !AbstractC6795c.m13531D(interfaceC6824e2)) {
                        Collection<? extends CallableMemberDescriptor> collectionMo11893p = interfaceC6824e2.mo11893p();
                        C5207g.m11110e(collectionMo11893p, "analogueMember.overriddenDescriptors");
                        if (collectionMo11893p.isEmpty()) {
                            z11 = false;
                            break;
                        }
                        Iterator<T> it4 = collectionMo11893p.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z11 = false;
                                break;
                            }
                            InterfaceC8838g interfaceC8838gMo11876g = ((InterfaceC6822c) it4.next()).mo11876g();
                            C5207g.m11110e(interfaceC8838gMo11876g, "it.containingDeclaration");
                            if (c6532d.contains(DescriptorUtilsKt.m14110g(interfaceC8838gMo11876g))) {
                                z11 = true;
                                break;
                            }
                        }
                        if (z11) {
                            z10 = false;
                        } else {
                            InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC6824e2.mo11876g();
                            C5207g.m11109d(interfaceC8838gMo11876g2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (C8650g.f46222d.contains(C0062b.m344e2((InterfaceC8830c) interfaceC8838gMo11876g2, C7499b.m14957p(interfaceC6824e2, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolM13112d = C6530b.m13112d(C9000b.m17251q(interfaceC6824e2), C8584v.f46022c, new InterfaceC2052l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Boolean mo528n(CallableMemberDescriptor callableMemberDescriptor) {
                                        boolean z13;
                                        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                                        if (callableMemberDescriptor2.mo11897u() == CallableMemberDescriptor.Kind.DECLARATION) {
                                            C8573r0 c8573r1 = this.f38435b.f38422b;
                                            InterfaceC8838g interfaceC8838gMo11876g3 = callableMemberDescriptor2.mo11876g();
                                            C5207g.m11109d(interfaceC8838gMo11876g3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                            c8573r1.getClass();
                                            String str3 = C8646c.f46201a;
                                            if (C8646c.f46210j.containsKey(C8413d.m16448g((InterfaceC8830c) interfaceC8838gMo11876g3))) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        } else {
                                            z13 = false;
                                        }
                                        return Boolean.valueOf(z13);
                                    }
                                });
                                C5207g.m11110e(boolM13112d, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                zBooleanValue = boolM13112d.booleanValue();
                            }
                            if (zBooleanValue) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList2.add(obj2);
                    }
                }
                iterable = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC6824e interfaceC6824e3 : iterable) {
            InterfaceC8838g interfaceC8838gMo11876g3 = interfaceC6824e3.mo11876g();
            C5207g.m11109d(interfaceC8838gMo11876g3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC6822c interfaceC6822cMo5312d = interfaceC6824e3.mo5312d(TypeSubstitutor.m14199e(C7499b.m14971w((InterfaceC8830c) interfaceC8838gMo11876g3, deserializedClassDescriptor)));
            C5207g.m11109d(interfaceC6822cMo5312d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC6822c.a<? extends InterfaceC6822c> aVarMo11848M1 = ((InterfaceC6824e) interfaceC6822cMo5312d).mo11848M0();
            aVarMo11848M1.mo11856f(deserializedClassDescriptor);
            aVarMo11848M1.mo11868r(deserializedClassDescriptor.mo17092U0());
            aVarMo11848M1.mo11858h();
            InterfaceC8838g interfaceC8838gMo11876g4 = interfaceC6824e3.mo11876g();
            C5207g.m11109d(interfaceC8838gMo11876g4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objM13110b = C6530b.m13110b(C9000b.m17251q((InterfaceC8830c) interfaceC8838gMo11876g4), new C8648e(this), new C6806b(C7499b.m14957p(interfaceC6824e3, 3), new Ref$ObjectRef()));
            C5207g.m11110e(objM13110b, "private fun FunctionDesc…ERED\n            })\n    }");
            int i11 = C6802a.f38428a[((JDKMemberStatus) objM13110b).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    aVarMo11848M1.mo11867q((InterfaceC9077e) C0062b.m366l1(this.f38427g, interfaceC6727jArr[2]));
                } else if (i11 == 3) {
                    interfaceC6824e = null;
                }
                InterfaceC6822c interfaceC6822cMo11851a2 = aVarMo11848M1.mo11851a();
                C5207g.m11108c(interfaceC6822cMo11851a2);
                interfaceC6824e = (InterfaceC6824e) interfaceC6822cMo11851a2;
            } else if (deserializedClassDescriptor.mo11891l() == Modality.FINAL && deserializedClassDescriptor.mo13602u() != ClassKind.ENUM_CLASS) {
                interfaceC6824e = null;
            } else {
                aVarMo11848M1.mo11859i();
                InterfaceC6822c interfaceC6822cMo11851a3 = aVarMo11848M1.mo11851a();
                C5207g.m11108c(interfaceC6822cMo11851a3);
                interfaceC6824e = (InterfaceC6824e) interfaceC6822cMo11851a3;
            }
            if (interfaceC6824e != null) {
                arrayList3.add(interfaceC6824e);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final LazyJavaClassDescriptor m13579f(InterfaceC8830c interfaceC8830c) {
        C7646c c7646cM15204b;
        if (interfaceC8830c == null) {
            AbstractC6795c.m13540a(108);
            throw null;
        }
        C7648e c7648e = AbstractC6795c.f38322e;
        if (AbstractC6795c.m13542c(interfaceC8830c, C6797e.a.f38375a) || !AbstractC6795c.m13539L(interfaceC8830c)) {
            return null;
        }
        C7647d c7647dM14111h = DescriptorUtilsKt.m14111h(interfaceC8830c);
        if (!c7647dM14111h.m15226e()) {
            return null;
        }
        String str = C8646c.f46201a;
        C7645b c7645bM16869g = C8646c.m16869g(c7647dM14111h);
        if (c7645bM16869g == null || (c7646cM15204b = c7645bM16869g.m15204b()) == null) {
            return null;
        }
        InterfaceC8830c interfaceC8830cM11016o1 = C5206f.m11016o1(m13580g().f38412a, c7646cM15204b, NoLookupLocation.FROM_BUILTINS);
        if (interfaceC8830cM11016o1 instanceof LazyJavaClassDescriptor) {
            return (LazyJavaClassDescriptor) interfaceC8830cM11016o1;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final JvmBuiltIns.C6799a m13580g() {
        return (JvmBuiltIns.C6799a) C0062b.m366l1(this.f38423c, f38420h[0]);
    }
}
