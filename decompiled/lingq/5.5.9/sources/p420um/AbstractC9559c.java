package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import co.InterfaceC2076h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9559c extends AbstractC9571i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC9559c(InterfaceC2076h interfaceC2076h, InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, Variance variance, boolean z10, int i10, InterfaceC8843i0 interfaceC8843i0) {
        super(interfaceC2076h, interfaceC8838g, interfaceC9077e, c7648e, variance, z10, i10, interfaceC8843i0);
        if (interfaceC2076h == null) {
            m18002N(0);
            throw null;
        }
        if (interfaceC8838g == null) {
            m18002N(1);
            throw null;
        }
        if (c7648e == null) {
            m18002N(3);
            throw null;
        }
        if (variance == null) {
            m18002N(4);
            throw null;
        }
        if (interfaceC8843i0 != null) {
        } else {
            m18002N(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18002N(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p420um.AbstractC9581n
    public final String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.f49196f ? "reified " : "";
        if (mo17088n() != Variance.INVARIANT) {
            str = mo17088n() + " ";
        }
        objArr[1] = str;
        objArr[2] = mo11874a();
        return String.format("%s%s%s", objArr);
    }
}
