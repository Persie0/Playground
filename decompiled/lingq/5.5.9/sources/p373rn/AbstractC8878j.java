package p373rn;

import dm.C5207g;
import fo.C5602h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;
import sl.C9072e;

/* JADX INFO: renamed from: rn.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8878j extends AbstractC8875g<C9072e> {

    /* JADX INFO: renamed from: rn.j$a */
    public static final class a extends AbstractC8878j {

        /* JADX INFO: renamed from: b */
        public final String f46775b;

        public a(String str) {
            this.f46775b = str;
        }

        @Override // p373rn.AbstractC8875g
        /* JADX INFO: renamed from: a */
        public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
            C5207g.m11111f(interfaceC8863u, "module");
            return C5602h.m11912c(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f46775b);
        }

        @Override // p373rn.AbstractC8875g
        public final String toString() {
            return this.f46775b;
        }
    }

    public AbstractC8878j() {
        super(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: b */
    public final C9072e mo17122b() {
        throw new UnsupportedOperationException();
    }
}
