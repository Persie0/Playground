package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.kochava.core.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class n46 implements yo2 {

    /* JADX INFO: renamed from: e */
    public String f52324e;

    /* JADX INFO: renamed from: f */
    public n8a f52325f;

    /* JADX INFO: renamed from: i */
    public boolean f52328i;

    /* JADX INFO: renamed from: k */
    public int f52330k;

    /* JADX INFO: renamed from: l */
    public int f52331l;

    /* JADX INFO: renamed from: n */
    public int f52333n;

    /* JADX INFO: renamed from: o */
    public int f52334o;

    /* JADX INFO: renamed from: s */
    public int f52338s;

    /* JADX INFO: renamed from: u */
    public boolean f52340u;

    /* JADX INFO: renamed from: d */
    public int f52323d = 0;

    /* JADX INFO: renamed from: a */
    public final k47 f52320a = new k47(2, new byte[15]);

    /* JADX INFO: renamed from: b */
    public final so0 f52321b = new so0();

    /* JADX INFO: renamed from: c */
    public final k47 f52322c = new k47();

    /* JADX INFO: renamed from: p */
    public final C3163jx f52335p = new C3163jx();

    /* JADX INFO: renamed from: q */
    public int f52336q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f52337r = -1;

    /* JADX INFO: renamed from: t */
    public long f52339t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f52329j = true;

    /* JADX INFO: renamed from: m */
    public boolean f52332m = true;

    /* JADX INFO: renamed from: g */
    public double f52326g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f52327h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) throws ParserException {
        int i;
        int i2;
        int iM21503g;
        int iM21503g2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        ImmutableList immutableListM6280B;
        int iM21503g3;
        long j3;
        boolean z;
        int i4;
        this.f52325f.getClass();
        while (k47Var.m14820a() > 0) {
            int i5 = this.f52323d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                k47 k47Var2 = this.f52322c;
                C3163jx c3163jx = this.f52335p;
                if (i5 == 1) {
                    int iM14820a = k47Var.m14820a();
                    k47 k47Var3 = this.f52320a;
                    int iMin = Math.min(iM14820a, k47Var3.m14820a());
                    k47Var.m14827k(k47Var3.f46700a, k47Var3.f46701b, iMin);
                    k47Var3.m14819N(iMin);
                    if (k47Var3.m14820a() == 0) {
                        int i9 = k47Var3.f46702c;
                        byte[] bArr2 = k47Var3.f46700a;
                        so0 so0Var = this.f52321b;
                        so0Var.m21507k(i9, bArr2);
                        so0Var.m21500d();
                        int iM14617a = jqb.m14617a(so0Var, 3, 8, 8);
                        c3163jx.f46331b = iM14617a;
                        if (iM14617a != -1) {
                            bna.m3969q(Math.max(Math.max(2, 8), 32) <= 63);
                            anb.m619a(anb.m619a(3L, 255L), 4294967296L);
                            if (so0Var.m21498b() < 2) {
                                j3 = -1;
                            } else {
                                long jM21505i = so0Var.m21505i(2);
                                if (jM21505i == 3) {
                                    if (so0Var.m21498b() >= 8) {
                                        long jM21505i2 = so0Var.m21505i(8);
                                        jM21505i += jM21505i2;
                                        if (jM21505i2 == 255) {
                                            if (so0Var.m21498b() >= 32) {
                                                jM21505i = so0Var.m21505i(32) + jM21505i;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jM21505i;
                            }
                            c3163jx.f46332c = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ParserException.m2517b("Contains sub-stream with an invalid packet label " + c3163jx.f46332c);
                                }
                                if (j3 == 0) {
                                    int i10 = c3163jx.f46331b;
                                    if (i10 == 1) {
                                        throw ParserException.m2516a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw ParserException.m2516a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw ParserException.m2516a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM14617a2 = jqb.m14617a(so0Var, 11, 24, 24);
                                c3163jx.f46333d = iM14617a2;
                                if (iM14617a2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.f52333n = 0;
                            this.f52334o = c3163jx.f46333d + i9 + this.f52334o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            k47Var3.m14818M(i4);
                            this.f52325f.mo2535e(k47Var3.f46702c, k47Var3);
                            k47Var3.m14815J(2);
                            k47Var2.m14815J(c3163jx.f46333d);
                            this.f52332m = true;
                            this.f52323d = 2;
                        } else {
                            int i11 = k47Var3.f46702c;
                            if (i11 < 15) {
                                k47Var3.m14817L(i11 + 1);
                                this.f52332m = false;
                            }
                        }
                    } else {
                        this.f52332m = false;
                    }
                } else {
                    if (i5 != 2) {
                        uk9.m22770c();
                        return;
                    }
                    int i12 = c3163jx.f46331b;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = k47Var.f46701b;
                        int iMin2 = Math.min(k47Var.m14820a(), k47Var2.m14820a());
                        k47Var.m14827k(k47Var2.f46700a, k47Var2.f46701b, iMin2);
                        k47Var2.m14819N(iMin2);
                        k47Var.m14818M(i13);
                    }
                    int iMin3 = Math.min(k47Var.m14820a(), c3163jx.f46333d - this.f52333n);
                    this.f52325f.mo2535e(iMin3, k47Var);
                    int i14 = this.f52333n + iMin3;
                    this.f52333n = i14;
                    if (i14 != c3163jx.f46333d) {
                        continue;
                    } else {
                        int i15 = c3163jx.f46331b;
                        if (i15 == 1) {
                            byte[] bArr3 = k47Var2.f46700a;
                            so0 so0Var2 = new so0(bArr3.length, bArr3);
                            int iM21503g4 = so0Var2.m21503g(8);
                            int iM21503g5 = so0Var2.m21503g(5);
                            if (iM21503g5 != 31) {
                                switch (iM21503g5) {
                                    case 0:
                                        iM21503g2 = 96000;
                                        break;
                                    case 1:
                                        iM21503g2 = 88200;
                                        break;
                                    case 2:
                                        iM21503g2 = 64000;
                                        break;
                                    case 3:
                                        iM21503g2 = 48000;
                                        break;
                                    case 4:
                                        iM21503g2 = 44100;
                                        break;
                                    case 5:
                                        iM21503g2 = 32000;
                                        break;
                                    case 6:
                                        iM21503g2 = 24000;
                                        break;
                                    case 7:
                                        iM21503g2 = 22050;
                                        break;
                                    case 8:
                                        iM21503g2 = 16000;
                                        break;
                                    case 9:
                                        iM21503g2 = 12000;
                                        break;
                                    case 10:
                                        iM21503g2 = 11025;
                                        break;
                                    case 11:
                                        iM21503g2 = 8000;
                                        break;
                                    case 12:
                                        iM21503g2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.m2517b("Unsupported sampling rate index " + iM21503g5);
                                    case 15:
                                        iM21503g2 = 57600;
                                        break;
                                    case 16:
                                        iM21503g2 = 51200;
                                        break;
                                    case 17:
                                        iM21503g2 = 40000;
                                        break;
                                    case 18:
                                        iM21503g2 = 38400;
                                        break;
                                    case 19:
                                        iM21503g2 = 34150;
                                        break;
                                    case 20:
                                        iM21503g2 = 28800;
                                        break;
                                    case 21:
                                        iM21503g2 = 25600;
                                        break;
                                    case 22:
                                        iM21503g2 = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;
                                        break;
                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        iM21503g2 = 19200;
                                        break;
                                    case 24:
                                        iM21503g2 = 17075;
                                        break;
                                    case 25:
                                        iM21503g2 = 14400;
                                        break;
                                    case 26:
                                        iM21503g2 = 12800;
                                        break;
                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        iM21503g2 = 9600;
                                        break;
                                }
                            } else {
                                iM21503g2 = so0Var2.m21503g(24);
                            }
                            int iM21503g6 = so0Var2.m21503g(3);
                            if (iM21503g6 == 0) {
                                i3 = 768;
                            } else if (iM21503g6 == 1) {
                                i3 = 1024;
                            } else if (iM21503g6 == 2 || iM21503g6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iM21503g6 != 4) {
                                    throw ParserException.m2517b("Unsupported coreSbrFrameLengthIndex " + iM21503g6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iM21503g6 == 0 || iM21503g6 == 1) {
                                c = 0;
                            } else if (iM21503g6 == 2) {
                                c = 2;
                            } else if (iM21503g6 == 3) {
                                c = 3;
                            } else {
                                if (iM21503g6 != 4) {
                                    throw ParserException.m2517b("Unsupported coreSbrFrameLengthIndex " + iM21503g6);
                                }
                                c = 1;
                            }
                            so0Var2.m21511o(2);
                            jqb.m14619c(so0Var2);
                            int iM21503g7 = so0Var2.m21503g(5);
                            int i17 = 0;
                            int iM14617a3 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iM21503g7 + 1) {
                                    int iM21503g8 = so0Var2.m21503g(3);
                                    iM14617a3 = jqb.m14617a(so0Var2, 5, 8, 16) + 1 + iM14617a3;
                                    if ((iM21503g8 == 0 || iM21503g8 == 2) && so0Var2.m21502f()) {
                                        jqb.m14619c(so0Var2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iM14617a4 = jqb.m14617a(so0Var2, 4, 8, 16) + 1;
                                    so0Var2.m21510n();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iM14617a4) {
                                            int iM21503g9 = so0Var2.m21503g(2);
                                            if (iM21503g9 == 0) {
                                                so0Var2.m21511o(i7);
                                                if (so0Var2.m21502f()) {
                                                    so0Var2.m21511o(13);
                                                }
                                                if (c > 0) {
                                                    jqb.m14618b(so0Var2);
                                                }
                                            } else if (iM21503g9 == i18) {
                                                so0Var2.m21511o(i7);
                                                boolean zM21502f = so0Var2.m21502f();
                                                if (zM21502f) {
                                                    so0Var2.m21511o(13);
                                                }
                                                if (zM21502f) {
                                                    so0Var2.m21510n();
                                                }
                                                if (c > 0) {
                                                    jqb.m14618b(so0Var2);
                                                    iM21503g3 = so0Var2.m21503g(2);
                                                } else {
                                                    iM21503g3 = 0;
                                                }
                                                if (iM21503g3 > 0) {
                                                    so0Var2.m21511o(6);
                                                    int iM21503g10 = so0Var2.m21503g(2);
                                                    so0Var2.m21511o(4);
                                                    if (so0Var2.m21502f()) {
                                                        so0Var2.m21511o(5);
                                                    }
                                                    if (iM21503g3 == 2 || iM21503g3 == i7) {
                                                        so0Var2.m21511o(6);
                                                    }
                                                    if (iM21503g10 == 2) {
                                                        so0Var2.m21510n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM14617a3 - 1) / Math.log(2.0d))) + 1;
                                                int iM21503g11 = so0Var2.m21503g(2);
                                                if (iM21503g11 > 0 && so0Var2.m21502f()) {
                                                    so0Var2.m21511o(iFloor);
                                                }
                                                if (so0Var2.m21502f()) {
                                                    so0Var2.m21511o(iFloor);
                                                }
                                                if (c == 0 && iM21503g11 == 0) {
                                                    so0Var2.m21510n();
                                                }
                                            } else if (iM21503g9 == i7) {
                                                jqb.m14617a(so0Var2, 4, i6, i19);
                                                int iM14617a5 = jqb.m14617a(so0Var2, 4, i6, i19);
                                                if (so0Var2.m21502f()) {
                                                    jqb.m14617a(so0Var2, i6, i19, 0);
                                                }
                                                so0Var2.m21510n();
                                                if (iM14617a5 > 0) {
                                                    so0Var2.m21511o(iM14617a5 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (so0Var2.m21502f()) {
                                                int i21 = 8;
                                                int iM14617a6 = jqb.m14617a(so0Var2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iM14617a6) {
                                                    int iM14617a7 = jqb.m14617a(so0Var2, 4, i21, 16);
                                                    int iM14617a8 = jqb.m14617a(so0Var2, 4, i21, 16);
                                                    if (iM14617a7 == 7) {
                                                        int iM21503g12 = so0Var2.m21503g(4) + 1;
                                                        so0Var2.m21511o(4);
                                                        byte[] bArr4 = new byte[iM21503g12];
                                                        for (int i23 = 0; i23 < iM21503g12; i23++) {
                                                            bArr4[i23] = (byte) so0Var2.m21503g(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        so0Var2.m21511o(iM14617a8 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM21503g2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.f52336q = (int) (((double) iM21503g2) * d);
                                                    this.f52337r = (int) (((double) i16) * d);
                                                    j = this.f52339t;
                                                    j2 = c3163jx.f46332c;
                                                    if (j != j2) {
                                                        this.f52339t = j2;
                                                        String strConcat = iM21503g4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM21503g4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            immutableListM6280B = null;
                                                        } else {
                                                            immutableListM6280B = ImmutableList.m6280B(uma.f64081b, bArr);
                                                        }
                                                        lc3 lc3Var = new lc3();
                                                        lc3Var.f49440a = this.f52324e;
                                                        lc3Var.f49452m = ez5.m11402l("video/mp2t");
                                                        lc3Var.f49453n = ez5.m11402l("audio/mhm1");
                                                        lc3Var.f49431G = this.f52336q;
                                                        lc3Var.f49449j = strConcat;
                                                        lc3Var.f49456q = immutableListM6280B;
                                                        this.f52325f.mo2537g(new C0713b(lc3Var));
                                                    }
                                                    i2 = 1;
                                                    this.f52340u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f52336q = (int) (((double) iM21503g2) * d);
                                                    this.f52337r = (int) (((double) i16) * d);
                                                    j = this.f52339t;
                                                    j2 = c3163jx.f46332c;
                                                    if (j != j2) {
                                                        this.f52339t = j2;
                                                        if (iM21503g4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListM6280B = null;
                                                        } else {
                                                            immutableListM6280B = null;
                                                        }
                                                        lc3 lc3Var2 = new lc3();
                                                        lc3Var2.f49440a = this.f52324e;
                                                        lc3Var2.f49452m = ez5.m11402l("video/mp2t");
                                                        lc3Var2.f49453n = ez5.m11402l("audio/mhm1");
                                                        lc3Var2.f49431G = this.f52336q;
                                                        lc3Var2.f49449j = strConcat;
                                                        lc3Var2.f49456q = immutableListM6280B;
                                                        this.f52325f.mo2537g(new C0713b(lc3Var2));
                                                    }
                                                    i2 = 1;
                                                    this.f52340u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.f52336q = (int) (((double) iM21503g2) * d);
                                                    this.f52337r = (int) (((double) i16) * d);
                                                    j = this.f52339t;
                                                    j2 = c3163jx.f46332c;
                                                    if (j != j2) {
                                                        this.f52339t = j2;
                                                        if (iM21503g4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListM6280B = null;
                                                        } else {
                                                            immutableListM6280B = null;
                                                        }
                                                        lc3 lc3Var3 = new lc3();
                                                        lc3Var3.f49440a = this.f52324e;
                                                        lc3Var3.f49452m = ez5.m11402l("video/mp2t");
                                                        lc3Var3.f49453n = ez5.m11402l("audio/mhm1");
                                                        lc3Var3.f49431G = this.f52336q;
                                                        lc3Var3.f49449j = strConcat;
                                                        lc3Var3.f49456q = immutableListM6280B;
                                                        this.f52325f.mo2537g(new C0713b(lc3Var3));
                                                    }
                                                    i2 = 1;
                                                    this.f52340u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.f52336q = (int) (((double) iM21503g2) * d);
                                                    this.f52337r = (int) (((double) i16) * d);
                                                    j = this.f52339t;
                                                    j2 = c3163jx.f46332c;
                                                    if (j != j2) {
                                                        this.f52339t = j2;
                                                        if (iM21503g4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListM6280B = null;
                                                        } else {
                                                            immutableListM6280B = null;
                                                        }
                                                        lc3 lc3Var4 = new lc3();
                                                        lc3Var4.f49440a = this.f52324e;
                                                        lc3Var4.f49452m = ez5.m11402l("video/mp2t");
                                                        lc3Var4.f49453n = ez5.m11402l("audio/mhm1");
                                                        lc3Var4.f49431G = this.f52336q;
                                                        lc3Var4.f49449j = strConcat;
                                                        lc3Var4.f49456q = immutableListM6280B;
                                                        this.f52325f.mo2537g(new C0713b(lc3Var4));
                                                    }
                                                    i2 = 1;
                                                    this.f52340u = true;
                                                    break;
                                                default:
                                                    throw ParserException.m2517b("Unsupported sampling rate " + iM21503g2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = k47Var2.f46700a;
                                so0 so0Var3 = new so0(bArr5.length, bArr5);
                                if (so0Var3.m21502f()) {
                                    so0Var3.m21511o(2);
                                    iM21503g = so0Var3.m21503g(13);
                                } else {
                                    iM21503g = 0;
                                }
                                this.f52338s = iM21503g;
                            } else if (i15 == 2) {
                                if (this.f52340u) {
                                    this.f52329j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.f52337r - this.f52338s)) * 1000000.0d) / ((double) this.f52336q);
                                long jRound = Math.round(this.f52326g);
                                if (this.f52328i) {
                                    this.f52328i = false;
                                    this.f52326g = this.f52327h;
                                } else {
                                    this.f52326g += d2;
                                }
                                this.f52325f.mo2531a(jRound, i, this.f52334o, 0, null);
                                this.f52340u = false;
                                this.f52338s = 0;
                                this.f52334o = 0;
                            }
                            i2 = 1;
                        }
                        this.f52323d = i2;
                    }
                }
            } else {
                int i24 = this.f52330k;
                if ((i24 & 2) == 0) {
                    k47Var.m14818M(k47Var.f46702c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (k47Var.m14820a() > 0) {
                                int i25 = this.f52331l << 8;
                                this.f52331l = i25;
                                int iM14842z = i25 | k47Var.m14842z();
                                this.f52331l = iM14842z;
                                if ((iM14842z & 16777215) == 12583333) {
                                    k47Var.m14818M(k47Var.f46701b - 3);
                                    this.f52331l = 0;
                                }
                            }
                        }
                    }
                    this.f52323d = 1;
                }
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f52323d = 0;
        this.f52331l = 0;
        this.f52320a.m14815J(2);
        this.f52333n = 0;
        this.f52334o = 0;
        this.f52336q = -2147483647;
        this.f52337r = -1;
        this.f52338s = 0;
        this.f52339t = -1L;
        this.f52340u = false;
        this.f52328i = false;
        this.f52332m = true;
        this.f52329j = true;
        this.f52326g = -9.223372036854776E18d;
        this.f52327h = -9.223372036854776E18d;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f52330k = i;
        if (!this.f52329j && (this.f52334o != 0 || !this.f52332m)) {
            this.f52328i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f52328i) {
                this.f52327h = j;
            } else {
                this.f52326g = j;
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f52324e = mcaVar.f51087e;
        mcaVar.m16768b();
        this.f52325f = jy2Var.mo2555n(mcaVar.f51086d, 1);
    }
}
