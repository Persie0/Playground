package p466wn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;

/* JADX INFO: renamed from: wn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9983f extends AbstractC9984g {

    /* JADX INFO: renamed from: b */
    public final MemberScope f50734b;

    public C9983f(MemberScope memberScope) {
        C5207g.m11111f(memberScope, "workerScope");
        this.f50734b = memberScope;
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        return this.f50734b.mo11903a();
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        return this.f50734b.mo11906d();
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection mo5303e(C9981d c9981d, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        int i10 = C9981d.f50720l & c9981d.f50729b;
        C9981d c9981d2 = i10 == 0 ? null : new C9981d(i10, c9981d.f50728a);
        if (c9981d2 == null) {
            return EmptyList.f38032a;
        }
        Collection<InterfaceC8838g> collectionMo5303e = this.f50734b.mo5303e(c9981d2, interfaceC2052l);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo5303e) {
            if (obj instanceof InterfaceC8836f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        return this.f50734b.mo11907f();
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        InterfaceC8834e interfaceC8834eMo5304g = this.f50734b.mo5304g(c7648e, noLookupLocation);
        if (interfaceC8834eMo5304g == null) {
            return null;
        }
        InterfaceC8830c interfaceC8830c = interfaceC8834eMo5304g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g : null;
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        if (interfaceC8834eMo5304g instanceof InterfaceC8845j0) {
            return (InterfaceC8845j0) interfaceC8834eMo5304g;
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.f50734b;
    }
}
