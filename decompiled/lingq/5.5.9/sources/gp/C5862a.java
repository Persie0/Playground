package gp;

import dm.C5207g;
import java.io.EOFException;
import mo.C7653a;
import p124fp.C5608e;
import p124fp.C5619p;
import p124fp.C5623t;

/* JADX INFO: renamed from: gp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5862a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f35130a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C7653a.f42116b);
        C5207g.m11110e(bytes, "this as java.lang.String).getBytes(charset)");
        f35130a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12292a(C5623t c5623t, int i10, byte[] bArr, int i11) {
        C5623t c5623t2 = c5623t;
        int i12 = c5623t2.f34465c;
        byte[] bArr2 = c5623t2.f34463a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                c5623t2 = c5623t2.f34468f;
                C5207g.m11108c(c5623t2);
                i10 = c5623t2.f34464b;
                i12 = c5623t2.f34465c;
                bArr2 = c5623t2.f34463a;
            }
            if (bArr2[i10] != bArr[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m12293b(C5608e c5608e, long j10) throws EOFException {
        C5207g.m11111f(c5608e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c5608e.m11930G(j11) == ((byte) 13)) {
                String strM11939N0 = c5608e.m11939N0(j11);
                c5608e.skip(2L);
                return strM11939N0;
            }
        }
        String strM11939N1 = c5608e.m11939N0(j10);
        c5608e.skip(1L);
        return strM11939N1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m12294c(C5608e c5608e, C5619p c5619p, boolean z10) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        C5623t c5623t;
        C5207g.m11111f(c5608e, "<this>");
        C5207g.m11111f(c5619p, "options");
        C5623t c5623t2 = c5608e.f34434a;
        int i13 = -2;
        if (c5623t2 == null) {
            return z10 ? -2 : -1;
        }
        int i14 = c5623t2.f34464b;
        int i15 = c5623t2.f34465c;
        byte[] bArr2 = c5623t2.f34463a;
        C5623t c5623t3 = c5623t2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = c5619p.f34453b;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c5623t3 == null) {
                break;
            }
            if (i19 >= 0) {
                int i22 = i14 + 1;
                int i23 = bArr2[i14] & 255;
                int i24 = i20 + i19;
                while (i20 != i24) {
                    if (i23 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i22 == i15) {
                            c5623t3 = c5623t3.f34468f;
                            C5207g.m11108c(c5623t3);
                            i11 = c5623t3.f34464b;
                            i15 = c5623t3.f34465c;
                            bArr2 = c5623t3.f34463a;
                            if (c5623t3 == c5623t2) {
                                c5623t3 = null;
                            }
                        } else {
                            i11 = i22;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i25 = (i19 * (-1)) + i20;
            while (true) {
                int i26 = i14 + 1;
                int i27 = i20 + 1;
                if ((bArr2[i14] & 255) != iArr[i20]) {
                    return i16;
                }
                boolean z11 = i27 == i25;
                if (i26 == i15) {
                    C5207g.m11108c(c5623t3);
                    C5623t c5623t4 = c5623t3.f34468f;
                    C5207g.m11108c(c5623t4);
                    i12 = c5623t4.f34464b;
                    int i28 = c5623t4.f34465c;
                    bArr = c5623t4.f34463a;
                    if (c5623t4 != c5623t2) {
                        c5623t = c5623t4;
                        i15 = i28;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        i15 = i28;
                        c5623t = null;
                    }
                } else {
                    C5623t c5623t5 = c5623t3;
                    bArr = bArr2;
                    i12 = i26;
                    c5623t = c5623t5;
                }
                if (z11) {
                    i10 = iArr[i27];
                    i11 = i12;
                    bArr2 = bArr;
                    c5623t3 = c5623t;
                    break;
                }
                i14 = i12;
                bArr2 = bArr;
                i20 = i27;
                c5623t3 = c5623t;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        return z10 ? i13 : i16;
    }
}
