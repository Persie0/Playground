package p105f0;

import dm.C5207g;
import tl.C9322j;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5453a {

    /* JADX INFO: renamed from: a */
    public int f34002a;

    /* JADX INFO: renamed from: b */
    public Object[] f34003b = new Object[4];

    /* JADX INFO: renamed from: c */
    public int[] f34004c = new int[4];

    /* JADX INFO: renamed from: a */
    public final int m11673a(int i10, Object obj) {
        int i11;
        C5207g.m11111f(obj, "key");
        int i12 = this.f34002a;
        if (i12 > 0) {
            int i13 = i12 - 1;
            int iIdentityHashCode = System.identityHashCode(obj);
            int i14 = 0;
            while (true) {
                if (i14 <= i13) {
                    i11 = (i14 + i13) >>> 1;
                    Object obj2 = this.f34003b[i11];
                    int iIdentityHashCode2 = System.identityHashCode(obj2);
                    if (iIdentityHashCode2 >= iIdentityHashCode) {
                        if (iIdentityHashCode2 <= iIdentityHashCode) {
                            if (obj2 == obj) {
                                break;
                            }
                            int i15 = i11 - 1;
                            while (true) {
                                if (-1 < i15) {
                                    Object obj3 = this.f34003b[i15];
                                    if (obj3 != obj) {
                                        if (System.identityHashCode(obj3) == iIdentityHashCode) {
                                            i15--;
                                        }
                                    }
                                    i11 = i15;
                                    break;
                                }
                                i11++;
                                int i16 = this.f34002a;
                                while (true) {
                                    if (i11 < i16) {
                                        Object obj4 = this.f34003b[i11];
                                        if (obj4 == obj) {
                                            break;
                                        }
                                        if (System.identityHashCode(obj4) == iIdentityHashCode) {
                                            i11++;
                                        }
                                    } else {
                                        i11 = this.f34002a;
                                    }
                                    i15 = -(i11 + 1);
                                    i11 = i15;
                                    break;
                                }
                            }
                        }
                        i13 = i11 - 1;
                    } else {
                        i14 = i11 + 1;
                    }
                } else {
                    i11 = -(i14 + 1);
                    break;
                }
            }
            if (i11 >= 0) {
                int[] iArr = this.f34004c;
                int i17 = iArr[i11];
                iArr[i11] = i10;
                return i17;
            }
        } else {
            i11 = -1;
        }
        int i18 = -(i11 + 1);
        int i19 = this.f34002a;
        Object[] objArr = this.f34003b;
        if (i19 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i20 = i18 + 1;
            C9322j.m17673a0(i20, i18, i19, objArr, objArr2);
            C9322j.m17672Z(i20, i18, this.f34002a, this.f34004c, iArr2);
            C9322j.m17675c0(this.f34003b, objArr2, 0, 0, i18, 6);
            C9322j.m17674b0(this.f34004c, iArr2, i18, 6);
            this.f34003b = objArr2;
            this.f34004c = iArr2;
        } else {
            int i21 = i18 + 1;
            C9322j.m17673a0(i21, i18, i19, objArr, objArr);
            int[] iArr3 = this.f34004c;
            C9322j.m17672Z(i21, i18, this.f34002a, iArr3, iArr3);
        }
        this.f34003b[i18] = obj;
        this.f34004c[i18] = i10;
        this.f34002a++;
        return -1;
    }
}
