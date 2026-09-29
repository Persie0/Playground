package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ae.C0062b;
import bo.C1630h;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2071c;
import co.InterfaceC2072d;
import co.InterfaceC2073e;
import co.InterfaceC2074f;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import km.InterfaceC6727j;
import kn.InterfaceC6733c;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mn.C7645b;
import mn.C7648e;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8845j0;
import p385sf.C9000b;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import p541zn.C10544h;
import pn.C8415f;
import sl.C9072e;
import tl.C9325m;
import tl.C9326n;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedMemberScope extends AbstractC9984g {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f39795f = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b */
    public final C8578t f39796b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7033a f39797c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e f39798d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2074f f39799e;

    public final class OptimizedImplementation implements InterfaceC7033a {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f39800j = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f39801a;

        /* JADX INFO: renamed from: b */
        public final LinkedHashMap f39802b;

        /* JADX INFO: renamed from: c */
        public final Map<C7648e, byte[]> f39803c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2071c<C7648e, Collection<InterfaceC6824e>> f39804d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC2071c<C7648e, Collection<InterfaceC8829b0>> f39805e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC2072d<C7648e, InterfaceC8845j0> f39806f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC2073e f39807g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2073e f39808h;

        public OptimizedImplementation(List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C7648e c7648eM14910J = C7499b.m14910J((InterfaceC6733c) DeserializedMemberScope.this.f39796b.f46000b, ((ProtoBuf$Function) ((InterfaceC6997h) obj)).f39127f);
                Object arrayList = linkedHashMap.get(c7648eM14910J);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c7648eM14910J, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f39801a = m14149h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                C7648e c7648eM14910J2 = C7499b.m14910J((InterfaceC6733c) deserializedMemberScope.f39796b.f46000b, ((ProtoBuf$Property) ((InterfaceC6997h) obj2)).f39195f);
                Object arrayList2 = linkedHashMap2.get(c7648eM14910J2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(c7648eM14910J2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f39802b = m14149h(linkedHashMap2);
            ((C10544h) DeserializedMemberScope.this.f39796b.f45999a).f52581c.mo19521f();
            DeserializedMemberScope deserializedMemberScope2 = DeserializedMemberScope.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                C7648e c7648eM14910J3 = C7499b.m14910J((InterfaceC6733c) deserializedMemberScope2.f39796b.f46000b, ((ProtoBuf$TypeAlias) ((InterfaceC6997h) obj3)).f39302e);
                Object arrayList3 = linkedHashMap3.get(c7648eM14910J3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(c7648eM14910J3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.f39803c = m14149h(linkedHashMap3);
            this.f39804d = DeserializedMemberScope.this.f39796b.m16778c().mo6221f(new InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functions$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e) {
                    Collection collectionM17255u;
                    C7648e c7648e2 = c7648e;
                    C5207g.m11111f(c7648e2, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f39815b;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.f39801a;
                    ProtoBuf$Function.C6930a c6930a = ProtoBuf$Function.f39114Q;
                    C5207g.m11110e(c6930a, "PARSER");
                    byte[] bArr = (byte[]) linkedHashMap4.get(c7648e2);
                    DeserializedMemberScope deserializedMemberScope3 = DeserializedMemberScope.this;
                    if (bArr == null || (collectionM17255u = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new C7031xb5e458c1(c6930a, new ByteArrayInputStream(bArr), deserializedMemberScope3))))) == null) {
                        collectionM17255u = EmptyList.f38032a;
                    }
                    ArrayList arrayList4 = new ArrayList(collectionM17255u.size());
                    Iterator it = collectionM17255u.iterator();
                    while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                deserializedMemberScope3.mo14142j(c7648e2, arrayList4);
                                return C0062b.m397t0(arrayList4);
                            }
                            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) it.next();
                            MemberDeserializer memberDeserializer = (MemberDeserializer) deserializedMemberScope3.f39796b.f46007i;
                            C5207g.m11110e(protoBuf$Function, "it");
                            C1630h c1630hM14128e = memberDeserializer.m14128e(protoBuf$Function);
                            if (!deserializedMemberScope3.mo14144r(c1630hM14128e)) {
                                c1630hM14128e = null;
                            }
                            if (c1630hM14128e != null) {
                                arrayList4.add(c1630hM14128e);
                            }
                        }
                    }
                }
            });
            this.f39805e = DeserializedMemberScope.this.f39796b.m16778c().mo6221f(new InterfaceC2052l<C7648e, Collection<? extends InterfaceC8829b0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$properties$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Collection<? extends InterfaceC8829b0> mo528n(C7648e c7648e) {
                    Collection<ProtoBuf$Property> collectionM17255u;
                    C7648e c7648e2 = c7648e;
                    C5207g.m11111f(c7648e2, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f39816b;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.f39802b;
                    ProtoBuf$Property.C6938a c6938a = ProtoBuf$Property.f39182Q;
                    C5207g.m11110e(c6938a, "PARSER");
                    byte[] bArr = (byte[]) linkedHashMap4.get(c7648e2);
                    DeserializedMemberScope deserializedMemberScope3 = DeserializedMemberScope.this;
                    if (bArr == null || (collectionM17255u = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14251L2(new C7031xb5e458c1(c6938a, new ByteArrayInputStream(bArr), deserializedMemberScope3))))) == null) {
                        collectionM17255u = EmptyList.f38032a;
                    }
                    ArrayList arrayList4 = new ArrayList(collectionM17255u.size());
                    for (ProtoBuf$Property protoBuf$Property : collectionM17255u) {
                        MemberDeserializer memberDeserializer = (MemberDeserializer) deserializedMemberScope3.f39796b.f46007i;
                        C5207g.m11110e(protoBuf$Property, "it");
                        arrayList4.add(memberDeserializer.m14129f(protoBuf$Property));
                    }
                    deserializedMemberScope3.mo14143k(c7648e2, arrayList4);
                    return C0062b.m397t0(arrayList4);
                }
            });
            this.f39806f = DeserializedMemberScope.this.f39796b.m16778c().mo6222g(new InterfaceC2052l<C7648e, InterfaceC8845j0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC8845j0 mo528n(C7648e c7648e) {
                    C7648e c7648e2 = c7648e;
                    C5207g.m11111f(c7648e2, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f39817b;
                    byte[] bArr = optimizedImplementation.f39803c.get(c7648e2);
                    if (bArr != null) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        DeserializedMemberScope deserializedMemberScope3 = DeserializedMemberScope.this;
                        ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) ProtoBuf$TypeAlias.f39296K.m13938c(byteArrayInputStream, ((C10544h) deserializedMemberScope3.f39796b.f45999a).f52594p);
                        if (protoBuf$TypeAlias != null) {
                            return ((MemberDeserializer) deserializedMemberScope3.f39796b.f46007i).m14130g(protoBuf$TypeAlias);
                        }
                    }
                    return null;
                }
            });
            InterfaceC2076h interfaceC2076hM16778c = DeserializedMemberScope.this.f39796b.m16778c();
            final DeserializedMemberScope deserializedMemberScope3 = DeserializedMemberScope.this;
            this.f39807g = interfaceC2076hM16778c.mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Set<? extends C7648e> mo807E() {
                    return C9338z.m17691N0(this.f39813b.f39801a.keySet(), deserializedMemberScope3.mo5308o());
                }
            });
            InterfaceC2076h interfaceC2076hM16778c2 = DeserializedMemberScope.this.f39796b.m16778c();
            final DeserializedMemberScope deserializedMemberScope4 = DeserializedMemberScope.this;
            this.f39808h = interfaceC2076hM16778c2.mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Set<? extends C7648e> mo807E() {
                    return C9338z.m17691N0(this.f39818b.f39802b.keySet(), deserializedMemberScope4.mo5309p());
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public static LinkedHashMap m14149h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C7499b.m14941g0(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractC6990a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
                for (AbstractC6990a abstractC6990a : iterable) {
                    int iMo13782d = abstractC6990a.mo13782d();
                    int iM13898f = CodedOutputStream.m13898f(iMo13782d) + iMo13782d;
                    if (iM13898f > 4096) {
                        iM13898f = 4096;
                    }
                    CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(byteArrayOutputStream, iM13898f);
                    codedOutputStreamM13901j.m13914v(iMo13782d);
                    abstractC6990a.mo13784j(codedOutputStreamM13901j);
                    codedOutputStreamM13901j.m13902i();
                    arrayList.add(C9072e.f47360a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: a */
        public final Set<C7648e> mo14150a() {
            return (Set) C0062b.m366l1(this.f39807g, f39800j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: b */
        public final Collection mo14151b(C7648e c7648e, NoLookupLocation noLookupLocation) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(noLookupLocation, "location");
            return !mo14150a().contains(c7648e) ? EmptyList.f38032a : (Collection) ((LockBasedStorageManager.C7045k) this.f39804d).mo528n(c7648e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: c */
        public final Collection mo14152c(C7648e c7648e, NoLookupLocation noLookupLocation) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(noLookupLocation, "location");
            return !mo14153d().contains(c7648e) ? EmptyList.f38032a : (Collection) ((LockBasedStorageManager.C7045k) this.f39805e).mo528n(c7648e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: d */
        public final Set<C7648e> mo14153d() {
            return (Set) C0062b.m366l1(this.f39808h, f39800j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: e */
        public final Set<C7648e> mo14154e() {
            return this.f39803c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: f */
        public final InterfaceC8845j0 mo14155f(C7648e c7648e) {
            C5207g.m11111f(c7648e, "name");
            return this.f39806f.mo528n(c7648e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC7033a
        /* JADX INFO: renamed from: g */
        public final void mo14156g(ArrayList arrayList, C9981d c9981d, InterfaceC2052l interfaceC2052l, NoLookupLocation noLookupLocation) {
            C5207g.m11111f(c9981d, "kindFilter");
            C5207g.m11111f(interfaceC2052l, "nameFilter");
            C5207g.m11111f(noLookupLocation, "location");
            boolean zM18557a = c9981d.m18557a(C9981d.f50718j);
            C8415f c8415f = C8415f.f45540a;
            if (zM18557a) {
                Set<C7648e> setMo14153d = mo14153d();
                ArrayList arrayList2 = new ArrayList();
                Iterator<C7648e> it = setMo14153d.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        C7648e next = it.next();
                        if (((Boolean) interfaceC2052l.mo528n(next)).booleanValue()) {
                            arrayList2.addAll(mo14152c(next, noLookupLocation));
                        }
                    }
                }
                C9326n.m17682B(arrayList2, c8415f);
                arrayList.addAll(arrayList2);
            }
            if (c9981d.m18557a(C9981d.f50717i)) {
                Set<C7648e> setMo14150a = mo14150a();
                ArrayList arrayList3 = new ArrayList();
                for (C7648e c7648e : setMo14150a) {
                    if (((Boolean) interfaceC2052l.mo528n(c7648e)).booleanValue()) {
                        arrayList3.addAll(mo14151b(c7648e, noLookupLocation));
                    }
                }
                C9326n.m17682B(arrayList3, c8415f);
                arrayList.addAll(arrayList3);
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$a */
    public interface InterfaceC7033a {
        /* JADX INFO: renamed from: a */
        Set<C7648e> mo14150a();

        /* JADX INFO: renamed from: b */
        Collection mo14151b(C7648e c7648e, NoLookupLocation noLookupLocation);

        /* JADX INFO: renamed from: c */
        Collection mo14152c(C7648e c7648e, NoLookupLocation noLookupLocation);

        /* JADX INFO: renamed from: d */
        Set<C7648e> mo14153d();

        /* JADX INFO: renamed from: e */
        Set<C7648e> mo14154e();

        /* JADX INFO: renamed from: f */
        InterfaceC8845j0 mo14155f(C7648e c7648e);

        /* JADX INFO: renamed from: g */
        void mo14156g(ArrayList arrayList, C9981d c9981d, InterfaceC2052l interfaceC2052l, NoLookupLocation noLookupLocation);
    }

    public DeserializedMemberScope(C8578t c8578t, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3, final InterfaceC2041a<? extends Collection<C7648e>> interfaceC2041a) {
        C5207g.m11111f(c8578t, "c");
        C5207g.m11111f(interfaceC2041a, "classNames");
        this.f39796b = c8578t;
        ((C10544h) c8578t.f45999a).f52581c.mo19516a();
        this.f39797c = new OptimizedImplementation(list, list2, list3);
        this.f39798d = c8578t.m16778c().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                return C6752c.m13457y0(interfaceC2041a.mo807E());
            }
        });
        this.f39799e = c8578t.m16778c().mo6219d(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classifierNamesLazy$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends C7648e> mo807E() {
                DeserializedMemberScope deserializedMemberScope = this.f39821b;
                Set<C7648e> setMo5307n = deserializedMemberScope.mo5307n();
                if (setMo5307n == null) {
                    return null;
                }
                return C9338z.m17691N0(C9338z.m17691N0(deserializedMemberScope.m14148m(), deserializedMemberScope.f39797c.mo14154e()), setMo5307n);
            }
        });
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        return this.f39797c.mo14150a();
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return this.f39797c.mo14151b(c7648e, noLookupLocation);
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return this.f39797c.mo14152c(c7648e, noLookupLocation);
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        return this.f39797c.mo14153d();
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        InterfaceC6727j<Object> interfaceC6727j = f39795f[1];
        InterfaceC2074f interfaceC2074f = this.f39799e;
        C5207g.m11111f(interfaceC2074f, "<this>");
        C5207g.m11111f(interfaceC6727j, "p");
        return (Set) interfaceC2074f.mo807E();
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        if (mo5310q(c7648e)) {
            return ((C10544h) this.f39796b.f45999a).m19515b(mo5306l(c7648e));
        }
        InterfaceC7033a interfaceC7033a = this.f39797c;
        if (interfaceC7033a.mo14154e().contains(c7648e)) {
            return interfaceC7033a.mo14155f(c7648e);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo5305h(ArrayList arrayList, InterfaceC2052l interfaceC2052l);

    /* JADX INFO: renamed from: i */
    public final List m14147i(C9981d c9981d, InterfaceC2052l interfaceC2052l, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        C5207g.m11111f(noLookupLocation, "location");
        ArrayList arrayList = new ArrayList(0);
        if (c9981d.m18557a(C9981d.f50714f)) {
            mo5305h(arrayList, interfaceC2052l);
        }
        InterfaceC7033a interfaceC7033a = this.f39797c;
        interfaceC7033a.mo14156g(arrayList, c9981d, interfaceC2052l, noLookupLocation);
        if (c9981d.m18557a(C9981d.f50720l)) {
            Iterator<C7648e> it = m14148m().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C7648e next = it.next();
                    if (((Boolean) interfaceC2052l.mo528n(next)).booleanValue()) {
                        C0062b.m282K(((C10544h) this.f39796b.f45999a).m19515b(mo5306l(next)), arrayList);
                    }
                }
            }
        }
        if (c9981d.m18557a(C9981d.f50715g)) {
            Iterator<C7648e> it2 = interfaceC7033a.mo14154e().iterator();
            loop2: while (true) {
                while (true) {
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                    C7648e next2 = it2.next();
                    if (((Boolean) interfaceC2052l.mo528n(next2)).booleanValue()) {
                        C0062b.m282K(interfaceC7033a.mo14155f(next2), arrayList);
                    }
                }
            }
        }
        return C0062b.m397t0(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public void mo14142j(C7648e c7648e, ArrayList arrayList) {
        C5207g.m11111f(c7648e, "name");
    }

    /* JADX INFO: renamed from: k */
    public void mo14143k(C7648e c7648e, ArrayList arrayList) {
        C5207g.m11111f(c7648e, "name");
    }

    /* JADX INFO: renamed from: l */
    public abstract C7645b mo5306l(C7648e c7648e);

    /* JADX INFO: renamed from: m */
    public final Set<C7648e> m14148m() {
        return (Set) C0062b.m366l1(this.f39798d, f39795f[0]);
    }

    /* JADX INFO: renamed from: n */
    public abstract Set<C7648e> mo5307n();

    /* JADX INFO: renamed from: o */
    public abstract Set<C7648e> mo5308o();

    /* JADX INFO: renamed from: p */
    public abstract Set<C7648e> mo5309p();

    /* JADX INFO: renamed from: q */
    public boolean mo5310q(C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        return m14148m().contains(c7648e);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo14144r(C1630h c1630h) {
        return true;
    }
}
