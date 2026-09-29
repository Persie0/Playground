package p411u9;

import java.io.IOException;
import p261m9.InterfaceC7508i;
import p479xa.C10151t;

/* JADX INFO: renamed from: u9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9487j {

    /* JADX INFO: renamed from: a */
    public static final int[] f48728a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [m9.i] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /* JADX INFO: renamed from: a */
    public static boolean m17930a(InterfaceC7508i interfaceC7508i, boolean z10, boolean z11) throws IOException {
        ?? r10;
        boolean z12;
        ?? r11;
        boolean z13;
        long jM19138m;
        int i10;
        ?? r12;
        boolean z14;
        long jMo14992a = interfaceC7508i.mo14992a();
        long j10 = -1;
        long j11 = 4096;
        if (jMo14992a != -1 && jMo14992a <= 4096) {
            j11 = jMo14992a;
        }
        int i11 = (int) j11;
        C10151t c10151t = new C10151t(64);
        ?? r13 = 0;
        int i12 = 0;
        boolean z15 = false;
        while (true) {
            if (i12 < i11) {
                c10151t.m19121B(8);
                if (interfaceC7508i.mo14994c(c10151t.f51438a, r13, 8, true)) {
                    long jM19146u = c10151t.m19146u();
                    int iM19129d = c10151t.m19129d();
                    if (jM19146u == 1) {
                        interfaceC7508i.mo14999l(c10151t.f51438a, 8, 8);
                        i10 = 16;
                        c10151t.m19123D(16);
                        jM19138m = c10151t.m19138m();
                    } else {
                        if (jM19146u == 0) {
                            long jMo14992a2 = interfaceC7508i.mo14992a();
                            if (jMo14992a2 != j10) {
                                jM19146u = (jMo14992a2 - interfaceC7508i.mo14995d()) + ((long) 8);
                            }
                        }
                        jM19138m = jM19146u;
                        i10 = 8;
                    }
                    long j12 = i10;
                    if (jM19138m < j12) {
                        return r13;
                    }
                    i12 += i10;
                    if (iM19129d == 1836019574) {
                        i11 += (int) jM19138m;
                        if (jMo14992a != -1 && i11 > jMo14992a) {
                            i11 = (int) jMo14992a;
                        }
                        r12 = r13;
                    } else if (iM19129d == 1836019558 || iM19129d == 1836475768) {
                        r11 = r13;
                        z12 = true;
                        z13 = true;
                    } else if ((((long) i12) + jM19138m) - j12 >= i11) {
                        r10 = 0;
                        z12 = true;
                        z13 = r10 == true ? 1 : 0;
                        r11 = r10;
                    } else {
                        int i13 = (int) (jM19138m - j12);
                        i12 += i13;
                        if (iM19129d != 1718909296) {
                            r12 = 0;
                            r12 = 0;
                            if (i13 != 0) {
                                interfaceC7508i.mo14996f(i13);
                            }
                        } else {
                            if (i13 < 8) {
                                return false;
                            }
                            c10151t.m19121B(i13);
                            interfaceC7508i.mo14999l(c10151t.f51438a, 0, i13);
                            int i14 = i13 / 4;
                            for (int i15 = 0; i15 < i14; i15++) {
                                if (i15 != 1) {
                                    int iM19129d2 = c10151t.m19129d();
                                    if ((iM19129d2 >>> 8) == 3368816 || (iM19129d2 == 1751476579 && z11)) {
                                        z14 = true;
                                        break;
                                    }
                                    int[] iArr = f48728a;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= 29) {
                                            z14 = false;
                                            break;
                                        }
                                        if (iArr[i16] == iM19129d2) {
                                            z14 = true;
                                            break;
                                        }
                                        i16++;
                                    }
                                    if (z14) {
                                        z15 = true;
                                        break;
                                    }
                                } else {
                                    c10151t.m19125F(4);
                                }
                            }
                            r12 = 0;
                            if (!z15) {
                                return false;
                            }
                        }
                    }
                    r13 = r12;
                    j10 = -1;
                    z15 = z15;
                }
                return (z15 || z10 != z13) ? r11 : z12;
            }
            r10 = r13;
            z12 = true;
            z13 = r10 == true ? 1 : 0;
            r11 = r10;
            if (z15) {
            }
        }
    }
}
