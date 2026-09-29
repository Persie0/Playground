package p466wn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;

/* JADX INFO: renamed from: wn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9978a implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        return mo14117i().mo11903a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return mo14117i().mo11904b(c7648e, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return mo14117i().mo11905c(c7648e, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        return mo14117i().mo11906d();
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return mo14117i().mo5303e(c9981d, interfaceC2052l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        return mo14117i().mo11907f();
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return mo14117i().mo5304g(c7648e, noLookupLocation);
    }

    /* JADX INFO: renamed from: h */
    public final MemberScope m18554h() {
        if (!(mo14117i() instanceof AbstractC9978a)) {
            return mo14117i();
        }
        MemberScope memberScopeMo14117i = mo14117i();
        C5207g.m11109d(memberScopeMo14117i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC9978a) memberScopeMo14117i).m18554h();
    }

    /* JADX INFO: renamed from: i */
    public abstract MemberScope mo14117i();
}
