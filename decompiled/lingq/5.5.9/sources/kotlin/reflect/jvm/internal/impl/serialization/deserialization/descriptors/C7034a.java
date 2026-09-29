package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p372rm.C8854o;
import pn.AbstractC8416g;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7034a extends AbstractC8416g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List<Object> f39826a;

    public C7034a(ArrayList arrayList) {
        this.f39826a = arrayList;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i */
    public final void mo526i(CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.m14080r(callableMemberDescriptor, null);
        this.f39826a.add(callableMemberDescriptor);
    }

    @Override // pn.AbstractC8416g
    /* JADX INFO: renamed from: k0 */
    public final void mo527k0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        C5207g.m11111f(callableMemberDescriptor, "fromSuper");
        C5207g.m11111f(callableMemberDescriptor2, "fromCurrent");
        if (callableMemberDescriptor2 instanceof AbstractC6828b) {
            ((AbstractC6828b) callableMemberDescriptor2).m13638a1(C8854o.f46751a, callableMemberDescriptor);
        }
    }
}
