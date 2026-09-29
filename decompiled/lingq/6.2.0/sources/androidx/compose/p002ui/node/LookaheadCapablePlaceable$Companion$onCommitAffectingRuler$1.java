package androidx.compose.p002ui.node;

import kotlin.jvm.internal.Lambda;
import p000.n66;
import p000.n87;
import p000.o66;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 f4237b = new LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1(1);

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[LOOP:0: B:13:0x0027->B:23:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:24:0x0061 BREAK  A[LOOP:0: B:13:0x0027->B:23:0x005e], SYNTHETIC] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        n87 n87Var = (n87) obj;
        if (n87Var.mo1611x()) {
            AbstractC0359i abstractC0359i = n87Var.f52490b;
            if (!abstractC0359i.f4367k) {
                vi3 vi3VarMo10691e = n87Var.f52489a.mo10691e();
                n66 n66Var = abstractC0359i.f4361I;
                if (vi3VarMo10691e != null) {
                    abstractC0359i.m1632u0(n87Var, 9223372034707292159L, 0L);
                    abstractC0359i.f4363g = vi3VarMo10691e;
                } else if (n66Var != null) {
                    Object[] objArr = n66Var.f52401c;
                    long[] jArr = n66Var.f52399a;
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
                                        abstractC0359i.m1628S0((o66) objArr[(i << 3) + i3]);
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
                    n66Var.m17249a();
                }
            }
        }
        return xfa.f68157a;
    }
}
