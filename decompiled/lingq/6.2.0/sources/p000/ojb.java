package p000;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeg;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ojb {

    /* JADX INFO: renamed from: f */
    public static final ojb f54469f = new ojb(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f54470a;

    /* JADX INFO: renamed from: b */
    public int[] f54471b;

    /* JADX INFO: renamed from: c */
    public Object[] f54472c;

    /* JADX INFO: renamed from: d */
    public int f54473d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f54474e;

    public ojb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f54470a = i;
        this.f54471b = iArr;
        this.f54472c = objArr;
        this.f54474e = z;
    }

    /* JADX INFO: renamed from: a */
    public static ojb m18048a() {
        return new ojb(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public final void m18049b(gw9 gw9Var) {
        nhb nhbVar = (nhb) gw9Var.f41432b;
        if (this.f54470a != 0) {
            for (int i = 0; i < this.f54470a; i++) {
                int i2 = this.f54471b[i];
                Object obj = this.f54472c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    nhbVar.mo13260h(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    nhbVar.mo13261i(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    nhbVar.mo13264l(i4, (zzacr) obj);
                } else if (i3 == 3) {
                    nhbVar.mo13256d(i4, 3);
                    ((ojb) obj).m18049b(gw9Var);
                    nhbVar.mo13256d(i4, 4);
                } else {
                    if (i3 != 5) {
                        v63.m23141s(new zzaeg());
                        return;
                    }
                    nhbVar.mo13259g(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m18050c() {
        int iM17434a;
        int iM17435b;
        int iM17434a2;
        int i = this.f54473d;
        if (i != -1) {
            return i;
        }
        int iM12426c = 0;
        for (int i2 = 0; i2 < this.f54470a; i2++) {
            int i3 = this.f54471b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        zzacr zzacrVar = (zzacr) this.f54472c[i2];
                        int iM17434a3 = nhb.m17434a(i6);
                        int iMo5422f = zzacrVar.mo5422f();
                        iM12426c = g9a.m12426c(iMo5422f, iMo5422f, iM17434a3, iM12426c);
                    } else if (i5 == 3) {
                        int iM17434a4 = nhb.m17434a(i4 << 3);
                        iM17434a = iM17434a4 + iM17434a4;
                        iM17435b = ((ojb) this.f54472c[i2]).m18050c();
                    } else {
                        if (i5 != 5) {
                            uk9.m22779n(new zzaeg());
                            return 0;
                        }
                        ((Integer) this.f54472c[i2]).getClass();
                        iM17434a2 = nhb.m17434a(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f54472c[i2]).getClass();
                    iM17434a2 = nhb.m17434a(i4 << 3) + 8;
                }
                iM12426c = iM17434a2 + iM12426c;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f54472c[i2]).longValue();
                iM17434a = nhb.m17434a(i7);
                iM17435b = nhb.m17435b(jLongValue);
            }
            iM12426c = iM17435b + iM17434a + iM12426c;
        }
        this.f54473d = iM12426c;
        return iM12426c;
    }

    /* JADX INFO: renamed from: d */
    public final void m18051d(int i, Object obj) {
        if (!this.f54474e) {
            ij6.m13946b();
            return;
        }
        m18052e(this.f54470a + 1);
        int[] iArr = this.f54471b;
        int i2 = this.f54470a;
        iArr[i2] = i;
        this.f54472c[i2] = obj;
        this.f54470a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m18052e(int i) {
        int[] iArr = this.f54471b;
        if (i > iArr.length) {
            int i2 = this.f54470a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f54471b = Arrays.copyOf(iArr, i);
            this.f54472c = Arrays.copyOf(this.f54472c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ojb)) {
            ojb ojbVar = (ojb) obj;
            int i = this.f54470a;
            if (i == ojbVar.f54470a) {
                int[] iArr = this.f54471b;
                int[] iArr2 = ojbVar.f54471b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f54472c;
                Object[] objArr2 = ojbVar.f54472c;
                int i3 = this.f54470a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f54470a;
        int i2 = i + 527;
        int[] iArr = this.f54471b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f54472c;
        int i6 = this.f54470a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
