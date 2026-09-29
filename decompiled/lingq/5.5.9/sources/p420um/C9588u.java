package p420um;

import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p492xn.C10256e;
import p492xn.InterfaceC10257f;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C9588u extends AbstractC9561d {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8830c f49241c;

    /* JADX INFO: renamed from: d */
    public final C10256e f49242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9588u(AbstractC9557b abstractC9557b) {
        super(InterfaceC9077e.a.f47365a);
        if (abstractC9557b == null) {
            m18051N(0);
            throw null;
        }
        this.f49241c = abstractC9557b;
        this.f49242d = new C10256e(abstractC9557b);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18051N(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        InterfaceC8830c interfaceC8830c = this.f49241c;
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        m18051N(2);
        throw null;
    }

    @Override // p372rm.InterfaceC8835e0
    public final InterfaceC10257f getValue() {
        C10256e c10256e = this.f49242d;
        if (c10256e != null) {
            return c10256e;
        }
        m18051N(1);
        throw null;
    }

    @Override // p420um.AbstractC9581n
    public final String toString() {
        return "class " + this.f49241c.mo11874a() + "::this";
    }
}
