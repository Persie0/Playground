package kotlin.reflect.jvm.internal;

import ae.C0062b;
import bo.C1628f;
import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5209i;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import km.InterfaceC6727j;
import kn.C6735e;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6898a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import p006a5.C0020c;
import p247lm.C7396i;
import p247lm.C7398k;
import p248ln.C7404e;
import p248ln.C7405f;
import p248ln.C7407h;
import p260m8.C7499b;
import p372rm.InterfaceC8829b0;
import p385sf.C9000b;
import p420um.C9583p;
import p421un.C9595b;
import p465wm.C9973c;
import p465wm.C9974d;
import p465wm.C9976f;
import p466wn.C9979b;
import tl.C9322j;

/* JADX INFO: loaded from: classes2.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: b */
    public final Class<?> f38218b;

    /* JADX INFO: renamed from: c */
    public final C7396i.b<Data> f38219c;

    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f38220g = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "metadata", "getMetadata()Lkotlin/Triple;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: c */
        public final C7396i.a f38221c;

        /* JADX INFO: renamed from: d */
        public final C7396i.a f38222d;

        /* JADX INFO: renamed from: e */
        public final C7396i.b f38223e;

        /* JADX INFO: renamed from: f */
        public final C7396i.b f38224f;

        public Data(final KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            this.f38221c = C7396i.m14785c(new InterfaceC2041a<C9973c>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9973c mo807E() {
                    return C9973c.a.m18552a(kPackageImpl.f38218b);
                }
            });
            this.f38222d = C7396i.m14785c(new InterfaceC2041a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$scope$2
                {
                    super(0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final MemberScope mo807E() {
                    ?? M17251q;
                    KPackageImpl.Data data = this.f38231b;
                    C9973c c9973cM13510a = KPackageImpl.Data.m13510a(data);
                    if (c9973cM13510a == null) {
                        return MemberScope.C7015a.f39670b;
                    }
                    InterfaceC6727j<Object> interfaceC6727j = KDeclarationContainerImpl.Data.f38197b[0];
                    Object objMo807E = data.f38198a.mo807E();
                    C5207g.m11110e(objMo807E, "<get-moduleData>(...)");
                    C0020c c0020c = ((C9976f) objMo807E).f50703b;
                    c0020c.getClass();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0020c.f15c;
                    C7645b c7645bMo13002j = c9973cM13510a.mo13002j();
                    Object objM18555a = concurrentHashMap.get(c7645bMo13002j);
                    if (objM18555a == null) {
                        C7646c c7646cM15208h = c9973cM13510a.mo13002j().m15208h();
                        C5207g.m11110e(c7646cM15208h, "fileClass.classId.packageFqName");
                        KotlinClassHeader kotlinClassHeader = c9973cM13510a.f50698b;
                        KotlinClassHeader.Kind kind = kotlinClassHeader.f38908a;
                        KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
                        if (kind == kind2) {
                            boolean z10 = kind == kind2;
                            List listM17670X = null;
                            String[] strArr = z10 ? kotlinClassHeader.f38910c : null;
                            if (strArr != null) {
                                listM17670X = C9322j.m17670X(strArr);
                            }
                            if (listM17670X == null) {
                                listM17670X = EmptyList.f38032a;
                            }
                            M17251q = new ArrayList();
                            Iterator it = listM17670X.iterator();
                            loop0: while (true) {
                                while (true) {
                                    if (!it.hasNext()) {
                                        break loop0;
                                    }
                                    InterfaceC6367k interfaceC6367kM301Q0 = C0062b.m301Q0((C9974d) c0020c.f14b, C7645b.m15203l(new C7646c(C9595b.m18066d((String) it.next()).f49262a.replace('/', '.'))));
                                    if (interfaceC6367kM301Q0 != null) {
                                        M17251q.add(interfaceC6367kM301Q0);
                                    }
                                }
                            }
                        } else {
                            M17251q = C9000b.m17251q(c9973cM13510a);
                        }
                        C6898a c6898a = (C6898a) c0020c.f13a;
                        C9583p c9583p = new C9583p(c6898a.m13769c().f52580b, c7646cM15208h);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = M17251q.iterator();
                        loop2: while (true) {
                            while (true) {
                                if (!it2.hasNext()) {
                                    break loop2;
                                }
                                C1628f c1628fM13767a = c6898a.m13767a(c9583p, (InterfaceC6367k) it2.next());
                                if (c1628fM13767a != null) {
                                    arrayList.add(c1628fM13767a);
                                }
                            }
                        }
                        objM18555a = C9979b.a.m18555a("package " + c7646cM15208h + " (" + c9973cM13510a + ')', C6752c.m13453u0(arrayList));
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c7645bMo13002j, objM18555a);
                        if (objPutIfAbsent != null) {
                            objM18555a = objPutIfAbsent;
                        }
                    }
                    C5207g.m11110e(objM18555a, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                    return (MemberScope) objM18555a;
                }
            });
            this.f38223e = new C7396i.b(new InterfaceC2041a<Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Class<?> mo807E() throws ClassNotFoundException {
                    String str;
                    KotlinClassHeader kotlinClassHeader;
                    C9973c c9973cM13510a = KPackageImpl.Data.m13510a(this.f38229b);
                    boolean z10 = true;
                    Class<?> clsLoadClass = null;
                    if (c9973cM13510a == null || (kotlinClassHeader = c9973cM13510a.f50698b) == null) {
                        str = null;
                    } else {
                        if (kotlinClassHeader.f38908a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                            str = kotlinClassHeader.f38913f;
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        if (str.length() <= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            clsLoadClass = kPackageImpl.f38218b.getClassLoader().loadClass(C7661i.m15253S2(str, '/', '.'));
                        }
                    }
                    return clsLoadClass;
                }
            });
            this.f38224f = new C7396i.b(new InterfaceC2041a<Triple<? extends C7405f, ? extends ProtoBuf$Package, ? extends C7404e>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Triple<? extends C7405f, ? extends ProtoBuf$Package, ? extends C7404e> mo807E() throws InvalidProtocolBufferException {
                    KotlinClassHeader kotlinClassHeader;
                    String[] strArr;
                    String[] strArr2;
                    C9973c c9973cM13510a = KPackageImpl.Data.m13510a(this.f38228b);
                    if (c9973cM13510a == null || (kotlinClassHeader = c9973cM13510a.f50698b) == null || (strArr = kotlinClassHeader.f38910c) == null || (strArr2 = kotlinClassHeader.f38912e) == null) {
                        return null;
                    }
                    Pair<C7405f, ProtoBuf$Package> pairM14814h = C7407h.m14814h(strArr, strArr2);
                    return new Triple<>(pairM14814h.f38012a, pairM14814h.f38013b, kotlinClassHeader.f38909b);
                }
            });
            C7396i.m14785c(new InterfaceC2041a<Collection<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KPackageImpl.Data f38227c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38227c = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends KCallableImpl<?>> mo807E() {
                    KPackageImpl.Data data = this.f38227c;
                    data.getClass();
                    InterfaceC6727j<Object> interfaceC6727j = KPackageImpl.Data.f38220g[1];
                    Object objMo807E = data.f38222d.mo807E();
                    C5207g.m11110e(objMo807E, "<get-scope>(...)");
                    KDeclarationContainerImpl.MemberBelonginess memberBelonginess = KDeclarationContainerImpl.MemberBelonginess.DECLARED;
                    return kPackageImpl.m13503g((MemberScope) objMo807E, memberBelonginess);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public static final C9973c m13510a(Data data) {
            data.getClass();
            InterfaceC6727j<Object> interfaceC6727j = f38220g[0];
            return (C9973c) data.f38221c.mo807E();
        }
    }

    public KPackageImpl(Class cls) {
        C5207g.m11111f(cls, "jClass");
        this.f38218b = cls;
        this.f38219c = new C7396i.b<>(new InterfaceC2041a<Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final KPackageImpl.Data mo807E() {
                return new KPackageImpl.Data(this.f38232b);
            }
        });
    }

    @Override // dm.InterfaceC5202b
    /* JADX INFO: renamed from: b */
    public final Class<?> mo10973b() {
        return this.f38218b;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: d */
    public final Collection<InterfaceC6821b> mo13491d() {
        return EmptyList.f38032a;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC6822c> mo13492e(C7648e c7648e) {
        Data dataM14786E = this.f38219c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38220g[1];
        Object objMo807E = dataM14786E.f38222d.mo807E();
        C5207g.m11110e(objMo807E, "<get-scope>(...)");
        return ((MemberScope) objMo807E).mo11904b(c7648e, NoLookupLocation.FROM_REFLECTION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KPackageImpl) {
            if (C5207g.m11106a(this.f38218b, ((KPackageImpl) obj).f38218b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: f */
    public final InterfaceC8829b0 mo13493f(int i10) {
        Data dataM14786E = this.f38219c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38220g[3];
        Triple triple = (Triple) dataM14786E.f38224f.m14786E();
        if (triple != null) {
            C7405f c7405f = (C7405f) triple.f38021a;
            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) triple.f38022b;
            C7404e c7404e = (C7404e) triple.f38023c;
            GeneratedMessageLite.C6985e<ProtoBuf$Package, List<ProtoBuf$Property>> c6985e = JvmProtoBuf.f39411n;
            C5207g.m11110e(c6985e, "packageLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) C7499b.m14904G(protoBuf$Package, c6985e, i10);
            if (protoBuf$Property != null) {
                Class<?> cls = this.f38218b;
                ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Package.f39156g;
                C5207g.m11110e(protoBuf$TypeTable, "packageProto.typeTable");
                return (InterfaceC8829b0) C7398k.m14793d(cls, protoBuf$Property, c7405f, new C6735e(protoBuf$TypeTable), c7404e, KPackageImpl$getLocalProperty$1$1$1.f38233j);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: h */
    public final Class<?> mo13504h() {
        Data dataM14786E = this.f38219c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38220g[2];
        Class<?> cls = (Class) dataM14786E.f38223e.m14786E();
        if (cls == null) {
            cls = this.f38218b;
        }
        return cls;
    }

    public final int hashCode() {
        return this.f38218b.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: i */
    public final Collection<InterfaceC8829b0> mo13494i(C7648e c7648e) {
        Data dataM14786E = this.f38219c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38220g[1];
        Object objMo807E = dataM14786E.f38222d.mo807E();
        C5207g.m11110e(objMo807E, "<get-scope>(...)");
        return ((MemberScope) objMo807E).mo11905c(c7648e, NoLookupLocation.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.m13648a(this.f38218b).m15204b();
    }
}
