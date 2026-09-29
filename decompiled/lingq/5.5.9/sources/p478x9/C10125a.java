package p478x9;

import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: x9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10125a implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public InterfaceC7509j f51308a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7522w f51309b;

    /* JADX INFO: renamed from: e */
    public b f51312e;

    /* JADX INFO: renamed from: c */
    public int f51310c = 0;

    /* JADX INFO: renamed from: d */
    public long f51311d = -1;

    /* JADX INFO: renamed from: f */
    public int f51313f = -1;

    /* JADX INFO: renamed from: g */
    public long f51314g = -1;

    /* JADX INFO: renamed from: x9.a$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: m */
        public static final int[] f51315m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n */
        public static final int[] f51316n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a */
        public final InterfaceC7509j f51317a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7522w f51318b;

        /* JADX INFO: renamed from: c */
        public final C10126b f51319c;

        /* JADX INFO: renamed from: d */
        public final int f51320d;

        /* JADX INFO: renamed from: e */
        public final byte[] f51321e;

        /* JADX INFO: renamed from: f */
        public final C10151t f51322f;

        /* JADX INFO: renamed from: g */
        public final int f51323g;

        /* JADX INFO: renamed from: h */
        public final C2416m f51324h;

        /* JADX INFO: renamed from: i */
        public int f51325i;

        /* JADX INFO: renamed from: j */
        public long f51326j;

        /* JADX INFO: renamed from: k */
        public int f51327k;

        /* JADX INFO: renamed from: l */
        public long f51328l;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a(InterfaceC7509j interfaceC7509j, InterfaceC7522w interfaceC7522w, C10126b c10126b) throws ParserException {
            this.f51317a = interfaceC7509j;
            this.f51318b = interfaceC7522w;
            this.f51319c = c10126b;
            int i10 = c10126b.f51338b;
            int iMax = Math.max(1, i10 / 10);
            this.f51323g = iMax;
            C10151t c10151t = new C10151t(c10126b.f51341e);
            c10151t.m19137l();
            int iM19137l = c10151t.m19137l();
            this.f51320d = iM19137l;
            int i11 = c10126b.f51337a;
            int i12 = c10126b.f51339c;
            int i13 = (((i12 - (i11 * 4)) * 8) / (c10126b.f51340d * i11)) + 1;
            if (iM19137l != i13) {
                throw ParserException.m6770a("Expected frames per block: " + i13 + "; got: " + iM19137l, null);
            }
            int i14 = C10134c0.f51354a;
            int i15 = ((iMax + iM19137l) - 1) / iM19137l;
            this.f51321e = new byte[i15 * i12];
            this.f51322f = new C10151t(iM19137l * 2 * i11 * i15);
            int i16 = ((i12 * i10) * 8) / iM19137l;
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = "audio/raw";
            aVar.f12496f = i16;
            aVar.f12497g = i16;
            aVar.f12502l = iMax * 2 * i11;
            aVar.f12514x = i11;
            aVar.f12515y = i10;
            aVar.f12516z = 2;
            this.f51324h = new C2416m(aVar);
        }

        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: a */
        public final void mo18981a(long j10) {
            this.f51325i = 0;
            this.f51326j = j10;
            this.f51327k = 0;
            this.f51328l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0066  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:37:0x016f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0173  */
        /* JADX WARN: Code duplicated, block: B:44:0x0055 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x0143 A[EDGE_INSN: B:48:0x0143->B:35:0x0143 BREAK  A[LOOP:1: B:17:0x0060->B:34:0x0133], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ec A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0038  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004a -> B:12:0x004c). Please report as a decompilation issue!!! */
        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: b */
        public final boolean mo18982b(C7504e c7504e, long j10) throws IOException {
            C10126b c10126b;
            int i10;
            int i11;
            boolean z10;
            long j11;
            int i12;
            C7504e c7504e2;
            byte[] bArr;
            int i13;
            C10126b c10126b2;
            boolean z11;
            int i14;
            int i15;
            int i16;
            C10151t c10151t;
            int i17;
            int i18;
            int i19;
            int i20;
            byte[] bArr2;
            int i21;
            int i22;
            int iM19041h;
            int[] iArr;
            int i23;
            int i24;
            int iM19041h2;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31 = this.f51327k;
            C10126b c10126b3 = this.f51319c;
            int i32 = i31 / (c10126b3.f51337a * 2);
            int i33 = this.f51323g;
            int i34 = C10134c0.f51354a;
            int i35 = this.f51320d;
            int i36 = ((((i33 - i32) + i35) - 1) / i35) * c10126b3.f51339c;
            if (j10 != 0) {
                c10126b = c10126b3;
                i10 = i33;
                i11 = i35;
                z10 = false;
                j11 = j10;
                i12 = i36;
                c7504e2 = c7504e;
                while (true) {
                    bArr = this.f51321e;
                    if (z10 && (i29 = this.f51325i) < i12) {
                        i30 = c7504e2.read(bArr, this.f51325i, (int) Math.min(i12 - i29, j11));
                        if (i30 == -1) {
                            break;
                        }
                        this.f51325i += i30;
                        bArr = this.f51321e;
                        if (z10) {
                        }
                    }
                    i13 = this.f51325i / c10126b.f51339c;
                    c10126b2 = this.f51319c;
                    if (i13 > 0) {
                        i15 = 0;
                        while (true) {
                            i16 = c10126b.f51339c;
                            c10151t = this.f51322f;
                            if (i15 < i13) {
                                break;
                            }
                            i19 = 0;
                            while (true) {
                                i20 = c10126b.f51337a;
                                if (i19 < i20) {
                                    bArr2 = c10151t.f51438a;
                                    int i37 = (i19 * 4) + (i15 * i16);
                                    i21 = (i20 * 4) + i37;
                                    i22 = (i16 / i20) - 4;
                                    iM19041h = (short) ((bArr[i37] & 255) | ((bArr[i37 + 1] & 255) << 8));
                                    int i38 = bArr[i37 + 2] & 255;
                                    C10126b c10126b4 = c10126b;
                                    int iMin = Math.min(i38, 88);
                                    iArr = f51316n;
                                    i23 = iArr[iMin];
                                    i24 = ((i15 * i11 * i20) + i19) * 2;
                                    bArr2[i24] = (byte) (iM19041h & 255);
                                    bArr2[i24 + 1] = (byte) (iM19041h >> 8);
                                    iM19041h2 = iMin;
                                    boolean z12 = z10;
                                    i25 = 0;
                                    while (i25 < i22 * 2) {
                                        i26 = bArr[((i25 / 8) * i20 * 4) + i21 + ((i25 / 2) % 4)] & 255;
                                        if (i25 % 2 == 0) {
                                            i27 = i26 & 15;
                                        } else {
                                            i27 = i26 >> 4;
                                        }
                                        int i39 = (((i27 & 7) * 2) + 1) * i23;
                                        byte[] bArr3 = bArr;
                                        i28 = i39 >> 3;
                                        if ((i27 & 8) != 0) {
                                            i28 = -i28;
                                        }
                                        iM19041h = C10134c0.m19041h(iM19041h + i28, -32768, 32767);
                                        i24 = (i20 * 2) + i24;
                                        bArr2[i24] = (byte) (iM19041h & 255);
                                        bArr2[i24 + 1] = (byte) (iM19041h >> 8);
                                        iM19041h2 = C10134c0.m19041h(iM19041h2 + f51315m[i27], 0, 88);
                                        i25++;
                                        bArr = bArr3;
                                        i10 = i10;
                                        i23 = iArr[iM19041h2];
                                    }
                                    i19++;
                                    z10 = z12;
                                    c10126b = c10126b4;
                                }
                            }
                            i15++;
                        }
                        i17 = i10;
                        z11 = z10;
                        int i40 = i11 * i13 * 2 * c10126b2.f51337a;
                        c10151t.m19124E(0);
                        c10151t.m19123D(i40);
                        this.f51325i -= i13 * i16;
                        int i41 = c10151t.f51440c;
                        this.f51318b.m15021c(i41, c10151t);
                        i18 = this.f51327k + i41;
                        this.f51327k = i18;
                        if (i18 / (c10126b2.f51337a * 2) >= i17) {
                            m18984d(i17);
                        }
                    } else {
                        z11 = z10;
                    }
                    if (z11 && (i14 = this.f51327k / (c10126b2.f51337a * 2)) > 0) {
                        m18984d(i14);
                    }
                    return z11;
                }
            }
            c10126b = c10126b3;
            i10 = i33;
            i11 = i35;
            j11 = j10;
            i12 = i36;
            c7504e2 = c7504e;
            z10 = true;
            while (true) {
                bArr = this.f51321e;
                if (z10) {
                }
                i13 = this.f51325i / c10126b.f51339c;
                c10126b2 = this.f51319c;
                if (i13 > 0) {
                    i15 = 0;
                    while (true) {
                        i16 = c10126b.f51339c;
                        c10151t = this.f51322f;
                        if (i15 < i13) {
                            break;
                            break;
                        }
                        i19 = 0;
                        while (true) {
                            i20 = c10126b.f51337a;
                            if (i19 < i20) {
                                bArr2 = c10151t.f51438a;
                                int i310 = (i19 * 4) + (i15 * i16);
                                i21 = (i20 * 4) + i310;
                                i22 = (i16 / i20) - 4;
                                iM19041h = (short) ((bArr[i310] & 255) | ((bArr[i310 + 1] & 255) << 8));
                                int i311 = bArr[i310 + 2] & 255;
                                C10126b c10126b5 = c10126b;
                                int iMin2 = Math.min(i311, 88);
                                iArr = f51316n;
                                i23 = iArr[iMin2];
                                i24 = ((i15 * i11 * i20) + i19) * 2;
                                bArr2[i24] = (byte) (iM19041h & 255);
                                bArr2[i24 + 1] = (byte) (iM19041h >> 8);
                                iM19041h2 = iMin2;
                                boolean z13 = z10;
                                i25 = 0;
                                while (i25 < i22 * 2) {
                                    i26 = bArr[((i25 / 8) * i20 * 4) + i21 + ((i25 / 2) % 4)] & 255;
                                    if (i25 % 2 == 0) {
                                        i27 = i26 & 15;
                                    } else {
                                        i27 = i26 >> 4;
                                    }
                                    int i312 = (((i27 & 7) * 2) + 1) * i23;
                                    byte[] bArr4 = bArr;
                                    i28 = i312 >> 3;
                                    if ((i27 & 8) != 0) {
                                        i28 = -i28;
                                    }
                                    iM19041h = C10134c0.m19041h(iM19041h + i28, -32768, 32767);
                                    i24 = (i20 * 2) + i24;
                                    bArr2[i24] = (byte) (iM19041h & 255);
                                    bArr2[i24 + 1] = (byte) (iM19041h >> 8);
                                    iM19041h2 = C10134c0.m19041h(iM19041h2 + f51315m[i27], 0, 88);
                                    i25++;
                                    bArr = bArr4;
                                    i10 = i10;
                                    i23 = iArr[iM19041h2];
                                }
                                i19++;
                                z10 = z13;
                                c10126b = c10126b5;
                            }
                        }
                        i15++;
                    }
                    i17 = i10;
                    z11 = z10;
                    int i42 = i11 * i13 * 2 * c10126b2.f51337a;
                    c10151t.m19124E(0);
                    c10151t.m19123D(i42);
                    this.f51325i -= i13 * i16;
                    int i43 = c10151t.f51440c;
                    this.f51318b.m15021c(i43, c10151t);
                    i18 = this.f51327k + i43;
                    this.f51327k = i18;
                    if (i18 / (c10126b2.f51337a * 2) >= i17) {
                        m18984d(i17);
                    }
                } else {
                    z11 = z10;
                }
                if (z11) {
                    m18984d(i14);
                }
                return z11;
                this.f51325i += i30;
            }
        }

        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: c */
        public final void mo18983c(int i10, long j10) {
            this.f51317a.mo7364c(new C10128d(this.f51319c, this.f51320d, i10, j10));
            this.f51318b.mo7388f(this.f51324h);
        }

        /* JADX INFO: renamed from: d */
        public final void m18984d(int i10) {
            long j10 = this.f51326j;
            long j11 = this.f51328l;
            C10126b c10126b = this.f51319c;
            long jM19030O = j10 + C10134c0.m19030O(j11, 1000000L, c10126b.f51338b);
            int i11 = i10 * 2 * c10126b.f51337a;
            this.f51318b.mo7387e(jM19030O, 1, i11, this.f51327k - i11, null);
            this.f51328l += (long) i10;
            this.f51327k -= i11;
        }
    }

    /* JADX INFO: renamed from: x9.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo18981a(long j10);

        /* JADX INFO: renamed from: b */
        boolean mo18982b(C7504e c7504e, long j10) throws IOException;

        /* JADX INFO: renamed from: c */
        void mo18983c(int i10, long j10) throws ParserException;
    }

    /* JADX INFO: renamed from: x9.a$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7509j f51329a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7522w f51330b;

        /* JADX INFO: renamed from: c */
        public final C10126b f51331c;

        /* JADX INFO: renamed from: d */
        public final C2416m f51332d;

        /* JADX INFO: renamed from: e */
        public final int f51333e;

        /* JADX INFO: renamed from: f */
        public long f51334f;

        /* JADX INFO: renamed from: g */
        public int f51335g;

        /* JADX INFO: renamed from: h */
        public long f51336h;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public c(InterfaceC7509j interfaceC7509j, InterfaceC7522w interfaceC7522w, C10126b c10126b, String str, int i10) throws ParserException {
            this.f51329a = interfaceC7509j;
            this.f51330b = interfaceC7522w;
            this.f51331c = c10126b;
            int i11 = c10126b.f51340d;
            int i12 = c10126b.f51337a;
            int i13 = (i11 * i12) / 8;
            int i14 = c10126b.f51339c;
            if (i14 != i13) {
                throw ParserException.m6770a("Expected block size: " + i13 + "; got: " + i14, null);
            }
            int i15 = c10126b.f51338b;
            int i16 = i15 * i13;
            int i17 = i16 * 8;
            int iMax = Math.max(i13, i16 / 10);
            this.f51333e = iMax;
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = str;
            aVar.f12496f = i17;
            aVar.f12497g = i17;
            aVar.f12502l = iMax;
            aVar.f12514x = i12;
            aVar.f12515y = i15;
            aVar.f12516z = i10;
            this.f51332d = new C2416m(aVar);
        }

        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: a */
        public final void mo18981a(long j10) {
            this.f51334f = j10;
            this.f51335g = 0;
            this.f51336h = 0L;
        }

        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: b */
        public final boolean mo18982b(C7504e c7504e, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f51335g) < (i11 = this.f51333e)) {
                int iM15022d = this.f51330b.m15022d(c7504e, (int) Math.min(i11 - i10, j11), true);
                if (iM15022d == -1) {
                    j11 = 0;
                } else {
                    this.f51335g += iM15022d;
                    j11 -= (long) iM15022d;
                }
            }
            C10126b c10126b = this.f51331c;
            int i12 = c10126b.f51339c;
            int i13 = this.f51335g / i12;
            if (i13 > 0) {
                long jM19030O = this.f51334f + C10134c0.m19030O(this.f51336h, 1000000L, c10126b.f51338b);
                int i14 = i13 * i12;
                int i15 = this.f51335g - i14;
                this.f51330b.mo7387e(jM19030O, 1, i14, i15, null);
                this.f51336h += (long) i13;
                this.f51335g = i15;
            }
            return j11 <= 0;
        }

        @Override // p478x9.C10125a.b
        /* JADX INFO: renamed from: c */
        public final void mo18983c(int i10, long j10) {
            this.f51329a.mo7364c(new C10128d(this.f51331c, 1, i10, j10));
            this.f51330b.mo7388f(this.f51332d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x018d  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        byte[] bArr;
        int i10;
        C10129a.m18993e(this.f51309b);
        int i11 = C10134c0.f51354a;
        int i12 = this.f51310c;
        int iM19054u = 4;
        if (i12 == 0) {
            C7504e c7504e = (C7504e) interfaceC7508i;
            C10129a.m18992d(c7504e.f41477d == 0);
            int i13 = this.f51313f;
            if (i13 != -1) {
                c7504e.mo14998j(i13);
                this.f51310c = 4;
            } else {
                if (!C10127c.m18985a(c7504e)) {
                    throw ParserException.m6770a("Unsupported or unrecognized wav file type.", null);
                }
                c7504e.mo14998j((int) (c7504e.mo14995d() - c7504e.f41477d));
                this.f51310c = 1;
            }
            return 0;
        }
        long jM19133h = -1;
        if (i12 == 1) {
            C10151t c10151t = new C10151t(8);
            C7504e c7504e2 = (C7504e) interfaceC7508i;
            C10127c.a aVarM18987a = C10127c.a.m18987a(c7504e2, c10151t);
            if (aVarM18987a.f51342a != 1685272116) {
                c7504e2.f41479f = 0;
            } else {
                c7504e2.m15001n(8, false);
                c10151t.m19124E(0);
                c7504e2.mo14994c(c10151t.f51438a, 0, 8, false);
                jM19133h = c10151t.m19133h();
                c7504e2.mo14998j(((int) aVarM18987a.f51343b) + 8);
            }
            this.f51311d = jM19133h;
            this.f51310c = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                C10129a.m18992d(this.f51314g != -1);
                C7504e c7504e3 = (C7504e) interfaceC7508i;
                long j10 = this.f51314g - c7504e3.f41477d;
                b bVar = this.f51312e;
                bVar.getClass();
                return bVar.mo18982b(c7504e3, j10) ? -1 : 0;
            }
            C7504e c7504e4 = (C7504e) interfaceC7508i;
            c7504e4.f41479f = 0;
            C10127c.a aVarM18986b = C10127c.m18986b(1684108385, c7504e4, new C10151t(8));
            c7504e4.mo14998j(8);
            Pair pairCreate = Pair.create(Long.valueOf(c7504e4.f41477d), Long.valueOf(aVarM18986b.f51343b));
            this.f51313f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j11 = this.f51311d;
            if (j11 != -1 && jLongValue == 4294967295L) {
                jLongValue = j11;
            }
            long j12 = ((long) this.f51313f) + jLongValue;
            this.f51314g = j12;
            long j13 = c7504e4.f41476c;
            if (j13 != -1 && j12 > j13) {
                C10145n.m19099g("WavExtractor", "Data exceeds input length: " + this.f51314g + ", " + j13);
                this.f51314g = j13;
            }
            b bVar2 = this.f51312e;
            bVar2.getClass();
            bVar2.mo18983c(this.f51313f, this.f51314g);
            this.f51310c = 4;
            return 0;
        }
        C10151t c10151t2 = new C10151t(16);
        C7504e c7504e5 = (C7504e) interfaceC7508i;
        long j14 = C10127c.m18986b(1718449184, c7504e5, c10151t2).f51343b;
        C10129a.m18992d(j14 >= 16);
        c7504e5.mo14994c(c10151t2.f51438a, 0, 16, false);
        c10151t2.m19124E(0);
        int iM19137l = c10151t2.m19137l();
        int iM19137l2 = c10151t2.m19137l();
        int iM19136k = c10151t2.m19136k();
        c10151t2.m19136k();
        int iM19137l3 = c10151t2.m19137l();
        int iM19137l4 = c10151t2.m19137l();
        int i14 = ((int) j14) - 16;
        if (i14 > 0) {
            bArr = new byte[i14];
            c7504e5.mo14994c(bArr, 0, i14, false);
        } else {
            bArr = C10134c0.f51359f;
        }
        c7504e5.mo14998j((int) (c7504e5.mo14995d() - c7504e5.f41477d));
        C10126b c10126b = new C10126b(iM19137l, iM19137l2, iM19136k, iM19137l3, iM19137l4, bArr);
        if (iM19137l == 17) {
            this.f51312e = new a(this.f51308a, this.f51309b, c10126b);
        } else if (iM19137l == 6) {
            this.f51312e = new c(this.f51308a, this.f51309b, c10126b, "audio/g711-alaw", -1);
        } else if (iM19137l == 7) {
            this.f51312e = new c(this.f51308a, this.f51309b, c10126b, "audio/g711-mlaw", -1);
        } else {
            if (iM19137l == 1) {
                iM19054u = C10134c0.m19054u(iM19137l4);
                i10 = iM19054u;
            } else {
                if (iM19137l != 3) {
                    if (iM19137l == 65534) {
                        iM19054u = C10134c0.m19054u(iM19137l4);
                        i10 = iM19054u;
                    }
                } else if (iM19137l4 == 32) {
                    i10 = iM19054u;
                }
                i10 = 0;
            }
            if (i10 == 0) {
                throw ParserException.m6772c("Unsupported WAV format type: " + iM19137l);
            }
            this.f51312e = new c(this.f51308a, this.f51309b, c10126b, "audio/raw", i10);
        }
        this.f51310c = 3;
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f51310c = j10 == 0 ? 0 : 4;
        b bVar = this.f51312e;
        if (bVar != null) {
            bVar.mo18981a(j11);
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f51308a = interfaceC7509j;
        this.f51309b = interfaceC7509j.mo7366q(0, 1);
        interfaceC7509j.mo7365i();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        return C10127c.m18985a((C7504e) interfaceC7508i);
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
