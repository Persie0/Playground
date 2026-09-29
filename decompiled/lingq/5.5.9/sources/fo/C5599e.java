package fo;

import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import mn.C7648e;
import p003a2.C0009a;
import p260m8.C7499b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p466wn.C9981d;

/* JADX INFO: renamed from: fo.e */
/* JADX INFO: loaded from: classes2.dex */
public class C5599e implements MemberScope {

    /* JADX INFO: renamed from: b */
    public final String f34407b;

    public C5599e(ErrorScopeKind errorScopeKind, String... strArr) {
        C5207g.m11111f(errorScopeKind, "kind");
        C5207g.m11111f(strArr, "formatParams");
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f34407b = C0166e.m770q(objArrCopyOf, objArrCopyOf.length, debugMessage, "format(this, *args)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public Set<C7648e> mo11903a() {
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public Set<C7648e> mo11906d() {
        return EmptySet.f38034a;
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
        return EmptySet.f38034a;
    }

    @Override // p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{c7648e}, 1));
        C5207g.m11110e(str, "format(this, *args)");
        return new C5595a(C7648e.m15234o(str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return C7499b.m14972w0(new C5596b(C5602h.f34420c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return C5602h.f34423f;
    }

    public String toString() {
        return C0009a.m22j(new StringBuilder("ErrorScope{"), this.f34407b, '}');
    }
}
