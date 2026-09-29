package p466wn;

import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo.C6531c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import tl.C9322j;
import tl.C9323k;
import tl.C9327o;

/* JADX INFO: renamed from: wn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9979b implements MemberScope {

    /* JADX INFO: renamed from: b */
    public final String f50706b;

    /* JADX INFO: renamed from: c */
    public final MemberScope[] f50707c;

    /* JADX INFO: renamed from: wn.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static MemberScope m18555a(String str, List list) {
            C5207g.m11111f(str, "debugName");
            C5207g.m11111f(list, "scopes");
            C6531c c6531c = new C6531c();
            Iterator it = list.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    MemberScope memberScope = (MemberScope) it.next();
                    if (memberScope != MemberScope.C7015a.f39670b) {
                        if (memberScope instanceof C9979b) {
                            MemberScope[] memberScopeArr = ((C9979b) memberScope).f50707c;
                            C5207g.m11111f(memberScopeArr, "elements");
                            c6531c.addAll(C9322j.m17670X(memberScopeArr));
                        } else {
                            c6531c.add(memberScope);
                        }
                    }
                }
            }
            int i10 = c6531c.f37187a;
            if (i10 == 0) {
                return MemberScope.C7015a.f39670b;
            }
            if (i10 == 1) {
                return (MemberScope) c6531c.get(0);
            }
            Object[] array = c6531c.toArray(new MemberScope[0]);
            C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C9979b(str, (MemberScope[]) array);
        }
    }

    public C9979b(String str, MemberScope[] memberScopeArr) {
        this.f50706b = str;
        this.f50707c = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f50707c) {
            C9327o.m17684D(memberScope.mo11903a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        Collection collectionM10981B0;
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        MemberScope[] memberScopeArr = this.f50707c;
        int length = memberScopeArr.length;
        if (length != 0) {
            if (length == 1) {
                return memberScopeArr[0].mo11904b(c7648e, noLookupLocation);
            }
            collectionM10981B0 = null;
            for (MemberScope memberScope : memberScopeArr) {
                collectionM10981B0 = C5206f.m10981B0(collectionM10981B0, memberScope.mo11904b(c7648e, noLookupLocation));
            }
            if (collectionM10981B0 == null) {
                return EmptySet.f38034a;
            }
        } else {
            collectionM10981B0 = EmptyList.f38032a;
        }
        return collectionM10981B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        MemberScope[] memberScopeArr = this.f50707c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.f38032a;
        }
        if (length == 1) {
            return memberScopeArr[0].mo11905c(c7648e, noLookupLocation);
        }
        Collection collectionM10981B0 = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM10981B0 = C5206f.m10981B0(collectionM10981B0, memberScope.mo11905c(c7648e, noLookupLocation));
        }
        return collectionM10981B0 == null ? EmptySet.f38034a : collectionM10981B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f50707c) {
            C9327o.m17684D(memberScope.mo11906d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        MemberScope[] memberScopeArr = this.f50707c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.f38032a;
        }
        if (length == 1) {
            return memberScopeArr[0].mo5303e(c9981d, interfaceC2052l);
        }
        Collection<InterfaceC8838g> collectionM10981B0 = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM10981B0 = C5206f.m10981B0(collectionM10981B0, memberScope.mo5303e(c9981d, interfaceC2052l));
        }
        return collectionM10981B0 == null ? EmptySet.f38034a : collectionM10981B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        MemberScope[] memberScopeArr = this.f50707c;
        C5207g.m11111f(memberScopeArr, "<this>");
        return C7499b.m14974y(memberScopeArr.length == 0 ? EmptyList.f38032a : new C9323k(memberScopeArr));
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        InterfaceC8834e interfaceC8834e = null;
        for (MemberScope memberScope : this.f50707c) {
            InterfaceC8834e interfaceC8834eMo5304g = memberScope.mo5304g(c7648e, noLookupLocation);
            if (interfaceC8834eMo5304g != null) {
                if (!(interfaceC8834eMo5304g instanceof InterfaceC8836f) || !((InterfaceC8836f) interfaceC8834eMo5304g).mo11882T()) {
                    return interfaceC8834eMo5304g;
                }
                if (interfaceC8834e == null) {
                    interfaceC8834e = interfaceC8834eMo5304g;
                }
            }
        }
        return interfaceC8834e;
    }

    public final String toString() {
        return this.f50706b;
    }
}
