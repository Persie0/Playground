package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import bo.C1623a;
import bo.C1630h;
import bo.C1632j;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2072d;
import co.InterfaceC2073e;
import co.InterfaceC2074f;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kn.AbstractC6731a;
import kn.C6732b;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8858q;
import p372rm.C8864v;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8865w;
import p385sf.C9000b;
import p420um.AbstractC9557b;
import p420um.C9568g0;
import p420um.C9584q;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import p466wn.InterfaceC9985h;
import p492xn.C10253b;
import p516ym.InterfaceC10417b;
import p541zn.AbstractC10554r;
import p541zn.C10544h;
import p541zn.C10555s;
import p541zn.C10556t;
import p541zn.InterfaceC10548l;
import p543do.AbstractC5221b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.InterfaceC5240k0;
import pn.C8410a;
import pn.C8411b;
import pn.C8412c;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;
import tl.C9327o;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassDescriptor extends AbstractC9557b implements InterfaceC8838g {

    /* JADX INFO: renamed from: H */
    public final AbstractC9984g f39750H;

    /* JADX INFO: renamed from: I */
    public final DeserializedClassTypeConstructor f39751I;

    /* JADX INFO: renamed from: J */
    public final ScopesHolderForClass<DeserializedClassMemberScope> f39752J;

    /* JADX INFO: renamed from: K */
    public final EnumEntryClassDescriptors f39753K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC8838g f39754L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC2074f<InterfaceC8828b> f39755M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC2073e<Collection<InterfaceC8828b>> f39756N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC2074f<InterfaceC8830c> f39757O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC2073e<Collection<InterfaceC8830c>> f39758P;

    /* JADX INFO: renamed from: Q */
    public final InterfaceC2074f<AbstractC8849l0<AbstractC5265x>> f39759Q;

    /* JADX INFO: renamed from: R */
    public final AbstractC10554r.a f39760R;

    /* JADX INFO: renamed from: S */
    public final InterfaceC9077e f39761S;

    /* JADX INFO: renamed from: e */
    public final ProtoBuf$Class f39762e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6731a f39763f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8837f0 f39764g;

    /* JADX INFO: renamed from: h */
    public final C7645b f39765h;

    /* JADX INFO: renamed from: i */
    public final Modality f39766i;

    /* JADX INFO: renamed from: j */
    public final AbstractC8848l f39767j;

    /* JADX INFO: renamed from: k */
    public final ClassKind f39768k;

    /* JADX INFO: renamed from: l */
    public final C8578t f39769l;

    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: g */
        public final AbstractC5439d f39770g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2073e<Collection<InterfaceC8838g>> f39771h;

        /* JADX INFO: renamed from: i */
        public final InterfaceC2073e<Collection<AbstractC5257t>> f39772i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DeserializedClassDescriptor f39773j;

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, AbstractC5439d abstractC5439d) {
            C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
            this.f39773j = deserializedClassDescriptor;
            C8578t c8578t = deserializedClassDescriptor.f39769l;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f39762e;
            List<ProtoBuf$Function> list = protoBuf$Class.f38992L;
            C5207g.m11110e(list, "classProto.functionList");
            List<ProtoBuf$Property> list2 = protoBuf$Class.f38993M;
            C5207g.m11110e(list2, "classProto.propertyList");
            List<ProtoBuf$TypeAlias> list3 = protoBuf$Class.f38994N;
            C5207g.m11110e(list3, "classProto.typeAliasList");
            List<Integer> list4 = protoBuf$Class.f39020k;
            C5207g.m11110e(list4, "classProto.nestedClassNameList");
            InterfaceC6733c interfaceC6733c = (InterfaceC6733c) deserializedClassDescriptor.f39769l.f46000b;
            final ArrayList arrayList = new ArrayList(C9325m.m17681z(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(C7499b.m14910J(interfaceC6733c, ((Number) it.next()).intValue()));
            }
            super(c8578t, list, list2, list3, new InterfaceC2041a<List<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends C7648e> mo807E() {
                    return arrayList;
                }
            });
            this.f39770g = abstractC5439d;
            this.f39771h = this.f39796b.m16778c().mo6217b(new InterfaceC2041a<Collection<? extends InterfaceC8838g>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends InterfaceC8838g> mo807E() {
                    C9981d c9981d = C9981d.f50721m;
                    MemberScope.f39666a.getClass();
                    return this.f39775b.m14147i(c9981d, MemberScope.Companion.f39668b, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                }
            });
            this.f39772i = this.f39796b.m16778c().mo6217b(new InterfaceC2041a<Collection<? extends AbstractC5257t>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends AbstractC5257t> mo807E() {
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.f39776b;
                    return deserializedClassMemberScope.f39770g.mo11662n0(deserializedClassMemberScope.f39773j);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: b */
        public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(noLookupLocation, "location");
            m14146t(c7648e, noLookupLocation);
            return super.mo11904b(c7648e, noLookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: c */
        public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(noLookupLocation, "location");
            m14146t(c7648e, noLookupLocation);
            return super.mo11905c(c7648e, noLookupLocation);
        }

        @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
        /* JADX INFO: renamed from: e */
        public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
            C5207g.m11111f(c9981d, "kindFilter");
            C5207g.m11111f(interfaceC2052l, "nameFilter");
            return this.f39771h.mo807E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p466wn.AbstractC9984g, p466wn.InterfaceC9985h
        /* JADX INFO: renamed from: g */
        public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
            InterfaceC8830c interfaceC8830cMo528n;
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(noLookupLocation, "location");
            m14146t(c7648e, noLookupLocation);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.f39773j.f39753K;
            return (enumEntryClassDescriptors == null || (interfaceC8830cMo528n = enumEntryClassDescriptors.f39781b.mo528n(c7648e)) == null) ? super.mo5304g(c7648e, noLookupLocation) : interfaceC8830cMo528n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: h */
        public final void mo5305h(ArrayList arrayList, InterfaceC2052l interfaceC2052l) {
            ArrayList arrayList2;
            C5207g.m11111f(interfaceC2052l, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.f39773j.f39753K;
            if (enumEntryClassDescriptors != null) {
                Set<C7648e> setKeySet = enumEntryClassDescriptors.f39780a.keySet();
                arrayList2 = new ArrayList();
                for (C7648e c7648e : setKeySet) {
                    C5207g.m11111f(c7648e, "name");
                    InterfaceC8830c interfaceC8830cMo528n = enumEntryClassDescriptors.f39781b.mo528n(c7648e);
                    if (interfaceC8830cMo528n != null) {
                        arrayList2.add(interfaceC8830cMo528n);
                    }
                }
            } else {
                arrayList2 = null;
            }
            Object obj = arrayList2;
            if (arrayList2 == null) {
                obj = EmptyList.f38032a;
            }
            arrayList.addAll(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: j */
        public final void mo14142j(C7648e c7648e, ArrayList arrayList) {
            C5207g.m11111f(c7648e, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator<AbstractC5257t> it = this.f39772i.mo807E().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().mo11245q().mo11904b(c7648e, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            arrayList.addAll(((C10544h) this.f39796b.f45999a).f52592n.mo13578e(c7648e, this.f39773j));
            m14145s(c7648e, arrayList2, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: k */
        public final void mo14143k(C7648e c7648e, ArrayList arrayList) {
            C5207g.m11111f(c7648e, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator<AbstractC5257t> it = this.f39772i.mo807E().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().mo11245q().mo11905c(c7648e, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            m14145s(c7648e, arrayList2, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: l */
        public final C7645b mo5306l(C7648e c7648e) {
            C5207g.m11111f(c7648e, "name");
            return this.f39773j.f39765h.m15206d(c7648e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: n */
        public final Set<C7648e> mo5307n() {
            List<AbstractC5257t> listMo11278p = this.f39773j.f39751I.mo11278p();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo11278p.iterator();
            while (it.hasNext()) {
                Set<C7648e> setMo11907f = ((AbstractC5257t) it.next()).mo11245q().mo11907f();
                if (setMo11907f == null) {
                    return null;
                }
                C9327o.m17684D(setMo11907f, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: o */
        public final Set<C7648e> mo5308o() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.f39773j;
            List<AbstractC5257t> listMo11278p = deserializedClassDescriptor.f39751I.mo11278p();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo11278p.iterator();
            while (it.hasNext()) {
                C9327o.m17684D(((AbstractC5257t) it.next()).mo11245q().mo11903a(), linkedHashSet);
            }
            linkedHashSet.addAll(((C10544h) this.f39796b.f45999a).f52592n.mo13574a(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: p */
        public final Set<C7648e> mo5309p() {
            List<AbstractC5257t> listMo11278p = this.f39773j.f39751I.mo11278p();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo11278p.iterator();
            while (it.hasNext()) {
                C9327o.m17684D(((AbstractC5257t) it.next()).mo11245q().mo11906d(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: r */
        public final boolean mo14144r(C1630h c1630h) {
            return ((C10544h) this.f39796b.f45999a).f52593o.mo13575b(this.f39773j, c1630h);
        }

        /* JADX INFO: renamed from: s */
        public final void m14145s(C7648e c7648e, ArrayList arrayList, ArrayList arrayList2) {
            ((C10544h) this.f39796b.f45999a).f52595q.mo11665b().m14083h(c7648e, arrayList, new ArrayList(arrayList2), this.f39773j, new C7034a(arrayList2));
        }

        /* JADX INFO: renamed from: t */
        public final void m14146t(C7648e c7648e, InterfaceC10417b interfaceC10417b) {
            C5207g.m11111f(c7648e, "name");
            C5207g.m11111f(interfaceC10417b, "location");
            C7499b.m14956o0(((C10544h) this.f39796b.f45999a).f52587i, (NoLookupLocation) interfaceC10417b, this.f39773j, c7648e);
        }
    }

    public final class DeserializedClassTypeConstructor extends AbstractC5221b {

        /* JADX INFO: renamed from: c */
        public final InterfaceC2073e<List<InterfaceC8847k0>> f39777c;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.f39769l.m16778c());
            this.f39777c = DeserializedClassDescriptor.this.f39769l.m16778c().mo6217b(new InterfaceC2041a<List<? extends InterfaceC8847k0>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends InterfaceC8847k0> mo807E() {
                    return TypeParameterUtilsKt.m13612b(deserializedClassDescriptor);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: d */
        public final Collection<AbstractC5257t> mo11258d() {
            C7646c c7646cM15204b;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f39762e;
            C8578t c8578t = deserializedClassDescriptor.f39769l;
            C6735e c6735e = (C6735e) c8578t.f46002d;
            C5207g.m11111f(protoBuf$Class, "<this>");
            C5207g.m11111f(c6735e, "typeTable");
            List<ProtoBuf$Type> list = protoBuf$Class.f39017h;
            ?? arrayList = list.isEmpty() ^ true ? list : 0;
            if (arrayList == 0) {
                List<Integer> list2 = protoBuf$Class.f39018i;
                C5207g.m11110e(list2, "supertypeIdList");
                arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                for (Integer num : list2) {
                    C5207g.m11110e(num, "it");
                    arrayList.add(c6735e.m13355a(num.intValue()));
                }
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TypeDeserializer) c8578t.f46006h).m14139g((ProtoBuf$Type) it.next()));
            }
            ArrayList arrayListM13438f0 = C6752c.m13438f0(((C10544h) c8578t.f45999a).f52592n.mo13577d(deserializedClassDescriptor), arrayList2);
            ArrayList<NotFoundClasses.C6811b> arrayList3 = new ArrayList();
            Iterator it2 = arrayListM13438f0.iterator();
            while (it2.hasNext()) {
                InterfaceC8834e interfaceC8834eMo11235q = ((AbstractC5257t) it2.next()).mo11250X0().mo11235q();
                NotFoundClasses.C6811b c6811b = interfaceC8834eMo11235q instanceof NotFoundClasses.C6811b ? (NotFoundClasses.C6811b) interfaceC8834eMo11235q : null;
                if (c6811b != null) {
                    arrayList3.add(c6811b);
                }
            }
            if (!arrayList3.isEmpty()) {
                InterfaceC10548l interfaceC10548l = ((C10544h) c8578t.f45999a).f52586h;
                ArrayList arrayList4 = new ArrayList(C9325m.m17681z(arrayList3, 10));
                for (NotFoundClasses.C6811b c6811b2 : arrayList3) {
                    C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(c6811b2);
                    arrayList4.add((c7645bM14109f == null || (c7646cM15204b = c7645bM14109f.m15204b()) == null) ? c6811b2.mo11874a().m15235f() : c7646cM15204b.m15214b());
                }
                interfaceC10548l.mo16920b(deserializedClassDescriptor, arrayList4);
            }
            return C6752c.m13453u0(arrayListM13438f0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: g */
        public final InterfaceC8843i0 mo11259g() {
            return InterfaceC8843i0.a.f46732a;
        }

        @Override // p543do.AbstractC5221b
        /* JADX INFO: renamed from: l */
        public final InterfaceC8830c mo11235q() {
            return DeserializedClassDescriptor.this;
        }

        @Override // p543do.AbstractC5221b, p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: q */
        public final InterfaceC8834e mo11235q() {
            return DeserializedClassDescriptor.this;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: r */
        public final List<InterfaceC8847k0> mo11260r() {
            return this.f39777c.mo807E();
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: s */
        public final boolean mo11261s() {
            return true;
        }

        public final String toString() {
            String str = DeserializedClassDescriptor.this.mo11874a().f42086a;
            C5207g.m11110e(str, "name.toString()");
            return str;
        }
    }

    public final class EnumEntryClassDescriptors {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f39780a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2072d<C7648e, InterfaceC8830c> f39781b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2073e<Set<C7648e>> f39782c;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf$EnumEntry> list = DeserializedClassDescriptor.this.f39762e.f38995O;
            C5207g.m11110e(list, "classProto.enumEntryList");
            int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0 < 16 ? 16 : iM14941g0);
            for (Object obj : list) {
                linkedHashMap.put(C7499b.m14910J((InterfaceC6733c) DeserializedClassDescriptor.this.f39769l.f46000b, ((ProtoBuf$EnumEntry) obj).f39087d), obj);
            }
            this.f39780a = linkedHashMap;
            InterfaceC2076h interfaceC2076hM16778c = DeserializedClassDescriptor.this.f39769l.m16778c();
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.f39781b = interfaceC2076hM16778c.mo6222g(new InterfaceC2052l<C7648e, InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC8830c mo528n(C7648e c7648e) {
                    C7648e c7648e2 = c7648e;
                    C5207g.m11111f(c7648e2, "name");
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.f39784b;
                    final ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) enumEntryClassDescriptors.f39780a.get(c7648e2);
                    if (protoBuf$EnumEntry == null) {
                        return null;
                    }
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = deserializedClassDescriptor;
                    return C9584q.m18046V0(deserializedClassDescriptor2.f39769l.m16778c(), deserializedClassDescriptor2, c7648e2, enumEntryClassDescriptors.f39782c, new C1623a(deserializedClassDescriptor2.f39769l.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final List<? extends InterfaceC9075c> mo807E() {
                            DeserializedClassDescriptor deserializedClassDescriptor3 = deserializedClassDescriptor2;
                            return C6752c.m13453u0(((C10544h) deserializedClassDescriptor3.f39769l.f45999a).f52583e.mo13759h(deserializedClassDescriptor3.f39760R, protoBuf$EnumEntry));
                        }
                    }), InterfaceC8837f0.f46730a);
                }
            });
            this.f39782c = DeserializedClassDescriptor.this.f39769l.m16778c().mo6217b(new InterfaceC2041a<Set<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Set<? extends C7648e> mo807E() {
                    C8578t c8578t;
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.f39788b;
                    enumEntryClassDescriptors.getClass();
                    HashSet hashSet = new HashSet();
                    DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                    Iterator<AbstractC5257t> it = deserializedClassDescriptor2.f39751I.mo11278p().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = InterfaceC9985h.a.m18558a(it.next().mo11245q(), null, 3).iterator();
                        while (true) {
                            while (true) {
                                if (it2.hasNext()) {
                                    InterfaceC8838g interfaceC8838g = (InterfaceC8838g) it2.next();
                                    if (!(interfaceC8838g instanceof InterfaceC6824e) && !(interfaceC8838g instanceof InterfaceC8829b0)) {
                                    }
                                    hashSet.add(interfaceC8838g.mo11874a());
                                }
                            }
                        }
                    }
                    ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor2.f39762e;
                    List<ProtoBuf$Function> list2 = protoBuf$Class.f38992L;
                    C5207g.m11110e(list2, "classProto.functionList");
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        c8578t = deserializedClassDescriptor2.f39769l;
                        if (!zHasNext) {
                            break;
                        }
                        hashSet.add(C7499b.m14910J((InterfaceC6733c) c8578t.f46000b, ((ProtoBuf$Function) it3.next()).f39127f));
                    }
                    List<ProtoBuf$Property> list3 = protoBuf$Class.f38993M;
                    C5207g.m11110e(list3, "classProto.propertyList");
                    Iterator<T> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        hashSet.add(C7499b.m14910J((InterfaceC6733c) c8578t.f46000b, ((ProtoBuf$Property) it4.next()).f39195f));
                    }
                    return C9338z.m17691N0(hashSet, hashSet);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(C8578t c8578t, ProtoBuf$Class protoBuf$Class, InterfaceC6733c interfaceC6733c, AbstractC6731a abstractC6731a, InterfaceC8837f0 interfaceC8837f0) {
        ClassKind classKind;
        super(c8578t.m16778c(), C7499b.m14896C(interfaceC6733c, protoBuf$Class.f39014e).m15210j());
        C5207g.m11111f(c8578t, "outerContext");
        C5207g.m11111f(protoBuf$Class, "classProto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        C5207g.m11111f(interfaceC8837f0, "sourceElement");
        this.f39762e = protoBuf$Class;
        this.f39763f = abstractC6731a;
        this.f39764g = interfaceC8837f0;
        this.f39765h = C7499b.m14896C(interfaceC6733c, protoBuf$Class.f39014e);
        this.f39766i = C10555s.m19525a((ProtoBuf$Modality) C6732b.f37967e.m13348c(protoBuf$Class.f39012d));
        this.f39767j = C10556t.m19526a((ProtoBuf$Visibility) C6732b.f37966d.m13348c(protoBuf$Class.f39012d));
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) C6732b.f37968f.m13348c(protoBuf$Class.f39012d);
        switch (kind == null ? -1 : C10555s.a.f52622b[kind.ordinal()]) {
            case 1:
                classKind = ClassKind.CLASS;
                break;
            case 2:
                classKind = ClassKind.INTERFACE;
                break;
            case 3:
                classKind = ClassKind.ENUM_CLASS;
                break;
            case 4:
                classKind = ClassKind.ENUM_ENTRY;
                break;
            case 5:
                classKind = ClassKind.ANNOTATION_CLASS;
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                classKind = ClassKind.OBJECT;
                break;
            default:
                classKind = ClassKind.CLASS;
                break;
        }
        this.f39768k = classKind;
        List<ProtoBuf$TypeParameter> list = protoBuf$Class.f39016g;
        C5207g.m11110e(list, "classProto.typeParameterList");
        ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Class.f39006Z;
        C5207g.m11110e(protoBuf$TypeTable, "classProto.typeTable");
        C6735e c6735e = new C6735e(protoBuf$TypeTable);
        C6736f c6736f = C6736f.f37996b;
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Class.f39009b0;
        C5207g.m11110e(protoBuf$VersionRequirementTable, "classProto.versionRequirementTable");
        C8578t c8578tM16777a = c8578t.m16777a(this, list, interfaceC6733c, c6735e, C6736f.a.m13356a(protoBuf$VersionRequirementTable), abstractC6731a);
        this.f39769l = c8578tM16777a;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        this.f39750H = classKind == classKind2 ? new StaticScopeForKotlinEnum(c8578tM16777a.m16778c(), this) : MemberScope.C7015a.f39670b;
        this.f39751I = new DeserializedClassTypeConstructor();
        ScopesHolderForClass.C6812a c6812a = ScopesHolderForClass.f38463e;
        InterfaceC2076h interfaceC2076hM16778c = c8578tM16777a.m16778c();
        AbstractC5439d abstractC5439dMo11666c = ((C10544h) c8578tM16777a.f45999a).f52595q.mo11666c();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(this);
        c6812a.getClass();
        this.f39752J = ScopesHolderForClass.C6812a.m13610a(deserializedClassDescriptor$memberScopeHolder$1, this, interfaceC2076hM16778c, abstractC5439dMo11666c);
        AbstractC10554r.a aVar = null;
        this.f39753K = classKind == classKind2 ? new EnumEntryClassDescriptors() : null;
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        this.f39754L = interfaceC8838g;
        this.f39755M = c8578tM16777a.m16778c().mo6219d(new InterfaceC2041a<InterfaceC8828b>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC8828b mo807E() {
                Object next;
                DeserializedClassDescriptor deserializedClassDescriptor = this.f39792b;
                if (deserializedClassDescriptor.f39768k.isSingleton()) {
                    C8412c.a aVar2 = new C8412c.a(deserializedClassDescriptor);
                    aVar2.m13639d1(deserializedClassDescriptor.mo5316v());
                    return aVar2;
                }
                List<ProtoBuf$Constructor> list2 = deserializedClassDescriptor.f39762e.f38991K;
                C5207g.m11110e(list2, "classProto.constructorList");
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(!C6732b.f37975m.m13346c(((ProtoBuf$Constructor) next).f39051d).booleanValue()));
                ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) next;
                if (protoBuf$Constructor != null) {
                    return ((MemberDeserializer) deserializedClassDescriptor.f39769l.f46007i).m14127d(protoBuf$Constructor, true);
                }
                return null;
            }
        });
        this.f39756N = c8578tM16777a.m16778c().mo6217b(new InterfaceC2041a<Collection<? extends InterfaceC8828b>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends InterfaceC8828b> mo807E() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.f39791b;
                List<ProtoBuf$Constructor> list2 = deserializedClassDescriptor.f39762e.f38991K;
                C5207g.m11110e(list2, "classProto.constructorList");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list2.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (C0166e.m779z(C6732b.f37975m, ((ProtoBuf$Constructor) next).f39051d, "IS_SECONDARY.get(it.flags)")) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C8578t c8578t2 = deserializedClassDescriptor.f39769l;
                    if (!zHasNext) {
                        return C6752c.m13438f0(((C10544h) c8578t2.f45999a).f52592n.mo13576c(deserializedClassDescriptor), C6752c.m13438f0(C9000b.m17253s(deserializedClassDescriptor.mo13597Y()), arrayList2));
                    }
                    ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) it2.next();
                    MemberDeserializer memberDeserializer = (MemberDeserializer) c8578t2.f46007i;
                    C5207g.m11110e(protoBuf$Constructor, "it");
                    arrayList2.add(memberDeserializer.m14127d(protoBuf$Constructor, false));
                }
            }
        });
        this.f39757O = c8578tM16777a.m16778c().mo6219d(new InterfaceC2041a<InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC8830c mo807E() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.f39790b;
                ProtoBuf$Class protoBuf$Class2 = deserializedClassDescriptor.f39762e;
                if ((protoBuf$Class2.f39010c & 4) == 4) {
                    InterfaceC8834e interfaceC8834eMo5304g = deserializedClassDescriptor.m14141V0().mo5304g(C7499b.m14910J((InterfaceC6733c) deserializedClassDescriptor.f39769l.f46000b, protoBuf$Class2.f39015f), NoLookupLocation.FROM_DESERIALIZATION);
                    if (interfaceC8834eMo5304g instanceof InterfaceC8830c) {
                        return (InterfaceC8830c) interfaceC8834eMo5304g;
                    }
                }
                return null;
            }
        });
        this.f39758P = c8578tM16777a.m16778c().mo6217b(new InterfaceC2041a<Collection<? extends InterfaceC8830c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends InterfaceC8830c> mo807E() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.f39793b;
                deserializedClassDescriptor.getClass();
                Modality modality = Modality.SEALED;
                Modality modality2 = deserializedClassDescriptor.f39766i;
                if (modality2 != modality) {
                    return EmptyList.f38032a;
                }
                List<Integer> list2 = deserializedClassDescriptor.f39762e.f38996P;
                C5207g.m11110e(list2, "fqNames");
                if (!(!list2.isEmpty())) {
                    if (modality2 != modality) {
                        return EmptyList.f38032a;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    InterfaceC8838g interfaceC8838g2 = deserializedClassDescriptor.f39754L;
                    if (interfaceC8838g2 instanceof InterfaceC8865w) {
                        C8411b.m16431k0(deserializedClassDescriptor, linkedHashSet, ((InterfaceC8865w) interfaceC8838g2).mo13718q(), false);
                    }
                    MemberScope memberScopeMo13687H0 = deserializedClassDescriptor.mo13687H0();
                    C5207g.m11110e(memberScopeMo13687H0, "sealedClass.unsubstitutedInnerClassesScope");
                    C8411b.m16431k0(deserializedClassDescriptor, linkedHashSet, memberScopeMo13687H0, true);
                    return C6752c.m13447o0(linkedHashSet, new C8410a());
                }
                ArrayList arrayList = new ArrayList();
                while (true) {
                    for (Integer num : list2) {
                        C8578t c8578t2 = deserializedClassDescriptor.f39769l;
                        C10544h c10544h = (C10544h) c8578t2.f45999a;
                        InterfaceC6733c interfaceC6733c2 = (InterfaceC6733c) c8578t2.f46000b;
                        C5207g.m11110e(num, "index");
                        InterfaceC8830c interfaceC8830cM19515b = c10544h.m19515b(C7499b.m14896C(interfaceC6733c2, num.intValue()));
                        if (interfaceC8830cM19515b != null) {
                            arrayList.add(interfaceC8830cM19515b);
                        }
                    }
                    return arrayList;
                }
            }
        });
        this.f39759Q = c8578tM16777a.m16778c().mo6219d(new InterfaceC2041a<AbstractC8849l0<AbstractC5265x>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$valueClassRepresentation$1
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0058  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable, java.lang.Object] */
            /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC8849l0<AbstractC5265x> mo807E() {
                C7648e c7648eMo11874a;
                AbstractC5265x abstractC5265xM14138d;
                C8858q c8858q;
                ?? arrayList;
                DeserializedClassDescriptor deserializedClassDescriptor = this.f39794b;
                boolean zMo13603x = deserializedClassDescriptor.mo13603x();
                C8578t c8578t2 = deserializedClassDescriptor.f39769l;
                ProtoBuf$Class protoBuf$Class2 = deserializedClassDescriptor.f39762e;
                C8864v c8864v = null;
                if (zMo13603x || deserializedClassDescriptor.mo13594S()) {
                    if (deserializedClassDescriptor.mo13594S()) {
                        int i10 = protoBuf$Class2.f39010c;
                        if (!((i10 & 8) == 8)) {
                            if (!((i10 & 16) == 16)) {
                                if (!((i10 & 32) == 32) && protoBuf$Class2.f39001U.size() > 0) {
                                    c8858q = null;
                                }
                            }
                        }
                    }
                    if ((protoBuf$Class2.f39010c & 8) == 8) {
                        c7648eMo11874a = C7499b.m14910J((InterfaceC6733c) c8578t2.f46000b, protoBuf$Class2.f38998R);
                    } else {
                        if (deserializedClassDescriptor.f39763f.m13343a(1, 5, 1)) {
                            throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + deserializedClassDescriptor).toString());
                        }
                        InterfaceC8828b interfaceC8828bMo13597Y = deserializedClassDescriptor.mo13597Y();
                        if (interfaceC8828bMo13597Y == null) {
                            throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
                        }
                        List<InterfaceC8853n0> listMo11889i = interfaceC8828bMo13597Y.mo11889i();
                        C5207g.m11110e(listMo11889i, "constructor.valueParameters");
                        c7648eMo11874a = ((InterfaceC8853n0) C6752c.m13423Q(listMo11889i)).mo11874a();
                        C5207g.m11110e(c7648eMo11874a, "{\n                // Bef…irst().name\n            }");
                    }
                    C6735e c6735e2 = (C6735e) c8578t2.f46002d;
                    C5207g.m11111f(c6735e2, "typeTable");
                    int i11 = protoBuf$Class2.f39010c;
                    ProtoBuf$Type protoBuf$TypeM13355a = (i11 & 16) == 16 ? protoBuf$Class2.f38999S : (i11 & 32) == 32 ? c6735e2.m13355a(protoBuf$Class2.f39000T) : null;
                    if (protoBuf$TypeM13355a == null || (abstractC5265xM14138d = ((TypeDeserializer) c8578t2.f46006h).m14138d(protoBuf$TypeM13355a, true)) == null) {
                        Iterator it = deserializedClassDescriptor.m14141V0().mo11905c(c7648eMo11874a, NoLookupLocation.FROM_DESERIALIZATION).iterator();
                        boolean z10 = false;
                        Object obj = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (z10) {
                                    break;
                                }
                            } else {
                                Object next = it.next();
                                if (((InterfaceC8829b0) next).mo11896s0() == null) {
                                    if (!z10) {
                                        z10 = true;
                                        obj = next;
                                    }
                                }
                            }
                            obj = null;
                            break;
                        }
                        InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) obj;
                        if (interfaceC8829b0 == null) {
                            throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
                        }
                        AbstractC5257t abstractC5257tMo11884c = interfaceC8829b0.mo11884c();
                        C5207g.m11109d(abstractC5257tMo11884c, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                        abstractC5265xM14138d = (AbstractC5265x) abstractC5257tMo11884c;
                    }
                    c8858q = new C8858q(c7648eMo11874a, abstractC5265xM14138d);
                } else {
                    c8858q = null;
                }
                List<Integer> list2 = protoBuf$Class2.f39001U;
                C5207g.m11110e(list2, "classProto.multiFieldValueClassUnderlyingNameList");
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                for (Integer num : list2) {
                    InterfaceC6733c interfaceC6733c2 = (InterfaceC6733c) c8578t2.f46000b;
                    C5207g.m11110e(num, "it");
                    arrayList2.add(C7499b.m14910J(interfaceC6733c2, num.intValue()));
                }
                if (!(!arrayList2.isEmpty())) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    if (!deserializedClassDescriptor.mo13594S()) {
                        throw new IllegalArgumentException(("Not a value class: " + deserializedClassDescriptor).toString());
                    }
                    Pair pair = new Pair(Integer.valueOf(protoBuf$Class2.f39004X.size()), Integer.valueOf(protoBuf$Class2.f39003W.size()));
                    if (C5207g.m11106a(pair, new Pair(Integer.valueOf(arrayList2.size()), 0))) {
                        List<Integer> list3 = protoBuf$Class2.f39004X;
                        C5207g.m11110e(list3, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
                        arrayList = new ArrayList(C9325m.m17681z(list3, 10));
                        for (Integer num2 : list3) {
                            C6735e c6735e3 = (C6735e) c8578t2.f46002d;
                            C5207g.m11110e(num2, "it");
                            arrayList.add(c6735e3.m13355a(num2.intValue()));
                        }
                    } else {
                        if (!C5207g.m11106a(pair, new Pair(0, Integer.valueOf(arrayList2.size())))) {
                            throw new IllegalStateException(("Illegal multi-field value class representation: " + deserializedClassDescriptor).toString());
                        }
                        arrayList = protoBuf$Class2.f39003W;
                    }
                    C5207g.m11110e(arrayList, "when (typeIdCount to typ…tation: $this\")\n        }");
                    ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList, 10));
                    for (ProtoBuf$Type protoBuf$Type : arrayList) {
                        TypeDeserializer typeDeserializer = (TypeDeserializer) c8578t2.f46006h;
                        C5207g.m11110e(protoBuf$Type, "it");
                        arrayList3.add(typeDeserializer.m14138d(protoBuf$Type, true));
                    }
                    c8864v = new C8864v(C6752c.m13412A0(arrayList2, arrayList3));
                }
                if (c8858q != null && c8864v != null) {
                    throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + deserializedClassDescriptor);
                }
                if (deserializedClassDescriptor.mo13594S() || deserializedClassDescriptor.mo13603x()) {
                    if (c8858q == null && c8864v == null) {
                        throw new IllegalArgumentException("Value class has no value class representation: " + deserializedClassDescriptor);
                    }
                }
                return c8858q != null ? c8858q : c8864v;
            }
        });
        InterfaceC6733c interfaceC6733c2 = (InterfaceC6733c) c8578tM16777a.f46000b;
        C6735e c6735e2 = (C6735e) c8578tM16777a.f46002d;
        DeserializedClassDescriptor deserializedClassDescriptor = interfaceC8838g instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) interfaceC8838g : null;
        this.f39760R = new AbstractC10554r.a(protoBuf$Class, interfaceC6733c2, c6735e2, interfaceC8837f0, deserializedClassDescriptor != null ? deserializedClassDescriptor.f39760R : aVar);
        this.f39761S = !C6732b.f37965c.m13346c(protoBuf$Class.f39012d).booleanValue() ? InterfaceC9077e.a.f47365a : new C1632j(c8578tM16777a.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC9075c> mo807E() {
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.f39789b;
                return C6752c.m13453u0(((C10544h) deserializedClassDescriptor2.f39769l.f45999a).f52583e.mo13757e(deserializedClassDescriptor2.f39760R));
            }
        });
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return C0166e.m779z(C6732b.f37971i, this.f39762e.f39012d, "IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: E */
    public final boolean mo13589E() {
        return C6732b.f37968f.m13348c(this.f39762e.f39012d) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: G */
    public final Collection<InterfaceC8828b> mo13590G() {
        return this.f39756N.mo807E();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: I0 */
    public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
        return this.f39759Q.mo807E();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: J */
    public final boolean mo13592J() {
        return C0166e.m779z(C6732b.f37974l, this.f39762e.f39012d, "IS_FUN_INTERFACE.get(classProto.flags)");
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
        return this.f39752J.m13609a(abstractC5439d);
    }

    @Override // p420um.AbstractC9557b, p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Q0 */
    public final List<InterfaceC8835e0> mo14140Q0() {
        List<ProtoBuf$Type> list = this.f39762e.f38988H;
        C5207g.m11110e(list, "classProto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (ProtoBuf$Type protoBuf$Type : list) {
            TypeDeserializer typeDeserializer = (TypeDeserializer) this.f39769l.f46006h;
            C5207g.m11110e(protoBuf$Type, "it");
            arrayList.add(new C9568g0(mo17092U0(), new C10253b(this, typeDeserializer.m14139g(protoBuf$Type)), InterfaceC9077e.a.f47365a));
        }
        return arrayList;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S */
    public final boolean mo13594S() {
        return C0166e.m779z(C6732b.f37973k, this.f39762e.f39012d, "IS_VALUE_CLASS.get(classProto.flags)") && this.f39763f.m13343a(1, 4, 2);
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S0 */
    public final boolean mo13595S0() {
        return C0166e.m779z(C6732b.f37970h, this.f39762e.f39012d, "IS_DATA.get(classProto.flags)");
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return C0166e.m779z(C6732b.f37972j, this.f39762e.f39012d, "IS_EXPECT_CLASS.get(classProto.flags)");
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return C0166e.m779z(C6732b.f37969g, this.f39762e.f39012d, "IS_INNER.get(classProto.flags)");
    }

    /* JADX INFO: renamed from: V0 */
    public final DeserializedClassMemberScope m14141V0() {
        return (DeserializedClassMemberScope) this.f39752J.m13609a(((C10544h) this.f39769l.f45999a).f52595q.mo11666c());
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final InterfaceC8828b mo13597Y() {
        return this.f39755M.mo807E();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        return this.f39750H;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8830c mo13599b0() {
        return this.f39757O.mo807E();
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        return this.f39767j;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return this.f39754L;
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return this.f39764g;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        return this.f39751I;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        return this.f39766i;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8830c> mo13601m() {
        return this.f39758P.mo807E();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(mo11882T() ? "expect " : "");
        sb2.append("class ");
        sb2.append(mo11874a());
        return sb2.toString();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        return this.f39768k;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return this.f39761S;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: x */
    public final boolean mo13603x() {
        int i10;
        boolean z10 = false;
        if (C0166e.m779z(C6732b.f37973k, this.f39762e.f39012d, "IS_VALUE_CLASS.get(classProto.flags)")) {
            AbstractC6731a abstractC6731a = this.f39763f;
            int i11 = abstractC6731a.f37946b;
            if (i11 < 1 || (i11 <= 1 && ((i10 = abstractC6731a.f37947c) < 4 || (i10 <= 4 && abstractC6731a.f37948d <= 1)))) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        return ((TypeDeserializer) this.f39769l.f46006h).m14136b();
    }
}
