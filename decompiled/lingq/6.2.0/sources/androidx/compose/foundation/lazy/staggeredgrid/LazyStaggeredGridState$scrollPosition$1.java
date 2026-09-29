package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.AbstractC3550rv;
import p000.C3047gq;
import p000.dw4;
import p000.l54;
import p000.xc9;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C0144d c0144d = (C0144d) this.f47704b;
        C3047gq c3047gq = c0144d.f2602e;
        int[] iArr = new int[iIntValue2];
        int iMin = 0;
        if (((dw4) ((xc9) c0144d.f2601d).getValue()).f36304j.m4517s(iIntValue)) {
            AbstractC3550rv.m20834b0(iIntValue, 0, 6, iArr);
            return iArr;
        }
        c3047gq.m12802f(iIntValue + iIntValue2);
        int iM12806j = c3047gq.m12806j(iIntValue);
        if (iM12806j != -2 && iM12806j != -1) {
            if (iM12806j < 0) {
                l54.m15814a("Expected positive lane number, got " + iM12806j + " instead.");
            }
            iMin = Math.min(iM12806j, iIntValue2);
        }
        int iM12803g = iIntValue;
        for (int i = iMin - 1; -1 < i; i--) {
            iM12803g = c3047gq.m12803g(iM12803g, i);
            iArr[i] = iM12803g;
            if (iM12803g == -1) {
                AbstractC3550rv.m20834b0(-1, i, 2, iArr);
                break;
            }
        }
        iArr[iMin] = iIntValue;
        while (true) {
            iMin++;
            if (iMin >= iIntValue2) {
                return iArr;
            }
            iIntValue++;
            int length = c3047gq.f41171b + ((int[]) c3047gq.f41172c).length;
            while (true) {
                if (iIntValue >= length) {
                    iIntValue = c3047gq.f41171b + ((int[]) c3047gq.f41172c).length;
                    break;
                }
                if (c3047gq.m12800c(iIntValue, iMin)) {
                    break;
                }
                iIntValue++;
            }
            iArr[iMin] = iIntValue;
        }
    }
}
