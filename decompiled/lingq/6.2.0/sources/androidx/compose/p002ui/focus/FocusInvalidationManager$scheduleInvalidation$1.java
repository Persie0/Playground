package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.node.C0357g;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.d16;
import p000.i54;
import p000.ir9;
import p000.k40;
import p000.o66;
import p000.p93;
import p000.te1;
import p000.ui3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FocusInvalidationManager$scheduleInvalidation$1 extends FunctionReferenceImpl implements ui3 {
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:7:0x0023->B:17:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[LOOP:4: B:56:0x00e5->B:66:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0118 A[EDGE_INSN: B:74:0x0118->B:67:0x0118 BREAK  A[LOOP:0: B:7:0x0023->B:17:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0118 A[EDGE_INSN: B:92:0x0118->B:67:0x0118 BREAK  A[LOOP:4: B:56:0x00e5->B:66:0x0115], SYNTHETIC] */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        k40 k40Var;
        C0299a c0299a = (C0299a) this.f47704b;
        o66 o66Var = c0299a.f3903c;
        o66 o66Var2 = c0299a.f3904d;
        C0301c c0301c = c0299a.f3901a;
        C0302d c0302dM1362h = c0301c.m1362h();
        if (c0302dM1362h == null) {
            Object[] objArr = o66Var2.f1303b;
            long[] jArr = o66Var2.f1302a;
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
                            if ((j & 255) < 128) {
                                ((p93) objArr[(i << 3) + i3]).mo971j0(FocusStateImpl.Inactive);
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
        } else if (c0302dM1362h.f34836I) {
            if (o66Var.m723a(c0302dM1362h)) {
                c0302dM1362h.m1374f1();
            }
            FocusStateImpl focusStateImplM1373e1 = c0302dM1362h.m1373e1();
            if (!c0302dM1362h.f34837a.f34836I) {
                i54.m13663b("visitAncestors called on an unattached node");
            }
            d16 d16Var = c0302dM1362h.f34837a;
            C0357g c0357gM21979L = te1.m21979L(c0302dM1362h);
            int i4 = 0;
            while (c0357gM21979L != null) {
                if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 5120) != 0) {
                    while (d16Var != null) {
                        int i5 = d16Var.f34839c;
                        if ((i5 & 5120) != 0) {
                            if ((i5 & 1024) != 0) {
                                i4++;
                            }
                            if ((d16Var instanceof p93) && o66Var2.m723a(d16Var)) {
                                if (i4 <= 1) {
                                    ((p93) d16Var).mo971j0(focusStateImplM1373e1);
                                } else {
                                    ((p93) d16Var).mo971j0(FocusStateImpl.ActiveParent);
                                }
                                o66Var2.m17819l(d16Var);
                            }
                        }
                        d16Var = d16Var.f34841e;
                    }
                }
                c0357gM21979L = c0357gM21979L.m1610w();
                d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
            }
            Object[] objArr2 = o66Var2.f1303b;
            long[] jArr2 = o66Var2.f1302a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length2) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j2 & 255) < 128) {
                                ((p93) objArr2[(i6 << 3) + i8]).mo971j0(FocusStateImpl.Inactive);
                            }
                            j2 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                        if (i6 != length2) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        if (c0301c.m1362h() == null || c0301c.f3908c.m1373e1() == FocusStateImpl.Inactive) {
            c0301c.m1359e();
        }
        o66Var.m17812e();
        o66Var2.m17812e();
        c0299a.f3905e = false;
        return xfa.f68157a;
    }
}
