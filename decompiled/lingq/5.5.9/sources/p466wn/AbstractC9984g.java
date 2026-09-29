package p466wn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;

/* JADX INFO: renamed from: wn.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9984g implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public Set<C7648e> mo11903a() {
        Collection<InterfaceC8838g> collectionMo5303e = mo5303e(C9981d.f50724p, FunctionsKt.f39944a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            for (Object obj : collectionMo5303e) {
                if (obj instanceof InterfaceC6824e) {
                    C7648e c7648eMo11874a = ((InterfaceC6824e) obj).mo11874a();
                    C5207g.m11110e(c7648eMo11874a, "it.name");
                    linkedHashSet.add(c7648eMo11874a);
                }
            }
            return linkedHashSet;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return EmptyList.f38032a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return EmptyList.f38032a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public Set<C7648e> mo11906d() {
        Collection<InterfaceC8838g> collectionMo5303e = mo5303e(C9981d.f50725q, FunctionsKt.f39944a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo5303e) {
            if (obj instanceof InterfaceC6824e) {
                C7648e c7648eMo11874a = ((InterfaceC6824e) obj).mo11874a();
                C5207g.m11110e(c7648eMo11874a, "it.name");
                linkedHashSet.add(c7648eMo11874a);
            }
        }
        return linkedHashSet;
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return EmptyList.f38032a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public Set<C7648e> mo11907f() {
        return null;
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return null;
    }
}
