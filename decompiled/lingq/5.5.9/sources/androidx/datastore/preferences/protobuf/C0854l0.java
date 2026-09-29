package androidx.datastore.preferences.protobuf;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0854l0<T> implements InterfaceC0876w0<T> {

    /* JADX INFO: renamed from: r */
    public static final int[] f5885r = new int[0];

    /* JADX INFO: renamed from: s */
    public static final Unsafe f5886s = C0841f1.m3229o();

    /* JADX INFO: renamed from: a */
    public final int[] f5887a;

    /* JADX INFO: renamed from: b */
    public final Object[] f5888b;

    /* JADX INFO: renamed from: c */
    public final int f5889c;

    /* JADX INFO: renamed from: d */
    public final int f5890d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0848i0 f5891e;

    /* JADX INFO: renamed from: f */
    public final boolean f5892f;

    /* JADX INFO: renamed from: g */
    public final boolean f5893g;

    /* JADX INFO: renamed from: h */
    public final boolean f5894h;

    /* JADX INFO: renamed from: i */
    public final boolean f5895i;

    /* JADX INFO: renamed from: j */
    public final int[] f5896j;

    /* JADX INFO: renamed from: k */
    public final int f5897k;

    /* JADX INFO: renamed from: l */
    public final int f5898l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0858n0 f5899m;

    /* JADX INFO: renamed from: n */
    public final AbstractC0881z f5900n;

    /* JADX INFO: renamed from: o */
    public final AbstractC0829b1<?, ?> f5901o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0857n<?> f5902p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0834d0 f5903q;

    public C0854l0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC0848i0 interfaceC0848i0, boolean z10, int[] iArr2, int i12, int i13, InterfaceC0858n0 interfaceC0858n0, AbstractC0881z abstractC0881z, AbstractC0829b1 abstractC0829b1, AbstractC0857n abstractC0857n, InterfaceC0834d0 interfaceC0834d0) {
        this.f5887a = iArr;
        this.f5888b = objArr;
        this.f5889c = i10;
        this.f5890d = i11;
        this.f5893g = interfaceC0848i0 instanceof GeneratedMessageLite;
        this.f5894h = z10;
        this.f5892f = abstractC0857n != null && abstractC0857n.mo3412e(interfaceC0848i0);
        this.f5895i = false;
        this.f5896j = iArr2;
        this.f5897k = i12;
        this.f5898l = i13;
        this.f5899m = interfaceC0858n0;
        this.f5900n = abstractC0881z;
        this.f5901o = abstractC0829b1;
        this.f5902p = abstractC0857n;
        this.f5891e = interfaceC0848i0;
        this.f5903q = interfaceC0834d0;
    }

    /* JADX INFO: renamed from: A */
    public static long m3367A(long j10, Object obj) {
        return ((Long) C0841f1.m3228n(j10, obj)).longValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G */
    public static Field m3368G(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM854m = C0204c.m854m("Field ", str, " for ");
            sbM854m.append(cls.getName());
            sbM854m.append(" not found. Known fields are ");
            sbM854m.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM854m.toString());
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m3369M(int i10, Object obj, C0849j c0849j) throws IOException {
        if (!(obj instanceof String)) {
            c0849j.m3345b(i10, (ByteString) obj);
        } else {
            c0849j.f5881a.mo3103O((String) obj, i10);
        }
    }

    /* JADX INFO: renamed from: s */
    public static List m3370s(long j10, Object obj) {
        return (List) C0841f1.m3228n(j10, obj);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public static C0854l0 m3371w(InterfaceC0843g0 interfaceC0843g0, InterfaceC0858n0 interfaceC0858n0, AbstractC0881z abstractC0881z, AbstractC0829b1 abstractC0829b1, AbstractC0857n abstractC0857n, InterfaceC0834d0 interfaceC0834d0) {
        if (interfaceC0843g0 instanceof C0872u0) {
            return m3372x((C0872u0) interfaceC0843g0, interfaceC0858n0, abstractC0881z, abstractC0829b1, abstractC0857n, interfaceC0834d0);
        }
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x029e  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b3  */
    /* JADX INFO: renamed from: x */
    public static <T> C0854l0<T> m3372x(C0872u0 c0872u0, InterfaceC0858n0 interfaceC0858n0, AbstractC0881z abstractC0881z, AbstractC0829b1<?, ?> abstractC0829b1, AbstractC0857n<?> abstractC0857n, InterfaceC0834d0 interfaceC0834d0) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int iCharAt3;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr2;
        int i27;
        int i28;
        int i29;
        int i30;
        int iObjectFieldOffset;
        int i31;
        int iObjectFieldOffset2;
        int i32;
        Field fieldM3368G;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldM3368G2;
        int i36;
        Object obj2;
        Field fieldM3368G3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        char cCharAt14;
        int i41 = 0;
        boolean z10 = c0872u0.mo3170c() == ProtoSyntax.PROTO3;
        String strM3444e = c0872u0.m3444e();
        int length = strM3444e.length();
        int iCharAt4 = strM3444e.charAt(0);
        if (iCharAt4 >= 55296) {
            int i42 = iCharAt4 & 8191;
            int i43 = 1;
            int i44 = 13;
            while (true) {
                i10 = i43 + 1;
                cCharAt14 = strM3444e.charAt(i43);
                if (cCharAt14 < 55296) {
                    break;
                }
                i42 |= (cCharAt14 & 8191) << i44;
                i44 += 13;
                i43 = i10;
            }
            iCharAt4 = i42 | (cCharAt14 << i44);
        } else {
            i10 = 1;
        }
        int i45 = i10 + 1;
        int iCharAt5 = strM3444e.charAt(i10);
        if (iCharAt5 >= 55296) {
            int i46 = iCharAt5 & 8191;
            int i47 = 13;
            while (true) {
                i40 = i45 + 1;
                cCharAt13 = strM3444e.charAt(i45);
                if (cCharAt13 < 55296) {
                    break;
                }
                i46 |= (cCharAt13 & 8191) << i47;
                i47 += 13;
                i45 = i40;
            }
            iCharAt5 = i46 | (cCharAt13 << i47);
            i45 = i40;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            iCharAt3 = 0;
            i11 = i45;
            iArr = f5885r;
            i14 = 0;
            i13 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt6 = strM3444e.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt8 = strM3444e.charAt(i48);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt6 = i49 | (cCharAt8 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strM3444e.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt7 = strM3444e.charAt(i51);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt7 = i52 | (cCharAt7 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strM3444e.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt6 = strM3444e.charAt(i54);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt8 = i55 | (cCharAt6 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strM3444e.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt5 = strM3444e.charAt(i57);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt9 = i58 | (cCharAt5 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            iCharAt = strM3444e.charAt(i57);
            if (iCharAt >= 55296) {
                int i61 = iCharAt & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt4 = strM3444e.charAt(i60);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt = i61 | (cCharAt4 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            iCharAt2 = strM3444e.charAt(i60);
            if (iCharAt2 >= 55296) {
                int i64 = iCharAt2 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt3 = strM3444e.charAt(i63);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt2 = i64 | (cCharAt3 << i65);
                i63 = i17;
            }
            int i66 = i63 + 1;
            int iCharAt10 = strM3444e.charAt(i63);
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = 13;
                while (true) {
                    i16 = i66 + 1;
                    cCharAt2 = strM3444e.charAt(i66);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i16;
                }
                iCharAt10 = i67 | (cCharAt2 << i68);
                i66 = i16;
            }
            i11 = i66 + 1;
            iCharAt3 = strM3444e.charAt(i66);
            if (iCharAt3 >= 55296) {
                int i69 = iCharAt3 & 8191;
                int i70 = i11;
                int i71 = 13;
                while (true) {
                    i15 = i70 + 1;
                    cCharAt = strM3444e.charAt(i70);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i71;
                    i71 += 13;
                    i70 = i15;
                }
                iCharAt3 = i69 | (cCharAt << i71);
                i11 = i15;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt2 + iCharAt10];
            i12 = (iCharAt6 * 2) + iCharAt7;
            i13 = iCharAt9;
            iArr = iArr3;
            i41 = iCharAt6;
            i14 = iCharAt8;
        }
        Object[] objArrM3443d = c0872u0.m3443d();
        Class<?> cls = c0872u0.mo3169b().getClass();
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i72 = iCharAt2 + iCharAt3;
        int i73 = i72;
        int i74 = iCharAt3;
        int i75 = i11;
        int i76 = 0;
        int i77 = 0;
        while (i75 < length) {
            int i78 = i75 + 1;
            int iCharAt11 = strM3444e.charAt(i75);
            int i79 = length;
            if (iCharAt11 >= 55296) {
                int i80 = iCharAt11 & 8191;
                int i81 = i78;
                int i82 = 13;
                while (true) {
                    i39 = i81 + 1;
                    cCharAt12 = strM3444e.charAt(i81);
                    i23 = i72;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i39;
                    i72 = i23;
                }
                iCharAt11 = i80 | (cCharAt12 << i82);
                i24 = i39;
            } else {
                i23 = i72;
                i24 = i78;
            }
            int i83 = i24 + 1;
            int iCharAt12 = strM3444e.charAt(i24);
            if (iCharAt12 >= 55296) {
                int i84 = iCharAt12 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i38 = i85 + 1;
                    cCharAt11 = strM3444e.charAt(i85);
                    i25 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i38;
                    iCharAt3 = i25;
                }
                iCharAt12 = i84 | (cCharAt11 << i86);
                i26 = i38;
            } else {
                i25 = iCharAt3;
                i26 = i83;
            }
            int i87 = iCharAt12 & 255;
            boolean z11 = z10;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i77] = i76;
                i77++;
            }
            int i88 = i13;
            Unsafe unsafe = f5886s;
            if (i87 >= 51) {
                int i89 = i26 + 1;
                int iCharAt13 = strM3444e.charAt(i26);
                char c10 = 55296;
                if (iCharAt13 >= 55296) {
                    int i90 = 13;
                    int i91 = iCharAt13 & 8191;
                    int i92 = i89;
                    while (true) {
                        i37 = i92 + 1;
                        cCharAt10 = strM3444e.charAt(i92);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i91 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i92 = i37;
                        c10 = 55296;
                    }
                    iCharAt13 = i91 | (cCharAt10 << i90);
                    i33 = i37;
                } else {
                    i33 = i89;
                }
                int i93 = i33;
                int i94 = i87 - 51;
                i28 = i14;
                if (i94 == 9 || i94 == 17) {
                    i34 = i12 + 1;
                    objArr[((i76 / 3) * 2) + 1] = objArrM3443d[i12];
                } else {
                    if (i94 == 12 && (iCharAt4 & 1) == 1) {
                        i34 = i12 + 1;
                        objArr[((i76 / 3) * 2) + 1] = objArrM3443d[i12];
                    }
                    i35 = iCharAt13 * 2;
                    obj = objArrM3443d[i35];
                    if (obj instanceof Field) {
                        fieldM3368G2 = (Field) obj;
                    } else {
                        fieldM3368G2 = m3368G(cls, (String) obj);
                        objArrM3443d[i35] = fieldM3368G2;
                    }
                    iArr2 = iArr4;
                    i27 = i41;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3368G2);
                    i36 = i35 + 1;
                    obj2 = objArrM3443d[i36];
                    if (obj2 instanceof Field) {
                        fieldM3368G3 = (Field) obj2;
                    } else {
                        fieldM3368G3 = m3368G(cls, (String) obj2);
                        objArrM3443d[i36] = fieldM3368G3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3368G3);
                    i30 = i12;
                    i31 = i93;
                    i32 = 0;
                }
                i12 = i34;
                i35 = iCharAt13 * 2;
                obj = objArrM3443d[i35];
                if (obj instanceof Field) {
                    fieldM3368G2 = (Field) obj;
                } else {
                    fieldM3368G2 = m3368G(cls, (String) obj);
                    objArrM3443d[i35] = fieldM3368G2;
                }
                iArr2 = iArr4;
                i27 = i41;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3368G2);
                i36 = i35 + 1;
                obj2 = objArrM3443d[i36];
                if (obj2 instanceof Field) {
                    fieldM3368G3 = (Field) obj2;
                } else {
                    fieldM3368G3 = m3368G(cls, (String) obj2);
                    objArrM3443d[i36] = fieldM3368G3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3368G3);
                i30 = i12;
                i31 = i93;
                i32 = 0;
            } else {
                iArr2 = iArr4;
                i27 = i41;
                i28 = i14;
                int i95 = i12 + 1;
                Field fieldM3368G4 = m3368G(cls, (String) objArrM3443d[i12]);
                if (i87 == 9 || i87 == 17) {
                    i29 = 1;
                    objArr[((i76 / 3) * 2) + 1] = fieldM3368G4.getType();
                } else {
                    if (i87 == 27 || i87 == 49) {
                        i29 = 1;
                        i30 = i95 + 1;
                        objArr[((i76 / 3) * 2) + 1] = objArrM3443d[i95];
                    } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                        i29 = 1;
                        if ((iCharAt4 & 1) == 1) {
                            i30 = i95 + 1;
                            objArr[((i76 / 3) * 2) + 1] = objArrM3443d[i95];
                        }
                    } else {
                        if (i87 == 50) {
                            int i96 = i74 + 1;
                            iArr[i74] = i76;
                            int i97 = (i76 / 3) * 2;
                            int i98 = i95 + 1;
                            objArr[i97] = objArrM3443d[i95];
                            if ((iCharAt12 & 2048) != 0) {
                                i95 = i98 + 1;
                                objArr[i97 + 1] = objArrM3443d[i98];
                                i74 = i96;
                            } else {
                                i74 = i96;
                                i95 = i98;
                            }
                        }
                        i29 = 1;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3368G4);
                    if ((iCharAt4 & 1) == i29 || i87 > 17) {
                        i31 = i26;
                        iObjectFieldOffset2 = 0;
                        i32 = 0;
                    } else {
                        int i99 = i26 + 1;
                        int iCharAt14 = strM3444e.charAt(i26);
                        if (iCharAt14 >= 55296) {
                            int i100 = iCharAt14 & 8191;
                            int i101 = 13;
                            while (true) {
                                i31 = i99 + 1;
                                cCharAt9 = strM3444e.charAt(i99);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i100 |= (cCharAt9 & 8191) << i101;
                                i101 += 13;
                                i99 = i31;
                            }
                            iCharAt14 = i100 | (cCharAt9 << i101);
                        } else {
                            i31 = i99;
                        }
                        int i102 = (iCharAt14 / 32) + (i27 * 2);
                        Object obj3 = objArrM3443d[i102];
                        if (obj3 instanceof Field) {
                            fieldM3368G = (Field) obj3;
                        } else {
                            fieldM3368G = m3368G(cls, (String) obj3);
                            objArrM3443d[i102] = fieldM3368G;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3368G);
                        i32 = iCharAt14 % 32;
                    }
                    if (i87 >= 18 && i87 <= 49) {
                        iArr[i73] = iObjectFieldOffset;
                        i73++;
                    }
                }
                i30 = i95;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3368G4);
                if ((iCharAt4 & 1) == i29) {
                    i31 = i26;
                    iObjectFieldOffset2 = 0;
                    i32 = 0;
                } else {
                    i31 = i26;
                    iObjectFieldOffset2 = 0;
                    i32 = 0;
                }
                if (i87 >= 18) {
                    iArr[i73] = iObjectFieldOffset;
                    i73++;
                }
            }
            int i103 = i76 + 1;
            iArr2[i76] = iCharAt11;
            int i104 = i103 + 1;
            iArr2[i103] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i87 << 20) | iObjectFieldOffset;
            i76 = i104 + 1;
            iArr2[i104] = (i32 << 20) | iObjectFieldOffset2;
            i41 = i27;
            i12 = i30;
            z10 = z11;
            length = i79;
            i72 = i23;
            iCharAt3 = i25;
            i75 = i31;
            i13 = i88;
            i14 = i28;
            iArr4 = iArr2;
        }
        return new C0854l0<>(iArr4, objArr, i14, i13, c0872u0.mo3169b(), z10, iArr, iCharAt3, i72, interfaceC0858n0, abstractC0881z, abstractC0829b1, abstractC0857n, interfaceC0834d0);
    }

    /* JADX INFO: renamed from: y */
    public static long m3373y(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: z */
    public static int m3374z(long j10, Object obj) {
        return ((Integer) C0841f1.m3228n(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public final int m3375B(int i10) {
        if (i10 < this.f5889c || i10 > this.f5890d) {
            return -1;
        }
        int[] iArr = this.f5887a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: C */
    public final <E> void m3376C(Object obj, long j10, InterfaceC0874v0 interfaceC0874v0, InterfaceC0876w0<E> interfaceC0876w0, C0855m c0855m) throws IOException {
        interfaceC0874v0.mo3300E(this.f5900n.mo3498c(j10, obj), interfaceC0876w0, c0855m);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D */
    public final <E> void m3377D(Object obj, int i10, InterfaceC0874v0 interfaceC0874v0, InterfaceC0876w0<E> interfaceC0876w0, C0855m c0855m) throws IOException {
        interfaceC0874v0.mo3305J(this.f5900n.mo3498c(i10 & 1048575, obj), interfaceC0876w0, c0855m);
    }

    /* JADX INFO: renamed from: E */
    public final void m3378E(Object obj, int i10, InterfaceC0874v0 interfaceC0874v0) throws IOException {
        if ((536870912 & i10) != 0) {
            C0841f1.m3235u(i10 & 1048575, obj, interfaceC0874v0.mo3307L());
        } else if (this.f5893g) {
            C0841f1.m3235u(i10 & 1048575, obj, interfaceC0874v0.mo3341x());
        } else {
            C0841f1.m3235u(i10 & 1048575, obj, interfaceC0874v0.mo3297B());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: F */
    public final void m3379F(Object obj, int i10, InterfaceC0874v0 interfaceC0874v0) throws IOException {
        boolean z10 = (536870912 & i10) != 0;
        AbstractC0881z abstractC0881z = this.f5900n;
        if (z10) {
            interfaceC0874v0.mo3296A(abstractC0881z.mo3498c(i10 & 1048575, obj));
        } else {
            interfaceC0874v0.mo3343z(abstractC0881z.mo3498c(i10 & 1048575, obj));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3380H(int i10, Object obj) {
        if (this.f5894h) {
            return;
        }
        int i11 = this.f5887a[i10 + 2];
        long j10 = i11 & 1048575;
        C0841f1.m3233s(C0841f1.m3226l(j10, obj) | (1 << (i11 >>> 20)), j10, obj);
    }

    /* JADX INFO: renamed from: I */
    public final void m3381I(int i10, int i11, Object obj) {
        C0841f1.m3233s(i10, this.f5887a[i11 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: J */
    public final int m3382J(int i10) {
        return this.f5887a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x030f  */
    /* JADX WARN: Code duplicated, block: B:108:0x031c  */
    /* JADX WARN: Code duplicated, block: B:109:0x032b  */
    /* JADX WARN: Code duplicated, block: B:110:0x033a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0348  */
    /* JADX WARN: Code duplicated, block: B:112:0x0356  */
    /* JADX WARN: Code duplicated, block: B:113:0x0365  */
    /* JADX WARN: Code duplicated, block: B:114:0x0373  */
    /* JADX WARN: Code duplicated, block: B:115:0x0381  */
    /* JADX WARN: Code duplicated, block: B:116:0x038f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0394  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:122:0x03af  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0403  */
    /* JADX WARN: Code duplicated, block: B:142:0x0407  */
    /* JADX WARN: Code duplicated, block: B:143:0x0414  */
    /* JADX WARN: Code duplicated, block: B:145:0x0418  */
    /* JADX WARN: Code duplicated, block: B:146:0x0420  */
    /* JADX WARN: Code duplicated, block: B:148:0x0426  */
    /* JADX WARN: Code duplicated, block: B:149:0x042e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0433  */
    /* JADX WARN: Code duplicated, block: B:152:0x043b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0440  */
    /* JADX WARN: Code duplicated, block: B:155:0x0448  */
    /* JADX WARN: Code duplicated, block: B:157:0x044d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0455  */
    /* JADX WARN: Code duplicated, block: B:160:0x045a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0462  */
    /* JADX WARN: Code duplicated, block: B:163:0x0467  */
    /* JADX WARN: Code duplicated, block: B:164:0x046f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0474  */
    /* JADX WARN: Code duplicated, block: B:167:0x047c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0481  */
    /* JADX WARN: Code duplicated, block: B:196:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01db  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
    /* JADX WARN: Code duplicated, block: B:92:0x0233  */
    /* JADX WARN: Code duplicated, block: B:93:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x0250  */
    /* JADX WARN: Code duplicated, block: B:95:0x025f  */
    /* JADX WARN: Code duplicated, block: B:96:0x026e  */
    /* JADX WARN: Code duplicated, block: B:97:0x027c  */
    /* JADX WARN: Code duplicated, block: B:98:0x028b  */
    /* JADX WARN: Code duplicated, block: B:99:0x029a  */
    /* JADX INFO: renamed from: K */
    public final void m3383K(Object obj, C0849j c0849j) throws IOException {
        Iterator itM3431k;
        Map.Entry entry;
        int i10;
        long j10;
        boolean z10 = this.f5892f;
        AbstractC0857n<?> abstractC0857n = this.f5902p;
        if (z10) {
            C0863q<T> c0863qMo3410c = abstractC0857n.mo3410c(obj);
            if (c0863qMo3410c.m3429h()) {
                itM3431k = null;
                entry = null;
            } else {
                itM3431k = c0863qMo3410c.m3431k();
                entry = (Map.Entry) itM3431k.next();
            }
        } else {
            itM3431k = null;
            entry = null;
        }
        int[] iArr = this.f5887a;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        for (int length = iArr.length; i12 < length; length = length) {
            int iM3382J = m3382J(i12);
            int i14 = iArr[i12];
            int i15 = (267386880 & iM3382J) >>> 20;
            boolean z11 = this.f5894h;
            Unsafe unsafe = f5886s;
            if (z11 || i15 > 17) {
                entry = entry;
                i10 = 0;
            } else {
                int i16 = iArr[i12 + 2];
                Map.Entry entry2 = entry;
                int i17 = i16 & 1048575;
                if (i17 != i11) {
                    i13 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i10 = 1 << (i16 >>> 20);
                entry = entry2;
            }
            while (entry != null) {
                abstractC0857n.mo3408a(entry);
                if (i14 >= 0) {
                    abstractC0857n.mo3417j(entry);
                    entry = itM3431k.hasNext() ? (Map.Entry) itM3431k.next() : null;
                } else {
                    j10 = iM3382J & 1048575;
                    switch (i15) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            if ((i10 & i13) != 0) {
                                c0849j.m3346c(C0841f1.m3224j(j10, obj), i14);
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 1:
                            if ((i10 & i13) != 0) {
                                c0849j.m3350g(i14, C0841f1.m3225k(j10, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 2:
                            if ((i10 & i13) != 0) {
                                c0849j.m3353j(i14, unsafe.getLong(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 3:
                            if ((i10 & i13) != 0) {
                                c0849j.m3361r(i14, unsafe.getLong(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 4:
                            if ((i10 & i13) != 0) {
                                c0849j.m3352i(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 5:
                            if ((i10 & i13) != 0) {
                                c0849j.m3349f(i14, unsafe.getLong(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            if ((i10 & i13) != 0) {
                                c0849j.m3348e(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            if ((i10 & i13) != 0) {
                                c0849j.m3344a(i14, C0841f1.m3220f(j10, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 8:
                            if ((i10 & i13) != 0) {
                                m3369M(i14, unsafe.getObject(obj, j10), c0849j);
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 9:
                            if ((i10 & i13) != 0) {
                                c0849j.m3354k(i14, m3398n(i12), unsafe.getObject(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 10:
                            if ((i10 & i13) != 0) {
                                c0849j.m3345b(i14, (ByteString) unsafe.getObject(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 11:
                            if ((i10 & i13) != 0) {
                                c0849j.m3360q(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 12:
                            if ((i10 & i13) != 0) {
                                c0849j.m3347d(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 13:
                            if ((i10 & i13) != 0) {
                                c0849j.m3356m(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 14:
                            if ((i10 & i13) != 0) {
                                c0849j.m3357n(i14, unsafe.getLong(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 15:
                            if ((i10 & i13) != 0) {
                                c0849j.m3358o(i14, unsafe.getInt(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 16:
                            if ((i10 & i13) != 0) {
                                c0849j.m3359p(i14, unsafe.getLong(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 17:
                            if ((i10 & i13) != 0) {
                                c0849j.m3351h(i14, m3398n(i12), unsafe.getObject(obj, j10));
                            } else {
                                continue;
                                continue;
                            }
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 18:
                            C0878x0.m3453G(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 19:
                            C0878x0.m3457K(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 20:
                            C0878x0.m3460N(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 21:
                            C0878x0.m3468V(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 22:
                            C0878x0.m3459M(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 23:
                            C0878x0.m3456J(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 24:
                            C0878x0.m3455I(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 25:
                            C0878x0.m3451E(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 26:
                            C0878x0.m3466T(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j);
                            break;
                        case 27:
                            C0878x0.m3461O(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, m3398n(i12));
                            break;
                        case 28:
                            C0878x0.m3452F(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j);
                            break;
                        case 29:
                            C0878x0.m3467U(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 30:
                            C0878x0.m3454H(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 31:
                            C0878x0.m3462P(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 32:
                            C0878x0.m3463Q(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 33:
                            C0878x0.m3464R(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 34:
                            C0878x0.m3465S(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                            continue;
                            continue;
                            i12 += 3;
                            iArr = iArr;
                            break;
                        case 35:
                            C0878x0.m3453G(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 36:
                            C0878x0.m3457K(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 37:
                            C0878x0.m3460N(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 38:
                            C0878x0.m3468V(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 39:
                            C0878x0.m3459M(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 40:
                            C0878x0.m3456J(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 41:
                            C0878x0.m3455I(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 42:
                            C0878x0.m3451E(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 43:
                            C0878x0.m3467U(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 44:
                            C0878x0.m3454H(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 45:
                            C0878x0.m3462P(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 46:
                            C0878x0.m3463Q(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 47:
                            C0878x0.m3464R(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 48:
                            C0878x0.m3465S(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                            break;
                        case 49:
                            C0878x0.m3458L(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, m3398n(i12));
                            break;
                        case 50:
                            m3384L(c0849j, i14, unsafe.getObject(obj, j10), i12);
                            break;
                        case 51:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3346c(((Double) C0841f1.m3228n(j10, obj)).doubleValue(), i14);
                            }
                            break;
                        case 52:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3350g(i14, ((Float) C0841f1.m3228n(j10, obj)).floatValue());
                            }
                            break;
                        case 53:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3353j(i14, m3367A(j10, obj));
                            }
                            break;
                        case 54:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3361r(i14, m3367A(j10, obj));
                            }
                            break;
                        case 55:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3352i(i14, m3374z(j10, obj));
                            }
                            break;
                        case 56:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3349f(i14, m3367A(j10, obj));
                            }
                            break;
                        case 57:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3348e(i14, m3374z(j10, obj));
                            }
                            break;
                        case 58:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3344a(i14, ((Boolean) C0841f1.m3228n(j10, obj)).booleanValue());
                            }
                            break;
                        case 59:
                            if (m3402r(i14, i12, obj)) {
                                m3369M(i14, unsafe.getObject(obj, j10), c0849j);
                            }
                            break;
                        case 60:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3354k(i14, m3398n(i12), unsafe.getObject(obj, j10));
                            }
                            break;
                        case 61:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3345b(i14, (ByteString) unsafe.getObject(obj, j10));
                            }
                            break;
                        case 62:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3360q(i14, m3374z(j10, obj));
                            }
                            break;
                        case 63:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3347d(i14, m3374z(j10, obj));
                            }
                            break;
                        case 64:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3356m(i14, m3374z(j10, obj));
                            }
                            break;
                        case 65:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3357n(i14, m3367A(j10, obj));
                            }
                            break;
                        case 66:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3358o(i14, m3374z(j10, obj));
                            }
                            break;
                        case 67:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3359p(i14, m3367A(j10, obj));
                            }
                            break;
                        case 68:
                            if (m3402r(i14, i12, obj)) {
                                c0849j.m3351h(i14, m3398n(i12), unsafe.getObject(obj, j10));
                            }
                            break;
                    }
                    i12 += 3;
                    iArr = iArr;
                }
            }
            j10 = iM3382J & 1048575;
            switch (i15) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if ((i10 & i13) != 0) {
                        c0849j.m3346c(C0841f1.m3224j(j10, obj), i14);
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        c0849j.m3350g(i14, C0841f1.m3225k(j10, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        c0849j.m3353j(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        c0849j.m3361r(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        c0849j.m3352i(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        c0849j.m3349f(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i10 & i13) != 0) {
                        c0849j.m3348e(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i10 & i13) != 0) {
                        c0849j.m3344a(i14, C0841f1.m3220f(j10, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        m3369M(i14, unsafe.getObject(obj, j10), c0849j);
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        c0849j.m3354k(i14, m3398n(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        c0849j.m3345b(i14, (ByteString) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        c0849j.m3360q(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        c0849j.m3347d(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        c0849j.m3356m(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        c0849j.m3357n(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        c0849j.m3358o(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        c0849j.m3359p(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        c0849j.m3351h(i14, m3398n(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 18:
                    C0878x0.m3453G(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 19:
                    C0878x0.m3457K(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 20:
                    C0878x0.m3460N(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 21:
                    C0878x0.m3468V(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 22:
                    C0878x0.m3459M(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 23:
                    C0878x0.m3456J(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 24:
                    C0878x0.m3455I(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 25:
                    C0878x0.m3451E(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 26:
                    C0878x0.m3466T(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j);
                    break;
                case 27:
                    C0878x0.m3461O(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, m3398n(i12));
                    break;
                case 28:
                    C0878x0.m3452F(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j);
                    break;
                case 29:
                    C0878x0.m3467U(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 30:
                    C0878x0.m3454H(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 31:
                    C0878x0.m3462P(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 32:
                    C0878x0.m3463Q(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 33:
                    C0878x0.m3464R(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 34:
                    C0878x0.m3465S(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, false);
                    continue;
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 35:
                    C0878x0.m3453G(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 36:
                    C0878x0.m3457K(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 37:
                    C0878x0.m3460N(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 38:
                    C0878x0.m3468V(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 39:
                    C0878x0.m3459M(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 40:
                    C0878x0.m3456J(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 41:
                    C0878x0.m3455I(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 42:
                    C0878x0.m3451E(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 43:
                    C0878x0.m3467U(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 44:
                    C0878x0.m3454H(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 45:
                    C0878x0.m3462P(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 46:
                    C0878x0.m3463Q(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 47:
                    C0878x0.m3464R(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 48:
                    C0878x0.m3465S(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, true);
                    break;
                case 49:
                    C0878x0.m3458L(iArr[i12], (List) unsafe.getObject(obj, j10), c0849j, m3398n(i12));
                    break;
                case 50:
                    m3384L(c0849j, i14, unsafe.getObject(obj, j10), i12);
                    break;
                case 51:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3346c(((Double) C0841f1.m3228n(j10, obj)).doubleValue(), i14);
                    }
                    break;
                case 52:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3350g(i14, ((Float) C0841f1.m3228n(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3353j(i14, m3367A(j10, obj));
                    }
                    break;
                case 54:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3361r(i14, m3367A(j10, obj));
                    }
                    break;
                case 55:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3352i(i14, m3374z(j10, obj));
                    }
                    break;
                case 56:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3349f(i14, m3367A(j10, obj));
                    }
                    break;
                case 57:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3348e(i14, m3374z(j10, obj));
                    }
                    break;
                case 58:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3344a(i14, ((Boolean) C0841f1.m3228n(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m3402r(i14, i12, obj)) {
                        m3369M(i14, unsafe.getObject(obj, j10), c0849j);
                    }
                    break;
                case 60:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3354k(i14, m3398n(i12), unsafe.getObject(obj, j10));
                    }
                    break;
                case 61:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3345b(i14, (ByteString) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3360q(i14, m3374z(j10, obj));
                    }
                    break;
                case 63:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3347d(i14, m3374z(j10, obj));
                    }
                    break;
                case 64:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3356m(i14, m3374z(j10, obj));
                    }
                    break;
                case 65:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3357n(i14, m3367A(j10, obj));
                    }
                    break;
                case 66:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3358o(i14, m3374z(j10, obj));
                    }
                    break;
                case 67:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3359p(i14, m3367A(j10, obj));
                    }
                    break;
                case 68:
                    if (m3402r(i14, i12, obj)) {
                        c0849j.m3351h(i14, m3398n(i12), unsafe.getObject(obj, j10));
                    }
                    break;
            }
            i12 += 3;
            iArr = iArr;
        }
        while (entry != null) {
            abstractC0857n.mo3417j(entry);
            entry = itM3431k.hasNext() ? (Map.Entry) itM3431k.next() : null;
        }
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
        abstractC0829b1.mo3191s(abstractC0829b1.mo3179g(obj), c0849j);
    }

    /* JADX INFO: renamed from: L */
    public final void m3384L(C0849j c0849j, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objM3397m = m3397m(i11);
            InterfaceC0834d0 interfaceC0834d0 = this.f5903q;
            C0831c0.a<?, ?> aVarMo3203c = interfaceC0834d0.mo3203c(objM3397m);
            MapFieldLite mapFieldLiteMo3208h = interfaceC0834d0.mo3208h(obj);
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            codedOutputStream.getClass();
            for (Map.Entry entry : mapFieldLiteMo3208h.entrySet()) {
                codedOutputStream.mo3105Q(i10, 2);
                codedOutputStream.mo3107S(C0831c0.m3195a(aVarMo3203c, entry.getKey(), entry.getValue()));
                C0831c0.m3196b(codedOutputStream, aVarMo3203c, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: a */
    public final void mo3385a(T t10, T t11) {
        t11.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f5887a;
            if (i10 >= iArr.length) {
                if (!this.f5894h) {
                    Class<?> cls = C0878x0.f5946a;
                    AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
                    abstractC0829b1.mo3187o(t10, abstractC0829b1.mo3183k(abstractC0829b1.mo3179g(t10), abstractC0829b1.mo3179g(t11)));
                    if (this.f5892f) {
                        C0878x0.m3448B(this.f5902p, t10, t11);
                    }
                }
                return;
            }
            int iM3382J = m3382J(i10);
            long j10 = 1048575 & iM3382J;
            int i11 = iArr[i10];
            switch ((iM3382J & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (m3401q(i10, t11)) {
                        C0841f1.f5848d.mo3243m(t10, j10, C0841f1.m3224j(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 1:
                    if (m3401q(i10, t11)) {
                        C0841f1.f5848d.mo3244n(t10, j10, C0841f1.m3225k(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 2:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3234t(t10, j10, C0841f1.m3227m(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 3:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3234t(t10, j10, C0841f1.m3227m(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 4:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case 5:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3234t(t10, j10, C0841f1.m3227m(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m3401q(i10, t11)) {
                        C0841f1.f5848d.mo3241k(t10, j10, C0841f1.m3220f(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 8:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3235u(j10, t10, C0841f1.m3228n(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 9:
                    m3404u(t10, i10, t11);
                    break;
                case 10:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3235u(j10, t10, C0841f1.m3228n(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 11:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case 12:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case 13:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case 14:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3234t(t10, j10, C0841f1.m3227m(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 15:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3233s(C0841f1.m3226l(j10, t11), j10, t10);
                        m3380H(i10, t10);
                    }
                    break;
                case 16:
                    if (m3401q(i10, t11)) {
                        C0841f1.m3234t(t10, j10, C0841f1.m3227m(j10, t11));
                        m3380H(i10, t10);
                    }
                    break;
                case 17:
                    m3404u(t10, i10, t11);
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
                    this.f5900n.mo3497b(j10, t10, t11);
                    break;
                case 50:
                    Class<?> cls2 = C0878x0.f5946a;
                    C0841f1.m3235u(j10, t10, this.f5903q.mo3201a(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11)));
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
                    if (m3402r(i11, i10, t11)) {
                        C0841f1.m3235u(j10, t10, C0841f1.m3228n(j10, t11));
                        m3381I(i11, i10, t10);
                    }
                    break;
                case 60:
                    m3405v(t10, i10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m3402r(i11, i10, t11)) {
                        C0841f1.m3235u(j10, t10, C0841f1.m3228n(j10, t11));
                        m3381I(i11, i10, t10);
                    }
                    break;
                case 68:
                    m3405v(t10, i10, t11);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v32 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: b */
    public final void mo3386b(T r20, androidx.datastore.preferences.protobuf.InterfaceC0874v0 r21, androidx.datastore.preferences.protobuf.C0855m r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0854l0.mo3386b(java.lang.Object, androidx.datastore.preferences.protobuf.v0, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: c */
    public final void mo3387c(T t10) {
        int[] iArr;
        int i10;
        int i11 = this.f5897k;
        while (true) {
            iArr = this.f5896j;
            i10 = this.f5898l;
            if (i11 >= i10) {
                break;
            }
            long jM3382J = m3382J(iArr[i11]) & 1048575;
            Object objM3228n = C0841f1.m3228n(jM3382J, t10);
            if (objM3228n != null) {
                C0841f1.m3235u(jM3382J, t10, this.f5903q.mo3202b(objM3228n));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f5900n.mo3496a(iArr[i10], t10);
            i10++;
        }
        this.f5901o.mo3182j(t10);
        if (this.f5892f) {
            this.f5902p.mo3413f(t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108 A[LOOP:2: B:65:0x00f6->B:70:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: d */
    public final boolean mo3388d(T t10) {
        int i10;
        List list;
        ?? M3398n;
        int i11;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean zM3401q = true;
            if (i13 >= this.f5897k) {
                return !this.f5892f || this.f5902p.mo3410c(t10).m3430i();
            }
            int i15 = this.f5896j[i13];
            int[] iArr = this.f5887a;
            int i16 = iArr[i15];
            int iM3382J = m3382J(i15);
            boolean z10 = this.f5894h;
            if (z10) {
                i10 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = f5886s.getInt(t10, i18);
                    i12 = i18;
                }
            }
            if ((268435456 & iM3382J) != 0) {
                if (!(z10 ? m3401q(i15, t10) : (i14 & i10) != 0)) {
                    return false;
                }
            }
            int i19 = (267386880 & iM3382J) >>> 20;
            if (i19 == 9 || i19 == 17) {
                if (z10) {
                    zM3401q = m3401q(i15, t10);
                } else if ((i10 & i14) == 0) {
                    zM3401q = false;
                }
                if (zM3401q && !m3398n(i15).mo3388d(C0841f1.m3228n(iM3382J & 1048575, t10))) {
                    return false;
                }
            } else if (i19 == 27) {
                list = (List) C0841f1.m3228n(iM3382J & 1048575, t10);
                if (!list.isEmpty()) {
                    M3398n = m3398n(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!M3398n.mo3388d(list.get(i11))) {
                            zM3401q = false;
                            break;
                        }
                    }
                }
                if (!zM3401q) {
                    return false;
                }
            } else if (i19 == 60 || i19 == 68) {
                if (m3402r(i16, i15, t10) && !m3398n(i15).mo3388d(C0841f1.m3228n(iM3382J & 1048575, t10))) {
                    return false;
                }
            } else if (i19 == 49) {
                list = (List) C0841f1.m3228n(iM3382J & 1048575, t10);
                if (!list.isEmpty()) {
                    M3398n = m3398n(i15);
                    while (i11 < list.size()) {
                        if (!M3398n.mo3388d(list.get(i11))) {
                            zM3401q = false;
                            break;
                        }
                    }
                }
                if (!zM3401q) {
                    return false;
                }
            } else if (i19 != 50) {
                continue;
            } else {
                Object objM3228n = C0841f1.m3228n(iM3382J & 1048575, t10);
                InterfaceC0834d0 interfaceC0834d0 = this.f5903q;
                MapFieldLite mapFieldLiteMo3208h = interfaceC0834d0.mo3208h(objM3228n);
                if (!mapFieldLiteMo3208h.isEmpty() && interfaceC0834d0.mo3203c(m3397m(i15)).f5828c.getJavaType() == WireFormat$JavaType.MESSAGE) {
                    ?? M3436a = 0;
                    for (Object obj : mapFieldLiteMo3208h.values()) {
                        if (M3436a == 0) {
                            M3436a = M3436a;
                            M3436a = C0868s0.f5927c.m3436a(obj.getClass());
                        }
                        M3436a = M3436a;
                        if (!M3436a.mo3388d(obj)) {
                            zM3401q = false;
                            break;
                        }
                    }
                }
                if (!zM3401q) {
                    return false;
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:105:0x0306  */
    /* JADX WARN: Code duplicated, block: B:106:0x0319  */
    /* JADX WARN: Code duplicated, block: B:107:0x032b  */
    /* JADX WARN: Code duplicated, block: B:108:0x033c  */
    /* JADX WARN: Code duplicated, block: B:109:0x034d  */
    /* JADX WARN: Code duplicated, block: B:110:0x035d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0371  */
    /* JADX WARN: Code duplicated, block: B:112:0x0381  */
    /* JADX WARN: Code duplicated, block: B:113:0x0392  */
    /* JADX WARN: Code duplicated, block: B:114:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:119:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x040d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0414  */
    /* JADX WARN: Code duplicated, block: B:123:0x0423  */
    /* JADX WARN: Code duplicated, block: B:125:0x042a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0435  */
    /* JADX WARN: Code duplicated, block: B:128:0x043c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0447  */
    /* JADX WARN: Code duplicated, block: B:131:0x044e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0459  */
    /* JADX WARN: Code duplicated, block: B:134:0x0460  */
    /* JADX WARN: Code duplicated, block: B:135:0x046b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0472  */
    /* JADX WARN: Code duplicated, block: B:138:0x047d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0484  */
    /* JADX WARN: Code duplicated, block: B:141:0x048f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0496  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:159:0x0500  */
    /* JADX WARN: Code duplicated, block: B:161:0x0507  */
    /* JADX WARN: Code duplicated, block: B:162:0x0511  */
    /* JADX WARN: Code duplicated, block: B:164:0x0518  */
    /* JADX WARN: Code duplicated, block: B:165:0x0522  */
    /* JADX WARN: Code duplicated, block: B:167:0x0529  */
    /* JADX WARN: Code duplicated, block: B:168:0x0533  */
    /* JADX WARN: Code duplicated, block: B:170:0x053a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0544  */
    /* JADX WARN: Code duplicated, block: B:173:0x054b  */
    /* JADX WARN: Code duplicated, block: B:186:0x058d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:200:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:202:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:203:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:205:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:206:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:208:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:209:0x0600  */
    /* JADX WARN: Code duplicated, block: B:211:0x0609  */
    /* JADX WARN: Code duplicated, block: B:212:0x0614  */
    /* JADX WARN: Code duplicated, block: B:214:0x061d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0628  */
    /* JADX WARN: Code duplicated, block: B:217:0x0631  */
    /* JADX WARN: Code duplicated, block: B:218:0x063c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0645  */
    /* JADX WARN: Code duplicated, block: B:221:0x0650  */
    /* JADX WARN: Code duplicated, block: B:223:0x0659  */
    /* JADX WARN: Code duplicated, block: B:224:0x0666  */
    /* JADX WARN: Code duplicated, block: B:226:0x066f  */
    /* JADX WARN: Code duplicated, block: B:227:0x067e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0687  */
    /* JADX WARN: Code duplicated, block: B:230:0x0692  */
    /* JADX WARN: Code duplicated, block: B:232:0x069b  */
    /* JADX WARN: Code duplicated, block: B:233:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:235:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:236:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:238:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:239:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:241:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:242:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:244:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:245:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:247:0x0705  */
    /* JADX WARN: Code duplicated, block: B:248:0x070f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0718  */
    /* JADX WARN: Code duplicated, block: B:251:0x0727  */
    /* JADX WARN: Code duplicated, block: B:253:0x072d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0733  */
    /* JADX WARN: Code duplicated, block: B:256:0x0746  */
    /* JADX WARN: Code duplicated, block: B:257:0x074a  */
    /* JADX WARN: Code duplicated, block: B:258:0x0757  */
    /* JADX WARN: Code duplicated, block: B:259:0x076c  */
    /* JADX WARN: Code duplicated, block: B:261:0x0781  */
    /* JADX WARN: Code duplicated, block: B:262:0x0794  */
    /* JADX WARN: Code duplicated, block: B:263:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:264:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:265:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:266:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:267:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:268:0x0806  */
    /* JADX WARN: Code duplicated, block: B:269:0x0819  */
    /* JADX WARN: Code duplicated, block: B:270:0x082c  */
    /* JADX WARN: Code duplicated, block: B:271:0x083e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0851  */
    /* JADX WARN: Code duplicated, block: B:273:0x0863  */
    /* JADX WARN: Code duplicated, block: B:275:0x087b  */
    /* JADX WARN: Code duplicated, block: B:276:0x088f  */
    /* JADX WARN: Code duplicated, block: B:278:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:279:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:280:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:281:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:283:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:284:0x090d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0924  */
    /* JADX WARN: Code duplicated, block: B:287:0x0938  */
    /* JADX WARN: Code duplicated, block: B:288:0x094c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0964  */
    /* JADX WARN: Code duplicated, block: B:290:0x0979  */
    /* JADX WARN: Code duplicated, block: B:291:0x098d  */
    /* JADX WARN: Code duplicated, block: B:292:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:293:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:294:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:296:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:298:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:299:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:302:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:307:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:313:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:314:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:316:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:319:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:320:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:323:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:325:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:326:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:328:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ad4  */
    /* JADX WARN: Code duplicated, block: B:331:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:332:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:334:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:335:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:337:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:338:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:340:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:343:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:346:0x0b43  */
    /* JADX WARN: Code duplicated, block: B:347:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:361:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:371:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:391:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:430:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:450:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:460:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0554 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:510:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x020f  */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:94:0x0250  */
    /* JADX WARN: Code duplicated, block: B:95:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x0272  */
    /* JADX WARN: Code duplicated, block: B:97:0x0283  */
    /* JADX WARN: Code duplicated, block: B:98:0x0293  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a3  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: e */
    public final void mo3389e(Object obj, C0849j c0849j) throws IOException {
        Iterator itM3431k;
        Map.Entry entry;
        int i10;
        int i11;
        int i12;
        char c10;
        char c11;
        char c12;
        Map.Entry entry2;
        Iterator it;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
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
        int i29;
        int i30;
        c0849j.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        int[] iArr = this.f5887a;
        AbstractC0857n<?> abstractC0857n = this.f5902p;
        boolean z10 = this.f5892f;
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
        int i31 = 267386880;
        int i32 = 1048575;
        if (writer$FieldOrder == writer$FieldOrder2) {
            abstractC0829b1.mo3191s(abstractC0829b1.mo3179g(obj), c0849j);
            if (z10) {
                C0863q<T> c0863qMo3410c = abstractC0857n.mo3410c(obj);
                if (c0863qMo3410c.m3429h()) {
                    entry2 = null;
                    it = null;
                } else {
                    boolean z11 = c0863qMo3410c.f5921c;
                    C0882z0<T, Object> c0882z0 = c0863qMo3410c.f5919a;
                    if (z11) {
                        if (c0882z0.f5960g == null) {
                            c0882z0.f5960g = new C0882z0.b();
                        }
                        it = new C0873v.b(c0882z0.f5960g.iterator());
                    } else {
                        if (c0882z0.f5960g == null) {
                            c0882z0.f5960g = new C0882z0.b();
                        }
                        it = c0882z0.f5960g.iterator();
                    }
                    entry2 = (Map.Entry) it.next();
                }
            } else {
                entry2 = null;
                it = null;
            }
            int length = iArr.length - 3;
            while (length >= 0) {
                int iM3382J = m3382J(length);
                int i33 = iArr[length];
                while (entry2 != null) {
                    abstractC0857n.mo3408a(entry2);
                    if (i33 < 0) {
                        abstractC0857n.mo3417j(entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    } else {
                        switch ((iM3382J & i31) >>> 20) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                i13 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3346c(C0841f1.m3224j(iM3382J & i13, obj), i33);
                                }
                                break;
                            case 1:
                                i14 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3350g(i33, C0841f1.m3225k(iM3382J & i14, obj));
                                }
                                break;
                            case 2:
                                i15 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3353j(i33, C0841f1.m3227m(iM3382J & i15, obj));
                                }
                                break;
                            case 3:
                                i16 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3361r(i33, C0841f1.m3227m(iM3382J & i16, obj));
                                }
                                break;
                            case 4:
                                i17 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3352i(i33, C0841f1.m3226l(iM3382J & i17, obj));
                                }
                                break;
                            case 5:
                                i18 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3349f(i33, C0841f1.m3227m(iM3382J & i18, obj));
                                }
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                i19 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3348e(i33, C0841f1.m3226l(iM3382J & i19, obj));
                                }
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                i20 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3344a(i33, C0841f1.m3220f(iM3382J & i20, obj));
                                }
                                break;
                            case 8:
                                i21 = i32;
                                if (m3401q(length, obj)) {
                                    m3369M(i33, C0841f1.m3228n(iM3382J & i21, obj), c0849j);
                                }
                                break;
                            case 9:
                                i22 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3354k(i33, m3398n(length), C0841f1.m3228n(iM3382J & i22, obj));
                                }
                                break;
                            case 10:
                                i23 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3345b(i33, (ByteString) C0841f1.m3228n(iM3382J & i23, obj));
                                }
                                break;
                            case 11:
                                i24 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3360q(i33, C0841f1.m3226l(iM3382J & i24, obj));
                                }
                                break;
                            case 12:
                                i25 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3347d(i33, C0841f1.m3226l(iM3382J & i25, obj));
                                }
                                break;
                            case 13:
                                i26 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3356m(i33, C0841f1.m3226l(iM3382J & i26, obj));
                                }
                                break;
                            case 14:
                                i27 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3357n(i33, C0841f1.m3227m(iM3382J & i27, obj));
                                }
                                break;
                            case 15:
                                i28 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3358o(i33, C0841f1.m3226l(iM3382J & i28, obj));
                                }
                                break;
                            case 16:
                                i29 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3359p(i33, C0841f1.m3227m(iM3382J & i29, obj));
                                }
                                break;
                            case 17:
                                i30 = i32;
                                if (m3401q(length, obj)) {
                                    c0849j.m3351h(i33, m3398n(length), C0841f1.m3228n(iM3382J & i30, obj));
                                }
                                break;
                            case 18:
                                C0878x0.m3453G(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 19:
                                C0878x0.m3457K(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 20:
                                C0878x0.m3460N(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 21:
                                C0878x0.m3468V(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 22:
                                C0878x0.m3459M(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 23:
                                C0878x0.m3456J(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 24:
                                C0878x0.m3455I(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 25:
                                C0878x0.m3451E(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 26:
                                C0878x0.m3466T(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                                break;
                            case 27:
                                C0878x0.m3461O(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, m3398n(length));
                                break;
                            case 28:
                                C0878x0.m3452F(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                                break;
                            case 29:
                                C0878x0.m3467U(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 30:
                                C0878x0.m3454H(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 31:
                                C0878x0.m3462P(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 32:
                                C0878x0.m3463Q(iArr[length], (List) C0841f1.m3228n(iM3382J & 1048575, obj), c0849j, false);
                                break;
                            case 33:
                                C0878x0.m3464R(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 34:
                                C0878x0.m3465S(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                                break;
                            case 35:
                                C0878x0.m3453G(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 36:
                                C0878x0.m3457K(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 37:
                                C0878x0.m3460N(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 38:
                                C0878x0.m3468V(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 39:
                                C0878x0.m3459M(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 40:
                                C0878x0.m3456J(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 41:
                                C0878x0.m3455I(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 42:
                                C0878x0.m3451E(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 43:
                                C0878x0.m3467U(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 44:
                                C0878x0.m3454H(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 45:
                                C0878x0.m3462P(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 46:
                                C0878x0.m3463Q(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 47:
                                C0878x0.m3464R(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 48:
                                C0878x0.m3465S(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                                break;
                            case 49:
                                C0878x0.m3458L(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, m3398n(length));
                                break;
                            case 50:
                                m3384L(c0849j, i33, C0841f1.m3228n(iM3382J & i32, obj), length);
                                break;
                            case 51:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3346c(((Double) C0841f1.m3228n(iM3382J & i32, obj)).doubleValue(), i33);
                                }
                                break;
                            case 52:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3350g(i33, ((Float) C0841f1.m3228n(iM3382J & i32, obj)).floatValue());
                                }
                                break;
                            case 53:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3353j(i33, m3367A(iM3382J & i32, obj));
                                }
                                break;
                            case 54:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3361r(i33, m3367A(iM3382J & i32, obj));
                                }
                                break;
                            case 55:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3352i(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 56:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3349f(i33, m3367A(iM3382J & i32, obj));
                                }
                                break;
                            case 57:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3348e(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 58:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3344a(i33, ((Boolean) C0841f1.m3228n(iM3382J & i32, obj)).booleanValue());
                                }
                                break;
                            case 59:
                                if (m3402r(i33, length, obj)) {
                                    m3369M(i33, C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                                }
                                break;
                            case 60:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3354k(i33, m3398n(length), C0841f1.m3228n(iM3382J & i32, obj));
                                }
                                break;
                            case 61:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3345b(i33, (ByteString) C0841f1.m3228n(iM3382J & i32, obj));
                                }
                                break;
                            case 62:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3360q(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 63:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3347d(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 64:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3356m(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 65:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3357n(i33, m3367A(iM3382J & i32, obj));
                                }
                                break;
                            case 66:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3358o(i33, m3374z(iM3382J & i32, obj));
                                }
                                break;
                            case 67:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3359p(i33, m3367A(iM3382J & i32, obj));
                                }
                                break;
                            case 68:
                                if (m3402r(i33, length, obj)) {
                                    c0849j.m3351h(i33, m3398n(length), C0841f1.m3228n(iM3382J & i32, obj));
                                }
                                break;
                        }
                        length -= 3;
                        i31 = 267386880;
                        i32 = 1048575;
                    }
                }
                switch ((iM3382J & i31) >>> 20) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        i13 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3346c(C0841f1.m3224j(iM3382J & i13, obj), i33);
                        }
                        break;
                    case 1:
                        i14 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3350g(i33, C0841f1.m3225k(iM3382J & i14, obj));
                        }
                        break;
                    case 2:
                        i15 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3353j(i33, C0841f1.m3227m(iM3382J & i15, obj));
                        }
                        break;
                    case 3:
                        i16 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3361r(i33, C0841f1.m3227m(iM3382J & i16, obj));
                        }
                        break;
                    case 4:
                        i17 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3352i(i33, C0841f1.m3226l(iM3382J & i17, obj));
                        }
                        break;
                    case 5:
                        i18 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3349f(i33, C0841f1.m3227m(iM3382J & i18, obj));
                        }
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        i19 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3348e(i33, C0841f1.m3226l(iM3382J & i19, obj));
                        }
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        i20 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3344a(i33, C0841f1.m3220f(iM3382J & i20, obj));
                        }
                        break;
                    case 8:
                        i21 = i32;
                        if (m3401q(length, obj)) {
                            m3369M(i33, C0841f1.m3228n(iM3382J & i21, obj), c0849j);
                        }
                        break;
                    case 9:
                        i22 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3354k(i33, m3398n(length), C0841f1.m3228n(iM3382J & i22, obj));
                        }
                        break;
                    case 10:
                        i23 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3345b(i33, (ByteString) C0841f1.m3228n(iM3382J & i23, obj));
                        }
                        break;
                    case 11:
                        i24 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3360q(i33, C0841f1.m3226l(iM3382J & i24, obj));
                        }
                        break;
                    case 12:
                        i25 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3347d(i33, C0841f1.m3226l(iM3382J & i25, obj));
                        }
                        break;
                    case 13:
                        i26 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3356m(i33, C0841f1.m3226l(iM3382J & i26, obj));
                        }
                        break;
                    case 14:
                        i27 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3357n(i33, C0841f1.m3227m(iM3382J & i27, obj));
                        }
                        break;
                    case 15:
                        i28 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3358o(i33, C0841f1.m3226l(iM3382J & i28, obj));
                        }
                        break;
                    case 16:
                        i29 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3359p(i33, C0841f1.m3227m(iM3382J & i29, obj));
                        }
                        break;
                    case 17:
                        i30 = i32;
                        if (m3401q(length, obj)) {
                            c0849j.m3351h(i33, m3398n(length), C0841f1.m3228n(iM3382J & i30, obj));
                        }
                        break;
                    case 18:
                        C0878x0.m3453G(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 19:
                        C0878x0.m3457K(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 20:
                        C0878x0.m3460N(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 21:
                        C0878x0.m3468V(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 22:
                        C0878x0.m3459M(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 23:
                        C0878x0.m3456J(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 24:
                        C0878x0.m3455I(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 25:
                        C0878x0.m3451E(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 26:
                        C0878x0.m3466T(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                        break;
                    case 27:
                        C0878x0.m3461O(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, m3398n(length));
                        break;
                    case 28:
                        C0878x0.m3452F(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                        break;
                    case 29:
                        C0878x0.m3467U(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 30:
                        C0878x0.m3454H(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 31:
                        C0878x0.m3462P(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 32:
                        C0878x0.m3463Q(iArr[length], (List) C0841f1.m3228n(iM3382J & 1048575, obj), c0849j, false);
                        break;
                    case 33:
                        C0878x0.m3464R(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 34:
                        C0878x0.m3465S(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, false);
                        break;
                    case 35:
                        C0878x0.m3453G(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 36:
                        C0878x0.m3457K(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 37:
                        C0878x0.m3460N(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 38:
                        C0878x0.m3468V(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 39:
                        C0878x0.m3459M(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 40:
                        C0878x0.m3456J(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 41:
                        C0878x0.m3455I(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 42:
                        C0878x0.m3451E(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 43:
                        C0878x0.m3467U(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 44:
                        C0878x0.m3454H(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 45:
                        C0878x0.m3462P(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 46:
                        C0878x0.m3463Q(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 47:
                        C0878x0.m3464R(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 48:
                        C0878x0.m3465S(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, true);
                        break;
                    case 49:
                        C0878x0.m3458L(iArr[length], (List) C0841f1.m3228n(iM3382J & i32, obj), c0849j, m3398n(length));
                        break;
                    case 50:
                        m3384L(c0849j, i33, C0841f1.m3228n(iM3382J & i32, obj), length);
                        break;
                    case 51:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3346c(((Double) C0841f1.m3228n(iM3382J & i32, obj)).doubleValue(), i33);
                        }
                        break;
                    case 52:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3350g(i33, ((Float) C0841f1.m3228n(iM3382J & i32, obj)).floatValue());
                        }
                        break;
                    case 53:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3353j(i33, m3367A(iM3382J & i32, obj));
                        }
                        break;
                    case 54:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3361r(i33, m3367A(iM3382J & i32, obj));
                        }
                        break;
                    case 55:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3352i(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 56:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3349f(i33, m3367A(iM3382J & i32, obj));
                        }
                        break;
                    case 57:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3348e(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 58:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3344a(i33, ((Boolean) C0841f1.m3228n(iM3382J & i32, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (m3402r(i33, length, obj)) {
                            m3369M(i33, C0841f1.m3228n(iM3382J & i32, obj), c0849j);
                        }
                        break;
                    case 60:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3354k(i33, m3398n(length), C0841f1.m3228n(iM3382J & i32, obj));
                        }
                        break;
                    case 61:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3345b(i33, (ByteString) C0841f1.m3228n(iM3382J & i32, obj));
                        }
                        break;
                    case 62:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3360q(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 63:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3347d(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 64:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3356m(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 65:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3357n(i33, m3367A(iM3382J & i32, obj));
                        }
                        break;
                    case 66:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3358o(i33, m3374z(iM3382J & i32, obj));
                        }
                        break;
                    case 67:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3359p(i33, m3367A(iM3382J & i32, obj));
                        }
                        break;
                    case 68:
                        if (m3402r(i33, length, obj)) {
                            c0849j.m3351h(i33, m3398n(length), C0841f1.m3228n(iM3382J & i32, obj));
                        }
                        break;
                }
                length -= 3;
                i31 = 267386880;
                i32 = 1048575;
            }
            while (entry2 != null) {
                abstractC0857n.mo3417j(entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        if (!this.f5894h) {
            m3383K(obj, c0849j);
            return;
        }
        if (z10) {
            C0863q<T> c0863qMo3410c2 = abstractC0857n.mo3410c(obj);
            if (c0863qMo3410c2.m3429h()) {
                itM3431k = null;
                entry = null;
            } else {
                itM3431k = c0863qMo3410c2.m3431k();
                entry = (Map.Entry) itM3431k.next();
            }
        } else {
            itM3431k = null;
            entry = null;
        }
        int length2 = iArr.length;
        int i34 = 0;
        while (i34 < length2) {
            int iM3382J2 = m3382J(i34);
            int i35 = iArr[i34];
            while (entry != null) {
                abstractC0857n.mo3408a(entry);
                if (i35 >= 0) {
                    abstractC0857n.mo3417j(entry);
                    entry = itM3431k.hasNext() ? (Map.Entry) itM3431k.next() : null;
                } else {
                    switch ((iM3382J2 & 267386880) >>> 20) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3346c(C0841f1.m3224j(iM3382J2 & 1048575, obj), i35);
                            }
                            break;
                        case 1:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3350g(i35, C0841f1.m3225k(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 2:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3353j(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 3:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3361r(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 4:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3352i(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 5:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3349f(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3348e(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3344a(i35, C0841f1.m3220f(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 8:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                m3369M(i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                            }
                            break;
                        case 9:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3354k(i35, m3398n(i10), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 10:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3345b(i35, (ByteString) C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 11:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3360q(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 12:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3347d(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 13:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3356m(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 14:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3357n(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 15:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3358o(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 16:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3359p(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 17:
                            i10 = i34;
                            if (m3401q(i10, obj)) {
                                c0849j.m3351h(i35, m3398n(i10), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            }
                            break;
                        case 18:
                            i11 = i34;
                            C0878x0.m3453G(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 19:
                            i11 = i34;
                            C0878x0.m3457K(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 20:
                            i11 = i34;
                            C0878x0.m3460N(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 21:
                            i11 = i34;
                            C0878x0.m3468V(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 22:
                            i11 = i34;
                            C0878x0.m3459M(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 23:
                            i11 = i34;
                            C0878x0.m3456J(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i11;
                            break;
                        case 24:
                            int i36 = i34;
                            C0878x0.m3455I(iArr[i36], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i36;
                            break;
                        case 25:
                            i12 = i34;
                            C0878x0.m3451E(iArr[i12], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i12;
                            break;
                        case 26:
                            i12 = i34;
                            C0878x0.m3466T(iArr[i12], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                            i10 = i12;
                            break;
                        case 27:
                            int i37 = i34;
                            i12 = i37;
                            C0878x0.m3461O(iArr[i37], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, m3398n(i12));
                            i10 = i12;
                            break;
                        case 28:
                            int i38 = i34;
                            C0878x0.m3452F(iArr[i38], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                            i12 = i38;
                            i10 = i12;
                            break;
                        case 29:
                            i34 = i34;
                            C0878x0.m3467U(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 30:
                            i34 = i34;
                            C0878x0.m3454H(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 31:
                            i34 = i34;
                            C0878x0.m3462P(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 32:
                            i34 = i34;
                            C0878x0.m3463Q(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 33:
                            c10 = 65535;
                            C0878x0.m3464R(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 34:
                            c10 = 65535;
                            C0878x0.m3465S(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                            i10 = i34;
                            break;
                        case 35:
                            c11 = 65535;
                            C0878x0.m3453G(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 36:
                            c11 = 65535;
                            C0878x0.m3457K(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 37:
                            c11 = 65535;
                            C0878x0.m3460N(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 38:
                            c11 = 65535;
                            C0878x0.m3468V(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 39:
                            c11 = 65535;
                            C0878x0.m3459M(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 40:
                            c11 = 65535;
                            C0878x0.m3456J(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 41:
                            c11 = 65535;
                            C0878x0.m3455I(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 42:
                            c11 = 65535;
                            C0878x0.m3451E(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 43:
                            c11 = 65535;
                            C0878x0.m3467U(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 44:
                            c11 = 65535;
                            C0878x0.m3454H(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 45:
                            c11 = 65535;
                            C0878x0.m3462P(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 46:
                            c11 = 65535;
                            C0878x0.m3463Q(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 47:
                            c11 = 65535;
                            C0878x0.m3464R(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i12 = i34;
                            i10 = i12;
                            break;
                        case 48:
                            c12 = 65535;
                            C0878x0.m3465S(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                            i10 = i34;
                            break;
                        case 49:
                            c12 = 65535;
                            C0878x0.m3458L(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, m3398n(i34));
                            i10 = i34;
                            break;
                        case 50:
                            c12 = 65535;
                            m3384L(c0849j, i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), i34);
                            i10 = i34;
                            break;
                        case 51:
                            if (m3402r(i35, i34, obj)) {
                                c12 = 65535;
                                c0849j.m3346c(((Double) C0841f1.m3228n(iM3382J2 & 1048575, obj)).doubleValue(), i35);
                            } else {
                                c12 = 65535;
                            }
                            i10 = i34;
                            break;
                        case 52:
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3350g(i35, ((Float) C0841f1.m3228n(iM3382J2 & 1048575, obj)).floatValue());
                            }
                            i10 = i34;
                            break;
                        case 53:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3353j(i35, m3367A(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 54:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3361r(i35, m3367A(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 55:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3352i(i35, m3374z(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 56:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3349f(i35, m3367A(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 57:
                            if (m3402r(i35, i34, obj)) {
                                c12 = 65535;
                                c0849j.m3348e(i35, m3374z(iM3382J2 & 1048575, obj));
                            } else {
                                c12 = 65535;
                            }
                            i10 = i34;
                            break;
                        case 58:
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3344a(i35, ((Boolean) C0841f1.m3228n(iM3382J2 & 1048575, obj)).booleanValue());
                            }
                            i10 = i34;
                            break;
                        case 59:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                m3369M(i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                            }
                            i10 = i34;
                            break;
                        case 60:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3354k(i35, m3398n(i34), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 61:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3345b(i35, (ByteString) C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 62:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3360q(i35, m3374z(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 63:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3347d(i35, m3374z(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 64:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3356m(i35, m3374z(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 65:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3357n(i35, m3367A(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 66:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3358o(i35, m3374z(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 67:
                            c12 = 65535;
                            if (m3402r(i35, i34, obj)) {
                                c0849j.m3359p(i35, m3367A(iM3382J2 & 1048575, obj));
                            }
                            i10 = i34;
                            break;
                        case 68:
                            if (m3402r(i35, i34, obj)) {
                                c12 = 65535;
                                c0849j.m3351h(i35, m3398n(i34), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                            } else {
                                c12 = 65535;
                            }
                            i10 = i34;
                            break;
                        default:
                            i10 = i34;
                            break;
                    }
                    i34 = i10 + 3;
                }
            }
            switch ((iM3382J2 & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3346c(C0841f1.m3224j(iM3382J2 & 1048575, obj), i35);
                    }
                    break;
                case 1:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3350g(i35, C0841f1.m3225k(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 2:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3353j(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 3:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3361r(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 4:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3352i(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 5:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3349f(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3348e(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3344a(i35, C0841f1.m3220f(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 8:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        m3369M(i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                    }
                    break;
                case 9:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3354k(i35, m3398n(i10), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 10:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3345b(i35, (ByteString) C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 11:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3360q(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 12:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3347d(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 13:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3356m(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 14:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3357n(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 15:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3358o(i35, C0841f1.m3226l(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 16:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3359p(i35, C0841f1.m3227m(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 17:
                    i10 = i34;
                    if (m3401q(i10, obj)) {
                        c0849j.m3351h(i35, m3398n(i10), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    }
                    break;
                case 18:
                    i11 = i34;
                    C0878x0.m3453G(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 19:
                    i11 = i34;
                    C0878x0.m3457K(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 20:
                    i11 = i34;
                    C0878x0.m3460N(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 21:
                    i11 = i34;
                    C0878x0.m3468V(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 22:
                    i11 = i34;
                    C0878x0.m3459M(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 23:
                    i11 = i34;
                    C0878x0.m3456J(iArr[i11], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i11;
                    break;
                case 24:
                    int i39 = i34;
                    C0878x0.m3455I(iArr[i39], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i39;
                    break;
                case 25:
                    i12 = i34;
                    C0878x0.m3451E(iArr[i12], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i12;
                    break;
                case 26:
                    i12 = i34;
                    C0878x0.m3466T(iArr[i12], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                    i10 = i12;
                    break;
                case 27:
                    int i310 = i34;
                    i12 = i310;
                    C0878x0.m3461O(iArr[i310], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, m3398n(i12));
                    i10 = i12;
                    break;
                case 28:
                    int i311 = i34;
                    C0878x0.m3452F(iArr[i311], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                    i12 = i311;
                    i10 = i12;
                    break;
                case 29:
                    i34 = i34;
                    C0878x0.m3467U(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 30:
                    i34 = i34;
                    C0878x0.m3454H(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 31:
                    i34 = i34;
                    C0878x0.m3462P(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 32:
                    i34 = i34;
                    C0878x0.m3463Q(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 33:
                    c10 = 65535;
                    C0878x0.m3464R(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 34:
                    c10 = 65535;
                    C0878x0.m3465S(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, false);
                    i10 = i34;
                    break;
                case 35:
                    c11 = 65535;
                    C0878x0.m3453G(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 36:
                    c11 = 65535;
                    C0878x0.m3457K(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 37:
                    c11 = 65535;
                    C0878x0.m3460N(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 38:
                    c11 = 65535;
                    C0878x0.m3468V(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 39:
                    c11 = 65535;
                    C0878x0.m3459M(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 40:
                    c11 = 65535;
                    C0878x0.m3456J(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 41:
                    c11 = 65535;
                    C0878x0.m3455I(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 42:
                    c11 = 65535;
                    C0878x0.m3451E(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 43:
                    c11 = 65535;
                    C0878x0.m3467U(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 44:
                    c11 = 65535;
                    C0878x0.m3454H(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 45:
                    c11 = 65535;
                    C0878x0.m3462P(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 46:
                    c11 = 65535;
                    C0878x0.m3463Q(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 47:
                    c11 = 65535;
                    C0878x0.m3464R(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i12 = i34;
                    i10 = i12;
                    break;
                case 48:
                    c12 = 65535;
                    C0878x0.m3465S(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, true);
                    i10 = i34;
                    break;
                case 49:
                    c12 = 65535;
                    C0878x0.m3458L(iArr[i34], (List) C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j, m3398n(i34));
                    i10 = i34;
                    break;
                case 50:
                    c12 = 65535;
                    m3384L(c0849j, i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), i34);
                    i10 = i34;
                    break;
                case 51:
                    if (m3402r(i35, i34, obj)) {
                        c12 = 65535;
                        c0849j.m3346c(((Double) C0841f1.m3228n(iM3382J2 & 1048575, obj)).doubleValue(), i35);
                    } else {
                        c12 = 65535;
                    }
                    i10 = i34;
                    break;
                case 52:
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3350g(i35, ((Float) C0841f1.m3228n(iM3382J2 & 1048575, obj)).floatValue());
                    }
                    i10 = i34;
                    break;
                case 53:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3353j(i35, m3367A(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 54:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3361r(i35, m3367A(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 55:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3352i(i35, m3374z(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 56:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3349f(i35, m3367A(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 57:
                    if (m3402r(i35, i34, obj)) {
                        c12 = 65535;
                        c0849j.m3348e(i35, m3374z(iM3382J2 & 1048575, obj));
                    } else {
                        c12 = 65535;
                    }
                    i10 = i34;
                    break;
                case 58:
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3344a(i35, ((Boolean) C0841f1.m3228n(iM3382J2 & 1048575, obj)).booleanValue());
                    }
                    i10 = i34;
                    break;
                case 59:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        m3369M(i35, C0841f1.m3228n(iM3382J2 & 1048575, obj), c0849j);
                    }
                    i10 = i34;
                    break;
                case 60:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3354k(i35, m3398n(i34), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 61:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3345b(i35, (ByteString) C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 62:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3360q(i35, m3374z(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 63:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3347d(i35, m3374z(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 64:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3356m(i35, m3374z(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 65:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3357n(i35, m3367A(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 66:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3358o(i35, m3374z(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 67:
                    c12 = 65535;
                    if (m3402r(i35, i34, obj)) {
                        c0849j.m3359p(i35, m3367A(iM3382J2 & 1048575, obj));
                    }
                    i10 = i34;
                    break;
                case 68:
                    if (m3402r(i35, i34, obj)) {
                        c12 = 65535;
                        c0849j.m3351h(i35, m3398n(i34), C0841f1.m3228n(iM3382J2 & 1048575, obj));
                    } else {
                        c12 = 65535;
                    }
                    i10 = i34;
                    break;
                default:
                    i10 = i34;
                    break;
            }
            i34 = i10 + 3;
        }
        while (entry != null) {
            abstractC0857n.mo3417j(entry);
            entry = itM3431k.hasNext() ? (Map.Entry) itM3431k.next() : null;
        }
        abstractC0829b1.mo3191s(abstractC0829b1.mo3179g(obj), c0849j);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021a  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: f */
    public final boolean mo3390f(T t10, T t11) {
        int[] iArr = this.f5887a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zM3449C = true;
            if (i10 >= length) {
                AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
                if (!abstractC0829b1.mo3179g(t10).equals(abstractC0829b1.mo3179g(t11))) {
                    return false;
                }
                if (!this.f5892f) {
                    return true;
                }
                AbstractC0857n<?> abstractC0857n = this.f5902p;
                return abstractC0857n.mo3410c(t10).equals(abstractC0857n.mo3410c(t11));
            }
            int iM3382J = m3382J(i10);
            long j10 = iM3382J & 1048575;
            switch ((iM3382J & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (!m3394j(t10, i10, t11) || Double.doubleToLongBits(C0841f1.m3224j(j10, t10)) != Double.doubleToLongBits(C0841f1.m3224j(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
                case 1:
                    if (!m3394j(t10, i10, t11) || Float.floatToIntBits(C0841f1.m3225k(j10, t10)) != Float.floatToIntBits(C0841f1.m3225k(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
                case 2:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3227m(j10, t10) != C0841f1.m3227m(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 3:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3227m(j10, t10) != C0841f1.m3227m(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 4:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 5:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3227m(j10, t10) != C0841f1.m3227m(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3220f(j10, t10) != C0841f1.m3220f(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 8:
                    if (!m3394j(t10, i10, t11) || !C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
                case 9:
                    if (!m3394j(t10, i10, t11) || !C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
                case 10:
                    if (!m3394j(t10, i10, t11) || !C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
                case 11:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 12:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 13:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 14:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3227m(j10, t10) != C0841f1.m3227m(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 15:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3226l(j10, t10) != C0841f1.m3226l(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 16:
                    if (!m3394j(t10, i10, t11) || C0841f1.m3227m(j10, t10) != C0841f1.m3227m(j10, t11)) {
                        zM3449C = false;
                    }
                    break;
                case 17:
                    if (!m3394j(t10, i10, t11) || !C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11))) {
                        zM3449C = false;
                    }
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
                    zM3449C = C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11));
                    break;
                case 50:
                    zM3449C = C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11));
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
                    if (!(C0841f1.m3226l(j11, t10) == C0841f1.m3226l(j11, t11)) || !C0878x0.m3449C(C0841f1.m3228n(j10, t10), C0841f1.m3228n(j10, t11))) {
                        zM3449C = false;
                    }
                    break;
            }
            if (!zM3449C) {
                return false;
            }
            i10 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: g */
    public final int mo3391g(T t10) {
        return this.f5894h ? m3400p(t10) : m3399o(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: h */
    public final T mo3392h() {
        return (T) this.f5899m.mo3418a(this.f5891e);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x022e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0257 A[PHI: r3
      0x0257: PHI (r3v31 int) = (r3v10 int), (r3v32 int) binds: [B:82:0x0254, B:40:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: i */
    public final int mo3393i(T t10) {
        int i10;
        int iM3440a;
        int iHashCode;
        int[] iArr = this.f5887a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iM3382J = m3382J(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iM3382J;
            int i14 = 1231;
            switch ((iM3382J & 267386880) >>> 20) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(Double.doubleToLongBits(C0841f1.m3224j(j10, t10)));
                    i11 = iM3440a + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iM3440a = Float.floatToIntBits(C0841f1.m3225k(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(C0841f1.m3227m(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(C0841f1.m3227m(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(C0841f1.m3227m(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i10 = i11 * 53;
                    boolean zM3220f = C0841f1.m3220f(j10, t10);
                    Charset charset = C0871u.f5935a;
                    if (!zM3220f) {
                        i14 = 1237;
                    }
                    iM3440a = i14;
                    i11 = iM3440a + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iM3440a = ((String) C0841f1.m3228n(j10, t10)).hashCode();
                    i11 = iM3440a + i10;
                    break;
                case 9:
                    Object objM3228n = C0841f1.m3228n(j10, t10);
                    if (objM3228n != null) {
                        iHashCode = objM3228n.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                    i11 = iM3440a + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(C0841f1.m3227m(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3226l(j10, t10);
                    i11 = iM3440a + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iM3440a = C0871u.m3440a(C0841f1.m3227m(j10, t10));
                    i11 = iM3440a + i10;
                    break;
                case 17:
                    Object objM3228n2 = C0841f1.m3228n(j10, t10);
                    if (objM3228n2 != null) {
                        iHashCode = objM3228n2.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                    i11 = iM3440a + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                    i11 = iM3440a + i10;
                    break;
                case 51:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(Double.doubleToLongBits(((Double) C0841f1.m3228n(j10, t10)).doubleValue()));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 52:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = Float.floatToIntBits(((Float) C0841f1.m3228n(j10, t10)).floatValue());
                        i11 = iM3440a + i10;
                    }
                    break;
                case 53:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(m3367A(j10, t10));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 54:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(m3367A(j10, t10));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 55:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 56:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(m3367A(j10, t10));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 57:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 58:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) C0841f1.m3228n(j10, t10)).booleanValue();
                        Charset charset2 = C0871u.f5935a;
                        if (!zBooleanValue) {
                            i14 = 1237;
                        }
                        iM3440a = i14;
                        i11 = iM3440a + i10;
                    }
                    break;
                case 59:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = ((String) C0841f1.m3228n(j10, t10)).hashCode();
                        i11 = iM3440a + i10;
                    }
                    break;
                case 60:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                        i11 = iM3440a + i10;
                    }
                    break;
                case 61:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                        i11 = iM3440a + i10;
                    }
                    break;
                case 62:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 63:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 64:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 65:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(m3367A(j10, t10));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 66:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = m3374z(j10, t10);
                        i11 = iM3440a + i10;
                    }
                    break;
                case 67:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0871u.m3440a(m3367A(j10, t10));
                        i11 = iM3440a + i10;
                    }
                    break;
                case 68:
                    if (m3402r(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iM3440a = C0841f1.m3228n(j10, t10).hashCode();
                        i11 = iM3440a + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f5901o.mo3179g(t10).hashCode() + (i11 * 53);
        if (this.f5892f) {
            iHashCode2 = (iHashCode2 * 53) + this.f5902p.mo3410c(t10).hashCode();
        }
        return iHashCode2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3394j(Object obj, int i10, Object obj2) {
        return m3401q(i10, obj) == m3401q(i10, obj2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final <UT, UB> UB m3395k(Object obj, int i10, UB ub2, AbstractC0829b1<UT, UB> abstractC0829b1) {
        C0871u.b bVarM3396l;
        int i11 = this.f5887a[i10];
        Object objM3228n = C0841f1.m3228n(m3382J(i10) & 1048575, obj);
        if (objM3228n != null && (bVarM3396l = m3396l(i10)) != null) {
            InterfaceC0834d0 interfaceC0834d0 = this.f5903q;
            MapFieldLite mapFieldLiteMo3205e = interfaceC0834d0.mo3205e(objM3228n);
            C0831c0.a<?, ?> aVarMo3203c = interfaceC0834d0.mo3203c(m3397m(i10));
            Iterator it = mapFieldLiteMo3205e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ((Integer) entry.getValue()).intValue();
                if (!bVarM3396l.m3442a()) {
                    if (ub2 == null) {
                        ub2 = (UB) abstractC0829b1.mo3185m();
                    }
                    int iM3195a = C0831c0.m3195a(aVarMo3203c, entry.getKey(), entry.getValue());
                    byte[] bArr = new byte[iM3195a];
                    Logger logger = CodedOutputStream.f5797b;
                    CodedOutputStream.C0808b c0808b = new CodedOutputStream.C0808b(bArr, iM3195a);
                    try {
                        C0831c0.m3196b(c0808b, aVarMo3203c, entry.getKey(), entry.getValue());
                        if (c0808b.f5804e - c0808b.f5805f != 0) {
                            throw new IllegalStateException("Did not write as much data as expected.");
                        }
                        abstractC0829b1.mo3176d(ub2, i11, new ByteString.LiteralByteString(bArr));
                        it.remove();
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
            return ub2;
        }
        return ub2;
    }

    /* JADX INFO: renamed from: l */
    public final C0871u.b m3396l(int i10) {
        return (C0871u.b) this.f5888b[((i10 / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: m */
    public final Object m3397m(int i10) {
        return this.f5888b[(i10 / 3) * 2];
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC0876w0 m3398n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f5888b;
        InterfaceC0876w0 interfaceC0876w0 = (InterfaceC0876w0) objArr[i11];
        if (interfaceC0876w0 != null) {
            return interfaceC0876w0;
        }
        InterfaceC0876w0<T> interfaceC0876w0M3436a = C0868s0.f5927c.m3436a((Class) objArr[i11 + 1]);
        objArr[i11] = interfaceC0876w0M3436a;
        return interfaceC0876w0M3436a;
    }

    /* JADX INFO: renamed from: o */
    public final int m3399o(T t10) {
        int i10;
        int i11;
        int i12;
        int iM3068d;
        int iM3067c;
        int iM3477i;
        int iM3084t;
        int iM3086v;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f5887a;
            if (i14 >= iArr.length) {
                AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
                int iMo3180h = abstractC0829b1.mo3180h(abstractC0829b1.mo3179g(t10)) + i15;
                return this.f5892f ? iMo3180h + this.f5902p.mo3410c(t10).m3428g() : iMo3180h;
            }
            int iM3382J = m3382J(i14);
            int i17 = iArr[i14];
            int i18 = (267386880 & iM3382J) >>> 20;
            boolean z10 = this.f5895i;
            Unsafe unsafe = f5886s;
            if (i18 <= 17) {
                i11 = iArr[i14 + 2];
                int i19 = i11 & 1048575;
                i12 = 1 << (i11 >>> 20);
                i10 = i14;
                if (i19 != i13) {
                    i16 = unsafe.getInt(t10, i19);
                    i13 = i19;
                }
            } else {
                i10 = i14;
                i11 = (!z10 || i18 < FieldType.DOUBLE_LIST_PACKED.m3122id() || i18 > FieldType.SINT64_LIST_PACKED.m3122id()) ? 0 : iArr[i10 + 2] & 1048575;
                i12 = 0;
            }
            long j10 = iM3382J & 1048575;
            int i20 = i10;
            switch (i18) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3068d(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 1:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3072h(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 2:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3076l(i17, unsafe.getLong(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 3:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3087w(i17, unsafe.getLong(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 4:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3074j(i17, unsafe.getInt(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 5:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3071g(i17);
                        i15 += iM3068d;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3070f(i17);
                        i15 += iM3068d;
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3066b(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 8:
                    if ((i16 & i12) != 0) {
                        Object object = unsafe.getObject(t10, j10);
                        iM3067c = object instanceof ByteString ? CodedOutputStream.m3067c(i17, (ByteString) object) : CodedOutputStream.m3082r((String) object, i17);
                        i15 = iM3067c + i15;
                    }
                    break;
                case 9:
                    if ((i16 & i12) != 0) {
                        iM3068d = C0878x0.m3483o(i17, m3398n(i20), unsafe.getObject(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 10:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3067c(i17, (ByteString) unsafe.getObject(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 11:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3085u(i17, unsafe.getInt(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 12:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3069e(i17, unsafe.getInt(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 13:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3078n(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 14:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3079o(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 15:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3080p(i17, unsafe.getInt(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 16:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3081q(i17, unsafe.getLong(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 17:
                    if ((i16 & i12) != 0) {
                        iM3068d = CodedOutputStream.m3073i(i17, (InterfaceC0848i0) unsafe.getObject(t10, j10), m3398n(i20));
                        i15 += iM3068d;
                    }
                    break;
                case 18:
                    iM3068d = C0878x0.m3476h(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 19:
                    iM3068d = C0878x0.m3474f(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 20:
                    iM3068d = C0878x0.m3481m(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 21:
                    iM3068d = C0878x0.m3492x(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 22:
                    iM3068d = C0878x0.m3479k(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 23:
                    iM3068d = C0878x0.m3476h(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 24:
                    iM3068d = C0878x0.m3474f(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 25:
                    iM3068d = C0878x0.m3469a(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 26:
                    iM3068d = C0878x0.m3489u(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 27:
                    iM3068d = C0878x0.m3484p(i17, (List) unsafe.getObject(t10, j10), m3398n(i20));
                    i15 += iM3068d;
                    break;
                case 28:
                    iM3068d = C0878x0.m3471c(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 29:
                    iM3068d = C0878x0.m3490v(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 30:
                    iM3068d = C0878x0.m3472d(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 31:
                    iM3068d = C0878x0.m3474f(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 32:
                    iM3068d = C0878x0.m3476h(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 33:
                    iM3068d = C0878x0.m3485q(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 34:
                    iM3068d = C0878x0.m3487s(i17, (List) unsafe.getObject(t10, j10));
                    i15 += iM3068d;
                    break;
                case 35:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 36:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 37:
                    iM3477i = C0878x0.m3482n((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 38:
                    iM3477i = C0878x0.m3493y((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 39:
                    iM3477i = C0878x0.m3480l((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 40:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 41:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 42:
                    iM3477i = C0878x0.m3470b((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 43:
                    iM3477i = C0878x0.m3491w((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 44:
                    iM3477i = C0878x0.m3473e((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 45:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 46:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 47:
                    iM3477i = C0878x0.m3486r((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 48:
                    iM3477i = C0878x0.m3488t((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i11, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i17);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i15 = iM3086v + iM3084t + iM3477i + i15;
                    }
                    break;
                case 49:
                    iM3068d = C0878x0.m3478j(i17, (List) unsafe.getObject(t10, j10), m3398n(i20));
                    i15 += iM3068d;
                    break;
                case 50:
                    iM3068d = this.f5903q.mo3206f(unsafe.getObject(t10, j10), i17, m3397m(i20));
                    i15 += iM3068d;
                    break;
                case 51:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3068d(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 52:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3072h(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 53:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3076l(i17, m3367A(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 54:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3087w(i17, m3367A(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 55:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3074j(i17, m3374z(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 56:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3071g(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 57:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3070f(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 58:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3066b(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 59:
                    if (m3402r(i17, i20, t10)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        iM3067c = object2 instanceof ByteString ? CodedOutputStream.m3067c(i17, (ByteString) object2) : CodedOutputStream.m3082r((String) object2, i17);
                        i15 = iM3067c + i15;
                    }
                    break;
                case 60:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = C0878x0.m3483o(i17, m3398n(i20), unsafe.getObject(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 61:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3067c(i17, (ByteString) unsafe.getObject(t10, j10));
                        i15 += iM3068d;
                    }
                    break;
                case 62:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3085u(i17, m3374z(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 63:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3069e(i17, m3374z(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 64:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3078n(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 65:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3079o(i17);
                        i15 += iM3068d;
                    }
                    break;
                case 66:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3080p(i17, m3374z(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 67:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3081q(i17, m3367A(j10, t10));
                        i15 += iM3068d;
                    }
                    break;
                case 68:
                    if (m3402r(i17, i20, t10)) {
                        iM3068d = CodedOutputStream.m3073i(i17, (InterfaceC0848i0) unsafe.getObject(t10, j10), m3398n(i20));
                        i15 += iM3068d;
                    }
                    break;
            }
            i14 = i20 + 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0595 A[PHI: r2
      0x0595: PHI (r2v4 int) = 
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v1 int)
      (r2v5 int)
      (r2v1 int)
     binds: [B:224:0x058c, B:221:0x057f, B:218:0x056e, B:215:0x055d, B:212:0x054c, B:209:0x053f, B:206:0x0533, B:203:0x0526, B:196:0x0505, B:193:0x04ef, B:190:0x04da, B:187:0x04c8, B:184:0x04b5, B:181:0x04a7, B:178:0x0499, B:175:0x0487, B:172:0x0476, B:169:0x045c, B:145:0x0376, B:139:0x0356, B:133:0x0337, B:128:0x0314, B:123:0x02f4, B:118:0x02d1, B:113:0x02af, B:108:0x028c, B:103:0x026d, B:97:0x024d, B:91:0x0229, B:85:0x0205, B:79:0x01e2, B:74:0x01c4, B:69:0x018a, B:66:0x017c, B:63:0x0169, B:60:0x0157, B:57:0x0144, B:54:0x0136, B:51:0x0128, B:48:0x011a, B:42:0x00f5, B:39:0x00dd, B:36:0x00c7, B:33:0x00b7, B:30:0x00a7, B:27:0x0099, B:24:0x008b, B:21:0x007a, B:18:0x0068, B:226:0x0593, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: p */
    public final int m3400p(T t10) {
        int iM3068d;
        int iM3067c;
        int iM3477i;
        int iM3084t;
        int iM3086v;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f5887a;
            if (i10 >= iArr.length) {
                AbstractC0829b1<?, ?> abstractC0829b1 = this.f5901o;
                return abstractC0829b1.mo3180h(abstractC0829b1.mo3179g(t10)) + i11;
            }
            int iM3382J = m3382J(i10);
            int i12 = (267386880 & iM3382J) >>> 20;
            int i13 = iArr[i10];
            long j10 = iM3382J & 1048575;
            int i14 = (i12 < FieldType.DOUBLE_LIST_PACKED.m3122id() || i12 > FieldType.SINT64_LIST_PACKED.m3122id()) ? 0 : iArr[i10 + 2] & 1048575;
            boolean z10 = this.f5895i;
            Unsafe unsafe = f5886s;
            switch (i12) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3068d(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 1:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3072h(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 2:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3076l(i13, C0841f1.m3227m(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 3:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3087w(i13, C0841f1.m3227m(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 4:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3074j(i13, C0841f1.m3226l(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 5:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3071g(i13);
                        i11 += iM3068d;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3070f(i13);
                        i11 += iM3068d;
                    }
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3066b(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 8:
                    if (m3401q(i10, t10)) {
                        Object objM3228n = C0841f1.m3228n(j10, t10);
                        iM3067c = objM3228n instanceof ByteString ? CodedOutputStream.m3067c(i13, (ByteString) objM3228n) : CodedOutputStream.m3082r((String) objM3228n, i13);
                        i11 += iM3067c;
                    }
                    break;
                case 9:
                    if (m3401q(i10, t10)) {
                        iM3068d = C0878x0.m3483o(i13, m3398n(i10), C0841f1.m3228n(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 10:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3067c(i13, (ByteString) C0841f1.m3228n(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 11:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3085u(i13, C0841f1.m3226l(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 12:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3069e(i13, C0841f1.m3226l(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 13:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3078n(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 14:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3079o(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 15:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3080p(i13, C0841f1.m3226l(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 16:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3081q(i13, C0841f1.m3227m(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 17:
                    if (m3401q(i10, t10)) {
                        iM3068d = CodedOutputStream.m3073i(i13, (InterfaceC0848i0) C0841f1.m3228n(j10, t10), m3398n(i10));
                        i11 += iM3068d;
                    }
                    break;
                case 18:
                    iM3068d = C0878x0.m3476h(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 19:
                    iM3068d = C0878x0.m3474f(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 20:
                    iM3068d = C0878x0.m3481m(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 21:
                    iM3068d = C0878x0.m3492x(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 22:
                    iM3068d = C0878x0.m3479k(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 23:
                    iM3068d = C0878x0.m3476h(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 24:
                    iM3068d = C0878x0.m3474f(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 25:
                    iM3068d = C0878x0.m3469a(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 26:
                    iM3068d = C0878x0.m3489u(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 27:
                    iM3068d = C0878x0.m3484p(i13, m3370s(j10, t10), m3398n(i10));
                    i11 += iM3068d;
                    break;
                case 28:
                    iM3068d = C0878x0.m3471c(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 29:
                    iM3068d = C0878x0.m3490v(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 30:
                    iM3068d = C0878x0.m3472d(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 31:
                    iM3068d = C0878x0.m3474f(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 32:
                    iM3068d = C0878x0.m3476h(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 33:
                    iM3068d = C0878x0.m3485q(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 34:
                    iM3068d = C0878x0.m3487s(i13, m3370s(j10, t10));
                    i11 += iM3068d;
                    break;
                case 35:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 36:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 37:
                    iM3477i = C0878x0.m3482n((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 38:
                    iM3477i = C0878x0.m3493y((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 39:
                    iM3477i = C0878x0.m3480l((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 40:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 41:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 42:
                    iM3477i = C0878x0.m3470b((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 43:
                    iM3477i = C0878x0.m3491w((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 44:
                    iM3477i = C0878x0.m3473e((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 45:
                    iM3477i = C0878x0.m3475g((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 46:
                    iM3477i = C0878x0.m3477i((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 47:
                    iM3477i = C0878x0.m3486r((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 48:
                    iM3477i = C0878x0.m3488t((List) unsafe.getObject(t10, j10));
                    if (iM3477i > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i14, iM3477i);
                        }
                        iM3084t = CodedOutputStream.m3084t(i13);
                        iM3086v = CodedOutputStream.m3086v(iM3477i);
                        i11 += iM3086v + iM3084t + iM3477i;
                    }
                    break;
                case 49:
                    iM3068d = C0878x0.m3478j(i13, m3370s(j10, t10), m3398n(i10));
                    i11 += iM3068d;
                    break;
                case 50:
                    iM3068d = this.f5903q.mo3206f(C0841f1.m3228n(j10, t10), i13, m3397m(i10));
                    i11 += iM3068d;
                    break;
                case 51:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3068d(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 52:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3072h(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 53:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3076l(i13, m3367A(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 54:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3087w(i13, m3367A(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 55:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3074j(i13, m3374z(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 56:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3071g(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 57:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3070f(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 58:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3066b(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 59:
                    if (m3402r(i13, i10, t10)) {
                        Object objM3228n2 = C0841f1.m3228n(j10, t10);
                        iM3067c = objM3228n2 instanceof ByteString ? CodedOutputStream.m3067c(i13, (ByteString) objM3228n2) : CodedOutputStream.m3082r((String) objM3228n2, i13);
                        i11 += iM3067c;
                    }
                    break;
                case 60:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = C0878x0.m3483o(i13, m3398n(i10), C0841f1.m3228n(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 61:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3067c(i13, (ByteString) C0841f1.m3228n(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 62:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3085u(i13, m3374z(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 63:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3069e(i13, m3374z(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 64:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3078n(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 65:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3079o(i13);
                        i11 += iM3068d;
                    }
                    break;
                case 66:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3080p(i13, m3374z(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 67:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3081q(i13, m3367A(j10, t10));
                        i11 += iM3068d;
                    }
                    break;
                case 68:
                    if (m3402r(i13, i10, t10)) {
                        iM3068d = CodedOutputStream.m3073i(i13, (InterfaceC0848i0) C0841f1.m3228n(j10, t10), m3398n(i10));
                        i11 += iM3068d;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: q */
    public final boolean m3401q(int i10, Object obj) {
        boolean zEquals;
        if (!this.f5894h) {
            int i11 = this.f5887a[i10 + 2];
            return (C0841f1.m3226l(i11 & 1048575, obj) & (1 << (i11 >>> 20))) != 0;
        }
        int iM3382J = m3382J(i10);
        long j10 = iM3382J & 1048575;
        switch ((iM3382J & 267386880) >>> 20) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return C0841f1.m3224j(j10, obj) != 0.0d;
            case 1:
                return C0841f1.m3225k(j10, obj) != 0.0f;
            case 2:
                return C0841f1.m3227m(j10, obj) != 0;
            case 3:
                return C0841f1.m3227m(j10, obj) != 0;
            case 4:
                return C0841f1.m3226l(j10, obj) != 0;
            case 5:
                return C0841f1.m3227m(j10, obj) != 0;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C0841f1.m3226l(j10, obj) != 0;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return C0841f1.m3220f(j10, obj);
            case 8:
                Object objM3228n = C0841f1.m3228n(j10, obj);
                if (objM3228n instanceof String) {
                    zEquals = ((String) objM3228n).isEmpty();
                } else {
                    if (!(objM3228n instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.f5793b.equals(objM3228n);
                }
                break;
            case 9:
                return C0841f1.m3228n(j10, obj) != null;
            case 10:
                zEquals = ByteString.f5793b.equals(C0841f1.m3228n(j10, obj));
                break;
            case 11:
                return C0841f1.m3226l(j10, obj) != 0;
            case 12:
                return C0841f1.m3226l(j10, obj) != 0;
            case 13:
                return C0841f1.m3226l(j10, obj) != 0;
            case 14:
                return C0841f1.m3227m(j10, obj) != 0;
            case 15:
                return C0841f1.m3226l(j10, obj) != 0;
            case 16:
                return C0841f1.m3227m(j10, obj) != 0;
            case 17:
                return C0841f1.m3228n(j10, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3402r(int i10, int i11, Object obj) {
        return C0841f1.m3226l((long) (this.f5887a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX INFO: renamed from: t */
    public final <K, V> void m3403t(Object obj, int i10, Object obj2, C0855m c0855m, InterfaceC0874v0 interfaceC0874v0) throws IOException {
        long jM3382J = m3382J(i10) & 1048575;
        Object objM3228n = C0841f1.m3228n(jM3382J, obj);
        InterfaceC0834d0 interfaceC0834d0 = this.f5903q;
        if (objM3228n == null) {
            objM3228n = interfaceC0834d0.mo3204d();
            C0841f1.m3235u(jM3382J, obj, objM3228n);
        } else if (interfaceC0834d0.mo3207g(objM3228n)) {
            MapFieldLite mapFieldLiteMo3204d = interfaceC0834d0.mo3204d();
            interfaceC0834d0.mo3201a(mapFieldLiteMo3204d, objM3228n);
            C0841f1.m3235u(jM3382J, obj, mapFieldLiteMo3204d);
            objM3228n = mapFieldLiteMo3204d;
        }
        interfaceC0874v0.mo3335r(interfaceC0834d0.mo3205e(objM3228n), interfaceC0834d0.mo3203c(obj2), c0855m);
    }

    /* JADX INFO: renamed from: u */
    public final void m3404u(Object obj, int i10, Object obj2) {
        long jM3382J = m3382J(i10) & 1048575;
        if (m3401q(i10, obj2)) {
            Object objM3228n = C0841f1.m3228n(jM3382J, obj);
            Object objM3228n2 = C0841f1.m3228n(jM3382J, obj2);
            if (objM3228n != null && objM3228n2 != null) {
                C0841f1.m3235u(jM3382J, obj, C0871u.m3441b(objM3228n, objM3228n2));
                m3380H(i10, obj);
            } else {
                if (objM3228n2 != null) {
                    C0841f1.m3235u(jM3382J, obj, objM3228n2);
                    m3380H(i10, obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3405v(Object obj, int i10, Object obj2) {
        int iM3382J = m3382J(i10);
        int i11 = this.f5887a[i10];
        long j10 = iM3382J & 1048575;
        if (m3402r(i11, i10, obj2)) {
            Object objM3228n = C0841f1.m3228n(j10, obj);
            Object objM3228n2 = C0841f1.m3228n(j10, obj2);
            if (objM3228n != null && objM3228n2 != null) {
                C0841f1.m3235u(j10, obj, C0871u.m3441b(objM3228n, objM3228n2));
                m3381I(i11, i10, obj);
            } else {
                if (objM3228n2 != null) {
                    C0841f1.m3235u(j10, obj, objM3228n2);
                    m3381I(i11, i10, obj);
                }
            }
        }
    }
}
