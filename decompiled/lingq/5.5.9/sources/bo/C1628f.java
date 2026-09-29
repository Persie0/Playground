package bo;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kn.AbstractC6731a;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.collections.C6752c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8865w;
import p466wn.C9981d;
import p541zn.C10544h;
import tl.C9327o;
import tm.InterfaceC9340b;

/* JADX INFO: renamed from: bo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1628f extends DeserializedMemberScope {

    /* JADX INFO: renamed from: g */
    public final InterfaceC8865w f9152g;

    /* JADX INFO: renamed from: h */
    public final String f9153h;

    /* JADX INFO: renamed from: i */
    public final C7646c f9154i;

    public C1628f(InterfaceC8865w interfaceC8865w, ProtoBuf$Package protoBuf$Package, InterfaceC6733c interfaceC6733c, AbstractC6731a abstractC6731a, InterfaceC1626d interfaceC1626d, C10544h c10544h, String str, InterfaceC2041a<? extends Collection<C7648e>> interfaceC2041a) {
        C5207g.m11111f(interfaceC8865w, "packageDescriptor");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        C5207g.m11111f(str, "debugName");
        C5207g.m11111f(interfaceC2041a, "classNames");
        ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Package.f39156g;
        C5207g.m11110e(protoBuf$TypeTable, "proto.typeTable");
        C6735e c6735e = new C6735e(protoBuf$TypeTable);
        C6736f c6736f = C6736f.f37996b;
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Package.f39157h;
        C5207g.m11110e(protoBuf$VersionRequirementTable, "proto.versionRequirementTable");
        C8578t c8578tM19514a = c10544h.m19514a(interfaceC8865w, interfaceC6733c, c6735e, C6736f.a.m13356a(protoBuf$VersionRequirementTable), abstractC6731a, interfaceC1626d);
        List<ProtoBuf$Function> list = protoBuf$Package.f39153d;
        C5207g.m11110e(list, "proto.functionList");
        List<ProtoBuf$Property> list2 = protoBuf$Package.f39154e;
        C5207g.m11110e(list2, "proto.propertyList");
        List<ProtoBuf$TypeAlias> list3 = protoBuf$Package.f39155f;
        C5207g.m11110e(list3, "proto.typeAliasList");
        super(c8578tM19514a, list, list2, list3, interfaceC2041a);
        this.f9152g = interfaceC8865w;
        this.f9153h = str;
        this.f9154i = interfaceC8865w.mo17120e();
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection mo5303e(C9981d c9981d, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        List listM14147i = m14147i(c9981d, interfaceC2052l, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<InterfaceC9340b> iterable = ((C10544h) this.f39796b.f45999a).f52589k;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9340b> it = iterable.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(it.next().mo13581a(this.f9154i), arrayList);
        }
        return C6752c.m13438f0(arrayList, listM14147i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        C7499b.m14958p0(((C10544h) this.f39796b.f45999a).f52587i, noLookupLocation, this.f9152g, c7648e);
        return super.mo5304g(c7648e, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: h */
    public final void mo5305h(ArrayList arrayList, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "nameFilter");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: l */
    public final C7645b mo5306l(C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        return new C7645b(this.f9154i, c7648e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: n */
    public final Set<C7648e> mo5307n() {
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: o */
    public final Set<C7648e> mo5308o() {
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: p */
    public final Set<C7648e> mo5309p() {
        return EmptySet.f38034a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: q */
    public final boolean mo5310q(C7648e c7648e) {
        boolean z10;
        C5207g.m11111f(c7648e, "name");
        boolean z11 = true;
        if (!super.mo5310q(c7648e)) {
            Iterable<InterfaceC9340b> iterable = ((C10544h) this.f39796b.f45999a).f52589k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator<InterfaceC9340b> it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo13583c(this.f9154i, c7648e)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (!z10) {
                    z11 = false;
                }
            }
            z10 = false;
            if (!z10) {
                z11 = false;
            }
        }
        return z11;
    }

    public final String toString() {
        return this.f9153h;
    }
}
