package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8844j;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9582o extends AbstractC9581n implements InterfaceC8840h {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8838g f49225c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8837f0 f49226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9582o(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC9077e, c7648e);
        if (interfaceC8838g == null) {
            m18044N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18044N(1);
            throw null;
        }
        if (c7648e == null) {
            m18044N(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18044N(3);
            throw null;
        }
        this.f49225c = interfaceC8838g;
        this.f49226d = interfaceC8837f0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18044N(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public InterfaceC8844j mo11875b() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public InterfaceC8838g mo11876g() {
        InterfaceC8838g interfaceC8838g = this.f49225c;
        if (interfaceC8838g != null) {
            return interfaceC8838g;
        }
        m18044N(5);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC8837f0 mo11890j() {
        InterfaceC8837f0 interfaceC8837f0 = this.f49226d;
        if (interfaceC8837f0 != null) {
            return interfaceC8837f0;
        }
        m18044N(6);
        throw null;
    }
}
