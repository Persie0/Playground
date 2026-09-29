package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.C6531c;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import mn.C7648e;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p466wn.AbstractC9984g;
import p466wn.C9981d;
import p466wn.C9982e;
import p466wn.InterfaceC9985h;
import p543do.AbstractC5257t;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GivenFunctionsMemberScope extends AbstractC9984g {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f39660d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c f39661b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e f39662c;

    public GivenFunctionsMemberScope(InterfaceC2076h interfaceC2076h, InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8830c, "containingClass");
        this.f39661b = interfaceC8830c;
        this.f39662c = interfaceC2076h.mo6217b(new InterfaceC2041a<List<? extends InterfaceC8838g>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil] */
            /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Collection] */
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
            public final List<? extends InterfaceC8838g> mo807E() {
                ?? arrayList;
                GivenFunctionsMemberScope givenFunctionsMemberScope = this.f39663b;
                List<InterfaceC6822c> listMo14116h = givenFunctionsMemberScope.mo14116h();
                ArrayList arrayList2 = new ArrayList(3);
                Collection<AbstractC5257t> collectionMo11278p = givenFunctionsMemberScope.f39661b.mo13600k().mo11278p();
                C5207g.m11110e(collectionMo11278p, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionMo11278p.iterator();
                while (it.hasNext()) {
                    C9327o.m17684D(InterfaceC9985h.a.m18558a(((AbstractC5257t) it.next()).mo11245q(), null, 3), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (obj instanceof CallableMemberDescriptor) {
                        arrayList4.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList4) {
                    C7648e c7648eMo11874a = ((CallableMemberDescriptor) obj2).mo11874a();
                    Object arrayList5 = linkedHashMap.get(c7648eMo11874a);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(c7648eMo11874a, arrayList5);
                    }
                    ((List) arrayList5).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C7648e c7648e = (C7648e) entry.getKey();
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : list) {
                        Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof InterfaceC6822c);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj3);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        ?? r10 = OverridingUtil.f39632f;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            Iterator it2 = listMo14116h.iterator();
                            while (true) {
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (C5207g.m11106a(((InterfaceC6822c) next).mo11874a(), c7648e)) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        r10.m14083h(c7648e, list2, arrayList, givenFunctionsMemberScope.f39661b, new C9982e(arrayList2, givenFunctionsMemberScope));
                    }
                }
                return C6752c.m13438f0(C0062b.m397t0(arrayList2), listMo14116h);
            }
        });
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        List list = (List) C0062b.m366l1(this.f39662c, f39660d[0]);
        C6531c c6531c = new C6531c();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC6824e) && C5207g.m11106a(((InterfaceC6824e) obj).mo11874a(), c7648e)) {
                c6531c.add(obj);
            }
        }
        return c6531c;
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        List list = (List) C0062b.m366l1(this.f39662c, f39660d[0]);
        C6531c c6531c = new C6531c();
        while (true) {
            for (Object obj : list) {
                if ((obj instanceof InterfaceC8829b0) && C5207g.m11106a(((InterfaceC8829b0) obj).mo11874a(), c7648e)) {
                    c6531c.add(obj);
                }
            }
            return c6531c;
        }
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        if (!c9981d.m18557a(C9981d.f50722n.f50729b)) {
            return EmptyList.f38032a;
        }
        return (List) C0062b.m366l1(this.f39662c, f39660d[0]);
    }

    /* JADX INFO: renamed from: h */
    public abstract List<InterfaceC6822c> mo14116h();
}
