package p000;

import android.util.Pair;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.AbstractC1110a;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ai0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f687a;

    static {
        String str = uma.f64080a;
        f687a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static void m422a(k47 k47Var) {
        int i = k47Var.f46701b;
        k47Var.m14819N(4);
        if (k47Var.m14829m() != 1751411826) {
            i += 4;
        }
        k47Var.m14818M(i);
    }

    /* JADX WARN: Code duplicated, block: B:205:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:274:0x0594  */
    /* JADX WARN: Code duplicated, block: B:286:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:292:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:366:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX INFO: renamed from: b */
    public static void m423b(k47 k47Var, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, xh0 xh0Var, int i5) throws ParserException {
        int iM14812G;
        int i6;
        int iM14812G2;
        int iM14829m;
        int i7;
        int i8;
        int i9;
        DrmInitData drmInitDataM2514a;
        String str2;
        int iM22825t;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zM21502f;
        int iM21503g;
        int iM21503g2;
        int i19;
        int i20;
        boolean z2;
        boolean zM21502f2;
        int i21;
        int iM21503g3;
        String str4;
        k47 k47Var2 = k47Var;
        int iIntValue = i;
        int i22 = i3;
        k47Var2.m14818M(i2 + 16);
        if (z) {
            iM14812G = k47Var2.m14812G();
            k47Var2.m14819N(6);
        } else {
            k47Var2.m14819N(8);
            iM14812G = 0;
        }
        int i23 = 32;
        if (iM14812G == 0 || iM14812G == 1) {
            i6 = 2;
            iM14812G2 = k47Var2.m14812G();
            k47Var2.m14819N(6);
            int iM14806A = k47Var2.m14806A();
            k47Var2.m14818M(k47Var2.f46701b - 4);
            iM14829m = k47Var2.m14829m();
            if (iM14812G == 1) {
                k47Var2.m14819N(16);
            }
            i7 = iM14806A;
            i8 = -1;
        } else {
            if (iM14812G != 2) {
                return;
            }
            k47Var2.m14819N(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(k47Var2.m14836t()));
            int iM14809D = k47Var2.m14809D();
            k47Var2.m14819N(4);
            i6 = 2;
            int iM14809D2 = k47Var2.m14809D();
            int iM14809D3 = k47Var2.m14809D();
            boolean z3 = (iM14809D3 & 1) != 0;
            boolean z4 = (iM14809D3 & 2) != 0;
            if (z3) {
                if (z4 || iM14809D2 != 32) {
                    i8 = -1;
                } else {
                    i8 = 4;
                }
            } else if (iM14809D2 == 8) {
                i8 = 3;
            } else if (iM14809D2 == 16) {
                i8 = z4 ? 268435456 : 2;
            } else if (iM14809D2 == 24) {
                i8 = z4 ? 1342177280 : 21;
            } else if (iM14809D2 == 32) {
                i8 = z4 ? 1610612736 : 22;
            } else {
                i8 = -1;
            }
            k47Var2.m14819N(8);
            i7 = iRound;
            iM14812G2 = iM14809D;
            iM14829m = 0;
        }
        if (iIntValue == 1767992678) {
            iM14812G2 = -1;
            i7 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i9 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i7 = i9;
            iM14812G2 = 1;
        }
        int i24 = k47Var2.f46701b;
        if (iIntValue == 1701733217) {
            Pair pairM429h = m429h(k47Var2, i2, i22);
            if (pairM429h != null) {
                iIntValue = ((Integer) pairM429h.first).intValue();
                drmInitDataM2514a = drmInitData == null ? null : drmInitData.m2514a(((h8a) pairM429h.second).f41996b);
                ((h8a[]) xh0Var.f68194c)[i5] = (h8a) pairM429h.second;
            } else {
                drmInitDataM2514a = drmInitData;
            }
            k47Var2.m14818M(i24);
        } else {
            drmInitDataM2514a = drmInitData;
        }
        String str5 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            iM22825t = i8;
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            iM22825t = i8;
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            iM22825t = i8;
            str2 = "audio/ac4";
        } else {
            if (iIntValue == 1685353315) {
                str2 = "audio/vnd.dts";
            } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
                str2 = "audio/vnd.dts.hd";
            } else if (iIntValue == 1685353317) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (iIntValue == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (iIntValue == 1935764850) {
                str2 = "audio/3gpp";
            } else if (iIntValue == 1935767394) {
                str2 = "audio/amr-wb";
            } else if (iIntValue == 1936684916) {
                iM22825t = i6;
                str2 = "audio/raw";
            } else if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                iM22825t = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i8 == -1) {
                    iM22825t = i6;
                } else {
                    iM22825t = i8;
                }
                str2 = "audio/raw";
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else if (iIntValue == 1767992678) {
                str2 = "audio/iamf";
            } else {
                iM22825t = i8;
                str2 = null;
            }
            iM22825t = i8;
        }
        vh0 vh0Var = null;
        String strM17735j = null;
        List listM6291y = null;
        th0 th0Var = null;
        while (i24 - i2 < i22) {
            k47Var2.m14818M(i24);
            int iM14829m2 = k47Var2.m14829m();
            iM22825t = iM22825t;
            ucd.m22677a("childAtomSize must be positive", iM14829m2 > 0);
            int iM14829m3 = k47Var2.m14829m();
            strM17735j = strM17735j;
            if (iM14829m3 == 1835557187) {
                k47Var2.m14818M(i24 + 8);
                k47Var2.m14819N(1);
                int iM14842z = k47Var2.m14842z();
                k47Var2.m14819N(1);
                strM17735j = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(iM14842z)) : String.format("mha1.%02X", Integer.valueOf(iM14842z));
                int iM14812G3 = k47Var2.m14812G();
                byte[] bArr = new byte[iM14812G3];
                str3 = str2;
                k47Var2.m14827k(bArr, 0, iM14812G3);
                listM6291y = listM6291y == null ? ImmutableList.m6291y(bArr) : ImmutableList.m6280B(bArr, (byte[]) listM6291y.get(0));
            } else {
                str3 = str2;
                if (iM14829m3 == 1835557200) {
                    k47Var2.m14818M(i24 + 8);
                    int iM14842z2 = k47Var2.m14842z();
                    if (iM14842z2 > 0) {
                        byte[] bArr2 = new byte[iM14842z2];
                        k47Var2.m14827k(bArr2, 0, iM14842z2);
                        listM6291y = listM6291y == null ? ImmutableList.m6291y(bArr2) : ImmutableList.m6280B((byte[]) listM6291y.get(0), bArr2);
                    }
                    listM6291y = listM6291y;
                    strM17735j = strM17735j;
                } else {
                    if (iM14829m3 == 1702061171) {
                        i10 = 1702061171;
                    } else if (z && iM14829m3 == 2002876005) {
                        i10 = 1702061171;
                    } else if (iM14829m3 == 1651798644) {
                        k47Var2.m14818M(i24 + 8);
                        k47Var2.m14819N(4);
                        th0Var = new th0(k47Var2.m14807B(), k47Var2.m14807B());
                        i24 = i24;
                        str5 = str5;
                        listM6291y = listM6291y;
                        iM22825t = iM22825t;
                        strM17735j = strM17735j;
                        iM14829m2 = iM14829m2;
                        str3 = str3;
                        iIntValue = iIntValue;
                    } else {
                        iM14829m2 = iM14829m2;
                        int[] iArr = jx1.f46338d;
                        int[] iArr2 = jx1.f46336b;
                        if (iM14829m3 == 1684103987) {
                            k47Var2.m14818M(i24 + 8);
                            String string = Integer.toString(i4);
                            so0 so0Var = new so0();
                            so0Var.m21508l(k47Var2);
                            int i25 = iArr2[so0Var.m21503g(i6)];
                            so0Var.m21511o(8);
                            int i26 = iArr[so0Var.m21503g(3)];
                            if (so0Var.m21503g(1) != 0) {
                                i26++;
                            }
                            int i27 = jx1.f46339e[so0Var.m21503g(5)] * DescriptorProtos.Edition.EDITION_2023_VALUE;
                            so0Var.m21499c();
                            k47Var2.m14818M(so0Var.m21500d());
                            lc3 lc3Var = new lc3();
                            lc3Var.f49440a = string;
                            lc3Var.f49453n = ez5.m11402l("audio/ac3");
                            lc3Var.f49430F = i26;
                            lc3Var.f49431G = i25;
                            lc3Var.f49457r = drmInitDataM2514a;
                            lc3Var.f49443d = str;
                            lc3Var.f49447h = i27;
                            lc3Var.f49448i = i27;
                            xh0Var.f68195d = new C0713b(lc3Var);
                        } else if (iM14829m3 == 1684366131) {
                            k47Var2.m14818M(i24 + 8);
                            String string2 = Integer.toString(i4);
                            so0 so0Var2 = new so0();
                            so0Var2.m21508l(k47Var2);
                            int iM21503g4 = so0Var2.m21503g(13) * DescriptorProtos.Edition.EDITION_2023_VALUE;
                            so0Var2.m21511o(3);
                            int i28 = iArr2[so0Var2.m21503g(2)];
                            so0Var2.m21511o(10);
                            int i29 = iArr[so0Var2.m21503g(3)];
                            if (so0Var2.m21503g(1) != 0) {
                                i29++;
                            }
                            so0Var2.m21511o(3);
                            int iM21503g5 = so0Var2.m21503g(4);
                            so0Var2.m21511o(1);
                            int i30 = i29;
                            if (iM21503g5 > 0) {
                                so0Var2.m21511o(6);
                                i29 = so0Var2.m21503g(1) != 0 ? i30 + 2 : i30;
                                so0Var2.m21511o(1);
                            }
                            if (so0Var2.m21498b() > 7) {
                                so0Var2.m21511o(7);
                                if (so0Var2.m21503g(1) != 0) {
                                    str4 = "audio/eac3-joc";
                                } else {
                                    str4 = "audio/eac3";
                                }
                            } else {
                                str4 = "audio/eac3";
                            }
                            so0Var2.m21499c();
                            k47Var2.m14818M(so0Var2.m21500d());
                            lc3 lc3Var2 = new lc3();
                            lc3Var2.f49440a = string2;
                            lc3Var2.f49453n = ez5.m11402l(str4);
                            lc3Var2.f49430F = i29;
                            lc3Var2.f49431G = i28;
                            lc3Var2.f49457r = drmInitDataM2514a;
                            lc3Var2.f49443d = str;
                            lc3Var2.f49448i = iM21503g4;
                            xh0Var.f68195d = new C0713b(lc3Var2);
                        } else {
                            str5 = str5;
                            listM6291y = listM6291y;
                            if (iM14829m3 == 1684103988) {
                                k47Var2.m14818M(i24 + 8);
                                String string3 = Integer.toString(i4);
                                so0 so0Var3 = new so0();
                                so0Var3.m21508l(k47Var2);
                                int iM21498b = so0Var3.m21498b();
                                int iM21503g6 = so0Var3.m21503g(3);
                                if (iM21503g6 > 1) {
                                    throw ParserException.m2517b("Unsupported AC-4 DSI version: " + iM21503g6);
                                }
                                int iM21503g7 = so0Var3.m21503g(7);
                                int i31 = so0Var3.m21502f() ? 48000 : 44100;
                                so0Var3.m21511o(4);
                                int iM21503g8 = so0Var3.m21503g(9);
                                if (iM21503g7 > 1) {
                                    if (iM21503g6 == 0) {
                                        throw ParserException.m2517b("Invalid AC-4 DSI version: " + iM21503g6);
                                    }
                                    if (so0Var3.m21502f()) {
                                        so0Var3.m21511o(16);
                                        if (so0Var3.m21502f()) {
                                            so0Var3.m21511o(128);
                                        }
                                    }
                                }
                                if (iM21503g6 == 1) {
                                    if (so0Var3.m21498b() < 66) {
                                        throw ParserException.m2517b("Invalid AC-4 DSI bitrate.");
                                    }
                                    so0Var3.m21511o(66);
                                    so0Var3.m21499c();
                                }
                                C3169k2 c3169k2 = new C3169k2();
                                c3169k2.f46565a = true;
                                c3169k2.f46566b = -1;
                                c3169k2.f46567c = -1;
                                c3169k2.f46568d = true;
                                i24 = i24;
                                c3169k2.f46569e = 2;
                                c3169k2.f46570f = 1;
                                c3169k2.f46571g = 0;
                                int i32 = 0;
                                while (true) {
                                    if (i32 < iM21503g8) {
                                        if (iM21503g6 == 0) {
                                            i14 = i7;
                                            zM21502f = so0Var3.m21502f();
                                            iM21503g = so0Var3.m21503g(5);
                                            iM21503g2 = so0Var3.m21503g(5);
                                            i19 = 0;
                                            i20 = 0;
                                            z2 = false;
                                        } else {
                                            int i33 = iM21503g8;
                                            int iM21503g9 = so0Var3.m21503g(8);
                                            i14 = i7;
                                            int iM21503g10 = so0Var3.m21503g(8);
                                            if (iM21503g10 == 255) {
                                                iM21503g10 = so0Var3.m21503g(16) + iM21503g10;
                                            }
                                            if (iM21503g9 > 2) {
                                                so0Var3.m21511o(iM21503g10 * 8);
                                                i32++;
                                                iM21503g8 = i33;
                                                i7 = i14;
                                            } else {
                                                int iM21498b2 = (iM21498b - so0Var3.m21498b()) / 8;
                                                int i34 = iM21503g10;
                                                int iM21503g11 = so0Var3.m21503g(5);
                                                z2 = iM21503g11 == 31;
                                                iM21503g = iM21503g11;
                                                i20 = iM21498b2;
                                                i19 = i34;
                                                iM21503g2 = iM21503g9;
                                                zM21502f = false;
                                            }
                                        }
                                        c3169k2.f46570f = iM21503g2;
                                        i13 = iM14812G2;
                                        if (zM21502f || z2 || iM21503g != 6) {
                                            c3169k2.f46571g = so0Var3.m21503g(3);
                                            if (so0Var3.m21502f()) {
                                                so0Var3.m21511o(5);
                                            }
                                            so0Var3.m21511o(2);
                                            int i35 = 1;
                                            if (iM21503g6 == 1 && (iM21503g2 == 1 || iM21503g2 == 2)) {
                                                so0Var3.m21511o(2);
                                            }
                                            so0Var3.m21511o(5);
                                            so0Var3.m21511o(10);
                                            if (iM21503g6 == 1) {
                                                if (iM21503g2 > 0) {
                                                    c3169k2.f46565a = so0Var3.m21502f();
                                                }
                                                if (c3169k2.f46565a) {
                                                    if (iM21503g2 != 1) {
                                                        i21 = 2;
                                                        if (iM21503g2 == 2) {
                                                            iM21503g3 = so0Var3.m21503g(5);
                                                            if (iM21503g3 >= 0 && iM21503g3 <= 15) {
                                                                c3169k2.f46566b = iM21503g3;
                                                            }
                                                            if (iM21503g3 >= 11 || iM21503g3 > 14) {
                                                                i21 = 2;
                                                            } else {
                                                                c3169k2.f46568d = so0Var3.m21502f();
                                                                i21 = 2;
                                                                c3169k2.f46569e = so0Var3.m21503g(2);
                                                            }
                                                        }
                                                    } else {
                                                        iM21503g3 = so0Var3.m21503g(5);
                                                        if (iM21503g3 >= 0) {
                                                            c3169k2.f46566b = iM21503g3;
                                                        }
                                                        if (iM21503g3 >= 11) {
                                                            i21 = 2;
                                                        } else {
                                                            i21 = 2;
                                                        }
                                                    }
                                                    so0Var3.m21511o(24);
                                                    i35 = 1;
                                                } else {
                                                    i21 = 2;
                                                }
                                                if (iM21503g2 == i35 || iM21503g2 == i21) {
                                                    if (so0Var3.m21502f() && so0Var3.m21502f()) {
                                                        so0Var3.m21511o(i21);
                                                    }
                                                    if (so0Var3.m21502f()) {
                                                        so0Var3.m21510n();
                                                        int i36 = 8;
                                                        int iM21503g12 = so0Var3.m21503g(8);
                                                        int i37 = 0;
                                                        while (i37 < iM21503g12) {
                                                            so0Var3.m21511o(i36);
                                                            i37++;
                                                            i36 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!zM21502f && !z2) {
                                                so0Var3.m21510n();
                                                if (iM21503g == 0 || iM21503g == 1 || iM21503g == 2) {
                                                    if (iM21503g2 == 0) {
                                                        for (int i38 = 0; i38 < 2; i38++) {
                                                            wx1.m24198g(so0Var3, c3169k2);
                                                        }
                                                    } else {
                                                        for (int i39 = 0; i39 < 2; i39++) {
                                                            wx1.m24199h(so0Var3, c3169k2);
                                                        }
                                                    }
                                                } else if (iM21503g == 3 || iM21503g == 4) {
                                                    if (iM21503g2 == 0) {
                                                        for (int i40 = 0; i40 < 3; i40++) {
                                                            wx1.m24198g(so0Var3, c3169k2);
                                                        }
                                                    } else {
                                                        for (int i41 = 0; i41 < 3; i41++) {
                                                            wx1.m24199h(so0Var3, c3169k2);
                                                        }
                                                    }
                                                } else if (iM21503g != 5) {
                                                    int iM21503g13 = so0Var3.m21503g(7);
                                                    for (int i42 = 0; i42 < iM21503g13; i42++) {
                                                        so0Var3.m21511o(8);
                                                    }
                                                } else if (iM21503g2 == 0) {
                                                    wx1.m24198g(so0Var3, c3169k2);
                                                } else {
                                                    int iM21503g14 = so0Var3.m21503g(3);
                                                    for (int i43 = 0; i43 < iM21503g14 + 2; i43++) {
                                                        wx1.m24199h(so0Var3, c3169k2);
                                                    }
                                                }
                                            } else if (iM21503g2 == 0) {
                                                wx1.m24198g(so0Var3, c3169k2);
                                            } else {
                                                wx1.m24199h(so0Var3, c3169k2);
                                            }
                                            so0Var3.m21510n();
                                            zM21502f2 = so0Var3.m21502f();
                                        } else {
                                            iM21503g2 = iM21503g2;
                                            zM21502f2 = true;
                                        }
                                        if (zM21502f2) {
                                            int iM21503g15 = so0Var3.m21503g(7);
                                            for (int i44 = 0; i44 < iM21503g15; i44++) {
                                                so0Var3.m21511o(15);
                                            }
                                        }
                                        if (iM21503g2 <= 0) {
                                            i15 = 8;
                                        } else {
                                            if (so0Var3.m21502f()) {
                                                if (so0Var3.m21498b() < 66) {
                                                    throw ParserException.m2517b("Can't parse bitrate DSI.");
                                                }
                                                so0Var3.m21511o(66);
                                            }
                                            if (so0Var3.m21502f()) {
                                                so0Var3.m21499c();
                                                so0Var3.m21512p(so0Var3.m21503g(16));
                                                int iM21503g16 = so0Var3.m21503g(5);
                                                for (int i45 = 0; i45 < iM21503g16; i45++) {
                                                    so0Var3.m21511o(3);
                                                    so0Var3.m21511o(8);
                                                }
                                                i15 = 8;
                                            } else {
                                                i15 = 8;
                                            }
                                        }
                                        so0Var3.m21499c();
                                        if (iM21503g6 == 1) {
                                            int iM21498b3 = ((iM21498b - so0Var3.m21498b()) / i15) - i20;
                                            if (i19 < iM21498b3) {
                                                throw ParserException.m2517b("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            so0Var3.m21512p(i19 - iM21498b3);
                                        }
                                        if (c3169k2.f46565a && c3169k2.f46566b == -1) {
                                            throw ParserException.m2517b("Can't determine channel mode of presentation " + i32);
                                        }
                                    } else {
                                        iIntValue = iIntValue;
                                        i13 = iM14812G2;
                                        i14 = i7;
                                        i15 = 8;
                                    }
                                    if (c3169k2.f46565a) {
                                        int i46 = c3169k2.f46566b;
                                        boolean z5 = c3169k2.f46568d;
                                        int i47 = c3169k2.f46569e;
                                        switch (i46) {
                                            case 0:
                                                i17 = 11;
                                                i18 = 1;
                                                break;
                                            case 1:
                                                i17 = 11;
                                                i18 = 2;
                                                break;
                                            case 2:
                                                i17 = 11;
                                                i18 = 3;
                                                break;
                                            case 3:
                                                i17 = 11;
                                                i18 = 5;
                                                break;
                                            case 4:
                                                i17 = 11;
                                                i18 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i17 = 11;
                                                i18 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i18 = i15;
                                                i17 = 11;
                                                break;
                                            case 11:
                                                i17 = 11;
                                                i18 = 11;
                                                break;
                                            case 12:
                                                i18 = 12;
                                                i17 = 11;
                                                break;
                                            case 13:
                                                i17 = 11;
                                                i18 = 13;
                                                break;
                                            case 14:
                                                i17 = 11;
                                                i18 = 14;
                                                break;
                                            case 15:
                                                i17 = 11;
                                                i18 = 24;
                                                break;
                                            default:
                                                i17 = 11;
                                                i18 = -1;
                                                break;
                                        }
                                        if (i46 == i17 || i46 == 12 || i46 == 13 || i46 == 14) {
                                            if (!z5) {
                                                i18 -= 2;
                                            }
                                            if (i47 == 0) {
                                                i18 -= 4;
                                            } else if (i47 == 1) {
                                                i18 -= 2;
                                            }
                                        }
                                        i16 = i18;
                                    } else {
                                        int i48 = c3169k2.f46567c;
                                        int i49 = c3169k2.f46571g;
                                        if (i48 > 0) {
                                            i16 = i48 + 1;
                                            if (i49 == 4 && i16 == 17) {
                                                i16 = 21;
                                            }
                                        } else if (i49 == 0) {
                                            i16 = 2;
                                        } else if (i49 == 1) {
                                            i16 = 6;
                                        } else if (i49 == 2) {
                                            i16 = i15;
                                        } else if (i49 == 3) {
                                            i16 = 10;
                                        } else if (i49 != 4) {
                                            ss5.m21707d0("Ac4Util", "AC-4 level " + c3169k2.f46571g + " has not been defined.");
                                            i16 = 2;
                                        } else {
                                            i16 = 12;
                                        }
                                    }
                                    if (i16 <= 0) {
                                        throw ParserException.m2517b("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iM21503g7), Integer.valueOf(c3169k2.f46570f), Integer.valueOf(c3169k2.f46571g)};
                                    String str6 = uma.f64080a;
                                    String str7 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    lc3 lc3Var3 = new lc3();
                                    lc3Var3.f49440a = string3;
                                    lc3Var3.f49453n = ez5.m11402l("audio/ac4");
                                    lc3Var3.f49430F = i16;
                                    lc3Var3.f49431G = i31;
                                    lc3Var3.f49457r = drmInitDataM2514a;
                                    lc3Var3.f49443d = str;
                                    lc3Var3.f49449j = str7;
                                    xh0Var.f68195d = new C0713b(lc3Var3);
                                    i7 = i14;
                                    iM14812G2 = i13;
                                    iIntValue = iIntValue;
                                }
                            } else {
                                iIntValue = iIntValue;
                                i24 = i24;
                                iM14812G2 = iM14812G2;
                                i7 = i7;
                                if (iM14829m3 == 1684892784) {
                                    if (iM14829m <= 0) {
                                        throw ParserException.m2516a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM14829m);
                                    }
                                    i7 = iM14829m;
                                    iM14812G2 = 2;
                                } else if (iM14829m3 == 1684305011 || iM14829m3 == 1969517683) {
                                    iIntValue = iIntValue;
                                    lc3 lc3Var4 = new lc3();
                                    lc3Var4.f49440a = Integer.toString(i4);
                                    lc3Var4.f49453n = ez5.m11402l(str3);
                                    iM14812G2 = iM14812G2;
                                    lc3Var4.f49430F = iM14812G2;
                                    i7 = i7;
                                    lc3Var4.f49431G = i7;
                                    lc3Var4.f49457r = drmInitDataM2514a;
                                    lc3Var4.f49443d = str;
                                    xh0Var.f68195d = new C0713b(lc3Var4);
                                } else if (iM14829m3 == 1682927731) {
                                    int i50 = iM14829m2 - 8;
                                    byte[] bArr3 = f687a;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i50);
                                    k47Var2.m14818M(i24 + 8);
                                    k47Var2.m14827k(bArrCopyOf, bArr3.length, i50);
                                    listM6291y = syb.m21776a(bArrCopyOf);
                                    i7 = i7;
                                    iM14812G2 = iM14812G2;
                                } else {
                                    if (iM14829m3 == 1684425825) {
                                        byte[] bArr4 = new byte[iM14829m2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        k47Var2.m14818M(i24 + 12);
                                        k47Var2.m14827k(bArr4, 4, iM14829m2 - 12);
                                        listM6291y = ImmutableList.m6291y(bArr4);
                                        strM17735j = strM17735j;
                                    } else if (iM14829m3 == 1634492771) {
                                        int i51 = iM14829m2 - 12;
                                        byte[] bArr5 = new byte[i51];
                                        k47Var2.m14818M(i24 + 12);
                                        k47Var2.m14827k(bArr5, 0, i51);
                                        byte[] bArr6 = m41.f50559a;
                                        k47 k47Var3 = new k47(bArr5);
                                        k47Var3.m14818M(5);
                                        int iM14842z3 = k47Var3.m14842z();
                                        k47Var3.m14818M(9);
                                        int iM14842z4 = k47Var3.m14842z();
                                        k47Var3.m14818M(20);
                                        int[] iArr3 = {k47Var3.m14809D(), iM14842z4, iM14842z3};
                                        int i52 = iArr3[0];
                                        int i53 = iArr3[1];
                                        int i54 = iArr3[2];
                                        String str8 = uma.f64080a;
                                        str3 = str3;
                                        iM22825t = uma.m22825t(i54, ByteOrder.LITTLE_ENDIAN);
                                        iM14812G2 = i53;
                                        listM6291y = ImmutableList.m6291y(bArr5);
                                        strM17735j = strM17735j;
                                        iM14829m2 = iM14829m2;
                                        i24 = i24;
                                        vh0Var = vh0Var;
                                        i7 = i52;
                                        iIntValue = iIntValue;
                                    } else if (iM14829m3 == 1767990114) {
                                        k47Var2.m14818M(i24 + 9);
                                        int iM14810E = k47Var2.m14810E();
                                        byte[] bArr7 = new byte[iM14810E];
                                        k47Var2.m14827k(bArr7, 0, iM14810E);
                                        byte[] bArr8 = m41.f50559a;
                                        k47 k47Var4 = new k47(bArr7);
                                        String str9 = null;
                                        String strM14840x = null;
                                        while (k47Var4.m14820a() > 0 && (str9 == null || strM14840x == null)) {
                                            int iM14842z5 = k47Var4.m14842z();
                                            int i55 = iM14842z5 >> 3;
                                            boolean z6 = (iM14842z5 & 2) != 0;
                                            boolean z7 = (iM14842z5 & 1) != 0;
                                            int iM14810E2 = k47Var4.m14810E();
                                            if (i55 > 4 && i55 < 24 && z6) {
                                                do {
                                                } while ((k47Var4.m14842z() & 128) != 0);
                                                for (i12 = 128; (k47Var4.m14842z() & i12) != 0; i12 = 128) {
                                                }
                                            }
                                            if (z7) {
                                                k47Var4.m14819N(k47Var4.m14810E());
                                            }
                                            int i56 = k47Var4.f46701b + iM14810E2;
                                            if (i55 == 31) {
                                                k47Var4.m14819N(4);
                                                Object[] objArr2 = {Integer.valueOf(k47Var4.m14842z()), Integer.valueOf(k47Var4.m14842z())};
                                                String str10 = uma.f64080a;
                                                str9 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                            } else {
                                                if (i55 == 0) {
                                                    while ((k47Var4.m14842z() & 128) != 0) {
                                                    }
                                                    strM14840x = k47Var4.m14840x(4, StandardCharsets.UTF_8);
                                                    if (strM14840x.equals("mp4a")) {
                                                        while ((k47Var4.m14842z() & 128) != 0) {
                                                        }
                                                        k47Var4.m14819N(2);
                                                        so0 so0Var4 = new so0();
                                                        so0Var4.m21508l(k47Var4);
                                                        int iM21503g17 = so0Var4.m21503g(5);
                                                        if (iM21503g17 == 31) {
                                                            iM21503g17 = so0Var4.m21503g(6) + 32;
                                                        }
                                                        strM14840x = strM14840x + ".40." + iM21503g17;
                                                    }
                                                    k47Var4.m14818M(i56);
                                                }
                                                k47Var4.m14818M(i56);
                                            }
                                            k47Var4.m14818M(i56);
                                        }
                                        strM17735j = (str9 == null || strM14840x == null) ? null : AbstractC3393o1.m17735j(str9, ".", strM14840x);
                                        listM6291y = ImmutableList.m6291y(bArr7);
                                    } else if (iM14829m3 == 1885564227) {
                                        k47Var2.m14818M(i24 + 12);
                                        ByteOrder byteOrder = (k47Var2.m14842z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iM14842z6 = k47Var2.m14842z();
                                        iIntValue = iIntValue;
                                        iM22825t = iIntValue == 1768973165 ? uma.m22825t(iM14842z6, byteOrder) : (iIntValue == 1718641517 && iM14842z6 == i23 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : iM22825t;
                                        vh0Var = vh0Var;
                                        str3 = iM22825t != -1 ? "audio/raw" : str3;
                                    } else {
                                        iIntValue = iIntValue;
                                        i7 = i7;
                                        iM14812G2 = iM14812G2;
                                    }
                                    iIntValue = iIntValue;
                                }
                            }
                            str3 = str3;
                            iM14812G2 = iM14812G2;
                            iM22825t = iM22825t;
                            strM17735j = strM17735j;
                            iM14829m2 = iM14829m2;
                            i24 = i24;
                            vh0Var = vh0Var;
                        }
                        iIntValue = iIntValue;
                        str3 = str3;
                        iM14812G2 = iM14812G2;
                        iM22825t = iM22825t;
                        strM17735j = strM17735j;
                        iM14829m2 = iM14829m2;
                        i24 = i24;
                        vh0Var = vh0Var;
                    }
                    int i57 = iM14829m2;
                    int i58 = iM14812G2;
                    str5 = str5;
                    listM6291y = listM6291y;
                    if (iM14829m3 == i10) {
                        iM14829m2 = i57;
                        i11 = i24;
                        i24 = i11;
                    } else {
                        i11 = k47Var2.f46701b;
                        i24 = i24;
                        ucd.m22677a(null, i11 >= i24);
                        while (true) {
                            iM14829m2 = i57;
                            if (i11 - i24 < iM14829m2) {
                                k47Var2.m14818M(i11);
                                int iM14829m4 = k47Var2.m14829m();
                                ucd.m22677a("childAtomSize must be positive", iM14829m4 > 0);
                                if (k47Var2.m14829m() != 1702061171) {
                                    i11 += iM14829m4;
                                    i57 = iM14829m2;
                                }
                            } else {
                                i11 = -1;
                            }
                        }
                    }
                    if (i11 != -1) {
                        vh0 vh0VarM424c = m424c(i11, k47Var2);
                        str3 = (String) vh0VarM424c.f65367c;
                        byte[] bArr9 = (byte[]) vh0VarM424c.f65368d;
                        if (bArr9 != null) {
                            if ("audio/vorbis".equals(str3)) {
                                k47 k47Var5 = new k47(bArr9);
                                k47Var5.m14819N(1);
                                int i59 = 0;
                                while (k47Var5.m14820a() > 0 && k47Var5.m14826j() == 255) {
                                    i59 += 255;
                                    k47Var5.m14819N(1);
                                }
                                int iM14842z7 = k47Var5.m14842z() + i59;
                                int i60 = 0;
                                while (true) {
                                    if (k47Var5.m14820a() > 0) {
                                        vh0Var = vh0VarM424c;
                                        if (k47Var5.m14826j() == 255) {
                                            i60 += 255;
                                            k47Var5.m14819N(1);
                                            vh0VarM424c = vh0Var;
                                        }
                                    } else {
                                        vh0Var = vh0VarM424c;
                                    }
                                }
                                int iM14842z8 = k47Var5.m14842z() + i60;
                                byte[] bArr10 = new byte[iM14842z7];
                                int i61 = k47Var5.f46701b;
                                System.arraycopy(bArr9, i61, bArr10, 0, iM14842z7);
                                int i62 = i61 + iM14842z7 + iM14842z8;
                                int length = bArr9.length - i62;
                                byte[] bArr11 = new byte[length];
                                System.arraycopy(bArr9, i62, bArr11, 0, length);
                                listM6291y = ImmutableList.m6280B(bArr10, bArr11);
                            } else {
                                if ("audio/mp4a-latm".equals(str3)) {
                                    C3354n c3354nM18560f = ox1.m18560f(new so0(bArr9.length, bArr9), false);
                                    i7 = c3354nM18560f.f52093b;
                                    iM14812G2 = c3354nM18560f.f52094c;
                                    strM17735j = c3354nM18560f.f52092a;
                                } else {
                                    iM14812G2 = i58;
                                    strM17735j = strM17735j;
                                }
                                vh0Var = vh0VarM424c;
                                listM6291y = ImmutableList.m6291y(bArr9);
                            }
                            iM22825t = iM22825t;
                        } else {
                            vh0Var = vh0VarM424c;
                        }
                    } else {
                        str3 = str3;
                    }
                    iM14812G2 = i58;
                    strM17735j = strM17735j;
                    vh0Var = vh0Var;
                    iM22825t = iM22825t;
                }
                int i63 = i24 + iM14829m2;
                i6 = 2;
                i23 = 32;
                i22 = i3;
                vh0Var = vh0Var;
                iIntValue = iIntValue;
                str2 = str3;
                str5 = str5;
                listM6291y = listM6291y;
                i24 = i63;
                k47Var2 = k47Var;
            }
            str3 = str3;
            iIntValue = iIntValue;
            int i64 = i24 + iM14829m2;
            i6 = 2;
            i23 = 32;
            i22 = i3;
            vh0Var = vh0Var;
            iIntValue = iIntValue;
            str2 = str3;
            str5 = str5;
            listM6291y = listM6291y;
            i24 = i64;
            k47Var2 = k47Var;
        }
        String str11 = str2;
        int i65 = iM14812G2;
        int i66 = iM22825t;
        String str12 = strM17735j;
        List list = listM6291y;
        if (((C0713b) xh0Var.f68195d) != null || str11 == null) {
            return;
        }
        lc3 lc3Var5 = new lc3();
        lc3Var5.f49440a = Integer.toString(i4);
        lc3Var5.f49453n = ez5.m11402l(str11);
        lc3Var5.f49449j = str12;
        lc3Var5.f49430F = i65;
        lc3Var5.f49431G = i7;
        lc3Var5.f49432H = i66;
        lc3Var5.f49456q = list;
        lc3Var5.f49457r = drmInitDataM2514a;
        lc3Var5.f49443d = str;
        if (vh0Var != null) {
            vh0 vh0Var2 = vh0Var;
            lc3Var5.f49447h = AbstractC1110a.m6364d(vh0Var2.f65365a);
            lc3Var5.f49448i = AbstractC1110a.m6364d(vh0Var2.f65366b);
        } else {
            th0 th0Var2 = th0Var;
            if (th0Var2 != null) {
                lc3Var5.f49447h = AbstractC1110a.m6364d(th0Var2.f62270a);
                lc3Var5.f49448i = AbstractC1110a.m6364d(th0Var2.f62271b);
            }
        }
        xh0Var.f68195d = new C0713b(lc3Var5);
    }

    /* JADX INFO: renamed from: c */
    public static vh0 m424c(int i, k47 k47Var) {
        k47Var.m14818M(i + 12);
        k47Var.m14819N(1);
        m425d(k47Var);
        k47Var.m14819N(2);
        int iM14842z = k47Var.m14842z();
        if ((iM14842z & 128) != 0) {
            k47Var.m14819N(2);
        }
        if ((iM14842z & 64) != 0) {
            k47Var.m14819N(k47Var.m14842z());
        }
        if ((iM14842z & 32) != 0) {
            k47Var.m14819N(2);
        }
        k47Var.m14819N(1);
        m425d(k47Var);
        String strM11394d = ez5.m11394d(k47Var.m14842z());
        if ("audio/mpeg".equals(strM11394d) || "audio/vnd.dts".equals(strM11394d) || "audio/vnd.dts.hd".equals(strM11394d)) {
            return new vh0(strM11394d, null, -1L, -1L);
        }
        k47Var.m14819N(4);
        long jM14807B = k47Var.m14807B();
        long jM14807B2 = k47Var.m14807B();
        k47Var.m14819N(1);
        int iM425d = m425d(k47Var);
        long j = jM14807B2;
        byte[] bArr = new byte[iM425d];
        k47Var.m14827k(bArr, 0, iM425d);
        if (j <= 0) {
            j = -1;
        }
        return new vh0(strM11394d, bArr, j, jM14807B > 0 ? jM14807B : -1L);
    }

    /* JADX INFO: renamed from: d */
    public static int m425d(k47 k47Var) {
        int iM14842z = k47Var.m14842z();
        int i = iM14842z & 127;
        while ((iM14842z & 128) == 128) {
            iM14842z = k47Var.m14842z();
            i = (i << 7) | (iM14842z & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static int m426e(int i) {
        return (i >> 24) & 255;
    }

    /* JADX INFO: renamed from: f */
    public static ey5 m427f(e46 e46Var) {
        at5 at5Var;
        f46 f46VarM10845m = e46Var.m10845m(1751411826);
        f46 f46VarM10845m2 = e46Var.m10845m(1801812339);
        f46 f46VarM10845m3 = e46Var.m10845m(1768715124);
        if (f46VarM10845m == null || f46VarM10845m2 == null || f46VarM10845m3 == null) {
            return null;
        }
        k47 k47Var = f46VarM10845m.f38414c;
        k47Var.m14818M(16);
        if (k47Var.m14829m() != 1835299937) {
            return null;
        }
        k47 k47Var2 = f46VarM10845m2.f38414c;
        k47Var2.m14818M(12);
        int iM14829m = k47Var2.m14829m();
        String[] strArr = new String[iM14829m];
        for (int i = 0; i < iM14829m; i++) {
            int iM14829m2 = k47Var2.m14829m();
            k47Var2.m14819N(4);
            strArr[i] = k47Var2.m14840x(iM14829m2 - 8, StandardCharsets.UTF_8);
        }
        k47 k47Var3 = f46VarM10845m3.f38414c;
        k47Var3.m14818M(8);
        ArrayList arrayList = new ArrayList();
        while (k47Var3.m14820a() > 8) {
            int i2 = k47Var3.f46701b;
            int iM14829m3 = k47Var3.m14829m();
            int iM14829m4 = k47Var3.m14829m() - 1;
            if (iM14829m4 < 0 || iM14829m4 >= iM14829m) {
                hn1.m13364n("Skipped metadata with unknown key index: ", iM14829m4, "BoxParsers");
            } else {
                String str = strArr[iM14829m4];
                int i3 = i2 + iM14829m3;
                while (true) {
                    int i4 = k47Var3.f46701b;
                    if (i4 < i3) {
                        int iM14829m5 = k47Var3.m14829m();
                        if (k47Var3.m14829m() == 1684108385) {
                            int iM14829m6 = k47Var3.m14829m();
                            int iM14829m7 = k47Var3.m14829m();
                            int i5 = iM14829m5 - 16;
                            byte[] bArr = new byte[i5];
                            k47Var3.m14827k(bArr, 0, i5);
                            try {
                                at5Var = new at5(str, bArr, iM14829m7, iM14829m6);
                                break;
                            } catch (Exception unused) {
                                hn1.m13365o("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                at5Var = null;
                                break;
                            }
                        }
                        k47Var3.m14818M(i4 + iM14829m5);
                    }
                    at5Var = null;
                    break;
                }
                if (at5Var != null) {
                    arrayList.add(at5Var);
                }
            }
            k47Var3.m14818M(i2 + iM14829m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ey5(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static k46 m428g(k47 k47Var) {
        long jM14836t;
        long jM14836t2;
        k47Var.m14818M(8);
        if (m426e(k47Var.m14829m()) == 0) {
            jM14836t = k47Var.m14807B();
            jM14836t2 = k47Var.m14807B();
        } else {
            jM14836t = k47Var.m14836t();
            jM14836t2 = k47Var.m14836t();
        }
        return new k46(jM14836t, jM14836t2, k47Var.m14807B());
    }

    /* JADX INFO: renamed from: h */
    public static Pair m429h(k47 k47Var, int i, int i2) throws ParserException {
        h8a h8aVar;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = k47Var.f46701b;
        while (i5 - i < i2) {
            k47Var.m14818M(i5);
            int iM14829m = k47Var.m14829m();
            ucd.m22677a("childAtomSize must be positive", iM14829m > 0);
            if (k47Var.m14829m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strM14840x = null;
                while (i6 - i5 < iM14829m) {
                    k47Var.m14818M(i6);
                    int iM14829m2 = k47Var.m14829m();
                    int iM14829m3 = k47Var.m14829m();
                    if (iM14829m3 == 1718775137) {
                        numValueOf = Integer.valueOf(k47Var.m14829m());
                    } else if (iM14829m3 == 1935894637) {
                        k47Var.m14819N(4);
                        strM14840x = k47Var.m14840x(4, StandardCharsets.UTF_8);
                    } else if (iM14829m3 == 1935894633) {
                        i8 = i6;
                        i7 = iM14829m2;
                    }
                    i6 += iM14829m2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM14840x) || "cbc1".equals(strM14840x) || "cens".equals(strM14840x) || "cbcs".equals(strM14840x)) {
                    ucd.m22677a("frma atom is mandatory", numValueOf != null);
                    ucd.m22677a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            h8aVar = null;
                            break;
                        }
                        k47Var.m14818M(i9);
                        int iM14829m4 = k47Var.m14829m();
                        if (k47Var.m14829m() == 1952804451) {
                            int iM426e = m426e(k47Var.m14829m());
                            k47Var.m14819N(1);
                            if (iM426e == 0) {
                                k47Var.m14819N(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM14842z = k47Var.m14842z();
                                i3 = iM14842z & 15;
                                i4 = (iM14842z & 240) >> 4;
                            }
                            boolean z = k47Var.m14842z() == 1;
                            int iM14842z2 = k47Var.m14842z();
                            byte[] bArr2 = new byte[16];
                            k47Var.m14827k(bArr2, 0, 16);
                            if (z && iM14842z2 == 0) {
                                int iM14842z3 = k47Var.m14842z();
                                byte[] bArr3 = new byte[iM14842z3];
                                k47Var.m14827k(bArr3, 0, iM14842z3);
                                bArr = bArr3;
                            }
                            h8aVar = new h8a(z, strM14840x, iM14842z2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM14829m4;
                    }
                    ucd.m22677a("tenc atom is mandatory", h8aVar != null);
                    String str = uma.f64080a;
                    pairCreate = Pair.create(numValueOf, h8aVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM14829m;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:442:0x096d  */
    /* JADX WARN: Code duplicated, block: B:444:0x098d  */
    /* JADX WARN: Code duplicated, block: B:446:0x0993  */
    /* JADX WARN: Code duplicated, block: B:447:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:452:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:454:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:455:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:457:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:458:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:460:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a83 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:491:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:499:0x0aab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:510:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:681:0x0a24 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:442:0x096d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static xh0 m430i(k47 k47Var, zh0 zh0Var, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i;
        DrmInitData drmInitData2;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        String str5;
        int iM12451g;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        byte[] bArrCopyOfRange;
        int i8;
        int i9;
        int i10;
        int iM21503g;
        boolean zM21502f;
        int iM21503g2;
        int i11;
        int iM21503g3;
        int i12;
        int i13;
        boolean zM21502f2;
        int i14;
        int iM21503g4;
        boolean z2;
        int i15;
        int iM12451g2;
        ga1 ga1Var;
        int iM21503g5;
        int i16;
        ga1 ga1Var2;
        int i17;
        ck6 ck6Var;
        int i18;
        int iM14842z;
        int iM14842z2;
        DrmInitData drmInitDataM2514a;
        int i19;
        int i20;
        String str6;
        ImmutableList immutableListM6291y;
        long j;
        k47 k47Var2 = k47Var;
        zh0 zh0Var2 = zh0Var;
        String str7 = str;
        int i21 = zh0Var2.f71568a;
        k47Var2.m14818M(12);
        int iM14829m = k47Var2.m14829m();
        xh0 xh0Var = new xh0(iM14829m);
        int i22 = 0;
        while (i22 < iM14829m) {
            int i23 = k47Var2.f46701b;
            int iM14829m2 = k47Var2.m14829m();
            String str8 = "childAtomSize must be positive";
            ucd.m22677a("childAtomSize must be positive", iM14829m2 > 0);
            int iM14829m3 = k47Var2.m14829m();
            int i24 = 8;
            byte b = 3;
            byte[] bArr2 = null;
            if (iM14829m3 == 1635148593 || iM14829m3 == 1635148595 || iM14829m3 == 1701733238 || iM14829m3 == 1831958048 || iM14829m3 == 1836070006 || iM14829m3 == 1752589105 || iM14829m3 == 1751479857 || iM14829m3 == 1987470129 || iM14829m3 == 1987471665 || iM14829m3 == 1932670515 || iM14829m3 == 1211250227 || iM14829m3 == 1748121139 || iM14829m3 == 1987063864 || iM14829m3 == 1987063865 || iM14829m3 == 1635135537 || iM14829m3 == 1685479798 || iM14829m3 == 1685479729 || iM14829m3 == 1685481573 || iM14829m3 == 1685481521 || iM14829m3 == 1634760241 || iM14829m3 == 1684108849) {
                int i25 = zh0Var2.f71570c;
                k47Var2.m14818M(i23 + 16);
                k47Var2.m14819N(16);
                int iM14812G = k47Var2.m14812G();
                int iM14812G2 = k47Var2.m14812G();
                k47Var2.m14819N(50);
                int i26 = k47Var2.f46701b;
                i = i22;
                if (iM14829m3 == 1701733238) {
                    Pair pairM429h = m429h(k47Var2, i23, iM14829m2);
                    if (pairM429h != null) {
                        iM14829m3 = ((Integer) pairM429h.first).intValue();
                        drmInitDataM2514a = drmInitData == null ? null : drmInitData.m2514a(((h8a) pairM429h.second).f41996b);
                        ((h8a[]) xh0Var.f68194c)[i] = (h8a) pairM429h.second;
                    } else {
                        i23 = i23;
                        drmInitDataM2514a = drmInitData;
                    }
                    k47Var2.m14818M(i26);
                    drmInitData2 = drmInitDataM2514a;
                } else {
                    i23 = i23;
                    drmInitData2 = drmInitData;
                }
                if (iM14829m3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM14829m3 == 1211250227 ? "video/3gpp" : null;
                }
                DrmInitData drmInitData3 = drmInitData2;
                i2 = i21;
                i3 = iM14829m;
                int i27 = i26;
                int i28 = 8;
                C3329mb c3329mb = null;
                List listM6291y = null;
                ByteBuffer byteBuffer = null;
                String string = null;
                byte[] bArr3 = null;
                C3404oc c3404ocM17906c = null;
                th0 th0Var = null;
                vh0 vh0Var = null;
                String str9 = str2;
                float fM14809D = 1.0f;
                int i29 = -1;
                int i30 = -1;
                int i31 = -1;
                int iM12450f = -1;
                boolean z3 = false;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                int i36 = 8;
                while (i27 - i23 < iM14829m2) {
                    k47Var2.m14818M(i27);
                    int i37 = k47Var2.f46701b;
                    int i38 = i27;
                    int iM14829m4 = k47Var2.m14829m();
                    if (iM14829m4 == 0 && k47Var2.f46701b - i23 == iM14829m2) {
                        break;
                    }
                    ucd.m22677a(str8, iM14829m4 > 0);
                    int iM14829m5 = k47Var2.m14829m();
                    int i39 = iM14829m2;
                    if (iM14829m5 == 1635148611) {
                        ucd.m22677a(bArr2, str9 == null);
                        k47Var2.m14818M(i37 + 8);
                        e60 e60VarM10863a = e60.m10863a(k47Var2);
                        listM6291y = e60VarM10863a.f36733a;
                        xh0Var.f68192a = e60VarM10863a.f36734b;
                        float f = !z3 ? e60VarM10863a.f36743k : fM14809D;
                        String str10 = e60VarM10863a.f36744l;
                        int i40 = e60VarM10863a.f36742j;
                        iM12450f = e60VarM10863a.f36739g;
                        int i41 = e60VarM10863a.f36740h;
                        int i42 = e60VarM10863a.f36741i;
                        int i43 = e60VarM10863a.f36737e;
                        i28 = e60VarM10863a.f36738f;
                        i5 = iM14829m3;
                        i33 = i40;
                        str8 = str8;
                        iM12451g = i42;
                        fM14809D = f;
                        c3329mb = c3329mb;
                        i36 = i43;
                        str9 = "video/avc";
                        bArr = null;
                        string = str10;
                        i31 = i41;
                        i6 = i24;
                    } else {
                        int i44 = iM14829m3;
                        if (iM14829m5 == 1752589123) {
                            ucd.m22677a(null, str9 == null);
                            k47Var2.m14818M(i37 + 8);
                            ps3 ps3VarM19467a = ps3.m19467a(k47Var2, false, null);
                            listM6291y = ps3VarM19467a.f56742a;
                            xh0Var.f68192a = ps3VarM19467a.f56743b;
                            float f2 = !z3 ? ps3VarM19467a.f56753l : fM14809D;
                            int i45 = ps3VarM19467a.f56754m;
                            int i46 = ps3VarM19467a.f56744c;
                            String str11 = ps3VarM19467a.f56755n;
                            int i47 = ps3VarM19467a.f56752k;
                            if (i47 != -1) {
                                i29 = i47;
                            }
                            int i48 = ps3VarM19467a.f56745d;
                            int i49 = ps3VarM19467a.f56746e;
                            iM12450f = ps3VarM19467a.f56749h;
                            int i50 = ps3VarM19467a.f56750i;
                            int i51 = ps3VarM19467a.f56751j;
                            int i52 = ps3VarM19467a.f56747f;
                            i28 = ps3VarM19467a.f56748g;
                            str9 = "video/hevc";
                            c3329mb = ps3VarM19467a.f56756o;
                            str8 = str8;
                            i34 = i49;
                            i35 = i48;
                            fM14809D = f2;
                            i31 = i50;
                            i6 = i24;
                            iM12451g = i51;
                            i36 = i52;
                            i5 = i44;
                            bArr = null;
                            i33 = i45;
                            i32 = i46;
                            string = str11;
                        } else {
                            int i53 = i29;
                            if (iM14829m5 == 1818785347) {
                                ucd.m22677a("lhvC must follow hvcC atom", "video/hevc".equals(str9));
                                ucd.m22677a("must have at least two layers", c3329mb != null && ((ImmutableList) c3329mb.f50860b).size() >= 2);
                                k47Var2.m14818M(i37 + 8);
                                c3329mb.getClass();
                                ps3 ps3VarM19467a2 = ps3.m19467a(k47Var2, true, c3329mb);
                                ucd.m22677a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", xh0Var.f68192a == ps3VarM19467a2.f56743b);
                                int i54 = ps3VarM19467a2.f56749h;
                                if (i54 != -1) {
                                    ucd.m22677a("colorSpace must be the same for both views", iM12450f == i54);
                                }
                                int i55 = ps3VarM19467a2.f56750i;
                                if (i55 != -1) {
                                    ucd.m22677a("colorRange must be the same for both views", i31 == i55);
                                }
                                int i56 = ps3VarM19467a2.f56751j;
                                if (i56 != -1) {
                                    ucd.m22677a("colorTransfer must be the same for both views", i30 == i56);
                                }
                                ucd.m22677a("bitdepthLuma must be the same for both views", i36 == ps3VarM19467a2.f56747f);
                                ucd.m22677a("bitdepthChroma must be the same for both views", i28 == ps3VarM19467a2.f56748g);
                                if (listM6291y != null) {
                                    c14 c14VarM6284m = ImmutableList.m6284m();
                                    c14VarM6284m.m3159d(listM6291y);
                                    c14VarM6284m.m3159d(ps3VarM19467a2.f56742a);
                                    listM6291y = c14VarM6284m.m4280g();
                                } else {
                                    ucd.m22677a("initializationData must be already set from hvcC atom", false);
                                }
                                string = ps3VarM19467a2.f56755n;
                                str9 = "video/mv-hevc";
                                iM12451g = i30;
                                str8 = str8;
                                i36 = i36;
                                c3329mb = c3329mb;
                                i6 = i24;
                                i5 = i44;
                                i29 = i53;
                                bArr = null;
                            } else {
                                int i57 = 7;
                                int i58 = 5;
                                if (iM14829m5 == 1987470147) {
                                    ucd.m22677a(null, str9 == null);
                                    k47Var2.m14818M(i37 + 8);
                                    try {
                                        if (k47Var2.m14829m() != 0) {
                                            throw ParserException.m2516a(null, "Unsupported VVC version");
                                        }
                                        int iM14842z3 = k47Var2.m14842z();
                                        int i59 = (iM14842z3 >> 1) & 3;
                                        boolean z4 = (iM14842z3 & 1) != 0;
                                        int i60 = i59 + 1;
                                        String str12 = "L";
                                        if (z4) {
                                            k47Var2.m14819N(1);
                                            int iM14842z4 = (k47Var2.m14842z() >> 4) & 7;
                                            iM14842z = (k47Var2.m14842z() >> 5) & 7;
                                            int iM14842z5 = k47Var2.m14842z() & 63;
                                            int iM14842z6 = k47Var2.m14842z();
                                            int i61 = (iM14842z6 >> 1) & 127;
                                            str12 = (iM14842z6 & 1) != 0 ? "H" : "L";
                                            iM14842z2 = k47Var2.m14842z();
                                            k47Var2.m14819N(iM14842z5);
                                            int i62 = 1;
                                            if (iM14842z4 > 1) {
                                                int iM14842z7 = k47Var2.m14842z();
                                                int i63 = 0;
                                                while (i63 < iM14842z4 - 1) {
                                                    if (((iM14842z7 >> (7 - i63)) & i62) != 0) {
                                                        k47Var2.m14819N(i62);
                                                    }
                                                    i63++;
                                                    i62 = 1;
                                                }
                                            }
                                            k47Var2.m14819N(k47Var2.m14842z() * 4);
                                            k47Var2.m14819N(6);
                                            i18 = i61;
                                        } else {
                                            i18 = 0;
                                            iM14842z = 0;
                                            iM14842z2 = 0;
                                        }
                                        int iM14842z8 = k47Var2.m14842z();
                                        int i64 = k47Var2.f46701b;
                                        int i65 = iM14842z;
                                        int i66 = 0;
                                        int i67 = 0;
                                        while (i67 < iM14842z8) {
                                            int i68 = i31;
                                            int iM14842z9 = k47Var2.m14842z() & 31;
                                            int i69 = i67;
                                            int iM14812G3 = (iM14842z9 == 13 || iM14842z9 == 12) ? 1 : k47Var2.m14812G();
                                            int i70 = 0;
                                            while (i70 < iM14812G3) {
                                                int i71 = i66;
                                                int iM14812G4 = k47Var2.m14812G();
                                                k47Var2.m14819N(iM14812G4);
                                                i70++;
                                                i66 = iM14812G4 + 4 + i71;
                                            }
                                            i67 = i69 + 1;
                                            i31 = i68;
                                        }
                                        int i72 = i31;
                                        k47Var2.m14818M(i64);
                                        byte[] bArr4 = new byte[i66];
                                        int i73 = 0;
                                        int i74 = 0;
                                        while (i73 < iM14842z8) {
                                            int iM14842z10 = k47Var2.m14842z() & 31;
                                            int i75 = iM14842z8;
                                            int iM14812G5 = (iM14842z10 == 13 || iM14842z10 == 12) ? 1 : k47Var2.m14812G();
                                            int i76 = 0;
                                            while (i76 < iM14812G5) {
                                                int i77 = iM14812G5;
                                                int iM14812G6 = k47Var2.m14812G();
                                                System.arraycopy(zuc.f72211a, 0, bArr4, i74, 4);
                                                int i78 = i74 + 4;
                                                k47Var2.m14827k(bArr4, i78, iM14812G6);
                                                i74 = i78 + iM14812G6;
                                                i76++;
                                                iM14812G5 = i77;
                                                i73 = i73;
                                                i30 = i30;
                                            }
                                            i73++;
                                            iM14842z8 = i75;
                                        }
                                        iM12451g = i30;
                                        Locale locale = Locale.US;
                                        String str13 = "vvc1." + i18 + "." + str12 + iM14842z2;
                                        listM6291y = ImmutableList.m6291y(bArr4);
                                        int i79 = i65 + 8;
                                        xh0Var.f68192a = i60;
                                        string = str13;
                                        str9 = "video/vvc";
                                        str8 = str8;
                                        i28 = i79;
                                        i36 = i28;
                                        c3329mb = c3329mb;
                                        i6 = i24;
                                        i5 = i44;
                                        i29 = i53;
                                        i31 = i72;
                                        bArr = null;
                                        i33 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw ParserException.m2516a(e, "Error parsing VVC configuration");
                                    }
                                } else {
                                    iM12451g = i30;
                                    i31 = i31;
                                    if (iM14829m5 == 1986361461) {
                                        k47Var2.m14818M(i37 + 8);
                                        int i80 = k47Var2.f46701b;
                                        ck6 ck6Var2 = null;
                                        while (i80 - i37 < iM14829m4) {
                                            k47Var2.m14818M(i80);
                                            int iM14829m6 = k47Var2.m14829m();
                                            ucd.m22677a(str8, iM14829m6 > 0);
                                            if (k47Var2.m14829m() == 1702454643) {
                                                k47Var2.m14818M(i80 + 8);
                                                int i81 = k47Var2.f46701b;
                                                while (true) {
                                                    if (i81 - i80 >= iM14829m6) {
                                                        ck6Var = null;
                                                        break;
                                                    }
                                                    k47Var2.m14818M(i81);
                                                    int iM14829m7 = k47Var2.m14829m();
                                                    ucd.m22677a(str8, iM14829m7 > 0);
                                                    if (k47Var2.m14829m() == 1937011305) {
                                                        k47Var2.m14819N(4);
                                                        int iM14842z11 = k47Var2.m14842z();
                                                        boolean z5 = (iM14842z11 & 1) == 1;
                                                        boolean z6 = (iM14842z11 & 2) == 2;
                                                        boolean z7 = (iM14842z11 & 8) == i24;
                                                        C3553ry c3553ry = new C3553ry();
                                                        c3553ry.f60020a = z5;
                                                        c3553ry.f60021b = z6;
                                                        c3553ry.f60022c = z7;
                                                        ck6Var = new ck6(c3553ry, i58);
                                                        break;
                                                    }
                                                    i81 += iM14829m7;
                                                    i24 = 8;
                                                    i58 = 5;
                                                }
                                                ck6Var2 = ck6Var;
                                            } else {
                                                i28 = i28;
                                                i80 = i80;
                                            }
                                            i80 += iM14829m6;
                                            i28 = i28;
                                            i24 = 8;
                                            i58 = 5;
                                        }
                                        int i82 = i28;
                                        web webVar = ck6Var2 == null ? null : new web(ck6Var2);
                                        if (webVar != null) {
                                            C3553ry c3553ry2 = (C3553ry) ((ck6) webVar.f66742a).f10194b;
                                            boolean z8 = c3553ry2.f60022c;
                                            if (c3329mb == null || ((ImmutableList) c3329mb.f50860b).size() < 2) {
                                                i17 = i53;
                                                if (i17 == -1) {
                                                    i29 = z8 ? 5 : 4;
                                                } else {
                                                    i29 = i17;
                                                }
                                            } else {
                                                ucd.m22677a("both eye views must be marked as available", c3553ry2.f60020a && c3553ry2.f60021b);
                                                ucd.m22677a("for MV-HEVC, eye_views_reversed must be set to false", !z8);
                                                i17 = i53;
                                                i29 = i17;
                                            }
                                        } else {
                                            i17 = i53;
                                            i29 = i17;
                                        }
                                        str8 = str8;
                                        str9 = str9;
                                        i36 = i36;
                                        c3329mb = c3329mb;
                                        i5 = i44;
                                        i28 = i82;
                                        bArr = null;
                                    } else {
                                        int i83 = i28;
                                        i29 = i53;
                                        if (iM14829m5 == 1685480259 || iM14829m5 == 1685485123 || iM14829m5 == 1685485379) {
                                            str8 = str8;
                                            str9 = str9;
                                            i36 = i36;
                                            c3329mb = c3329mb;
                                            i5 = i44;
                                            bArr = null;
                                            i6 = 8;
                                            iM12451g = iM12451g;
                                            c3404ocM17906c = C3404oc.m17906c(k47Var2);
                                        } else if (iM14829m5 == 1987076931) {
                                            ucd.m22677a(null, str9 == null);
                                            String str14 = i44 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            k47Var2.m14818M(i37 + 12);
                                            byte bM14842z = (byte) k47Var2.m14842z();
                                            byte bM14842z2 = (byte) k47Var2.m14842z();
                                            int iM14842z12 = k47Var2.m14842z();
                                            int i84 = iM14842z12 >> 4;
                                            byte b2 = (byte) ((iM14842z12 >> 1) & 7);
                                            if (str14.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr5 = m41.f50559a;
                                                byte[] bArr6 = new byte[12];
                                                bArr6[0] = 1;
                                                bArr6[1] = 1;
                                                bArr6[2] = bM14842z;
                                                bArr6[b] = 2;
                                                bArr6[4] = 1;
                                                bArr6[5] = bM14842z2;
                                                bArr6[6] = b;
                                                bArr6[7] = 1;
                                                bArr6[8] = (byte) i84;
                                                bArr6[9] = 4;
                                                bArr6[10] = 1;
                                                bArr6[11] = b2;
                                                listM6291y = ImmutableList.m6291y(bArr6);
                                            }
                                            boolean z9 = (iM14842z12 & 1) != 0;
                                            int iM14842z13 = k47Var2.m14842z();
                                            int iM14842z14 = k47Var2.m14842z();
                                            iM12450f = ga1.m12450f(iM14842z13);
                                            int i85 = z9 ? 1 : 2;
                                            iM12451g = ga1.m12451g(iM14842z14);
                                            i36 = i84;
                                            i5 = i44;
                                            str9 = str14;
                                            i31 = i85;
                                            bArr = null;
                                            i6 = 8;
                                            i28 = i36;
                                        } else {
                                            i5 = i44;
                                            int i86 = 11;
                                            if (iM14829m5 == 1635135811) {
                                                int i87 = iM14829m4 - 8;
                                                byte[] bArr7 = new byte[i87];
                                                k47Var2.m14827k(bArr7, 0, i87);
                                                listM6291y = ImmutableList.m6291y(bArr7);
                                                k47Var2.m14818M(i37 + 8);
                                                byte[] bArr8 = k47Var2.f46700a;
                                                so0 so0Var = new so0(bArr8.length, bArr8);
                                                so0Var.m21509m(k47Var2.f46701b * 8);
                                                so0Var.m21512p(1);
                                                int iM21503g6 = so0Var.m21503g(b);
                                                so0Var.m21511o(6);
                                                boolean zM21502f3 = so0Var.m21502f();
                                                boolean zM21502f4 = so0Var.m21502f();
                                                int i88 = -1;
                                                if (iM21503g6 == 2 && zM21502f3) {
                                                    int i89 = zM21502f4 ? 12 : 10;
                                                    i10 = zM21502f4 ? 12 : 10;
                                                    i8 = i89;
                                                } else {
                                                    if (iM21503g6 <= 2) {
                                                        int i90 = zM21502f3 ? 10 : 8;
                                                        i10 = zM21502f3 ? 10 : 8;
                                                        i8 = i90;
                                                    } else {
                                                        i8 = -1;
                                                        i9 = -1;
                                                    }
                                                    so0Var.m21511o(13);
                                                    so0Var.m21510n();
                                                    iM21503g = so0Var.m21503g(4);
                                                    if (iM21503g != 1) {
                                                        ss5.m21686M("BoxParsers", "Unsupported obu_type: " + iM21503g);
                                                        ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                    } else if (so0Var.m21502f()) {
                                                        ss5.m21686M("BoxParsers", "Unsupported obu_extension_flag");
                                                        ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                    } else {
                                                        zM21502f = so0Var.m21502f();
                                                        so0Var.m21510n();
                                                        if (zM21502f || so0Var.m21503g(8) <= 127) {
                                                            iM21503g2 = so0Var.m21503g(3);
                                                            so0Var.m21510n();
                                                            if (so0Var.m21502f()) {
                                                                ss5.m21686M("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                            } else if (so0Var.m21502f()) {
                                                                ss5.m21686M("BoxParsers", "Unsupported timing_info_present_flag");
                                                                ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                            } else {
                                                                if (so0Var.m21502f()) {
                                                                    ss5.m21686M("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                                } else {
                                                                    i11 = 5;
                                                                    iM21503g3 = so0Var.m21503g(5);
                                                                    i12 = 0;
                                                                    while (i12 <= iM21503g3) {
                                                                        so0Var.m21511o(12);
                                                                        if (so0Var.m21503g(i11) > i57) {
                                                                            so0Var.m21510n();
                                                                        }
                                                                        i12++;
                                                                        i11 = 5;
                                                                        i57 = 7;
                                                                    }
                                                                    int iM21503g7 = so0Var.m21503g(4);
                                                                    int iM21503g8 = so0Var.m21503g(4);
                                                                    so0Var.m21511o(iM21503g7 + 1);
                                                                    so0Var.m21511o(iM21503g8 + 1);
                                                                    if (so0Var.m21502f()) {
                                                                        i13 = 7;
                                                                        so0Var.m21511o(7);
                                                                    } else {
                                                                        i13 = 7;
                                                                    }
                                                                    so0Var.m21511o(i13);
                                                                    zM21502f2 = so0Var.m21502f();
                                                                    if (zM21502f2) {
                                                                        so0Var.m21511o(2);
                                                                    }
                                                                    if (so0Var.m21502f()) {
                                                                        iM21503g4 = 2;
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 1;
                                                                        iM21503g4 = so0Var.m21503g(1);
                                                                    }
                                                                    if (iM21503g4 > 0 && !so0Var.m21502f()) {
                                                                        so0Var.m21511o(i14);
                                                                    }
                                                                    if (zM21502f2) {
                                                                        so0Var.m21511o(3);
                                                                    }
                                                                    so0Var.m21511o(3);
                                                                    boolean zM21502f5 = so0Var.m21502f();
                                                                    if (iM21503g2 == 2 && zM21502f5) {
                                                                        so0Var.m21510n();
                                                                    }
                                                                    if (iM21503g2 == 1 && so0Var.m21502f()) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    if (so0Var.m21502f()) {
                                                                        int iM21503g9 = so0Var.m21503g(8);
                                                                        int iM21503g10 = so0Var.m21503g(8);
                                                                        int iM21503g11 = so0Var.m21503g(8);
                                                                        if (z2 && iM21503g9 == 1 && iM21503g10 == 13 && iM21503g11 == 0) {
                                                                            iM21503g5 = 1;
                                                                        } else {
                                                                            iM21503g5 = so0Var.m21503g(1);
                                                                        }
                                                                        int iM12450f2 = ga1.m12450f(iM21503g9);
                                                                        if (iM21503g5 == 1) {
                                                                            i16 = 1;
                                                                        } else {
                                                                            i16 = 2;
                                                                        }
                                                                        i15 = iM12450f2;
                                                                        iM12451g2 = ga1.m12451g(iM21503g10);
                                                                        i88 = i16;
                                                                    } else {
                                                                        i15 = -1;
                                                                        iM12451g2 = -1;
                                                                    }
                                                                    ga1Var = new ga1(i15, i88, iM12451g2, null, i8, i9);
                                                                }
                                                                int i91 = ga1Var.f40448e;
                                                                int i92 = ga1Var.f40449f;
                                                                iM12450f = ga1Var.f40444a;
                                                                int i93 = ga1Var.f40445b;
                                                                iM12451g = ga1Var.f40446c;
                                                                str9 = "video/av01";
                                                                i5 = i5;
                                                                i31 = i93;
                                                                i36 = i91;
                                                                bArr = null;
                                                                i6 = 8;
                                                                i28 = i92;
                                                            }
                                                        } else {
                                                            ss5.m21686M("BoxParsers", "Excessive obu_size");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        }
                                                    }
                                                    ga1Var = ga1Var2;
                                                    int i94 = ga1Var.f40448e;
                                                    int i95 = ga1Var.f40449f;
                                                    iM12450f = ga1Var.f40444a;
                                                    int i96 = ga1Var.f40445b;
                                                    iM12451g = ga1Var.f40446c;
                                                    str9 = "video/av01";
                                                    i5 = i5;
                                                    i31 = i96;
                                                    i36 = i94;
                                                    bArr = null;
                                                    i6 = 8;
                                                    i28 = i95;
                                                }
                                                i9 = i10;
                                                so0Var.m21511o(13);
                                                so0Var.m21510n();
                                                iM21503g = so0Var.m21503g(4);
                                                if (iM21503g != 1) {
                                                    ss5.m21686M("BoxParsers", "Unsupported obu_type: " + iM21503g);
                                                    ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                } else if (so0Var.m21502f()) {
                                                    ss5.m21686M("BoxParsers", "Unsupported obu_extension_flag");
                                                    ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                } else {
                                                    zM21502f = so0Var.m21502f();
                                                    so0Var.m21510n();
                                                    if (zM21502f) {
                                                        iM21503g2 = so0Var.m21503g(3);
                                                        so0Var.m21510n();
                                                        if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported timing_info_present_flag");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else {
                                                            i11 = 5;
                                                            iM21503g3 = so0Var.m21503g(5);
                                                            i12 = 0;
                                                            while (i12 <= iM21503g3) {
                                                                so0Var.m21511o(12);
                                                                if (so0Var.m21503g(i11) > i57) {
                                                                    so0Var.m21510n();
                                                                }
                                                                i12++;
                                                                i11 = 5;
                                                                i57 = 7;
                                                            }
                                                            int iM21503g12 = so0Var.m21503g(4);
                                                            int iM21503g13 = so0Var.m21503g(4);
                                                            so0Var.m21511o(iM21503g12 + 1);
                                                            so0Var.m21511o(iM21503g13 + 1);
                                                            if (so0Var.m21502f()) {
                                                                i13 = 7;
                                                                so0Var.m21511o(7);
                                                            } else {
                                                                i13 = 7;
                                                            }
                                                            so0Var.m21511o(i13);
                                                            zM21502f2 = so0Var.m21502f();
                                                            if (zM21502f2) {
                                                                so0Var.m21511o(2);
                                                            }
                                                            if (so0Var.m21502f()) {
                                                                iM21503g4 = 2;
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                iM21503g4 = so0Var.m21503g(1);
                                                            }
                                                            if (iM21503g4 > 0) {
                                                                so0Var.m21511o(i14);
                                                            }
                                                            if (zM21502f2) {
                                                                so0Var.m21511o(3);
                                                            }
                                                            so0Var.m21511o(3);
                                                            boolean zM21502f6 = so0Var.m21502f();
                                                            if (iM21503g2 == 2) {
                                                                so0Var.m21510n();
                                                            }
                                                            if (iM21503g2 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (so0Var.m21502f()) {
                                                                int iM21503g14 = so0Var.m21503g(8);
                                                                int iM21503g15 = so0Var.m21503g(8);
                                                                int iM21503g16 = so0Var.m21503g(8);
                                                                if (z2) {
                                                                    iM21503g5 = so0Var.m21503g(1);
                                                                } else {
                                                                    iM21503g5 = so0Var.m21503g(1);
                                                                }
                                                                int iM12450f3 = ga1.m12450f(iM21503g14);
                                                                if (iM21503g5 == 1) {
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = 2;
                                                                }
                                                                i15 = iM12450f3;
                                                                iM12451g2 = ga1.m12451g(iM21503g15);
                                                                i88 = i16;
                                                            } else {
                                                                i15 = -1;
                                                                iM12451g2 = -1;
                                                            }
                                                            ga1Var = new ga1(i15, i88, iM12451g2, null, i8, i9);
                                                        }
                                                    } else {
                                                        iM21503g2 = so0Var.m21503g(3);
                                                        so0Var.m21510n();
                                                        if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported timing_info_present_flag");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else if (so0Var.m21502f()) {
                                                            ss5.m21686M("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            ga1Var2 = new ga1(-1, -1, -1, null, i8, i9);
                                                        } else {
                                                            i11 = 5;
                                                            iM21503g3 = so0Var.m21503g(5);
                                                            i12 = 0;
                                                            while (i12 <= iM21503g3) {
                                                                so0Var.m21511o(12);
                                                                if (so0Var.m21503g(i11) > i57) {
                                                                    so0Var.m21510n();
                                                                }
                                                                i12++;
                                                                i11 = 5;
                                                                i57 = 7;
                                                            }
                                                            int iM21503g17 = so0Var.m21503g(4);
                                                            int iM21503g18 = so0Var.m21503g(4);
                                                            so0Var.m21511o(iM21503g17 + 1);
                                                            so0Var.m21511o(iM21503g18 + 1);
                                                            if (so0Var.m21502f()) {
                                                                i13 = 7;
                                                                so0Var.m21511o(7);
                                                            } else {
                                                                i13 = 7;
                                                            }
                                                            so0Var.m21511o(i13);
                                                            zM21502f2 = so0Var.m21502f();
                                                            if (zM21502f2) {
                                                                so0Var.m21511o(2);
                                                            }
                                                            if (so0Var.m21502f()) {
                                                                iM21503g4 = 2;
                                                                i14 = 1;
                                                            } else {
                                                                i14 = 1;
                                                                iM21503g4 = so0Var.m21503g(1);
                                                            }
                                                            if (iM21503g4 > 0) {
                                                                so0Var.m21511o(i14);
                                                            }
                                                            if (zM21502f2) {
                                                                so0Var.m21511o(3);
                                                            }
                                                            so0Var.m21511o(3);
                                                            boolean zM21502f7 = so0Var.m21502f();
                                                            if (iM21503g2 == 2) {
                                                                so0Var.m21510n();
                                                            }
                                                            if (iM21503g2 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (so0Var.m21502f()) {
                                                                int iM21503g19 = so0Var.m21503g(8);
                                                                int iM21503g110 = so0Var.m21503g(8);
                                                                int iM21503g111 = so0Var.m21503g(8);
                                                                if (z2) {
                                                                    iM21503g5 = so0Var.m21503g(1);
                                                                } else {
                                                                    iM21503g5 = so0Var.m21503g(1);
                                                                }
                                                                int iM12450f4 = ga1.m12450f(iM21503g19);
                                                                if (iM21503g5 == 1) {
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = 2;
                                                                }
                                                                i15 = iM12450f4;
                                                                iM12451g2 = ga1.m12451g(iM21503g110);
                                                                i88 = i16;
                                                            } else {
                                                                i15 = -1;
                                                                iM12451g2 = -1;
                                                            }
                                                            ga1Var = new ga1(i15, i88, iM12451g2, null, i8, i9);
                                                        }
                                                    }
                                                    int i97 = ga1Var.f40448e;
                                                    int i98 = ga1Var.f40449f;
                                                    iM12450f = ga1Var.f40444a;
                                                    int i99 = ga1Var.f40445b;
                                                    iM12451g = ga1Var.f40446c;
                                                    str9 = "video/av01";
                                                    i5 = i5;
                                                    i31 = i99;
                                                    i36 = i97;
                                                    bArr = null;
                                                    i6 = 8;
                                                    i28 = i98;
                                                }
                                                ga1Var = ga1Var2;
                                                int i910 = ga1Var.f40448e;
                                                int i911 = ga1Var.f40449f;
                                                iM12450f = ga1Var.f40444a;
                                                int i912 = ga1Var.f40445b;
                                                iM12451g = ga1Var.f40446c;
                                                str9 = "video/av01";
                                                i5 = i5;
                                                i31 = i912;
                                                i36 = i910;
                                                bArr = null;
                                                i6 = 8;
                                                i28 = i911;
                                            } else {
                                                if (iM14829m5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(k47Var2.m14839w());
                                                    byteBufferOrder.putShort(k47Var2.m14839w());
                                                    byteBuffer = byteBufferOrder;
                                                } else if (iM14829m5 == 1835295606) {
                                                    ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short sM14839w = k47Var2.m14839w();
                                                    short sM14839w2 = k47Var2.m14839w();
                                                    short sM14839w3 = k47Var2.m14839w();
                                                    short sM14839w4 = k47Var2.m14839w();
                                                    short sM14839w5 = k47Var2.m14839w();
                                                    short sM14839w6 = k47Var2.m14839w();
                                                    short sM14839w7 = k47Var2.m14839w();
                                                    short sM14839w8 = k47Var2.m14839w();
                                                    long jM14807B = k47Var2.m14807B();
                                                    long jM14807B2 = k47Var2.m14807B();
                                                    byteBufferOrder2.position(1);
                                                    byteBufferOrder2.putShort(sM14839w5);
                                                    byteBufferOrder2.putShort(sM14839w6);
                                                    byteBufferOrder2.putShort(sM14839w);
                                                    byteBufferOrder2.putShort(sM14839w2);
                                                    byteBufferOrder2.putShort(sM14839w3);
                                                    byteBufferOrder2.putShort(sM14839w4);
                                                    byteBufferOrder2.putShort(sM14839w7);
                                                    byteBufferOrder2.putShort(sM14839w8);
                                                    byteBufferOrder2.putShort((short) (jM14807B / 10000));
                                                    byteBufferOrder2.putShort((short) (jM14807B2 / 10000));
                                                    byteBuffer = byteBufferOrder2;
                                                } else {
                                                    i5 = i5;
                                                    str8 = str8;
                                                    str9 = str9;
                                                    i36 = i36;
                                                    c3329mb = c3329mb;
                                                    if (iM14829m5 == 1681012275) {
                                                        bArr = null;
                                                        ucd.m22677a(null, str9 == null);
                                                        i29 = i29;
                                                        str9 = "video/3gpp";
                                                        i28 = i83;
                                                    } else {
                                                        bArr = null;
                                                        if (iM14829m5 == 1702061171) {
                                                            ucd.m22677a(null, str9 == null);
                                                            vh0 vh0VarM424c = m424c(i37, k47Var2);
                                                            String str15 = (String) vh0VarM424c.f65367c;
                                                            byte[] bArr9 = (byte[]) vh0VarM424c.f65368d;
                                                            if (bArr9 != null) {
                                                                listM6291y = ImmutableList.m6291y(bArr9);
                                                            }
                                                            vh0Var = vh0VarM424c;
                                                            str9 = str15;
                                                        } else {
                                                            if (iM14829m5 == 1651798644) {
                                                                k47Var2.m14818M(i37 + 8);
                                                                k47Var2.m14819N(4);
                                                                i29 = i29;
                                                                th0Var = new th0(k47Var2.m14807B(), k47Var2.m14807B());
                                                            } else {
                                                                if (iM14829m5 == 1885434736) {
                                                                    k47Var2.m14818M(i37 + 8);
                                                                    fM14809D = k47Var2.m14809D() / k47Var2.m14809D();
                                                                    i31 = i31;
                                                                    i6 = 8;
                                                                    z3 = true;
                                                                } else if (iM14829m5 == 1937126244) {
                                                                    int i100 = i37 + 8;
                                                                    while (true) {
                                                                        if (i100 - i37 >= iM14829m4) {
                                                                            bArrCopyOfRange = null;
                                                                            break;
                                                                        }
                                                                        k47Var2.m14818M(i100);
                                                                        int iM14829m8 = k47Var2.m14829m();
                                                                        if (k47Var2.m14829m() == 1886547818) {
                                                                            bArrCopyOfRange = Arrays.copyOfRange(k47Var2.f46700a, i100, iM14829m8 + i100);
                                                                            break;
                                                                        }
                                                                        i100 += iM14829m8;
                                                                    }
                                                                    bArr3 = bArrCopyOfRange;
                                                                } else if (iM14829m5 == 1936995172) {
                                                                    int iM14842z15 = k47Var2.m14842z();
                                                                    k47Var2.m14819N(3);
                                                                    if (iM14842z15 == 0) {
                                                                        int iM14842z16 = k47Var2.m14842z();
                                                                        if (iM14842z16 == 0) {
                                                                            i29 = 0;
                                                                        } else if (iM14842z16 == 1) {
                                                                            i29 = 1;
                                                                        } else if (iM14842z16 == 2) {
                                                                            i29 = 2;
                                                                        } else if (iM14842z16 == 3) {
                                                                            i29 = 3;
                                                                        }
                                                                    }
                                                                    i29 = i29;
                                                                } else if (iM14829m5 == 1634760259) {
                                                                    int i101 = iM14829m4 - 12;
                                                                    byte[] bArr10 = new byte[i101];
                                                                    k47Var2.m14818M(i37 + 12);
                                                                    k47Var2.m14827k(bArr10, 0, i101);
                                                                    byte[] bArr11 = m41.f50559a;
                                                                    bna.m3965o("Invalid APV CSD length: %s", i101, i101 >= 17);
                                                                    byte b3 = bArr10[0];
                                                                    bna.m3965o("Invalid APV CSD version: %s", b3, b3 == 1);
                                                                    byte b4 = bArr10[5];
                                                                    byte b5 = bArr10[6];
                                                                    byte b6 = bArr10[7];
                                                                    String str16 = uma.f64080a;
                                                                    Locale locale2 = Locale.US;
                                                                    StringBuilder sbM22994q = ux5.m22994q(b4, b5, "apv1.apvf", ".apvl", ".apvb");
                                                                    sbM22994q.append((int) b6);
                                                                    string = sbM22994q.toString();
                                                                    listM6291y = ImmutableList.m6291y(bArr10);
                                                                    k47 k47Var3 = new k47(bArr10);
                                                                    so0 so0Var2 = new so0(i101, bArr10);
                                                                    i6 = 8;
                                                                    so0Var2.m21509m(k47Var3.f46701b * 8);
                                                                    so0Var2.m21512p(1);
                                                                    int iM21503g20 = so0Var2.m21503g(8);
                                                                    int i102 = 0;
                                                                    int i103 = -1;
                                                                    int i104 = -1;
                                                                    int i105 = -1;
                                                                    int i106 = -1;
                                                                    int i107 = -1;
                                                                    while (i102 < iM21503g20) {
                                                                        so0Var2.m21512p(1);
                                                                        int iM21503g21 = so0Var2.m21503g(8);
                                                                        int i108 = i107;
                                                                        int i109 = i106;
                                                                        int iM21503g22 = i105;
                                                                        int iM12451g3 = i104;
                                                                        int i110 = i103;
                                                                        int i111 = 0;
                                                                        while (i111 < iM21503g21) {
                                                                            so0Var2.m21511o(6);
                                                                            boolean zM21502f8 = so0Var2.m21502f();
                                                                            so0Var2.m21510n();
                                                                            so0Var2.m21512p(i86);
                                                                            so0Var2.m21511o(4);
                                                                            iM21503g22 = so0Var2.m21503g(4) + 8;
                                                                            so0Var2.m21512p(1);
                                                                            if (zM21502f8) {
                                                                                int iM21503g23 = so0Var2.m21503g(8);
                                                                                int iM21503g24 = so0Var2.m21503g(8);
                                                                                so0Var2.m21512p(1);
                                                                                boolean zM21502f9 = so0Var2.m21502f();
                                                                                int iM12450f5 = ga1.m12450f(iM21503g23);
                                                                                i109 = zM21502f9 ? 1 : 2;
                                                                                iM12451g3 = ga1.m12451g(iM21503g24);
                                                                                i108 = iM12450f5;
                                                                            }
                                                                            i111++;
                                                                            i110 = iM21503g22;
                                                                            i86 = 11;
                                                                        }
                                                                        i102++;
                                                                        i103 = i110;
                                                                        i104 = iM12451g3;
                                                                        i105 = iM21503g22;
                                                                        i106 = i109;
                                                                        i107 = i108;
                                                                        i86 = 11;
                                                                    }
                                                                    str9 = "video/apv";
                                                                    iM12451g = i104;
                                                                    i36 = i105;
                                                                    i31 = i106;
                                                                    iM12450f = i107;
                                                                    i29 = i29;
                                                                    i28 = i103;
                                                                } else {
                                                                    i6 = 8;
                                                                    if (iM14829m5 == 1668246642) {
                                                                        i7 = iM12451g;
                                                                        if (iM12450f == -1 && i7 == -1) {
                                                                            int iM14829m9 = k47Var2.m14829m();
                                                                            if (iM14829m9 == 1852009592 || iM14829m9 == 1852009571) {
                                                                                int iM14812G7 = k47Var2.m14812G();
                                                                                int iM14812G8 = k47Var2.m14812G();
                                                                                k47Var2.m14819N(2);
                                                                                boolean z10 = iM14829m4 == 19 && (k47Var2.m14842z() & 128) != 0;
                                                                                iM12450f = ga1.m12450f(iM14812G7);
                                                                                i31 = z10 ? 1 : 2;
                                                                                iM12451g = ga1.m12451g(iM14812G8);
                                                                            } else {
                                                                                ss5.m21707d0("BoxParsers", "Unsupported color type: ".concat(bj0.m3750a(iM14829m9)));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i7 = iM12451g;
                                                                    }
                                                                    iM12451g = i7;
                                                                }
                                                                i29 = i29;
                                                                i28 = i83;
                                                            }
                                                            i31 = i31;
                                                            i28 = i83;
                                                            i6 = 8;
                                                        }
                                                        i6 = 8;
                                                        i29 = i29;
                                                        i28 = i83;
                                                    }
                                                }
                                                bArr = null;
                                                i6 = 8;
                                                i29 = i29;
                                                i28 = i83;
                                            }
                                        }
                                        i31 = i31;
                                        i29 = i29;
                                        i28 = i83;
                                    }
                                    i6 = 8;
                                }
                            }
                        }
                    }
                    i27 = i38 + iM14829m4;
                    bArr2 = bArr;
                    i24 = i6;
                    iM14829m3 = i5;
                    iM14829m2 = i39;
                    str8 = str8;
                    str9 = str9;
                    i30 = iM12451g;
                    i36 = i36;
                    c3329mb = c3329mb;
                    b = 3;
                }
                int i112 = i28;
                int i113 = i29;
                i4 = iM14829m2;
                int i114 = i30;
                String str17 = str9;
                int i115 = i36;
                int i116 = i31;
                byte[] bArr12 = bArr2;
                if (c3404ocM17906c != null) {
                    str3 = c3404ocM17906c.f54162b;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str17;
                }
                if (str4 == null) {
                    str5 = str;
                } else {
                    lc3 lc3Var = new lc3();
                    lc3Var.f49440a = Integer.toString(i2);
                    lc3Var.f49453n = ez5.m11402l(str4);
                    lc3Var.f49449j = str3;
                    lc3Var.f49460u = iM14812G;
                    lc3Var.f49461v = iM14812G2;
                    lc3Var.f49462w = i35;
                    lc3Var.f49463x = i34;
                    lc3Var.f49425A = fM14809D;
                    lc3Var.f49465z = i25;
                    lc3Var.f49426B = bArr3;
                    lc3Var.f49427C = i113;
                    lc3Var.f49456q = listM6291y;
                    lc3Var.f49455p = i33;
                    lc3Var.f49429E = i32;
                    lc3Var.f49457r = drmInitData3;
                    str5 = str;
                    lc3Var.f49443d = str5;
                    lc3Var.f49428D = new ga1(iM12450f, i116, i114, byteBuffer != null ? byteBuffer.array() : bArr12, i115, i112);
                    th0 th0Var2 = th0Var;
                    if (th0Var2 != null) {
                        lc3Var.f49447h = AbstractC1110a.m6364d(th0Var2.f62270a);
                        lc3Var.f49448i = AbstractC1110a.m6364d(th0Var2.f62271b);
                    } else {
                        vh0 vh0Var2 = vh0Var;
                        if (vh0Var2 != null) {
                            lc3Var.f49447h = AbstractC1110a.m6364d(vh0Var2.f65365a);
                            lc3Var.f49448i = AbstractC1110a.m6364d(vh0Var2.f65366b);
                        }
                    }
                    xh0Var.f68195d = new C0713b(lc3Var);
                }
            } else {
                if (iM14829m3 == 1836069985 || iM14829m3 == 1701733217 || iM14829m3 == 1633889587 || iM14829m3 == 1700998451 || iM14829m3 == 1633889588 || iM14829m3 == 1835823201 || iM14829m3 == 1685353315 || iM14829m3 == 1685353317 || iM14829m3 == 1685353320 || iM14829m3 == 1685353324 || iM14829m3 == 1685353336 || iM14829m3 == 1935764850 || iM14829m3 == 1935767394 || iM14829m3 == 1819304813 || iM14829m3 == 1936684916 || iM14829m3 == 1953984371 || iM14829m3 == 778924082 || iM14829m3 == 778924083 || iM14829m3 == 1835557169 || iM14829m3 == 1835560241 || iM14829m3 == 1634492771 || iM14829m3 == 1634492791 || iM14829m3 == 1970037111 || iM14829m3 == 1332770163 || iM14829m3 == 1716281667 || iM14829m3 == 1767992678 || iM14829m3 == 1768973165 || iM14829m3 == 1718641517) {
                    k47Var2 = k47Var;
                    m423b(k47Var2, iM14829m3, i23, iM14829m2, zh0Var2.f71568a, str7, z, drmInitData, xh0Var, i22);
                    str5 = str;
                    i23 = i23;
                    i4 = iM14829m2;
                } else if (iM14829m3 == 1414810956 || iM14829m3 == 1954034535 || iM14829m3 == 2004251764 || iM14829m3 == 1937010800 || iM14829m3 == 1664495672 || iM14829m3 == 1836070003) {
                    k47Var2.m14818M(i23 + 16);
                    String str18 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iM14829m3 != 1414810956) {
                        if (iM14829m3 == 1954034535) {
                            int i117 = iM14829m2 - 16;
                            byte[] bArr13 = new byte[i117];
                            k47Var2.m14827k(bArr13, 0, i117);
                            immutableListM6291y = ImmutableList.m6291y(bArr13);
                            str18 = "application/x-quicktime-tx3g";
                            i19 = i23;
                            i20 = iM14829m2;
                        } else {
                            if (iM14829m3 == 2004251764) {
                                str18 = "application/x-mp4-vtt";
                            } else if (iM14829m3 == 1937010800) {
                                j2 = 0;
                            } else if (iM14829m3 == 1664495672) {
                                xh0Var.f68193b = 1;
                                str18 = "application/x-mp4-cea-608";
                            } else {
                                if (iM14829m3 != 1836070003) {
                                    uk9.m22770c();
                                    return null;
                                }
                                int i118 = k47Var2.f46701b;
                                k47Var2.m14819N(4);
                                if (k47Var2.m14829m() == 1702061171) {
                                    byte[] bArr14 = (byte[]) m424c(i118, k47Var2).f65368d;
                                    if (bArr14 == null || bArr14.length != 64) {
                                        i19 = i23;
                                        i20 = iM14829m2;
                                    } else {
                                        int i119 = zh0Var2.f71571d;
                                        int i120 = zh0Var2.f71572e;
                                        bna.m3987z(bArr14.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i121 = 0;
                                        while (i121 < bArr14.length - 3) {
                                            byte[] bArr15 = bArr14;
                                            int iM6363c = AbstractC1110a.m6363c(bArr14[i121], bArr14[i121 + 1], bArr14[i121 + 2], bArr15[i121 + 3]);
                                            int i122 = (iM6363c >> 16) & 255;
                                            int i123 = ((iM6363c >> 8) & 255) - 128;
                                            int i124 = (iM6363c & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(uma.m22812g(hn1.m13352a(i124, 17790, 10000, i122), 0, 255) | (uma.m22812g((i122 - ((i124 * 3455) / 10000)) - ((i123 * 7169) / 10000), 0, 255) << 8) | (uma.m22812g(hn1.m13352a(i123, 14075, 10000, i122), 0, 255) << 16))));
                                            i121 += 4;
                                            bArr14 = bArr15;
                                            i23 = i23;
                                            iM14829m2 = iM14829m2;
                                        }
                                        i19 = i23;
                                        i20 = iM14829m2;
                                        StringBuilder sbM22994q2 = ux5.m22994q(i119, i120, "size: ", "x", "\npalette: ");
                                        sbM22994q2.append(new si4(", ", 1).m21395b(arrayList));
                                        sbM22994q2.append("\n");
                                        String string2 = sbM22994q2.toString();
                                        String str19 = uma.f64080a;
                                        immutableListM6291y = ImmutableList.m6291y(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i19 = i23;
                                    i20 = iM14829m2;
                                    str6 = null;
                                    immutableListM6291y = null;
                                }
                                str18 = str6;
                            }
                            i19 = i23;
                            i20 = iM14829m2;
                            immutableListM6291y = null;
                        }
                        j = j2;
                        if (str18 != null) {
                            lc3 lc3Var2 = new lc3();
                            lc3Var2.f49440a = Integer.toString(i21);
                            lc3Var2.f49453n = ez5.m11402l(str18);
                            lc3Var2.f49443d = str7;
                            lc3Var2.f49458s = j;
                            lc3Var2.f49456q = immutableListM6291y;
                            xh0Var.f68195d = new C0713b(lc3Var2);
                        }
                    } else {
                        i19 = i23;
                        i20 = iM14829m2;
                        immutableListM6291y = null;
                        j = j2;
                        if (str18 != null) {
                            lc3 lc3Var3 = new lc3();
                            lc3Var3.f49440a = Integer.toString(i21);
                            lc3Var3.f49453n = ez5.m11402l(str18);
                            lc3Var3.f49443d = str7;
                            lc3Var3.f49458s = j;
                            lc3Var3.f49456q = immutableListM6291y;
                            xh0Var.f68195d = new C0713b(lc3Var3);
                        }
                    }
                    k47Var2 = k47Var;
                    str5 = str7;
                    i = i22;
                    i2 = i21;
                    i3 = iM14829m;
                    i4 = i20;
                    i23 = i19;
                } else {
                    if (iM14829m3 == 1835365492) {
                        k47Var2.m14818M(i23 + 16);
                        if (iM14829m3 == 1835365492) {
                            k47Var2.m14837u();
                            String strM14837u = k47Var2.m14837u();
                            if (strM14837u != null) {
                                lc3 lc3Var4 = new lc3();
                                lc3Var4.f49440a = Integer.toString(i21);
                                lc3Var4.f49453n = ez5.m11402l(strM14837u);
                                xh0Var.f68195d = new C0713b(lc3Var4);
                            }
                        }
                    } else if (iM14829m3 == 1667329389) {
                        lc3 lc3Var5 = new lc3();
                        lc3Var5.f49440a = Integer.toString(i21);
                        lc3Var5.f49453n = ez5.m11402l("application/x-camera-motion");
                        xh0Var.f68195d = new C0713b(lc3Var5);
                    }
                    i23 = i23;
                    i4 = iM14829m2;
                    str5 = str7;
                }
                i = i22;
                i2 = i21;
                i3 = iM14829m;
            }
            k47Var2.m14818M(i23 + i4);
            i22 = i + 1;
            zh0Var2 = zh0Var;
            str7 = str5;
            i21 = i2;
            iM14829m = i3;
        }
        return xh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec A[EDGE_INSN: B:105:0x01ec->B:104:0x01e9 BREAK  A[LOOP:18: B:95:0x01cc->B:106:0x01f8]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f8 A[LOOP:18: B:95:0x01cc->B:106:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:120:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x0304  */
    /* JADX WARN: Code duplicated, block: B:158:0x0318  */
    /* JADX WARN: Code duplicated, block: B:212:0x04af  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:218:0x04be  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ca A[LOOP:1: B:219:0x04c4->B:221:0x04ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x04dd A[LOOP:2: B:223:0x04db->B:224:0x04dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:229:0x0512 A[LOOP:4: B:228:0x0510->B:229:0x0512, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x0552  */
    /* JADX WARN: Code duplicated, block: B:234:0x0555  */
    /* JADX WARN: Code duplicated, block: B:236:0x0559  */
    /* JADX WARN: Code duplicated, block: B:238:0x055d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0561  */
    /* JADX WARN: Code duplicated, block: B:243:0x0574  */
    /* JADX WARN: Code duplicated, block: B:245:0x0577  */
    /* JADX WARN: Code duplicated, block: B:246:0x057a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0580  */
    /* JADX WARN: Code duplicated, block: B:250:0x0583  */
    /* JADX WARN: Code duplicated, block: B:253:0x0589  */
    /* JADX WARN: Code duplicated, block: B:254:0x058c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0592  */
    /* JADX WARN: Code duplicated, block: B:258:0x0595  */
    /* JADX WARN: Code duplicated, block: B:261:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:263:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:265:0x05c1 A[LOOP:14: B:262:0x05b9->B:265:0x05c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x05df A[EDGE_INSN: B:270:0x05df->B:301:0x0697 BREAK  A[LOOP:13: B:260:0x05b5->B:299:0x067b]] */
    /* JADX WARN: Code duplicated, block: B:271:0x05fa A[EDGE_INSN: B:271:0x05fa->B:301:0x0697 BREAK  A[LOOP:13: B:260:0x05b5->B:299:0x067b]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0604 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0606 A[ADDED_TO_REGION, LOOP:15: B:273:0x0606->B:275:0x060a, LOOP_START, PHI: r3 r24 r25
      0x0606: PHI (r3v10 int) = (r3v3 int), (r3v11 int) binds: [B:272:0x0604, B:275:0x060a] A[DONT_GENERATE, DONT_INLINE]
      0x0606: PHI (r24v8 int) = (r24v6 int), (r24v10 int) binds: [B:272:0x0604, B:275:0x060a] A[DONT_GENERATE, DONT_INLINE]
      0x0606: PHI (r25v6 int) = (r25v2 int), (r25v7 int) binds: [B:272:0x0604, B:275:0x060a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:279:0x0622  */
    /* JADX WARN: Code duplicated, block: B:281:0x0625  */
    /* JADX WARN: Code duplicated, block: B:283:0x0633  */
    /* JADX WARN: Code duplicated, block: B:284:0x0635  */
    /* JADX WARN: Code duplicated, block: B:287:0x063a  */
    /* JADX WARN: Code duplicated, block: B:289:0x064b  */
    /* JADX WARN: Code duplicated, block: B:291:0x0651 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x066d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x069c A[DONT_INVERT, LOOP:16: B:303:0x069c->B:307:0x06a6, LOOP_START, PHI: r25
      0x069c: PHI (r25v3 int) = (r25v2 int), (r25v4 int) binds: [B:302:0x069a, B:307:0x06a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x069e  */
    /* JADX WARN: Code duplicated, block: B:307:0x06a6 A[LOOP:16: B:303:0x069c->B:307:0x06a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x06ac A[EDGE_INSN: B:308:0x06ac->B:309:0x06ad BREAK  A[LOOP:16: B:303:0x069c->B:307:0x06a6]] */
    /* JADX WARN: Code duplicated, block: B:317:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:319:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:325:0x070e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0750 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x0752  */
    /* JADX WARN: Code duplicated, block: B:336:0x0766  */
    /* JADX WARN: Code duplicated, block: B:338:0x076c  */
    /* JADX WARN: Code duplicated, block: B:344:0x078d  */
    /* JADX WARN: Code duplicated, block: B:347:0x0791  */
    /* JADX WARN: Code duplicated, block: B:349:0x0797  */
    /* JADX WARN: Code duplicated, block: B:353:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:378:0x086e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0878  */
    /* JADX WARN: Code duplicated, block: B:390:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:391:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:395:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:397:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:400:0x090c  */
    /* JADX WARN: Code duplicated, block: B:402:0x0912  */
    /* JADX WARN: Code duplicated, block: B:403:0x0914  */
    /* JADX WARN: Code duplicated, block: B:410:0x0928  */
    /* JADX WARN: Code duplicated, block: B:416:0x093b  */
    /* JADX WARN: Code duplicated, block: B:421:0x0949  */
    /* JADX WARN: Code duplicated, block: B:426:0x095f  */
    /* JADX WARN: Code duplicated, block: B:427:0x0961  */
    /* JADX WARN: Code duplicated, block: B:429:0x0969  */
    /* JADX WARN: Code duplicated, block: B:433:0x0987  */
    /* JADX WARN: Code duplicated, block: B:434:0x0989  */
    /* JADX WARN: Code duplicated, block: B:437:0x098f  */
    /* JADX WARN: Code duplicated, block: B:438:0x0992  */
    /* JADX WARN: Code duplicated, block: B:440:0x0995  */
    /* JADX WARN: Code duplicated, block: B:441:0x0998  */
    /* JADX WARN: Code duplicated, block: B:443:0x099b  */
    /* JADX WARN: Code duplicated, block: B:445:0x099f  */
    /* JADX WARN: Code duplicated, block: B:446:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:448:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:449:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:453:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:455:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:458:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a10 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:495:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x091e A[EDGE_INSN: B:500:0x091e->B:407:0x091e BREAK  A[LOOP:8: B:398:0x0909->B:406:0x091b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x091b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0935 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0956 A[ADDED_TO_REGION, EDGE_INSN: B:506:0x0956->B:424:0x0956 BREAK  A[LOOP:10: B:419:0x0943->B:423:0x094f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0a21 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x068d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x067b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x05d2 A[EDGE_INSN: B:520:0x05d2->B:266:0x05d2 BREAK  A[LOOP:14: B:262:0x05b9->B:265:0x05c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x06ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    /* JADX INFO: renamed from: j */
    public static ArrayList m431j(e46 e46Var, ak3 ak3Var, long j, DrmInitData drmInitData, boolean z, boolean z2, gj3 gj3Var, boolean z3) {
        int i;
        int i2;
        long j2;
        long jM22803H;
        long j3;
        int i3;
        int i4;
        zh0 zh0Var;
        long j4;
        long j5;
        long j6;
        long jM22803H2;
        k47 k47Var;
        int iM426e;
        int i5;
        long jM14807B;
        int i6;
        int i7;
        int i8;
        long j7;
        char[] cArr;
        int i9;
        String str;
        f46 f46VarM10845m;
        xh0 xh0VarM430i;
        long[] jArr;
        long[] jArr2;
        C0713b c0713b;
        int i10;
        C0713b c0713b2;
        g8a g8aVar;
        d46 d46Var;
        ey5 ey5Var;
        ey5 ey5Var2;
        e46 e46VarM10844k;
        Pair pairCreate;
        char c;
        long jM14811F;
        long j8;
        wh0 doaVar;
        boolean z4;
        ArrayList arrayList;
        int iM14809D;
        int iM14809D2;
        int iM14809D3;
        int iMo10553a;
        k47 k47Var2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArr3;
        int[] iArr;
        wh0 wh0Var;
        long[] jArrCopyOf;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        long j9;
        long j10;
        long j11;
        int i15;
        int iM14829m;
        int i16;
        int iM14809D4;
        int i17;
        int iM14809D5;
        k47 k47Var3;
        int i18;
        ArrayList arrayList3;
        long[] jArr4;
        int[] iArrCopyOf;
        int[] iArrCopyOf2;
        int i19;
        boolean z7;
        String str2;
        int i20;
        long[] jArr5;
        int i21;
        long j12;
        long j13;
        boolean zM22736a;
        int i22;
        ArrayList arrayList4;
        int iMo10555c;
        int i23;
        int[] iArr3;
        ArrayList arrayList5;
        int i24;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        long j14;
        int i25;
        long j15;
        C0713b c0713b3;
        long[] jArr7;
        long[] jArr8;
        long jM22803H3;
        int[] iArrM6365e;
        long[] jArr9;
        long j16;
        int i26;
        boolean z8;
        int[] iArr6;
        int[] iArr7;
        int i27;
        int i28;
        boolean z9;
        int i29;
        int[] iArr8;
        int[] iArr9;
        boolean z10;
        boolean z11;
        long[] jArr10;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList6;
        long[] jArr11;
        int i30;
        boolean z12;
        int i31;
        int i32;
        long j17;
        C0713b c0713b4;
        o8a o8aVar;
        long j18;
        int i33;
        int i34;
        int i35;
        int i36;
        long jM22803H4;
        int[] iArr12;
        long j19;
        int[] iArr13;
        int i37;
        long jM22803H5;
        int iM22806a;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        boolean z13;
        int i43;
        o8a o8aVar2;
        int i44;
        long jM22803H6;
        long jM22803H7;
        int i45;
        long[] jArr12;
        int[] iArr14;
        long j20;
        int i46;
        int i47;
        int iM22810e;
        long[] jArr13;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        long j21;
        int i53;
        int i54;
        int i55;
        e46 e46Var2 = e46Var;
        ArrayList arrayList7 = e46Var2.f36701e;
        ArrayList arrayList8 = new ArrayList();
        int i56 = 0;
        while (i56 < arrayList7.size()) {
            e46 e46Var3 = (e46) arrayList7.get(i56);
            if (e46Var3.f8576b != 1953653099) {
                arrayList = arrayList7;
                arrayList8 = arrayList8;
                i2 = i56;
            } else {
                f46 f46VarM10845m2 = e46Var2.m10845m(1836476516);
                f46VarM10845m2.getClass();
                e46 e46VarM10844k2 = e46Var3.m10844k(1835297121);
                e46VarM10844k2.getClass();
                f46 f46VarM10845m3 = e46VarM10844k2.m10845m(1751411826);
                f46VarM10845m3.getClass();
                k47 k47Var4 = f46VarM10845m3.f38414c;
                k47Var4.m14818M(16);
                int iM14829m2 = k47Var4.m14829m();
                if (iM14829m2 == 1936684398) {
                    i = 1;
                } else if (iM14829m2 == 1986618469) {
                    i = 2;
                } else if (iM14829m2 == 1952807028 || iM14829m2 == 1935832172 || iM14829m2 == 1937072756 || iM14829m2 == 1668047728 || iM14829m2 == 1937072752) {
                    i = 3;
                } else {
                    i = iM14829m2 == 1835365473 ? 5 : -1;
                }
                int i57 = 1;
                i2 = i56;
                if (i == -1) {
                    g8aVar = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    f46 f46VarM10845m4 = e46Var3.m10845m(1953196132);
                    f46VarM10845m4.getClass();
                    k47 k47Var5 = f46VarM10845m4.f38414c;
                    k47Var5.m14818M(8);
                    int iM426e2 = m426e(k47Var5.m14829m());
                    k47Var5.m14819N(iM426e2 != 0 ? 16 : 8);
                    int iM14829m3 = k47Var5.m14829m();
                    k47Var5.m14819N(4);
                    int i58 = k47Var5.f46701b;
                    int i59 = iM426e2 == 0 ? 4 : 8;
                    int i60 = 0;
                    while (true) {
                        jM22803H = -9223372036854775807L;
                        if (i60 >= i59) {
                            k47Var5.m14819N(i59);
                        } else {
                            if (k47Var5.f46700a[i58 + i60] != -1) {
                                long jM14807B2 = iM426e2 == 0 ? k47Var5.m14807B() : k47Var5.m14811F();
                                if (jM14807B2 != 0) {
                                    j3 = jM14807B2;
                                    break;
                                }
                                break;
                            }
                            i60++;
                        }
                        j3 = -9223372036854775807L;
                        break;
                    }
                    k47Var5.m14819N(10);
                    int iM14812G = k47Var5.m14812G();
                    k47Var5.m14819N(4);
                    int iM14829m4 = k47Var5.m14829m();
                    int iM14829m5 = k47Var5.m14829m();
                    k47Var5.m14819N(4);
                    int iM14829m6 = k47Var5.m14829m();
                    int iM14829m7 = k47Var5.m14829m();
                    if (iM14829m4 == 0 && iM14829m5 == 65536 && ((iM14829m6 == -65536 || iM14829m6 == 65536) && iM14829m7 == 0)) {
                        i3 = 90;
                    } else if (iM14829m4 == 0 && iM14829m5 == -65536 && ((iM14829m6 == 65536 || iM14829m6 == -65536) && iM14829m7 == 0)) {
                        i3 = 270;
                    } else {
                        if ((iM14829m4 == -65536 || iM14829m4 == 65536) && iM14829m5 == 0 && iM14829m6 == 0 && iM14829m7 == -65536) {
                            i3 = 180;
                        } else {
                            i4 = 0;
                        }
                        k47Var5.m14819N(16);
                        short sM14839w = k47Var5.m14839w();
                        k47Var5.m14819N(2);
                        zh0Var = new zh0(iM14829m3, iM14812G, i4, sM14839w, k47Var5.m14839w(), j3);
                        if (j == -9223372036854775807L) {
                            j4 = j3;
                        } else {
                            j4 = j;
                        }
                        j5 = m428g(f46VarM10845m2.f38414c).f46695c;
                        if (j4 == -9223372036854775807L) {
                            j6 = j5;
                            jM22803H2 = -9223372036854775807L;
                        } else {
                            String str3 = uma.f64080a;
                            j6 = j5;
                            jM22803H2 = uma.m22803H(j4, 1000000L, j6, RoundingMode.DOWN);
                        }
                        e46 e46VarM10844k3 = e46VarM10844k2.m10844k(1835626086);
                        e46VarM10844k3.getClass();
                        e46 e46VarM10844k4 = e46VarM10844k3.m10844k(1937007212);
                        e46VarM10844k4.getClass();
                        f46 f46VarM10845m5 = e46VarM10844k2.m10845m(1835296868);
                        f46VarM10845m5.getClass();
                        k47Var = f46VarM10845m5.f38414c;
                        k47Var.m14818M(8);
                        iM426e = m426e(k47Var.m14829m());
                        if (iM426e == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        k47Var.m14819N(i5);
                        jM14807B = k47Var.m14807B();
                        i6 = k47Var.f46701b;
                        if (iM426e == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                k47Var.m14819N(i7);
                                break;
                            }
                            if (k47Var.f46700a[i6 + i8] != -1) {
                                if (iM426e == 0) {
                                    jM14811F = k47Var.m14807B();
                                } else {
                                    jM14811F = k47Var.m14811F();
                                }
                                j8 = jM14811F;
                                if (j8 != 0) {
                                    break;
                                }
                                String str4 = uma.f64080a;
                                jM22803H = uma.m22803H(j8, 1000000L, jM14807B, RoundingMode.DOWN);
                                break;
                            }
                            i8++;
                        }
                        j7 = jM22803H;
                        int iM14812G2 = k47Var.m14812G();
                        cArr = new char[]{(char) (((iM14812G2 >> 10) & 31) + 96), (char) (((iM14812G2 >> 5) & 31) + 96), (char) ((iM14812G2 & 31) + 96)};
                        i9 = 0;
                        while (true) {
                            if (i9 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i9];
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i9++;
                        }
                        f46VarM10845m = e46VarM10844k4.m10845m(1937011556);
                        if (f46VarM10845m == null) {
                            ss5.m21707d0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            xh0VarM430i = m430i(f46VarM10845m.f38414c, zh0Var, str, drmInitData, z2);
                            if (!z || (e46VarM10844k = e46Var3.m10844k(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                f46 f46VarM10845m6 = e46VarM10844k.m10845m(1701606260);
                                if (f46VarM10845m6 == null) {
                                    pairCreate = null;
                                } else {
                                    k47 k47Var6 = f46VarM10845m6.f38414c;
                                    k47Var6.m14818M(8);
                                    int iM426e3 = m426e(k47Var6.m14829m());
                                    int iM14809D6 = k47Var6.m14809D();
                                    long[] jArr14 = new long[iM14809D6];
                                    long[] jArr15 = new long[iM14809D6];
                                    int i61 = 0;
                                    while (i61 < iM14809D6) {
                                        int i62 = i61;
                                        int i63 = i57;
                                        jArr14[i62] = iM426e3 == i63 ? k47Var6.m14811F() : k47Var6.m14807B();
                                        jArr15[i62] = iM426e3 == i63 ? k47Var6.m14836t() : k47Var6.m14829m();
                                        if (k47Var6.m14839w() != 1) {
                                            C3386nv.m17626m("Unsupported media rate.");
                                            return null;
                                        }
                                        k47Var6.m14819N(2);
                                        i61 = i62 + 1;
                                        i57 = 1;
                                    }
                                    pairCreate = Pair.create(jArr14, jArr15);
                                }
                                if (pairCreate != null) {
                                    long[] jArr16 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr16;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            c0713b = (C0713b) xh0VarM430i.f68195d;
                            if (c0713b == null) {
                                i10 = zh0Var.f71569b;
                                if (i10 != 0) {
                                    d46Var = new d46(i10);
                                    lc3 lc3VarM2520a = c0713b.m2520a();
                                    ey5Var = ((C0713b) xh0VarM430i.f68195d).f6403l;
                                    if (ey5Var != null) {
                                        ey5Var2 = ey5Var.m11386a(d46Var);
                                    } else {
                                        ey5Var2 = new ey5(d46Var);
                                    }
                                    lc3VarM2520a.f49450k = ey5Var2;
                                    c0713b2 = new C0713b(lc3VarM2520a);
                                } else {
                                    c0713b2 = c0713b;
                                }
                                g8aVar = new g8a(zh0Var.f71568a, i, jM14807B, j6, jM22803H2, j7, c0713b2, xh0VarM430i.f68193b, (h8a[]) xh0VarM430i.f68194c, xh0VarM430i.f68192a, jArr, jArr2);
                            }
                        }
                        g8aVar = null;
                    }
                    i4 = i3;
                    k47Var5.m14819N(16);
                    short sM14839w2 = k47Var5.m14839w();
                    k47Var5.m14819N(2);
                    zh0Var = new zh0(iM14829m3, iM14812G, i4, sM14839w2, k47Var5.m14839w(), j3);
                    if (j == -9223372036854775807L) {
                        j4 = j3;
                    } else {
                        j4 = j;
                    }
                    j5 = m428g(f46VarM10845m2.f38414c).f46695c;
                    if (j4 == -9223372036854775807L) {
                        j6 = j5;
                        jM22803H2 = -9223372036854775807L;
                    } else {
                        String str5 = uma.f64080a;
                        j6 = j5;
                        jM22803H2 = uma.m22803H(j4, 1000000L, j6, RoundingMode.DOWN);
                    }
                    e46 e46VarM10844k5 = e46VarM10844k2.m10844k(1835626086);
                    e46VarM10844k5.getClass();
                    e46 e46VarM10844k6 = e46VarM10844k5.m10844k(1937007212);
                    e46VarM10844k6.getClass();
                    f46 f46VarM10845m7 = e46VarM10844k2.m10845m(1835296868);
                    f46VarM10845m7.getClass();
                    k47Var = f46VarM10845m7.f38414c;
                    k47Var.m14818M(8);
                    iM426e = m426e(k47Var.m14829m());
                    if (iM426e == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    k47Var.m14819N(i5);
                    jM14807B = k47Var.m14807B();
                    i6 = k47Var.f46701b;
                    if (iM426e == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            k47Var.m14819N(i7);
                            break;
                        }
                        if (k47Var.f46700a[i6 + i8] != -1) {
                            if (iM426e == 0) {
                                jM14811F = k47Var.m14807B();
                            } else {
                                jM14811F = k47Var.m14811F();
                            }
                            j8 = jM14811F;
                            if (j8 != 0) {
                                break;
                            }
                            String str6 = uma.f64080a;
                            jM22803H = uma.m22803H(j8, 1000000L, jM14807B, RoundingMode.DOWN);
                            break;
                        }
                        i8++;
                    }
                    j7 = jM22803H;
                    int iM14812G3 = k47Var.m14812G();
                    cArr = new char[]{(char) (((iM14812G3 >> 10) & 31) + 96), (char) (((iM14812G3 >> 5) & 31) + 96), (char) ((iM14812G3 & 31) + 96)};
                    i9 = 0;
                    while (true) {
                        if (i9 < 3) {
                            c = cArr[i9];
                            if (c >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i9++;
                    }
                    f46VarM10845m = e46VarM10844k6.m10845m(1937011556);
                    if (f46VarM10845m == null) {
                        ss5.m21707d0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        xh0VarM430i = m430i(f46VarM10845m.f38414c, zh0Var, str, drmInitData, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        c0713b = (C0713b) xh0VarM430i.f68195d;
                        if (c0713b == null) {
                            i10 = zh0Var.f71569b;
                            if (i10 != 0) {
                                d46Var = new d46(i10);
                                lc3 lc3VarM2520a2 = c0713b.m2520a();
                                ey5Var = ((C0713b) xh0VarM430i.f68195d).f6403l;
                                if (ey5Var != null) {
                                    ey5Var2 = ey5Var.m11386a(d46Var);
                                } else {
                                    ey5Var2 = new ey5(d46Var);
                                }
                                lc3VarM2520a2.f49450k = ey5Var2;
                                c0713b2 = new C0713b(lc3VarM2520a2);
                            } else {
                                c0713b2 = c0713b;
                            }
                            g8aVar = new g8a(zh0Var.f71568a, i, jM14807B, j6, jM22803H2, j7, c0713b2, xh0VarM430i.f68193b, (h8a[]) xh0VarM430i.f68194c, xh0VarM430i.f68192a, jArr, jArr2);
                        }
                    }
                    g8aVar = null;
                }
                g8a g8aVarM12415a = (g8a) gj3Var.apply(g8aVar);
                if (g8aVarM12415a == null) {
                    arrayList = arrayList7;
                    arrayList8 = arrayList8;
                } else {
                    C0713b c0713b5 = g8aVarM12415a.f40397g;
                    e46 e46VarM10844k7 = e46Var3.m10844k(1835297121);
                    e46VarM10844k7.getClass();
                    e46 e46VarM10844k8 = e46VarM10844k7.m10844k(1835626086);
                    e46VarM10844k8.getClass();
                    e46 e46VarM10844k9 = e46VarM10844k8.m10844k(1937007212);
                    e46VarM10844k9.getClass();
                    f46 f46VarM10845m8 = e46VarM10844k9.m10845m(1937011578);
                    if (f46VarM10845m8 != null) {
                        doaVar = new doa(f46VarM10845m8, c0713b5);
                    } else {
                        f46 f46VarM10845m9 = e46VarM10844k9.m10845m(1937013298);
                        if (f46VarM10845m9 == null) {
                            throw ParserException.m2516a(null, "Track has no sample table size information");
                        }
                        yh0 yh0Var = new yh0();
                        k47 k47Var7 = f46VarM10845m9.f38414c;
                        yh0Var.f69838e = k47Var7;
                        k47Var7.m14818M(12);
                        yh0Var.f69835b = k47Var7.m14809D() & 255;
                        yh0Var.f69834a = k47Var7.m14809D();
                        doaVar = yh0Var;
                    }
                    int iMo10554b = doaVar.mo10554b();
                    if (iMo10554b == 0) {
                        o8aVar = new o8a(g8aVarM12415a, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        arrayList = arrayList7;
                    } else {
                        if (g8aVarM12415a.f40392b == 2) {
                            long j22 = g8aVarM12415a.f40396f;
                            if (j22 > j2) {
                                lc3 lc3VarM2520a3 = c0713b5.m2520a();
                                lc3VarM2520a3.f49464y = iMo10554b / (j22 / 1000000.0f);
                                g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a3));
                            }
                        }
                        C0713b c0713b6 = g8aVarM12415a.f40397g;
                        f46 f46VarM10845m10 = e46VarM10844k9.m10845m(1937007471);
                        if (f46VarM10845m10 == null) {
                            f46VarM10845m10 = e46VarM10844k9.m10845m(1668232756);
                            f46VarM10845m10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        k47 k47Var8 = f46VarM10845m10.f38414c;
                        f46 f46VarM10845m11 = e46VarM10844k9.m10845m(1937011555);
                        f46VarM10845m11.getClass();
                        k47 k47Var9 = f46VarM10845m11.f38414c;
                        f46 f46VarM10845m12 = e46VarM10844k9.m10845m(1937011827);
                        f46VarM10845m12.getClass();
                        k47 k47Var10 = f46VarM10845m12.f38414c;
                        f46 f46VarM10845m13 = e46VarM10844k9.m10845m(1937011571);
                        k47 k47Var11 = f46VarM10845m13 != null ? f46VarM10845m13.f38414c : null;
                        f46 f46VarM10845m14 = e46VarM10844k9.m10845m(1668576371);
                        k47 k47Var12 = f46VarM10845m14 != null ? f46VarM10845m14.f38414c : null;
                        uh0 uh0Var = new uh0(k47Var9, k47Var8, z4);
                        k47Var10.m14818M(12);
                        int iM14809D7 = k47Var10.m14809D() - 1;
                        int iM14809D8 = k47Var10.m14809D();
                        arrayList = arrayList7;
                        int iM14809D9 = k47Var10.m14809D();
                        if (k47Var12 != null) {
                            k47Var12.m14818M(12);
                            iM14809D = k47Var12.m14809D();
                        } else {
                            iM14809D = 0;
                        }
                        if (k47Var11 != null) {
                            k47Var11.m14818M(12);
                            iM14809D2 = k47Var11.m14809D();
                            if (iM14809D2 > 0) {
                                iM14809D3 = k47Var11.m14809D() - 1;
                            } else {
                                k47Var11 = null;
                            }
                            iMo10553a = doaVar.mo10553a();
                            k47Var2 = k47Var12;
                            String str7 = c0713b6.f6406o;
                            if (iMo10553a == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iM14809D7 == 0 && iM14809D == 0 && iM14809D2 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (k47Var11 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i45 = uh0Var.f63915a;
                                jArr12 = new long[i45];
                                iArr14 = new int[i45];
                                while (uh0Var.m22736a()) {
                                    int i64 = uh0Var.f63916b;
                                    jArr12[i64] = uh0Var.f63918d;
                                    iArr14[i64] = uh0Var.f63917c;
                                }
                                j20 = iM14809D9;
                                i46 = 8192 / iMo10553a;
                                iM22810e = 0;
                                for (i47 = 0; i47 < i45; i47++) {
                                    iM22810e += uma.m22810e(iArr14[i47], i46);
                                }
                                jArr13 = new long[iM22810e];
                                iArrCopyOf = new int[iM22810e];
                                jArr5 = new long[iM22810e];
                                iArrCopyOf2 = new int[iM22810e];
                                i48 = 0;
                                i49 = 0;
                                i50 = 0;
                                i51 = 0;
                                i52 = 0;
                                while (i48 < i45) {
                                    int i65 = iArr14[i48];
                                    j21 = jArr12[i48];
                                    int i66 = i52;
                                    int i67 = i48;
                                    i53 = i51;
                                    i54 = i66;
                                    int i68 = i45;
                                    i55 = i65;
                                    while (i55 > 0) {
                                        int iMin = Math.min(i46, i55);
                                        jArr13[i54] = j21;
                                        int i69 = i46;
                                        int i70 = iMo10553a * iMin;
                                        iArrCopyOf[i54] = i70;
                                        i50 += i70;
                                        int iMax = Math.max(i53, i70);
                                        jArr5[i54] = ((long) i49) * j20;
                                        iArrCopyOf2[i54] = 1;
                                        j21 += (long) iArrCopyOf[i54];
                                        i49 += iMin;
                                        i55 -= iMin;
                                        i54++;
                                        i46 = i69;
                                        i53 = iMax;
                                    }
                                    int i71 = i46;
                                    int i72 = i67 + 1;
                                    i52 = i54;
                                    i45 = i68;
                                    i51 = i53;
                                    i48 = i72;
                                    i46 = i71;
                                }
                                long j23 = j20 * ((long) i49);
                                j13 = i50;
                                if (z3) {
                                    jArr4 = new long[0];
                                }
                                if (z3) {
                                    jArr4 = jArr13;
                                    iArrCopyOf = new int[0];
                                }
                                if (z3) {
                                    jArr5 = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                arrayList3 = arrayList2;
                                j12 = j23;
                                i20 = iM22810e;
                                i21 = i51;
                            } else {
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iMo10554b];
                                }
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iMo10554b];
                                }
                                wh0Var = doaVar;
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                } else {
                                    jArrCopyOf = new long[iMo10554b];
                                }
                                int i73 = iM14809D2;
                                if (z3) {
                                    iArr2 = new int[0];
                                } else {
                                    iArr2 = new int[iMo10554b];
                                }
                                i11 = iM14809D7;
                                i12 = iM14809D;
                                i13 = iM14809D9;
                                i14 = i73;
                                j9 = j2;
                                j10 = j9;
                                j11 = j10;
                                i15 = 0;
                                iM14829m = 0;
                                i16 = 0;
                                iM14809D4 = 0;
                                i17 = iM14809D8;
                                iM14809D5 = iM14809D3;
                                k47Var3 = k47Var11;
                                i18 = 0;
                                while (true) {
                                    if (i18 < iMo10554b) {
                                        arrayList3 = arrayList2;
                                        jArr4 = jArr3;
                                        iArrCopyOf = iArr;
                                        iArrCopyOf2 = iArr2;
                                        i19 = i16;
                                        break;
                                    }
                                    zM22736a = true;
                                    while (i16 == 0) {
                                        zM22736a = uh0Var.m22736a();
                                        if (zM22736a) {
                                            break;
                                        }
                                        j11 = uh0Var.f63918d;
                                        i16 = uh0Var.f63917c;
                                        arrayList2 = arrayList2;
                                        i13 = i13;
                                    }
                                    i22 = i13;
                                    arrayList4 = arrayList2;
                                    if (!zM22736a) {
                                        ss5.m21707d0("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i18);
                                            iArrCopyOf = Arrays.copyOf(iArr, i18);
                                            jArr4 = jArrCopyOf2;
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                            iMo10554b = i18;
                                            i19 = i16;
                                            arrayList3 = arrayList4;
                                            iArrCopyOf2 = Arrays.copyOf(iArr2, i18);
                                            break;
                                        }
                                        iArrCopyOf = iArr;
                                        jArr4 = jArr3;
                                        iMo10554b = i18;
                                        i19 = i16;
                                        arrayList3 = arrayList4;
                                        iArrCopyOf2 = iArr2;
                                        break;
                                    }
                                    if (k47Var2 != null) {
                                        while (iM14809D4 == 0 && i12 > 0) {
                                            iM14809D4 = k47Var2.m14809D();
                                            iM14829m = k47Var2.m14829m();
                                            i12--;
                                        }
                                        iM14809D4--;
                                    }
                                    iMo10555c = wh0Var.mo10555c();
                                    int i74 = iMo10554b;
                                    long j24 = iMo10555c;
                                    j10 += j24;
                                    if (iMo10555c > i15) {
                                        i15 = iMo10555c;
                                    }
                                    if (z3) {
                                        i23 = i15;
                                        iArr3 = iArr;
                                    } else {
                                        jArr3[i18] = j11;
                                        iArr[i18] = iMo10555c;
                                        i23 = i15;
                                        iArr3 = iArr;
                                        jArrCopyOf[i18] = j9 + ((long) iM14829m);
                                        if (k47Var3 == null) {
                                            i24 = 1;
                                        } else {
                                            i24 = 0;
                                        }
                                        iArr2[i18] = i24;
                                        if (i18 == iM14809D5) {
                                            iArr2[i18] = 1;
                                            arrayList5 = arrayList4;
                                            arrayList5.add(Integer.valueOf(i18));
                                        }
                                        if (k47Var3 != null && i18 == iM14809D5 && (i14 = i14 - 1) > 0) {
                                            iM14809D5 = k47Var3.m14809D() - 1;
                                        }
                                        int i75 = iM14829m;
                                        int i76 = i22;
                                        ArrayList arrayList9 = arrayList5;
                                        j9 += (long) i76;
                                        i17--;
                                        if (i17 != 0 && i11 > 0) {
                                            int iM14809D10 = k47Var10.m14809D();
                                            int iM14829m8 = k47Var10.m14829m();
                                            i11--;
                                            i17 = iM14809D10;
                                            i76 = iM14829m8;
                                        }
                                        j11 += j24;
                                        i16--;
                                        i18++;
                                        iArr = iArr3;
                                        iMo10554b = i74;
                                        iM14829m = i75;
                                        arrayList2 = arrayList9;
                                        i13 = i76;
                                        i15 = i23;
                                    }
                                    arrayList5 = arrayList4;
                                    if (k47Var3 != null) {
                                        iM14809D5 = k47Var3.m14809D() - 1;
                                    }
                                    int i77 = iM14829m;
                                    int i78 = i22;
                                    ArrayList arrayList10 = arrayList5;
                                    j9 += (long) i78;
                                    i17--;
                                    if (i17 != 0) {
                                    }
                                    j11 += j24;
                                    i16--;
                                    i18++;
                                    iArr = iArr3;
                                    iMo10554b = i74;
                                    iM14829m = i77;
                                    arrayList2 = arrayList10;
                                    i13 = i78;
                                    i15 = i23;
                                }
                                long j25 = j9 + ((long) iM14829m);
                                if (k47Var2 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i12 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (k47Var2.m14809D() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    k47Var2.m14829m();
                                    i12--;
                                }
                                if (i14 == 0 || i17 != 0 || i19 != 0 || i11 != 0 || iM14809D4 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    hn1.m13360j(g8aVarM12415a.f40391a, i14, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                    hn1.m13360j(i17, i19, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                    sb.append(i11);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iM14809D4);
                                    if (z7) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    ss5.m21707d0("BoxParsers", sb.toString());
                                }
                                i20 = iMo10554b;
                                jArr5 = jArrCopyOf;
                                i21 = i15;
                                j12 = j25;
                                j13 = j10;
                            }
                            jArr6 = jArr4;
                            iArr4 = iArrCopyOf;
                            iArr5 = iArrCopyOf2;
                            j14 = g8aVarM12415a.f40396f;
                            if (j14 > j2) {
                                jM22803H7 = uma.m22803H(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                if (jM22803H7 > j2 && jM22803H7 < 2147483647L) {
                                    lc3 lc3VarM2520a4 = c0713b6.m2520a();
                                    lc3VarM2520a4.f49447h = (int) jM22803H7;
                                    g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a4));
                                }
                            }
                            i25 = g8aVarM12415a.f40392b;
                            j15 = g8aVarM12415a.f40393c;
                            c0713b3 = g8aVarM12415a.f40397g;
                            jArr7 = g8aVarM12415a.f40400j;
                            jArr8 = g8aVarM12415a.f40399i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jM22803H3 = uma.m22803H(j12, 1000000L, j15, roundingMode);
                            iArrM6365e = AbstractC1110a.m6365e(arrayList3);
                            if (jArr8 == null) {
                                if (!z3) {
                                    uma.m22802G(jArr5, j15);
                                }
                                o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr5, iArr5, iArrM6365e, z6, jM22803H3, i20);
                            } else {
                                jArr9 = jArr5;
                                if (z3) {
                                    jArr7.getClass();
                                    if (jArr8.length == 1 || jArr8[0] != j2) {
                                        for (i44 = 0; i44 < jArr8.length; i44++) {
                                            if (jArr7[i44] != -1) {
                                                j2 += jArr8[i44];
                                            }
                                        }
                                        jM22803H6 = uma.m22803H(j2, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                    } else {
                                        jM22803H6 = uma.m22803H(j12 - jArr7[0], 1000000L, g8aVarM12415a.f40393c, roundingMode);
                                    }
                                    o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr9, iArr5, iArrM6365e, z6, jM22803H6, i20);
                                } else {
                                    if (jArr8.length == 1 || i25 != 1 || jArr9.length < 2) {
                                        j16 = -1;
                                    } else {
                                        jArr7.getClass();
                                        long j26 = jArr7[0];
                                        j16 = -1;
                                        long jM22803H8 = j26 + uma.m22803H(jArr8[0], g8aVarM12415a.f40393c, g8aVarM12415a.f40394d, roundingMode);
                                        int length = jArr9.length - 1;
                                        int iM22812g = uma.m22812g(4, 0, length);
                                        int iM22812g2 = uma.m22812g(jArr9.length - 4, 0, length);
                                        if (jArr9[0] <= j26 && j26 < jArr9[iM22812g] && jArr9[iM22812g2] < jM22803H8 && jM22803H8 <= 2 + j12) {
                                            long jMax = Math.max(j2, j12 - jM22803H8);
                                            long jM22803H9 = uma.m22803H(j26 - jArr9[0], c0713b3.f6382H, g8aVarM12415a.f40393c, roundingMode);
                                            long jM22803H10 = uma.m22803H(jMax, c0713b3.f6382H, g8aVarM12415a.f40393c, roundingMode);
                                            if ((jM22803H9 != j2 || jM22803H10 != j2) && jM22803H9 <= 2147483647L && jM22803H10 <= 2147483647L) {
                                                ak3Var.f763a = (int) jM22803H9;
                                                ak3Var.f764b = (int) jM22803H10;
                                                uma.m22802G(jArr9, j15);
                                                o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr9, iArr5, iArrM6365e, z6, uma.m22803H(jArr8[0], 1000000L, g8aVarM12415a.f40394d, roundingMode), i20);
                                            }
                                        }
                                    }
                                    if (jArr8.length == 1 || jArr8[0] != 0) {
                                        i26 = i20;
                                        if (i25 == 1) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        iArr6 = new int[jArr8.length];
                                        iArr7 = new int[jArr8.length];
                                        jArr7.getClass();
                                        i27 = 0;
                                        i28 = 0;
                                        z9 = false;
                                        i29 = 0;
                                        while (i28 < jArr8.length) {
                                            iArr12 = iArr6;
                                            j19 = jArr7[i28];
                                            if (j19 != j16) {
                                                iArr13 = iArr7;
                                                i37 = i28;
                                                jM22803H5 = uma.m22803H(jArr8[i28], g8aVarM12415a.f40393c, g8aVarM12415a.f40394d, RoundingMode.DOWN) + j19;
                                                boolean z14 = z9;
                                                iArr12[i37] = uma.m22809d(jArr9, j19, true);
                                                iM22806a = uma.m22806a(jArr9, jM22803H5, z8);
                                                i38 = iM22806a - 1;
                                                i39 = 0;
                                                while (iM22806a < jArr9.length) {
                                                    if (jArr9[iM22806a] >= jM22803H5) {
                                                        i39++;
                                                        if (i39 > c0713b3.f6408q) {
                                                            break;
                                                        }
                                                    } else {
                                                        i38 = iM22806a;
                                                    }
                                                    iM22806a++;
                                                }
                                                iArr13[i37] = i38 + 1;
                                                i40 = iArr12[i37];
                                                while (true) {
                                                    i41 = iArr12[i37];
                                                    if (i41 > 0 || (iArr5[i41] & 1) != 0) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr12[i37] = i41 - 1;
                                                }
                                                if (i41 == 0 && (iArr5[0] & 1) == 0) {
                                                    iArr12[i37] = i40;
                                                    while (true) {
                                                        i43 = iArr12[i37];
                                                        if (i43 < iArr13[i37] || (iArr5[i43] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr12[i37] = i43 + 1;
                                                    }
                                                }
                                                int i79 = iArr13[i37];
                                                i42 = iArr12[i37];
                                                int i80 = (i79 - i42) + i29;
                                                if (i27 != i42) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                z9 = z14 | z13;
                                                i29 = i80;
                                                i27 = i79;
                                            } else {
                                                iArr13 = iArr7;
                                                i37 = i28;
                                            }
                                            i28 = i37 + 1;
                                            iArr6 = iArr12;
                                            iArr7 = iArr13;
                                            z8 = z8;
                                        }
                                        iArr8 = iArr6;
                                        iArr9 = iArr7;
                                        boolean z15 = z9;
                                        if (i29 != i26) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z11 = z15 | z10;
                                        if (z11) {
                                            jArr10 = new long[i29];
                                        } else {
                                            jArr10 = jArr6;
                                        }
                                        if (z11) {
                                            iArr10 = new int[i29];
                                        } else {
                                            iArr10 = iArr4;
                                        }
                                        if (z11) {
                                            i21 = 0;
                                        }
                                        if (z11) {
                                            iArr11 = new int[i29];
                                        } else {
                                            iArr11 = iArr5;
                                        }
                                        if (z11) {
                                            arrayList6 = new ArrayList();
                                        } else {
                                            arrayList6 = arrayList3;
                                        }
                                        jArr11 = new long[i29];
                                        i30 = 0;
                                        z12 = false;
                                        i31 = 0;
                                        i32 = i21;
                                        j17 = 0;
                                        while (i30 < jArr8.length) {
                                            j18 = jArr7[i30];
                                            i33 = iArr8[i30];
                                            C0713b c0713b7 = c0713b3;
                                            i34 = iArr9[i30];
                                            long[] jArr17 = jArr8;
                                            if (z11) {
                                                int i81 = i34 - i33;
                                                System.arraycopy(jArr6, i33, jArr10, i31, i81);
                                                System.arraycopy(iArr4, i33, iArr10, i31, i81);
                                                System.arraycopy(iArr5, i33, iArr11, i31, i81);
                                            }
                                            i35 = i32;
                                            while (i33 < i34) {
                                                i36 = i33;
                                                int i82 = i34;
                                                long j27 = g8aVarM12415a.f40394d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long jM22803H11 = uma.m22803H(j17, 1000000L, j27, roundingMode2);
                                                jM22803H4 = uma.m22803H(jArr9[i36] - j18, 1000000L, g8aVarM12415a.f40393c, roundingMode2);
                                                if (jM22803H4 < 0) {
                                                    z12 = true;
                                                }
                                                jArr11[i31] = jM22803H11 + jM22803H4;
                                                if (z11 && iArr10[i31] > i35) {
                                                    i35 = iArr4[i36];
                                                }
                                                if (!z11 && !z6 && (iArr11[i31] & 1) != 0) {
                                                    arrayList6.add(Integer.valueOf(i31));
                                                }
                                                i31++;
                                                i33 = i36 + 1;
                                                i34 = i82;
                                            }
                                            j17 += jArr17[i30];
                                            i30++;
                                            i32 = i35;
                                            c0713b3 = c0713b7;
                                            jArr8 = jArr17;
                                        }
                                        c0713b4 = c0713b3;
                                        long jM22803H12 = uma.m22803H(j17, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                        if (z12) {
                                            lc3 lc3VarM2520a5 = c0713b4.m2520a();
                                            lc3VarM2520a5.f49459t = true;
                                            g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a5));
                                        }
                                        o8aVar = new o8a(g8aVarM12415a, jArr10, iArr10, i32, jArr11, iArr11, AbstractC1110a.m6365e(arrayList6), z6, jM22803H12, jArr10.length);
                                    } else {
                                        jArr7.getClass();
                                        long j28 = jArr7[0];
                                        for (int i83 = 0; i83 < jArr9.length; i83++) {
                                            jArr9[i83] = uma.m22803H(jArr9[i83] - j28, 1000000L, g8aVarM12415a.f40393c, RoundingMode.DOWN);
                                        }
                                        o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr9, iArr5, iArrM6365e, z6, uma.m22803H(j12 - j28, 1000000L, g8aVarM12415a.f40393c, RoundingMode.DOWN), i20);
                                    }
                                }
                            }
                            o8aVar = o8aVar2;
                        } else {
                            iM14809D2 = 0;
                        }
                        iM14809D3 = -1;
                        iMo10553a = doaVar.mo10553a();
                        k47Var2 = k47Var12;
                        String str8 = c0713b6.f6406o;
                        if (iMo10553a == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (k47Var11 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i45 = uh0Var.f63915a;
                            jArr12 = new long[i45];
                            iArr14 = new int[i45];
                            while (uh0Var.m22736a()) {
                                int i610 = uh0Var.f63916b;
                                jArr12[i610] = uh0Var.f63918d;
                                iArr14[i610] = uh0Var.f63917c;
                            }
                            j20 = iM14809D9;
                            i46 = 8192 / iMo10553a;
                            iM22810e = 0;
                            while (i47 < i45) {
                                iM22810e += uma.m22810e(iArr14[i47], i46);
                            }
                            jArr13 = new long[iM22810e];
                            iArrCopyOf = new int[iM22810e];
                            jArr5 = new long[iM22810e];
                            iArrCopyOf2 = new int[iM22810e];
                            i48 = 0;
                            i49 = 0;
                            i50 = 0;
                            i51 = 0;
                            i52 = 0;
                            while (i48 < i45) {
                                int i611 = iArr14[i48];
                                j21 = jArr12[i48];
                                int i612 = i52;
                                int i613 = i48;
                                i53 = i51;
                                i54 = i612;
                                int i614 = i45;
                                i55 = i611;
                                while (i55 > 0) {
                                    int iMin2 = Math.min(i46, i55);
                                    jArr13[i54] = j21;
                                    int i615 = i46;
                                    int i710 = iMo10553a * iMin2;
                                    iArrCopyOf[i54] = i710;
                                    i50 += i710;
                                    int iMax2 = Math.max(i53, i710);
                                    jArr5[i54] = ((long) i49) * j20;
                                    iArrCopyOf2[i54] = 1;
                                    j21 += (long) iArrCopyOf[i54];
                                    i49 += iMin2;
                                    i55 -= iMin2;
                                    i54++;
                                    i46 = i615;
                                    i53 = iMax2;
                                }
                                int i711 = i46;
                                int i712 = i613 + 1;
                                i52 = i54;
                                i45 = i614;
                                i51 = i53;
                                i48 = i712;
                                i46 = i711;
                            }
                            long j29 = j20 * ((long) i49);
                            j13 = i50;
                            if (z3) {
                                jArr4 = new long[0];
                            }
                            if (z3) {
                                jArr4 = jArr13;
                                iArrCopyOf = new int[0];
                            }
                            if (z3) {
                                jArr5 = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            arrayList3 = arrayList2;
                            j12 = j29;
                            i20 = iM22810e;
                            i21 = i51;
                        } else {
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iMo10554b];
                            }
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iMo10554b];
                            }
                            wh0Var = doaVar;
                            if (z3) {
                                jArrCopyOf = new long[0];
                            } else {
                                jArrCopyOf = new long[iMo10554b];
                            }
                            int i713 = iM14809D2;
                            if (z3) {
                                iArr2 = new int[0];
                            } else {
                                iArr2 = new int[iMo10554b];
                            }
                            i11 = iM14809D7;
                            i12 = iM14809D;
                            i13 = iM14809D9;
                            i14 = i713;
                            j9 = j2;
                            j10 = j9;
                            j11 = j10;
                            i15 = 0;
                            iM14829m = 0;
                            i16 = 0;
                            iM14809D4 = 0;
                            i17 = iM14809D8;
                            iM14809D5 = iM14809D3;
                            k47Var3 = k47Var11;
                            i18 = 0;
                            while (true) {
                                if (i18 < iMo10554b) {
                                    arrayList3 = arrayList2;
                                    jArr4 = jArr3;
                                    iArrCopyOf = iArr;
                                    iArrCopyOf2 = iArr2;
                                    i19 = i16;
                                    break;
                                }
                                zM22736a = true;
                                while (i16 == 0) {
                                    zM22736a = uh0Var.m22736a();
                                    if (zM22736a) {
                                        break;
                                        break;
                                    }
                                    j11 = uh0Var.f63918d;
                                    i16 = uh0Var.f63917c;
                                    arrayList2 = arrayList2;
                                    i13 = i13;
                                }
                                i22 = i13;
                                arrayList4 = arrayList2;
                                if (!zM22736a) {
                                    ss5.m21707d0("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        iArrCopyOf = iArr;
                                        jArr4 = jArr3;
                                        iMo10554b = i18;
                                        i19 = i16;
                                        arrayList3 = arrayList4;
                                        iArrCopyOf2 = iArr2;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i18);
                                    iArrCopyOf = Arrays.copyOf(iArr, i18);
                                    jArr4 = jArrCopyOf3;
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                    iMo10554b = i18;
                                    i19 = i16;
                                    arrayList3 = arrayList4;
                                    iArrCopyOf2 = Arrays.copyOf(iArr2, i18);
                                    break;
                                }
                                if (k47Var2 != null) {
                                    while (iM14809D4 == 0) {
                                        iM14809D4 = k47Var2.m14809D();
                                        iM14829m = k47Var2.m14829m();
                                        i12--;
                                    }
                                    iM14809D4--;
                                }
                                iMo10555c = wh0Var.mo10555c();
                                int i714 = iMo10554b;
                                long j210 = iMo10555c;
                                j10 += j210;
                                if (iMo10555c > i15) {
                                    i15 = iMo10555c;
                                }
                                if (z3) {
                                    jArr3[i18] = j11;
                                    iArr[i18] = iMo10555c;
                                    i23 = i15;
                                    iArr3 = iArr;
                                    jArrCopyOf[i18] = j9 + ((long) iM14829m);
                                    if (k47Var3 == null) {
                                        i24 = 1;
                                    } else {
                                        i24 = 0;
                                    }
                                    iArr2[i18] = i24;
                                    if (i18 == iM14809D5) {
                                        iArr2[i18] = 1;
                                        arrayList5 = arrayList4;
                                        arrayList5.add(Integer.valueOf(i18));
                                    }
                                    if (k47Var3 != null) {
                                        iM14809D5 = k47Var3.m14809D() - 1;
                                    }
                                    int i715 = iM14829m;
                                    int i716 = i22;
                                    ArrayList arrayList11 = arrayList5;
                                    j9 += (long) i716;
                                    i17--;
                                    if (i17 != 0) {
                                    }
                                    j11 += j210;
                                    i16--;
                                    i18++;
                                    iArr = iArr3;
                                    iMo10554b = i714;
                                    iM14829m = i715;
                                    arrayList2 = arrayList11;
                                    i13 = i716;
                                    i15 = i23;
                                } else {
                                    i23 = i15;
                                    iArr3 = iArr;
                                }
                                arrayList5 = arrayList4;
                                if (k47Var3 != null) {
                                    iM14809D5 = k47Var3.m14809D() - 1;
                                }
                                int i717 = iM14829m;
                                int i718 = i22;
                                ArrayList arrayList12 = arrayList5;
                                j9 += (long) i718;
                                i17--;
                                if (i17 != 0) {
                                }
                                j11 += j210;
                                i16--;
                                i18++;
                                iArr = iArr3;
                                iMo10554b = i714;
                                iM14829m = i717;
                                arrayList2 = arrayList12;
                                i13 = i718;
                                i15 = i23;
                            }
                            long j211 = j9 + ((long) iM14829m);
                            if (k47Var2 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i12 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (k47Var2.m14809D() != 0) {
                                    z7 = false;
                                    break;
                                }
                                k47Var2.m14829m();
                                i12--;
                            }
                            if (i14 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                hn1.m13360j(g8aVarM12415a.f40391a, i14, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                                hn1.m13360j(i17, i19, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                                sb2.append(i11);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iM14809D4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                ss5.m21707d0("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                hn1.m13360j(g8aVarM12415a.f40391a, i14, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                hn1.m13360j(i17, i19, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i11);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iM14809D4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                ss5.m21707d0("BoxParsers", sb3.toString());
                            }
                            i20 = iMo10554b;
                            jArr5 = jArrCopyOf;
                            i21 = i15;
                            j12 = j211;
                            j13 = j10;
                        }
                        jArr6 = jArr4;
                        iArr4 = iArrCopyOf;
                        iArr5 = iArrCopyOf2;
                        j14 = g8aVarM12415a.f40396f;
                        if (j14 > j2) {
                            jM22803H7 = uma.m22803H(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                            if (jM22803H7 > j2) {
                                lc3 lc3VarM2520a6 = c0713b6.m2520a();
                                lc3VarM2520a6.f49447h = (int) jM22803H7;
                                g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a6));
                            }
                        }
                        i25 = g8aVarM12415a.f40392b;
                        j15 = g8aVarM12415a.f40393c;
                        c0713b3 = g8aVarM12415a.f40397g;
                        jArr7 = g8aVarM12415a.f40400j;
                        jArr8 = g8aVarM12415a.f40399i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jM22803H3 = uma.m22803H(j12, 1000000L, j15, roundingMode3);
                        iArrM6365e = AbstractC1110a.m6365e(arrayList3);
                        if (jArr8 == null) {
                            if (!z3) {
                                uma.m22802G(jArr5, j15);
                            }
                            o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr5, iArr5, iArrM6365e, z6, jM22803H3, i20);
                        } else {
                            jArr9 = jArr5;
                            if (z3) {
                                jArr7.getClass();
                                if (jArr8.length == 1) {
                                    while (i44 < jArr8.length) {
                                        if (jArr7[i44] != -1) {
                                            j2 += jArr8[i44];
                                        }
                                    }
                                    jM22803H6 = uma.m22803H(j2, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                } else {
                                    while (i44 < jArr8.length) {
                                        if (jArr7[i44] != -1) {
                                            j2 += jArr8[i44];
                                        }
                                    }
                                    jM22803H6 = uma.m22803H(j2, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                }
                                o8aVar2 = new o8a(g8aVarM12415a, jArr6, iArr4, i21, jArr9, iArr5, iArrM6365e, z6, jM22803H6, i20);
                            } else if (jArr8.length == 1) {
                                j16 = -1;
                                if (jArr8.length == 1) {
                                }
                                i26 = i20;
                                if (i25 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr8.length];
                                iArr7 = new int[jArr8.length];
                                jArr7.getClass();
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                i29 = 0;
                                while (i28 < jArr8.length) {
                                    iArr12 = iArr6;
                                    j19 = jArr7[i28];
                                    if (j19 != j16) {
                                        iArr13 = iArr7;
                                        i37 = i28;
                                        jM22803H5 = uma.m22803H(jArr8[i28], g8aVarM12415a.f40393c, g8aVarM12415a.f40394d, RoundingMode.DOWN) + j19;
                                        boolean z16 = z9;
                                        iArr12[i37] = uma.m22809d(jArr9, j19, true);
                                        iM22806a = uma.m22806a(jArr9, jM22803H5, z8);
                                        i38 = iM22806a - 1;
                                        i39 = 0;
                                        while (iM22806a < jArr9.length) {
                                            if (jArr9[iM22806a] >= jM22803H5) {
                                                i39++;
                                                if (i39 > c0713b3.f6408q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i38 = iM22806a;
                                            }
                                            iM22806a++;
                                        }
                                        iArr13[i37] = i38 + 1;
                                        i40 = iArr12[i37];
                                        while (true) {
                                            i41 = iArr12[i37];
                                            if (i41 > 0) {
                                                break;
                                            }
                                            iArr12[i37] = i41 - 1;
                                        }
                                        if (i41 == 0) {
                                            iArr12[i37] = i40;
                                            while (true) {
                                                i43 = iArr12[i37];
                                                if (i43 < iArr13[i37]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i37] = i43 + 1;
                                            }
                                        }
                                        int i719 = iArr13[i37];
                                        i42 = iArr12[i37];
                                        int i84 = (i719 - i42) + i29;
                                        if (i27 != i42) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z16 | z13;
                                        i29 = i84;
                                        i27 = i719;
                                    } else {
                                        iArr13 = iArr7;
                                        i37 = i28;
                                    }
                                    i28 = i37 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z17 = z9;
                                if (i29 != i26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z17 | z10;
                                if (z11) {
                                    jArr10 = new long[i29];
                                } else {
                                    jArr10 = jArr6;
                                }
                                if (z11) {
                                    iArr10 = new int[i29];
                                } else {
                                    iArr10 = iArr4;
                                }
                                if (z11) {
                                    i21 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i29];
                                } else {
                                    iArr11 = iArr5;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr11 = new long[i29];
                                i30 = 0;
                                z12 = false;
                                i31 = 0;
                                i32 = i21;
                                j17 = 0;
                                while (i30 < jArr8.length) {
                                    j18 = jArr7[i30];
                                    i33 = iArr8[i30];
                                    C0713b c0713b8 = c0713b3;
                                    i34 = iArr9[i30];
                                    long[] jArr18 = jArr8;
                                    if (z11) {
                                        int i85 = i34 - i33;
                                        System.arraycopy(jArr6, i33, jArr10, i31, i85);
                                        System.arraycopy(iArr4, i33, iArr10, i31, i85);
                                        System.arraycopy(iArr5, i33, iArr11, i31, i85);
                                    }
                                    i35 = i32;
                                    while (i33 < i34) {
                                        i36 = i33;
                                        int i86 = i34;
                                        long j212 = g8aVarM12415a.f40394d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jM22803H13 = uma.m22803H(j17, 1000000L, j212, roundingMode4);
                                        jM22803H4 = uma.m22803H(jArr9[i36] - j18, 1000000L, g8aVarM12415a.f40393c, roundingMode4);
                                        if (jM22803H4 < 0) {
                                            z12 = true;
                                        }
                                        jArr11[i31] = jM22803H13 + jM22803H4;
                                        if (z11) {
                                            i35 = iArr4[i36];
                                        }
                                        if (!z11) {
                                        }
                                        i31++;
                                        i33 = i36 + 1;
                                        i34 = i86;
                                    }
                                    j17 += jArr18[i30];
                                    i30++;
                                    i32 = i35;
                                    c0713b3 = c0713b8;
                                    jArr8 = jArr18;
                                }
                                c0713b4 = c0713b3;
                                long jM22803H14 = uma.m22803H(j17, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                if (z12) {
                                    lc3 lc3VarM2520a7 = c0713b4.m2520a();
                                    lc3VarM2520a7.f49459t = true;
                                    g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a7));
                                }
                                o8aVar = new o8a(g8aVarM12415a, jArr10, iArr10, i32, jArr11, iArr11, AbstractC1110a.m6365e(arrayList6), z6, jM22803H14, jArr10.length);
                            } else {
                                j16 = -1;
                                if (jArr8.length == 1) {
                                }
                                i26 = i20;
                                if (i25 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr8.length];
                                iArr7 = new int[jArr8.length];
                                jArr7.getClass();
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                i29 = 0;
                                while (i28 < jArr8.length) {
                                    iArr12 = iArr6;
                                    j19 = jArr7[i28];
                                    if (j19 != j16) {
                                        iArr13 = iArr7;
                                        i37 = i28;
                                        jM22803H5 = uma.m22803H(jArr8[i28], g8aVarM12415a.f40393c, g8aVarM12415a.f40394d, RoundingMode.DOWN) + j19;
                                        boolean z18 = z9;
                                        iArr12[i37] = uma.m22809d(jArr9, j19, true);
                                        iM22806a = uma.m22806a(jArr9, jM22803H5, z8);
                                        i38 = iM22806a - 1;
                                        i39 = 0;
                                        while (iM22806a < jArr9.length) {
                                            if (jArr9[iM22806a] >= jM22803H5) {
                                                i39++;
                                                if (i39 > c0713b3.f6408q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i38 = iM22806a;
                                            }
                                            iM22806a++;
                                        }
                                        iArr13[i37] = i38 + 1;
                                        i40 = iArr12[i37];
                                        while (true) {
                                            i41 = iArr12[i37];
                                            if (i41 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr12[i37] = i41 - 1;
                                        }
                                        if (i41 == 0) {
                                            iArr12[i37] = i40;
                                            while (true) {
                                                i43 = iArr12[i37];
                                                if (i43 < iArr13[i37]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i37] = i43 + 1;
                                            }
                                        }
                                        int i7110 = iArr13[i37];
                                        i42 = iArr12[i37];
                                        int i87 = (i7110 - i42) + i29;
                                        if (i27 != i42) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z18 | z13;
                                        i29 = i87;
                                        i27 = i7110;
                                    } else {
                                        iArr13 = iArr7;
                                        i37 = i28;
                                    }
                                    i28 = i37 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z19 = z9;
                                if (i29 != i26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z19 | z10;
                                if (z11) {
                                    jArr10 = new long[i29];
                                } else {
                                    jArr10 = jArr6;
                                }
                                if (z11) {
                                    iArr10 = new int[i29];
                                } else {
                                    iArr10 = iArr4;
                                }
                                if (z11) {
                                    i21 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i29];
                                } else {
                                    iArr11 = iArr5;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr11 = new long[i29];
                                i30 = 0;
                                z12 = false;
                                i31 = 0;
                                i32 = i21;
                                j17 = 0;
                                while (i30 < jArr8.length) {
                                    j18 = jArr7[i30];
                                    i33 = iArr8[i30];
                                    C0713b c0713b9 = c0713b3;
                                    i34 = iArr9[i30];
                                    long[] jArr19 = jArr8;
                                    if (z11) {
                                        int i88 = i34 - i33;
                                        System.arraycopy(jArr6, i33, jArr10, i31, i88);
                                        System.arraycopy(iArr4, i33, iArr10, i31, i88);
                                        System.arraycopy(iArr5, i33, iArr11, i31, i88);
                                    }
                                    i35 = i32;
                                    while (i33 < i34) {
                                        i36 = i33;
                                        int i89 = i34;
                                        long j213 = g8aVarM12415a.f40394d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jM22803H15 = uma.m22803H(j17, 1000000L, j213, roundingMode5);
                                        jM22803H4 = uma.m22803H(jArr9[i36] - j18, 1000000L, g8aVarM12415a.f40393c, roundingMode5);
                                        if (jM22803H4 < 0) {
                                            z12 = true;
                                        }
                                        jArr11[i31] = jM22803H15 + jM22803H4;
                                        if (z11) {
                                            i35 = iArr4[i36];
                                        }
                                        if (!z11) {
                                        }
                                        i31++;
                                        i33 = i36 + 1;
                                        i34 = i89;
                                    }
                                    j17 += jArr19[i30];
                                    i30++;
                                    i32 = i35;
                                    c0713b3 = c0713b9;
                                    jArr8 = jArr19;
                                }
                                c0713b4 = c0713b3;
                                long jM22803H16 = uma.m22803H(j17, 1000000L, g8aVarM12415a.f40394d, RoundingMode.DOWN);
                                if (z12) {
                                    lc3 lc3VarM2520a8 = c0713b4.m2520a();
                                    lc3VarM2520a8.f49459t = true;
                                    g8aVarM12415a = g8aVarM12415a.m12415a(new C0713b(lc3VarM2520a8));
                                }
                                o8aVar = new o8a(g8aVarM12415a, jArr10, iArr10, i32, jArr11, iArr11, AbstractC1110a.m6365e(arrayList6), z6, jM22803H16, jArr10.length);
                            }
                        }
                        o8aVar = o8aVar2;
                    }
                    arrayList8.add(o8aVar);
                }
            }
            i56 = i2 + 1;
            e46Var2 = e46Var;
            arrayList8 = arrayList8;
            arrayList7 = arrayList;
        }
        return arrayList8;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    /* JADX INFO: renamed from: k */
    public static ey5 m432k(f46 f46Var) {
        int i;
        boolean z;
        ey5 ey5Var;
        ey5 ey5Var2;
        int iM14806A;
        ey5 ey5Var3;
        Object objM15646e;
        k47 k47Var = f46Var.f38414c;
        int i2 = 8;
        k47Var.m14818M(8);
        boolean z2 = false;
        ey5 ey5Var4 = new ey5(new dy5[0]);
        while (k47Var.m14820a() >= i2) {
            int i3 = k47Var.f46701b;
            int iM14829m = k47Var.m14829m();
            int iM14829m2 = k47Var.m14829m();
            String str = null;
            if (iM14829m2 == 1835365473) {
                k47Var.m14818M(i3);
                int i4 = i3 + iM14829m;
                k47Var.m14819N(i2);
                m422a(k47Var);
                while (true) {
                    int i5 = k47Var.f46701b;
                    if (i5 < i4) {
                        int iM14829m3 = k47Var.m14829m();
                        if (k47Var.m14829m() == 1768715124) {
                            k47Var.m14818M(i5);
                            int i6 = i5 + iM14829m3;
                            k47Var.m14819N(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = k47Var.f46701b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM14829m4 = k47Var.m14829m() + i7;
                                int iM14829m5 = k47Var.m14829m();
                                int i8 = (iM14829m5 >> 24) & 255;
                                if (i8 == 169 || i8 == 253) {
                                    int i9 = 16777215 & iM14829m5;
                                    if (i9 == 6516084) {
                                        int iM14829m6 = k47Var.m14829m();
                                        if (k47Var.m14829m() == 1684108385) {
                                            k47Var.m14819N(8);
                                            String strM14838v = k47Var.m14838v(iM14829m6 - 16);
                                            objM15646e = new gb1("und", strM14838v, strM14838v);
                                        } else {
                                            ss5.m21707d0("MetadataUtil", "Failed to parse comment attribute: ".concat(bj0.m3750a(iM14829m5)));
                                            objM15646e = null;
                                        }
                                    } else if (i9 == 7233901 || i9 == 7631467) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TIT2");
                                    } else if (i9 == 6516589 || i9 == 7828084) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TCOM");
                                    } else if (i9 == 6578553) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TDRC");
                                    } else if (i9 == 4280916) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TPE1");
                                    } else if (i9 == 7630703) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSSE");
                                    } else if (i9 == 6384738) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TALB");
                                    } else if (i9 == 7108978) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "USLT");
                                    } else if (i9 == 6776174) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TCON");
                                    } else if (i9 == 6779504) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TIT1");
                                    } else if (i9 == 7173742) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "MVNM");
                                    } else if (i9 == 7173737) {
                                        Object objM15645d = kpb.m15645d(iM14829m5, "MVIN", k47Var, true, false);
                                        k47Var.m14818M(iM14829m4);
                                        objM15646e = objM15645d;
                                    } else {
                                        ss5.m21722t("MetadataUtil", "Skipped unknown metadata entry: ".concat(bj0.m3750a(iM14829m5)));
                                        k47Var.m14818M(iM14829m4);
                                        objM15646e = null;
                                    }
                                    k47Var.m14818M(iM14829m4);
                                } else {
                                    if (iM14829m5 == 1735291493) {
                                        try {
                                            String strM4238a = bz3.m4238a(kpb.m15644c(k47Var) - 1);
                                            if (strM4238a != null) {
                                                objM15646e = new bw9("TCON", str, ImmutableList.m6291y(strM4238a));
                                            } else {
                                                ss5.m21707d0("MetadataUtil", "Failed to parse standard genre code");
                                                objM15646e = str;
                                            }
                                        } catch (Throwable th) {
                                            k47Var.m14818M(iM14829m4);
                                            throw th;
                                        }
                                    } else if (iM14829m5 == 1684632427) {
                                        objM15646e = kpb.m15643b(iM14829m5, k47Var, "TPOS");
                                    } else if (iM14829m5 == 1953655662) {
                                        objM15646e = kpb.m15643b(iM14829m5, k47Var, "TRCK");
                                    } else if (iM14829m5 == 1953329263) {
                                        objM15646e = kpb.m15645d(iM14829m5, "TBPM", k47Var, true, z2);
                                    } else if (iM14829m5 == 1668311404) {
                                        objM15646e = kpb.m15645d(iM14829m5, "TCMP", k47Var, true, true);
                                    } else if (iM14829m5 == 1668249202) {
                                        objM15646e = kpb.m15642a(k47Var);
                                    } else if (iM14829m5 == 1631670868) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TPE2");
                                    } else if (iM14829m5 == 1936682605) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSOT");
                                    } else if (iM14829m5 == 1936679276) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSOA");
                                    } else if (iM14829m5 == 1936679282) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSOP");
                                    } else if (iM14829m5 == 1936679265) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSO2");
                                    } else if (iM14829m5 == 1936679791) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TSOC");
                                    } else if (iM14829m5 == 1920233063) {
                                        objM15646e = kpb.m15645d(iM14829m5, "ITUNESADVISORY", k47Var, z2, z2);
                                    } else if (iM14829m5 == 1885823344) {
                                        objM15646e = kpb.m15645d(iM14829m5, "ITUNESGAPLESS", k47Var, z2, true);
                                    } else if (iM14829m5 == 1936683886) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TVSHOWSORT");
                                    } else if (iM14829m5 == 1953919848) {
                                        objM15646e = kpb.m15646e(iM14829m5, k47Var, "TVSHOW");
                                    } else if (iM14829m5 == 757935405) {
                                        String strM14838v2 = str;
                                        String strM14838v3 = strM14838v2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = k47Var.f46701b;
                                            if (i12 >= iM14829m4) {
                                                break;
                                            }
                                            int iM14829m7 = k47Var.m14829m();
                                            int iM14829m8 = k47Var.m14829m();
                                            k47Var.m14819N(4);
                                            if (iM14829m8 == 1835360622) {
                                                strM14838v2 = k47Var.m14838v(iM14829m7 - 12);
                                            } else if (iM14829m8 == 1851878757) {
                                                strM14838v3 = k47Var.m14838v(iM14829m7 - 12);
                                            } else {
                                                if (iM14829m8 == 1684108385) {
                                                    i10 = i12;
                                                    i11 = iM14829m7;
                                                }
                                                k47Var.m14819N(iM14829m7 - 12);
                                            }
                                        }
                                        if (strM14838v2 == null || strM14838v3 == null || i10 == -1) {
                                            objM15646e = null;
                                        } else {
                                            k47Var.m14818M(i10);
                                            k47Var.m14819N(16);
                                            objM15646e = new r94(strM14838v2, strM14838v3, k47Var.m14838v(i11 - 16));
                                        }
                                        k47Var.m14818M(iM14829m4);
                                    } else {
                                        ss5.m21722t("MetadataUtil", "Skipped unknown metadata entry: ".concat(bj0.m3750a(iM14829m5)));
                                        k47Var.m14818M(iM14829m4);
                                        objM15646e = null;
                                    }
                                    k47Var.m14818M(iM14829m4);
                                }
                                if (objM15646e != null) {
                                    arrayList.add(objM15646e);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                ey5Var3 = new ey5(arrayList);
                                break;
                            }
                            break;
                        }
                        k47Var.m14818M(i5 + iM14829m3);
                        i2 = 8;
                        z2 = false;
                        str = null;
                    }
                    ey5Var3 = null;
                    break;
                }
                ey5Var4 = ey5Var4.m11387b(ey5Var3);
                i = 8;
            } else if (iM14829m2 == 1936553057) {
                k47Var.m14818M(i3);
                int i13 = i3 + iM14829m;
                k47Var.m14819N(12);
                while (true) {
                    int i14 = k47Var.f46701b;
                    if (i14 < i13) {
                        int iM14829m9 = k47Var.m14829m();
                        if (k47Var.m14829m() == 1935766900) {
                            if (iM14829m9 >= 16) {
                                k47Var.m14819N(4);
                                int i15 = -1;
                                int i16 = 0;
                                for (int i17 = 0; i17 < 2; i17++) {
                                    int iM14842z = k47Var.m14842z();
                                    int iM14842z2 = k47Var.m14842z();
                                    if (iM14842z == 0) {
                                        i15 = iM14842z2;
                                    } else if (iM14842z == 1) {
                                        i16 = iM14842z2;
                                    }
                                }
                                if (i15 != 12) {
                                    if (i15 != 13) {
                                        if (i15 != 21) {
                                            iM14806A = -2147483647;
                                        } else {
                                            i = 8;
                                            if (k47Var.m14820a() < 8 || k47Var.f46701b + 8 > i13) {
                                                iM14806A = -2147483647;
                                            } else {
                                                int iM14829m10 = k47Var.m14829m();
                                                int iM14829m11 = k47Var.m14829m();
                                                if (iM14829m10 < 12 || iM14829m11 != 1936877170) {
                                                    iM14806A = -2147483647;
                                                } else {
                                                    iM14806A = k47Var.m14806A();
                                                }
                                            }
                                        }
                                        if (iM14806A == -2147483647) {
                                            ey5Var2 = new ey5(new rb9(i16, iM14806A));
                                            break;
                                        }
                                        break;
                                    }
                                    iM14806A = 120;
                                } else {
                                    iM14806A = 240;
                                }
                                i = 8;
                                if (iM14806A == -2147483647) {
                                    ey5Var2 = new ey5(new rb9(i16, iM14806A));
                                    break;
                                }
                                break;
                            }
                            ey5Var2 = null;
                            i = 8;
                            break;
                        }
                        k47Var.m14818M(i14 + iM14829m9);
                    } else {
                        i = 8;
                    }
                    ey5Var2 = null;
                    break;
                }
                ey5Var4 = ey5Var4.m11387b(ey5Var2);
            } else {
                i = 8;
                if (iM14829m2 == -1451722374) {
                    short sM14839w = k47Var.m14839w();
                    k47Var.m14819N(2);
                    String strM14840x = k47Var.m14840x(sM14839w, StandardCharsets.UTF_8);
                    int iMax = Math.max(strM14840x.lastIndexOf(43), strM14840x.lastIndexOf(45));
                    try {
                        try {
                            j46 j46Var = new j46(Float.parseFloat(strM14840x.substring(0, iMax)), Float.parseFloat(strM14840x.substring(iMax, strM14840x.length() - 1)));
                            dy5[] dy5VarArr = new dy5[1];
                            z = false;
                            try {
                                dy5VarArr[0] = j46Var;
                                ey5Var = new ey5(dy5VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                ey5Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    ey5Var4 = ey5Var4.m11387b(ey5Var);
                }
                k47Var.m14818M(i3 + iM14829m);
                i2 = i;
                z2 = z;
            }
            z = false;
            k47Var.m14818M(i3 + iM14829m);
            i2 = i;
            z2 = z;
        }
        return ey5Var4;
    }
}
