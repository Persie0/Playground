package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mn.C7648e;
import p372rm.InterfaceC8838g;
import sm.C9074b;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9581n extends C9074b implements InterfaceC8838g {

    /* JADX INFO: renamed from: b */
    public final C7648e f49224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC9581n(InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        super(interfaceC9077e);
        if (interfaceC9077e == null) {
            m18042N(0);
            throw null;
        }
        if (c7648e == null) {
            m18042N(1);
            throw null;
        }
        this.f49224b = c7648e;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18042N(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: P */
    public static String m18043P(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m18042N(4);
            throw null;
        }
        try {
            String str = DescriptorRenderer.f39547b.m14003G(interfaceC8838g) + "[" + interfaceC8838g.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC8838g)) + "]";
            if (str != null) {
                return str;
            }
            m18042N(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC8838g.getClass().getSimpleName() + " " + interfaceC8838g.mo11874a();
            if (str2 != null) {
                return str2;
            }
            m18042N(6);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        C7648e c7648e = this.f49224b;
        if (c7648e != null) {
            return c7648e;
        }
        m18042N(2);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC8838g mo11875b() {
        return this;
    }

    public String toString() {
        return m18043P(this);
    }
}
