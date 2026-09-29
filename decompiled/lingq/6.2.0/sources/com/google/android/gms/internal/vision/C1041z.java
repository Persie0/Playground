package com.google.android.gms.internal.vision;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p000.C0790ay;
import p000.C2907cy;
import p000.C2944dy;
import p000.C2981ey;
import p000.C3018fy;
import p000.InterfaceC3055gy;
import p000.cd7;
import p000.f0d;
import p000.gm5;
import p000.il9;
import p000.ud7;
import p000.uk9;
import p000.vd7;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1041z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12267a;

    public /* synthetic */ C1041z(int i) {
        this.f12267a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final vd7 m5823a(int i, String str, String str2, Map map, Map map2) {
        if (str == null && str2 != null) {
            return new vd7("completed", i, 100, 48, true, (String) null);
        }
        InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) map.get(Integer.valueOf(i));
        if (interfaceC3055gy == null) {
            return (vd7) map2.get(Integer.valueOf(i));
        }
        if (interfaceC3055gy instanceof C2907cy) {
            return new vd7("downloading", i, ((C2907cy) interfaceC3055gy).f34700c, 48, false, (String) null);
        }
        if (interfaceC3055gy instanceof C2981ey) {
            return new vd7("generating", i, 0, 48, false, (String) null);
        }
        if (interfaceC3055gy instanceof C0790ay) {
            return new vd7("completed", i, 100, 48, true, (String) null);
        }
        if (!(interfaceC3055gy instanceof C2944dy)) {
            if (interfaceC3055gy instanceof C3018fy) {
                return null;
            }
            gm5.m12750e();
            return null;
        }
        return new vd7("error", i, 0, 32, false, ((C2944dy) interfaceC3055gy).f36412c.name());
    }

    /* JADX INFO: renamed from: b */
    public static final ud7 m5824b(ud7 ud7Var, boolean z) {
        Double d = ud7Var.f63786t;
        return ud7.m22692a(ud7Var, Double.valueOf((d == null && (d = ud7Var.f63777k) == null) ? 0.0d : d.doubleValue()), ud7Var.f63778l * DescriptorProtos.Edition.EDITION_2023_VALUE, z, 16708607);
    }

    /* JADX INFO: renamed from: c */
    public static final il9 m5825c(cd7 cd7Var, LinkedHashMap linkedHashMap) {
        int i = cd7Var.f9933a;
        String str = cd7Var.f9934b;
        Double dValueOf = Double.valueOf(0.0d);
        ud7 ud7Var = new ud7(i, null, null, 0, "", "", "", str, "", (16743806 & 512) != 0 ? 0 : i, dValueOf, (16743806 & 2048) != 0 ? 0 : 1000, (16743806 & 4096) != 0 ? null : "", null, 0, true, false, 0, null, dValueOf, false, null, null, null);
        List list = (List) linkedHashMap.get(Integer.valueOf(cd7Var.f9933a));
        if (list == null) {
            list = EmptyList.f47638a;
        }
        return new il9(ud7Var, list);
    }

    /* JADX INFO: renamed from: d */
    public static int m5826d(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            C1041z c1041z = AbstractC1040y.f12266a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            byte bM11434a = f0d.m11434a(bArr, j);
            C1041z c1041z2 = AbstractC1040y.f12266a;
            if (i > -12 || bM11434a > -65) {
                return -1;
            }
            return (bM11434a << 8) ^ i;
        }
        if (i2 != 2) {
            uk9.m22780o();
            return 0;
        }
        byte bM11434a2 = f0d.m11434a(bArr, j);
        byte bM11434a3 = f0d.m11434a(bArr, j + 1);
        C1041z c1041z3 = AbstractC1040y.f12266a;
        if (i > -12 || bM11434a2 > -65 || bM11434a3 > -65) {
            return -1;
        }
        return (bM11434a3 << 16) ^ ((bM11434a2 << 8) ^ i);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX INFO: renamed from: e */
    public final int m5827e(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        long j3;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.f12267a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new zzmg(i7, length);
                                        }
                                        StringBuilder sb = new StringBuilder(37);
                                        sb.append("Failed writing ");
                                        sb.append(cCharAt);
                                        sb.append(" at index ");
                                        sb.append(i3);
                                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new zzmg(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j4 = i;
                long j5 = ((long) i2) + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    char cCharAt5 = str.charAt(length2 - 1);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(cCharAt5);
                    sb2.append(" at index ");
                    sb2.append(i + i2);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                int i20 = 0;
                while (true) {
                    j = 1;
                    if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                        f0d.m11438e(bArr, j4, (byte) cCharAt3);
                        i20++;
                        j4 = 1 + j4;
                    }
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt6 = str.charAt(i20);
                        if (cCharAt6 < 128 && j4 < j5) {
                            f0d.m11438e(bArr, j4, (byte) cCharAt6);
                            j2 = j;
                            j3 = j5;
                            j4 += j;
                        } else if (cCharAt6 >= c || j4 > j5 - 2) {
                            j2 = j;
                            if ((cCharAt6 >= c2 && 57343 >= cCharAt6) || j4 > j5 - 3) {
                                j3 = j5;
                                if (j4 > j3 - 4) {
                                    if (55296 <= cCharAt6 && cCharAt6 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt6, str.charAt(i5)))) {
                                        throw new zzmg(i20, length2);
                                    }
                                    StringBuilder sb3 = new StringBuilder(46);
                                    sb3.append("Failed writing ");
                                    sb3.append(cCharAt6);
                                    sb3.append(" at index ");
                                    sb3.append(j4);
                                    throw new ArrayIndexOutOfBoundsException(sb3.toString());
                                }
                                int i21 = i20 + 1;
                                if (i21 != length2) {
                                    char cCharAt7 = str.charAt(i21);
                                    if (Character.isSurrogatePair(cCharAt6, cCharAt7)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt6, cCharAt7);
                                        f0d.m11438e(bArr, j4, (byte) ((codePoint2 >>> 18) | 240));
                                        f0d.m11438e(bArr, j4 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = j4 + 3;
                                        f0d.m11438e(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        f0d.m11438e(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i20 = i21;
                                    } else {
                                        i20 = i21;
                                    }
                                }
                                throw new zzmg(i20 - 1, length2);
                            }
                            f0d.m11438e(bArr, j4, (byte) ((cCharAt6 >>> '\f') | 480));
                            j3 = j5;
                            long j7 = j4 + 2;
                            f0d.m11438e(bArr, j4 + j2, (byte) (((cCharAt6 >>> 6) & 63) | 128));
                            j4 += 3;
                            f0d.m11438e(bArr, j7, (byte) ((cCharAt6 & '?') | 128));
                        } else {
                            j2 = j;
                            long j8 = j4 + j2;
                            f0d.m11438e(bArr, j4, (byte) ((cCharAt6 >>> 6) | 960));
                            j4 += 2;
                            f0d.m11438e(bArr, j8, (byte) ((cCharAt6 & '?') | 128));
                            j3 = j5;
                        }
                        i20++;
                        j = j2;
                        j5 = j3;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX INFO: renamed from: f */
    public boolean m5828f(byte[] bArr, int i, int i2) {
        boolean z;
        int iM5822b;
        int i3;
        long j;
        int i4;
        int i5;
        long j2;
        int iM5826d;
        byte bM11434a;
        long j3;
        byte bM11434a2;
        long j4;
        int i6 = i;
        switch (this.f12267a) {
            case 0:
                z = false;
                while (i6 < i2 && bArr[i6] >= 0) {
                    i6++;
                }
                if (i6 >= i2) {
                    iM5822b = 0;
                } else {
                    while (true) {
                        if (i6 >= i2) {
                            iM5822b = 0;
                        } else {
                            int i7 = i6 + 1;
                            byte b = bArr[i6];
                            if (b >= 0) {
                                i6 = i7;
                            } else if (b < -32) {
                                if (i7 >= i2) {
                                    iM5822b = b;
                                } else {
                                    if (b >= -62) {
                                        i6 += 2;
                                        if (bArr[i7] > -65) {
                                        }
                                    }
                                    iM5822b = -1;
                                }
                            } else if (b < -16) {
                                if (i7 >= i2 - 1) {
                                    iM5822b = AbstractC1040y.m5822b(bArr, i7, i2);
                                } else {
                                    int i8 = i6 + 2;
                                    byte b2 = bArr[i7];
                                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                        i6 += 3;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                    iM5822b = -1;
                                }
                            } else if (i7 >= i2 - 2) {
                                iM5822b = AbstractC1040y.m5822b(bArr, i7, i2);
                            } else {
                                int i9 = i6 + 2;
                                byte b3 = bArr[i7];
                                if (b3 <= -65) {
                                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                        int i10 = i6 + 3;
                                        if (bArr[i9] <= -65) {
                                            i6 += 4;
                                            if (bArr[i10] > -65) {
                                            }
                                        }
                                    }
                                }
                                iM5822b = -1;
                            }
                        }
                    }
                }
                i3 = iM5822b;
                break;
            default:
                if ((i6 | i2 | (bArr.length - i2)) < 0) {
                    z = false;
                    uk9.m22777k("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i2)});
                    i3 = 0;
                } else {
                    long j5 = i6;
                    int i11 = (int) (((long) i2) - j5);
                    if (i11 < 16) {
                        j = 1;
                        i4 = 0;
                    } else {
                        long j6 = j5;
                        j = 1;
                        i4 = 0;
                        while (true) {
                            if (i4 < i11) {
                                long j7 = j6 + 1;
                                if (f0d.m11434a(bArr, j6) >= 0) {
                                    i4++;
                                    j6 = j7;
                                }
                            } else {
                                i4 = i11;
                            }
                        }
                    }
                    int i12 = i11 - i4;
                    long j8 = j5 + ((long) i4);
                    while (true) {
                        i3 = 0;
                        while (i12 > 0) {
                            long j9 = j8 + j;
                            byte bM11434a3 = f0d.m11434a(bArr, j8);
                            if (bM11434a3 < 0) {
                                i3 = bM11434a3;
                                j8 = j9;
                                if (i12 == 0) {
                                    i5 = i12 - 1;
                                    if (i3 < -32) {
                                        if (i3 < -16) {
                                            if (i5 < 3) {
                                                i12 -= 4;
                                                j3 = j8 + j;
                                                bM11434a2 = f0d.m11434a(bArr, j8);
                                                if (bM11434a2 <= -65) {
                                                    if ((((bM11434a2 + 112) + (i3 << 28)) >> 30) == 0) {
                                                        z = false;
                                                        j4 = j8 + 2;
                                                        if (f0d.m11434a(bArr, j3) <= -65) {
                                                            j8 += 3;
                                                            if (f0d.m11434a(bArr, j4) > -65) {
                                                            }
                                                        }
                                                    }
                                                    i3 = -1;
                                                    break;
                                                }
                                                z = false;
                                                i3 = -1;
                                            } else {
                                                iM5826d = m5826d(j8, bArr, i3, i5);
                                                i3 = iM5826d;
                                                z = false;
                                            }
                                        } else if (i5 < 2) {
                                            i12 -= 3;
                                            long j10 = j8 + j;
                                            bM11434a = f0d.m11434a(bArr, j8);
                                            if (bM11434a > -65 && ((i3 != -32 || bM11434a >= -96) && (i3 != -19 || bM11434a < -96))) {
                                                j8 += 2;
                                                if (f0d.m11434a(bArr, j10) > -65) {
                                                }
                                            }
                                            z = false;
                                            i3 = -1;
                                        } else {
                                            iM5826d = m5826d(j8, bArr, i3, i5);
                                            i3 = iM5826d;
                                            z = false;
                                        }
                                    } else if (i5 == 0) {
                                        i12 -= 2;
                                        if (i3 >= -62) {
                                            j2 = j8 + j;
                                            if (f0d.m11434a(bArr, j8) > -65) {
                                                j8 = j2;
                                            }
                                        }
                                        z = false;
                                        i3 = -1;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                    i3 = 0;
                                }
                            } else {
                                i12--;
                                i3 = bM11434a3;
                                j8 = j9;
                            }
                            break;
                        }
                        if (i12 == 0) {
                            i5 = i12 - 1;
                            if (i3 < -32) {
                                if (i3 < -16) {
                                    if (i5 < 3) {
                                        i12 -= 4;
                                        j3 = j8 + j;
                                        bM11434a2 = f0d.m11434a(bArr, j8);
                                        if (bM11434a2 <= -65) {
                                            if ((((bM11434a2 + 112) + (i3 << 28)) >> 30) == 0) {
                                                z = false;
                                                j4 = j8 + 2;
                                                if (f0d.m11434a(bArr, j3) <= -65) {
                                                    j8 += 3;
                                                    if (f0d.m11434a(bArr, j4) > -65) {
                                                    }
                                                }
                                            }
                                            i3 = -1;
                                            break;
                                        }
                                        z = false;
                                        i3 = -1;
                                    } else {
                                        iM5826d = m5826d(j8, bArr, i3, i5);
                                        i3 = iM5826d;
                                        z = false;
                                    }
                                } else if (i5 < 2) {
                                    i12 -= 3;
                                    long j11 = j8 + j;
                                    bM11434a = f0d.m11434a(bArr, j8);
                                    if (bM11434a > -65) {
                                    }
                                    z = false;
                                    i3 = -1;
                                } else {
                                    iM5826d = m5826d(j8, bArr, i3, i5);
                                    i3 = iM5826d;
                                    z = false;
                                }
                            } else if (i5 == 0) {
                                i12 -= 2;
                                if (i3 >= -62) {
                                    j2 = j8 + j;
                                    if (f0d.m11434a(bArr, j8) > -65) {
                                        j8 = j2;
                                    }
                                }
                                z = false;
                                i3 = -1;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                            i3 = 0;
                        }
                    }
                }
                break;
        }
        if (i3 == 0) {
            return true;
        }
        return z;
    }
}
