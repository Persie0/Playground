package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.List;
import mn.C7648e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8855o0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.l0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9578l0 extends AbstractC9582o implements InterfaceC8855o0 {

    /* JADX INFO: renamed from: e */
    public AbstractC5257t f49218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public AbstractC9578l0(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, AbstractC5257t abstractC5257t, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8838g, interfaceC9077e, c7648e, interfaceC8837f0);
        if (interfaceC8838g == null) {
            m18039N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18039N(1);
            throw null;
        }
        if (c7648e == null) {
            m18039N(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18039N(3);
            throw null;
        }
        this.f49218e = abstractC5257t;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18039N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getValueParameters";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean mo5278M() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8851m0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11884c() {
        AbstractC5257t abstractC5257t = this.f49218e;
        if (abstractC5257t != null) {
            return abstractC5257t;
        }
        m18039N(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        List<InterfaceC8853n0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18039N(6);
        throw null;
    }

    /* JADX INFO: renamed from: m0 */
    public InterfaceC8835e0 mo11892m0() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public List<InterfaceC8847k0> mo11895r() {
        List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18039N(8);
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public InterfaceC8835e0 mo11896s0() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public AbstractC5257t mo11900y() {
        AbstractC5257t abstractC5257tMo11884c = mo11884c();
        if (abstractC5257tMo11884c != null) {
            return abstractC5257tMo11884c;
        }
        m18039N(10);
        throw null;
    }
}
