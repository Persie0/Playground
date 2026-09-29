package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jo.C6531c;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import mn.C7648e;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8838g;
import p466wn.AbstractC9978a;
import p466wn.C9979b;
import p466wn.C9981d;
import p543do.AbstractC5257t;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersectionScope extends AbstractC9978a {

    /* JADX INFO: renamed from: b */
    public final MemberScope f39680b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$a */
    public static final class C7016a {
        /* JADX INFO: renamed from: a */
        public static MemberScope m14120a(String str, Collection collection) {
            MemberScope c9979b;
            C5207g.m11111f(str, "message");
            C5207g.m11111f(collection, "types");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC5257t) it.next()).mo11245q());
            }
            C6531c c6531cM11009g1 = C5206f.m11009g1(arrayList);
            int i10 = c6531cM11009g1.f37187a;
            if (i10 == 0) {
                c9979b = MemberScope.C7015a.f39670b;
            } else if (i10 != 1) {
                Object[] array = c6531cM11009g1.toArray(new MemberScope[0]);
                C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                c9979b = new C9979b(str, (MemberScope[]) array);
            } else {
                c9979b = (MemberScope) c6531cM11009g1.get(0);
            }
            return c6531cM11009g1.f37187a <= 1 ? c9979b : new TypeIntersectionScope(c9979b);
        }
    }

    public TypeIntersectionScope(MemberScope memberScope) {
        this.f39680b = memberScope;
    }

    @Override // p466wn.AbstractC9978a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return OverridingUtilsKt.m14092a(super.mo11904b(c7648e, noLookupLocation), new InterfaceC2052l<InterfaceC6824e, InterfaceC6816a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedFunctions$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC6816a mo528n(InterfaceC6824e interfaceC6824e) {
                InterfaceC6824e interfaceC6824e2 = interfaceC6824e;
                C5207g.m11111f(interfaceC6824e2, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC6824e2;
            }
        });
    }

    @Override // p466wn.AbstractC9978a, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return OverridingUtilsKt.m14092a(super.mo11905c(c7648e, noLookupLocation), new InterfaceC2052l<InterfaceC8829b0, InterfaceC6816a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedVariables$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC6816a mo528n(InterfaceC8829b0 interfaceC8829b0) {
                InterfaceC8829b0 interfaceC8829b1 = interfaceC8829b0;
                C5207g.m11111f(interfaceC8829b1, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC8829b1;
            }
        });
    }

    @Override // p466wn.AbstractC9978a, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        Collection<InterfaceC8838g> collectionMo5303e = super.mo5303e(c9981d, interfaceC2052l);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionMo5303e) {
            if (((InterfaceC8838g) obj) instanceof InterfaceC6816a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return C6752c.m13438f0(arrayList2, OverridingUtilsKt.m14092a(arrayList, new InterfaceC2052l<InterfaceC6816a, InterfaceC6816a>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$getContributedDescriptors$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC6816a mo528n(InterfaceC6816a interfaceC6816a) {
                InterfaceC6816a interfaceC6816a2 = interfaceC6816a;
                C5207g.m11111f(interfaceC6816a2, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC6816a2;
            }
        }));
    }

    @Override // p466wn.AbstractC9978a
    /* JADX INFO: renamed from: i */
    public final MemberScope mo14117i() {
        return this.f39680b;
    }
}
