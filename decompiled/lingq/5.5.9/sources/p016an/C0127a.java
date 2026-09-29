package p016an;

import cm.InterfaceC2052l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p541zn.InterfaceC10548l;
import pn.AbstractC8416g;
import sl.C9072e;

/* JADX INFO: renamed from: an.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0127a extends AbstractC8416g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10548l f328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f330c;

    /* JADX INFO: renamed from: an.a$a */
    public class a implements InterfaceC2052l<CallableMemberDescriptor, C9072e> {
        public a() {
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(CallableMemberDescriptor callableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
            if (callableMemberDescriptor2 == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }
            C0127a.this.f328a.mo16921c(callableMemberDescriptor2);
            return C9072e.f47360a;
        }
    }

    public C0127a(InterfaceC10548l interfaceC10548l, LinkedHashSet linkedHashSet, boolean z10) {
        this.f328a = interfaceC10548l;
        this.f329b = linkedHashSet;
        this.f330c = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m524l0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: g0 */
    public final void mo525g0(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor == null) {
            m524l0(3);
            throw null;
        }
        if (!this.f330c || callableMemberDescriptor.mo11897u() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            callableMemberDescriptor.mo11847G0(collection);
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i */
    public final void mo526i(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m524l0(0);
            throw null;
        }
        OverridingUtil.m14080r(callableMemberDescriptor, new a());
        this.f329b.add(callableMemberDescriptor);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // pn.AbstractC8416g
    /* JADX INFO: renamed from: k0 */
    public final void mo527k0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m524l0(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        m524l0(2);
        throw null;
    }
}
