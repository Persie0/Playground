package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import bo.C1628f;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import co.InterfaceC2073e;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5840t;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import km.InterfaceC6727j;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p260m8.C7499b;
import p266n.C7669f;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p466wn.C9981d;
import p516ym.InterfaceC10417b;
import tl.C9323k;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38686f = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: b */
    public final C7669f f38687b;

    /* JADX INFO: renamed from: c */
    public final LazyJavaPackageFragment f38688c;

    /* JADX INFO: renamed from: d */
    public final LazyJavaPackageScope f38689d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2073e f38690e;

    public JvmPackageScope(C7669f c7669f, InterfaceC5840t interfaceC5840t, LazyJavaPackageFragment lazyJavaPackageFragment) {
        C5207g.m11111f(interfaceC5840t, "jPackage");
        C5207g.m11111f(lazyJavaPackageFragment, "packageFragment");
        this.f38687b = c7669f;
        this.f38688c = lazyJavaPackageFragment;
        this.f38689d = new LazyJavaPackageScope(c7669f, interfaceC5840t, lazyJavaPackageFragment);
        this.f38690e = c7669f.m15268b().mo6217b(new InterfaceC2041a<MemberScope[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final MemberScope[] mo807E() {
                JvmPackageScope jvmPackageScope = this.f38691b;
                LazyJavaPackageFragment lazyJavaPackageFragment2 = jvmPackageScope.f38688c;
                lazyJavaPackageFragment2.getClass();
                Collection collectionValues = ((Map) C0062b.m366l1(lazyJavaPackageFragment2.f38749i, LazyJavaPackageFragment.f38746H[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    C1628f c1628fM13767a = ((C2064a) jvmPackageScope.f38687b.f42146a).f10498d.m13767a(jvmPackageScope.f38688c, (InterfaceC6367k) it.next());
                    if (c1628fM13767a != null) {
                        arrayList.add(c1628fM13767a);
                    }
                }
                Object[] array = C5206f.m11009g1(arrayList).toArray(new MemberScope[0]);
                C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return (MemberScope[]) array;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        MemberScope[] memberScopeArrM13684h = m13684h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM13684h) {
            C9327o.m17684D(memberScope.mo11903a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f38689d.mo11903a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13685i(c7648e, noLookupLocation);
        MemberScope[] memberScopeArrM13684h = m13684h();
        Collection collectionMo11904b = this.f38689d.mo11904b(c7648e, noLookupLocation);
        for (MemberScope memberScope : memberScopeArrM13684h) {
            collectionMo11904b = C5206f.m10981B0(collectionMo11904b, memberScope.mo11904b(c7648e, noLookupLocation));
        }
        if (collectionMo11904b == null) {
            collectionMo11904b = EmptySet.f38034a;
        }
        return collectionMo11904b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13685i(c7648e, noLookupLocation);
        MemberScope[] memberScopeArrM13684h = m13684h();
        Collection collectionMo11905c = this.f38689d.mo11905c(c7648e, noLookupLocation);
        for (MemberScope memberScope : memberScopeArrM13684h) {
            collectionMo11905c = C5206f.m10981B0(collectionMo11905c, memberScope.mo11905c(c7648e, noLookupLocation));
        }
        return collectionMo11905c == null ? EmptySet.f38034a : collectionMo11905c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        MemberScope[] memberScopeArrM13684h = m13684h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM13684h) {
            C9327o.m17684D(memberScope.mo11906d(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f38689d.mo11906d());
        return linkedHashSet;
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        MemberScope[] memberScopeArrM13684h = m13684h();
        Collection<InterfaceC8838g> collectionMo5303e = this.f38689d.mo5303e(c9981d, interfaceC2052l);
        for (MemberScope memberScope : memberScopeArrM13684h) {
            collectionMo5303e = C5206f.m10981B0(collectionMo5303e, memberScope.mo5303e(c9981d, interfaceC2052l));
        }
        if (collectionMo5303e == null) {
            collectionMo5303e = EmptySet.f38034a;
        }
        return collectionMo5303e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        MemberScope[] memberScopeArrM13684h = m13684h();
        C5207g.m11111f(memberScopeArrM13684h, "<this>");
        HashSet hashSetM14974y = C7499b.m14974y(memberScopeArrM13684h.length == 0 ? EmptyList.f38032a : new C9323k(memberScopeArrM13684h));
        if (hashSetM14974y == null) {
            return null;
        }
        hashSetM14974y.addAll(this.f38689d.mo11907f());
        return hashSetM14974y;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        m13685i(c7648e, noLookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f38689d;
        lazyJavaPackageScope.getClass();
        InterfaceC8834e interfaceC8834e = null;
        InterfaceC8830c interfaceC8830cM13719v = lazyJavaPackageScope.m13719v(c7648e, null);
        if (interfaceC8830cM13719v != null) {
            return interfaceC8830cM13719v;
        }
        for (MemberScope memberScope : m13684h()) {
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

    /* JADX INFO: renamed from: h */
    public final MemberScope[] m13684h() {
        return (MemberScope[]) C0062b.m366l1(this.f38690e, f38686f[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m13685i(C7648e c7648e, InterfaceC10417b interfaceC10417b) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(interfaceC10417b, "location");
        C7499b.m14958p0(((C2064a) this.f38687b.f42146a).f10508n, (NoLookupLocation) interfaceC10417b, this.f38688c, c7648e);
    }

    public final String toString() {
        return "scope for " + this.f38688c;
    }
}
