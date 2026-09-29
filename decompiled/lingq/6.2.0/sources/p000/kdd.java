package p000;

import com.google.android.gms.internal.play_billing.AbstractC0998i;
import com.google.android.gms.internal.play_billing.AbstractC1004o;
import com.google.android.gms.internal.play_billing.C1001l;
import com.google.android.gms.internal.play_billing.zzev;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kdd {
    /* JADX INFO: renamed from: a */
    public static void m15141a(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        uk9.m22774h(file, "Unable to create parent directories of ");
    }

    /* JADX INFO: renamed from: b */
    public static int m15142b(byte[] bArr, int i, C0787av c0787av) {
        int iM15150j = m15150j(bArr, i, c0787av);
        int i2 = c0787av.f7540a;
        if (i2 < 0) {
            fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM15150j) {
            fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c0787av.f7542c = zzev.f12230b;
            return iM15150j;
        }
        c0787av.f7542c = zzev.m5686m(bArr, iM15150j, i2);
        return iM15150j + i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m15143c(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: d */
    public static int m15144d(lgc lgcVar, byte[] bArr, int i, int i2, int i3, C0787av c0787av) {
        AbstractC0998i abstractC0998iMo5558b = lgcVar.mo5558b();
        int iM15154n = m15154n(abstractC0998iMo5558b, lgcVar, bArr, i, i2, i3, c0787av);
        lgcVar.mo5559c(abstractC0998iMo5558b);
        c0787av.f7542c = abstractC0998iMo5558b;
        return iM15154n;
    }

    /* JADX INFO: renamed from: e */
    public static int m15145e(lgc lgcVar, byte[] bArr, int i, int i2, C0787av c0787av) {
        AbstractC0998i abstractC0998iMo5558b = lgcVar.mo5558b();
        int iM15155o = m15155o(abstractC0998iMo5558b, lgcVar, bArr, i, i2, c0787av);
        lgcVar.mo5559c(abstractC0998iMo5558b);
        c0787av.f7542c = abstractC0998iMo5558b;
        return iM15155o;
    }

    /* JADX INFO: renamed from: f */
    public static int m15146f(lgc lgcVar, int i, byte[] bArr, int i2, int i3, e9c e9cVar, C0787av c0787av) {
        int iM15145e = m15145e(lgcVar, bArr, i2, i3, c0787av);
        e9cVar.add(c0787av.f7542c);
        while (iM15145e < i3) {
            int iM15150j = m15150j(bArr, iM15145e, c0787av);
            if (i != c0787av.f7540a) {
                break;
            }
            iM15145e = m15145e(lgcVar, bArr, iM15150j, i3, c0787av);
            e9cVar.add(c0787av.f7542c);
        }
        return iM15145e;
    }

    /* JADX INFO: renamed from: g */
    public static int m15147g(byte[] bArr, int i, e9c e9cVar, C0787av c0787av) {
        j8c j8cVar = (j8c) e9cVar;
        int iM15150j = m15150j(bArr, i, c0787av);
        int i2 = c0787av.f7540a + iM15150j;
        while (iM15150j < i2) {
            iM15150j = m15150j(bArr, iM15150j, c0787av);
            j8cVar.m14340i(c0787av.f7540a);
        }
        if (iM15150j == i2) {
            return iM15150j;
        }
        fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
      0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static int m15148h(byte[] bArr, int i, C0787av c0787av) {
        int iM15150j = m15150j(bArr, i, c0787av);
        int i2 = c0787av.f7540a;
        if (i2 < 0) {
            fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            c0787av.f7542c = "";
            return iM15150j;
        }
        int i3 = AbstractC1004o.f12200a;
        int length = bArr.length;
        if ((((length - iM15150j) - i2) | iM15150j | i2) < 0) {
            uk9.m22777k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iM15150j), Integer.valueOf(i2)});
            return 0;
        }
        int i4 = iM15150j + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iM15150j < i4) {
            byte b = bArr[iM15150j];
            if (b < 0) {
                break;
            }
            iM15150j++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iM15150j < i4) {
            int i6 = iM15150j + 1;
            byte b2 = bArr[iM15150j];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iM15150j = i6;
                while (iM15150j < i4) {
                    byte b3 = bArr[iM15150j];
                    if (b3 < 0) {
                        break;
                    }
                    iM15150j++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            fg2.m11822k("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = iM15150j + 3;
                        byte b5 = bArr[iM15150j + 2];
                        iM15150j += 4;
                        byte b6 = bArr[i7];
                        if (!zdd.m25563b(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !zdd.m25563b(b5) && !zdd.m25563b(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        fg2.m11822k("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        fg2.m11822k("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = iM15150j + 2;
                    byte b7 = bArr[i6];
                    iM15150j += 3;
                    byte b8 = bArr[i10];
                    if (!zdd.m25563b(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!zdd.m25563b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!zdd.m25563b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!zdd.m25563b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!zdd.m25563b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    fg2.m11822k("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    fg2.m11822k("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                iM15150j += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || zdd.m25563b(b9)) {
                    fg2.m11822k("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        c0787av.f7542c = new String(cArr, 0, i5);
        return i4;
    }

    /* JADX INFO: renamed from: i */
    public static int m15149i(int i, byte[] bArr, int i2, int i3, jjc jjcVar, C0787av c0787av) {
        if ((i >>> 3) == 0) {
            fg2.m11822k("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM15153m = m15153m(bArr, i2, c0787av);
            jjcVar.m14506c(i, Long.valueOf(c0787av.f7541b));
            return iM15153m;
        }
        if (i4 == 1) {
            jjcVar.m14506c(i, Long.valueOf(m15156p(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM15150j = m15150j(bArr, i2, c0787av);
            int i5 = c0787av.f7540a;
            if (i5 < 0) {
                fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM15150j) {
                fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                jjcVar.m14506c(i, zzev.f12230b);
            } else {
                jjcVar.m14506c(i, zzev.m5686m(bArr, iM15150j, i5));
            }
            return iM15150j + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                jjcVar.m14506c(i, Integer.valueOf(m15143c(i2, bArr)));
                return i2 + 4;
            }
            fg2.m11822k("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        jjc jjcVarM14504b = jjc.m14504b();
        int i7 = c0787av.f7543d + 1;
        c0787av.f7543d = i7;
        if (i7 >= 100) {
            fg2.m11822k("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM15150j2 = m15150j(bArr, i2, c0787av);
            int i9 = c0787av.f7540a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM15150j2;
                break;
            }
            i2 = m15149i(i9, bArr, iM15150j2, i3, jjcVarM14504b, c0787av);
            i8 = i9;
        }
        c0787av.f7543d--;
        if (i2 > i3 || i8 != i6) {
            fg2.m11822k("Failed to parse the message.");
            return 0;
        }
        jjcVar.m14506c(i, jjcVarM14504b);
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static int m15150j(byte[] bArr, int i, C0787av c0787av) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m15151k(b, bArr, i2, c0787av);
        }
        c0787av.f7540a = b;
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public static int m15151k(int i, byte[] bArr, int i2, C0787av c0787av) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c0787av.f7540a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c0787av.f7540a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0787av.f7540a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0787av.f7540a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0787av.f7540a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m15152l(int i, byte[] bArr, int i2, int i3, e9c e9cVar, C0787av c0787av) {
        j8c j8cVar = (j8c) e9cVar;
        int iM15150j = m15150j(bArr, i2, c0787av);
        j8cVar.m14340i(c0787av.f7540a);
        while (iM15150j < i3) {
            int iM15150j2 = m15150j(bArr, iM15150j, c0787av);
            if (i != c0787av.f7540a) {
                break;
            }
            iM15150j = m15150j(bArr, iM15150j2, c0787av);
            j8cVar.m14340i(c0787av.f7540a);
        }
        return iM15150j;
    }

    /* JADX INFO: renamed from: m */
    public static int m15153m(byte[] bArr, int i, C0787av c0787av) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c0787av.f7541b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c0787av.f7541b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public static int m15154n(Object obj, lgc lgcVar, byte[] bArr, int i, int i2, int i3, C0787av c0787av) {
        C1001l c1001l = (C1001l) lgcVar;
        int i4 = c0787av.f7543d + 1;
        c0787av.f7543d = i4;
        if (i4 >= 100) {
            fg2.m11822k("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iM5575t = c1001l.m5575t(obj, bArr, i, i2, i3, c0787av);
        c0787av.f7543d--;
        c0787av.f7542c = obj;
        return iM5575t;
    }

    /* JADX INFO: renamed from: o */
    public static int m15155o(Object obj, lgc lgcVar, byte[] bArr, int i, int i2, C0787av c0787av) {
        int iM15151k = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM15151k = m15151k(i3, bArr, iM15151k, c0787av);
            i3 = c0787av.f7540a;
        }
        int i4 = iM15151k;
        if (i3 < 0 || i3 > i2 - i4) {
            fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c0787av.f7543d + 1;
        c0787av.f7543d = i5;
        if (i5 >= 100) {
            fg2.m11822k("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        lgcVar.mo5561e(obj, bArr, i4, i6, c0787av);
        c0787av.f7543d--;
        c0787av.f7542c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: p */
    public static long m15156p(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
