package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0787av;
import p000.C3386nv;
import p000.dnb;
import p000.e41;
import p000.e9c;
import p000.eda;
import p000.fg2;
import p000.fgc;
import p000.g9a;
import p000.gw9;
import p000.ho2;
import p000.ij6;
import p000.j8c;
import p000.jjc;
import p000.kdd;
import p000.lgc;
import p000.lkc;
import p000.m9c;
import p000.s1c;
import p000.s46;
import p000.s8c;
import p000.sjb;
import p000.ux5;
import p000.vfc;
import p000.yac;
import p000.z3c;
import p000.zla;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1001l implements lgc {

    /* JADX INFO: renamed from: j */
    public static final int[] f12186j = new int[0];

    /* JADX INFO: renamed from: k */
    public static final Unsafe f12187k = lkc.m16340i();

    /* JADX INFO: renamed from: a */
    public final int[] f12188a;

    /* JADX INFO: renamed from: b */
    public final Object[] f12189b;

    /* JADX INFO: renamed from: c */
    public final int f12190c;

    /* JADX INFO: renamed from: d */
    public final int f12191d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0997h f12192e;

    /* JADX INFO: renamed from: f */
    public final int[] f12193f;

    /* JADX INFO: renamed from: g */
    public final int f12194g;

    /* JADX INFO: renamed from: h */
    public final int f12195h;

    /* JADX INFO: renamed from: i */
    public final e41 f12196i;

    public C1001l(int[] iArr, Object[] objArr, int i, int i2, AbstractC0997h abstractC0997h, int[] iArr2, int i3, int i4, e41 e41Var, s46 s46Var) {
        this.f12188a = iArr;
        this.f12189b = objArr;
        this.f12190c = i;
        this.f12191d = i2;
        this.f12193f = iArr2;
        this.f12194g = i3;
        this.f12195h = i4;
        this.f12196i = e41Var;
        this.f12192e = abstractC0997h;
    }

    /* JADX INFO: renamed from: E */
    public static Field m5547E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM23000w = ux5.m23000w("Field ", str, " for ", name, " not found. Known fields are ");
            sbM23000w.append(string);
            throw new RuntimeException(sbM23000w.toString(), e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5548r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0998i) {
            return ((AbstractC0998i) obj).m5539h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5  */
    /* JADX INFO: renamed from: u */
    public static C1001l m5549u(fgc fgcVar, e41 e41Var, s46 s46Var) {
        int i;
        int iCharAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldM5547E;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM5547E2;
        int i28;
        Object obj2;
        Field fieldM5547E3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(fgcVar instanceof fgc)) {
            ho2.m13383c();
            return null;
        }
        String str = fgcVar.f39093b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt13 = str.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f12186j;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt8 = str.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt8 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i8;
            }
            int i62 = iCharAt3 + iCharAt3 + iCharAt4;
            i2 = iCharAt3;
            i35 = i59;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i63 = iCharAt7;
            i3 = iCharAt5;
            i4 = i63;
            i5 = iCharAt6;
            i6 = i62;
            i7 = iCharAt9;
        }
        Unsafe unsafe = f12187k;
        Object[] objArr2 = fgcVar.f39094c;
        Class<?> cls = fgcVar.f39092a.getClass();
        int i64 = i7 + i4;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int iCharAt10 = str.charAt(i35);
            if (iCharAt10 >= i33) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    cCharAt12 = str.charAt(i72);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = str.charAt(i74);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                iCharAt11 = i75 | (cCharAt11 << i76);
                i74 = i30;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = iCharAt11 & 255;
            int i78 = iCharAt10;
            int i79 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int iCharAt12 = str.charAt(i74);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        cCharAt10 = str.charAt(i82);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i83);
                    i24 = i29;
                } else {
                    i24 = i80;
                }
                int i84 = i24;
                int i85 = i77 - 51;
                int i86 = iCharAt12;
                if (i85 == 9 || i85 == 17) {
                    i25 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 != 12) {
                        i26 = i79;
                    } else if (fgcVar.m11830a() == 1 || i79 != 0) {
                        i25 = i6 + 1;
                        int i88 = i69 / 3;
                        objArr3[i88 + i88 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i86 + i86;
                    i79 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldM5547E2 = (Field) obj;
                    } else {
                        fieldM5547E2 = m5547E(cls, (String) obj);
                        objArr4[i27] = fieldM5547E2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM5547E2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldM5547E3 = (Field) obj2;
                    } else {
                        fieldM5547E3 = m5547E(cls, (String) obj2);
                        objArr4[i28] = fieldM5547E3;
                    }
                    i19 = i84;
                    i22 = iObjectFieldOffset3;
                    i18 = 55296;
                    objArr = objArr3;
                    i2 = i2;
                    cls = cls;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5547E3);
                }
                i6 = i25;
                i26 = i79;
                i27 = i86 + i86;
                i79 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldM5547E2 = (Field) obj;
                } else {
                    fieldM5547E2 = m5547E(cls, (String) obj);
                    objArr4[i27] = fieldM5547E2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM5547E2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldM5547E3 = (Field) obj2;
                } else {
                    fieldM5547E3 = m5547E(cls, (String) obj2);
                    objArr4[i28] = fieldM5547E3;
                }
                i19 = i84;
                i22 = iObjectFieldOffset4;
                i18 = 55296;
                objArr = objArr3;
                i2 = i2;
                cls = cls;
                i21 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5547E3);
            } else {
                int i89 = i6 + 1;
                Field fieldM5547E4 = m5547E(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    int i90 = i69 / 3;
                    objArr[i90 + i90 + 1] = fieldM5547E4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i2 = i2;
                            if (fgcVar.m11830a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i91 = i69 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i92 = i6 + 2;
                            i67++;
                            iArr[i67] = i69;
                            int i93 = i69 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i79 = 0;
                            }
                            i2 = i2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5547E4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            i18 = 55296;
                            i19 = i74;
                            i20 = 0;
                        } else {
                            int i95 = i74 + 1;
                            int iCharAt13 = str.charAt(i74);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i19 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i19;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i19 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + i2 + i2;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldM5547E = (Field) obj3;
                            } else {
                                fieldM5547E = m5547E(cls, (String) obj3);
                                objArr4[i98] = fieldM5547E;
                            }
                            i20 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5547E);
                            i18 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i69 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5547E4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    } else {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i20;
                    i22 = iObjectFieldOffset;
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5547E4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                } else {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i20;
                i22 = iObjectFieldOffset;
            }
            int i100 = i79;
            int i101 = i69 + 1;
            iArr2[i69] = i78;
            int i102 = i69 + 2;
            String str2 = str;
            iArr2[i101] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i100 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i22;
            i69 += 3;
            iArr2[i102] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr2 = objArr4;
            i33 = i18;
            length = i16;
            objArr3 = objArr;
            i2 = i2;
            i35 = i19;
            str = str2;
        }
        return new C1001l(iArr2, objArr3, i3, i5, fgcVar.f39092a, iArr, i7, i64, e41Var, s46Var);
    }

    /* JADX INFO: renamed from: v */
    public static int m5550v(Object obj, long j) {
        return ((Integer) lkc.m16339h(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: x */
    public static int m5551x(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: z */
    public static long m5552z(Object obj, long j) {
        return ((Long) lkc.m16339h(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final s8c m5553A(int i) {
        int i2 = i / 3;
        return (s8c) this.f12189b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: B */
    public final lgc m5554B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f12189b;
        lgc lgcVar = (lgc) objArr[i3];
        if (lgcVar != null) {
            return lgcVar;
        }
        lgc lgcVarM23265a = vfc.f65328c.m23265a((Class) objArr[i3 + 1]);
        objArr[i3] = lgcVarM23265a;
        return lgcVarM23265a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m5555C(int i, Object obj) {
        lgc lgcVarM5554B = m5554B(i);
        int iM5577y = m5577y(i) & 1048575;
        if (!m5572p(i, obj)) {
            return lgcVarM5554B.mo5558b();
        }
        Object object = f12187k.getObject(obj, iM5577y);
        if (m5548r(object)) {
            return object;
        }
        AbstractC0998i abstractC0998iMo5558b = lgcVarM5554B.mo5558b();
        if (object != null) {
            lgcVarM5554B.mo5563g(abstractC0998iMo5558b, object);
        }
        return abstractC0998iMo5558b;
    }

    /* JADX INFO: renamed from: D */
    public final Object m5556D(int i, Object obj, int i2) {
        lgc lgcVarM5554B = m5554B(i2);
        if (!m5574s(i, obj, i2)) {
            return lgcVarM5554B.mo5558b();
        }
        Object object = f12187k.getObject(obj, m5577y(i2) & 1048575);
        if (m5548r(object)) {
            return object;
        }
        AbstractC0998i abstractC0998iMo5558b = lgcVarM5554B.mo5558b();
        if (object != null) {
            lgcVarM5554B.mo5563g(abstractC0998iMo5558b, object);
        }
        return abstractC0998iMo5558b;
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: a */
    public final boolean mo5557a(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f12194g) {
            int i6 = this.f12193f[i4];
            int[] iArr = this.f12188a;
            int i7 = iArr[i6];
            int iM5577y = m5577y(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f12187k.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iM5577y) == 0 || m5573q(obj, i6, i, i2, i10)) {
                int iM5551x = m5551x(iM5577y);
                if (iM5551x != 9 && iM5551x != 17) {
                    if (iM5551x != 27) {
                        if (iM5551x == 60 || iM5551x == 68) {
                            if (!m5574s(i7, obj, i6) || m5554B(i6).mo5557a(lkc.m16339h(obj, iM5577y & 1048575))) {
                            }
                        } else if (iM5551x != 49) {
                            if (iM5551x == 50 && !((zzgv) lkc.m16339h(obj, iM5577y & 1048575)).isEmpty()) {
                                int i12 = i6 / 3;
                                g9a.m12435l(this.f12189b[i12 + i12]);
                                throw null;
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) lkc.m16339h(obj, iM5577y & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        lgc lgcVarM5554B = m5554B(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (lgcVarM5554B.mo5557a(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!m5573q(obj, i6, i, i2, i10) || m5554B(i6).mo5557a(lkc.m16339h(obj, iM5577y & 1048575))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: b */
    public final AbstractC0998i mo5558b() {
        return ((AbstractC0998i) this.f12192e).m5542n();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // p000.lgc
    /* JADX INFO: renamed from: c */
    public final void mo5559c(Object obj) {
        if (!m5548r(obj)) {
            return;
        }
        if (obj instanceof AbstractC0998i) {
            AbstractC0998i abstractC0998i = (AbstractC0998i) obj;
            abstractC0998i.m5538g();
            abstractC0998i.zza = 0;
            abstractC0998i.m5537e();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i >= iArr.length) {
                this.f12196i.getClass();
                jjc jjcVar = ((AbstractC0998i) obj).zzc;
                if (jjcVar.f45644e) {
                    jjcVar.f45644e = false;
                    return;
                }
                return;
            }
            int iM5577y = m5577y(i);
            int i2 = 1048575 & iM5577y;
            int iM5551x = m5551x(iM5577y);
            long j = i2;
            if (iM5551x != 9) {
                if (iM5551x != 60 && iM5551x != 68) {
                    switch (iM5551x) {
                        case 17:
                            if (m5572p(i, obj)) {
                                m5554B(i).mo5559c(f12187k.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                        case 26:
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        case 28:
                        case 29:
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        case 38:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case 42:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case eda.f37086g /* 48 */:
                        case 49:
                            ((s1c) ((e9c) lkc.m16339h(obj, j))).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f12187k;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzgv) object).m5691c();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (m5574s(iArr[i], obj, i)) {
                    m5554B(i).mo5559c(f12187k.getObject(obj, j));
                }
            } else if (m5572p(i, obj)) {
                m5554B(i).mo5559c(f12187k.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:196:0x0519  */
    @Override // p000.lgc
    /* JADX INFO: renamed from: d */
    public final int mo5560d(AbstractC0997h abstractC0997h) {
        int i;
        int iM25433o;
        int iM25434p;
        int iM5587i;
        int i2;
        int iMo5531c;
        int iM25433o2;
        int size;
        int iM5593o;
        int iM25433o3;
        int iM25433o4;
        int iM25433o5;
        int iMo5531c2;
        int iM25433o6;
        int iM25434p2;
        Unsafe unsafe = f12187k;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iM12436m = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i5 >= iArr.length) {
                return ((AbstractC0998i) abstractC0997h).zzc.m14505a() + iM12436m;
            }
            int iM5577y = m5577y(i5);
            int iM5551x = m5551x(iM5577y);
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iM5551x <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(abstractC0997h, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iM5577y & i3;
            if (iM5551x >= zzfn.zzJ.zza()) {
                zzfn.zzW.zza();
            }
            long j = i10;
            switch (iM5551x) {
                case 0:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(abstractC0997h, j);
                        iM25433o = z3c.m25433o(i7 << 3);
                        iM25434p = z3c.m25434p(j2);
                        iM5587i = iM25434p + iM25433o;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(abstractC0997h, j);
                        iM25433o = z3c.m25433o(i7 << 3);
                        iM25434p = z3c.m25434p(j3);
                        iM5587i = iM25434p + iM25433o;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        long j4 = unsafe.getInt(abstractC0997h, j);
                        iM25433o = z3c.m25433o(i7 << 3);
                        iM25434p = z3c.m25434p(j4);
                        iM5587i = iM25434p + iM25433o;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 1, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(abstractC0997h, j);
                        if (object instanceof zzev) {
                            int iM25433o7 = z3c.m25433o(i11);
                            int iMo5681h = ((zzev) object).mo5681h();
                            iM12436m = g9a.m12437n(iMo5681h, iMo5681h, iM25433o7, iM12436m);
                        } else {
                            int iM25433o8 = z3c.m25433o(i11);
                            int iM5605b = AbstractC1004o.m5605b((String) object);
                            iM12436m = g9a.m12437n(iM5605b, iM5605b, iM25433o8, iM12436m);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(abstractC0997h, j);
                        lgc lgcVarM5554B = m5554B(i5);
                        e41 e41Var = AbstractC1003n.f12199a;
                        int iM25433o9 = z3c.m25433o(i7 << 3);
                        int iMo5531c3 = ((AbstractC0997h) object2).mo5531c(lgcVarM5554B);
                        iM12436m = g9a.m12437n(iMo5531c3, iMo5531c3, iM25433o9, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        zzev zzevVar = (zzev) unsafe.getObject(abstractC0997h, j);
                        int iM25433o10 = z3c.m25433o(i7 << 3);
                        int iMo5681h2 = zzevVar.mo5681h();
                        iM12436m = g9a.m12437n(iMo5681h2, iMo5681h2, iM25433o10, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(unsafe.getInt(abstractC0997h, j), z3c.m25433o(i7 << 3), iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(abstractC0997h, j);
                        iM25433o = z3c.m25433o(i7 << 3);
                        iM25434p = z3c.m25434p(j5);
                        iM5587i = iM25434p + iM25433o;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(abstractC0997h, j);
                        iM12436m = g9a.m12436m((i12 >> 31) ^ (i12 + i12), z3c.m25433o(i7 << 3), iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        long j6 = unsafe.getLong(abstractC0997h, j);
                        iM25433o = z3c.m25433o(i7 << 3);
                        iM25434p = z3c.m25434p((j6 >> 63) ^ (j6 + j6));
                        iM5587i = iM25434p + iM25433o;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (m5573q(abstractC0997h, i5, i4, i6, i)) {
                        AbstractC0997h abstractC0997h2 = (AbstractC0997h) unsafe.getObject(abstractC0997h, j);
                        lgc lgcVarM5554B2 = m5554B(i5);
                        e41 e41Var2 = AbstractC1003n.f12199a;
                        int iM25433o11 = z3c.m25433o(i7 << 3);
                        i2 = iM25433o11 + iM25433o11;
                        iMo5531c = abstractC0997h2.mo5531c(lgcVarM5554B2);
                        iM5587i = iMo5531c + i2;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iM5587i = AbstractC1003n.m5587i(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iM5587i = AbstractC1003n.m5586h(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var3 = AbstractC1003n.f12199a;
                    if (list.size() == 0) {
                        iM25433o2 = 0;
                    } else {
                        iM25433o2 = (z3c.m25433o(i7 << 3) * list.size()) + AbstractC1003n.m5589k(list);
                    }
                    iM12436m += iM25433o2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var4 = AbstractC1003n.f12199a;
                    size = list2.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5593o(list2);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var5 = AbstractC1003n.f12199a;
                    size = list3.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5588j(list3);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM5587i = AbstractC1003n.m5587i(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iM5587i = AbstractC1003n.m5586h(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var6 = AbstractC1003n.f12199a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM25433o2 = 0;
                    } else {
                        iM25433o2 = (z3c.m25433o(i7 << 3) + 1) * size2;
                    }
                    iM12436m += iM25433o2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var7 = AbstractC1003n.f12199a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM25433o4 = z3c.m25433o(i7 << 3) * size3;
                        if (list5 instanceof yac) {
                            yac yacVar = (yac) list5;
                            for (int i13 = 0; i13 < size3; i13++) {
                                Object objZza = yacVar.zza();
                                if (objZza instanceof zzev) {
                                    int iMo5681h3 = ((zzev) objZza).mo5681h();
                                    iM25433o4 = g9a.m12436m(iMo5681h3, iMo5681h3, iM25433o4);
                                } else {
                                    int iM5605b2 = AbstractC1004o.m5605b((String) objZza);
                                    iM25433o4 = g9a.m12436m(iM5605b2, iM5605b2, iM25433o4);
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < size3; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof zzev) {
                                    int iMo5681h4 = ((zzev) obj).mo5681h();
                                    iM25433o4 = g9a.m12436m(iMo5681h4, iMo5681h4, iM25433o4);
                                } else {
                                    int iM5605b3 = AbstractC1004o.m5605b((String) obj);
                                    iM25433o4 = g9a.m12436m(iM5605b3, iM5605b3, iM25433o4);
                                }
                            }
                        }
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC0997h, j);
                    lgc lgcVarM5554B3 = m5554B(i5);
                    e41 e41Var8 = AbstractC1003n.f12199a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM25433o5 = 0;
                    } else {
                        iM25433o5 = z3c.m25433o(i7 << 3) * size4;
                        for (int i15 = 0; i15 < size4; i15++) {
                            int iMo5531c4 = ((AbstractC0997h) list6.get(i15)).mo5531c(lgcVarM5554B3);
                            iM25433o5 = g9a.m12436m(iMo5531c4, iMo5531c4, iM25433o5);
                        }
                    }
                    iM12436m += iM25433o5;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var9 = AbstractC1003n.f12199a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM25433o4 = z3c.m25433o(i7 << 3) * size5;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iMo5681h5 = ((zzev) list7.get(i16)).mo5681h();
                            iM25433o4 = g9a.m12436m(iMo5681h5, iMo5681h5, iM25433o4);
                        }
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var10 = AbstractC1003n.f12199a;
                    size = list8.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5592n(list8);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var11 = AbstractC1003n.f12199a;
                    size = list9.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5585g(list9);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM5587i = AbstractC1003n.m5586h(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iM5587i = AbstractC1003n.m5587i(i7, (List) unsafe.getObject(abstractC0997h, j));
                    iM12436m += iM5587i;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var12 = AbstractC1003n.f12199a;
                    size = list10.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5590l(list10);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var13 = AbstractC1003n.f12199a;
                    size = list11.size();
                    if (size == 0) {
                        iM25433o4 = 0;
                    } else {
                        iM5593o = AbstractC1003n.m5591m(list11);
                        iM25433o3 = z3c.m25433o(i7 << 3);
                        iM25433o4 = (iM25433o3 * size) + iM5593o;
                    }
                    iM12436m += iM25433o4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var14 = AbstractC1003n.f12199a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iM12436m = g9a.m12437n(size6, z3c.m25433o(i7 << 3), size6, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var15 = AbstractC1003n.f12199a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iM12436m = g9a.m12437n(size7, z3c.m25433o(i7 << 3), size7, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int iM5589k = AbstractC1003n.m5589k((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5589k > 0) {
                        iM12436m = g9a.m12437n(iM5589k, z3c.m25433o(i7 << 3), iM5589k, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    int iM5593o2 = AbstractC1003n.m5593o((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5593o2 > 0) {
                        iM12436m = g9a.m12437n(iM5593o2, z3c.m25433o(i7 << 3), iM5593o2, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iM5588j = AbstractC1003n.m5588j((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5588j > 0) {
                        iM12436m = g9a.m12437n(iM5588j, z3c.m25433o(i7 << 3), iM5588j, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var16 = AbstractC1003n.f12199a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iM12436m = g9a.m12437n(size8, z3c.m25433o(i7 << 3), size8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var17 = AbstractC1003n.f12199a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iM12436m = g9a.m12437n(size9, z3c.m25433o(i7 << 3), size9, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var18 = AbstractC1003n.f12199a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iM12436m = g9a.m12437n(size10, z3c.m25433o(i7 << 3), size10, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    int iM5592n = AbstractC1003n.m5592n((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5592n > 0) {
                        iM12436m = g9a.m12437n(iM5592n, z3c.m25433o(i7 << 3), iM5592n, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iM5585g = AbstractC1003n.m5585g((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5585g > 0) {
                        iM12436m = g9a.m12437n(iM5585g, z3c.m25433o(i7 << 3), iM5585g, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var19 = AbstractC1003n.f12199a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iM12436m = g9a.m12437n(size11, z3c.m25433o(i7 << 3), size11, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0997h, j);
                    e41 e41Var20 = AbstractC1003n.f12199a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iM12436m = g9a.m12437n(size12, z3c.m25433o(i7 << 3), size12, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    int iM5590l = AbstractC1003n.m5590l((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5590l > 0) {
                        iM12436m = g9a.m12437n(iM5590l, z3c.m25433o(i7 << 3), iM5590l, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case eda.f37086g /* 48 */:
                    int iM5591m = AbstractC1003n.m5591m((List) unsafe.getObject(abstractC0997h, j));
                    if (iM5591m > 0) {
                        iM12436m = g9a.m12437n(iM5591m, z3c.m25433o(i7 << 3), iM5591m, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0997h, j);
                    lgc lgcVarM5554B4 = m5554B(i5);
                    e41 e41Var21 = AbstractC1003n.f12199a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iMo5531c2 = 0;
                    } else {
                        iMo5531c2 = 0;
                        for (int i17 = 0; i17 < size13; i17++) {
                            AbstractC0997h abstractC0997h3 = (AbstractC0997h) list19.get(i17);
                            int iM25433o12 = z3c.m25433o(i7 << 3);
                            iMo5531c2 += abstractC0997h3.mo5531c(lgcVarM5554B4) + iM25433o12 + iM25433o12;
                        }
                    }
                    iM12436m += iMo5531c2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    int i18 = i5 / 3;
                    zzgv zzgvVar = (zzgv) unsafe.getObject(abstractC0997h, j);
                    if (this.f12189b[i18 + i18] != null) {
                        ho2.m13383c();
                        return 0;
                    }
                    if (zzgvVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgvVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        long jM5552z = m5552z(abstractC0997h, j);
                        iM25433o6 = z3c.m25433o(i7 << 3);
                        iM25434p2 = z3c.m25434p(jM5552z);
                        iM12436m += iM25434p2 + iM25433o6;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        long jM5552z2 = m5552z(abstractC0997h, j);
                        iM25433o6 = z3c.m25433o(i7 << 3);
                        iM25434p2 = z3c.m25434p(jM5552z2);
                        iM12436m += iM25434p2 + iM25433o6;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        long jM5550v = m5550v(abstractC0997h, j);
                        iM25433o6 = z3c.m25433o(i7 << 3);
                        iM25434p2 = z3c.m25434p(jM5550v);
                        iM12436m += iM25434p2 + iM25433o6;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 1, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        int i19 = i7 << 3;
                        Object object3 = unsafe.getObject(abstractC0997h, j);
                        if (object3 instanceof zzev) {
                            int iM25433o13 = z3c.m25433o(i19);
                            int iMo5681h6 = ((zzev) object3).mo5681h();
                            iM12436m = g9a.m12437n(iMo5681h6, iMo5681h6, iM25433o13, iM12436m);
                        } else {
                            int iM25433o14 = z3c.m25433o(i19);
                            int iM5605b4 = AbstractC1004o.m5605b((String) object3);
                            iM12436m = g9a.m12437n(iM5605b4, iM5605b4, iM25433o14, iM12436m);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        Object object4 = unsafe.getObject(abstractC0997h, j);
                        lgc lgcVarM5554B5 = m5554B(i5);
                        e41 e41Var22 = AbstractC1003n.f12199a;
                        int iM25433o15 = z3c.m25433o(i7 << 3);
                        int iMo5531c5 = ((AbstractC0997h) object4).mo5531c(lgcVarM5554B5);
                        iM12436m = g9a.m12437n(iMo5531c5, iMo5531c5, iM25433o15, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        zzev zzevVar2 = (zzev) unsafe.getObject(abstractC0997h, j);
                        int iM25433o16 = z3c.m25433o(i7 << 3);
                        int iMo5681h7 = zzevVar2.mo5681h();
                        iM12436m = g9a.m12437n(iMo5681h7, iMo5681h7, iM25433o16, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(m5550v(abstractC0997h, j), z3c.m25433o(i7 << 3), iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        long jM5550v2 = m5550v(abstractC0997h, j);
                        iM25433o6 = z3c.m25433o(i7 << 3);
                        iM25434p2 = z3c.m25434p(jM5550v2);
                        iM12436m += iM25434p2 + iM25433o6;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 4, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        iM12436m = g9a.m12436m(i7 << 3, 8, iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        int iM5550v = m5550v(abstractC0997h, j);
                        iM12436m = g9a.m12436m((iM5550v >> 31) ^ (iM5550v + iM5550v), z3c.m25433o(i7 << 3), iM12436m);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        long jM5552z3 = m5552z(abstractC0997h, j);
                        iM25433o6 = z3c.m25433o(i7 << 3);
                        iM25434p2 = z3c.m25434p((jM5552z3 >> 63) ^ (jM5552z3 + jM5552z3));
                        iM12436m += iM25434p2 + iM25433o6;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (m5574s(i7, abstractC0997h, i5)) {
                        AbstractC0997h abstractC0997h4 = (AbstractC0997h) unsafe.getObject(abstractC0997h, j);
                        lgc lgcVarM5554B6 = m5554B(i5);
                        e41 e41Var23 = AbstractC1003n.f12199a;
                        int iM25433o17 = z3c.m25433o(i7 << 3);
                        i2 = iM25433o17 + iM25433o17;
                        iMo5531c = abstractC0997h4.mo5531c(lgcVarM5554B6);
                        iM5587i = iMo5531c + i2;
                        iM12436m += iM5587i;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i5 += 3;
                    i3 = 1048575;
                    break;
            }
        }
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: e */
    public final void mo5561e(Object obj, byte[] bArr, int i, int i2, C0787av c0787av) throws zzgc {
        m5575t(obj, bArr, i, i2, 0, c0787av);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.lgc
    /* JADX INFO: renamed from: f */
    public final int mo5562f(AbstractC0998i abstractC0998i) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i5 >= iArr.length) {
                return abstractC0998i.zzc.hashCode() + (i6 * 53);
            }
            int iM5577y = m5577y(i5);
            int i7 = 1048575 & iM5577y;
            int iM5551x = m5551x(iM5577y);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iM5551x) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(lkc.f49786c.mo4818a(abstractC0998i, j));
                    Charset charset = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(lkc.f49786c.mo4819c(abstractC0998i, j));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = lkc.m16337f(abstractC0998i, j);
                    Charset charset2 = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = lkc.m16337f(abstractC0998i, j);
                    Charset charset3 = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = lkc.m16337f(abstractC0998i, j);
                    Charset charset4 = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zMo4824m = lkc.f49786c.mo4824m(abstractC0998i, j);
                    Charset charset5 = m9c.f50823a;
                    if (zMo4824m) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) lkc.m16339h(abstractC0998i, j)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objM16339h = lkc.m16339h(abstractC0998i, j);
                    if (objM16339h != null) {
                        iHashCode = objM16339h.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = lkc.m16337f(abstractC0998i, j);
                    Charset charset6 = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16336e(abstractC0998i, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = lkc.m16337f(abstractC0998i, j);
                    Charset charset7 = m9c.f50823a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objM16339h2 = lkc.m16339h(abstractC0998i, j);
                    if (objM16339h2 != null) {
                        iHashCode = objM16339h2.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case eda.f37086g /* 48 */:
                case 49:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) lkc.m16339h(abstractC0998i, j)).doubleValue());
                        Charset charset8 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) lkc.m16339h(abstractC0998i, j)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m5552z(abstractC0998i, j);
                        Charset charset9 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m5552z(abstractC0998i, j);
                        Charset charset10 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m5552z(abstractC0998i, j);
                        Charset charset11 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) lkc.m16339h(abstractC0998i, j)).booleanValue();
                        Charset charset12 = m9c.f50823a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) lkc.m16339h(abstractC0998i, j)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m5552z(abstractC0998i, j);
                        Charset charset13 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = m5550v(abstractC0998i, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i = i6 * 53;
                        jDoubleToLongBits = m5552z(abstractC0998i, j);
                        Charset charset14 = m9c.f50823a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (m5574s(i8, abstractC0998i, i5)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = lkc.m16339h(abstractC0998i, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.lgc
    /* JADX INFO: renamed from: g */
    public final void mo5563g(Object obj, Object obj2) {
        Object obj3;
        if (!m5548r(obj)) {
            C3386nv.m17626m("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i >= iArr.length) {
                AbstractC1003n.m5594p(obj, obj2);
                return;
            }
            int iM5577y = m5577y(i);
            int i2 = iM5577y & 1048575;
            int iM5551x = m5551x(iM5577y);
            int i3 = iArr[i];
            long j = i2;
            switch (iM5551x) {
                case 0:
                    if (!m5572p(i, obj2)) {
                        obj3 = obj;
                    } else {
                        sjb sjbVar = lkc.f49786c;
                        obj3 = obj;
                        sjbVar.mo4822h(obj3, j, sjbVar.mo4818a(obj2, j));
                        m5568l(i, obj3);
                    }
                    break;
                case 1:
                    if (m5572p(i, obj2)) {
                        sjb sjbVar2 = lkc.f49786c;
                        sjbVar2.mo4823k(obj, j, sjbVar2.mo4819c(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m5572p(i, obj2)) {
                        lkc.m16342k(obj, j, lkc.m16337f(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m5572p(i, obj2)) {
                        lkc.m16342k(obj, j, lkc.m16337f(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m5572p(i, obj2)) {
                        lkc.m16342k(obj, j, lkc.m16337f(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m5572p(i, obj2)) {
                        sjb sjbVar3 = lkc.f49786c;
                        sjbVar3.mo4820e(obj, j, sjbVar3.mo4824m(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m5572p(i, obj2)) {
                        lkc.m16343l(obj, j, lkc.m16339h(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m5566j(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m5572p(i, obj2)) {
                        lkc.m16343l(obj, j, lkc.m16339h(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m5572p(i, obj2)) {
                        lkc.m16342k(obj, j, lkc.m16337f(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m5572p(i, obj2)) {
                        lkc.m16341j(j, obj, lkc.m16336e(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m5572p(i, obj2)) {
                        lkc.m16342k(obj, j, lkc.m16337f(obj2, j));
                        m5568l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m5566j(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case eda.f37086g /* 48 */:
                case 49:
                    e9c e9cVarMo10949p = (e9c) lkc.m16339h(obj, j);
                    e9c e9cVar = (e9c) lkc.m16339h(obj2, j);
                    int size = e9cVarMo10949p.size();
                    int size2 = e9cVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((s1c) e9cVarMo10949p).m21005f()) {
                            e9cVarMo10949p = e9cVarMo10949p.mo10949p(size2 + size);
                        }
                        e9cVarMo10949p.addAll(e9cVar);
                    }
                    if (size > 0) {
                        e9cVar = e9cVarMo10949p;
                    }
                    lkc.m16343l(obj, j, e9cVar);
                    obj3 = obj;
                    break;
                case 50:
                    e41 e41Var = AbstractC1003n.f12199a;
                    zzgv zzgvVarM5690b = (zzgv) lkc.m16339h(obj, j);
                    zzgv zzgvVar = (zzgv) lkc.m16339h(obj2, j);
                    if (!zzgvVar.isEmpty()) {
                        if (!zzgvVarM5690b.m5693e()) {
                            zzgvVarM5690b = zzgvVarM5690b.m5690b();
                        }
                        zzgvVarM5690b.m5692d(zzgvVar);
                    }
                    lkc.m16343l(obj, j, zzgvVarM5690b);
                    obj3 = obj;
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
                    if (m5574s(i3, obj2, i)) {
                        lkc.m16343l(obj, j, lkc.m16339h(obj2, j));
                        lkc.m16341j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m5567k(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m5574s(i3, obj2, i)) {
                        lkc.m16343l(obj, j, lkc.m16339h(obj2, j));
                        lkc.m16341j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m5567k(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.lgc
    /* JADX INFO: renamed from: h */
    public final void mo5564h(Object obj, gw9 gw9Var) throws zzfa {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        z3c z3cVar = (z3c) gw9Var.f41432b;
        Unsafe unsafe = f12187k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i7 >= iArr.length) {
                ((AbstractC0998i) obj).zzc.m14507d(gw9Var);
                return;
            }
            int iM5577y = m5577y(i7);
            int iM5551x = m5551x(iM5577y);
            int i9 = iArr[i7];
            if (iM5551x <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iM5577y & i5;
            char c2 = 3;
            switch (iM5551x) {
                case 0:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25440f(i9, Double.doubleToRawLongBits(lkc.f49786c.mo4818a(obj, j)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25438d(i9, Float.floatToRawIntBits(lkc.f49786c.mo4819c(obj, j)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25447m(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25447m(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25442h(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25440f(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25438d(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        boolean zMo4824m = lkc.f49786c.mo4824m(obj, j);
                        z3cVar.m25446l(i9 << 3);
                        z3cVar.m25435a(zMo4824m ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            z3cVar.m25446l((i9 << 3) | 2);
                            int i12 = z3cVar.f70847c;
                            byte[] bArr = z3cVar.f70846b;
                            int i13 = z3cVar.f70848d;
                            try {
                                int iM25433o = z3c.m25433o(str.length() * 3);
                                int iM25433o2 = z3c.m25433o(str.length());
                                if (iM25433o2 == iM25433o) {
                                    int i14 = i13 + iM25433o2;
                                    z3cVar.f70848d = i14;
                                    int iM5604a = AbstractC1004o.m5604a(str, bArr, i14, i12 - i14);
                                    z3cVar.f70848d = i13;
                                    z3cVar.m25446l((iM5604a - i13) - iM25433o2);
                                    z3cVar.f70848d = iM5604a;
                                } else {
                                    z3cVar.m25446l(AbstractC1004o.m5605b(str));
                                    int i15 = z3cVar.f70848d;
                                    z3cVar.f70848d = AbstractC1004o.m5604a(str, bArr, i15, i12 - i15);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new zzfa(e);
                            }
                        } else {
                            z3cVar.m25437c(i9, (zzev) object);
                        }
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        gw9Var.m12944o(i9, unsafe.getObject(obj, j), m5554B(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25437c(i9, (zzev) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25445k(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25442h(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25438d(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        z3cVar.m25440f(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(obj, j);
                        z3cVar.m25445k(i9, (i16 >> 31) ^ (i16 + i16));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        z3cVar.m25447m(i9, (j2 >> 63) ^ (j2 + j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (m5573q(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        z3cVar.m25444j(i9, 3);
                        m5554B(i7).mo5564h((AbstractC0997h) object2, gw9Var);
                        z3cVar.m25444j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    i2 = i7;
                    AbstractC1003n.m5596r(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    i2 = i7;
                    AbstractC1003n.m5600v(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    i2 = i7;
                    AbstractC1003n.m5602x(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    i2 = i7;
                    AbstractC1003n.m5583e(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    i2 = i7;
                    AbstractC1003n.m5601w(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    i2 = i7;
                    AbstractC1003n.m5599u(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    i2 = i7;
                    AbstractC1003n.m5598t(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    i2 = i7;
                    AbstractC1003n.m5595q(iArr[i2], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    int i17 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    e41 e41Var = AbstractC1003n.f12199a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof yac) {
                            yac yacVar = (yac) list;
                            int i18 = 0;
                            while (i18 < list.size()) {
                                Object objZza = yacVar.zza();
                                if (objZza instanceof String) {
                                    String str2 = (String) objZza;
                                    z3cVar.m25446l((i17 << 3) | 2);
                                    int i19 = z3cVar.f70847c;
                                    byte[] bArr2 = z3cVar.f70846b;
                                    c = c2;
                                    int i20 = z3cVar.f70848d;
                                    try {
                                        int iM25433o3 = z3c.m25433o(str2.length() * 3);
                                        i4 = i7;
                                        int iM25433o4 = z3c.m25433o(str2.length());
                                        if (iM25433o4 == iM25433o3) {
                                            int i21 = i20 + iM25433o4;
                                            z3cVar.f70848d = i21;
                                            int iM5604a2 = AbstractC1004o.m5604a(str2, bArr2, i21, i19 - i21);
                                            z3cVar.f70848d = i20;
                                            z3cVar.m25446l((iM5604a2 - i20) - iM25433o4);
                                            z3cVar.f70848d = iM5604a2;
                                        } else {
                                            z3cVar.m25446l(AbstractC1004o.m5605b(str2));
                                            int i22 = z3cVar.f70848d;
                                            z3cVar.f70848d = AbstractC1004o.m5604a(str2, bArr2, i22, i19 - i22);
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        throw new zzfa(e2);
                                    }
                                } else {
                                    i4 = i7;
                                    c = c2;
                                    z3cVar.m25437c(i17, (zzev) objZza);
                                }
                                i18++;
                                c2 = c;
                                i7 = i4;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                String str3 = (String) list.get(i23);
                                z3cVar.m25446l((i17 << 3) | 2);
                                int i24 = z3cVar.f70847c;
                                byte[] bArr3 = z3cVar.f70846b;
                                int i25 = z3cVar.f70848d;
                                try {
                                    int iM25433o5 = z3c.m25433o(str3.length() * 3);
                                    int iM25433o6 = z3c.m25433o(str3.length());
                                    if (iM25433o6 == iM25433o5) {
                                        int i26 = i25 + iM25433o6;
                                        z3cVar.f70848d = i26;
                                        int iM5604a3 = AbstractC1004o.m5604a(str3, bArr3, i26, i24 - i26);
                                        z3cVar.f70848d = i25;
                                        z3cVar.m25446l((iM5604a3 - i25) - iM25433o6);
                                        z3cVar.f70848d = iM5604a3;
                                    } else {
                                        z3cVar.m25446l(AbstractC1004o.m5605b(str3));
                                        int i27 = z3cVar.f70848d;
                                        z3cVar.f70848d = AbstractC1004o.m5604a(str3, bArr3, i27, i24 - i27);
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new zzfa(e3);
                                }
                            }
                        }
                        i7 = i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    int i28 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    lgc lgcVarM5554B = m5554B(i7);
                    e41 e41Var2 = AbstractC1003n.f12199a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i29 = 0; i29 < list2.size(); i29++) {
                            gw9Var.m12944o(i28, list2.get(i29), lgcVarM5554B);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    int i30 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    e41 e41Var3 = AbstractC1003n.f12199a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i31 = 0; i31 < list3.size(); i31++) {
                            z3cVar.m25437c(i30, (zzev) list3.get(i31));
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    AbstractC1003n.m5582d(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    AbstractC1003n.m5597s(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC1003n.m5603y(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    AbstractC1003n.m5579a(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    AbstractC1003n.m5580b(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    AbstractC1003n.m5581c(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC1003n.m5596r(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC1003n.m5600v(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC1003n.m5602x(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    AbstractC1003n.m5583e(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC1003n.m5601w(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC1003n.m5599u(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC1003n.m5598t(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    AbstractC1003n.m5595q(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    AbstractC1003n.m5582d(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC1003n.m5597s(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC1003n.m5603y(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    AbstractC1003n.m5579a(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    AbstractC1003n.m5580b(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC1003n.m5581c(iArr[i7], (List) unsafe.getObject(obj, j), gw9Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    int i32 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    lgc lgcVarM5554B2 = m5554B(i7);
                    e41 e41Var4 = AbstractC1003n.f12199a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i33 = 0; i33 < list4.size(); i33++) {
                            AbstractC0997h abstractC0997h = (AbstractC0997h) list4.get(i33);
                            z3cVar.m25444j(i32, 3);
                            lgcVarM5554B2.mo5564h(abstractC0997h, gw9Var);
                            z3cVar.m25444j(i32, 4);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i34 = i7 / 3;
                        throw g9a.m12430g(this.f12189b[i34 + i34]);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25440f(i9, Double.doubleToRawLongBits(((Double) lkc.m16339h(obj, j)).doubleValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25438d(i9, Float.floatToRawIntBits(((Float) lkc.m16339h(obj, j)).floatValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25447m(i9, m5552z(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25447m(i9, m5552z(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25442h(i9, m5550v(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25440f(i9, m5552z(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25438d(i9, m5550v(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (m5574s(i9, obj, i7)) {
                        boolean zBooleanValue = ((Boolean) lkc.m16339h(obj, j)).booleanValue();
                        z3cVar.m25446l(i9 << 3);
                        z3cVar.m25435a(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (m5574s(i9, obj, i7)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            String str4 = (String) object3;
                            z3cVar.m25446l((i9 << 3) | 2);
                            int i35 = z3cVar.f70847c;
                            byte[] bArr4 = z3cVar.f70846b;
                            int i36 = z3cVar.f70848d;
                            try {
                                int iM25433o7 = z3c.m25433o(str4.length() * 3);
                                int iM25433o8 = z3c.m25433o(str4.length());
                                if (iM25433o8 == iM25433o7) {
                                    int i37 = i36 + iM25433o8;
                                    z3cVar.f70848d = i37;
                                    int iM5604a4 = AbstractC1004o.m5604a(str4, bArr4, i37, i35 - i37);
                                    z3cVar.f70848d = i36;
                                    z3cVar.m25446l((iM5604a4 - i36) - iM25433o8);
                                    z3cVar.f70848d = iM5604a4;
                                } else {
                                    z3cVar.m25446l(AbstractC1004o.m5605b(str4));
                                    int i38 = z3cVar.f70848d;
                                    z3cVar.f70848d = AbstractC1004o.m5604a(str4, bArr4, i38, i35 - i38);
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new zzfa(e4);
                            }
                        } else {
                            z3cVar.m25437c(i9, (zzev) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (m5574s(i9, obj, i7)) {
                        gw9Var.m12944o(i9, unsafe.getObject(obj, j), m5554B(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25437c(i9, (zzev) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25445k(i9, m5550v(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25442h(i9, m5550v(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25438d(i9, m5550v(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (m5574s(i9, obj, i7)) {
                        z3cVar.m25440f(i9, m5552z(obj, j));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (m5574s(i9, obj, i7)) {
                        int iM5550v = m5550v(obj, j);
                        z3cVar.m25445k(i9, (iM5550v >> 31) ^ (iM5550v + iM5550v));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (m5574s(i9, obj, i7)) {
                        long jM5552z = m5552z(obj, j);
                        z3cVar.m25447m(i9, (jM5552z >> 63) ^ (jM5552z + jM5552z));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (m5574s(i9, obj, i7)) {
                        Object object4 = unsafe.getObject(obj, j);
                        z3cVar.m25444j(i9, 3);
                        m5554B(i7).mo5564h((AbstractC0997h) object4, gw9Var);
                        z3cVar.m25444j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    @Override // p000.lgc
    /* JADX INFO: renamed from: i */
    public final boolean mo5565i(AbstractC0998i abstractC0998i, AbstractC0998i abstractC0998i2) {
        boolean zM5584f;
        int i = 0;
        while (true) {
            int[] iArr = this.f12188a;
            if (i < iArr.length) {
                int iM5577y = m5577y(i);
                long j = iM5577y & 1048575;
                switch (m5551x(iM5577y)) {
                    case 0:
                        if (m5571o(abstractC0998i, abstractC0998i2, i)) {
                            sjb sjbVar = lkc.f49786c;
                            if (Double.doubleToLongBits(sjbVar.mo4818a(abstractC0998i, j)) == Double.doubleToLongBits(sjbVar.mo4818a(abstractC0998i2, j))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (m5571o(abstractC0998i, abstractC0998i2, i)) {
                            sjb sjbVar2 = lkc.f49786c;
                            if (Float.floatToIntBits(sjbVar2.mo4819c(abstractC0998i, j)) == Float.floatToIntBits(sjbVar2.mo4819c(abstractC0998i2, j))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16337f(abstractC0998i, j) == lkc.m16337f(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16337f(abstractC0998i, j) == lkc.m16337f(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16337f(abstractC0998i, j) == lkc.m16337f(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (m5571o(abstractC0998i, abstractC0998i2, i)) {
                            sjb sjbVar3 = lkc.f49786c;
                            if (sjbVar3.mo4824m(abstractC0998i, j) == sjbVar3.mo4824m(abstractC0998i2, j)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16337f(abstractC0998i, j) == lkc.m16337f(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16336e(abstractC0998i, j) == lkc.m16336e(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && lkc.m16337f(abstractC0998i, j) == lkc.m16337f(abstractC0998i2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (m5571o(abstractC0998i, abstractC0998i2, i) && AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case 30:
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 38:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case 42:
                    case 43:
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case eda.f37086g /* 48 */:
                    case 49:
                        zM5584f = AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j));
                        break;
                    case 50:
                        zM5584f = AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j));
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
                        long j2 = iArr[i + 2] & 1048575;
                        if (lkc.m16336e(abstractC0998i, j2) == lkc.m16336e(abstractC0998i2, j2) && AbstractC1003n.m5584f(lkc.m16339h(abstractC0998i, j), lkc.m16339h(abstractC0998i2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zM5584f) {
                    i += 3;
                }
            } else if (abstractC0998i.zzc.equals(abstractC0998i2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m5566j(int i, Object obj, Object obj2) {
        if (m5572p(i, obj2)) {
            int iM5577y = m5577y(i) & 1048575;
            Unsafe unsafe = f12187k;
            long j = iM5577y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                C3386nv.m17633t(g9a.m12431h("Source subfield ", this.f12188a[i], " is present but null: ", obj2.toString()));
                return;
            }
            lgc lgcVarM5554B = m5554B(i);
            if (!m5572p(i, obj)) {
                if (m5548r(object)) {
                    AbstractC0998i abstractC0998iMo5558b = lgcVarM5554B.mo5558b();
                    lgcVarM5554B.mo5563g(abstractC0998iMo5558b, object);
                    unsafe.putObject(obj, j, abstractC0998iMo5558b);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m5568l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m5548r(object2)) {
                AbstractC0998i abstractC0998iMo5558b2 = lgcVarM5554B.mo5558b();
                lgcVarM5554B.mo5563g(abstractC0998iMo5558b2, object2);
                unsafe.putObject(obj, j, abstractC0998iMo5558b2);
                object2 = abstractC0998iMo5558b2;
            }
            lgcVarM5554B.mo5563g(object2, object);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5567k(int i, Object obj, Object obj2) {
        int[] iArr = this.f12188a;
        int i2 = iArr[i];
        if (m5574s(i2, obj2, i)) {
            int iM5577y = m5577y(i) & 1048575;
            Unsafe unsafe = f12187k;
            long j = iM5577y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                C3386nv.m17633t(g9a.m12431h("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            lgc lgcVarM5554B = m5554B(i);
            if (!m5574s(i2, obj, i)) {
                if (m5548r(object)) {
                    AbstractC0998i abstractC0998iMo5558b = lgcVarM5554B.mo5558b();
                    lgcVarM5554B.mo5563g(abstractC0998iMo5558b, object);
                    unsafe.putObject(obj, j, abstractC0998iMo5558b);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                lkc.m16341j(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m5548r(object2)) {
                AbstractC0998i abstractC0998iMo5558b2 = lgcVarM5554B.mo5558b();
                lgcVarM5554B.mo5563g(abstractC0998iMo5558b2, object2);
                unsafe.putObject(obj, j, abstractC0998iMo5558b2);
                object2 = abstractC0998iMo5558b2;
            }
            lgcVarM5554B.mo5563g(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5568l(int i, Object obj) {
        int i2 = this.f12188a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        lkc.m16341j(j, obj, (1 << (i2 >>> 20)) | lkc.m16336e(obj, j));
    }

    /* JADX INFO: renamed from: m */
    public final void m5569m(int i, Object obj, Object obj2) {
        f12187k.putObject(obj, m5577y(i) & 1048575, obj2);
        m5568l(i, obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m5570n(Object obj, int i, int i2, Object obj2) {
        f12187k.putObject(obj, m5577y(i2) & 1048575, obj2);
        lkc.m16341j(this.f12188a[i2 + 2] & 1048575, obj, i);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5571o(AbstractC0998i abstractC0998i, AbstractC0998i abstractC0998i2, int i) {
        return m5572p(i, abstractC0998i) == m5572p(i, abstractC0998i2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: p */
    public final boolean m5572p(int i, Object obj) {
        int i2 = this.f12188a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & lkc.m16336e(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM5577y = m5577y(i);
        long j2 = iM5577y & 1048575;
        switch (m5551x(iM5577y)) {
            case 0:
                if (Double.doubleToRawLongBits(lkc.f49786c.mo4818a(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(lkc.f49786c.mo4819c(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (lkc.m16337f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (lkc.m16337f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (lkc.m16337f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return lkc.f49786c.mo4824m(obj, j2);
            case 8:
                Object objM16339h = lkc.m16339h(obj, j2);
                if (objM16339h instanceof String) {
                    if (((String) objM16339h).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM16339h instanceof zzev)) {
                    ij6.m13959q();
                    return false;
                }
                if (zzev.f12230b.equals(objM16339h)) {
                    return false;
                }
                return true;
            case 9:
                if (lkc.m16339h(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (zzev.f12230b.equals(lkc.m16339h(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (lkc.m16337f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (lkc.m16336e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (lkc.m16337f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (lkc.m16339h(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5573q(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m5572p(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5574s(int i, Object obj, int i2) {
        return lkc.m16336e(obj, (long) (this.f12188a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:493:0x0bec A[PHI: r3 r4 r8 r11 r14 r21
      0x0bec: PHI (r3v104 av) = 
      (r3v75 av)
      (r3v76 av)
      (r3v77 av)
      (r3v78 av)
      (r3v79 av)
      (r3v81 av)
      (r3v83 av)
      (r3v84 av)
      (r3v87 av)
      (r3v95 av)
      (r3v105 av)
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r4v82 byte[]) = 
      (r4v53 byte[])
      (r4v54 byte[])
      (r4v55 byte[])
      (r4v56 byte[])
      (r4v57 byte[])
      (r4v59 byte[])
      (r4v61 byte[])
      (r4v63 byte[])
      (r4v65 byte[])
      (r4v72 byte[])
      (r4v83 byte[])
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r8v33 jjc) = 
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v4 jjc)
      (r8v27 jjc)
      (r8v4 jjc)
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r11v24 int) = 
      (r11v8 int)
      (r11v9 int)
      (r11v10 int)
      (r11v11 int)
      (r11v12 int)
      (r11v14 int)
      (r11v16 int)
      (r11v17 int)
      (r11v18 int)
      (r11v20 int)
      (r11v25 int)
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r14v65 int) = 
      (r14v42 int)
      (r14v43 int)
      (r14v44 int)
      (r14v45 int)
      (r14v46 int)
      (r14v48 int)
      (r14v50 int)
      (r14v51 int)
      (r14v52 int)
      (r14v57 int)
      (r14v66 int)
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]
      0x0bec: PHI (r21v50 int) = 
      (r21v28 int)
      (r21v29 int)
      (r21v30 int)
      (r21v31 int)
      (r21v32 int)
      (r21v34 int)
      (r21v36 int)
      (r21v37 int)
      (r21v38 int)
      (r11v3 int)
      (r21v51 int)
     binds: [B:491:0x0bd4, B:488:0x0bb3, B:485:0x0b96, B:482:0x0b7a, B:479:0x0b5e, B:475:0x0b3f, B:467:0x0b17, B:453:0x0ad8, B:451:0x0abf, B:426:0x0a0d, B:416:0x09ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:586:0x0929 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x0bef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x093d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0c01 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final int m5575t(Object obj, byte[] bArr, int i, int i2, int i3, C0787av c0787av) throws zzgc {
        Object[] objArr;
        Unsafe unsafe;
        int[] iArr;
        int i4;
        byte[] bArr2;
        int i5;
        int i6;
        int i7;
        C0787av c0787av2;
        int i8;
        int i9;
        C0787av c0787av3;
        Object obj2;
        int i10;
        int i11;
        byte[] bArr3;
        int i12;
        Unsafe unsafe2;
        Object obj3;
        C0787av c0787av4;
        Object obj4;
        Unsafe unsafe3;
        byte[] bArr4;
        Unsafe unsafe4;
        byte[] bArr5;
        int i13;
        int i14;
        int iM15150j;
        C0787av c0787av5;
        int i15;
        int i16;
        int iM15153m;
        byte[] bArr6;
        C0787av c0787av6;
        int i17;
        jjc jjcVar;
        s1c s1cVar;
        byte[] bArr7;
        int i18;
        C0787av c0787av7;
        Unsafe unsafe5;
        int i19;
        byte[] bArr8;
        int i20;
        C0787av c0787av8;
        C0787av c0787av9;
        int iM15147g;
        int iM15150j2;
        byte[] bArr9;
        int i21;
        int i22;
        int i23;
        int iM15147g2;
        s1c s1cVar2;
        int i24;
        s8c s8cVar;
        jjc jjcVarM14504b;
        byte[] bArr10;
        int i25;
        int i26;
        int iM15150j3;
        C1001l c1001l = this;
        Object obj5 = obj;
        byte[] bArr11 = bArr;
        i2 = i2;
        C0787av c0787av10 = c0787av;
        if (!m5548r(obj5)) {
            C3386nv.m17626m("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        Unsafe unsafe6 = f12187k;
        int iM15149i = i;
        int i27 = -1;
        int iM5576w = 0;
        int i28 = 1048575;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            int i31 = 1048575;
            while (true) {
                objArr = c1001l.f12189b;
                int[] iArr2 = c1001l.f12188a;
                if (iM15149i < i2) {
                    int iM15151k = iM15149i + 1;
                    int i32 = bArr11[iM15149i];
                    if (i32 < 0) {
                        iM15151k = kdd.m15151k(i32, bArr11, iM15151k, c0787av10);
                        i32 = c0787av10.f7540a;
                    }
                    int i33 = iM15151k;
                    i30 = i32;
                    int i34 = (i30 == true ? 1 : 0) >>> 3;
                    int i35 = c1001l.f12191d;
                    int i36 = c1001l.f12190c;
                    iM5576w = i34 > i27 ? (i34 < i36 || i34 > i35) ? -1 : c1001l.m5576w(i34, iM5576w / 3) : (i34 < i36 || i34 > i35) ? -1 : c1001l.m5576w(i34, 0);
                    jjc jjcVar2 = jjc.f45639f;
                    if (iM5576w == -1) {
                        bArr2 = bArr;
                        i3 = i3;
                        unsafe = unsafe6;
                        i5 = i28;
                        iArr = iArr2;
                        objArr = objArr;
                        i6 = i29;
                        i7 = i30 == true ? 1 : 0;
                        iM5576w = 0;
                        c0787av2 = c0787av;
                        obj5 = obj5;
                        i8 = i34;
                        iM15149i = i33;
                    } else {
                        int i37 = (i30 == true ? 1 : 0) & 7;
                        int i38 = iArr2[iM5576w + 1];
                        int iM5551x = m5551x(i38);
                        long j = i38 & i31;
                        iArr = iArr2;
                        if (iM5551x <= 17) {
                            int i39 = iArr[iM5576w + 2];
                            int i40 = 1 << (i39 >>> 20);
                            int i41 = i39 & i31;
                            if (i41 != i28) {
                                int i42 = i31;
                                if (i28 != i42) {
                                    unsafe6.putInt(obj5, i28, i29);
                                    i42 = 1048575;
                                }
                                int i43 = i41 == i42 ? 0 : unsafe6.getInt(obj5, i41);
                                i9 = i41;
                                i29 = i43;
                            } else {
                                i9 = i28;
                            }
                            switch (iM5551x) {
                                case 0:
                                    c0787av3 = c0787av;
                                    obj2 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    bArr3 = bArr;
                                    i29 = i29;
                                    i12 = i34;
                                    if (i37 == 1) {
                                        int i44 = i11 + 8;
                                        i29 |= i40;
                                        double dLongBitsToDouble = Double.longBitsToDouble(kdd.m15156p(i11, bArr3));
                                        obj5 = obj2;
                                        lkc.f49786c.mo4822h(obj5, j, dLongBitsToDouble);
                                        iM15149i = i44;
                                        unsafe6 = unsafe6;
                                        bArr11 = bArr3;
                                        c0787av10 = c0787av3;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    Object obj6 = obj2;
                                    unsafe2 = unsafe6;
                                    obj3 = obj6;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 1:
                                    c0787av3 = c0787av;
                                    obj2 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    bArr3 = bArr;
                                    i29 = i29;
                                    i12 = i34;
                                    if (i37 == 5) {
                                        iM15149i = i11 + 4;
                                        i29 |= i40;
                                        lkc.f49786c.mo4823k(obj2, j, Float.intBitsToFloat(kdd.m15143c(i11, bArr3)));
                                        obj5 = obj2;
                                        bArr11 = bArr3;
                                        c0787av10 = c0787av3;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    Object obj7 = obj2;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 2:
                                case 3:
                                    c0787av3 = c0787av;
                                    obj2 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    bArr3 = bArr;
                                    i29 = i29;
                                    i12 = i34;
                                    if (i37 == 0) {
                                        i29 |= i40;
                                        int iM15153m2 = kdd.m15153m(bArr3, i11, c0787av3);
                                        obj5 = obj2;
                                        unsafe6.putLong(obj5, j, c0787av3.f7541b);
                                        iM15149i = iM15153m2;
                                        bArr11 = bArr3;
                                        c0787av10 = c0787av3;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    Object obj8 = obj2;
                                    unsafe2 = unsafe6;
                                    obj3 = obj8;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 4:
                                case 11:
                                    c0787av3 = c0787av;
                                    obj2 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    bArr3 = bArr;
                                    i29 = i29;
                                    i12 = i34;
                                    if (i37 == 0) {
                                        i29 |= i40;
                                        iM15149i = kdd.m15150j(bArr3, i11, c0787av3);
                                        unsafe6.putInt(obj2, j, c0787av3.f7540a);
                                        obj5 = obj2;
                                        bArr11 = bArr3;
                                        c0787av10 = c0787av3;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    Object obj9 = obj2;
                                    unsafe2 = unsafe6;
                                    obj3 = obj9;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 5:
                                case 14:
                                    c0787av4 = c0787av;
                                    obj4 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    i29 = i29;
                                    i12 = i34;
                                    unsafe3 = unsafe6;
                                    bArr4 = bArr;
                                    if (i37 == 1) {
                                        int i45 = i11 + 8;
                                        long jM15156p = kdd.m15156p(i11, bArr4);
                                        c0787av3 = c0787av4;
                                        bArr3 = bArr4;
                                        obj5 = obj4;
                                        unsafe6 = unsafe3;
                                        unsafe6.putLong(obj5, j, jM15156p);
                                        iM15149i = i45;
                                        i29 |= i40;
                                        bArr11 = bArr3;
                                        c0787av10 = c0787av3;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    bArr3 = bArr4;
                                    c0787av3 = c0787av4;
                                    obj3 = obj4;
                                    unsafe2 = unsafe3;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 6:
                                case 13:
                                    c0787av4 = c0787av;
                                    obj4 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    i29 = i29;
                                    i12 = i34;
                                    unsafe3 = unsafe6;
                                    bArr4 = bArr;
                                    if (i37 == 5) {
                                        iM15149i = i11 + 4;
                                        i14 = i29 | i40;
                                        unsafe3.putInt(obj4, j, kdd.m15143c(i11, bArr4));
                                        int i46 = i14;
                                        bArr11 = bArr4;
                                        unsafe6 = unsafe3;
                                        i29 = i46;
                                        c0787av10 = c0787av4;
                                        obj5 = obj4;
                                        i28 = i10;
                                        i27 = i12;
                                        i31 = 1048575;
                                        i2 = i2;
                                    } else {
                                        bArr3 = bArr4;
                                        c0787av3 = c0787av4;
                                        obj3 = obj4;
                                        unsafe2 = unsafe3;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                                case 7:
                                    c0787av4 = c0787av;
                                    obj4 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    i29 = i29;
                                    i12 = i34;
                                    unsafe3 = unsafe6;
                                    bArr4 = bArr;
                                    if (i37 == 0) {
                                        i14 = i29 | i40;
                                        iM15149i = kdd.m15153m(bArr4, i11, c0787av4);
                                        lkc.f49786c.mo4820e(obj4, j, c0787av4.f7541b != 0);
                                        int i47 = i14;
                                        bArr11 = bArr4;
                                        unsafe6 = unsafe3;
                                        i29 = i47;
                                        c0787av10 = c0787av4;
                                        obj5 = obj4;
                                        i28 = i10;
                                        i27 = i12;
                                        i31 = 1048575;
                                        i2 = i2;
                                    } else {
                                        bArr3 = bArr4;
                                        c0787av3 = c0787av4;
                                        obj3 = obj4;
                                        unsafe2 = unsafe3;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                                case 8:
                                    c0787av4 = c0787av;
                                    obj4 = obj5;
                                    i10 = i9;
                                    i11 = i33;
                                    i29 = i29;
                                    i12 = i34;
                                    unsafe3 = unsafe6;
                                    bArr4 = bArr;
                                    if (i37 == 2) {
                                        if ((i38 & 536870912) != 0) {
                                            i14 = i29 | i40;
                                            iM15150j = kdd.m15148h(bArr4, i11, c0787av4);
                                        } else {
                                            iM15150j = kdd.m15150j(bArr4, i11, c0787av4);
                                            int i48 = c0787av4.f7540a;
                                            if (i48 < 0) {
                                                fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            int i49 = i29 | i40;
                                            if (i48 == 0) {
                                                c0787av4.f7542c = "";
                                            } else {
                                                c0787av4.f7542c = new String(bArr4, iM15150j, i48, m9c.f50823a);
                                                iM15150j += i48;
                                            }
                                            i14 = i49;
                                        }
                                        iM15149i = iM15150j;
                                        unsafe3.putObject(obj4, j, c0787av4.f7542c);
                                        int i410 = i14;
                                        bArr11 = bArr4;
                                        unsafe6 = unsafe3;
                                        i29 = i410;
                                        c0787av10 = c0787av4;
                                        obj5 = obj4;
                                        i28 = i10;
                                        i27 = i12;
                                        i31 = 1048575;
                                        i2 = i2;
                                    } else {
                                        bArr3 = bArr4;
                                        c0787av3 = c0787av4;
                                        obj3 = obj4;
                                        unsafe2 = unsafe3;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                                case 9:
                                    Object obj10 = obj5;
                                    Unsafe unsafe7 = unsafe6;
                                    c0787av10 = c0787av;
                                    i10 = i9;
                                    i12 = i34;
                                    if (i37 == 2) {
                                        i29 |= i40;
                                        Object objM5555C = c1001l.m5555C(iM5576w, obj10);
                                        obj4 = obj10;
                                        int iM15155o = kdd.m15155o(objM5555C, c1001l.m5554B(iM5576w), bArr, i33, i2, c0787av10);
                                        c1001l.m5569m(iM5576w, obj4, objM5555C);
                                        bArr11 = bArr;
                                        iM15149i = iM15155o;
                                        unsafe6 = unsafe7;
                                        obj5 = obj4;
                                        i28 = i10;
                                        i27 = i12;
                                        i31 = 1048575;
                                        i2 = i2;
                                    } else {
                                        i11 = i33;
                                        bArr3 = bArr;
                                        c0787av3 = c0787av10;
                                        obj3 = obj10;
                                        i29 = i29;
                                        unsafe2 = unsafe7;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                                case 10:
                                    Object obj11 = obj5;
                                    unsafe4 = unsafe6;
                                    obj3 = obj11;
                                    bArr5 = bArr;
                                    c0787av10 = c0787av;
                                    i10 = i9;
                                    i13 = i33;
                                    i12 = i34;
                                    if (i37 == 2) {
                                        i29 |= i40;
                                        iM15149i = kdd.m15142b(bArr5, i13, c0787av10);
                                        unsafe4.putObject(obj3, j, c0787av10.f7542c);
                                        Unsafe unsafe8 = unsafe4;
                                        obj5 = obj3;
                                        unsafe6 = unsafe8;
                                        i2 = i2;
                                        bArr11 = bArr5;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    c0787av3 = c0787av10;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe4;
                                    i11 = i13;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 12:
                                    Object obj12 = obj5;
                                    unsafe4 = unsafe6;
                                    obj3 = obj12;
                                    bArr5 = bArr;
                                    c0787av10 = c0787av;
                                    i10 = i9;
                                    i13 = i33;
                                    i12 = i34;
                                    if (i37 == 0) {
                                        iM15149i = kdd.m15150j(bArr5, i13, c0787av10);
                                        int i50 = c0787av10.f7540a;
                                        s8c s8cVarM5553A = c1001l.m5553A(iM5576w);
                                        if ((i38 & Integer.MIN_VALUE) == 0 || s8cVarM5553A == null || s8cVarM5553A.mo10793a(i50)) {
                                            i29 |= i40;
                                            unsafe4.putInt(obj3, j, i50);
                                        } else {
                                            AbstractC0998i abstractC0998i = (AbstractC0998i) obj3;
                                            jjc jjcVarM14504b2 = abstractC0998i.zzc;
                                            if (jjcVarM14504b2 == jjcVar2) {
                                                jjcVarM14504b2 = jjc.m14504b();
                                                abstractC0998i.zzc = jjcVarM14504b2;
                                            }
                                            jjcVarM14504b2.m14506c(i30 == true ? 1 : 0, Long.valueOf(i50));
                                        }
                                        Unsafe unsafe9 = unsafe4;
                                        obj5 = obj3;
                                        unsafe6 = unsafe9;
                                        i2 = i2;
                                        bArr11 = bArr5;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    c0787av3 = c0787av10;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe4;
                                    i11 = i13;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 15:
                                    Object obj13 = obj5;
                                    unsafe4 = unsafe6;
                                    obj3 = obj13;
                                    bArr5 = bArr;
                                    c0787av10 = c0787av;
                                    i10 = i9;
                                    i13 = i33;
                                    i12 = i34;
                                    if (i37 == 0) {
                                        i29 |= i40;
                                        iM15149i = kdd.m15150j(bArr5, i13, c0787av10);
                                        unsafe4.putInt(obj3, j, zla.m25696a(c0787av10.f7540a));
                                        Unsafe unsafe10 = unsafe4;
                                        obj5 = obj3;
                                        unsafe6 = unsafe10;
                                        i2 = i2;
                                        bArr11 = bArr5;
                                        i28 = i10;
                                        i27 = i12;
                                    }
                                    c0787av3 = c0787av10;
                                    bArr3 = bArr5;
                                    unsafe2 = unsafe4;
                                    i11 = i13;
                                    i3 = i3;
                                    iM15149i = i11;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    c0787av2 = c0787av3;
                                    i7 = i30 == true ? 1 : 0;
                                    i5 = i10;
                                    i8 = i12;
                                    i6 = i29;
                                    obj5 = obj3;
                                    break;
                                case 16:
                                    i13 = i33;
                                    if (i37 == 0) {
                                        i29 |= i40;
                                        int iM15153m3 = kdd.m15153m(bArr, i13, c0787av);
                                        long j2 = c0787av.f7541b;
                                        Unsafe unsafe11 = unsafe6;
                                        unsafe11.putLong(obj, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                        obj5 = obj;
                                        unsafe6 = unsafe11;
                                        i2 = i2;
                                        c0787av10 = c0787av;
                                        iM15149i = iM15153m3;
                                        bArr11 = bArr;
                                        iM5576w = iM5576w;
                                        i28 = i9;
                                        i27 = i34;
                                    } else {
                                        Object obj14 = obj5;
                                        unsafe4 = unsafe6;
                                        obj3 = obj14;
                                        i10 = i9;
                                        i12 = i34;
                                        c0787av3 = c0787av;
                                        bArr3 = bArr;
                                        unsafe2 = unsafe4;
                                        i11 = i13;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                                default:
                                    if (i37 == 3) {
                                        i29 |= i40;
                                        Object objM5555C2 = c1001l.m5555C(iM5576w, obj5);
                                        int iM15154n = kdd.m15154n(objM5555C2, c1001l.m5554B(iM5576w), bArr, i33, i2, (i34 << 3) | 4, c0787av);
                                        c1001l.m5569m(iM5576w, obj5, objM5555C2);
                                        c0787av10 = c0787av;
                                        iM15149i = iM15154n;
                                        bArr11 = bArr;
                                        i28 = i9;
                                        i27 = i34;
                                        i31 = 1048575;
                                        i2 = i2;
                                    } else {
                                        unsafe2 = unsafe6;
                                        obj3 = obj5;
                                        i10 = i9;
                                        i29 = i29;
                                        i11 = i33;
                                        bArr3 = bArr;
                                        i12 = i34;
                                        c0787av3 = c0787av;
                                        i3 = i3;
                                        iM15149i = i11;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        c0787av2 = c0787av3;
                                        i7 = i30 == true ? 1 : 0;
                                        i5 = i10;
                                        i8 = i12;
                                        i6 = i29;
                                        obj5 = obj3;
                                    }
                                    break;
                            }
                        } else {
                            Unsafe unsafe12 = unsafe6;
                            Object obj15 = obj5;
                            objArr = objArr;
                            i12 = i34;
                            if (iM5551x != 27) {
                                obj5 = obj15;
                                if (iM5551x <= 49) {
                                    long j3 = i38;
                                    s1c s1cVar3 = (s1c) ((e9c) unsafe12.getObject(obj5, j));
                                    if (s1cVar3.m21005f()) {
                                        s1cVar = s1cVar3;
                                    } else {
                                        int size = s1cVar3.size();
                                        e9c e9cVarMo10949p = s1cVar3.mo10949p(size + size);
                                        unsafe12.putObject(obj5, j, e9cVarMo10949p);
                                        s1cVar = e9cVarMo10949p;
                                    }
                                    s1c s1cVar4 = s1cVar;
                                    switch (iM5551x) {
                                        case 18:
                                        case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                            i5 = i28;
                                            i7 = i30 == true ? 1 : 0;
                                            bArr7 = bArr;
                                            i6 = i29;
                                            i18 = i33;
                                            c0787av7 = c0787av;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                if (kdd.m15150j(bArr7, i18, c0787av7) + c0787av7.f7540a <= bArr7.length) {
                                                    throw null;
                                                }
                                                fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i37 == 1) {
                                                dnb.m10508i(s1cVar4);
                                                Double.longBitsToDouble(kdd.m15156p(i18, bArr7));
                                                throw null;
                                            }
                                            iM15149i = i18;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                            break;
                                        case 19:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                            i5 = i28;
                                            i7 = i30 == true ? 1 : 0;
                                            bArr7 = bArr;
                                            i6 = i29;
                                            i18 = i33;
                                            c0787av7 = c0787av;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                if (kdd.m15150j(bArr7, i18, c0787av7) + c0787av7.f7540a <= bArr7.length) {
                                                    throw null;
                                                }
                                                fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i37 == 5) {
                                                dnb.m10508i(s1cVar4);
                                                Float.intBitsToFloat(kdd.m15143c(i18, bArr7));
                                                throw null;
                                            }
                                            iM15149i = i18;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                            break;
                                        case 20:
                                        case 21:
                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        case 38:
                                            i5 = i28;
                                            i7 = i30 == true ? 1 : 0;
                                            bArr7 = bArr;
                                            i6 = i29;
                                            i18 = i33;
                                            c0787av7 = c0787av;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                int iM15150j4 = kdd.m15150j(bArr7, i18, c0787av7);
                                                int i51 = c0787av7.f7540a + iM15150j4;
                                                if (iM15150j4 < i51) {
                                                    kdd.m15153m(bArr7, iM15150j4, c0787av7);
                                                    throw null;
                                                }
                                                if (iM15150j4 != i51) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iM15149i = iM15150j4;
                                            } else {
                                                if (i37 == 0) {
                                                    dnb.m10508i(s1cVar4);
                                                    kdd.m15153m(bArr7, i18, c0787av7);
                                                    throw null;
                                                }
                                                iM15149i = i18;
                                            }
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case 43:
                                            unsafe5 = unsafe12;
                                            i19 = i33;
                                            bArr8 = bArr;
                                            i6 = i29;
                                            i20 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            c0787av8 = c0787av;
                                            if (i37 != 2) {
                                                if (i37 == 0) {
                                                    bArr7 = bArr8;
                                                    i18 = i19;
                                                    c0787av9 = c0787av8;
                                                    iM15149i = kdd.m15152l(i20 == true ? 1 : 0, bArr7, i18, i2, s1cVar4, c0787av9);
                                                    i7 = i20 == true ? 1 : 0;
                                                    c0787av7 = c0787av9;
                                                    if (iM15149i != i18) {
                                                        bArr11 = bArr7;
                                                        iM5576w = iM5576w;
                                                        c0787av10 = c0787av7;
                                                        unsafe6 = unsafe5;
                                                        i27 = i12;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        bArr2 = bArr7;
                                                        c0787av2 = c0787av7;
                                                        unsafe = unsafe5;
                                                        i8 = i12;
                                                    }
                                                }
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                                break;
                                            } else {
                                                iM15147g = kdd.m15147g(bArr8, i19, s1cVar4, c0787av8);
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = iM15147g;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            break;
                                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        case 32:
                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        case 46:
                                            unsafe5 = unsafe12;
                                            i19 = i33;
                                            bArr8 = bArr;
                                            i6 = i29;
                                            i20 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            c0787av8 = c0787av;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                if (kdd.m15150j(bArr8, i19, c0787av8) + c0787av8.f7540a <= bArr8.length) {
                                                    throw null;
                                                }
                                                fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i37 == 1) {
                                                dnb.m10508i(s1cVar4);
                                                kdd.m15156p(i19, bArr8);
                                                throw null;
                                            }
                                            c0787av7 = c0787av8;
                                            i7 = i20;
                                            bArr7 = bArr8;
                                            i18 = i19;
                                            iM15149i = i18;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                            break;
                                        case 24:
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                            unsafe5 = unsafe12;
                                            i19 = i33;
                                            bArr8 = bArr;
                                            i6 = i29;
                                            i20 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            c0787av8 = c0787av;
                                            if (i37 != 2) {
                                                if (i37 == 5) {
                                                    iM15150j2 = i19 + 4;
                                                    j8c j8cVar = (j8c) s1cVar4;
                                                    j8cVar.m14340i(kdd.m15143c(i19, bArr8));
                                                    while (iM15150j2 < i2) {
                                                        int iM15150j5 = kdd.m15150j(bArr8, iM15150j2, c0787av8);
                                                        if (i20 == c0787av8.f7540a) {
                                                            j8cVar.m14340i(kdd.m15143c(iM15150j5, bArr8));
                                                            iM15150j2 = iM15150j5 + 4;
                                                        }
                                                    }
                                                }
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                j8c j8cVar2 = (j8c) s1cVar4;
                                                iM15150j2 = kdd.m15150j(bArr8, i19, c0787av8);
                                                int i52 = c0787av8.f7540a;
                                                int i53 = iM15150j2 + i52;
                                                if (i53 > bArr8.length) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                j8cVar2.m14341j((i52 / 4) + j8cVar2.size());
                                                while (iM15150j2 < i53) {
                                                    j8cVar2.m14340i(kdd.m15143c(iM15150j2, bArr8));
                                                    iM15150j2 += 4;
                                                }
                                                if (iM15150j2 != i53) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                            }
                                            c0787av7 = c0787av8;
                                            i7 = i20;
                                            bArr7 = bArr8;
                                            i18 = i19;
                                            iM15149i = iM15150j2;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            unsafe5 = unsafe12;
                                            i19 = i33;
                                            bArr8 = bArr;
                                            i6 = i29;
                                            i20 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            c0787av8 = c0787av;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                iM15150j2 = kdd.m15150j(bArr8, i19, c0787av8);
                                                int i54 = c0787av8.f7540a + iM15150j2;
                                                if (iM15150j2 < i54) {
                                                    kdd.m15153m(bArr8, iM15150j2, c0787av8);
                                                    throw null;
                                                }
                                                if (iM15150j2 != i54) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = iM15150j2;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                if (i37 == 0) {
                                                    dnb.m10508i(s1cVar4);
                                                    kdd.m15153m(bArr8, i19, c0787av8);
                                                    throw null;
                                                }
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            break;
                                        case 26:
                                            unsafe5 = unsafe12;
                                            i19 = i33;
                                            bArr8 = bArr;
                                            i6 = i29;
                                            i20 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            c0787av8 = c0787av;
                                            if (i37 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    iM15147g = kdd.m15150j(bArr8, i19, c0787av8);
                                                    int i55 = c0787av8.f7540a;
                                                    if (i55 < 0) {
                                                        fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i55 == 0) {
                                                        s1cVar4.add("");
                                                    } else {
                                                        s1cVar4.add(new String(bArr8, iM15147g, i55, m9c.f50823a));
                                                        iM15147g += i55;
                                                    }
                                                    while (iM15147g < i2) {
                                                        int iM15150j6 = kdd.m15150j(bArr8, iM15147g, c0787av8);
                                                        if (i20 == c0787av8.f7540a) {
                                                            iM15147g = kdd.m15150j(bArr8, iM15150j6, c0787av8);
                                                            int i56 = c0787av8.f7540a;
                                                            if (i56 < 0) {
                                                                fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i56 == 0) {
                                                                s1cVar4.add("");
                                                            } else {
                                                                s1cVar4.add(new String(bArr8, iM15147g, i56, m9c.f50823a));
                                                                iM15147g += i56;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iM15147g = kdd.m15150j(bArr8, i19, c0787av8);
                                                    int i57 = c0787av8.f7540a;
                                                    if (i57 < 0) {
                                                        fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i57 == 0) {
                                                        s1cVar4.add("");
                                                    } else {
                                                        int i58 = iM15147g + i57;
                                                        if (!AbstractC1004o.m5606c(bArr8, iM15147g, i58)) {
                                                            fg2.m11822k("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        s1cVar4.add(new String(bArr8, iM15147g, i57, m9c.f50823a));
                                                        iM15147g = i58;
                                                    }
                                                    while (iM15147g < i2) {
                                                        int iM15150j7 = kdd.m15150j(bArr8, iM15147g, c0787av8);
                                                        if (i20 == c0787av8.f7540a) {
                                                            iM15147g = kdd.m15150j(bArr8, iM15150j7, c0787av8);
                                                            int i59 = c0787av8.f7540a;
                                                            if (i59 < 0) {
                                                                fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i59 == 0) {
                                                                s1cVar4.add("");
                                                            } else {
                                                                int i60 = iM15147g + i59;
                                                                if (!AbstractC1004o.m5606c(bArr8, iM15147g, i60)) {
                                                                    fg2.m11822k("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                s1cVar4.add(new String(bArr8, iM15147g, i59, m9c.f50823a));
                                                                iM15147g = i60;
                                                            }
                                                        }
                                                    }
                                                }
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = iM15147g;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                c0787av7 = c0787av8;
                                                i7 = i20;
                                                bArr7 = bArr8;
                                                i18 = i19;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            break;
                                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                            bArr9 = bArr;
                                            c0787av9 = c0787av;
                                            i6 = i29;
                                            i21 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            i22 = i33;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                iM15147g = kdd.m15146f(c1001l.m5554B(iM5576w), i21 == true ? 1 : 0, bArr9, i22, i2, s1cVar4, c0787av9);
                                                i7 = i21 == true ? 1 : 0;
                                                bArr7 = bArr9;
                                                i18 = i22;
                                                c0787av7 = c0787av9;
                                                iM15149i = iM15147g;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            int i61 = i22;
                                            i7 = i21;
                                            bArr7 = bArr9;
                                            i18 = i61;
                                            c0787av7 = c0787av9;
                                            iM15149i = i18;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 28:
                                            bArr9 = bArr;
                                            c0787av9 = c0787av;
                                            i6 = i29;
                                            i21 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            i22 = i33;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                int iM15150j8 = kdd.m15150j(bArr9, i22, c0787av9);
                                                int i62 = c0787av9.f7540a;
                                                if (i62 < 0) {
                                                    fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i62 > bArr9.length - iM15150j8) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                if (i62 == 0) {
                                                    s1cVar4.add(zzev.f12230b);
                                                } else {
                                                    s1cVar4.add(zzev.m5686m(bArr9, iM15150j8, i62));
                                                    iM15150j8 += i62;
                                                }
                                                while (iM15150j8 < i2) {
                                                    int iM15150j9 = kdd.m15150j(bArr9, iM15150j8, c0787av9);
                                                    if (i21 == c0787av9.f7540a) {
                                                        iM15150j8 = kdd.m15150j(bArr9, iM15150j9, c0787av9);
                                                        int i63 = c0787av9.f7540a;
                                                        if (i63 < 0) {
                                                            fg2.m11822k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i63 > bArr9.length - iM15150j8) {
                                                            fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        if (i63 == 0) {
                                                            s1cVar4.add(zzev.f12230b);
                                                        } else {
                                                            s1cVar4.add(zzev.m5686m(bArr9, iM15150j8, i63));
                                                            iM15150j8 += i63;
                                                        }
                                                    } else {
                                                        i7 = i21 == true ? 1 : 0;
                                                        bArr7 = bArr9;
                                                        i18 = i22;
                                                        c0787av7 = c0787av9;
                                                        iM15149i = iM15150j8;
                                                    }
                                                }
                                                i7 = i21 == true ? 1 : 0;
                                                bArr7 = bArr9;
                                                i18 = i22;
                                                c0787av7 = c0787av9;
                                                iM15149i = iM15150j8;
                                            } else {
                                                int i64 = i22;
                                                i7 = i21;
                                                bArr7 = bArr9;
                                                i18 = i64;
                                                c0787av7 = c0787av9;
                                                iM15149i = i18;
                                            }
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 30:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                            byte[] bArr12 = bArr;
                                            i5 = i28;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                iM15147g2 = kdd.m15147g(bArr12, i33, s1cVar4, c0787av);
                                                s1cVar2 = s1cVar4;
                                                i23 = i30 == true ? 1 : 0;
                                            } else if (i37 != 0) {
                                                i6 = i29;
                                                bArr7 = bArr12;
                                                c0787av7 = c0787av;
                                                i18 = i33;
                                                i7 = i30 == true ? 1 : 0;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                s1c s1cVar5 = s1cVar4;
                                                int iM15152l = kdd.m15152l(i30 == true ? 1 : 0, bArr12, i33, i2, s1cVar5, c0787av);
                                                bArr12 = bArr12;
                                                i23 = i30 == true ? 1 : 0;
                                                iM15147g2 = iM15152l;
                                                s1cVar2 = s1cVar5;
                                            }
                                            s8c s8cVarM5553A2 = c1001l.m5553A(iM5576w);
                                            e41 e41Var = AbstractC1003n.f12199a;
                                            if (s8cVarM5553A2 != null) {
                                                int size2 = s1cVar2.size();
                                                i24 = iM15147g2;
                                                jjc jjcVar3 = null;
                                                int i65 = 0;
                                                int i66 = 0;
                                                while (i66 < size2) {
                                                    int i67 = i29;
                                                    Integer num = (Integer) s1cVar2.get(i66);
                                                    int iIntValue = num.intValue();
                                                    if (s8cVarM5553A2.mo10793a(iIntValue)) {
                                                        if (i66 != i65) {
                                                            s1cVar2.set(i65, num);
                                                        }
                                                        i65++;
                                                        s8cVar = s8cVarM5553A2;
                                                        jjcVarM14504b = jjcVar3;
                                                    } else {
                                                        if (jjcVar3 == null) {
                                                            c1001l.f12196i.getClass();
                                                            AbstractC0998i abstractC0998i2 = (AbstractC0998i) obj5;
                                                            s8cVar = s8cVarM5553A2;
                                                            jjcVarM14504b = abstractC0998i2.zzc;
                                                            if (jjcVarM14504b == jjcVar2) {
                                                                jjcVarM14504b = jjc.m14504b();
                                                                abstractC0998i2.zzc = jjcVarM14504b;
                                                            }
                                                        } else {
                                                            s8cVar = s8cVarM5553A2;
                                                            jjcVarM14504b = jjcVar3;
                                                        }
                                                        jjcVarM14504b.m14506c(i12 << 3, Long.valueOf(iIntValue));
                                                    }
                                                    i66++;
                                                    jjcVar3 = jjcVarM14504b;
                                                    s8cVarM5553A2 = s8cVar;
                                                    i29 = i67;
                                                }
                                                i6 = i29;
                                                if (i65 != size2) {
                                                    s1cVar2.subList(i65, size2).clear();
                                                }
                                            } else {
                                                i24 = iM15147g2;
                                                i6 = i29;
                                            }
                                            i7 = i23;
                                            bArr7 = bArr12;
                                            i18 = i33;
                                            c0787av7 = c0787av;
                                            iM15149i = i24;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr10 = bArr;
                                            c0787av9 = c0787av;
                                            i25 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            i26 = i33;
                                            unsafe5 = unsafe12;
                                            if (i37 != 2) {
                                                if (i37 == 0) {
                                                    j8c j8cVar3 = (j8c) s1cVar4;
                                                    int iM15150j10 = kdd.m15150j(bArr10, i26, c0787av9);
                                                    j8cVar3.m14340i(zla.m25696a(c0787av9.f7540a));
                                                    while (iM15150j10 < i2) {
                                                        int iM15150j11 = kdd.m15150j(bArr10, iM15150j10, c0787av9);
                                                        if (i25 == c0787av9.f7540a) {
                                                            iM15150j10 = kdd.m15150j(bArr10, iM15150j11, c0787av9);
                                                            j8cVar3.m14340i(zla.m25696a(c0787av9.f7540a));
                                                        } else {
                                                            iM15149i = iM15150j10;
                                                        }
                                                    }
                                                    iM15149i = iM15150j10;
                                                }
                                                bArr7 = bArr10;
                                                i18 = i26;
                                                i7 = i25;
                                                i6 = i29;
                                                c0787av7 = c0787av9;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                j8c j8cVar4 = (j8c) s1cVar4;
                                                iM15150j3 = kdd.m15150j(bArr10, i26, c0787av9);
                                                int i68 = c0787av9.f7540a + iM15150j3;
                                                while (iM15150j3 < i68) {
                                                    iM15150j3 = kdd.m15150j(bArr10, iM15150j3, c0787av9);
                                                    j8cVar4.m14340i(zla.m25696a(c0787av9.f7540a));
                                                }
                                                if (iM15150j3 != i68) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iM15149i = iM15150j3;
                                            }
                                            bArr7 = bArr10;
                                            i18 = i26;
                                            i7 = i25;
                                            i6 = i29;
                                            c0787av7 = c0787av9;
                                            if (iM15149i != i18) {
                                                bArr11 = bArr7;
                                                iM5576w = iM5576w;
                                                c0787av10 = c0787av7;
                                                unsafe6 = unsafe5;
                                                i27 = i12;
                                                i29 = i6;
                                                i31 = 1048575;
                                            } else {
                                                bArr2 = bArr7;
                                                c0787av2 = c0787av7;
                                                unsafe = unsafe5;
                                                i8 = i12;
                                            }
                                            break;
                                        case 34:
                                        case eda.f37086g /* 48 */:
                                            bArr10 = bArr;
                                            c0787av9 = c0787av;
                                            i25 = i30 == true ? 1 : 0;
                                            i5 = i28;
                                            i26 = i33;
                                            unsafe5 = unsafe12;
                                            if (i37 == 2) {
                                                dnb.m10508i(s1cVar4);
                                                iM15150j3 = kdd.m15150j(bArr10, i26, c0787av9);
                                                int i69 = c0787av9.f7540a + iM15150j3;
                                                if (iM15150j3 < i69) {
                                                    kdd.m15153m(bArr10, iM15150j3, c0787av9);
                                                    throw null;
                                                }
                                                if (iM15150j3 != i69) {
                                                    fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iM15149i = iM15150j3;
                                                bArr7 = bArr10;
                                                i18 = i26;
                                                i7 = i25;
                                                i6 = i29;
                                                c0787av7 = c0787av9;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                if (i37 == 0) {
                                                    dnb.m10508i(s1cVar4);
                                                    kdd.m15153m(bArr10, i26, c0787av9);
                                                    throw null;
                                                }
                                                bArr7 = bArr10;
                                                i18 = i26;
                                                i7 = i25;
                                                i6 = i29;
                                                c0787av7 = c0787av9;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i37 == 3) {
                                                int i70 = ((i30 == true ? 1 : 0) & (-8)) | 4;
                                                lgc lgcVarM5554B = c1001l.m5554B(iM5576w);
                                                c0787av9 = c0787av;
                                                i25 = i30 == true ? 1 : 0;
                                                unsafe5 = unsafe12;
                                                int iM15144d = kdd.m15144d(lgcVarM5554B, bArr, i33, i2, i70, c0787av9);
                                                lgc lgcVar = lgcVarM5554B;
                                                s1cVar4.add(c0787av9.f7542c);
                                                while (iM15144d < i2) {
                                                    int iM15150j12 = kdd.m15150j(bArr, iM15144d, c0787av9);
                                                    if (i25 != c0787av9.f7540a) {
                                                        i5 = i28;
                                                        i26 = i33;
                                                        bArr7 = bArr;
                                                        iM15149i = iM15144d;
                                                        i18 = i26;
                                                        i7 = i25;
                                                        i6 = i29;
                                                        c0787av7 = c0787av9;
                                                        if (iM15149i != i18) {
                                                            bArr11 = bArr7;
                                                            iM5576w = iM5576w;
                                                            c0787av10 = c0787av7;
                                                            unsafe6 = unsafe5;
                                                            i27 = i12;
                                                            i29 = i6;
                                                            i31 = 1048575;
                                                        } else {
                                                            bArr2 = bArr7;
                                                            c0787av2 = c0787av7;
                                                            unsafe = unsafe5;
                                                            i8 = i12;
                                                        }
                                                    } else {
                                                        lgc lgcVar2 = lgcVar;
                                                        iM15144d = kdd.m15144d(lgcVar2, bArr, iM15150j12, i2, i70, c0787av9);
                                                        s1cVar4.add(c0787av9.f7542c);
                                                        lgcVar = lgcVar2;
                                                        i28 = i28;
                                                    }
                                                    break;
                                                }
                                                i5 = i28;
                                                i26 = i33;
                                                bArr7 = bArr;
                                                iM15149i = iM15144d;
                                                i18 = i26;
                                                i7 = i25;
                                                i6 = i29;
                                                c0787av7 = c0787av9;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            } else {
                                                i5 = i28;
                                                unsafe5 = unsafe12;
                                                bArr7 = bArr;
                                                i18 = i33;
                                                i7 = i30 == true ? 1 : 0;
                                                i6 = i29;
                                                c0787av7 = c0787av;
                                                iM15149i = i18;
                                                if (iM15149i != i18) {
                                                    bArr11 = bArr7;
                                                    iM5576w = iM5576w;
                                                    c0787av10 = c0787av7;
                                                    unsafe6 = unsafe5;
                                                    i27 = i12;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    bArr2 = bArr7;
                                                    c0787av2 = c0787av7;
                                                    unsafe = unsafe5;
                                                    i8 = i12;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    unsafe = unsafe12;
                                    i5 = i28;
                                    i6 = i29;
                                    c0787av5 = c0787av;
                                    i7 = i30 == true ? 1 : 0;
                                    if (iM5551x != 50) {
                                        long j4 = iArr[iM5576w + 2] & 1048575;
                                        switch (iM5551x) {
                                            case 51:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 1) {
                                                    i16 = i15 + 8;
                                                    unsafe.putObject(obj5, j, Double.valueOf(Double.longBitsToDouble(kdd.m15156p(i15, bArr2))));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = i16;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 52:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 5) {
                                                    i16 = i15 + 4;
                                                    unsafe.putObject(obj5, j, Float.valueOf(Float.intBitsToFloat(kdd.m15143c(i15, bArr2))));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = i16;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 0) {
                                                    iM15153m = kdd.m15153m(bArr2, i15, c0787av2);
                                                    unsafe.putObject(obj5, j, Long.valueOf(c0787av2.f7541b));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = iM15153m;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 0) {
                                                    iM15153m = kdd.m15150j(bArr2, i15, c0787av2);
                                                    unsafe.putObject(obj5, j, Integer.valueOf(c0787av2.f7540a));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = iM15153m;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 1) {
                                                    i16 = i15 + 8;
                                                    unsafe.putObject(obj5, j, Long.valueOf(kdd.m15156p(i15, bArr2)));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = i16;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 5) {
                                                    i16 = i15 + 4;
                                                    unsafe.putObject(obj5, j, Integer.valueOf(kdd.m15143c(i15, bArr2)));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = i16;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 58:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                if (i37 == 0) {
                                                    iM15153m = kdd.m15153m(bArr2, i15, c0787av2);
                                                    unsafe.putObject(obj5, j, Boolean.valueOf(c0787av2.f7541b != 0));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    iM15149i = iM15153m;
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 59:
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                bArr2 = bArr;
                                                if (i37 == 2) {
                                                    iM15149i = kdd.m15150j(bArr2, i15, c0787av2);
                                                    int i71 = c0787av2.f7540a;
                                                    if (i71 == 0) {
                                                        unsafe.putObject(obj5, j, "");
                                                    } else {
                                                        int i72 = iM15149i + i71;
                                                        if ((i38 & 536870912) != 0 && !AbstractC1004o.m5606c(bArr2, iM15149i, i72)) {
                                                            fg2.m11822k("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        unsafe.putObject(obj5, j, new String(bArr2, iM15149i, i71, m9c.f50823a));
                                                        iM15149i = i72;
                                                    }
                                                    unsafe.putInt(obj5, j4, i8);
                                                } else {
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 60:
                                                i8 = i12;
                                                if (i37 == 2) {
                                                    Object objM5556D = c1001l.m5556D(i8, obj5, iM5576w);
                                                    int iM15155o2 = kdd.m15155o(objM5556D, c1001l.m5554B(iM5576w), bArr, i33, i2, c0787av5);
                                                    bArr2 = bArr;
                                                    c1001l.m5570n(obj5, i8, iM5576w, objM5556D);
                                                    iM15149i = iM15155o2;
                                                    iM5576w = iM5576w;
                                                    i15 = i33;
                                                    c0787av2 = c0787av;
                                                } else {
                                                    bArr2 = bArr;
                                                    iM5576w = iM5576w;
                                                    i15 = i33;
                                                    c0787av2 = c0787av;
                                                    iM15149i = i15;
                                                }
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 61:
                                                bArr6 = bArr;
                                                c0787av6 = c0787av5;
                                                i17 = i33;
                                                i8 = i12;
                                                if (i37 == 2) {
                                                    iM15149i = kdd.m15142b(bArr6, i17, c0787av6);
                                                    unsafe.putObject(obj5, j, c0787av6.f7542c);
                                                    unsafe.putInt(obj5, j4, i8);
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                }
                                                i15 = i17;
                                                bArr2 = bArr6;
                                                c0787av2 = c0787av6;
                                                iM15149i = i15;
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 63:
                                                bArr6 = bArr;
                                                c0787av6 = c0787av5;
                                                i17 = i33;
                                                i8 = i12;
                                                if (i37 == 0) {
                                                    iM15149i = kdd.m15150j(bArr6, i17, c0787av6);
                                                    int i73 = c0787av6.f7540a;
                                                    s8c s8cVarM5553A3 = c1001l.m5553A(iM5576w);
                                                    if (s8cVarM5553A3 == null || s8cVarM5553A3.mo10793a(i73)) {
                                                        jjcVar2 = jjcVar2;
                                                        unsafe.putObject(obj5, j, Integer.valueOf(i73));
                                                        unsafe.putInt(obj5, j4, i8);
                                                    } else {
                                                        AbstractC0998i abstractC0998i3 = (AbstractC0998i) obj5;
                                                        jjc jjcVarM14504b3 = abstractC0998i3.zzc;
                                                        if (jjcVarM14504b3 == jjcVar2) {
                                                            jjcVar2 = jjcVar2;
                                                            jjcVarM14504b3 = jjc.m14504b();
                                                            abstractC0998i3.zzc = jjcVarM14504b3;
                                                        }
                                                        jjcVar2 = jjcVar2;
                                                        jjcVarM14504b3.m14506c(i7 == true ? 1 : 0, Long.valueOf(i73));
                                                    }
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                } else {
                                                    jjcVar2 = jjcVar2;
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    iM15149i = i15;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                }
                                                break;
                                            case 66:
                                                bArr6 = bArr;
                                                c0787av6 = c0787av5;
                                                i17 = i33;
                                                i8 = i12;
                                                jjcVar = jjcVar2;
                                                if (i37 == 0) {
                                                    iM15149i = kdd.m15150j(bArr6, i17, c0787av6);
                                                    unsafe.putObject(obj5, j, Integer.valueOf(zla.m25696a(c0787av6.f7540a)));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    jjcVar2 = jjcVar;
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                } else {
                                                    jjcVar2 = jjcVar;
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    iM15149i = i15;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                }
                                                break;
                                            case 67:
                                                bArr6 = bArr;
                                                c0787av6 = c0787av5;
                                                i17 = i33;
                                                i8 = i12;
                                                if (i37 == 0) {
                                                    iM15149i = kdd.m15153m(bArr6, i17, c0787av6);
                                                    jjcVar = jjcVar2;
                                                    long j5 = c0787av6.f7541b;
                                                    unsafe.putObject(obj5, j, Long.valueOf((j5 >>> 1) ^ (-(j5 & 1))));
                                                    unsafe.putInt(obj5, j4, i8);
                                                    jjcVar2 = jjcVar;
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                }
                                                i15 = i17;
                                                bArr2 = bArr6;
                                                c0787av2 = c0787av6;
                                                iM15149i = i15;
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                            case 68:
                                                if (i37 == 3) {
                                                    int i74 = ((i7 == true ? 1 : 0) & (-8)) | 4;
                                                    Object objM5556D2 = c1001l.m5556D(i12, obj5, iM5576w);
                                                    bArr6 = bArr;
                                                    i17 = i33;
                                                    int iM15154n2 = kdd.m15154n(objM5556D2, c1001l.m5554B(iM5576w), bArr6, i17, i2, i74, c0787av5);
                                                    c0787av6 = c0787av5;
                                                    c1001l.m5570n(obj5, i12, iM5576w, objM5556D2);
                                                    iM15149i = iM15154n2;
                                                    i8 = i12;
                                                    i15 = i17;
                                                    bArr2 = bArr6;
                                                    c0787av2 = c0787av6;
                                                    if (iM15149i != i15) {
                                                        c1001l = this;
                                                        c0787av10 = c0787av2;
                                                        bArr11 = bArr2;
                                                        unsafe6 = unsafe;
                                                        i27 = i8;
                                                        iM5576w = iM5576w;
                                                        i29 = i6;
                                                        i31 = 1048575;
                                                    } else {
                                                        i3 = i3;
                                                        iM5576w = iM5576w;
                                                    }
                                                    break;
                                                }
                                            default:
                                                bArr2 = bArr;
                                                c0787av2 = c0787av5;
                                                i8 = i12;
                                                iM5576w = iM5576w;
                                                i15 = i33;
                                                iM15149i = i15;
                                                if (iM15149i != i15) {
                                                    c1001l = this;
                                                    c0787av10 = c0787av2;
                                                    bArr11 = bArr2;
                                                    unsafe6 = unsafe;
                                                    i27 = i8;
                                                    iM5576w = iM5576w;
                                                    i29 = i6;
                                                    i31 = 1048575;
                                                } else {
                                                    i3 = i3;
                                                    iM5576w = iM5576w;
                                                }
                                                break;
                                        }
                                    } else if (i37 == 2) {
                                        int i75 = iM5576w / 3;
                                        Object obj16 = objArr[i75 + i75];
                                        zzgv zzgvVar = (zzgv) unsafe.getObject(obj5, j);
                                        if (!zzgvVar.m5693e()) {
                                            zzgv zzgvVarM5690b = zzgv.m5688a().m5690b();
                                            if (!zzgvVar.isEmpty()) {
                                                (!zzgvVarM5690b.m5693e() ? zzgvVarM5690b.m5690b() : zzgvVarM5690b).m5692d(zzgvVar);
                                            }
                                            unsafe.putObject(obj5, j, zzgvVarM5690b);
                                        }
                                        g9a.m12435l(obj16);
                                        throw null;
                                    }
                                }
                                i30 = i7;
                                i28 = i5;
                            } else if (i37 == 2) {
                                s1c s1cVar6 = (s1c) ((e9c) unsafe12.getObject(obj15, j));
                                boolean zM21005f = s1cVar6.m21005f();
                                s1c s1cVar7 = s1cVar6;
                                if (!zM21005f) {
                                    int size3 = s1cVar6.size();
                                    e9c e9cVarMo10949p2 = s1cVar6.mo10949p(size3 == 0 ? 10 : size3 + size3);
                                    unsafe12.putObject(obj15, j, e9cVarMo10949p2);
                                    s1cVar7 = e9cVarMo10949p2;
                                }
                                int iM15146f = kdd.m15146f(c1001l.m5554B(iM5576w), i30 == true ? 1 : 0, bArr, i33, i2, s1cVar7, c0787av);
                                i30 = i30 == true ? 1 : 0;
                                obj5 = obj;
                                bArr11 = bArr;
                                i2 = i2;
                                c0787av10 = c0787av;
                                iM15149i = iM15146f;
                                iM5576w = iM5576w;
                                unsafe6 = unsafe12;
                                i27 = i12;
                            } else {
                                obj5 = obj15;
                                unsafe = unsafe12;
                                i5 = i28;
                                i6 = i29;
                                c0787av5 = c0787av;
                                i7 = i30 == true ? 1 : 0;
                            }
                            bArr2 = bArr;
                            c0787av2 = c0787av5;
                            iM15149i = i33;
                            i8 = i12;
                        }
                    }
                    if (i7 != i3 || i3 == 0) {
                        AbstractC0998i abstractC0998i4 = (AbstractC0998i) obj5;
                        jjc jjcVarM14504b4 = abstractC0998i4.zzc;
                        if (jjcVarM14504b4 == jjcVar2) {
                            jjcVarM14504b4 = jjc.m14504b();
                            abstractC0998i4.zzc = jjcVarM14504b4;
                        }
                        C0787av c0787av11 = c0787av2;
                        int i76 = iM15149i;
                        int i77 = i7;
                        jjc jjcVar4 = jjcVarM14504b4;
                        byte[] bArr13 = bArr2;
                        i2 = i2;
                        iM15149i = kdd.m15149i(i77 == true ? 1 : 0, bArr13, i76, i2, jjcVar4, c0787av11);
                        Object obj17 = obj5;
                        i30 = i77 == true ? 1 : 0;
                        obj5 = obj17;
                        i31 = 1048575;
                        c1001l = this;
                        bArr11 = bArr;
                        c0787av10 = c0787av;
                        unsafe6 = unsafe;
                        iM5576w = iM5576w;
                        i27 = i8;
                        i28 = i5;
                        i29 = i6;
                    } else {
                        i2 = i2;
                        obj5 = obj5;
                        i30 = i7;
                        i29 = i6;
                        i4 = 1048575;
                        i28 = i5;
                    }
                } else {
                    i3 = i3;
                    unsafe = unsafe6;
                    iArr = iArr2;
                    objArr = objArr;
                    i4 = 1048575;
                }
            }
        }
        if (i28 != i4) {
            unsafe.putInt(obj5, i28, i29);
        }
        for (int i78 = this.f12194g; i78 < this.f12195h; i78++) {
            int i79 = this.f12193f[i78];
            int i80 = iArr[i79];
            Object objM16339h = lkc.m16339h(obj5, m5577y(i79) & 1048575);
            if (objM16339h != null && m5553A(i79) != null) {
                int i81 = i79 / 3;
                g9a.m12435l(objArr[i81 + i81]);
                throw null;
            }
        }
        if (i3 == 0) {
            if (iM15149i != i2) {
                fg2.m11822k("Failed to parse the message.");
                return 0;
            }
        } else if (iM15149i > i2 || i30 != i3) {
            fg2.m11822k("Failed to parse the message.");
            return 0;
        }
        return iM15149i;
    }

    /* JADX INFO: renamed from: w */
    public final int m5576w(int i, int i2) {
        int[] iArr = this.f12188a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public final int m5577y(int i) {
        return this.f12188a[i + 1];
    }
}
