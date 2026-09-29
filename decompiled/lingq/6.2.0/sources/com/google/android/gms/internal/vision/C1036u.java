package com.google.android.gms.internal.vision;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import p000.AbstractC3393o1;
import p000.awc;
import p000.b0d;
import p000.cvc;
import p000.dnb;
import p000.doc;
import p000.eda;
import p000.f0d;
import p000.gfc;
import p000.ho2;
import p000.ij6;
import p000.iwc;
import p000.izc;
import p000.mpc;
import p000.noc;
import p000.olc;
import p000.ovc;
import p000.ozc;
import p000.sdd;
import p000.sqc;
import p000.toc;
import p000.vnb;
import p000.wsc;
import p000.ydd;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C1036u implements iwc {

    /* JADX INFO: renamed from: n */
    public static final int[] f12244n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f12245o = f0d.m11440g();

    /* JADX INFO: renamed from: a */
    public final int[] f12246a;

    /* JADX INFO: renamed from: b */
    public final Object[] f12247b;

    /* JADX INFO: renamed from: c */
    public final int f12248c;

    /* JADX INFO: renamed from: d */
    public final int f12249d;

    /* JADX INFO: renamed from: e */
    public final gfc f12250e;

    /* JADX INFO: renamed from: f */
    public final boolean f12251f;

    /* JADX INFO: renamed from: g */
    public final int[] f12252g;

    /* JADX INFO: renamed from: h */
    public final int f12253h;

    /* JADX INFO: renamed from: i */
    public final int f12254i;

    /* JADX INFO: renamed from: j */
    public final cvc f12255j;

    /* JADX INFO: renamed from: k */
    public final sqc f12256k;

    /* JADX INFO: renamed from: l */
    public final izc f12257l;

    /* JADX INFO: renamed from: m */
    public final wsc f12258m;

    public C1036u(int[] iArr, Object[] objArr, int i, int i2, gfc gfcVar, boolean z, int[] iArr2, int i3, int i4, cvc cvcVar, sqc sqcVar, izc izcVar, olc olcVar, wsc wscVar) {
        this.f12246a = iArr;
        this.f12247b = objArr;
        this.f12248c = i;
        this.f12249d = i2;
        this.f12251f = z;
        this.f12252g = iArr2;
        this.f12253h = i3;
        this.f12254i = i4;
        this.f12255j = cvcVar;
        this.f12256k = sqcVar;
        this.f12257l = izcVar;
        this.f12250e = gfcVar;
        this.f12258m = wscVar;
    }

    /* JADX INFO: renamed from: B */
    public static int m5752B(Object obj, long j) {
        return ((Integer) f0d.m11445l(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: C */
    public static long m5753C(Object obj, long j) {
        return ((Long) f0d.m11445l(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: D */
    public static ozc m5754D(Object obj) {
        AbstractC1034s abstractC1034s = (AbstractC1034s) obj;
        ozc ozcVar = abstractC1034s.zzb;
        if (ozcVar != ozc.f55341f) {
            return ozcVar;
        }
        ozc ozcVarM18846b = ozc.m18846b();
        abstractC1034s.zzb = ozcVarM18846b;
        return ozcVarM18846b;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x026e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0272  */
    /* JADX WARN: Code duplicated, block: B:130:0x028c  */
    /* JADX WARN: Code duplicated, block: B:131:0x028f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0379  */
    /* JADX INFO: renamed from: l */
    public static C1036u m5755l(awc awcVar, cvc cvcVar, sqc sqcVar, izc izcVar, olc olcVar, wsc wscVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        Field fieldM5756m;
        char cCharAt9;
        int i19;
        int i20;
        Object obj;
        Field fieldM5756m2;
        int i21;
        Object obj2;
        Field fieldM5756m3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        int i25;
        char cCharAt12;
        int i26;
        char cCharAt13;
        if (!(awcVar instanceof awc)) {
            ho2.m13383c();
            return null;
        }
        boolean z = (awcVar.f7634d & 1) != 1;
        String str = awcVar.f7632b;
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
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i29 = iCharAt4 & 8191;
            int i30 = 13;
            while (true) {
                i26 = i28 + 1;
                cCharAt13 = str.charAt(i28);
                if (cCharAt13 < 55296) {
                    break;
                }
                i29 |= (cCharAt13 & 8191) << i30;
                i30 += 13;
                i28 = i26;
            }
            iCharAt4 = i29 | (cCharAt13 << i30);
            i28 = i26;
        }
        if (iCharAt4 == 0) {
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = f12244n;
            i3 = 0;
            i4 = 0;
        } else {
            int i31 = i28 + 1;
            int iCharAt5 = str.charAt(i28);
            if (iCharAt5 >= 55296) {
                int i32 = iCharAt5 & 8191;
                int i33 = 13;
                while (true) {
                    i13 = i31 + 1;
                    cCharAt8 = str.charAt(i31);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt8 & 8191) << i33;
                    i33 += 13;
                    i31 = i13;
                }
                iCharAt5 = i32 | (cCharAt8 << i33);
                i31 = i13;
            }
            int i34 = i31 + 1;
            int iCharAt6 = str.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    cCharAt7 = str.charAt(i34);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt7 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                iCharAt6 = i35 | (cCharAt7 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int iCharAt7 = str.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    cCharAt6 = str.charAt(i37);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt6 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                iCharAt7 = i38 | (cCharAt6 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            int iCharAt8 = str.charAt(i37);
            if (iCharAt8 >= 55296) {
                int i41 = iCharAt8 & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    cCharAt5 = str.charAt(i40);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt5 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                iCharAt8 = i41 | (cCharAt5 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            iCharAt = str.charAt(i40);
            if (iCharAt >= 55296) {
                int i44 = iCharAt & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    cCharAt4 = str.charAt(i43);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt4 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                iCharAt = i44 | (cCharAt4 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            iCharAt2 = str.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    cCharAt3 = str.charAt(i46);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt3 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                iCharAt2 = i47 | (cCharAt3 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int iCharAt9 = str.charAt(i46);
            if (iCharAt9 >= 55296) {
                int i50 = iCharAt9 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    cCharAt2 = str.charAt(i49);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt2 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                iCharAt9 = i50 | (cCharAt2 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            iCharAt3 = str.charAt(i49);
            if (iCharAt3 >= 55296) {
                int i53 = iCharAt3 & 8191;
                int i54 = i52;
                int i55 = 13;
                while (true) {
                    i6 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i54 = i6;
                }
                iCharAt3 = i53 | (cCharAt << i55);
                i52 = i6;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i2 = (iCharAt5 << 1) + iCharAt6;
            i3 = iCharAt7;
            i4 = iCharAt8;
            iArr = iArr2;
            i5 = iCharAt5;
            i28 = i52;
        }
        Unsafe unsafe = f12245o;
        Object[] objArr = awcVar.f7633c;
        Class<?> cls = awcVar.f7631a.getClass();
        int i56 = i5;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt << 1];
        int i57 = iCharAt2 + iCharAt3;
        int i58 = i57;
        int i59 = iCharAt3;
        int i60 = 0;
        int i61 = 0;
        while (i28 < length) {
            int i62 = i28 + 1;
            int iCharAt10 = str.charAt(i28);
            int[] iArr4 = iArr3;
            if (iCharAt10 >= 55296) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i25 = i64 + 1;
                    cCharAt12 = str.charAt(i64);
                    i14 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i25;
                    length = i14;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i15 = i25;
            } else {
                i14 = length;
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= 55296) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i23 = i68 + 1;
                    cCharAt11 = str.charAt(i68);
                    i24 = i67;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i67 = i24 | ((cCharAt11 & 8191) << i69);
                    i69 += 13;
                    i68 = i23;
                }
                iCharAt11 = i24 | (cCharAt11 << i69);
                i16 = i23;
            } else {
                i16 = i66;
            }
            int i70 = iCharAt10;
            int i71 = iCharAt11 & 255;
            int i72 = i3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i73 = i4;
            if (i71 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = str.charAt(i16);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = 13;
                    while (true) {
                        i22 = i74 + 1;
                        cCharAt10 = str.charAt(i74);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i74 = i22;
                        c = 55296;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i76);
                    i74 = i22;
                }
                int i77 = i71 - 51;
                int i78 = iCharAt12;
                if (i77 == 9 || i77 == 17) {
                    i19 = i2 + 1;
                    objArr2[((i61 / 3) << 1) + 1] = objArr[i2];
                } else {
                    if (i77 == 12 && !z) {
                        i19 = i2 + 1;
                        objArr2[((i61 / 3) << 1) + 1] = objArr[i2];
                    }
                    i20 = i78 << 1;
                    obj = objArr[i20];
                    if (obj instanceof Field) {
                        fieldM5756m2 = (Field) obj;
                    } else {
                        fieldM5756m2 = m5756m(cls, (String) obj);
                        objArr[i20] = fieldM5756m2;
                    }
                    int i79 = i74;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM5756m2);
                    i21 = i20 + 1;
                    obj2 = objArr[i21];
                    if (obj2 instanceof Field) {
                        fieldM5756m3 = (Field) obj2;
                    } else {
                        fieldM5756m3 = m5756m(cls, (String) obj2);
                        objArr[i21] = fieldM5756m3;
                    }
                    i17 = i79;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5756m3);
                    i18 = 0;
                }
                i2 = i19;
                i20 = i78 << 1;
                obj = objArr[i20];
                if (obj instanceof Field) {
                    fieldM5756m2 = (Field) obj;
                } else {
                    fieldM5756m2 = m5756m(cls, (String) obj);
                    objArr[i20] = fieldM5756m2;
                }
                int i710 = i74;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM5756m2);
                i21 = i20 + 1;
                obj2 = objArr[i21];
                if (obj2 instanceof Field) {
                    fieldM5756m3 = (Field) obj2;
                } else {
                    fieldM5756m3 = m5756m(cls, (String) obj2);
                    objArr[i21] = fieldM5756m3;
                }
                i17 = i710;
                iObjectFieldOffset = iObjectFieldOffset4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5756m3);
                i18 = 0;
            } else {
                int i80 = i2 + 1;
                Field fieldM5756m4 = m5756m(cls, (String) objArr[i2]);
                if (i71 == 9 || i71 == 17) {
                    objArr2[((i61 / 3) << 1) + 1] = fieldM5756m4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i2 += 2;
                        objArr2[((i61 / 3) << 1) + 1] = objArr[i80];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            i2 += 2;
                            objArr2[((i61 / 3) << 1) + 1] = objArr[i80];
                        }
                    } else if (i71 == 50) {
                        int i81 = i59 + 1;
                        iArr[i59] = i61;
                        int i82 = (i61 / 3) << 1;
                        int i83 = i2 + 2;
                        objArr2[i82] = objArr[i80];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i82 + 1] = objArr[i83];
                            i2 += 3;
                        } else {
                            i2 = i83;
                        }
                        i59 = i81;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5756m4);
                    if ((iCharAt11 & 4096) == 4096 || i71 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i17 = i16;
                        i18 = 0;
                    } else {
                        int i84 = i16 + 1;
                        int iCharAt13 = str.charAt(i16);
                        if (iCharAt13 >= 55296) {
                            int i85 = iCharAt13 & 8191;
                            int i86 = 13;
                            while (true) {
                                i17 = i84 + 1;
                                cCharAt9 = str.charAt(i84);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i85 |= (cCharAt9 & 8191) << i86;
                                i86 += 13;
                                i84 = i17;
                            }
                            iCharAt13 = i85 | (cCharAt9 << i86);
                        } else {
                            i17 = i84;
                        }
                        int i87 = (iCharAt13 / 32) + (i56 << 1);
                        Object obj3 = objArr[i87];
                        if (obj3 instanceof Field) {
                            fieldM5756m = (Field) obj3;
                        } else {
                            fieldM5756m = m5756m(cls, (String) obj3);
                            objArr[i87] = fieldM5756m;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5756m);
                        i18 = iCharAt13 % 32;
                    }
                    if (i71 >= 18 && i71 <= 49) {
                        iArr[i58] = iObjectFieldOffset;
                        i58++;
                    }
                }
                i2 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5756m4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                }
                if (i71 >= 18) {
                    iArr[i58] = iObjectFieldOffset;
                    i58++;
                }
            }
            int i88 = i61 + 1;
            iArr4[i61] = i70;
            int i89 = i61 + 2;
            String str2 = str;
            iArr4[i88] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset;
            i61 += 3;
            iArr4[i89] = (i18 << 20) | iObjectFieldOffset2;
            str = str2;
            iArr3 = iArr4;
            i3 = i72;
            length = i14;
            i28 = i17;
            i4 = i73;
        }
        return new C1036u(iArr3, objArr2, i3, i4, awcVar.f7631a, z, iArr, iCharAt3, i57, cvcVar, sqcVar, izcVar, olcVar, wscVar);
    }

    /* JADX INFO: renamed from: m */
    public static Field m5756m(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            ho2.m13385e(AbstractC3393o1.m17738m(sb, " not found. Known fields are ", string));
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m5757o(int i, Object obj, C1032q c1032q) throws zzii$zzb {
        if (!(obj instanceof String)) {
            c1032q.m5737a(i, (zzht) obj);
            return;
        }
        String str = (String) obj;
        C1031p c1031p = c1032q.f12240a;
        c1031p.m5730c(i, 2);
        byte[] bArr = c1031p.f12237b;
        int i2 = c1031p.f12239d;
        try {
            int iM5725t = C1031p.m5725t(str.length() * 3);
            int iM5725t2 = C1031p.m5725t(str.length());
            if (iM5725t2 != iM5725t) {
                c1031p.m5733g(AbstractC1040y.m5821a(str));
                c1031p.f12239d = AbstractC1040y.f12266a.m5827e(str, bArr, c1031p.f12239d, c1031p.m5732e());
                return;
            }
            int i3 = i2 + iM5725t2;
            c1031p.f12239d = i3;
            int iM5827e = AbstractC1040y.f12266a.m5827e(str, bArr, i3, c1031p.m5732e());
            c1031p.f12239d = i2;
            c1031p.m5733g((iM5827e - i2) - iM5725t2);
            c1031p.f12239d = iM5827e;
        } catch (zzmg e) {
            c1031p.f12239d = i2;
            C1031p.f12234e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(noc.f53082a);
            try {
                c1031p.m5733g(bytes.length);
                c1031p.m5735k(bytes, 0, bytes.length);
            } catch (zzii$zzb e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new zzii$zzb(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzii$zzb(e4);
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m5758A(int i) {
        return this.f12246a[i + 1];
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: a */
    public final void mo5759a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.f12253h;
        while (true) {
            iArr = this.f12252g;
            i = this.f12254i;
            if (i2 >= i) {
                break;
            }
            long jM5758A = m5758A(iArr[i2]) & 1048575;
            Object objM11445l = f0d.m11445l(obj, jM5758A);
            if (objM11445l != null) {
                this.f12258m.getClass();
                ((zzke) objM11445l).f12300a = false;
                f0d.m11437d(obj, jM5758A, objM11445l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f12256k.mo9867b(obj, iArr[i]);
            i++;
        }
        this.f12257l.getClass();
        ((AbstractC1034s) obj).zzb.f55346e = false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    @Override // p000.iwc
    /* JADX INFO: renamed from: b */
    public final boolean mo5760b(Object obj) {
        int i;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zM5773r = true;
            if (i3 >= this.f12253h) {
                return true;
            }
            int i5 = this.f12252g[i3];
            int[] iArr = this.f12246a;
            int i6 = iArr[i5];
            int iM5758A = m5758A(i5);
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i2) {
                if (i8 != 1048575) {
                    i4 = f12245o.getInt(obj, i8);
                }
                i2 = i8;
            }
            if ((268435456 & iM5758A) == 0) {
                i = (267386880 & iM5758A) >>> 20;
                if (i != 9 || i == 17) {
                    if (i2 == 1048575) {
                        zM5773r = m5773r(i5, obj);
                    } else if ((i9 & i4) == 0) {
                        zM5773r = false;
                    }
                    if (!zM5773r || m5770n(i5).mo5760b(f0d.m11445l(obj, iM5758A & 1048575))) {
                        i3++;
                    }
                } else {
                    if (i != 27) {
                        if (i == 60 || i == 68) {
                            if (!m5774s(i6, obj, i5) || m5770n(i5).mo5760b(f0d.m11445l(obj, iM5758A & 1048575))) {
                            }
                        } else if (i != 49) {
                            if (i != 50) {
                                continue;
                            } else {
                                Object objM11445l = f0d.m11445l(obj, iM5758A & 1048575);
                                this.f12258m.getClass();
                                if (!((zzke) objM11445l).isEmpty()) {
                                    if (m5776u(i5) == null) {
                                        throw new NoSuchMethodError();
                                    }
                                    ho2.m13383c();
                                    return false;
                                }
                            }
                        }
                        i3++;
                    }
                    List list = (List) f0d.m11445l(obj, iM5758A & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        iwc iwcVarM5770n = m5770n(i5);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (iwcVarM5770n.mo5760b(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                }
            } else {
                if (i2 == 1048575 ? m5773r(i5, obj) : (i4 & i9) != 0) {
                    i = (267386880 & iM5758A) >>> 20;
                    if (i != 9) {
                    }
                    if (i2 == 1048575) {
                        zM5773r = m5773r(i5, obj);
                    } else if ((i9 & i4) == 0) {
                        zM5773r = false;
                    }
                    if (!zM5773r) {
                        continue;
                    }
                    i3++;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.iwc
    /* JADX INFO: renamed from: c */
    public final int mo5761c(AbstractC1034s abstractC1034s) {
        int i;
        int iM17574a;
        int i2;
        int[] iArr = this.f12246a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM5758A = m5758A(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM5758A;
            int i6 = 1237;
            int iHashCode = 37;
            switch ((iM5758A & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(Double.doubleToLongBits(f0d.f38160c.mo32j(abstractC1034s, j)));
                    i3 = iM17574a + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM17574a = Float.floatToIntBits(f0d.f38160c.mo31i(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(f0d.f38160c.m3153l(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(f0d.f38160c.m3153l(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(f0d.f38160c.m3153l(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo30h = f0d.f38160c.mo30h(abstractC1034s, j);
                    Charset charset = noc.f53082a;
                    if (zMo30h) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM17574a = ((String) f0d.m11445l(abstractC1034s, j)).hashCode();
                    i3 = iM17574a + i;
                    break;
                case 9:
                    Object objM11445l = f0d.m11445l(abstractC1034s, j);
                    if (objM11445l != null) {
                        iHashCode = objM11445l.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                    i3 = iM17574a + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(f0d.f38160c.m3153l(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM17574a = f0d.f38160c.m3152k(abstractC1034s, j);
                    i3 = iM17574a + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM17574a = noc.m17574a(f0d.f38160c.m3153l(abstractC1034s, j));
                    i3 = iM17574a + i;
                    break;
                case 17:
                    Object objM11445l2 = f0d.m11445l(abstractC1034s, j);
                    if (objM11445l2 != null) {
                        iHashCode = objM11445l2.hashCode();
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
                    iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                    i3 = iM17574a + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                    i3 = iM17574a + i;
                    break;
                case 51:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(Double.doubleToLongBits(((Double) f0d.m11445l(abstractC1034s, j)).doubleValue()));
                        i3 = iM17574a + i;
                    }
                    break;
                case 52:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = Float.floatToIntBits(((Float) f0d.m11445l(abstractC1034s, j)).floatValue());
                        i3 = iM17574a + i;
                    }
                    break;
                case 53:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(m5753C(abstractC1034s, j));
                        i3 = iM17574a + i;
                    }
                    break;
                case 54:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(m5753C(abstractC1034s, j));
                        i3 = iM17574a + i;
                    }
                    break;
                case 55:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 56:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(m5753C(abstractC1034s, j));
                        i3 = iM17574a + i;
                    }
                    break;
                case 57:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 58:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) f0d.m11445l(abstractC1034s, j)).booleanValue();
                        Charset charset2 = noc.f53082a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = ((String) f0d.m11445l(abstractC1034s, j)).hashCode();
                        i3 = iM17574a + i;
                    }
                    break;
                case 60:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                        i3 = iM17574a + i;
                    }
                    break;
                case 61:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                        i3 = iM17574a + i;
                    }
                    break;
                case 62:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 63:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 64:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 65:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(m5753C(abstractC1034s, j));
                        i3 = iM17574a + i;
                    }
                    break;
                case 66:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = m5752B(abstractC1034s, j);
                        i3 = iM17574a + i;
                    }
                    break;
                case 67:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = noc.m17574a(m5753C(abstractC1034s, j));
                        i3 = iM17574a + i;
                    }
                    break;
                case 68:
                    if (m5774s(i5, abstractC1034s, i4)) {
                        i = i3 * 53;
                        iM17574a = f0d.m11445l(abstractC1034s, j).hashCode();
                        i3 = iM17574a + i;
                    }
                    break;
            }
        }
        this.f12257l.getClass();
        return abstractC1034s.zzb.hashCode() + (i3 * 53);
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: d */
    public final void mo5762d(Object obj, C1032q c1032q) throws zzii$zzb {
        c1032q.getClass();
        C1031p c1031p = c1032q.f12240a;
        if (!this.f12251f) {
            m5779x(obj, c1032q);
            return;
        }
        int[] iArr = this.f12246a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iM5758A = m5758A(i);
            int i2 = iArr[i];
            switch ((267386880 & iM5758A) >>> 20) {
                case 0:
                    if (m5773r(i, obj)) {
                        double dMo32j = f0d.f38160c.mo32j(obj, iM5758A & 1048575);
                        c1031p.getClass();
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(dMo32j);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jDoubleToRawLongBits);
                    }
                    break;
                case 1:
                    if (m5773r(i, obj)) {
                        float fMo31i = f0d.f38160c.mo31i(obj, iM5758A & 1048575);
                        c1031p.getClass();
                        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo31i);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iFloatToRawIntBits);
                    }
                    break;
                case 2:
                    if (m5773r(i, obj)) {
                        long jM3153l = f0d.f38160c.m3153l(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d(jM3153l);
                    }
                    break;
                case 3:
                    if (m5773r(i, obj)) {
                        long jM3153l2 = f0d.f38160c.m3153l(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d(jM3153l2);
                    }
                    break;
                case 4:
                    if (m5773r(i, obj)) {
                        int iM3152k = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5729b(iM3152k);
                    }
                    break;
                case 5:
                    if (m5773r(i, obj)) {
                        long jM3153l3 = f0d.f38160c.m3153l(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jM3153l3);
                    }
                    break;
                case 6:
                    if (m5773r(i, obj)) {
                        int iM3152k2 = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iM3152k2);
                    }
                    break;
                case 7:
                    if (m5773r(i, obj)) {
                        boolean zMo30h = f0d.f38160c.mo30h(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5728a(zMo30h ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (m5773r(i, obj)) {
                        m5757o(i2, f0d.m11445l(obj, iM5758A & 1048575), c1032q);
                    }
                    break;
                case 9:
                    if (m5773r(i, obj)) {
                        c1032q.m5738b(i2, f0d.m11445l(obj, iM5758A & 1048575), m5770n(i));
                    }
                    break;
                case 10:
                    if (m5773r(i, obj)) {
                        c1032q.m5737a(i2, (zzht) f0d.m11445l(obj, iM5758A & 1048575));
                    }
                    break;
                case 11:
                    if (m5773r(i, obj)) {
                        int iM3152k3 = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5733g(iM3152k3);
                    }
                    break;
                case 12:
                    if (m5773r(i, obj)) {
                        int iM3152k4 = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5729b(iM3152k4);
                    }
                    break;
                case 13:
                    if (m5773r(i, obj)) {
                        int iM3152k5 = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iM3152k5);
                    }
                    break;
                case 14:
                    if (m5773r(i, obj)) {
                        long jM3153l4 = f0d.f38160c.m3153l(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jM3153l4);
                    }
                    break;
                case 15:
                    if (m5773r(i, obj)) {
                        int iM3152k6 = f0d.f38160c.m3152k(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5733g((iM3152k6 >> 31) ^ (iM3152k6 << 1));
                    }
                    break;
                case 16:
                    if (m5773r(i, obj)) {
                        long jM3153l5 = f0d.f38160c.m3153l(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d((jM3153l5 >> 63) ^ (jM3153l5 << 1));
                    }
                    break;
                case 17:
                    if (m5773r(i, obj)) {
                        c1032q.m5739c(i2, f0d.m11445l(obj, iM5758A & 1048575), m5770n(i));
                    }
                    break;
                case 18:
                    AbstractC1039x.m5801g(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 19:
                    AbstractC1039x.m5808n(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 20:
                    AbstractC1039x.m5811q(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 21:
                    AbstractC1039x.m5813s(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 22:
                    AbstractC1039x.m5786B(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    AbstractC1039x.m5817w(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 24:
                    AbstractC1039x.m5791G(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 25:
                    AbstractC1039x.m5794J(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 26:
                    AbstractC1039x.m5799e(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    AbstractC1039x.m5800f(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, m5770n(i));
                    break;
                case 28:
                    AbstractC1039x.m5806l(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q);
                    break;
                case 29:
                    AbstractC1039x.m5789E(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 30:
                    AbstractC1039x.m5793I(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    AbstractC1039x.m5792H(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 32:
                    AbstractC1039x.m5819y(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 33:
                    AbstractC1039x.m5790F(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case 34:
                    AbstractC1039x.m5815u(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, false);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    AbstractC1039x.m5801g(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    AbstractC1039x.m5808n(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    AbstractC1039x.m5811q(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 38:
                    AbstractC1039x.m5813s(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    AbstractC1039x.m5786B(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    AbstractC1039x.m5817w(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    AbstractC1039x.m5791G(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 42:
                    AbstractC1039x.m5794J(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 43:
                    AbstractC1039x.m5789E(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    AbstractC1039x.m5793I(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    AbstractC1039x.m5792H(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 46:
                    AbstractC1039x.m5819y(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 47:
                    AbstractC1039x.m5790F(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case eda.f37086g /* 48 */:
                    AbstractC1039x.m5815u(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, true);
                    break;
                case 49:
                    AbstractC1039x.m5807m(i2, (List) f0d.m11445l(obj, iM5758A & 1048575), c1032q, m5770n(i));
                    break;
                case 50:
                    if (f0d.m11445l(obj, iM5758A & 1048575) != null) {
                        Object objM5776u = m5776u(i);
                        this.f12258m.getClass();
                        if (objM5776u == null) {
                            throw new NoSuchMethodError();
                        }
                        ho2.m13383c();
                        return;
                    }
                    break;
                    break;
                case 51:
                    if (m5774s(i2, obj, i)) {
                        double dDoubleValue = ((Double) f0d.m11445l(obj, iM5758A & 1048575)).doubleValue();
                        c1031p.getClass();
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(dDoubleValue);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jDoubleToRawLongBits2);
                    }
                    break;
                case 52:
                    if (m5774s(i2, obj, i)) {
                        float fFloatValue = ((Float) f0d.m11445l(obj, iM5758A & 1048575)).floatValue();
                        c1031p.getClass();
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iFloatToRawIntBits2);
                    }
                    break;
                case 53:
                    if (m5774s(i2, obj, i)) {
                        long jM5753C = m5753C(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d(jM5753C);
                    }
                    break;
                case 54:
                    if (m5774s(i2, obj, i)) {
                        long jM5753C2 = m5753C(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d(jM5753C2);
                    }
                    break;
                case 55:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5729b(iM5752B);
                    }
                    break;
                case 56:
                    if (m5774s(i2, obj, i)) {
                        long jM5753C3 = m5753C(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jM5753C3);
                    }
                    break;
                case 57:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B2 = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iM5752B2);
                    }
                    break;
                case 58:
                    if (m5774s(i2, obj, i)) {
                        boolean zBooleanValue = ((Boolean) f0d.m11445l(obj, iM5758A & 1048575)).booleanValue();
                        c1031p.m5730c(i2, 0);
                        c1031p.m5728a(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (m5774s(i2, obj, i)) {
                        m5757o(i2, f0d.m11445l(obj, iM5758A & 1048575), c1032q);
                    }
                    break;
                case 60:
                    if (m5774s(i2, obj, i)) {
                        c1032q.m5738b(i2, f0d.m11445l(obj, iM5758A & 1048575), m5770n(i));
                    }
                    break;
                case 61:
                    if (m5774s(i2, obj, i)) {
                        c1032q.m5737a(i2, (zzht) f0d.m11445l(obj, iM5758A & 1048575));
                    }
                    break;
                case 62:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B3 = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5733g(iM5752B3);
                    }
                    break;
                case 63:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B4 = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5729b(iM5752B4);
                    }
                    break;
                case 64:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B5 = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 5);
                        c1031p.m5736l(iM5752B5);
                    }
                    break;
                case 65:
                    if (m5774s(i2, obj, i)) {
                        long jM5753C4 = m5753C(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 1);
                        c1031p.m5734j(jM5753C4);
                    }
                    break;
                case 66:
                    if (m5774s(i2, obj, i)) {
                        int iM5752B6 = m5752B(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5733g((iM5752B6 >> 31) ^ (iM5752B6 << 1));
                    }
                    break;
                case 67:
                    if (m5774s(i2, obj, i)) {
                        long jM5753C5 = m5753C(obj, iM5758A & 1048575);
                        c1031p.m5730c(i2, 0);
                        c1031p.m5731d((jM5753C5 >> 63) ^ (jM5753C5 << 1));
                    }
                    break;
                case 68:
                    if (m5774s(i2, obj, i)) {
                        c1032q.m5739c(i2, f0d.m11445l(obj, iM5758A & 1048575), m5770n(i));
                    }
                    break;
            }
        }
        this.f12257l.getClass();
        ((AbstractC1034s) obj).zzb.m18848c(c1032q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x0308  */
    /* JADX WARN: Code duplicated, block: B:240:0x05f3 A[PHI: r8
      0x05f3: PHI (r8v3 int) = 
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v10 int)
      (r8v2 int)
      (r8v11 int)
      (r8v2 int)
      (r8v12 int)
      (r8v2 int)
      (r8v13 int)
      (r8v2 int)
      (r8v14 int)
      (r8v2 int)
      (r8v15 int)
      (r8v2 int)
      (r8v16 int)
      (r8v2 int)
      (r8v17 int)
      (r8v2 int)
      (r8v18 int)
      (r8v2 int)
      (r8v19 int)
      (r8v2 int)
      (r8v20 int)
      (r8v2 int)
      (r8v21 int)
      (r8v2 int)
      (r8v22 int)
      (r8v2 int)
      (r8v23 int)
      (r8v2 int)
      (r8v24 int)
      (r8v25 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v2 int)
      (r8v36 int)
      (r8v2 int)
     binds: [B:234:0x05da, B:420:0x0a70, B:417:0x0a5e, B:414:0x0a4e, B:411:0x0a40, B:408:0x0a2c, B:405:0x0a1f, B:402:0x0a11, B:399:0x0a03, B:396:0x09f5, B:393:0x09e1, B:375:0x095a, B:348:0x088d, B:349:0x088f, B:345:0x0877, B:346:0x0879, B:342:0x0861, B:343:0x0863, B:339:0x084b, B:340:0x084d, B:336:0x0835, B:337:0x0837, B:333:0x081f, B:334:0x0821, B:330:0x0809, B:331:0x080b, B:327:0x07f3, B:328:0x07f5, B:324:0x07db, B:325:0x07dd, B:321:0x07c5, B:322:0x07c7, B:318:0x07af, B:319:0x07b1, B:315:0x0799, B:316:0x079b, B:312:0x0783, B:313:0x0785, B:309:0x076d, B:310:0x076f, B:307:0x0760, B:300:0x072a, B:298:0x071e, B:295:0x070f, B:292:0x06f8, B:289:0x06e8, B:286:0x06d2, B:283:0x06c6, B:280:0x06ba, B:276:0x06a9, B:270:0x0686, B:267:0x0672, B:264:0x0661, B:261:0x0652, B:257:0x063c, B:254:0x062e, B:250:0x061b, B:247:0x060c, B:244:0x05fd, B:239:0x05f2, B:237:0x05e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:352:0x08a7  */
    @Override // p000.iwc
    /* JADX INFO: renamed from: e */
    public final int mo5763e(Object obj) {
        izc izcVar;
        int i;
        char c;
        char c2;
        int iM5720o;
        int iM5725t;
        int iM5715f;
        int iM5716h;
        char c3;
        int iM5717i;
        int iM5725t2;
        int iM5720o2;
        int iM5719n;
        int iM5717i2;
        boolean z = this.f12251f;
        izc izcVar2 = this.f12257l;
        wsc wscVar = this.f12258m;
        int i2 = 267386880;
        int i3 = 1048575;
        int[] iArr = this.f12246a;
        if (z) {
            Unsafe unsafe = f12245o;
            int i4 = 0;
            int iM10500a = 0;
            while (i4 < iArr.length) {
                int iM5758A = m5758A(i4);
                int i5 = (iM5758A & i2) >>> 20;
                int i6 = i2;
                int i7 = iArr[i4];
                int i8 = i3;
                long j = iM5758A & i3;
                if (i5 >= zziv.zza.zza() && i5 <= zziv.zzb.zza()) {
                    int i9 = iArr[i4 + 2];
                }
                switch (i5) {
                    case 0:
                        if (m5773r(i4, obj)) {
                            iM10500a = dnb.m10500a(i7 << 3, 8, iM10500a);
                        }
                        break;
                    case 1:
                        if (m5773r(i4, obj)) {
                            iM10500a = dnb.m10500a(i7 << 3, 4, iM10500a);
                        }
                        break;
                    case 2:
                        if (m5773r(i4, obj)) {
                            long jM3153l = f0d.f38160c.m3153l(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5720o(jM3153l);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 3:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5719n(i7, f0d.f38160c.m3153l(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 4:
                        if (m5773r(i4, obj)) {
                            int iM3152k = f0d.f38160c.m3152k(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5721p(iM3152k);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 5:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5723r(i7);
                            iM10500a += iM5719n;
                        }
                        break;
                    case 6:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5727v(i7);
                            iM10500a += iM5719n;
                        }
                        break;
                    case 7:
                        if (m5773r(i4, obj)) {
                            iM10500a = dnb.m10500a(i7 << 3, 1, iM10500a);
                        }
                        break;
                    case 8:
                        if (m5773r(i4, obj)) {
                            Object objM11445l = f0d.m11445l(obj, j);
                            if (objM11445l instanceof zzht) {
                                iM5719n = C1031p.m5716h(i7, (zzht) objM11445l);
                                iM10500a += iM5719n;
                            } else {
                                iM5725t2 = C1031p.m5725t(i7 << 3);
                                iM5720o2 = C1031p.m5715f((String) objM11445l);
                                iM10500a += iM5720o2 + iM5725t2;
                            }
                        }
                        break;
                    case 9:
                        if (m5773r(i4, obj)) {
                            iM5719n = AbstractC1039x.m5795a(i7, f0d.m11445l(obj, j), m5770n(i4));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 10:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5716h(i7, (zzht) f0d.m11445l(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 11:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5724s(i7, f0d.f38160c.m3152k(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 12:
                        if (m5773r(i4, obj)) {
                            int iM3152k2 = f0d.f38160c.m3152k(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5721p(iM3152k2);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 13:
                        if (m5773r(i4, obj)) {
                            iM10500a = dnb.m10500a(i7 << 3, 4, iM10500a);
                        }
                        break;
                    case 14:
                        if (m5773r(i4, obj)) {
                            iM10500a = dnb.m10500a(i7 << 3, 8, iM10500a);
                        }
                        break;
                    case 15:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5726u(i7, f0d.f38160c.m3152k(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 16:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5722q(i7, f0d.f38160c.m3153l(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 17:
                        if (m5773r(i4, obj)) {
                            iM5719n = C1031p.m5717i(i7, (gfc) f0d.m11445l(obj, j), m5770n(i4));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 18:
                        iM5719n = AbstractC1039x.m5787C(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 19:
                        iM5719n = AbstractC1039x.m5820z(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 20:
                        List list = (List) f0d.m11445l(obj, j);
                        Class cls = AbstractC1039x.f12262a;
                        if (list.size() == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, list.size(), AbstractC1039x.m5797c(list));
                        }
                        iM10500a += iM5719n;
                        break;
                    case 21:
                        List list2 = (List) f0d.m11445l(obj, j);
                        Class cls2 = AbstractC1039x.f12262a;
                        int size = list2.size();
                        if (size == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size, AbstractC1039x.m5805k(list2));
                        }
                        iM10500a += iM5719n;
                        break;
                    case 22:
                        List list3 = (List) f0d.m11445l(obj, j);
                        Class cls3 = AbstractC1039x.f12262a;
                        int size2 = list3.size();
                        if (size2 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size2, AbstractC1039x.m5814t(list3));
                        }
                        iM10500a += iM5719n;
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        iM5719n = AbstractC1039x.m5787C(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 24:
                        iM5719n = AbstractC1039x.m5820z(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 25:
                        List list4 = (List) f0d.m11445l(obj, j);
                        Class cls4 = AbstractC1039x.f12262a;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = (C1031p.m5725t(i7 << 3) + 1) * size3;
                        }
                        iM10500a += iM5719n;
                        break;
                    case 26:
                        iM5719n = AbstractC1039x.m5804j(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        iM5719n = AbstractC1039x.m5796b(i7, (List) f0d.m11445l(obj, j), m5770n(i4));
                        iM10500a += iM5719n;
                        break;
                    case 28:
                        iM5719n = AbstractC1039x.m5809o(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 29:
                        List list5 = (List) f0d.m11445l(obj, j);
                        Class cls5 = AbstractC1039x.f12262a;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size4, AbstractC1039x.m5816v(list5));
                        }
                        iM10500a += iM5719n;
                        break;
                    case 30:
                        List list6 = (List) f0d.m11445l(obj, j);
                        Class cls6 = AbstractC1039x.f12262a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size5, AbstractC1039x.m5812r(list6));
                        }
                        iM10500a += iM5719n;
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        iM5719n = AbstractC1039x.m5820z(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 32:
                        iM5719n = AbstractC1039x.m5787C(i7, (List) f0d.m11445l(obj, j));
                        iM10500a += iM5719n;
                        break;
                    case 33:
                        List list7 = (List) f0d.m11445l(obj, j);
                        Class cls7 = AbstractC1039x.f12262a;
                        int size6 = list7.size();
                        if (size6 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size6, AbstractC1039x.m5818x(list7));
                        }
                        iM10500a += iM5719n;
                        break;
                    case 34:
                        List list8 = (List) f0d.m11445l(obj, j);
                        Class cls8 = AbstractC1039x.f12262a;
                        int size7 = list8.size();
                        if (size7 == 0) {
                            iM5719n = 0;
                        } else {
                            iM5719n = dnb.m10510k(i7, size7, AbstractC1039x.m5810p(list8));
                        }
                        iM10500a += iM5719n;
                        break;
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        int iM5788D = AbstractC1039x.m5788D((List) unsafe.getObject(obj, j));
                        if (iM5788D > 0) {
                            iM10500a = dnb.m10501b(iM5788D, C1031p.m5718m(i7), iM5788D, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        int iM5785A = AbstractC1039x.m5785A((List) unsafe.getObject(obj, j));
                        if (iM5785A > 0) {
                            iM10500a = dnb.m10501b(iM5785A, C1031p.m5718m(i7), iM5785A, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        int iM5797c = AbstractC1039x.m5797c((List) unsafe.getObject(obj, j));
                        if (iM5797c > 0) {
                            iM10500a = dnb.m10501b(iM5797c, C1031p.m5718m(i7), iM5797c, iM10500a);
                        }
                        break;
                    case 38:
                        int iM5805k = AbstractC1039x.m5805k((List) unsafe.getObject(obj, j));
                        if (iM5805k > 0) {
                            iM10500a = dnb.m10501b(iM5805k, C1031p.m5718m(i7), iM5805k, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        int iM5814t = AbstractC1039x.m5814t((List) unsafe.getObject(obj, j));
                        if (iM5814t > 0) {
                            iM10500a = dnb.m10501b(iM5814t, C1031p.m5718m(i7), iM5814t, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        int iM5788D2 = AbstractC1039x.m5788D((List) unsafe.getObject(obj, j));
                        if (iM5788D2 > 0) {
                            iM10500a = dnb.m10501b(iM5788D2, C1031p.m5718m(i7), iM5788D2, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        int iM5785A2 = AbstractC1039x.m5785A((List) unsafe.getObject(obj, j));
                        if (iM5785A2 > 0) {
                            iM10500a = dnb.m10501b(iM5785A2, C1031p.m5718m(i7), iM5785A2, iM10500a);
                        }
                        break;
                    case 42:
                        List list9 = (List) unsafe.getObject(obj, j);
                        Class cls9 = AbstractC1039x.f12262a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            iM10500a = dnb.m10501b(size8, C1031p.m5718m(i7), size8, iM10500a);
                        }
                        break;
                    case 43:
                        int iM5816v = AbstractC1039x.m5816v((List) unsafe.getObject(obj, j));
                        if (iM5816v > 0) {
                            iM10500a = dnb.m10501b(iM5816v, C1031p.m5718m(i7), iM5816v, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        int iM5812r = AbstractC1039x.m5812r((List) unsafe.getObject(obj, j));
                        if (iM5812r > 0) {
                            iM10500a = dnb.m10501b(iM5812r, C1031p.m5718m(i7), iM5812r, iM10500a);
                        }
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        int iM5785A3 = AbstractC1039x.m5785A((List) unsafe.getObject(obj, j));
                        if (iM5785A3 > 0) {
                            iM10500a = dnb.m10501b(iM5785A3, C1031p.m5718m(i7), iM5785A3, iM10500a);
                        }
                        break;
                    case 46:
                        int iM5788D3 = AbstractC1039x.m5788D((List) unsafe.getObject(obj, j));
                        if (iM5788D3 > 0) {
                            iM10500a = dnb.m10501b(iM5788D3, C1031p.m5718m(i7), iM5788D3, iM10500a);
                        }
                        break;
                    case 47:
                        int iM5818x = AbstractC1039x.m5818x((List) unsafe.getObject(obj, j));
                        if (iM5818x > 0) {
                            iM10500a = dnb.m10501b(iM5818x, C1031p.m5718m(i7), iM5818x, iM10500a);
                        }
                        break;
                    case eda.f37086g /* 48 */:
                        int iM5810p = AbstractC1039x.m5810p((List) unsafe.getObject(obj, j));
                        if (iM5810p > 0) {
                            iM10500a = dnb.m10501b(iM5810p, C1031p.m5718m(i7), iM5810p, iM10500a);
                        }
                        break;
                    case 49:
                        List list10 = (List) f0d.m11445l(obj, j);
                        iwc iwcVarM5770n = m5770n(i4);
                        Class cls10 = AbstractC1039x.f12262a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            iM5717i2 = 0;
                        } else {
                            iM5717i2 = 0;
                            for (int i10 = 0; i10 < size9; i10++) {
                                iM5717i2 = C1031p.m5717i(i7, (gfc) list10.get(i10), iwcVarM5770n) + iM5717i2;
                            }
                        }
                        iM10500a = iM5717i2 + iM10500a;
                        break;
                    case 50:
                        Object objM11445l2 = f0d.m11445l(obj, j);
                        Object objM5776u = m5776u(i4);
                        wscVar.getClass();
                        wsc.m24151b(objM11445l2, objM5776u);
                        break;
                    case 51:
                        if (m5774s(i7, obj, i4)) {
                            iM10500a = dnb.m10500a(i7 << 3, 8, iM10500a);
                        }
                        break;
                    case 52:
                        if (m5774s(i7, obj, i4)) {
                            iM10500a = dnb.m10500a(i7 << 3, 4, iM10500a);
                        }
                        break;
                    case 53:
                        if (m5774s(i7, obj, i4)) {
                            long jM5753C = m5753C(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5720o(jM5753C);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 54:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5719n(i7, m5753C(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 55:
                        if (m5774s(i7, obj, i4)) {
                            int iM5752B = m5752B(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5721p(iM5752B);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 56:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5723r(i7);
                            iM10500a += iM5719n;
                        }
                        break;
                    case 57:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5727v(i7);
                            iM10500a += iM5719n;
                        }
                        break;
                    case 58:
                        if (m5774s(i7, obj, i4)) {
                            iM10500a = dnb.m10500a(i7 << 3, 1, iM10500a);
                        }
                        break;
                    case 59:
                        if (m5774s(i7, obj, i4)) {
                            Object objM11445l3 = f0d.m11445l(obj, j);
                            if (objM11445l3 instanceof zzht) {
                                iM5719n = C1031p.m5716h(i7, (zzht) objM11445l3);
                                iM10500a += iM5719n;
                            } else {
                                iM5725t2 = C1031p.m5725t(i7 << 3);
                                iM5720o2 = C1031p.m5715f((String) objM11445l3);
                                iM10500a += iM5720o2 + iM5725t2;
                            }
                        }
                        break;
                    case 60:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = AbstractC1039x.m5795a(i7, f0d.m11445l(obj, j), m5770n(i4));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 61:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5716h(i7, (zzht) f0d.m11445l(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 62:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5724s(i7, m5752B(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 63:
                        if (m5774s(i7, obj, i4)) {
                            int iM5752B2 = m5752B(obj, j);
                            iM5725t2 = C1031p.m5725t(i7 << 3);
                            iM5720o2 = C1031p.m5721p(iM5752B2);
                            iM10500a += iM5720o2 + iM5725t2;
                        }
                        break;
                    case 64:
                        if (m5774s(i7, obj, i4)) {
                            iM10500a = dnb.m10500a(i7 << 3, 4, iM10500a);
                        }
                        break;
                    case 65:
                        if (m5774s(i7, obj, i4)) {
                            iM10500a = dnb.m10500a(i7 << 3, 8, iM10500a);
                        }
                        break;
                    case 66:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5726u(i7, m5752B(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 67:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5722q(i7, m5753C(obj, j));
                            iM10500a += iM5719n;
                        }
                        break;
                    case 68:
                        if (m5774s(i7, obj, i4)) {
                            iM5719n = C1031p.m5717i(i7, (gfc) f0d.m11445l(obj, j), m5770n(i4));
                            iM10500a += iM5719n;
                        }
                        break;
                }
                i4 += 3;
                i2 = i6;
                i3 = i8;
            }
            izcVar2.getClass();
            return ((AbstractC1034s) obj).zzb.m18849d() + iM10500a;
        }
        Unsafe unsafe2 = f12245o;
        int i11 = 1048575;
        int i12 = 0;
        int iM10500a2 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iM5758A2 = m5758A(i12);
            int i14 = iArr[i12];
            int i15 = (iM5758A2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & 1048575;
                i = 1 << (i16 >>> 20);
                izcVar = izcVar2;
                if (i17 != i11) {
                    i13 = unsafe2.getInt(obj, i17);
                    i11 = i17;
                }
            } else {
                izcVar = izcVar2;
                i = 0;
            }
            long j2 = iM5758A2 & 1048575;
            switch (i15) {
                case 0:
                    c = 4;
                    if ((i13 & i) != 0) {
                        c2 = '\b';
                        iM10500a2 = dnb.m10500a(i14 << 3, 8, iM10500a2);
                    } else {
                        c2 = '\b';
                    }
                    break;
                case 1:
                    if ((i13 & i) != 0) {
                        c = 4;
                        iM10500a2 = dnb.m10500a(i14 << 3, 4, iM10500a2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 2:
                    if ((i13 & i) != 0) {
                        iM5720o = C1031p.m5720o(unsafe2.getLong(obj, j2)) + C1031p.m5725t(i14 << 3);
                        iM10500a2 += iM5720o;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 3:
                    if ((i13 & i) != 0) {
                        iM5720o = C1031p.m5719n(i14, unsafe2.getLong(obj, j2));
                        iM10500a2 += iM5720o;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 4:
                    if ((i13 & i) != 0) {
                        iM5720o = C1031p.m5721p(unsafe2.getInt(obj, j2)) + C1031p.m5725t(i14 << 3);
                        iM10500a2 += iM5720o;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 5:
                    if ((i13 & i) != 0) {
                        iM5720o = C1031p.m5723r(i14);
                        iM10500a2 += iM5720o;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        iM5720o = C1031p.m5727v(i14);
                        iM10500a2 += iM5720o;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        iM10500a2 = dnb.m10500a(i14 << 3, 1, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(obj, j2);
                        if (object instanceof zzht) {
                            iM5716h = C1031p.m5716h(i14, (zzht) object);
                        } else {
                            iM5725t = C1031p.m5725t(i14 << 3);
                            iM5715f = C1031p.m5715f((String) object);
                            iM5716h = iM5715f + iM5725t;
                        }
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        iM5716h = AbstractC1039x.m5795a(i14, unsafe2.getObject(obj, j2), m5770n(i12));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        iM5716h = C1031p.m5716h(i14, (zzht) unsafe2.getObject(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        iM5716h = C1031p.m5724s(i14, unsafe2.getInt(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        int i18 = unsafe2.getInt(obj, j2);
                        iM5725t = C1031p.m5725t(i14 << 3);
                        iM5715f = C1031p.m5721p(i18);
                        iM5716h = iM5715f + iM5725t;
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        c = 4;
                        iM10500a2 = dnb.m10500a(i14 << 3, 4, iM10500a2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        c3 = '\b';
                        iM10500a2 = dnb.m10500a(i14 << 3, 8, iM10500a2);
                        c2 = c3;
                        c = 4;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        iM5716h = C1031p.m5726u(i14, unsafe2.getInt(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        iM5716h = C1031p.m5722q(i14, unsafe2.getLong(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        iM5716h = C1031p.m5717i(i14, (gfc) unsafe2.getObject(obj, j2), m5770n(i12));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 18:
                    iM5716h = AbstractC1039x.m5787C(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 19:
                    iM5716h = AbstractC1039x.m5820z(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 20:
                    List list11 = (List) unsafe2.getObject(obj, j2);
                    Class cls11 = AbstractC1039x.f12262a;
                    if (list11.size() == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, list11.size(), AbstractC1039x.m5797c(list11));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 21:
                    List list12 = (List) unsafe2.getObject(obj, j2);
                    Class cls12 = AbstractC1039x.f12262a;
                    int size10 = list12.size();
                    if (size10 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size10, AbstractC1039x.m5805k(list12));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 22:
                    List list13 = (List) unsafe2.getObject(obj, j2);
                    Class cls13 = AbstractC1039x.f12262a;
                    int size11 = list13.size();
                    if (size11 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size11, AbstractC1039x.m5814t(list13));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iM5716h = AbstractC1039x.m5787C(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 24:
                    iM5716h = AbstractC1039x.m5820z(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 25:
                    List list14 = (List) unsafe2.getObject(obj, j2);
                    Class cls14 = AbstractC1039x.f12262a;
                    int size12 = list14.size();
                    iM10500a2 += size12 == 0 ? 0 : (C1031p.m5725t(i14 << 3) + 1) * size12;
                    c = 4;
                    c2 = '\b';
                    break;
                case 26:
                    iM5716h = AbstractC1039x.m5804j(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iM5716h = AbstractC1039x.m5796b(i14, (List) unsafe2.getObject(obj, j2), m5770n(i12));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 28:
                    iM5716h = AbstractC1039x.m5809o(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 29:
                    List list15 = (List) unsafe2.getObject(obj, j2);
                    Class cls15 = AbstractC1039x.f12262a;
                    int size13 = list15.size();
                    if (size13 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size13, AbstractC1039x.m5816v(list15));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 30:
                    List list16 = (List) unsafe2.getObject(obj, j2);
                    Class cls16 = AbstractC1039x.f12262a;
                    int size14 = list16.size();
                    if (size14 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size14, AbstractC1039x.m5812r(list16));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iM5716h = AbstractC1039x.m5820z(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 32:
                    iM5716h = AbstractC1039x.m5787C(i14, (List) unsafe2.getObject(obj, j2));
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 33:
                    List list17 = (List) unsafe2.getObject(obj, j2);
                    Class cls17 = AbstractC1039x.f12262a;
                    int size15 = list17.size();
                    if (size15 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size15, AbstractC1039x.m5818x(list17));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case 34:
                    List list18 = (List) unsafe2.getObject(obj, j2);
                    Class cls18 = AbstractC1039x.f12262a;
                    int size16 = list18.size();
                    if (size16 == 0) {
                        iM5716h = 0;
                    } else {
                        iM5716h = dnb.m10510k(i14, size16, AbstractC1039x.m5810p(list18));
                    }
                    iM10500a2 += iM5716h;
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int iM5788D4 = AbstractC1039x.m5788D((List) unsafe2.getObject(obj, j2));
                    if (iM5788D4 > 0) {
                        iM10500a2 = dnb.m10501b(iM5788D4, C1031p.m5718m(i14), iM5788D4, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int iM5785A4 = AbstractC1039x.m5785A((List) unsafe2.getObject(obj, j2));
                    if (iM5785A4 > 0) {
                        iM10500a2 = dnb.m10501b(iM5785A4, C1031p.m5718m(i14), iM5785A4, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int iM5797c2 = AbstractC1039x.m5797c((List) unsafe2.getObject(obj, j2));
                    if (iM5797c2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5797c2, C1031p.m5718m(i14), iM5797c2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 38:
                    int iM5805k2 = AbstractC1039x.m5805k((List) unsafe2.getObject(obj, j2));
                    if (iM5805k2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5805k2, C1031p.m5718m(i14), iM5805k2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int iM5814t2 = AbstractC1039x.m5814t((List) unsafe2.getObject(obj, j2));
                    if (iM5814t2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5814t2, C1031p.m5718m(i14), iM5814t2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    int iM5788D5 = AbstractC1039x.m5788D((List) unsafe2.getObject(obj, j2));
                    if (iM5788D5 > 0) {
                        iM10500a2 = dnb.m10501b(iM5788D5, C1031p.m5718m(i14), iM5788D5, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    int iM5785A5 = AbstractC1039x.m5785A((List) unsafe2.getObject(obj, j2));
                    if (iM5785A5 > 0) {
                        iM10500a2 = dnb.m10501b(iM5785A5, C1031p.m5718m(i14), iM5785A5, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 42:
                    List list19 = (List) unsafe2.getObject(obj, j2);
                    Class cls19 = AbstractC1039x.f12262a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        iM10500a2 = dnb.m10501b(size17, C1031p.m5718m(i14), size17, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 43:
                    int iM5816v2 = AbstractC1039x.m5816v((List) unsafe2.getObject(obj, j2));
                    if (iM5816v2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5816v2, C1031p.m5718m(i14), iM5816v2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int iM5812r2 = AbstractC1039x.m5812r((List) unsafe2.getObject(obj, j2));
                    if (iM5812r2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5812r2, C1031p.m5718m(i14), iM5812r2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int iM5785A6 = AbstractC1039x.m5785A((List) unsafe2.getObject(obj, j2));
                    if (iM5785A6 > 0) {
                        iM10500a2 = dnb.m10501b(iM5785A6, C1031p.m5718m(i14), iM5785A6, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 46:
                    int iM5788D6 = AbstractC1039x.m5788D((List) unsafe2.getObject(obj, j2));
                    if (iM5788D6 > 0) {
                        iM10500a2 = dnb.m10501b(iM5788D6, C1031p.m5718m(i14), iM5788D6, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 47:
                    int iM5818x2 = AbstractC1039x.m5818x((List) unsafe2.getObject(obj, j2));
                    if (iM5818x2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5818x2, C1031p.m5718m(i14), iM5818x2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case eda.f37086g /* 48 */:
                    int iM5810p2 = AbstractC1039x.m5810p((List) unsafe2.getObject(obj, j2));
                    if (iM5810p2 > 0) {
                        iM10500a2 = dnb.m10501b(iM5810p2, C1031p.m5718m(i14), iM5810p2, iM10500a2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 49:
                    List list20 = (List) unsafe2.getObject(obj, j2);
                    iwc iwcVarM5770n2 = m5770n(i12);
                    Class cls20 = AbstractC1039x.f12262a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        iM5717i = 0;
                    } else {
                        iM5717i = 0;
                        for (int i19 = 0; i19 < size18; i19++) {
                            iM5717i += C1031p.m5717i(i14, (gfc) list20.get(i19), iwcVarM5770n2);
                        }
                    }
                    iM10500a2 += iM5717i;
                    c = 4;
                    c2 = '\b';
                    break;
                case 50:
                    Object object2 = unsafe2.getObject(obj, j2);
                    Object objM5776u2 = m5776u(i12);
                    wscVar.getClass();
                    wsc.m24151b(object2, objM5776u2);
                    c = 4;
                    c2 = '\b';
                    break;
                case 51:
                    if (m5774s(i14, obj, i12)) {
                        c3 = '\b';
                        iM10500a2 = dnb.m10500a(i14 << 3, 8, iM10500a2);
                        c2 = c3;
                        c = 4;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 52:
                    if (m5774s(i14, obj, i12)) {
                        c = 4;
                        iM10500a2 = dnb.m10500a(i14 << 3, 4, iM10500a2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 53:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5720o(m5753C(obj, j2)) + C1031p.m5725t(i14 << 3);
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 54:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5719n(i14, m5753C(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 55:
                    if (m5774s(i14, obj, i12)) {
                        int iM5752B3 = m5752B(obj, j2);
                        iM5725t = C1031p.m5725t(i14 << 3);
                        iM5715f = C1031p.m5721p(iM5752B3);
                        iM5716h = iM5715f + iM5725t;
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 56:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5723r(i14);
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 57:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5727v(i14);
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 58:
                    if (m5774s(i14, obj, i12)) {
                        iM10500a2 = dnb.m10500a(i14 << 3, 1, iM10500a2);
                        c = 4;
                        c2 = '\b';
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 59:
                    if (m5774s(i14, obj, i12)) {
                        Object object3 = unsafe2.getObject(obj, j2);
                        if (object3 instanceof zzht) {
                            iM5716h = C1031p.m5716h(i14, (zzht) object3);
                        } else {
                            iM5725t = C1031p.m5725t(i14 << 3);
                            iM5715f = C1031p.m5715f((String) object3);
                            iM5716h = iM5715f + iM5725t;
                        }
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 60:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = AbstractC1039x.m5795a(i14, unsafe2.getObject(obj, j2), m5770n(i12));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 61:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5716h(i14, (zzht) unsafe2.getObject(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 62:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5724s(i14, m5752B(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 63:
                    if (m5774s(i14, obj, i12)) {
                        int iM5752B4 = m5752B(obj, j2);
                        iM5725t = C1031p.m5725t(i14 << 3);
                        iM5715f = C1031p.m5721p(iM5752B4);
                        iM5716h = iM5715f + iM5725t;
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 64:
                    if (m5774s(i14, obj, i12)) {
                        c = 4;
                        iM10500a2 = dnb.m10500a(i14 << 3, 4, iM10500a2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 65:
                    if (m5774s(i14, obj, i12)) {
                        c3 = '\b';
                        iM10500a2 = dnb.m10500a(i14 << 3, 8, iM10500a2);
                        c2 = c3;
                        c = 4;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 66:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5726u(i14, m5752B(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 67:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5722q(i14, m5753C(obj, j2));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 68:
                    if (m5774s(i14, obj, i12)) {
                        iM5716h = C1031p.m5717i(i14, (gfc) unsafe2.getObject(obj, j2), m5770n(i12));
                        iM10500a2 += iM5716h;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                default:
                    c = 4;
                    c2 = '\b';
                    break;
            }
            i12 += 3;
            izcVar2 = izcVar;
        }
        izcVar2.getClass();
        return ((AbstractC1034s) obj).zzb.m18849d() + iM10500a2;
    }

    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v45 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v46 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v47 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v48 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v48 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v9 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: b0d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // p000.iwc
    /* JADX INFO: renamed from: f */
    public final void mo5764f(java.lang.Object r31, byte[] r32, int r33, int r34, p000.vnb r35) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C1036u.mo5764f(java.lang.Object, byte[], int, int, vnb):void");
    }

    @Override // p000.iwc
    /* JADX INFO: renamed from: g */
    public final void mo5765g(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2) {
        AbstractC1034s abstractC1034s3;
        abstractC1034s2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f12246a;
            if (i >= iArr.length) {
                AbstractC1039x.m5802h(this.f12257l, abstractC1034s, abstractC1034s2);
                return;
            }
            int iM5758A = m5758A(i);
            long j = iM5758A & 1048575;
            int i2 = iArr[i];
            switch ((iM5758A & 267386880) >>> 20) {
                case 0:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar = f0d.f38160c;
                        b0dVar.mo27d(abstractC1034s3, j, b0dVar.mo32j(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 1:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar2 = f0d.f38160c;
                        b0dVar2.mo28e(abstractC1034s3, j, b0dVar2.mo31i(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 2:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar3 = f0d.f38160c;
                        b0dVar3.m3151f(abstractC1034s3, j, b0dVar3.m3153l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 3:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar4 = f0d.f38160c;
                        b0dVar4.m3151f(abstractC1034s3, j, b0dVar4.m3153l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 4:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 5:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar5 = f0d.f38160c;
                        b0dVar5.m3151f(abstractC1034s3, j, b0dVar5.m3153l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 6:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 7:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar6 = f0d.f38160c;
                        b0dVar6.mo29g(abstractC1034s3, j, b0dVar6.mo30h(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 8:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11437d(abstractC1034s3, j, f0d.m11445l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 9:
                    abstractC1034s3 = abstractC1034s;
                    m5771p(i, abstractC1034s3, abstractC1034s2);
                    continue;
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 10:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11437d(abstractC1034s3, j, f0d.m11445l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 11:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 12:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 13:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 14:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar7 = f0d.f38160c;
                        b0dVar7.m3151f(abstractC1034s3, j, b0dVar7.m3153l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 15:
                    abstractC1034s3 = abstractC1034s;
                    if (m5773r(i, abstractC1034s2)) {
                        f0d.m11436c(j, abstractC1034s3, f0d.f38160c.m3152k(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    } else {
                        continue;
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 16:
                    if (m5773r(i, abstractC1034s2)) {
                        b0d b0dVar8 = f0d.f38160c;
                        abstractC1034s3 = abstractC1034s;
                        b0dVar8.m3151f(abstractC1034s3, j, b0dVar8.m3153l(abstractC1034s2, j));
                        m5777v(i, abstractC1034s3);
                    }
                    i += 3;
                    abstractC1034s = abstractC1034s3;
                    break;
                case 17:
                    m5771p(i, abstractC1034s, abstractC1034s2);
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
                    this.f12256k.mo9866a(abstractC1034s, j, abstractC1034s2);
                    break;
                case 50:
                    Class cls = AbstractC1039x.f12262a;
                    Object objM11445l = f0d.m11445l(abstractC1034s, j);
                    Object objM11445l2 = f0d.m11445l(abstractC1034s2, j);
                    this.f12258m.getClass();
                    f0d.m11437d(abstractC1034s, j, wsc.m24150a(objM11445l, objM11445l2));
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
                    if (m5774s(i2, abstractC1034s2, i)) {
                        f0d.m11437d(abstractC1034s, j, f0d.m11445l(abstractC1034s2, j));
                        f0d.m11436c(iArr[i + 2] & 1048575, abstractC1034s, i2);
                    }
                    break;
                case 60:
                    m5778w(i, abstractC1034s, abstractC1034s2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m5774s(i2, abstractC1034s2, i)) {
                        f0d.m11437d(abstractC1034s, j, f0d.m11445l(abstractC1034s2, j));
                        f0d.m11436c(iArr[i + 2] & 1048575, abstractC1034s, i2);
                    }
                    break;
                case 68:
                    m5778w(i, abstractC1034s, abstractC1034s2);
                    break;
            }
            abstractC1034s3 = abstractC1034s;
            i += 3;
            abstractC1034s = abstractC1034s3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // p000.iwc
    /* JADX INFO: renamed from: h */
    public final boolean mo5766h(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2) {
        int[] iArr = this.f12246a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM5803i = true;
            if (i < length) {
                int iM5758A = m5758A(i);
                long j = iM5758A & 1048575;
                switch ((iM5758A & 267386880) >>> 20) {
                    case 0:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar = f0d.f38160c;
                            if (Double.doubleToLongBits(b0dVar.mo32j(abstractC1034s, j)) != Double.doubleToLongBits(b0dVar.mo32j(abstractC1034s2, j))) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar2 = f0d.f38160c;
                            if (Float.floatToIntBits(b0dVar2.mo31i(abstractC1034s, j)) != Float.floatToIntBits(b0dVar2.mo31i(abstractC1034s2, j))) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar3 = f0d.f38160c;
                            if (b0dVar3.m3153l(abstractC1034s, j) != b0dVar3.m3153l(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar4 = f0d.f38160c;
                            if (b0dVar4.m3153l(abstractC1034s, j) != b0dVar4.m3153l(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar5 = f0d.f38160c;
                            if (b0dVar5.m3152k(abstractC1034s, j) != b0dVar5.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar6 = f0d.f38160c;
                            if (b0dVar6.m3153l(abstractC1034s, j) != b0dVar6.m3153l(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar7 = f0d.f38160c;
                            if (b0dVar7.m3152k(abstractC1034s, j) != b0dVar7.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar8 = f0d.f38160c;
                            if (b0dVar8.mo30h(abstractC1034s, j) != b0dVar8.mo30h(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i) || !AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j))) {
                            zM5803i = false;
                        }
                        break;
                    case 9:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i) || !AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j))) {
                            zM5803i = false;
                        }
                        break;
                    case 10:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i) || !AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j))) {
                            zM5803i = false;
                        }
                        break;
                    case 11:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar9 = f0d.f38160c;
                            if (b0dVar9.m3152k(abstractC1034s, j) != b0dVar9.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar10 = f0d.f38160c;
                            if (b0dVar10.m3152k(abstractC1034s, j) != b0dVar10.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar11 = f0d.f38160c;
                            if (b0dVar11.m3152k(abstractC1034s, j) != b0dVar11.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar12 = f0d.f38160c;
                            if (b0dVar12.m3153l(abstractC1034s, j) != b0dVar12.m3153l(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar13 = f0d.f38160c;
                            if (b0dVar13.m3152k(abstractC1034s, j) != b0dVar13.m3152k(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i)) {
                            zM5803i = false;
                        } else {
                            b0d b0dVar14 = f0d.f38160c;
                            if (b0dVar14.m3153l(abstractC1034s, j) != b0dVar14.m3153l(abstractC1034s2, j)) {
                                zM5803i = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m5781z(abstractC1034s, abstractC1034s2, i) || !AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j))) {
                            zM5803i = false;
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
                        zM5803i = AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j));
                        break;
                    case 50:
                        zM5803i = AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j));
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
                        b0d b0dVar15 = f0d.f38160c;
                        if (b0dVar15.m3152k(abstractC1034s, j2) != b0dVar15.m3152k(abstractC1034s2, j2) || !AbstractC1039x.m5803i(f0d.m11445l(abstractC1034s, j), f0d.m11445l(abstractC1034s2, j))) {
                            zM5803i = false;
                        }
                        break;
                }
                if (zM5803i) {
                    i += 3;
                }
            } else {
                this.f12257l.getClass();
                if (abstractC1034s.zzb.equals(abstractC1034s2.zzb)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final int m5767i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vnb vnbVar) throws zzjk {
        int i9;
        int i10;
        int iM21287n;
        Object object;
        Unsafe unsafe = f12245o;
        long j2 = this.f12246a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(sdd.m21288o(i9, bArr))));
                iM21287n = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(sdd.m21279f(i10, bArr))));
                iM21287n = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iM21287n = sdd.m21287n(bArr, i, vnbVar);
                unsafe.putObject(obj, j, Long.valueOf(vnbVar.f65675b));
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iM21287n = sdd.m21286m(bArr, i, vnbVar);
                unsafe.putObject(obj, j, Integer.valueOf(vnbVar.f65674a));
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Long.valueOf(sdd.m21288o(i9, bArr)));
                iM21287n = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(sdd.m21279f(i10, bArr)));
                iM21287n = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iM21287n = sdd.m21287n(bArr, i, vnbVar);
                unsafe.putObject(obj, j, Boolean.valueOf(vnbVar.f65675b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM21286m = sdd.m21286m(bArr, i, vnbVar);
                int i11 = vnbVar.f65674a;
                if (i11 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!AbstractC1040y.f12266a.m5828f(bArr, iM21286m, iM21286m + i11)) {
                            throw zzjk.m5837c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM21286m, i11, noc.f53082a));
                    iM21286m += i11;
                }
                unsafe.putInt(obj, j2, i4);
                return iM21286m;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM21285l = sdd.m21285l(m5770n(i8), bArr, i, i2, vnbVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = vnbVar.f65676c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, noc.m17575b(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return iM21285l;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iM21287n = sdd.m21291r(bArr, i, vnbVar);
                unsafe.putObject(obj, j, vnbVar.f65676c);
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM21286m2 = sdd.m21286m(bArr, i, vnbVar);
                int i12 = vnbVar.f65674a;
                toc tocVarM5780y = m5780y(i8);
                if (tocVarM5780y != null && !tocVarM5780y.mo10914a(i12)) {
                    m5754D(obj).m18847a(i3, Long.valueOf(i12));
                    return iM21286m2;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                iM21287n = iM21286m2;
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iM21287n = sdd.m21286m(bArr, i, vnbVar);
                unsafe.putObject(obj, j, Integer.valueOf(ydd.m25105b(vnbVar.f65674a)));
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iM21287n = sdd.m21287n(bArr, i, vnbVar);
                long j3 = vnbVar.f65675b;
                unsafe.putObject(obj, j, Long.valueOf((-(j3 & 1)) ^ (j3 >>> 1)));
                unsafe.putInt(obj, j2, i4);
                return iM21287n;
            case 68:
                if (i5 == 3) {
                    iM21287n = sdd.m21284k(m5770n(i8), bArr, i, i2, (i3 & (-8)) | 4, vnbVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = vnbVar.f65676c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, noc.m17575b(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM21287n;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: j */
    public final int m5768j(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, vnb vnbVar) throws zzjk {
        int iM21280g;
        Unsafe unsafe = f12245o;
        mpc mpcVarMo5748a = (mpc) unsafe.getObject(obj, j2);
        if (!mpcVarMo5748a.zza()) {
            int size = mpcVarMo5748a.size();
            mpcVarMo5748a = mpcVarMo5748a.mo5748a(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, mpcVarMo5748a);
        }
        mpc mpcVar = mpcVarMo5748a;
        switch (i7) {
            case 18:
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i5 != 2) {
                    if (i5 == 1) {
                        Double.longBitsToDouble(sdd.m21288o(i, bArr));
                        throw null;
                    }
                    return i;
                }
                int iM21286m = sdd.m21286m(bArr, i, vnbVar);
                int i8 = vnbVar.f65674a + iM21286m;
                if (iM21286m < i8) {
                    Double.longBitsToDouble(sdd.m21288o(iM21286m, bArr));
                    throw null;
                }
                if (iM21286m == i8) {
                    return iM21286m;
                }
                throw zzjk.m5835a();
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 != 2) {
                    if (i5 == 5) {
                        Float.intBitsToFloat(sdd.m21279f(i, bArr));
                        throw null;
                    }
                    return i;
                }
                int iM21286m2 = sdd.m21286m(bArr, i, vnbVar);
                int i9 = vnbVar.f65674a + iM21286m2;
                if (iM21286m2 < i9) {
                    Float.intBitsToFloat(sdd.m21279f(iM21286m2, bArr));
                    throw null;
                }
                if (iM21286m2 == i9) {
                    return iM21286m2;
                }
                throw zzjk.m5835a();
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i5 != 2) {
                    if (i5 == 0) {
                        sdd.m21287n(bArr, i, vnbVar);
                        throw null;
                    }
                    return i;
                }
                int iM21286m3 = sdd.m21286m(bArr, i, vnbVar);
                int i10 = vnbVar.f65674a + iM21286m3;
                if (iM21286m3 < i10) {
                    sdd.m21287n(bArr, iM21286m3, vnbVar);
                    throw null;
                }
                if (iM21286m3 == i10) {
                    return iM21286m3;
                }
                throw zzjk.m5835a();
            case 22:
            case 29:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return sdd.m21280g(i3, bArr, i, i2, mpcVar, vnbVar);
                    }
                    return i;
                }
                doc docVar = (doc) mpcVar;
                int iM21286m4 = sdd.m21286m(bArr, i, vnbVar);
                int i11 = vnbVar.f65674a + iM21286m4;
                while (iM21286m4 < i11) {
                    iM21286m4 = sdd.m21286m(bArr, iM21286m4, vnbVar);
                    docVar.m10562f(vnbVar.f65674a);
                }
                if (iM21286m4 == i11) {
                    return iM21286m4;
                }
                throw zzjk.m5835a();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 32:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case 46:
                if (i5 != 2) {
                    if (i5 == 1) {
                        sdd.m21288o(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int iM21286m5 = sdd.m21286m(bArr, i, vnbVar);
                int i12 = vnbVar.f65674a + iM21286m5;
                if (iM21286m5 < i12) {
                    sdd.m21288o(iM21286m5, bArr);
                    throw null;
                }
                if (iM21286m5 == i12) {
                    return iM21286m5;
                }
                throw zzjk.m5835a();
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    doc docVar2 = (doc) mpcVar;
                    int iM21286m6 = sdd.m21286m(bArr, i, vnbVar);
                    int i13 = vnbVar.f65674a + iM21286m6;
                    while (iM21286m6 < i13) {
                        docVar2.m10562f(sdd.m21279f(iM21286m6, bArr));
                        iM21286m6 += 4;
                    }
                    if (iM21286m6 == i13) {
                        return iM21286m6;
                    }
                    throw zzjk.m5835a();
                }
                if (i5 == 5) {
                    doc docVar3 = (doc) mpcVar;
                    docVar3.m10562f(sdd.m21279f(i, bArr));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int iM21286m7 = sdd.m21286m(bArr, i14, vnbVar);
                        if (i3 != vnbVar.f65674a) {
                            return i14;
                        }
                        docVar3.m10562f(sdd.m21279f(iM21286m7, bArr));
                        i14 = iM21286m7 + 4;
                    }
                    return i14;
                }
                return i;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        sdd.m21287n(bArr, i, vnbVar);
                        throw null;
                    }
                    return i;
                }
                int iM21286m8 = sdd.m21286m(bArr, i, vnbVar);
                int i15 = vnbVar.f65674a + iM21286m8;
                if (iM21286m8 < i15) {
                    sdd.m21287n(bArr, iM21286m8, vnbVar);
                    throw null;
                }
                if (iM21286m8 == i15) {
                    return iM21286m8;
                }
                throw zzjk.m5835a();
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iM21286m9 = sdd.m21286m(bArr, i, vnbVar);
                        int i16 = vnbVar.f65674a;
                        if (i16 < 0) {
                            throw zzjk.m5836b();
                        }
                        if (i16 == 0) {
                            mpcVar.add("");
                        } else {
                            mpcVar.add(new String(bArr, iM21286m9, i16, noc.f53082a));
                            iM21286m9 += i16;
                        }
                        while (iM21286m9 < i2) {
                            int iM21286m10 = sdd.m21286m(bArr, iM21286m9, vnbVar);
                            if (i3 != vnbVar.f65674a) {
                                return iM21286m9;
                            }
                            iM21286m9 = sdd.m21286m(bArr, iM21286m10, vnbVar);
                            int i17 = vnbVar.f65674a;
                            if (i17 < 0) {
                                throw zzjk.m5836b();
                            }
                            if (i17 == 0) {
                                mpcVar.add("");
                            } else {
                                mpcVar.add(new String(bArr, iM21286m9, i17, noc.f53082a));
                                iM21286m9 += i17;
                            }
                        }
                        return iM21286m9;
                    }
                    int iM21286m11 = sdd.m21286m(bArr, i, vnbVar);
                    int i18 = vnbVar.f65674a;
                    if (i18 < 0) {
                        throw zzjk.m5836b();
                    }
                    if (i18 == 0) {
                        mpcVar.add("");
                    } else {
                        int i19 = iM21286m11 + i18;
                        if (!AbstractC1040y.f12266a.m5828f(bArr, iM21286m11, i19)) {
                            throw zzjk.m5837c();
                        }
                        mpcVar.add(new String(bArr, iM21286m11, i18, noc.f53082a));
                        iM21286m11 = i19;
                    }
                    while (iM21286m11 < i2) {
                        int iM21286m12 = sdd.m21286m(bArr, iM21286m11, vnbVar);
                        if (i3 != vnbVar.f65674a) {
                            return iM21286m11;
                        }
                        iM21286m11 = sdd.m21286m(bArr, iM21286m12, vnbVar);
                        int i20 = vnbVar.f65674a;
                        if (i20 < 0) {
                            throw zzjk.m5836b();
                        }
                        if (i20 == 0) {
                            mpcVar.add("");
                        } else {
                            int i21 = iM21286m11 + i20;
                            if (!AbstractC1040y.f12266a.m5828f(bArr, iM21286m11, i21)) {
                                throw zzjk.m5837c();
                            }
                            mpcVar.add(new String(bArr, iM21286m11, i20, noc.f53082a));
                            iM21286m11 = i21;
                        }
                    }
                    return iM21286m11;
                }
                return i;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i5 == 2) {
                    return sdd.m21283j(m5770n(i6), i3, bArr, i, i2, mpcVar, vnbVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iM21286m13 = sdd.m21286m(bArr, i, vnbVar);
                    int i22 = vnbVar.f65674a;
                    if (i22 < 0) {
                        throw zzjk.m5836b();
                    }
                    if (i22 > bArr.length - iM21286m13) {
                        throw zzjk.m5835a();
                    }
                    if (i22 == 0) {
                        mpcVar.add(zzht.f12293b);
                    } else {
                        mpcVar.add(zzht.m5829g(bArr, iM21286m13, i22));
                        iM21286m13 += i22;
                    }
                    while (iM21286m13 < i2) {
                        int iM21286m14 = sdd.m21286m(bArr, iM21286m13, vnbVar);
                        if (i3 != vnbVar.f65674a) {
                            return iM21286m13;
                        }
                        iM21286m13 = sdd.m21286m(bArr, iM21286m14, vnbVar);
                        int i23 = vnbVar.f65674a;
                        if (i23 < 0) {
                            throw zzjk.m5836b();
                        }
                        if (i23 > bArr.length - iM21286m13) {
                            throw zzjk.m5835a();
                        }
                        if (i23 == 0) {
                            mpcVar.add(zzht.f12293b);
                        } else {
                            mpcVar.add(zzht.m5829g(bArr, iM21286m13, i23));
                            iM21286m13 += i23;
                        }
                    }
                    return iM21286m13;
                }
                return i;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM21280g = sdd.m21280g(i3, bArr, i, i2, mpcVar, vnbVar);
                    }
                    return i;
                }
                doc docVar4 = (doc) mpcVar;
                iM21280g = sdd.m21286m(bArr, i, vnbVar);
                int i24 = vnbVar.f65674a + iM21280g;
                while (iM21280g < i24) {
                    iM21280g = sdd.m21286m(bArr, iM21280g, vnbVar);
                    docVar4.m10562f(vnbVar.f65674a);
                }
                if (iM21280g != i24) {
                    throw zzjk.m5835a();
                }
                AbstractC1034s abstractC1034s = (AbstractC1034s) obj;
                ozc ozcVar = abstractC1034s.zzb;
                ozc ozcVarM18846b = ozcVar != ozc.f55341f ? ozcVar : null;
                toc tocVarM5780y = m5780y(i6);
                Class cls = AbstractC1039x.f12262a;
                if (tocVarM5780y != null) {
                    boolean z = mpcVar instanceof RandomAccess;
                    izc izcVar = this.f12257l;
                    if (z) {
                        int size2 = mpcVar.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            Integer num = (Integer) mpcVar.get(i26);
                            int iIntValue = num.intValue();
                            if (tocVarM5780y.mo10914a(iIntValue)) {
                                if (i26 != i25) {
                                    mpcVar.set(i25, num);
                                }
                                i25++;
                            } else {
                                if (ozcVarM18846b == null) {
                                    izcVar.getClass();
                                    ozcVarM18846b = ozc.m18846b();
                                }
                                izcVar.getClass();
                                ozcVarM18846b.m18847a(i4 << 3, Long.valueOf(iIntValue));
                            }
                        }
                        if (i25 != size2) {
                            mpcVar.subList(i25, size2).clear();
                        }
                    } else {
                        Iterator it = mpcVar.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!tocVarM5780y.mo10914a(iIntValue2)) {
                                if (ozcVarM18846b == null) {
                                    izcVar.getClass();
                                    ozcVarM18846b = ozc.m18846b();
                                }
                                izcVar.getClass();
                                ozcVarM18846b.m18847a(i4 << 3, Long.valueOf(iIntValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (ozcVarM18846b != null) {
                    abstractC1034s.zzb = ozcVarM18846b;
                }
                return iM21280g;
            case 33:
            case 47:
                if (i5 == 2) {
                    doc docVar5 = (doc) mpcVar;
                    int iM21286m15 = sdd.m21286m(bArr, i, vnbVar);
                    int i27 = vnbVar.f65674a + iM21286m15;
                    while (iM21286m15 < i27) {
                        iM21286m15 = sdd.m21286m(bArr, iM21286m15, vnbVar);
                        docVar5.m10562f(ydd.m25105b(vnbVar.f65674a));
                    }
                    if (iM21286m15 == i27) {
                        return iM21286m15;
                    }
                    throw zzjk.m5835a();
                }
                if (i5 == 0) {
                    doc docVar6 = (doc) mpcVar;
                    int iM21286m16 = sdd.m21286m(bArr, i, vnbVar);
                    docVar6.m10562f(ydd.m25105b(vnbVar.f65674a));
                    while (iM21286m16 < i2) {
                        int iM21286m17 = sdd.m21286m(bArr, iM21286m16, vnbVar);
                        if (i3 != vnbVar.f65674a) {
                            return iM21286m16;
                        }
                        iM21286m16 = sdd.m21286m(bArr, iM21286m17, vnbVar);
                        docVar6.m10562f(ydd.m25105b(vnbVar.f65674a));
                    }
                    return iM21286m16;
                }
                return i;
            case 34:
            case eda.f37086g /* 48 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        sdd.m21287n(bArr, i, vnbVar);
                        throw null;
                    }
                    return i;
                }
                int iM21286m18 = sdd.m21286m(bArr, i, vnbVar);
                int i28 = vnbVar.f65674a + iM21286m18;
                if (iM21286m18 < i28) {
                    sdd.m21287n(bArr, iM21286m18, vnbVar);
                    throw null;
                }
                if (iM21286m18 == i28) {
                    return iM21286m18;
                }
                throw zzjk.m5835a();
            case 49:
                if (i5 == 3) {
                    iwc iwcVarM5770n = m5770n(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int iM21284k = sdd.m21284k(iwcVarM5770n, bArr, i, i2, i29, vnbVar);
                    int i30 = i2;
                    int i31 = i29;
                    vnb vnbVar2 = vnbVar;
                    mpcVar.add(vnbVar2.f65676c);
                    while (iM21284k < i30) {
                        int iM21286m19 = sdd.m21286m(bArr, iM21284k, vnbVar2);
                        if (i3 != vnbVar2.f65674a) {
                            return iM21284k;
                        }
                        int i32 = i31;
                        int i33 = i30;
                        vnb vnbVar3 = vnbVar2;
                        iM21284k = sdd.m21284k(iwcVarM5770n, bArr, iM21286m19, i33, i32, vnbVar3);
                        mpcVar.add(vnbVar3.f65676c);
                        i31 = i32;
                        i30 = i33;
                        vnbVar2 = vnbVar3;
                    }
                    return iM21284k;
                }
                return i;
            default:
                return i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final int m5769k(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p000.vnb r35) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C1036u.m5769k(java.lang.Object, byte[], int, int, int, vnb):int");
    }

    /* JADX INFO: renamed from: n */
    public final iwc m5770n(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f12247b;
        iwc iwcVar = (iwc) objArr[i2];
        if (iwcVar != null) {
            return iwcVar;
        }
        iwc iwcVarM18526a = ovc.f55046c.m18526a((Class) objArr[i2 + 1]);
        objArr[i2] = iwcVarM18526a;
        return iwcVarM18526a;
    }

    /* JADX INFO: renamed from: p */
    public final void m5771p(int i, Object obj, Object obj2) {
        long jM5758A = m5758A(i) & 1048575;
        if (m5773r(i, obj2)) {
            Object objM11445l = f0d.m11445l(obj, jM5758A);
            Object objM11445l2 = f0d.m11445l(obj2, jM5758A);
            if (objM11445l != null && objM11445l2 != null) {
                f0d.m11437d(obj, jM5758A, noc.m17575b(objM11445l, objM11445l2));
                m5777v(i, obj);
            } else if (objM11445l2 != null) {
                f0d.m11437d(obj, jM5758A, objM11445l2);
                m5777v(i, obj);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5772q(long j, Object obj, int i) {
        zzke zzkeVar;
        Unsafe unsafe = f12245o;
        Object objM5776u = m5776u(i);
        Object object = unsafe.getObject(obj, j);
        this.f12258m.getClass();
        if (!((zzke) object).f12300a) {
            zzke zzkeVar2 = zzke.f12299b;
            if (zzkeVar2.isEmpty()) {
                zzkeVar = new zzke();
            } else {
                zzke zzkeVar3 = new zzke(zzkeVar2);
                zzkeVar3.f12300a = true;
                zzkeVar = zzkeVar3;
            }
            wsc.m24150a(zzkeVar, object);
            unsafe.putObject(obj, j, zzkeVar);
        }
        if (objM5776u != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x010c A[RETURN] */
    /* JADX INFO: renamed from: r */
    public final boolean m5773r(int i, Object obj) {
        int i2 = this.f12246a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & f0d.f38160c.m3152k(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iM5758A = m5758A(i);
        long j2 = iM5758A & 1048575;
        switch ((iM5758A & 267386880) >>> 20) {
            case 0:
                if (f0d.f38160c.mo32j(obj, j2) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (f0d.f38160c.mo31i(obj, j2) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (f0d.f38160c.m3153l(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (f0d.f38160c.m3153l(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (f0d.f38160c.m3153l(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return f0d.f38160c.mo30h(obj, j2);
            case 8:
                Object objM11445l = f0d.m11445l(obj, j2);
                if (objM11445l instanceof String) {
                    if (((String) objM11445l).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM11445l instanceof zzht)) {
                    ij6.m13959q();
                    return false;
                }
                if (zzht.f12293b.equals(objM11445l)) {
                    return false;
                }
                return true;
            case 9:
                if (f0d.m11445l(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (zzht.f12293b.equals(f0d.m11445l(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (f0d.f38160c.m3153l(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (f0d.f38160c.m3152k(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (f0d.f38160c.m3153l(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (f0d.m11445l(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5774s(int i, Object obj, int i2) {
        return f0d.f38160c.m3152k(obj, (long) (this.f12246a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: t */
    public final int m5775t(int i, int i2) {
        int[] iArr = this.f12246a;
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

    /* JADX INFO: renamed from: u */
    public final Object m5776u(int i) {
        return this.f12247b[(i / 3) << 1];
    }

    /* JADX INFO: renamed from: v */
    public final void m5777v(int i, Object obj) {
        int i2 = this.f12246a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        f0d.m11436c(j, obj, (1 << (i2 >>> 20)) | f0d.f38160c.m3152k(obj, j));
    }

    /* JADX INFO: renamed from: w */
    public final void m5778w(int i, Object obj, Object obj2) {
        int iM5758A = m5758A(i);
        int[] iArr = this.f12246a;
        int i2 = iArr[i];
        long j = iM5758A & 1048575;
        if (m5774s(i2, obj2, i)) {
            Object objM11445l = m5774s(i2, obj, i) ? f0d.m11445l(obj, j) : null;
            Object objM11445l2 = f0d.m11445l(obj2, j);
            if (objM11445l != null && objM11445l2 != null) {
                f0d.m11437d(obj, j, noc.m17575b(objM11445l, objM11445l2));
                f0d.m11436c(iArr[i + 2] & 1048575, obj, i2);
            } else if (objM11445l2 != null) {
                f0d.m11437d(obj, j, objM11445l2);
                f0d.m11436c(iArr[i + 2] & 1048575, obj, i2);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5779x(Object obj, C1032q c1032q) throws zzii$zzb {
        int i;
        int i2;
        int i3;
        int[] iArr = this.f12246a;
        int length = iArr.length;
        Unsafe unsafe = f12245o;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int iM5758A = m5758A(i6);
            int i7 = iArr[i6];
            int i8 = (267386880 & iM5758A) >>> 20;
            if (i8 <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1048575;
                int i10 = i9 & 1048575;
                if (i10 != i4) {
                    i5 = unsafe.getInt(obj, i10);
                    i4 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i = 1048575;
                i2 = 0;
            }
            int i11 = i6;
            long j = iM5758A & i;
            switch (i8) {
                case 0:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        double dMo32j = f0d.f38160c.mo32j(obj, j);
                        C1031p c1031p = c1032q.f12240a;
                        c1031p.getClass();
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(dMo32j);
                        c1031p.m5730c(i7, 1);
                        c1031p.m5734j(jDoubleToRawLongBits);
                        continue;
                    }
                    break;
                case 1:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        float fMo31i = f0d.f38160c.mo31i(obj, j);
                        C1031p c1031p2 = c1032q.f12240a;
                        c1031p2.getClass();
                        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo31i);
                        c1031p2.m5730c(i7, 5);
                        c1031p2.m5736l(iFloatToRawIntBits);
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        C1031p c1031p3 = c1032q.f12240a;
                        c1031p3.m5730c(i7, 0);
                        c1031p3.m5731d(j2);
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        C1031p c1031p4 = c1032q.f12240a;
                        c1031p4.m5730c(i7, 0);
                        c1031p4.m5731d(j3);
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        C1031p c1031p5 = c1032q.f12240a;
                        c1031p5.m5730c(i7, 0);
                        c1031p5.m5729b(i12);
                    }
                    break;
                case 5:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        C1031p c1031p6 = c1032q.f12240a;
                        c1031p6.m5730c(i7, 1);
                        c1031p6.m5734j(j4);
                    }
                    break;
                case 6:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        C1031p c1031p7 = c1032q.f12240a;
                        c1031p7.m5730c(i7, 5);
                        c1031p7.m5736l(i13);
                    }
                    break;
                case 7:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        boolean zMo30h = f0d.f38160c.mo30h(obj, j);
                        C1031p c1031p8 = c1032q.f12240a;
                        c1031p8.m5730c(i7, 0);
                        c1031p8.m5728a(zMo30h ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        m5757o(i7, unsafe.getObject(obj, j), c1032q);
                    }
                    break;
                case 9:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        c1032q.m5738b(i7, unsafe.getObject(obj, j), m5770n(i3));
                    }
                    break;
                case 10:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        c1032q.m5737a(i7, (zzht) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        C1031p c1031p9 = c1032q.f12240a;
                        c1031p9.m5730c(i7, 0);
                        c1031p9.m5733g(i14);
                    }
                    break;
                case 12:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        C1031p c1031p10 = c1032q.f12240a;
                        c1031p10.m5730c(i7, 0);
                        c1031p10.m5729b(i15);
                    }
                    break;
                case 13:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        C1031p c1031p11 = c1032q.f12240a;
                        c1031p11.m5730c(i7, 5);
                        c1031p11.m5736l(i16);
                    }
                    break;
                case 14:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        C1031p c1031p12 = c1032q.f12240a;
                        c1031p12.m5730c(i7, 1);
                        c1031p12.m5734j(j5);
                    }
                    break;
                case 15:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        C1031p c1031p13 = c1032q.f12240a;
                        c1031p13.m5730c(i7, 0);
                        c1031p13.m5733g((i17 >> 31) ^ (i17 << 1));
                    }
                    break;
                case 16:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        C1031p c1031p14 = c1032q.f12240a;
                        c1031p14.m5730c(i7, 0);
                        c1031p14.m5731d((j6 << 1) ^ (j6 >> 63));
                    }
                    break;
                case 17:
                    i3 = i11;
                    if ((i2 & i5) != 0) {
                        c1032q.m5739c(i7, unsafe.getObject(obj, j), m5770n(i3));
                    }
                    break;
                case 18:
                    i3 = i11;
                    AbstractC1039x.m5801g(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    break;
                case 19:
                    i3 = i11;
                    AbstractC1039x.m5808n(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 20:
                    i3 = i11;
                    AbstractC1039x.m5811q(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 21:
                    i3 = i11;
                    AbstractC1039x.m5813s(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 22:
                    i3 = i11;
                    AbstractC1039x.m5786B(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    i3 = i11;
                    AbstractC1039x.m5817w(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 24:
                    i3 = i11;
                    AbstractC1039x.m5791G(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 25:
                    i3 = i11;
                    AbstractC1039x.m5794J(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 26:
                    i3 = i11;
                    AbstractC1039x.m5799e(iArr[i3], (List) unsafe.getObject(obj, j), c1032q);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i3 = i11;
                    AbstractC1039x.m5800f(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, m5770n(i3));
                    break;
                case 28:
                    i3 = i11;
                    AbstractC1039x.m5806l(iArr[i3], (List) unsafe.getObject(obj, j), c1032q);
                    break;
                case 29:
                    i3 = i11;
                    AbstractC1039x.m5789E(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    break;
                case 30:
                    i3 = i11;
                    AbstractC1039x.m5793I(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i3 = i11;
                    AbstractC1039x.m5792H(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 32:
                    i3 = i11;
                    AbstractC1039x.m5819y(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 33:
                    i3 = i11;
                    AbstractC1039x.m5790F(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case 34:
                    i3 = i11;
                    AbstractC1039x.m5815u(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, false);
                    continue;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    i3 = i11;
                    AbstractC1039x.m5801g(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i3 = i11;
                    AbstractC1039x.m5808n(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i3 = i11;
                    AbstractC1039x.m5811q(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 38:
                    i3 = i11;
                    AbstractC1039x.m5813s(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i3 = i11;
                    AbstractC1039x.m5786B(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i3 = i11;
                    AbstractC1039x.m5817w(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i3 = i11;
                    AbstractC1039x.m5791G(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 42:
                    i3 = i11;
                    AbstractC1039x.m5794J(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 43:
                    i3 = i11;
                    AbstractC1039x.m5789E(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i3 = i11;
                    AbstractC1039x.m5793I(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i3 = i11;
                    AbstractC1039x.m5792H(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 46:
                    i3 = i11;
                    AbstractC1039x.m5819y(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 47:
                    i3 = i11;
                    AbstractC1039x.m5790F(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case eda.f37086g /* 48 */:
                    i3 = i11;
                    AbstractC1039x.m5815u(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, true);
                    break;
                case 49:
                    i3 = i11;
                    AbstractC1039x.m5807m(iArr[i3], (List) unsafe.getObject(obj, j), c1032q, m5770n(i3));
                    break;
                case 50:
                    i3 = i11;
                    if (unsafe.getObject(obj, j) != null) {
                        Object objM5776u = m5776u(i3);
                        this.f12258m.getClass();
                        if (objM5776u == null) {
                            throw new NoSuchMethodError();
                        }
                        ho2.m13383c();
                        return;
                    }
                    break;
                case 51:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        double dDoubleValue = ((Double) f0d.m11445l(obj, j)).doubleValue();
                        C1031p c1031p15 = c1032q.f12240a;
                        c1031p15.getClass();
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(dDoubleValue);
                        c1031p15.m5730c(i7, 1);
                        c1031p15.m5734j(jDoubleToRawLongBits2);
                    }
                    break;
                case 52:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        float fFloatValue = ((Float) f0d.m11445l(obj, j)).floatValue();
                        C1031p c1031p16 = c1032q.f12240a;
                        c1031p16.getClass();
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue);
                        c1031p16.m5730c(i7, 5);
                        c1031p16.m5736l(iFloatToRawIntBits2);
                    }
                    break;
                case 53:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        long jM5753C = m5753C(obj, j);
                        C1031p c1031p17 = c1032q.f12240a;
                        c1031p17.m5730c(i7, 0);
                        c1031p17.m5731d(jM5753C);
                    }
                    break;
                case 54:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        long jM5753C2 = m5753C(obj, j);
                        C1031p c1031p18 = c1032q.f12240a;
                        c1031p18.m5730c(i7, 0);
                        c1031p18.m5731d(jM5753C2);
                    } else {
                        continue;
                    }
                    break;
                case 55:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B = m5752B(obj, j);
                        C1031p c1031p19 = c1032q.f12240a;
                        c1031p19.m5730c(i7, 0);
                        c1031p19.m5729b(iM5752B);
                    }
                    break;
                case 56:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        long jM5753C3 = m5753C(obj, j);
                        C1031p c1031p20 = c1032q.f12240a;
                        c1031p20.m5730c(i7, 1);
                        c1031p20.m5734j(jM5753C3);
                    }
                    break;
                case 57:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B2 = m5752B(obj, j);
                        C1031p c1031p21 = c1032q.f12240a;
                        c1031p21.m5730c(i7, 5);
                        c1031p21.m5736l(iM5752B2);
                    }
                    break;
                case 58:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        boolean zBooleanValue = ((Boolean) f0d.m11445l(obj, j)).booleanValue();
                        C1031p c1031p22 = c1032q.f12240a;
                        c1031p22.m5730c(i7, 0);
                        c1031p22.m5728a(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        m5757o(i7, unsafe.getObject(obj, j), c1032q);
                    }
                    break;
                case 60:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        c1032q.m5738b(i7, unsafe.getObject(obj, j), m5770n(i3));
                    }
                    break;
                case 61:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        c1032q.m5737a(i7, (zzht) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B3 = m5752B(obj, j);
                        C1031p c1031p23 = c1032q.f12240a;
                        c1031p23.m5730c(i7, 0);
                        c1031p23.m5733g(iM5752B3);
                    }
                    break;
                case 63:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B4 = m5752B(obj, j);
                        C1031p c1031p24 = c1032q.f12240a;
                        c1031p24.m5730c(i7, 0);
                        c1031p24.m5729b(iM5752B4);
                    }
                    break;
                case 64:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B5 = m5752B(obj, j);
                        C1031p c1031p25 = c1032q.f12240a;
                        c1031p25.m5730c(i7, 5);
                        c1031p25.m5736l(iM5752B5);
                    }
                    break;
                case 65:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        long jM5753C4 = m5753C(obj, j);
                        C1031p c1031p26 = c1032q.f12240a;
                        c1031p26.m5730c(i7, 1);
                        c1031p26.m5734j(jM5753C4);
                    }
                    break;
                case 66:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        int iM5752B6 = m5752B(obj, j);
                        C1031p c1031p27 = c1032q.f12240a;
                        c1031p27.m5730c(i7, 0);
                        c1031p27.m5733g((iM5752B6 >> 31) ^ (iM5752B6 << 1));
                    }
                    break;
                case 67:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        long jM5753C5 = m5753C(obj, j);
                        C1031p c1031p28 = c1032q.f12240a;
                        c1031p28.m5730c(i7, 0);
                        c1031p28.m5731d((jM5753C5 << 1) ^ (jM5753C5 >> 63));
                    }
                    break;
                case 68:
                    i3 = i11;
                    if (m5774s(i7, obj, i3)) {
                        c1032q.m5739c(i7, unsafe.getObject(obj, j), m5770n(i3));
                    }
                    break;
                default:
                    i3 = i11;
                    break;
            }
        }
        this.f12257l.getClass();
        ((AbstractC1034s) obj).zzb.m18848c(c1032q);
    }

    /* JADX INFO: renamed from: y */
    public final toc m5780y(int i) {
        return (toc) this.f12247b[((i / 3) << 1) + 1];
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5781z(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2, int i) {
        return m5773r(i, abstractC1034s) == m5773r(i, abstractC1034s2);
    }

    @Override // p000.iwc
    public final Object zza() {
        this.f12255j.getClass();
        return ((AbstractC1034s) this.f12250e).mo5699e(4);
    }
}
