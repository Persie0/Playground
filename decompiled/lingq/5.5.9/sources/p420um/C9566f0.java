package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7648e;
import mn.C7650g;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9566f0 extends AbstractC9560c0 implements InterfaceC8833d0 {

    /* JADX INFO: renamed from: H */
    public InterfaceC8853n0 f49188H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC8833d0 f49189I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9566f0(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, Modality modality, AbstractC8852n abstractC8852n, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, InterfaceC8833d0 interfaceC8833d0, InterfaceC8837f0 interfaceC8837f0) {
        InterfaceC8833d0 interfaceC8833d1;
        C9566f0 c9566f0;
        super(modality, abstractC8852n, interfaceC8829b0, interfaceC9077e, C7648e.m15234o("<set-" + interfaceC8829b0.mo11874a() + ">"), z10, z11, z12, kind, interfaceC8837f0);
        if (interfaceC9077e == null) {
            m18017N(1);
            throw null;
        }
        if (modality == null) {
            m18017N(2);
            throw null;
        }
        if (abstractC8852n == null) {
            m18017N(3);
            throw null;
        }
        if (kind == null) {
            m18017N(4);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18017N(5);
            throw null;
        }
        if (interfaceC8833d0 != null) {
            c9566f0 = this;
            interfaceC8833d1 = interfaceC8833d0;
        } else {
            interfaceC8833d1 = this;
            c9566f0 = interfaceC8833d1;
        }
        c9566f0.f49189I = interfaceC8833d1;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18017N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "parameter";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "initialize";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static C6830d m18018W0(C9566f0 c9566f0, AbstractC5257t abstractC5257t, InterfaceC9077e interfaceC9077e) {
        if (abstractC5257t == null) {
            m18017N(8);
            throw null;
        }
        if (interfaceC9077e != null) {
            return new C6830d(c9566f0, null, 0, interfaceC9077e, C7650g.f42095g, abstractC5257t, false, false, false, null, InterfaceC8837f0.f46730a);
        }
        m18017N(9);
        throw null;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14052a(this, d10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p420um.AbstractC9560c0, p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final InterfaceC8833d0 mo18004P0() {
        InterfaceC8833d0 interfaceC8833d0 = this.f49189I;
        if (interfaceC8833d0 != null) {
            return interfaceC8833d0;
        }
        m18017N(13);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        InterfaceC8853n0 interfaceC8853n0 = this.f49188H;
        if (interfaceC8853n0 == null) {
            throw new IllegalStateException();
        }
        List<InterfaceC8853n0> listSingletonList = Collections.singletonList(interfaceC8853n0);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m18017N(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC8833d0> mo11893p() {
        return m18005V0(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        AbstractC5265x abstractC5265xM13565x = DescriptorUtilsKt.m14108e(this).m13565x();
        if (abstractC5265xM13565x != null) {
            return abstractC5265xM13565x;
        }
        m18017N(12);
        throw null;
    }
}
