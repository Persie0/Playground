package androidx.compose.foundation;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.lj7;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.y56;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements vi3 {
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:0: B:10:0x0026->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[EDGE_INSN: B:28:0x0069->B:21:0x0069 BREAK  A[LOOP:0: B:10:0x0026->B:20:0x0066], SYNTHETIC] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC0075a abstractC0075a = (AbstractC0075a) this.f47704b;
        y56 y56Var = abstractC0075a.f1731Z;
        if (zBooleanValue) {
            abstractC0075a.m798k1();
        } else {
            if (abstractC0075a.f1717L != null) {
                Object[] objArr = y56Var.f69318c;
                long[] jArr = y56Var.f69316a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    wfb.m23926u(abstractC0075a.m9971N0(), null, null, new AbstractClickableNode$onFocusChange$1$1(abstractC0075a, (lj7) objArr[(i << 3) + i3], null), 3);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                lj7 lj7Var = abstractC0075a.f1733b0;
                if (lj7Var != null) {
                    wfb.m23926u(abstractC0075a.m9971N0(), null, null, new AbstractClickableNode$onFocusChange$2$1(abstractC0075a, lj7Var, null), 3);
                }
            }
            y56Var.m24939a();
            abstractC0075a.f1733b0 = null;
            abstractC0075a.mo799l1();
        }
        return xfa.f68157a;
    }
}
