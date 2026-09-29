package p139go;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: renamed from: go.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5859m {

    /* JADX INFO: renamed from: go.m$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35129a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f35129a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final TypeVariance m12291a(Variance variance) {
        int i10 = a.f35129a[variance.ordinal()];
        if (i10 == 1) {
            return TypeVariance.INV;
        }
        if (i10 == 2) {
            return TypeVariance.IN;
        }
        if (i10 == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
