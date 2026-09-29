package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import mn.C7648e;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9564e0 extends AbstractC9560c0 implements InterfaceC8831c0 {

    /* JADX INFO: renamed from: H */
    public AbstractC5257t f49183H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC8831c0 f49184I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9564e0(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, Modality modality, AbstractC8852n abstractC8852n, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, InterfaceC8831c0 interfaceC8831c0, InterfaceC8837f0 interfaceC8837f0) {
        InterfaceC8831c0 interfaceC8831c1;
        C9564e0 c9564e0;
        super(modality, abstractC8852n, interfaceC8829b0, interfaceC9077e, C7648e.m15234o("<get-" + interfaceC8829b0.mo11874a() + ">"), z10, z11, z12, kind, interfaceC8837f0);
        if (interfaceC9077e == null) {
            m18014N(1);
            throw null;
        }
        if (modality == null) {
            m18014N(2);
            throw null;
        }
        if (abstractC8852n == null) {
            m18014N(3);
            throw null;
        }
        if (kind == null) {
            m18014N(4);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18014N(5);
            throw null;
        }
        if (interfaceC8831c0 != null) {
            c9564e0 = this;
            interfaceC8831c1 = interfaceC8831c0;
        } else {
            interfaceC8831c1 = this;
            c9564e0 = interfaceC8831c1;
        }
        c9564e0.f49184I = interfaceC8831c1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18014N(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14058g(this, d10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p420um.AbstractC9560c0, p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8831c0 mo18004P0() {
        InterfaceC8831c0 interfaceC8831c0 = this.f49184I;
        if (interfaceC8831c0 != null) {
            return interfaceC8831c0;
        }
        m18014N(8);
        throw null;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m18016X0(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            abstractC5257t = mo13621K0().mo11884c();
        }
        this.f49183H = abstractC5257t;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        List<InterfaceC8853n0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18014N(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC8831c0> mo11893p() {
        return m18005V0(true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        return this.f49183H;
    }
}
