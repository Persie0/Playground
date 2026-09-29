package p420um;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import pn.AbstractC8416g;

/* JADX INFO: renamed from: um.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C9585r extends AbstractC8416g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f49238a;

    public C9585r(LinkedHashSet linkedHashSet) {
        this.f49238a = linkedHashSet;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m18050l0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: i */
    public final void mo526i(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m18050l0(0);
            throw null;
        }
        OverridingUtil.m14080r(callableMemberDescriptor, null);
        this.f49238a.add(callableMemberDescriptor);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pn.AbstractC8416g
    /* JADX INFO: renamed from: k0 */
    public final void mo527k0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m18050l0(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        m18050l0(2);
        throw null;
    }
}
