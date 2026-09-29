package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.measurement.AbstractC0958b;
import com.google.android.gms.internal.measurement.AbstractC0961e;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzadl;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.measurement.zzagn;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class xib implements fjb {

    /* JADX INFO: renamed from: k */
    public static final int[] f68263k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Unsafe f68264l = tjb.m22164l();

    /* JADX INFO: renamed from: a */
    public final int[] f68265a;

    /* JADX INFO: renamed from: b */
    public final Object[] f68266b;

    /* JADX INFO: renamed from: c */
    public final int f68267c;

    /* JADX INFO: renamed from: d */
    public final int f68268d;

    /* JADX INFO: renamed from: e */
    public final bhb f68269e;

    /* JADX INFO: renamed from: f */
    public final boolean f68270f;

    /* JADX INFO: renamed from: g */
    public final int[] f68271g;

    /* JADX INFO: renamed from: h */
    public final int f68272h;

    /* JADX INFO: renamed from: i */
    public final int f68273i;

    /* JADX INFO: renamed from: j */
    public final iy5 f68274j;

    public xib(int[] iArr, Object[] objArr, int i, int i2, bhb bhbVar, int[] iArr2, int i3, int i4, iy5 iy5Var, u06 u06Var) {
        this.f68265a = iArr;
        this.f68266b = objArr;
        this.f68267c = i;
        this.f68268d = i2;
        this.f68270f = bhbVar instanceof whb;
        this.f68271g = iArr2;
        this.f68272h = i3;
        this.f68273i = i4;
        this.f68274j = iy5Var;
        this.f68269e = bhbVar;
    }

    /* JADX INFO: renamed from: k */
    public static int m24527k(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m24528l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof whb) {
            return ((whb) obj).m23962f();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m24529m(Object obj) {
        if (m24528l(obj)) {
            return;
        }
        C3386nv.m17626m("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: n */
    public static int m24530n(Object obj, long j) {
        return ((Integer) tjb.m22161i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: o */
    public static long m24531o(Object obj, long j) {
        return ((Long) tjb.m22161i(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: w */
    public static final int m24532w(byte[] bArr, int i, int i2, zzagm zzagmVar, Class cls, ehb ehbVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                ehbVar.f37269c = Double.valueOf(Double.longBitsToDouble(eja.m11188f(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                ehbVar.f37269c = Float.valueOf(Float.intBitsToFloat(eja.m11187e(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iM11186d = eja.m11186d(bArr, i, ehbVar);
                ehbVar.f37269c = Long.valueOf(ehbVar.f37268b);
                return iM11186d;
            case 4:
            case 12:
            case 13:
                int iM11184b = eja.m11184b(bArr, i, ehbVar);
                ehbVar.f37269c = Integer.valueOf(ehbVar.f37267a);
                return iM11184b;
            case 5:
            case 15:
                int i5 = i + 8;
                ehbVar.f37269c = Long.valueOf(eja.m11188f(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                ehbVar.f37269c = Integer.valueOf(eja.m11187e(i, bArr));
                return i6;
            case 7:
                int iM11186d2 = eja.m11186d(bArr, i, ehbVar);
                ehbVar.f37269c = Boolean.valueOf(ehbVar.f37268b != 0);
                return iM11186d2;
            case 8:
                return eja.m11189g(bArr, i, ehbVar);
            case 9:
            default:
                ho2.m13385e("unsupported field type.");
                return 0;
            case 10:
                fjb fjbVarM4784a = cjb.f10181c.m4784a(cls);
                whb whbVarZza = fjbVarM4784a.zza();
                int iM11191i = eja.m11191i(whbVarZza, fjbVarM4784a, bArr, i, i2, ehbVar);
                fjbVarM4784a.mo11892a(whbVarZza);
                ehbVar.f37269c = whbVarZza;
                return iM11191i;
            case 11:
                return eja.m11190h(bArr, i, ehbVar);
            case 16:
                int iM11184b2 = eja.m11184b(bArr, i, ehbVar);
                ehbVar.f37269c = Integer.valueOf(ghb.m12664j(ehbVar.f37267a));
                return iM11184b2;
            case 17:
                int iM11186d3 = eja.m11186d(bArr, i, ehbVar);
                ehbVar.f37269c = Long.valueOf(ghb.m12665k(ehbVar.f37268b));
                return iM11186d3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x0354  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    /* JADX INFO: renamed from: y */
    public static xib m24533y(ejb ejbVar, iy5 iy5Var, u06 u06Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldM24534z;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM24534z2;
        int i28;
        Object obj2;
        Field fieldM24534z3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(ejbVar instanceof ejb)) {
            ho2.m13383c();
            return null;
        }
        String str = ejbVar.f37368b;
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
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f68263k;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = f68264l;
        Object[] objArr2 = ejbVar.f37369c;
        Class<?> cls = ejbVar.f37367a.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & 2048;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (ejbVar.m11198a() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldM24534z2 = (Field) obj;
                    } else {
                        fieldM24534z2 = m24534z(cls, (String) obj);
                        objArr4[i27] = fieldM24534z2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM24534z2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldM24534z3 = (Field) obj2;
                    } else {
                        fieldM24534z3 = m24534z(cls, (String) obj2);
                        objArr4[i28] = fieldM24534z3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM24534z3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldM24534z2 = (Field) obj;
                } else {
                    fieldM24534z2 = m24534z(cls, (String) obj);
                    objArr4[i27] = fieldM24534z2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM24534z2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldM24534z3 = (Field) obj2;
                } else {
                    fieldM24534z3 = m24534z(cls, (String) obj2);
                    objArr4[i28] = fieldM24534z3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM24534z3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldM24534z4 = m24534z(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldM24534z4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (ejbVar.m11198a() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM24534z4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldM24534z = (Field) obj3;
                            } else {
                                fieldM24534z = m24534z(cls, (String) obj3);
                                objArr4[i98] = fieldM24534z;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM24534z);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM24534z4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM24534z4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new xib(iArr3, objArr3, i2, i5, ejbVar.f37367a, iArr, i7, i62, iy5Var, u06Var);
    }

    /* JADX INFO: renamed from: z */
    public static Field m24534z(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            AbstractC3393o1.m17725C(sb, "Field ", str, " for ", name);
            ij6.m13958p(AbstractC3393o1.m17738m(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m24535A(int i, Object obj, Object obj2) {
        if (m24549r(i, obj2)) {
            int iM24546j = m24546j(i) & 1048575;
            Unsafe unsafe = f68264l;
            long j = iM24546j;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.f68265a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            fjb fjbVarM24537C = m24537C(i);
            if (!m24549r(i, obj)) {
                if (m24528l(object)) {
                    whb whbVarZza = fjbVarM24537C.zza();
                    fjbVarM24537C.mo11893b(whbVarZza, object);
                    unsafe.putObject(obj, j, whbVarZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m24550s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m24528l(object2)) {
                whb whbVarZza2 = fjbVarM24537C.zza();
                fjbVarM24537C.mo11893b(whbVarZza2, object2);
                unsafe.putObject(obj, j, whbVarZza2);
                object2 = whbVarZza2;
            }
            fjbVarM24537C.mo11893b(object2, object);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m24536B(int i, Object obj, Object obj2) {
        int[] iArr = this.f68265a;
        int i2 = iArr[i];
        if (m24551t(i2, obj2, i)) {
            int iM24546j = m24546j(i) & 1048575;
            Unsafe unsafe = f68264l;
            long j = iM24546j;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            fjb fjbVarM24537C = m24537C(i);
            if (!m24551t(i2, obj, i)) {
                if (m24528l(object)) {
                    whb whbVarZza = fjbVarM24537C.zza();
                    fjbVarM24537C.mo11893b(whbVarZza, object);
                    unsafe.putObject(obj, j, whbVarZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m24552u(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m24528l(object2)) {
                whb whbVarZza2 = fjbVarM24537C.zza();
                fjbVarM24537C.mo11893b(whbVarZza2, object2);
                unsafe.putObject(obj, j, whbVarZza2);
                object2 = whbVarZza2;
            }
            fjbVarM24537C.mo11893b(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final fjb m24537C(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f68266b;
        fjb fjbVar = (fjb) objArr[i3];
        if (fjbVar != null) {
            return fjbVar;
        }
        fjb fjbVarM4784a = cjb.f10181c.m4784a((Class) objArr[i3 + 1]);
        objArr[i3] = fjbVarM4784a;
        return fjbVarM4784a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m24538D(int i) {
        int i2 = i / 3;
        return this.f68266b[i2 + i2];
    }

    /* JADX INFO: renamed from: E */
    public final zhb m24539E(int i) {
        int i2 = i / 3;
        return (zhb) this.f68266b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: F */
    public final Object m24540F(int i, Object obj) {
        fjb fjbVarM24537C = m24537C(i);
        int iM24546j = m24546j(i) & 1048575;
        if (!m24549r(i, obj)) {
            return fjbVarM24537C.zza();
        }
        Object object = f68264l.getObject(obj, iM24546j);
        if (m24528l(object)) {
            return object;
        }
        whb whbVarZza = fjbVarM24537C.zza();
        if (object != null) {
            fjbVarM24537C.mo11893b(whbVarZza, object);
        }
        return whbVarZza;
    }

    /* JADX INFO: renamed from: G */
    public final void m24541G(int i, Object obj, Object obj2) {
        f68264l.putObject(obj, m24546j(i) & 1048575, obj2);
        m24550s(i, obj);
    }

    /* JADX INFO: renamed from: H */
    public final Object m24542H(int i, Object obj, int i2) {
        fjb fjbVarM24537C = m24537C(i2);
        if (!m24551t(i, obj, i2)) {
            return fjbVarM24537C.zza();
        }
        Object object = f68264l.getObject(obj, m24546j(i2) & 1048575);
        if (m24528l(object)) {
            return object;
        }
        whb whbVarZza = fjbVarM24537C.zza();
        if (object != null) {
            fjbVarM24537C.mo11893b(whbVarZza, object);
        }
        return whbVarZza;
    }

    /* JADX INFO: renamed from: I */
    public final void m24543I(Object obj, int i, int i2, Object obj2) {
        f68264l.putObject(obj, m24546j(i2) & 1048575, obj2);
        m24552u(i, obj, i2);
    }

    /* JADX INFO: renamed from: J */
    public final Object m24544J(Object obj, int i, Object obj2, iy5 iy5Var, Object obj3) {
        zhb zhbVarM24539E;
        int i2 = this.f68265a[i];
        Object objM22161i = tjb.m22161i(obj, m24546j(i) & 1048575);
        if (objM22161i == null || (zhbVarM24539E = m24539E(i)) == null) {
            return obj2;
        }
        sq5 sq5Var = ((qib) m24538D(i)).f57837a;
        Iterator it = ((zzaew) objM22161i).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zhbVarM24539E.mo22576a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    iy5Var.getClass();
                    obj2 = iy5.m14201t(obj3);
                }
                int iM19980b = qib.m19980b(sq5Var, entry.getKey(), entry.getValue());
                zzacr zzacrVar = zzacr.f11869b;
                byte[] bArr = new byte[iM19980b];
                boolean z = nhb.f52743b;
                hhb hhbVar = new hhb(iM19980b, bArr);
                try {
                    qib.m19979a(hhbVar, sq5Var, entry.getKey(), entry.getValue());
                    zzacr zzacrVarM5359a = AbstractC0958b.m5359a(hhbVar, bArr);
                    iy5Var.getClass();
                    ((ojb) obj2).m18051d((i2 << 3) | 2, zzacrVarM5359a);
                    it.remove();
                } catch (IOException e) {
                    v63.m23141s(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: K */
    public final void m24545K(int i, k80 k80Var, Object obj) {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            tjb.m22162j(obj, j, k80Var.m14965N());
        } else if (this.f68270f) {
            tjb.m22162j(obj, j, k80Var.m14964M());
        } else {
            tjb.m22162j(obj, j, k80Var.m14968Q());
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // p000.fjb
    /* JADX INFO: renamed from: a */
    public final void mo11892a(Object obj) {
        if (!m24528l(obj)) {
            return;
        }
        if (obj instanceof whb) {
            whb whbVar = (whb) obj;
            whbVar.m23967k();
            whbVar.zza = 0;
            whbVar.m23963g();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f68265a;
            if (i >= iArr.length) {
                this.f68274j.getClass();
                ojb ojbVar = ((whb) obj).zzc;
                if (ojbVar.f54474e) {
                    ojbVar.f54474e = false;
                    return;
                }
                return;
            }
            int iM24546j = m24546j(i);
            int i2 = 1048575 & iM24546j;
            int iM24527k = m24527k(iM24546j);
            long j = i2;
            if (iM24527k != 9) {
                if (iM24527k != 60 && iM24527k != 68) {
                    switch (iM24527k) {
                        case 17:
                            if (m24549r(i, obj)) {
                                m24537C(i).mo11892a(f68264l.getObject(obj, j));
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
                            chb chbVar = (chb) ((mib) tjb.m22161i(obj, j));
                            if (chbVar.f10103a) {
                                chbVar.f10103a = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = f68264l;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzaew) object).f11873a = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (m24551t(iArr[i], obj, i)) {
                    m24537C(i).mo11892a(f68264l.getObject(obj, j));
                }
            } else if (m24549r(i, obj)) {
                m24537C(i).mo11892a(f68264l.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.fjb
    /* JADX INFO: renamed from: b */
    public final void mo11893b(Object obj, Object obj2) {
        Object obj3;
        m24529m(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f68265a;
            if (i >= iArr.length) {
                gjb.m12690b(obj, obj2);
                return;
            }
            int iM24546j = m24546j(i);
            int i2 = 1048575 & iM24546j;
            int iM24527k = m24527k(iM24546j);
            int i3 = iArr[i];
            long j = i2;
            switch (iM24527k) {
                case 0:
                    if (!m24549r(i, obj2)) {
                        obj3 = obj;
                    } else {
                        sjb sjbVar = tjb.f62429c;
                        obj3 = obj;
                        sjbVar.mo20009l(obj3, j, sjbVar.mo20008j(obj2, j));
                        m24550s(i, obj3);
                    }
                    break;
                case 1:
                    if (m24549r(i, obj2)) {
                        sjb sjbVar2 = tjb.f62429c;
                        sjbVar2.mo20007i(obj, j, sjbVar2.mo20006f(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m24549r(i, obj2)) {
                        tjb.m22160h(obj, j, tjb.m22159g(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m24549r(i, obj2)) {
                        tjb.m22160h(obj, j, tjb.m22159g(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m24549r(i, obj2)) {
                        tjb.m22160h(obj, j, tjb.m22159g(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m24549r(i, obj2)) {
                        sjb sjbVar3 = tjb.f62429c;
                        sjbVar3.mo4820e(obj, j, sjbVar3.mo20005d(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m24549r(i, obj2)) {
                        tjb.m22162j(obj, j, tjb.m22161i(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m24535A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m24549r(i, obj2)) {
                        tjb.m22162j(obj, j, tjb.m22161i(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m24549r(i, obj2)) {
                        tjb.m22160h(obj, j, tjb.m22159g(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m24549r(i, obj2)) {
                        tjb.m22158f(j, obj, tjb.m22157e(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m24549r(i, obj2)) {
                        tjb.m22160h(obj, j, tjb.m22159g(obj2, j));
                        m24550s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m24535A(i, obj, obj2);
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
                    mib mibVarMo10419Y = (mib) tjb.m22161i(obj, j);
                    mib mibVar = (mib) tjb.m22161i(obj2, j);
                    int size = mibVarMo10419Y.size();
                    int size2 = mibVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((chb) mibVarMo10419Y).f10103a) {
                            mibVarMo10419Y = mibVarMo10419Y.mo10419Y(size2 + size);
                        }
                        mibVarMo10419Y.addAll(mibVar);
                    }
                    if (size > 0) {
                        mibVar = mibVarMo10419Y;
                    }
                    tjb.m22162j(obj, j, mibVar);
                    obj3 = obj;
                    break;
                case 50:
                    iy5 iy5Var = gjb.f40885a;
                    tjb.m22162j(obj, j, nj0.m17454q(tjb.m22161i(obj, j), tjb.m22161i(obj2, j)));
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
                    if (m24551t(i3, obj2, i)) {
                        tjb.m22162j(obj, j, tjb.m22161i(obj2, j));
                        m24552u(i3, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m24536B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m24551t(i3, obj2, i)) {
                        tjb.m22162j(obj, j, tjb.m22161i(obj2, j));
                        m24552u(i3, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m24536B(i, obj, obj2);
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

    @Override // p000.fjb
    /* JADX INFO: renamed from: c */
    public final void mo11894c(Object obj, gw9 gw9Var) {
        int i;
        nhb nhbVar = (nhb) gw9Var.f41432b;
        Unsafe unsafe = f68264l;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f68265a;
            if (i4 >= iArr.length) {
                ((whb) obj).zzc.m18049b(gw9Var);
                return;
            }
            int iM24546j = m24546j(i4);
            int iM24527k = m24527k(iM24546j);
            int i6 = iArr[i4];
            if (iM24527k <= 17) {
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
            long j = iM24546j & i2;
            switch (iM24527k) {
                case 0:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13261i(i6, Double.doubleToRawLongBits(tjb.f62429c.mo20008j(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13259g(i6, Float.floatToRawIntBits(tjb.f62429c.mo20006f(obj, j)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13260h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13260h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13257e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13261i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13259g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13262j(i6, tjb.f62429c.mo20005d(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            nhbVar.mo13263k(i6, (String) object);
                        } else {
                            nhbVar.mo13264l(i6, (zzacr) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        gw9Var.m12943n(i6, unsafe.getObject(obj, j), m24537C(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13264l(i6, (zzacr) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13258f(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13257e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13259g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        nhbVar.mo13261i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        nhbVar.mo13258f(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        nhbVar.mo13260h(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (m24548q(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        nhbVar.mo13256d(i6, 3);
                        m24537C(i4).mo11894c((bhb) object2, gw9Var);
                        nhbVar.mo13256d(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    gjb.m12692d(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    gjb.m12693e(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    gjb.m12694f(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    gjb.m12695g(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    gjb.m12699k(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    gjb.m12697i(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    gjb.m12702n(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    gjb.m12705q(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    iy5 iy5Var = gjb.f40885a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof nib) {
                            nib nibVar = (nib) list;
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                Object objM17444c = nibVar.m17444c();
                                if (objM17444c instanceof String) {
                                    nhbVar.mo13263k(i10, (String) objM17444c);
                                } else {
                                    nhbVar.mo13264l(i10, (zzacr) objM17444c);
                                }
                            }
                        } else {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                nhbVar.mo13263k(i10, (String) list.get(i12));
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    int i13 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    fjb fjbVarM24537C = m24537C(i4);
                    iy5 iy5Var2 = gjb.f40885a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            gw9Var.m12943n(i13, list2.get(i14), fjbVarM24537C);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    iy5 iy5Var3 = gjb.f40885a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            nhbVar.mo13264l(i15, (zzacr) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    gjb.m12700l(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    gjb.m12704p(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    gjb.m12703o(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    gjb.m12698j(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    gjb.m12701m(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    gjb.m12696h(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    gjb.m12692d(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    gjb.m12693e(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    gjb.m12694f(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 38:
                    gjb.m12695g(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    gjb.m12699k(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    gjb.m12697i(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    gjb.m12702n(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 42:
                    gjb.m12705q(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 43:
                    gjb.m12700l(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    gjb.m12704p(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    gjb.m12703o(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 46:
                    gjb.m12698j(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 47:
                    gjb.m12701m(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case eda.f37086g /* 48 */:
                    gjb.m12696h(iArr[i4], (List) unsafe.getObject(obj, j), gw9Var, true);
                    break;
                case 49:
                    int i17 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    fjb fjbVarM24537C2 = m24537C(i4);
                    iy5 iy5Var4 = gjb.f40885a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            bhb bhbVar = (bhb) list4.get(i18);
                            nhbVar.mo13256d(i17, 3);
                            fjbVarM24537C2.mo11894c(bhbVar, gw9Var);
                            nhbVar.mo13256d(i17, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        sq5 sq5Var = ((qib) m24538D(i4)).f57837a;
                        for (Map.Entry entry : ((zzaew) object3).entrySet()) {
                            nhbVar.mo13256d(i6, 2);
                            nhbVar.mo13270r(qib.m19980b(sq5Var, entry.getKey(), entry.getValue()));
                            qib.m19979a(nhbVar, sq5Var, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13261i(i6, Double.doubleToRawLongBits(((Double) tjb.m22161i(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13259g(i6, Float.floatToRawIntBits(((Float) tjb.m22161i(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13260h(i6, m24531o(obj, j));
                    }
                    break;
                case 54:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13260h(i6, m24531o(obj, j));
                    }
                    break;
                case 55:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13257e(i6, m24530n(obj, j));
                    }
                    break;
                case 56:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13261i(i6, m24531o(obj, j));
                    }
                    break;
                case 57:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13259g(i6, m24530n(obj, j));
                    }
                    break;
                case 58:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13262j(i6, ((Boolean) tjb.m22161i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (m24551t(i6, obj, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            nhbVar.mo13263k(i6, (String) object4);
                        } else {
                            nhbVar.mo13264l(i6, (zzacr) object4);
                        }
                    }
                    break;
                case 60:
                    if (m24551t(i6, obj, i4)) {
                        gw9Var.m12943n(i6, unsafe.getObject(obj, j), m24537C(i4));
                    }
                    break;
                case 61:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13264l(i6, (zzacr) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13258f(i6, m24530n(obj, j));
                    }
                    break;
                case 63:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13257e(i6, m24530n(obj, j));
                    }
                    break;
                case 64:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13259g(i6, m24530n(obj, j));
                    }
                    break;
                case 65:
                    if (m24551t(i6, obj, i4)) {
                        nhbVar.mo13261i(i6, m24531o(obj, j));
                    }
                    break;
                case 66:
                    if (m24551t(i6, obj, i4)) {
                        int iM24530n = m24530n(obj, j);
                        nhbVar.mo13258f(i6, (iM24530n >> 31) ^ (iM24530n + iM24530n));
                    }
                    break;
                case 67:
                    if (m24551t(i6, obj, i4)) {
                        long jM24531o = m24531o(obj, j);
                        nhbVar.mo13260h(i6, (jM24531o >> 63) ^ (jM24531o + jM24531o));
                    }
                    break;
                case 68:
                    if (m24551t(i6, obj, i4)) {
                        Object object5 = unsafe.getObject(obj, j);
                        nhbVar.mo13256d(i6, 3);
                        m24537C(i4).mo11894c((bhb) object5, gw9Var);
                        nhbVar.mo13256d(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    @Override // p000.fjb
    /* JADX INFO: renamed from: d */
    public final int mo11895d(bhb bhbVar) {
        int i;
        int iM17434a;
        int iM17435b;
        int iM17434a2;
        int iM5405b;
        int iM17434a3;
        int iMo3726b;
        int i2;
        int iM17434a4;
        int iM12714z;
        int i3;
        int iMo3726b2;
        int iM17434a5;
        int size;
        int iM12707s;
        int iM17434a6;
        int iM17434a7;
        int iM17434a8;
        int size2;
        int iM17434a9;
        int iMo3726b3;
        int iM17434a10;
        int iM17435b2;
        int iM17434a11;
        int iM5405b2;
        int iM24530n;
        int iM17434a12;
        Unsafe unsafe = f68264l;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM12425b = 0;
        while (true) {
            int[] iArr = this.f68265a;
            if (i6 >= iArr.length) {
                return ((whb) bhbVar).zzc.m18050c() + iM12425b;
            }
            int iM24546j = m24546j(i6);
            int iM24527k = m24527k(iM24546j);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            if (iM24527k <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(bhbVar, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM24546j & i4;
            if (iM24527k >= zzadl.zzJ.zza()) {
                zzadl.zzW.zza();
            }
            long j = i11;
            switch (iM24527k) {
                case 0:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 1:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 2:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(bhbVar, j);
                        iM17434a = nhb.m17434a(i8 << 3);
                        iM17435b = nhb.m17435b(j2);
                        iM12714z = iM17435b + iM17434a;
                        iM12425b += iM12714z;
                    }
                    break;
                case 3:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(bhbVar, j);
                        iM17434a = nhb.m17434a(i8 << 3);
                        iM17435b = nhb.m17435b(j3);
                        iM12714z = iM17435b + iM17434a;
                        iM12425b += iM12714z;
                    }
                    break;
                case 4:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(bhbVar, j);
                        iM17434a = nhb.m17434a(i8 << 3);
                        iM17435b = nhb.m17435b(j4);
                        iM12714z = iM17435b + iM17434a;
                        iM12425b += iM12714z;
                    }
                    break;
                case 5:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 6:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 7:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 1, iM12425b);
                    }
                    break;
                case 8:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(bhbVar, j);
                        if (object instanceof zzacr) {
                            iM17434a2 = nhb.m17434a(i12);
                            iM5405b = ((zzacr) object).mo5422f();
                        } else {
                            iM17434a2 = nhb.m17434a(i12);
                            iM5405b = AbstractC0961e.m5405b((String) object);
                        }
                        iM12425b = g9a.m12426c(iM5405b, iM5405b, iM17434a2, iM12425b);
                    }
                    break;
                case 9:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(bhbVar, j);
                        fjb fjbVarM24537C = m24537C(i6);
                        iy5 iy5Var = gjb.f40885a;
                        iM17434a3 = nhb.m17434a(i8 << 3);
                        iMo3726b = ((bhb) object2).mo3726b(fjbVarM24537C);
                        iM12425b = g9a.m12426c(iMo3726b, iMo3726b, iM17434a3, iM12425b);
                    }
                    break;
                case 10:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(bhbVar, j);
                        iM17434a2 = nhb.m17434a(i8 << 3);
                        iM5405b = zzacrVar.mo5422f();
                        iM12425b = g9a.m12426c(iM5405b, iM5405b, iM17434a2, iM12425b);
                    }
                    break;
                case 11:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(bhbVar, j);
                        iM17434a4 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12425b(i2, iM17434a4, iM12425b);
                    }
                    break;
                case 12:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(bhbVar, j);
                        iM17434a = nhb.m17434a(i8 << 3);
                        iM17435b = nhb.m17435b(j5);
                        iM12714z = iM17435b + iM17434a;
                        iM12425b += iM12714z;
                    }
                    break;
                case 13:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 14:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 15:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(bhbVar, j);
                        iM17434a4 = nhb.m17434a(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iM12425b = g9a.m12425b(i2, iM17434a4, iM12425b);
                    }
                    break;
                case 16:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(bhbVar, j);
                        iM17434a = nhb.m17434a(i8 << 3);
                        iM17435b = nhb.m17435b((j6 >> 63) ^ (j6 + j6));
                        iM12714z = iM17435b + iM17434a;
                        iM12425b += iM12714z;
                    }
                    break;
                case 17:
                    if (m24548q(bhbVar, i6, i5, i7, i)) {
                        bhb bhbVar2 = (bhb) unsafe.getObject(bhbVar, j);
                        fjb fjbVarM24537C2 = m24537C(i6);
                        iy5 iy5Var2 = gjb.f40885a;
                        int iM17434a13 = nhb.m17434a(i8 << 3);
                        i3 = iM17434a13 + iM17434a13;
                        iMo3726b2 = bhbVar2.mo3726b(fjbVarM24537C2);
                        iM12714z = iMo3726b2 + i3;
                        iM12425b += iM12714z;
                    }
                    break;
                case 18:
                    iM12714z = gjb.m12714z(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 19:
                    iM12714z = gjb.m12713y(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var3 = gjb.f40885a;
                    if (list.size() == 0) {
                        iM17434a5 = 0;
                    } else {
                        iM17434a5 = (nhb.m17434a(i8 << 3) * list.size()) + gjb.m12706r(list);
                    }
                    iM12425b += iM17434a5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var4 = gjb.f40885a;
                    size = list2.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12707s(list2);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var5 = gjb.f40885a;
                    size = list3.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12710v(list3);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM12714z = gjb.m12714z(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 24:
                    iM12714z = gjb.m12713y(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var6 = gjb.f40885a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM17434a5 = 0;
                    } else {
                        iM17434a5 = (nhb.m17434a(i8 << 3) + 1) * size3;
                    }
                    iM12425b += iM17434a5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var7 = gjb.f40885a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM17434a7 = nhb.m17434a(i8 << 3) * size4;
                        if (list5 instanceof nib) {
                            nib nibVar = (nib) list5;
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object objM17444c = nibVar.m17444c();
                                int iMo5422f = objM17444c instanceof zzacr ? ((zzacr) objM17444c).mo5422f() : AbstractC0961e.m5405b((String) objM17444c);
                                iM17434a7 = g9a.m12425b(iMo5422f, iMo5422f, iM17434a7);
                            }
                        } else {
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object obj = list5.get(i15);
                                int iMo5422f2 = obj instanceof zzacr ? ((zzacr) obj).mo5422f() : AbstractC0961e.m5405b((String) obj);
                                iM17434a7 = g9a.m12425b(iMo5422f2, iMo5422f2, iM17434a7);
                            }
                        }
                    }
                    iM12425b += iM17434a7;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(bhbVar, j);
                    fjb fjbVarM24537C3 = m24537C(i6);
                    iy5 iy5Var8 = gjb.f40885a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM17434a8 = 0;
                    } else {
                        iM17434a8 = nhb.m17434a(i8 << 3) * size5;
                        for (int i16 = 0; i16 < size5; i16++) {
                            int iMo3726b4 = ((bhb) list6.get(i16)).mo3726b(fjbVarM24537C3);
                            iM17434a8 = g9a.m12425b(iMo3726b4, iMo3726b4, iM17434a8);
                        }
                    }
                    iM12425b += iM17434a8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var9 = gjb.f40885a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM17434a7 = nhb.m17434a(i8 << 3) * size6;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int iMo5422f3 = ((zzacr) list7.get(i17)).mo5422f();
                            iM17434a7 = g9a.m12425b(iMo5422f3, iMo5422f3, iM17434a7);
                        }
                    }
                    iM12425b += iM17434a7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var10 = gjb.f40885a;
                    size = list8.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12711w(list8);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var11 = gjb.f40885a;
                    size = list9.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12709u(list9);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM12714z = gjb.m12713y(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 32:
                    iM12714z = gjb.m12714z(i8, (List) unsafe.getObject(bhbVar, j));
                    iM12425b += iM12714z;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var12 = gjb.f40885a;
                    size = list10.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12712x(list10);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var13 = gjb.f40885a;
                    size = list11.size();
                    if (size == 0) {
                        iM17434a7 = 0;
                    } else {
                        iM12707s = gjb.m12708t(list11);
                        iM17434a6 = nhb.m17434a(i8 << 3);
                        iM17434a7 = (iM17434a6 * size) + iM12707s;
                    }
                    iM12425b += iM17434a7;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    List list12 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var14 = gjb.f40885a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var15 = gjb.f40885a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    size2 = gjb.m12706r((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 38:
                    size2 = gjb.m12707s((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size2 = gjb.m12710v((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    List list14 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var16 = gjb.f40885a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    List list15 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var17 = gjb.f40885a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var18 = gjb.f40885a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 43:
                    size2 = gjb.m12711w((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size2 = gjb.m12709u((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var19 = gjb.f40885a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(bhbVar, j);
                    iy5 iy5Var20 = gjb.f40885a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 47:
                    size2 = gjb.m12712x((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case eda.f37086g /* 48 */:
                    size2 = gjb.m12708t((List) unsafe.getObject(bhbVar, j));
                    if (size2 > 0) {
                        iM17434a9 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12426c(size2, iM17434a9, size2, iM12425b);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(bhbVar, j);
                    fjb fjbVarM24537C4 = m24537C(i6);
                    iy5 iy5Var21 = gjb.f40885a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo3726b3 = 0;
                    } else {
                        iMo3726b3 = 0;
                        for (int i18 = 0; i18 < size7; i18++) {
                            bhb bhbVar3 = (bhb) list19.get(i18);
                            int iM17434a14 = nhb.m17434a(i8 << 3);
                            iMo3726b3 += bhbVar3.mo3726b(fjbVarM24537C4) + iM17434a14 + iM17434a14;
                        }
                    }
                    iM12425b += iMo3726b3;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(bhbVar, j);
                    qib qibVar = (qib) m24538D(i6);
                    if (zzaewVar.isEmpty()) {
                        iM17434a7 = 0;
                    } else {
                        iM17434a7 = 0;
                        for (Map.Entry entry : zzaewVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            sq5 sq5Var = qibVar.f57837a;
                            int iM17434a15 = nhb.m17434a(i8 << 3);
                            int iM19980b = qib.m19980b(sq5Var, key, value);
                            iM17434a7 = g9a.m12426c(iM19980b, iM19980b, iM17434a15, iM17434a7);
                        }
                    }
                    iM12425b += iM17434a7;
                    break;
                case 51:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 52:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 53:
                    if (m24551t(i8, bhbVar, i6)) {
                        long jM24531o = m24531o(bhbVar, j);
                        iM17434a10 = nhb.m17434a(i8 << 3);
                        iM17435b2 = nhb.m17435b(jM24531o);
                        iM12425b += iM17435b2 + iM17434a10;
                    }
                    break;
                case 54:
                    if (m24551t(i8, bhbVar, i6)) {
                        long jM24531o2 = m24531o(bhbVar, j);
                        iM17434a10 = nhb.m17434a(i8 << 3);
                        iM17435b2 = nhb.m17435b(jM24531o2);
                        iM12425b += iM17435b2 + iM17434a10;
                    }
                    break;
                case 55:
                    if (m24551t(i8, bhbVar, i6)) {
                        long jM24530n = m24530n(bhbVar, j);
                        iM17434a10 = nhb.m17434a(i8 << 3);
                        iM17435b2 = nhb.m17435b(jM24530n);
                        iM12425b += iM17435b2 + iM17434a10;
                    }
                    break;
                case 56:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 57:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 58:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 1, iM12425b);
                    }
                    break;
                case 59:
                    if (m24551t(i8, bhbVar, i6)) {
                        int i19 = i8 << 3;
                        Object object3 = unsafe.getObject(bhbVar, j);
                        if (object3 instanceof zzacr) {
                            iM17434a11 = nhb.m17434a(i19);
                            iM5405b2 = ((zzacr) object3).mo5422f();
                        } else {
                            iM17434a11 = nhb.m17434a(i19);
                            iM5405b2 = AbstractC0961e.m5405b((String) object3);
                        }
                        iM12425b = g9a.m12426c(iM5405b2, iM5405b2, iM17434a11, iM12425b);
                    }
                    break;
                case 60:
                    if (m24551t(i8, bhbVar, i6)) {
                        Object object4 = unsafe.getObject(bhbVar, j);
                        fjb fjbVarM24537C5 = m24537C(i6);
                        iy5 iy5Var22 = gjb.f40885a;
                        iM17434a3 = nhb.m17434a(i8 << 3);
                        iMo3726b = ((bhb) object4).mo3726b(fjbVarM24537C5);
                        iM12425b = g9a.m12426c(iMo3726b, iMo3726b, iM17434a3, iM12425b);
                    }
                    break;
                case 61:
                    if (m24551t(i8, bhbVar, i6)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(bhbVar, j);
                        iM17434a11 = nhb.m17434a(i8 << 3);
                        iM5405b2 = zzacrVar2.mo5422f();
                        iM12425b = g9a.m12426c(iM5405b2, iM5405b2, iM17434a11, iM12425b);
                    }
                    break;
                case 62:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM24530n = m24530n(bhbVar, j);
                        iM17434a12 = nhb.m17434a(i8 << 3);
                        iM12425b = g9a.m12425b(iM24530n, iM17434a12, iM12425b);
                    }
                    break;
                case 63:
                    if (m24551t(i8, bhbVar, i6)) {
                        long jM24530n2 = m24530n(bhbVar, j);
                        iM17434a10 = nhb.m17434a(i8 << 3);
                        iM17435b2 = nhb.m17435b(jM24530n2);
                        iM12425b += iM17435b2 + iM17434a10;
                    }
                    break;
                case 64:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 4, iM12425b);
                    }
                    break;
                case 65:
                    if (m24551t(i8, bhbVar, i6)) {
                        iM12425b = g9a.m12425b(i8 << 3, 8, iM12425b);
                    }
                    break;
                case 66:
                    if (m24551t(i8, bhbVar, i6)) {
                        int iM24530n2 = m24530n(bhbVar, j);
                        iM17434a12 = nhb.m17434a(i8 << 3);
                        iM24530n = (iM24530n2 >> 31) ^ (iM24530n2 + iM24530n2);
                        iM12425b = g9a.m12425b(iM24530n, iM17434a12, iM12425b);
                    }
                    break;
                case 67:
                    if (m24551t(i8, bhbVar, i6)) {
                        long jM24531o3 = m24531o(bhbVar, j);
                        iM17434a10 = nhb.m17434a(i8 << 3);
                        iM17435b2 = nhb.m17435b((jM24531o3 >> 63) ^ (jM24531o3 + jM24531o3));
                        iM12425b += iM17435b2 + iM17434a10;
                    }
                    break;
                case 68:
                    if (m24551t(i8, bhbVar, i6)) {
                        bhb bhbVar4 = (bhb) unsafe.getObject(bhbVar, j);
                        fjb fjbVarM24537C6 = m24537C(i6);
                        iy5 iy5Var23 = gjb.f40885a;
                        int iM17434a16 = nhb.m17434a(i8 << 3);
                        i3 = iM17434a16 + iM17434a16;
                        iMo3726b2 = bhbVar4.mo3726b(fjbVarM24537C6);
                        iM12714z = iMo3726b2 + i3;
                        iM12425b += iM12714z;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: e */
    public final boolean mo11896e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.f68272h) {
            int i6 = this.f68271g[i3];
            int iM24546j = this.m24546j(i6);
            int[] iArr = this.f68265a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = f68264l.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            xib xibVar = this;
            Object obj2 = obj;
            if ((268435456 & iM24546j) == 0 || xibVar.m24548q(obj2, i6, i, i2, i9)) {
                int iM24527k = m24527k(iM24546j);
                if (iM24527k != 9 && iM24527k != 17) {
                    if (iM24527k != 27) {
                        if (iM24527k == 60 || iM24527k == 68) {
                            if (!xibVar.m24551t(iArr[i6], obj2, i6) || xibVar.m24537C(i6).mo11896e(tjb.m22161i(obj2, iM24546j & 1048575))) {
                                i3++;
                                this = xibVar;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iM24527k != 49) {
                            if (iM24527k != 50) {
                                continue;
                            } else {
                                zzaew zzaewVar = (zzaew) tjb.m22161i(obj2, iM24546j & 1048575);
                                if (!zzaewVar.isEmpty() && ((zzagm) ((qib) xibVar.m24538D(i6)).f57837a.f61249c).zza() == zzagn.MESSAGE) {
                                    fjb fjbVarM4784a = null;
                                    for (Object obj3 : zzaewVar.values()) {
                                        if (fjbVarM4784a == null) {
                                            fjbVarM4784a = cjb.f10181c.m4784a(obj3.getClass());
                                        }
                                        if (!fjbVarM4784a.mo11896e(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = xibVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) tjb.m22161i(obj2, iM24546j & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        fjb fjbVarM24537C = xibVar.m24537C(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (fjbVarM24537C.mo11896e(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = xibVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!xibVar.m24548q(obj2, i6, i, i2, i9) || xibVar.m24537C(i6).mo11896e(tjb.m22161i(obj2, iM24546j & 1048575))) {
                    i3++;
                    this = xibVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p000.fjb
    /* JADX INFO: renamed from: f */
    public final void mo11897f(java.lang.Object r18, p000.k80 r19, p000.phb r20) {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xib.mo11897f(java.lang.Object, k80, phb):void");
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: g */
    public final void mo11898g(Object obj, byte[] bArr, int i, int i2, ehb ehbVar) {
        m24554x(obj, bArr, i, i2, 0, ehbVar);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: h */
    public final int mo11899h(whb whbVar) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f68265a.length; i5 += 3) {
            int iM24546j = m24546j(i5);
            int iM24527k = m24527k(iM24546j);
            if (iM24527k <= 50 || iM24527k >= 69) {
                long j = iM24546j & 1048575;
                int iHashCode2 = 37;
                switch (iM24527k) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(tjb.f62429c.mo20008j(whbVar, j));
                        byte[] bArr = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(tjb.f62429c.mo20006f(whbVar, j));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tjb.m22159g(whbVar, j);
                        byte[] bArr2 = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tjb.m22159g(whbVar, j);
                        byte[] bArr3 = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tjb.m22159g(whbVar, j);
                        byte[] bArr4 = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zMo20005d = tjb.f62429c.mo20005d(whbVar, j);
                        byte[] bArr5 = kib.f47356a;
                        i3 = zMo20005d ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) tjb.m22161i(whbVar, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM22161i = tjb.m22161i(whbVar, j);
                        if (objM22161i != null) {
                            iHashCode2 = objM22161i.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22161i(whbVar, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tjb.m22159g(whbVar, j);
                        byte[] bArr6 = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22157e(whbVar, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tjb.m22159g(whbVar, j);
                        byte[] bArr7 = kib.f47356a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM22161i2 = tjb.m22161i(whbVar, j);
                        if (objM22161i2 != null) {
                            iHashCode2 = objM22161i2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22161i(whbVar, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tjb.m22161i(whbVar, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f68273i;
        while (true) {
            int[] iArr = this.f68271g;
            if (i6 >= iArr.length) {
                return whbVar.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!m24551t(0, whbVar, i7)) {
                iHashCode = tjb.m22161i(whbVar, m24546j(i7) & 1048575).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p000.fjb
    /* JADX INFO: renamed from: i */
    public final boolean mo11900i(whb whbVar, whb whbVar2) {
        boolean zM12689a;
        int i = 0;
        while (true) {
            int[] iArr = this.f68265a;
            if (i < iArr.length) {
                int iM24546j = m24546j(i);
                int iM24527k = m24527k(iM24546j);
                if (iM24527k <= 50 || iM24527k >= 69) {
                    long j = iM24546j & 1048575;
                    switch (iM24527k) {
                        case 0:
                            if (m24547p(whbVar, whbVar2, i)) {
                                sjb sjbVar = tjb.f62429c;
                                if (Double.doubleToLongBits(sjbVar.mo20008j(whbVar, j)) != Double.doubleToLongBits(sjbVar.mo20008j(whbVar2, j))) {
                                }
                            }
                            break;
                        case 1:
                            if (m24547p(whbVar, whbVar2, i)) {
                                sjb sjbVar2 = tjb.f62429c;
                                if (Float.floatToIntBits(sjbVar2.mo20006f(whbVar, j)) != Float.floatToIntBits(sjbVar2.mo20006f(whbVar2, j))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22159g(whbVar, j) != tjb.m22159g(whbVar2, j)) {
                            }
                            break;
                        case 3:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22159g(whbVar, j) != tjb.m22159g(whbVar2, j)) {
                            }
                            break;
                        case 4:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 5:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22159g(whbVar, j) != tjb.m22159g(whbVar2, j)) {
                            }
                            break;
                        case 6:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 7:
                            if (m24547p(whbVar, whbVar2, i)) {
                                sjb sjbVar3 = tjb.f62429c;
                                if (sjbVar3.mo20005d(whbVar, j) != sjbVar3.mo20005d(whbVar2, j)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m24547p(whbVar, whbVar2, i) || !gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j))) {
                            }
                            break;
                        case 9:
                            if (!m24547p(whbVar, whbVar2, i) || !gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j))) {
                            }
                            break;
                        case 10:
                            if (!m24547p(whbVar, whbVar2, i) || !gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j))) {
                            }
                            break;
                        case 11:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 12:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 13:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 14:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22159g(whbVar, j) != tjb.m22159g(whbVar2, j)) {
                            }
                            break;
                        case 15:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22157e(whbVar, j) != tjb.m22157e(whbVar2, j)) {
                            }
                            break;
                        case 16:
                            if (!m24547p(whbVar, whbVar2, i) || tjb.m22159g(whbVar, j) != tjb.m22159g(whbVar2, j)) {
                            }
                            break;
                        case 17:
                            if (!m24547p(whbVar, whbVar2, i) || !gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j))) {
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
                            zM12689a = gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j));
                            if (zM12689a) {
                            }
                            break;
                        case 50:
                            zM12689a = gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j));
                            if (zM12689a) {
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
                            long j2 = iArr[i + 2] & 1048575;
                            if (tjb.m22157e(whbVar, j2) == tjb.m22157e(whbVar2, j2) && gjb.m12689a(tjb.m22161i(whbVar, j), tjb.m22161i(whbVar2, j))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.f68273i;
                while (true) {
                    int[] iArr2 = this.f68271g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (tjb.m22157e(whbVar, j3) != tjb.m22157e(whbVar2, j3)) {
                            return false;
                        }
                        if (!m24551t(0, whbVar, i3)) {
                            long jM24546j = m24546j(i3) & 1048575;
                            if (!gjb.m12689a(tjb.m22161i(whbVar, jM24546j), tjb.m22161i(whbVar2, jM24546j))) {
                            }
                        }
                        i2++;
                    } else if (whbVar.zzc.equals(whbVar2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m24546j(int i) {
        return this.f68265a[i + 1];
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24547p(whb whbVar, whb whbVar2, int i) {
        return m24549r(i, whbVar) == m24549r(i, whbVar2);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m24548q(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m24549r(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    /* JADX INFO: renamed from: r */
    public final boolean m24549r(int i, Object obj) {
        int i2 = this.f68265a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & tjb.m22157e(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM24546j = m24546j(i);
        long j2 = iM24546j & 1048575;
        switch (m24527k(iM24546j)) {
            case 0:
                if (Double.doubleToRawLongBits(tjb.f62429c.mo20008j(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(tjb.f62429c.mo20006f(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (tjb.m22159g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (tjb.m22159g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (tjb.m22159g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return tjb.f62429c.mo20005d(obj, j2);
            case 8:
                Object objM22161i = tjb.m22161i(obj, j2);
                if (objM22161i instanceof String) {
                    if (((String) objM22161i).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM22161i instanceof zzacr)) {
                    ij6.m13959q();
                    return false;
                }
                if (zzacr.f11869b.equals(objM22161i)) {
                    return false;
                }
                return true;
            case 9:
                if (tjb.m22161i(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (zzacr.f11869b.equals(tjb.m22161i(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (tjb.m22159g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (tjb.m22157e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (tjb.m22159g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (tjb.m22161i(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24550s(int i, Object obj) {
        int i2 = this.f68265a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        tjb.m22158f(j, obj, (1 << (i2 >>> 20)) | tjb.m22157e(obj, j));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m24551t(int i, Object obj, int i2) {
        return tjb.m22157e(obj, (long) (this.f68265a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: u */
    public final void m24552u(int i, Object obj, int i2) {
        tjb.m22158f(this.f68265a[i2 + 2] & 1048575, obj, i);
    }

    /* JADX INFO: renamed from: v */
    public final int m24553v(int i, int i2) {
        int[] iArr = this.f68265a;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: x */
    public final int m24554x(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p000.ehb r41) {
        /*
            Method dump skipped, instruction units count: 3606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xib.m24554x(java.lang.Object, byte[], int, int, int, ehb):int");
    }

    @Override // p000.fjb
    public final whb zza() {
        return ((whb) this.f68269e).m23964h();
    }
}
