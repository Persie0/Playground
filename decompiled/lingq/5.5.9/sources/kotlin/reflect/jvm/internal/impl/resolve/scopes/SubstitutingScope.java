package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C6740a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8841h0;
import p466wn.C9981d;
import p466wn.InterfaceC9985h;
import p543do.AbstractC5252q0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: b */
    public final MemberScope f39675b;

    /* JADX INFO: renamed from: c */
    public final TypeSubstitutor f39676c;

    /* JADX INFO: renamed from: d */
    public HashMap f39677d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9070c f39678e;

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(memberScope, "workerScope");
        C5207g.m11111f(typeSubstitutor, "givenSubstitutor");
        this.f39675b = memberScope;
        AbstractC5252q0 abstractC5252q0M14202g = typeSubstitutor.m14202g();
        C5207g.m11110e(abstractC5252q0M14202g, "givenSubstitutor.substitution");
        this.f39676c = TypeSubstitutor.m14199e(CapturedTypeConstructorKt.m14099b(abstractC5252q0M14202g));
        this.f39678e = C6740a.m13372a(new InterfaceC2041a<Collection<? extends InterfaceC8838g>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends InterfaceC8838g> mo807E() {
                SubstitutingScope substitutingScope = this.f39679b;
                return substitutingScope.m14118h(InterfaceC9985h.a.m18558a(substitutingScope.f39675b, null, 3));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        return this.f39675b.mo11903a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return m14118h(this.f39675b.mo11904b(c7648e, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return m14118h(this.f39675b.mo11905c(c7648e, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        return this.f39675b.mo11906d();
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return (Collection) this.f39678e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        return this.f39675b.mo11907f();
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        InterfaceC8834e interfaceC8834eMo5304g = this.f39675b.mo5304g(c7648e, noLookupLocation);
        if (interfaceC8834eMo5304g != null) {
            return (InterfaceC8834e) m14119i(interfaceC8834eMo5304g);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final <D extends InterfaceC8838g> Collection<D> m14118h(Collection<? extends D> collection) {
        if (!this.f39676c.m14203h() && !collection.isEmpty()) {
            int size = collection.size();
            int i10 = 3;
            if (size >= 3) {
                i10 = (size / 3) + size + 1;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(m14119i((InterfaceC8838g) it.next()));
            }
            return linkedHashSet;
        }
        return collection;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final <D extends InterfaceC8838g> D m14119i(D d10) {
        TypeSubstitutor typeSubstitutor = this.f39676c;
        if (typeSubstitutor.m14203h()) {
            return d10;
        }
        if (this.f39677d == null) {
            this.f39677d = new HashMap();
        }
        HashMap map = this.f39677d;
        C5207g.m11108c(map);
        Object objMo5312d = map.get(d10);
        if (objMo5312d == null) {
            if (!(d10 instanceof InterfaceC8841h0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            objMo5312d = ((InterfaceC8841h0) d10).mo5312d(typeSubstitutor);
            if (objMo5312d == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, objMo5312d);
        }
        return (D) objMo5312d;
    }
}
