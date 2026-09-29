package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import p372rm.InterfaceC8838g;
import p492xn.AbstractC10252a;
import p492xn.InterfaceC10257f;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9568g0 extends AbstractC9561d {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8838g f49191c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10257f f49192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9568g0(InterfaceC8838g interfaceC8838g, AbstractC10252a abstractC10252a, InterfaceC9077e interfaceC9077e) {
        super(interfaceC9077e);
        if (interfaceC8838g == null) {
            m18020N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18020N(2);
            throw null;
        }
        this.f49191c = interfaceC8838g;
        this.f49192d = abstractC10252a;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18020N(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getValue";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                objArr[2] = "copy";
            } else if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        InterfaceC8838g interfaceC8838g = this.f49191c;
        if (interfaceC8838g != null) {
            return interfaceC8838g;
        }
        m18020N(4);
        throw null;
    }

    @Override // p372rm.InterfaceC8835e0
    public final InterfaceC10257f getValue() {
        InterfaceC10257f interfaceC10257f = this.f49192d;
        if (interfaceC10257f != null) {
            return interfaceC10257f;
        }
        m18020N(3);
        throw null;
    }
}
