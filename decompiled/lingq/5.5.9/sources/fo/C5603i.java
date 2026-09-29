package fo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import mn.C7648e;
import p003a2.C0009a;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p466wn.C9981d;

/* JADX INFO: renamed from: fo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5603i extends C5599e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5603i(ErrorScopeKind errorScopeKind, String... strArr) {
        super(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        C5207g.m11111f(errorScopeKind, "kind");
        C5207g.m11111f(strArr, "formatParams");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // fo.C5599e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set<C7648e> mo11903a() {
        throw new IllegalStateException();
    }

    @Override // fo.C5599e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        mo11904b(c7648e, noLookupLocation);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // fo.C5599e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        mo11905c(c7648e, noLookupLocation);
        throw null;
    }

    @Override // fo.C5599e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public final Set<C7648e> mo11906d() {
        throw new IllegalStateException();
    }

    @Override // fo.C5599e, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        throw new IllegalStateException(this.f34407b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // fo.C5599e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: f */
    public final Set<C7648e> mo11907f() {
        throw new IllegalStateException();
    }

    @Override // fo.C5599e, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        throw new IllegalStateException(this.f34407b + ", required name: " + c7648e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // fo.C5599e
    /* JADX INFO: renamed from: h */
    public final Set mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        throw new IllegalStateException(this.f34407b + ", required name: " + c7648e);
    }

    @Override // fo.C5599e
    /* JADX INFO: renamed from: i */
    public final Set mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        throw new IllegalStateException(this.f34407b + ", required name: " + c7648e);
    }

    @Override // fo.C5599e
    public final String toString() {
        return C0009a.m22j(new StringBuilder("ThrowingScope{"), this.f34407b, '}');
    }
}
