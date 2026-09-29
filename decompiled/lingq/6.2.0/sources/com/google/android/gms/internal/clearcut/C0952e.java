package com.google.android.gms.internal.clearcut;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.List;
import p000.a4c;
import p000.b5c;
import p000.btb;
import p000.byb;
import p000.eda;
import p000.etb;
import p000.f1c;
import p000.ho2;
import p000.ij6;
import p000.jnb;
import p000.m1c;
import p000.mvb;
import p000.p5c;
import p000.qcd;
import p000.r0c;
import p000.u3c;
import p000.utb;
import p000.uzb;
import p000.vnb;
import p000.w4c;
import p000.z0c;
import p000.zmb;
import p000.zqb;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0952e implements m1c {

    /* JADX INFO: renamed from: o */
    public static final Unsafe f11779o = b5c.m3315f();

    /* JADX INFO: renamed from: a */
    public final int[] f11780a;

    /* JADX INFO: renamed from: b */
    public final Object[] f11781b;

    /* JADX INFO: renamed from: c */
    public final int f11782c;

    /* JADX INFO: renamed from: d */
    public final int f11783d;

    /* JADX INFO: renamed from: e */
    public final int f11784e;

    /* JADX INFO: renamed from: f */
    public final zmb f11785f;

    /* JADX INFO: renamed from: g */
    public final boolean f11786g;

    /* JADX INFO: renamed from: h */
    public final int[] f11787h;

    /* JADX INFO: renamed from: i */
    public final int[] f11788i;

    /* JADX INFO: renamed from: j */
    public final int[] f11789j;

    /* JADX INFO: renamed from: k */
    public final uzb f11790k;

    /* JADX INFO: renamed from: l */
    public final mvb f11791l;

    /* JADX INFO: renamed from: m */
    public final a4c f11792m;

    /* JADX INFO: renamed from: n */
    public final byb f11793n;

    public C0952e(int[] iArr, Object[] objArr, int i, int i2, int i3, zmb zmbVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, uzb uzbVar, mvb mvbVar, a4c a4cVar, zqb zqbVar, byb bybVar) {
        this.f11780a = iArr;
        this.f11781b = objArr;
        this.f11782c = i;
        this.f11783d = i2;
        this.f11784e = i3;
        this.f11786g = z;
        this.f11787h = iArr2;
        this.f11788i = iArr3;
        this.f11789j = iArr4;
        this.f11790k = uzbVar;
        this.f11791l = mvbVar;
        this.f11792m = a4cVar;
        this.f11785f = zmbVar;
        this.f11793n = bybVar;
    }

    /* JADX INFO: renamed from: A */
    public static long m5300A(Object obj, long j) {
        return ((Long) b5c.m3320k(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: j */
    public static int m5301j(m1c m1cVar, int i, byte[] bArr, int i2, int i3, utb utbVar, vnb vnbVar) throws zzco {
        int iM5303l = m5303l(m1cVar, bArr, i2, i3, vnbVar);
        while (true) {
            utbVar.add(vnbVar.f65676c);
            if (iM5303l >= i3) {
                break;
            }
            int iM19867e = qcd.m19867e(bArr, iM5303l, vnbVar);
            if (i != vnbVar.f65674a) {
                break;
            }
            iM5303l = m5303l(m1cVar, bArr, iM19867e, i3, vnbVar);
        }
        return iM5303l;
    }

    /* JADX INFO: renamed from: k */
    public static int m5302k(m1c m1cVar, byte[] bArr, int i, int i2, int i3, vnb vnbVar) throws zzco {
        C0952e c0952e = (C0952e) m1cVar;
        Object objNewInstance = c0952e.newInstance();
        int iM5314i = c0952e.m5314i(objNewInstance, bArr, i, i2, i3, vnbVar);
        c0952e.mo5306a(objNewInstance);
        vnbVar.f65676c = objNewInstance;
        return iM5314i;
    }

    /* JADX INFO: renamed from: l */
    public static int m5303l(m1c m1cVar, byte[] bArr, int i, int i2, vnb vnbVar) throws zzco {
        int iM19866d = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM19866d = qcd.m19866d(i3, bArr, iM19866d, vnbVar);
            i3 = vnbVar.f65674a;
        }
        int i4 = iM19866d;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzco.m5346a();
        }
        Object objNewInstance = m1cVar.newInstance();
        int i5 = i4 + i3;
        m1cVar.mo5310e(objNewInstance, bArr, i4, i5, vnbVar);
        m1cVar.mo5306a(objNewInstance);
        vnbVar.f65676c = objNewInstance;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a4 A[EDGE_INSN: B:93:0x01a4->B:89:0x01a4 BREAK  A[LOOP:0: B:22:0x004a->B:87:0x019a], SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static C0952e m5304m(z0c z0cVar, uzb uzbVar, mvb mvbVar, a4c a4cVar, zqb zqbVar, byb bybVar) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        zzcb zzcbVar;
        int i4;
        int iM23753a;
        Field fieldM11501b;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        Object obj5;
        Field fieldM11501b2;
        Field fieldM11501b3;
        if (!(z0cVar instanceof z0c)) {
            ho2.m13383c();
            return null;
        }
        f1c f1cVar = z0cVar.f70739b;
        int i13 = 1;
        boolean z = (f1cVar.f38258d & 1) != 1;
        if (f1cVar.f38259e == 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i14 = f1cVar.f38261g;
            int i15 = f1cVar.f38262h;
            i = f1cVar.f38265k;
            i2 = i14;
            i3 = i15;
        }
        int[] iArr2 = new int[i << 2];
        Object[] objArr = new Object[i << 1];
        int i16 = f1cVar.f38263i;
        int[] iArr3 = i16 > 0 ? new int[i16] : null;
        int i17 = f1cVar.f38266l;
        int[] iArr4 = i17 > 0 ? new int[i17] : null;
        boolean zM11502a = f1cVar.m11502a();
        Class cls = f1cVar.f38257c;
        Object[] objArr2 = f1cVar.f38256b;
        if (zM11502a) {
            int i18 = f1cVar.f38273s;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (i18 >= f1cVar.f38264j || i19 >= ((i18 - i2) << 2)) {
                    int i22 = i13;
                    int i23 = f1cVar.f38275u;
                    zzcb zzcbVar2 = zzcb.zziw;
                    if (i23 <= zzcbVar2.m5345id()) {
                        iArr = iArr2;
                        zzcbVar = zzcbVar2;
                        Field field = f1cVar.f38278x;
                        w4c w4cVar = b5c.f7982d;
                        int iM23753a2 = (int) w4cVar.m23753a(field);
                        if ((f1cVar.f38258d & 1) != i22 || f1cVar.f38275u > zzcb.zzhp.m5345id()) {
                            i4 = iM23753a2;
                            iM23753a = 0;
                        } else {
                            int i24 = (f1cVar.f38277w / 32) + (f1cVar.f38260f << 1);
                            Object obj6 = objArr2[i24];
                            if (obj6 instanceof Field) {
                                fieldM11501b = (Field) obj6;
                            } else {
                                fieldM11501b = f1c.m11501b(cls, (String) obj6);
                                objArr2[i24] = fieldM11501b;
                            }
                            iM23753a = (int) w4cVar.m23753a(fieldM11501b);
                            i5 = f1cVar.f38277w % 32;
                            i4 = iM23753a2;
                        }
                        iArr[i19] = f1cVar.f38273s;
                        i6 = i19 + 1;
                        int i25 = iM23753a;
                        i7 = f1cVar.f38274t;
                        int i26 = i4;
                        if ((i7 & 512) != 0) {
                            i8 = 536870912;
                        } else {
                            i8 = 0;
                        }
                        if ((i7 & 256) != 0) {
                            i9 = 268435456;
                        } else {
                            i9 = 0;
                        }
                        int i27 = i9 | i8;
                        i10 = f1cVar.f38275u;
                        iArr[i6] = i27 | (i10 << 20) | i26;
                        iArr[i19 + 2] = (i5 << 20) | i25;
                        obj = f1cVar.f38254A;
                        if (obj != null) {
                            i12 = (i19 / 4) << 1;
                            objArr[i12] = obj;
                            obj4 = f1cVar.f38279y;
                            if (obj4 != null) {
                                objArr[i12 + 1] = obj4;
                            } else {
                                obj5 = f1cVar.f38280z;
                                if (obj5 != null) {
                                    objArr[i12 + 1] = obj5;
                                }
                            }
                            i11 = 1;
                        } else {
                            obj2 = f1cVar.f38279y;
                            if (obj2 != null) {
                                i11 = 1;
                                objArr[((i19 / 4) << 1) + 1] = obj2;
                            } else {
                                i11 = 1;
                                obj3 = f1cVar.f38280z;
                                if (obj3 != null) {
                                    objArr[((i19 / 4) << 1) + 1] = obj3;
                                }
                            }
                        }
                        if (i10 == zzcbVar.ordinal()) {
                            iArr3[i20] = i19;
                            i20++;
                        } else if (i10 >= 18 && i10 <= 49) {
                            iArr4[i21] = iArr[i6] & 1048575;
                            i21++;
                        }
                        if (f1cVar.m11502a()) {
                            break;
                        }
                        i18 = f1cVar.f38273s;
                    } else {
                        int i28 = f1cVar.f38276v << 1;
                        Object obj7 = objArr2[i28];
                        if (obj7 instanceof Field) {
                            fieldM11501b2 = (Field) obj7;
                        } else {
                            fieldM11501b2 = f1c.m11501b(cls, (String) obj7);
                            objArr2[i28] = fieldM11501b2;
                        }
                        w4c w4cVar2 = b5c.f7982d;
                        iArr = iArr2;
                        zzcbVar = zzcbVar2;
                        int iM23753a3 = (int) w4cVar2.m23753a(fieldM11501b2);
                        int i29 = (f1cVar.f38276v << 1) + 1;
                        Object obj8 = objArr2[i29];
                        if (obj8 instanceof Field) {
                            fieldM11501b3 = (Field) obj8;
                        } else {
                            fieldM11501b3 = f1c.m11501b(cls, (String) obj8);
                            objArr2[i29] = fieldM11501b3;
                        }
                        iM23753a = (int) w4cVar2.m23753a(fieldM11501b3);
                        i4 = iM23753a3;
                    }
                    i5 = 0;
                    iArr[i19] = f1cVar.f38273s;
                    i6 = i19 + 1;
                    int i210 = iM23753a;
                    i7 = f1cVar.f38274t;
                    int i211 = i4;
                    if ((i7 & 512) != 0) {
                        i8 = 536870912;
                    } else {
                        i8 = 0;
                    }
                    if ((i7 & 256) != 0) {
                        i9 = 268435456;
                    } else {
                        i9 = 0;
                    }
                    int i212 = i9 | i8;
                    i10 = f1cVar.f38275u;
                    iArr[i6] = i212 | (i10 << 20) | i211;
                    iArr[i19 + 2] = (i5 << 20) | i210;
                    obj = f1cVar.f38254A;
                    if (obj != null) {
                        i12 = (i19 / 4) << 1;
                        objArr[i12] = obj;
                        obj4 = f1cVar.f38279y;
                        if (obj4 != null) {
                            objArr[i12 + 1] = obj4;
                        } else {
                            obj5 = f1cVar.f38280z;
                            if (obj5 != null) {
                                objArr[i12 + 1] = obj5;
                            }
                        }
                        i11 = 1;
                    } else {
                        obj2 = f1cVar.f38279y;
                        if (obj2 != null) {
                            i11 = 1;
                            objArr[((i19 / 4) << 1) + 1] = obj2;
                        } else {
                            i11 = 1;
                            obj3 = f1cVar.f38280z;
                            if (obj3 != null) {
                                objArr[((i19 / 4) << 1) + 1] = obj3;
                            }
                        }
                    }
                    if (i10 == zzcbVar.ordinal()) {
                        iArr3[i20] = i19;
                        i20++;
                    } else if (i10 >= 18) {
                        iArr4[i21] = iArr[i6] & 1048575;
                        i21++;
                    }
                    if (f1cVar.m11502a()) {
                        break;
                        break;
                    }
                    i18 = f1cVar.f38273s;
                } else {
                    i11 = i13;
                    for (int i30 = 0; i30 < 4; i30++) {
                        iArr2[i19 + i30] = -1;
                    }
                    iArr = iArr2;
                }
                i19 += 4;
                i13 = i11;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new C0952e(iArr, objArr, i2, i3, f1cVar.f38264j, z0cVar.f70738a, z, f1cVar.f38267m, iArr3, iArr4, uzbVar, mvbVar, a4cVar, zqbVar, bybVar);
    }

    /* JADX INFO: renamed from: z */
    public static int m5305z(Object obj, long j) {
        return ((Integer) b5c.m3320k(obj, j)).intValue();
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: a */
    public final void mo5306a(Object obj) {
        int[] iArr = this.f11788i;
        if (iArr != null) {
            for (int i : iArr) {
                long jM5322u = m5322u(i) & 1048575;
                Object objM3320k = b5c.m3320k(obj, jM5322u);
                if (objM3320k != null) {
                    this.f11793n.getClass();
                    ((zzdi) objM3320k).f11807a = false;
                    b5c.m3313d(obj, jM5322u, objM3320k);
                }
            }
        }
        int[] iArr2 = this.f11789j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.f11791l.mo17059a(obj, i2);
            }
        }
        this.f11792m.getClass();
        ((AbstractC0949b) obj).zzjp.f63371d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[PHI: r6
      0x008a: PHI (r6v18 com.google.android.gms.internal.clearcut.b) = 
      (r6v5 com.google.android.gms.internal.clearcut.b)
      (r6v7 com.google.android.gms.internal.clearcut.b)
      (r6v13 com.google.android.gms.internal.clearcut.b)
      (r6v14 com.google.android.gms.internal.clearcut.b)
      (r6v15 com.google.android.gms.internal.clearcut.b)
      (r6v19 com.google.android.gms.internal.clearcut.b)
     binds: [B:56:0x00fd, B:50:0x00ed, B:37:0x00b7, B:34:0x00af, B:31:0x00a7, B:25:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b A[PHI: r6
      0x009b: PHI (r6v16 com.google.android.gms.internal.clearcut.b) = 
      (r6v3 com.google.android.gms.internal.clearcut.b)
      (r6v4 com.google.android.gms.internal.clearcut.b)
      (r6v6 com.google.android.gms.internal.clearcut.b)
      (r6v17 com.google.android.gms.internal.clearcut.b)
     binds: [B:62:0x010d, B:59:0x0105, B:53:0x00f5, B:28:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[PHI: r6
      0x00c1: PHI (r6v11 com.google.android.gms.internal.clearcut.b) = (r6v9 com.google.android.gms.internal.clearcut.b), (r6v12 com.google.android.gms.internal.clearcut.b) binds: [B:44:0x00d4, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // p000.m1c
    /* JADX INFO: renamed from: b */
    public final void mo5307b(AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2) {
        AbstractC0949b abstractC0949b3;
        w4c w4cVar;
        long jM23757h;
        int i;
        abstractC0949b2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f11780a;
            if (i2 >= iArr.length) {
                AbstractC0949b abstractC0949b4 = abstractC0949b;
                if (this.f11786g) {
                    return;
                }
                AbstractC0954g.m5327a(this.f11792m, abstractC0949b4, abstractC0949b2);
                return;
            }
            int iM5322u = m5322u(i2);
            long j = iM5322u & 1048575;
            int i3 = iArr[i2];
            switch ((iM5322u & 267386880) >>> 20) {
                case 0:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4c w4cVar2 = b5c.f7982d;
                        w4cVar2.mo22459c(abstractC0949b3, j, w4cVar2.mo22464k(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 1:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4c w4cVar3 = b5c.f7982d;
                        w4cVar3.mo22460d(abstractC0949b3, j, w4cVar3.mo22463j(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 2:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4cVar = b5c.f7982d;
                        jM23757h = w4cVar.m23757h(abstractC0949b2, j);
                        w4cVar.m23755e(abstractC0949b3, j, jM23757h);
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 3:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4cVar = b5c.f7982d;
                        jM23757h = w4cVar.m23757h(abstractC0949b2, j);
                        w4cVar.m23755e(abstractC0949b3, j, jM23757h);
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 4:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 5:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4cVar = b5c.f7982d;
                        jM23757h = w4cVar.m23757h(abstractC0949b2, j);
                        w4cVar.m23755e(abstractC0949b3, j, jM23757h);
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 6:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 7:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4c w4cVar4 = b5c.f7982d;
                        w4cVar4.mo22461f(abstractC0949b3, j, w4cVar4.mo22462i(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 8:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3313d(abstractC0949b3, j, b5c.m3320k(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 9:
                    abstractC0949b3 = abstractC0949b;
                    m5315n(i2, abstractC0949b3, abstractC0949b2);
                    break;
                case 10:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3313d(abstractC0949b3, j, b5c.m3320k(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 11:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 12:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 13:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 14:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        w4cVar = b5c.f7982d;
                        jM23757h = w4cVar.m23757h(abstractC0949b2, j);
                        w4cVar.m23755e(abstractC0949b3, j, jM23757h);
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 15:
                    abstractC0949b3 = abstractC0949b;
                    if (m5317p(i2, abstractC0949b2)) {
                        b5c.m3311b(j, abstractC0949b3, b5c.f7982d.m23756g(abstractC0949b2, j));
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 16:
                    if (!m5317p(i2, abstractC0949b2)) {
                        abstractC0949b3 = abstractC0949b;
                    } else {
                        w4cVar = b5c.f7982d;
                        jM23757h = w4cVar.m23757h(abstractC0949b2, j);
                        abstractC0949b3 = abstractC0949b;
                        w4cVar.m23755e(abstractC0949b3, j, jM23757h);
                        m5324w(i2, abstractC0949b3);
                    }
                    break;
                case 17:
                    m5315n(i2, abstractC0949b, abstractC0949b2);
                    abstractC0949b3 = abstractC0949b;
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
                    this.f11791l.mo17060b(abstractC0949b, j, abstractC0949b2);
                    abstractC0949b3 = abstractC0949b;
                    break;
                case 50:
                    Class cls = AbstractC0954g.f11797a;
                    Object objM3320k = b5c.m3320k(abstractC0949b, j);
                    Object objM3320k2 = b5c.m3320k(abstractC0949b2, j);
                    this.f11793n.getClass();
                    b5c.m3313d(abstractC0949b, j, byb.m4226a(objM3320k, objM3320k2));
                    abstractC0949b3 = abstractC0949b;
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
                    if (m5318q(i3, abstractC0949b2, i2)) {
                        b5c.m3313d(abstractC0949b, j, b5c.m3320k(abstractC0949b2, j));
                        i = iArr[i2 + 2];
                        b5c.m3311b(i & 1048575, abstractC0949b, i3);
                    }
                    abstractC0949b3 = abstractC0949b;
                    break;
                case 60:
                case 68:
                    m5325x(i2, abstractC0949b, abstractC0949b2);
                    abstractC0949b3 = abstractC0949b;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m5318q(i3, abstractC0949b2, i2)) {
                        b5c.m3313d(abstractC0949b, j, b5c.m3320k(abstractC0949b2, j));
                        i = iArr[i2 + 2];
                        b5c.m3311b(i & 1048575, abstractC0949b, i3);
                    }
                    abstractC0949b3 = abstractC0949b;
                    break;
                default:
                    abstractC0949b3 = abstractC0949b;
                    break;
            }
            i2 += 4;
            abstractC0949b = abstractC0949b3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // p000.m1c
    /* JADX INFO: renamed from: c */
    public final boolean mo5308c(AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2) {
        int[] iArr = this.f11780a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM5329c = true;
            if (i < length) {
                int iM5322u = m5322u(i);
                long j = iM5322u & 1048575;
                switch ((iM5322u & 267386880) >>> 20) {
                    case 0:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar = b5c.f7982d;
                            if (w4cVar.m23757h(abstractC0949b, j) != w4cVar.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar2 = b5c.f7982d;
                            if (w4cVar2.m23756g(abstractC0949b, j) != w4cVar2.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar3 = b5c.f7982d;
                            if (w4cVar3.m23757h(abstractC0949b, j) != w4cVar3.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar4 = b5c.f7982d;
                            if (w4cVar4.m23757h(abstractC0949b, j) != w4cVar4.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar5 = b5c.f7982d;
                            if (w4cVar5.m23756g(abstractC0949b, j) != w4cVar5.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar6 = b5c.f7982d;
                            if (w4cVar6.m23757h(abstractC0949b, j) != w4cVar6.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar7 = b5c.f7982d;
                            if (w4cVar7.m23756g(abstractC0949b, j) != w4cVar7.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar8 = b5c.f7982d;
                            if (w4cVar8.mo22462i(abstractC0949b, j) != w4cVar8.mo22462i(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i) || !AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j))) {
                            zM5329c = false;
                        }
                        break;
                    case 9:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i) || !AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j))) {
                            zM5329c = false;
                        }
                        break;
                    case 10:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i) || !AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j))) {
                            zM5329c = false;
                        }
                        break;
                    case 11:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar9 = b5c.f7982d;
                            if (w4cVar9.m23756g(abstractC0949b, j) != w4cVar9.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar10 = b5c.f7982d;
                            if (w4cVar10.m23756g(abstractC0949b, j) != w4cVar10.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar11 = b5c.f7982d;
                            if (w4cVar11.m23756g(abstractC0949b, j) != w4cVar11.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar12 = b5c.f7982d;
                            if (w4cVar12.m23757h(abstractC0949b, j) != w4cVar12.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar13 = b5c.f7982d;
                            if (w4cVar13.m23756g(abstractC0949b, j) != w4cVar13.m23756g(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i)) {
                            zM5329c = false;
                        } else {
                            w4c w4cVar14 = b5c.f7982d;
                            if (w4cVar14.m23757h(abstractC0949b, j) != w4cVar14.m23757h(abstractC0949b2, j)) {
                                zM5329c = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m5326y(abstractC0949b, abstractC0949b2, i) || !AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j))) {
                            zM5329c = false;
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
                    case 50:
                        zM5329c = AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j));
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
                        w4c w4cVar15 = b5c.f7982d;
                        if (w4cVar15.m23756g(abstractC0949b, j2) != w4cVar15.m23756g(abstractC0949b2, j2) || !AbstractC0954g.m5329c(b5c.m3320k(abstractC0949b, j), b5c.m3320k(abstractC0949b2, j))) {
                            zM5329c = false;
                        }
                        break;
                }
                if (zM5329c) {
                    i += 4;
                }
            } else {
                this.f11792m.getClass();
                if (abstractC0949b.zzjp.equals(abstractC0949b2.zzjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[PHI: r3
      0x00ad: PHI (r3v17 int) = (r3v5 int), (r3v18 int) binds: [B:80:0x015d, B:43:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // p000.m1c
    /* JADX INFO: renamed from: d */
    public final int mo5309d(AbstractC0949b abstractC0949b) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        long jDoubleToLongBits2;
        Object objM3320k;
        int[] iArr = this.f11780a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 4) {
            int iM5322u = m5322u(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM5322u;
            int i6 = 1237;
            int iHashCode = 37;
            switch ((iM5322u & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(b5c.f7982d.mo22464k(abstractC0949b, j));
                    iFloatToIntBits = btb.m4168b(jDoubleToLongBits);
                    i3 = iFloatToIntBits + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(b5c.f7982d.mo22463j(abstractC0949b, j));
                    i3 = iFloatToIntBits + i;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = b5c.f7982d.m23757h(abstractC0949b, j);
                    iFloatToIntBits = btb.m4168b(jDoubleToLongBits);
                    i3 = iFloatToIntBits + i;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = b5c.f7982d.m23756g(abstractC0949b, j);
                    i3 = iFloatToIntBits + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo22462i = b5c.f7982d.mo22462i(abstractC0949b, j);
                    Charset charset = btb.f8994a;
                    if (zMo22462i) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) b5c.m3320k(abstractC0949b, j)).hashCode();
                    i3 = iFloatToIntBits + i;
                    break;
                case 9:
                    Object objM3320k2 = b5c.m3320k(abstractC0949b, j);
                    if (objM3320k2 != null) {
                        iHashCode = objM3320k2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = b5c.m3320k(abstractC0949b, j).hashCode();
                    i3 = iFloatToIntBits + i;
                    break;
                case 17:
                    Object objM3320k3 = b5c.m3320k(abstractC0949b, j);
                    if (objM3320k3 != null) {
                        iHashCode = objM3320k3.hashCode();
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
                case 50:
                    i = i3 * 53;
                    objM3320k = b5c.m3320k(abstractC0949b, j);
                    iFloatToIntBits = objM3320k.hashCode();
                    i3 = iFloatToIntBits + i;
                    break;
                case 51:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = Double.doubleToLongBits(((Double) b5c.m3320k(abstractC0949b, j)).doubleValue());
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 52:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) b5c.m3320k(abstractC0949b, j)).floatValue());
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 53:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = m5300A(abstractC0949b, j);
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 54:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = m5300A(abstractC0949b, j);
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 55:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 56:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = m5300A(abstractC0949b, j);
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 57:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 58:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) b5c.m3320k(abstractC0949b, j)).booleanValue();
                        Charset charset2 = btb.f8994a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) b5c.m3320k(abstractC0949b, j)).hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 60:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        objM3320k = b5c.m3320k(abstractC0949b, j);
                        i = i3 * 53;
                        iFloatToIntBits = objM3320k.hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 61:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        objM3320k = b5c.m3320k(abstractC0949b, j);
                        iFloatToIntBits = objM3320k.hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 62:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 63:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 64:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 65:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = m5300A(abstractC0949b, j);
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 66:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m5305z(abstractC0949b, j);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 67:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits2 = m5300A(abstractC0949b, j);
                        iFloatToIntBits = btb.m4168b(jDoubleToLongBits2);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 68:
                    if (m5318q(i5, abstractC0949b, i4)) {
                        objM3320k = b5c.m3320k(abstractC0949b, j);
                        i = i3 * 53;
                        iFloatToIntBits = objM3320k.hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
            }
        }
        this.f11792m.getClass();
        return abstractC0949b.zzjp.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0219  */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0041. Please report as an issue. */
    @Override // p000.m1c
    /* JADX INFO: renamed from: e */
    public final void mo5310e(Object obj, byte[] bArr, int i, int i2, vnb vnbVar) throws zzco {
        Unsafe unsafe;
        int i3;
        int i4;
        AbstractC0949b abstractC0949b;
        u3c u3cVarM22437b;
        int iM5312g;
        Unsafe unsafe2;
        Object obj2;
        Object objM4167a;
        int i5;
        int i6;
        int i7;
        C0952e c0952e = this;
        byte[] bArr2 = bArr;
        int i8 = i2;
        vnb vnbVar2 = vnbVar;
        if (!c0952e.f11786g) {
            m5314i(obj, bArr, i, i8, 0, vnbVar);
            return;
        }
        Unsafe unsafe3 = f11779o;
        int iM19865c = i;
        while (iM19865c < i8) {
            int iM19866d = iM19865c + 1;
            int i9 = bArr2[iM19865c];
            if (i9 < 0) {
                iM19866d = qcd.m19866d(i9, bArr2, iM19866d, vnbVar2);
                i9 = vnbVar2.f65674a;
            }
            int i10 = i9;
            int i11 = iM19866d;
            int i12 = (i10 == true ? 1 : 0) >>> 3;
            int i13 = (i10 == true ? 1 : 0) & 7;
            int iM5323v = c0952e.m5323v(i12);
            if (iM5323v >= 0) {
                int i14 = c0952e.f11780a[iM5323v + 1];
                int i15 = (267386880 & i14) >>> 20;
                long j = 1048575 & i14;
                if (i15 <= 17) {
                    switch (i15) {
                        case 0:
                            unsafe = unsafe3;
                            if (i13 == 1) {
                                b5c.f7982d.mo22459c(obj, j, Double.longBitsToDouble(qcd.m19871i(i11, bArr2)));
                                iM19865c = i11 + 8;
                            } else {
                                i3 = i11;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                            }
                            unsafe3 = unsafe;
                            break;
                        case 1:
                            unsafe = unsafe3;
                            if (i13 == 5) {
                                b5c.f7982d.mo22460d(obj, j, Float.intBitsToFloat(qcd.m19869g(i11, bArr2)));
                                iM19865c = i11 + 4;
                            } else {
                                i3 = i11;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                            }
                            unsafe3 = unsafe;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i13 == 0) {
                                int iM19868f = qcd.m19868f(bArr2, i11, vnbVar2);
                                unsafe4.putLong(obj, j, vnbVar2.f65675b);
                                unsafe = unsafe4;
                                iM19865c = iM19868f;
                            } else {
                                unsafe = unsafe4;
                                i3 = i11;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                            }
                            unsafe3 = unsafe;
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i13 != 0) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = qcd.m19867e(bArr2, i11, vnbVar2);
                                unsafe2.putInt(obj, j, vnbVar2.f65674a);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i13 != 1) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putLong(obj, j, qcd.m19871i(i11, bArr2));
                                iM19865c = i11 + 8;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i13 != 5) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putInt(obj, j, qcd.m19869g(i11, bArr2));
                                iM19865c = i11 + 4;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i13 != 0) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = qcd.m19868f(bArr2, i11, vnbVar2);
                                b5c.f7982d.mo22461f(obj, j, vnbVar2.f65675b != 0);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i13 != 2) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                if ((536870912 & i14) == 0) {
                                    iM19865c = qcd.m19867e(bArr2, i11, vnbVar2);
                                    int i16 = vnbVar2.f65674a;
                                    if (i16 == 0) {
                                        vnbVar2.f65676c = "";
                                    } else {
                                        vnbVar2.f65676c = new String(bArr2, iM19865c, i16, btb.f8994a);
                                        iM19865c += i16;
                                    }
                                } else {
                                    iM19865c = qcd.m19870h(bArr2, i11, vnbVar2);
                                }
                                objM4167a = vnbVar2.f65676c;
                                unsafe2.putObject(obj2, j, objM4167a);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i13 != 2) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = m5303l(c0952e.m5319r(iM5323v), bArr2, i11, i8, vnbVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                Object obj3 = vnbVar2.f65676c;
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, obj3);
                                } else {
                                    objM4167a = btb.m4167a(object, obj3);
                                    unsafe2.putObject(obj2, j, objM4167a);
                                }
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            obj2 = obj;
                            if (i13 != 2) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = qcd.m19872j(bArr2, i11, vnbVar2);
                                objM4167a = vnbVar2.f65676c;
                                unsafe2.putObject(obj2, j, objM4167a);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i13 != 0) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = qcd.m19867e(bArr2, i11, vnbVar2);
                                i5 = vnbVar2.f65674a;
                                unsafe2.putInt(obj, j, i5);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i13 != 0) {
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                iM19865c = qcd.m19867e(bArr2, i11, vnbVar2);
                                int i17 = vnbVar2.f65674a;
                                i5 = (-(i17 & 1)) ^ (i17 >>> 1);
                                unsafe2.putInt(obj, j, i5);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 16:
                            if (i13 != 0) {
                                unsafe2 = unsafe3;
                                i3 = i11;
                                unsafe = unsafe2;
                                i4 = i3;
                                abstractC0949b = (AbstractC0949b) obj;
                                u3cVarM22437b = abstractC0949b.zzjp;
                                if (u3cVarM22437b == u3c.f63367e) {
                                    u3cVarM22437b = u3c.m22437b();
                                    abstractC0949b.zzjp = u3cVarM22437b;
                                }
                                iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                                c0952e = this;
                                bArr2 = bArr;
                                vnbVar2 = vnbVar;
                                i8 = i2;
                                unsafe3 = unsafe;
                            } else {
                                int iM19868f2 = qcd.m19868f(bArr2, i11, vnbVar2);
                                long j2 = vnbVar2.f65675b;
                                unsafe3.putLong(obj, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                unsafe2 = unsafe3;
                                iM19865c = iM19868f2;
                                unsafe3 = unsafe2;
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    unsafe = unsafe3;
                    if (i15 == 27) {
                        if (i13 == 2) {
                            utb utbVarMo5294N = (utb) unsafe.getObject(obj, j);
                            if (!((jnb) utbVarMo5294N).f45884a) {
                                int size = utbVarMo5294N.size();
                                utbVarMo5294N = utbVarMo5294N.mo5294N(size == 0 ? 10 : size << 1);
                                unsafe.putObject(obj, j, utbVarMo5294N);
                            }
                            iM19865c = m5301j(c0952e.m5319r(iM5323v), i10 == true ? 1 : 0, bArr2, i11, i8, utbVarMo5294N, vnbVar2);
                            bArr2 = bArr;
                            i8 = i2;
                            vnbVar2 = vnbVar;
                        } else {
                            i10 = i10 == true ? 1 : 0;
                            i3 = i11;
                            i4 = i3;
                            abstractC0949b = (AbstractC0949b) obj;
                            u3cVarM22437b = abstractC0949b.zzjp;
                            if (u3cVarM22437b == u3c.f63367e) {
                                u3cVarM22437b = u3c.m22437b();
                                abstractC0949b.zzjp = u3cVarM22437b;
                            }
                            iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                            c0952e = this;
                            bArr2 = bArr;
                            vnbVar2 = vnbVar;
                            i8 = i2;
                        }
                    } else if (i15 <= 49) {
                        i7 = i10 == true ? 1 : 0;
                        iM5312g = c0952e.m5313h(obj, bArr, i11, i2, i10 == true ? 1 : 0, i12, i13, iM5323v, i14, i15, j, vnbVar);
                        if (iM5312g == i11) {
                            i10 = i6;
                            i10 = i7;
                            i4 = iM5312g;
                            abstractC0949b = (AbstractC0949b) obj;
                            u3cVarM22437b = abstractC0949b.zzjp;
                            if (u3cVarM22437b == u3c.f63367e) {
                                u3cVarM22437b = u3c.m22437b();
                                abstractC0949b.zzjp = u3cVarM22437b;
                            }
                            iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                            c0952e = this;
                            bArr2 = bArr;
                            vnbVar2 = vnbVar;
                            i8 = i2;
                        } else {
                            i10 = i7;
                            bArr2 = bArr;
                            i8 = i2;
                            vnbVar2 = vnbVar;
                            iM19865c = iM5312g;
                        }
                    } else {
                        i6 = i10 == true ? 1 : 0;
                        if (i15 != 50) {
                            iM5312g = c0952e.m5312g(obj, bArr, i11, i2, i10 == true ? 1 : 0, i12, i13, i14, i15, j, iM5323v, vnbVar);
                            if (iM5312g != i11) {
                                i10 = i6;
                                c0952e = this;
                                i10 = i7;
                                bArr2 = bArr;
                                i8 = i2;
                                vnbVar2 = vnbVar;
                                iM19865c = iM5312g;
                            }
                            i10 = i6;
                            i10 = i7;
                            i4 = iM5312g;
                            abstractC0949b = (AbstractC0949b) obj;
                            u3cVarM22437b = abstractC0949b.zzjp;
                            if (u3cVarM22437b == u3c.f63367e) {
                                u3cVarM22437b = u3c.m22437b();
                                abstractC0949b.zzjp = u3cVarM22437b;
                            }
                            iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                            c0952e = this;
                            bArr2 = bArr;
                            vnbVar2 = vnbVar;
                            i8 = i2;
                        } else {
                            if (i13 == 2) {
                                c0952e.m5316o(j, obj, iM5323v);
                                throw null;
                            }
                            i3 = i11;
                            i4 = i3;
                            abstractC0949b = (AbstractC0949b) obj;
                            u3cVarM22437b = abstractC0949b.zzjp;
                            if (u3cVarM22437b == u3c.f63367e) {
                                u3cVarM22437b = u3c.m22437b();
                                abstractC0949b.zzjp = u3cVarM22437b;
                            }
                            iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
                            c0952e = this;
                            bArr2 = bArr;
                            vnbVar2 = vnbVar;
                            i8 = i2;
                        }
                    }
                    unsafe3 = unsafe;
                }
            }
            unsafe = unsafe3;
            i3 = i11;
            i4 = i3;
            abstractC0949b = (AbstractC0949b) obj;
            u3cVarM22437b = abstractC0949b.zzjp;
            if (u3cVarM22437b == u3c.f63367e) {
                u3cVarM22437b = u3c.m22437b();
                abstractC0949b.zzjp = u3cVarM22437b;
            }
            iM19865c = qcd.m19865c(i10 == true ? 1 : 0, bArr, i4, i2, u3cVarM22437b, vnbVar);
            c0952e = this;
            bArr2 = bArr;
            vnbVar2 = vnbVar;
            i8 = i2;
            unsafe3 = unsafe;
        }
        if (iM19865c != i8) {
            throw zzco.m5347b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x010a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p000.m1c
    /* JADX INFO: renamed from: f */
    public final boolean mo5311f(Object obj) {
        int i;
        int i2;
        ?? r2;
        boolean zM5317p;
        ?? r3;
        boolean zM5317p2;
        int i3 = 1;
        int[] iArr = this.f11787h;
        if (iArr != null && iArr.length != 0) {
            int length = iArr.length;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int i7 = iArr[i5];
                int iM5323v = m5323v(i7);
                int iM5322u = m5322u(iM5323v);
                boolean z = this.f11786g;
                if (z) {
                    i = 0;
                } else {
                    int i8 = this.f11780a[iM5323v + 2];
                    int i9 = i8 & 1048575;
                    i = i3 << (i8 >>> 20);
                    if (i9 != i4) {
                        i6 = f11779o.getInt(obj, i9);
                        i4 = i9;
                    }
                }
                if ((268435456 & iM5322u) == 0) {
                    r3 = i3;
                    r3 = zM5317p2;
                    i2 = (267386880 & iM5322u) >>> 20;
                    if (i2 != 9 || i2 == 17) {
                        if (z) {
                            zM5317p = m5317p(iM5323v, obj);
                        } else if ((i6 & i) != 0) {
                            r2 = 0;
                        }
                        if (r2 != 0) {
                            r2 = i3;
                            if (m5319r(iM5323v).mo5311f(b5c.m3320k(obj, iM5322u & 1048575))) {
                                r2 = zM5317p;
                            } else {
                                r2 = zM5317p;
                            }
                        } else {
                            r2 = i3;
                            r2 = zM5317p;
                            continue;
                        }
                        i5++;
                        i3 = i3;
                        iArr = iArr;
                    } else {
                        if (i2 != 27) {
                            if (i2 == 60 || i2 == 68) {
                                if (!m5318q(i7, obj, iM5323v) || m5319r(iM5323v).mo5311f(b5c.m3320k(obj, iM5322u & 1048575))) {
                                }
                            } else if (i2 != 49) {
                                if (i2 != 50) {
                                    continue;
                                } else {
                                    Object objM3320k = b5c.m3320k(obj, iM5322u & 1048575);
                                    this.f11793n.getClass();
                                    if (!((zzdi) objM3320k).isEmpty()) {
                                        m5320s(iM5323v);
                                        throw new NoSuchMethodError();
                                    }
                                }
                            }
                            i5++;
                            i3 = i3;
                            iArr = iArr;
                        }
                        List list = (List) b5c.m3320k(obj, iM5322u & 1048575);
                        if (list.isEmpty()) {
                            continue;
                        } else {
                            m1c m1cVarM5319r = m5319r(iM5323v);
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                if (m1cVarM5319r.mo5311f(list.get(i10))) {
                                }
                            }
                        }
                        i5++;
                        i3 = i3;
                        iArr = iArr;
                    }
                } else {
                    if (z) {
                        zM5317p2 = m5317p(iM5323v, obj);
                    } else if ((i6 & i) == 0) {
                        r3 = 0;
                    }
                    if (r3 == 0) {
                        r3 = i3;
                        r3 = zM5317p2;
                    } else {
                        r3 = i3;
                        r3 = zM5317p2;
                        i2 = (267386880 & iM5322u) >>> 20;
                        if (i2 != 9) {
                        }
                        if (z) {
                            zM5317p = m5317p(iM5323v, obj);
                        } else if ((i6 & i) != 0) {
                            r2 = 0;
                        }
                        if (r2 != 0) {
                            r2 = i3;
                            if (m5319r(iM5323v).mo5311f(b5c.m3320k(obj, iM5322u & 1048575))) {
                                r2 = zM5317p;
                            } else {
                                r2 = zM5317p;
                            }
                        } else {
                            r2 = i3;
                            r2 = zM5317p;
                            continue;
                        }
                        i5++;
                        i3 = i3;
                        iArr = iArr;
                    }
                }
                return false;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: g */
    public final int m5312g(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vnb vnbVar) throws zzco {
        int i9;
        Object objValueOf;
        int i10;
        Object objValueOf2;
        int iM19868f;
        long j2;
        int i11;
        Object objValueOf3;
        Object object;
        Unsafe unsafe = f11779o;
        long j3 = this.f11780a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                objValueOf = Double.valueOf(Double.longBitsToDouble(qcd.m19871i(i9, bArr)));
                unsafe.putObject(obj, j, objValueOf);
                iM19868f = i9 + 8;
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                objValueOf2 = Float.valueOf(Float.intBitsToFloat(qcd.m19869g(i10, bArr)));
                unsafe.putObject(obj, j, objValueOf2);
                iM19868f = i10 + 4;
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iM19868f = qcd.m19868f(bArr, i, vnbVar);
                j2 = vnbVar.f65675b;
                objValueOf3 = Long.valueOf(j2);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iM19868f = qcd.m19867e(bArr, i, vnbVar);
                i11 = vnbVar.f65674a;
                objValueOf3 = Integer.valueOf(i11);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                objValueOf = Long.valueOf(qcd.m19871i(i9, bArr));
                unsafe.putObject(obj, j, objValueOf);
                iM19868f = i9 + 8;
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                objValueOf2 = Integer.valueOf(qcd.m19869g(i10, bArr));
                unsafe.putObject(obj, j, objValueOf2);
                iM19868f = i10 + 4;
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iM19868f = qcd.m19868f(bArr, i, vnbVar);
                objValueOf3 = Boolean.valueOf(vnbVar.f65675b != 0);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM19867e = qcd.m19867e(bArr, i, vnbVar);
                int i12 = vnbVar.f65674a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!p5c.f55622a.m142c(bArr, iM19867e, iM19867e + i12)) {
                            throw new zzco("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM19867e, i12, btb.f8994a));
                    iM19867e += i12;
                }
                unsafe.putInt(obj, j3, i4);
                return iM19867e;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM5303l = m5303l(m5319r(i8), bArr, i, i2, vnbVar);
                object = unsafe.getInt(obj, j3) == i4 ? unsafe.getObject(obj, j) : null;
                Object objM4167a = vnbVar.f65676c;
                if (object != null) {
                    objM4167a = btb.m4167a(object, objM4167a);
                }
                unsafe.putObject(obj, j, objM4167a);
                unsafe.putInt(obj, j3, i4);
                return iM5303l;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM19867e2 = qcd.m19867e(bArr, i, vnbVar);
                int i13 = vnbVar.f65674a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, zzbb.f11801b);
                } else {
                    unsafe.putObject(obj, j, zzbb.m5342d(bArr, iM19867e2, i13));
                    iM19867e2 += i13;
                }
                unsafe.putInt(obj, j3, i4);
                return iM19867e2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM19867e3 = qcd.m19867e(bArr, i, vnbVar);
                int i14 = vnbVar.f65674a;
                if (m5321t(i8) == null || zzge$zzv$zzb.zzbc(i14) != null) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    iM19868f = iM19867e3;
                    unsafe.putInt(obj, j3, i4);
                    return iM19868f;
                }
                AbstractC0949b abstractC0949b = (AbstractC0949b) obj;
                u3c u3cVarM22437b = abstractC0949b.zzjp;
                if (u3cVarM22437b == u3c.f63367e) {
                    u3cVarM22437b = u3c.m22437b();
                    abstractC0949b.zzjp = u3cVarM22437b;
                }
                u3cVarM22437b.m22438a(i3, Long.valueOf(i14));
                return iM19867e3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iM19868f = qcd.m19867e(bArr, i, vnbVar);
                int i15 = vnbVar.f65674a;
                i11 = (-(i15 & 1)) ^ (i15 >>> 1);
                objValueOf3 = Integer.valueOf(i11);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iM19868f = qcd.m19868f(bArr, i, vnbVar);
                long j4 = vnbVar.f65675b;
                j2 = (-(j4 & 1)) ^ (j4 >>> 1);
                objValueOf3 = Long.valueOf(j2);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j3, i4);
                return iM19868f;
            case 68:
                if (i5 == 3) {
                    iM19868f = m5302k(m5319r(i8), bArr, i, i2, (i3 & (-8)) | 4, vnbVar);
                    object = unsafe.getInt(obj, j3) == i4 ? unsafe.getObject(obj, j) : null;
                    Object objM4167a2 = vnbVar.f65676c;
                    if (object != null) {
                        objM4167a2 = btb.m4167a(object, objM4167a2);
                    }
                    unsafe.putObject(obj, j, objM4167a2);
                    unsafe.putInt(obj, j3, i4);
                    return iM19868f;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00cd -> B:45:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0123 -> B:64:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0162 -> B:77:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public final int m5313h(java.lang.Object r10, byte[] r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, int r20, long r21, p000.vnb r23) throws com.google.android.gms.internal.clearcut.zzco {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C0952e.m5313h(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, vnb):int");
    }

    /* JADX WARN: Failed to calculate best type for var: r1v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r1v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v39 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r1v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v40 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r3v56 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v56 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r3v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v57 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r3v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v58 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v36 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r5v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v37 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: w4c
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: i */
    public final int m5314i(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, p000.vnb r34) throws com.google.android.gms.internal.clearcut.zzco {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C0952e.m5314i(java.lang.Object, byte[], int, int, int, vnb):int");
    }

    /* JADX INFO: renamed from: n */
    public final void m5315n(int i, Object obj, Object obj2) {
        long jM5322u = m5322u(i) & 1048575;
        if (m5317p(i, obj2)) {
            Object objM3320k = b5c.m3320k(obj, jM5322u);
            Object objM3320k2 = b5c.m3320k(obj2, jM5322u);
            if (objM3320k != null && objM3320k2 != null) {
                objM3320k2 = btb.m4167a(objM3320k, objM3320k2);
            } else if (objM3320k2 == null) {
                return;
            }
            b5c.m3313d(obj, jM5322u, objM3320k2);
            m5324w(i, obj);
        }
    }

    @Override // p000.m1c
    public final Object newInstance() {
        this.f11790k.getClass();
        return ((AbstractC0949b) this.f11785f).mo5293a(4);
    }

    /* JADX INFO: renamed from: o */
    public final void m5316o(long j, Object obj, int i) {
        zzdi zzdiVar;
        Unsafe unsafe = f11779o;
        m5320s(i);
        Object object = unsafe.getObject(obj, j);
        this.f11793n.getClass();
        if (!((zzdi) object).f11807a) {
            zzdi zzdiVar2 = zzdi.f11806b;
            if (zzdiVar2.isEmpty()) {
                zzdiVar = new zzdi();
            } else {
                zzdi zzdiVar3 = new zzdi(zzdiVar2);
                zzdiVar3.f11807a = true;
                zzdiVar = zzdiVar3;
            }
            byb.m4226a(zzdiVar, object);
            unsafe.putObject(obj, j, zzdiVar);
        }
        throw new NoSuchMethodError();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0109 A[RETURN] */
    /* JADX INFO: renamed from: p */
    public final boolean m5317p(int i, Object obj) {
        if (!this.f11786g) {
            int i2 = this.f11780a[i + 2];
            if ((b5c.f7982d.m23756g(obj, i2 & 1048575) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iM5322u = m5322u(i);
        long j = iM5322u & 1048575;
        switch ((iM5322u & 267386880) >>> 20) {
            case 0:
                if (b5c.f7982d.mo22464k(obj, j) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (b5c.f7982d.mo22463j(obj, j) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (b5c.f7982d.m23757h(obj, j) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (b5c.f7982d.m23757h(obj, j) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (b5c.f7982d.m23757h(obj, j) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 7:
                return b5c.f7982d.mo22462i(obj, j);
            case 8:
                Object objM3320k = b5c.m3320k(obj, j);
                if (objM3320k instanceof String) {
                    if (((String) objM3320k).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM3320k instanceof zzbb)) {
                    ij6.m13959q();
                    return false;
                }
                if (zzbb.f11801b.equals(objM3320k)) {
                    return false;
                }
                return true;
            case 9:
                if (b5c.m3320k(obj, j) != null) {
                    return true;
                }
                return false;
            case 10:
                if (zzbb.f11801b.equals(b5c.m3320k(obj, j))) {
                    return false;
                }
                return true;
            case 11:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (b5c.f7982d.m23757h(obj, j) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (b5c.f7982d.m23756g(obj, j) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (b5c.f7982d.m23757h(obj, j) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (b5c.m3320k(obj, j) != null) {
                    return true;
                }
                return false;
            default:
                ij6.m13959q();
                return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5318q(int i, Object obj, int i2) {
        return b5c.f7982d.m23756g(obj, (long) (this.f11780a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: r */
    public final m1c m5319r(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.f11781b;
        m1c m1cVar = (m1c) objArr[i2];
        if (m1cVar != null) {
            return m1cVar;
        }
        m1c m1cVarM20230a = r0c.f58470c.m20230a((Class) objArr[i2 + 1]);
        objArr[i2] = m1cVarM20230a;
        return m1cVarM20230a;
    }

    /* JADX INFO: renamed from: s */
    public final Object m5320s(int i) {
        return this.f11781b[(i / 4) << 1];
    }

    /* JADX INFO: renamed from: t */
    public final etb m5321t(int i) {
        return (etb) this.f11781b[((i / 4) << 1) + 1];
    }

    /* JADX INFO: renamed from: u */
    public final int m5322u(int i) {
        return this.f11780a[i + 1];
    }

    /* JADX INFO: renamed from: v */
    public final int m5323v(int i) {
        int i2 = this.f11782c;
        if (i < i2) {
            return -1;
        }
        int[] iArr = this.f11780a;
        int i3 = this.f11784e;
        if (i < i3) {
            int i4 = (i - i2) << 2;
            if (iArr[i4] == i) {
                return i4;
            }
            return -1;
        }
        if (i > this.f11783d) {
            return -1;
        }
        int i5 = i3 - i2;
        int length = (iArr.length / 4) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 << 2;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public final void m5324w(int i, Object obj) {
        if (this.f11786g) {
            return;
        }
        int i2 = this.f11780a[i + 2];
        long j = i2 & 1048575;
        b5c.m3311b(j, obj, b5c.f7982d.m23756g(obj, j) | (1 << (i2 >>> 20)));
    }

    /* JADX INFO: renamed from: x */
    public final void m5325x(int i, Object obj, Object obj2) {
        int i2;
        int iM5322u = m5322u(i);
        int[] iArr = this.f11780a;
        int i3 = iArr[i];
        long j = iM5322u & 1048575;
        if (m5318q(i3, obj2, i)) {
            Object objM3320k = b5c.m3320k(obj, j);
            Object objM3320k2 = b5c.m3320k(obj2, j);
            if (objM3320k != null && objM3320k2 != null) {
                b5c.m3313d(obj, j, btb.m4167a(objM3320k, objM3320k2));
                i2 = iArr[i + 2];
            } else {
                if (objM3320k2 == null) {
                    return;
                }
                b5c.m3313d(obj, j, objM3320k2);
                i2 = iArr[i + 2];
            }
            b5c.m3311b(i2 & 1048575, obj, i3);
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5326y(AbstractC0949b abstractC0949b, Object obj, int i) {
        return m5317p(i, abstractC0949b) == m5317p(i, obj);
    }
}
