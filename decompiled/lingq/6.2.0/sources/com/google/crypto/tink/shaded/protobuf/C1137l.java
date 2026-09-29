package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import p000.AbstractC3282l1;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3846zu;
import p000.af5;
import p000.dr7;
import p000.e73;
import p000.eda;
import p000.eo7;
import p000.f94;
import p000.fk5;
import p000.g9a;
import p000.ho2;
import p000.if0;
import p000.ij6;
import p000.l94;
import p000.m80;
import p000.o94;
import p000.omd;
import p000.ox2;
import p000.rx2;
import p000.t74;
import p000.ui2;
import p000.ux5;
import p000.vga;
import p000.wm8;
import p000.wp5;
import p000.wq1;
import p000.xk6;
import p000.yga;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1137l implements wm8 {

    /* JADX INFO: renamed from: o */
    public static final int[] f13597o = new int[0];

    /* JADX INFO: renamed from: p */
    public static final Unsafe f13598p = yga.m25134j();

    /* JADX INFO: renamed from: a */
    public final int[] f13599a;

    /* JADX INFO: renamed from: b */
    public final Object[] f13600b;

    /* JADX INFO: renamed from: c */
    public final int f13601c;

    /* JADX INFO: renamed from: d */
    public final int f13602d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1126a f13603e;

    /* JADX INFO: renamed from: f */
    public final boolean f13604f;

    /* JADX INFO: renamed from: g */
    public final boolean f13605g;

    /* JADX INFO: renamed from: h */
    public final int[] f13606h;

    /* JADX INFO: renamed from: i */
    public final int f13607i;

    /* JADX INFO: renamed from: j */
    public final int f13608j;

    /* JADX INFO: renamed from: k */
    public final xk6 f13609k;

    /* JADX INFO: renamed from: l */
    public final af5 f13610l;

    /* JADX INFO: renamed from: m */
    public final AbstractC1140o f13611m;

    /* JADX INFO: renamed from: n */
    public final wp5 f13612n;

    public C1137l(int[] iArr, Object[] objArr, int i, int i2, AbstractC1126a abstractC1126a, boolean z, int[] iArr2, int i3, int i4, xk6 xk6Var, af5 af5Var, AbstractC1140o abstractC1140o, rx2 rx2Var, wp5 wp5Var) {
        this.f13599a = iArr;
        this.f13600b = objArr;
        this.f13601c = i;
        this.f13602d = i2;
        this.f13604f = abstractC1126a instanceof AbstractC1134i;
        this.f13605g = z;
        this.f13606h = iArr2;
        this.f13607i = i3;
        this.f13608j = i4;
        this.f13609k = xk6Var;
        this.f13610l = af5Var;
        this.f13611m = abstractC1140o;
        this.f13603e = abstractC1126a;
        this.f13612n = wp5Var;
    }

    /* JADX INFO: renamed from: A */
    public static long m6558A(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: B */
    public static int m6559B(Object obj, long j) {
        return ((Integer) yga.f69826c.m23276i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static long m6560C(Object obj, long j) {
        return ((Long) yga.f69826c.m23276i(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: M */
    public static Field m6561M(Class cls, String str) {
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

    /* JADX INFO: renamed from: S */
    public static int m6562S(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: V */
    public static void m6563V(int i, Object obj, C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            c1132g.m6522b(i, (ByteString) obj);
            return;
        }
        String str = (String) obj;
        C1131f c1131f = c1132g.f13592a;
        c1131f.m6517r(i, 2);
        int i2 = c1131f.f13590c;
        byte[] bArr = c1131f.f13589b;
        int i3 = c1131f.f13591d;
        try {
            int iM6508i = C1131f.m6508i(str.length() * 3);
            int iM6508i2 = C1131f.m6508i(str.length());
            if (iM6508i2 != iM6508i) {
                c1131f.m6518s(AbstractC1144s.m6664b(str));
                int i4 = c1131f.f13591d;
                c1131f.f13591d = AbstractC1144s.f13628a.m6661b(str, bArr, i4, i2 - i4);
                return;
            }
            int i5 = i3 + iM6508i2;
            c1131f.f13591d = i5;
            int iM6661b = AbstractC1144s.f13628a.m6661b(str, bArr, i5, i2 - i5);
            c1131f.f13591d = i3;
            c1131f.m6518s((iM6661b - i3) - iM6508i2);
            c1131f.f13591d = iM6661b;
        } catch (Utf8$UnpairedSurrogateException e) {
            c1131f.f13591d = i3;
            C1131f.f13586e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(o94.f54077a);
            try {
                c1131f.m6518s(bytes.length);
                c1131f.m6511l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6564h(Object obj) {
        if (m6566q(obj)) {
            return;
        }
        C3386nv.m17626m(AbstractC3393o1.m17733h(obj, "Mutating immutable message: "));
    }

    /* JADX INFO: renamed from: m */
    public static C1141p m6565m(Object obj) {
        AbstractC1134i abstractC1134i = (AbstractC1134i) obj;
        C1141p c1141p = abstractC1134i.unknownFields;
        if (c1141p != C1141p.f13620f) {
            return c1141p;
        }
        C1141p c1141pM6653c = C1141p.m6653c();
        abstractC1134i.unknownFields = c1141pM6653c;
        return c1141pM6653c;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m6566q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1134i) {
            return ((AbstractC1134i) obj).m6547m();
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static List m6567s(AbstractC1134i abstractC1134i, long j) {
        return (List) yga.f69826c.m23276i(abstractC1134i, j);
    }

    /* JADX INFO: renamed from: y */
    public static C1137l m6568y(dr7 dr7Var, xk6 xk6Var, af5 af5Var, AbstractC1140o abstractC1140o, rx2 rx2Var, wp5 wp5Var) {
        if (dr7Var instanceof dr7) {
            return m6569z(dr7Var, xk6Var, af5Var, abstractC1140o, rx2Var, wp5Var);
        }
        ho2.m13383c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0353  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b0  */
    /* JADX INFO: renamed from: z */
    public static C1137l m6569z(dr7 dr7Var, xk6 xk6Var, af5 af5Var, AbstractC1140o abstractC1140o, rx2 rx2Var, wp5 wp5Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset3;
        Field fieldM6561M;
        int i19;
        char cCharAt9;
        int i20;
        Field fieldM6561M2;
        Field fieldM6561M3;
        int i21;
        char cCharAt10;
        int i22;
        char cCharAt11;
        int i23;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        int i26 = 0;
        boolean z = ((dr7Var.f36114d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO3;
        String str = dr7Var.f36112b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i27 = 1;
            while (true) {
                i = i27 + 1;
                if (str.charAt(i27) < 55296) {
                    break;
                }
                i27 = i;
            }
        } else {
            i = 1;
        }
        int i28 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i29 = iCharAt5 & 8191;
            int i30 = 13;
            while (true) {
                i25 = i28 + 1;
                cCharAt13 = str.charAt(i28);
                if (cCharAt13 < 55296) {
                    break;
                }
                i29 |= (cCharAt13 & 8191) << i30;
                i30 += 13;
                i28 = i25;
            }
            iCharAt5 = i29 | (cCharAt13 << i30);
            i28 = i25;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
            iArr = f13597o;
            i3 = 0;
        } else {
            int i31 = i28 + 1;
            int iCharAt6 = str.charAt(i28);
            if (iCharAt6 >= 55296) {
                int i32 = iCharAt6 & 8191;
                int i33 = 13;
                while (true) {
                    i11 = i31 + 1;
                    cCharAt8 = str.charAt(i31);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt8 & 8191) << i33;
                    i33 += 13;
                    i31 = i11;
                }
                iCharAt6 = i32 | (cCharAt8 << i33);
                i31 = i11;
            }
            int i34 = i31 + 1;
            int iCharAt7 = str.charAt(i31);
            if (iCharAt7 >= 55296) {
                int i35 = iCharAt7 & 8191;
                int i36 = 13;
                while (true) {
                    i10 = i34 + 1;
                    cCharAt7 = str.charAt(i34);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt7 & 8191) << i36;
                    i36 += 13;
                    i34 = i10;
                }
                iCharAt7 = i35 | (cCharAt7 << i36);
                i34 = i10;
            }
            int i37 = i34 + 1;
            iCharAt = str.charAt(i34);
            if (iCharAt >= 55296) {
                int i38 = iCharAt & 8191;
                int i39 = 13;
                while (true) {
                    i9 = i37 + 1;
                    cCharAt6 = str.charAt(i37);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt6 & 8191) << i39;
                    i39 += 13;
                    i37 = i9;
                }
                iCharAt = i38 | (cCharAt6 << i39);
                i37 = i9;
            }
            int i40 = i37 + 1;
            iCharAt2 = str.charAt(i37);
            if (iCharAt2 >= 55296) {
                int i41 = iCharAt2 & 8191;
                int i42 = 13;
                while (true) {
                    i8 = i40 + 1;
                    cCharAt5 = str.charAt(i40);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt5 & 8191) << i42;
                    i42 += 13;
                    i40 = i8;
                }
                iCharAt2 = i41 | (cCharAt5 << i42);
                i40 = i8;
            }
            int i43 = i40 + 1;
            int iCharAt8 = str.charAt(i40);
            if (iCharAt8 >= 55296) {
                int i44 = iCharAt8 & 8191;
                int i45 = 13;
                while (true) {
                    i7 = i43 + 1;
                    cCharAt4 = str.charAt(i43);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt4 & 8191) << i45;
                    i45 += 13;
                    i43 = i7;
                }
                iCharAt8 = i44 | (cCharAt4 << i45);
                i43 = i7;
            }
            int i46 = i43 + 1;
            iCharAt3 = str.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i6 = i46 + 1;
                    cCharAt3 = str.charAt(i46);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt3 & 8191) << i48;
                    i48 += 13;
                    i46 = i6;
                }
                iCharAt3 = i47 | (cCharAt3 << i48);
                i46 = i6;
            }
            int i49 = i46 + 1;
            int iCharAt9 = str.charAt(i46);
            if (iCharAt9 >= 55296) {
                int i50 = iCharAt9 & 8191;
                int i51 = 13;
                while (true) {
                    i5 = i49 + 1;
                    cCharAt2 = str.charAt(i49);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt2 & 8191) << i51;
                    i51 += 13;
                    i49 = i5;
                }
                iCharAt9 = i50 | (cCharAt2 << i51);
                i49 = i5;
            }
            int i52 = i49 + 1;
            iCharAt4 = str.charAt(i49);
            if (iCharAt4 >= 55296) {
                int i53 = iCharAt4 & 8191;
                int i54 = i52;
                int i55 = 13;
                while (true) {
                    i4 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i54 = i4;
                }
                iCharAt4 = i53 | (cCharAt << i55);
                i52 = i4;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt3 + iCharAt9];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i26 = iCharAt6;
            i28 = i52;
        }
        Unsafe unsafe = f13598p;
        Object[] objArr = dr7Var.f36113c;
        Class<?> cls = dr7Var.f36111a.getClass();
        int[] iArr3 = new int[i3 * 3];
        Object[] objArr2 = new Object[i3 * 2];
        int i56 = iCharAt3 + iCharAt4;
        int i57 = i56;
        int i58 = iCharAt4;
        int i59 = 0;
        int i60 = 0;
        while (i28 < length) {
            int i61 = i28 + 1;
            int iCharAt10 = str.charAt(i28);
            int i62 = length;
            if (iCharAt10 >= 55296) {
                int i63 = iCharAt10 & 8191;
                int i64 = i61;
                int i65 = 13;
                while (true) {
                    i24 = i64 + 1;
                    cCharAt12 = str.charAt(i64);
                    i12 = i26;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i24;
                    i26 = i12;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i13 = i24;
            } else {
                i12 = i26;
                i13 = i61;
            }
            int i66 = i13 + 1;
            int iCharAt11 = str.charAt(i13);
            if (iCharAt11 >= 55296) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i22 = i68 + 1;
                    cCharAt11 = str.charAt(i68);
                    i23 = i67;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i67 = i23 | ((cCharAt11 & 8191) << i69);
                    i69 += 13;
                    i68 = i22;
                }
                iCharAt11 = i23 | (cCharAt11 << i69);
                i14 = i22;
            } else {
                i14 = i66;
            }
            int i70 = iCharAt10;
            int i71 = iCharAt11 & 255;
            Object[] objArr3 = objArr2;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i59;
                i60++;
            }
            int i72 = iCharAt;
            if (i71 >= 51) {
                int i73 = i14 + 1;
                int iCharAt12 = str.charAt(i14);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = 13;
                    while (true) {
                        i21 = i73 + 1;
                        cCharAt10 = str.charAt(i73);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i74 |= (cCharAt10 & 8191) << i75;
                        i75 += 13;
                        i73 = i21;
                        c = 55296;
                    }
                    iCharAt12 = i74 | (cCharAt10 << i75);
                    i73 = i21;
                }
                int i76 = i71 - 51;
                int i77 = iCharAt12;
                if (i76 == 9 || i76 == 17) {
                    objArr3[wq1.m24103C(i59, 3, 2, 1)] = objArr[i2];
                    i2++;
                } else if (i76 == 12 && !z) {
                    objArr3[wq1.m24103C(i59, 3, 2, 1)] = objArr[i2];
                    i2++;
                }
                int i78 = i77 * 2;
                Object obj = objArr[i78];
                if (obj instanceof Field) {
                    fieldM6561M2 = (Field) obj;
                } else {
                    fieldM6561M2 = m6561M(cls, (String) obj);
                    objArr[i78] = fieldM6561M2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM6561M2);
                int i79 = i78 + 1;
                Object obj2 = objArr[i79];
                if (obj2 instanceof Field) {
                    fieldM6561M3 = (Field) obj2;
                } else {
                    fieldM6561M3 = m6561M(cls, (String) obj2);
                    objArr[i79] = fieldM6561M3;
                }
                i59 = i59;
                i18 = i2;
                i16 = i73;
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM6561M3);
                z = z;
                i17 = 0;
            } else {
                int i80 = i2 + 1;
                Field fieldM6561M4 = m6561M(cls, (String) objArr[i2]);
                if (i71 == 9 || i71 == 17) {
                    objArr3[wq1.m24103C(i59, 3, 2, 1)] = fieldM6561M4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i20 = i2 + 2;
                        objArr3[wq1.m24103C(i59, 3, 2, 1)] = objArr[i80];
                    } else if (i71 != 12 && i71 != 30 && i71 != 44) {
                        if (i71 == 50) {
                            i58++;
                            iArr[i58] = i59;
                            int i81 = (i59 / 3) * 2;
                            int i82 = i2 + 2;
                            objArr3[i81] = objArr[i80];
                            if ((iCharAt11 & 2048) != 0) {
                                i15 = i2 + 3;
                                objArr3[i81 + 1] = objArr[i82];
                            } else {
                                i15 = i82;
                            }
                            z = z;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6561M4);
                        if ((iCharAt11 & 4096) == 4096 || i71 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i16 = i14;
                            i17 = 0;
                        } else {
                            i16 = i14 + 1;
                            int iCharAt13 = str.charAt(i14);
                            if (iCharAt13 >= 55296) {
                                int i83 = iCharAt13 & 8191;
                                int i84 = 13;
                                while (true) {
                                    i19 = i16 + 1;
                                    cCharAt9 = str.charAt(i16);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i83 |= (cCharAt9 & 8191) << i84;
                                    i84 += 13;
                                    i16 = i19;
                                }
                                iCharAt13 = i83 | (cCharAt9 << i84);
                                i16 = i19;
                            }
                            int i85 = (iCharAt13 / 32) + (i12 * 2);
                            Object obj3 = objArr[i85];
                            if (obj3 instanceof Field) {
                                fieldM6561M = (Field) obj3;
                            } else {
                                fieldM6561M = m6561M(cls, (String) obj3);
                                objArr[i85] = fieldM6561M;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM6561M);
                            i17 = iCharAt13 % 32;
                        }
                        if (i71 >= 18 && i71 <= 49) {
                            iArr[i57] = iObjectFieldOffset;
                            i57++;
                        }
                        i18 = i15;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                    } else if (!z) {
                        i20 = i2 + 2;
                        objArr3[wq1.m24103C(i59, 3, 2, 1)] = objArr[i80];
                    }
                    i15 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6561M4);
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    }
                    if (i71 >= 18) {
                        iArr[i57] = iObjectFieldOffset;
                        i57++;
                    }
                    i18 = i15;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                i15 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM6561M4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                }
                if (i71 >= 18) {
                    iArr[i57] = iObjectFieldOffset;
                    i57++;
                }
                i18 = i15;
                iObjectFieldOffset3 = iObjectFieldOffset;
            }
            int i86 = i59 + 1;
            iArr3[i59] = i70;
            int i87 = i59 + 2;
            int i88 = iObjectFieldOffset2;
            iArr3[i86] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset3;
            iArr3[i87] = (i17 << 20) | i88;
            int i89 = i18;
            i59 += 3;
            str = str;
            i2 = i89;
            i28 = i16;
            length = i62;
            objArr2 = objArr3;
            i26 = i12;
            z = z;
            iCharAt = i72;
            iCharAt2 = iCharAt2;
        }
        return new C1137l(iArr3, objArr2, iCharAt, iCharAt2, dr7Var.f36111a, z, iArr, iCharAt4, i56, xk6Var, af5Var, abstractC1140o, rx2Var, wp5Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m6570D(long j, Object obj, int i) {
        Unsafe unsafe = f13598p;
        Object objM6595k = m6595k(i);
        Object object = unsafe.getObject(obj, j);
        this.f13612n.getClass();
        if (!((MapFieldLite) object).m6425d()) {
            MapFieldLite mapFieldLiteM6428g = MapFieldLite.m6423b().m6428g();
            wp5.m24099b(mapFieldLiteM6428g, object);
            unsafe.putObject(obj, j, mapFieldLiteM6428g);
        }
        g9a.m12435l(objM6595k);
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public final int m6571E(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int i9;
        Unsafe unsafe = f13598p;
        long j2 = this.f13599a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(omd.m18168x(bArr, i))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(omd.m18167w(bArr, i))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM18118F = omd.m18118F(bArr, i, c3846zu);
                unsafe.putObject(obj, j, Long.valueOf(c3846zu.f72165b));
                unsafe.putInt(obj, j2, i4);
                return iM18118F;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM18116D = omd.m18116D(bArr, i, c3846zu);
                unsafe.putObject(obj, j, Integer.valueOf(c3846zu.f72164a));
                unsafe.putInt(obj, j2, i4);
                return iM18116D;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(omd.m18168x(bArr, i)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(omd.m18167w(bArr, i)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM18118F2 = omd.m18118F(bArr, i, c3846zu);
                unsafe.putObject(obj, j, Boolean.valueOf(c3846zu.f72165b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM18118F2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM18116D2 = omd.m18116D(bArr, i, c3846zu);
                int i14 = c3846zu.f72164a;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!AbstractC1144s.f13628a.m6662c(bArr, iM18116D2, iM18116D2 + i14)) {
                            throw InvalidProtocolBufferException.m6416b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM18116D2, i14, o94.f54077a));
                    iM18116D2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iM18116D2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objM6605x = m6605x(obj, i4, i8);
                    int iM18134X = omd.m18134X(objM6605x, m6596l(i8), bArr, i9, i2, c3846zu);
                    m6583R(obj, i4, i8, objM6605x);
                    return iM18134X;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iM18166v = omd.m18166v(bArr, i9, c3846zu);
                    unsafe.putObject(obj, j, c3846zu.f72166c);
                    unsafe.putInt(obj, j2, i4);
                    return iM18166v;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iM18116D3 = omd.m18116D(bArr, i9, c3846zu);
                    int i15 = c3846zu.f72164a;
                    f94 f94VarM6594j = m6594j(i8);
                    if (f94VarM6594j != null && !f94VarM6594j.isInRange(i15)) {
                        m6565m(obj).m6656d(i3, Long.valueOf(i15));
                        return iM18116D3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iM18116D3;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iM18116D4 = omd.m18116D(bArr, i9, c3846zu);
                    unsafe.putObject(obj, j, Integer.valueOf(m80.m16672b(c3846zu.f72164a)));
                    unsafe.putInt(obj, j2, i4);
                    return iM18116D4;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iM18118F3 = omd.m18118F(bArr, i9, c3846zu);
                    unsafe.putObject(obj, j, Long.valueOf(m80.m16673c(c3846zu.f72165b)));
                    unsafe.putInt(obj, j2, i4);
                    return iM18118F3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objM6605x2 = m6605x(obj, i4, i8);
                    int iM6572F = ((C1137l) m6596l(i8)).m6572F(objM6605x2, bArr, i, i2, (i3 & (-8)) | 4, c3846zu);
                    c3846zu.f72166c = objM6605x2;
                    m6583R(obj, i4, i8, objM6605x2);
                    return iM6572F;
                }
            default:
                return i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: F */
    public final int m6572F(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p000.C3846zu r35) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C1137l.m6572F(java.lang.Object, byte[], int, int, int, zu):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009b. Please report as an issue. */
    /* JADX INFO: renamed from: G */
    public final void m6573G(Object obj, byte[] bArr, int i, int i2, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int i3;
        int iM6581P;
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        Unsafe unsafe2;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        int i9;
        Object obj4;
        int i10;
        int i11;
        int i12;
        Object obj5;
        int iM6571E;
        C1137l c1137l = this;
        Object obj6 = obj;
        bArr = bArr;
        i2 = i2;
        c3846zu = c3846zu;
        m6564h(obj6);
        Unsafe unsafe4 = f13598p;
        int iM18166v = i;
        int i13 = -1;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (iM18166v < i2) {
            int iM18115C = iM18166v + 1;
            int i17 = bArr[iM18166v];
            if (i17 < 0) {
                iM18115C = omd.m18115C(i17, bArr, iM18115C, c3846zu);
                i17 = c3846zu.f72164a;
            }
            i13 = i17 >>> 3;
            int i18 = i17 & 7;
            int i19 = c1137l.f13602d;
            int i20 = c1137l.f13601c;
            if (i13 > i13) {
                iM6581P = (i13 < i20 || i13 > i19) ? -1 : c1137l.m6581P(i13, i14 / 3);
                i3 = 0;
            } else if (i13 < i20 || i13 > i19) {
                i3 = 0;
                iM6581P = -1;
            } else {
                i3 = 0;
                iM6581P = c1137l.m6581P(i13, 0);
            }
            i14 = iM6581P;
            if (i14 == -1) {
                unsafe = unsafe4;
                i4 = i17;
                i5 = i3;
                obj2 = obj6;
                i6 = iM18115C;
                i7 = i13;
            } else {
                int[] iArr = c1137l.f13599a;
                int i21 = iArr[i14 + 1];
                int iM6562S = m6562S(i21);
                int i22 = i17;
                long j = i21 & 1048575;
                if (iM6562S <= 17) {
                    int i23 = iArr[i14 + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = i23 & 1048575;
                    if (i25 != i15) {
                        int i26 = 1048575;
                        if (i15 != 1048575) {
                            unsafe4.putInt(obj6, i15, i16);
                            i26 = 1048575;
                        }
                        if (i25 != i26) {
                            i16 = unsafe4.getInt(obj6, i25);
                        }
                        i15 = i25;
                    }
                    switch (iM6562S) {
                        case 0:
                            unsafe3 = unsafe4;
                            bArr2 = bArr;
                            i8 = iM18115C;
                            if (i18 != 1) {
                                obj3 = obj6;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                yga.f69826c.mo17426m(obj6, j, Double.longBitsToDouble(omd.m18168x(bArr2, i8)));
                                iM18166v = i8 + 8;
                                i16 |= i24;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 1:
                            unsafe3 = unsafe4;
                            bArr2 = bArr;
                            i8 = iM18115C;
                            if (i18 != 5) {
                                obj3 = obj6;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                yga.f69826c.mo17427n(obj6, j, Float.intBitsToFloat(omd.m18167w(bArr2, i8)));
                                iM18166v = i8 + 4;
                                i16 |= i24;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 2:
                        case 3:
                            c3846zu = c3846zu;
                            bArr2 = bArr;
                            i8 = iM18115C;
                            if (i18 != 0) {
                                unsafe3 = unsafe4;
                                obj3 = obj6;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                int iM18118F = omd.m18118F(bArr2, i8, c3846zu);
                                unsafe4.putLong(obj6, j, c3846zu.f72165b);
                                i16 |= i24;
                                iM18166v = iM18118F;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 4:
                        case 11:
                            c3846zu = c3846zu;
                            bArr3 = bArr;
                            i8 = iM18115C;
                            if (i18 != 0) {
                                unsafe3 = unsafe4;
                                obj3 = obj6;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                int iM18116D = omd.m18116D(bArr3, i8, c3846zu);
                                unsafe4.putInt(obj6, j, c3846zu.f72164a);
                                i16 |= i24;
                                iM18166v = iM18116D;
                                bArr = bArr3;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe3 = unsafe4;
                            int i27 = iM18115C;
                            c3846zu = c3846zu;
                            bArr3 = bArr;
                            Object obj7 = obj6;
                            if (i18 != 1) {
                                obj6 = obj7;
                                i8 = i27;
                                obj3 = obj6;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                long jM18168x = omd.m18168x(bArr3, i27);
                                obj6 = obj7;
                                unsafe4 = unsafe3;
                                unsafe4.putLong(obj6, j, jM18168x);
                                iM18166v = i27 + 8;
                                i16 |= i24;
                                bArr = bArr3;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe3 = unsafe4;
                            i9 = iM18115C;
                            c3846zu = c3846zu;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i18 != 5) {
                                Object obj8 = obj4;
                                i8 = i9;
                                obj3 = obj8;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                unsafe3.putInt(obj4, j, omd.m18167w(bArr2, i9));
                                iM18166v = i9 + 4;
                                i16 |= i24;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 7:
                            unsafe3 = unsafe4;
                            i9 = iM18115C;
                            c3846zu = c3846zu;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i18 != 0) {
                                Object obj9 = obj4;
                                i8 = i9;
                                obj3 = obj9;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                iM18166v = omd.m18118F(bArr2, i9, c3846zu);
                                yga.f69826c.mo17424k(obj4, j, c3846zu.f72165b != 0);
                                i16 |= i24;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 8:
                            unsafe3 = unsafe4;
                            i9 = iM18115C;
                            c3846zu = c3846zu;
                            bArr2 = bArr;
                            obj4 = obj6;
                            if (i18 != 2) {
                                Object obj10 = obj4;
                                i8 = i9;
                                obj3 = obj10;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                iM18166v = (i21 & 536870912) == 0 ? omd.m18170z(bArr2, i9, c3846zu) : omd.m18113A(bArr2, i9, c3846zu);
                                unsafe3.putObject(obj4, j, c3846zu.f72166c);
                                i16 |= i24;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 9:
                            Object obj11 = obj6;
                            Unsafe unsafe5 = unsafe4;
                            obj3 = obj11;
                            if (i18 != 2) {
                                unsafe3 = unsafe5;
                                i8 = iM18115C;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                Object objM6604w = c1137l.m6604w(obj3, i14);
                                byte[] bArr4 = bArr;
                                obj4 = obj3;
                                int i28 = i2;
                                unsafe3 = unsafe5;
                                int i29 = iM18115C;
                                C3846zu c3846zu2 = c3846zu;
                                int iM18134X = omd.m18134X(objM6604w, c1137l.m6596l(i14), bArr4, i29, i28, c3846zu2);
                                bArr2 = bArr4;
                                c3846zu = c3846zu2;
                                c1137l.m6582Q(obj4, i14, objM6604w);
                                i16 |= i24;
                                iM18166v = iM18134X;
                                obj6 = obj4;
                                unsafe4 = unsafe3;
                                bArr = bArr2;
                                i2 = i2;
                                c3846zu = c3846zu;
                            }
                            break;
                        case 10:
                            Object obj12 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj12;
                            if (i18 != 2) {
                                unsafe3 = unsafe2;
                                i8 = iM18115C;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                iM18166v = omd.m18166v(bArr, iM18115C, c3846zu);
                                unsafe2.putObject(obj3, j, c3846zu.f72166c);
                                i16 |= i24;
                                Unsafe unsafe6 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe6;
                                i14 = i14;
                                i13 = i13;
                            }
                            break;
                        case 12:
                            Object obj13 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj13;
                            if (i18 != 0) {
                                unsafe3 = unsafe2;
                                i8 = iM18115C;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                iM18166v = omd.m18116D(bArr, iM18115C, c3846zu);
                                unsafe2.putInt(obj3, j, c3846zu.f72164a);
                                i16 |= i24;
                                Unsafe unsafe7 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe7;
                                i14 = i14;
                                i13 = i13;
                            }
                            break;
                        case 15:
                            Object obj14 = obj6;
                            unsafe2 = unsafe4;
                            obj3 = obj14;
                            if (i18 != 0) {
                                unsafe3 = unsafe2;
                                i8 = iM18115C;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                iM18166v = omd.m18116D(bArr, iM18115C, c3846zu);
                                unsafe2.putInt(obj3, j, m80.m16672b(c3846zu.f72164a));
                                i16 |= i24;
                                Unsafe unsafe8 = unsafe2;
                                obj6 = obj3;
                                unsafe4 = unsafe8;
                                i14 = i14;
                                i13 = i13;
                            }
                            break;
                        case 16:
                            if (i18 != 0) {
                                Object obj15 = obj6;
                                unsafe2 = unsafe4;
                                obj3 = obj15;
                                unsafe3 = unsafe2;
                                i8 = iM18115C;
                                i4 = i22 == true ? 1 : 0;
                                obj2 = obj3;
                                i6 = i8;
                                unsafe = unsafe3;
                                i5 = i14;
                                i7 = i13;
                            } else {
                                int iM18118F2 = omd.m18118F(bArr, iM18115C, c3846zu);
                                unsafe4.putLong(obj6, j, m80.m16673c(c3846zu.f72165b));
                                i16 |= i24;
                                obj6 = obj6;
                                unsafe4 = unsafe4;
                                iM18166v = iM18118F2;
                                i14 = i14;
                                i13 = i13;
                            }
                            break;
                        default:
                            unsafe3 = unsafe4;
                            obj3 = obj6;
                            i8 = iM18115C;
                            i4 = i22 == true ? 1 : 0;
                            obj2 = obj3;
                            i6 = i8;
                            unsafe = unsafe3;
                            i5 = i14;
                            i7 = i13;
                            break;
                    }
                } else {
                    Unsafe unsafe9 = unsafe4;
                    Object obj16 = obj6;
                    byte[] bArr5 = bArr;
                    int i30 = iM18115C;
                    if (iM6562S != 27) {
                        i4 = i22 == true ? 1 : 0;
                        i10 = i30;
                        if (iM6562S <= 49) {
                            i5 = i14;
                            i12 = i15;
                            unsafe = unsafe9;
                            i11 = i16;
                            i7 = i13;
                            iM6571E = c1137l.m6574H(obj, bArr, i10, i2, i4 == true ? 1 : 0, i7, i18, i5, i21, iM6562S, j, c3846zu);
                            if (iM6571E != i10) {
                                obj6 = obj;
                                i13 = i7;
                                iM18166v = iM6571E;
                                i14 = i5;
                                i15 = i12;
                                i16 = i11;
                                unsafe4 = unsafe;
                                i2 = i2;
                            } else {
                                obj2 = obj;
                                i6 = iM6571E;
                                i15 = i12;
                                i16 = i11;
                            }
                        } else {
                            unsafe = unsafe9;
                            i5 = i14;
                            i11 = i16;
                            i7 = i13;
                            i12 = i15;
                            obj5 = obj;
                            if (iM6562S == 50) {
                                if (i18 == 2) {
                                    c1137l.m6570D(j, obj5, i5);
                                    throw null;
                                }
                                i6 = i10;
                                obj2 = obj5;
                                i15 = i12;
                                i16 = i11;
                            } else {
                                iM6571E = c1137l.m6571E(obj5, bArr, i10, i2, i4 == true ? 1 : 0, i7, i18, i21, iM6562S, j, i5, c3846zu);
                                obj2 = obj5;
                                if (iM6571E != i10) {
                                    i5 = i5;
                                    c1137l = this;
                                    i13 = i7;
                                    iM18166v = iM6571E;
                                    i14 = i5;
                                    obj6 = obj2;
                                    i15 = i12;
                                    i16 = i11;
                                    unsafe4 = unsafe;
                                    i2 = i2;
                                } else {
                                    i5 = i5;
                                    i6 = iM6571E;
                                    i15 = i12;
                                    i16 = i11;
                                }
                            }
                        }
                    } else if (i18 == 2) {
                        l94 l94VarMutableCopyWithCapacity = (l94) unsafe9.getObject(obj16, j);
                        if (!((AbstractC3282l1) l94VarMutableCopyWithCapacity).f48878a) {
                            int size = l94VarMutableCopyWithCapacity.size();
                            l94VarMutableCopyWithCapacity = l94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe9.putObject(obj16, j, l94VarMutableCopyWithCapacity);
                        }
                        int iM18169y = omd.m18169y(c1137l.m6596l(i14), i22 == true ? 1 : 0, bArr5, i30, i2, l94VarMutableCopyWithCapacity, c3846zu);
                        obj6 = obj;
                        c3846zu = c3846zu;
                        iM18166v = iM18169y;
                        unsafe4 = unsafe9;
                        i14 = i14;
                        i13 = i13;
                        i2 = i2;
                    } else {
                        obj5 = obj;
                        i4 = i22 == true ? 1 : 0;
                        i10 = i30;
                        unsafe = unsafe9;
                        i5 = i14;
                        i12 = i15;
                        i11 = i16;
                        i7 = i13;
                        i6 = i10;
                        obj2 = obj5;
                        i15 = i12;
                        i16 = i11;
                    }
                }
            }
            int iM18114B = omd.m18114B(i4 == true ? 1 : 0, bArr, i6, i2, m6565m(obj2), c3846zu);
            bArr = bArr;
            c3846zu = c3846zu;
            i13 = i7;
            i14 = i5;
            obj6 = obj2;
            unsafe4 = unsafe;
            i2 = i2;
            iM18166v = iM18114B;
            c1137l = this;
        }
        Unsafe unsafe10 = unsafe4;
        Object obj17 = obj6;
        int i31 = i2;
        int i32 = i15;
        int i33 = i16;
        if (i32 != 1048575) {
            unsafe10.putInt(obj17, i32, i33);
        }
        if (iM18166v != i31) {
            throw InvalidProtocolBufferException.m6420f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: H */
    public final int m6574H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int iM18117E;
        Unsafe unsafe = f13598p;
        l94 l94VarMutableCopyWithCapacity = (l94) unsafe.getObject(obj, j2);
        if (!((AbstractC3282l1) l94VarMutableCopyWithCapacity).f48878a) {
            int size = l94VarMutableCopyWithCapacity.size();
            l94VarMutableCopyWithCapacity = l94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, l94VarMutableCopyWithCapacity);
        }
        l94 l94Var = l94VarMutableCopyWithCapacity;
        switch (i7) {
            case 18:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i5 == 2) {
                    ui2 ui2Var = (ui2) l94Var;
                    int iM18116D = omd.m18116D(bArr, i, c3846zu);
                    int i8 = c3846zu.f72164a + iM18116D;
                    while (iM18116D < i8) {
                        ui2Var.addDouble(Double.longBitsToDouble(omd.m18168x(bArr, iM18116D)));
                        iM18116D += 8;
                    }
                    if (iM18116D == i8) {
                        return iM18116D;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 1) {
                    ui2 ui2Var2 = (ui2) l94Var;
                    ui2Var2.addDouble(Double.longBitsToDouble(omd.m18168x(bArr, i)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int iM18116D2 = omd.m18116D(bArr, i9, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return i9;
                        }
                        ui2Var2.addDouble(Double.longBitsToDouble(omd.m18168x(bArr, iM18116D2)));
                        i9 = iM18116D2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    e73 e73Var = (e73) l94Var;
                    int iM18116D3 = omd.m18116D(bArr, i, c3846zu);
                    int i10 = c3846zu.f72164a + iM18116D3;
                    while (iM18116D3 < i10) {
                        e73Var.addFloat(Float.intBitsToFloat(omd.m18167w(bArr, iM18116D3)));
                        iM18116D3 += 4;
                    }
                    if (iM18116D3 == i10) {
                        return iM18116D3;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 5) {
                    e73 e73Var2 = (e73) l94Var;
                    e73Var2.addFloat(Float.intBitsToFloat(omd.m18167w(bArr, i)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int iM18116D4 = omd.m18116D(bArr, i11, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return i11;
                        }
                        e73Var2.addFloat(Float.intBitsToFloat(omd.m18167w(bArr, iM18116D4)));
                        i11 = iM18116D4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i5 == 2) {
                    fk5 fk5Var = (fk5) l94Var;
                    int iM18116D5 = omd.m18116D(bArr, i, c3846zu);
                    int i12 = c3846zu.f72164a + iM18116D5;
                    while (iM18116D5 < i12) {
                        iM18116D5 = omd.m18118F(bArr, iM18116D5, c3846zu);
                        fk5Var.addLong(c3846zu.f72165b);
                    }
                    if (iM18116D5 == i12) {
                        return iM18116D5;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 0) {
                    fk5 fk5Var2 = (fk5) l94Var;
                    int iM18118F = omd.m18118F(bArr, i, c3846zu);
                    fk5Var2.addLong(c3846zu.f72165b);
                    while (iM18118F < i2) {
                        int iM18116D6 = omd.m18116D(bArr, iM18118F, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18118F;
                        }
                        iM18118F = omd.m18118F(bArr, iM18116D6, c3846zu);
                        fk5Var2.addLong(c3846zu.f72165b);
                    }
                    return iM18118F;
                }
                return i;
            case 22:
            case 29:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return omd.m18117E(i3, bArr, i, i2, l94Var, c3846zu);
                    }
                    return i;
                }
                t74 t74Var = (t74) l94Var;
                int iM18116D7 = omd.m18116D(bArr, i, c3846zu);
                int i13 = c3846zu.f72164a + iM18116D7;
                while (iM18116D7 < i13) {
                    iM18116D7 = omd.m18116D(bArr, iM18116D7, c3846zu);
                    t74Var.addInt(c3846zu.f72164a);
                }
                if (iM18116D7 == i13) {
                    return iM18116D7;
                }
                throw InvalidProtocolBufferException.m6421g();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 32:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case 46:
                if (i5 == 2) {
                    fk5 fk5Var3 = (fk5) l94Var;
                    int iM18116D8 = omd.m18116D(bArr, i, c3846zu);
                    int i14 = c3846zu.f72164a + iM18116D8;
                    while (iM18116D8 < i14) {
                        fk5Var3.addLong(omd.m18168x(bArr, iM18116D8));
                        iM18116D8 += 8;
                    }
                    if (iM18116D8 == i14) {
                        return iM18116D8;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 1) {
                    fk5 fk5Var4 = (fk5) l94Var;
                    fk5Var4.addLong(omd.m18168x(bArr, i));
                    int i15 = i + 8;
                    while (i15 < i2) {
                        int iM18116D9 = omd.m18116D(bArr, i15, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return i15;
                        }
                        fk5Var4.addLong(omd.m18168x(bArr, iM18116D9));
                        i15 = iM18116D9 + 8;
                    }
                    return i15;
                }
                return i;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    t74 t74Var2 = (t74) l94Var;
                    int iM18116D10 = omd.m18116D(bArr, i, c3846zu);
                    int i16 = c3846zu.f72164a + iM18116D10;
                    while (iM18116D10 < i16) {
                        t74Var2.addInt(omd.m18167w(bArr, iM18116D10));
                        iM18116D10 += 4;
                    }
                    if (iM18116D10 == i16) {
                        return iM18116D10;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 5) {
                    t74 t74Var3 = (t74) l94Var;
                    t74Var3.addInt(omd.m18167w(bArr, i));
                    int i17 = i + 4;
                    while (i17 < i2) {
                        int iM18116D11 = omd.m18116D(bArr, i17, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return i17;
                        }
                        t74Var3.addInt(omd.m18167w(bArr, iM18116D11));
                        i17 = iM18116D11 + 4;
                    }
                    return i17;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    if0 if0Var = (if0) l94Var;
                    int iM18116D12 = omd.m18116D(bArr, i, c3846zu);
                    int i18 = c3846zu.f72164a + iM18116D12;
                    while (iM18116D12 < i18) {
                        iM18116D12 = omd.m18118F(bArr, iM18116D12, c3846zu);
                        if0Var.addBoolean(c3846zu.f72165b != 0);
                    }
                    if (iM18116D12 == i18) {
                        return iM18116D12;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 0) {
                    if0 if0Var2 = (if0) l94Var;
                    int iM18118F2 = omd.m18118F(bArr, i, c3846zu);
                    if0Var2.addBoolean(c3846zu.f72165b != 0);
                    while (iM18118F2 < i2) {
                        int iM18116D13 = omd.m18116D(bArr, iM18118F2, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18118F2;
                        }
                        iM18118F2 = omd.m18118F(bArr, iM18116D13, c3846zu);
                        if0Var2.addBoolean(c3846zu.f72165b != 0);
                    }
                    return iM18118F2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iM18116D14 = omd.m18116D(bArr, i, c3846zu);
                        int i19 = c3846zu.f72164a;
                        if (i19 < 0) {
                            throw InvalidProtocolBufferException.m6419e();
                        }
                        if (i19 == 0) {
                            l94Var.add("");
                        } else {
                            l94Var.add(new String(bArr, iM18116D14, i19, o94.f54077a));
                            iM18116D14 += i19;
                        }
                        while (iM18116D14 < i2) {
                            int iM18116D15 = omd.m18116D(bArr, iM18116D14, c3846zu);
                            if (i3 != c3846zu.f72164a) {
                                return iM18116D14;
                            }
                            iM18116D14 = omd.m18116D(bArr, iM18116D15, c3846zu);
                            int i20 = c3846zu.f72164a;
                            if (i20 < 0) {
                                throw InvalidProtocolBufferException.m6419e();
                            }
                            if (i20 == 0) {
                                l94Var.add("");
                            } else {
                                l94Var.add(new String(bArr, iM18116D14, i20, o94.f54077a));
                                iM18116D14 += i20;
                            }
                        }
                        return iM18116D14;
                    }
                    int iM18116D16 = omd.m18116D(bArr, i, c3846zu);
                    int i21 = c3846zu.f72164a;
                    if (i21 < 0) {
                        throw InvalidProtocolBufferException.m6419e();
                    }
                    if (i21 == 0) {
                        l94Var.add("");
                    } else {
                        int i22 = iM18116D16 + i21;
                        if (!AbstractC1144s.f13628a.m6662c(bArr, iM18116D16, i22)) {
                            throw InvalidProtocolBufferException.m6416b();
                        }
                        l94Var.add(new String(bArr, iM18116D16, i21, o94.f54077a));
                        iM18116D16 = i22;
                    }
                    while (iM18116D16 < i2) {
                        int iM18116D17 = omd.m18116D(bArr, iM18116D16, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18116D16;
                        }
                        iM18116D16 = omd.m18116D(bArr, iM18116D17, c3846zu);
                        int i23 = c3846zu.f72164a;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.m6419e();
                        }
                        if (i23 == 0) {
                            l94Var.add("");
                        } else {
                            int i24 = iM18116D16 + i23;
                            if (!AbstractC1144s.f13628a.m6662c(bArr, iM18116D16, i24)) {
                                throw InvalidProtocolBufferException.m6416b();
                            }
                            l94Var.add(new String(bArr, iM18116D16, i23, o94.f54077a));
                            iM18116D16 = i24;
                        }
                    }
                    return iM18116D16;
                }
                return i;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i5 == 2) {
                    return omd.m18169y(m6596l(i6), i3, bArr, i, i2, l94Var, c3846zu);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iM18116D18 = omd.m18116D(bArr, i, c3846zu);
                    int i25 = c3846zu.f72164a;
                    if (i25 < 0) {
                        throw InvalidProtocolBufferException.m6419e();
                    }
                    if (i25 > bArr.length - iM18116D18) {
                        throw InvalidProtocolBufferException.m6421g();
                    }
                    if (i25 == 0) {
                        l94Var.add(ByteString.f13555b);
                    } else {
                        l94Var.add(ByteString.m6408g(bArr, iM18116D18, i25));
                        iM18116D18 += i25;
                    }
                    while (iM18116D18 < i2) {
                        int iM18116D19 = omd.m18116D(bArr, iM18116D18, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18116D18;
                        }
                        iM18116D18 = omd.m18116D(bArr, iM18116D19, c3846zu);
                        int i26 = c3846zu.f72164a;
                        if (i26 < 0) {
                            throw InvalidProtocolBufferException.m6419e();
                        }
                        if (i26 > bArr.length - iM18116D18) {
                            throw InvalidProtocolBufferException.m6421g();
                        }
                        if (i26 == 0) {
                            l94Var.add(ByteString.f13555b);
                        } else {
                            l94Var.add(ByteString.m6408g(bArr, iM18116D18, i26));
                            iM18116D18 += i26;
                        }
                    }
                    return iM18116D18;
                }
                return i;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM18117E = omd.m18117E(i3, bArr, i, i2, l94Var, c3846zu);
                    }
                    return i;
                }
                t74 t74Var4 = (t74) l94Var;
                iM18117E = omd.m18116D(bArr, i, c3846zu);
                int i27 = c3846zu.f72164a + iM18117E;
                while (iM18117E < i27) {
                    iM18117E = omd.m18116D(bArr, iM18117E, c3846zu);
                    t74Var4.addInt(c3846zu.f72164a);
                }
                if (iM18117E != i27) {
                    throw InvalidProtocolBufferException.m6421g();
                }
                AbstractC1139n.m6646v(obj, i4, l94Var, m6594j(i6), null, this.f13611m);
                return iM18117E;
            case 33:
            case 47:
                if (i5 == 2) {
                    t74 t74Var5 = (t74) l94Var;
                    int iM18116D20 = omd.m18116D(bArr, i, c3846zu);
                    int i28 = c3846zu.f72164a + iM18116D20;
                    while (iM18116D20 < i28) {
                        iM18116D20 = omd.m18116D(bArr, iM18116D20, c3846zu);
                        t74Var5.addInt(m80.m16672b(c3846zu.f72164a));
                    }
                    if (iM18116D20 == i28) {
                        return iM18116D20;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 0) {
                    t74 t74Var6 = (t74) l94Var;
                    int iM18116D21 = omd.m18116D(bArr, i, c3846zu);
                    t74Var6.addInt(m80.m16672b(c3846zu.f72164a));
                    while (iM18116D21 < i2) {
                        int iM18116D22 = omd.m18116D(bArr, iM18116D21, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18116D21;
                        }
                        iM18116D21 = omd.m18116D(bArr, iM18116D22, c3846zu);
                        t74Var6.addInt(m80.m16672b(c3846zu.f72164a));
                    }
                    return iM18116D21;
                }
                return i;
            case 34:
            case eda.f37086g /* 48 */:
                if (i5 == 2) {
                    fk5 fk5Var5 = (fk5) l94Var;
                    int iM18116D23 = omd.m18116D(bArr, i, c3846zu);
                    int i29 = c3846zu.f72164a + iM18116D23;
                    while (iM18116D23 < i29) {
                        iM18116D23 = omd.m18118F(bArr, iM18116D23, c3846zu);
                        fk5Var5.addLong(m80.m16673c(c3846zu.f72165b));
                    }
                    if (iM18116D23 == i29) {
                        return iM18116D23;
                    }
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (i5 == 0) {
                    fk5 fk5Var6 = (fk5) l94Var;
                    int iM18118F3 = omd.m18118F(bArr, i, c3846zu);
                    fk5Var6.addLong(m80.m16673c(c3846zu.f72165b));
                    while (iM18118F3 < i2) {
                        int iM18116D24 = omd.m18116D(bArr, iM18118F3, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM18118F3;
                        }
                        iM18118F3 = omd.m18118F(bArr, iM18116D24, c3846zu);
                        fk5Var6.addLong(m80.m16673c(c3846zu.f72165b));
                    }
                    return iM18118F3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    wm8 wm8VarM6596l = m6596l(i6);
                    int i30 = (i3 & (-8)) | 4;
                    Object objNewInstance = wm8VarM6596l.newInstance();
                    C1137l c1137l = (C1137l) wm8VarM6596l;
                    int iM6572F = c1137l.m6572F(objNewInstance, bArr, i, i2, i30, c3846zu);
                    int i31 = i30;
                    c3846zu.f72166c = objNewInstance;
                    wm8VarM6596l.makeImmutable(objNewInstance);
                    c3846zu.f72166c = objNewInstance;
                    l94Var.add(objNewInstance);
                    while (iM6572F < i2) {
                        int iM18116D25 = omd.m18116D(bArr, iM6572F, c3846zu);
                        if (i3 != c3846zu.f72164a) {
                            return iM6572F;
                        }
                        Object objNewInstance2 = wm8VarM6596l.newInstance();
                        int i32 = i31;
                        iM6572F = c1137l.m6572F(objNewInstance2, bArr, iM18116D25, i2, i32, c3846zu);
                        c3846zu.f72166c = objNewInstance2;
                        wm8VarM6596l.makeImmutable(objNewInstance2);
                        c3846zu.f72166c = objNewInstance2;
                        l94Var.add(objNewInstance2);
                        i31 = i32;
                    }
                    return iM6572F;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m6575I(Object obj, long j, C1130e c1130e, wm8 wm8Var, ox2 ox2Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo6437C;
        List listMo342c = this.f13610l.mo342c(obj, j);
        m80 m80Var = c1130e.f13582a;
        int i = c1130e.f13583b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            Object objNewInstance = wm8Var.newInstance();
            c1130e.m6479b(objNewInstance, wm8Var, ox2Var);
            wm8Var.makeImmutable(objNewInstance);
            listMo342c.add(objNewInstance);
            if (m80Var.mo6448e() || c1130e.f13585d != 0) {
                return;
            } else {
                iMo6437C = m80Var.mo6437C();
            }
        } while (iMo6437C == i);
        c1130e.f13585d = iMo6437C;
    }

    /* JADX INFO: renamed from: J */
    public final void m6576J(Object obj, int i, C1130e c1130e, wm8 wm8Var, ox2 ox2Var) throws InvalidProtocolBufferException {
        int iMo6437C;
        List listMo342c = this.f13610l.mo342c(obj, i & 1048575);
        m80 m80Var = c1130e.f13582a;
        int i2 = c1130e.f13583b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            Object objNewInstance = wm8Var.newInstance();
            c1130e.m6480c(objNewInstance, wm8Var, ox2Var);
            wm8Var.makeImmutable(objNewInstance);
            listMo342c.add(objNewInstance);
            if (m80Var.mo6448e() || c1130e.f13585d != 0) {
                return;
            } else {
                iMo6437C = m80Var.mo6437C();
            }
        } while (iMo6437C == i2);
        c1130e.f13585d = iMo6437C;
    }

    /* JADX INFO: renamed from: K */
    public final void m6577K(Object obj, int i, C1130e c1130e) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            c1130e.m6499v(2);
            yga.m25140p(obj, i & 1048575, c1130e.f13582a.mo6436B());
        } else if (!this.f13604f) {
            yga.m25140p(obj, i & 1048575, c1130e.m6482e());
        } else {
            c1130e.m6499v(2);
            yga.m25140p(obj, i & 1048575, c1130e.f13582a.mo6435A());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m6578L(Object obj, int i, C1130e c1130e) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z = (536870912 & i) != 0;
        af5 af5Var = this.f13610l;
        if (z) {
            c1130e.m6495r(af5Var.mo342c(obj, i & 1048575), true);
        } else {
            c1130e.m6495r(af5Var.mo342c(obj, i & 1048575), false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6579N(Object obj, int i) {
        int i2 = this.f13599a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        yga.m25138n(obj, j, (1 << (i2 >>> 20)) | yga.f69826c.m23274g(obj, j));
    }

    /* JADX INFO: renamed from: O */
    public final void m6580O(Object obj, int i, int i2) {
        yga.m25138n(obj, this.f13599a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: P */
    public final int m6581P(int i, int i2) {
        int[] iArr = this.f13599a;
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

    /* JADX INFO: renamed from: Q */
    public final void m6582Q(Object obj, int i, Object obj2) {
        f13598p.putObject(obj, m6584T(i) & 1048575, obj2);
        m6579N(obj, i);
    }

    /* JADX INFO: renamed from: R */
    public final void m6583R(Object obj, int i, int i2, Object obj2) {
        f13598p.putObject(obj, m6584T(i2) & 1048575, obj2);
        m6580O(obj, i, i2);
    }

    /* JADX INFO: renamed from: T */
    public final int m6584T(int i) {
        return this.f13599a[i + 1];
    }

    /* JADX INFO: renamed from: U */
    public final void m6585U(Object obj, C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2;
        int i3;
        int[] iArr = this.f13599a;
        int length = iArr.length;
        Unsafe unsafe = f13598p;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int iM6584T = m6584T(i6);
            int i7 = iArr[i6];
            int iM6562S = m6562S(iM6584T);
            if (iM6562S <= 17) {
                int i8 = iArr[i6 + 2];
                i = 1048575;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1048575;
                i2 = 0;
            }
            int i10 = i6;
            long j = iM6584T & i;
            switch (iM6562S) {
                case 0:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6523c(i7, yga.f69826c.mo17422e(obj, j));
                        continue;
                    }
                    break;
                case 1:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6527g(i7, yga.f69826c.mo17423f(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6530j(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6537q(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6529i(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6526f(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6525e(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6521a(i7, yga.f69826c.mo17420c(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        m6563V(i7, unsafe.getObject(obj, j), c1132g);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6531k(i7, unsafe.getObject(obj, j), m6596l(i3));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6522b(i7, (ByteString) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6536p(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6524d(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6532l(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6533m(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6534n(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6535o(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        c1132g.m6528h(i7, unsafe.getObject(obj, j), m6596l(i3));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    i3 = i10;
                    AbstractC1139n.m6609C(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 19:
                    i3 = i10;
                    AbstractC1139n.m6613G(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 20:
                    i3 = i10;
                    AbstractC1139n.m6616J(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 21:
                    i3 = i10;
                    AbstractC1139n.m6624R(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 22:
                    i3 = i10;
                    AbstractC1139n.m6615I(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    i3 = i10;
                    AbstractC1139n.m6612F(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 24:
                    i3 = i10;
                    AbstractC1139n.m6611E(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 25:
                    i3 = i10;
                    AbstractC1139n.m6607A(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 26:
                    i3 = i10;
                    AbstractC1139n.m6622P(iArr[i3], (List) unsafe.getObject(obj, j), c1132g);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i3 = i10;
                    AbstractC1139n.m6617K(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, m6596l(i3));
                    break;
                case 28:
                    i3 = i10;
                    AbstractC1139n.m6608B(iArr[i3], (List) unsafe.getObject(obj, j), c1132g);
                    break;
                case 29:
                    i3 = i10;
                    AbstractC1139n.m6623Q(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    break;
                case 30:
                    i3 = i10;
                    AbstractC1139n.m6610D(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i3 = i10;
                    AbstractC1139n.m6618L(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 32:
                    i3 = i10;
                    AbstractC1139n.m6619M(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 33:
                    i3 = i10;
                    AbstractC1139n.m6620N(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case 34:
                    i3 = i10;
                    AbstractC1139n.m6621O(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, false);
                    continue;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    i3 = i10;
                    AbstractC1139n.m6609C(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i3 = i10;
                    AbstractC1139n.m6613G(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i3 = i10;
                    AbstractC1139n.m6616J(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 38:
                    i3 = i10;
                    AbstractC1139n.m6624R(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i3 = i10;
                    AbstractC1139n.m6615I(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i3 = i10;
                    AbstractC1139n.m6612F(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i3 = i10;
                    AbstractC1139n.m6611E(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 42:
                    i3 = i10;
                    AbstractC1139n.m6607A(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 43:
                    i3 = i10;
                    AbstractC1139n.m6623Q(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i3 = i10;
                    AbstractC1139n.m6610D(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i3 = i10;
                    AbstractC1139n.m6618L(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 46:
                    i3 = i10;
                    AbstractC1139n.m6619M(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 47:
                    i3 = i10;
                    AbstractC1139n.m6620N(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case eda.f37086g /* 48 */:
                    i3 = i10;
                    AbstractC1139n.m6621O(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, true);
                    break;
                case 49:
                    i3 = i10;
                    AbstractC1139n.m6614H(iArr[i3], (List) unsafe.getObject(obj, j), c1132g, m6596l(i3));
                    break;
                case 50:
                    i3 = i10;
                    if (unsafe.getObject(obj, j) != null) {
                        Object objM6595k = m6595k(i3);
                        this.f13612n.getClass();
                        g9a.m12435l(objM6595k);
                        throw null;
                    }
                    break;
                case 51:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6523c(i7, ((Double) yga.f69826c.m23276i(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6527g(i7, ((Float) yga.f69826c.m23276i(obj, j)).floatValue());
                    }
                    break;
                case 53:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6530j(i7, m6560C(obj, j));
                    }
                    break;
                case 54:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6537q(i7, m6560C(obj, j));
                    }
                    break;
                case 55:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6529i(i7, m6559B(obj, j));
                    }
                    break;
                case 56:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6526f(i7, m6560C(obj, j));
                    }
                    break;
                case 57:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6525e(i7, m6559B(obj, j));
                    }
                    break;
                case 58:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6521a(i7, ((Boolean) yga.f69826c.m23276i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        m6563V(i7, unsafe.getObject(obj, j), c1132g);
                    }
                    break;
                case 60:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6531k(i7, unsafe.getObject(obj, j), m6596l(i3));
                    }
                    break;
                case 61:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6522b(i7, (ByteString) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6536p(i7, m6559B(obj, j));
                    }
                    break;
                case 63:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6524d(i7, m6559B(obj, j));
                    }
                    break;
                case 64:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6532l(i7, m6559B(obj, j));
                    }
                    break;
                case 65:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6533m(i7, m6560C(obj, j));
                    }
                    break;
                case 66:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6534n(i7, m6559B(obj, j));
                    }
                    break;
                case 67:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6535o(i7, m6560C(obj, j));
                    }
                    break;
                case 68:
                    i3 = i10;
                    if (m6600r(obj, i7, i3)) {
                        c1132g.m6528h(i7, unsafe.getObject(obj, j), m6596l(i3));
                    }
                    break;
                default:
                    i3 = i10;
                    break;
            }
        }
        ((C1142q) this.f13611m).getClass();
        ((AbstractC1134i) obj).unknownFields.m6657e(c1132g);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0679 A[Catch: all -> 0x04b5, TryCatch #9 {all -> 0x04b5, blocks: (B:165:0x0674, B:167:0x0679, B:168:0x067e, B:128:0x040f, B:129:0x0414, B:130:0x0425, B:131:0x0436, B:132:0x0447, B:133:0x0458, B:134:0x0469, B:135:0x047a, B:136:0x048b, B:137:0x049c, B:140:0x04b8, B:141:0x04d1, B:142:0x04ea, B:143:0x0504, B:144:0x051e, B:146:0x0533, B:149:0x053a, B:150:0x0540, B:151:0x054c, B:152:0x0565, B:153:0x0579, B:154:0x0593, B:155:0x059f, B:156:0x05ba, B:157:0x05d4, B:158:0x05ee, B:159:0x0607, B:160:0x0620, B:161:0x0639, B:162:0x0654), top: B:195:0x0674 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0686 A[LOOP:2: B:170:0x0684->B:171:0x0686, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0690  */
    /* JADX WARN: Code duplicated, block: B:179:0x06a4 A[LOOP:3: B:178:0x06a2->B:179:0x06a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // p000.wm8
    /* JADX INFO: renamed from: a */
    public final void mo6586a(Object obj, C1130e c1130e, ox2 ox2Var) throws Throwable {
        C1137l c1137l;
        Object obj2;
        C1141p c1141p;
        AbstractC1134i abstractC1134i;
        C1130e c1130e2;
        C1137l c1137l2 = this;
        Object obj3 = obj;
        C1130e c1130e3 = c1130e;
        ox2 ox2Var2 = ox2Var;
        ox2Var2.getClass();
        m6564h(obj3);
        AbstractC1140o abstractC1140o = c1137l2.f13611m;
        int[] iArr = c1137l2.f13606h;
        int i = c1137l2.f13608j;
        int i2 = c1137l2.f13607i;
        Object objMo6651a = null;
        while (true) {
            try {
                int iM6478a = c1130e3.m6478a();
                int iM6581P = (iM6478a < c1137l2.f13601c || iM6478a > c1137l2.f13602d) ? -1 : c1137l2.m6581P(iM6478a, 0);
                if (iM6581P >= 0) {
                    int iM6584T = c1137l2.m6584T(iM6581P);
                    try {
                        int iM6562S = m6562S(iM6584T);
                        af5 af5Var = c1137l2.f13610l;
                        switch (iM6562S) {
                            case 0:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A = m6558A(iM6584T);
                                c1130e2.m6499v(1);
                                yga.f69826c.mo17426m(obj2, jM6558A, c1130e2.f13582a.mo6453o());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 1:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A2 = m6558A(iM6584T);
                                c1130e2.m6499v(5);
                                yga.f69826c.mo17427n(obj2, jM6558A2, c1130e2.f13582a.mo6457t());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 2:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A3 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25139o(obj2, jM6558A3, c1130e2.f13582a.mo6459v());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 3:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A4 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25139o(obj2, jM6558A4, c1130e2.f13582a.mo6439E());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 4:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A5 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25138n(obj2, jM6558A5, c1130e2.f13582a.mo6458u());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 5:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A6 = m6558A(iM6584T);
                                c1130e2.m6499v(1);
                                yga.m25139o(obj2, jM6558A6, c1130e2.f13582a.mo6456r());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 6:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A7 = m6558A(iM6584T);
                                c1130e2.m6499v(5);
                                yga.m25138n(obj2, jM6558A7, c1130e2.f13582a.mo6455q());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 7:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A8 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.f69826c.mo17424k(obj2, jM6558A8, c1130e2.f13582a.mo6451m());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 8:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1137l.m6577K(obj2, iM6584T, c1130e2);
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 9:
                                c1130e2 = c1130e3;
                                ox2 ox2Var3 = ox2Var2;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                AbstractC1126a abstractC1126a = (AbstractC1126a) c1137l.m6604w(obj2, iM6581P);
                                wm8 wm8VarM6596l = c1137l.m6596l(iM6581P);
                                c1130e2.m6499v(2);
                                c1130e2.m6480c(abstractC1126a, wm8VarM6596l, ox2Var3);
                                c1137l.m6582Q(obj2, iM6581P, abstractC1126a);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 10:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                yga.m25140p(obj2, m6558A(iM6584T), c1130e2.m6482e());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 11:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A9 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25138n(obj2, jM6558A9, c1130e2.f13582a.mo6438D());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 12:
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6499v(0);
                                int iMo6454p = c1130e2.f13582a.mo6454p();
                                f94 f94VarM6594j = c1137l.m6594j(iM6581P);
                                if (f94VarM6594j == null || f94VarM6594j.isInRange(iMo6454p)) {
                                    yga.m25138n(obj2, m6558A(iM6584T), iMo6454p);
                                    c1137l.m6579N(obj2, iM6581P);
                                } else {
                                    objMo6651a = AbstractC1139n.m6650z(obj2, iM6478a, iMo6454p, objMo6651a, abstractC1140o);
                                }
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 13:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A10 = m6558A(iM6584T);
                                c1130e2.m6499v(5);
                                yga.m25138n(obj2, jM6558A10, c1130e2.f13582a.mo6460w());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 14:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A11 = m6558A(iM6584T);
                                c1130e2.m6499v(1);
                                yga.m25139o(obj2, jM6558A11, c1130e2.f13582a.mo6461x());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 15:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A12 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25138n(obj2, jM6558A12, c1130e2.f13582a.mo6462y());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 16:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                long jM6558A13 = m6558A(iM6584T);
                                c1130e2.m6499v(0);
                                yga.m25139o(obj2, jM6558A13, c1130e2.f13582a.mo6463z());
                                c1137l.m6579N(obj2, iM6581P);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 17:
                                c1130e2 = c1130e3;
                                ox2 ox2Var4 = ox2Var2;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                AbstractC1126a abstractC1126a2 = (AbstractC1126a) c1137l.m6604w(obj2, iM6581P);
                                wm8 wm8VarM6596l2 = c1137l.m6596l(iM6581P);
                                c1130e2.m6499v(3);
                                c1130e2.m6479b(abstractC1126a2, wm8VarM6596l2, ox2Var4);
                                c1137l.m6582Q(obj2, iM6581P, abstractC1126a2);
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 18:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6484g(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 19:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6488k(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 20:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6490m(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 21:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6497t(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 22:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6489l(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6487j(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 24:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6486i(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 25:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2.m6481d(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 26:
                                c1130e2 = c1130e3;
                                c1137l = c1137l2;
                                obj2 = obj3;
                                try {
                                    c1137l.m6578L(obj2, iM6584T, c1130e2);
                                    break;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    try {
                                        abstractC1140o.getClass();
                                        if (objMo6651a == null) {
                                            objMo6651a = abstractC1140o.mo6651a(obj2);
                                        }
                                        if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                            while (i2 < i) {
                                                c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                                i2++;
                                            }
                                            if (objMo6651a != null) {
                                                c1141p = (C1141p) objMo6651a;
                                                abstractC1134i = (AbstractC1134i) obj2;
                                                abstractC1134i.unknownFields = c1141p;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i2 < i) {
                                            c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                            i2++;
                                        }
                                        if (objMo6651a != null) {
                                            ((C1142q) abstractC1140o).getClass();
                                            ((AbstractC1134i) obj2).unknownFields = (C1141p) objMo6651a;
                                        }
                                        throw th;
                                    }
                                }
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                try {
                                    try {
                                        c1137l2.m6576J(obj3, iM6584T, c1130e3, c1137l2.m6596l(iM6581P), ox2Var);
                                        c1130e2 = c1130e3;
                                        c1137l = c1137l2;
                                        obj2 = obj3;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        c1130e2 = c1130e3;
                                        c1137l = c1137l2;
                                        obj2 = obj3;
                                        abstractC1140o.getClass();
                                        if (objMo6651a == null) {
                                            objMo6651a = abstractC1140o.mo6651a(obj2);
                                        }
                                        if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                            while (i2 < i) {
                                                c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                                i2++;
                                            }
                                            if (objMo6651a != null) {
                                                c1141p = (C1141p) objMo6651a;
                                                abstractC1134i = (AbstractC1134i) obj2;
                                                abstractC1134i.unknownFields = c1141p;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    c1137l = c1137l2;
                                    abstractC1140o.getClass();
                                    if (objMo6651a == null) {
                                        objMo6651a = abstractC1140o.mo6651a(obj2);
                                    }
                                    if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                        while (i2 < i) {
                                            c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                            i2++;
                                        }
                                        if (objMo6651a != null) {
                                            c1141p = (C1141p) objMo6651a;
                                            abstractC1134i = (AbstractC1134i) obj2;
                                            abstractC1134i.unknownFields = c1141p;
                                        }
                                        return;
                                    }
                                    obj3 = obj2;
                                    c1137l2 = c1137l;
                                    c1130e3 = c1130e2;
                                    ox2Var2 = ox2Var;
                                    break;
                                }
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 28:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6483f(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 29:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6496s(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 30:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                AbstractC1140o abstractC1140o2 = abstractC1140o;
                                List listMo342c = af5Var.mo342c(obj2, m6558A(iM6584T));
                                c1130e2.m6485h(listMo342c);
                                objMo6651a = AbstractC1139n.m6646v(obj2, iM6478a, listMo342c, c1137l2.m6594j(iM6581P), objMo6651a, abstractC1140o2);
                                abstractC1140o = abstractC1140o2;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6491n(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 32:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6492o(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 33:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6493p(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 34:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6494q(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6484g(af5Var.mo342c(obj2, m6558A(iM6584T)));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6488k(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6490m(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 38:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6497t(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6489l(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6487j(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6486i(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 42:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6481d(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 43:
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6496s(af5Var.mo342c(obj2, iM6584T & 1048575));
                                objMo6651a = objMo6651a;
                                abstractC1140o = abstractC1140o;
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                try {
                                    List listMo342c2 = af5Var.mo342c(obj2, iM6584T & 1048575);
                                    c1130e2.m6485h(listMo342c2);
                                    abstractC1140o = abstractC1140o;
                                    Object obj4 = objMo6651a;
                                    try {
                                        objMo6651a = AbstractC1139n.m6646v(obj2, iM6478a, listMo342c2, c1137l2.m6594j(iM6581P), obj4, abstractC1140o);
                                        abstractC1140o = abstractC1140o;
                                        c1137l = c1137l2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        objMo6651a = obj4;
                                        abstractC1140o = abstractC1140o;
                                        c1137l = c1137l2;
                                        abstractC1140o.getClass();
                                        if (objMo6651a == null) {
                                            objMo6651a = abstractC1140o.mo6651a(obj2);
                                        }
                                        if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                            while (i2 < i) {
                                                c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                                i2++;
                                            }
                                            if (objMo6651a != null) {
                                                c1141p = (C1141p) objMo6651a;
                                                abstractC1134i = (AbstractC1134i) obj2;
                                                abstractC1134i.unknownFields = c1141p;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objMo6651a = obj4;
                                        abstractC1140o = abstractC1140o;
                                        c1137l = c1137l2;
                                        while (i2 < i) {
                                            c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                            i2++;
                                        }
                                        if (objMo6651a != null) {
                                            ((C1142q) abstractC1140o).getClass();
                                            ((AbstractC1134i) obj2).unknownFields = (C1141p) objMo6651a;
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6491n(af5Var.mo342c(obj2, iM6584T & 1048575));
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 46:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6492o(af5Var.mo342c(obj2, iM6584T & 1048575));
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 47:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                c1130e2.m6493p(af5Var.mo342c(obj2, iM6584T & 1048575));
                                c1137l = c1137l2;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case eda.f37086g /* 48 */:
                                c1137l2 = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                try {
                                    try {
                                        c1130e2.m6494q(af5Var.mo342c(obj2, iM6584T & 1048575));
                                        c1137l = c1137l2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c1137l = c1137l2;
                                        while (i2 < i) {
                                            c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                            i2++;
                                        }
                                        if (objMo6651a != null) {
                                            ((C1142q) abstractC1140o).getClass();
                                            ((AbstractC1134i) obj2).unknownFields = (C1141p) objMo6651a;
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    c1137l = c1137l2;
                                    abstractC1140o.getClass();
                                    if (objMo6651a == null) {
                                        objMo6651a = abstractC1140o.mo6651a(obj2);
                                    }
                                    if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                        while (i2 < i) {
                                            c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                            i2++;
                                        }
                                        if (objMo6651a != null) {
                                            c1141p = (C1141p) objMo6651a;
                                            abstractC1134i = (AbstractC1134i) obj2;
                                            abstractC1134i.unknownFields = c1141p;
                                        }
                                        return;
                                    }
                                }
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 49:
                                try {
                                    C1130e c1130e4 = c1130e3;
                                    try {
                                        c1137l2.m6575I(obj3, iM6584T & 1048575, c1130e4, c1137l2.m6596l(iM6581P), ox2Var);
                                        c1137l2 = c1137l2;
                                        obj2 = obj3;
                                        c1130e2 = c1130e4;
                                        c1137l = c1137l2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        c1137l = c1137l2;
                                        obj2 = obj3;
                                        c1130e2 = c1130e4;
                                        abstractC1140o.getClass();
                                        if (objMo6651a == null) {
                                            objMo6651a = abstractC1140o.mo6651a(obj2);
                                        }
                                        if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                            while (i2 < i) {
                                                c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                                i2++;
                                            }
                                            if (objMo6651a != null) {
                                                c1141p = (C1141p) objMo6651a;
                                                abstractC1134i = (AbstractC1134i) obj2;
                                                abstractC1134i.unknownFields = c1141p;
                                            }
                                            return;
                                        }
                                    }
                                    obj3 = obj2;
                                    c1137l2 = c1137l;
                                    c1130e3 = c1130e2;
                                    ox2Var2 = ox2Var;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c1137l2 = c1137l2;
                                    obj2 = obj3;
                                    c1137l = c1137l2;
                                    while (i2 < i) {
                                        c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                        i2++;
                                    }
                                    if (objMo6651a != null) {
                                        ((C1142q) abstractC1140o).getClass();
                                        ((AbstractC1134i) obj2).unknownFields = (C1141p) objMo6651a;
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                c1137l2.m6601t(iM6581P, obj3, c1137l2.m6595k(iM6581P));
                                throw null;
                            case 51:
                                c1130e3.m6499v(1);
                                yga.m25140p(obj3, iM6584T & 1048575, Double.valueOf(c1130e3.f13582a.mo6453o()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 52:
                                c1130e3.m6499v(5);
                                yga.m25140p(obj3, iM6584T & 1048575, Float.valueOf(c1130e3.f13582a.mo6457t()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 53:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Long.valueOf(c1130e3.f13582a.mo6459v()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 54:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Long.valueOf(c1130e3.f13582a.mo6439E()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 55:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(c1130e3.f13582a.mo6458u()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 56:
                                c1130e3.m6499v(1);
                                yga.m25140p(obj3, iM6584T & 1048575, Long.valueOf(c1130e3.f13582a.mo6456r()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 57:
                                c1130e3.m6499v(5);
                                yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(c1130e3.f13582a.mo6455q()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 58:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Boolean.valueOf(c1130e3.f13582a.mo6451m()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 59:
                                c1137l2.m6577K(obj3, iM6584T, c1130e3);
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 60:
                                AbstractC1126a abstractC1126a3 = (AbstractC1126a) c1137l2.m6605x(obj3, iM6478a, iM6581P);
                                wm8 wm8VarM6596l3 = c1137l2.m6596l(iM6581P);
                                c1130e3.m6499v(2);
                                c1130e3.m6480c(abstractC1126a3, wm8VarM6596l3, ox2Var2);
                                c1137l2.m6583R(obj3, iM6478a, iM6581P, abstractC1126a3);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 61:
                                yga.m25140p(obj3, iM6584T & 1048575, c1130e3.m6482e());
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 62:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(c1130e3.f13582a.mo6438D()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 63:
                                c1130e3.m6499v(0);
                                int iMo6454p2 = c1130e3.f13582a.mo6454p();
                                f94 f94VarM6594j2 = c1137l2.m6594j(iM6581P);
                                if (f94VarM6594j2 == null || f94VarM6594j2.isInRange(iMo6454p2)) {
                                    yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(iMo6454p2));
                                    c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                } else {
                                    objMo6651a = AbstractC1139n.m6650z(obj3, iM6478a, iMo6454p2, objMo6651a, abstractC1140o);
                                }
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 64:
                                c1130e3.m6499v(5);
                                yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(c1130e3.f13582a.mo6460w()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 65:
                                c1130e3.m6499v(1);
                                yga.m25140p(obj3, iM6584T & 1048575, Long.valueOf(c1130e3.f13582a.mo6461x()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 66:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Integer.valueOf(c1130e3.f13582a.mo6462y()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 67:
                                c1130e3.m6499v(0);
                                yga.m25140p(obj3, iM6584T & 1048575, Long.valueOf(c1130e3.f13582a.mo6463z()));
                                c1137l2.m6580O(obj3, iM6478a, iM6581P);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            case 68:
                                AbstractC1126a abstractC1126a4 = (AbstractC1126a) c1137l2.m6605x(obj3, iM6478a, iM6581P);
                                wm8 wm8VarM6596l4 = c1137l2.m6596l(iM6581P);
                                c1130e3.m6499v(3);
                                c1130e3.m6479b(abstractC1126a4, wm8VarM6596l4, ox2Var2);
                                c1137l2.m6583R(obj3, iM6478a, iM6581P, abstractC1126a4);
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                            default:
                                if (objMo6651a == null) {
                                    try {
                                        objMo6651a = abstractC1140o.mo6651a(obj3);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        c1137l = c1137l2;
                                        obj2 = obj3;
                                        c1130e2 = c1130e3;
                                        abstractC1140o.getClass();
                                        if (objMo6651a == null) {
                                            objMo6651a = abstractC1140o.mo6651a(obj2);
                                        }
                                        if (!abstractC1140o.m6652b(objMo6651a, c1130e2)) {
                                            while (i2 < i) {
                                                c1137l.m6593i(iArr[i2], obj2, objMo6651a);
                                                i2++;
                                            }
                                            if (objMo6651a != null) {
                                                c1141p = (C1141p) objMo6651a;
                                                abstractC1134i = (AbstractC1134i) obj2;
                                                abstractC1134i.unknownFields = c1141p;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (!abstractC1140o.m6652b(objMo6651a, c1130e3)) {
                                    while (i2 < i) {
                                        c1137l2.m6593i(iArr[i2], obj3, objMo6651a);
                                        i2++;
                                    }
                                    if (objMo6651a == null) {
                                        return;
                                    }
                                }
                                c1137l = c1137l2;
                                obj2 = obj3;
                                c1130e2 = c1130e3;
                                obj3 = obj2;
                                c1137l2 = c1137l;
                                c1130e3 = c1130e2;
                                ox2Var2 = ox2Var;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                        c1137l = c1137l2;
                        obj2 = obj3;
                        c1130e2 = c1130e3;
                    }
                } else if (iM6478a == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        c1137l2.m6593i(iArr[i2], obj3, objMo6651a);
                        i2++;
                    }
                    if (objMo6651a == null) {
                        return;
                    } else {
                        ((C1142q) abstractC1140o).getClass();
                    }
                } else {
                    abstractC1140o.getClass();
                    if (objMo6651a == null) {
                        objMo6651a = abstractC1140o.mo6651a(obj3);
                    }
                    if (!abstractC1140o.m6652b(objMo6651a, c1130e3)) {
                        while (i2 < i) {
                            c1137l2.m6593i(iArr[i2], obj3, objMo6651a);
                            i2++;
                        }
                        if (objMo6651a == null) {
                            return;
                        }
                    }
                }
                abstractC1134i.unknownFields = c1141p;
            } catch (Throwable th6) {
                th = th6;
                c1137l = c1137l2;
                obj2 = obj3;
            }
        }
        c1141p = (C1141p) objMo6651a;
        abstractC1134i = (AbstractC1134i) obj3;
        abstractC1134i.unknownFields = c1141p;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.wm8
    /* JADX INFO: renamed from: b */
    public final boolean mo6587b(AbstractC1134i abstractC1134i, AbstractC1134i abstractC1134i2) {
        int[] iArr = this.f13599a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM6649y = true;
            if (i < length) {
                int iM6584T = m6584T(i);
                long j = iM6584T & 1048575;
                switch (m6562S(iM6584T)) {
                    case 0:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar = yga.f69826c;
                            if (Double.doubleToLongBits(vgaVar.mo17422e(abstractC1134i, j)) != Double.doubleToLongBits(vgaVar.mo17422e(abstractC1134i2, j))) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar2 = yga.f69826c;
                            if (Float.floatToIntBits(vgaVar2.mo17423f(abstractC1134i, j)) != Float.floatToIntBits(vgaVar2.mo17423f(abstractC1134i2, j))) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar3 = yga.f69826c;
                            if (vgaVar3.m23275h(abstractC1134i, j) != vgaVar3.m23275h(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar4 = yga.f69826c;
                            if (vgaVar4.m23275h(abstractC1134i, j) != vgaVar4.m23275h(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar5 = yga.f69826c;
                            if (vgaVar5.m23274g(abstractC1134i, j) != vgaVar5.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar6 = yga.f69826c;
                            if (vgaVar6.m23275h(abstractC1134i, j) != vgaVar6.m23275h(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar7 = yga.f69826c;
                            if (vgaVar7.m23274g(abstractC1134i, j) != vgaVar7.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar8 = yga.f69826c;
                            if (vgaVar8.mo17420c(abstractC1134i, j) != vgaVar8.mo17420c(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar9 = yga.f69826c;
                            if (!AbstractC1139n.m6649y(vgaVar9.m23276i(abstractC1134i, j), vgaVar9.m23276i(abstractC1134i2, j))) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar10 = yga.f69826c;
                            if (!AbstractC1139n.m6649y(vgaVar10.m23276i(abstractC1134i, j), vgaVar10.m23276i(abstractC1134i2, j))) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar11 = yga.f69826c;
                            if (!AbstractC1139n.m6649y(vgaVar11.m23276i(abstractC1134i, j), vgaVar11.m23276i(abstractC1134i2, j))) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar12 = yga.f69826c;
                            if (vgaVar12.m23274g(abstractC1134i, j) != vgaVar12.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar13 = yga.f69826c;
                            if (vgaVar13.m23274g(abstractC1134i, j) != vgaVar13.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar14 = yga.f69826c;
                            if (vgaVar14.m23274g(abstractC1134i, j) != vgaVar14.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar15 = yga.f69826c;
                            if (vgaVar15.m23275h(abstractC1134i, j) != vgaVar15.m23275h(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar16 = yga.f69826c;
                            if (vgaVar16.m23274g(abstractC1134i, j) != vgaVar16.m23274g(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar17 = yga.f69826c;
                            if (vgaVar17.m23275h(abstractC1134i, j) != vgaVar17.m23275h(abstractC1134i2, j)) {
                                zM6649y = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m6592g(abstractC1134i, abstractC1134i2, i)) {
                            zM6649y = false;
                        } else {
                            vga vgaVar18 = yga.f69826c;
                            if (!AbstractC1139n.m6649y(vgaVar18.m23276i(abstractC1134i, j), vgaVar18.m23276i(abstractC1134i2, j))) {
                                zM6649y = false;
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
                        vga vgaVar19 = yga.f69826c;
                        zM6649y = AbstractC1139n.m6649y(vgaVar19.m23276i(abstractC1134i, j), vgaVar19.m23276i(abstractC1134i2, j));
                        break;
                    case 50:
                        vga vgaVar20 = yga.f69826c;
                        zM6649y = AbstractC1139n.m6649y(vgaVar20.m23276i(abstractC1134i, j), vgaVar20.m23276i(abstractC1134i2, j));
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
                        vga vgaVar21 = yga.f69826c;
                        if (vgaVar21.m23274g(abstractC1134i, j2) != vgaVar21.m23274g(abstractC1134i2, j2) || !AbstractC1139n.m6649y(vgaVar21.m23276i(abstractC1134i, j), vgaVar21.m23276i(abstractC1134i2, j))) {
                            zM6649y = false;
                        }
                        break;
                }
                if (zM6649y) {
                    i += 3;
                }
            } else {
                C1142q c1142q = (C1142q) this.f13611m;
                c1142q.getClass();
                C1141p c1141p = abstractC1134i.unknownFields;
                c1142q.getClass();
                if (c1141p.equals(abstractC1134i2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: c */
    public final void mo6588c(Object obj, C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        c1132g.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        wp5 wp5Var = this.f13612n;
        int[] iArr = this.f13599a;
        AbstractC1140o abstractC1140o = this.f13611m;
        if (writer$FieldOrder == writer$FieldOrder2) {
            ((C1142q) abstractC1140o).getClass();
            ((AbstractC1134i) obj).unknownFields.m6657e(c1132g);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int iM6584T = m6584T(length);
                int i = iArr[length];
                switch (m6562S(iM6584T)) {
                    case 0:
                        if (m6599p(obj, length)) {
                            c1132g.m6523c(i, yga.f69826c.mo17422e(obj, iM6584T & 1048575));
                        }
                        break;
                    case 1:
                        if (m6599p(obj, length)) {
                            c1132g.m6527g(i, yga.f69826c.mo17423f(obj, iM6584T & 1048575));
                        }
                        break;
                    case 2:
                        if (m6599p(obj, length)) {
                            c1132g.m6530j(i, yga.f69826c.m23275h(obj, iM6584T & 1048575));
                        }
                        break;
                    case 3:
                        if (m6599p(obj, length)) {
                            c1132g.m6537q(i, yga.f69826c.m23275h(obj, iM6584T & 1048575));
                        }
                        break;
                    case 4:
                        if (m6599p(obj, length)) {
                            c1132g.m6529i(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 5:
                        if (m6599p(obj, length)) {
                            c1132g.m6526f(i, yga.f69826c.m23275h(obj, iM6584T & 1048575));
                        }
                        break;
                    case 6:
                        if (m6599p(obj, length)) {
                            c1132g.m6525e(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 7:
                        if (m6599p(obj, length)) {
                            c1132g.m6521a(i, yga.f69826c.mo17420c(obj, iM6584T & 1048575));
                        }
                        break;
                    case 8:
                        if (m6599p(obj, length)) {
                            m6563V(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g);
                        }
                        break;
                    case 9:
                        if (m6599p(obj, length)) {
                            c1132g.m6531k(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), m6596l(length));
                        }
                        break;
                    case 10:
                        if (m6599p(obj, length)) {
                            c1132g.m6522b(i, (ByteString) yga.f69826c.m23276i(obj, iM6584T & 1048575));
                        }
                        break;
                    case 11:
                        if (m6599p(obj, length)) {
                            c1132g.m6536p(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 12:
                        if (m6599p(obj, length)) {
                            c1132g.m6524d(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 13:
                        if (m6599p(obj, length)) {
                            c1132g.m6532l(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 14:
                        if (m6599p(obj, length)) {
                            c1132g.m6533m(i, yga.f69826c.m23275h(obj, iM6584T & 1048575));
                        }
                        break;
                    case 15:
                        if (m6599p(obj, length)) {
                            c1132g.m6534n(i, yga.f69826c.m23274g(obj, iM6584T & 1048575));
                        }
                        break;
                    case 16:
                        if (m6599p(obj, length)) {
                            c1132g.m6535o(i, yga.f69826c.m23275h(obj, iM6584T & 1048575));
                        }
                        break;
                    case 17:
                        if (m6599p(obj, length)) {
                            c1132g.m6528h(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), m6596l(length));
                        }
                        break;
                    case 18:
                        AbstractC1139n.m6609C(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 19:
                        AbstractC1139n.m6613G(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 20:
                        AbstractC1139n.m6616J(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 21:
                        AbstractC1139n.m6624R(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 22:
                        AbstractC1139n.m6615I(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        AbstractC1139n.m6612F(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 24:
                        AbstractC1139n.m6611E(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 25:
                        AbstractC1139n.m6607A(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 26:
                        AbstractC1139n.m6622P(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g);
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        AbstractC1139n.m6617K(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, m6596l(length));
                        break;
                    case 28:
                        AbstractC1139n.m6608B(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g);
                        break;
                    case 29:
                        AbstractC1139n.m6623Q(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 30:
                        AbstractC1139n.m6610D(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        AbstractC1139n.m6618L(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 32:
                        AbstractC1139n.m6619M(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 33:
                        AbstractC1139n.m6620N(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case 34:
                        AbstractC1139n.m6621O(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, false);
                        break;
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        AbstractC1139n.m6609C(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        AbstractC1139n.m6613G(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        AbstractC1139n.m6616J(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 38:
                        AbstractC1139n.m6624R(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        AbstractC1139n.m6615I(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        AbstractC1139n.m6612F(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        AbstractC1139n.m6611E(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 42:
                        AbstractC1139n.m6607A(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 43:
                        AbstractC1139n.m6623Q(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        AbstractC1139n.m6610D(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        AbstractC1139n.m6618L(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 46:
                        AbstractC1139n.m6619M(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 47:
                        AbstractC1139n.m6620N(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case eda.f37086g /* 48 */:
                        AbstractC1139n.m6621O(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, true);
                        break;
                    case 49:
                        AbstractC1139n.m6614H(iArr[length], (List) yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g, m6596l(length));
                        break;
                    case 50:
                        if (yga.f69826c.m23276i(obj, iM6584T & 1048575) != null) {
                            Object objM6595k = m6595k(length);
                            wp5Var.getClass();
                            g9a.m12435l(objM6595k);
                            throw null;
                        }
                        break;
                        break;
                    case 51:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6523c(i, ((Double) yga.f69826c.m23276i(obj, iM6584T & 1048575)).doubleValue());
                        }
                        break;
                    case 52:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6527g(i, ((Float) yga.f69826c.m23276i(obj, iM6584T & 1048575)).floatValue());
                        }
                        break;
                    case 53:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6530j(i, m6560C(obj, iM6584T & 1048575));
                        }
                        break;
                    case 54:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6537q(i, m6560C(obj, iM6584T & 1048575));
                        }
                        break;
                    case 55:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6529i(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 56:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6526f(i, m6560C(obj, iM6584T & 1048575));
                        }
                        break;
                    case 57:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6525e(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 58:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6521a(i, ((Boolean) yga.f69826c.m23276i(obj, iM6584T & 1048575)).booleanValue());
                        }
                        break;
                    case 59:
                        if (m6600r(obj, i, length)) {
                            m6563V(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), c1132g);
                        }
                        break;
                    case 60:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6531k(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), m6596l(length));
                        }
                        break;
                    case 61:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6522b(i, (ByteString) yga.f69826c.m23276i(obj, iM6584T & 1048575));
                        }
                        break;
                    case 62:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6536p(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 63:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6524d(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 64:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6532l(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 65:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6533m(i, m6560C(obj, iM6584T & 1048575));
                        }
                        break;
                    case 66:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6534n(i, m6559B(obj, iM6584T & 1048575));
                        }
                        break;
                    case 67:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6535o(i, m6560C(obj, iM6584T & 1048575));
                        }
                        break;
                    case 68:
                        if (m6600r(obj, i, length)) {
                            c1132g.m6528h(i, yga.f69826c.m23276i(obj, iM6584T & 1048575), m6596l(length));
                        }
                        break;
                }
            }
            return;
        }
        if (!this.f13605g) {
            m6585U(obj, c1132g);
            return;
        }
        int length2 = iArr.length;
        for (int i2 = 0; i2 < length2; i2 += 3) {
            int iM6584T2 = m6584T(i2);
            int i3 = iArr[i2];
            switch (m6562S(iM6584T2)) {
                case 0:
                    if (m6599p(obj, i2)) {
                        c1132g.m6523c(i3, yga.f69826c.mo17422e(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 1:
                    if (m6599p(obj, i2)) {
                        c1132g.m6527g(i3, yga.f69826c.mo17423f(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 2:
                    if (m6599p(obj, i2)) {
                        c1132g.m6530j(i3, yga.f69826c.m23275h(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 3:
                    if (m6599p(obj, i2)) {
                        c1132g.m6537q(i3, yga.f69826c.m23275h(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 4:
                    if (m6599p(obj, i2)) {
                        c1132g.m6529i(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 5:
                    if (m6599p(obj, i2)) {
                        c1132g.m6526f(i3, yga.f69826c.m23275h(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 6:
                    if (m6599p(obj, i2)) {
                        c1132g.m6525e(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 7:
                    if (m6599p(obj, i2)) {
                        c1132g.m6521a(i3, yga.f69826c.mo17420c(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 8:
                    if (m6599p(obj, i2)) {
                        m6563V(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g);
                    }
                    break;
                case 9:
                    if (m6599p(obj, i2)) {
                        c1132g.m6531k(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), m6596l(i2));
                    }
                    break;
                case 10:
                    if (m6599p(obj, i2)) {
                        c1132g.m6522b(i3, (ByteString) yga.f69826c.m23276i(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 11:
                    if (m6599p(obj, i2)) {
                        c1132g.m6536p(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 12:
                    if (m6599p(obj, i2)) {
                        c1132g.m6524d(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 13:
                    if (m6599p(obj, i2)) {
                        c1132g.m6532l(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 14:
                    if (m6599p(obj, i2)) {
                        c1132g.m6533m(i3, yga.f69826c.m23275h(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 15:
                    if (m6599p(obj, i2)) {
                        c1132g.m6534n(i3, yga.f69826c.m23274g(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 16:
                    if (m6599p(obj, i2)) {
                        c1132g.m6535o(i3, yga.f69826c.m23275h(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 17:
                    if (m6599p(obj, i2)) {
                        c1132g.m6528h(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), m6596l(i2));
                    }
                    break;
                case 18:
                    AbstractC1139n.m6609C(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 19:
                    AbstractC1139n.m6613G(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 20:
                    AbstractC1139n.m6616J(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 21:
                    AbstractC1139n.m6624R(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 22:
                    AbstractC1139n.m6615I(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC1139n.m6612F(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 24:
                    AbstractC1139n.m6611E(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 25:
                    AbstractC1139n.m6607A(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 26:
                    AbstractC1139n.m6622P(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC1139n.m6617K(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, m6596l(i2));
                    break;
                case 28:
                    AbstractC1139n.m6608B(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g);
                    break;
                case 29:
                    AbstractC1139n.m6623Q(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 30:
                    AbstractC1139n.m6610D(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC1139n.m6618L(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 32:
                    AbstractC1139n.m6619M(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 33:
                    AbstractC1139n.m6620N(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case 34:
                    AbstractC1139n.m6621O(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, false);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC1139n.m6609C(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC1139n.m6613G(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC1139n.m6616J(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 38:
                    AbstractC1139n.m6624R(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC1139n.m6615I(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC1139n.m6612F(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC1139n.m6611E(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 42:
                    AbstractC1139n.m6607A(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 43:
                    AbstractC1139n.m6623Q(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC1139n.m6610D(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC1139n.m6618L(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 46:
                    AbstractC1139n.m6619M(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 47:
                    AbstractC1139n.m6620N(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC1139n.m6621O(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, true);
                    break;
                case 49:
                    AbstractC1139n.m6614H(iArr[i2], (List) yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g, m6596l(i2));
                    break;
                case 50:
                    if (yga.f69826c.m23276i(obj, iM6584T2 & 1048575) != null) {
                        Object objM6595k2 = m6595k(i2);
                        wp5Var.getClass();
                        g9a.m12435l(objM6595k2);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6523c(i3, ((Double) yga.f69826c.m23276i(obj, iM6584T2 & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6527g(i3, ((Float) yga.f69826c.m23276i(obj, iM6584T2 & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6530j(i3, m6560C(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 54:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6537q(i3, m6560C(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 55:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6529i(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 56:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6526f(i3, m6560C(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 57:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6525e(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 58:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6521a(i3, ((Boolean) yga.f69826c.m23276i(obj, iM6584T2 & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (m6600r(obj, i3, i2)) {
                        m6563V(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), c1132g);
                    }
                    break;
                case 60:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6531k(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), m6596l(i2));
                    }
                    break;
                case 61:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6522b(i3, (ByteString) yga.f69826c.m23276i(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 62:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6536p(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 63:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6524d(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 64:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6532l(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 65:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6533m(i3, m6560C(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 66:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6534n(i3, m6559B(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 67:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6535o(i3, m6560C(obj, iM6584T2 & 1048575));
                    }
                    break;
                case 68:
                    if (m6600r(obj, i3, i2)) {
                        c1132g.m6528h(i3, yga.f69826c.m23276i(obj, iM6584T2 & 1048575), m6596l(i2));
                    }
                    break;
            }
        }
        ((C1142q) abstractC1140o).getClass();
        ((AbstractC1134i) obj).unknownFields.m6657e(c1132g);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.wm8
    /* JADX INFO: renamed from: d */
    public final int mo6589d(AbstractC1134i abstractC1134i) {
        int i;
        int iM17873b;
        int i2;
        int[] iArr = this.f13599a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM6584T = m6584T(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM6584T;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m6562S(iM6584T)) {
                case 0:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(Double.doubleToLongBits(yga.f69826c.mo17422e(abstractC1134i, j)));
                    i3 = iM17873b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM17873b = Float.floatToIntBits(yga.f69826c.mo17423f(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(yga.f69826c.m23275h(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(yga.f69826c.m23275h(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(yga.f69826c.m23275h(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo17420c = yga.f69826c.mo17420c(abstractC1134i, j);
                    Charset charset = o94.f54077a;
                    if (zMo17420c) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM17873b = ((String) yga.f69826c.m23276i(abstractC1134i, j)).hashCode();
                    i3 = iM17873b + i;
                    break;
                case 9:
                    Object objM23276i = yga.f69826c.m23276i(abstractC1134i, j);
                    if (objM23276i != null) {
                        iHashCode = objM23276i.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                    i3 = iM17873b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(yga.f69826c.m23275h(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23274g(abstractC1134i, j);
                    i3 = iM17873b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM17873b = o94.m17873b(yga.f69826c.m23275h(abstractC1134i, j));
                    i3 = iM17873b + i;
                    break;
                case 17:
                    Object objM23276i2 = yga.f69826c.m23276i(abstractC1134i, j);
                    if (objM23276i2 != null) {
                        iHashCode = objM23276i2.hashCode();
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
                    iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                    i3 = iM17873b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                    i3 = iM17873b + i;
                    break;
                case 51:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(Double.doubleToLongBits(((Double) yga.f69826c.m23276i(abstractC1134i, j)).doubleValue()));
                        i3 = iM17873b + i;
                    }
                    break;
                case 52:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = Float.floatToIntBits(((Float) yga.f69826c.m23276i(abstractC1134i, j)).floatValue());
                        i3 = iM17873b + i;
                    }
                    break;
                case 53:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(m6560C(abstractC1134i, j));
                        i3 = iM17873b + i;
                    }
                    break;
                case 54:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(m6560C(abstractC1134i, j));
                        i3 = iM17873b + i;
                    }
                    break;
                case 55:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 56:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(m6560C(abstractC1134i, j));
                        i3 = iM17873b + i;
                    }
                    break;
                case 57:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 58:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) yga.f69826c.m23276i(abstractC1134i, j)).booleanValue();
                        Charset charset2 = o94.f54077a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = ((String) yga.f69826c.m23276i(abstractC1134i, j)).hashCode();
                        i3 = iM17873b + i;
                    }
                    break;
                case 60:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                        i3 = iM17873b + i;
                    }
                    break;
                case 61:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                        i3 = iM17873b + i;
                    }
                    break;
                case 62:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 63:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 64:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 65:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(m6560C(abstractC1134i, j));
                        i3 = iM17873b + i;
                    }
                    break;
                case 66:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = m6559B(abstractC1134i, j);
                        i3 = iM17873b + i;
                    }
                    break;
                case 67:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = o94.m17873b(m6560C(abstractC1134i, j));
                        i3 = iM17873b + i;
                    }
                    break;
                case 68:
                    if (m6600r(abstractC1134i, i5, i4)) {
                        i = i3 * 53;
                        iM17873b = yga.f69826c.m23276i(abstractC1134i, j).hashCode();
                        i3 = iM17873b + i;
                    }
                    break;
            }
        }
        ((C1142q) this.f13611m).getClass();
        return abstractC1134i.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: e */
    public final int mo6590e(AbstractC1134i abstractC1134i) {
        return this.f13605g ? m6598o(abstractC1134i) : m6597n(abstractC1134i);
    }

    @Override // p000.wm8
    /* JADX INFO: renamed from: f */
    public final void mo6591f(Object obj, byte[] bArr, int i, int i2, C3846zu c3846zu) throws InvalidProtocolBufferException {
        if (this.f13605g) {
            m6573G(obj, bArr, i, i2, c3846zu);
        } else {
            m6572F(obj, bArr, i, i2, 0, c3846zu);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6592g(AbstractC1134i abstractC1134i, AbstractC1134i abstractC1134i2, int i) {
        return m6599p(abstractC1134i, i) == m6599p(abstractC1134i2, i);
    }

    /* JADX INFO: renamed from: i */
    public final void m6593i(int i, Object obj, Object obj2) {
        int i2 = this.f13599a[i];
        Object objM23276i = yga.f69826c.m23276i(obj, m6584T(i) & 1048575);
        if (objM23276i == null || m6594j(i) == null) {
            return;
        }
        this.f13612n.getClass();
        g9a.m12435l(m6595k(i));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef A[SYNTHETIC] */
    @Override // p000.wm8
    public final boolean isInitialized(Object obj) {
        int iM6562S;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean zM6599p = true;
            if (i2 >= this.f13607i) {
                return true;
            }
            int i4 = this.f13606h[i2];
            int[] iArr = this.f13599a;
            int i5 = iArr[i4];
            int iM6584T = m6584T(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = f13598p.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & iM6584T) == 0) {
                iM6562S = m6562S(iM6584T);
                if (iM6562S != 9 || iM6562S == 17) {
                    if (i == 1048575) {
                        zM6599p = m6599p(obj, i4);
                    } else if ((i8 & i3) == 0) {
                        zM6599p = false;
                    }
                    if (zM6599p) {
                        continue;
                    } else if (!m6596l(i4).isInitialized(yga.f69826c.m23276i(obj, iM6584T & 1048575))) {
                    }
                    i2++;
                } else {
                    if (iM6562S != 27) {
                        if (iM6562S == 60 || iM6562S == 68) {
                            if (!m6600r(obj, i5, i4)) {
                                continue;
                            } else if (!m6596l(i4).isInitialized(yga.f69826c.m23276i(obj, iM6584T & 1048575))) {
                            }
                        } else if (iM6562S != 49) {
                            if (iM6562S != 50) {
                                continue;
                            } else {
                                Object objM23276i = yga.f69826c.m23276i(obj, iM6584T & 1048575);
                                this.f13612n.getClass();
                                if (!((MapFieldLite) objM23276i).isEmpty()) {
                                    g9a.m12435l(m6595k(i4));
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    }
                    List list = (List) yga.f69826c.m23276i(obj, iM6584T & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        wm8 wm8VarM6596l = m6596l(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (wm8VarM6596l.isInitialized(list.get(i9))) {
                            }
                        }
                    }
                    i2++;
                }
            } else {
                if (i == 1048575 ? m6599p(obj, i4) : (i3 & i8) != 0) {
                    iM6562S = m6562S(iM6584T);
                    if (iM6562S != 9) {
                    }
                    if (i == 1048575) {
                        zM6599p = m6599p(obj, i4);
                    } else if ((i8 & i3) == 0) {
                        zM6599p = false;
                    }
                    if (zM6599p) {
                        continue;
                    } else if (!m6596l(i4).isInitialized(yga.f69826c.m23276i(obj, iM6584T & 1048575))) {
                    }
                    i2++;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final f94 m6594j(int i) {
        return (f94) this.f13600b[wq1.m24103C(i, 3, 2, 1)];
    }

    /* JADX INFO: renamed from: k */
    public final Object m6595k(int i) {
        return this.f13600b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: l */
    public final wm8 m6596l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f13600b;
        wm8 wm8Var = (wm8) objArr[i2];
        if (wm8Var != null) {
            return wm8Var;
        }
        wm8 wm8VarM11280a = eo7.f37616c.m11280a((Class) objArr[i2 + 1]);
        objArr[i2] = wm8VarM11280a;
        return wm8VarM11280a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[SYNTHETIC] */
    @Override // p000.wm8
    public final void makeImmutable(Object obj) {
        if (m6566q(obj)) {
            if (obj instanceof AbstractC1134i) {
                AbstractC1134i abstractC1134i = (AbstractC1134i) obj;
                abstractC1134i.m6551t(Integer.MAX_VALUE);
                abstractC1134i.memoizedHashCode = 0;
                abstractC1134i.m6548n();
            }
            int length = this.f13599a.length;
            for (int i = 0; i < length; i += 3) {
                int iM6584T = m6584T(i);
                long j = 1048575 & iM6584T;
                int iM6562S = m6562S(iM6584T);
                if (iM6562S != 9) {
                    switch (iM6562S) {
                        case 17:
                            if (m6599p(obj, i)) {
                                m6596l(i).makeImmutable(f13598p.getObject(obj, j));
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
                            this.f13610l.mo340a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f13598p;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.f13612n.getClass();
                                ((MapFieldLite) object).m6426e();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (m6599p(obj, i)) {
                    m6596l(i).makeImmutable(f13598p.getObject(obj, j));
                }
            }
            ((C1142q) this.f13611m).getClass();
            ((AbstractC1134i) obj).unknownFields.f13625e = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.wm8
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        m6564h(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f13599a;
            if (i >= iArr.length) {
                AbstractC1139n.m6648x(this.f13611m, obj, obj2);
                return;
            }
            int iM6584T = m6584T(i);
            long j = 1048575 & iM6584T;
            int i2 = iArr[i];
            switch (m6562S(iM6584T)) {
                case 0:
                    if (!m6599p(obj2, i)) {
                        obj3 = obj;
                    } else {
                        vga vgaVar = yga.f69826c;
                        obj3 = obj;
                        vgaVar.mo17426m(obj3, j, vgaVar.mo17422e(obj2, j));
                        m6579N(obj3, i);
                    }
                    break;
                case 1:
                    if (m6599p(obj2, i)) {
                        vga vgaVar2 = yga.f69826c;
                        vgaVar2.mo17427n(obj, j, vgaVar2.mo17423f(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m6599p(obj2, i)) {
                        yga.m25139o(obj, j, yga.f69826c.m23275h(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m6599p(obj2, i)) {
                        yga.m25139o(obj, j, yga.f69826c.m23275h(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m6599p(obj2, i)) {
                        yga.m25139o(obj, j, yga.f69826c.m23275h(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m6599p(obj2, i)) {
                        vga vgaVar3 = yga.f69826c;
                        vgaVar3.mo17424k(obj, j, vgaVar3.mo17420c(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m6599p(obj2, i)) {
                        yga.m25140p(obj, j, yga.f69826c.m23276i(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m6602u(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 10:
                    if (m6599p(obj2, i)) {
                        yga.m25140p(obj, j, yga.f69826c.m23276i(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m6599p(obj2, i)) {
                        yga.m25139o(obj, j, yga.f69826c.m23275h(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m6599p(obj2, i)) {
                        yga.m25138n(obj, j, yga.f69826c.m23274g(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m6599p(obj2, i)) {
                        yga.m25139o(obj, j, yga.f69826c.m23275h(obj2, j));
                        m6579N(obj, i);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m6602u(obj, obj2, i);
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
                    this.f13610l.mo341b(obj, obj2, j);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC1139n.f13616a;
                    vga vgaVar4 = yga.f69826c;
                    Object objM23276i = vgaVar4.m23276i(obj, j);
                    Object objM23276i2 = vgaVar4.m23276i(obj2, j);
                    this.f13612n.getClass();
                    yga.m25140p(obj, j, wp5.m24099b(objM23276i, objM23276i2));
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
                    if (m6600r(obj2, i2, i)) {
                        yga.m25140p(obj, j, yga.f69826c.m23276i(obj2, j));
                        m6580O(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m6603v(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m6600r(obj2, i2, i)) {
                        yga.m25140p(obj, j, yga.f69826c.m23276i(obj2, j));
                        m6580O(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m6603v(obj, obj2, i);
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
    public final int m6597n(AbstractC1134i abstractC1134i) {
        int i;
        int iM6507h;
        int iM6509j;
        int iM6507h2;
        int iM6505f;
        int iM6503d;
        int iM6507h3;
        int iM6506g;
        int iM22978a;
        int iM6504e;
        Unsafe unsafe = f13598p;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iM24102B = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f13599a;
            if (i4 >= iArr.length) {
                ((C1142q) this.f13611m).getClass();
                return abstractC1134i.unknownFields.m6655b() + iM24102B;
            }
            int iM6584T = m6584T(i4);
            int i6 = iArr[i4];
            int iM6562S = m6562S(iM6584T);
            if (iM6562S <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i5 = unsafe.getInt(abstractC1134i, i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            long j = iM6584T & i2;
            switch (iM6562S) {
                case 0:
                    if ((i5 & i) != 0) {
                        iM24102B = wq1.m24102B(i6, 8, iM24102B);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iM24102B = wq1.m24102B(i6, 4, iM24102B);
                    }
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j(j2);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        long j3 = unsafe.getLong(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j(j3);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        int i9 = unsafe.getInt(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6505f(i9);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iM6503d = C1131f.m6503d(i6);
                        iM24102B += iM6503d;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iM6503d = C1131f.m6502c(i6);
                        iM24102B += iM6503d;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iM24102B = wq1.m24102B(i6, 1, iM24102B);
                    }
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        Object object = unsafe.getObject(abstractC1134i, j);
                        if (object instanceof ByteString) {
                            int iM6507h4 = C1131f.m6507h(i6);
                            int size = ((ByteString) object).size();
                            iM22978a = ux5.m22978a(size, size, iM6507h4, iM24102B);
                        } else {
                            iM6507h3 = C1131f.m6507h(i6);
                            iM6506g = C1131f.m6506g((String) object);
                            iM22978a = iM6506g + iM6507h3 + iM24102B;
                        }
                        iM24102B = iM22978a;
                    }
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        Object object2 = unsafe.getObject(abstractC1134i, j);
                        wm8 wm8VarM6596l = m6596l(i4);
                        Class cls = AbstractC1139n.f13616a;
                        int iM6507h5 = C1131f.m6507h(i6);
                        int iMo6429a = ((AbstractC1126a) object2).mo6429a(wm8VarM6596l);
                        iM24102B = ux5.m22978a(iMo6429a, iMo6429a, iM6507h5, iM24102B);
                    }
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        iM6503d = C1131f.m6500a(i6, (ByteString) unsafe.getObject(abstractC1134i, j));
                        iM24102B += iM6503d;
                    }
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        int i10 = unsafe.getInt(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6508i(i10);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        int i11 = unsafe.getInt(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6505f(i11);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iM24102B = wq1.m24102B(i6, 4, iM24102B);
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iM24102B = wq1.m24102B(i6, 8, iM24102B);
                    }
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        int i12 = unsafe.getInt(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6508i((i12 >> 31) ^ (i12 << 1));
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j4 = unsafe.getLong(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j((j4 >> 63) ^ (j4 << 1));
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        iM6503d = C1131f.m6504e(i6, (AbstractC1126a) unsafe.getObject(abstractC1134i, j), m6596l(i4));
                        iM24102B += iM6503d;
                    }
                    break;
                case 18:
                    iM6503d = AbstractC1139n.m6630f(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 19:
                    iM6503d = AbstractC1139n.m6628d(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 20:
                    iM6503d = AbstractC1139n.m6634j(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 21:
                    iM6503d = AbstractC1139n.m6644t(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 22:
                    iM6503d = AbstractC1139n.m6632h(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM6503d = AbstractC1139n.m6630f(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 24:
                    iM6503d = AbstractC1139n.m6628d(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC1134i, j);
                    Class cls2 = AbstractC1139n.f13616a;
                    int size2 = list.size();
                    iM24102B += size2 == 0 ? 0 : (C1131f.m6507h(i6) + 1) * size2;
                    break;
                case 26:
                    iM6503d = AbstractC1139n.m6641q(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iM6503d = AbstractC1139n.m6636l(i6, (List) unsafe.getObject(abstractC1134i, j), m6596l(i4));
                    iM24102B += iM6503d;
                    break;
                case 28:
                    iM6503d = AbstractC1139n.m6625a(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 29:
                    iM6503d = AbstractC1139n.m6642r(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 30:
                    iM6503d = AbstractC1139n.m6626b(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM6503d = AbstractC1139n.m6628d(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 32:
                    iM6503d = AbstractC1139n.m6630f(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 33:
                    iM6503d = AbstractC1139n.m6637m(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 34:
                    iM6503d = AbstractC1139n.m6639o(i6, (List) unsafe.getObject(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int iM6631g = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g > 0) {
                        iM24102B = ux5.m22978a(iM6631g, C1131f.m6507h(i6), iM6631g, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int iM6629e = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e > 0) {
                        iM24102B = ux5.m22978a(iM6629e, C1131f.m6507h(i6), iM6629e, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int iM6635k = AbstractC1139n.m6635k((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6635k > 0) {
                        iM24102B = ux5.m22978a(iM6635k, C1131f.m6507h(i6), iM6635k, iM24102B);
                    }
                    break;
                case 38:
                    int iM6645u = AbstractC1139n.m6645u((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6645u > 0) {
                        iM24102B = ux5.m22978a(iM6645u, C1131f.m6507h(i6), iM6645u, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iM6633i = AbstractC1139n.m6633i((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6633i > 0) {
                        iM24102B = ux5.m22978a(iM6633i, C1131f.m6507h(i6), iM6633i, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int iM6631g2 = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g2 > 0) {
                        iM24102B = ux5.m22978a(iM6631g2, C1131f.m6507h(i6), iM6631g2, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int iM6629e2 = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e2 > 0) {
                        iM24102B = ux5.m22978a(iM6629e2, C1131f.m6507h(i6), iM6629e2, iM24102B);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC1134i, j);
                    Class cls3 = AbstractC1139n.f13616a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iM24102B = ux5.m22978a(size3, C1131f.m6507h(i6), size3, iM24102B);
                    }
                    break;
                case 43:
                    int iM6643s = AbstractC1139n.m6643s((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6643s > 0) {
                        iM24102B = ux5.m22978a(iM6643s, C1131f.m6507h(i6), iM6643s, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iM6627c = AbstractC1139n.m6627c((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6627c > 0) {
                        iM24102B = ux5.m22978a(iM6627c, C1131f.m6507h(i6), iM6627c, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int iM6629e3 = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e3 > 0) {
                        iM24102B = ux5.m22978a(iM6629e3, C1131f.m6507h(i6), iM6629e3, iM24102B);
                    }
                    break;
                case 46:
                    int iM6631g3 = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g3 > 0) {
                        iM24102B = ux5.m22978a(iM6631g3, C1131f.m6507h(i6), iM6631g3, iM24102B);
                    }
                    break;
                case 47:
                    int iM6638n = AbstractC1139n.m6638n((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6638n > 0) {
                        iM24102B = ux5.m22978a(iM6638n, C1131f.m6507h(i6), iM6638n, iM24102B);
                    }
                    break;
                case eda.f37086g /* 48 */:
                    int iM6640p = AbstractC1139n.m6640p((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6640p > 0) {
                        iM24102B = ux5.m22978a(iM6640p, C1131f.m6507h(i6), iM6640p, iM24102B);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC1134i, j);
                    wm8 wm8VarM6596l2 = m6596l(i4);
                    Class cls4 = AbstractC1139n.f13616a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iM6504e = 0;
                    } else {
                        iM6504e = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            iM6504e += C1131f.m6504e(i6, (AbstractC1126a) list3.get(i13), wm8VarM6596l2);
                        }
                    }
                    iM24102B += iM6504e;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1134i, j);
                    Object objM6595k = m6595k(i4);
                    this.f13612n.getClass();
                    wp5.m24098a(object3, objM6595k);
                    break;
                case 51:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM24102B = wq1.m24102B(i6, 8, iM24102B);
                    }
                    break;
                case 52:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM24102B = wq1.m24102B(i6, 4, iM24102B);
                    }
                    break;
                case 53:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        long jM6560C = m6560C(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j(jM6560C);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 54:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        long jM6560C2 = m6560C(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j(jM6560C2);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 55:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        int iM6559B = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6505f(iM6559B);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 56:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM6503d = C1131f.m6503d(i6);
                        iM24102B += iM6503d;
                    }
                    break;
                case 57:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM6503d = C1131f.m6502c(i6);
                        iM24102B += iM6503d;
                    }
                    break;
                case 58:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM24102B = wq1.m24102B(i6, 1, iM24102B);
                    }
                    break;
                case 59:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        Object object4 = unsafe.getObject(abstractC1134i, j);
                        if (object4 instanceof ByteString) {
                            int iM6507h6 = C1131f.m6507h(i6);
                            int size5 = ((ByteString) object4).size();
                            iM22978a = ux5.m22978a(size5, size5, iM6507h6, iM24102B);
                        } else {
                            iM6507h3 = C1131f.m6507h(i6);
                            iM6506g = C1131f.m6506g((String) object4);
                            iM22978a = iM6506g + iM6507h3 + iM24102B;
                        }
                        iM24102B = iM22978a;
                    }
                    break;
                case 60:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        Object object5 = unsafe.getObject(abstractC1134i, j);
                        wm8 wm8VarM6596l3 = m6596l(i4);
                        Class cls5 = AbstractC1139n.f13616a;
                        int iM6507h7 = C1131f.m6507h(i6);
                        int iMo6429a2 = ((AbstractC1126a) object5).mo6429a(wm8VarM6596l3);
                        iM24102B = ux5.m22978a(iMo6429a2, iMo6429a2, iM6507h7, iM24102B);
                    }
                    break;
                case 61:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM6503d = C1131f.m6500a(i6, (ByteString) unsafe.getObject(abstractC1134i, j));
                        iM24102B += iM6503d;
                    }
                    break;
                case 62:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        int iM6559B2 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6508i(iM6559B2);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 63:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        int iM6559B3 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6505f(iM6559B3);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 64:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM24102B = wq1.m24102B(i6, 4, iM24102B);
                    }
                    break;
                case 65:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM24102B = wq1.m24102B(i6, 8, iM24102B);
                    }
                    break;
                case 66:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        int iM6559B4 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i6);
                        iM6505f = C1131f.m6508i((iM6559B4 >> 31) ^ (iM6559B4 << 1));
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 67:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        long jM6560C3 = m6560C(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i6);
                        iM6509j = C1131f.m6509j((jM6560C3 >> 63) ^ (jM6560C3 << 1));
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 68:
                    if (m6600r(abstractC1134i, i6, i4)) {
                        iM6503d = C1131f.m6504e(i6, (AbstractC1126a) unsafe.getObject(abstractC1134i, j), m6596l(i4));
                        iM24102B += iM6503d;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    @Override // p000.wm8
    public final Object newInstance() {
        this.f13609k.getClass();
        return ((AbstractC1134i) this.f13603e).m6550p();
    }

    /* JADX INFO: renamed from: o */
    public final int m6598o(AbstractC1134i abstractC1134i) {
        int iM6507h;
        int iM6509j;
        int iM6507h2;
        int iM6505f;
        int iM6503d;
        int iM6507h3;
        int iM6506g;
        int iM6507h4;
        int iM6509j2;
        int iM6504e;
        Unsafe unsafe = f13598p;
        int i = 0;
        int iM24102B = 0;
        while (true) {
            int[] iArr = this.f13599a;
            if (i >= iArr.length) {
                ((C1142q) this.f13611m).getClass();
                return abstractC1134i.unknownFields.m6655b() + iM24102B;
            }
            int iM6584T = m6584T(i);
            int iM6562S = m6562S(iM6584T);
            int i2 = iArr[i];
            long j = iM6584T & 1048575;
            if (iM6562S >= FieldType.DOUBLE_LIST_PACKED.m6414id() && iM6562S <= FieldType.SINT64_LIST_PACKED.m6414id()) {
                int i3 = iArr[i + 2];
            }
            switch (iM6562S) {
                case 0:
                    if (m6599p(abstractC1134i, i)) {
                        iM24102B = wq1.m24102B(i2, 8, iM24102B);
                    }
                    break;
                case 1:
                    if (m6599p(abstractC1134i, i)) {
                        iM24102B = wq1.m24102B(i2, 4, iM24102B);
                    }
                    break;
                case 2:
                    if (m6599p(abstractC1134i, i)) {
                        long jM23275h = yga.f69826c.m23275h(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i2);
                        iM6509j = C1131f.m6509j(jM23275h);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 3:
                    if (m6599p(abstractC1134i, i)) {
                        long jM23275h2 = yga.f69826c.m23275h(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i2);
                        iM6509j = C1131f.m6509j(jM23275h2);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 4:
                    if (m6599p(abstractC1134i, i)) {
                        int iM23274g = yga.f69826c.m23274g(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6505f(iM23274g);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 5:
                    if (m6599p(abstractC1134i, i)) {
                        iM6503d = C1131f.m6503d(i2);
                        iM24102B += iM6503d;
                    }
                    break;
                case 6:
                    if (m6599p(abstractC1134i, i)) {
                        iM6503d = C1131f.m6502c(i2);
                        iM24102B += iM6503d;
                    }
                    break;
                case 7:
                    if (m6599p(abstractC1134i, i)) {
                        iM24102B = wq1.m24102B(i2, 1, iM24102B);
                    }
                    break;
                case 8:
                    if (m6599p(abstractC1134i, i)) {
                        Object objM23276i = yga.f69826c.m23276i(abstractC1134i, j);
                        if (objM23276i instanceof ByteString) {
                            int iM6507h5 = C1131f.m6507h(i2);
                            int size = ((ByteString) objM23276i).size();
                            iM24102B = ux5.m22978a(size, size, iM6507h5, iM24102B);
                        } else {
                            iM6507h3 = C1131f.m6507h(i2);
                            iM6506g = C1131f.m6506g((String) objM23276i);
                            iM24102B = iM6506g + iM6507h3 + iM24102B;
                        }
                    }
                    break;
                case 9:
                    if (m6599p(abstractC1134i, i)) {
                        Object objM23276i2 = yga.f69826c.m23276i(abstractC1134i, j);
                        wm8 wm8VarM6596l = m6596l(i);
                        Class cls = AbstractC1139n.f13616a;
                        int iM6507h6 = C1131f.m6507h(i2);
                        int iMo6429a = ((AbstractC1126a) objM23276i2).mo6429a(wm8VarM6596l);
                        iM24102B = ux5.m22978a(iMo6429a, iMo6429a, iM6507h6, iM24102B);
                    }
                    break;
                case 10:
                    if (m6599p(abstractC1134i, i)) {
                        iM6503d = C1131f.m6500a(i2, (ByteString) yga.f69826c.m23276i(abstractC1134i, j));
                        iM24102B += iM6503d;
                    }
                    break;
                case 11:
                    if (m6599p(abstractC1134i, i)) {
                        int iM23274g2 = yga.f69826c.m23274g(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6508i(iM23274g2);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 12:
                    if (m6599p(abstractC1134i, i)) {
                        int iM23274g3 = yga.f69826c.m23274g(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6505f(iM23274g3);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 13:
                    if (m6599p(abstractC1134i, i)) {
                        iM24102B = wq1.m24102B(i2, 4, iM24102B);
                    }
                    break;
                case 14:
                    if (m6599p(abstractC1134i, i)) {
                        iM24102B = wq1.m24102B(i2, 8, iM24102B);
                    }
                    break;
                case 15:
                    if (m6599p(abstractC1134i, i)) {
                        int iM23274g4 = yga.f69826c.m23274g(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6508i((iM23274g4 >> 31) ^ (iM23274g4 << 1));
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 16:
                    if (m6599p(abstractC1134i, i)) {
                        long jM23275h3 = yga.f69826c.m23275h(abstractC1134i, j);
                        iM6507h4 = C1131f.m6507h(i2);
                        iM6509j2 = C1131f.m6509j((jM23275h3 >> 63) ^ (jM23275h3 << 1));
                        iM6503d = iM6509j2 + iM6507h4;
                        iM24102B += iM6503d;
                    }
                    break;
                case 17:
                    if (m6599p(abstractC1134i, i)) {
                        iM6503d = C1131f.m6504e(i2, (AbstractC1126a) yga.f69826c.m23276i(abstractC1134i, j), m6596l(i));
                        iM24102B += iM6503d;
                    }
                    break;
                case 18:
                    iM6503d = AbstractC1139n.m6630f(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 19:
                    iM6503d = AbstractC1139n.m6628d(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 20:
                    iM6503d = AbstractC1139n.m6634j(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 21:
                    iM6503d = AbstractC1139n.m6644t(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 22:
                    iM6503d = AbstractC1139n.m6632h(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM6503d = AbstractC1139n.m6630f(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 24:
                    iM6503d = AbstractC1139n.m6628d(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 25:
                    List listM6567s = m6567s(abstractC1134i, j);
                    Class cls2 = AbstractC1139n.f13616a;
                    int size2 = listM6567s.size();
                    iM24102B += size2 == 0 ? 0 : (C1131f.m6507h(i2) + 1) * size2;
                    break;
                case 26:
                    iM6503d = AbstractC1139n.m6641q(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iM6503d = AbstractC1139n.m6636l(i2, m6567s(abstractC1134i, j), m6596l(i));
                    iM24102B += iM6503d;
                    break;
                case 28:
                    iM6503d = AbstractC1139n.m6625a(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 29:
                    iM6503d = AbstractC1139n.m6642r(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 30:
                    iM6503d = AbstractC1139n.m6626b(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM6503d = AbstractC1139n.m6628d(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 32:
                    iM6503d = AbstractC1139n.m6630f(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 33:
                    iM6503d = AbstractC1139n.m6637m(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case 34:
                    iM6503d = AbstractC1139n.m6639o(i2, m6567s(abstractC1134i, j));
                    iM24102B += iM6503d;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int iM6631g = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g > 0) {
                        iM24102B = ux5.m22978a(iM6631g, C1131f.m6507h(i2), iM6631g, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int iM6629e = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e > 0) {
                        iM24102B = ux5.m22978a(iM6629e, C1131f.m6507h(i2), iM6629e, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int iM6635k = AbstractC1139n.m6635k((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6635k > 0) {
                        iM24102B = ux5.m22978a(iM6635k, C1131f.m6507h(i2), iM6635k, iM24102B);
                    }
                    break;
                case 38:
                    int iM6645u = AbstractC1139n.m6645u((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6645u > 0) {
                        iM24102B = ux5.m22978a(iM6645u, C1131f.m6507h(i2), iM6645u, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iM6633i = AbstractC1139n.m6633i((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6633i > 0) {
                        iM24102B = ux5.m22978a(iM6633i, C1131f.m6507h(i2), iM6633i, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int iM6631g2 = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g2 > 0) {
                        iM24102B = ux5.m22978a(iM6631g2, C1131f.m6507h(i2), iM6631g2, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int iM6629e2 = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e2 > 0) {
                        iM24102B = ux5.m22978a(iM6629e2, C1131f.m6507h(i2), iM6629e2, iM24102B);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(abstractC1134i, j);
                    Class cls3 = AbstractC1139n.f13616a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iM24102B = ux5.m22978a(size3, C1131f.m6507h(i2), size3, iM24102B);
                    }
                    break;
                case 43:
                    int iM6643s = AbstractC1139n.m6643s((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6643s > 0) {
                        iM24102B = ux5.m22978a(iM6643s, C1131f.m6507h(i2), iM6643s, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iM6627c = AbstractC1139n.m6627c((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6627c > 0) {
                        iM24102B = ux5.m22978a(iM6627c, C1131f.m6507h(i2), iM6627c, iM24102B);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int iM6629e3 = AbstractC1139n.m6629e((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6629e3 > 0) {
                        iM24102B = ux5.m22978a(iM6629e3, C1131f.m6507h(i2), iM6629e3, iM24102B);
                    }
                    break;
                case 46:
                    int iM6631g3 = AbstractC1139n.m6631g((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6631g3 > 0) {
                        iM24102B = ux5.m22978a(iM6631g3, C1131f.m6507h(i2), iM6631g3, iM24102B);
                    }
                    break;
                case 47:
                    int iM6638n = AbstractC1139n.m6638n((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6638n > 0) {
                        iM24102B = ux5.m22978a(iM6638n, C1131f.m6507h(i2), iM6638n, iM24102B);
                    }
                    break;
                case eda.f37086g /* 48 */:
                    int iM6640p = AbstractC1139n.m6640p((List) unsafe.getObject(abstractC1134i, j));
                    if (iM6640p > 0) {
                        iM24102B = ux5.m22978a(iM6640p, C1131f.m6507h(i2), iM6640p, iM24102B);
                    }
                    break;
                case 49:
                    List listM6567s2 = m6567s(abstractC1134i, j);
                    wm8 wm8VarM6596l2 = m6596l(i);
                    Class cls4 = AbstractC1139n.f13616a;
                    int size4 = listM6567s2.size();
                    if (size4 == 0) {
                        iM6504e = 0;
                    } else {
                        iM6504e = 0;
                        for (int i4 = 0; i4 < size4; i4++) {
                            iM6504e += C1131f.m6504e(i2, (AbstractC1126a) listM6567s2.get(i4), wm8VarM6596l2);
                        }
                    }
                    iM24102B += iM6504e;
                    break;
                case 50:
                    Object objM23276i3 = yga.f69826c.m23276i(abstractC1134i, j);
                    Object objM6595k = m6595k(i);
                    this.f13612n.getClass();
                    wp5.m24098a(objM23276i3, objM6595k);
                    break;
                case 51:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM24102B = wq1.m24102B(i2, 8, iM24102B);
                    }
                    break;
                case 52:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM24102B = wq1.m24102B(i2, 4, iM24102B);
                    }
                    break;
                case 53:
                    if (m6600r(abstractC1134i, i2, i)) {
                        long jM6560C = m6560C(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i2);
                        iM6509j = C1131f.m6509j(jM6560C);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 54:
                    if (m6600r(abstractC1134i, i2, i)) {
                        long jM6560C2 = m6560C(abstractC1134i, j);
                        iM6507h = C1131f.m6507h(i2);
                        iM6509j = C1131f.m6509j(jM6560C2);
                        iM6503d = iM6509j + iM6507h;
                        iM24102B += iM6503d;
                    }
                    break;
                case 55:
                    if (m6600r(abstractC1134i, i2, i)) {
                        int iM6559B = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6505f(iM6559B);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 56:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM6503d = C1131f.m6503d(i2);
                        iM24102B += iM6503d;
                    }
                    break;
                case 57:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM6503d = C1131f.m6502c(i2);
                        iM24102B += iM6503d;
                    }
                    break;
                case 58:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM24102B = wq1.m24102B(i2, 1, iM24102B);
                    }
                    break;
                case 59:
                    if (m6600r(abstractC1134i, i2, i)) {
                        Object objM23276i4 = yga.f69826c.m23276i(abstractC1134i, j);
                        if (objM23276i4 instanceof ByteString) {
                            int iM6507h7 = C1131f.m6507h(i2);
                            int size5 = ((ByteString) objM23276i4).size();
                            iM24102B = ux5.m22978a(size5, size5, iM6507h7, iM24102B);
                        } else {
                            iM6507h3 = C1131f.m6507h(i2);
                            iM6506g = C1131f.m6506g((String) objM23276i4);
                            iM24102B = iM6506g + iM6507h3 + iM24102B;
                        }
                    }
                    break;
                case 60:
                    if (m6600r(abstractC1134i, i2, i)) {
                        Object objM23276i5 = yga.f69826c.m23276i(abstractC1134i, j);
                        wm8 wm8VarM6596l3 = m6596l(i);
                        Class cls5 = AbstractC1139n.f13616a;
                        int iM6507h8 = C1131f.m6507h(i2);
                        int iMo6429a2 = ((AbstractC1126a) objM23276i5).mo6429a(wm8VarM6596l3);
                        iM24102B = ux5.m22978a(iMo6429a2, iMo6429a2, iM6507h8, iM24102B);
                    }
                    break;
                case 61:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM6503d = C1131f.m6500a(i2, (ByteString) yga.f69826c.m23276i(abstractC1134i, j));
                        iM24102B += iM6503d;
                    }
                    break;
                case 62:
                    if (m6600r(abstractC1134i, i2, i)) {
                        int iM6559B2 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6508i(iM6559B2);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 63:
                    if (m6600r(abstractC1134i, i2, i)) {
                        int iM6559B3 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6505f(iM6559B3);
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 64:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM24102B = wq1.m24102B(i2, 4, iM24102B);
                    }
                    break;
                case 65:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM24102B = wq1.m24102B(i2, 8, iM24102B);
                    }
                    break;
                case 66:
                    if (m6600r(abstractC1134i, i2, i)) {
                        int iM6559B4 = m6559B(abstractC1134i, j);
                        iM6507h2 = C1131f.m6507h(i2);
                        iM6505f = C1131f.m6508i((iM6559B4 >> 31) ^ (iM6559B4 << 1));
                        iM6503d = iM6505f + iM6507h2;
                        iM24102B += iM6503d;
                    }
                    break;
                case 67:
                    if (m6600r(abstractC1134i, i2, i)) {
                        long jM6560C3 = m6560C(abstractC1134i, j);
                        iM6507h4 = C1131f.m6507h(i2);
                        iM6509j2 = C1131f.m6509j((jM6560C3 >> 63) ^ (jM6560C3 << 1));
                        iM6503d = iM6509j2 + iM6507h4;
                        iM24102B += iM6503d;
                    }
                    break;
                case 68:
                    if (m6600r(abstractC1134i, i2, i)) {
                        iM6503d = C1131f.m6504e(i2, (AbstractC1126a) yga.f69826c.m23276i(abstractC1134i, j), m6596l(i));
                        iM24102B += iM6503d;
                    }
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    /* JADX INFO: renamed from: p */
    public final boolean m6599p(Object obj, int i) {
        int i2 = this.f13599a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & yga.f69826c.m23274g(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM6584T = m6584T(i);
        long j2 = iM6584T & 1048575;
        switch (m6562S(iM6584T)) {
            case 0:
                if (Double.doubleToRawLongBits(yga.f69826c.mo17422e(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(yga.f69826c.mo17423f(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (yga.f69826c.m23275h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (yga.f69826c.m23275h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (yga.f69826c.m23275h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return yga.f69826c.mo17420c(obj, j2);
            case 8:
                Object objM23276i = yga.f69826c.m23276i(obj, j2);
                if (objM23276i instanceof String) {
                    return !((String) objM23276i).isEmpty();
                }
                if (objM23276i instanceof ByteString) {
                    return !ByteString.f13555b.equals(objM23276i);
                }
                ij6.m13959q();
                return false;
            case 9:
                if (yga.f69826c.m23276i(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ByteString.f13555b.equals(yga.f69826c.m23276i(obj, j2));
            case 11:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (yga.f69826c.m23275h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (yga.f69826c.m23274g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (yga.f69826c.m23275h(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (yga.f69826c.m23276i(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6600r(Object obj, int i, int i2) {
        return yga.f69826c.m23274g(obj, (long) (this.f13599a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: t */
    public final void m6601t(int i, Object obj, Object obj2) {
        long jM6584T = m6584T(i) & 1048575;
        Object objM23276i = yga.f69826c.m23276i(obj, jM6584T);
        wp5 wp5Var = this.f13612n;
        if (objM23276i != null) {
            wp5Var.getClass();
            if (!((MapFieldLite) objM23276i).m6425d()) {
                MapFieldLite mapFieldLiteM6428g = MapFieldLite.m6423b().m6428g();
                wp5.m24099b(mapFieldLiteM6428g, objM23276i);
                yga.m25140p(obj, jM6584T, mapFieldLiteM6428g);
                objM23276i = mapFieldLiteM6428g;
            }
        } else {
            wp5Var.getClass();
            objM23276i = MapFieldLite.m6423b().m6428g();
            yga.m25140p(obj, jM6584T, objM23276i);
        }
        wp5Var.getClass();
        g9a.m12435l(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public final void m6602u(Object obj, Object obj2, int i) {
        if (m6599p(obj2, i)) {
            long jM6584T = m6584T(i) & 1048575;
            Unsafe unsafe = f13598p;
            Object object = unsafe.getObject(obj2, jM6584T);
            if (object == null) {
                ij6.m13947d(this.f13599a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            wm8 wm8VarM6596l = m6596l(i);
            if (!m6599p(obj, i)) {
                if (m6566q(object)) {
                    Object objNewInstance = wm8VarM6596l.newInstance();
                    wm8VarM6596l.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jM6584T, objNewInstance);
                } else {
                    unsafe.putObject(obj, jM6584T, object);
                }
                m6579N(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM6584T);
            if (!m6566q(object2)) {
                Object objNewInstance2 = wm8VarM6596l.newInstance();
                wm8VarM6596l.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jM6584T, objNewInstance2);
                object2 = objNewInstance2;
            }
            wm8VarM6596l.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6603v(Object obj, Object obj2, int i) {
        int[] iArr = this.f13599a;
        int i2 = iArr[i];
        if (m6600r(obj2, i2, i)) {
            long jM6584T = m6584T(i) & 1048575;
            Unsafe unsafe = f13598p;
            Object object = unsafe.getObject(obj2, jM6584T);
            if (object == null) {
                ij6.m13947d(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            wm8 wm8VarM6596l = m6596l(i);
            if (!m6600r(obj, i2, i)) {
                if (m6566q(object)) {
                    Object objNewInstance = wm8VarM6596l.newInstance();
                    wm8VarM6596l.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jM6584T, objNewInstance);
                } else {
                    unsafe.putObject(obj, jM6584T, object);
                }
                m6580O(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM6584T);
            if (!m6566q(object2)) {
                Object objNewInstance2 = wm8VarM6596l.newInstance();
                wm8VarM6596l.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jM6584T, objNewInstance2);
                object2 = objNewInstance2;
            }
            wm8VarM6596l.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final Object m6604w(Object obj, int i) {
        wm8 wm8VarM6596l = m6596l(i);
        long jM6584T = m6584T(i) & 1048575;
        if (!m6599p(obj, i)) {
            return wm8VarM6596l.newInstance();
        }
        Object object = f13598p.getObject(obj, jM6584T);
        if (m6566q(object)) {
            return object;
        }
        Object objNewInstance = wm8VarM6596l.newInstance();
        if (object != null) {
            wm8VarM6596l.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: x */
    public final Object m6605x(Object obj, int i, int i2) {
        wm8 wm8VarM6596l = m6596l(i2);
        if (!m6600r(obj, i, i2)) {
            return wm8VarM6596l.newInstance();
        }
        Object object = f13598p.getObject(obj, m6584T(i2) & 1048575);
        if (m6566q(object)) {
            return object;
        }
        Object objNewInstance = wm8VarM6596l.newInstance();
        if (object != null) {
            wm8VarM6596l.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
