package p543do;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5250p0 extends AbstractC5248o0 {

    /* JADX INFO: renamed from: a */
    public final Variance f33342a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5257t f33343b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5250p0(AbstractC5257t abstractC5257t) {
        this(abstractC5257t, Variance.INVARIANT);
        if (abstractC5257t != null) {
        } else {
            m11285a(2);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5250p0(AbstractC5257t abstractC5257t, Variance variance) {
        if (variance == null) {
            m11285a(0);
            throw null;
        }
        if (abstractC5257t == null) {
            m11285a(1);
            throw null;
        }
        this.f33342a = variance;
        this.f33343b = abstractC5257t;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11285a(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11236c() {
        AbstractC5257t abstractC5257t = this.f33343b;
        if (abstractC5257t != null) {
            return abstractC5257t;
        }
        m11285a(5);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: d */
    public final Variance mo11237d() {
        Variance variance = this.f33342a;
        if (variance != null) {
            return variance;
        }
        m11285a(4);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: e */
    public final InterfaceC5246n0 mo11238e(AbstractC5439d abstractC5439d) {
        if (abstractC5439d != null) {
            return new C5250p0(abstractC5439d.mo11663o0(this.f33343b), this.f33342a);
        }
        m11285a(6);
        throw null;
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: f */
    public final boolean mo11239f() {
        return false;
    }
}
