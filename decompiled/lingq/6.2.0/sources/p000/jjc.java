package p000;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzgb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jjc {

    /* JADX INFO: renamed from: f */
    public static final jjc f45639f = new jjc(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f45640a;

    /* JADX INFO: renamed from: b */
    public int[] f45641b;

    /* JADX INFO: renamed from: c */
    public Object[] f45642c;

    /* JADX INFO: renamed from: d */
    public int f45643d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f45644e;

    public jjc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45640a = i;
        this.f45641b = iArr;
        this.f45642c = objArr;
        this.f45644e = z;
    }

    /* JADX INFO: renamed from: b */
    public static jjc m14504b() {
        return new jjc(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m14505a() {
        int iM25433o;
        int iM25434p;
        int iM25433o2;
        int i = this.f45643d;
        if (i != -1) {
            return i;
        }
        int iM12437n = 0;
        for (int i2 = 0; i2 < this.f45640a; i2++) {
            int i3 = this.f45641b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        zzev zzevVar = (zzev) this.f45642c[i2];
                        int iM25433o3 = z3c.m25433o(i6);
                        int iMo5681h = zzevVar.mo5681h();
                        iM12437n = g9a.m12437n(iMo5681h, iMo5681h, iM25433o3, iM12437n);
                    } else if (i5 == 3) {
                        int iM25433o4 = z3c.m25433o(i4 << 3);
                        iM25433o = iM25433o4 + iM25433o4;
                        iM25434p = ((jjc) this.f45642c[i2]).m14505a();
                    } else {
                        if (i5 != 5) {
                            uk9.m22779n(new zzgb());
                            return 0;
                        }
                        ((Integer) this.f45642c[i2]).getClass();
                        iM25433o2 = z3c.m25433o(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f45642c[i2]).getClass();
                    iM25433o2 = z3c.m25433o(i4 << 3) + 8;
                }
                iM12437n = iM25433o2 + iM12437n;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f45642c[i2]).longValue();
                iM25433o = z3c.m25433o(i7);
                iM25434p = z3c.m25434p(jLongValue);
            }
            iM12437n = iM25434p + iM25433o + iM12437n;
        }
        this.f45643d = iM12437n;
        return iM12437n;
    }

    /* JADX INFO: renamed from: c */
    public final void m14506c(int i, Object obj) {
        if (!this.f45644e) {
            ij6.m13946b();
            return;
        }
        m14508e(this.f45640a + 1);
        int[] iArr = this.f45641b;
        int i2 = this.f45640a;
        iArr[i2] = i;
        this.f45642c[i2] = obj;
        this.f45640a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m14507d(gw9 gw9Var) throws zzfa {
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (this.f45640a != 0) {
            for (int i = 0; i < this.f45640a; i++) {
                int i2 = this.f45641b[i];
                Object obj = this.f45642c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    z3cVar.m25447m(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    z3cVar.m25440f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    z3cVar.m25437c(i4, (zzev) obj);
                } else if (i3 == 3) {
                    z3cVar.m25444j(i4, 3);
                    ((jjc) obj).m14507d(gw9Var);
                    z3cVar.m25444j(i4, 4);
                } else {
                    if (i3 != 5) {
                        v63.m23141s(new zzgb());
                        return;
                    }
                    z3cVar.m25438d(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14508e(int i) {
        int[] iArr = this.f45641b;
        if (i > iArr.length) {
            int i2 = this.f45640a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f45641b = Arrays.copyOf(iArr, i);
            this.f45642c = Arrays.copyOf(this.f45642c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof jjc)) {
            jjc jjcVar = (jjc) obj;
            int i = this.f45640a;
            if (i == jjcVar.f45640a) {
                int[] iArr = this.f45641b;
                int[] iArr2 = jjcVar.f45641b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f45642c;
                Object[] objArr2 = jjcVar.f45642c;
                int i3 = this.f45640a;
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
        int i = this.f45640a;
        int i2 = i + 527;
        int[] iArr = this.f45641b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f45642c;
        int i6 = this.f45640a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
