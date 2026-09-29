package p492xn;

import p543do.AbstractC5257t;

/* JADX INFO: renamed from: xn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10252a implements InterfaceC10257f {

    /* JADX INFO: renamed from: a */
    public final AbstractC5257t f51685a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10257f f51686b;

    public AbstractC10252a(AbstractC5257t abstractC5257t, InterfaceC10257f interfaceC10257f) {
        if (abstractC5257t == null) {
            m19218b(0);
            throw null;
        }
        this.f51685a = abstractC5257t;
        this.f51686b = interfaceC10257f == null ? this : interfaceC10257f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19218b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p492xn.InterfaceC10257f
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo17105c() {
        AbstractC5257t abstractC5257t = this.f51685a;
        if (abstractC5257t != null) {
            return abstractC5257t;
        }
        m19218b(1);
        throw null;
    }
}
