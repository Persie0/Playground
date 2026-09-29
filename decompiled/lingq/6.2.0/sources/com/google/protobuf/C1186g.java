package com.google.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p000.AbstractC3393o1;
import p000.C3309ls;
import p000.C3386nv;
import p000.a94;
import p000.eda;
import p000.er7;
import p000.f33;
import p000.g33;
import p000.go7;
import p000.ho2;
import p000.ij6;
import p000.jw4;
import p000.m58;
import p000.p94;
import p000.tp5;
import p000.tx2;
import p000.wga;
import p000.wq1;
import p000.xm8;
import p000.xp5;
import p000.yk6;
import p000.ze5;
import p000.zfa;
import p000.zga;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1186g implements xm8 {

    /* JADX INFO: renamed from: j */
    public static final int[] f13939j = new int[0];

    /* JADX INFO: renamed from: k */
    public static final Unsafe f13940k = zga.m25610j();

    /* JADX INFO: renamed from: a */
    public final int[] f13941a;

    /* JADX INFO: renamed from: b */
    public final Object[] f13942b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1180a f13943c;

    /* JADX INFO: renamed from: d */
    public final int[] f13944d;

    /* JADX INFO: renamed from: e */
    public final int f13945e;

    /* JADX INFO: renamed from: f */
    public final yk6 f13946f;

    /* JADX INFO: renamed from: g */
    public final ze5 f13947g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1189j f13948h;

    /* JADX INFO: renamed from: i */
    public final xp5 f13949i;

    public C1186g(int[] iArr, Object[] objArr, AbstractC1180a abstractC1180a, int[] iArr2, int i, yk6 yk6Var, ze5 ze5Var, AbstractC1189j abstractC1189j, tx2 tx2Var, xp5 xp5Var) {
        this.f13941a = iArr;
        this.f13942b = objArr;
        this.f13944d = iArr2;
        this.f13945e = i;
        this.f13946f = yk6Var;
        this.f13947g = ze5Var;
        this.f13948h = abstractC1189j;
        this.f13943c = abstractC1180a;
        this.f13949i = xp5Var;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6823i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1183d) {
            return ((AbstractC1183d) obj).m6815n();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static C1186g m6824m(er7 er7Var, yk6 yk6Var, ze5 ze5Var, AbstractC1189j abstractC1189j, tx2 tx2Var, xp5 xp5Var) {
        if (er7Var instanceof er7) {
            return m6825n(er7Var, yk6Var, ze5Var, abstractC1189j, tx2Var, xp5Var);
        }
        ho2.m13383c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x032b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0378  */
    /* JADX WARN: Code duplicated, block: B:182:0x0387  */
    /* JADX WARN: Code duplicated, block: B:185:0x0395  */
    /* JADX INFO: renamed from: n */
    public static C1186g m6825n(er7 er7Var, yk6 yk6Var, ze5 ze5Var, AbstractC1189j abstractC1189j, tx2 tx2Var, xp5 xp5Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        int i10;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        int i14;
        Object[] objArr;
        int i15;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        int i18;
        int i19;
        Field fieldM6828q;
        char cCharAt7;
        int i20;
        Field fieldM6828q2;
        Field fieldM6828q3;
        int i21;
        char cCharAt8;
        int i22;
        char cCharAt9;
        int i23;
        char cCharAt10;
        int i24;
        char cCharAt11;
        String str = er7Var.f37755b;
        int length = str.length();
        int i25 = 55296;
        if (str.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i28 = iCharAt3 & 8191;
            int i29 = 13;
            while (true) {
                i24 = i27 + 1;
                cCharAt11 = str.charAt(i27);
                if (cCharAt11 < 55296) {
                    break;
                }
                i28 |= (cCharAt11 & 8191) << i29;
                i29 += 13;
                i27 = i24;
            }
            iCharAt3 = i28 | (cCharAt11 << i29);
            i27 = i24;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i4 = 0;
            iArr = f13939j;
            i2 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt4 = str.charAt(i27);
            if (iCharAt4 >= 55296) {
                int i31 = iCharAt4 & 8191;
                int i32 = 13;
                while (true) {
                    i12 = i30 + 1;
                    cCharAt6 = str.charAt(i30);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt6 & 8191) << i32;
                    i32 += 13;
                    i30 = i12;
                }
                iCharAt4 = i31 | (cCharAt6 << i32);
                i30 = i12;
            }
            int i33 = i30 + 1;
            int iCharAt5 = str.charAt(i30);
            if (iCharAt5 >= 55296) {
                int i34 = iCharAt5 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    cCharAt5 = str.charAt(i33);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt5 & 8191) << i35;
                    i35 += 13;
                    i33 = i11;
                }
                iCharAt5 = i34 | (cCharAt5 << i35);
                i33 = i11;
            }
            int i36 = i33 + 1;
            if (str.charAt(i33) >= 55296) {
                while (true) {
                    i10 = i36 + 1;
                    if (str.charAt(i36) < 55296) {
                        break;
                    }
                    i36 = i10;
                }
                i36 = i10;
            }
            int i37 = i36 + 1;
            if (str.charAt(i36) >= 55296) {
                while (true) {
                    i9 = i37 + 1;
                    if (str.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i9;
                }
                i37 = i9;
            }
            int i38 = i37 + 1;
            iCharAt = str.charAt(i37);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i8 = i38 + 1;
                    cCharAt4 = str.charAt(i38);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt4 & 8191) << i40;
                    i40 += 13;
                    i38 = i8;
                }
                iCharAt = i39 | (cCharAt4 << i40);
                i38 = i8;
            }
            int i41 = i38 + 1;
            iCharAt2 = str.charAt(i38);
            if (iCharAt2 >= 55296) {
                int i42 = iCharAt2 & 8191;
                int i43 = 13;
                while (true) {
                    i7 = i41 + 1;
                    cCharAt3 = str.charAt(i41);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt3 & 8191) << i43;
                    i43 += 13;
                    i41 = i7;
                }
                iCharAt2 = i42 | (cCharAt3 << i43);
                i41 = i7;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i6 = i44 + 1;
                    cCharAt2 = str.charAt(i44);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt2 & 8191) << i46;
                    i46 += 13;
                    i44 = i6;
                }
                iCharAt6 = i45 | (cCharAt2 << i46);
                i44 = i6;
            }
            int i47 = i44 + 1;
            int iCharAt7 = str.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i5 = i47 + 1;
                    cCharAt = str.charAt(i47);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i48 |= (cCharAt & 8191) << i49;
                    i49 += 13;
                    i47 = i5;
                }
                iCharAt7 = i48 | (cCharAt << i49);
                i47 = i5;
            }
            int i50 = (iCharAt4 * 2) + iCharAt5;
            i2 = iCharAt4;
            i27 = i47;
            iArr = new int[iCharAt7 + iCharAt2 + iCharAt6];
            i3 = i50;
            i4 = iCharAt7;
        }
        Unsafe unsafe = f13940k;
        Object[] objArr2 = er7Var.f37756c;
        Class<?> cls = er7Var.f37754a.getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i51 = iCharAt2 + i4;
        int i52 = i4;
        int i53 = 0;
        int i54 = 0;
        while (i27 < length) {
            int i55 = i27 + 1;
            int iCharAt8 = str.charAt(i27);
            if (iCharAt8 >= i25) {
                int i56 = iCharAt8 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i23 = i57 + 1;
                    cCharAt10 = str.charAt(i57);
                    i13 = length;
                    if (cCharAt10 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt10 & 8191) << i58;
                    i58 += 13;
                    i57 = i23;
                    length = i13;
                }
                iCharAt8 = i56 | (cCharAt10 << i58);
                i14 = i23;
            } else {
                i13 = length;
                i14 = i55;
            }
            int i59 = i14 + 1;
            int iCharAt9 = str.charAt(i14);
            int i60 = iCharAt8;
            char c = 55296;
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt9 = str.charAt(i59);
                    if (cCharAt9 < c) {
                        break;
                    }
                    i61 |= (cCharAt9 & 8191) << i62;
                    i62 += 13;
                    i59 = i22;
                    c = 55296;
                }
                iCharAt9 = i61 | (cCharAt9 << i62);
                i59 = i22;
            }
            int i63 = iCharAt9 & 255;
            int i64 = i2;
            if ((iCharAt9 & 1024) != 0) {
                iArr[i54] = i53;
                i54++;
            }
            int[] iArr3 = iArr2;
            if (i63 >= 51) {
                int i65 = i59 + 1;
                int iCharAt10 = str.charAt(i59);
                char c2 = 55296;
                if (iCharAt10 >= 55296) {
                    int i66 = iCharAt10 & 8191;
                    int i67 = 13;
                    while (true) {
                        i21 = i65 + 1;
                        cCharAt8 = str.charAt(i65);
                        if (cCharAt8 < c2) {
                            break;
                        }
                        i66 |= (cCharAt8 & 8191) << i67;
                        i67 += 13;
                        i65 = i21;
                        c2 = 55296;
                    }
                    iCharAt10 = i66 | (cCharAt8 << i67);
                    i65 = i21;
                }
                int i68 = i63 - 51;
                int i69 = iCharAt10;
                if (i68 == 9 || i68 == 17) {
                    objArr3[wq1.m24103C(i53, 3, 2, 1)] = objArr2[i3];
                    i3++;
                } else if (i68 == 12 && (er7Var.m11323a().equals(ProtoSyntax.PROTO2) || (iCharAt9 & 2048) != 0)) {
                    objArr3[wq1.m24103C(i53, 3, 2, 1)] = objArr2[i3];
                    i3++;
                }
                int i70 = i69 * 2;
                Object obj = objArr2[i70];
                if (obj instanceof Field) {
                    fieldM6828q2 = (Field) obj;
                } else {
                    fieldM6828q2 = m6828q(cls, (String) obj);
                    objArr2[i70] = fieldM6828q2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM6828q2);
                int i71 = i70 + 1;
                Object obj2 = objArr2[i71];
                if (obj2 instanceof Field) {
                    fieldM6828q3 = (Field) obj2;
                } else {
                    fieldM6828q3 = m6828q(cls, (String) obj2);
                    objArr2[i71] = fieldM6828q3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM6828q3);
                i18 = i3;
                i19 = iObjectFieldOffset3;
                i16 = i65;
                objArr = objArr3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i17 = 0;
            } else {
                int i72 = i3 + 1;
                Field fieldM6828q4 = m6828q(cls, (String) objArr2[i3]);
                if (i63 == 9 || i63 == 17) {
                    objArr = objArr3;
                    objArr[wq1.m24103C(i53, 3, 2, 1)] = fieldM6828q4.getType();
                } else {
                    if (i63 == 27 || i63 == 49) {
                        objArr = objArr3;
                        i20 = i3 + 2;
                        objArr[wq1.m24103C(i53, 3, 2, 1)] = objArr2[i72];
                    } else if (i63 == 12 || i63 == 30 || i63 == 44) {
                        objArr = objArr3;
                        if (er7Var.m11323a() == ProtoSyntax.PROTO2 || (iCharAt9 & 2048) != 0) {
                            i20 = i3 + 2;
                            objArr[wq1.m24103C(i53, 3, 2, 1)] = objArr2[i72];
                        }
                    } else {
                        if (i63 == 50) {
                            int i73 = i52 + 1;
                            iArr[i52] = i53;
                            int i74 = (i53 / 3) * 2;
                            int i75 = i3 + 2;
                            objArr3[i74] = objArr2[i72];
                            if ((iCharAt9 & 2048) != 0) {
                                i15 = i3 + 3;
                                objArr3[i74 + 1] = objArr2[i75];
                                objArr = objArr3;
                                i51 = i51;
                                i52 = i73;
                            } else {
                                i51 = i51;
                                i15 = i75;
                                i52 = i73;
                                objArr = objArr3;
                            }
                        } else {
                            objArr = objArr3;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6828q4);
                        if ((iCharAt9 & 4096) != 0 || i63 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i16 = i59;
                            i17 = 0;
                        } else {
                            int i76 = i59 + 1;
                            int iCharAt11 = str.charAt(i59);
                            if (iCharAt11 >= 55296) {
                                int i77 = iCharAt11 & 8191;
                                int i78 = 13;
                                while (true) {
                                    i16 = i76 + 1;
                                    cCharAt7 = str.charAt(i76);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i77 |= (cCharAt7 & 8191) << i78;
                                    i78 += 13;
                                    i76 = i16;
                                }
                                iCharAt11 = i77 | (cCharAt7 << i78);
                            } else {
                                i16 = i76;
                            }
                            int i79 = (iCharAt11 / 32) + (i64 * 2);
                            Object obj3 = objArr2[i79];
                            if (obj3 instanceof Field) {
                                fieldM6828q = (Field) obj3;
                            } else {
                                fieldM6828q = m6828q(cls, (String) obj3);
                                objArr2[i79] = fieldM6828q;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM6828q);
                            i17 = iCharAt11 % 32;
                        }
                        if (i63 >= 18 || i63 > 49) {
                            i18 = i15;
                            i19 = iObjectFieldOffset;
                            i51 = i51;
                        } else {
                            i51++;
                            iArr[i51] = iObjectFieldOffset;
                            i18 = i15;
                            i19 = iObjectFieldOffset;
                        }
                    }
                    i15 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6828q4);
                    if ((iCharAt9 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i59;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i59;
                        i17 = 0;
                    }
                    if (i63 >= 18) {
                        i18 = i15;
                        i19 = iObjectFieldOffset;
                        i51 = i51;
                    } else {
                        i18 = i15;
                        i19 = iObjectFieldOffset;
                        i51 = i51;
                    }
                }
                i15 = i72;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6828q4);
                if ((iCharAt9 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i59;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i59;
                    i17 = 0;
                }
                if (i63 >= 18) {
                    i18 = i15;
                    i19 = iObjectFieldOffset;
                    i51 = i51;
                } else {
                    i18 = i15;
                    i19 = iObjectFieldOffset;
                    i51 = i51;
                }
            }
            int i80 = i53 + 1;
            iArr3[i53] = i60;
            int i81 = i53 + 2;
            String str2 = str;
            iArr3[i80] = ((iCharAt9 & 256) != 0 ? 268435456 : 0) | ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i63 << 20) | i19;
            i53 += 3;
            iArr3[i81] = (i17 << 20) | iObjectFieldOffset2;
            i3 = i18;
            i2 = i64;
            length = i13;
            objArr3 = objArr;
            i27 = i16;
            iArr2 = iArr3;
            str = str2;
            i25 = 55296;
        }
        AbstractC1180a abstractC1180a = er7Var.f37754a;
        er7Var.m11323a();
        return new C1186g(iArr2, objArr3, abstractC1180a, iArr, i4, yk6Var, ze5Var, abstractC1189j, tx2Var, xp5Var);
    }

    /* JADX INFO: renamed from: o */
    public static int m6826o(Object obj, long j) {
        return ((Integer) zga.f71556c.m23938i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: p */
    public static long m6827p(Object obj, long j) {
        return ((Long) zga.f71556c.m23938i(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: q */
    public static Field m6828q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Field ", str, " for ");
            sbM17742q.append(cls.getName());
            sbM17742q.append(" not found. Known fields are ");
            sbM17742q.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM17742q.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m6829s(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: w */
    public static void m6830w(int i, Object obj, m58 m58Var) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            m58Var.m16649o(i, (ByteString) obj);
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        c1181b.m6806o(i, 2);
        c1181b.m6805n((String) obj);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.xm8
    /* JADX INFO: renamed from: a */
    public final int mo6831a(AbstractC1183d abstractC1183d) {
        int i;
        int iM18992a;
        int i2;
        int[] iArr = this.f13941a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM6843t = m6843t(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM6843t;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m6829s(iM6843t)) {
                case 0:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(Double.doubleToLongBits(zga.f71556c.mo17984e(abstractC1183d, j)));
                    i3 = iM18992a + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM18992a = Float.floatToIntBits(zga.f71556c.mo17985f(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(zga.f71556c.m23937h(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(zga.f71556c.m23937h(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(zga.f71556c.m23937h(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo17982c = zga.f71556c.mo17982c(abstractC1183d, j);
                    Charset charset = p94.f55800a;
                    if (zMo17982c) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM18992a = ((String) zga.f71556c.m23938i(abstractC1183d, j)).hashCode();
                    i3 = iM18992a + i;
                    break;
                case 9:
                    Object objM23938i = zga.f71556c.m23938i(abstractC1183d, j);
                    if (objM23938i != null) {
                        iHashCode = objM23938i.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                    i3 = iM18992a + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(zga.f71556c.m23937h(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23936g(abstractC1183d, j);
                    i3 = iM18992a + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM18992a = p94.m18992a(zga.f71556c.m23937h(abstractC1183d, j));
                    i3 = iM18992a + i;
                    break;
                case 17:
                    Object objM23938i2 = zga.f71556c.m23938i(abstractC1183d, j);
                    if (objM23938i2 != null) {
                        iHashCode = objM23938i2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                    i3 = iM18992a + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                    i3 = iM18992a + i;
                    break;
                case 51:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(Double.doubleToLongBits(((Double) zga.f71556c.m23938i(abstractC1183d, j)).doubleValue()));
                        i3 = iM18992a + i;
                    }
                    break;
                case 52:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = Float.floatToIntBits(((Float) zga.f71556c.m23938i(abstractC1183d, j)).floatValue());
                        i3 = iM18992a + i;
                    }
                    break;
                case 53:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(m6827p(abstractC1183d, j));
                        i3 = iM18992a + i;
                    }
                    break;
                case 54:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(m6827p(abstractC1183d, j));
                        i3 = iM18992a + i;
                    }
                    break;
                case 55:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 56:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(m6827p(abstractC1183d, j));
                        i3 = iM18992a + i;
                    }
                    break;
                case 57:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 58:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) zga.f71556c.m23938i(abstractC1183d, j)).booleanValue();
                        Charset charset2 = p94.f55800a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = ((String) zga.f71556c.m23938i(abstractC1183d, j)).hashCode();
                        i3 = iM18992a + i;
                    }
                    break;
                case 60:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                        i3 = iM18992a + i;
                    }
                    break;
                case 61:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                        i3 = iM18992a + i;
                    }
                    break;
                case 62:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 63:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 64:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 65:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(m6827p(abstractC1183d, j));
                        i3 = iM18992a + i;
                    }
                    break;
                case 66:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = m6826o(abstractC1183d, j);
                        i3 = iM18992a + i;
                    }
                    break;
                case 67:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = p94.m18992a(m6827p(abstractC1183d, j));
                        i3 = iM18992a + i;
                    }
                    break;
                case 68:
                    if (m6839j(abstractC1183d, i5, i4)) {
                        i = i3 * 53;
                        iM18992a = zga.f71556c.m23938i(abstractC1183d, j).hashCode();
                        i3 = iM18992a + i;
                    }
                    break;
            }
        }
        ((zfa) this.f13948h).getClass();
        return abstractC1183d.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x032f  */
    /* JADX WARN: Code duplicated, block: B:135:0x033e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0342  */
    /* JADX WARN: Code duplicated, block: B:138:0x034e  */
    /* JADX WARN: Code duplicated, block: B:139:0x035a  */
    /* JADX WARN: Code duplicated, block: B:140:0x036c  */
    /* JADX WARN: Code duplicated, block: B:141:0x037d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0386  */
    /* JADX WARN: Code duplicated, block: B:145:0x038f  */
    /* JADX WARN: Code duplicated, block: B:146:0x039b  */
    /* JADX WARN: Code duplicated, block: B:148:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x040a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0415  */
    /* JADX WARN: Code duplicated, block: B:164:0x041c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0628 A[PHI: r19 r23 r26
      0x0628: PHI (r19v35 int) = 
      (r19v21 int)
      (r19v22 int)
      (r19v23 int)
      (r19v27 int)
      (r19v29 int)
      (r19v30 int)
      (r19v31 int)
      (r19v34 int)
      (r19v36 int)
     binds: [B:287:0x082e, B:283:0x080e, B:279:0x07ee, B:253:0x073c, B:239:0x06cc, B:235:0x06ac, B:231:0x068e, B:224:0x064a, B:218:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x0628: PHI (r23v19 int) = 
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v8 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v16 int)
      (r23v20 int)
     binds: [B:287:0x082e, B:283:0x080e, B:279:0x07ee, B:253:0x073c, B:239:0x06cc, B:235:0x06ac, B:231:0x068e, B:224:0x064a, B:218:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x0628: PHI (r26v18 int) = 
      (r26v2 int)
      (r26v3 int)
      (r26v4 int)
      (r26v8 int)
      (r26v10 int)
      (r26v11 int)
      (r26v12 int)
      (r26v15 int)
      (r26v19 int)
     binds: [B:287:0x082e, B:283:0x080e, B:279:0x07ee, B:253:0x073c, B:239:0x06cc, B:235:0x06ac, B:231:0x068e, B:224:0x064a, B:218:0x0626] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:363:0x033a A[SYNTHETIC] */
    @Override // p000.xm8
    /* JADX INFO: renamed from: b */
    public final int mo6832b(AbstractC1183d abstractC1183d) {
        int i;
        int iM6794c;
        int iM6794c2;
        int iM6794c3;
        int iM6796e;
        int iM6794c4;
        int iM6792a;
        int iM6794c5;
        int iM6794c6;
        int iM6793b;
        int iM6852c;
        int i2;
        int i3;
        int i4;
        int iM6794c7;
        int size;
        int iM6858i;
        int iM6794c8;
        int iM6794c9;
        int iMo6790h;
        int iM24107c;
        int iM6796e2;
        int iMo6790h2;
        int iM6795d;
        int i5;
        WireFormat$FieldType wireFormat$FieldType;
        int iM6794c10;
        int iM6796e3;
        int iMo6790h3;
        int iM6795d2;
        int iM6794c11;
        int iM6794c12;
        int iM6794c13;
        int iM6796e4;
        int iM6794c14;
        int iM6792a2;
        int iM6794c15;
        int iM6793b2;
        C1186g c1186g = this;
        AbstractC1183d abstractC1183d2 = abstractC1183d;
        Unsafe unsafe = f13940k;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iM24107c2 = 0;
        while (true) {
            int[] iArr = c1186g.f13941a;
            if (i8 >= iArr.length) {
                ((zfa) c1186g.f13948h).getClass();
                return abstractC1183d2.unknownFields.m6876a() + iM24107c2;
            }
            int iM6843t = c1186g.m6843t(i8);
            int iM6829s = m6829s(iM6843t);
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i6;
            int i13 = 1;
            if (iM6829s <= 17) {
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(abstractC1183d2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            long j = iM6843t & i6;
            if (iM6829s >= FieldType.DOUBLE_LIST_PACKED.m6785id()) {
                FieldType.SINT64_LIST_PACKED.m6785id();
            }
            char c = '?';
            switch (iM6829s) {
                case 0:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c = C1181b.m6794c(i10) + 8;
                        iM24107c2 += iM6794c;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 1:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c2 = C1181b.m6794c(i10);
                        iM6794c6 = iM6794c2 + 4;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 2:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        long j2 = unsafe.getLong(abstractC1183d2, j);
                        iM6794c3 = C1181b.m6794c(i10);
                        iM6796e = C1181b.m6796e(j2);
                        iM24107c2 += iM6796e + iM6794c3;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 3:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(abstractC1183d2, j);
                        iM6794c3 = C1181b.m6794c(i10);
                        iM6796e = C1181b.m6796e(j3);
                        iM24107c2 += iM6796e + iM6794c3;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 4:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        int i14 = unsafe.getInt(abstractC1183d2, j);
                        iM6794c4 = C1181b.m6794c(i10);
                        iM6792a = C1181b.m6792a(i14);
                        iM24107c2 += iM6792a + iM6794c4;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 5:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c5 = C1181b.m6794c(i10);
                        iM6794c6 = iM6794c5 + 8;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 6:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c2 = C1181b.m6794c(i10);
                        iM6794c6 = iM6794c2 + 4;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 7:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c6 = C1181b.m6794c(i10) + 1;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 8:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        Object object = unsafe.getObject(abstractC1183d2, j);
                        if (object instanceof ByteString) {
                            int iM6794c16 = C1181b.m6794c(i10);
                            int size2 = ((ByteString) object).size();
                            iM6793b = wq1.m24107c(size2, size2, iM6794c16, iM24107c2);
                        } else {
                            iM6793b = C1181b.m6793b((String) object) + C1181b.m6794c(i10) + iM24107c2;
                        }
                        iM24107c2 = iM6793b;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 9:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(abstractC1183d2, j);
                        xm8 xm8VarM6836f = c1186g.m6836f(i8);
                        Class cls = AbstractC1188i.f13953a;
                        int iM6794c17 = C1181b.m6794c(i10);
                        int iMo6790h4 = ((AbstractC1180a) object2).mo6790h(xm8VarM6836f);
                        iM24107c2 = wq1.m24107c(iMo6790h4, iMo6790h4, iM6794c17, iM24107c2);
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 10:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        ByteString byteString = (ByteString) unsafe.getObject(abstractC1183d2, j);
                        int iM6794c18 = C1181b.m6794c(i10);
                        int size3 = byteString.size();
                        iM24107c2 = wq1.m24107c(size3, size3, iM6794c18, iM24107c2);
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 11:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        int i15 = unsafe.getInt(abstractC1183d2, j);
                        iM6794c4 = C1181b.m6794c(i10);
                        iM6792a = C1181b.m6795d(i15);
                        iM24107c2 += iM6792a + iM6794c4;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 12:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(abstractC1183d2, j);
                        iM6794c4 = C1181b.m6794c(i10);
                        iM6792a = C1181b.m6792a(i16);
                        iM24107c2 += iM6792a + iM6794c4;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 13:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c2 = C1181b.m6794c(i10);
                        iM6794c6 = iM6794c2 + 4;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 14:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c5 = C1181b.m6794c(i10);
                        iM6794c6 = iM6794c5 + 8;
                        iM24107c2 += iM6794c6;
                    }
                    c1186g = this;
                    abstractC1183d2 = abstractC1183d;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 15:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        int i17 = unsafe.getInt(abstractC1183d2, j);
                        iM6794c4 = C1181b.m6794c(i10);
                        iM6792a = C1181b.m6795d((i17 >> 31) ^ (i17 << 1));
                        iM24107c2 += iM6792a + iM6794c4;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 16:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(abstractC1183d2, j);
                        iM6794c3 = C1181b.m6794c(i10);
                        iM6796e = C1181b.m6796e((j4 >> 63) ^ (j4 << 1));
                        iM24107c2 += iM6796e + iM6794c3;
                    }
                    c1186g = this;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 17:
                    if (c1186g.m6838h(abstractC1183d2, i8, i7, i9, i)) {
                        iM6794c = ((AbstractC1180a) unsafe.getObject(abstractC1183d2, j)).mo6790h(c1186g.m6836f(i8)) + (C1181b.m6794c(i10) * 2);
                        iM24107c2 += iM6794c;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 18:
                    iM6852c = AbstractC1188i.m6852c(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 19:
                    iM6852c = AbstractC1188i.m6851b(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 20:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls2 = AbstractC1188i.f13953a;
                    if (list.size() == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6794c7 = (C1181b.m6794c(i10) * list.size()) + AbstractC1188i.m6854e(list);
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 21:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list2 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls3 = AbstractC1188i.f13953a;
                    size = list2.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6858i(list2);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 22:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list3 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls4 = AbstractC1188i.f13953a;
                    size = list3.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6853d(list3);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM6852c = AbstractC1188i.m6852c(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 24:
                    iM6852c = AbstractC1188i.m6851b(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 25:
                    i2 = i7;
                    i3 = i9;
                    List list4 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls5 = AbstractC1188i.f13953a;
                    int size4 = list4.size();
                    iM24107c2 += size4 == 0 ? 0 : (C1181b.m6794c(i10) + 1) * size4;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 26:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list5 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls6 = AbstractC1188i.f13953a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6794c7 = C1181b.m6794c(i10) * size5;
                        if (list5 instanceof jw4) {
                            jw4 jw4Var = (jw4) list5;
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object raw = jw4Var.getRaw(i18);
                                if (raw instanceof ByteString) {
                                    int size6 = ((ByteString) raw).size();
                                    iM6794c7 = C1181b.m6795d(size6) + size6 + iM6794c7;
                                } else {
                                    iM6794c7 = C1181b.m6793b((String) raw) + iM6794c7;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size5; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof ByteString) {
                                    int size7 = ((ByteString) obj).size();
                                    iM6794c7 = C1181b.m6795d(size7) + size7 + iM6794c7;
                                } else {
                                    iM6794c7 = C1181b.m6793b((String) obj) + iM6794c7;
                                }
                            }
                        }
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i2 = i7;
                    i3 = i9;
                    List list6 = (List) unsafe.getObject(abstractC1183d2, j);
                    xm8 xm8VarM6836f2 = c1186g.m6836f(i8);
                    Class cls7 = AbstractC1188i.f13953a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iM6794c9 = 0;
                    } else {
                        iM6794c9 = C1181b.m6794c(i10) * size8;
                        for (int i20 = 0; i20 < size8; i20++) {
                            int iMo6790h5 = ((AbstractC1180a) list6.get(i20)).mo6790h(xm8VarM6836f2);
                            iM6794c9 += C1181b.m6795d(iMo6790h5) + iMo6790h5;
                        }
                    }
                    iM24107c2 += iM6794c9;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 28:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list7 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls8 = AbstractC1188i.f13953a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6794c7 = C1181b.m6794c(i10) * size9;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int size10 = ((ByteString) list7.get(i21)).size();
                            iM6794c7 += C1181b.m6795d(size10) + size10;
                        }
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 29:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list8 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls9 = AbstractC1188i.f13953a;
                    size = list8.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6857h(list8);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 30:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list9 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls10 = AbstractC1188i.f13953a;
                    size = list9.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6850a(list9);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM6852c = AbstractC1188i.m6851b(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 32:
                    iM6852c = AbstractC1188i.m6852c(i10, (List) unsafe.getObject(abstractC1183d2, j));
                    iM24107c2 += iM6852c;
                    i7 = i7;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 33:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list10 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls11 = AbstractC1188i.f13953a;
                    size = list10.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6855f(list10);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 34:
                    i2 = i7;
                    i3 = i9;
                    i4 = 0;
                    List list11 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls12 = AbstractC1188i.f13953a;
                    size = list11.size();
                    if (size == 0) {
                        iM6794c7 = i4;
                    } else {
                        iM6858i = AbstractC1188i.m6856g(list11);
                        iM6794c8 = C1181b.m6794c(i10);
                        iM6794c7 = (iM6794c8 * size) + iM6858i;
                    }
                    iM24107c2 += iM6794c7;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    i2 = i7;
                    i3 = i9;
                    List list12 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls13 = AbstractC1188i.f13953a;
                    int size11 = list12.size() * 8;
                    if (size11 > 0) {
                        iM24107c2 = wq1.m24107c(size11, C1181b.m6794c(i10), size11, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i2 = i7;
                    i3 = i9;
                    List list13 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls14 = AbstractC1188i.f13953a;
                    int size12 = list13.size() * 4;
                    if (size12 > 0) {
                        iM24107c2 = wq1.m24107c(size12, C1181b.m6794c(i10), size12, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i2 = i7;
                    i3 = i9;
                    int iM6854e = AbstractC1188i.m6854e((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6854e > 0) {
                        iM24107c2 = wq1.m24107c(iM6854e, C1181b.m6794c(i10), iM6854e, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 38:
                    i2 = i7;
                    i3 = i9;
                    int iM6858i2 = AbstractC1188i.m6858i((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6858i2 > 0) {
                        iM24107c2 = wq1.m24107c(iM6858i2, C1181b.m6794c(i10), iM6858i2, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i2 = i7;
                    i3 = i9;
                    int iM6853d = AbstractC1188i.m6853d((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6853d > 0) {
                        iM24107c2 = wq1.m24107c(iM6853d, C1181b.m6794c(i10), iM6853d, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i2 = i7;
                    i3 = i9;
                    List list14 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls15 = AbstractC1188i.f13953a;
                    int size13 = list14.size() * 8;
                    if (size13 > 0) {
                        iM24107c2 = wq1.m24107c(size13, C1181b.m6794c(i10), size13, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i2 = i7;
                    i3 = i9;
                    List list15 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls16 = AbstractC1188i.f13953a;
                    int size14 = list15.size() * 4;
                    if (size14 > 0) {
                        iM24107c2 = wq1.m24107c(size14, C1181b.m6794c(i10), size14, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 42:
                    i2 = i7;
                    i3 = i9;
                    List list16 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls17 = AbstractC1188i.f13953a;
                    int size15 = list16.size();
                    if (size15 > 0) {
                        iM24107c2 = wq1.m24107c(size15, C1181b.m6794c(i10), size15, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 43:
                    i2 = i7;
                    i3 = i9;
                    int iM6857h = AbstractC1188i.m6857h((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6857h > 0) {
                        iM24107c2 = wq1.m24107c(iM6857h, C1181b.m6794c(i10), iM6857h, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i2 = i7;
                    i3 = i9;
                    int iM6850a = AbstractC1188i.m6850a((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6850a > 0) {
                        iM24107c2 = wq1.m24107c(iM6850a, C1181b.m6794c(i10), iM6850a, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i2 = i7;
                    i3 = i9;
                    List list17 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls18 = AbstractC1188i.f13953a;
                    int size16 = list17.size() * 4;
                    if (size16 > 0) {
                        iM24107c2 = wq1.m24107c(size16, C1181b.m6794c(i10), size16, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 46:
                    i2 = i7;
                    i3 = i9;
                    List list18 = (List) unsafe.getObject(abstractC1183d2, j);
                    Class cls19 = AbstractC1188i.f13953a;
                    int size17 = list18.size() * 8;
                    if (size17 > 0) {
                        iM24107c2 = wq1.m24107c(size17, C1181b.m6794c(i10), size17, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 47:
                    i2 = i7;
                    i3 = i9;
                    int iM6855f = AbstractC1188i.m6855f((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6855f > 0) {
                        iM24107c2 = wq1.m24107c(iM6855f, C1181b.m6794c(i10), iM6855f, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case eda.f37086g /* 48 */:
                    i2 = i7;
                    i3 = i9;
                    int iM6856g = AbstractC1188i.m6856g((List) unsafe.getObject(abstractC1183d2, j));
                    if (iM6856g > 0) {
                        iM24107c2 = wq1.m24107c(iM6856g, C1181b.m6794c(i10), iM6856g, iM24107c2);
                    }
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 49:
                    i2 = i7;
                    i3 = i9;
                    List list19 = (List) unsafe.getObject(abstractC1183d2, j);
                    xm8 xm8VarM6836f3 = c1186g.m6836f(i8);
                    Class cls20 = AbstractC1188i.f13953a;
                    int size18 = list19.size();
                    if (size18 == 0) {
                        iMo6790h = 0;
                    } else {
                        iMo6790h = 0;
                        for (int i22 = 0; i22 < size18; i22++) {
                            iMo6790h += ((AbstractC1180a) list19.get(i22)).mo6790h(xm8VarM6836f3) + (C1181b.m6794c(i10) * 2);
                        }
                    }
                    iM24107c2 += iMo6790h;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1183d2, j);
                    Object obj2 = c1186g.f13942b[(i8 / 3) * 2];
                    c1186g.f13949i.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    tp5 tp5Var = (tp5) obj2;
                    if (mapFieldLite.isEmpty()) {
                        iM24107c = 0;
                    } else {
                        iM24107c = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            tp5Var.getClass();
                            int iM6794c19 = C1181b.m6794c(i10);
                            char c2 = c;
                            C3309ls c3309ls = tp5Var.f62696a;
                            int i23 = i13;
                            WireFormat$FieldType wireFormat$FieldType2 = (WireFormat$FieldType) c3309ls.f50064b;
                            int i24 = g33.f40107c;
                            int iM6794c20 = C1181b.m6794c(i23);
                            int i25 = i7;
                            WireFormat$FieldType wireFormat$FieldType3 = WireFormat$FieldType.GROUP;
                            if (wireFormat$FieldType2 == wireFormat$FieldType3) {
                                iM6794c20 *= 2;
                            }
                            int[] iArr2 = f33.f38336b;
                            int i26 = i9;
                            switch (iArr2[wireFormat$FieldType2.ordinal()]) {
                                case 1:
                                    ((Double) key).getClass();
                                    iM6796e2 = 8;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i27 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i27, i27, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i28 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i28, i28, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i29 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i29, i29, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i210 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i210, i210, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211, i211, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i212 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i212, i212, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i213 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i213, i213, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i214 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i214, i214, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i215 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i215, i215, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i216 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i216, i216, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i217 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i217, i217, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i218 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i218, i218, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i219 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i219, i219, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2110, i2110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111, i2111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i2112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2112, i2112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue << i23) ^ (jLongValue >> c2));
                                            int i2113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2113, i2113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i2114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2114, i2114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 2:
                                    ((Float) key).getClass();
                                    iM6796e2 = 4;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i2115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2115, i2115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2116, i2116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2117, i2117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2118, i2118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2119, i2119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21110, i21110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111, i21111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21112, i21112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21113, i21113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21114, i21114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i21115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21115, i21115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21116, i21116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21117, i21117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21118, i21118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21119, i21119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i211110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211110, i211110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue2 << i23) ^ (jLongValue2 >> c2));
                                            int i211111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111, i211111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211112, i211112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 3:
                                    iM6796e2 = C1181b.m6796e(((Long) key).longValue());
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211113, i211113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i211114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211114, i211114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211115, i211115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211116, i211116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211117, i211117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211118, i211118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211119, i211119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111110, i2111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111, i2111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111112, i2111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111113, i2111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111114, i2111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i2111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111115, i2111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111116, i2111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111117, i2111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i2111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111118, i2111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue3 << i23) ^ (jLongValue3 >> c2));
                                            int i2111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111119, i2111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111110, i21111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 4:
                                    iM6796e2 = C1181b.m6796e(((Long) key).longValue());
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111, i21111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111112, i21111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111113, i21111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111114, i21111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i21111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111115, i21111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111116, i21111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111117, i21111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111118, i21111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111119, i21111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111110, i211111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111, i211111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111112, i211111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111113, i211111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111114, i211111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111115, i211111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i211111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111116, i211111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue4 << i23) ^ (jLongValue4 >> c2));
                                            int i211111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111117, i211111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111118, i211111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 5:
                                    iM6796e2 = C1181b.m6792a(((Integer) key).intValue());
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111119, i211111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111110, i2111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111, i2111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111112, i2111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111113, i2111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111114, i2111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111115, i2111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111116, i2111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111117, i2111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111118, i2111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111119, i2111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111110, i21111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111, i21111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111112, i21111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111113, i21111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i21111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111114, i21111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue5 << i23) ^ (jLongValue5 >> c2));
                                            int i21111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111115, i21111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111116, i21111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 6:
                                    ((Long) key).getClass();
                                    iM6796e2 = 8;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111117, i21111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111118, i21111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111119, i21111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111110, i211111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111, i211111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111112, i211111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111113, i211111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i211111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111114, i211111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i211111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111115, i211111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111116, i211111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111117, i211111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111118, i211111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111119, i211111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111110, i2111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111, i2111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i2111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111112, i2111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue6 << i23) ^ (jLongValue6 >> c2));
                                            int i2111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111113, i2111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i2111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111114, i2111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 7:
                                    ((Integer) key).getClass();
                                    iM6796e2 = 4;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111115, i2111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111116, i2111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111117, i2111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111118, i2111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111119, i2111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111110, i21111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111, i21111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111112, i21111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111113, i21111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111114, i21111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i21111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111115, i21111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111116, i21111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111117, i21111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111118, i21111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111119, i21111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i211111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111110, i211111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue7 << i23) ^ (jLongValue7 >> c2));
                                            int i211111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111, i211111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111112, i211111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 8:
                                    ((Boolean) key).getClass();
                                    iM6796e2 = i23;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111113, i211111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111114, i211111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111115, i211111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111116, i211111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111117, i211111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111118, i211111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111119, i211111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111110, i2111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111, i2111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111112, i2111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111113, i2111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111114, i2111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i2111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111115, i2111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111116, i2111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111117, i2111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i2111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111118, i2111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue8 << i23) ^ (jLongValue8 >> c2));
                                            int i2111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111119, i2111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111110, i21111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 9:
                                    iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) key)).mo6790h(null);
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111, i21111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111112, i21111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111113, i21111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111114, i21111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i21111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111115, i21111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111116, i21111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111117, i21111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111118, i21111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111119, i21111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111110, i211111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111, i211111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111112, i211111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111113, i211111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111114, i211111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111115, i211111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i211111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111116, i211111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue9 << i23) ^ (jLongValue9 >> c2));
                                            int i211111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111117, i211111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111118, i211111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 10:
                                    iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) key)).mo6790h(null);
                                    iM6795d = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iMo6790h2 + iM6795d;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111119, i211111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111110, i2111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111, i2111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111112, i2111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111113, i2111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111114, i2111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111115, i2111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111116, i2111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111117, i2111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111118, i2111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111119, i2111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111110, i21111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111, i21111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111112, i21111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111113, i21111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i21111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111114, i21111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue10 << i23) ^ (jLongValue10 >> c2));
                                            int i21111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111115, i21111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111116, i21111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 11:
                                    if (key instanceof ByteString) {
                                        iMo6790h2 = ((ByteString) key).size();
                                        iM6795d = C1181b.m6795d(iMo6790h2);
                                        iM6796e2 = iMo6790h2 + iM6795d;
                                    } else {
                                        iM6796e2 = C1181b.m6793b((String) key);
                                    }
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111117, i21111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111118, i21111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111119, i21111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111110, i211111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111, i211111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111112, i211111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111113, i211111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i211111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111114, i211111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i211111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111115, i211111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111116, i211111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111117, i211111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111118, i211111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111119, i211111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111110, i2111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111, i2111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i2111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111112, i2111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue11 << i23) ^ (jLongValue11 >> c2));
                                            int i2111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111113, i2111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111114, i2111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 12:
                                    if (key instanceof ByteString) {
                                        iMo6790h2 = ((ByteString) key).size();
                                        iM6795d = C1181b.m6795d(iMo6790h2);
                                    } else {
                                        iMo6790h2 = ((byte[]) key).length;
                                        iM6795d = C1181b.m6795d(iMo6790h2);
                                    }
                                    iM6796e2 = iMo6790h2 + iM6795d;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111115, i2111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111116, i2111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111117, i2111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111118, i2111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111119, i2111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111110, i21111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111, i21111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111112, i21111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111113, i21111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111114, i21111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i21111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111115, i21111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111116, i21111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111117, i21111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111118, i21111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111119, i21111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i211111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111110, i211111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue12 << i23) ^ (jLongValue12 >> c2));
                                            int i211111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111, i211111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111112, i211111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 13:
                                    iM6796e2 = C1181b.m6795d(((Integer) key).intValue());
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111113, i211111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111114, i211111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111115, i211111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111116, i211111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111117, i211111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111118, i211111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111119, i211111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111110, i2111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111, i2111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111112, i2111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111113, i2111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111114, i2111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i2111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111115, i2111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111116, i2111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111117, i2111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i2111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111118, i2111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue13 << i23) ^ (jLongValue13 >> c2));
                                            int i2111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111119, i2111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111110, i21111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iM6796e2 = 4;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111, i21111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111112, i21111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111113, i21111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111114, i21111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i21111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111115, i21111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111116, i21111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111117, i21111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111118, i21111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111119, i21111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111110, i211111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111, i211111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111112, i211111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111113, i211111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111114, i211111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111115, i211111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i211111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111116, i211111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue14 << i23) ^ (jLongValue14 >> c2));
                                            int i211111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111117, i211111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111118, i211111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iM6796e2 = 8;
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111119, i211111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111110, i2111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111, i2111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111112, i2111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111113, i2111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111114, i2111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111115, i2111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111116, i2111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111117, i2111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111118, i2111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111119, i2111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111110, i21111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111, i21111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111112, i21111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111113, i21111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i21111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111114, i21111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue15 << i23) ^ (jLongValue15 >> c2));
                                            int i21111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111115, i21111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111116, i21111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 16:
                                    int iIntValue16 = ((Integer) key).intValue();
                                    iM6796e2 = C1181b.m6795d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111117, i21111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111118, i21111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i21111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111119, i21111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111110, i211111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111, i211111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111112, i211111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111113, i211111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i211111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111114, i211111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i211111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111115, i211111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111116, i211111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i211111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111117, i211111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i211111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111118, i211111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i211111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111119, i211111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111110, i2111111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111, i2111111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue17 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                            int i2111111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111112, i2111111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue16 << i23) ^ (jLongValue16 >> c2));
                                            int i2111111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111113, i2111111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111114, i2111111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 17:
                                    long jLongValue17 = ((Long) key).longValue();
                                    iM6796e2 = C1181b.m6796e((jLongValue17 << i23) ^ (jLongValue17 >> c2));
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111115, i2111111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111116, i2111111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111117, i2111111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i2111111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111118, i2111111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i2111111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111119, i2111111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111110, i21111111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111111, i21111111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i21111111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111112, i21111111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i21111111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111113, i21111111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111114, i21111111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i21111111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111115, i21111111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i21111111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111116, i21111111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i21111111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111117, i21111111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i21111111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111118, i21111111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i21111111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111119, i21111111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i211111111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111110, i211111111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue18 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue18 << i23) ^ (jLongValue18 >> c2));
                                            int i211111111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111111, i211111111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111112, i211111111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 18:
                                    iM6796e2 = key instanceof a94 ? C1181b.m6792a(((a94) key).getNumber()) : C1181b.m6792a(((Integer) key).intValue());
                                    i5 = iM6796e2 + iM6794c20;
                                    wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
                                    iM6794c10 = C1181b.m6794c(2);
                                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                                        iM6794c10 *= 2;
                                    }
                                    switch (iArr2[wireFormat$FieldType.ordinal()]) {
                                        case 1:
                                            ((Double) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111113, i211111111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 2:
                                            ((Float) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111114, i211111111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 3:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111115, i211111111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 4:
                                            iM6796e3 = C1181b.m6796e(((Long) value).longValue());
                                            int i211111111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111116, i211111111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 5:
                                            iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            int i211111111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111117, i211111111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 6:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i211111111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111118, i211111111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 7:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i211111111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i211111111111111111111111111111119, i211111111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 8:
                                            ((Boolean) value).getClass();
                                            iM6796e3 = i23;
                                            int i2111111111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111110, i2111111111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 9:
                                            iM6796e3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            int i2111111111111111111111111111111111 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111111, i2111111111111111111111111111111111, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 10:
                                            iMo6790h3 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                            iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111111111111111111112 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111112, i2111111111111111111111111111111112, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 11:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                                iM6796e3 = iMo6790h3 + iM6795d2;
                                            } else {
                                                iM6796e3 = C1181b.m6793b((String) value);
                                            }
                                            int i2111111111111111111111111111111113 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111113, i2111111111111111111111111111111113, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 12:
                                            if (value instanceof ByteString) {
                                                iMo6790h3 = ((ByteString) value).size();
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            } else {
                                                iMo6790h3 = ((byte[]) value).length;
                                                iM6795d2 = C1181b.m6795d(iMo6790h3);
                                            }
                                            iM6796e3 = iMo6790h3 + iM6795d2;
                                            int i2111111111111111111111111111111114 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111114, i2111111111111111111111111111111114, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 13:
                                            iM6796e3 = C1181b.m6795d(((Integer) value).intValue());
                                            int i2111111111111111111111111111111115 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111115, i2111111111111111111111111111111115, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iM6796e3 = 4;
                                            int i2111111111111111111111111111111116 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111116, i2111111111111111111111111111111116, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iM6796e3 = 8;
                                            int i2111111111111111111111111111111117 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111117, i2111111111111111111111111111111117, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iM6796e3 = C1181b.m6795d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i2111111111111111111111111111111118 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111118, i2111111111111111111111111111111118, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iM6796e3 = C1181b.m6796e((jLongValue19 << i23) ^ (jLongValue19 >> c2));
                                            int i2111111111111111111111111111111119 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i2111111111111111111111111111111119, i2111111111111111111111111111111119, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        case 18:
                                            if (value instanceof a94) {
                                                iM6796e3 = C1181b.m6792a(((a94) value).getNumber());
                                            } else {
                                                iM6796e3 = C1181b.m6792a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111111111110 = iM6796e3 + iM6794c10 + i5;
                                            iM24107c = wq1.m24107c(i21111111111111111111111111111111110, i21111111111111111111111111111111110, iM6794c19, iM24107c);
                                            c = c2;
                                            i13 = i23;
                                            i7 = i25;
                                            i9 = i26;
                                            break;
                                        default:
                                            ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                default:
                                    ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                    return 0;
                            }
                        }
                    }
                    i2 = i7;
                    i3 = i9;
                    iM24107c2 += iM24107c;
                    i7 = i2;
                    i9 = i3;
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 51:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c11 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c11 + 8;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 52:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c12 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c12 + 4;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 53:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        long jM6827p = m6827p(abstractC1183d2, j);
                        iM6794c13 = C1181b.m6794c(i10);
                        iM6796e4 = C1181b.m6796e(jM6827p);
                        iM24107c2 += iM6796e4 + iM6794c13;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 54:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        long jM6827p2 = m6827p(abstractC1183d2, j);
                        iM6794c13 = C1181b.m6794c(i10);
                        iM6796e4 = C1181b.m6796e(jM6827p2);
                        iM24107c2 += iM6796e4 + iM6794c13;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 55:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        int iM6826o = m6826o(abstractC1183d2, j);
                        iM6794c14 = C1181b.m6794c(i10);
                        iM6792a2 = C1181b.m6792a(iM6826o);
                        iM6794c15 = iM6792a2 + iM6794c14;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 56:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c11 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c11 + 8;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 57:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c12 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c12 + 4;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 58:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c15 = C1181b.m6794c(i10) + 1;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 59:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        Object object4 = unsafe.getObject(abstractC1183d2, j);
                        if (object4 instanceof ByteString) {
                            int iM6794c21 = C1181b.m6794c(i10);
                            int size19 = ((ByteString) object4).size();
                            iM6793b2 = wq1.m24107c(size19, size19, iM6794c21, iM24107c2);
                        } else {
                            iM6793b2 = C1181b.m6793b((String) object4) + C1181b.m6794c(i10) + iM24107c2;
                        }
                        iM24107c2 = iM6793b2;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 60:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        Object object5 = unsafe.getObject(abstractC1183d2, j);
                        xm8 xm8VarM6836f4 = c1186g.m6836f(i8);
                        Class cls21 = AbstractC1188i.f13953a;
                        int iM6794c22 = C1181b.m6794c(i10);
                        int iMo6790h6 = ((AbstractC1180a) object5).mo6790h(xm8VarM6836f4);
                        iM24107c2 = wq1.m24107c(iMo6790h6, iMo6790h6, iM6794c22, iM24107c2);
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 61:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        ByteString byteString2 = (ByteString) unsafe.getObject(abstractC1183d2, j);
                        int iM6794c23 = C1181b.m6794c(i10);
                        int size20 = byteString2.size();
                        iM24107c2 = wq1.m24107c(size20, size20, iM6794c23, iM24107c2);
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 62:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        int iM6826o2 = m6826o(abstractC1183d2, j);
                        iM6794c14 = C1181b.m6794c(i10);
                        iM6792a2 = C1181b.m6795d(iM6826o2);
                        iM6794c15 = iM6792a2 + iM6794c14;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 63:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        int iM6826o3 = m6826o(abstractC1183d2, j);
                        iM6794c14 = C1181b.m6794c(i10);
                        iM6792a2 = C1181b.m6792a(iM6826o3);
                        iM6794c15 = iM6792a2 + iM6794c14;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 64:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c12 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c12 + 4;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 65:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c11 = C1181b.m6794c(i10);
                        iM6794c15 = iM6794c11 + 8;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 66:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        int iM6826o4 = m6826o(abstractC1183d2, j);
                        iM6794c14 = C1181b.m6794c(i10);
                        iM6792a2 = C1181b.m6795d((iM6826o4 >> 31) ^ (iM6826o4 << 1));
                        iM6794c15 = iM6792a2 + iM6794c14;
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 67:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        long jM6827p3 = m6827p(abstractC1183d2, j);
                        iM6794c13 = C1181b.m6794c(i10);
                        iM6796e4 = C1181b.m6796e((jM6827p3 << 1) ^ (jM6827p3 >> 63));
                        iM24107c2 += iM6796e4 + iM6794c13;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                case 68:
                    if (c1186g.m6839j(abstractC1183d2, i10, i8)) {
                        iM6794c15 = ((AbstractC1180a) unsafe.getObject(abstractC1183d2, j)).mo6790h(c1186g.m6836f(i8)) + (C1181b.m6794c(i10) * 2);
                        iM24107c2 += iM6794c15;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    break;
                default:
                    i8 += 3;
                    i6 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.xm8
    /* JADX INFO: renamed from: c */
    public final boolean mo6833c(AbstractC1183d abstractC1183d, AbstractC1183d abstractC1183d2) {
        int[] iArr = this.f13941a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM6860k = true;
            if (i < length) {
                int iM6843t = m6843t(i);
                long j = iM6843t & 1048575;
                switch (m6829s(iM6843t)) {
                    case 0:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar = zga.f71556c;
                            if (Double.doubleToLongBits(wgaVar.mo17984e(abstractC1183d, j)) != Double.doubleToLongBits(wgaVar.mo17984e(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar2 = zga.f71556c;
                            if (Float.floatToIntBits(wgaVar2.mo17985f(abstractC1183d, j)) != Float.floatToIntBits(wgaVar2.mo17985f(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar3 = zga.f71556c;
                            if (wgaVar3.m23937h(abstractC1183d, j) != wgaVar3.m23937h(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar4 = zga.f71556c;
                            if (wgaVar4.m23937h(abstractC1183d, j) != wgaVar4.m23937h(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar5 = zga.f71556c;
                            if (wgaVar5.m23936g(abstractC1183d, j) != wgaVar5.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar6 = zga.f71556c;
                            if (wgaVar6.m23937h(abstractC1183d, j) != wgaVar6.m23937h(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar7 = zga.f71556c;
                            if (wgaVar7.m23936g(abstractC1183d, j) != wgaVar7.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar8 = zga.f71556c;
                            if (wgaVar8.mo17982c(abstractC1183d, j) != wgaVar8.mo17982c(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar9 = zga.f71556c;
                            if (!AbstractC1188i.m6860k(wgaVar9.m23938i(abstractC1183d, j), wgaVar9.m23938i(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar10 = zga.f71556c;
                            if (!AbstractC1188i.m6860k(wgaVar10.m23938i(abstractC1183d, j), wgaVar10.m23938i(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar11 = zga.f71556c;
                            if (!AbstractC1188i.m6860k(wgaVar11.m23938i(abstractC1183d, j), wgaVar11.m23938i(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar12 = zga.f71556c;
                            if (wgaVar12.m23936g(abstractC1183d, j) != wgaVar12.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar13 = zga.f71556c;
                            if (wgaVar13.m23936g(abstractC1183d, j) != wgaVar13.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar14 = zga.f71556c;
                            if (wgaVar14.m23936g(abstractC1183d, j) != wgaVar14.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar15 = zga.f71556c;
                            if (wgaVar15.m23937h(abstractC1183d, j) != wgaVar15.m23937h(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar16 = zga.f71556c;
                            if (wgaVar16.m23936g(abstractC1183d, j) != wgaVar16.m23936g(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar17 = zga.f71556c;
                            if (wgaVar17.m23937h(abstractC1183d, j) != wgaVar17.m23937h(abstractC1183d2, j)) {
                                zM6860k = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m6835e(abstractC1183d, abstractC1183d2, i)) {
                            zM6860k = false;
                        } else {
                            wga wgaVar18 = zga.f71556c;
                            if (!AbstractC1188i.m6860k(wgaVar18.m23938i(abstractC1183d, j), wgaVar18.m23938i(abstractC1183d2, j))) {
                                zM6860k = false;
                            }
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
                        wga wgaVar19 = zga.f71556c;
                        zM6860k = AbstractC1188i.m6860k(wgaVar19.m23938i(abstractC1183d, j), wgaVar19.m23938i(abstractC1183d2, j));
                        break;
                    case 50:
                        wga wgaVar20 = zga.f71556c;
                        zM6860k = AbstractC1188i.m6860k(wgaVar20.m23938i(abstractC1183d, j), wgaVar20.m23938i(abstractC1183d2, j));
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
                        wga wgaVar21 = zga.f71556c;
                        if (wgaVar21.m23936g(abstractC1183d, j2) != wgaVar21.m23936g(abstractC1183d2, j2) || !AbstractC1188i.m6860k(wgaVar21.m23938i(abstractC1183d, j), wgaVar21.m23938i(abstractC1183d2, j))) {
                            zM6860k = false;
                        }
                        break;
                }
                if (zM6860k) {
                    i += 3;
                }
            } else {
                zfa zfaVar = (zfa) this.f13948h;
                zfaVar.getClass();
                C1190k c1190k = abstractC1183d.unknownFields;
                zfaVar.getClass();
                if (c1190k.equals(abstractC1183d2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.xm8
    /* JADX INFO: renamed from: d */
    public final void mo6834d(Object obj, m58 m58Var) throws CodedOutputStream$OutOfSpaceException {
        m58Var.getClass();
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            m6844u(obj, m58Var);
            return;
        }
        ((zfa) this.f13948h).getClass();
        ((AbstractC1183d) obj).unknownFields.m6877b(m58Var);
        int[] iArr = this.f13941a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iM6843t = m6843t(length);
            int i = iArr[length];
            switch (m6829s(iM6843t)) {
                case 0:
                    if (m6837g(obj, length)) {
                        double dMo17984e = zga.f71556c.mo17984e(obj, iM6843t & 1048575);
                        c1181b.getClass();
                        c1181b.m6802k(i, Double.doubleToRawLongBits(dMo17984e));
                    }
                    break;
                case 1:
                    if (m6837g(obj, length)) {
                        float fMo17985f = zga.f71556c.mo17985f(obj, iM6843t & 1048575);
                        c1181b.getClass();
                        c1181b.m6800i(i, Float.floatToRawIntBits(fMo17985f));
                    }
                    break;
                case 2:
                    if (m6837g(obj, length)) {
                        c1181b.m6808q(i, zga.f71556c.m23937h(obj, iM6843t & 1048575));
                    }
                    break;
                case 3:
                    if (m6837g(obj, length)) {
                        c1181b.m6808q(i, zga.f71556c.m23937h(obj, iM6843t & 1048575));
                    }
                    break;
                case 4:
                    if (m6837g(obj, length)) {
                        int iM23936g = zga.f71556c.m23936g(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6804m(iM23936g);
                    }
                    break;
                case 5:
                    if (m6837g(obj, length)) {
                        c1181b.m6802k(i, zga.f71556c.m23937h(obj, iM6843t & 1048575));
                    }
                    break;
                case 6:
                    if (m6837g(obj, length)) {
                        c1181b.m6800i(i, zga.f71556c.m23936g(obj, iM6843t & 1048575));
                    }
                    break;
                case 7:
                    if (m6837g(obj, length)) {
                        boolean zMo17982c = zga.f71556c.mo17982c(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6797f(zMo17982c ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (m6837g(obj, length)) {
                        m6830w(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var);
                    }
                    break;
                case 9:
                    if (m6837g(obj, length)) {
                        m58Var.m16651r(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m6836f(length));
                    }
                    break;
                case 10:
                    if (m6837g(obj, length)) {
                        m58Var.m16649o(i, (ByteString) zga.f71556c.m23938i(obj, iM6843t & 1048575));
                    }
                    break;
                case 11:
                    if (m6837g(obj, length)) {
                        int iM23936g2 = zga.f71556c.m23936g(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6807p(iM23936g2);
                    }
                    break;
                case 12:
                    if (m6837g(obj, length)) {
                        int iM23936g3 = zga.f71556c.m23936g(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6804m(iM23936g3);
                    }
                    break;
                case 13:
                    if (m6837g(obj, length)) {
                        c1181b.m6800i(i, zga.f71556c.m23936g(obj, iM6843t & 1048575));
                    }
                    break;
                case 14:
                    if (m6837g(obj, length)) {
                        c1181b.m6802k(i, zga.f71556c.m23937h(obj, iM6843t & 1048575));
                    }
                    break;
                case 15:
                    if (m6837g(obj, length)) {
                        int iM23936g4 = zga.f71556c.m23936g(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6807p((iM23936g4 >> 31) ^ (iM23936g4 << 1));
                    }
                    break;
                case 16:
                    if (m6837g(obj, length)) {
                        long jM23937h = zga.f71556c.m23937h(obj, iM6843t & 1048575);
                        c1181b.m6808q(i, (jM23937h >> 63) ^ (jM23937h << 1));
                    }
                    break;
                case 17:
                    if (m6837g(obj, length)) {
                        m58Var.m16650q(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m6836f(length));
                    }
                    break;
                case 18:
                    AbstractC1188i.m6863n(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 19:
                    AbstractC1188i.m6867r(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 20:
                    AbstractC1188i.m6870u(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 21:
                    AbstractC1188i.m6849C(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 22:
                    AbstractC1188i.m6869t(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC1188i.m6866q(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 24:
                    AbstractC1188i.m6865p(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 25:
                    AbstractC1188i.m6861l(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 26:
                    AbstractC1188i.m6847A(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC1188i.m6871v(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, m6836f(length));
                    break;
                case 28:
                    AbstractC1188i.m6862m(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var);
                    break;
                case 29:
                    AbstractC1188i.m6848B(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 30:
                    AbstractC1188i.m6864o(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC1188i.m6872w(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 32:
                    AbstractC1188i.m6873x(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 33:
                    AbstractC1188i.m6874y(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case 34:
                    AbstractC1188i.m6875z(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, false);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC1188i.m6863n(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC1188i.m6867r(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC1188i.m6870u(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 38:
                    AbstractC1188i.m6849C(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC1188i.m6869t(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC1188i.m6866q(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC1188i.m6865p(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 42:
                    AbstractC1188i.m6861l(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 43:
                    AbstractC1188i.m6848B(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC1188i.m6864o(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC1188i.m6872w(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 46:
                    AbstractC1188i.m6873x(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 47:
                    AbstractC1188i.m6874y(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC1188i.m6875z(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, true);
                    break;
                case 49:
                    AbstractC1188i.m6868s(iArr[length], (List) zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var, m6836f(length));
                    break;
                case 50:
                    m6845v(m58Var, i, zga.f71556c.m23938i(obj, iM6843t & 1048575), length);
                    break;
                case 51:
                    if (m6839j(obj, i, length)) {
                        double dDoubleValue = ((Double) zga.f71556c.m23938i(obj, iM6843t & 1048575)).doubleValue();
                        c1181b.getClass();
                        c1181b.m6802k(i, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (m6839j(obj, i, length)) {
                        float fFloatValue = ((Float) zga.f71556c.m23938i(obj, iM6843t & 1048575)).floatValue();
                        c1181b.getClass();
                        c1181b.m6800i(i, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6808q(i, m6827p(obj, iM6843t & 1048575));
                    }
                    break;
                case 54:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6808q(i, m6827p(obj, iM6843t & 1048575));
                    }
                    break;
                case 55:
                    if (m6839j(obj, i, length)) {
                        int iM6826o = m6826o(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6804m(iM6826o);
                    }
                    break;
                case 56:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6802k(i, m6827p(obj, iM6843t & 1048575));
                    }
                    break;
                case 57:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6800i(i, m6826o(obj, iM6843t & 1048575));
                    }
                    break;
                case 58:
                    if (m6839j(obj, i, length)) {
                        boolean zBooleanValue = ((Boolean) zga.f71556c.m23938i(obj, iM6843t & 1048575)).booleanValue();
                        c1181b.m6806o(i, 0);
                        c1181b.m6797f(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (m6839j(obj, i, length)) {
                        m6830w(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m58Var);
                    }
                    break;
                case 60:
                    if (m6839j(obj, i, length)) {
                        m58Var.m16651r(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m6836f(length));
                    }
                    break;
                case 61:
                    if (m6839j(obj, i, length)) {
                        m58Var.m16649o(i, (ByteString) zga.f71556c.m23938i(obj, iM6843t & 1048575));
                    }
                    break;
                case 62:
                    if (m6839j(obj, i, length)) {
                        int iM6826o2 = m6826o(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6807p(iM6826o2);
                    }
                    break;
                case 63:
                    if (m6839j(obj, i, length)) {
                        int iM6826o3 = m6826o(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6804m(iM6826o3);
                    }
                    break;
                case 64:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6800i(i, m6826o(obj, iM6843t & 1048575));
                    }
                    break;
                case 65:
                    if (m6839j(obj, i, length)) {
                        c1181b.m6802k(i, m6827p(obj, iM6843t & 1048575));
                    }
                    break;
                case 66:
                    if (m6839j(obj, i, length)) {
                        int iM6826o4 = m6826o(obj, iM6843t & 1048575);
                        c1181b.m6806o(i, 0);
                        c1181b.m6807p((iM6826o4 >> 31) ^ (iM6826o4 << 1));
                    }
                    break;
                case 67:
                    if (m6839j(obj, i, length)) {
                        long jM6827p = m6827p(obj, iM6843t & 1048575);
                        c1181b.m6808q(i, (jM6827p >> 63) ^ (jM6827p << 1));
                    }
                    break;
                case 68:
                    if (m6839j(obj, i, length)) {
                        m58Var.m16650q(i, zga.f71556c.m23938i(obj, iM6843t & 1048575), m6836f(length));
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6835e(AbstractC1183d abstractC1183d, AbstractC1183d abstractC1183d2, int i) {
        return m6837g(abstractC1183d, i) == m6837g(abstractC1183d2, i);
    }

    /* JADX INFO: renamed from: f */
    public final xm8 m6836f(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f13942b;
        xm8 xm8Var = (xm8) objArr[i2];
        if (xm8Var != null) {
            return xm8Var;
        }
        xm8 xm8VarM12783a = go7.f41083c.m12783a((Class) objArr[i2 + 1]);
        objArr[i2] = xm8VarM12783a;
        return xm8VarM12783a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    /* JADX INFO: renamed from: g */
    public final boolean m6837g(Object obj, int i) {
        int i2 = this.f13941a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & zga.f71556c.m23936g(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM6843t = m6843t(i);
        long j2 = iM6843t & 1048575;
        switch (m6829s(iM6843t)) {
            case 0:
                if (Double.doubleToRawLongBits(zga.f71556c.mo17984e(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(zga.f71556c.mo17985f(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (zga.f71556c.m23937h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (zga.f71556c.m23937h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (zga.f71556c.m23937h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return zga.f71556c.mo17982c(obj, j2);
            case 8:
                Object objM23938i = zga.f71556c.m23938i(obj, j2);
                if (objM23938i instanceof String) {
                    return !((String) objM23938i).isEmpty();
                }
                if (objM23938i instanceof ByteString) {
                    return !ByteString.f13921b.equals(objM23938i);
                }
                ij6.m13959q();
                return false;
            case 9:
                if (zga.f71556c.m23938i(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ByteString.f13921b.equals(zga.f71556c.m23938i(obj, j2));
            case 11:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (zga.f71556c.m23937h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (zga.f71556c.m23936g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (zga.f71556c.m23937h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (zga.f71556c.m23938i(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6838h(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m6837g(obj, i);
        }
        return (i3 & i4) != 0;
    }

    @Override // p000.xm8
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f13945e) {
            int i6 = this.f13944d[i5];
            int[] iArr = this.f13941a;
            int i7 = iArr[i6];
            int iM6843t = m6843t(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f13940k.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM6843t) == 0 || m6838h(obj, i6, i, i2, i10)) {
                int iM6829s = m6829s(iM6843t);
                if (iM6829s == 9 || iM6829s == 17) {
                    if (m6838h(obj, i6, i, i2, i10)) {
                        if (!m6836f(i6).isInitialized(zga.f71556c.m23938i(obj, iM6843t & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM6829s != 27) {
                        if (iM6829s == 60 || iM6829s == 68) {
                            if (m6839j(obj, i7, i6)) {
                                if (!m6836f(i6).isInitialized(zga.f71556c.m23938i(obj, iM6843t & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM6829s != 49) {
                            if (iM6829s != 50) {
                                continue;
                            } else {
                                Object objM23938i = zga.f71556c.m23938i(obj, iM6843t & 1048575);
                                this.f13949i.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) objM23938i;
                                if (mapFieldLite.isEmpty()) {
                                    continue;
                                } else {
                                    if (((WireFormat$FieldType) ((tp5) this.f13942b[(i6 / 3) * 2]).f62696a.f50065c).getJavaType() != WireFormat$JavaType.MESSAGE) {
                                        continue;
                                    } else {
                                        xm8 xm8VarM12783a = null;
                                        for (Object obj2 : mapFieldLite.values()) {
                                            if (xm8VarM12783a == null) {
                                                xm8VarM12783a = go7.f41083c.m12783a(obj2.getClass());
                                            }
                                            if (!xm8VarM12783a.isInitialized(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) zga.f71556c.m23938i(obj, iM6843t & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        xm8 xm8VarM6836f = m6836f(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (xm8VarM6836f.isInitialized(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6839j(Object obj, int i, int i2) {
        return zga.f71556c.m23936g(obj, (long) (this.f13941a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: k */
    public final void m6840k(Object obj, Object obj2, int i) {
        if (m6837g(obj2, i)) {
            long jM6843t = m6843t(i) & 1048575;
            Unsafe unsafe = f13940k;
            Object object = unsafe.getObject(obj2, jM6843t);
            if (object == null) {
                ij6.m13947d(this.f13941a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            xm8 xm8VarM6836f = m6836f(i);
            if (!m6837g(obj, i)) {
                if (m6823i(object)) {
                    AbstractC1183d abstractC1183dNewInstance = xm8VarM6836f.newInstance();
                    xm8VarM6836f.mergeFrom(abstractC1183dNewInstance, object);
                    unsafe.putObject(obj, jM6843t, abstractC1183dNewInstance);
                } else {
                    unsafe.putObject(obj, jM6843t, object);
                }
                m6842r(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM6843t);
            if (!m6823i(object2)) {
                AbstractC1183d abstractC1183dNewInstance2 = xm8VarM6836f.newInstance();
                xm8VarM6836f.mergeFrom(abstractC1183dNewInstance2, object2);
                unsafe.putObject(obj, jM6843t, abstractC1183dNewInstance2);
                object2 = abstractC1183dNewInstance2;
            }
            xm8VarM6836f.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6841l(Object obj, Object obj2, int i) {
        int[] iArr = this.f13941a;
        int i2 = iArr[i];
        if (m6839j(obj2, i2, i)) {
            long jM6843t = m6843t(i) & 1048575;
            Unsafe unsafe = f13940k;
            Object object = unsafe.getObject(obj2, jM6843t);
            if (object == null) {
                ij6.m13947d(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            xm8 xm8VarM6836f = m6836f(i);
            if (!m6839j(obj, i2, i)) {
                if (m6823i(object)) {
                    AbstractC1183d abstractC1183dNewInstance = xm8VarM6836f.newInstance();
                    xm8VarM6836f.mergeFrom(abstractC1183dNewInstance, object);
                    unsafe.putObject(obj, jM6843t, abstractC1183dNewInstance);
                } else {
                    unsafe.putObject(obj, jM6843t, object);
                }
                zga.m25614n(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM6843t);
            if (!m6823i(object2)) {
                AbstractC1183d abstractC1183dNewInstance2 = xm8VarM6836f.newInstance();
                xm8VarM6836f.mergeFrom(abstractC1183dNewInstance2, object2);
                unsafe.putObject(obj, jM6843t, abstractC1183dNewInstance2);
                object2 = abstractC1183dNewInstance2;
            }
            xm8VarM6836f.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // p000.xm8
    public final void makeImmutable(Object obj) {
        if (m6823i(obj)) {
            if (obj instanceof AbstractC1183d) {
                AbstractC1183d abstractC1183d = (AbstractC1183d) obj;
                abstractC1183d.m6817r(Integer.MAX_VALUE);
                abstractC1183d.memoizedHashCode = 0;
                abstractC1183d.m6816o();
            }
            int[] iArr = this.f13941a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM6843t = m6843t(i);
                long j = 1048575 & iM6843t;
                int iM6829s = m6829s(iM6843t);
                if (iM6829s != 9) {
                    if (iM6829s != 60 && iM6829s != 68) {
                        switch (iM6829s) {
                            case 17:
                                if (m6837g(obj, i)) {
                                    m6836f(i).makeImmutable(f13940k.getObject(obj, j));
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
                                this.f13947g.mo23245a(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = f13940k;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f13949i.getClass();
                                    ((MapFieldLite) object).f13928a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m6839j(obj, iArr[i], i)) {
                        m6836f(i).makeImmutable(f13940k.getObject(obj, j));
                    }
                } else if (m6837g(obj, i)) {
                    m6836f(i).makeImmutable(f13940k.getObject(obj, j));
                }
            }
            ((zfa) this.f13948h).getClass();
            C1190k c1190k = ((AbstractC1183d) obj).unknownFields;
            if (c1190k.f13961e) {
                c1190k.f13961e = false;
            }
        }
    }

    @Override // p000.xm8
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        if (!m6823i(obj)) {
            C3386nv.m17626m(AbstractC3393o1.m17733h(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f13941a;
            if (i >= iArr.length) {
                AbstractC1188i.m6859j(this.f13948h, obj, obj2);
                return;
            }
            int iM6843t = m6843t(i);
            long j = iM6843t & 1048575;
            int i2 = iArr[i];
            switch (m6829s(iM6843t)) {
                case 0:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar = zga.f71556c;
                        wgaVar.mo17988m(obj3, j, wgaVar.mo17984e(obj2, j));
                        m6842r(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar2 = zga.f71556c;
                        wgaVar2.mo17989n(obj3, j, wgaVar2.mo17985f(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar3 = zga.f71556c;
                        wgaVar3.m23941p(obj3, j, wgaVar3.m23937h(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar4 = zga.f71556c;
                        wgaVar4.m23941p(obj3, j, wgaVar4.m23937h(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar5 = zga.f71556c;
                        wgaVar5.m23941p(obj3, j, wgaVar5.m23937h(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar6 = zga.f71556c;
                        wgaVar6.mo17986k(obj3, j, wgaVar6.mo17982c(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25615o(obj3, j, zga.f71556c.m23938i(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    m6840k(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25615o(obj3, j, zga.f71556c.m23938i(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        wga wgaVar7 = zga.f71556c;
                        wgaVar7.m23941p(obj3, j, wgaVar7.m23937h(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (m6837g(obj2, i)) {
                        zga.m25614n(obj3, j, zga.f71556c.m23936g(obj2, j));
                        m6842r(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m6837g(obj2, i)) {
                        wga wgaVar8 = zga.f71556c;
                        obj3 = obj;
                        wgaVar8.m23941p(obj3, j, wgaVar8.m23937h(obj2, j));
                        m6842r(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    m6840k(obj, obj2, i);
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
                    this.f13947g.mo23246b(obj, obj2, j);
                    break;
                case 50:
                    Class cls = AbstractC1188i.f13953a;
                    wga wgaVar9 = zga.f71556c;
                    Object objM23938i = wgaVar9.m23938i(obj, j);
                    Object objM23938i2 = wgaVar9.m23938i(obj2, j);
                    this.f13949i.getClass();
                    MapFieldLite mapFieldLiteM6788c = (MapFieldLite) objM23938i;
                    MapFieldLite mapFieldLite = (MapFieldLite) objM23938i2;
                    if (!mapFieldLite.isEmpty()) {
                        if (!mapFieldLiteM6788c.f13928a) {
                            mapFieldLiteM6788c = mapFieldLiteM6788c.m6788c();
                        }
                        mapFieldLiteM6788c.m6787b();
                        if (!mapFieldLite.isEmpty()) {
                            mapFieldLiteM6788c.putAll(mapFieldLite);
                        }
                    }
                    zga.m25615o(obj, j, mapFieldLiteM6788c);
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
                    if (m6839j(obj2, i2, i)) {
                        zga.m25615o(obj, j, zga.f71556c.m23938i(obj2, j));
                        zga.m25614n(obj, iArr[i + 2] & 1048575, i2);
                    }
                    break;
                case 60:
                    m6841l(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m6839j(obj2, i2, i)) {
                        zga.m25615o(obj, j, zga.f71556c.m23938i(obj2, j));
                        zga.m25614n(obj, iArr[i + 2] & 1048575, i2);
                    }
                    break;
                case 68:
                    m6841l(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // p000.xm8
    public final AbstractC1183d newInstance() {
        this.f13946f.getClass();
        AbstractC1183d abstractC1183d = (AbstractC1183d) this.f13943c;
        abstractC1183d.getClass();
        return (AbstractC1183d) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    public final void m6842r(Object obj, int i) {
        int i2 = this.f13941a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        zga.m25614n(obj, j, (1 << (i2 >>> 20)) | zga.f71556c.m23936g(obj, j));
    }

    /* JADX INFO: renamed from: t */
    public final int m6843t(int i) {
        return this.f13941a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m6844u(Object obj, m58 m58Var) throws CodedOutputStream$OutOfSpaceException {
        char c;
        int i;
        C1186g c1186g = this;
        int[] iArr = c1186g.f13941a;
        int length = iArr.length;
        Unsafe unsafe = f13940k;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iM6843t = c1186g.m6843t(i4);
            int i6 = iArr[i4];
            int iM6829s = m6829s(iM6843t);
            if (iM6829s <= 17) {
                int i7 = iArr[i4 + 2];
                c = 1;
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            long j = iM6843t & i2;
            switch (iM6829s) {
                case 0:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        double dMo17984e = zga.f71556c.mo17984e(obj, j);
                        C1181b c1181b = (C1181b) m58Var.f50618b;
                        c1181b.getClass();
                        c1181b.m6802k(i6, Double.doubleToRawLongBits(dMo17984e));
                    }
                    break;
                case 1:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        float fMo17985f = zga.f71556c.mo17985f(obj, j);
                        C1181b c1181b2 = (C1181b) m58Var.f50618b;
                        c1181b2.getClass();
                        c1181b2.m6800i(i6, Float.floatToRawIntBits(fMo17985f));
                    }
                    c1186g = this;
                    break;
                case 2:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6808q(i6, unsafe.getLong(obj, j));
                    }
                    c1186g = this;
                    break;
                case 3:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6808q(i6, unsafe.getLong(obj, j));
                    }
                    c1186g = this;
                    break;
                case 4:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        C1181b c1181b3 = (C1181b) m58Var.f50618b;
                        c1181b3.m6806o(i6, 0);
                        c1181b3.m6804m(i9);
                    }
                    c1186g = this;
                    break;
                case 5:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6802k(i6, unsafe.getLong(obj, j));
                    }
                    c1186g = this;
                    break;
                case 6:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6800i(i6, unsafe.getInt(obj, j));
                    }
                    c1186g = this;
                    break;
                case 7:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        boolean zMo17982c = zga.f71556c.mo17982c(obj, j);
                        C1181b c1181b4 = (C1181b) m58Var.f50618b;
                        c1181b4.m6806o(i6, 0);
                        c1181b4.m6797f(zMo17982c ? (byte) 1 : (byte) 0);
                    }
                    c1186g = this;
                    break;
                case 8:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        m6830w(i6, unsafe.getObject(obj, j), m58Var);
                    }
                    c1186g = this;
                    break;
                case 9:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        m58Var.m16651r(i6, unsafe.getObject(obj, j), c1186g.m6836f(i4));
                    }
                    break;
                case 10:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        m58Var.m16649o(i6, (ByteString) unsafe.getObject(obj, j));
                    }
                    c1186g = this;
                    break;
                case 11:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        C1181b c1181b5 = (C1181b) m58Var.f50618b;
                        c1181b5.m6806o(i6, 0);
                        c1181b5.m6807p(i10);
                    }
                    c1186g = this;
                    break;
                case 12:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        C1181b c1181b6 = (C1181b) m58Var.f50618b;
                        c1181b6.m6806o(i6, 0);
                        c1181b6.m6804m(i11);
                    }
                    c1186g = this;
                    break;
                case 13:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6800i(i6, unsafe.getInt(obj, j));
                    }
                    c1186g = this;
                    break;
                case 14:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        ((C1181b) m58Var.f50618b).m6802k(i6, unsafe.getLong(obj, j));
                    }
                    c1186g = this;
                    break;
                case 15:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        C1181b c1181b7 = (C1181b) m58Var.f50618b;
                        c1181b7.m6806o(i6, 0);
                        c1181b7.m6807p((i12 >> 31) ^ (i12 << 1));
                    }
                    c1186g = this;
                    break;
                case 16:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((C1181b) m58Var.f50618b).m6808q(i6, (j2 >> 63) ^ (j2 << 1));
                    }
                    c1186g = this;
                    break;
                case 17:
                    if (c1186g.m6838h(obj, i4, i3, i5, i)) {
                        m58Var.m16650q(i6, unsafe.getObject(obj, j), c1186g.m6836f(i4));
                    }
                    break;
                case 18:
                    AbstractC1188i.m6863n(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 19:
                    AbstractC1188i.m6867r(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 20:
                    AbstractC1188i.m6870u(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 21:
                    AbstractC1188i.m6849C(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 22:
                    AbstractC1188i.m6869t(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC1188i.m6866q(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 24:
                    AbstractC1188i.m6865p(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 25:
                    AbstractC1188i.m6861l(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 26:
                    AbstractC1188i.m6847A(iArr[i4], (List) unsafe.getObject(obj, j), m58Var);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC1188i.m6871v(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c1186g.m6836f(i4));
                    break;
                case 28:
                    AbstractC1188i.m6862m(iArr[i4], (List) unsafe.getObject(obj, j), m58Var);
                    break;
                case 29:
                    AbstractC1188i.m6848B(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 30:
                    AbstractC1188i.m6864o(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC1188i.m6872w(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 32:
                    AbstractC1188i.m6873x(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 33:
                    AbstractC1188i.m6874y(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case 34:
                    AbstractC1188i.m6875z(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, false);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC1188i.m6863n(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC1188i.m6867r(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC1188i.m6870u(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 38:
                    AbstractC1188i.m6849C(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC1188i.m6869t(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC1188i.m6866q(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC1188i.m6865p(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 42:
                    AbstractC1188i.m6861l(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 43:
                    AbstractC1188i.m6848B(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC1188i.m6864o(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC1188i.m6872w(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 46:
                    AbstractC1188i.m6873x(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 47:
                    AbstractC1188i.m6874y(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC1188i.m6875z(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c);
                    break;
                case 49:
                    AbstractC1188i.m6868s(iArr[i4], (List) unsafe.getObject(obj, j), m58Var, c1186g.m6836f(i4));
                    break;
                case 50:
                    c1186g.m6845v(m58Var, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        double dDoubleValue = ((Double) zga.f71556c.m23938i(obj, j)).doubleValue();
                        C1181b c1181b8 = (C1181b) m58Var.f50618b;
                        c1181b8.getClass();
                        c1181b8.m6802k(i6, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        float fFloatValue = ((Float) zga.f71556c.m23938i(obj, j)).floatValue();
                        C1181b c1181b9 = (C1181b) m58Var.f50618b;
                        c1181b9.getClass();
                        c1181b9.m6800i(i6, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6808q(i6, m6827p(obj, j));
                    }
                    break;
                case 54:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6808q(i6, m6827p(obj, j));
                    }
                    break;
                case 55:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        int iM6826o = m6826o(obj, j);
                        C1181b c1181b10 = (C1181b) m58Var.f50618b;
                        c1181b10.m6806o(i6, 0);
                        c1181b10.m6804m(iM6826o);
                    }
                    break;
                case 56:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6802k(i6, m6827p(obj, j));
                    }
                    break;
                case 57:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6800i(i6, m6826o(obj, j));
                    }
                    break;
                case 58:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        boolean zBooleanValue = ((Boolean) zga.f71556c.m23938i(obj, j)).booleanValue();
                        C1181b c1181b11 = (C1181b) m58Var.f50618b;
                        c1181b11.m6806o(i6, 0);
                        c1181b11.m6797f(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        m6830w(i6, unsafe.getObject(obj, j), m58Var);
                    }
                    break;
                case 60:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        m58Var.m16651r(i6, unsafe.getObject(obj, j), c1186g.m6836f(i4));
                    }
                    break;
                case 61:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        m58Var.m16649o(i6, (ByteString) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        int iM6826o2 = m6826o(obj, j);
                        C1181b c1181b12 = (C1181b) m58Var.f50618b;
                        c1181b12.m6806o(i6, 0);
                        c1181b12.m6807p(iM6826o2);
                    }
                    break;
                case 63:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        int iM6826o3 = m6826o(obj, j);
                        C1181b c1181b13 = (C1181b) m58Var.f50618b;
                        c1181b13.m6806o(i6, 0);
                        c1181b13.m6804m(iM6826o3);
                    }
                    break;
                case 64:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6800i(i6, m6826o(obj, j));
                    }
                    break;
                case 65:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        ((C1181b) m58Var.f50618b).m6802k(i6, m6827p(obj, j));
                    }
                    break;
                case 66:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        int iM6826o4 = m6826o(obj, j);
                        C1181b c1181b14 = (C1181b) m58Var.f50618b;
                        c1181b14.m6806o(i6, 0);
                        c1181b14.m6807p((iM6826o4 >> 31) ^ (iM6826o4 << 1));
                    }
                    break;
                case 67:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        long jM6827p = m6827p(obj, j);
                        ((C1181b) m58Var.f50618b).m6808q(i6, (jM6827p >> 63) ^ (jM6827p << c));
                    }
                    break;
                case 68:
                    if (c1186g.m6839j(obj, i6, i4)) {
                        m58Var.m16650q(i6, unsafe.getObject(obj, j), c1186g.m6836f(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        ((zfa) c1186g.f13948h).getClass();
        ((AbstractC1183d) obj).unknownFields.m6877b(m58Var);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015b  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01af  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01de  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    /* JADX WARN: Code duplicated, block: B:72:0x020a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0229  */
    /* JADX WARN: Code duplicated, block: B:77:0x0234  */
    /* JADX WARN: Code duplicated, block: B:78:0x023f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0246  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166 A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final void m6845v(m58 m58Var, int i, Object obj, int i2) {
        int iM6796e;
        int iMo6790h;
        int iM6795d;
        int i3;
        int iM6794c;
        int iMo6790h2;
        int iM6795d2;
        if (obj != null) {
            Object obj2 = this.f13942b[(i2 / 3) * 2];
            this.f13949i.getClass();
            C3309ls c3309ls = ((tp5) obj2).f62696a;
            WireFormat$FieldType wireFormat$FieldType = (WireFormat$FieldType) c3309ls.f50065c;
            WireFormat$FieldType wireFormat$FieldType2 = (WireFormat$FieldType) c3309ls.f50064b;
            C1181b c1181b = (C1181b) m58Var.f50618b;
            c1181b.getClass();
            for (Map.Entry entry : ((MapFieldLite) obj).entrySet()) {
                c1181b.m6806o(i, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i4 = g33.f40107c;
                int iM6794c2 = C1181b.m6794c(1);
                WireFormat$FieldType wireFormat$FieldType3 = WireFormat$FieldType.GROUP;
                if (wireFormat$FieldType2 == wireFormat$FieldType3) {
                    iM6794c2 *= 2;
                }
                int[] iArr = f33.f38336b;
                int iM6796e2 = 8;
                switch (iArr[wireFormat$FieldType2.ordinal()]) {
                    case 1:
                        ((Double) key).getClass();
                        iM6796e = 8;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key2);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value2);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key3);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value3);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key4);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value4);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key5);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value5);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key6);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value6);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key7);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value7);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key8);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value8);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key9);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value9);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key10);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value10);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key12);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value12);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key13);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value13);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key14);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value14);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key15);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value15);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key16);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value16);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue >> 31) ^ (iIntValue << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key17);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value17);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue >> 63) ^ (jLongValue << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key18);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value18);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key19);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value19);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 2:
                        ((Float) key).getClass();
                        iM6796e = 4;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value112);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value113);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value117);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value118);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value119);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1110);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1114);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1115);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1116);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1117);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 3:
                        iM6796e = C1181b.m6796e(((Long) key).longValue());
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1119);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11110);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11115);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11116);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11117);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11118);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11119);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111112);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111113);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111114);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111115);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 4:
                        iM6796e = C1181b.m6796e(((Long) key).longValue());
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111117);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111118);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111119);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111113);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111114);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111115);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111116);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111117);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111110);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111112);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111113);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 5:
                        iM6796e = C1181b.m6792a(((Integer) key).intValue());
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111115);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111116);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111117);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111112);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111113);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111114);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111115);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111118);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111119);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111110);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 6:
                        ((Long) key).getClass();
                        iM6796e = 8;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111113);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111114);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111115);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111119);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111110);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111112);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111113);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111116);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111117);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111118);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111119);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 7:
                        ((Integer) key).getClass();
                        iM6796e = 4;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111112);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111113);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111117);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111118);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111119);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111110);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111114);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111115);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111116);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111117);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 8:
                        ((Boolean) key).getClass();
                        iM6796e = 1;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111119);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111110);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111115);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111116);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111117);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111118);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111119);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111112);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111113);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111114);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111115);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 9:
                        iM6796e = ((AbstractC1183d) ((AbstractC1180a) key)).mo6790h(null);
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111117);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111118);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111119);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111113);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111114);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111115);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111116);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111117);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111110);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111112);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111113);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 10:
                        iMo6790h = ((AbstractC1183d) ((AbstractC1180a) key)).mo6790h(null);
                        iM6795d = C1181b.m6795d(iMo6790h);
                        iM6796e = iMo6790h + iM6795d;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111115);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111116);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111117);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111112);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111113);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111114);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111115);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111118);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111119);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111110);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 11:
                        if (key instanceof ByteString) {
                            iMo6790h = ((ByteString) key).size();
                            iM6795d = C1181b.m6795d(iMo6790h);
                            iM6796e = iMo6790h + iM6795d;
                        } else {
                            iM6796e = C1181b.m6793b((String) key);
                        }
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111113);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111114);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111115);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111119);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111110);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111112);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111113);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111116);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111117);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111118);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111119);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 12:
                        if (key instanceof ByteString) {
                            iMo6790h = ((ByteString) key).size();
                            iM6795d = C1181b.m6795d(iMo6790h);
                        } else {
                            iMo6790h = ((byte[]) key).length;
                            iM6795d = C1181b.m6795d(iMo6790h);
                        }
                        iM6796e = iMo6790h + iM6795d;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111112);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111113);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111117);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111118);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111114);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111115);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111116);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111117);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 13:
                        iM6796e = C1181b.m6795d(((Integer) key).intValue());
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111119);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111110);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111115);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111116);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111119);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111114);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111115);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iM6796e = 4;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111116);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111117);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111118);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111119);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111110);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111112);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111113);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111114);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111115);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111116);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111117);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111118);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111119);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111110);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111112);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111113);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iM6796e = 8;
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111114);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111115);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111116);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111117);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111118);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111119);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111110);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111112);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111113);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111114);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111115);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111116);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111117);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111118);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111119);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111110);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 16:
                        int iIntValue16 = ((Integer) key).intValue();
                        iM6796e = C1181b.m6795d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111112);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111113);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111114);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111115);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111116);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111117);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111118);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111119);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111110);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111112);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111113);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111114);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111115);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111116);
                                break;
                            case 16:
                                int iIntValue17 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111117);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111118);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111119);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 17:
                        long jLongValue17 = ((Long) key).longValue();
                        iM6796e = C1181b.m6796e((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111110);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111112);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111113);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111114);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111115);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111116);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111117);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111118);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111119);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111110);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111111);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111112);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111113);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111114);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111115);
                                break;
                            case 17:
                                long jLongValue18 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111116);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 18:
                        iM6796e = key instanceof a94 ? C1181b.m6792a(((a94) key).getNumber()) : C1181b.m6792a(((Integer) key).intValue());
                        i3 = iM6796e + iM6794c2;
                        iM6794c = C1181b.m6794c(2);
                        if (wireFormat$FieldType == wireFormat$FieldType3) {
                            iM6794c *= 2;
                        }
                        switch (iArr[wireFormat$FieldType.ordinal()]) {
                            case 1:
                                ((Double) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111118);
                                break;
                            case 2:
                                ((Float) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key1111111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value1111111111111111111111111111119);
                                break;
                            case 3:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111110);
                                break;
                            case 4:
                                iM6796e2 = C1181b.m6796e(((Long) value).longValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111111);
                                break;
                            case 5:
                                iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111112);
                                break;
                            case 6:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111113);
                                break;
                            case 7:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111114);
                                break;
                            case 8:
                                ((Boolean) value).getClass();
                                iM6796e2 = 1;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111115);
                                break;
                            case 9:
                                iM6796e2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111116);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111116);
                                break;
                            case 10:
                                iMo6790h2 = ((AbstractC1183d) ((AbstractC1180a) value)).mo6790h(null);
                                iM6795d2 = C1181b.m6795d(iMo6790h2);
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111117);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111117);
                                break;
                            case 11:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                    iM6796e2 = iM6795d2 + iMo6790h2;
                                } else {
                                    iM6796e2 = C1181b.m6793b((String) value);
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111118);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111118);
                                break;
                            case 12:
                                if (value instanceof ByteString) {
                                    iMo6790h2 = ((ByteString) value).size();
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                } else {
                                    iMo6790h2 = ((byte[]) value).length;
                                    iM6795d2 = C1181b.m6795d(iMo6790h2);
                                }
                                iM6796e2 = iM6795d2 + iMo6790h2;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key11111111111111111111111111111119);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value11111111111111111111111111111119);
                                break;
                            case 13:
                                iM6796e2 = C1181b.m6795d(((Integer) value).intValue());
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111110);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111110);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM6796e2 = 4;
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111111);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111111);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111112);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111112);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iM6796e2 = C1181b.m6795d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111113);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111113);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iM6796e2 = C1181b.m6796e((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111114);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111114);
                                break;
                            case 18:
                                if (value instanceof a94) {
                                    iM6796e2 = C1181b.m6792a(((a94) value).getNumber());
                                } else {
                                    iM6796e2 = C1181b.m6792a(((Integer) value).intValue());
                                }
                                c1181b.m6807p(iM6796e2 + iM6794c + i3);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                g33.m12310b(c1181b, wireFormat$FieldType2, 1, key111111111111111111111111111111115);
                                g33.m12310b(c1181b, wireFormat$FieldType, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    default:
                        ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
                return;
            }
        }
    }
}
