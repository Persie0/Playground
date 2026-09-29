package kotlin.reflect.jvm.internal.impl.types;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import p102eo.AbstractC5439d;
import p139go.InterfaceC5851e;
import p260m8.C7499b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5240k0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class IntersectionTypeConstructor implements InterfaceC5240k0, InterfaceC5851e {

    /* JADX INFO: renamed from: a */
    public final AbstractC5257t f39863a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet<AbstractC5257t> f39864b;

    /* JADX INFO: renamed from: c */
    public final int f39865c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$a */
    public static final class C7052a<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2052l f39866a;

        public C7052a(InterfaceC2052l interfaceC2052l) {
            this.f39866a = interfaceC2052l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            AbstractC5257t abstractC5257t = (AbstractC5257t) t10;
            C5207g.m11110e(abstractC5257t, "it");
            InterfaceC2052l interfaceC2052l = this.f39866a;
            String string = interfaceC2052l.mo528n(abstractC5257t).toString();
            AbstractC5257t abstractC5257t2 = (AbstractC5257t) t11;
            C5207g.m11110e(abstractC5257t2, "it");
            return C7499b.m14951m(string, interfaceC2052l.mo528n(abstractC5257t2).toString());
        }
    }

    public IntersectionTypeConstructor(AbstractCollection abstractCollection) {
        C5207g.m11111f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet<AbstractC5257t> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.f39864b = linkedHashSet;
        this.f39865c = linkedHashSet.hashCode();
    }

    public IntersectionTypeConstructor(LinkedHashSet linkedHashSet, AbstractC5257t abstractC5257t) {
        this(linkedHashSet);
        this.f39863a = abstractC5257t;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5265x m14179c() {
        C5238j0.f33329b.getClass();
        return KotlinTypeFactory.m14188g(C5238j0.f33330c, this, EmptyList.f38032a, false, TypeIntersectionScope.C7016a.m14120a("member scope for intersection type", this.f39864b), new InterfaceC2052l<AbstractC5439d, AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5265x mo528n(AbstractC5439d abstractC5439d) {
                AbstractC5439d abstractC5439d2 = abstractC5439d;
                C5207g.m11111f(abstractC5439d2, "kotlinTypeRefiner");
                return this.f39867b.m14181e(abstractC5439d2).m14179c();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final String m14180d(final InterfaceC2052l<? super AbstractC5257t, ? extends Object> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "getProperTypeRelatedToStringify");
        return C6752c.m13430X(C6752c.m13447o0(this.f39864b, new C7052a(interfaceC2052l)), " & ", "{", "}", new InterfaceC2052l<AbstractC5257t, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(AbstractC5257t abstractC5257t) {
                AbstractC5257t abstractC5257t2 = abstractC5257t;
                C5207g.m11110e(abstractC5257t2, "it");
                return interfaceC2052l.mo528n(abstractC5257t2).toString();
            }
        }, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [do.t] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: e */
    public final IntersectionTypeConstructor m14181e(AbstractC5439d abstractC5439d) {
        ?? Mo11218c1;
        IntersectionTypeConstructor intersectionTypeConstructor;
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        LinkedHashSet<AbstractC5257t> linkedHashSet = this.f39864b;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC5257t) it.next()).mo11216Z0(abstractC5439d));
            z10 = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructor2 = null;
        if (z10) {
            AbstractC5257t abstractC5257t = this.f39863a;
            if (abstractC5257t != null) {
                Mo11218c1 = intersectionTypeConstructor2;
                Mo11218c1 = abstractC5257t.mo11216Z0(abstractC5439d);
            }
            Mo11218c1 = intersectionTypeConstructor2;
            intersectionTypeConstructor = new IntersectionTypeConstructor(new IntersectionTypeConstructor(arrayList).f39864b, Mo11218c1);
        }
        if (intersectionTypeConstructor == null) {
            intersectionTypeConstructor = intersectionTypeConstructor2;
            intersectionTypeConstructor = this;
        }
        intersectionTypeConstructor = intersectionTypeConstructor2;
        return intersectionTypeConstructor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return C5207g.m11106a(this.f39864b, ((IntersectionTypeConstructor) obj).f39864b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39865c;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        AbstractC6795c abstractC6795cMo11234o = this.f39864b.iterator().next().mo11250X0().mo11234o();
        C5207g.m11110e(abstractC6795cMo11234o, "intersectedTypes.iterato…xt().constructor.builtIns");
        return abstractC6795cMo11234o;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection<AbstractC5257t> mo11278p() {
        return this.f39864b;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: q */
    public final InterfaceC8834e mo11235q() {
        return null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        return EmptyList.f38032a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return false;
    }

    public final String toString() {
        return m14180d(new InterfaceC2052l<AbstractC5257t, String>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(AbstractC5257t abstractC5257t) {
                AbstractC5257t abstractC5257t2 = abstractC5257t;
                C5207g.m11111f(abstractC5257t2, "it");
                return abstractC5257t2.toString();
            }
        });
    }
}
