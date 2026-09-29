package p000;

import android.graphics.Rect;
import com.google.android.gms.internal.vision.AbstractC1040y;
import com.google.android.gms.internal.vision.C1036u;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sdd {
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX INFO: renamed from: a */
    public static boolean m21274a(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM21277d;
        int i2;
        int i3;
        boolean zM21275b = m21275b(i, rect, rect2);
        if (!m21275b(i, rect, rect3) && zM21275b) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iM21277d = m21277d(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iM21277d < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iM21277d = m21277d(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM21277d < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iM21277d = m21277d(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iM21277d < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iM21277d = m21277d(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iM21277d < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    /* JADX INFO: renamed from: b */
    public static boolean m21275b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21276c(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m21277d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m21278e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: f */
    public static int m21279f(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: g */
    public static int m21280g(int i, byte[] bArr, int i2, int i3, mpc mpcVar, vnb vnbVar) {
        doc docVar = (doc) mpcVar;
        int iM21286m = m21286m(bArr, i2, vnbVar);
        docVar.m10562f(vnbVar.f65674a);
        while (iM21286m < i3) {
            int iM21286m2 = m21286m(bArr, iM21286m, vnbVar);
            if (i != vnbVar.f65674a) {
                break;
            }
            iM21286m = m21286m(bArr, iM21286m2, vnbVar);
            docVar.m10562f(vnbVar.f65674a);
        }
        return iM21286m;
    }

    /* JADX INFO: renamed from: h */
    public static int m21281h(int i, byte[] bArr, int i2, int i3, ozc ozcVar, vnb vnbVar) throws zzjk {
        if ((i >>> 3) == 0) {
            throw new zzjk("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM21287n = m21287n(bArr, i2, vnbVar);
            ozcVar.m18847a(i, Long.valueOf(vnbVar.f65675b));
            return iM21287n;
        }
        if (i4 == 1) {
            ozcVar.m18847a(i, Long.valueOf(m21288o(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM21286m = m21286m(bArr, i2, vnbVar);
            int i5 = vnbVar.f65674a;
            if (i5 < 0) {
                throw zzjk.m5836b();
            }
            if (i5 > bArr.length - iM21286m) {
                throw zzjk.m5835a();
            }
            if (i5 == 0) {
                ozcVar.m18847a(i, zzht.f12293b);
            } else {
                ozcVar.m18847a(i, zzht.m5829g(bArr, iM21286m, i5));
            }
            return iM21286m + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzjk("Protocol message contained an invalid tag (zero).");
            }
            ozcVar.m18847a(i, Integer.valueOf(m21279f(i2, bArr)));
            return i2 + 4;
        }
        ozc ozcVarM18846b = ozc.m18846b();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM21286m2 = m21286m(bArr, i2, vnbVar);
            int i8 = vnbVar.f65674a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iM21286m2;
                break;
            }
            i2 = m21281h(i8, bArr, iM21286m2, i3, ozcVarM18846b, vnbVar);
            i7 = i8;
        }
        if (i2 > i3 || i7 != i6) {
            throw new zzjk("Failed to parse the message.");
        }
        ozcVar.m18847a(i, ozcVarM18846b);
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m21282i(int i, byte[] bArr, int i2, vnb vnbVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            vnbVar.f65674a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            vnbVar.f65674a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vnbVar.f65674a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vnbVar.f65674a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vnbVar.f65674a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m21283j(iwc iwcVar, int i, byte[] bArr, int i2, int i3, mpc mpcVar, vnb vnbVar) throws zzjk {
        int iM21285l = m21285l(iwcVar, bArr, i2, i3, vnbVar);
        mpcVar.add(vnbVar.f65676c);
        while (iM21285l < i3) {
            int iM21286m = m21286m(bArr, iM21285l, vnbVar);
            if (i != vnbVar.f65674a) {
                break;
            }
            iM21285l = m21285l(iwcVar, bArr, iM21286m, i3, vnbVar);
            mpcVar.add(vnbVar.f65676c);
        }
        return iM21285l;
    }

    /* JADX INFO: renamed from: k */
    public static int m21284k(iwc iwcVar, byte[] bArr, int i, int i2, int i3, vnb vnbVar) {
        C1036u c1036u = (C1036u) iwcVar;
        Object objZza = c1036u.zza();
        int iM5769k = c1036u.m5769k(objZza, bArr, i, i2, i3, vnbVar);
        c1036u.mo5759a(objZza);
        vnbVar.f65676c = objZza;
        return iM5769k;
    }

    /* JADX INFO: renamed from: l */
    public static int m21285l(iwc iwcVar, byte[] bArr, int i, int i2, vnb vnbVar) throws zzjk {
        int iM21282i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM21282i = m21282i(i3, bArr, iM21282i, vnbVar);
            i3 = vnbVar.f65674a;
        }
        int i4 = iM21282i;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzjk.m5835a();
        }
        Object objZza = iwcVar.zza();
        int i5 = i4 + i3;
        iwcVar.mo5764f(objZza, bArr, i4, i5, vnbVar);
        iwcVar.mo5759a(objZza);
        vnbVar.f65676c = objZza;
        return i5;
    }

    /* JADX INFO: renamed from: m */
    public static int m21286m(byte[] bArr, int i, vnb vnbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m21282i(b, bArr, i2, vnbVar);
        }
        vnbVar.f65674a = b;
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public static int m21287n(byte[] bArr, int i, vnb vnbVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            vnbVar.f65675b = j;
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
        vnbVar.f65675b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: o */
    public static long m21288o(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: p */
    public static int m21289p(byte[] bArr, int i, vnb vnbVar) throws zzjk {
        int iM21286m = m21286m(bArr, i, vnbVar);
        int i2 = vnbVar.f65674a;
        if (i2 < 0) {
            throw zzjk.m5836b();
        }
        if (i2 == 0) {
            vnbVar.f65676c = "";
            return iM21286m;
        }
        vnbVar.f65676c = new String(bArr, iM21286m, i2, noc.f53082a);
        return iM21286m + i2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[LOOP:2: B:21:0x0053->B:24:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118 A[LOOP:5: B:57:0x0112->B:60:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x007a A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static int m21290q(byte[] bArr, int i, vnb vnbVar) throws zzjk {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        byte bM11434a;
        int i7;
        byte bM11434a2;
        int iM21286m = m21286m(bArr, i, vnbVar);
        int i8 = vnbVar.f65674a;
        if (i8 < 0) {
            throw zzjk.m5836b();
        }
        if (i8 == 0) {
            vnbVar.f65676c = "";
            return iM21286m;
        }
        String str = null;
        byte b3 = -16;
        byte b4 = -32;
        switch (AbstractC1040y.f12266a.f12267a) {
            case 0:
                if ((iM21286m | i8 | ((bArr.length - iM21286m) - i8)) < 0) {
                    uk9.m22777k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(iM21286m), Integer.valueOf(i8)});
                } else {
                    int i9 = iM21286m + i8;
                    char[] cArr = new char[i8];
                    int i10 = iM21286m;
                    int i11 = 0;
                    while (i10 < i9) {
                        byte b5 = bArr[i10];
                        if (b5 < 0) {
                            i2 = i11;
                            while (i10 < i9) {
                                i3 = i10 + 1;
                                b = bArr[i10];
                                if (b >= 0) {
                                    i4 = i2 + 1;
                                    cArr[i2] = (char) b;
                                    while (i3 < i9) {
                                        b2 = bArr[i3];
                                        if (b2 >= 0) {
                                            i3++;
                                            cArr[i4] = (char) b2;
                                            i4++;
                                        } else {
                                            i2 = i4;
                                            i10 = i3;
                                        }
                                    }
                                    i2 = i4;
                                    i10 = i3;
                                } else if (b < -32) {
                                    if (i3 < i9) {
                                        throw zzjk.m5837c();
                                    }
                                    i10 += 2;
                                    med.m16803d(b, bArr[i3], cArr, i2);
                                    i2++;
                                } else if (b < -16) {
                                    if (i3 < i9 - 1) {
                                        throw zzjk.m5837c();
                                    }
                                    int i12 = i10 + 2;
                                    i10 += 3;
                                    med.m16802c(b, bArr[i3], bArr[i12], cArr, i2);
                                    i2++;
                                } else {
                                    if (i3 < i9 - 2) {
                                        throw zzjk.m5837c();
                                    }
                                    byte b6 = bArr[i3];
                                    int i13 = i10 + 3;
                                    byte b7 = bArr[i10 + 2];
                                    i10 += 4;
                                    med.m16801b(b, b6, b7, bArr[i13], cArr, i2);
                                    i2 += 2;
                                }
                            }
                            str = new String(cArr, 0, i2);
                        } else {
                            i10++;
                            cArr[i11] = (char) b5;
                            i11++;
                        }
                        break;
                    }
                    i2 = i11;
                    while (i10 < i9) {
                        i3 = i10 + 1;
                        b = bArr[i10];
                        if (b >= 0) {
                            i4 = i2 + 1;
                            cArr[i2] = (char) b;
                            while (i3 < i9) {
                                b2 = bArr[i3];
                                if (b2 >= 0) {
                                    i3++;
                                    cArr[i4] = (char) b2;
                                    i4++;
                                } else {
                                    i2 = i4;
                                    i10 = i3;
                                }
                            }
                            i2 = i4;
                            i10 = i3;
                        } else if (b < -32) {
                            if (i3 < i9) {
                                throw zzjk.m5837c();
                            }
                            i10 += 2;
                            med.m16803d(b, bArr[i3], cArr, i2);
                            i2++;
                        } else if (b < -16) {
                            if (i3 < i9 - 1) {
                                throw zzjk.m5837c();
                            }
                            int i14 = i10 + 2;
                            i10 += 3;
                            med.m16802c(b, bArr[i3], bArr[i14], cArr, i2);
                            i2++;
                        } else {
                            if (i3 < i9 - 2) {
                                throw zzjk.m5837c();
                            }
                            byte b8 = bArr[i3];
                            int i15 = i10 + 3;
                            byte b9 = bArr[i10 + 2];
                            i10 += 4;
                            med.m16801b(b, b8, b9, bArr[i15], cArr, i2);
                            i2 += 2;
                        }
                    }
                    str = new String(cArr, 0, i2);
                }
                break;
            default:
                if ((iM21286m | i8 | ((bArr.length - iM21286m) - i8)) < 0) {
                    uk9.m22777k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(iM21286m), Integer.valueOf(i8)});
                } else {
                    int i16 = iM21286m + i8;
                    char[] cArr2 = new char[i8];
                    int i17 = iM21286m;
                    int i18 = 0;
                    while (i17 < i16) {
                        byte bM11434a3 = f0d.m11434a(bArr, i17);
                        if (bM11434a3 < 0) {
                            i5 = i18;
                            while (i17 < i16) {
                                i6 = i17 + 1;
                                bM11434a = f0d.m11434a(bArr, i17);
                                if (bM11434a >= 0) {
                                    i7 = i5 + 1;
                                    cArr2[i5] = (char) bM11434a;
                                    while (i6 < i16) {
                                        bM11434a2 = f0d.m11434a(bArr, i6);
                                        if (bM11434a2 >= 0) {
                                            i6++;
                                            cArr2[i7] = (char) bM11434a2;
                                            i7++;
                                        } else {
                                            i5 = i7;
                                            i17 = i6;
                                        }
                                    }
                                    i5 = i7;
                                    i17 = i6;
                                } else if (bM11434a < b4) {
                                    if (i6 < i16) {
                                        throw zzjk.m5837c();
                                    }
                                    i17 += 2;
                                    med.m16803d(bM11434a, f0d.m11434a(bArr, i6), cArr2, i5);
                                    i5++;
                                } else if (bM11434a < b3) {
                                    if (i6 < i16 - 1) {
                                        throw zzjk.m5837c();
                                    }
                                    int i19 = i17 + 2;
                                    i17 += 3;
                                    med.m16802c(bM11434a, f0d.m11434a(bArr, i6), f0d.m11434a(bArr, i19), cArr2, i5);
                                    i5++;
                                } else {
                                    if (i6 < i16 - 2) {
                                        throw zzjk.m5837c();
                                    }
                                    byte bM11434a4 = f0d.m11434a(bArr, i6);
                                    int i20 = i17 + 3;
                                    byte bM11434a5 = f0d.m11434a(bArr, i17 + 2);
                                    i17 += 4;
                                    med.m16801b(bM11434a, bM11434a4, bM11434a5, f0d.m11434a(bArr, i20), cArr2, i5);
                                    i5 += 2;
                                }
                                b3 = -16;
                                b4 = -32;
                            }
                            str = new String(cArr2, 0, i5);
                        } else {
                            i17++;
                            cArr2[i18] = (char) bM11434a3;
                            i18++;
                        }
                        break;
                    }
                    i5 = i18;
                    while (i17 < i16) {
                        i6 = i17 + 1;
                        bM11434a = f0d.m11434a(bArr, i17);
                        if (bM11434a >= 0) {
                            i7 = i5 + 1;
                            cArr2[i5] = (char) bM11434a;
                            while (i6 < i16) {
                                bM11434a2 = f0d.m11434a(bArr, i6);
                                if (bM11434a2 >= 0) {
                                    i6++;
                                    cArr2[i7] = (char) bM11434a2;
                                    i7++;
                                } else {
                                    i5 = i7;
                                    i17 = i6;
                                }
                            }
                            i5 = i7;
                            i17 = i6;
                        } else if (bM11434a < b4) {
                            if (i6 < i16) {
                                throw zzjk.m5837c();
                            }
                            i17 += 2;
                            med.m16803d(bM11434a, f0d.m11434a(bArr, i6), cArr2, i5);
                            i5++;
                        } else if (bM11434a < b3) {
                            if (i6 < i16 - 1) {
                                throw zzjk.m5837c();
                            }
                            int i110 = i17 + 2;
                            i17 += 3;
                            med.m16802c(bM11434a, f0d.m11434a(bArr, i6), f0d.m11434a(bArr, i110), cArr2, i5);
                            i5++;
                        } else {
                            if (i6 < i16 - 2) {
                                throw zzjk.m5837c();
                            }
                            byte bM11434a6 = f0d.m11434a(bArr, i6);
                            int i21 = i17 + 3;
                            byte bM11434a7 = f0d.m11434a(bArr, i17 + 2);
                            i17 += 4;
                            med.m16801b(bM11434a, bM11434a6, bM11434a7, f0d.m11434a(bArr, i21), cArr2, i5);
                            i5 += 2;
                        }
                        b3 = -16;
                        b4 = -32;
                    }
                    str = new String(cArr2, 0, i5);
                }
                break;
        }
        vnbVar.f65676c = str;
        return iM21286m + i8;
    }

    /* JADX INFO: renamed from: r */
    public static int m21291r(byte[] bArr, int i, vnb vnbVar) throws zzjk {
        int iM21286m = m21286m(bArr, i, vnbVar);
        int i2 = vnbVar.f65674a;
        if (i2 < 0) {
            throw zzjk.m5836b();
        }
        if (i2 > bArr.length - iM21286m) {
            throw zzjk.m5835a();
        }
        if (i2 == 0) {
            vnbVar.f65676c = zzht.f12293b;
            return iM21286m;
        }
        vnbVar.f65676c = zzht.m5829g(bArr, iM21286m, i2);
        return iM21286m + i2;
    }
}
