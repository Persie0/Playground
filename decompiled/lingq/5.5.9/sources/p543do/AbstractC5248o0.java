package p543do;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: do.o0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5248o0 implements InterfaceC5246n0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5246n0)) {
            return false;
        }
        InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) obj;
        return mo11239f() == interfaceC5246n0.mo11239f() && mo11237d() == interfaceC5246n0.mo11237d() && mo11236c().equals(interfaceC5246n0.mo11236c());
    }

    public final int hashCode() {
        int iHashCode = mo11237d().hashCode();
        if (C5258t0.m11305p(mo11236c())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo11239f() ? 17 : mo11236c().hashCode());
    }

    public final String toString() {
        if (mo11239f()) {
            return "*";
        }
        if (mo11237d() == Variance.INVARIANT) {
            return mo11236c().toString();
        }
        return mo11237d() + " " + mo11236c();
    }
}
