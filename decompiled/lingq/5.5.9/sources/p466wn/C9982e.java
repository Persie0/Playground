package p466wn;

import dm.C5207g;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p372rm.InterfaceC8838g;
import pn.AbstractC8416g;

/* JADX INFO: renamed from: wn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9982e extends AbstractC8416g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList<InterfaceC8838g> f50732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GivenFunctionsMemberScope f50733b;

    public C9982e(ArrayList<InterfaceC8838g> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f50732a = arrayList;
        this.f50733b = givenFunctionsMemberScope;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i */
    public final void mo526i(CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.m14080r(callableMemberDescriptor, null);
        this.f50732a.add(callableMemberDescriptor);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pn.AbstractC8416g
    /* JADX INFO: renamed from: k0 */
    public final void mo527k0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        C5207g.m11111f(callableMemberDescriptor, "fromSuper");
        C5207g.m11111f(callableMemberDescriptor2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f50733b.f39661b + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
    }
}
