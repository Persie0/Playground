package p492xn;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: xn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10255d extends AbstractC10252a {

    /* JADX INFO: renamed from: c */
    public final InterfaceC6816a f51689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C10255d(InterfaceC6816a interfaceC6816a, AbstractC5257t abstractC5257t, InterfaceC10257f interfaceC10257f) {
        super(abstractC5257t, interfaceC10257f);
        if (interfaceC6816a == null) {
            m19219b(0);
            throw null;
        }
        if (abstractC5257t == null) {
            m19219b(1);
            throw null;
        }
        this.f51689c = interfaceC6816a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19219b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public final String toString() {
        return mo17105c() + ": Ext {" + this.f51689c + "}";
    }
}
