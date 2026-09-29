package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import cm.InterfaceC2052l;
import cn.C2064a;
import dm.C5206f;
import dm.C5207g;
import gn.InterfaceC5827g;
import gn.InterfaceC5836p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jo.C6530b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p078dn.AbstractC5217c;
import p078dn.C5216b;
import p078dn.InterfaceC5215a;
import p266n.C7669f;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p385sf.C9000b;
import p466wn.C9981d;
import pn.C8412c;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6856b extends AbstractC5217c {

    /* JADX INFO: renamed from: n */
    public final InterfaceC5827g f38811n;

    /* JADX INFO: renamed from: o */
    public final LazyJavaClassDescriptor f38812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6856b(C7669f c7669f, InterfaceC5827g interfaceC5827g, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(c7669f);
        C5207g.m11111f(interfaceC5827g, "jClass");
        C5207g.m11111f(lazyJavaClassDescriptor, "ownerDescriptor");
        this.f38811n = interfaceC5827g;
        this.f38812o = lazyJavaClassDescriptor;
    }

    /* JADX INFO: renamed from: v */
    public static InterfaceC8829b0 m13723v(InterfaceC8829b0 interfaceC8829b0) {
        if (interfaceC8829b0.mo11897u().isReal()) {
            return interfaceC8829b0;
        }
        Collection<? extends CallableMemberDescriptor> collectionMo11893p = interfaceC8829b0.mo11893p();
        C5207g.m11110e(collectionMo11893p, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11893p, 10));
        Iterator<T> it = collectionMo11893p.iterator();
        while (it.hasNext()) {
            InterfaceC8829b0 interfaceC8829b1 = (InterfaceC8829b0) it.next();
            C5207g.m11110e(interfaceC8829b1, "it");
            arrayList.add(m13723v(interfaceC8829b1));
        }
        return (InterfaceC8829b0) C6752c.m13443k0(C6752c.m13416J(arrayList));
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: h */
    public final Set<C7648e> mo13707h(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i */
    public final Set<C7648e> mo13708i(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        Set<C7648e> setM13456x0 = C6752c.m13456x0(this.f38774e.mo807E().mo11202a());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38812o;
        C6856b c6856bM11003Y0 = C5206f.m11003Y0(lazyJavaClassDescriptor);
        Set<C7648e> setMo11903a = c6856bM11003Y0 != null ? c6856bM11003Y0.mo11903a() : null;
        if (setMo11903a == null) {
            setMo11903a = EmptySet.f38034a;
        }
        setM13456x0.addAll(setMo11903a);
        if (this.f38811n.mo12246H()) {
            setM13456x0.addAll(C9000b.m17252r(C6797e.f38336b, C6797e.f38335a));
        }
        setM13456x0.addAll(((C2064a) this.f38771b.f42146a).f10518x.mo18061d(lazyJavaClassDescriptor));
        return setM13456x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: j */
    public final void mo13709j(ArrayList arrayList, C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        ((C2064a) this.f38771b.f42146a).f10518x.mo18058a(this.f38812o, c7648e, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: k */
    public final InterfaceC5215a mo13710k() {
        return new ClassDeclaredMemberIndex(this.f38811n, new InterfaceC2052l<InterfaceC5836p, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeMemberIndex$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC5836p interfaceC5836p) {
                InterfaceC5836p interfaceC5836p2 = interfaceC5836p;
                C5207g.m11111f(interfaceC5836p2, "it");
                return Boolean.valueOf(interfaceC5836p2.mo12277X());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: m */
    public final void mo13711m(LinkedHashSet linkedHashSet, C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38812o;
        C6856b c6856bM11003Y0 = C5206f.m11003Y0(lazyJavaClassDescriptor);
        Set setM13457y0 = c6856bM11003Y0 == null ? EmptySet.f38034a : C6752c.m13457y0(c6856bM11003Y0.mo11904b(c7648e, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        LazyJavaClassDescriptor lazyJavaClassDescriptor2 = this.f38812o;
        C2064a c2064a = (C2064a) this.f38771b.f42146a;
        linkedHashSet.addAll(C0062b.m305R1(c7648e, setM13457y0, linkedHashSet, lazyJavaClassDescriptor2, c2064a.f10500f, c2064a.f10515u.mo11665b()));
        if (this.f38811n.mo12246H()) {
            if (C5207g.m11106a(c7648e, C6797e.f38336b)) {
                linkedHashSet.add(C8412c.m16436e(lazyJavaClassDescriptor));
            } else if (C5207g.m11106a(c7648e, C6797e.f38335a)) {
                linkedHashSet.add(C8412c.m16437f(lazyJavaClassDescriptor));
            }
        }
    }

    @Override // p078dn.AbstractC5217c, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: n */
    public final void mo11210n(ArrayList arrayList, final C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InterfaceC2052l<MemberScope, Collection<? extends InterfaceC8829b0>> interfaceC2052l = new InterfaceC2052l<MemberScope, Collection<? extends InterfaceC8829b0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends InterfaceC8829b0> mo528n(MemberScope memberScope) {
                MemberScope memberScope2 = memberScope;
                C5207g.m11111f(memberScope2, "it");
                return memberScope2.mo11905c(c7648e, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            }
        };
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38812o;
        C6530b.m13110b(C9000b.m17251q(lazyJavaClassDescriptor), C6855a.f38810a, new C5216b(lazyJavaClassDescriptor, linkedHashSet, interfaceC2052l));
        boolean z10 = !arrayList.isEmpty();
        C7669f c7669f = this.f38771b;
        if (z10) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor2 = this.f38812o;
            C2064a c2064a = (C2064a) c7669f.f42146a;
            arrayList.addAll(C0062b.m305R1(c7648e, linkedHashSet, arrayList, lazyJavaClassDescriptor2, c2064a.f10500f, c2064a.f10515u.mo11665b()));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            InterfaceC8829b0 interfaceC8829b0M13723v = m13723v((InterfaceC8829b0) obj);
            Object arrayList2 = linkedHashMap.get(interfaceC8829b0M13723v);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(interfaceC8829b0M13723v, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
            LazyJavaClassDescriptor lazyJavaClassDescriptor3 = this.f38812o;
            C2064a c2064a2 = (C2064a) c7669f.f42146a;
            C9327o.m17684D(C0062b.m305R1(c7648e, collection, arrayList, lazyJavaClassDescriptor3, c2064a2.f10500f, c2064a2.f10515u.mo11665b()), arrayList3);
        }
        arrayList.addAll(arrayList3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: o */
    public final Set mo13712o(C9981d c9981d) {
        C5207g.m11111f(c9981d, "kindFilter");
        Set setM13456x0 = C6752c.m13456x0(this.f38774e.mo807E().mo11206e());
        LazyJavaStaticClassScope$computePropertyNames$1$1 lazyJavaStaticClassScope$computePropertyNames$1$1 = new InterfaceC2052l<MemberScope, Collection<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computePropertyNames$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Collection<? extends C7648e> mo528n(MemberScope memberScope) {
                MemberScope memberScope2 = memberScope;
                C5207g.m11111f(memberScope2, "it");
                return memberScope2.mo11906d();
            }
        };
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f38812o;
        C6530b.m13110b(C9000b.m17251q(lazyJavaClassDescriptor), C6855a.f38810a, new C5216b(lazyJavaClassDescriptor, setM13456x0, lazyJavaStaticClassScope$computePropertyNames$1$1));
        return setM13456x0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: q */
    public final InterfaceC8838g mo13713q() {
        return this.f38812o;
    }
}
