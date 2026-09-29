package p420um;

import co.InterfaceC2076h;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;

/* JADX INFO: renamed from: um.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9575k extends AbstractC9557b {

    /* JADX INFO: renamed from: e */
    public final InterfaceC8838g f49206e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8837f0 f49207f;

    /* JADX INFO: renamed from: g */
    public final boolean f49208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC9575k(InterfaceC2076h interfaceC2076h, InterfaceC8838g interfaceC8838g, C7648e c7648e, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC2076h, c7648e);
        if (interfaceC2076h == null) {
            m18031J0(0);
            throw null;
        }
        if (interfaceC8838g == null) {
            m18031J0(1);
            throw null;
        }
        if (c7648e == null) {
            m18031J0(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18031J0(3);
            throw null;
        }
        this.f49206e = interfaceC8838g;
        this.f49207f = interfaceC8837f0;
        this.f49208g = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m18031J0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: D */
    public boolean mo5293D() {
        return this.f49208g;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        InterfaceC8838g interfaceC8838g = this.f49206e;
        if (interfaceC8838g != null) {
            return interfaceC8838g;
        }
        m18031J0(4);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        InterfaceC8837f0 interfaceC8837f0 = this.f49207f;
        if (interfaceC8837f0 != null) {
            return interfaceC8837f0;
        }
        m18031J0(5);
        throw null;
    }
}
