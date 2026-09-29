package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC3356n1;
import p000.AbstractC3393o1;
import p000.C0787av;
import p000.C3386nv;
import p000.aha;
import p000.bf5;
import p000.eda;
import p000.f73;
import p000.fr7;
import p000.g9a;
import p000.h3d;
import p000.h94;
import p000.hk5;
import p000.ho2;
import p000.ho7;
import p000.ij6;
import p000.jf0;
import p000.kw4;
import p000.n41;
import p000.n94;
import p000.q94;
import p000.qx2;
import p000.ux2;
import p000.v74;
import p000.vi2;
import p000.vj6;
import p000.wq1;
import p000.xga;
import p000.ym8;
import p000.yp5;
import p000.zk6;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0677k implements ym8 {

    /* JADX INFO: renamed from: n */
    public static final int[] f6079n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f6080o = aha.m414j();

    /* JADX INFO: renamed from: a */
    public final int[] f6081a;

    /* JADX INFO: renamed from: b */
    public final Object[] f6082b;

    /* JADX INFO: renamed from: c */
    public final int f6083c;

    /* JADX INFO: renamed from: d */
    public final int f6084d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0667a f6085e;

    /* JADX INFO: renamed from: f */
    public final boolean f6086f;

    /* JADX INFO: renamed from: g */
    public final int[] f6087g;

    /* JADX INFO: renamed from: h */
    public final int f6088h;

    /* JADX INFO: renamed from: i */
    public final int f6089i;

    /* JADX INFO: renamed from: j */
    public final zk6 f6090j;

    /* JADX INFO: renamed from: k */
    public final bf5 f6091k;

    /* JADX INFO: renamed from: l */
    public final AbstractC0680n f6092l;

    /* JADX INFO: renamed from: m */
    public final yp5 f6093m;

    public C0677k(int[] iArr, Object[] objArr, int i, int i2, AbstractC0667a abstractC0667a, int[] iArr2, int i3, int i4, zk6 zk6Var, bf5 bf5Var, AbstractC0680n abstractC0680n, ux2 ux2Var, yp5 yp5Var) {
        this.f6081a = iArr;
        this.f6082b = objArr;
        this.f6083c = i;
        this.f6084d = i2;
        this.f6086f = abstractC0667a instanceof AbstractC0675i;
        this.f6087g = iArr2;
        this.f6088h = i3;
        this.f6089i = i4;
        this.f6090j = zk6Var;
        this.f6091k = bf5Var;
        this.f6092l = abstractC0680n;
        this.f6085e = abstractC0667a;
        this.f6093m = yp5Var;
    }

    /* JADX INFO: renamed from: H */
    public static Field m2392H(Class cls, String str) {
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

    /* JADX INFO: renamed from: N */
    public static int m2393N(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: Q */
    public static void m2394Q(int i, Object obj, vj6 vj6Var) {
        if (!(obj instanceof String)) {
            vj6Var.m23340B(i, (ByteString) obj);
        } else {
            ((AbstractC0673g) vj6Var.f65506b).mo2355t(i, (String) obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2395h(Object obj) {
        if (m2396o(obj)) {
            return;
        }
        C3386nv.m17626m(AbstractC3393o1.m17733h(obj, "Mutating immutable message: "));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2396o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0675i) {
            return ((AbstractC0675i) obj).m2384h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0362  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c3  */
    /* JADX INFO: renamed from: v */
    public static C0677k m2397v(fr7 fr7Var, zk6 zk6Var, bf5 bf5Var, AbstractC0680n abstractC0680n, ux2 ux2Var, yp5 yp5Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
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
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldM2392H;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldM2392H2;
        Field fieldM2392H3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str = fr7Var.f39530b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i31 = iCharAt2 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt2 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f6079n;
            i4 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt3 = str.charAt(i30);
            if (iCharAt3 >= 55296) {
                int i34 = iCharAt3 & 8191;
                int i35 = 13;
                while (true) {
                    i15 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i15;
                }
                iCharAt3 = i34 | (cCharAt8 << i35);
                i33 = i15;
            }
            int i36 = i33 + 1;
            int iCharAt4 = str.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt4 = i37 | (cCharAt7 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt5 = str.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt5 = i40 | (cCharAt6 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt6 = i43 | (cCharAt5 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            iCharAt = str.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            int iCharAt7 = str.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt7 = i49 | (cCharAt3 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int iCharAt8 = str.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int iCharAt9 = str.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i57 = (iCharAt3 * 2) + iCharAt4;
            int i58 = iCharAt7;
            i2 = iCharAt5;
            i3 = i58;
            i4 = iCharAt3;
            i30 = i54;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i57;
            i7 = iCharAt9;
        }
        Unsafe unsafe = f6080o;
        Object[] objArr2 = fr7Var.f39531c;
        Class<?> cls = fr7Var.f39529a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i59 = i7 + i3;
        int i60 = i59;
        int i61 = i7;
        int i62 = 0;
        int i63 = 0;
        while (i30 < length) {
            int i64 = i30 + 1;
            int iCharAt10 = str.charAt(i30);
            int i65 = length;
            if (iCharAt10 >= 55296) {
                int i66 = iCharAt10 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    cCharAt12 = str.charAt(i67);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    objArr2 = objArr;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i16 = i27;
            } else {
                objArr = objArr2;
                i16 = i64;
            }
            int i69 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i25 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i26 = i70;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 = i26 | ((cCharAt11 & 8191) << i72);
                    i72 += 13;
                    i71 = i25;
                }
                iCharAt11 = i26 | (cCharAt11 << i72);
                i17 = i25;
            } else {
                i17 = i69;
            }
            int i73 = iCharAt10;
            int i74 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            int i75 = i4;
            if (i74 >= 51) {
                int i76 = i17 + 1;
                int iCharAt12 = str.charAt(i17);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt10 = str.charAt(i76);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i76 = i24;
                        c = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i78);
                    i76 = i24;
                }
                int i79 = i74 - 51;
                int i80 = iCharAt12;
                if (i79 == 9 || i79 == 17) {
                    objArr3[wq1.m24103C(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i79 == 12 && (fr7Var.m12030a().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr3[wq1.m24103C(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i81 = i80 * 2;
                Object obj = objArr[i81];
                if (obj instanceof Field) {
                    fieldM2392H2 = (Field) obj;
                } else {
                    fieldM2392H2 = m2392H(cls, (String) obj);
                    objArr[i81] = fieldM2392H2;
                }
                int i82 = i59;
                i19 = i6;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM2392H2);
                int i83 = i81 + 1;
                Object obj2 = objArr[i83];
                if (obj2 instanceof Field) {
                    fieldM2392H3 = (Field) obj2;
                } else {
                    fieldM2392H3 = m2392H(cls, (String) obj2);
                    objArr[i83] = fieldM2392H3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM2392H3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i62 = i62;
                i20 = i76;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i18 = i82;
                objArr3 = objArr3;
                i21 = 0;
            } else {
                int i84 = i59;
                int i85 = i6 + 1;
                Field fieldM2392H4 = m2392H(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i84;
                    objArr3[wq1.m24103C(i62, 3, 2, 1)] = fieldM2392H4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i84;
                        i23 = i6 + 2;
                        objArr3[wq1.m24103C(i62, 3, 2, 1)] = objArr[i85];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i84;
                        if (fr7Var.m12030a() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i6 + 2;
                            objArr3[wq1.m24103C(i62, 3, 2, 1)] = objArr[i85];
                        }
                    } else {
                        if (i74 == 50) {
                            int i86 = i61 + 1;
                            iArr[i61] = i62;
                            int i87 = (i62 / 3) * 2;
                            int i88 = i6 + 2;
                            objArr3[i87] = objArr[i85];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr3[i87 + 1] = objArr[i88];
                                i18 = i84;
                                i61 = i86;
                            } else {
                                i19 = i88;
                                i61 = i86;
                                i18 = i84;
                            }
                        } else {
                            i18 = i84;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2392H4);
                        if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            i20 = i17 + 1;
                            int iCharAt13 = str.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i89 = iCharAt13 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i22 = i20 + 1;
                                    cCharAt9 = str.charAt(i20);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i89 |= (cCharAt9 & 8191) << i90;
                                    i90 += 13;
                                    i20 = i22;
                                }
                                iCharAt13 = i89 | (cCharAt9 << i90);
                                i20 = i22;
                            }
                            int i91 = (iCharAt13 / 32) + (i75 * 2);
                            Object obj3 = objArr[i91];
                            if (obj3 instanceof Field) {
                                fieldM2392H = (Field) obj3;
                            } else {
                                fieldM2392H = m2392H(cls, (String) obj3);
                                objArr[i91] = fieldM2392H;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM2392H);
                            i21 = iCharAt13 % 32;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i60] = iObjectFieldOffset;
                            i60++;
                        }
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2392H4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    }
                    if (i74 >= 18) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                }
                i19 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2392H4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                }
                if (i74 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
            }
            int i92 = i62 + 1;
            iArr4[i62] = i73;
            int i93 = i62 + 2;
            int i94 = i62;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | iObjectFieldOffset;
            i62 = i94 + 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            objArr3 = objArr3;
            i30 = i20;
            length = i65;
            iArr3 = iArr4;
            objArr2 = objArr;
            i59 = i18;
            i6 = i19;
            i4 = i75;
            str = str;
        }
        AbstractC0667a abstractC0667a = fr7Var.f39529a;
        fr7Var.m12030a();
        return new C0677k(iArr3, objArr3, i2, i5, abstractC0667a, iArr, i7, i59, zk6Var, bf5Var, abstractC0680n, ux2Var, yp5Var);
    }

    /* JADX INFO: renamed from: w */
    public static long m2398w(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: x */
    public static int m2399x(Object obj, long j) {
        return ((Integer) aha.f677c.m24507i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: y */
    public static long m2400y(Object obj, long j) {
        return ((Long) aha.f677c.m24507i(obj, j)).longValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: A */
    public final int m2401A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p000.C0787av r35) throws androidx.glance.appwidget.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.C0677k.m2401A(java.lang.Object, byte[], int, int, int, av):int");
    }

    /* JADX INFO: renamed from: B */
    public final int m2402B(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0787av c0787av) throws InvalidProtocolBufferException {
        Unsafe unsafe = f6080o;
        long j2 = this.f6081a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(h3d.m13029e(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(h3d.m13028d(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM13035k = h3d.m13035k(bArr, i, c0787av);
                unsafe.putObject(obj, j, Long.valueOf(c0787av.f7541b));
                unsafe.putInt(obj, j2, i4);
                return iM13035k;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM13033i = h3d.m13033i(bArr, i, c0787av);
                unsafe.putObject(obj, j, Integer.valueOf(c0787av.f7540a));
                unsafe.putInt(obj, j2, i4);
                return iM13033i;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(h3d.m13029e(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(h3d.m13028d(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM13035k2 = h3d.m13035k(bArr, i, c0787av);
                unsafe.putObject(obj, j, Boolean.valueOf(c0787av.f7541b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM13035k2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM13033i2 = h3d.m13033i(bArr, i, c0787av);
                int i13 = c0787av.f7540a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (AbstractC0684r.f6107a.m2479e(bArr, iM13033i2, iM13033i2 + i13) != 0) {
                            throw InvalidProtocolBufferException.m2268b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM13033i2, i13, q94.f57449a));
                    iM13033i2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iM13033i2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objM2433u = m2433u(obj, i4, i8);
                int iM13037m = h3d.m13037m(objM2433u, m2425l(i8), bArr, i, i2, c0787av);
                m2412M(obj, i4, i8, objM2433u);
                return iM13037m;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM13027c = h3d.m13027c(bArr, i, c0787av);
                unsafe.putObject(obj, j, c0787av.f7542c);
                unsafe.putInt(obj, j2, i4);
                return iM13027c;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM13033i3 = h3d.m13033i(bArr, i, c0787av);
                int i14 = c0787av.f7540a;
                h94 h94VarM2423j = m2423j(i8);
                if (h94VarM2423j == null || h94VarM2423j.isInRange(i14)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return iM13033i3;
                }
                AbstractC0675i abstractC0675i = (AbstractC0675i) obj;
                C0681o c0681oM2468c = abstractC0675i.unknownFields;
                if (c0681oM2468c == C0681o.f6100f) {
                    c0681oM2468c = C0681o.m2468c();
                    abstractC0675i.unknownFields = c0681oM2468c;
                }
                c0681oM2468c.m2471d(i3, Long.valueOf(i14));
                return iM13033i3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM13033i4 = h3d.m13033i(bArr, i, c0787av);
                unsafe.putObject(obj, j, Integer.valueOf(n41.m17206d(c0787av.f7540a)));
                unsafe.putInt(obj, j2, i4);
                return iM13033i4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM13035k3 = h3d.m13035k(bArr, i, c0787av);
                unsafe.putObject(obj, j, Long.valueOf(n41.m17207e(c0787av.f7541b)));
                unsafe.putInt(obj, j2, i4);
                return iM13035k3;
            case 68:
                if (i5 == 3) {
                    Object objM2433u2 = m2433u(obj, i4, i8);
                    int iM13036l = h3d.m13036l(objM2433u2, m2425l(i8), bArr, i, i2, (i3 & (-8)) | 4, c0787av);
                    m2412M(obj, i4, i8, objM2433u2);
                    return iM13036l;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: C */
    public final int m2403C(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C0787av c0787av) throws InvalidProtocolBufferException {
        int iM13034j;
        Unsafe unsafe = f6080o;
        n94 n94VarMutableCopyWithCapacity = (n94) unsafe.getObject(obj, j2);
        if (!((AbstractC3356n1) n94VarMutableCopyWithCapacity).f52152a) {
            int size = n94VarMutableCopyWithCapacity.size();
            n94VarMutableCopyWithCapacity = n94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, n94VarMutableCopyWithCapacity);
        }
        n94 n94Var = n94VarMutableCopyWithCapacity;
        switch (i7) {
            case 18:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i5 == 2) {
                    vi2 vi2Var = (vi2) n94Var;
                    int iM13033i = h3d.m13033i(bArr, i, c0787av);
                    int i8 = c0787av.f7540a + iM13033i;
                    while (iM13033i < i8) {
                        vi2Var.addDouble(Double.longBitsToDouble(h3d.m13029e(bArr, iM13033i)));
                        iM13033i += 8;
                    }
                    if (iM13033i == i8) {
                        return iM13033i;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 1) {
                    vi2 vi2Var2 = (vi2) n94Var;
                    vi2Var2.addDouble(Double.longBitsToDouble(h3d.m13029e(bArr, i)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int iM13033i2 = h3d.m13033i(bArr, i9, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return i9;
                        }
                        vi2Var2.addDouble(Double.longBitsToDouble(h3d.m13029e(bArr, iM13033i2)));
                        i9 = iM13033i2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    f73 f73Var = (f73) n94Var;
                    int iM13033i3 = h3d.m13033i(bArr, i, c0787av);
                    int i10 = c0787av.f7540a + iM13033i3;
                    while (iM13033i3 < i10) {
                        f73Var.addFloat(Float.intBitsToFloat(h3d.m13028d(bArr, iM13033i3)));
                        iM13033i3 += 4;
                    }
                    if (iM13033i3 == i10) {
                        return iM13033i3;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 5) {
                    f73 f73Var2 = (f73) n94Var;
                    f73Var2.addFloat(Float.intBitsToFloat(h3d.m13028d(bArr, i)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int iM13033i4 = h3d.m13033i(bArr, i11, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return i11;
                        }
                        f73Var2.addFloat(Float.intBitsToFloat(h3d.m13028d(bArr, iM13033i4)));
                        i11 = iM13033i4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i5 == 2) {
                    hk5 hk5Var = (hk5) n94Var;
                    int iM13033i5 = h3d.m13033i(bArr, i, c0787av);
                    int i12 = c0787av.f7540a + iM13033i5;
                    while (iM13033i5 < i12) {
                        iM13033i5 = h3d.m13035k(bArr, iM13033i5, c0787av);
                        hk5Var.addLong(c0787av.f7541b);
                    }
                    if (iM13033i5 == i12) {
                        return iM13033i5;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 0) {
                    hk5 hk5Var2 = (hk5) n94Var;
                    int iM13035k = h3d.m13035k(bArr, i, c0787av);
                    hk5Var2.addLong(c0787av.f7541b);
                    while (iM13035k < i2) {
                        int iM13033i6 = h3d.m13033i(bArr, iM13035k, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13035k;
                        }
                        iM13035k = h3d.m13035k(bArr, iM13033i6, c0787av);
                        hk5Var2.addLong(c0787av.f7541b);
                    }
                    return iM13035k;
                }
                return i;
            case 22:
            case 29:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return h3d.m13034j(i3, bArr, i, i2, n94Var, c0787av);
                    }
                    return i;
                }
                v74 v74Var = (v74) n94Var;
                int iM13033i7 = h3d.m13033i(bArr, i, c0787av);
                int i13 = c0787av.f7540a + iM13033i7;
                while (iM13033i7 < i13) {
                    iM13033i7 = h3d.m13033i(bArr, iM13033i7, c0787av);
                    v74Var.addInt(c0787av.f7540a);
                }
                if (iM13033i7 == i13) {
                    return iM13033i7;
                }
                throw InvalidProtocolBufferException.m2273g();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 32:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case 46:
                if (i5 == 2) {
                    hk5 hk5Var3 = (hk5) n94Var;
                    int iM13033i8 = h3d.m13033i(bArr, i, c0787av);
                    int i14 = c0787av.f7540a + iM13033i8;
                    while (iM13033i8 < i14) {
                        hk5Var3.addLong(h3d.m13029e(bArr, iM13033i8));
                        iM13033i8 += 8;
                    }
                    if (iM13033i8 == i14) {
                        return iM13033i8;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 1) {
                    hk5 hk5Var4 = (hk5) n94Var;
                    hk5Var4.addLong(h3d.m13029e(bArr, i));
                    int i15 = i + 8;
                    while (i15 < i2) {
                        int iM13033i9 = h3d.m13033i(bArr, i15, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return i15;
                        }
                        hk5Var4.addLong(h3d.m13029e(bArr, iM13033i9));
                        i15 = iM13033i9 + 8;
                    }
                    return i15;
                }
                return i;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    v74 v74Var2 = (v74) n94Var;
                    int iM13033i10 = h3d.m13033i(bArr, i, c0787av);
                    int i16 = c0787av.f7540a + iM13033i10;
                    while (iM13033i10 < i16) {
                        v74Var2.addInt(h3d.m13028d(bArr, iM13033i10));
                        iM13033i10 += 4;
                    }
                    if (iM13033i10 == i16) {
                        return iM13033i10;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 5) {
                    v74 v74Var3 = (v74) n94Var;
                    v74Var3.addInt(h3d.m13028d(bArr, i));
                    int i17 = i + 4;
                    while (i17 < i2) {
                        int iM13033i11 = h3d.m13033i(bArr, i17, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return i17;
                        }
                        v74Var3.addInt(h3d.m13028d(bArr, iM13033i11));
                        i17 = iM13033i11 + 4;
                    }
                    return i17;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    jf0 jf0Var = (jf0) n94Var;
                    int iM13033i12 = h3d.m13033i(bArr, i, c0787av);
                    int i18 = c0787av.f7540a + iM13033i12;
                    while (iM13033i12 < i18) {
                        iM13033i12 = h3d.m13035k(bArr, iM13033i12, c0787av);
                        jf0Var.addBoolean(c0787av.f7541b != 0);
                    }
                    if (iM13033i12 == i18) {
                        return iM13033i12;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 0) {
                    jf0 jf0Var2 = (jf0) n94Var;
                    int iM13035k2 = h3d.m13035k(bArr, i, c0787av);
                    jf0Var2.addBoolean(c0787av.f7541b != 0);
                    while (iM13035k2 < i2) {
                        int iM13033i13 = h3d.m13033i(bArr, iM13035k2, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13035k2;
                        }
                        iM13035k2 = h3d.m13035k(bArr, iM13033i13, c0787av);
                        jf0Var2.addBoolean(c0787av.f7541b != 0);
                    }
                    return iM13035k2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iM13033i14 = h3d.m13033i(bArr, i, c0787av);
                        int i19 = c0787av.f7540a;
                        if (i19 < 0) {
                            throw InvalidProtocolBufferException.m2271e();
                        }
                        if (i19 == 0) {
                            n94Var.add("");
                        } else {
                            n94Var.add(new String(bArr, iM13033i14, i19, q94.f57449a));
                            iM13033i14 += i19;
                        }
                        while (iM13033i14 < i2) {
                            int iM13033i15 = h3d.m13033i(bArr, iM13033i14, c0787av);
                            if (i3 != c0787av.f7540a) {
                                return iM13033i14;
                            }
                            iM13033i14 = h3d.m13033i(bArr, iM13033i15, c0787av);
                            int i20 = c0787av.f7540a;
                            if (i20 < 0) {
                                throw InvalidProtocolBufferException.m2271e();
                            }
                            if (i20 == 0) {
                                n94Var.add("");
                            } else {
                                n94Var.add(new String(bArr, iM13033i14, i20, q94.f57449a));
                                iM13033i14 += i20;
                            }
                        }
                        return iM13033i14;
                    }
                    int iM13033i16 = h3d.m13033i(bArr, i, c0787av);
                    int i21 = c0787av.f7540a;
                    if (i21 < 0) {
                        throw InvalidProtocolBufferException.m2271e();
                    }
                    if (i21 == 0) {
                        n94Var.add("");
                    } else {
                        int i22 = iM13033i16 + i21;
                        if (AbstractC0684r.f6107a.m2479e(bArr, iM13033i16, i22) != 0) {
                            throw InvalidProtocolBufferException.m2268b();
                        }
                        n94Var.add(new String(bArr, iM13033i16, i21, q94.f57449a));
                        iM13033i16 = i22;
                    }
                    while (iM13033i16 < i2) {
                        int iM13033i17 = h3d.m13033i(bArr, iM13033i16, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13033i16;
                        }
                        iM13033i16 = h3d.m13033i(bArr, iM13033i17, c0787av);
                        int i23 = c0787av.f7540a;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.m2271e();
                        }
                        if (i23 == 0) {
                            n94Var.add("");
                        } else {
                            int i24 = iM13033i16 + i23;
                            if (AbstractC0684r.f6107a.m2479e(bArr, iM13033i16, i24) != 0) {
                                throw InvalidProtocolBufferException.m2268b();
                            }
                            n94Var.add(new String(bArr, iM13033i16, i23, q94.f57449a));
                            iM13033i16 = i24;
                        }
                    }
                    return iM13033i16;
                }
                return i;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i5 == 2) {
                    return h3d.m13030f(m2425l(i6), i3, bArr, i, i2, n94Var, c0787av);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iM13033i18 = h3d.m13033i(bArr, i, c0787av);
                    int i25 = c0787av.f7540a;
                    if (i25 < 0) {
                        throw InvalidProtocolBufferException.m2271e();
                    }
                    if (i25 > bArr.length - iM13033i18) {
                        throw InvalidProtocolBufferException.m2273g();
                    }
                    if (i25 == 0) {
                        n94Var.add(ByteString.f6037b);
                    } else {
                        n94Var.add(ByteString.m2261g(bArr, iM13033i18, i25));
                        iM13033i18 += i25;
                    }
                    while (iM13033i18 < i2) {
                        int iM13033i19 = h3d.m13033i(bArr, iM13033i18, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13033i18;
                        }
                        iM13033i18 = h3d.m13033i(bArr, iM13033i19, c0787av);
                        int i26 = c0787av.f7540a;
                        if (i26 < 0) {
                            throw InvalidProtocolBufferException.m2271e();
                        }
                        if (i26 > bArr.length - iM13033i18) {
                            throw InvalidProtocolBufferException.m2273g();
                        }
                        if (i26 == 0) {
                            n94Var.add(ByteString.f6037b);
                        } else {
                            n94Var.add(ByteString.m2261g(bArr, iM13033i18, i26));
                            iM13033i18 += i26;
                        }
                    }
                    return iM13033i18;
                }
                return i;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM13034j = h3d.m13034j(i3, bArr, i, i2, n94Var, c0787av);
                    }
                    return i;
                }
                v74 v74Var4 = (v74) n94Var;
                iM13034j = h3d.m13033i(bArr, i, c0787av);
                int i27 = c0787av.f7540a + iM13034j;
                while (iM13034j < i27) {
                    iM13034j = h3d.m13033i(bArr, iM13034j, c0787av);
                    v74Var4.addInt(c0787av.f7540a);
                }
                if (iM13034j != i27) {
                    throw InvalidProtocolBufferException.m2273g();
                }
                AbstractC0679m.m2449j(obj, i4, n94Var, m2423j(i6), null, this.f6092l);
                return iM13034j;
            case 33:
            case 47:
                if (i5 == 2) {
                    v74 v74Var5 = (v74) n94Var;
                    int iM13033i20 = h3d.m13033i(bArr, i, c0787av);
                    int i28 = c0787av.f7540a + iM13033i20;
                    while (iM13033i20 < i28) {
                        iM13033i20 = h3d.m13033i(bArr, iM13033i20, c0787av);
                        v74Var5.addInt(n41.m17206d(c0787av.f7540a));
                    }
                    if (iM13033i20 == i28) {
                        return iM13033i20;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 0) {
                    v74 v74Var6 = (v74) n94Var;
                    int iM13033i21 = h3d.m13033i(bArr, i, c0787av);
                    v74Var6.addInt(n41.m17206d(c0787av.f7540a));
                    while (iM13033i21 < i2) {
                        int iM13033i22 = h3d.m13033i(bArr, iM13033i21, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13033i21;
                        }
                        iM13033i21 = h3d.m13033i(bArr, iM13033i22, c0787av);
                        v74Var6.addInt(n41.m17206d(c0787av.f7540a));
                    }
                    return iM13033i21;
                }
                return i;
            case 34:
            case eda.f37086g /* 48 */:
                if (i5 == 2) {
                    hk5 hk5Var5 = (hk5) n94Var;
                    int iM13033i23 = h3d.m13033i(bArr, i, c0787av);
                    int i29 = c0787av.f7540a + iM13033i23;
                    while (iM13033i23 < i29) {
                        iM13033i23 = h3d.m13035k(bArr, iM13033i23, c0787av);
                        hk5Var5.addLong(n41.m17207e(c0787av.f7541b));
                    }
                    if (iM13033i23 == i29) {
                        return iM13033i23;
                    }
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (i5 == 0) {
                    hk5 hk5Var6 = (hk5) n94Var;
                    int iM13035k3 = h3d.m13035k(bArr, i, c0787av);
                    hk5Var6.addLong(n41.m17207e(c0787av.f7541b));
                    while (iM13035k3 < i2) {
                        int iM13033i24 = h3d.m13033i(bArr, iM13035k3, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13035k3;
                        }
                        iM13035k3 = h3d.m13035k(bArr, iM13033i24, c0787av);
                        hk5Var6.addLong(n41.m17207e(c0787av.f7541b));
                    }
                    return iM13035k3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    ym8 ym8VarM2425l = m2425l(i6);
                    int i30 = (i3 & (-8)) | 4;
                    AbstractC0675i abstractC0675iNewInstance = ym8VarM2425l.newInstance();
                    int iM13036l = h3d.m13036l(abstractC0675iNewInstance, ym8VarM2425l, bArr, i, i2, i30, c0787av);
                    int i31 = i30;
                    ym8VarM2425l.makeImmutable(abstractC0675iNewInstance);
                    c0787av.f7542c = abstractC0675iNewInstance;
                    n94Var.add(abstractC0675iNewInstance);
                    while (iM13036l < i2) {
                        int iM13033i25 = h3d.m13033i(bArr, iM13036l, c0787av);
                        if (i3 != c0787av.f7540a) {
                            return iM13036l;
                        }
                        AbstractC0675i abstractC0675iNewInstance2 = ym8VarM2425l.newInstance();
                        int i32 = i31;
                        iM13036l = h3d.m13036l(abstractC0675iNewInstance2, ym8VarM2425l, bArr, iM13033i25, i2, i32, c0787av);
                        ym8VarM2425l.makeImmutable(abstractC0675iNewInstance2);
                        c0787av.f7542c = abstractC0675iNewInstance2;
                        n94Var.add(abstractC0675iNewInstance2);
                        i31 = i32;
                    }
                    return iM13036l;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2404D(Object obj, long j, C0670d c0670d, ym8 ym8Var, qx2 qx2Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo2279A;
        this.f6091k.getClass();
        n94 n94VarM3683a = bf5.m3683a(obj, j);
        n41 n41Var = c0670d.f6062a;
        int i = c0670d.f6063b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            AbstractC0675i abstractC0675iNewInstance = ym8Var.newInstance();
            c0670d.m2323b(abstractC0675iNewInstance, ym8Var, qx2Var);
            ym8Var.makeImmutable(abstractC0675iNewInstance);
            n94VarM3683a.add(abstractC0675iNewInstance);
            if (n41Var.mo2290g() || c0670d.f6065d != 0) {
                return;
            } else {
                iMo2279A = n41Var.mo2279A();
            }
        } while (iMo2279A == i);
        c0670d.f6065d = iMo2279A;
    }

    /* JADX INFO: renamed from: E */
    public final void m2405E(Object obj, int i, C0670d c0670d, ym8 ym8Var, qx2 qx2Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo2279A;
        this.f6091k.getClass();
        n94 n94VarM3683a = bf5.m3683a(obj, i & 1048575);
        n41 n41Var = c0670d.f6062a;
        int i2 = c0670d.f6063b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            AbstractC0675i abstractC0675iNewInstance = ym8Var.newInstance();
            c0670d.m2324c(abstractC0675iNewInstance, ym8Var, qx2Var);
            ym8Var.makeImmutable(abstractC0675iNewInstance);
            n94VarM3683a.add(abstractC0675iNewInstance);
            if (n41Var.mo2290g() || c0670d.f6065d != 0) {
                return;
            } else {
                iMo2279A = n41Var.mo2279A();
            }
        } while (iMo2279A == i2);
        c0670d.f6065d = iMo2279A;
    }

    /* JADX INFO: renamed from: F */
    public final void m2406F(int i, C0670d c0670d, Object obj) {
        if ((536870912 & i) != 0) {
            c0670d.m2343v(2);
            aha.m420p(obj, i & 1048575, c0670d.f6062a.mo2307z());
        } else if (!this.f6086f) {
            aha.m420p(obj, i & 1048575, c0670d.m2326e());
        } else {
            c0670d.m2343v(2);
            aha.m420p(obj, i & 1048575, c0670d.f6062a.mo2306y());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2407G(int i, C0670d c0670d, Object obj) {
        boolean z = (536870912 & i) != 0;
        bf5 bf5Var = this.f6091k;
        if (z) {
            bf5Var.getClass();
            c0670d.m2339r(bf5.m3683a(obj, i & 1048575), true);
        } else {
            bf5Var.getClass();
            c0670d.m2339r(bf5.m3683a(obj, i & 1048575), false);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2408I(Object obj, int i) {
        int i2 = this.f6081a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        aha.m418n(obj, j, (1 << (i2 >>> 20)) | aha.f677c.m24505g(obj, j));
    }

    /* JADX INFO: renamed from: J */
    public final void m2409J(Object obj, int i, int i2) {
        aha.m418n(obj, this.f6081a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: K */
    public final int m2410K(int i, int i2) {
        int[] iArr = this.f6081a;
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

    /* JADX INFO: renamed from: L */
    public final void m2411L(Object obj, int i, Object obj2) {
        f6080o.putObject(obj, m2413O(i) & 1048575, obj2);
        m2408I(obj, i);
    }

    /* JADX INFO: renamed from: M */
    public final void m2412M(Object obj, int i, int i2, Object obj2) {
        f6080o.putObject(obj, m2413O(i2) & 1048575, obj2);
        m2409J(obj, i, i2);
    }

    /* JADX INFO: renamed from: O */
    public final int m2413O(int i) {
        return this.f6081a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: P */
    public final void m2414P(Object obj, vj6 vj6Var) {
        int i;
        boolean z;
        C0677k c0677k = this;
        int[] iArr = c0677k.f6081a;
        int length = iArr.length;
        Unsafe unsafe = f6080o;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iM2413O = c0677k.m2413O(i4);
            int i6 = iArr[i4];
            int iM2393N = m2393N(iM2413O);
            if (iM2393N <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM2413O & i2;
            switch (iM2393N) {
                case 0:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        double dMo19136e = aha.f677c.mo19136e(obj, j);
                        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
                        abstractC0673g.getClass();
                        abstractC0673g.mo2349n(i6, Double.doubleToRawLongBits(dMo19136e));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        float fMo19137f = aha.f677c.mo19137f(obj, j);
                        AbstractC0673g abstractC0673g2 = (AbstractC0673g) vj6Var.f65506b;
                        abstractC0673g2.getClass();
                        abstractC0673g2.mo2347l(i6, Float.floatToRawIntBits(fMo19137f));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, unsafe.getLong(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, unsafe.getLong(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2351p(i6, unsafe.getInt(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2349n(i6, unsafe.getLong(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2347l(i6, unsafe.getInt(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2345j(i6, aha.f677c.mo19134c(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        m2394Q(i6, unsafe.getObject(obj, j), vj6Var);
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2354s(i6, (AbstractC0667a) unsafe.getObject(obj, j), c0677k.m2425l(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        vj6Var.m23340B(i6, (ByteString) unsafe.getObject(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2357v(i6, unsafe.getInt(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2351p(i6, unsafe.getInt(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2347l(i6, unsafe.getInt(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2349n(i6, unsafe.getLong(obj, j));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ((AbstractC0673g) vj6Var.f65506b).mo2357v(i6, (i9 >> 31) ^ (i9 << 1));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, (j2 >> 63) ^ (j2 << 1));
                    }
                    c0677k = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (c0677k.m2427n(obj, i4, i3, i5, i)) {
                        vj6Var.m23341C(i6, unsafe.getObject(obj, j), c0677k.m2425l(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    AbstractC0679m.m2455p(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    AbstractC0679m.m2459t(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC0679m.m2462w(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC0679m.m2439E(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC0679m.m2461v(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC0679m.m2458s(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    AbstractC0679m.m2457r(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    AbstractC0679m.m2453n(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    AbstractC0679m.m2437C(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC0679m.m2463x(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, c0677k.m2425l(i4));
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    AbstractC0679m.m2454o(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    z = false;
                    AbstractC0679m.m2438D(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    z = false;
                    AbstractC0679m.m2456q(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    AbstractC0679m.m2464y(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    z = false;
                    AbstractC0679m.m2465z(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    z = false;
                    AbstractC0679m.m2435A(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    z = false;
                    AbstractC0679m.m2436B(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC0679m.m2455p(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC0679m.m2459t(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC0679m.m2462w(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    AbstractC0679m.m2439E(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC0679m.m2461v(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC0679m.m2458s(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC0679m.m2457r(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 42:
                    AbstractC0679m.m2453n(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    AbstractC0679m.m2438D(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC0679m.m2456q(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC0679m.m2464y(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    AbstractC0679m.m2465z(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    AbstractC0679m.m2435A(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC0679m.m2436B(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    AbstractC0679m.m2460u(iArr[i4], (List) unsafe.getObject(obj, j), vj6Var, c0677k.m2425l(i4));
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objM2424k = c0677k.m2424k(i4);
                        c0677k.f6093m.getClass();
                        g9a.m12435l(objM2424k);
                        throw null;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        double dDoubleValue = ((Double) aha.f677c.m24507i(obj, j)).doubleValue();
                        AbstractC0673g abstractC0673g3 = (AbstractC0673g) vj6Var.f65506b;
                        abstractC0673g3.getClass();
                        abstractC0673g3.mo2349n(i6, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        float fFloatValue = ((Float) aha.f677c.m24507i(obj, j)).floatValue();
                        AbstractC0673g abstractC0673g4 = (AbstractC0673g) vj6Var.f65506b;
                        abstractC0673g4.getClass();
                        abstractC0673g4.mo2347l(i6, Float.floatToRawIntBits(fFloatValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, m2400y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, m2400y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2351p(i6, m2399x(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2349n(i6, m2400y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2347l(i6, m2399x(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2345j(i6, ((Boolean) aha.f677c.m24507i(obj, j)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        m2394Q(i6, unsafe.getObject(obj, j), vj6Var);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2354s(i6, (AbstractC0667a) unsafe.getObject(obj, j), c0677k.m2425l(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        vj6Var.m23340B(i6, (ByteString) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2357v(i6, m2399x(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2351p(i6, m2399x(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2347l(i6, m2399x(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        ((AbstractC0673g) vj6Var.f65506b).mo2349n(i6, m2400y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        int iM2399x = m2399x(obj, j);
                        ((AbstractC0673g) vj6Var.f65506b).mo2357v(i6, (iM2399x >> 31) ^ (iM2399x << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        long jM2400y = m2400y(obj, j);
                        ((AbstractC0673g) vj6Var.f65506b).mo2359x(i6, (jM2400y << 1) ^ (jM2400y >> 63));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (c0677k.m2428p(obj, i6, i4)) {
                        vj6Var.m23341C(i6, unsafe.getObject(obj, j), c0677k.m2425l(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        ((C0682p) c0677k.f6092l).getClass();
        ((AbstractC0675i) obj).unknownFields.m2472e(vj6Var);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0370  */
    @Override // p000.ym8
    /* JADX INFO: renamed from: a */
    public final int mo2415a(AbstractC0675i abstractC0675i) {
        int i;
        int iM2374e;
        int iM2374e2;
        int iM2374e3;
        int iM2376g;
        int iM2374e4;
        int iM2376g2;
        int iM2374e5;
        int iM2374e6;
        int iM2374e7;
        int iMo2278b;
        int iM2375f;
        int iM2370a;
        int iM2374e8;
        int iMo2278b2;
        int iM2442c;
        int iM2374e9;
        int size;
        int iM2448i;
        int iM2374e10;
        int iM2374e11;
        int size2;
        int iM2374e12;
        int iM2375f2;
        int iMo2278b3;
        int iM2374e13;
        int iM2374e14;
        int iM2376g3;
        int iM2374e15;
        int iM2376g4;
        int i2;
        C0677k c0677k = this;
        AbstractC0675i abstractC0675i2 = abstractC0675i;
        Unsafe unsafe = f6080o;
        int i3 = 0;
        int i4 = 0;
        int iM2370a2 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = c0677k.f6081a;
            if (i3 >= iArr.length) {
                ((C0682p) c0677k.f6092l).getClass();
                return abstractC0675i2.unknownFields.m2470b() + iM2370a2;
            }
            int iM2413O = c0677k.m2413O(i3);
            int iM2393N = m2393N(iM2413O);
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & 1048575;
            if (iM2393N <= 17) {
                if (i8 != i5) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(abstractC0675i2, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM2413O & 1048575;
            if (iM2393N >= FieldType.DOUBLE_LIST_PACKED.m2266id()) {
                FieldType.SINT64_LIST_PACKED.m2266id();
            }
            switch (iM2393N) {
                case 0:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e + 8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 1:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e2 = AbstractC0673g.m2374e(i6);
                        iM2374e6 = iM2374e2 + 4;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 2:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(abstractC0675i2, j);
                        iM2374e3 = AbstractC0673g.m2374e(i6);
                        iM2376g = AbstractC0673g.m2376g(j2);
                        iM2370a2 += iM2376g + iM2374e3;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 3:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(abstractC0675i2, j);
                        iM2374e3 = AbstractC0673g.m2374e(i6);
                        iM2376g = AbstractC0673g.m2376g(j3);
                        iM2370a2 += iM2376g + iM2374e3;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 4:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(abstractC0675i2, j);
                        iM2374e4 = AbstractC0673g.m2374e(i6);
                        iM2376g2 = AbstractC0673g.m2376g(i9);
                        iM2370a = iM2376g2 + iM2374e4;
                        iM2370a2 += iM2370a;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 5:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e5 = AbstractC0673g.m2374e(i6);
                        iM2374e6 = iM2374e5 + 8;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 6:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e2 = AbstractC0673g.m2374e(i6);
                        iM2374e6 = iM2374e2 + 4;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 7:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e6 = AbstractC0673g.m2374e(i6) + 1;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 8:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(abstractC0675i2, j);
                        iM2370a2 = (object instanceof ByteString ? AbstractC0673g.m2370a(i6, (ByteString) object) : AbstractC0673g.m2373d((String) object) + AbstractC0673g.m2374e(i6)) + iM2370a2;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 9:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(abstractC0675i2, j);
                        ym8 ym8VarM2425l = c0677k.m2425l(i3);
                        Class cls = AbstractC0679m.f6097a;
                        iM2374e7 = AbstractC0673g.m2374e(i6);
                        iMo2278b = ((AbstractC0667a) object2).mo2278b(ym8VarM2425l);
                        iM2375f = AbstractC0673g.m2375f(iMo2278b);
                        i2 = iM2375f + iMo2278b + iM2374e7;
                        iM2370a2 += i2;
                    }
                    i3 += 3;
                    break;
                case 10:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2370a = AbstractC0673g.m2370a(i6, (ByteString) unsafe.getObject(abstractC0675i2, j));
                        iM2370a2 += iM2370a;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 11:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        int i10 = unsafe.getInt(abstractC0675i2, j);
                        iM2374e4 = AbstractC0673g.m2374e(i6);
                        iM2376g2 = AbstractC0673g.m2375f(i10);
                        iM2370a = iM2376g2 + iM2374e4;
                        iM2370a2 += iM2370a;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 12:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        int i11 = unsafe.getInt(abstractC0675i2, j);
                        iM2374e4 = AbstractC0673g.m2374e(i6);
                        iM2376g2 = AbstractC0673g.m2376g(i11);
                        iM2370a = iM2376g2 + iM2374e4;
                        iM2370a2 += iM2370a;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 13:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e2 = AbstractC0673g.m2374e(i6);
                        iM2374e6 = iM2374e2 + 4;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 14:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        iM2374e5 = AbstractC0673g.m2374e(i6);
                        iM2374e6 = iM2374e5 + 8;
                        iM2370a2 += iM2374e6;
                    }
                    c0677k = this;
                    abstractC0675i2 = abstractC0675i;
                    i3 += 3;
                    break;
                case 15:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(abstractC0675i2, j);
                        iM2374e4 = AbstractC0673g.m2374e(i6);
                        iM2376g2 = AbstractC0673g.m2371b(i12);
                        iM2370a = iM2376g2 + iM2374e4;
                        iM2370a2 += iM2370a;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 16:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        long j4 = unsafe.getLong(abstractC0675i2, j);
                        iM2374e3 = AbstractC0673g.m2374e(i6);
                        iM2376g = AbstractC0673g.m2372c(j4);
                        iM2370a2 += iM2376g + iM2374e3;
                    }
                    c0677k = this;
                    i3 += 3;
                    break;
                case 17:
                    if (c0677k.m2427n(abstractC0675i2, i3, i5, i4, i)) {
                        AbstractC0667a abstractC0667a = (AbstractC0667a) unsafe.getObject(abstractC0675i2, j);
                        ym8 ym8VarM2425l2 = c0677k.m2425l(i3);
                        iM2374e8 = AbstractC0673g.m2374e(i6) * 2;
                        iMo2278b2 = abstractC0667a.mo2278b(ym8VarM2425l2);
                        iM2442c = iMo2278b2 + iM2374e8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 18:
                    iM2442c = AbstractC0679m.m2442c(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 19:
                    iM2442c = AbstractC0679m.m2441b(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls2 = AbstractC0679m.f6097a;
                    if (list.size() == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2374e9 = (AbstractC0673g.m2374e(i6) * list.size()) + AbstractC0679m.m2444e(list);
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls3 = AbstractC0679m.f6097a;
                    size = list2.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2448i(list2);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls4 = AbstractC0679m.f6097a;
                    size = list3.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2443d(list3);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM2442c = AbstractC0679m.m2442c(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 24:
                    iM2442c = AbstractC0679m.m2441b(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls5 = AbstractC0679m.f6097a;
                    int size3 = list4.size();
                    iM2370a2 += size3 == 0 ? 0 : (AbstractC0673g.m2374e(i6) + 1) * size3;
                    i3 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls6 = AbstractC0679m.f6097a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2374e9 = AbstractC0673g.m2374e(i6) * size4;
                        if (list5 instanceof kw4) {
                            kw4 kw4Var = (kw4) list5;
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object objM15709q = kw4Var.m15709q();
                                if (objM15709q instanceof ByteString) {
                                    int size5 = ((ByteString) objM15709q).size();
                                    iM2374e9 = AbstractC0673g.m2375f(size5) + size5 + iM2374e9;
                                } else {
                                    iM2374e9 = AbstractC0673g.m2373d((String) objM15709q) + iM2374e9;
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof ByteString) {
                                    int size6 = ((ByteString) obj).size();
                                    iM2374e9 = AbstractC0673g.m2375f(size6) + size6 + iM2374e9;
                                } else {
                                    iM2374e9 = AbstractC0673g.m2373d((String) obj) + iM2374e9;
                                }
                            }
                        }
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC0675i2, j);
                    ym8 ym8VarM2425l3 = c0677k.m2425l(i3);
                    Class cls7 = AbstractC0679m.f6097a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iM2374e11 = 0;
                    } else {
                        iM2374e11 = AbstractC0673g.m2374e(i6) * size7;
                        for (int i15 = 0; i15 < size7; i15++) {
                            int iMo2278b4 = ((AbstractC0667a) list6.get(i15)).mo2278b(ym8VarM2425l3);
                            iM2374e11 += AbstractC0673g.m2375f(iMo2278b4) + iMo2278b4;
                        }
                    }
                    iM2370a2 += iM2374e11;
                    i3 += 3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls8 = AbstractC0679m.f6097a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2374e9 = AbstractC0673g.m2374e(i6) * size8;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size9 = ((ByteString) list7.get(i16)).size();
                            iM2374e9 += AbstractC0673g.m2375f(size9) + size9;
                        }
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls9 = AbstractC0679m.f6097a;
                    size = list8.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2447h(list8);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls10 = AbstractC0679m.f6097a;
                    size = list9.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2440a(list9);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM2442c = AbstractC0679m.m2441b(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 32:
                    iM2442c = AbstractC0679m.m2442c(i6, (List) unsafe.getObject(abstractC0675i2, j));
                    iM2370a2 += iM2442c;
                    i3 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls11 = AbstractC0679m.f6097a;
                    size = list10.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2445f(list10);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls12 = AbstractC0679m.f6097a;
                    size = list11.size();
                    if (size == 0) {
                        iM2374e9 = 0;
                    } else {
                        iM2448i = AbstractC0679m.m2446g(list11);
                        iM2374e10 = AbstractC0673g.m2374e(i6);
                        iM2374e9 = (iM2374e10 * size) + iM2448i;
                    }
                    iM2370a2 += iM2374e9;
                    i3 += 3;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls13 = AbstractC0679m.f6097a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls14 = AbstractC0679m.f6097a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    size2 = AbstractC0679m.m2444e((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 38:
                    size2 = AbstractC0679m.m2448i((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size2 = AbstractC0679m.m2443d((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls15 = AbstractC0679m.f6097a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls16 = AbstractC0679m.f6097a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls17 = AbstractC0679m.f6097a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 43:
                    size2 = AbstractC0679m.m2447h((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size2 = AbstractC0679m.m2440a((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls18 = AbstractC0679m.f6097a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0675i2, j);
                    Class cls19 = AbstractC0679m.f6097a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 47:
                    size2 = AbstractC0679m.m2445f((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case eda.f37086g /* 48 */:
                    size2 = AbstractC0679m.m2446g((List) unsafe.getObject(abstractC0675i2, j));
                    if (size2 > 0) {
                        iM2374e12 = AbstractC0673g.m2374e(i6);
                        iM2375f2 = AbstractC0673g.m2375f(size2);
                        iM2370a2 += iM2375f2 + iM2374e12 + size2;
                    }
                    i3 += 3;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0675i2, j);
                    ym8 ym8VarM2425l4 = c0677k.m2425l(i3);
                    Class cls20 = AbstractC0679m.f6097a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iMo2278b3 = 0;
                    } else {
                        iMo2278b3 = 0;
                        for (int i17 = 0; i17 < size10; i17++) {
                            iMo2278b3 += ((AbstractC0667a) list19.get(i17)).mo2278b(ym8VarM2425l4) + (AbstractC0673g.m2374e(i6) * 2);
                        }
                    }
                    iM2370a2 += iMo2278b3;
                    i3 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0675i2, j);
                    Object objM2424k = c0677k.m2424k(i3);
                    c0677k.f6093m.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    if (objM2424k != null) {
                        ho2.m13383c();
                        return 0;
                    }
                    if (mapFieldLite.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = mapFieldLite.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    break;
                case 51:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e + 8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 52:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e13 = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e13 + 4;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 53:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        long jM2400y = m2400y(abstractC0675i2, j);
                        iM2374e14 = AbstractC0673g.m2374e(i6);
                        iM2376g3 = AbstractC0673g.m2376g(jM2400y);
                        i2 = iM2376g3 + iM2374e14;
                        iM2370a2 += i2;
                    }
                    i3 += 3;
                    break;
                case 54:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        long jM2400y2 = m2400y(abstractC0675i2, j);
                        iM2374e14 = AbstractC0673g.m2374e(i6);
                        iM2376g3 = AbstractC0673g.m2376g(jM2400y2);
                        i2 = iM2376g3 + iM2374e14;
                        iM2370a2 += i2;
                    }
                    i3 += 3;
                    break;
                case 55:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        int iM2399x = m2399x(abstractC0675i2, j);
                        iM2374e15 = AbstractC0673g.m2374e(i6);
                        iM2376g4 = AbstractC0673g.m2376g(iM2399x);
                        iM2442c = iM2376g4 + iM2374e15;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 56:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e + 8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 57:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e13 = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e13 + 4;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 58:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2442c = AbstractC0673g.m2374e(i6) + 1;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 59:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        Object object4 = unsafe.getObject(abstractC0675i2, j);
                        iM2370a2 = (object4 instanceof ByteString ? AbstractC0673g.m2370a(i6, (ByteString) object4) : AbstractC0673g.m2373d((String) object4) + AbstractC0673g.m2374e(i6)) + iM2370a2;
                    }
                    i3 += 3;
                    break;
                case 60:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        Object object5 = unsafe.getObject(abstractC0675i2, j);
                        ym8 ym8VarM2425l5 = c0677k.m2425l(i3);
                        Class cls21 = AbstractC0679m.f6097a;
                        iM2374e7 = AbstractC0673g.m2374e(i6);
                        iMo2278b = ((AbstractC0667a) object5).mo2278b(ym8VarM2425l5);
                        iM2375f = AbstractC0673g.m2375f(iMo2278b);
                        i2 = iM2375f + iMo2278b + iM2374e7;
                        iM2370a2 += i2;
                    }
                    i3 += 3;
                    break;
                case 61:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2442c = AbstractC0673g.m2370a(i6, (ByteString) unsafe.getObject(abstractC0675i2, j));
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 62:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        int iM2399x2 = m2399x(abstractC0675i2, j);
                        iM2374e15 = AbstractC0673g.m2374e(i6);
                        iM2376g4 = AbstractC0673g.m2375f(iM2399x2);
                        iM2442c = iM2376g4 + iM2374e15;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 63:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        int iM2399x3 = m2399x(abstractC0675i2, j);
                        iM2374e15 = AbstractC0673g.m2374e(i6);
                        iM2376g4 = AbstractC0673g.m2376g(iM2399x3);
                        iM2442c = iM2376g4 + iM2374e15;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 64:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e13 = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e13 + 4;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 65:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        iM2374e = AbstractC0673g.m2374e(i6);
                        iM2442c = iM2374e + 8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 66:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        int iM2399x4 = m2399x(abstractC0675i2, j);
                        iM2374e15 = AbstractC0673g.m2374e(i6);
                        iM2376g4 = AbstractC0673g.m2371b(iM2399x4);
                        iM2442c = iM2376g4 + iM2374e15;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                case 67:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        long jM2400y3 = m2400y(abstractC0675i2, j);
                        iM2374e14 = AbstractC0673g.m2374e(i6);
                        iM2376g3 = AbstractC0673g.m2372c(jM2400y3);
                        i2 = iM2376g3 + iM2374e14;
                        iM2370a2 += i2;
                    }
                    i3 += 3;
                    break;
                case 68:
                    if (c0677k.m2428p(abstractC0675i2, i6, i3)) {
                        AbstractC0667a abstractC0667a2 = (AbstractC0667a) unsafe.getObject(abstractC0675i2, j);
                        ym8 ym8VarM2425l6 = c0677k.m2425l(i3);
                        iM2374e8 = AbstractC0673g.m2374e(i6) * 2;
                        iMo2278b2 = abstractC0667a2.mo2278b(ym8VarM2425l6);
                        iM2442c = iMo2278b2 + iM2374e8;
                        iM2370a2 += iM2442c;
                    }
                    i3 += 3;
                    break;
                default:
                    i3 += 3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.ym8
    /* JADX INFO: renamed from: b */
    public final int mo2416b(AbstractC0675i abstractC0675i) {
        int i;
        int iM19808b;
        int i2;
        int[] iArr = this.f6081a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM2413O = m2413O(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM2413O;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m2393N(iM2413O)) {
                case 0:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(Double.doubleToLongBits(aha.f677c.mo19136e(abstractC0675i, j)));
                    i3 = iM19808b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM19808b = Float.floatToIntBits(aha.f677c.mo19137f(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(aha.f677c.m24506h(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(aha.f677c.m24506h(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(aha.f677c.m24506h(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo19134c = aha.f677c.mo19134c(abstractC0675i, j);
                    Charset charset = q94.f57449a;
                    if (zMo19134c) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM19808b = ((String) aha.f677c.m24507i(abstractC0675i, j)).hashCode();
                    i3 = iM19808b + i;
                    break;
                case 9:
                    Object objM24507i = aha.f677c.m24507i(abstractC0675i, j);
                    if (objM24507i != null) {
                        iHashCode = objM24507i.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                    i3 = iM19808b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(aha.f677c.m24506h(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24505g(abstractC0675i, j);
                    i3 = iM19808b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM19808b = q94.m19808b(aha.f677c.m24506h(abstractC0675i, j));
                    i3 = iM19808b + i;
                    break;
                case 17:
                    Object objM24507i2 = aha.f677c.m24507i(abstractC0675i, j);
                    if (objM24507i2 != null) {
                        iHashCode = objM24507i2.hashCode();
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
                    iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                    i3 = iM19808b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                    i3 = iM19808b + i;
                    break;
                case 51:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(Double.doubleToLongBits(((Double) aha.f677c.m24507i(abstractC0675i, j)).doubleValue()));
                        i3 = iM19808b + i;
                    }
                    break;
                case 52:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = Float.floatToIntBits(((Float) aha.f677c.m24507i(abstractC0675i, j)).floatValue());
                        i3 = iM19808b + i;
                    }
                    break;
                case 53:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(m2400y(abstractC0675i, j));
                        i3 = iM19808b + i;
                    }
                    break;
                case 54:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(m2400y(abstractC0675i, j));
                        i3 = iM19808b + i;
                    }
                    break;
                case 55:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 56:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(m2400y(abstractC0675i, j));
                        i3 = iM19808b + i;
                    }
                    break;
                case 57:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 58:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) aha.f677c.m24507i(abstractC0675i, j)).booleanValue();
                        Charset charset2 = q94.f57449a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = ((String) aha.f677c.m24507i(abstractC0675i, j)).hashCode();
                        i3 = iM19808b + i;
                    }
                    break;
                case 60:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                        i3 = iM19808b + i;
                    }
                    break;
                case 61:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                        i3 = iM19808b + i;
                    }
                    break;
                case 62:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 63:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 64:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 65:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(m2400y(abstractC0675i, j));
                        i3 = iM19808b + i;
                    }
                    break;
                case 66:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = m2399x(abstractC0675i, j);
                        i3 = iM19808b + i;
                    }
                    break;
                case 67:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = q94.m19808b(m2400y(abstractC0675i, j));
                        i3 = iM19808b + i;
                    }
                    break;
                case 68:
                    if (m2428p(abstractC0675i, i5, i4)) {
                        i = i3 * 53;
                        iM19808b = aha.f677c.m24507i(abstractC0675i, j).hashCode();
                        i3 = iM19808b + i;
                    }
                    break;
            }
        }
        ((C0682p) this.f6092l).getClass();
        return abstractC0675i.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x078d A[Catch: all -> 0x02cb, TryCatch #7 {all -> 0x02cb, blocks: (B:175:0x0788, B:177:0x078d, B:178:0x0792, B:88:0x02bc, B:92:0x02d1, B:93:0x02e5, B:94:0x02f9, B:129:0x0490, B:130:0x04a0, B:133:0x04ba, B:140:0x04d9, B:141:0x04de, B:142:0x04f4, B:143:0x050a, B:144:0x0520, B:145:0x0536, B:146:0x054c, B:147:0x0562, B:148:0x0578, B:149:0x058e, B:150:0x05a9, B:151:0x05c4, B:152:0x05df, B:153:0x05fb, B:154:0x0617, B:156:0x062d, B:159:0x0634, B:160:0x063a, B:161:0x0646, B:162:0x0661, B:163:0x0677, B:164:0x0693, B:165:0x06a1, B:166:0x06be, B:167:0x06da, B:168:0x06f6, B:169:0x0711, B:170:0x072c, B:171:0x0747, B:172:0x0764), top: B:208:0x0788 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x079c A[LOOP:2: B:181:0x079a->B:182:0x079c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:189:0x07bb A[LOOP:3: B:188:0x07b9->B:189:0x07bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:231:0x0798 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    @Override // p000.ym8
    /* JADX INFO: renamed from: c */
    public final void mo2417c(Object obj, C0670d c0670d, qx2 qx2Var) throws Throwable {
        Object obj2;
        int i;
        C0681o c0681o;
        AbstractC0675i abstractC0675i;
        C0670d c0670d2;
        int i2;
        C0670d c0670d3;
        Object obj3;
        C0677k c0677k = this;
        Object obj4 = obj;
        C0670d c0670d4 = c0670d;
        qx2 qx2Var2 = qx2Var;
        qx2Var2.getClass();
        m2395h(obj4);
        AbstractC0680n abstractC0680n = c0677k.f6092l;
        int[] iArr = c0677k.f6087g;
        int i3 = c0677k.f6089i;
        int i4 = c0677k.f6088h;
        Object objMo2466a = null;
        while (true) {
            try {
                int iM2322a = c0670d4.m2322a();
                int iM2410K = (iM2322a < c0677k.f6083c || iM2322a > c0677k.f6084d) ? -1 : c0677k.m2410K(iM2322a, 0);
                if (iM2410K >= 0) {
                    int iM2413O = c0677k.m2413O(iM2410K);
                    try {
                        int iM2393N = m2393N(iM2413O);
                        bf5 bf5Var = c0677k.f6091k;
                        switch (iM2393N) {
                            case 0:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w = m2398w(iM2413O);
                                c0670d2.m2343v(1);
                                aha.f677c.mo19140m(obj2, jM2398w, c0670d2.f6062a.mo2295n());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 1:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w2 = m2398w(iM2413O);
                                c0670d2.m2343v(5);
                                aha.f677c.mo19141n(obj2, jM2398w2, c0670d2.f6062a.mo2299r());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 2:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w3 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m419o(obj2, jM2398w3, c0670d2.f6062a.mo2301t());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 3:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w4 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m419o(obj2, jM2398w4, c0670d2.f6062a.mo2281C());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 4:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w5 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m418n(obj2, jM2398w5, c0670d2.f6062a.mo2300s());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 5:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w6 = m2398w(iM2413O);
                                c0670d2.m2343v(1);
                                aha.m419o(obj2, jM2398w6, c0670d2.f6062a.mo2298q());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 6:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w7 = m2398w(iM2413O);
                                c0670d2.m2343v(5);
                                aha.m418n(obj2, jM2398w7, c0670d2.f6062a.mo2297p());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 7:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w8 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.f677c.mo19138k(obj2, jM2398w8, c0670d2.f6062a.mo2293l());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 8:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                c0677k.m2406F(iM2413O, c0670d2, obj2);
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 9:
                                qx2 qx2Var3 = qx2Var2;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                AbstractC0667a abstractC0667a = (AbstractC0667a) c0677k.m2432t(obj2, iM2410K);
                                ym8 ym8VarM2425l = c0677k.m2425l(iM2410K);
                                c0670d2.m2343v(2);
                                c0670d2.m2324c(abstractC0667a, ym8VarM2425l, qx2Var3);
                                c0677k.m2411L(obj2, iM2410K, abstractC0667a);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 10:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                aha.m420p(obj2, m2398w(iM2413O), c0670d2.m2326e());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 11:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w9 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m418n(obj2, jM2398w9, c0670d2.f6062a.mo2280B());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 12:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                c0670d2.m2343v(0);
                                int iMo2296o = c0670d2.f6062a.mo2296o();
                                h94 h94VarM2423j = c0677k.m2423j(iM2410K);
                                if (h94VarM2423j == null || h94VarM2423j.isInRange(iMo2296o)) {
                                    aha.m418n(obj2, m2398w(iM2413O), iMo2296o);
                                    c0677k.m2408I(obj2, iM2410K);
                                } else {
                                    objMo2466a = AbstractC0679m.m2452m(obj2, iM2322a, iMo2296o, objMo2466a, abstractC0680n);
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 13:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w10 = m2398w(iM2413O);
                                c0670d2.m2343v(5);
                                aha.m418n(obj2, jM2398w10, c0670d2.f6062a.mo2302u());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 14:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w11 = m2398w(iM2413O);
                                c0670d2.m2343v(1);
                                aha.m419o(obj2, jM2398w11, c0670d2.f6062a.mo2303v());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 15:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w12 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m418n(obj2, jM2398w12, c0670d2.f6062a.mo2304w());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 16:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w13 = m2398w(iM2413O);
                                c0670d2.m2343v(0);
                                aha.m419o(obj2, jM2398w13, c0670d2.f6062a.mo2305x());
                                c0677k.m2408I(obj2, iM2410K);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 17:
                                qx2 qx2Var4 = qx2Var2;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                AbstractC0667a abstractC0667a2 = (AbstractC0667a) c0677k.m2432t(obj2, iM2410K);
                                ym8 ym8VarM2425l2 = c0677k.m2425l(iM2410K);
                                c0670d2.m2343v(3);
                                c0670d2.m2323b(abstractC0667a2, ym8VarM2425l2, qx2Var4);
                                c0677k.m2411L(obj2, iM2410K, abstractC0667a2);
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 18:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w14 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2328g(bf5.m3683a(obj2, jM2398w14));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 19:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w15 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2332k(bf5.m3683a(obj2, jM2398w15));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 20:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w16 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2334m(bf5.m3683a(obj2, jM2398w16));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 21:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w17 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2341t(bf5.m3683a(obj2, jM2398w17));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 22:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w18 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2333l(bf5.m3683a(obj2, jM2398w18));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w19 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2331j(bf5.m3683a(obj2, jM2398w19));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 24:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w20 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2330i(bf5.m3683a(obj2, jM2398w20));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 25:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                long jM2398w21 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d2.m2325d(bf5.m3683a(obj2, jM2398w21));
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 26:
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                try {
                                    c0677k.m2407G(iM2413O, c0670d2, obj2);
                                    break;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    try {
                                        abstractC0680n.getClass();
                                        if (objMo2466a == null) {
                                            objMo2466a = abstractC0680n.mo2466a(obj2);
                                        }
                                        if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                            for (i2 = i4; i2 < i3; i2++) {
                                                c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                c0681o = (C0681o) objMo2466a;
                                                abstractC0675i = (AbstractC0675i) obj2;
                                                abstractC0675i.unknownFields = c0681o;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        for (i = i4; i < i3; i++) {
                                            c0677k.m2422i(iArr[i], obj2, objMo2466a);
                                        }
                                        if (objMo2466a != null) {
                                            ((C0682p) abstractC0680n).getClass();
                                            ((AbstractC0675i) obj2).unknownFields = (C0681o) objMo2466a;
                                        }
                                        throw th;
                                    }
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                try {
                                    try {
                                        c0677k.m2405E(obj4, iM2413O, c0670d4, c0677k.m2425l(iM2410K), qx2Var);
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        c0670d2 = c0670d4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        c0677k = c0677k;
                                        c0670d2 = c0670d4;
                                        obj2 = obj4;
                                        abstractC0680n.getClass();
                                        if (objMo2466a == null) {
                                            objMo2466a = abstractC0680n.mo2466a(obj2);
                                        }
                                        if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                            while (i2 < i3) {
                                                c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                c0681o = (C0681o) objMo2466a;
                                                abstractC0675i = (AbstractC0675i) obj2;
                                                abstractC0675i.unknownFields = c0681o;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    c0670d2 = c0670d3;
                                    abstractC0680n.getClass();
                                    if (objMo2466a == null) {
                                        objMo2466a = abstractC0680n.mo2466a(obj2);
                                    }
                                    if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                        while (i2 < i3) {
                                            c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                        }
                                        if (objMo2466a != null) {
                                            c0681o = (C0681o) objMo2466a;
                                            abstractC0675i = (AbstractC0675i) obj2;
                                            abstractC0675i.unknownFields = c0681o;
                                        }
                                        return;
                                    }
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 28:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w22 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2327f(bf5.m3683a(obj2, jM2398w22));
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 29:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w23 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2340s(bf5.m3683a(obj2, jM2398w23));
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 30:
                                c0670d3 = c0670d4;
                                AbstractC0680n abstractC0680n2 = abstractC0680n;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w24 = m2398w(iM2413O);
                                bf5Var.getClass();
                                n94 n94VarM3683a = bf5.m3683a(obj2, jM2398w24);
                                c0670d3.m2329h(n94VarM3683a);
                                objMo2466a = AbstractC0679m.m2449j(obj2, iM2322a, n94VarM3683a, c0677k.m2423j(iM2410K), objMo2466a, abstractC0680n2);
                                abstractC0680n = abstractC0680n2;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w25 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2335n(bf5.m3683a(obj2, jM2398w25));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 32:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w26 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2336o(bf5.m3683a(obj2, jM2398w26));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 33:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w27 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2337p(bf5.m3683a(obj2, jM2398w27));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 34:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w28 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2338q(bf5.m3683a(obj2, jM2398w28));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w29 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2328g(bf5.m3683a(obj2, jM2398w29));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w30 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2332k(bf5.m3683a(obj2, jM2398w30));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w31 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2334m(bf5.m3683a(obj2, jM2398w31));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 38:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w32 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2341t(bf5.m3683a(obj2, jM2398w32));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w33 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2333l(bf5.m3683a(obj2, jM2398w33));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w34 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2331j(bf5.m3683a(obj2, jM2398w34));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w35 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2330i(bf5.m3683a(obj2, jM2398w35));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 42:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w36 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2325d(bf5.m3683a(obj2, jM2398w36));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 43:
                                c0670d3 = c0670d4;
                                obj2 = obj4;
                                long jM2398w37 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2340s(bf5.m3683a(obj2, jM2398w37));
                                objMo2466a = objMo2466a;
                                abstractC0680n = abstractC0680n;
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                try {
                                    long jM2398w38 = m2398w(iM2413O);
                                    try {
                                        bf5Var.getClass();
                                        n94 n94VarM3683a2 = bf5.m3683a(obj2, jM2398w38);
                                        c0670d3.m2329h(n94VarM3683a2);
                                        abstractC0680n = abstractC0680n;
                                        obj3 = objMo2466a;
                                        try {
                                            objMo2466a = AbstractC0679m.m2449j(obj2, iM2322a, n94VarM3683a2, c0677k.m2423j(iM2410K), obj3, abstractC0680n);
                                            abstractC0680n = abstractC0680n;
                                            c0670d2 = c0670d3;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            objMo2466a = obj3;
                                            abstractC0680n = abstractC0680n;
                                            c0670d2 = c0670d3;
                                            abstractC0680n.getClass();
                                            if (objMo2466a == null) {
                                                objMo2466a = abstractC0680n.mo2466a(obj2);
                                            }
                                            if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                                while (i2 < i3) {
                                                    c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                                }
                                                if (objMo2466a != null) {
                                                    c0681o = (C0681o) objMo2466a;
                                                    abstractC0675i = (AbstractC0675i) obj2;
                                                    abstractC0675i.unknownFields = c0681o;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            objMo2466a = obj3;
                                            abstractC0680n = abstractC0680n;
                                            while (i < i3) {
                                                c0677k.m2422i(iArr[i], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                ((C0682p) abstractC0680n).getClass();
                                                ((AbstractC0675i) obj2).unknownFields = (C0681o) objMo2466a;
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        abstractC0680n = abstractC0680n;
                                        obj3 = objMo2466a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        abstractC0680n = abstractC0680n;
                                        obj3 = objMo2466a;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w39 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2335n(bf5.m3683a(obj2, jM2398w39));
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 46:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w40 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2336o(bf5.m3683a(obj2, jM2398w40));
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 47:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                long jM2398w41 = m2398w(iM2413O);
                                bf5Var.getClass();
                                c0670d3.m2337p(bf5.m3683a(obj2, jM2398w41));
                                c0670d2 = c0670d3;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case eda.f37086g /* 48 */:
                                c0670d3 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                try {
                                    long jM2398w42 = m2398w(iM2413O);
                                    bf5Var.getClass();
                                    c0670d3.m2338q(bf5.m3683a(obj2, jM2398w42));
                                    c0670d2 = c0670d3;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    c0670d2 = c0670d3;
                                    abstractC0680n.getClass();
                                    if (objMo2466a == null) {
                                        objMo2466a = abstractC0680n.mo2466a(obj2);
                                    }
                                    if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                        while (i2 < i3) {
                                            c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                        }
                                        if (objMo2466a != null) {
                                            c0681o = (C0681o) objMo2466a;
                                            abstractC0675i = (AbstractC0675i) obj2;
                                            abstractC0675i.unknownFields = c0681o;
                                        }
                                        return;
                                    }
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 49:
                                i4 = i4;
                                try {
                                    try {
                                        c0677k.m2404D(obj4, m2398w(iM2413O), c0670d, c0677k.m2425l(iM2410K), qx2Var);
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        c0670d3 = c0670d;
                                        c0670d2 = c0670d3;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        c0670d2 = c0670d;
                                        abstractC0680n.getClass();
                                        if (objMo2466a == null) {
                                            objMo2466a = abstractC0680n.mo2466a(obj2);
                                        }
                                        if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                            while (i2 < i3) {
                                                c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                c0681o = (C0681o) objMo2466a;
                                                abstractC0675i = (AbstractC0675i) obj2;
                                                abstractC0675i.unknownFields = c0681o;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                    c0670d2 = c0670d;
                                    c0677k = c0677k;
                                    obj2 = obj4;
                                    abstractC0680n.getClass();
                                    if (objMo2466a == null) {
                                        objMo2466a = abstractC0680n.mo2466a(obj2);
                                    }
                                    if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                        while (i2 < i3) {
                                            c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                        }
                                        if (objMo2466a != null) {
                                            c0681o = (C0681o) objMo2466a;
                                            abstractC0675i = (AbstractC0675i) obj2;
                                            abstractC0675i.unknownFields = c0681o;
                                        }
                                        return;
                                    }
                                    obj4 = obj2;
                                    c0670d4 = c0670d2;
                                    c0677k = c0677k;
                                    i4 = i4;
                                    qx2Var2 = qx2Var;
                                    break;
                                }
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 50:
                                i4 = i4;
                                c0677k.m2429q(iM2410K, obj4, c0677k.m2424k(iM2410K));
                                throw null;
                            case 51:
                                i4 = i4;
                                long jM2398w43 = m2398w(iM2413O);
                                c0670d4.m2343v(1);
                                aha.m420p(obj4, jM2398w43, Double.valueOf(c0670d4.f6062a.mo2295n()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 52:
                                i4 = i4;
                                long jM2398w44 = m2398w(iM2413O);
                                c0670d4.m2343v(5);
                                aha.m420p(obj4, jM2398w44, Float.valueOf(c0670d4.f6062a.mo2299r()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 53:
                                i4 = i4;
                                long jM2398w45 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w45, Long.valueOf(c0670d4.f6062a.mo2301t()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 54:
                                i4 = i4;
                                long jM2398w46 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w46, Long.valueOf(c0670d4.f6062a.mo2281C()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 55:
                                i4 = i4;
                                long jM2398w47 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w47, Integer.valueOf(c0670d4.f6062a.mo2300s()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 56:
                                i4 = i4;
                                long jM2398w48 = m2398w(iM2413O);
                                c0670d4.m2343v(1);
                                aha.m420p(obj4, jM2398w48, Long.valueOf(c0670d4.f6062a.mo2298q()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 57:
                                i4 = i4;
                                long jM2398w49 = m2398w(iM2413O);
                                c0670d4.m2343v(5);
                                aha.m420p(obj4, jM2398w49, Integer.valueOf(c0670d4.f6062a.mo2297p()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 58:
                                i4 = i4;
                                long jM2398w50 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w50, Boolean.valueOf(c0670d4.f6062a.mo2293l()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 59:
                                i4 = i4;
                                c0677k.m2406F(iM2413O, c0670d4, obj4);
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 60:
                                i4 = i4;
                                AbstractC0667a abstractC0667a3 = (AbstractC0667a) c0677k.m2433u(obj4, iM2322a, iM2410K);
                                ym8 ym8VarM2425l3 = c0677k.m2425l(iM2410K);
                                c0670d4.m2343v(2);
                                c0670d4.m2324c(abstractC0667a3, ym8VarM2425l3, qx2Var2);
                                c0677k.m2412M(obj4, iM2322a, iM2410K, abstractC0667a3);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 61:
                                i4 = i4;
                                aha.m420p(obj4, m2398w(iM2413O), c0670d4.m2326e());
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 62:
                                i4 = i4;
                                long jM2398w51 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w51, Integer.valueOf(c0670d4.f6062a.mo2280B()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 63:
                                i4 = i4;
                                c0670d4.m2343v(0);
                                int iMo2296o2 = c0670d4.f6062a.mo2296o();
                                h94 h94VarM2423j2 = c0677k.m2423j(iM2410K);
                                if (h94VarM2423j2 == null || h94VarM2423j2.isInRange(iMo2296o2)) {
                                    aha.m420p(obj4, m2398w(iM2413O), Integer.valueOf(iMo2296o2));
                                    c0677k.m2409J(obj4, iM2322a, iM2410K);
                                } else {
                                    objMo2466a = AbstractC0679m.m2452m(obj4, iM2322a, iMo2296o2, objMo2466a, abstractC0680n);
                                }
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 64:
                                i4 = i4;
                                long jM2398w52 = m2398w(iM2413O);
                                c0670d4.m2343v(5);
                                aha.m420p(obj4, jM2398w52, Integer.valueOf(c0670d4.f6062a.mo2302u()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 65:
                                i4 = i4;
                                long jM2398w53 = m2398w(iM2413O);
                                c0670d4.m2343v(1);
                                aha.m420p(obj4, jM2398w53, Long.valueOf(c0670d4.f6062a.mo2303v()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 66:
                                i4 = i4;
                                long jM2398w54 = m2398w(iM2413O);
                                c0670d4.m2343v(0);
                                aha.m420p(obj4, jM2398w54, Integer.valueOf(c0670d4.f6062a.mo2304w()));
                                c0677k.m2409J(obj4, iM2322a, iM2410K);
                                c0677k = c0677k;
                                obj2 = obj4;
                                c0670d2 = c0670d4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            case 67:
                                i4 = i4;
                                try {
                                    try {
                                        long jM2398w55 = m2398w(iM2413O);
                                        c0670d4.m2343v(0);
                                        aha.m420p(obj4, jM2398w55, Long.valueOf(c0670d4.f6062a.mo2305x()));
                                        c0677k.m2409J(obj4, iM2322a, iM2410K);
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        c0670d2 = c0670d4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        c0670d2 = c0670d4;
                                        abstractC0680n.getClass();
                                        if (objMo2466a == null) {
                                            objMo2466a = abstractC0680n.mo2466a(obj2);
                                        }
                                        if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                            while (i2 < i3) {
                                                c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                c0681o = (C0681o) objMo2466a;
                                                abstractC0675i = (AbstractC0675i) obj2;
                                                abstractC0675i.unknownFields = c0681o;
                                            }
                                            return;
                                        }
                                    }
                                    obj4 = obj2;
                                    c0670d4 = c0670d2;
                                    c0677k = c0677k;
                                    i4 = i4;
                                    qx2Var2 = qx2Var;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c0677k = c0677k;
                                    obj2 = obj4;
                                    while (i < i3) {
                                        c0677k.m2422i(iArr[i], obj2, objMo2466a);
                                    }
                                    if (objMo2466a != null) {
                                        ((C0682p) abstractC0680n).getClass();
                                        ((AbstractC0675i) obj2).unknownFields = (C0681o) objMo2466a;
                                    }
                                    throw th;
                                }
                                break;
                            case 68:
                                AbstractC0667a abstractC0667a4 = (AbstractC0667a) c0677k.m2433u(obj4, iM2322a, iM2410K);
                                ym8 ym8VarM2425l4 = c0677k.m2425l(iM2410K);
                                c0670d4.m2343v(3);
                                c0670d4.m2323b(abstractC0667a4, ym8VarM2425l4, qx2Var2);
                                c0677k.m2412M(obj4, iM2322a, iM2410K, abstractC0667a4);
                                c0670d2 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                            default:
                                if (objMo2466a == null) {
                                    try {
                                        objMo2466a = abstractC0680n.mo2466a(obj4);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                        c0670d2 = c0670d4;
                                        i4 = i4;
                                        c0677k = c0677k;
                                        obj2 = obj4;
                                        abstractC0680n.getClass();
                                        if (objMo2466a == null) {
                                            objMo2466a = abstractC0680n.mo2466a(obj2);
                                        }
                                        if (!abstractC0680n.m2467b(0, c0670d2, objMo2466a)) {
                                            while (i2 < i3) {
                                                c0677k.m2422i(iArr[i2], obj2, objMo2466a);
                                            }
                                            if (objMo2466a != null) {
                                                c0681o = (C0681o) objMo2466a;
                                                abstractC0675i = (AbstractC0675i) obj2;
                                                abstractC0675i.unknownFields = c0681o;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (!abstractC0680n.m2467b(0, c0670d4, objMo2466a)) {
                                    while (i4 < i3) {
                                        c0677k.m2422i(iArr[i4], obj4, objMo2466a);
                                        i4++;
                                    }
                                    if (objMo2466a == null) {
                                        return;
                                    }
                                }
                                c0670d2 = c0670d4;
                                i4 = i4;
                                c0677k = c0677k;
                                obj2 = obj4;
                                obj4 = obj2;
                                c0670d4 = c0670d2;
                                c0677k = c0677k;
                                i4 = i4;
                                qx2Var2 = qx2Var;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                        c0670d2 = c0670d4;
                        i4 = i4;
                    }
                } else if (iM2322a == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        c0677k.m2422i(iArr[i4], obj4, objMo2466a);
                        i4++;
                    }
                    if (objMo2466a == null) {
                        return;
                    } else {
                        ((C0682p) abstractC0680n).getClass();
                    }
                } else {
                    abstractC0680n.getClass();
                    if (objMo2466a == null) {
                        objMo2466a = abstractC0680n.mo2466a(obj4);
                    }
                    if (!abstractC0680n.m2467b(0, c0670d4, objMo2466a)) {
                        while (i4 < i3) {
                            c0677k.m2422i(iArr[i4], obj4, objMo2466a);
                            i4++;
                        }
                        if (objMo2466a == null) {
                            return;
                        }
                    }
                }
                abstractC0675i.unknownFields = c0681o;
            } catch (Throwable th6) {
                th = th6;
                i4 = i4;
            }
        }
        c0681o = (C0681o) objMo2466a;
        abstractC0675i = (AbstractC0675i) obj4;
        abstractC0675i.unknownFields = c0681o;
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: d */
    public final void mo2418d(Object obj, vj6 vj6Var) {
        vj6Var.getClass();
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            m2414P(obj, vj6Var);
            return;
        }
        ((C0682p) this.f6092l).getClass();
        ((AbstractC0675i) obj).unknownFields.m2472e(vj6Var);
        int[] iArr = this.f6081a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iM2413O = m2413O(length);
            int i = iArr[length];
            switch (m2393N(iM2413O)) {
                case 0:
                    if (m2426m(obj, length)) {
                        double dMo19136e = aha.f677c.mo19136e(obj, iM2413O & 1048575);
                        abstractC0673g.getClass();
                        abstractC0673g.mo2349n(i, Double.doubleToRawLongBits(dMo19136e));
                    }
                    break;
                case 1:
                    if (m2426m(obj, length)) {
                        float fMo19137f = aha.f677c.mo19137f(obj, iM2413O & 1048575);
                        abstractC0673g.getClass();
                        abstractC0673g.mo2347l(i, Float.floatToRawIntBits(fMo19137f));
                    }
                    break;
                case 2:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2359x(i, aha.f677c.m24506h(obj, iM2413O & 1048575));
                    }
                    break;
                case 3:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2359x(i, aha.f677c.m24506h(obj, iM2413O & 1048575));
                    }
                    break;
                case 4:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2351p(i, aha.f677c.m24505g(obj, iM2413O & 1048575));
                    }
                    break;
                case 5:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2349n(i, aha.f677c.m24506h(obj, iM2413O & 1048575));
                    }
                    break;
                case 6:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2347l(i, aha.f677c.m24505g(obj, iM2413O & 1048575));
                    }
                    break;
                case 7:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2345j(i, aha.f677c.mo19134c(obj, iM2413O & 1048575));
                    }
                    break;
                case 8:
                    if (m2426m(obj, length)) {
                        m2394Q(i, aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var);
                    }
                    break;
                case 9:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2354s(i, (AbstractC0667a) aha.f677c.m24507i(obj, iM2413O & 1048575), m2425l(length));
                    }
                    break;
                case 10:
                    if (m2426m(obj, length)) {
                        vj6Var.m23340B(i, (ByteString) aha.f677c.m24507i(obj, iM2413O & 1048575));
                    }
                    break;
                case 11:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2357v(i, aha.f677c.m24505g(obj, iM2413O & 1048575));
                    }
                    break;
                case 12:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2351p(i, aha.f677c.m24505g(obj, iM2413O & 1048575));
                    }
                    break;
                case 13:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2347l(i, aha.f677c.m24505g(obj, iM2413O & 1048575));
                    }
                    break;
                case 14:
                    if (m2426m(obj, length)) {
                        abstractC0673g.mo2349n(i, aha.f677c.m24506h(obj, iM2413O & 1048575));
                    }
                    break;
                case 15:
                    if (m2426m(obj, length)) {
                        int iM24505g = aha.f677c.m24505g(obj, iM2413O & 1048575);
                        abstractC0673g.mo2357v(i, (iM24505g >> 31) ^ (iM24505g << 1));
                    }
                    break;
                case 16:
                    if (m2426m(obj, length)) {
                        long jM24506h = aha.f677c.m24506h(obj, iM2413O & 1048575);
                        abstractC0673g.mo2359x(i, (jM24506h >> 63) ^ (jM24506h << 1));
                    }
                    break;
                case 17:
                    if (m2426m(obj, length)) {
                        vj6Var.m23341C(i, aha.f677c.m24507i(obj, iM2413O & 1048575), m2425l(length));
                    }
                    break;
                case 18:
                    AbstractC0679m.m2455p(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 19:
                    AbstractC0679m.m2459t(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 20:
                    AbstractC0679m.m2462w(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 21:
                    AbstractC0679m.m2439E(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 22:
                    AbstractC0679m.m2461v(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC0679m.m2458s(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 24:
                    AbstractC0679m.m2457r(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 25:
                    AbstractC0679m.m2453n(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 26:
                    AbstractC0679m.m2437C(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC0679m.m2463x(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, m2425l(length));
                    break;
                case 28:
                    AbstractC0679m.m2454o(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var);
                    break;
                case 29:
                    AbstractC0679m.m2438D(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 30:
                    AbstractC0679m.m2456q(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC0679m.m2464y(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 32:
                    AbstractC0679m.m2465z(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 33:
                    AbstractC0679m.m2435A(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case 34:
                    AbstractC0679m.m2436B(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, false);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC0679m.m2455p(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC0679m.m2459t(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC0679m.m2462w(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 38:
                    AbstractC0679m.m2439E(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC0679m.m2461v(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC0679m.m2458s(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC0679m.m2457r(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 42:
                    AbstractC0679m.m2453n(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 43:
                    AbstractC0679m.m2438D(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC0679m.m2456q(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC0679m.m2464y(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 46:
                    AbstractC0679m.m2465z(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 47:
                    AbstractC0679m.m2435A(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC0679m.m2436B(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, true);
                    break;
                case 49:
                    AbstractC0679m.m2460u(iArr[length], (List) aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var, m2425l(length));
                    break;
                case 50:
                    if (aha.f677c.m24507i(obj, iM2413O & 1048575) != null) {
                        Object objM2424k = m2424k(length);
                        this.f6093m.getClass();
                        g9a.m12435l(objM2424k);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (m2428p(obj, i, length)) {
                        double dDoubleValue = ((Double) aha.f677c.m24507i(obj, iM2413O & 1048575)).doubleValue();
                        abstractC0673g.getClass();
                        abstractC0673g.mo2349n(i, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (m2428p(obj, i, length)) {
                        float fFloatValue = ((Float) aha.f677c.m24507i(obj, iM2413O & 1048575)).floatValue();
                        abstractC0673g.getClass();
                        abstractC0673g.mo2347l(i, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2359x(i, m2400y(obj, iM2413O & 1048575));
                    }
                    break;
                case 54:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2359x(i, m2400y(obj, iM2413O & 1048575));
                    }
                    break;
                case 55:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2351p(i, m2399x(obj, iM2413O & 1048575));
                    }
                    break;
                case 56:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2349n(i, m2400y(obj, iM2413O & 1048575));
                    }
                    break;
                case 57:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2347l(i, m2399x(obj, iM2413O & 1048575));
                    }
                    break;
                case 58:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2345j(i, ((Boolean) aha.f677c.m24507i(obj, iM2413O & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (m2428p(obj, i, length)) {
                        m2394Q(i, aha.f677c.m24507i(obj, iM2413O & 1048575), vj6Var);
                    }
                    break;
                case 60:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2354s(i, (AbstractC0667a) aha.f677c.m24507i(obj, iM2413O & 1048575), m2425l(length));
                    }
                    break;
                case 61:
                    if (m2428p(obj, i, length)) {
                        vj6Var.m23340B(i, (ByteString) aha.f677c.m24507i(obj, iM2413O & 1048575));
                    }
                    break;
                case 62:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2357v(i, m2399x(obj, iM2413O & 1048575));
                    }
                    break;
                case 63:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2351p(i, m2399x(obj, iM2413O & 1048575));
                    }
                    break;
                case 64:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2347l(i, m2399x(obj, iM2413O & 1048575));
                    }
                    break;
                case 65:
                    if (m2428p(obj, i, length)) {
                        abstractC0673g.mo2349n(i, m2400y(obj, iM2413O & 1048575));
                    }
                    break;
                case 66:
                    if (m2428p(obj, i, length)) {
                        int iM2399x = m2399x(obj, iM2413O & 1048575);
                        abstractC0673g.mo2357v(i, (iM2399x >> 31) ^ (iM2399x << 1));
                    }
                    break;
                case 67:
                    if (m2428p(obj, i, length)) {
                        long jM2400y = m2400y(obj, iM2413O & 1048575);
                        abstractC0673g.mo2359x(i, (jM2400y >> 63) ^ (jM2400y << 1));
                    }
                    break;
                case 68:
                    if (m2428p(obj, i, length)) {
                        vj6Var.m23341C(i, aha.f677c.m24507i(obj, iM2413O & 1048575), m2425l(length));
                    }
                    break;
            }
        }
    }

    @Override // p000.ym8
    /* JADX INFO: renamed from: e */
    public final void mo2419e(Object obj, byte[] bArr, int i, int i2, C0787av c0787av) throws InvalidProtocolBufferException {
        m2401A(obj, bArr, i, i2, 0, c0787av);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.ym8
    /* JADX INFO: renamed from: f */
    public final boolean mo2420f(AbstractC0675i abstractC0675i, AbstractC0675i abstractC0675i2) {
        int[] iArr = this.f6081a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM2451l = true;
            if (i < length) {
                int iM2413O = m2413O(i);
                long j = iM2413O & 1048575;
                switch (m2393N(iM2413O)) {
                    case 0:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar = aha.f677c;
                            if (Double.doubleToLongBits(xgaVar.mo19136e(abstractC0675i, j)) != Double.doubleToLongBits(xgaVar.mo19136e(abstractC0675i2, j))) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar2 = aha.f677c;
                            if (Float.floatToIntBits(xgaVar2.mo19137f(abstractC0675i, j)) != Float.floatToIntBits(xgaVar2.mo19137f(abstractC0675i2, j))) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar3 = aha.f677c;
                            if (xgaVar3.m24506h(abstractC0675i, j) != xgaVar3.m24506h(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar4 = aha.f677c;
                            if (xgaVar4.m24506h(abstractC0675i, j) != xgaVar4.m24506h(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar5 = aha.f677c;
                            if (xgaVar5.m24505g(abstractC0675i, j) != xgaVar5.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar6 = aha.f677c;
                            if (xgaVar6.m24506h(abstractC0675i, j) != xgaVar6.m24506h(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar7 = aha.f677c;
                            if (xgaVar7.m24505g(abstractC0675i, j) != xgaVar7.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar8 = aha.f677c;
                            if (xgaVar8.mo19134c(abstractC0675i, j) != xgaVar8.mo19134c(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar9 = aha.f677c;
                            if (!AbstractC0679m.m2451l(xgaVar9.m24507i(abstractC0675i, j), xgaVar9.m24507i(abstractC0675i2, j))) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar10 = aha.f677c;
                            if (!AbstractC0679m.m2451l(xgaVar10.m24507i(abstractC0675i, j), xgaVar10.m24507i(abstractC0675i2, j))) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar11 = aha.f677c;
                            if (!AbstractC0679m.m2451l(xgaVar11.m24507i(abstractC0675i, j), xgaVar11.m24507i(abstractC0675i2, j))) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar12 = aha.f677c;
                            if (xgaVar12.m24505g(abstractC0675i, j) != xgaVar12.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar13 = aha.f677c;
                            if (xgaVar13.m24505g(abstractC0675i, j) != xgaVar13.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar14 = aha.f677c;
                            if (xgaVar14.m24505g(abstractC0675i, j) != xgaVar14.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar15 = aha.f677c;
                            if (xgaVar15.m24506h(abstractC0675i, j) != xgaVar15.m24506h(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar16 = aha.f677c;
                            if (xgaVar16.m24505g(abstractC0675i, j) != xgaVar16.m24505g(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar17 = aha.f677c;
                            if (xgaVar17.m24506h(abstractC0675i, j) != xgaVar17.m24506h(abstractC0675i2, j)) {
                                zM2451l = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m2421g(abstractC0675i, abstractC0675i2, i)) {
                            zM2451l = false;
                        } else {
                            xga xgaVar18 = aha.f677c;
                            if (!AbstractC0679m.m2451l(xgaVar18.m24507i(abstractC0675i, j), xgaVar18.m24507i(abstractC0675i2, j))) {
                                zM2451l = false;
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
                        xga xgaVar19 = aha.f677c;
                        zM2451l = AbstractC0679m.m2451l(xgaVar19.m24507i(abstractC0675i, j), xgaVar19.m24507i(abstractC0675i2, j));
                        break;
                    case 50:
                        xga xgaVar20 = aha.f677c;
                        zM2451l = AbstractC0679m.m2451l(xgaVar20.m24507i(abstractC0675i, j), xgaVar20.m24507i(abstractC0675i2, j));
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
                        xga xgaVar21 = aha.f677c;
                        if (xgaVar21.m24505g(abstractC0675i, j2) != xgaVar21.m24505g(abstractC0675i2, j2) || !AbstractC0679m.m2451l(xgaVar21.m24507i(abstractC0675i, j), xgaVar21.m24507i(abstractC0675i2, j))) {
                            zM2451l = false;
                        }
                        break;
                }
                if (zM2451l) {
                    i += 3;
                }
            } else {
                C0682p c0682p = (C0682p) this.f6092l;
                c0682p.getClass();
                C0681o c0681o = abstractC0675i.unknownFields;
                c0682p.getClass();
                if (c0681o.equals(abstractC0675i2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2421g(AbstractC0675i abstractC0675i, AbstractC0675i abstractC0675i2, int i) {
        return m2426m(abstractC0675i, i) == m2426m(abstractC0675i2, i);
    }

    /* JADX INFO: renamed from: i */
    public final void m2422i(int i, Object obj, Object obj2) {
        int i2 = this.f6081a[i];
        Object objM24507i = aha.f677c.m24507i(obj, m2413O(i) & 1048575);
        if (objM24507i == null || m2423j(i) == null) {
            return;
        }
        this.f6093m.getClass();
        g9a.m12435l(m2424k(i));
        throw null;
    }

    @Override // p000.ym8
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f6088h) {
            int i6 = this.f6087g[i5];
            int[] iArr = this.f6081a;
            int i7 = iArr[i6];
            int iM2413O = m2413O(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f6080o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM2413O) == 0 || m2427n(obj, i6, i, i2, i10)) {
                int iM2393N = m2393N(iM2413O);
                if (iM2393N == 9 || iM2393N == 17) {
                    if (m2427n(obj, i6, i, i2, i10)) {
                        if (!m2425l(i6).isInitialized(aha.f677c.m24507i(obj, iM2413O & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM2393N != 27) {
                        if (iM2393N == 60 || iM2393N == 68) {
                            if (m2428p(obj, i7, i6)) {
                                if (!m2425l(i6).isInitialized(aha.f677c.m24507i(obj, iM2413O & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iM2393N != 49) {
                            if (iM2393N != 50) {
                                continue;
                            } else {
                                Object objM24507i = aha.f677c.m24507i(obj, iM2413O & 1048575);
                                this.f6093m.getClass();
                                if (!((MapFieldLite) objM24507i).isEmpty()) {
                                    g9a.m12435l(m2424k(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) aha.f677c.m24507i(obj, iM2413O & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ym8 ym8VarM2425l = m2425l(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (ym8VarM2425l.isInitialized(list.get(i12))) {
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
    public final h94 m2423j(int i) {
        return (h94) this.f6082b[wq1.m24103C(i, 3, 2, 1)];
    }

    /* JADX INFO: renamed from: k */
    public final Object m2424k(int i) {
        return this.f6082b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: l */
    public final ym8 m2425l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f6082b;
        ym8 ym8Var = (ym8) objArr[i2];
        if (ym8Var != null) {
            return ym8Var;
        }
        ym8 ym8VarM13412a = ho7.f42713c.m13412a((Class) objArr[i2 + 1]);
        objArr[i2] = ym8VarM13412a;
        return ym8VarM13412a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    /* JADX INFO: renamed from: m */
    public final boolean m2426m(Object obj, int i) {
        int i2 = this.f6081a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & aha.f677c.m24505g(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM2413O = m2413O(i);
        long j2 = iM2413O & 1048575;
        switch (m2393N(iM2413O)) {
            case 0:
                if (Double.doubleToRawLongBits(aha.f677c.mo19136e(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(aha.f677c.mo19137f(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (aha.f677c.m24506h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (aha.f677c.m24506h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (aha.f677c.m24506h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return aha.f677c.mo19134c(obj, j2);
            case 8:
                Object objM24507i = aha.f677c.m24507i(obj, j2);
                if (objM24507i instanceof String) {
                    return !((String) objM24507i).isEmpty();
                }
                if (objM24507i instanceof ByteString) {
                    return !ByteString.f6037b.equals(objM24507i);
                }
                ij6.m13959q();
                return false;
            case 9:
                if (aha.f677c.m24507i(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ByteString.f6037b.equals(aha.f677c.m24507i(obj, j2));
            case 11:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (aha.f677c.m24506h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (aha.f677c.m24505g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (aha.f677c.m24506h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (aha.f677c.m24507i(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // p000.ym8
    public final void makeImmutable(Object obj) {
        if (m2396o(obj)) {
            if (obj instanceof AbstractC0675i) {
                AbstractC0675i abstractC0675i = (AbstractC0675i) obj;
                abstractC0675i.m2387l(Integer.MAX_VALUE);
                abstractC0675i.memoizedHashCode = 0;
                abstractC0675i.m2385i();
            }
            int[] iArr = this.f6081a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM2413O = m2413O(i);
                long j = 1048575 & iM2413O;
                int iM2393N = m2393N(iM2413O);
                if (iM2393N != 9) {
                    if (iM2393N != 60 && iM2393N != 68) {
                        switch (iM2393N) {
                            case 17:
                                if (m2426m(obj, i)) {
                                    m2425l(i).makeImmutable(f6080o.getObject(obj, j));
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
                                this.f6091k.getClass();
                                AbstractC3356n1 abstractC3356n1 = (AbstractC3356n1) ((n94) aha.f677c.m24507i(obj, j));
                                if (abstractC3356n1.f52152a) {
                                    abstractC3356n1.f52152a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f6080o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f6093m.getClass();
                                    ((MapFieldLite) object).f6046a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m2428p(obj, iArr[i], i)) {
                        m2425l(i).makeImmutable(f6080o.getObject(obj, j));
                    }
                } else if (m2426m(obj, i)) {
                    m2425l(i).makeImmutable(f6080o.getObject(obj, j));
                }
            }
            ((C0682p) this.f6092l).getClass();
            C0681o c0681o = ((AbstractC0675i) obj).unknownFields;
            if (c0681o.f6105e) {
                c0681o.f6105e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.ym8
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        m2395h(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f6081a;
            if (i >= iArr.length) {
                AbstractC0679m.m2450k(this.f6092l, obj, obj2);
                return;
            }
            int iM2413O = m2413O(i);
            long j = 1048575 & iM2413O;
            int i2 = iArr[i];
            switch (m2393N(iM2413O)) {
                case 0:
                    if (!m2426m(obj2, i)) {
                        obj3 = obj;
                    } else {
                        xga xgaVar = aha.f677c;
                        obj3 = obj;
                        xgaVar.mo19140m(obj3, j, xgaVar.mo19136e(obj2, j));
                        m2408I(obj3, i);
                    }
                    break;
                case 1:
                    if (m2426m(obj2, i)) {
                        xga xgaVar2 = aha.f677c;
                        xgaVar2.mo19141n(obj, j, xgaVar2.mo19137f(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m2426m(obj2, i)) {
                        aha.m419o(obj, j, aha.f677c.m24506h(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m2426m(obj2, i)) {
                        aha.m419o(obj, j, aha.f677c.m24506h(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m2426m(obj2, i)) {
                        aha.m419o(obj, j, aha.f677c.m24506h(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m2426m(obj2, i)) {
                        xga xgaVar3 = aha.f677c;
                        xgaVar3.mo19138k(obj, j, xgaVar3.mo19134c(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m2426m(obj2, i)) {
                        aha.m420p(obj, j, aha.f677c.m24507i(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m2430r(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 10:
                    if (m2426m(obj2, i)) {
                        aha.m420p(obj, j, aha.f677c.m24507i(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m2426m(obj2, i)) {
                        aha.m419o(obj, j, aha.f677c.m24506h(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m2426m(obj2, i)) {
                        aha.m418n(obj, j, aha.f677c.m24505g(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m2426m(obj2, i)) {
                        aha.m419o(obj, j, aha.f677c.m24506h(obj2, j));
                        m2408I(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m2430r(obj, obj2, i);
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
                    this.f6091k.getClass();
                    xga xgaVar4 = aha.f677c;
                    n94 n94VarMutableCopyWithCapacity = (n94) xgaVar4.m24507i(obj, j);
                    n94 n94Var = (n94) xgaVar4.m24507i(obj2, j);
                    int size = n94VarMutableCopyWithCapacity.size();
                    int size2 = n94Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC3356n1) n94VarMutableCopyWithCapacity).f52152a) {
                            n94VarMutableCopyWithCapacity = n94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                        }
                        n94VarMutableCopyWithCapacity.addAll(n94Var);
                    }
                    if (size > 0) {
                        n94Var = n94VarMutableCopyWithCapacity;
                    }
                    aha.m420p(obj, j, n94Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC0679m.f6097a;
                    xga xgaVar5 = aha.f677c;
                    Object objM24507i = xgaVar5.m24507i(obj, j);
                    Object objM24507i2 = xgaVar5.m24507i(obj2, j);
                    this.f6093m.getClass();
                    aha.m420p(obj, j, yp5.m25242a(objM24507i, objM24507i2));
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
                    if (m2428p(obj2, i2, i)) {
                        aha.m420p(obj, j, aha.f677c.m24507i(obj2, j));
                        m2409J(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m2431s(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m2428p(obj2, i2, i)) {
                        aha.m420p(obj, j, aha.f677c.m24507i(obj2, j));
                        m2409J(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m2431s(obj, obj2, i);
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

    /* JADX INFO: renamed from: n */
    public final boolean m2427n(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m2426m(obj, i);
        }
        return (i3 & i4) != 0;
    }

    @Override // p000.ym8
    public final AbstractC0675i newInstance() {
        this.f6090j.getClass();
        return ((AbstractC0675i) this.f6085e).m2386j();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2428p(Object obj, int i, int i2) {
        return aha.f677c.m24505g(obj, (long) (this.f6081a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: q */
    public final void m2429q(int i, Object obj, Object obj2) {
        long jM2413O = m2413O(i) & 1048575;
        Object objM24507i = aha.f677c.m24507i(obj, jM2413O);
        yp5 yp5Var = this.f6093m;
        if (objM24507i != null) {
            yp5Var.getClass();
            if (!((MapFieldLite) objM24507i).f6046a) {
                MapFieldLite mapFieldLiteM2276c = MapFieldLite.f6045b.m2276c();
                yp5.m25242a(mapFieldLiteM2276c, objM24507i);
                aha.m420p(obj, jM2413O, mapFieldLiteM2276c);
                objM24507i = mapFieldLiteM2276c;
            }
        } else {
            yp5Var.getClass();
            objM24507i = MapFieldLite.f6045b.m2276c();
            aha.m420p(obj, jM2413O, objM24507i);
        }
        yp5Var.getClass();
        g9a.m12435l(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public final void m2430r(Object obj, Object obj2, int i) {
        if (m2426m(obj2, i)) {
            long jM2413O = m2413O(i) & 1048575;
            Unsafe unsafe = f6080o;
            Object object = unsafe.getObject(obj2, jM2413O);
            if (object == null) {
                ij6.m13947d(this.f6081a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            ym8 ym8VarM2425l = m2425l(i);
            if (!m2426m(obj, i)) {
                if (m2396o(object)) {
                    AbstractC0675i abstractC0675iNewInstance = ym8VarM2425l.newInstance();
                    ym8VarM2425l.mergeFrom(abstractC0675iNewInstance, object);
                    unsafe.putObject(obj, jM2413O, abstractC0675iNewInstance);
                } else {
                    unsafe.putObject(obj, jM2413O, object);
                }
                m2408I(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2413O);
            if (!m2396o(object2)) {
                AbstractC0675i abstractC0675iNewInstance2 = ym8VarM2425l.newInstance();
                ym8VarM2425l.mergeFrom(abstractC0675iNewInstance2, object2);
                unsafe.putObject(obj, jM2413O, abstractC0675iNewInstance2);
                object2 = abstractC0675iNewInstance2;
            }
            ym8VarM2425l.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2431s(Object obj, Object obj2, int i) {
        int[] iArr = this.f6081a;
        int i2 = iArr[i];
        if (m2428p(obj2, i2, i)) {
            long jM2413O = m2413O(i) & 1048575;
            Unsafe unsafe = f6080o;
            Object object = unsafe.getObject(obj2, jM2413O);
            if (object == null) {
                ij6.m13947d(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            ym8 ym8VarM2425l = m2425l(i);
            if (!m2428p(obj, i2, i)) {
                if (m2396o(object)) {
                    AbstractC0675i abstractC0675iNewInstance = ym8VarM2425l.newInstance();
                    ym8VarM2425l.mergeFrom(abstractC0675iNewInstance, object);
                    unsafe.putObject(obj, jM2413O, abstractC0675iNewInstance);
                } else {
                    unsafe.putObject(obj, jM2413O, object);
                }
                m2409J(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2413O);
            if (!m2396o(object2)) {
                AbstractC0675i abstractC0675iNewInstance2 = ym8VarM2425l.newInstance();
                ym8VarM2425l.mergeFrom(abstractC0675iNewInstance2, object2);
                unsafe.putObject(obj, jM2413O, abstractC0675iNewInstance2);
                object2 = abstractC0675iNewInstance2;
            }
            ym8VarM2425l.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final Object m2432t(Object obj, int i) {
        ym8 ym8VarM2425l = m2425l(i);
        long jM2413O = m2413O(i) & 1048575;
        if (!m2426m(obj, i)) {
            return ym8VarM2425l.newInstance();
        }
        Object object = f6080o.getObject(obj, jM2413O);
        if (m2396o(object)) {
            return object;
        }
        AbstractC0675i abstractC0675iNewInstance = ym8VarM2425l.newInstance();
        if (object != null) {
            ym8VarM2425l.mergeFrom(abstractC0675iNewInstance, object);
        }
        return abstractC0675iNewInstance;
    }

    /* JADX INFO: renamed from: u */
    public final Object m2433u(Object obj, int i, int i2) {
        ym8 ym8VarM2425l = m2425l(i2);
        if (!m2428p(obj, i, i2)) {
            return ym8VarM2425l.newInstance();
        }
        Object object = f6080o.getObject(obj, m2413O(i2) & 1048575);
        if (m2396o(object)) {
            return object;
        }
        AbstractC0675i abstractC0675iNewInstance = ym8VarM2425l.newInstance();
        if (object != null) {
            ym8VarM2425l.mergeFrom(abstractC0675iNewInstance, object);
        }
        return abstractC0675iNewInstance;
    }

    /* JADX INFO: renamed from: z */
    public final void m2434z(long j, Object obj, int i) {
        Unsafe unsafe = f6080o;
        Object objM2424k = m2424k(i);
        Object object = unsafe.getObject(obj, j);
        this.f6093m.getClass();
        if (!((MapFieldLite) object).f6046a) {
            MapFieldLite mapFieldLiteM2276c = MapFieldLite.f6045b.m2276c();
            yp5.m25242a(mapFieldLiteM2276c, object);
            unsafe.putObject(obj, j, mapFieldLiteM2276c);
        }
        g9a.m12435l(objM2424k);
        throw null;
    }
}
