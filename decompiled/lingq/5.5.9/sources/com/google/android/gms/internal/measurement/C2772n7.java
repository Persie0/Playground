package com.google.android.gms.internal.measurement;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2772n7<T> implements InterfaceC2876v7<T> {

    /* JADX INFO: renamed from: n */
    public static final int[] f14335n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f14336o = C2812q8.m8223k();

    /* JADX INFO: renamed from: a */
    public final int[] f14337a;

    /* JADX INFO: renamed from: b */
    public final Object[] f14338b;

    /* JADX INFO: renamed from: c */
    public final int f14339c;

    /* JADX INFO: renamed from: d */
    public final int f14340d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2730k7 f14341e;

    /* JADX INFO: renamed from: f */
    public final boolean f14342f;

    /* JADX INFO: renamed from: g */
    public final boolean f14343g;

    /* JADX INFO: renamed from: h */
    public final int[] f14344h;

    /* JADX INFO: renamed from: i */
    public final int f14345i;

    /* JADX INFO: renamed from: j */
    public final int f14346j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2927z6 f14347k;

    /* JADX INFO: renamed from: l */
    public final AbstractC2675g8 f14348l;

    /* JADX INFO: renamed from: m */
    public final AbstractC2603b6 f14349m;

    public C2772n7(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2730k7 interfaceC2730k7, boolean z10, int[] iArr2, int i12, int i13, AbstractC2927z6 abstractC2927z6, AbstractC2675g8 abstractC2675g8, AbstractC2603b6 abstractC2603b6) {
        this.f14337a = iArr;
        this.f14338b = objArr;
        this.f14339c = i10;
        this.f14340d = i11;
        this.f14343g = z10;
        this.f14342f = abstractC2603b6 != null && abstractC2603b6.mo7699c(interfaceC2730k7);
        this.f14344h = iArr2;
        this.f14345i = i12;
        this.f14346j = i13;
        this.f14347k = abstractC2927z6;
        this.f14348l = abstractC2675g8;
        this.f14349m = abstractC2603b6;
        this.f14341e = interfaceC2730k7;
    }

    /* JADX INFO: renamed from: B */
    public static C2689h8 m8090B(Object obj) {
        AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) obj;
        C2689h8 c2689h8 = abstractC2771n6.zzc;
        if (c2689h8 != C2689h8.f14234f) {
            return c2689h8;
        }
        C2689h8 c2689h8M7871b = C2689h8.m7871b();
        abstractC2771n6.zzc = c2689h8M7871b;
        return c2689h8M7871b;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:129:0x0295  */
    /* JADX INFO: renamed from: C */
    public static C2772n7 m8091C(InterfaceC2702i7 interfaceC2702i7, AbstractC2927z6 abstractC2927z6, AbstractC2675g8 abstractC2675g8, AbstractC2603b6 abstractC2603b6) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        int i28;
        Field fieldM8094n;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldM8094n2;
        int i33;
        Object obj2;
        Field fieldM8094n3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(interfaceC2702i7 instanceof C2863u7)) {
            throw null;
        }
        C2863u7 c2863u7 = (C2863u7) interfaceC2702i7;
        int iMo7829d = c2863u7.mo7829d();
        String strM8293a = c2863u7.m8293a();
        int length = strM8293a.length();
        char c10 = 55296;
        if (strM8293a.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strM8293a.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt4 = strM8293a.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i40 = iCharAt4 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strM8293a.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt4 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt4 == 0) {
            iCharAt2 = 0;
            iCharAt3 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i11 = i39;
            iArr = f14335n;
            iCharAt = 0;
        } else {
            int i42 = i39 + 1;
            iCharAt = strM8293a.charAt(i39);
            if (iCharAt >= 55296) {
                int i43 = iCharAt & 8191;
                int i44 = 13;
                while (true) {
                    i23 = i42 + 1;
                    cCharAt8 = strM8293a.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i23;
                }
                iCharAt = i43 | (cCharAt8 << i44);
                i42 = i23;
            }
            int i45 = i42 + 1;
            int iCharAt5 = strM8293a.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt7 = strM8293a.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt5 = i46 | (cCharAt7 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strM8293a.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt6 = strM8293a.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt6 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strM8293a.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt5 = strM8293a.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt7 = i52 | (cCharAt5 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            iCharAt2 = strM8293a.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt4 = strM8293a.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt2 = i55 | (cCharAt4 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt3 = strM8293a.charAt(i54);
            if (iCharAt3 >= 55296) {
                int i58 = iCharAt3 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt3 = strM8293a.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt3 = i58 | (cCharAt3 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strM8293a.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt2 = strM8293a.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i17;
            }
            i11 = i60 + 1;
            int iCharAt9 = strM8293a.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = i11;
                int i65 = 13;
                while (true) {
                    i16 = i64 + 1;
                    cCharAt = strM8293a.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i64 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i65);
                i11 = i16;
            }
            int i66 = iCharAt9 + iCharAt3 + iCharAt8;
            i12 = iCharAt + iCharAt + iCharAt5;
            iArr = new int[i66];
            i13 = iCharAt6;
            i14 = iCharAt7;
            i15 = iCharAt9;
        }
        Object[] objArrM8294b = c2863u7.m8294b();
        Class<?> cls = c2863u7.zza().getClass();
        int i67 = i15 + iCharAt3;
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i68 = i11;
        int i69 = i15;
        int i70 = i67;
        int i71 = 0;
        int i72 = 0;
        while (true) {
            boolean z10 = iMo7829d == 2;
            if (i68 >= length) {
                return new C2772n7(iArr2, objArr, i13, i14, c2863u7.zza(), z10, iArr, i15, i67, abstractC2927z6, abstractC2675g8, abstractC2603b6);
            }
            int i73 = i68 + 1;
            int iCharAt10 = strM8293a.charAt(i68);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = 13;
                while (true) {
                    i36 = i73 + 1;
                    cCharAt12 = strM8293a.charAt(i73);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i73 = i36;
                }
                iCharAt10 = i74 | (cCharAt12 << i75);
                i73 = i36;
            }
            int i76 = i73 + 1;
            int iCharAt11 = strM8293a.charAt(i73);
            if (iCharAt11 >= c10) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i35 = i78 + 1;
                    cCharAt11 = strM8293a.charAt(i78);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i35;
                }
                iCharAt11 = i77 | (cCharAt11 << i79);
                i24 = i35;
            } else {
                i24 = i76;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i80 = iCharAt11 & 255;
            int i81 = iMo7829d;
            Unsafe unsafe = f14336o;
            int i82 = length;
            if (i80 >= 51) {
                int i83 = i24 + 1;
                int iCharAt12 = strM8293a.charAt(i24);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = 13;
                    int i85 = iCharAt12 & 8191;
                    int i86 = i83;
                    while (true) {
                        i34 = i86 + 1;
                        cCharAt10 = strM8293a.charAt(i86);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i86 = i34;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i84);
                    i30 = i34;
                } else {
                    i30 = i83;
                }
                i28 = i30;
                int i87 = i80 - 51;
                if (i87 == 9 || i87 == 17) {
                    int i88 = i72 / 3;
                    i31 = i12 + 1;
                    objArr[i88 + i88 + 1] = objArrM8294b[i12];
                } else {
                    if (i87 == 12 && !z10) {
                        int i89 = i72 / 3;
                        i31 = i12 + 1;
                        objArr[i89 + i89 + 1] = objArrM8294b[i12];
                    }
                    i32 = iCharAt12 + iCharAt12;
                    obj = objArrM8294b[i32];
                    if (obj instanceof Field) {
                        fieldM8094n2 = (Field) obj;
                    } else {
                        fieldM8094n2 = m8094n(cls, (String) obj);
                        objArrM8294b[i32] = fieldM8094n2;
                    }
                    i25 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8094n2);
                    i33 = i32 + 1;
                    obj2 = objArrM8294b[i33];
                    if (obj2 instanceof Field) {
                        fieldM8094n3 = (Field) obj2;
                    } else {
                        fieldM8094n3 = m8094n(cls, (String) obj2);
                        objArrM8294b[i33] = fieldM8094n3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8094n3);
                    strM8293a = strM8293a;
                    i27 = 0;
                }
                i12 = i31;
                i32 = iCharAt12 + iCharAt12;
                obj = objArrM8294b[i32];
                if (obj instanceof Field) {
                    fieldM8094n2 = (Field) obj;
                } else {
                    fieldM8094n2 = m8094n(cls, (String) obj);
                    objArrM8294b[i32] = fieldM8094n2;
                }
                i25 = i12;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8094n2);
                i33 = i32 + 1;
                obj2 = objArrM8294b[i33];
                if (obj2 instanceof Field) {
                    fieldM8094n3 = (Field) obj2;
                } else {
                    fieldM8094n3 = m8094n(cls, (String) obj2);
                    objArrM8294b[i33] = fieldM8094n3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8094n3);
                strM8293a = strM8293a;
                i27 = 0;
            } else {
                int i90 = i12 + 1;
                Field fieldM8094n4 = m8094n(cls, (String) objArrM8294b[i12]);
                if (i80 == 9 || i80 == 17) {
                    int i91 = i72 / 3;
                    objArr[i91 + i91 + 1] = fieldM8094n4.getType();
                } else if (i80 == 27 || i80 == 49) {
                    int i92 = i72 / 3;
                    objArr[i92 + i92 + 1] = objArrM8294b[i90];
                    i90++;
                } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                    if (!z10) {
                        int i93 = i72 / 3;
                        i29 = i90 + 1;
                        objArr[i93 + i93 + 1] = objArrM8294b[i90];
                        i90 = i29;
                    }
                } else if (i80 == 50) {
                    int i94 = i69 + 1;
                    iArr[i69] = i72;
                    int i95 = i72 / 3;
                    i29 = i90 + 1;
                    int i96 = i95 + i95;
                    objArr[i96] = objArrM8294b[i90];
                    if ((iCharAt11 & 2048) != 0) {
                        i90 = i29 + 1;
                        objArr[i96 + 1] = objArrM8294b[i29];
                        i69 = i94;
                    } else {
                        i69 = i94;
                        i90 = i29;
                    }
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM8094n4);
                i25 = i90;
                if ((iCharAt11 & 4096) != 4096 || i80 > 17) {
                    iObjectFieldOffset = 1048575;
                    i26 = i24;
                    i27 = 0;
                } else {
                    int i97 = i24 + 1;
                    int iCharAt13 = strM8293a.charAt(i24);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i26 = i97 + 1;
                            cCharAt9 = strM8293a.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i26;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i26 = i97;
                    }
                    int i100 = (iCharAt13 / 32) + iCharAt + iCharAt;
                    Object obj3 = objArrM8294b[i100];
                    if (obj3 instanceof Field) {
                        fieldM8094n = (Field) obj3;
                    } else {
                        fieldM8094n = m8094n(cls, (String) obj3);
                        objArrM8294b[i100] = fieldM8094n;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8094n);
                    i27 = iCharAt13 % 32;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i70] = iObjectFieldOffset3;
                    i70++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i28 = i26;
            }
            int i101 = i72 + 1;
            iArr2[i72] = iCharAt10;
            int i102 = i101 + 1;
            iArr2[i101] = iObjectFieldOffset2 | (i80 << 20) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0);
            i72 = i102 + 1;
            iArr2[i102] = iObjectFieldOffset | (i27 << 20);
            strM8293a = strM8293a;
            i12 = i25;
            iMo7829d = i81;
            i68 = i28;
            length = i82;
            i71 = i71;
            c10 = 55296;
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m8092E(long j10, Object obj) {
        return ((Integer) C2812q8.m8222j(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: K */
    public static long m8093K(long j10, Object obj) {
        return ((Long) C2812q8.m8222j(j10, obj)).longValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public static Field m8094n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM855o = C0204c.m855o("Field ", str, " for ", name, " not found. Known fields are ");
            sbM855o.append(string);
            throw new RuntimeException(sbM855o.toString());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public static void m8095o(Object obj) {
        if (!m8096x(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m8096x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2771n6) {
            return ((AbstractC2771n6) obj).m8089r();
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final void m8097z(int i10, Object obj, C2900x5 c2900x5) throws IOException {
        if (!(obj instanceof String)) {
            c2900x5.m8417f(i10, (zzka) obj);
        } else {
            c2900x5.f14506a.mo8312E1((String) obj, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x040e A[PHI: r0 r14 r19 r20 r26 r30
      0x040e: PHI (r0v32 int) = (r0v29 int), (r0v35 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r14v11 com.google.android.gms.internal.measurement.n7<T>) = (r14v9 com.google.android.gms.internal.measurement.n7<T>), (r14v14 com.google.android.gms.internal.measurement.n7<T>) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r19v1 int) = (r19v0 int), (r19v3 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r20v5 int) = (r20v4 int), (r20v7 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r26v2 int) = (r26v1 int), (r26v5 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r30v6 sun.misc.Unsafe) = (r30v5 sun.misc.Unsafe), (r30v8 sun.misc.Unsafe) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0420 A[PHI: r0 r14 r19 r20 r25 r26 r30
      0x0420: PHI (r0v33 int) = (r0v29 int), (r0v35 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r14v12 com.google.android.gms.internal.measurement.n7<T>) = (r14v9 com.google.android.gms.internal.measurement.n7<T>), (r14v14 com.google.android.gms.internal.measurement.n7<T>) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r19v2 int) = (r19v0 int), (r19v3 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r20v6 int) = (r20v4 int), (r20v7 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r25v5 int[]) = (r25v4 int[]), (r25v7 int[]) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r26v3 int) = (r26v1 int), (r26v5 int) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x0420: PHI (r30v7 sun.misc.Unsafe) = (r30v5 sun.misc.Unsafe), (r30v8 sun.misc.Unsafe) binds: [B:126:0x040c, B:116:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final int m8098A(Object obj, byte[] bArr, int i10, int i11, int i12, C2796p5 c2796p5) throws IOException {
        Object[] objArr;
        int[] iArr;
        Unsafe unsafe;
        Object obj2;
        C2772n7<T> c2772n7;
        int i13;
        int iM8103I;
        int iM8103I2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C2796p5 c2796p6;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z10;
        byte b10;
        int iM8209l;
        int i31;
        C2772n7<T> c2772n8 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i11 = i11;
        C2796p5 c2796p7 = c2796p5;
        m8095o(obj);
        Unsafe unsafe2 = f14336o;
        int iM8205h = i10;
        int i32 = i12;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        int i37 = 0;
        while (true) {
            Object[] objArr2 = c2772n8.f14338b;
            int[] iArr2 = c2772n8.f14337a;
            if (iM8205h < i11) {
                int iM8207j = iM8205h + 1;
                int i38 = bArr2[iM8205h];
                if (i38 < 0) {
                    iM8207j = C2809q5.m8207j(i38, bArr2, iM8207j, c2796p7);
                    i38 = c2796p7.f14387a;
                }
                int i39 = i38 >>> 3;
                int i40 = i32;
                int i41 = c2772n8.f14340d;
                int i42 = c2772n8.f14339c;
                objArr = objArr2;
                if (i39 > i33) {
                    iM8103I2 = (i39 < i42 || i39 > i41) ? -1 : c2772n8.m8103I(i39, i34 / 3);
                    i14 = -1;
                    i13 = 0;
                } else {
                    if (i39 < i42 || i39 > i41) {
                        i13 = 0;
                        iM8103I = -1;
                    } else {
                        i13 = 0;
                        iM8103I = c2772n8.m8103I(i39, 0);
                    }
                    iM8103I2 = iM8103I;
                    i14 = -1;
                }
                if (iM8103I2 == i14) {
                    i15 = i38;
                    i16 = iM8207j;
                    i17 = i36;
                    i18 = i37;
                    iArr = iArr2;
                    unsafe = unsafe2;
                    c2772n7 = c2772n8;
                    i19 = i40;
                    i20 = i39;
                    i21 = i13;
                } else {
                    int i43 = i38 & 7;
                    int i44 = iArr2[iM8103I2 + 1];
                    int i45 = (i44 >>> 20) & 255;
                    int i46 = i38;
                    long j10 = i44 & 1048575;
                    if (i45 <= 17) {
                        int i47 = iArr2[iM8103I2 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i36) {
                            if (i36 != 1048575) {
                                unsafe2.putInt(obj3, i36, i37);
                            }
                            i37 = unsafe2.getInt(obj3, i49);
                            i29 = i49;
                        } else {
                            i29 = i36;
                        }
                        int i50 = i37;
                        switch (i45) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                i30 = iM8207j;
                                i18 = i50;
                                z10 = true;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 1) {
                                    C2812q8.m8226n(obj3, j10, Double.longBitsToDouble(C2809q5.m8212o(bArr2, i30)));
                                    iM8205h = i30 + 8;
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 1:
                                i30 = iM8207j;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 5) {
                                    C2812q8.m8227o(obj3, j10, Float.intBitsToFloat(C2809q5.m8199b(bArr2, i30)));
                                    iM8205h = i30 + 4;
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 2:
                            case 3:
                                c2796p5 = c2796p5;
                                i30 = iM8207j;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 0) {
                                    iM8209l = C2809q5.m8209l(bArr2, i30, c2796p5);
                                    unsafe2.putLong(obj, j10, c2796p5.f14388b);
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 4:
                            case 11:
                                c2796p5 = c2796p5;
                                i30 = iM8207j;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 0) {
                                    iM8205h = C2809q5.m8206i(bArr2, i30, c2796p5);
                                    unsafe2.putInt(obj3, j10, c2796p5.f14387a);
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 5:
                            case 14:
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 1) {
                                    i30 = iM8207j;
                                    unsafe2.putLong(obj, j10, C2809q5.m8212o(bArr2, iM8207j));
                                    iM8205h = i30 + 8;
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 5) {
                                    unsafe2.putInt(obj3, j10, C2809q5.m8199b(bArr2, iM8207j));
                                    i30 = iM8207j;
                                    iM8205h = i30 + 4;
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 0) {
                                    iM8205h = C2809q5.m8209l(bArr2, iM8207j, c2796p5);
                                    C2812q8.m8225m(obj3, j10, c2796p5.f14388b != 0);
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 8:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 2) {
                                    iM8205h = (536870912 & i44) == 0 ? C2809q5.m8203f(bArr2, iM8207j, c2796p5) : C2809q5.m8204g(bArr2, iM8207j, c2796p5);
                                    unsafe2.putObject(obj3, j10, c2796p5.f14389c);
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 9:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 2) {
                                    Object objM8116l = c2772n8.m8116l(i23, obj3);
                                    iM8205h = C2809q5.m8211n(objM8116l, c2772n8.m8114j(i23), bArr, iM8207j, i11, c2796p5);
                                    c2772n8.m8122t(obj3, i23, objM8116l);
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 10:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 2) {
                                    iM8205h = C2809q5.m8198a(bArr2, iM8207j, c2796p5);
                                    unsafe2.putObject(obj3, j10, c2796p5.f14389c);
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 12:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 0) {
                                    iM8205h = C2809q5.m8206i(bArr2, iM8207j, c2796p5);
                                    int i51 = c2796p5.f14387a;
                                    int i52 = i23 / 3;
                                    InterfaceC2797p6 interfaceC2797p6 = (InterfaceC2797p6) objArr[i52 + i52 + 1];
                                    if (interfaceC2797p6 == null || interfaceC2797p6.mo7746a(i51)) {
                                        unsafe2.putInt(obj3, j10, i51);
                                        iM8209l = iM8205h;
                                        i31 = i18 | i48;
                                        i18 = i31;
                                        iM8205h = iM8209l;
                                    } else {
                                        m8090B(obj).m7873c(i24 == true ? 1 : 0, Long.valueOf(i51));
                                    }
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 15:
                                c2796p5 = c2796p5;
                                i18 = i50;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 0) {
                                    iM8205h = C2809q5.m8206i(bArr2, iM8207j, c2796p5);
                                    unsafe2.putInt(obj3, j10, C2861u5.m8289a(c2796p5.f14387a));
                                    iM8209l = iM8205h;
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            case 16:
                                if (i43 == 0) {
                                    c2796p5 = c2796p5;
                                    iM8209l = C2809q5.m8209l(bArr2, iM8207j, c2796p5);
                                    long jM8290b = C2861u5.m8290b(c2796p5.f14388b);
                                    i17 = i29;
                                    i18 = i50;
                                    i23 = iM8103I2;
                                    i24 = i46 == true ? 1 : 0;
                                    unsafe2.putLong(obj, j10, jM8290b);
                                    i31 = i18 | i48;
                                    i18 = i31;
                                    iM8205h = iM8209l;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i36 = i17;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                    i37 = i18;
                                } else {
                                    i18 = i50;
                                    b10 = -1;
                                    i23 = iM8103I2;
                                    i17 = i29;
                                    i24 = i46 == true ? 1 : 0;
                                    i30 = iM8207j;
                                    z10 = true;
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                            default:
                                i30 = iM8207j;
                                i18 = i50;
                                z10 = true;
                                b10 = -1;
                                i23 = iM8103I2;
                                i17 = i29;
                                i24 = i46 == true ? 1 : 0;
                                if (i43 == 3) {
                                    Object objM8116l2 = c2772n8.m8116l(i23, obj3);
                                    iM8205h = C2809q5.m8210m(objM8116l2, c2772n8.m8114j(i23), bArr, i30, i11, (i39 << 3) | 4, c2796p5);
                                    c2772n8.m8122t(obj3, i23, objM8116l2);
                                    i37 = i18 | i48;
                                    i36 = i17;
                                    i32 = i12;
                                    i35 = i24;
                                    i34 = i23;
                                    i33 = i39;
                                    c2796p7 = c2796p5;
                                } else {
                                    i19 = i12;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i23;
                                    i16 = i30;
                                    c2772n7 = c2772n8;
                                    iArr = iArr2;
                                    i20 = i39;
                                }
                                break;
                        }
                    } else {
                        i23 = iM8103I2;
                        int i53 = iM8207j;
                        i24 = i46 == true ? 1 : 0;
                        if (i45 != 27) {
                            i17 = i36;
                            i18 = i37;
                            if (i45 <= 49) {
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i26 = i24 == true ? 1 : 0;
                                i20 = i39;
                                iM8205h = m8102H(obj, bArr, i53, i11, i24 == true ? 1 : 0, i39, i43, i23, i44, i45, j10, c2796p5);
                                c2772n7 = this;
                                i28 = i23;
                                if (iM8205h != i53) {
                                    obj = obj;
                                    i32 = i12;
                                    c2796p6 = c2796p5;
                                    i36 = i17;
                                    i37 = i18;
                                    i15 = i26;
                                    i22 = i20;
                                    i34 = i28;
                                } else {
                                    i19 = i12;
                                    i16 = iM8205h;
                                    i15 = i26;
                                    i21 = i28;
                                }
                                bArr2 = bArr;
                                i35 = i15;
                                i33 = i22;
                                c2772n8 = c2772n7;
                                unsafe2 = unsafe;
                                obj3 = obj;
                                c2796p7 = c2796p6;
                            } else {
                                i25 = i53;
                                unsafe = unsafe2;
                                i26 = i24 == true ? 1 : 0;
                                i27 = i23;
                                iArr = iArr2;
                                i20 = i39;
                                if (i45 != 50) {
                                    c2772n7 = this;
                                    i28 = i27;
                                    iM8205h = m8101G(obj, bArr, i25, i11, i26 == true ? 1 : 0, i20, i43, i44, i45, j10, i27, c2796p5);
                                    if (iM8205h != i25) {
                                        obj = obj;
                                        i32 = i12;
                                        c2796p6 = c2796p5;
                                        i36 = i17;
                                        i37 = i18;
                                        i15 = i26;
                                        i22 = i20;
                                        i34 = i28;
                                    } else {
                                        i19 = i12;
                                        i16 = iM8205h;
                                        i15 = i26;
                                        i21 = i28;
                                    }
                                    bArr2 = bArr;
                                    i35 = i15;
                                    i33 = i22;
                                    c2772n8 = c2772n7;
                                    unsafe2 = unsafe;
                                    obj3 = obj;
                                    c2796p7 = c2796p6;
                                } else if (i43 == 2) {
                                    m8100F(obj, i27, j10);
                                    throw null;
                                }
                            }
                        } else if (i43 == 2) {
                            InterfaceC2836s6 interfaceC2836s6Mo7645r = (InterfaceC2836s6) unsafe2.getObject(obj3, j10);
                            if (!interfaceC2836s6Mo7645r.mo8078d()) {
                                int size = interfaceC2836s6Mo7645r.size();
                                interfaceC2836s6Mo7645r = interfaceC2836s6Mo7645r.mo7645r(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, interfaceC2836s6Mo7645r);
                            }
                            iM8205h = C2809q5.m8201d(c2772n8.m8114j(i23), i24 == true ? 1 : 0, bArr, i53, i11, interfaceC2836s6Mo7645r, c2796p5);
                            i36 = i36;
                            i37 = i37;
                            i32 = i12;
                            i35 = i24;
                            i34 = i23;
                            i33 = i39;
                            c2796p7 = c2796p5;
                        } else {
                            i17 = i36;
                            i18 = i37;
                            i25 = i53;
                            unsafe = unsafe2;
                            i26 = i24 == true ? 1 : 0;
                            i27 = i23;
                            iArr = iArr2;
                            i20 = i39;
                        }
                        c2772n7 = this;
                        i19 = i12;
                        i16 = i25;
                        i15 = i26;
                        i21 = i27;
                    }
                }
                if (i15 != i19 || i19 == 0) {
                    if (c2772n7.f14342f) {
                        C2589a6 c2589a6 = C2589a6.f14049c;
                        c2796p6 = c2796p5;
                        C2589a6 c2589a7 = c2796p6.f14390d;
                        if (c2589a7 != c2589a6) {
                            i22 = i20;
                            if (c2589a7.m7642a(c2772n7.f14341e, i22) != null) {
                                throw null;
                            }
                            iM8205h = C2809q5.m8205h((i15 == true ? 1 : 0) == true ? 1 : 0, bArr, i16, i11, m8090B(obj), c2796p5);
                            obj = obj;
                        }
                        i32 = i19;
                        i34 = i21;
                        i36 = i17;
                        i37 = i18;
                        bArr2 = bArr;
                        i35 = i15;
                        i33 = i22;
                        c2772n8 = c2772n7;
                        unsafe2 = unsafe;
                        obj3 = obj;
                        c2796p7 = c2796p6;
                    } else {
                        c2796p6 = c2796p5;
                    }
                    i22 = i20;
                    iM8205h = C2809q5.m8205h((i15 == true ? 1 : 0) == true ? 1 : 0, bArr, i16, i11, m8090B(obj), c2796p5);
                    i32 = i19;
                    i34 = i21;
                    i36 = i17;
                    i37 = i18;
                    bArr2 = bArr;
                    i35 = i15;
                    i33 = i22;
                    c2772n8 = c2772n7;
                    unsafe2 = unsafe;
                    obj3 = obj;
                    c2796p7 = c2796p6;
                } else {
                    obj2 = obj;
                    iM8205h = i16;
                    i32 = i19;
                    i35 = i15 == true ? 1 : 0;
                    i36 = i17;
                    i37 = i18;
                }
            } else {
                objArr = objArr2;
                iArr = iArr2;
                unsafe = unsafe2;
                obj2 = obj3;
                c2772n7 = c2772n8;
            }
        }
        if (i36 != 1048575) {
            unsafe.putInt(obj2, i36, i37);
        }
        for (int i54 = c2772n7.f14345i; i54 < c2772n7.f14346j; i54++) {
            int i55 = c2772n7.f14344h[i54];
            int i56 = iArr[i55];
            Object objM8222j = C2812q8.m8222j(c2772n7.m8104J(i55) & 1048575, obj2);
            if (objM8222j != null) {
                int i57 = i55 / 3;
                if (((InterfaceC2797p6) objArr[i57 + i57 + 1]) != null) {
                    throw null;
                }
            }
        }
        if (i32 == 0) {
            if (iM8205h != i11) {
                throw zzll.m8502c();
            }
        } else if (iM8205h > i11 || i35 != i32) {
            throw zzll.m8502c();
        }
        return iM8205h;
    }

    /* JADX INFO: renamed from: D */
    public final int m8099D(Object obj) {
        int i10;
        int iM8334N1;
        int iM8334N2;
        int iM8335O1;
        int iM8334N3;
        int iM8334N4;
        int iM8334N5;
        int iM8334N6;
        int iM8344I;
        int iM8334N7;
        int iM8334N8;
        int iM8338C;
        int iM8334N9;
        int iM8334N10;
        int iM8334N11;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f14337a;
            if (i13 >= iArr.length) {
                AbstractC2675g8 abstractC2675g8 = this.f14348l;
                int iMo7851a = abstractC2675g8.mo7851a(abstractC2675g8.mo7854d(obj)) + i14;
                if (!this.f14342f) {
                    return iMo7851a;
                }
                this.f14349m.mo7697a(obj);
                throw null;
            }
            int iM8104J = m8104J(i13);
            int i16 = iArr[i13];
            int i17 = (iM8104J >>> 20) & 255;
            Unsafe unsafe = f14336o;
            if (i17 <= 17) {
                int i18 = iArr[i13 + 2];
                int i19 = i18 & i11;
                int i20 = i18 >>> 20;
                if (i19 != i12) {
                    i15 = unsafe.getInt(obj, i19);
                    i12 = i19;
                }
                i10 = 1 << i20;
            } else {
                i10 = 0;
            }
            long j10 = iM8104J & i11;
            switch (i17) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if ((i15 & i10) != 0) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case 1:
                    if ((i15 & i10) != 0) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case 2:
                    if ((i10 & i15) != 0) {
                        iM8335O1 = AbstractC2887w5.m8335O1(unsafe.getLong(obj, j10));
                        iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 += iM8334N3 + iM8335O1;
                    }
                    break;
                case 3:
                    if ((i10 & i15) != 0) {
                        iM8335O1 = AbstractC2887w5.m8335O1(unsafe.getLong(obj, j10));
                        iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 += iM8334N3 + iM8335O1;
                    }
                    break;
                case 4:
                    if ((i10 & i15) != 0) {
                        iM8335O1 = AbstractC2887w5.m8332L1(unsafe.getInt(obj, j10));
                        iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 += iM8334N3 + iM8335O1;
                    }
                    break;
                case 5:
                    if ((i15 & i10) != 0) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i15 & i10) != 0) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i15 & i10) != 0) {
                        iM8334N4 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N4 + 1;
                        i14 += iM8344I;
                    }
                    break;
                case 8:
                    if ((i10 & i15) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzka)) {
                            iM8335O1 = AbstractC2887w5.m8333M1((String) object);
                            iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                            i14 += iM8334N3 + iM8335O1;
                        } else {
                            Logger logger = AbstractC2887w5.f14492Q;
                            int iMo8492q = ((zzka) object).mo8492q();
                            iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q;
                            iM8334N6 = AbstractC2887w5.m8334N1(i16 << 3);
                            iM8344I = iM8334N6 + iM8334N5;
                            i14 += iM8344I;
                        }
                    }
                    break;
                case 9:
                    if ((i10 & i15) != 0) {
                        iM8344I = C2889w7.m8344I(i16, m8114j(i13), unsafe.getObject(obj, j10));
                        i14 += iM8344I;
                    }
                    break;
                case 10:
                    if ((i10 & i15) != 0) {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j10);
                        Logger logger2 = AbstractC2887w5.f14492Q;
                        int iMo8492q2 = zzkaVar.mo8492q();
                        iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q2) + iMo8492q2;
                        iM8334N6 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N6 + iM8334N5;
                        i14 += iM8344I;
                    }
                    break;
                case 11:
                    if ((i10 & i15) != 0) {
                        iM8335O1 = AbstractC2887w5.m8334N1(unsafe.getInt(obj, j10));
                        iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 += iM8334N3 + iM8335O1;
                    }
                    break;
                case 12:
                    if ((i10 & i15) != 0) {
                        iM8335O1 = AbstractC2887w5.m8332L1(unsafe.getInt(obj, j10));
                        iM8334N3 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 += iM8334N3 + iM8335O1;
                    }
                    break;
                case 13:
                    if ((i15 & i10) != 0) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case 14:
                    if ((i15 & i10) != 0) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case 15:
                    if ((i10 & i15) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        iM8334N7 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N8 = AbstractC2887w5.m8334N1((i21 >> 31) ^ (i21 + i21));
                        iM8344I = iM8334N8 + iM8334N7;
                        i14 += iM8344I;
                    }
                    break;
                case 16:
                    if ((i10 & i15) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iM8334N5 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N6 = AbstractC2887w5.m8335O1((j11 >> 63) ^ (j11 + j11));
                        iM8344I = iM8334N6 + iM8334N5;
                        i14 += iM8344I;
                    }
                    break;
                case 17:
                    if ((i10 & i15) != 0) {
                        iM8344I = AbstractC2887w5.m8331K1(i16, (InterfaceC2730k7) unsafe.getObject(obj, j10), m8114j(i13));
                        i14 += iM8344I;
                    }
                    break;
                case 18:
                    iM8344I = C2889w7.m8337B(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 19:
                    iM8344I = C2889w7.m8380z(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 20:
                    iM8344I = C2889w7.m8342G(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 21:
                    iM8344I = C2889w7.m8353R(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 22:
                    iM8344I = C2889w7.m8340E(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 23:
                    iM8344I = C2889w7.m8337B(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 24:
                    iM8344I = C2889w7.m8380z(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 25:
                    iM8344I = C2889w7.m8376v(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 26:
                    iM8344I = C2889w7.m8350O(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 27:
                    iM8344I = C2889w7.m8345J(i16, (List) unsafe.getObject(obj, j10), m8114j(i13));
                    i14 += iM8344I;
                    break;
                case 28:
                    iM8344I = C2889w7.m8377w(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 29:
                    iM8344I = C2889w7.m8351P(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 30:
                    iM8344I = C2889w7.m8378x(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 31:
                    iM8344I = C2889w7.m8380z(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 32:
                    iM8344I = C2889w7.m8337B(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 33:
                    iM8344I = C2889w7.m8346K(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 34:
                    iM8344I = C2889w7.m8348M(i16, (List) unsafe.getObject(obj, j10));
                    i14 += iM8344I;
                    break;
                case 35:
                    iM8338C = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 36:
                    iM8338C = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 37:
                    iM8338C = C2889w7.m8343H((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 38:
                    iM8338C = C2889w7.m8354S((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 39:
                    iM8338C = C2889w7.m8341F((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 40:
                    iM8338C = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 41:
                    iM8338C = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = C2889w7.f14495a;
                    iM8338C = list.size();
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 43:
                    iM8338C = C2889w7.m8352Q((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 44:
                    iM8338C = C2889w7.m8379y((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 45:
                    iM8338C = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 46:
                    iM8338C = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 47:
                    iM8338C = C2889w7.m8347L((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 48:
                    iM8338C = C2889w7.m8349N((List) unsafe.getObject(obj, j10));
                    if (iM8338C > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8338C);
                        iM8334N10 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N11 = iM8334N10 + iM8334N9;
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 49:
                    iM8344I = C2889w7.m8339D(i16, (List) unsafe.getObject(obj, j10), m8114j(i13));
                    i14 += iM8344I;
                    break;
                case 50:
                    C2674g7.m7849a(unsafe.getObject(obj, j10), m8115k(i13));
                    break;
                case 51:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case 52:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case 53:
                    if (m8126y(i16, i13, obj)) {
                        iM8338C = AbstractC2887w5.m8335O1(m8093K(j10, obj));
                        iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 54:
                    if (m8126y(i16, i13, obj)) {
                        iM8338C = AbstractC2887w5.m8335O1(m8093K(j10, obj));
                        iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 55:
                    if (m8126y(i16, i13, obj)) {
                        iM8338C = AbstractC2887w5.m8332L1(m8092E(j10, obj));
                        iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 56:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case 57:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case 58:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N4 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N4 + 1;
                        i14 += iM8344I;
                    }
                    break;
                case 59:
                    if (m8126y(i16, i13, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (!(object2 instanceof zzka)) {
                            iM8338C = AbstractC2887w5.m8333M1((String) object2);
                            iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                            i14 = iM8334N11 + iM8338C + i14;
                        } else {
                            Logger logger3 = AbstractC2887w5.f14492Q;
                            int iMo8492q3 = ((zzka) object2).mo8492q();
                            iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q3) + iMo8492q3;
                            iM8334N6 = AbstractC2887w5.m8334N1(i16 << 3);
                            iM8344I = iM8334N6 + iM8334N5;
                            i14 += iM8344I;
                        }
                    }
                    break;
                case 60:
                    if (m8126y(i16, i13, obj)) {
                        iM8344I = C2889w7.m8344I(i16, m8114j(i13), unsafe.getObject(obj, j10));
                        i14 += iM8344I;
                    }
                    break;
                case 61:
                    if (m8126y(i16, i13, obj)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j10);
                        Logger logger4 = AbstractC2887w5.f14492Q;
                        int iMo8492q4 = zzkaVar2.mo8492q();
                        iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q4) + iMo8492q4;
                        iM8334N6 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N6 + iM8334N5;
                        i14 += iM8344I;
                    }
                    break;
                case 62:
                    if (m8126y(i16, i13, obj)) {
                        iM8338C = AbstractC2887w5.m8334N1(m8092E(j10, obj));
                        iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 63:
                    if (m8126y(i16, i13, obj)) {
                        iM8338C = AbstractC2887w5.m8332L1(m8092E(j10, obj));
                        iM8334N11 = AbstractC2887w5.m8334N1(i16 << 3);
                        i14 = iM8334N11 + iM8338C + i14;
                    }
                    break;
                case 64:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N2 + 4;
                        i14 += iM8344I;
                    }
                    break;
                case 65:
                    if (m8126y(i16, i13, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8344I = iM8334N1 + 8;
                        i14 += iM8344I;
                    }
                    break;
                case 66:
                    if (m8126y(i16, i13, obj)) {
                        int iM8092E = m8092E(j10, obj);
                        iM8334N7 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N8 = AbstractC2887w5.m8334N1((iM8092E >> 31) ^ (iM8092E + iM8092E));
                        iM8344I = iM8334N8 + iM8334N7;
                        i14 += iM8344I;
                    }
                    break;
                case 67:
                    if (m8126y(i16, i13, obj)) {
                        long jM8093K = m8093K(j10, obj);
                        iM8334N5 = AbstractC2887w5.m8334N1(i16 << 3);
                        iM8334N6 = AbstractC2887w5.m8335O1((jM8093K >> 63) ^ (jM8093K + jM8093K));
                        iM8344I = iM8334N6 + iM8334N5;
                        i14 += iM8344I;
                    }
                    break;
                case 68:
                    if (m8126y(i16, i13, obj)) {
                        iM8344I = AbstractC2887w5.m8331K1(i16, (InterfaceC2730k7) unsafe.getObject(obj, j10), m8114j(i13));
                        i14 += iM8344I;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8100F(Object obj, int i10, long j10) throws IOException {
        Object objM8115k = m8115k(i10);
        Unsafe unsafe = f14336o;
        Object object = unsafe.getObject(obj, j10);
        if (!((zzmc) object).m8507e()) {
            zzmc zzmcVarM8505c = zzmc.m8504b().m8505c();
            C2674g7.m7850b(zzmcVarM8505c, object);
            unsafe.putObject(obj, j10, zzmcVarM8505c);
        }
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final int m8101G(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2796p5 c2796p5) throws IOException {
        long j11 = this.f14337a[i17 + 2] & 1048575;
        Unsafe unsafe = f14336o;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(C2809q5.m8212o(bArr, i10))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(C2809q5.m8199b(bArr, i10))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM8209l = C2809q5.m8209l(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, Long.valueOf(c2796p5.f14388b));
                unsafe.putInt(obj, j11, i13);
                return iM8209l;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iM8206i = C2809q5.m8206i(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, Integer.valueOf(c2796p5.f14387a));
                unsafe.putInt(obj, j11, i13);
                return iM8206i;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(C2809q5.m8212o(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(C2809q5.m8199b(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM8209l2 = C2809q5.m8209l(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, Boolean.valueOf(c2796p5.f14388b != 0));
                unsafe.putInt(obj, j11, i13);
                return iM8209l2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iM8206i2 = C2809q5.m8206i(bArr, i10, c2796p5);
                int i22 = c2796p5.f14387a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !C2851t8.m8264d(bArr, iM8206i2, iM8206i2 + i22)) {
                        throw zzll.m8500a();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iM8206i2, i22, C2849t6.f14439a));
                    iM8206i2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iM8206i2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objM8117m = m8117m(i13, i17, obj);
                int iM8211n = C2809q5.m8211n(objM8117m, m8114j(i17), bArr, i10, i11, c2796p5);
                m8123u(i13, i17, obj, objM8117m);
                return iM8211n;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iM8198a = C2809q5.m8198a(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, c2796p5.f14389c);
                unsafe.putInt(obj, j11, i13);
                return iM8198a;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iM8206i3 = C2809q5.m8206i(bArr, i10, c2796p5);
                int i23 = c2796p5.f14387a;
                int i24 = i17 / 3;
                InterfaceC2797p6 interfaceC2797p6 = (InterfaceC2797p6) this.f14338b[i24 + i24 + 1];
                if (interfaceC2797p6 == null || interfaceC2797p6.mo7746a(i23)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i23));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    m8090B(obj).m7873c(i12, Long.valueOf(i23));
                }
                return iM8206i3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iM8206i4 = C2809q5.m8206i(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, Integer.valueOf(C2861u5.m8289a(c2796p5.f14387a)));
                unsafe.putInt(obj, j11, i13);
                return iM8206i4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM8209l3 = C2809q5.m8209l(bArr, i10, c2796p5);
                unsafe.putObject(obj, j10, Long.valueOf(C2861u5.m8290b(c2796p5.f14388b)));
                unsafe.putInt(obj, j11, i13);
                return iM8209l3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objM8117m2 = m8117m(i13, i17, obj);
                int iM8210m = C2809q5.m8210m(objM8117m2, m8114j(i17), bArr, i10, i11, (i12 & (-8)) | 4, c2796p5);
                m8123u(i13, i17, obj, objM8117m2);
                return iM8210m;
            default:
                return i10;
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m8102H(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2796p5 c2796p5) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int iM8208k;
        int i21 = i10;
        Unsafe unsafe = f14336o;
        InterfaceC2836s6 interfaceC2836s6Mo7645r = (InterfaceC2836s6) unsafe.getObject(obj, j11);
        if (!interfaceC2836s6Mo7645r.mo8078d()) {
            int size = interfaceC2836s6Mo7645r.size();
            interfaceC2836s6Mo7645r = interfaceC2836s6Mo7645r.mo7645r(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, interfaceC2836s6Mo7645r);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    C2913y5 c2913y5 = (C2913y5) interfaceC2836s6Mo7645r;
                    int iM8206i = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i22 = c2796p5.f14387a + iM8206i;
                    while (iM8206i < i22) {
                        c2913y5.m8438f(Double.longBitsToDouble(C2809q5.m8212o(bArr, iM8206i)));
                        iM8206i += 8;
                    }
                    if (iM8206i == i22) {
                        return iM8206i;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 1) {
                    C2913y5 c2913y6 = (C2913y5) interfaceC2836s6Mo7645r;
                    c2913y6.m8438f(Double.longBitsToDouble(C2809q5.m8212o(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            int iM8206i2 = C2809q5.m8206i(bArr, i17, c2796p5);
                            if (i12 == c2796p5.f14387a) {
                                c2913y6.m8438f(Double.longBitsToDouble(C2809q5.m8212o(bArr, iM8206i2)));
                                i21 = iM8206i2;
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    C2673g6 c2673g6 = (C2673g6) interfaceC2836s6Mo7645r;
                    int iM8206i3 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i23 = c2796p5.f14387a + iM8206i3;
                    while (iM8206i3 < i23) {
                        c2673g6.m7847f(Float.intBitsToFloat(C2809q5.m8199b(bArr, iM8206i3)));
                        iM8206i3 += 4;
                    }
                    if (iM8206i3 == i23) {
                        return iM8206i3;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 5) {
                    C2673g6 c2673g7 = (C2673g6) interfaceC2836s6Mo7645r;
                    c2673g7.m7847f(Float.intBitsToFloat(C2809q5.m8199b(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            int iM8206i4 = C2809q5.m8206i(bArr, i18, c2796p5);
                            if (i12 == c2796p5.f14387a) {
                                c2673g7.m7847f(Float.intBitsToFloat(C2809q5.m8199b(bArr, iM8206i4)));
                                i21 = iM8206i4;
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    C2590a7 c2590a7 = (C2590a7) interfaceC2836s6Mo7645r;
                    int iM8206i5 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i24 = c2796p5.f14387a + iM8206i5;
                    while (iM8206i5 < i24) {
                        iM8206i5 = C2809q5.m8209l(bArr, iM8206i5, c2796p5);
                        c2590a7.m7643f(c2796p5.f14388b);
                    }
                    if (iM8206i5 == i24) {
                        return iM8206i5;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 0) {
                    C2590a7 c2590a8 = (C2590a7) interfaceC2836s6Mo7645r;
                    int iM8209l = C2809q5.m8209l(bArr, i21, c2796p5);
                    c2590a8.m7643f(c2796p5.f14388b);
                    while (iM8209l < i11) {
                        int iM8206i6 = C2809q5.m8206i(bArr, iM8209l, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8209l;
                        }
                        iM8209l = C2809q5.m8209l(bArr, iM8206i6, c2796p5);
                        c2590a8.m7643f(c2796p5.f14388b);
                    }
                    return iM8209l;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C2809q5.m8202e(bArr, i21, interfaceC2836s6Mo7645r, c2796p5);
                }
                if (i14 == 0) {
                    return C2809q5.m8208k(i12, bArr, i10, i11, interfaceC2836s6Mo7645r, c2796p5);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    C2590a7 c2590a9 = (C2590a7) interfaceC2836s6Mo7645r;
                    int iM8206i7 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i25 = c2796p5.f14387a + iM8206i7;
                    while (iM8206i7 < i25) {
                        c2590a9.m7643f(C2809q5.m8212o(bArr, iM8206i7));
                        iM8206i7 += 8;
                    }
                    if (iM8206i7 == i25) {
                        return iM8206i7;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 1) {
                    C2590a7 c2590a10 = (C2590a7) interfaceC2836s6Mo7645r;
                    c2590a10.m7643f(C2809q5.m8212o(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            int iM8206i8 = C2809q5.m8206i(bArr, i19, c2796p5);
                            if (i12 == c2796p5.f14387a) {
                                c2590a10.m7643f(C2809q5.m8212o(bArr, iM8206i8));
                                i21 = iM8206i8;
                            }
                        }
                    }
                    return i19;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    C2784o6 c2784o6 = (C2784o6) interfaceC2836s6Mo7645r;
                    int iM8206i9 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i26 = c2796p5.f14387a + iM8206i9;
                    while (iM8206i9 < i26) {
                        c2784o6.m8147f(C2809q5.m8199b(bArr, iM8206i9));
                        iM8206i9 += 4;
                    }
                    if (iM8206i9 == i26) {
                        return iM8206i9;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 5) {
                    C2784o6 c2784o7 = (C2784o6) interfaceC2836s6Mo7645r;
                    c2784o7.m8147f(C2809q5.m8199b(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            int iM8206i10 = C2809q5.m8206i(bArr, i20, c2796p5);
                            if (i12 == c2796p5.f14387a) {
                                c2784o7.m8147f(C2809q5.m8199b(bArr, iM8206i10));
                                i21 = iM8206i10;
                            }
                        }
                    }
                    return i20;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    C2822r5 c2822r5 = (C2822r5) interfaceC2836s6Mo7645r;
                    int iM8206i11 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i27 = c2796p5.f14387a + iM8206i11;
                    while (iM8206i11 < i27) {
                        iM8206i11 = C2809q5.m8209l(bArr, iM8206i11, c2796p5);
                        c2822r5.m8238f(c2796p5.f14388b != 0);
                    }
                    if (iM8206i11 == i27) {
                        return iM8206i11;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 0) {
                    C2822r5 c2822r6 = (C2822r5) interfaceC2836s6Mo7645r;
                    int iM8209l2 = C2809q5.m8209l(bArr, i21, c2796p5);
                    c2822r6.m8238f(c2796p5.f14388b != 0);
                    while (iM8209l2 < i11) {
                        int iM8206i12 = C2809q5.m8206i(bArr, iM8209l2, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8209l2;
                        }
                        iM8209l2 = C2809q5.m8209l(bArr, iM8206i12, c2796p5);
                        c2822r6.m8238f(c2796p5.f14388b != 0);
                    }
                    return iM8209l2;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iM8206i13 = C2809q5.m8206i(bArr, i21, c2796p5);
                        int i28 = c2796p5.f14387a;
                        if (i28 < 0) {
                            throw zzll.m8501b();
                        }
                        if (i28 == 0) {
                            interfaceC2836s6Mo7645r.add("");
                        } else {
                            interfaceC2836s6Mo7645r.add(new String(bArr, iM8206i13, i28, C2849t6.f14439a));
                            iM8206i13 += i28;
                        }
                        while (iM8206i13 < i11) {
                            int iM8206i14 = C2809q5.m8206i(bArr, iM8206i13, c2796p5);
                            if (i12 != c2796p5.f14387a) {
                                return iM8206i13;
                            }
                            iM8206i13 = C2809q5.m8206i(bArr, iM8206i14, c2796p5);
                            int i29 = c2796p5.f14387a;
                            if (i29 < 0) {
                                throw zzll.m8501b();
                            }
                            if (i29 == 0) {
                                interfaceC2836s6Mo7645r.add("");
                            } else {
                                interfaceC2836s6Mo7645r.add(new String(bArr, iM8206i13, i29, C2849t6.f14439a));
                                iM8206i13 += i29;
                            }
                        }
                        return iM8206i13;
                    }
                    int iM8206i15 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i30 = c2796p5.f14387a;
                    if (i30 < 0) {
                        throw zzll.m8501b();
                    }
                    if (i30 == 0) {
                        interfaceC2836s6Mo7645r.add("");
                    } else {
                        int i31 = iM8206i15 + i30;
                        if (!C2851t8.m8264d(bArr, iM8206i15, i31)) {
                            throw zzll.m8500a();
                        }
                        interfaceC2836s6Mo7645r.add(new String(bArr, iM8206i15, i30, C2849t6.f14439a));
                        iM8206i15 = i31;
                    }
                    while (iM8206i15 < i11) {
                        int iM8206i16 = C2809q5.m8206i(bArr, iM8206i15, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8206i15;
                        }
                        iM8206i15 = C2809q5.m8206i(bArr, iM8206i16, c2796p5);
                        int i32 = c2796p5.f14387a;
                        if (i32 < 0) {
                            throw zzll.m8501b();
                        }
                        if (i32 == 0) {
                            interfaceC2836s6Mo7645r.add("");
                        } else {
                            int i33 = iM8206i15 + i32;
                            if (!C2851t8.m8264d(bArr, iM8206i15, i33)) {
                                throw zzll.m8500a();
                            }
                            interfaceC2836s6Mo7645r.add(new String(bArr, iM8206i15, i32, C2849t6.f14439a));
                            iM8206i15 = i33;
                        }
                    }
                    return iM8206i15;
                }
                break;
            case 27:
                if (i14 == 2) {
                    return C2809q5.m8201d(m8114j(i15), i12, bArr, i10, i11, interfaceC2836s6Mo7645r, c2796p5);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int iM8206i17 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i34 = c2796p5.f14387a;
                    if (i34 < 0) {
                        throw zzll.m8501b();
                    }
                    if (i34 > bArr.length - iM8206i17) {
                        throw zzll.m8503d();
                    }
                    if (i34 == 0) {
                        interfaceC2836s6Mo7645r.add(zzka.f14563b);
                    } else {
                        interfaceC2836s6Mo7645r.add(zzka.m8499Q(bArr, iM8206i17, i34));
                        iM8206i17 += i34;
                    }
                    while (iM8206i17 < i11) {
                        int iM8206i18 = C2809q5.m8206i(bArr, iM8206i17, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8206i17;
                        }
                        iM8206i17 = C2809q5.m8206i(bArr, iM8206i18, c2796p5);
                        int i35 = c2796p5.f14387a;
                        if (i35 < 0) {
                            throw zzll.m8501b();
                        }
                        if (i35 > bArr.length - iM8206i17) {
                            throw zzll.m8503d();
                        }
                        if (i35 == 0) {
                            interfaceC2836s6Mo7645r.add(zzka.f14563b);
                        } else {
                            interfaceC2836s6Mo7645r.add(zzka.m8499Q(bArr, iM8206i17, i35));
                            iM8206i17 += i35;
                        }
                    }
                    return iM8206i17;
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    iM8208k = C2809q5.m8202e(bArr, i21, interfaceC2836s6Mo7645r, c2796p5);
                } else if (i14 == 0) {
                    iM8208k = C2809q5.m8208k(i12, bArr, i10, i11, interfaceC2836s6Mo7645r, c2796p5);
                }
                int i36 = i15 / 3;
                InterfaceC2797p6 interfaceC2797p6 = (InterfaceC2797p6) this.f14338b[i36 + i36 + 1];
                Class cls = C2889w7.f14495a;
                if (interfaceC2797p6 != null) {
                    boolean z10 = interfaceC2836s6Mo7645r instanceof RandomAccess;
                    Object objM8355a = null;
                    AbstractC2675g8 abstractC2675g8 = this.f14348l;
                    if (z10) {
                        int size2 = interfaceC2836s6Mo7645r.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size2; i38++) {
                            int iIntValue = ((Integer) interfaceC2836s6Mo7645r.get(i38)).intValue();
                            if (interfaceC2797p6.mo7746a(iIntValue)) {
                                if (i38 != i37) {
                                    interfaceC2836s6Mo7645r.set(i37, Integer.valueOf(iIntValue));
                                }
                                i37++;
                            } else {
                                objM8355a = C2889w7.m8355a(obj, i13, iIntValue, objM8355a, abstractC2675g8);
                            }
                        }
                        if (i37 != size2) {
                            interfaceC2836s6Mo7645r.subList(i37, size2).clear();
                            return iM8208k;
                        }
                    } else {
                        Iterator it = interfaceC2836s6Mo7645r.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!interfaceC2797p6.mo7746a(iIntValue2)) {
                                objM8355a = C2889w7.m8355a(obj, i13, iIntValue2, objM8355a, abstractC2675g8);
                                it.remove();
                            }
                        }
                    }
                }
                return iM8208k;
            case 33:
            case 47:
                if (i14 == 2) {
                    C2784o6 c2784o8 = (C2784o6) interfaceC2836s6Mo7645r;
                    int iM8206i19 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i39 = c2796p5.f14387a + iM8206i19;
                    while (iM8206i19 < i39) {
                        iM8206i19 = C2809q5.m8206i(bArr, iM8206i19, c2796p5);
                        c2784o8.m8147f(C2861u5.m8289a(c2796p5.f14387a));
                    }
                    if (iM8206i19 == i39) {
                        return iM8206i19;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 0) {
                    C2784o6 c2784o9 = (C2784o6) interfaceC2836s6Mo7645r;
                    int iM8206i20 = C2809q5.m8206i(bArr, i21, c2796p5);
                    c2784o9.m8147f(C2861u5.m8289a(c2796p5.f14387a));
                    while (iM8206i20 < i11) {
                        int iM8206i21 = C2809q5.m8206i(bArr, iM8206i20, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8206i20;
                        }
                        iM8206i20 = C2809q5.m8206i(bArr, iM8206i21, c2796p5);
                        c2784o9.m8147f(C2861u5.m8289a(c2796p5.f14387a));
                    }
                    return iM8206i20;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    C2590a7 c2590a11 = (C2590a7) interfaceC2836s6Mo7645r;
                    int iM8206i22 = C2809q5.m8206i(bArr, i21, c2796p5);
                    int i40 = c2796p5.f14387a + iM8206i22;
                    while (iM8206i22 < i40) {
                        iM8206i22 = C2809q5.m8209l(bArr, iM8206i22, c2796p5);
                        c2590a11.m7643f(C2861u5.m8290b(c2796p5.f14388b));
                    }
                    if (iM8206i22 == i40) {
                        return iM8206i22;
                    }
                    throw zzll.m8503d();
                }
                if (i14 == 0) {
                    C2590a7 c2590a12 = (C2590a7) interfaceC2836s6Mo7645r;
                    int iM8209l3 = C2809q5.m8209l(bArr, i21, c2796p5);
                    c2590a12.m7643f(C2861u5.m8290b(c2796p5.f14388b));
                    while (iM8209l3 < i11) {
                        int iM8206i23 = C2809q5.m8206i(bArr, iM8209l3, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8209l3;
                        }
                        iM8209l3 = C2809q5.m8209l(bArr, iM8206i23, c2796p5);
                        c2590a12.m7643f(C2861u5.m8290b(c2796p5.f14388b));
                    }
                    return iM8209l3;
                }
                break;
            default:
                if (i14 == 3) {
                    InterfaceC2876v7 interfaceC2876v7M8114j = m8114j(i15);
                    int i41 = (i12 & (-8)) | 4;
                    int iM8200c = C2809q5.m8200c(interfaceC2876v7M8114j, bArr, i10, i11, i41, c2796p5);
                    interfaceC2836s6Mo7645r.add(c2796p5.f14389c);
                    while (iM8200c < i11) {
                        int iM8206i24 = C2809q5.m8206i(bArr, iM8200c, c2796p5);
                        if (i12 != c2796p5.f14387a) {
                            return iM8200c;
                        }
                        iM8200c = C2809q5.m8200c(interfaceC2876v7M8114j, bArr, iM8206i24, i11, i41, c2796p5);
                        interfaceC2836s6Mo7645r.add(c2796p5.f14389c);
                    }
                    return iM8200c;
                }
                break;
        }
        return i21;
    }

    /* JADX INFO: renamed from: I */
    public final int m8103I(int i10, int i11) {
        int[] iArr = this.f14337a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: J */
    public final int m8104J(int i10) {
        return this.f14337a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Switch 'out' block B:29:0x0090 for B:16:0x0044 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: a */
    public final void mo8105a(Object obj) {
        if (m8096x(obj)) {
            if (obj instanceof AbstractC2771n6) {
                AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) obj;
                abstractC2771n6.m8088q();
                abstractC2771n6.zzb = 0;
                abstractC2771n6.m8087o();
            }
            int[] iArr = this.f14337a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iM8104J = m8104J(i10);
                int i11 = 1048575 & iM8104J;
                int i12 = (iM8104J >>> 20) & 255;
                long j10 = i11;
                Unsafe unsafe = f14336o;
                if (i12 != 9) {
                    if (i12 != 60 && i12 != 68) {
                        switch (i12) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f14347k.mo8429a(j10, obj);
                                continue;
                            case 50:
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzmc) object).m8506d();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (m8126y(iArr[i10], i10, obj)) {
                        m8114j(i10).mo8105a(unsafe.getObject(obj, j10));
                    }
                }
                if (m8125w(i10, obj)) {
                    m8114j(i10).mo8105a(unsafe.getObject(obj, j10));
                }
            }
            this.f14348l.mo7857g(obj);
            if (this.f14342f) {
                this.f14349m.mo7698b(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: b */
    public final AbstractC2771n6 mo8106b() {
        return (AbstractC2771n6) ((AbstractC2771n6) this.f14341e).mo7659s(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: c */
    public final void mo8107c(Object obj, C2900x5 c2900x5) throws IOException {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.f14343g;
        AbstractC2675g8 abstractC2675g8 = this.f14348l;
        AbstractC2603b6 abstractC2603b6 = this.f14349m;
        boolean z14 = this.f14342f;
        int[] iArr = this.f14337a;
        int i12 = 1048575;
        if (z13) {
            if (z14) {
                abstractC2603b6.mo7697a(obj);
                throw null;
            }
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iM8104J = m8104J(i13);
                int i14 = iArr[i13];
                switch ((iM8104J >>> 20) & 255) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8418g(C2812q8.m8217e(iM8104J & 1048575, obj), i14);
                        }
                        break;
                    case 1:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8422k(i14, C2812q8.m8218f(iM8104J & 1048575, obj));
                        }
                        break;
                    case 2:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8425n(i14, C2812q8.m8220h(iM8104J & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8415d(i14, C2812q8.m8220h(iM8104J & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8424m(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8421j(i14, C2812q8.m8220h(iM8104J & 1048575, obj));
                        }
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8420i(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8416e(i14, C2812q8.m8234v(iM8104J & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (m8125w(i13, obj)) {
                            m8097z(i14, C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5);
                        }
                        break;
                    case 9:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8426o(i14, m8114j(i13), C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                    case 10:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8417f(i14, (zzka) C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8414c(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8419h(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8427p(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8428q(i14, C2812q8.m8220h(iM8104J & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8412a(i14, C2812q8.m8219g(iM8104J & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8413b(i14, C2812q8.m8220h(iM8104J & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (m8125w(i13, obj)) {
                            c2900x5.m8423l(i14, m8114j(i13), C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                    case 18:
                        C2889w7.m8358d(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 19:
                        C2889w7.m8362h(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 20:
                        C2889w7.m8365k(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 21:
                        C2889w7.m8373s(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 22:
                        C2889w7.m8364j(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 23:
                        C2889w7.m8361g(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 24:
                        C2889w7.m8360f(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 25:
                        C2889w7.m8356b(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 26:
                        C2889w7.m8371q(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5);
                        break;
                    case 27:
                        C2889w7.m8366l(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, m8114j(i13));
                        break;
                    case 28:
                        C2889w7.m8357c(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5);
                        break;
                    case 29:
                        C2889w7.m8372r(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 30:
                        C2889w7.m8359e(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 31:
                        C2889w7.m8367m(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 32:
                        C2889w7.m8368n(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 33:
                        C2889w7.m8369o(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 34:
                        C2889w7.m8370p(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, false);
                        break;
                    case 35:
                        C2889w7.m8358d(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 36:
                        C2889w7.m8362h(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 37:
                        C2889w7.m8365k(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 38:
                        C2889w7.m8373s(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 39:
                        C2889w7.m8364j(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 40:
                        C2889w7.m8361g(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 41:
                        C2889w7.m8360f(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 42:
                        C2889w7.m8356b(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 43:
                        C2889w7.m8372r(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 44:
                        C2889w7.m8359e(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 45:
                        C2889w7.m8367m(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 46:
                        C2889w7.m8368n(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 47:
                        C2889w7.m8369o(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 48:
                        C2889w7.m8370p(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, true);
                        break;
                    case 49:
                        C2889w7.m8363i(i14, (List) C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5, m8114j(i13));
                        break;
                    case 50:
                        if (C2812q8.m8222j(iM8104J & 1048575, obj) != null) {
                            throw null;
                        }
                        break;
                        break;
                    case 51:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8418g(((Double) C2812q8.m8222j(iM8104J & 1048575, obj)).doubleValue(), i14);
                        }
                        break;
                    case 52:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8422k(i14, ((Float) C2812q8.m8222j(iM8104J & 1048575, obj)).floatValue());
                        }
                        break;
                    case 53:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8425n(i14, m8093K(iM8104J & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8415d(i14, m8093K(iM8104J & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8424m(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8421j(i14, m8093K(iM8104J & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8420i(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8416e(i14, ((Boolean) C2812q8.m8222j(iM8104J & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (m8126y(i14, i13, obj)) {
                            m8097z(i14, C2812q8.m8222j(iM8104J & 1048575, obj), c2900x5);
                        }
                        break;
                    case 60:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8426o(i14, m8114j(i13), C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                    case 61:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8417f(i14, (zzka) C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                    case 62:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8414c(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8419h(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8427p(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8428q(i14, m8093K(iM8104J & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8412a(i14, m8092E(iM8104J & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8413b(i14, m8093K(iM8104J & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (m8126y(i14, i13, obj)) {
                            c2900x5.m8423l(i14, m8114j(i13), C2812q8.m8222j(iM8104J & 1048575, obj));
                        }
                        break;
                }
            }
            abstractC2675g8.mo7859i(abstractC2675g8.mo7854d(obj), c2900x5);
            return;
        }
        if (z14) {
            abstractC2603b6.mo7697a(obj);
            throw null;
        }
        int length2 = iArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i15 < length2) {
            int iM8104J2 = m8104J(i15);
            int i18 = iArr[i15];
            int i19 = (iM8104J2 >>> 20) & 255;
            Unsafe unsafe = f14336o;
            if (i19 <= 17) {
                int i20 = iArr[i15 + 2];
                int i21 = i20 & i12;
                if (i21 != i17) {
                    i16 = unsafe.getInt(obj, i21);
                    i17 = i21;
                }
                i11 = 1 << (i20 >>> 20);
                i10 = 1048575;
            } else {
                i10 = i12;
                i11 = 0;
            }
            int i22 = iM8104J2 & i10;
            int[] iArr2 = iArr;
            long j10 = i22;
            switch (i19) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8418g(C2812q8.m8217e(j10, obj), i18);
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 1:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8422k(i18, C2812q8.m8218f(j10, obj));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 2:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8425n(i18, unsafe.getLong(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 3:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8415d(i18, unsafe.getLong(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 4:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8424m(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 5:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8421j(i18, unsafe.getLong(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8420i(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8416e(i18, C2812q8.m8234v(j10, obj));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 8:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        m8097z(i18, unsafe.getObject(obj, j10), c2900x5);
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 9:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8426o(i18, m8114j(i15), unsafe.getObject(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 10:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8417f(i18, (zzka) unsafe.getObject(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 11:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8414c(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 12:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8419h(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 13:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8427p(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 14:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8428q(i18, unsafe.getLong(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 15:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8412a(i18, unsafe.getInt(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 16:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8413b(i18, unsafe.getLong(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 17:
                    z10 = true;
                    z11 = false;
                    if ((i11 & i16) != 0) {
                        c2900x5.m8423l(i18, m8114j(i15), unsafe.getObject(obj, j10));
                    }
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 18:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8358d(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 19:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8362h(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 20:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8365k(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 21:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8373s(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 22:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8364j(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 23:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8361g(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 24:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8360f(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 25:
                    z10 = true;
                    z11 = false;
                    C2889w7.m8356b(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 26:
                    z10 = true;
                    C2889w7.m8371q(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 27:
                    z10 = true;
                    C2889w7.m8366l(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, m8114j(i15));
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 28:
                    z10 = true;
                    C2889w7.m8357c(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 29:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8372r(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 30:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8359e(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 31:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8367m(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 32:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8368n(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 33:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8369o(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 34:
                    z10 = true;
                    z12 = false;
                    C2889w7.m8370p(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, false);
                    z11 = z12;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 35:
                    z10 = true;
                    C2889w7.m8358d(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 36:
                    z10 = true;
                    C2889w7.m8362h(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 37:
                    z10 = true;
                    C2889w7.m8365k(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 38:
                    z10 = true;
                    C2889w7.m8373s(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 39:
                    z10 = true;
                    C2889w7.m8364j(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 40:
                    z10 = true;
                    C2889w7.m8361g(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 41:
                    z10 = true;
                    C2889w7.m8360f(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 42:
                    z10 = true;
                    C2889w7.m8356b(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 43:
                    z10 = true;
                    C2889w7.m8372r(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 44:
                    z10 = true;
                    C2889w7.m8359e(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 45:
                    z10 = true;
                    C2889w7.m8367m(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 46:
                    z10 = true;
                    C2889w7.m8368n(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 47:
                    z10 = true;
                    C2889w7.m8369o(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 48:
                    z10 = true;
                    C2889w7.m8370p(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, true);
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 49:
                    C2889w7.m8363i(iArr2[i15], (List) unsafe.getObject(obj, j10), c2900x5, m8114j(i15));
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 51:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8418g(((Double) C2812q8.m8222j(j10, obj)).doubleValue(), i18);
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 52:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8422k(i18, ((Float) C2812q8.m8222j(j10, obj)).floatValue());
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 53:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8425n(i18, m8093K(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 54:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8415d(i18, m8093K(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 55:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8424m(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 56:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8421j(i18, m8093K(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 57:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8420i(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 58:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8416e(i18, ((Boolean) C2812q8.m8222j(j10, obj)).booleanValue());
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 59:
                    if (m8126y(i18, i15, obj)) {
                        m8097z(i18, unsafe.getObject(obj, j10), c2900x5);
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 60:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8426o(i18, m8114j(i15), unsafe.getObject(obj, j10));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 61:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8417f(i18, (zzka) unsafe.getObject(obj, j10));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 62:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8414c(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 63:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8419h(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 64:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8427p(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 65:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8428q(i18, m8093K(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 66:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8412a(i18, m8092E(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 67:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8413b(i18, m8093K(j10, obj));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                case 68:
                    if (m8126y(i18, i15, obj)) {
                        c2900x5.m8423l(i18, m8114j(i15), unsafe.getObject(obj, j10));
                    }
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
                default:
                    z10 = true;
                    z11 = false;
                    i15 += 3;
                    iArr = iArr2;
                    i12 = 1048575;
                    break;
            }
        }
        abstractC2675g8.mo7859i(abstractC2675g8.mo7854d(obj), c2900x5);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8 A[LOOP:1: B:53:0x00d5->B:59:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: d */
    public final boolean mo8108d(Object obj) {
        List list;
        InterfaceC2876v7 interfaceC2876v7M8114j;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            boolean zM8125w = true;
            if (i11 >= this.f14345i) {
                if (!this.f14342f) {
                    return true;
                }
                this.f14349m.mo7697a(obj);
                throw null;
            }
            int i14 = this.f14344h[i11];
            int[] iArr = this.f14337a;
            int i15 = iArr[i14];
            int iM8104J = m8104J(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i12 = f14336o.getInt(obj, i17);
                }
                i13 = i17;
            }
            if ((268435456 & iM8104J) != 0) {
                if (!(i13 == 1048575 ? m8125w(i14, obj) : (i12 & i18) != 0)) {
                    return false;
                }
            }
            int i19 = (iM8104J >>> 20) & 255;
            if (i19 == 9 || i19 == 17) {
                if (i13 == 1048575) {
                    zM8125w = m8125w(i14, obj);
                } else if ((i12 & i18) == 0) {
                    zM8125w = false;
                }
                if (zM8125w && !m8114j(i14).mo8108d(C2812q8.m8222j(iM8104J & 1048575, obj))) {
                    return false;
                }
            } else {
                if (i19 == 27) {
                    list = (List) C2812q8.m8222j(iM8104J & 1048575, obj);
                    if (!list.isEmpty()) {
                        interfaceC2876v7M8114j = m8114j(i14);
                        for (i10 = 0; i10 < list.size(); i10++) {
                            if (!interfaceC2876v7M8114j.mo8108d(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                } else if (i19 == 60 || i19 == 68) {
                    if (m8126y(i15, i14, obj) && !m8114j(i14).mo8108d(C2812q8.m8222j(iM8104J & 1048575, obj))) {
                        return false;
                    }
                } else if (i19 == 49) {
                    list = (List) C2812q8.m8222j(iM8104J & 1048575, obj);
                    if (!list.isEmpty()) {
                        interfaceC2876v7M8114j = m8114j(i14);
                        while (i10 < list.size()) {
                            if (!interfaceC2876v7M8114j.mo8108d(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                } else if (i19 == 50 && !((zzmc) C2812q8.m8222j(iM8104J & 1048575, obj)).isEmpty()) {
                    throw null;
                }
                i11++;
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:84:0x0237 A[PHI: r3
      0x0237: PHI (r3v30 int) = (r3v10 int), (r3v31 int) binds: [B:82:0x0234, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: e */
    public final int mo8109e(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iHashCode;
        int[] iArr = this.f14337a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM8104J = m8104J(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iM8104J;
            int i15 = 1231;
            switch ((iM8104J >>> 20) & 255) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C2812q8.m8217e(j10, obj));
                    Charset charset = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C2812q8.m8218f(j10, obj));
                    i12 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2812q8.m8220h(j10, obj);
                    Charset charset2 = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2812q8.m8220h(j10, obj);
                    Charset charset3 = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2812q8.m8220h(j10, obj);
                    Charset charset4 = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i11 = i12 * 53;
                    boolean zM8234v = C2812q8.m8234v(j10, obj);
                    Charset charset5 = C2849t6.f14439a;
                    if (!zM8234v) {
                        i15 = 1237;
                    }
                    iFloatToIntBits = i15;
                    i12 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iFloatToIntBits = ((String) C2812q8.m8222j(j10, obj)).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 9:
                    Object objM8222j = C2812q8.m8222j(j10, obj);
                    if (objM8222j != null) {
                        iHashCode = objM8222j.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i10 = i12 * 53;
                    i12 = i10 + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2812q8.m8220h(j10, obj);
                    Charset charset6 = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8219g(j10, obj);
                    i12 = iFloatToIntBits + i11;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C2812q8.m8220h(j10, obj);
                    Charset charset7 = C2849t6.f14439a;
                    iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iHashCode;
                    break;
                case 17:
                    Object objM8222j2 = C2812q8.m8222j(j10, obj);
                    if (objM8222j2 != null) {
                        iHashCode = objM8222j2.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i10 = i12 * 53;
                    i12 = i10 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) C2812q8.m8222j(j10, obj)).doubleValue());
                        Charset charset8 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 52:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) C2812q8.m8222j(j10, obj)).floatValue());
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = m8093K(j10, obj);
                        Charset charset9 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 54:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = m8093K(j10, obj);
                        Charset charset10 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 55:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 56:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = m8093K(j10, obj);
                        Charset charset11 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 57:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 58:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) C2812q8.m8222j(j10, obj)).booleanValue();
                        Charset charset12 = C2849t6.f14439a;
                        if (!zBooleanValue) {
                            i15 = 1237;
                        }
                        iFloatToIntBits = i15;
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 59:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = ((String) C2812q8.m8222j(j10, obj)).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 63:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = m8093K(j10, obj);
                        Charset charset13 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 66:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = m8092E(j10, obj);
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (m8126y(i14, i13, obj)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = m8093K(j10, obj);
                        Charset charset14 = C2849t6.f14439a;
                        iHashCode = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iHashCode;
                    }
                    break;
                case 68:
                    if (m8126y(i14, i13, obj)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = C2812q8.m8222j(j10, obj).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f14348l.mo7854d(obj).hashCode() + (i12 * 53);
        if (!this.f14342f) {
            return iHashCode2;
        }
        this.f14349m.mo7697a(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x00a7. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: f */
    public final void mo8110f(Object obj, byte[] bArr, int i10, int i11, C2796p5 c2796p5) throws IOException {
        int i12;
        int iM8207j;
        int iM8103I;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        Object obj2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iM8198a;
        C2772n7<T> c2772n7 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i11 = i11;
        C2796p5 c2796p6 = c2796p5;
        if (!c2772n7.f14343g) {
            m8098A(obj, bArr, i10, i11, 0, c2796p5);
            return;
        }
        m8095o(obj);
        Unsafe unsafe2 = f14336o;
        int i29 = 0;
        int i30 = -1;
        int iM8205h = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        while (iM8205h < i11) {
            int i35 = iM8205h + 1;
            byte b10 = bArr2[iM8205h];
            if (b10 < 0) {
                iM8207j = C2809q5.m8207j(b10, bArr2, i35, c2796p6);
                i12 = c2796p6.f14387a;
            } else {
                i12 = b10;
                iM8207j = i35;
            }
            int i36 = i12 >>> 3;
            int i37 = c2772n7.f14340d;
            int i38 = c2772n7.f14339c;
            if (i36 > i31) {
                int i39 = i32 / 3;
                if (i36 < i38 || i36 > i37) {
                    iM8103I = i30;
                } else {
                    iM8103I = c2772n7.m8103I(i36, i39);
                }
            } else if (i36 < i38 || i36 > i37) {
                iM8103I = i30;
            } else {
                iM8103I = c2772n7.m8103I(i36, i29);
            }
            int i40 = iM8103I;
            if (i40 == i30) {
                i13 = i36;
                i14 = iM8207j;
                i15 = i34;
                i16 = i30;
                unsafe = unsafe2;
                i17 = i29;
                obj2 = obj3;
            } else {
                int i41 = i12 & 7;
                int[] iArr = c2772n7.f14337a;
                int i42 = iArr[i40 + 1];
                int i43 = (i42 >>> 20) & 255;
                i13 = i36;
                int i44 = iM8207j;
                long j10 = i42 & 1048575;
                if (i43 <= 17) {
                    int i45 = iArr[i40 + 2];
                    int i46 = 1 << (i45 >>> 20);
                    int i47 = i45 & 1048575;
                    if (i47 != i34) {
                        if (i34 != 1048575) {
                            unsafe2.putInt(obj3, i34, i33);
                        }
                        if (i47 != 1048575) {
                            i33 = unsafe2.getInt(obj3, i47);
                        }
                        i23 = i33;
                        i24 = i47;
                    } else {
                        j10 = j10;
                        i23 = i33;
                        i24 = i34;
                    }
                    switch (i43) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            i25 = i44;
                            i26 = i24;
                            long j11 = j10;
                            if (i41 != 1) {
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                C2812q8.m8226n(obj3, j11, Double.longBitsToDouble(C2809q5.m8212o(bArr2, i25)));
                                i27 = i25 + 8;
                                iM8205h = i27;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 1:
                            i25 = i44;
                            i26 = i24;
                            long j12 = j10;
                            if (i41 != 5) {
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                C2812q8.m8227o(obj3, j12, Float.intBitsToFloat(C2809q5.m8199b(bArr2, i25)));
                                i27 = i25 + 4;
                                iM8205h = i27;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i25 = i44;
                            i26 = i24;
                            long j13 = j10;
                            if (i41 != 0) {
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                int iM8209l = C2809q5.m8209l(bArr2, i25, c2796p6);
                                unsafe2.putLong(obj, j13, c2796p6.f14388b);
                                i33 = i23 | i46;
                                i34 = i26;
                                iM8205h = iM8209l;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 4:
                        case 11:
                            i25 = i44;
                            i26 = i24;
                            long j14 = j10;
                            if (i41 != 0) {
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8205h = C2809q5.m8206i(bArr2, i25, c2796p6);
                                unsafe2.putInt(obj3, j14, c2796p6.f14387a);
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i28 = i44;
                            i26 = i24;
                            long j15 = j10;
                            if (i41 != 1) {
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                i25 = i28;
                                unsafe2.putLong(obj, j15, C2809q5.m8212o(bArr2, i28));
                                i27 = i25 + 8;
                                iM8205h = i27;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        case 13:
                            i28 = i44;
                            i26 = i24;
                            long j16 = j10;
                            if (i41 != 5) {
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                unsafe2.putInt(obj3, j16, C2809q5.m8199b(bArr2, i28));
                                i27 = i28 + 4;
                                iM8205h = i27;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            i28 = i44;
                            i26 = i24;
                            long j17 = j10;
                            if (i41 != 0) {
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8205h = C2809q5.m8209l(bArr2, i28, c2796p6);
                                C2812q8.m8225m(obj3, j17, c2796p6.f14388b != 0);
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 8:
                            i28 = i44;
                            i26 = i24;
                            long j18 = j10;
                            if (i41 != 2) {
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8205h = (i42 & 536870912) == 0 ? C2809q5.m8203f(bArr2, i28, c2796p6) : C2809q5.m8204g(bArr2, i28, c2796p6);
                                unsafe2.putObject(obj3, j18, c2796p6.f14389c);
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 9:
                            i28 = i44;
                            if (i41 != 2) {
                                i26 = i24;
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                Object objM8116l = c2772n7.m8116l(i40, obj3);
                                iM8205h = C2809q5.m8211n(objM8116l, c2772n7.m8114j(i40), bArr, i28, i11, c2796p5);
                                c2772n7.m8122t(obj3, i40, objM8116l);
                                i26 = i24;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 10:
                            i28 = i44;
                            long j19 = j10;
                            if (i41 != 2) {
                                i26 = i24;
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8198a = C2809q5.m8198a(bArr2, i28, c2796p6);
                                unsafe2.putObject(obj3, j19, c2796p6.f14389c);
                                iM8205h = iM8198a;
                                i26 = i24;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 12:
                            i28 = i44;
                            long j20 = j10;
                            if (i41 != 0) {
                                i26 = i24;
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8198a = C2809q5.m8206i(bArr2, i28, c2796p6);
                                unsafe2.putInt(obj3, j20, c2796p6.f14387a);
                                iM8205h = iM8198a;
                                i26 = i24;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 15:
                            i28 = i44;
                            if (i41 != 0) {
                                i26 = i24;
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                iM8205h = C2809q5.m8206i(bArr2, i28, c2796p6);
                                unsafe2.putInt(obj3, j10, C2861u5.m8289a(c2796p6.f14387a));
                                i26 = i24;
                                i33 = i23 | i46;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        case 16:
                            if (i41 != 0) {
                                i28 = i44;
                                i26 = i24;
                                i25 = i28;
                                i15 = i26;
                                i14 = i25;
                                i29 = i40;
                                unsafe = unsafe2;
                                obj2 = obj3;
                                i33 = i23;
                                i16 = -1;
                                i17 = 0;
                            } else {
                                int iM8209l2 = C2809q5.m8209l(bArr2, i44, c2796p6);
                                unsafe2.putLong(obj, j10, C2861u5.m8290b(c2796p6.f14388b));
                                i26 = i24;
                                i33 = i23 | i46;
                                iM8205h = iM8209l2;
                                i34 = i26;
                                i32 = i40;
                                i31 = i13;
                                i30 = -1;
                                i29 = 0;
                            }
                            break;
                        default:
                            i25 = i44;
                            i26 = i24;
                            i15 = i26;
                            i14 = i25;
                            i29 = i40;
                            unsafe = unsafe2;
                            obj2 = obj3;
                            i33 = i23;
                            i16 = -1;
                            i17 = 0;
                            break;
                    }
                } else {
                    int i48 = i34;
                    int i49 = i33;
                    if (i43 == 27) {
                        if (i41 == 2) {
                            InterfaceC2836s6 interfaceC2836s6Mo7645r = (InterfaceC2836s6) unsafe2.getObject(obj3, j10);
                            if (!interfaceC2836s6Mo7645r.mo8078d()) {
                                int size = interfaceC2836s6Mo7645r.size();
                                interfaceC2836s6Mo7645r = interfaceC2836s6Mo7645r.mo7645r(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, interfaceC2836s6Mo7645r);
                            }
                            iM8205h = C2809q5.m8201d(c2772n7.m8114j(i40), i12, bArr, i44, i11, interfaceC2836s6Mo7645r, c2796p5);
                            i34 = i48;
                            i33 = i49;
                            i32 = i40;
                            i31 = i13;
                            i30 = -1;
                            i29 = 0;
                        } else {
                            i18 = i44;
                            i19 = i40;
                            unsafe = unsafe2;
                            i20 = i49;
                            i15 = i48;
                            i16 = -1;
                            i17 = 0;
                        }
                    } else if (i43 <= 49) {
                        i15 = i48;
                        i16 = -1;
                        unsafe = unsafe2;
                        i20 = i49;
                        i17 = 0;
                        iM8205h = m8102H(obj, bArr, i44, i11, i12, i13, i41, i40, i42, i43, j10, c2796p5);
                        if (iM8205h != i44) {
                            obj2 = obj;
                            i21 = i40;
                            i32 = i21;
                            i34 = i15;
                            i33 = i20;
                            bArr2 = bArr;
                            c2796p6 = c2796p5;
                            obj3 = obj2;
                            i30 = i16;
                            i29 = i17;
                            i31 = i13;
                            unsafe2 = unsafe;
                            c2772n7 = this;
                        } else {
                            obj2 = obj;
                            i22 = iM8205h;
                            i21 = i40;
                            i14 = i22;
                            i29 = i21;
                            i33 = i20;
                        }
                    } else {
                        i15 = i48;
                        i18 = i44;
                        i19 = i40;
                        unsafe = unsafe2;
                        i20 = i49;
                        i16 = -1;
                        i17 = 0;
                        if (i43 != 50) {
                            obj2 = obj;
                            i21 = i19;
                            iM8205h = m8101G(obj, bArr, i18, i11, i12, i13, i41, i42, i43, j10, i19, c2796p5);
                            if (iM8205h != i18) {
                                i32 = i21;
                                i34 = i15;
                                i33 = i20;
                            } else {
                                i22 = iM8205h;
                            }
                            bArr2 = bArr;
                            c2796p6 = c2796p5;
                            obj3 = obj2;
                            i30 = i16;
                            i29 = i17;
                            i31 = i13;
                            unsafe2 = unsafe;
                            c2772n7 = this;
                        } else if (i41 == 2) {
                            m8100F(obj, i19, j10);
                            throw null;
                        }
                        i14 = i22;
                        i29 = i21;
                        i33 = i20;
                    }
                    i22 = i18;
                    i21 = i19;
                    obj2 = obj;
                    i14 = i22;
                    i29 = i21;
                    i33 = i20;
                }
            }
            iM8205h = C2809q5.m8205h(i12, bArr, i14, i11, m8090B(obj), c2796p5);
            i32 = i29;
            i34 = i15;
            bArr2 = bArr;
            c2796p6 = c2796p5;
            obj3 = obj2;
            i30 = i16;
            i29 = i17;
            i31 = i13;
            unsafe2 = unsafe;
            c2772n7 = this;
        }
        int i50 = i33;
        Unsafe unsafe3 = unsafe2;
        Object obj4 = obj3;
        if (i34 != 1048575) {
            unsafe3.putInt(obj4, i34, i50);
        }
        if (iM8205h != i11) {
            throw zzll.m8502c();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: g */
    public final int mo8111g(Object obj) {
        int iM8334N1;
        int iM8334N2;
        int iM8335O1;
        int iM8334N3;
        int iM8334N4;
        int iM8334N5;
        int iM8334N6;
        int iM8344I;
        int iM8334N7;
        int iM8334N8;
        int iM8334N9;
        int iM8334N10;
        if (!this.f14343g) {
            return m8099D(obj);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f14337a;
            if (i10 >= iArr.length) {
                AbstractC2675g8 abstractC2675g8 = this.f14348l;
                return abstractC2675g8.mo7851a(abstractC2675g8.mo7854d(obj)) + i11;
            }
            int iM8104J = m8104J(i10);
            int i12 = (iM8104J >>> 20) & 255;
            int i13 = iArr[i10];
            int i14 = iM8104J & 1048575;
            if (i12 >= zzkt.zzJ.zza() && i12 <= zzkt.zzW.zza()) {
                int i15 = iArr[i10 + 2];
            }
            long j10 = i14;
            Unsafe unsafe = f14336o;
            switch (i12) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (m8125w(i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case 1:
                    if (m8125w(i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case 2:
                    if (m8125w(i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8335O1(C2812q8.m8220h(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 3:
                    if (m8125w(i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8335O1(C2812q8.m8220h(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 4:
                    if (m8125w(i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8332L1(C2812q8.m8219g(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 5:
                    if (m8125w(i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m8125w(i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m8125w(i10, obj)) {
                        iM8334N4 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N4 + 1;
                        i11 += iM8344I;
                    }
                    break;
                case 8:
                    if (m8125w(i10, obj)) {
                        Object objM8222j = C2812q8.m8222j(j10, obj);
                        if (!(objM8222j instanceof zzka)) {
                            iM8335O1 = AbstractC2887w5.m8333M1((String) objM8222j);
                            iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                            i11 = iM8334N3 + iM8335O1 + i11;
                        } else {
                            Logger logger = AbstractC2887w5.f14492Q;
                            int iMo8492q = ((zzka) objM8222j).mo8492q();
                            iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q;
                            iM8334N6 = AbstractC2887w5.m8334N1(i13 << 3);
                            iM8344I = iM8334N6 + iM8334N5;
                            i11 += iM8344I;
                        }
                    }
                    break;
                case 9:
                    if (m8125w(i10, obj)) {
                        iM8344I = C2889w7.m8344I(i13, m8114j(i10), C2812q8.m8222j(j10, obj));
                        i11 += iM8344I;
                    }
                    break;
                case 10:
                    if (m8125w(i10, obj)) {
                        zzka zzkaVar = (zzka) C2812q8.m8222j(j10, obj);
                        Logger logger2 = AbstractC2887w5.f14492Q;
                        int iMo8492q2 = zzkaVar.mo8492q();
                        iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q2) + iMo8492q2;
                        iM8334N6 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N6 + iM8334N5;
                        i11 += iM8344I;
                    }
                    break;
                case 11:
                    if (m8125w(i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8334N1(C2812q8.m8219g(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 12:
                    if (m8125w(i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8332L1(C2812q8.m8219g(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 13:
                    if (m8125w(i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case 14:
                    if (m8125w(i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case 15:
                    if (m8125w(i10, obj)) {
                        int iM8219g = C2812q8.m8219g(j10, obj);
                        iM8334N7 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N8 = AbstractC2887w5.m8334N1((iM8219g >> 31) ^ (iM8219g + iM8219g));
                        iM8344I = iM8334N8 + iM8334N7;
                        i11 += iM8344I;
                    }
                    break;
                case 16:
                    if (m8125w(i10, obj)) {
                        long jM8220h = C2812q8.m8220h(j10, obj);
                        iM8334N5 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N6 = AbstractC2887w5.m8335O1((jM8220h >> 63) ^ (jM8220h + jM8220h));
                        iM8344I = iM8334N6 + iM8334N5;
                        i11 += iM8344I;
                    }
                    break;
                case 17:
                    if (m8125w(i10, obj)) {
                        iM8344I = AbstractC2887w5.m8331K1(i13, (InterfaceC2730k7) C2812q8.m8222j(j10, obj), m8114j(i10));
                        i11 += iM8344I;
                    }
                    break;
                case 18:
                    iM8344I = C2889w7.m8337B(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 19:
                    iM8344I = C2889w7.m8380z(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 20:
                    iM8344I = C2889w7.m8342G(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 21:
                    iM8344I = C2889w7.m8353R(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 22:
                    iM8344I = C2889w7.m8340E(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 23:
                    iM8344I = C2889w7.m8337B(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 24:
                    iM8344I = C2889w7.m8380z(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 25:
                    iM8344I = C2889w7.m8376v(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 26:
                    iM8344I = C2889w7.m8350O(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 27:
                    iM8344I = C2889w7.m8345J(i13, (List) C2812q8.m8222j(j10, obj), m8114j(i10));
                    i11 += iM8344I;
                    break;
                case 28:
                    iM8344I = C2889w7.m8377w(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 29:
                    iM8344I = C2889w7.m8351P(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 30:
                    iM8344I = C2889w7.m8378x(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 31:
                    iM8344I = C2889w7.m8380z(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 32:
                    iM8344I = C2889w7.m8337B(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 33:
                    iM8344I = C2889w7.m8346K(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 34:
                    iM8344I = C2889w7.m8348M(i13, (List) C2812q8.m8222j(j10, obj));
                    i11 += iM8344I;
                    break;
                case 35:
                    iM8335O1 = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 36:
                    iM8335O1 = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 37:
                    iM8335O1 = C2889w7.m8343H((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 38:
                    iM8335O1 = C2889w7.m8354S((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 39:
                    iM8335O1 = C2889w7.m8341F((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 40:
                    iM8335O1 = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 41:
                    iM8335O1 = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = C2889w7.f14495a;
                    iM8335O1 = list.size();
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 43:
                    iM8335O1 = C2889w7.m8352Q((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 44:
                    iM8335O1 = C2889w7.m8379y((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 45:
                    iM8335O1 = C2889w7.m8336A((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 46:
                    iM8335O1 = C2889w7.m8338C((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 47:
                    iM8335O1 = C2889w7.m8347L((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 48:
                    iM8335O1 = C2889w7.m8349N((List) unsafe.getObject(obj, j10));
                    if (iM8335O1 > 0) {
                        iM8334N9 = AbstractC2887w5.m8334N1(iM8335O1);
                        iM8334N10 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N3 = iM8334N10 + iM8334N9;
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 49:
                    iM8344I = C2889w7.m8339D(i13, (List) C2812q8.m8222j(j10, obj), m8114j(i10));
                    i11 += iM8344I;
                    break;
                case 50:
                    C2674g7.m7849a(C2812q8.m8222j(j10, obj), m8115k(i10));
                    break;
                case 51:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case 52:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case 53:
                    if (m8126y(i13, i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8335O1(m8093K(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 54:
                    if (m8126y(i13, i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8335O1(m8093K(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 55:
                    if (m8126y(i13, i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8332L1(m8092E(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 56:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case 57:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case 58:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N4 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N4 + 1;
                        i11 += iM8344I;
                    }
                    break;
                case 59:
                    if (m8126y(i13, i10, obj)) {
                        Object objM8222j2 = C2812q8.m8222j(j10, obj);
                        if (!(objM8222j2 instanceof zzka)) {
                            iM8335O1 = AbstractC2887w5.m8333M1((String) objM8222j2);
                            iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                            i11 = iM8334N3 + iM8335O1 + i11;
                        } else {
                            Logger logger3 = AbstractC2887w5.f14492Q;
                            int iMo8492q3 = ((zzka) objM8222j2).mo8492q();
                            iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q3) + iMo8492q3;
                            iM8334N6 = AbstractC2887w5.m8334N1(i13 << 3);
                            iM8344I = iM8334N6 + iM8334N5;
                            i11 += iM8344I;
                        }
                    }
                    break;
                case 60:
                    if (m8126y(i13, i10, obj)) {
                        iM8344I = C2889w7.m8344I(i13, m8114j(i10), C2812q8.m8222j(j10, obj));
                        i11 += iM8344I;
                    }
                    break;
                case 61:
                    if (m8126y(i13, i10, obj)) {
                        zzka zzkaVar2 = (zzka) C2812q8.m8222j(j10, obj);
                        Logger logger4 = AbstractC2887w5.f14492Q;
                        int iMo8492q4 = zzkaVar2.mo8492q();
                        iM8334N5 = AbstractC2887w5.m8334N1(iMo8492q4) + iMo8492q4;
                        iM8334N6 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N6 + iM8334N5;
                        i11 += iM8344I;
                    }
                    break;
                case 62:
                    if (m8126y(i13, i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8334N1(m8092E(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 63:
                    if (m8126y(i13, i10, obj)) {
                        iM8335O1 = AbstractC2887w5.m8332L1(m8092E(j10, obj));
                        iM8334N3 = AbstractC2887w5.m8334N1(i13 << 3);
                        i11 = iM8334N3 + iM8335O1 + i11;
                    }
                    break;
                case 64:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N2 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N2 + 4;
                        i11 += iM8344I;
                    }
                    break;
                case 65:
                    if (m8126y(i13, i10, obj)) {
                        iM8334N1 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8344I = iM8334N1 + 8;
                        i11 += iM8344I;
                    }
                    break;
                case 66:
                    if (m8126y(i13, i10, obj)) {
                        int iM8092E = m8092E(j10, obj);
                        iM8334N7 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N8 = AbstractC2887w5.m8334N1((iM8092E >> 31) ^ (iM8092E + iM8092E));
                        iM8344I = iM8334N8 + iM8334N7;
                        i11 += iM8344I;
                    }
                    break;
                case 67:
                    if (m8126y(i13, i10, obj)) {
                        long jM8093K = m8093K(j10, obj);
                        iM8334N5 = AbstractC2887w5.m8334N1(i13 << 3);
                        iM8334N6 = AbstractC2887w5.m8335O1((jM8093K >> 63) ^ (jM8093K + jM8093K));
                        iM8344I = iM8334N6 + iM8334N5;
                        i11 += iM8344I;
                    }
                    break;
                case 68:
                    if (m8126y(i13, i10, obj)) {
                        iM8344I = AbstractC2887w5.m8331K1(i13, (InterfaceC2730k7) C2812q8.m8222j(j10, obj), m8114j(i10));
                        i11 += iM8344I;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: h */
    public final void mo8112h(Object obj, Object obj2) {
        m8095o(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14337a;
            if (i10 >= iArr.length) {
                Class cls = C2889w7.f14495a;
                AbstractC2675g8 abstractC2675g8 = this.f14348l;
                abstractC2675g8.mo7858h(obj, abstractC2675g8.mo7855e(abstractC2675g8.mo7854d(obj), abstractC2675g8.mo7854d(obj2)));
                if (this.f14342f) {
                    this.f14349m.mo7697a(obj2);
                    throw null;
                }
                return;
            }
            int iM8104J = m8104J(i10);
            int i11 = iArr[i10];
            long j10 = 1048575 & iM8104J;
            switch ((iM8104J >>> 20) & 255) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8226n(obj, j10, C2812q8.m8217e(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 1:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8227o(obj, j10, C2812q8.m8218f(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 2:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8229q(obj, j10, C2812q8.m8220h(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 3:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8229q(obj, j10, C2812q8.m8220h(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 4:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case 5:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8229q(obj, j10, C2812q8.m8220h(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8225m(obj, j10, C2812q8.m8234v(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 8:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8230r(j10, obj, C2812q8.m8222j(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 9:
                    m8118p(obj, i10, obj2);
                    break;
                case 10:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8230r(j10, obj, C2812q8.m8222j(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 11:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case 12:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case 13:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case 14:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8229q(obj, j10, C2812q8.m8220h(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 15:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8228p(C2812q8.m8219g(j10, obj2), j10, obj);
                        m8120r(i10, obj);
                    }
                    break;
                case 16:
                    if (m8125w(i10, obj2)) {
                        C2812q8.m8229q(obj, j10, C2812q8.m8220h(j10, obj2));
                        m8120r(i10, obj);
                    }
                    break;
                case 17:
                    m8118p(obj, i10, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f14347k.mo8430b(j10, obj, obj2);
                    break;
                case 50:
                    Class cls2 = C2889w7.f14495a;
                    C2812q8.m8230r(j10, obj, C2674g7.m7850b(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m8126y(i11, i10, obj2)) {
                        C2812q8.m8230r(j10, obj, C2812q8.m8222j(j10, obj2));
                        m8121s(i11, i10, obj);
                    }
                    break;
                case 60:
                    m8119q(obj, i10, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m8126y(i11, i10, obj2)) {
                        C2812q8.m8230r(j10, obj, C2812q8.m8222j(j10, obj2));
                        m8121s(i11, i10, obj);
                    }
                    break;
                case 68:
                    m8119q(obj, i10, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0067 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: i */
    public final boolean mo8113i(Object obj, Object obj2) {
        boolean zM8374t;
        int[] iArr = this.f14337a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iM8104J = m8104J(i10);
            long j10 = iM8104J & 1048575;
            switch ((iM8104J >>> 20) & 255) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (!m8124v(obj, i10, obj2) || Double.doubleToLongBits(C2812q8.m8217e(j10, obj)) != Double.doubleToLongBits(C2812q8.m8217e(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!m8124v(obj, i10, obj2) || Float.floatToIntBits(C2812q8.m8218f(j10, obj)) != Float.floatToIntBits(C2812q8.m8218f(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8220h(j10, obj) != C2812q8.m8220h(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8220h(j10, obj) != C2812q8.m8220h(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8220h(j10, obj) != C2812q8.m8220h(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8234v(j10, obj) != C2812q8.m8234v(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!m8124v(obj, i10, obj2) || !C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!m8124v(obj, i10, obj2) || !C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!m8124v(obj, i10, obj2) || !C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8220h(j10, obj) != C2812q8.m8220h(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8219g(j10, obj) != C2812q8.m8219g(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!m8124v(obj, i10, obj2) || C2812q8.m8220h(j10, obj) != C2812q8.m8220h(j10, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!m8124v(obj, i10, obj2) || !C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zM8374t = C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2));
                    if (!zM8374t) {
                        return false;
                    }
                    break;
                case 50:
                    zM8374t = C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2));
                    if (!zM8374t) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i10 + 2] & 1048575;
                    if (C2812q8.m8219g(j11, obj) == C2812q8.m8219g(j11, obj2)) {
                        if (!C2889w7.m8374t(C2812q8.m8222j(j10, obj), C2812q8.m8222j(j10, obj2))) {
                        }
                        break;
                    }
                    return false;
                default:
                    break;
            }
        }
        AbstractC2675g8 abstractC2675g8 = this.f14348l;
        if (!abstractC2675g8.mo7854d(obj).equals(abstractC2675g8.mo7854d(obj2))) {
            return false;
        }
        if (!this.f14342f) {
            return true;
        }
        AbstractC2603b6 abstractC2603b6 = this.f14349m;
        abstractC2603b6.mo7697a(obj);
        abstractC2603b6.mo7697a(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC2876v7 m8114j(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f14338b;
        InterfaceC2876v7 interfaceC2876v7 = (InterfaceC2876v7) objArr[i12];
        if (interfaceC2876v7 != null) {
            return interfaceC2876v7;
        }
        InterfaceC2876v7 interfaceC2876v7M8253a = C2837s7.f14426c.m8253a((Class) objArr[i12 + 1]);
        objArr[i12] = interfaceC2876v7M8253a;
        return interfaceC2876v7M8253a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m8115k(int i10) {
        int i11 = i10 / 3;
        return this.f14338b[i11 + i11];
    }

    /* JADX INFO: renamed from: l */
    public final Object m8116l(int i10, Object obj) {
        InterfaceC2876v7 interfaceC2876v7M8114j = m8114j(i10);
        int iM8104J = m8104J(i10) & 1048575;
        if (!m8125w(i10, obj)) {
            return interfaceC2876v7M8114j.mo8106b();
        }
        Object object = f14336o.getObject(obj, iM8104J);
        if (m8096x(object)) {
            return object;
        }
        AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7M8114j.mo8106b();
        if (object != null) {
            interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b, object);
        }
        return abstractC2771n6Mo8106b;
    }

    /* JADX INFO: renamed from: m */
    public final Object m8117m(int i10, int i11, Object obj) {
        InterfaceC2876v7 interfaceC2876v7M8114j = m8114j(i11);
        if (!m8126y(i10, i11, obj)) {
            return interfaceC2876v7M8114j.mo8106b();
        }
        Object object = f14336o.getObject(obj, m8104J(i11) & 1048575);
        if (m8096x(object)) {
            return object;
        }
        AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7M8114j.mo8106b();
        if (object != null) {
            interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b, object);
        }
        return abstractC2771n6Mo8106b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final void m8118p(Object obj, int i10, Object obj2) {
        if (m8125w(i10, obj2)) {
            long jM8104J = m8104J(i10) & 1048575;
            Unsafe unsafe = f14336o;
            Object object = unsafe.getObject(obj2, jM8104J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f14337a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2876v7 interfaceC2876v7M8114j = m8114j(i10);
            if (!m8125w(i10, obj)) {
                if (m8096x(object)) {
                    AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7M8114j.mo8106b();
                    interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b, object);
                    unsafe.putObject(obj, jM8104J, abstractC2771n6Mo8106b);
                } else {
                    unsafe.putObject(obj, jM8104J, object);
                }
                m8120r(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM8104J);
            if (!m8096x(object2)) {
                AbstractC2771n6 abstractC2771n6Mo8106b2 = interfaceC2876v7M8114j.mo8106b();
                interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b2, object2);
                unsafe.putObject(obj, jM8104J, abstractC2771n6Mo8106b2);
                object2 = abstractC2771n6Mo8106b2;
            }
            interfaceC2876v7M8114j.mo8112h(object2, object);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final void m8119q(Object obj, int i10, Object obj2) {
        int[] iArr = this.f14337a;
        int i11 = iArr[i10];
        if (m8126y(i11, i10, obj2)) {
            long jM8104J = m8104J(i10) & 1048575;
            Unsafe unsafe = f14336o;
            Object object = unsafe.getObject(obj2, jM8104J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2876v7 interfaceC2876v7M8114j = m8114j(i10);
            if (!m8126y(i11, i10, obj)) {
                if (m8096x(object)) {
                    AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7M8114j.mo8106b();
                    interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b, object);
                    unsafe.putObject(obj, jM8104J, abstractC2771n6Mo8106b);
                } else {
                    unsafe.putObject(obj, jM8104J, object);
                }
                m8121s(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM8104J);
            if (!m8096x(object2)) {
                AbstractC2771n6 abstractC2771n6Mo8106b2 = interfaceC2876v7M8114j.mo8106b();
                interfaceC2876v7M8114j.mo8112h(abstractC2771n6Mo8106b2, object2);
                unsafe.putObject(obj, jM8104J, abstractC2771n6Mo8106b2);
                object2 = abstractC2771n6Mo8106b2;
            }
            interfaceC2876v7M8114j.mo8112h(object2, object);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8120r(int i10, Object obj) {
        int i11 = this.f14337a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        C2812q8.m8228p((1 << (i11 >>> 20)) | C2812q8.m8219g(j10, obj), j10, obj);
    }

    /* JADX INFO: renamed from: s */
    public final void m8121s(int i10, int i11, Object obj) {
        C2812q8.m8228p(i10, this.f14337a[i11 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: t */
    public final void m8122t(Object obj, int i10, Object obj2) {
        f14336o.putObject(obj, m8104J(i10) & 1048575, obj2);
        m8120r(i10, obj);
    }

    /* JADX INFO: renamed from: u */
    public final void m8123u(int i10, int i11, Object obj, Object obj2) {
        f14336o.putObject(obj, m8104J(i11) & 1048575, obj2);
        m8121s(i10, i11, obj);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8124v(Object obj, int i10, Object obj2) {
        return m8125w(i10, obj) == m8125w(i10, obj2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: w */
    public final boolean m8125w(int i10, Object obj) {
        int i11 = this.f14337a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & C2812q8.m8219g(j10, obj)) != 0;
        }
        int iM8104J = m8104J(i10);
        long j11 = iM8104J & 1048575;
        switch ((iM8104J >>> 20) & 255) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return Double.doubleToRawLongBits(C2812q8.m8217e(j11, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2812q8.m8218f(j11, obj)) != 0;
            case 2:
                return C2812q8.m8220h(j11, obj) != 0;
            case 3:
                return C2812q8.m8220h(j11, obj) != 0;
            case 4:
                return C2812q8.m8219g(j11, obj) != 0;
            case 5:
                return C2812q8.m8220h(j11, obj) != 0;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C2812q8.m8219g(j11, obj) != 0;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return C2812q8.m8234v(j11, obj);
            case 8:
                Object objM8222j = C2812q8.m8222j(j11, obj);
                if (objM8222j instanceof String) {
                    return !((String) objM8222j).isEmpty();
                }
                if (objM8222j instanceof zzka) {
                    return !zzka.f14563b.equals(objM8222j);
                }
                throw new IllegalArgumentException();
            case 9:
                return C2812q8.m8222j(j11, obj) != null;
            case 10:
                return !zzka.f14563b.equals(C2812q8.m8222j(j11, obj));
            case 11:
                return C2812q8.m8219g(j11, obj) != 0;
            case 12:
                return C2812q8.m8219g(j11, obj) != 0;
            case 13:
                return C2812q8.m8219g(j11, obj) != 0;
            case 14:
                return C2812q8.m8220h(j11, obj) != 0;
            case 15:
                return C2812q8.m8219g(j11, obj) != 0;
            case 16:
                return C2812q8.m8220h(j11, obj) != 0;
            case 17:
                return C2812q8.m8222j(j11, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8126y(int i10, int i11, Object obj) {
        return C2812q8.m8219g((long) (this.f14337a[i11 + 2] & 1048575), obj) == i10;
    }
}
