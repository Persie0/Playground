package p373rn;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: rn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8873e extends AbstractC8881m {
    public C8873e(char c10) {
        super(Character.valueOf(c10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        AbstractC6795c abstractC6795cMo11877o = interfaceC8863u.mo11877o();
        abstractC6795cMo11877o.getClass();
        AbstractC5265x abstractC5265xM13562t = abstractC6795cMo11877o.m13562t(PrimitiveType.CHAR);
        if (abstractC5265xM13562t != null) {
            return abstractC5265xM13562t;
        }
        AbstractC6795c.m13540a(62);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p373rn.AbstractC8875g
    public final String toString() {
        String strValueOf;
        Object[] objArr = new Object[2];
        T t10 = this.f46772a;
        boolean z10 = false;
        objArr[0] = Integer.valueOf(((Character) t10).charValue());
        char cCharValue = ((Character) t10).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                z10 = true;
            }
            strValueOf = z10 ? String.valueOf(cCharValue) : "?";
        }
        objArr[1] = strValueOf;
        return C0166e.m770q(objArr, 2, "\\u%04X ('%s')", "format(this, *args)");
    }
}
